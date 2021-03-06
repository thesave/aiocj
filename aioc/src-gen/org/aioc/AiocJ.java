/**
 */
package org.aioc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>J</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.AiocJ#getAioc <em>Aioc</em>}</li>
 *   <li>{@link org.aioc.AiocJ#getRuleSet <em>Rule Set</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getAiocJ()
 * @model
 * @generated
 */
public interface AiocJ extends EObject
{
  /**
   * Returns the value of the '<em><b>Aioc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aioc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aioc</em>' containment reference.
   * @see #setAioc(Aioc)
   * @see org.aioc.AiocPackage#getAiocJ_Aioc()
   * @model containment="true"
   * @generated
   */
  Aioc getAioc();

  /**
   * Sets the value of the '{@link org.aioc.AiocJ#getAioc <em>Aioc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aioc</em>' containment reference.
   * @see #getAioc()
   * @generated
   */
  void setAioc(Aioc value);

  /**
   * Returns the value of the '<em><b>Rule Set</b></em>' containment reference list.
   * The list contents are of type {@link org.aioc.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Set</em>' containment reference list.
   * @see org.aioc.AiocPackage#getAiocJ_RuleSet()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRuleSet();

} // AiocJ
