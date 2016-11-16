/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.aioc.AiocPackage
 * @generated
 */
public interface AiocFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AiocFactory eINSTANCE = org.aioc.impl.AiocFactoryImpl.init();

  /**
   * Returns a new object of class '<em>J</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>J</em>'.
   * @generated
   */
  AiocJ createAiocJ();

  /**
   * Returns a new object of class '<em>Aioc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aioc</em>'.
   * @generated
   */
  Aioc createAioc();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Where</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where</em>'.
   * @generated
   */
  Where createWhere();

  /**
   * Returns a new object of class '<em>Where Compare Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Compare Condition</em>'.
   * @generated
   */
  WhereCompareCondition createWhereCompareCondition();

  /**
   * Returns a new object of class '<em>Where Expression Basic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Expression Basic Term</em>'.
   * @generated
   */
  WhereExpressionBasicTerm createWhereExpressionBasicTerm();

  /**
   * Returns a new object of class '<em>Preamble</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preamble</em>'.
   * @generated
   */
  Preamble createPreamble();

  /**
   * Returns a new object of class '<em>Function Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Location</em>'.
   * @generated
   */
  FunctionLocation createFunctionLocation();

  /**
   * Returns a new object of class '<em>Function List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function List</em>'.
   * @generated
   */
  FunctionList createFunctionList();

  /**
   * Returns a new object of class '<em>Location Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Definition</em>'.
   * @generated
   */
  LocationDefinition createLocationDefinition();

  /**
   * Returns a new object of class '<em>Choreography</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choreography</em>'.
   * @generated
   */
  Choreography createChoreography();

  /**
   * Returns a new object of class '<em>Seq Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Seq Block</em>'.
   * @generated
   */
  SeqBlock createSeqBlock();

  /**
   * Returns a new object of class '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skip</em>'.
   * @generated
   */
  Skip createSkip();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>Local Code</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Code</em>'.
   * @generated
   */
  LocalCode createLocalCode();

  /**
   * Returns a new object of class '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Then Else</em>'.
   * @generated
   */
  IfThenElse createIfThenElse();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope</em>'.
   * @generated
   */
  Scope createScope();

  /**
   * Returns a new object of class '<em>Roles</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Roles</em>'.
   * @generated
   */
  Roles createRoles();

  /**
   * Returns a new object of class '<em>Nested Choreography</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Choreography</em>'.
   * @generated
   */
  NestedChoreography createNestedChoreography();

  /**
   * Returns a new object of class '<em>Assignment Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Set</em>'.
   * @generated
   */
  AssignmentSet createAssignmentSet();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Sum Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression</em>'.
   * @generated
   */
  SumExpression createSumExpression();

  /**
   * Returns a new object of class '<em>Sum Expression Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Term</em>'.
   * @generated
   */
  SumExpressionTerm createSumExpressionTerm();

  /**
   * Returns a new object of class '<em>Expression Basic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Basic Term</em>'.
   * @generated
   */
  ExpressionBasicTerm createExpressionBasicTerm();

  /**
   * Returns a new object of class '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant</em>'.
   * @generated
   */
  Constant createConstant();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Condition Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Operator</em>'.
   * @generated
   */
  ConditionOperator createConditionOperator();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer</em>'.
   * @generated
   */
  Integer createInteger();

  /**
   * Returns a new object of class '<em>Local Ask Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Ask Command</em>'.
   * @generated
   */
  LocalAskCommand createLocalAskCommand();

  /**
   * Returns a new object of class '<em>Local Show Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Show Command</em>'.
   * @generated
   */
  LocalShowCommand createLocalShowCommand();

  /**
   * Returns a new object of class '<em>Local Assignment Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Assignment Command</em>'.
   * @generated
   */
  LocalAssignmentCommand createLocalAssignmentCommand();

  /**
   * Returns a new object of class '<em>Sum Expression Add Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Add Term</em>'.
   * @generated
   */
  SumExpressionAddTerm createSumExpressionAddTerm();

  /**
   * Returns a new object of class '<em>Sum Expression Subtract Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Subtract Term</em>'.
   * @generated
   */
  SumExpressionSubtractTerm createSumExpressionSubtractTerm();

  /**
   * Returns a new object of class '<em>Sum Expression Times Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Times Term</em>'.
   * @generated
   */
  SumExpressionTimesTerm createSumExpressionTimesTerm();

  /**
   * Returns a new object of class '<em>Sum Expression Divide Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Expression Divide Term</em>'.
   * @generated
   */
  SumExpressionDivideTerm createSumExpressionDivideTerm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AiocPackage getAiocPackage();

} //AiocFactory
