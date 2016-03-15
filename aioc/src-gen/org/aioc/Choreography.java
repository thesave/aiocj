/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Choreography#getSeqBlock <em>Seq Block</em>}</li>
 *   <li>{@link org.aioc.Choreography#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends EObject
{
  /**
   * Returns the value of the '<em><b>Seq Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seq Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seq Block</em>' containment reference.
   * @see #setSeqBlock(SeqBlock)
   * @see org.aioc.AiocPackage#getChoreography_SeqBlock()
   * @model containment="true"
   * @generated
   */
  SeqBlock getSeqBlock();

  /**
   * Sets the value of the '{@link org.aioc.Choreography#getSeqBlock <em>Seq Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seq Block</em>' containment reference.
   * @see #getSeqBlock()
   * @generated
   */
  void setSeqBlock(SeqBlock value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(Choreography)
   * @see org.aioc.AiocPackage#getChoreography_Next()
   * @model containment="true"
   * @generated
   */
  Choreography getNext();

  /**
   * Sets the value of the '{@link org.aioc.Choreography#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Choreography value);

} // Choreography
