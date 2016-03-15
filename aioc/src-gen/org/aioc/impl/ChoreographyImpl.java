/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Choreography;
import org.aioc.SeqBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.ChoreographyImpl#getSeqBlock <em>Seq Block</em>}</li>
 *   <li>{@link org.aioc.impl.ChoreographyImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoreographyImpl extends MinimalEObjectImpl.Container implements Choreography
{
  /**
   * The cached value of the '{@link #getSeqBlock() <em>Seq Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqBlock()
   * @generated
   * @ordered
   */
  protected SeqBlock seqBlock;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected Choreography next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChoreographyImpl()
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
    return AiocPackage.Literals.CHOREOGRAPHY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqBlock getSeqBlock()
  {
    return seqBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeqBlock(SeqBlock newSeqBlock, NotificationChain msgs)
  {
    SeqBlock oldSeqBlock = seqBlock;
    seqBlock = newSeqBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.CHOREOGRAPHY__SEQ_BLOCK, oldSeqBlock, newSeqBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeqBlock(SeqBlock newSeqBlock)
  {
    if (newSeqBlock != seqBlock)
    {
      NotificationChain msgs = null;
      if (seqBlock != null)
        msgs = ((InternalEObject)seqBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CHOREOGRAPHY__SEQ_BLOCK, null, msgs);
      if (newSeqBlock != null)
        msgs = ((InternalEObject)newSeqBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CHOREOGRAPHY__SEQ_BLOCK, null, msgs);
      msgs = basicSetSeqBlock(newSeqBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CHOREOGRAPHY__SEQ_BLOCK, newSeqBlock, newSeqBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography getNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNext(Choreography newNext, NotificationChain msgs)
  {
    Choreography oldNext = next;
    next = newNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.CHOREOGRAPHY__NEXT, oldNext, newNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(Choreography newNext)
  {
    if (newNext != next)
    {
      NotificationChain msgs = null;
      if (next != null)
        msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CHOREOGRAPHY__NEXT, null, msgs);
      if (newNext != null)
        msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CHOREOGRAPHY__NEXT, null, msgs);
      msgs = basicSetNext(newNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CHOREOGRAPHY__NEXT, newNext, newNext));
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
      case AiocPackage.CHOREOGRAPHY__SEQ_BLOCK:
        return basicSetSeqBlock(null, msgs);
      case AiocPackage.CHOREOGRAPHY__NEXT:
        return basicSetNext(null, msgs);
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
      case AiocPackage.CHOREOGRAPHY__SEQ_BLOCK:
        return getSeqBlock();
      case AiocPackage.CHOREOGRAPHY__NEXT:
        return getNext();
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
      case AiocPackage.CHOREOGRAPHY__SEQ_BLOCK:
        setSeqBlock((SeqBlock)newValue);
        return;
      case AiocPackage.CHOREOGRAPHY__NEXT:
        setNext((Choreography)newValue);
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
      case AiocPackage.CHOREOGRAPHY__SEQ_BLOCK:
        setSeqBlock((SeqBlock)null);
        return;
      case AiocPackage.CHOREOGRAPHY__NEXT:
        setNext((Choreography)null);
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
      case AiocPackage.CHOREOGRAPHY__SEQ_BLOCK:
        return seqBlock != null;
      case AiocPackage.CHOREOGRAPHY__NEXT:
        return next != null;
    }
    return super.eIsSet(featureID);
  }

} //ChoreographyImpl
