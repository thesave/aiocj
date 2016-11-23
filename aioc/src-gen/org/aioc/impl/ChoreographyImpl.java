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
 *   <li>{@link org.aioc.impl.ChoreographyImpl#getPar <em>Par</em>}</li>
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
   * The cached value of the '{@link #getPar() <em>Par</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected Choreography par;

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
  public Choreography getPar()
  {
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPar(Choreography newPar, NotificationChain msgs)
  {
    Choreography oldPar = par;
    par = newPar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.CHOREOGRAPHY__PAR, oldPar, newPar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar(Choreography newPar)
  {
    if (newPar != par)
    {
      NotificationChain msgs = null;
      if (par != null)
        msgs = ((InternalEObject)par).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CHOREOGRAPHY__PAR, null, msgs);
      if (newPar != null)
        msgs = ((InternalEObject)newPar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CHOREOGRAPHY__PAR, null, msgs);
      msgs = basicSetPar(newPar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CHOREOGRAPHY__PAR, newPar, newPar));
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
      case AiocPackage.CHOREOGRAPHY__PAR:
        return basicSetPar(null, msgs);
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
      case AiocPackage.CHOREOGRAPHY__PAR:
        return getPar();
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
      case AiocPackage.CHOREOGRAPHY__PAR:
        setPar((Choreography)newValue);
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
      case AiocPackage.CHOREOGRAPHY__PAR:
        setPar((Choreography)null);
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
      case AiocPackage.CHOREOGRAPHY__PAR:
        return par != null;
    }
    return super.eIsSet(featureID);
  }

} //ChoreographyImpl
