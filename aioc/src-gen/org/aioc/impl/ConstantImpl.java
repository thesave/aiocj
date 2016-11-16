/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Constant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.ConstantImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.aioc.impl.ConstantImpl#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.aioc.impl.ConstantImpl#getTrue <em>True</em>}</li>
 *   <li>{@link org.aioc.impl.ConstantImpl#getFalse <em>False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantImpl extends MinimalEObjectImpl.Container implements Constant
{
  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected org.aioc.Integer intValue;

  /**
   * The default value of the '{@link #getStrValue() <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrValue()
   * @generated
   * @ordered
   */
  protected static final String STR_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrValue() <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrValue()
   * @generated
   * @ordered
   */
  protected String strValue = STR_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected static final String TRUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected String true_ = TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected static final String FALSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected String false_ = FALSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantImpl()
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
    return AiocPackage.Literals.CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.aioc.Integer getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntValue(org.aioc.Integer newIntValue, NotificationChain msgs)
  {
    org.aioc.Integer oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.CONSTANT__INT_VALUE, oldIntValue, newIntValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(org.aioc.Integer newIntValue)
  {
    if (newIntValue != intValue)
    {
      NotificationChain msgs = null;
      if (intValue != null)
        msgs = ((InternalEObject)intValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CONSTANT__INT_VALUE, null, msgs);
      if (newIntValue != null)
        msgs = ((InternalEObject)newIntValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.CONSTANT__INT_VALUE, null, msgs);
      msgs = basicSetIntValue(newIntValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONSTANT__INT_VALUE, newIntValue, newIntValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStrValue()
  {
    return strValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrValue(String newStrValue)
  {
    String oldStrValue = strValue;
    strValue = newStrValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONSTANT__STR_VALUE, oldStrValue, strValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(String newTrue)
  {
    String oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONSTANT__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(String newFalse)
  {
    String oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONSTANT__FALSE, oldFalse, false_));
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
      case AiocPackage.CONSTANT__INT_VALUE:
        return basicSetIntValue(null, msgs);
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
      case AiocPackage.CONSTANT__INT_VALUE:
        return getIntValue();
      case AiocPackage.CONSTANT__STR_VALUE:
        return getStrValue();
      case AiocPackage.CONSTANT__TRUE:
        return getTrue();
      case AiocPackage.CONSTANT__FALSE:
        return getFalse();
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
      case AiocPackage.CONSTANT__INT_VALUE:
        setIntValue((org.aioc.Integer)newValue);
        return;
      case AiocPackage.CONSTANT__STR_VALUE:
        setStrValue((String)newValue);
        return;
      case AiocPackage.CONSTANT__TRUE:
        setTrue((String)newValue);
        return;
      case AiocPackage.CONSTANT__FALSE:
        setFalse((String)newValue);
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
      case AiocPackage.CONSTANT__INT_VALUE:
        setIntValue((org.aioc.Integer)null);
        return;
      case AiocPackage.CONSTANT__STR_VALUE:
        setStrValue(STR_VALUE_EDEFAULT);
        return;
      case AiocPackage.CONSTANT__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
      case AiocPackage.CONSTANT__FALSE:
        setFalse(FALSE_EDEFAULT);
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
      case AiocPackage.CONSTANT__INT_VALUE:
        return intValue != null;
      case AiocPackage.CONSTANT__STR_VALUE:
        return STR_VALUE_EDEFAULT == null ? strValue != null : !STR_VALUE_EDEFAULT.equals(strValue);
      case AiocPackage.CONSTANT__TRUE:
        return TRUE_EDEFAULT == null ? true_ != null : !TRUE_EDEFAULT.equals(true_);
      case AiocPackage.CONSTANT__FALSE:
        return FALSE_EDEFAULT == null ? false_ != null : !FALSE_EDEFAULT.equals(false_);
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
    result.append(" (strValue: ");
    result.append(strValue);
    result.append(", true: ");
    result.append(true_);
    result.append(", false: ");
    result.append(false_);
    result.append(')');
    return result.toString();
  }

} //ConstantImpl
