/**
 */
package org.aioc.impl;

import org.aioc.Aioc;
import org.aioc.AiocFactory;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AiocPackageImpl extends EPackageImpl implements AiocPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aiocJEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aiocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereCompareConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereExpressionBasicTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preambleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionLocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choreographyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seqBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localCodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifThenElseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rolesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedChoreographyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBasicTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localAskCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localShowCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localAssignmentCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionAddTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionSubtractTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionTimesTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumExpressionDivideTermEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.aioc.AiocPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AiocPackageImpl()
  {
    super(eNS_URI, AiocFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AiocPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AiocPackage init()
  {
    if (isInited) return (AiocPackage)EPackage.Registry.INSTANCE.getEPackage(AiocPackage.eNS_URI);

    // Obtain or create and register package
    AiocPackageImpl theAiocPackage = (AiocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AiocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AiocPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAiocPackage.createPackageContents();

    // Initialize created meta-data
    theAiocPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAiocPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AiocPackage.eNS_URI, theAiocPackage);
    return theAiocPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAiocJ()
  {
    return aiocJEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAiocJ_Aioc()
  {
    return (EReference)aiocJEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAiocJ_RuleSet()
  {
    return (EReference)aiocJEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAioc()
  {
    return aiocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAioc_FunctionLocation()
  {
    return (EReference)aiocEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAioc_Preamble()
  {
    return (EReference)aiocEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAioc_Choreography()
  {
    return (EReference)aiocEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_FunctionLocation()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_NewRoles()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_LocDefinition()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Where()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Choreography()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewRole()
  {
    return newRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewRole_Role()
  {
    return (EAttribute)newRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewRole_NextRole()
  {
    return (EReference)newRoleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhere()
  {
    return whereEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhere_WhereCondition()
  {
    return (EReference)whereEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhere_Paren()
  {
    return (EAttribute)whereEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhereCompareCondition()
  {
    return whereCompareConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereCompareCondition_Left()
  {
    return (EReference)whereCompareConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereCompareCondition_Operator()
  {
    return (EReference)whereCompareConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereCompareCondition_Right()
  {
    return (EReference)whereCompareConditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhereCompareCondition_And()
  {
    return (EAttribute)whereCompareConditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhereCompareCondition_Or()
  {
    return (EAttribute)whereCompareConditionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereCompareCondition_Next()
  {
    return (EReference)whereCompareConditionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhereExpressionBasicTerm()
  {
    return whereExpressionBasicTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhereExpressionBasicTerm_NVariable()
  {
    return (EAttribute)whereExpressionBasicTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhereExpressionBasicTerm_EVariable()
  {
    return (EAttribute)whereExpressionBasicTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhereExpressionBasicTerm_SVariable()
  {
    return (EAttribute)whereExpressionBasicTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereExpressionBasicTerm_Constant()
  {
    return (EReference)whereExpressionBasicTermEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreamble()
  {
    return preambleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreamble_Starter()
  {
    return (EAttribute)preambleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreamble_LocDefinition()
  {
    return (EReference)preambleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionLocation()
  {
    return functionLocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionLocation_Functions()
  {
    return (EReference)functionLocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionLocation_Location()
  {
    return (EAttribute)functionLocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionLocation_Protocol()
  {
    return (EAttribute)functionLocationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionList()
  {
    return functionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionList_FunctionName()
  {
    return (EAttribute)functionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationDefinition()
  {
    return locationDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationDefinition_Role()
  {
    return (EAttribute)locationDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationDefinition_Location()
  {
    return (EAttribute)locationDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationDefinition_Continuation()
  {
    return (EReference)locationDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoreography()
  {
    return choreographyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoreography_SeqBlock()
  {
    return (EReference)choreographyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoreography_Par()
  {
    return (EReference)choreographyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeqBlock()
  {
    return seqBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeqBlock_Event()
  {
    return (EReference)seqBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeqBlock_Next()
  {
    return (EReference)seqBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkip()
  {
    return skipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSkip_Skip()
  {
    return (EAttribute)skipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteraction()
  {
    return interactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Operation()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Sender()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteraction_SenderExpression()
  {
    return (EReference)interactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_Receiver()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteraction_ReceiverVariable()
  {
    return (EAttribute)interactionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalCode()
  {
    return localCodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalCode_Thread()
  {
    return (EAttribute)localCodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfThenElse()
  {
    return ifThenElseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfThenElse_Key()
  {
    return (EAttribute)ifThenElseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElse_Condition()
  {
    return (EReference)ifThenElseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfThenElse_Thread()
  {
    return (EAttribute)ifThenElseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElse_Then()
  {
    return (EReference)ifThenElseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfThenElse_Else()
  {
    return (EReference)ifThenElseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile()
  {
    return whileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Condition()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhile_Thread()
  {
    return (EAttribute)whileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Choreography()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhile_Key()
  {
    return (EAttribute)whileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScope()
  {
    return scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_Thread()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Choreography()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Properties()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Roles()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_Key()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoles()
  {
    return rolesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoles_Roles()
  {
    return (EAttribute)rolesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedChoreography()
  {
    return nestedChoreographyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNestedChoreography_Choreography()
  {
    return (EReference)nestedChoreographyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentSet()
  {
    return assignmentSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentSet_Assignment()
  {
    return (EReference)assignmentSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentSet_Continuation()
  {
    return (EReference)assignmentSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Variable()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Expression()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_SumExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpression()
  {
    return sumExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumExpression_Children()
  {
    return (EReference)sumExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionTerm()
  {
    return sumExpressionTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSumExpressionTerm_Expression()
  {
    return (EReference)sumExpressionTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionBasicTerm()
  {
    return expressionBasicTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBasicTerm_Not()
  {
    return (EAttribute)expressionBasicTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBasicTerm_Variable()
  {
    return (EAttribute)expressionBasicTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBasicTerm_Constant()
  {
    return (EReference)expressionBasicTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBasicTerm_Condition()
  {
    return (EReference)expressionBasicTermEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_IntValue()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstant_FloatValue()
  {
    return (EReference)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_StrValue()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_True()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstant_False()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Left()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Operator()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Right()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionOperator()
  {
    return conditionOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Lt()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Leq()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Equal()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Gt()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Geq()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Not_equal()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_And()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionOperator_Or()
  {
    return (EAttribute)conditionOperatorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Params()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteger()
  {
    return integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteger_Value()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloat()
  {
    return floatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloat_Value()
  {
    return (EAttribute)floatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalAskCommand()
  {
    return localAskCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalAskCommand_ResultVariable()
  {
    return (EAttribute)localAskCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalAskCommand_Question()
  {
    return (EReference)localAskCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalShowCommand()
  {
    return localShowCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalShowCommand_Variable()
  {
    return (EAttribute)localShowCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalShowCommand_Expression()
  {
    return (EReference)localShowCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalAssignmentCommand()
  {
    return localAssignmentCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalAssignmentCommand_Variable()
  {
    return (EAttribute)localAssignmentCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalAssignmentCommand_Expression()
  {
    return (EReference)localAssignmentCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalAssignmentCommand_Function()
  {
    return (EReference)localAssignmentCommandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionAddTerm()
  {
    return sumExpressionAddTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionSubtractTerm()
  {
    return sumExpressionSubtractTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionTimesTerm()
  {
    return sumExpressionTimesTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumExpressionDivideTerm()
  {
    return sumExpressionDivideTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AiocFactory getAiocFactory()
  {
    return (AiocFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    aiocJEClass = createEClass(AIOC_J);
    createEReference(aiocJEClass, AIOC_J__AIOC);
    createEReference(aiocJEClass, AIOC_J__RULE_SET);

    aiocEClass = createEClass(AIOC);
    createEReference(aiocEClass, AIOC__FUNCTION_LOCATION);
    createEReference(aiocEClass, AIOC__PREAMBLE);
    createEReference(aiocEClass, AIOC__CHOREOGRAPHY);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__FUNCTION_LOCATION);
    createEReference(ruleEClass, RULE__NEW_ROLES);
    createEReference(ruleEClass, RULE__LOC_DEFINITION);
    createEReference(ruleEClass, RULE__WHERE);
    createEReference(ruleEClass, RULE__CHOREOGRAPHY);

    newRoleEClass = createEClass(NEW_ROLE);
    createEAttribute(newRoleEClass, NEW_ROLE__ROLE);
    createEReference(newRoleEClass, NEW_ROLE__NEXT_ROLE);

    whereEClass = createEClass(WHERE);
    createEReference(whereEClass, WHERE__WHERE_CONDITION);
    createEAttribute(whereEClass, WHERE__PAREN);

    whereCompareConditionEClass = createEClass(WHERE_COMPARE_CONDITION);
    createEReference(whereCompareConditionEClass, WHERE_COMPARE_CONDITION__LEFT);
    createEReference(whereCompareConditionEClass, WHERE_COMPARE_CONDITION__OPERATOR);
    createEReference(whereCompareConditionEClass, WHERE_COMPARE_CONDITION__RIGHT);
    createEAttribute(whereCompareConditionEClass, WHERE_COMPARE_CONDITION__AND);
    createEAttribute(whereCompareConditionEClass, WHERE_COMPARE_CONDITION__OR);
    createEReference(whereCompareConditionEClass, WHERE_COMPARE_CONDITION__NEXT);

    whereExpressionBasicTermEClass = createEClass(WHERE_EXPRESSION_BASIC_TERM);
    createEAttribute(whereExpressionBasicTermEClass, WHERE_EXPRESSION_BASIC_TERM__NVARIABLE);
    createEAttribute(whereExpressionBasicTermEClass, WHERE_EXPRESSION_BASIC_TERM__EVARIABLE);
    createEAttribute(whereExpressionBasicTermEClass, WHERE_EXPRESSION_BASIC_TERM__SVARIABLE);
    createEReference(whereExpressionBasicTermEClass, WHERE_EXPRESSION_BASIC_TERM__CONSTANT);

    preambleEClass = createEClass(PREAMBLE);
    createEAttribute(preambleEClass, PREAMBLE__STARTER);
    createEReference(preambleEClass, PREAMBLE__LOC_DEFINITION);

    functionLocationEClass = createEClass(FUNCTION_LOCATION);
    createEReference(functionLocationEClass, FUNCTION_LOCATION__FUNCTIONS);
    createEAttribute(functionLocationEClass, FUNCTION_LOCATION__LOCATION);
    createEAttribute(functionLocationEClass, FUNCTION_LOCATION__PROTOCOL);

    functionListEClass = createEClass(FUNCTION_LIST);
    createEAttribute(functionListEClass, FUNCTION_LIST__FUNCTION_NAME);

    locationDefinitionEClass = createEClass(LOCATION_DEFINITION);
    createEAttribute(locationDefinitionEClass, LOCATION_DEFINITION__ROLE);
    createEAttribute(locationDefinitionEClass, LOCATION_DEFINITION__LOCATION);
    createEReference(locationDefinitionEClass, LOCATION_DEFINITION__CONTINUATION);

    choreographyEClass = createEClass(CHOREOGRAPHY);
    createEReference(choreographyEClass, CHOREOGRAPHY__SEQ_BLOCK);
    createEReference(choreographyEClass, CHOREOGRAPHY__PAR);

    seqBlockEClass = createEClass(SEQ_BLOCK);
    createEReference(seqBlockEClass, SEQ_BLOCK__EVENT);
    createEReference(seqBlockEClass, SEQ_BLOCK__NEXT);

    skipEClass = createEClass(SKIP);
    createEAttribute(skipEClass, SKIP__SKIP);

    interactionEClass = createEClass(INTERACTION);
    createEAttribute(interactionEClass, INTERACTION__OPERATION);
    createEAttribute(interactionEClass, INTERACTION__SENDER);
    createEReference(interactionEClass, INTERACTION__SENDER_EXPRESSION);
    createEAttribute(interactionEClass, INTERACTION__RECEIVER);
    createEAttribute(interactionEClass, INTERACTION__RECEIVER_VARIABLE);

    localCodeEClass = createEClass(LOCAL_CODE);
    createEAttribute(localCodeEClass, LOCAL_CODE__THREAD);

    ifThenElseEClass = createEClass(IF_THEN_ELSE);
    createEAttribute(ifThenElseEClass, IF_THEN_ELSE__KEY);
    createEReference(ifThenElseEClass, IF_THEN_ELSE__CONDITION);
    createEAttribute(ifThenElseEClass, IF_THEN_ELSE__THREAD);
    createEReference(ifThenElseEClass, IF_THEN_ELSE__THEN);
    createEReference(ifThenElseEClass, IF_THEN_ELSE__ELSE);

    whileEClass = createEClass(WHILE);
    createEReference(whileEClass, WHILE__CONDITION);
    createEAttribute(whileEClass, WHILE__THREAD);
    createEReference(whileEClass, WHILE__CHOREOGRAPHY);
    createEAttribute(whileEClass, WHILE__KEY);

    scopeEClass = createEClass(SCOPE);
    createEAttribute(scopeEClass, SCOPE__THREAD);
    createEReference(scopeEClass, SCOPE__CHOREOGRAPHY);
    createEReference(scopeEClass, SCOPE__PROPERTIES);
    createEReference(scopeEClass, SCOPE__ROLES);
    createEAttribute(scopeEClass, SCOPE__KEY);

    rolesEClass = createEClass(ROLES);
    createEAttribute(rolesEClass, ROLES__ROLES);

    nestedChoreographyEClass = createEClass(NESTED_CHOREOGRAPHY);
    createEReference(nestedChoreographyEClass, NESTED_CHOREOGRAPHY__CHOREOGRAPHY);

    assignmentSetEClass = createEClass(ASSIGNMENT_SET);
    createEReference(assignmentSetEClass, ASSIGNMENT_SET__ASSIGNMENT);
    createEReference(assignmentSetEClass, ASSIGNMENT_SET__CONTINUATION);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__VARIABLE);
    createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__SUM_EXPRESSION);

    sumExpressionEClass = createEClass(SUM_EXPRESSION);
    createEReference(sumExpressionEClass, SUM_EXPRESSION__CHILDREN);

    sumExpressionTermEClass = createEClass(SUM_EXPRESSION_TERM);
    createEReference(sumExpressionTermEClass, SUM_EXPRESSION_TERM__EXPRESSION);

    expressionBasicTermEClass = createEClass(EXPRESSION_BASIC_TERM);
    createEAttribute(expressionBasicTermEClass, EXPRESSION_BASIC_TERM__NOT);
    createEAttribute(expressionBasicTermEClass, EXPRESSION_BASIC_TERM__VARIABLE);
    createEReference(expressionBasicTermEClass, EXPRESSION_BASIC_TERM__CONSTANT);
    createEReference(expressionBasicTermEClass, EXPRESSION_BASIC_TERM__CONDITION);

    constantEClass = createEClass(CONSTANT);
    createEReference(constantEClass, CONSTANT__INT_VALUE);
    createEReference(constantEClass, CONSTANT__FLOAT_VALUE);
    createEAttribute(constantEClass, CONSTANT__STR_VALUE);
    createEAttribute(constantEClass, CONSTANT__TRUE);
    createEAttribute(constantEClass, CONSTANT__FALSE);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__LEFT);
    createEReference(conditionEClass, CONDITION__OPERATOR);
    createEReference(conditionEClass, CONDITION__RIGHT);

    conditionOperatorEClass = createEClass(CONDITION_OPERATOR);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__LT);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__LEQ);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__EQUAL);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__GT);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__GEQ);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__NOT_EQUAL);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__AND);
    createEAttribute(conditionOperatorEClass, CONDITION_OPERATOR__OR);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__PARAMS);

    integerEClass = createEClass(INTEGER);
    createEAttribute(integerEClass, INTEGER__VALUE);

    floatEClass = createEClass(FLOAT);
    createEAttribute(floatEClass, FLOAT__VALUE);

    localAskCommandEClass = createEClass(LOCAL_ASK_COMMAND);
    createEAttribute(localAskCommandEClass, LOCAL_ASK_COMMAND__RESULT_VARIABLE);
    createEReference(localAskCommandEClass, LOCAL_ASK_COMMAND__QUESTION);

    localShowCommandEClass = createEClass(LOCAL_SHOW_COMMAND);
    createEAttribute(localShowCommandEClass, LOCAL_SHOW_COMMAND__VARIABLE);
    createEReference(localShowCommandEClass, LOCAL_SHOW_COMMAND__EXPRESSION);

    localAssignmentCommandEClass = createEClass(LOCAL_ASSIGNMENT_COMMAND);
    createEAttribute(localAssignmentCommandEClass, LOCAL_ASSIGNMENT_COMMAND__VARIABLE);
    createEReference(localAssignmentCommandEClass, LOCAL_ASSIGNMENT_COMMAND__EXPRESSION);
    createEReference(localAssignmentCommandEClass, LOCAL_ASSIGNMENT_COMMAND__FUNCTION);

    sumExpressionAddTermEClass = createEClass(SUM_EXPRESSION_ADD_TERM);

    sumExpressionSubtractTermEClass = createEClass(SUM_EXPRESSION_SUBTRACT_TERM);

    sumExpressionTimesTermEClass = createEClass(SUM_EXPRESSION_TIMES_TERM);

    sumExpressionDivideTermEClass = createEClass(SUM_EXPRESSION_DIVIDE_TERM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    localAskCommandEClass.getESuperTypes().add(this.getLocalCode());
    localShowCommandEClass.getESuperTypes().add(this.getLocalCode());
    localAssignmentCommandEClass.getESuperTypes().add(this.getLocalCode());
    sumExpressionAddTermEClass.getESuperTypes().add(this.getSumExpressionTerm());
    sumExpressionSubtractTermEClass.getESuperTypes().add(this.getSumExpressionTerm());
    sumExpressionTimesTermEClass.getESuperTypes().add(this.getSumExpressionTerm());
    sumExpressionDivideTermEClass.getESuperTypes().add(this.getSumExpressionTerm());

    // Initialize classes and features; add operations and parameters
    initEClass(aiocJEClass, AiocJ.class, "AiocJ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAiocJ_Aioc(), this.getAioc(), null, "aioc", null, 0, 1, AiocJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAiocJ_RuleSet(), this.getRule(), null, "ruleSet", null, 0, -1, AiocJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aiocEClass, Aioc.class, "Aioc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAioc_FunctionLocation(), this.getFunctionLocation(), null, "functionLocation", null, 0, -1, Aioc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAioc_Preamble(), this.getPreamble(), null, "preamble", null, 0, 1, Aioc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAioc_Choreography(), this.getChoreography(), null, "choreography", null, 0, 1, Aioc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_FunctionLocation(), this.getFunctionLocation(), null, "functionLocation", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_NewRoles(), this.getNewRole(), null, "newRoles", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_LocDefinition(), this.getLocationDefinition(), null, "locDefinition", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Where(), this.getWhere(), null, "where", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Choreography(), this.getChoreography(), null, "choreography", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newRoleEClass, NewRole.class, "NewRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNewRole_Role(), ecorePackage.getEString(), "role", null, 0, 1, NewRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNewRole_NextRole(), this.getNewRole(), null, "nextRole", null, 0, 1, NewRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereEClass, Where.class, "Where", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhere_WhereCondition(), this.getWhereCompareCondition(), null, "whereCondition", null, 0, 1, Where.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhere_Paren(), ecorePackage.getEBoolean(), "paren", null, 0, 1, Where.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereCompareConditionEClass, WhereCompareCondition.class, "WhereCompareCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhereCompareCondition_Left(), this.getWhereExpressionBasicTerm(), null, "left", null, 0, 1, WhereCompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhereCompareCondition_Operator(), this.getConditionOperator(), null, "operator", null, 0, 1, WhereCompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhereCompareCondition_Right(), this.getWhereExpressionBasicTerm(), null, "right", null, 0, 1, WhereCompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhereCompareCondition_And(), ecorePackage.getEBoolean(), "and", null, 0, 1, WhereCompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhereCompareCondition_Or(), ecorePackage.getEBoolean(), "or", null, 0, 1, WhereCompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhereCompareCondition_Next(), this.getWhere(), null, "next", null, 0, 1, WhereCompareCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereExpressionBasicTermEClass, WhereExpressionBasicTerm.class, "WhereExpressionBasicTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhereExpressionBasicTerm_NVariable(), ecorePackage.getEString(), "nVariable", null, 0, 1, WhereExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhereExpressionBasicTerm_EVariable(), ecorePackage.getEString(), "eVariable", null, 0, 1, WhereExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhereExpressionBasicTerm_SVariable(), ecorePackage.getEString(), "sVariable", null, 0, 1, WhereExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhereExpressionBasicTerm_Constant(), this.getConstant(), null, "constant", null, 0, 1, WhereExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preambleEClass, Preamble.class, "Preamble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreamble_Starter(), ecorePackage.getEString(), "starter", null, 0, 1, Preamble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPreamble_LocDefinition(), this.getLocationDefinition(), null, "locDefinition", null, 0, 1, Preamble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionLocationEClass, FunctionLocation.class, "FunctionLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionLocation_Functions(), this.getFunctionList(), null, "functions", null, 0, 1, FunctionLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionLocation_Location(), ecorePackage.getEString(), "location", null, 0, 1, FunctionLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionLocation_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, FunctionLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionListEClass, FunctionList.class, "FunctionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionList_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, -1, FunctionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(locationDefinitionEClass, LocationDefinition.class, "LocationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocationDefinition_Role(), ecorePackage.getEString(), "role", null, 0, 1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocationDefinition_Location(), ecorePackage.getEString(), "location", null, 0, 1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocationDefinition_Continuation(), this.getLocationDefinition(), null, "continuation", null, 0, 1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChoreography_SeqBlock(), this.getSeqBlock(), null, "seqBlock", null, 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChoreography_Par(), this.getChoreography(), null, "par", null, 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seqBlockEClass, SeqBlock.class, "SeqBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSeqBlock_Event(), ecorePackage.getEObject(), null, "event", null, 0, 1, SeqBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSeqBlock_Next(), this.getChoreography(), null, "next", null, 0, 1, SeqBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skipEClass, Skip.class, "Skip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSkip_Skip(), ecorePackage.getEBoolean(), "skip", null, 0, 1, Skip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteraction_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_Sender(), ecorePackage.getEString(), "sender", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteraction_SenderExpression(), this.getSumExpression(), null, "senderExpression", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_Receiver(), ecorePackage.getEString(), "receiver", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteraction_ReceiverVariable(), ecorePackage.getEString(), "receiverVariable", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localCodeEClass, LocalCode.class, "LocalCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalCode_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, LocalCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifThenElseEClass, IfThenElse.class, "IfThenElse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIfThenElse_Key(), ecorePackage.getEString(), "key", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElse_Condition(), this.getCondition(), null, "condition", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIfThenElse_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElse_Then(), this.getChoreography(), null, "then", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfThenElse_Else(), this.getChoreography(), null, "else", null, 0, 1, IfThenElse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_Condition(), this.getCondition(), null, "condition", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhile_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Choreography(), this.getChoreography(), null, "choreography", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhile_Key(), ecorePackage.getEString(), "key", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScope_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScope_Choreography(), this.getChoreography(), null, "choreography", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScope_Properties(), this.getAssignmentSet(), null, "properties", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScope_Roles(), this.getRoles(), null, "roles", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScope_Key(), ecorePackage.getEString(), "key", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rolesEClass, Roles.class, "Roles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoles_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nestedChoreographyEClass, NestedChoreography.class, "NestedChoreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedChoreography_Choreography(), this.getChoreography(), null, "choreography", null, 0, 1, NestedChoreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentSetEClass, AssignmentSet.class, "AssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentSet_Assignment(), this.getAssignment(), null, "assignment", null, 0, 1, AssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentSet_Continuation(), this.getAssignmentSet(), null, "continuation", null, 0, 1, AssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_SumExpression(), this.getSumExpression(), null, "sumExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumExpressionEClass, SumExpression.class, "SumExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumExpression_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, SumExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumExpressionTermEClass, SumExpressionTerm.class, "SumExpressionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSumExpressionTerm_Expression(), this.getExpressionBasicTerm(), null, "expression", null, 0, 1, SumExpressionTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBasicTermEClass, ExpressionBasicTerm.class, "ExpressionBasicTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionBasicTerm_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, ExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionBasicTerm_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, ExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBasicTerm_Constant(), this.getConstant(), null, "constant", null, 0, 1, ExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBasicTerm_Condition(), this.getCondition(), null, "condition", null, 0, 1, ExpressionBasicTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstant_IntValue(), this.getInteger(), null, "intValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstant_FloatValue(), this.getFloat(), null, "floatValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_StrValue(), ecorePackage.getEString(), "strValue", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_True(), ecorePackage.getEString(), "true", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstant_False(), ecorePackage.getEString(), "false", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Left(), this.getExpression(), null, "left", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Operator(), this.getConditionOperator(), null, "operator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Right(), this.getCondition(), null, "right", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionOperatorEClass, ConditionOperator.class, "ConditionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionOperator_Lt(), ecorePackage.getEBoolean(), "lt", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_Leq(), ecorePackage.getEBoolean(), "leq", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_Equal(), ecorePackage.getEBoolean(), "equal", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_Gt(), ecorePackage.getEBoolean(), "gt", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_Geq(), ecorePackage.getEBoolean(), "geq", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_Not_equal(), ecorePackage.getEBoolean(), "not_equal", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_And(), ecorePackage.getEBoolean(), "and", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionOperator_Or(), ecorePackage.getEBoolean(), "or", null, 0, 1, ConditionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Params(), this.getExpression(), null, "params", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerEClass, org.aioc.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteger_Value(), ecorePackage.getEInt(), "value", null, 0, 1, org.aioc.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(floatEClass, org.aioc.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloat_Value(), ecorePackage.getEString(), "value", null, 0, 1, org.aioc.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localAskCommandEClass, LocalAskCommand.class, "LocalAskCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalAskCommand_ResultVariable(), ecorePackage.getEString(), "resultVariable", null, 0, 1, LocalAskCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalAskCommand_Question(), this.getExpression(), null, "question", null, 0, 1, LocalAskCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localShowCommandEClass, LocalShowCommand.class, "LocalShowCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalShowCommand_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, LocalShowCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalShowCommand_Expression(), this.getExpression(), null, "expression", null, 0, 1, LocalShowCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localAssignmentCommandEClass, LocalAssignmentCommand.class, "LocalAssignmentCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalAssignmentCommand_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, LocalAssignmentCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalAssignmentCommand_Expression(), this.getExpression(), null, "expression", null, 0, 1, LocalAssignmentCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalAssignmentCommand_Function(), this.getFunction(), null, "function", null, 0, 1, LocalAssignmentCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumExpressionAddTermEClass, SumExpressionAddTerm.class, "SumExpressionAddTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumExpressionSubtractTermEClass, SumExpressionSubtractTerm.class, "SumExpressionSubtractTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumExpressionTimesTermEClass, SumExpressionTimesTerm.class, "SumExpressionTimesTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumExpressionDivideTermEClass, SumExpressionDivideTerm.class, "SumExpressionDivideTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //AiocPackageImpl
