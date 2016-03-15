/**
 */
package org.aioc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Roles#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getRoles()
 * @model
 * @generated
 */
public interface Roles extends EObject
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' attribute list.
   * @see org.aioc.AiocPackage#getRoles_Roles()
   * @model unique="false"
   * @generated
   */
  EList<String> getRoles();

} // Roles
