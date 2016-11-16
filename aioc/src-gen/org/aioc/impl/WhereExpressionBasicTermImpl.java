/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Constant;
import org.aioc.WhereExpressionBasicTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Expression Basic Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.WhereExpressionBasicTermImpl#getNVariable <em>NVariable</em>}</li>
 *   <li>{@link org.aioc.impl.WhereExpressionBasicTermImpl#getEVariable <em>EVariable</em>}</li>
 *   <li>{@link org.aioc.impl.WhereExpressionBasicTermImpl#getSVariable <em>SVariable</em>}</li>
 *   <li>{@link org.aioc.impl.WhereExpressionBasicTermImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereExpressionBasicTermImpl extends MinimalEObjectImpl.Container implements WhereExpressionBasicTerm
{
  /**
   * The default value of the '{@link #getNVariable() <em>NVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNVariable()
   * @generated
   * @ordered
   */
  protected static final String NVARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNVariable() <em>NVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNVariable()
   * @generated
   * @ordered
   */
  protected String nVariable = NVARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getEVariable() <em>EVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEVariable()
   * @generated
   * @ordered
   */
  protected static final String EVARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEVariable() <em>EVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEVariable()
   * @generated
   * @ordered
   */
  protected String eVariable = EVARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getSVariable() <em>SVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSVariable()
   * @generated
   * @ordered
   */
  protected static final String SVARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSVariable() <em>SVariable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSVariable()
   * @generated
   * @ordered
   */
  protected String sVariable = SVARIABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected Constant constant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereExpressionBasicTermImpl()
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
    return AiocPackage.Literals.WHERE_EXPRESSION_BASIC_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNVariable()
  {
    return nVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNVariable(String newNVariable)
  {
    String oldNVariable = nVariable;
    nVariable = newNVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_EXPRESSION_BASIC_TERM__NVARIABLE, oldNVariable, nVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEVariable()
  {
    return eVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEVariable(String newEVariable)
  {
    String oldEVariable = eVariable;
    eVariable = newEVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_EXPRESSION_BASIC_TERM__EVARIABLE, oldEVariable, eVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSVariable()
  {
    return sVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSVariable(String newSVariable)
  {
    String oldSVariable = sVariable;
    sVariable = newSVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_EXPRESSION_BASIC_TERM__SVARIABLE, oldSVariable, sVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(Constant newConstant, NotificationChain msgs)
  {
    Constant oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(Constant newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT, newConstant, newConstant));
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
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT:
        return basicSetConstant(null, msgs);
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
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__NVARIABLE:
        return getNVariable();
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__EVARIABLE:
        return getEVariable();
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__SVARIABLE:
        return getSVariable();
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT:
        return getConstant();
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
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__NVARIABLE:
        setNVariable((String)newValue);
        return;
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__EVARIABLE:
        setEVariable((String)newValue);
        return;
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__SVARIABLE:
        setSVariable((String)newValue);
        return;
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT:
        setConstant((Constant)newValue);
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
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__NVARIABLE:
        setNVariable(NVARIABLE_EDEFAULT);
        return;
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__EVARIABLE:
        setEVariable(EVARIABLE_EDEFAULT);
        return;
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__SVARIABLE:
        setSVariable(SVARIABLE_EDEFAULT);
        return;
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT:
        setConstant((Constant)null);
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
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__NVARIABLE:
        return NVARIABLE_EDEFAULT == null ? nVariable != null : !NVARIABLE_EDEFAULT.equals(nVariable);
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__EVARIABLE:
        return EVARIABLE_EDEFAULT == null ? eVariable != null : !EVARIABLE_EDEFAULT.equals(eVariable);
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__SVARIABLE:
        return SVARIABLE_EDEFAULT == null ? sVariable != null : !SVARIABLE_EDEFAULT.equals(sVariable);
      case AiocPackage.WHERE_EXPRESSION_BASIC_TERM__CONSTANT:
        return constant != null;
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
    result.append(" (nVariable: ");
    result.append(nVariable);
    result.append(", eVariable: ");
    result.append(eVariable);
    result.append(", sVariable: ");
    result.append(sVariable);
    result.append(')');
    return result.toString();
  }

} //WhereExpressionBasicTermImpl
