/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.aioc.AiocFactory
 * @model kind="package"
 * @generated
 */
public interface AiocPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aioc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.aioc.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aioc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AiocPackage eINSTANCE = org.aioc.impl.AiocPackageImpl.init();

  /**
   * The meta object id for the '{@link org.aioc.impl.AiocJImpl <em>J</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.AiocJImpl
   * @see org.aioc.impl.AiocPackageImpl#getAiocJ()
   * @generated
   */
  int AIOC_J = 0;

  /**
   * The feature id for the '<em><b>Aioc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC_J__AIOC = 0;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC_J__RULE_SET = 1;

  /**
   * The number of structural features of the '<em>J</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC_J_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.AiocImpl <em>Aioc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.AiocImpl
   * @see org.aioc.impl.AiocPackageImpl#getAioc()
   * @generated
   */
  int AIOC = 1;

  /**
   * The feature id for the '<em><b>Function Location</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC__FUNCTION_LOCATION = 0;

  /**
   * The feature id for the '<em><b>Preamble</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC__PREAMBLE = 1;

  /**
   * The feature id for the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC__CHOREOGRAPHY = 2;

  /**
   * The number of structural features of the '<em>Aioc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aioc.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.RuleImpl
   * @see org.aioc.impl.AiocPackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>Loc Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__LOC_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Function Location</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__FUNCTION_LOCATION = 1;

  /**
   * The feature id for the '<em><b>New Roles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NEW_ROLES = 2;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__WHERE = 3;

  /**
   * The feature id for the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__CHOREOGRAPHY = 4;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aioc.impl.NewRoleImpl <em>New Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.NewRoleImpl
   * @see org.aioc.impl.AiocPackageImpl#getNewRole()
   * @generated
   */
  int NEW_ROLE = 3;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ROLE__ROLE = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ROLE__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Next Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ROLE__NEXT_ROLE = 2;

  /**
   * The number of structural features of the '<em>New Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ROLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aioc.impl.WhereImpl <em>Where</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.WhereImpl
   * @see org.aioc.impl.AiocPackageImpl#getWhere()
   * @generated
   */
  int WHERE = 4;

  /**
   * The feature id for the '<em><b>Where Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__WHERE_CONDITION = 0;

  /**
   * The feature id for the '<em><b>Paren</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__PAREN = 1;

  /**
   * The number of structural features of the '<em>Where</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.WhereCompareConditionImpl <em>Where Compare Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.WhereCompareConditionImpl
   * @see org.aioc.impl.AiocPackageImpl#getWhereCompareCondition()
   * @generated
   */
  int WHERE_COMPARE_CONDITION = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION__AND = 3;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION__OR = 4;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION__NEXT = 5;

  /**
   * The number of structural features of the '<em>Where Compare Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_COMPARE_CONDITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.aioc.impl.WhereExpressionBasicTermImpl <em>Where Expression Basic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.WhereExpressionBasicTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getWhereExpressionBasicTerm()
   * @generated
   */
  int WHERE_EXPRESSION_BASIC_TERM = 6;

  /**
   * The feature id for the '<em><b>NVariable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSION_BASIC_TERM__NVARIABLE = 0;

  /**
   * The feature id for the '<em><b>EVariable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSION_BASIC_TERM__EVARIABLE = 1;

  /**
   * The feature id for the '<em><b>SVariable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSION_BASIC_TERM__SVARIABLE = 2;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSION_BASIC_TERM__CONSTANT = 3;

  /**
   * The number of structural features of the '<em>Where Expression Basic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_EXPRESSION_BASIC_TERM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.aioc.impl.PreambleImpl <em>Preamble</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.PreambleImpl
   * @see org.aioc.impl.AiocPackageImpl#getPreamble()
   * @generated
   */
  int PREAMBLE = 7;

  /**
   * The feature id for the '<em><b>Starter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBLE__STARTER = 0;

  /**
   * The feature id for the '<em><b>Loc Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBLE__LOC_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Preamble</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREAMBLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.FunctionLocationImpl <em>Function Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.FunctionLocationImpl
   * @see org.aioc.impl.AiocPackageImpl#getFunctionLocation()
   * @generated
   */
  int FUNCTION_LOCATION = 8;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LOCATION__FUNCTIONS = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LOCATION__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LOCATION__PROTOCOL = 2;

  /**
   * The number of structural features of the '<em>Function Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LOCATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aioc.impl.FunctionListImpl <em>Function List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.FunctionListImpl
   * @see org.aioc.impl.AiocPackageImpl#getFunctionList()
   * @generated
   */
  int FUNCTION_LIST = 9;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LIST__FUNCTION_NAME = 0;

  /**
   * The number of structural features of the '<em>Function List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.LocationDefinitionImpl <em>Location Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.LocationDefinitionImpl
   * @see org.aioc.impl.AiocPackageImpl#getLocationDefinition()
   * @generated
   */
  int LOCATION_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_DEFINITION__ROLE = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_DEFINITION__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_DEFINITION__CONTINUATION = 2;

  /**
   * The number of structural features of the '<em>Location Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aioc.impl.ChoreographyImpl <em>Choreography</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ChoreographyImpl
   * @see org.aioc.impl.AiocPackageImpl#getChoreography()
   * @generated
   */
  int CHOREOGRAPHY = 11;

  /**
   * The feature id for the '<em><b>Seq Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHY__SEQ_BLOCK = 0;

  /**
   * The feature id for the '<em><b>Par</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHY__PAR = 1;

  /**
   * The number of structural features of the '<em>Choreography</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOREOGRAPHY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.SeqBlockImpl <em>Seq Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SeqBlockImpl
   * @see org.aioc.impl.AiocPackageImpl#getSeqBlock()
   * @generated
   */
  int SEQ_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_BLOCK__EVENT = 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_BLOCK__NEXT = 1;

  /**
   * The number of structural features of the '<em>Seq Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQ_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SkipImpl
   * @see org.aioc.impl.AiocPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 13;

  /**
   * The feature id for the '<em><b>Skip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__SKIP = 0;

  /**
   * The number of structural features of the '<em>Skip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.InteractionImpl <em>Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.InteractionImpl
   * @see org.aioc.impl.AiocPackageImpl#getInteraction()
   * @generated
   */
  int INTERACTION = 14;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__OPERATION = 0;

  /**
   * The feature id for the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__SENDER = 1;

  /**
   * The feature id for the '<em><b>Sender Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__SENDER_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__RECEIVER = 3;

  /**
   * The feature id for the '<em><b>Receiver Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__RECEIVER_VARIABLE = 4;

  /**
   * The number of structural features of the '<em>Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aioc.impl.LocalCodeImpl <em>Local Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.LocalCodeImpl
   * @see org.aioc.impl.AiocPackageImpl#getLocalCode()
   * @generated
   */
  int LOCAL_CODE = 15;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_CODE__THREAD = 0;

  /**
   * The number of structural features of the '<em>Local Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_CODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.IfThenElseImpl
   * @see org.aioc.impl.AiocPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 16;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__KEY = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THREAD = 2;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN = 3;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = 4;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aioc.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.WhileImpl
   * @see org.aioc.impl.AiocPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 17;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__THREAD = 1;

  /**
   * The feature id for the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__CHOREOGRAPHY = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__KEY = 3;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.aioc.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ScopeImpl
   * @see org.aioc.impl.AiocPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 18;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__THREAD = 0;

  /**
   * The feature id for the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__CHOREOGRAPHY = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__PROPERTIES = 2;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__ROLES = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__KEY = 4;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aioc.impl.RolesImpl <em>Roles</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.RolesImpl
   * @see org.aioc.impl.AiocPackageImpl#getRoles()
   * @generated
   */
  int ROLES = 19;

  /**
   * The feature id for the '<em><b>Roles</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES__ROLES = 0;

  /**
   * The number of structural features of the '<em>Roles</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.NestedChoreographyImpl <em>Nested Choreography</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.NestedChoreographyImpl
   * @see org.aioc.impl.AiocPackageImpl#getNestedChoreography()
   * @generated
   */
  int NESTED_CHOREOGRAPHY = 20;

  /**
   * The feature id for the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CHOREOGRAPHY__CHOREOGRAPHY = 0;

  /**
   * The number of structural features of the '<em>Nested Choreography</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CHOREOGRAPHY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.AssignmentSetImpl <em>Assignment Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.AssignmentSetImpl
   * @see org.aioc.impl.AiocPackageImpl#getAssignmentSet()
   * @generated
   */
  int ASSIGNMENT_SET = 21;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_SET__ASSIGNMENT = 0;

  /**
   * The feature id for the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_SET__CONTINUATION = 1;

  /**
   * The number of structural features of the '<em>Assignment Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_SET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.AssignmentImpl
   * @see org.aioc.impl.AiocPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 22;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ExpressionImpl
   * @see org.aioc.impl.AiocPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Sum Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SUM_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.SumExpressionImpl <em>Sum Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SumExpressionImpl
   * @see org.aioc.impl.AiocPackageImpl#getSumExpression()
   * @generated
   */
  int SUM_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION__CHILDREN = 0;

  /**
   * The number of structural features of the '<em>Sum Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.SumExpressionTermImpl <em>Sum Expression Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SumExpressionTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getSumExpressionTerm()
   * @generated
   */
  int SUM_EXPRESSION_TERM = 25;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_TERM__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Sum Expression Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.ExpressionBasicTermImpl <em>Expression Basic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ExpressionBasicTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getExpressionBasicTerm()
   * @generated
   */
  int EXPRESSION_BASIC_TERM = 26;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM__NOT = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM__CONSTANT = 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM__CONDITION = 3;

  /**
   * The number of structural features of the '<em>Expression Basic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASIC_TERM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.aioc.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ConstantImpl
   * @see org.aioc.impl.AiocPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 27;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STR_VALUE = 1;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__TRUE = 2;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__FALSE = 3;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.aioc.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ConditionImpl
   * @see org.aioc.impl.AiocPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aioc.impl.ConditionOperatorImpl <em>Condition Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.ConditionOperatorImpl
   * @see org.aioc.impl.AiocPackageImpl#getConditionOperator()
   * @generated
   */
  int CONDITION_OPERATOR = 29;

  /**
   * The feature id for the '<em><b>Lt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__LT = 0;

  /**
   * The feature id for the '<em><b>Leq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__LEQ = 1;

  /**
   * The feature id for the '<em><b>Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__EQUAL = 2;

  /**
   * The feature id for the '<em><b>Gt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__GT = 3;

  /**
   * The feature id for the '<em><b>Geq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__GEQ = 4;

  /**
   * The feature id for the '<em><b>Not equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__NOT_EQUAL = 5;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__AND = 6;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR__OR = 7;

  /**
   * The number of structural features of the '<em>Condition Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_OPERATOR_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.aioc.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.FunctionImpl
   * @see org.aioc.impl.AiocPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.IntegerImpl <em>Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.IntegerImpl
   * @see org.aioc.impl.AiocPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__VALUE = 0;

  /**
   * The number of structural features of the '<em>Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aioc.impl.LocalAskCommandImpl <em>Local Ask Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.LocalAskCommandImpl
   * @see org.aioc.impl.AiocPackageImpl#getLocalAskCommand()
   * @generated
   */
  int LOCAL_ASK_COMMAND = 32;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASK_COMMAND__THREAD = LOCAL_CODE__THREAD;

  /**
   * The feature id for the '<em><b>Result Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASK_COMMAND__RESULT_VARIABLE = LOCAL_CODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASK_COMMAND__QUESTION = LOCAL_CODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Ask Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASK_COMMAND_FEATURE_COUNT = LOCAL_CODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.LocalShowCommandImpl <em>Local Show Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.LocalShowCommandImpl
   * @see org.aioc.impl.AiocPackageImpl#getLocalShowCommand()
   * @generated
   */
  int LOCAL_SHOW_COMMAND = 33;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SHOW_COMMAND__THREAD = LOCAL_CODE__THREAD;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SHOW_COMMAND__VARIABLE = LOCAL_CODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SHOW_COMMAND__EXPRESSION = LOCAL_CODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Show Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SHOW_COMMAND_FEATURE_COUNT = LOCAL_CODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aioc.impl.LocalAssignmentCommandImpl <em>Local Assignment Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.LocalAssignmentCommandImpl
   * @see org.aioc.impl.AiocPackageImpl#getLocalAssignmentCommand()
   * @generated
   */
  int LOCAL_ASSIGNMENT_COMMAND = 34;

  /**
   * The feature id for the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGNMENT_COMMAND__THREAD = LOCAL_CODE__THREAD;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGNMENT_COMMAND__VARIABLE = LOCAL_CODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGNMENT_COMMAND__EXPRESSION = LOCAL_CODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGNMENT_COMMAND__FUNCTION = LOCAL_CODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Local Assignment Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGNMENT_COMMAND_FEATURE_COUNT = LOCAL_CODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aioc.impl.SumExpressionAddTermImpl <em>Sum Expression Add Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SumExpressionAddTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getSumExpressionAddTerm()
   * @generated
   */
  int SUM_EXPRESSION_ADD_TERM = 35;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_ADD_TERM__EXPRESSION = SUM_EXPRESSION_TERM__EXPRESSION;

  /**
   * The number of structural features of the '<em>Sum Expression Add Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_ADD_TERM_FEATURE_COUNT = SUM_EXPRESSION_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aioc.impl.SumExpressionSubtractTermImpl <em>Sum Expression Subtract Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SumExpressionSubtractTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getSumExpressionSubtractTerm()
   * @generated
   */
  int SUM_EXPRESSION_SUBTRACT_TERM = 36;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_SUBTRACT_TERM__EXPRESSION = SUM_EXPRESSION_TERM__EXPRESSION;

  /**
   * The number of structural features of the '<em>Sum Expression Subtract Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_SUBTRACT_TERM_FEATURE_COUNT = SUM_EXPRESSION_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aioc.impl.SumExpressionTimesTermImpl <em>Sum Expression Times Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SumExpressionTimesTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getSumExpressionTimesTerm()
   * @generated
   */
  int SUM_EXPRESSION_TIMES_TERM = 37;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_TIMES_TERM__EXPRESSION = SUM_EXPRESSION_TERM__EXPRESSION;

  /**
   * The number of structural features of the '<em>Sum Expression Times Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_TIMES_TERM_FEATURE_COUNT = SUM_EXPRESSION_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aioc.impl.SumExpressionDivideTermImpl <em>Sum Expression Divide Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aioc.impl.SumExpressionDivideTermImpl
   * @see org.aioc.impl.AiocPackageImpl#getSumExpressionDivideTerm()
   * @generated
   */
  int SUM_EXPRESSION_DIVIDE_TERM = 38;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_DIVIDE_TERM__EXPRESSION = SUM_EXPRESSION_TERM__EXPRESSION;

  /**
   * The number of structural features of the '<em>Sum Expression Divide Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_EXPRESSION_DIVIDE_TERM_FEATURE_COUNT = SUM_EXPRESSION_TERM_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.aioc.AiocJ <em>J</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>J</em>'.
   * @see org.aioc.AiocJ
   * @generated
   */
  EClass getAiocJ();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.AiocJ#getAioc <em>Aioc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aioc</em>'.
   * @see org.aioc.AiocJ#getAioc()
   * @see #getAiocJ()
   * @generated
   */
  EReference getAiocJ_Aioc();

  /**
   * Returns the meta object for the containment reference list '{@link org.aioc.AiocJ#getRuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule Set</em>'.
   * @see org.aioc.AiocJ#getRuleSet()
   * @see #getAiocJ()
   * @generated
   */
  EReference getAiocJ_RuleSet();

  /**
   * Returns the meta object for class '{@link org.aioc.Aioc <em>Aioc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aioc</em>'.
   * @see org.aioc.Aioc
   * @generated
   */
  EClass getAioc();

  /**
   * Returns the meta object for the containment reference list '{@link org.aioc.Aioc#getFunctionLocation <em>Function Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Location</em>'.
   * @see org.aioc.Aioc#getFunctionLocation()
   * @see #getAioc()
   * @generated
   */
  EReference getAioc_FunctionLocation();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Aioc#getPreamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preamble</em>'.
   * @see org.aioc.Aioc#getPreamble()
   * @see #getAioc()
   * @generated
   */
  EReference getAioc_Preamble();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Aioc#getChoreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreography</em>'.
   * @see org.aioc.Aioc#getChoreography()
   * @see #getAioc()
   * @generated
   */
  EReference getAioc_Choreography();

  /**
   * Returns the meta object for class '{@link org.aioc.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.aioc.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Rule#getLocDefinition <em>Loc Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loc Definition</em>'.
   * @see org.aioc.Rule#getLocDefinition()
   * @see #getRule()
   * @generated
   */
  EReference getRule_LocDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.aioc.Rule#getFunctionLocation <em>Function Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Location</em>'.
   * @see org.aioc.Rule#getFunctionLocation()
   * @see #getRule()
   * @generated
   */
  EReference getRule_FunctionLocation();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Rule#getNewRoles <em>New Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Roles</em>'.
   * @see org.aioc.Rule#getNewRoles()
   * @see #getRule()
   * @generated
   */
  EReference getRule_NewRoles();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Rule#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where</em>'.
   * @see org.aioc.Rule#getWhere()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Where();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Rule#getChoreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreography</em>'.
   * @see org.aioc.Rule#getChoreography()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Choreography();

  /**
   * Returns the meta object for class '{@link org.aioc.NewRole <em>New Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Role</em>'.
   * @see org.aioc.NewRole
   * @generated
   */
  EClass getNewRole();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.NewRole#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.aioc.NewRole#getRole()
   * @see #getNewRole()
   * @generated
   */
  EAttribute getNewRole_Role();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.NewRole#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.aioc.NewRole#getLocation()
   * @see #getNewRole()
   * @generated
   */
  EAttribute getNewRole_Location();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.NewRole#getNextRole <em>Next Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next Role</em>'.
   * @see org.aioc.NewRole#getNextRole()
   * @see #getNewRole()
   * @generated
   */
  EReference getNewRole_NextRole();

  /**
   * Returns the meta object for class '{@link org.aioc.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where</em>'.
   * @see org.aioc.Where
   * @generated
   */
  EClass getWhere();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Where#getWhereCondition <em>Where Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Condition</em>'.
   * @see org.aioc.Where#getWhereCondition()
   * @see #getWhere()
   * @generated
   */
  EReference getWhere_WhereCondition();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Where#isParen <em>Paren</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paren</em>'.
   * @see org.aioc.Where#isParen()
   * @see #getWhere()
   * @generated
   */
  EAttribute getWhere_Paren();

  /**
   * Returns the meta object for class '{@link org.aioc.WhereCompareCondition <em>Where Compare Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Compare Condition</em>'.
   * @see org.aioc.WhereCompareCondition
   * @generated
   */
  EClass getWhereCompareCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.WhereCompareCondition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.aioc.WhereCompareCondition#getLeft()
   * @see #getWhereCompareCondition()
   * @generated
   */
  EReference getWhereCompareCondition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.WhereCompareCondition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see org.aioc.WhereCompareCondition#getOperator()
   * @see #getWhereCompareCondition()
   * @generated
   */
  EReference getWhereCompareCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.WhereCompareCondition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.aioc.WhereCompareCondition#getRight()
   * @see #getWhereCompareCondition()
   * @generated
   */
  EReference getWhereCompareCondition_Right();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.WhereCompareCondition#isAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.aioc.WhereCompareCondition#isAnd()
   * @see #getWhereCompareCondition()
   * @generated
   */
  EAttribute getWhereCompareCondition_And();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.WhereCompareCondition#isOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.aioc.WhereCompareCondition#isOr()
   * @see #getWhereCompareCondition()
   * @generated
   */
  EAttribute getWhereCompareCondition_Or();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.WhereCompareCondition#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.aioc.WhereCompareCondition#getNext()
   * @see #getWhereCompareCondition()
   * @generated
   */
  EReference getWhereCompareCondition_Next();

  /**
   * Returns the meta object for class '{@link org.aioc.WhereExpressionBasicTerm <em>Where Expression Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Expression Basic Term</em>'.
   * @see org.aioc.WhereExpressionBasicTerm
   * @generated
   */
  EClass getWhereExpressionBasicTerm();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.WhereExpressionBasicTerm#getNVariable <em>NVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>NVariable</em>'.
   * @see org.aioc.WhereExpressionBasicTerm#getNVariable()
   * @see #getWhereExpressionBasicTerm()
   * @generated
   */
  EAttribute getWhereExpressionBasicTerm_NVariable();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.WhereExpressionBasicTerm#getEVariable <em>EVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EVariable</em>'.
   * @see org.aioc.WhereExpressionBasicTerm#getEVariable()
   * @see #getWhereExpressionBasicTerm()
   * @generated
   */
  EAttribute getWhereExpressionBasicTerm_EVariable();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.WhereExpressionBasicTerm#getSVariable <em>SVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>SVariable</em>'.
   * @see org.aioc.WhereExpressionBasicTerm#getSVariable()
   * @see #getWhereExpressionBasicTerm()
   * @generated
   */
  EAttribute getWhereExpressionBasicTerm_SVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.WhereExpressionBasicTerm#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see org.aioc.WhereExpressionBasicTerm#getConstant()
   * @see #getWhereExpressionBasicTerm()
   * @generated
   */
  EReference getWhereExpressionBasicTerm_Constant();

  /**
   * Returns the meta object for class '{@link org.aioc.Preamble <em>Preamble</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preamble</em>'.
   * @see org.aioc.Preamble
   * @generated
   */
  EClass getPreamble();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Preamble#getStarter <em>Starter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Starter</em>'.
   * @see org.aioc.Preamble#getStarter()
   * @see #getPreamble()
   * @generated
   */
  EAttribute getPreamble_Starter();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Preamble#getLocDefinition <em>Loc Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loc Definition</em>'.
   * @see org.aioc.Preamble#getLocDefinition()
   * @see #getPreamble()
   * @generated
   */
  EReference getPreamble_LocDefinition();

  /**
   * Returns the meta object for class '{@link org.aioc.FunctionLocation <em>Function Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Location</em>'.
   * @see org.aioc.FunctionLocation
   * @generated
   */
  EClass getFunctionLocation();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.FunctionLocation#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functions</em>'.
   * @see org.aioc.FunctionLocation#getFunctions()
   * @see #getFunctionLocation()
   * @generated
   */
  EReference getFunctionLocation_Functions();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.FunctionLocation#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.aioc.FunctionLocation#getLocation()
   * @see #getFunctionLocation()
   * @generated
   */
  EAttribute getFunctionLocation_Location();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.FunctionLocation#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see org.aioc.FunctionLocation#getProtocol()
   * @see #getFunctionLocation()
   * @generated
   */
  EAttribute getFunctionLocation_Protocol();

  /**
   * Returns the meta object for class '{@link org.aioc.FunctionList <em>Function List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function List</em>'.
   * @see org.aioc.FunctionList
   * @generated
   */
  EClass getFunctionList();

  /**
   * Returns the meta object for the attribute list '{@link org.aioc.FunctionList#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Function Name</em>'.
   * @see org.aioc.FunctionList#getFunctionName()
   * @see #getFunctionList()
   * @generated
   */
  EAttribute getFunctionList_FunctionName();

  /**
   * Returns the meta object for class '{@link org.aioc.LocationDefinition <em>Location Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Definition</em>'.
   * @see org.aioc.LocationDefinition
   * @generated
   */
  EClass getLocationDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.LocationDefinition#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.aioc.LocationDefinition#getRole()
   * @see #getLocationDefinition()
   * @generated
   */
  EAttribute getLocationDefinition_Role();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.LocationDefinition#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.aioc.LocationDefinition#getLocation()
   * @see #getLocationDefinition()
   * @generated
   */
  EAttribute getLocationDefinition_Location();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.LocationDefinition#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.aioc.LocationDefinition#getContinuation()
   * @see #getLocationDefinition()
   * @generated
   */
  EReference getLocationDefinition_Continuation();

  /**
   * Returns the meta object for class '{@link org.aioc.Choreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choreography</em>'.
   * @see org.aioc.Choreography
   * @generated
   */
  EClass getChoreography();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Choreography#getSeqBlock <em>Seq Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Seq Block</em>'.
   * @see org.aioc.Choreography#getSeqBlock()
   * @see #getChoreography()
   * @generated
   */
  EReference getChoreography_SeqBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Choreography#getPar <em>Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par</em>'.
   * @see org.aioc.Choreography#getPar()
   * @see #getChoreography()
   * @generated
   */
  EReference getChoreography_Par();

  /**
   * Returns the meta object for class '{@link org.aioc.SeqBlock <em>Seq Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Seq Block</em>'.
   * @see org.aioc.SeqBlock
   * @generated
   */
  EClass getSeqBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.SeqBlock#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.aioc.SeqBlock#getEvent()
   * @see #getSeqBlock()
   * @generated
   */
  EReference getSeqBlock_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.SeqBlock#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.aioc.SeqBlock#getNext()
   * @see #getSeqBlock()
   * @generated
   */
  EReference getSeqBlock_Next();

  /**
   * Returns the meta object for class '{@link org.aioc.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip</em>'.
   * @see org.aioc.Skip
   * @generated
   */
  EClass getSkip();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Skip#isSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Skip</em>'.
   * @see org.aioc.Skip#isSkip()
   * @see #getSkip()
   * @generated
   */
  EAttribute getSkip_Skip();

  /**
   * Returns the meta object for class '{@link org.aioc.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction</em>'.
   * @see org.aioc.Interaction
   * @generated
   */
  EClass getInteraction();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Interaction#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see org.aioc.Interaction#getOperation()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Operation();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Interaction#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sender</em>'.
   * @see org.aioc.Interaction#getSender()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Sender();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Interaction#getSenderExpression <em>Sender Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sender Expression</em>'.
   * @see org.aioc.Interaction#getSenderExpression()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_SenderExpression();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Interaction#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver</em>'.
   * @see org.aioc.Interaction#getReceiver()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Receiver();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Interaction#getReceiverVariable <em>Receiver Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Receiver Variable</em>'.
   * @see org.aioc.Interaction#getReceiverVariable()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_ReceiverVariable();

  /**
   * Returns the meta object for class '{@link org.aioc.LocalCode <em>Local Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Code</em>'.
   * @see org.aioc.LocalCode
   * @generated
   */
  EClass getLocalCode();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.LocalCode#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread</em>'.
   * @see org.aioc.LocalCode#getThread()
   * @see #getLocalCode()
   * @generated
   */
  EAttribute getLocalCode_Thread();

  /**
   * Returns the meta object for class '{@link org.aioc.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.aioc.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.IfThenElse#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.aioc.IfThenElse#getKey()
   * @see #getIfThenElse()
   * @generated
   */
  EAttribute getIfThenElse_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.aioc.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.IfThenElse#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread</em>'.
   * @see org.aioc.IfThenElse#getThread()
   * @see #getIfThenElse()
   * @generated
   */
  EAttribute getIfThenElse_Thread();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.IfThenElse#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.aioc.IfThenElse#getThen()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.IfThenElse#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.aioc.IfThenElse#getElse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Else();

  /**
   * Returns the meta object for class '{@link org.aioc.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.aioc.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.While#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.aioc.While#getCondition()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.While#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread</em>'.
   * @see org.aioc.While#getThread()
   * @see #getWhile()
   * @generated
   */
  EAttribute getWhile_Thread();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.While#getChoreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreography</em>'.
   * @see org.aioc.While#getChoreography()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Choreography();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.While#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.aioc.While#getKey()
   * @see #getWhile()
   * @generated
   */
  EAttribute getWhile_Key();

  /**
   * Returns the meta object for class '{@link org.aioc.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see org.aioc.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Scope#getThread <em>Thread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread</em>'.
   * @see org.aioc.Scope#getThread()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Thread();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Scope#getChoreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreography</em>'.
   * @see org.aioc.Scope#getChoreography()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Choreography();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Scope#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see org.aioc.Scope#getProperties()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Scope#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Roles</em>'.
   * @see org.aioc.Scope#getRoles()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Roles();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Scope#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.aioc.Scope#getKey()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Key();

  /**
   * Returns the meta object for class '{@link org.aioc.Roles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Roles</em>'.
   * @see org.aioc.Roles
   * @generated
   */
  EClass getRoles();

  /**
   * Returns the meta object for the attribute list '{@link org.aioc.Roles#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Roles</em>'.
   * @see org.aioc.Roles#getRoles()
   * @see #getRoles()
   * @generated
   */
  EAttribute getRoles_Roles();

  /**
   * Returns the meta object for class '{@link org.aioc.NestedChoreography <em>Nested Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Choreography</em>'.
   * @see org.aioc.NestedChoreography
   * @generated
   */
  EClass getNestedChoreography();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.NestedChoreography#getChoreography <em>Choreography</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choreography</em>'.
   * @see org.aioc.NestedChoreography#getChoreography()
   * @see #getNestedChoreography()
   * @generated
   */
  EReference getNestedChoreography_Choreography();

  /**
   * Returns the meta object for class '{@link org.aioc.AssignmentSet <em>Assignment Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Set</em>'.
   * @see org.aioc.AssignmentSet
   * @generated
   */
  EClass getAssignmentSet();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.AssignmentSet#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see org.aioc.AssignmentSet#getAssignment()
   * @see #getAssignmentSet()
   * @generated
   */
  EReference getAssignmentSet_Assignment();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.AssignmentSet#getContinuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Continuation</em>'.
   * @see org.aioc.AssignmentSet#getContinuation()
   * @see #getAssignmentSet()
   * @generated
   */
  EReference getAssignmentSet_Continuation();

  /**
   * Returns the meta object for class '{@link org.aioc.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.aioc.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.aioc.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Assignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.aioc.Assignment#getExpression()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Expression();

  /**
   * Returns the meta object for class '{@link org.aioc.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.aioc.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Expression#getSumExpression <em>Sum Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sum Expression</em>'.
   * @see org.aioc.Expression#getSumExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_SumExpression();

  /**
   * Returns the meta object for class '{@link org.aioc.SumExpression <em>Sum Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression</em>'.
   * @see org.aioc.SumExpression
   * @generated
   */
  EClass getSumExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.aioc.SumExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.aioc.SumExpression#getChildren()
   * @see #getSumExpression()
   * @generated
   */
  EReference getSumExpression_Children();

  /**
   * Returns the meta object for class '{@link org.aioc.SumExpressionTerm <em>Sum Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Term</em>'.
   * @see org.aioc.SumExpressionTerm
   * @generated
   */
  EClass getSumExpressionTerm();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.SumExpressionTerm#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.aioc.SumExpressionTerm#getExpression()
   * @see #getSumExpressionTerm()
   * @generated
   */
  EReference getSumExpressionTerm_Expression();

  /**
   * Returns the meta object for class '{@link org.aioc.ExpressionBasicTerm <em>Expression Basic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Basic Term</em>'.
   * @see org.aioc.ExpressionBasicTerm
   * @generated
   */
  EClass getExpressionBasicTerm();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ExpressionBasicTerm#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.aioc.ExpressionBasicTerm#isNot()
   * @see #getExpressionBasicTerm()
   * @generated
   */
  EAttribute getExpressionBasicTerm_Not();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ExpressionBasicTerm#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.aioc.ExpressionBasicTerm#getVariable()
   * @see #getExpressionBasicTerm()
   * @generated
   */
  EAttribute getExpressionBasicTerm_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.ExpressionBasicTerm#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant</em>'.
   * @see org.aioc.ExpressionBasicTerm#getConstant()
   * @see #getExpressionBasicTerm()
   * @generated
   */
  EReference getExpressionBasicTerm_Constant();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.ExpressionBasicTerm#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.aioc.ExpressionBasicTerm#getCondition()
   * @see #getExpressionBasicTerm()
   * @generated
   */
  EReference getExpressionBasicTerm_Condition();

  /**
   * Returns the meta object for class '{@link org.aioc.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see org.aioc.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Constant#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Int Value</em>'.
   * @see org.aioc.Constant#getIntValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_IntValue();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Constant#getStrValue <em>Str Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str Value</em>'.
   * @see org.aioc.Constant#getStrValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_StrValue();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Constant#getTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>True</em>'.
   * @see org.aioc.Constant#getTrue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_True();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Constant#getFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>False</em>'.
   * @see org.aioc.Constant#getFalse()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_False();

  /**
   * Returns the meta object for class '{@link org.aioc.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.aioc.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Condition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.aioc.Condition#getLeft()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Condition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see org.aioc.Condition#getOperator()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.Condition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.aioc.Condition#getRight()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Right();

  /**
   * Returns the meta object for class '{@link org.aioc.ConditionOperator <em>Condition Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Operator</em>'.
   * @see org.aioc.ConditionOperator
   * @generated
   */
  EClass getConditionOperator();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isLt <em>Lt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lt</em>'.
   * @see org.aioc.ConditionOperator#isLt()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Lt();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isLeq <em>Leq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Leq</em>'.
   * @see org.aioc.ConditionOperator#isLeq()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Leq();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isEqual <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Equal</em>'.
   * @see org.aioc.ConditionOperator#isEqual()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Equal();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isGt <em>Gt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gt</em>'.
   * @see org.aioc.ConditionOperator#isGt()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Gt();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isGeq <em>Geq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geq</em>'.
   * @see org.aioc.ConditionOperator#isGeq()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Geq();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isNot_equal <em>Not equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not equal</em>'.
   * @see org.aioc.ConditionOperator#isNot_equal()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Not_equal();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.aioc.ConditionOperator#isAnd()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_And();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.ConditionOperator#isOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.aioc.ConditionOperator#isOr()
   * @see #getConditionOperator()
   * @generated
   */
  EAttribute getConditionOperator_Or();

  /**
   * Returns the meta object for class '{@link org.aioc.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.aioc.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.aioc.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.aioc.Function#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.aioc.Function#getParams()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Params();

  /**
   * Returns the meta object for class '{@link org.aioc.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer</em>'.
   * @see org.aioc.Integer
   * @generated
   */
  EClass getInteger();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.Integer#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.aioc.Integer#getValue()
   * @see #getInteger()
   * @generated
   */
  EAttribute getInteger_Value();

  /**
   * Returns the meta object for class '{@link org.aioc.LocalAskCommand <em>Local Ask Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Ask Command</em>'.
   * @see org.aioc.LocalAskCommand
   * @generated
   */
  EClass getLocalAskCommand();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.LocalAskCommand#getResultVariable <em>Result Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result Variable</em>'.
   * @see org.aioc.LocalAskCommand#getResultVariable()
   * @see #getLocalAskCommand()
   * @generated
   */
  EAttribute getLocalAskCommand_ResultVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.LocalAskCommand#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Question</em>'.
   * @see org.aioc.LocalAskCommand#getQuestion()
   * @see #getLocalAskCommand()
   * @generated
   */
  EReference getLocalAskCommand_Question();

  /**
   * Returns the meta object for class '{@link org.aioc.LocalShowCommand <em>Local Show Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Show Command</em>'.
   * @see org.aioc.LocalShowCommand
   * @generated
   */
  EClass getLocalShowCommand();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.LocalShowCommand#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.aioc.LocalShowCommand#getVariable()
   * @see #getLocalShowCommand()
   * @generated
   */
  EAttribute getLocalShowCommand_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.LocalShowCommand#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.aioc.LocalShowCommand#getExpression()
   * @see #getLocalShowCommand()
   * @generated
   */
  EReference getLocalShowCommand_Expression();

  /**
   * Returns the meta object for class '{@link org.aioc.LocalAssignmentCommand <em>Local Assignment Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Assignment Command</em>'.
   * @see org.aioc.LocalAssignmentCommand
   * @generated
   */
  EClass getLocalAssignmentCommand();

  /**
   * Returns the meta object for the attribute '{@link org.aioc.LocalAssignmentCommand#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.aioc.LocalAssignmentCommand#getVariable()
   * @see #getLocalAssignmentCommand()
   * @generated
   */
  EAttribute getLocalAssignmentCommand_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.LocalAssignmentCommand#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.aioc.LocalAssignmentCommand#getExpression()
   * @see #getLocalAssignmentCommand()
   * @generated
   */
  EReference getLocalAssignmentCommand_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.aioc.LocalAssignmentCommand#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.aioc.LocalAssignmentCommand#getFunction()
   * @see #getLocalAssignmentCommand()
   * @generated
   */
  EReference getLocalAssignmentCommand_Function();

  /**
   * Returns the meta object for class '{@link org.aioc.SumExpressionAddTerm <em>Sum Expression Add Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Add Term</em>'.
   * @see org.aioc.SumExpressionAddTerm
   * @generated
   */
  EClass getSumExpressionAddTerm();

  /**
   * Returns the meta object for class '{@link org.aioc.SumExpressionSubtractTerm <em>Sum Expression Subtract Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Subtract Term</em>'.
   * @see org.aioc.SumExpressionSubtractTerm
   * @generated
   */
  EClass getSumExpressionSubtractTerm();

  /**
   * Returns the meta object for class '{@link org.aioc.SumExpressionTimesTerm <em>Sum Expression Times Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Times Term</em>'.
   * @see org.aioc.SumExpressionTimesTerm
   * @generated
   */
  EClass getSumExpressionTimesTerm();

  /**
   * Returns the meta object for class '{@link org.aioc.SumExpressionDivideTerm <em>Sum Expression Divide Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Expression Divide Term</em>'.
   * @see org.aioc.SumExpressionDivideTerm
   * @generated
   */
  EClass getSumExpressionDivideTerm();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AiocFactory getAiocFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.aioc.impl.AiocJImpl <em>J</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.AiocJImpl
     * @see org.aioc.impl.AiocPackageImpl#getAiocJ()
     * @generated
     */
    EClass AIOC_J = eINSTANCE.getAiocJ();

    /**
     * The meta object literal for the '<em><b>Aioc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOC_J__AIOC = eINSTANCE.getAiocJ_Aioc();

    /**
     * The meta object literal for the '<em><b>Rule Set</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOC_J__RULE_SET = eINSTANCE.getAiocJ_RuleSet();

    /**
     * The meta object literal for the '{@link org.aioc.impl.AiocImpl <em>Aioc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.AiocImpl
     * @see org.aioc.impl.AiocPackageImpl#getAioc()
     * @generated
     */
    EClass AIOC = eINSTANCE.getAioc();

    /**
     * The meta object literal for the '<em><b>Function Location</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOC__FUNCTION_LOCATION = eINSTANCE.getAioc_FunctionLocation();

    /**
     * The meta object literal for the '<em><b>Preamble</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOC__PREAMBLE = eINSTANCE.getAioc_Preamble();

    /**
     * The meta object literal for the '<em><b>Choreography</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOC__CHOREOGRAPHY = eINSTANCE.getAioc_Choreography();

    /**
     * The meta object literal for the '{@link org.aioc.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.RuleImpl
     * @see org.aioc.impl.AiocPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Loc Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__LOC_DEFINITION = eINSTANCE.getRule_LocDefinition();

    /**
     * The meta object literal for the '<em><b>Function Location</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__FUNCTION_LOCATION = eINSTANCE.getRule_FunctionLocation();

    /**
     * The meta object literal for the '<em><b>New Roles</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__NEW_ROLES = eINSTANCE.getRule_NewRoles();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__WHERE = eINSTANCE.getRule_Where();

    /**
     * The meta object literal for the '<em><b>Choreography</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__CHOREOGRAPHY = eINSTANCE.getRule_Choreography();

    /**
     * The meta object literal for the '{@link org.aioc.impl.NewRoleImpl <em>New Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.NewRoleImpl
     * @see org.aioc.impl.AiocPackageImpl#getNewRole()
     * @generated
     */
    EClass NEW_ROLE = eINSTANCE.getNewRole();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_ROLE__ROLE = eINSTANCE.getNewRole_Role();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_ROLE__LOCATION = eINSTANCE.getNewRole_Location();

    /**
     * The meta object literal for the '<em><b>Next Role</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ROLE__NEXT_ROLE = eINSTANCE.getNewRole_NextRole();

    /**
     * The meta object literal for the '{@link org.aioc.impl.WhereImpl <em>Where</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.WhereImpl
     * @see org.aioc.impl.AiocPackageImpl#getWhere()
     * @generated
     */
    EClass WHERE = eINSTANCE.getWhere();

    /**
     * The meta object literal for the '<em><b>Where Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE__WHERE_CONDITION = eINSTANCE.getWhere_WhereCondition();

    /**
     * The meta object literal for the '<em><b>Paren</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE__PAREN = eINSTANCE.getWhere_Paren();

    /**
     * The meta object literal for the '{@link org.aioc.impl.WhereCompareConditionImpl <em>Where Compare Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.WhereCompareConditionImpl
     * @see org.aioc.impl.AiocPackageImpl#getWhereCompareCondition()
     * @generated
     */
    EClass WHERE_COMPARE_CONDITION = eINSTANCE.getWhereCompareCondition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_COMPARE_CONDITION__LEFT = eINSTANCE.getWhereCompareCondition_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_COMPARE_CONDITION__OPERATOR = eINSTANCE.getWhereCompareCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_COMPARE_CONDITION__RIGHT = eINSTANCE.getWhereCompareCondition_Right();

    /**
     * The meta object literal for the '<em><b>And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_COMPARE_CONDITION__AND = eINSTANCE.getWhereCompareCondition_And();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_COMPARE_CONDITION__OR = eINSTANCE.getWhereCompareCondition_Or();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_COMPARE_CONDITION__NEXT = eINSTANCE.getWhereCompareCondition_Next();

    /**
     * The meta object literal for the '{@link org.aioc.impl.WhereExpressionBasicTermImpl <em>Where Expression Basic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.WhereExpressionBasicTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getWhereExpressionBasicTerm()
     * @generated
     */
    EClass WHERE_EXPRESSION_BASIC_TERM = eINSTANCE.getWhereExpressionBasicTerm();

    /**
     * The meta object literal for the '<em><b>NVariable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_EXPRESSION_BASIC_TERM__NVARIABLE = eINSTANCE.getWhereExpressionBasicTerm_NVariable();

    /**
     * The meta object literal for the '<em><b>EVariable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_EXPRESSION_BASIC_TERM__EVARIABLE = eINSTANCE.getWhereExpressionBasicTerm_EVariable();

    /**
     * The meta object literal for the '<em><b>SVariable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHERE_EXPRESSION_BASIC_TERM__SVARIABLE = eINSTANCE.getWhereExpressionBasicTerm_SVariable();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_EXPRESSION_BASIC_TERM__CONSTANT = eINSTANCE.getWhereExpressionBasicTerm_Constant();

    /**
     * The meta object literal for the '{@link org.aioc.impl.PreambleImpl <em>Preamble</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.PreambleImpl
     * @see org.aioc.impl.AiocPackageImpl#getPreamble()
     * @generated
     */
    EClass PREAMBLE = eINSTANCE.getPreamble();

    /**
     * The meta object literal for the '<em><b>Starter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREAMBLE__STARTER = eINSTANCE.getPreamble_Starter();

    /**
     * The meta object literal for the '<em><b>Loc Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREAMBLE__LOC_DEFINITION = eINSTANCE.getPreamble_LocDefinition();

    /**
     * The meta object literal for the '{@link org.aioc.impl.FunctionLocationImpl <em>Function Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.FunctionLocationImpl
     * @see org.aioc.impl.AiocPackageImpl#getFunctionLocation()
     * @generated
     */
    EClass FUNCTION_LOCATION = eINSTANCE.getFunctionLocation();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_LOCATION__FUNCTIONS = eINSTANCE.getFunctionLocation_Functions();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_LOCATION__LOCATION = eINSTANCE.getFunctionLocation_Location();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_LOCATION__PROTOCOL = eINSTANCE.getFunctionLocation_Protocol();

    /**
     * The meta object literal for the '{@link org.aioc.impl.FunctionListImpl <em>Function List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.FunctionListImpl
     * @see org.aioc.impl.AiocPackageImpl#getFunctionList()
     * @generated
     */
    EClass FUNCTION_LIST = eINSTANCE.getFunctionList();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_LIST__FUNCTION_NAME = eINSTANCE.getFunctionList_FunctionName();

    /**
     * The meta object literal for the '{@link org.aioc.impl.LocationDefinitionImpl <em>Location Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.LocationDefinitionImpl
     * @see org.aioc.impl.AiocPackageImpl#getLocationDefinition()
     * @generated
     */
    EClass LOCATION_DEFINITION = eINSTANCE.getLocationDefinition();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_DEFINITION__ROLE = eINSTANCE.getLocationDefinition_Role();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_DEFINITION__LOCATION = eINSTANCE.getLocationDefinition_Location();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_DEFINITION__CONTINUATION = eINSTANCE.getLocationDefinition_Continuation();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ChoreographyImpl <em>Choreography</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ChoreographyImpl
     * @see org.aioc.impl.AiocPackageImpl#getChoreography()
     * @generated
     */
    EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

    /**
     * The meta object literal for the '<em><b>Seq Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOREOGRAPHY__SEQ_BLOCK = eINSTANCE.getChoreography_SeqBlock();

    /**
     * The meta object literal for the '<em><b>Par</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOREOGRAPHY__PAR = eINSTANCE.getChoreography_Par();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SeqBlockImpl <em>Seq Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SeqBlockImpl
     * @see org.aioc.impl.AiocPackageImpl#getSeqBlock()
     * @generated
     */
    EClass SEQ_BLOCK = eINSTANCE.getSeqBlock();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_BLOCK__EVENT = eINSTANCE.getSeqBlock_Event();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQ_BLOCK__NEXT = eINSTANCE.getSeqBlock_Next();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SkipImpl <em>Skip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SkipImpl
     * @see org.aioc.impl.AiocPackageImpl#getSkip()
     * @generated
     */
    EClass SKIP = eINSTANCE.getSkip();

    /**
     * The meta object literal for the '<em><b>Skip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SKIP__SKIP = eINSTANCE.getSkip_Skip();

    /**
     * The meta object literal for the '{@link org.aioc.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.InteractionImpl
     * @see org.aioc.impl.AiocPackageImpl#getInteraction()
     * @generated
     */
    EClass INTERACTION = eINSTANCE.getInteraction();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__OPERATION = eINSTANCE.getInteraction_Operation();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__SENDER = eINSTANCE.getInteraction_Sender();

    /**
     * The meta object literal for the '<em><b>Sender Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__SENDER_EXPRESSION = eINSTANCE.getInteraction_SenderExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__RECEIVER = eINSTANCE.getInteraction_Receiver();

    /**
     * The meta object literal for the '<em><b>Receiver Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__RECEIVER_VARIABLE = eINSTANCE.getInteraction_ReceiverVariable();

    /**
     * The meta object literal for the '{@link org.aioc.impl.LocalCodeImpl <em>Local Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.LocalCodeImpl
     * @see org.aioc.impl.AiocPackageImpl#getLocalCode()
     * @generated
     */
    EClass LOCAL_CODE = eINSTANCE.getLocalCode();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_CODE__THREAD = eINSTANCE.getLocalCode_Thread();

    /**
     * The meta object literal for the '{@link org.aioc.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.IfThenElseImpl
     * @see org.aioc.impl.AiocPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_THEN_ELSE__KEY = eINSTANCE.getIfThenElse_Key();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_THEN_ELSE__THREAD = eINSTANCE.getIfThenElse_Thread();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
     * The meta object literal for the '{@link org.aioc.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.WhileImpl
     * @see org.aioc.impl.AiocPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHILE__THREAD = eINSTANCE.getWhile_Thread();

    /**
     * The meta object literal for the '<em><b>Choreography</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__CHOREOGRAPHY = eINSTANCE.getWhile_Choreography();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHILE__KEY = eINSTANCE.getWhile_Key();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ScopeImpl
     * @see org.aioc.impl.AiocPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__THREAD = eINSTANCE.getScope_Thread();

    /**
     * The meta object literal for the '<em><b>Choreography</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__CHOREOGRAPHY = eINSTANCE.getScope_Choreography();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__PROPERTIES = eINSTANCE.getScope_Properties();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__ROLES = eINSTANCE.getScope_Roles();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__KEY = eINSTANCE.getScope_Key();

    /**
     * The meta object literal for the '{@link org.aioc.impl.RolesImpl <em>Roles</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.RolesImpl
     * @see org.aioc.impl.AiocPackageImpl#getRoles()
     * @generated
     */
    EClass ROLES = eINSTANCE.getRoles();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLES__ROLES = eINSTANCE.getRoles_Roles();

    /**
     * The meta object literal for the '{@link org.aioc.impl.NestedChoreographyImpl <em>Nested Choreography</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.NestedChoreographyImpl
     * @see org.aioc.impl.AiocPackageImpl#getNestedChoreography()
     * @generated
     */
    EClass NESTED_CHOREOGRAPHY = eINSTANCE.getNestedChoreography();

    /**
     * The meta object literal for the '<em><b>Choreography</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_CHOREOGRAPHY__CHOREOGRAPHY = eINSTANCE.getNestedChoreography_Choreography();

    /**
     * The meta object literal for the '{@link org.aioc.impl.AssignmentSetImpl <em>Assignment Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.AssignmentSetImpl
     * @see org.aioc.impl.AiocPackageImpl#getAssignmentSet()
     * @generated
     */
    EClass ASSIGNMENT_SET = eINSTANCE.getAssignmentSet();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_SET__ASSIGNMENT = eINSTANCE.getAssignmentSet_Assignment();

    /**
     * The meta object literal for the '<em><b>Continuation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_SET__CONTINUATION = eINSTANCE.getAssignmentSet_Continuation();

    /**
     * The meta object literal for the '{@link org.aioc.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.AssignmentImpl
     * @see org.aioc.impl.AiocPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ExpressionImpl
     * @see org.aioc.impl.AiocPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Sum Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SUM_EXPRESSION = eINSTANCE.getExpression_SumExpression();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SumExpressionImpl <em>Sum Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SumExpressionImpl
     * @see org.aioc.impl.AiocPackageImpl#getSumExpression()
     * @generated
     */
    EClass SUM_EXPRESSION = eINSTANCE.getSumExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM_EXPRESSION__CHILDREN = eINSTANCE.getSumExpression_Children();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SumExpressionTermImpl <em>Sum Expression Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SumExpressionTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getSumExpressionTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_TERM = eINSTANCE.getSumExpressionTerm();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUM_EXPRESSION_TERM__EXPRESSION = eINSTANCE.getSumExpressionTerm_Expression();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ExpressionBasicTermImpl <em>Expression Basic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ExpressionBasicTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getExpressionBasicTerm()
     * @generated
     */
    EClass EXPRESSION_BASIC_TERM = eINSTANCE.getExpressionBasicTerm();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BASIC_TERM__NOT = eINSTANCE.getExpressionBasicTerm_Not();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BASIC_TERM__VARIABLE = eINSTANCE.getExpressionBasicTerm_Variable();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BASIC_TERM__CONSTANT = eINSTANCE.getExpressionBasicTerm_Constant();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_BASIC_TERM__CONDITION = eINSTANCE.getExpressionBasicTerm_Condition();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ConstantImpl
     * @see org.aioc.impl.AiocPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__INT_VALUE = eINSTANCE.getConstant_IntValue();

    /**
     * The meta object literal for the '<em><b>Str Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STR_VALUE = eINSTANCE.getConstant_StrValue();

    /**
     * The meta object literal for the '<em><b>True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__TRUE = eINSTANCE.getConstant_True();

    /**
     * The meta object literal for the '<em><b>False</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__FALSE = eINSTANCE.getConstant_False();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ConditionImpl
     * @see org.aioc.impl.AiocPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__LEFT = eINSTANCE.getCondition_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__RIGHT = eINSTANCE.getCondition_Right();

    /**
     * The meta object literal for the '{@link org.aioc.impl.ConditionOperatorImpl <em>Condition Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.ConditionOperatorImpl
     * @see org.aioc.impl.AiocPackageImpl#getConditionOperator()
     * @generated
     */
    EClass CONDITION_OPERATOR = eINSTANCE.getConditionOperator();

    /**
     * The meta object literal for the '<em><b>Lt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__LT = eINSTANCE.getConditionOperator_Lt();

    /**
     * The meta object literal for the '<em><b>Leq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__LEQ = eINSTANCE.getConditionOperator_Leq();

    /**
     * The meta object literal for the '<em><b>Equal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__EQUAL = eINSTANCE.getConditionOperator_Equal();

    /**
     * The meta object literal for the '<em><b>Gt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__GT = eINSTANCE.getConditionOperator_Gt();

    /**
     * The meta object literal for the '<em><b>Geq</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__GEQ = eINSTANCE.getConditionOperator_Geq();

    /**
     * The meta object literal for the '<em><b>Not equal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__NOT_EQUAL = eINSTANCE.getConditionOperator_Not_equal();

    /**
     * The meta object literal for the '<em><b>And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__AND = eINSTANCE.getConditionOperator_And();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_OPERATOR__OR = eINSTANCE.getConditionOperator_Or();

    /**
     * The meta object literal for the '{@link org.aioc.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.FunctionImpl
     * @see org.aioc.impl.AiocPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMS = eINSTANCE.getFunction_Params();

    /**
     * The meta object literal for the '{@link org.aioc.impl.IntegerImpl <em>Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.IntegerImpl
     * @see org.aioc.impl.AiocPackageImpl#getInteger()
     * @generated
     */
    EClass INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

    /**
     * The meta object literal for the '{@link org.aioc.impl.LocalAskCommandImpl <em>Local Ask Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.LocalAskCommandImpl
     * @see org.aioc.impl.AiocPackageImpl#getLocalAskCommand()
     * @generated
     */
    EClass LOCAL_ASK_COMMAND = eINSTANCE.getLocalAskCommand();

    /**
     * The meta object literal for the '<em><b>Result Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_ASK_COMMAND__RESULT_VARIABLE = eINSTANCE.getLocalAskCommand_ResultVariable();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ASK_COMMAND__QUESTION = eINSTANCE.getLocalAskCommand_Question();

    /**
     * The meta object literal for the '{@link org.aioc.impl.LocalShowCommandImpl <em>Local Show Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.LocalShowCommandImpl
     * @see org.aioc.impl.AiocPackageImpl#getLocalShowCommand()
     * @generated
     */
    EClass LOCAL_SHOW_COMMAND = eINSTANCE.getLocalShowCommand();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_SHOW_COMMAND__VARIABLE = eINSTANCE.getLocalShowCommand_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SHOW_COMMAND__EXPRESSION = eINSTANCE.getLocalShowCommand_Expression();

    /**
     * The meta object literal for the '{@link org.aioc.impl.LocalAssignmentCommandImpl <em>Local Assignment Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.LocalAssignmentCommandImpl
     * @see org.aioc.impl.AiocPackageImpl#getLocalAssignmentCommand()
     * @generated
     */
    EClass LOCAL_ASSIGNMENT_COMMAND = eINSTANCE.getLocalAssignmentCommand();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_ASSIGNMENT_COMMAND__VARIABLE = eINSTANCE.getLocalAssignmentCommand_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ASSIGNMENT_COMMAND__EXPRESSION = eINSTANCE.getLocalAssignmentCommand_Expression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ASSIGNMENT_COMMAND__FUNCTION = eINSTANCE.getLocalAssignmentCommand_Function();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SumExpressionAddTermImpl <em>Sum Expression Add Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SumExpressionAddTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getSumExpressionAddTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_ADD_TERM = eINSTANCE.getSumExpressionAddTerm();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SumExpressionSubtractTermImpl <em>Sum Expression Subtract Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SumExpressionSubtractTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getSumExpressionSubtractTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_SUBTRACT_TERM = eINSTANCE.getSumExpressionSubtractTerm();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SumExpressionTimesTermImpl <em>Sum Expression Times Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SumExpressionTimesTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getSumExpressionTimesTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_TIMES_TERM = eINSTANCE.getSumExpressionTimesTerm();

    /**
     * The meta object literal for the '{@link org.aioc.impl.SumExpressionDivideTermImpl <em>Sum Expression Divide Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aioc.impl.SumExpressionDivideTermImpl
     * @see org.aioc.impl.AiocPackageImpl#getSumExpressionDivideTerm()
     * @generated
     */
    EClass SUM_EXPRESSION_DIVIDE_TERM = eINSTANCE.getSumExpressionDivideTerm();

  }

} //AiocPackage
