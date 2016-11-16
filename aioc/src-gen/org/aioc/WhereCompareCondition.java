/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Compare Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.WhereCompareCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link org.aioc.WhereCompareCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.aioc.WhereCompareCondition#getRight <em>Right</em>}</li>
 *   <li>{@link org.aioc.WhereCompareCondition#isAnd <em>And</em>}</li>
 *   <li>{@link org.aioc.WhereCompareCondition#isOr <em>Or</em>}</li>
 *   <li>{@link org.aioc.WhereCompareCondition#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getWhereCompareCondition()
 * @model
 * @generated
 */
public interface WhereCompareCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(WhereExpressionBasicTerm)
   * @see org.aioc.AiocPackage#getWhereCompareCondition_Left()
   * @model containment="true"
   * @generated
   */
  WhereExpressionBasicTerm getLeft();

  /**
   * Sets the value of the '{@link org.aioc.WhereCompareCondition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(WhereExpressionBasicTerm value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(ConditionOperator)
   * @see org.aioc.AiocPackage#getWhereCompareCondition_Operator()
   * @model containment="true"
   * @generated
   */
  ConditionOperator getOperator();

  /**
   * Sets the value of the '{@link org.aioc.WhereCompareCondition#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(ConditionOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(WhereExpressionBasicTerm)
   * @see org.aioc.AiocPackage#getWhereCompareCondition_Right()
   * @model containment="true"
   * @generated
   */
  WhereExpressionBasicTerm getRight();

  /**
   * Sets the value of the '{@link org.aioc.WhereCompareCondition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(WhereExpressionBasicTerm value);

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
   * @see org.aioc.AiocPackage#getWhereCompareCondition_And()
   * @model
   * @generated
   */
  boolean isAnd();

  /**
   * Sets the value of the '{@link org.aioc.WhereCompareCondition#isAnd <em>And</em>}' attribute.
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
   * @see org.aioc.AiocPackage#getWhereCompareCondition_Or()
   * @model
   * @generated
   */
  boolean isOr();

  /**
   * Sets the value of the '{@link org.aioc.WhereCompareCondition#isOr <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' attribute.
   * @see #isOr()
   * @generated
   */
  void setOr(boolean value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(Where)
   * @see org.aioc.AiocPackage#getWhereCompareCondition_Next()
   * @model containment="true"
   * @generated
   */
  Where getNext();

  /**
   * Sets the value of the '{@link org.aioc.WhereCompareCondition#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Where value);

} // WhereCompareCondition
