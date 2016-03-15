/**
 */
package org.aioc.util;

import org.aioc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.aioc.AiocPackage
 * @generated
 */
public class AiocAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AiocPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AiocAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AiocPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AiocSwitch<Adapter> modelSwitch =
    new AiocSwitch<Adapter>()
    {
      @Override
      public Adapter caseAiocJ(AiocJ object)
      {
        return createAiocJAdapter();
      }
      @Override
      public Adapter caseAioc(Aioc object)
      {
        return createAiocAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseWhere(Where object)
      {
        return createWhereAdapter();
      }
      @Override
      public Adapter caseWhereCompareCondition(WhereCompareCondition object)
      {
        return createWhereCompareConditionAdapter();
      }
      @Override
      public Adapter caseWhereExpressionBasicTerm(WhereExpressionBasicTerm object)
      {
        return createWhereExpressionBasicTermAdapter();
      }
      @Override
      public Adapter casePreamble(Preamble object)
      {
        return createPreambleAdapter();
      }
      @Override
      public Adapter caseFunctionLocation(FunctionLocation object)
      {
        return createFunctionLocationAdapter();
      }
      @Override
      public Adapter caseFunctionList(FunctionList object)
      {
        return createFunctionListAdapter();
      }
      @Override
      public Adapter caseLocationDefinition(LocationDefinition object)
      {
        return createLocationDefinitionAdapter();
      }
      @Override
      public Adapter caseChoreography(Choreography object)
      {
        return createChoreographyAdapter();
      }
      @Override
      public Adapter caseSeqBlock(SeqBlock object)
      {
        return createSeqBlockAdapter();
      }
      @Override
      public Adapter caseSkip(Skip object)
      {
        return createSkipAdapter();
      }
      @Override
      public Adapter caseInteraction(Interaction object)
      {
        return createInteractionAdapter();
      }
      @Override
      public Adapter caseLocalCode(LocalCode object)
      {
        return createLocalCodeAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseRoles(Roles object)
      {
        return createRolesAdapter();
      }
      @Override
      public Adapter caseNestedChoreography(NestedChoreography object)
      {
        return createNestedChoreographyAdapter();
      }
      @Override
      public Adapter caseAssignmentSet(AssignmentSet object)
      {
        return createAssignmentSetAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSumExpression(SumExpression object)
      {
        return createSumExpressionAdapter();
      }
      @Override
      public Adapter caseSumExpressionTerm(SumExpressionTerm object)
      {
        return createSumExpressionTermAdapter();
      }
      @Override
      public Adapter caseExpressionBasicTerm(ExpressionBasicTerm object)
      {
        return createExpressionBasicTermAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionOperator(ConditionOperator object)
      {
        return createConditionOperatorAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseLocalAskCommand(LocalAskCommand object)
      {
        return createLocalAskCommandAdapter();
      }
      @Override
      public Adapter caseLocalShowCommand(LocalShowCommand object)
      {
        return createLocalShowCommandAdapter();
      }
      @Override
      public Adapter caseLocalAssignmentCommand(LocalAssignmentCommand object)
      {
        return createLocalAssignmentCommandAdapter();
      }
      @Override
      public Adapter caseSumExpressionAddTerm(SumExpressionAddTerm object)
      {
        return createSumExpressionAddTermAdapter();
      }
      @Override
      public Adapter caseSumExpressionSubtractTerm(SumExpressionSubtractTerm object)
      {
        return createSumExpressionSubtractTermAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.aioc.AiocJ <em>J</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.AiocJ
   * @generated
   */
  public Adapter createAiocJAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Aioc <em>Aioc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Aioc
   * @generated
   */
  public Adapter createAiocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Where
   * @generated
   */
  public Adapter createWhereAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.WhereCompareCondition <em>Where Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.WhereCompareCondition
   * @generated
   */
  public Adapter createWhereCompareConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.WhereExpressionBasicTerm <em>Where Expression Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.WhereExpressionBasicTerm
   * @generated
   */
  public Adapter createWhereExpressionBasicTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Preamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Preamble
   * @generated
   */
  public Adapter createPreambleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.FunctionLocation <em>Function Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.FunctionLocation
   * @generated
   */
  public Adapter createFunctionLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.FunctionList <em>Function List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.FunctionList
   * @generated
   */
  public Adapter createFunctionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.LocationDefinition <em>Location Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.LocationDefinition
   * @generated
   */
  public Adapter createLocationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Choreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Choreography
   * @generated
   */
  public Adapter createChoreographyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.SeqBlock <em>Seq Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.SeqBlock
   * @generated
   */
  public Adapter createSeqBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Skip
   * @generated
   */
  public Adapter createSkipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Interaction
   * @generated
   */
  public Adapter createInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.LocalCode <em>Local Code</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.LocalCode
   * @generated
   */
  public Adapter createLocalCodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Roles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Roles
   * @generated
   */
  public Adapter createRolesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.NestedChoreography <em>Nested Choreography</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.NestedChoreography
   * @generated
   */
  public Adapter createNestedChoreographyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.AssignmentSet <em>Assignment Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.AssignmentSet
   * @generated
   */
  public Adapter createAssignmentSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.SumExpression <em>Sum Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.SumExpression
   * @generated
   */
  public Adapter createSumExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.SumExpressionTerm <em>Sum Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.SumExpressionTerm
   * @generated
   */
  public Adapter createSumExpressionTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.ExpressionBasicTerm <em>Expression Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.ExpressionBasicTerm
   * @generated
   */
  public Adapter createExpressionBasicTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.ConditionOperator <em>Condition Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.ConditionOperator
   * @generated
   */
  public Adapter createConditionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.LocalAskCommand <em>Local Ask Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.LocalAskCommand
   * @generated
   */
  public Adapter createLocalAskCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.LocalShowCommand <em>Local Show Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.LocalShowCommand
   * @generated
   */
  public Adapter createLocalShowCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.LocalAssignmentCommand <em>Local Assignment Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.LocalAssignmentCommand
   * @generated
   */
  public Adapter createLocalAssignmentCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.SumExpressionAddTerm <em>Sum Expression Add Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.SumExpressionAddTerm
   * @generated
   */
  public Adapter createSumExpressionAddTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aioc.SumExpressionSubtractTerm <em>Sum Expression Subtract Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aioc.SumExpressionSubtractTerm
   * @generated
   */
  public Adapter createSumExpressionSubtractTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AiocAdapterFactory
