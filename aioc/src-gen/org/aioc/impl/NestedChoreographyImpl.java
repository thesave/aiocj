/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Choreography;
import org.aioc.NestedChoreography;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.NestedChoreographyImpl#getChoreography <em>Choreography</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedChoreographyImpl extends MinimalEObjectImpl.Container implements NestedChoreography
{
  /**
   * The cached value of the '{@link #getChoreography() <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoreography()
   * @generated
   * @ordered
   */
  protected Choreography choreography;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedChoreographyImpl()
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
    return AiocPackage.Literals.NESTED_CHOREOGRAPHY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choreography getChoreography()
  {
    return choreography;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoreography(Choreography newChoreography, NotificationChain msgs)
  {
    Choreography oldChoreography = choreography;
    choreography = newChoreography;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY, oldChoreography, newChoreography);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoreography(Choreography newChoreography)
  {
    if (newChoreography != choreography)
    {
      NotificationChain msgs = null;
      if (choreography != null)
        msgs = ((InternalEObject)choreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY, null, msgs);
      if (newChoreography != null)
        msgs = ((InternalEObject)newChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY, null, msgs);
      msgs = basicSetChoreography(newChoreography, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY, newChoreography, newChoreography));
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
      case AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY:
        return basicSetChoreography(null, msgs);
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
      case AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY:
        return getChoreography();
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
      case AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY:
        setChoreography((Choreography)newValue);
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
      case AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY:
        setChoreography((Choreography)null);
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
      case AiocPackage.NESTED_CHOREOGRAPHY__CHOREOGRAPHY:
        return choreography != null;
    }
    return super.eIsSet(featureID);
  }

} //NestedChoreographyImpl
