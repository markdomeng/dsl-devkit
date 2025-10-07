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
package com.avaloq.tools.ddk.typesystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.eclipse.emf.common.util.EList;

import com.avaloq.tools.ddk.typesystem.builtintypemodel.BuiltInTypeModel;
import com.avaloq.tools.ddk.typesystem.builtintypemodel.InternalType;
import com.avaloq.tools.ddk.typesystem.typemodel.INamedType;
import org.junit.jupiter.api.Test;


/**
 * Tests that the BuiltInType model instance is correct and complete.
 */
@SuppressWarnings("nls")
public class BuiltInTypeModelAccessTest {

  @org.junit.jupiter.api.Test
  void testLoadModel() {
    BuiltInTypeModelAccess typeModelInstance = BuiltInTypeModelAccess.getInstance();
    BuiltInTypeModel model = typeModelInstance.getModel();
    assertNotNull("Model was created", model);
    EList<InternalType> types = model.getInternalTypes();
    assertFalse("Model has built-in internal types", types.isEmpty());
    for (InternalType type : types) {
      String typeName = type.getName();
      assertFalse("Internal type has name", typeName == null || "".equals(typeName));
    }
  }

  private void assertPresence(final String name) {
    INamedType t = BuiltInTypeModelAccess.getInstance().getInternalType(name);
    assertNotNull("Type \"" + name + "\" found", t);
    assertEquals("Actual type name matches", name, t.getName());
  }

  @org.junit.jupiter.api.Test
  void testHasInternalTypes() {
    assertPresence(BuiltInTypeModelAccess.ANY_TYPE_NAME);
    assertPresence(BuiltInTypeModelAccess.ERROR_TYPE_NAME);
    assertPresence(BuiltInTypeModelAccess.UNDETERMINED_TYPE_NAME);
    assertPresence(BuiltInTypeModelAccess.VOID_TYPE_NAME);
  }

  @Test
  void testInvalidInternalTypeNames() {
    assertNull("Null name returns null", BuiltInTypeModelAccess.getInstance().getInternalType(null));
    assertNull("Empty name returns null", BuiltInTypeModelAccess.getInstance().getInternalType(""));
    assertNull("Non-existant name returns null", BuiltInTypeModelAccess.getInstance().getInternalType("xyz!!"));
  }

  @org.junit.jupiter.api.Test
  void testUniqueInternalTypes() {
    assertUnique(BuiltInTypeModelAccess.ANY_TYPE_NAME);
    assertUnique(BuiltInTypeModelAccess.ERROR_TYPE_NAME);
    assertUnique(BuiltInTypeModelAccess.UNDETERMINED_TYPE_NAME);
    assertUnique(BuiltInTypeModelAccess.VOID_TYPE_NAME);
  }

  private void assertUnique(final String typeName) {
    BuiltInTypeModelAccess instance = BuiltInTypeModelAccess.getInstance();
    assertSame("type " + typeName + " is unique", instance.getInternalType(typeName), instance.getInternalType(typeName));
  }
}
