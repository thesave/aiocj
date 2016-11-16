/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Expression Basic Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.WhereExpressionBasicTerm#getNVariable <em>NVariable</em>}</li>
 *   <li>{@link org.aioc.WhereExpressionBasicTerm#getEVariable <em>EVariable</em>}</li>
 *   <li>{@link org.aioc.WhereExpressionBasicTerm#getSVariable <em>SVariable</em>}</li>
 *   <li>{@link org.aioc.WhereExpressionBasicTerm#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getWhereExpressionBasicTerm()
 * @model
 * @generated
 */
public interface WhereExpressionBasicTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>NVariable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NVariable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NVariable</em>' attribute.
   * @see #setNVariable(String)
   * @see org.aioc.AiocPackage#getWhereExpressionBasicTerm_NVariable()
   * @model
   * @generated
   */
  String getNVariable();

  /**
   * Sets the value of the '{@link org.aioc.WhereExpressionBasicTerm#getNVariable <em>NVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NVariable</em>' attribute.
   * @see #getNVariable()
   * @generated
   */
  void setNVariable(String value);

  /**
   * Returns the value of the '<em><b>EVariable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EVariable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EVariable</em>' attribute.
   * @see #setEVariable(String)
   * @see org.aioc.AiocPackage#getWhereExpressionBasicTerm_EVariable()
   * @model
   * @generated
   */
  String getEVariable();

  /**
   * Sets the value of the '{@link org.aioc.WhereExpressionBasicTerm#getEVariable <em>EVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EVariable</em>' attribute.
   * @see #getEVariable()
   * @generated
   */
  void setEVariable(String value);

  /**
   * Returns the value of the '<em><b>SVariable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SVariable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SVariable</em>' attribute.
   * @see #setSVariable(String)
   * @see org.aioc.AiocPackage#getWhereExpressionBasicTerm_SVariable()
   * @model
   * @generated
   */
  String getSVariable();

  /**
   * Sets the value of the '{@link org.aioc.WhereExpressionBasicTerm#getSVariable <em>SVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SVariable</em>' attribute.
   * @see #getSVariable()
   * @generated
   */
  void setSVariable(String value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Constant)
   * @see org.aioc.AiocPackage#getWhereExpressionBasicTerm_Constant()
   * @model containment="true"
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link org.aioc.WhereExpressionBasicTerm#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);

} // WhereExpressionBasicTerm
