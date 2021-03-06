/**
 */
package org.aioc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aioc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Aioc#getFunctionLocation <em>Function Location</em>}</li>
 *   <li>{@link org.aioc.Aioc#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.aioc.Aioc#getChoreography <em>Choreography</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getAioc()
 * @model
 * @generated
 */
public interface Aioc extends EObject
{
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
   * @see org.aioc.AiocPackage#getAioc_FunctionLocation()
   * @model containment="true"
   * @generated
   */
  EList<FunctionLocation> getFunctionLocation();

  /**
   * Returns the value of the '<em><b>Preamble</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preamble</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preamble</em>' containment reference.
   * @see #setPreamble(Preamble)
   * @see org.aioc.AiocPackage#getAioc_Preamble()
   * @model containment="true"
   * @generated
   */
  Preamble getPreamble();

  /**
   * Sets the value of the '{@link org.aioc.Aioc#getPreamble <em>Preamble</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preamble</em>' containment reference.
   * @see #getPreamble()
   * @generated
   */
  void setPreamble(Preamble value);

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
   * @see org.aioc.AiocPackage#getAioc_Choreography()
   * @model containment="true"
   * @generated
   */
  Choreography getChoreography();

  /**
   * Sets the value of the '{@link org.aioc.Aioc#getChoreography <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choreography</em>' containment reference.
   * @see #getChoreography()
   * @generated
   */
  void setChoreography(Choreography value);

} // Aioc
