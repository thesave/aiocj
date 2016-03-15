/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.ConditionOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isLt <em>Lt</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isLeq <em>Leq</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isEqual <em>Equal</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isGt <em>Gt</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isGeq <em>Geq</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isNot_equal <em>Not equal</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isAnd <em>And</em>}</li>
 *   <li>{@link org.aioc.impl.ConditionOperatorImpl#isOr <em>Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionOperatorImpl extends MinimalEObjectImpl.Container implements ConditionOperator
{
  /**
   * The default value of the '{@link #isLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLt()
   * @generated
   * @ordered
   */
  protected static final boolean LT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLt()
   * @generated
   * @ordered
   */
  protected boolean lt = LT_EDEFAULT;

  /**
   * The default value of the '{@link #isLeq() <em>Leq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeq()
   * @generated
   * @ordered
   */
  protected static final boolean LEQ_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLeq() <em>Leq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeq()
   * @generated
   * @ordered
   */
  protected boolean leq = LEQ_EDEFAULT;

  /**
   * The default value of the '{@link #isEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEqual()
   * @generated
   * @ordered
   */
  protected static final boolean EQUAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEqual() <em>Equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEqual()
   * @generated
   * @ordered
   */
  protected boolean equal = EQUAL_EDEFAULT;

  /**
   * The default value of the '{@link #isGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGt()
   * @generated
   * @ordered
   */
  protected static final boolean GT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGt()
   * @generated
   * @ordered
   */
  protected boolean gt = GT_EDEFAULT;

  /**
   * The default value of the '{@link #isGeq() <em>Geq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGeq()
   * @generated
   * @ordered
   */
  protected static final boolean GEQ_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGeq() <em>Geq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGeq()
   * @generated
   * @ordered
   */
  protected boolean geq = GEQ_EDEFAULT;

  /**
   * The default value of the '{@link #isNot_equal() <em>Not equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot_equal()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EQUAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot_equal() <em>Not equal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot_equal()
   * @generated
   * @ordered
   */
  protected boolean not_equal = NOT_EQUAL_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionOperatorImpl()
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
    return AiocPackage.Literals.CONDITION_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLt()
  {
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLt(boolean newLt)
  {
    boolean oldLt = lt;
    lt = newLt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__LT, oldLt, lt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLeq()
  {
    return leq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeq(boolean newLeq)
  {
    boolean oldLeq = leq;
    leq = newLeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__LEQ, oldLeq, leq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEqual()
  {
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEqual(boolean newEqual)
  {
    boolean oldEqual = equal;
    equal = newEqual;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__EQUAL, oldEqual, equal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGt()
  {
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGt(boolean newGt)
  {
    boolean oldGt = gt;
    gt = newGt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__GT, oldGt, gt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGeq()
  {
    return geq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeq(boolean newGeq)
  {
    boolean oldGeq = geq;
    geq = newGeq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__GEQ, oldGeq, geq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot_equal()
  {
    return not_equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot_equal(boolean newNot_equal)
  {
    boolean oldNot_equal = not_equal;
    not_equal = newNot_equal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__NOT_EQUAL, oldNot_equal, not_equal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__AND, oldAnd, and));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.CONDITION_OPERATOR__OR, oldOr, or));
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
      case AiocPackage.CONDITION_OPERATOR__LT:
        return isLt();
      case AiocPackage.CONDITION_OPERATOR__LEQ:
        return isLeq();
      case AiocPackage.CONDITION_OPERATOR__EQUAL:
        return isEqual();
      case AiocPackage.CONDITION_OPERATOR__GT:
        return isGt();
      case AiocPackage.CONDITION_OPERATOR__GEQ:
        return isGeq();
      case AiocPackage.CONDITION_OPERATOR__NOT_EQUAL:
        return isNot_equal();
      case AiocPackage.CONDITION_OPERATOR__AND:
        return isAnd();
      case AiocPackage.CONDITION_OPERATOR__OR:
        return isOr();
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
      case AiocPackage.CONDITION_OPERATOR__LT:
        setLt((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__LEQ:
        setLeq((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__EQUAL:
        setEqual((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__GT:
        setGt((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__GEQ:
        setGeq((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__NOT_EQUAL:
        setNot_equal((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__AND:
        setAnd((Boolean)newValue);
        return;
      case AiocPackage.CONDITION_OPERATOR__OR:
        setOr((Boolean)newValue);
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
      case AiocPackage.CONDITION_OPERATOR__LT:
        setLt(LT_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__LEQ:
        setLeq(LEQ_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__EQUAL:
        setEqual(EQUAL_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__GT:
        setGt(GT_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__GEQ:
        setGeq(GEQ_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__NOT_EQUAL:
        setNot_equal(NOT_EQUAL_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__AND:
        setAnd(AND_EDEFAULT);
        return;
      case AiocPackage.CONDITION_OPERATOR__OR:
        setOr(OR_EDEFAULT);
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
      case AiocPackage.CONDITION_OPERATOR__LT:
        return lt != LT_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__LEQ:
        return leq != LEQ_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__EQUAL:
        return equal != EQUAL_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__GT:
        return gt != GT_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__GEQ:
        return geq != GEQ_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__NOT_EQUAL:
        return not_equal != NOT_EQUAL_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__AND:
        return and != AND_EDEFAULT;
      case AiocPackage.CONDITION_OPERATOR__OR:
        return or != OR_EDEFAULT;
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
    result.append(" (lt: ");
    result.append(lt);
    result.append(", leq: ");
    result.append(leq);
    result.append(", equal: ");
    result.append(equal);
    result.append(", gt: ");
    result.append(gt);
    result.append(", geq: ");
    result.append(geq);
    result.append(", not_equal: ");
    result.append(not_equal);
    result.append(", and: ");
    result.append(and);
    result.append(", or: ");
    result.append(or);
    result.append(')');
    return result.toString();
  }

} //ConditionOperatorImpl
