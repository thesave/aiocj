/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.ConditionOperator#isLt <em>Lt</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isLeq <em>Leq</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isEqual <em>Equal</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isGt <em>Gt</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isGeq <em>Geq</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isNot_equal <em>Not equal</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isAnd <em>And</em>}</li>
 *   <li>{@link org.aioc.ConditionOperator#isOr <em>Or</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getConditionOperator()
 * @model
 * @generated
 */
public interface ConditionOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Lt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lt</em>' attribute.
   * @see #setLt(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Lt()
   * @model
   * @generated
   */
  boolean isLt();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isLt <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lt</em>' attribute.
   * @see #isLt()
   * @generated
   */
  void setLt(boolean value);

  /**
   * Returns the value of the '<em><b>Leq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leq</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leq</em>' attribute.
   * @see #setLeq(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Leq()
   * @model
   * @generated
   */
  boolean isLeq();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isLeq <em>Leq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leq</em>' attribute.
   * @see #isLeq()
   * @generated
   */
  void setLeq(boolean value);

  /**
   * Returns the value of the '<em><b>Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equal</em>' attribute.
   * @see #setEqual(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Equal()
   * @model
   * @generated
   */
  boolean isEqual();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isEqual <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equal</em>' attribute.
   * @see #isEqual()
   * @generated
   */
  void setEqual(boolean value);

  /**
   * Returns the value of the '<em><b>Gt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gt</em>' attribute.
   * @see #setGt(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Gt()
   * @model
   * @generated
   */
  boolean isGt();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isGt <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gt</em>' attribute.
   * @see #isGt()
   * @generated
   */
  void setGt(boolean value);

  /**
   * Returns the value of the '<em><b>Geq</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geq</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geq</em>' attribute.
   * @see #setGeq(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Geq()
   * @model
   * @generated
   */
  boolean isGeq();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isGeq <em>Geq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geq</em>' attribute.
   * @see #isGeq()
   * @generated
   */
  void setGeq(boolean value);

  /**
   * Returns the value of the '<em><b>Not equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not equal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not equal</em>' attribute.
   * @see #setNot_equal(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Not_equal()
   * @model
   * @generated
   */
  boolean isNot_equal();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isNot_equal <em>Not equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not equal</em>' attribute.
   * @see #isNot_equal()
   * @generated
   */
  void setNot_equal(boolean value);

  /**
   * Returns the value of the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' attribute.
   * @see #setAnd(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_And()
   * @model
   * @generated
   */
  boolean isAnd();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isAnd <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And</em>' attribute.
   * @see #isAnd()
   * @generated
   */
  void setAnd(boolean value);

  /**
   * Returns the value of the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' attribute.
   * @see #setOr(boolean)
   * @see org.aioc.AiocPackage#getConditionOperator_Or()
   * @model
   * @generated
   */
  boolean isOr();

  /**
   * Sets the value of the '{@link org.aioc.ConditionOperator#isOr <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' attribute.
   * @see #isOr()
   * @generated
   */
  void setOr(boolean value);

} // ConditionOperator
