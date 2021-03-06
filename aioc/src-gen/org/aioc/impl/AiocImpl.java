/**
 */
package org.aioc.impl;

import java.util.Collection;

import org.aioc.Aioc;
import org.aioc.AiocPackage;
import org.aioc.Choreography;
import org.aioc.FunctionLocation;
import org.aioc.Preamble;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aioc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.AiocImpl#getFunctionLocation <em>Function Location</em>}</li>
 *   <li>{@link org.aioc.impl.AiocImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link org.aioc.impl.AiocImpl#getChoreography <em>Choreography</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AiocImpl extends MinimalEObjectImpl.Container implements Aioc
{
  /**
   * The cached value of the '{@link #getFunctionLocation() <em>Function Location</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionLocation()
   * @generated
   * @ordered
   */
  protected EList<FunctionLocation> functionLocation;

  /**
   * The cached value of the '{@link #getPreamble() <em>Preamble</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreamble()
   * @generated
   * @ordered
   */
  protected Preamble preamble;

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
  protected AiocImpl()
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
    return AiocPackage.Literals.AIOC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionLocation> getFunctionLocation()
  {
    if (functionLocation == null)
    {
      functionLocation = new EObjectContainmentEList<FunctionLocation>(FunctionLocation.class, this, AiocPackage.AIOC__FUNCTION_LOCATION);
    }
    return functionLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preamble getPreamble()
  {
    return preamble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreamble(Preamble newPreamble, NotificationChain msgs)
  {
    Preamble oldPreamble = preamble;
    preamble = newPreamble;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.AIOC__PREAMBLE, oldPreamble, newPreamble);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreamble(Preamble newPreamble)
  {
    if (newPreamble != preamble)
    {
      NotificationChain msgs = null;
      if (preamble != null)
        msgs = ((InternalEObject)preamble).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.AIOC__PREAMBLE, null, msgs);
      if (newPreamble != null)
        msgs = ((InternalEObject)newPreamble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.AIOC__PREAMBLE, null, msgs);
      msgs = basicSetPreamble(newPreamble, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.AIOC__PREAMBLE, newPreamble, newPreamble));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.AIOC__CHOREOGRAPHY, oldChoreography, newChoreography);
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
        msgs = ((InternalEObject)choreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.AIOC__CHOREOGRAPHY, null, msgs);
      if (newChoreography != null)
        msgs = ((InternalEObject)newChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.AIOC__CHOREOGRAPHY, null, msgs);
      msgs = basicSetChoreography(newChoreography, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.AIOC__CHOREOGRAPHY, newChoreography, newChoreography));
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
      case AiocPackage.AIOC__FUNCTION_LOCATION:
        return ((InternalEList<?>)getFunctionLocation()).basicRemove(otherEnd, msgs);
      case AiocPackage.AIOC__PREAMBLE:
        return basicSetPreamble(null, msgs);
      case AiocPackage.AIOC__CHOREOGRAPHY:
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
      case AiocPackage.AIOC__FUNCTION_LOCATION:
        return getFunctionLocation();
      case AiocPackage.AIOC__PREAMBLE:
        return getPreamble();
      case AiocPackage.AIOC__CHOREOGRAPHY:
        return getChoreography();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiocPackage.AIOC__FUNCTION_LOCATION:
        getFunctionLocation().clear();
        getFunctionLocation().addAll((Collection<? extends FunctionLocation>)newValue);
        return;
      case AiocPackage.AIOC__PREAMBLE:
        setPreamble((Preamble)newValue);
        return;
      case AiocPackage.AIOC__CHOREOGRAPHY:
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
      case AiocPackage.AIOC__FUNCTION_LOCATION:
        getFunctionLocation().clear();
        return;
      case AiocPackage.AIOC__PREAMBLE:
        setPreamble((Preamble)null);
        return;
      case AiocPackage.AIOC__CHOREOGRAPHY:
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
      case AiocPackage.AIOC__FUNCTION_LOCATION:
        return functionLocation != null && !functionLocation.isEmpty();
      case AiocPackage.AIOC__PREAMBLE:
        return preamble != null;
      case AiocPackage.AIOC__CHOREOGRAPHY:
        return choreography != null;
    }
    return super.eIsSet(featureID);
  }

} //AiocImpl
