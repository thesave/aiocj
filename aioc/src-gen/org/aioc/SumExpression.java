/**
 */
package org.aioc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.SumExpression#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getSumExpression()
 * @model
 * @generated
 */
public interface SumExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.aioc.AiocPackage#getSumExpression_Children()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getChildren();

} // SumExpression
