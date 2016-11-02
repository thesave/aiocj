/**
 */
package org.aioc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Rule#getLocDefinition <em>Loc Definition</em>}</li>
 *   <li>{@link org.aioc.Rule#getFunctionLocation <em>Function Location</em>}</li>
 *   <li>{@link org.aioc.Rule#getNewRoles <em>New Roles</em>}</li>
 *   <li>{@link org.aioc.Rule#getWhere <em>Where</em>}</li>
 *   <li>{@link org.aioc.Rule#getChoreography <em>Choreography</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
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
   * @see org.aioc.AiocPackage#getRule_LocDefinition()
   * @model containment="true"
   * @generated
   */
  LocationDefinition getLocDefinition();

  /**
   * Sets the value of the '{@link org.aioc.Rule#getLocDefinition <em>Loc Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc Definition</em>' containment reference.
   * @see #getLocDefinition()
   * @generated
   */
  void setLocDefinition(LocationDefinition value);

  /**
   * Returns the value of the '<em><b>Function Location</b></em>' containment reference list.
   * The list contents are of type {@link org.aioc.FunctionLocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Location</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Location</em>' containment reference list.
   * @see org.aioc.AiocPackage#getRule_FunctionLocation()
   * @model containment="true"
   * @generated
   */
  EList<FunctionLocation> getFunctionLocation();

  /**
   * Returns the value of the '<em><b>New Roles</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Roles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Roles</em>' attribute list.
   * @see org.aioc.AiocPackage#getRule_NewRoles()
   * @model unique="false"
   * @generated
   */
  EList<String> getNewRoles();

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see org.aioc.AiocPackage#getRule_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link org.aioc.Rule#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

  /**
   * Returns the value of the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choreography</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choreography</em>' containment reference.
   * @see #setChoreography(Choreography)
   * @see org.aioc.AiocPackage#getRule_Choreography()
   * @model containment="true"
   * @generated
   */
  Choreography getChoreography();

  /**
   * Sets the value of the '{@link org.aioc.Rule#getChoreography <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choreography</em>' containment reference.
   * @see #getChoreography()
   * @generated
   */
  void setChoreography(Choreography value);

} // Rule
