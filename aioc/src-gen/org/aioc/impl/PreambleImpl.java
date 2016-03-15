/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.LocationDefinition;
import org.aioc.Preamble;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preamble</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.PreambleImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.aioc.impl.PreambleImpl#getLocDefinition <em>Loc Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreambleImpl extends MinimalEObjectImpl.Container implements Preamble
{
  /**
   * The default value of the '{@link #getStarter() <em>Starter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStarter()
   * @generated
   * @ordered
   */
  protected static final String STARTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStarter() <em>Starter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStarter()
   * @generated
   * @ordered
   */
  protected String starter = STARTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocDefinition() <em>Loc Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocDefinition()
   * @generated
   * @ordered
   */
  protected LocationDefinition locDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreambleImpl()
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
    return AiocPackage.Literals.PREAMBLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStarter()
  {
    return starter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStarter(String newStarter)
  {
    String oldStarter = starter;
    starter = newStarter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.PREAMBLE__STARTER, oldStarter, starter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationDefinition getLocDefinition()
  {
    return locDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocDefinition(LocationDefinition newLocDefinition, NotificationChain msgs)
  {
    LocationDefinition oldLocDefinition = locDefinition;
    locDefinition = newLocDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.PREAMBLE__LOC_DEFINITION, oldLocDefinition, newLocDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocDefinition(LocationDefinition newLocDefinition)
  {
    if (newLocDefinition != locDefinition)
    {
      NotificationChain msgs = null;
      if (locDefinition != null)
        msgs = ((InternalEObject)locDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.PREAMBLE__LOC_DEFINITION, null, msgs);
      if (newLocDefinition != null)
        msgs = ((InternalEObject)newLocDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.PREAMBLE__LOC_DEFINITION, null, msgs);
      msgs = basicSetLocDefinition(newLocDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.PREAMBLE__LOC_DEFINITION, newLocDefinition, newLocDefinition));
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
      case AiocPackage.PREAMBLE__LOC_DEFINITION:
        return basicSetLocDefinition(null, msgs);
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
      case AiocPackage.PREAMBLE__STARTER:
        return getStarter();
      case AiocPackage.PREAMBLE__LOC_DEFINITION:
        return getLocDefinition();
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
      case AiocPackage.PREAMBLE__STARTER:
        setStarter((String)newValue);
        return;
      case AiocPackage.PREAMBLE__LOC_DEFINITION:
        setLocDefinition((LocationDefinition)newValue);
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
      case AiocPackage.PREAMBLE__STARTER:
        setStarter(STARTER_EDEFAULT);
        return;
      case AiocPackage.PREAMBLE__LOC_DEFINITION:
        setLocDefinition((LocationDefinition)null);
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
      case AiocPackage.PREAMBLE__STARTER:
        return STARTER_EDEFAULT == null ? starter != null : !STARTER_EDEFAULT.equals(starter);
      case AiocPackage.PREAMBLE__LOC_DEFINITION:
        return locDefinition != null;
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
    result.append(" (starter: ");
    result.append(starter);
    result.append(')');
    return result.toString();
  }

} //PreambleImpl
