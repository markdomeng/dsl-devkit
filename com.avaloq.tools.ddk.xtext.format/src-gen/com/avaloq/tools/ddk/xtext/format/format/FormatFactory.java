/**
 * generated by Xtext 2.25.0
 */
package com.avaloq.tools.ddk.xtext.format.format;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.avaloq.tools.ddk.xtext.format.format.FormatPackage
 * @generated
 */
public interface FormatFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FormatFactory eINSTANCE = com.avaloq.tools.ddk.xtext.format.format.impl.FormatFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration</em>'.
   * @generated
   */
  FormatConfiguration createFormatConfiguration();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Grammar Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Rule</em>'.
   * @generated
   */
  GrammarRule createGrammarRule();

  /**
   * Returns a new object of class '<em>Wildcard Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Rule</em>'.
   * @generated
   */
  WildcardRule createWildcardRule();

  /**
   * Returns a new object of class '<em>Grammar Rule Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Rule Directive</em>'.
   * @generated
   */
  GrammarRuleDirective createGrammarRuleDirective();

  /**
   * Returns a new object of class '<em>Wildcard Rule Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard Rule Directive</em>'.
   * @generated
   */
  WildcardRuleDirective createWildcardRuleDirective();

  /**
   * Returns a new object of class '<em>Grammar Element Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Element Reference</em>'.
   * @generated
   */
  GrammarElementReference createGrammarElementReference();

  /**
   * Returns a new object of class '<em>Grammar Element Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grammar Element Lookup</em>'.
   * @generated
   */
  GrammarElementLookup createGrammarElementLookup();

  /**
   * Returns a new object of class '<em>Context Free Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Free Directive</em>'.
   * @generated
   */
  ContextFreeDirective createContextFreeDirective();

  /**
   * Returns a new object of class '<em>Specific Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specific Directive</em>'.
   * @generated
   */
  SpecificDirective createSpecificDirective();

  /**
   * Returns a new object of class '<em>Matcher List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matcher List</em>'.
   * @generated
   */
  MatcherList createMatcherList();

  /**
   * Returns a new object of class '<em>Group Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Block</em>'.
   * @generated
   */
  GroupBlock createGroupBlock();

  /**
   * Returns a new object of class '<em>Keyword Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Keyword Pair</em>'.
   * @generated
   */
  KeywordPair createKeywordPair();

  /**
   * Returns a new object of class '<em>Matcher</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matcher</em>'.
   * @generated
   */
  Matcher createMatcher();

  /**
   * Returns a new object of class '<em>Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Locator</em>'.
   * @generated
   */
  Locator createLocator();

  /**
   * Returns a new object of class '<em>No Format Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>No Format Locator</em>'.
   * @generated
   */
  NoFormatLocator createNoFormatLocator();

  /**
   * Returns a new object of class '<em>Space Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Space Locator</em>'.
   * @generated
   */
  SpaceLocator createSpaceLocator();

  /**
   * Returns a new object of class '<em>Right Padding Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Padding Locator</em>'.
   * @generated
   */
  RightPaddingLocator createRightPaddingLocator();

  /**
   * Returns a new object of class '<em>Linewrap Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linewrap Locator</em>'.
   * @generated
   */
  LinewrapLocator createLinewrapLocator();

  /**
   * Returns a new object of class '<em>Column Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Locator</em>'.
   * @generated
   */
  ColumnLocator createColumnLocator();

  /**
   * Returns a new object of class '<em>Offset Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Offset Locator</em>'.
   * @generated
   */
  OffsetLocator createOffsetLocator();

  /**
   * Returns a new object of class '<em>Indent Locator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indent Locator</em>'.
   * @generated
   */
  IndentLocator createIndentLocator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FormatPackage getFormatPackage();

} //FormatFactory
