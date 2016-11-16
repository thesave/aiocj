/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.ConditionOperator;
import org.aioc.Where;
import org.aioc.WhereCompareCondition;
import org.aioc.WhereExpressionBasicTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Compare Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.WhereCompareConditionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.aioc.impl.WhereCompareConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.aioc.impl.WhereCompareConditionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.aioc.impl.WhereCompareConditionImpl#isAnd <em>And</em>}</li>
 *   <li>{@link org.aioc.impl.WhereCompareConditionImpl#isOr <em>Or</em>}</li>
 *   <li>{@link org.aioc.impl.WhereCompareConditionImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereCompareConditionImpl extends MinimalEObjectImpl.Container implements WhereCompareCondition
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected WhereExpressionBasicTerm left;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected ConditionOperator operator;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected WhereExpressionBasicTerm right;

  /**
   * The default value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected static final boolean AND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected boolean and = AND_EDEFAULT;

  /**
   * The default value of the '{@link #isOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOr()
   * @generated
   * @ordered
   */
  protected static final boolean OR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOr()
   * @generated
   * @ordered
   */
  protected boolean or = OR_EDEFAULT;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected Where next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereCompareConditionImpl()
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
    return AiocPackage.Literals.WHERE_COMPARE_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereExpressionBasicTerm getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(WhereExpressionBasicTerm newLeft, NotificationChain msgs)
  {
    WhereExpressionBasicTerm oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(WhereExpressionBasicTerm newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(ConditionOperator newOperator, NotificationChain msgs)
  {
    ConditionOperator oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR, oldOperator, newOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(ConditionOperator newOperator)
  {
    if (newOperator != operator)
    {
      NotificationChain msgs = null;
      if (operator != null)
        msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR, null, msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR, null, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereExpressionBasicTerm getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(WhereExpressionBasicTerm newRight, NotificationChain msgs)
  {
    WhereExpressionBasicTerm oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(WhereExpressionBasicTerm newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd(boolean newAnd)
  {
    boolean oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__AND, oldAnd, and));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOr(boolean newOr)
  {
    boolean oldOr = or;
    or = newOr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__OR, oldOr, or));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Where getNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNext(Where newNext, NotificationChain msgs)
  {
    Where oldNext = next;
    next = newNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__NEXT, oldNext, newNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(Where newNext)
  {
    if (newNext != next)
    {
      NotificationChain msgs = null;
      if (next != null)
        msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__NEXT, null, msgs);
      if (newNext != null)
        msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE_COMPARE_CONDITION__NEXT, null, msgs);
      msgs = basicSetNext(newNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE_COMPARE_CONDITION__NEXT, newNext, newNext));
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
      case AiocPackage.WHERE_COMPARE_CONDITION__LEFT:
        return basicSetLeft(null, msgs);
      case AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR:
        return basicSetOperator(null, msgs);
      case AiocPackage.WHERE_COMPARE_CONDITION__RIGHT:
        return basicSetRight(null, msgs);
      case AiocPackage.WHERE_COMPARE_CONDITION__NEXT:
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
      case AiocPackage.WHERE_COMPARE_CONDITION__LEFT:
        return getLeft();
      case AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR:
        return getOperator();
      case AiocPackage.WHERE_COMPARE_CONDITION__RIGHT:
        return getRight();
      case AiocPackage.WHERE_COMPARE_CONDITION__AND:
        return isAnd();
      case AiocPackage.WHERE_COMPARE_CONDITION__OR:
        return isOr();
      case AiocPackage.WHERE_COMPARE_CONDITION__NEXT:
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
      case AiocPackage.WHERE_COMPARE_CONDITION__LEFT:
        setLeft((WhereExpressionBasicTerm)newValue);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR:
        setOperator((ConditionOperator)newValue);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__RIGHT:
        setRight((WhereExpressionBasicTerm)newValue);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__AND:
        setAnd((Boolean)newValue);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__OR:
        setOr((Boolean)newValue);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__NEXT:
        setNext((Where)newValue);
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
      case AiocPackage.WHERE_COMPARE_CONDITION__LEFT:
        setLeft((WhereExpressionBasicTerm)null);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR:
        setOperator((ConditionOperator)null);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__RIGHT:
        setRight((WhereExpressionBasicTerm)null);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__AND:
        setAnd(AND_EDEFAULT);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__OR:
        setOr(OR_EDEFAULT);
        return;
      case AiocPackage.WHERE_COMPARE_CONDITION__NEXT:
        setNext((Where)null);
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
      case AiocPackage.WHERE_COMPARE_CONDITION__LEFT:
        return left != null;
      case AiocPackage.WHERE_COMPARE_CONDITION__OPERATOR:
        return operator != null;
      case AiocPackage.WHERE_COMPARE_CONDITION__RIGHT:
        return right != null;
      case AiocPackage.WHERE_COMPARE_CONDITION__AND:
        return and != AND_EDEFAULT;
      case AiocPackage.WHERE_COMPARE_CONDITION__OR:
        return or != OR_EDEFAULT;
      case AiocPackage.WHERE_COMPARE_CONDITION__NEXT:
        return next != null;
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
    result.append(" (and: ");
    result.append(and);
    result.append(", or: ");
    result.append(or);
    result.append(')');
    return result.toString();
  }

} //WhereCompareConditionImpl
