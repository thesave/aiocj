/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preamble</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Preamble#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.aioc.Preamble#getLocDefinition <em>Loc Definition</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getPreamble()
 * @model
 * @generated
 */
public interface Preamble extends EObject
{
  /**
   * Returns the value of the '<em><b>Starter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Starter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Starter</em>' attribute.
   * @see #setStarter(String)
   * @see org.aioc.AiocPackage#getPreamble_Starter()
   * @model
   * @generated
   */
  String getStarter();

  /**
   * Sets the value of the '{@link org.aioc.Preamble#getStarter <em>Starter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Starter</em>' attribute.
   * @see #getStarter()
   * @generated
   */
  void setStarter(String value);

  /**
   * Returns the value of the '<em><b>Loc Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loc Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc Definition</em>' containment reference.
   * @see #setLocDefinition(LocationDefinition)
   * @see org.aioc.AiocPackage#getPreamble_LocDefinition()
   * @model containment="true"
   * @generated
   */
  LocationDefinition getLocDefinition();

  /**
   * Sets the value of the '{@link org.aioc.Preamble#getLocDefinition <em>Loc Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc Definition</em>' containment reference.
   * @see #getLocDefinition()
   * @generated
   */
  void setLocDefinition(LocationDefinition value);

} // Preamble
