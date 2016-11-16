/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Interaction;
import org.aioc.SumExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.InteractionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.aioc.impl.InteractionImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.aioc.impl.InteractionImpl#getSenderExpression <em>Sender Expression</em>}</li>
 *   <li>{@link org.aioc.impl.InteractionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.aioc.impl.InteractionImpl#getReceiverVariable <em>Receiver Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends MinimalEObjectImpl.Container implements Interaction
{
  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected String operation = OPERATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected static final String SENDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected String sender = SENDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getSenderExpression() <em>Sender Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSenderExpression()
   * @generated
   * @ordered
   */
  protected SumExpression senderExpression;

  /**
   * The default value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected static final String RECEIVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected String receiver = RECEIVER_EDEFAULT;

  /**
   * The default value of the '{@link #getReceiverVariable() <em>Receiver Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiverVariable()
   * @generated
   * @ordered
   */
  protected static final String RECEIVER_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReceiverVariable() <em>Receiver Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiverVariable()
   * @generated
   * @ordered
   */
  protected String receiverVariable = RECEIVER_VARIABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AiocPackage.Literals.INTERACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(String newOperation)
  {
    String oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.INTERACTION__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(String newSender)
  {
    String oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.INTERACTION__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumExpression getSenderExpression()
  {
    return senderExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSenderExpression(SumExpression newSenderExpression, NotificationChain msgs)
  {
    SumExpression oldSenderExpression = senderExpression;
    senderExpression = newSenderExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.INTERACTION__SENDER_EXPRESSION, oldSenderExpression, newSenderExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSenderExpression(SumExpression newSenderExpression)
  {
    if (newSenderExpression != senderExpression)
    {
      NotificationChain msgs = null;
      if (senderExpression != null)
        msgs = ((InternalEObject)senderExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.INTERACTION__SENDER_EXPRESSION, null, msgs);
      if (newSenderExpression != null)
        msgs = ((InternalEObject)newSenderExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.INTERACTION__SENDER_EXPRESSION, null, msgs);
      msgs = basicSetSenderExpression(newSenderExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.INTERACTION__SENDER_EXPRESSION, newSenderExpression, newSenderExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(String newReceiver)
  {
    String oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.INTERACTION__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReceiverVariable()
  {
    return receiverVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiverVariable(String newReceiverVariable)
  {
    String oldReceiverVariable = receiverVariable;
    receiverVariable = newReceiverVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.INTERACTION__RECEIVER_VARIABLE, oldReceiverVariable, receiverVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AiocPackage.INTERACTION__SENDER_EXPRESSION:
        return basicSetSenderExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AiocPackage.INTERACTION__OPERATION:
        return getOperation();
      case AiocPackage.INTERACTION__SENDER:
        return getSender();
      case AiocPackage.INTERACTION__SENDER_EXPRESSION:
        return getSenderExpression();
      case AiocPackage.INTERACTION__RECEIVER:
        return getReceiver();
      case AiocPackage.INTERACTION__RECEIVER_VARIABLE:
        return getReceiverVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiocPackage.INTERACTION__OPERATION:
        setOperation((String)newValue);
        return;
      case AiocPackage.INTERACTION__SENDER:
        setSender((String)newValue);
        return;
      case AiocPackage.INTERACTION__SENDER_EXPRESSION:
        setSenderExpression((SumExpression)newValue);
        return;
      case AiocPackage.INTERACTION__RECEIVER:
        setReceiver((String)newValue);
        return;
      case AiocPackage.INTERACTION__RECEIVER_VARIABLE:
        setReceiverVariable((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AiocPackage.INTERACTION__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case AiocPackage.INTERACTION__SENDER:
        setSender(SENDER_EDEFAULT);
        return;
      case AiocPackage.INTERACTION__SENDER_EXPRESSION:
        setSenderExpression((SumExpression)null);
        return;
      case AiocPackage.INTERACTION__RECEIVER:
        setReceiver(RECEIVER_EDEFAULT);
        return;
      case AiocPackage.INTERACTION__RECEIVER_VARIABLE:
        setReceiverVariable(RECEIVER_VARIABLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AiocPackage.INTERACTION__OPERATION:
        return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
      case AiocPackage.INTERACTION__SENDER:
        return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
      case AiocPackage.INTERACTION__SENDER_EXPRESSION:
        return senderExpression != null;
      case AiocPackage.INTERACTION__RECEIVER:
        return RECEIVER_EDEFAULT == null ? receiver != null : !RECEIVER_EDEFAULT.equals(receiver);
      case AiocPackage.INTERACTION__RECEIVER_VARIABLE:
        return RECEIVER_VARIABLE_EDEFAULT == null ? receiverVariable != null : !RECEIVER_VARIABLE_EDEFAULT.equals(receiverVariable);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operation: ");
    result.append(operation);
    result.append(", sender: ");
    result.append(sender);
    result.append(", receiver: ");
    result.append(receiver);
    result.append(", receiverVariable: ");
    result.append(receiverVariable);
    result.append(')');
    return result.toString();
  }

} //InteractionImpl
