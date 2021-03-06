/**
 */
package org.aioc.util;

import org.aioc.Aioc;
import org.aioc.AiocJ;
import org.aioc.AiocPackage;
import org.aioc.Assignment;
import org.aioc.AssignmentSet;
import org.aioc.Choreography;
import org.aioc.Condition;
import org.aioc.ConditionOperator;
import org.aioc.Constant;
import org.aioc.Expression;
import org.aioc.ExpressionBasicTerm;
import org.aioc.Function;
import org.aioc.FunctionList;
import org.aioc.FunctionLocation;
import org.aioc.IfThenElse;
import org.aioc.Interaction;
import org.aioc.LocalAskCommand;
import org.aioc.LocalAssignmentCommand;
import org.aioc.LocalCode;
import org.aioc.LocalShowCommand;
import org.aioc.LocationDefinition;
import org.aioc.NestedChoreography;
import org.aioc.NewRole;
import org.aioc.Preamble;
import org.aioc.Roles;
import org.aioc.Rule;
import org.aioc.Scope;
import org.aioc.SeqBlock;
import org.aioc.Skip;
import org.aioc.SumExpression;
import org.aioc.SumExpressionAddTerm;
import org.aioc.SumExpressionDivideTerm;
import org.aioc.SumExpressionSubtractTerm;
import org.aioc.SumExpressionTerm;
import org.aioc.SumExpressionTimesTerm;
import org.aioc.Where;
import org.aioc.WhereCompareCondition;
import org.aioc.WhereExpressionBasicTerm;
import org.aioc.While;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.aioc.AiocPackage
 * @generated
 */
