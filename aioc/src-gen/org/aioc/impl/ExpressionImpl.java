/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Expression;
import org.aioc.SumExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.ExpressionImpl#getSumExpression <em>Sum Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getSumExpression() <em>Sum Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSumExpression()
   * @generated
   * @ordered
   */
  protected SumExpression sumExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return AiocPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumExpression getSumExpression()
  {
    return sumExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSumExpression(SumExpression newSumExpression, NotificationChain msgs)
  {
    SumExpression oldSumExpression = sumExpression;
    sumExpression = newSumExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.EXPRESSION__SUM_EXPRESSION, oldSumExpression, newSumExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSumExpression(SumExpression newSumExpression)
  {
    if (newSumExpression != sumExpression)
    {
      NotificationChain msgs = null;
      if (sumExpression != null)
        msgs = ((InternalEObject)sumExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.EXPRESSION__SUM_EXPRESSION, null, msgs);
      if (newSumExpression != null)
        msgs = ((InternalEObject)newSumExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.EXPRESSION__SUM_EXPRESSION, null, msgs);
      msgs = basicSetSumExpression(newSumExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.EXPRESSION__SUM_EXPRESSION, newSumExpression, newSumExpression));
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
      case AiocPackage.EXPRESSION__SUM_EXPRESSION:
        return basicSetSumExpression(null, msgs);
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
      case AiocPackage.EXPRESSION__SUM_EXPRESSION:
        return getSumExpression();
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
      case AiocPackage.EXPRESSION__SUM_EXPRESSION:
        setSumExpression((SumExpression)newValue);
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
      case AiocPackage.EXPRESSION__SUM_EXPRESSION:
        setSumExpression((SumExpression)null);
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
      case AiocPackage.EXPRESSION__SUM_EXPRESSION:
        return sumExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
