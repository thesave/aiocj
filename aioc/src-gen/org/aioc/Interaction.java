/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Interaction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.aioc.Interaction#getSender <em>Sender</em>}</li>
 *   <li>{@link org.aioc.Interaction#getSenderExpression <em>Sender Expression</em>}</li>
 *   <li>{@link org.aioc.Interaction#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.aioc.Interaction#getReceiverVariable <em>Receiver Variable</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see org.aioc.AiocPackage#getInteraction_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link org.aioc.Interaction#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' attribute.
   * @see #setSender(String)
   * @see org.aioc.AiocPackage#getInteraction_Sender()
   * @model
   * @generated
   */
  String getSender();

  /**
   * Sets the value of the '{@link org.aioc.Interaction#getSender <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' attribute.
   * @see #getSender()
   * @generated
   */
  void setSender(String value);

  /**
   * Returns the value of the '<em><b>Sender Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender Expression</em>' containment reference.
   * @see #setSenderExpression(ExpressionBasicTerm)
   * @see org.aioc.AiocPackage#getInteraction_SenderExpression()
   * @model containment="true"
   * @generated
   */
  ExpressionBasicTerm getSenderExpression();

  /**
   * Sets the value of the '{@link org.aioc.Interaction#getSenderExpression <em>Sender Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender Expression</em>' containment reference.
   * @see #getSenderExpression()
   * @generated
   */
  void setSenderExpression(ExpressionBasicTerm value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' attribute.
   * @see #setReceiver(String)
   * @see org.aioc.AiocPackage#getInteraction_Receiver()
   * @model
   * @generated
   */
  String getReceiver();

  /**
   * Sets the value of the '{@link org.aioc.Interaction#getReceiver <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' attribute.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(String value);

  /**
   * Returns the value of the '<em><b>Receiver Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver Variable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver Variable</em>' attribute.
   * @see #setReceiverVariable(String)
   * @see org.aioc.AiocPackage#getInteraction_ReceiverVariable()
   * @model
   * @generated
   */
  String getReceiverVariable();

  /**
   * Sets the value of the '{@link org.aioc.Interaction#getReceiverVariable <em>Receiver Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver Variable</em>' attribute.
   * @see #getReceiverVariable()
   * @generated
   */
  void setReceiverVariable(String value);

} // Interaction