public class AiocSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AiocPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AiocSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AiocPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AiocPackage.AIOC_J:
      {
        AiocJ aiocJ = (AiocJ)theEObject;
        T result = caseAiocJ(aiocJ);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.AIOC:
      {
        Aioc aioc = (Aioc)theEObject;
        T result = caseAioc(aioc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.NEW_ROLE:
      {
        NewRole newRole = (NewRole)theEObject;
        T result = caseNewRole(newRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.WHERE:
      {
        Where where = (Where)theEObject;
        T result = caseWhere(where);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.WHERE_COMPARE_CONDITION:
      {
        WhereCompareCondition whereCompareCondition = (WhereCompareCondition)theEObject;
        T result = caseWhereCompareCondition(whereCompareCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM:
      {
        WhereExpressionBasicTerm whereExpressionBasicTerm = (WhereExpressionBasicTerm)theEObject;
        T result = caseWhereExpressionBasicTerm(whereExpressionBasicTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.PREAMBLE:
      {
        Preamble preamble = (Preamble)theEObject;
        T result = casePreamble(preamble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.FUNCTION_LOCATION:
      {
        FunctionLocation functionLocation = (FunctionLocation)theEObject;
        T result = caseFunctionLocation(functionLocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.FUNCTION_LIST:
      {
        FunctionList functionList = (FunctionList)theEObject;
        T result = caseFunctionList(functionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.LOCATION_DEFINITION:
      {
        LocationDefinition locationDefinition = (LocationDefinition)theEObject;
        T result = caseLocationDefinition(locationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.CHOREOGRAPHY:
      {
        Choreography choreography = (Choreography)theEObject;
        T result = caseChoreography(choreography);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SEQ_BLOCK:
      {
        SeqBlock seqBlock = (SeqBlock)theEObject;
        T result = caseSeqBlock(seqBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SKIP:
      {
        Skip skip = (Skip)theEObject;
        T result = caseSkip(skip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.INTERACTION:
      {
        Interaction interaction = (Interaction)theEObject;
        T result = caseInteraction(interaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.LOCAL_CODE:
      {
        LocalCode localCode = (LocalCode)theEObject;
        T result = caseLocalCode(localCode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.IF_THEN_ELSE:
      {
        IfThenElse ifThenElse = (IfThenElse)theEObject;
        T result = caseIfThenElse(ifThenElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.ROLES:
      {
        Roles roles = (Roles)theEObject;
        T result = caseRoles(roles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.NESTED_CHOREOGRAPHY:
      {
        NestedChoreography nestedChoreography = (NestedChoreography)theEObject;
        T result = caseNestedChoreography(nestedChoreography);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.ASSIGNMENT_SET:
      {
        AssignmentSet assignmentSet = (AssignmentSet)theEObject;
        T result = caseAssignmentSet(assignmentSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SUM_EXPRESSION:
      {
        SumExpression sumExpression = (SumExpression)theEObject;
        T result = caseSumExpression(sumExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SUM_EXPRESSION_TERM:
      {
        SumExpressionTerm sumExpressionTerm = (SumExpressionTerm)theEObject;
        T result = caseSumExpressionTerm(sumExpressionTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.EXPRESSION_BASIC_TERM:
      {
        ExpressionBasicTerm expressionBasicTerm = (ExpressionBasicTerm)theEObject;
        T result = caseExpressionBasicTerm(expressionBasicTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.CONDITION_OPERATOR:
      {
        ConditionOperator conditionOperator = (ConditionOperator)theEObject;
        T result = caseConditionOperator(conditionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.INTEGER:
      {
        org.aioc.Integer integer = (org.aioc.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.FLOAT:
      {
        org.aioc.Float float_ = (org.aioc.Float)theEObject;
        T result = caseFloat(float_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.LOCAL_ASK_COMMAND:
      {
        LocalAskCommand localAskCommand = (LocalAskCommand)theEObject;
        T result = caseLocalAskCommand(localAskCommand);
        if (result == null) result = caseLocalCode(localAskCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.LOCAL_SHOW_COMMAND:
      {
        LocalShowCommand localShowCommand = (LocalShowCommand)theEObject;
        T result = caseLocalShowCommand(localShowCommand);
        if (result == null) result = caseLocalCode(localShowCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.LOCAL_ASSIGNMENT_COMMAND:
      {
        LocalAssignmentCommand localAssignmentCommand = (LocalAssignmentCommand)theEObject;
        T result = caseLocalAssignmentCommand(localAssignmentCommand);
        if (result == null) result = caseLocalCode(localAssignmentCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SUM_EXPRESSION_ADD_TERM:
      {
        SumExpressionAddTerm sumExpressionAddTerm = (SumExpressionAddTerm)theEObject;
        T result = caseSumExpressionAddTerm(sumExpressionAddTerm);
        if (result == null) result = caseSumExpressionTerm(sumExpressionAddTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SUM_EXPRESSION_SUBTRACT_TERM:
      {
        SumExpressionSubtractTerm sumExpressionSubtractTerm = (SumExpressionSubtractTerm)theEObject;
        T result = caseSumExpressionSubtractTerm(sumExpressionSubtractTerm);
        if (result == null) result = caseSumExpressionTerm(sumExpressionSubtractTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SUM_EXPRESSION_TIMES_TERM:
      {
        SumExpressionTimesTerm sumExpressionTimesTerm = (SumExpressionTimesTerm)theEObject;
        T result = caseSumExpressionTimesTerm(sumExpressionTimesTerm);
        if (result == null) result = caseSumExpressionTerm(sumExpressionTimesTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiocPackage.SUM_EXPRESSION_DIVIDE_TERM:
      {
        SumExpressionDivideTerm sumExpressionDivideTerm = (SumExpressionDivideTerm)theEObject;
        T result = caseSumExpressionDivideTerm(sumExpressionDivideTerm);
        if (result == null) result = caseSumExpressionTerm(sumExpressionDivideTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>J</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>J</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAiocJ(AiocJ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aioc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aioc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAioc(Aioc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewRole(NewRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhere(Where object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where Compare Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where Compare Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhereCompareCondition(WhereCompareCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where Expression Basic Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where Expression Basic Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhereExpressionBasicTerm(WhereExpressionBasicTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preamble</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preamble</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreamble(Preamble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Location</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Location</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionLocation(FunctionLocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionList(FunctionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Location Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Location Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocationDefinition(LocationDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choreography</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choreography</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoreography(Choreography object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seq Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seq Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeqBlock(SeqBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkip(Skip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteraction(Interaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Code</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Code</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalCode(LocalCode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElse(IfThenElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Roles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Roles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoles(Roles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Choreography</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Choreography</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedChoreography(NestedChoreography object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentSet(AssignmentSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumExpression(SumExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Expression Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Expression Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumExpressionTerm(SumExpressionTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Basic Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Basic Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionBasicTerm(ExpressionBasicTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionOperator(ConditionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(org.aioc.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloat(org.aioc.Float object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Ask Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Ask Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalAskCommand(LocalAskCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Show Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Show Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalShowCommand(LocalShowCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Assignment Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Assignment Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalAssignmentCommand(LocalAssignmentCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Expression Add Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Expression Add Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumExpressionAddTerm(SumExpressionAddTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Expression Subtract Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Expression Subtract Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumExpressionSubtractTerm(SumExpressionSubtractTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Expression Times Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Expression Times Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumExpressionTimesTerm(SumExpressionTimesTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Expression Divide Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Expression Divide Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumExpressionDivideTerm(SumExpressionDivideTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AiocSwitch
