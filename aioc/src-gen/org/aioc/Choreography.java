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
 *   <li>{@link org.aioc.Choreography#getPar <em>Par</em>}</li>
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
   * Returns the value of the '<em><b>Par</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' containment reference.
   * @see #setPar(Choreography)
   * @see org.aioc.AiocPackage#getChoreography_Par()
   * @model containment="true"
   * @generated
   */
  Choreography getPar();

  /**
   * Sets the value of the '{@link org.aioc.Choreography#getPar <em>Par</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par</em>' containment reference.
   * @see #getPar()
   * @generated
   */
  void setPar(Choreography value);

} // Choreography
