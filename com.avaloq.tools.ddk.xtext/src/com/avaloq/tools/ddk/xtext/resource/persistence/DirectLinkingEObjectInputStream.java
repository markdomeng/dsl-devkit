/*******************************************************************************
 * Copyright (c) 2016 Avaloq Group AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Avaloq Group AG - initial API and implementation
 *******************************************************************************/

package com.avaloq.tools.ddk.xtext.resource.persistence;

import static com.avaloq.tools.ddk.xtext.resource.persistence.DirectLinkingEObjectOutputStream.LOCAL_EOBJECT;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl.EObjectInputStream;


/**
 * {@link EObjectInputStream} subclass which provides {@link #readEObject(Resource)} to read the serialization of
 * {@link DirectLinkingEObjectOutputStream#writeEObjectURI(EObject, Resource)}.
 */
class DirectLinkingEObjectInputStream extends EObjectInputStream {

  private static final Logger LOGGER = LogManager.getLogger(DirectLinkingEObjectInputStream.class);

  DirectLinkingEObjectInputStream(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    super(inputStream, options);
  }

  /**
   * Reads an EObject from this input stream.
   *
   * @param context
   *          resource being deserialized, must not be {@code null}
   * @return corresponding EObject or {@code null} if a lazy-linking proxy was serialized
   * @see DirectLinkingEObjectOutputStream#writeEObjectURI(EObject, Resource)
   * @throws IOException
   *           if an I/O exception occurred
   */
  @SuppressWarnings("unchecked")
  public EObject readEObject(final Resource context) throws IOException {
    if (readBoolean() == LOCAL_EOBJECT) {
      int count = readCompressedInt();
      EObject eObject = context.getContents().get(readCompressedInt());
      count--;
      while (count > 0) {
        int next = readCompressedInt();
        EStructuralFeature feature = eObject.eClass().getEStructuralFeature(next);
        count--;
        if (feature != null) {
          if (feature.isMany()) {
            eObject = ((EList<EObject>) eObject.eGet(feature, false)).get(readCompressedInt());
            count--;
          } else {
            eObject = (EObject) eObject.eGet(feature, false);
          }
        } else {
          LOGGER.error(String.format("Failed to get EStructuralFeature for Eclass : %s, at readCompressedInt : %d", eObject.eClass(), next));

        }
      }
      return eObject;
    } else {
      String uriString = readString();
      return uriString == null ? null : context.getResourceSet().getEObject(URI.createURI(uriString), true);
    }
  }

}
