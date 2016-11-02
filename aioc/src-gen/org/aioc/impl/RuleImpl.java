/**
 */
package org.aioc.impl;

import java.util.Collection;

import org.aioc.AiocPackage;
import org.aioc.Choreography;
import org.aioc.FunctionLocation;
import org.aioc.LocationDefinition;
import org.aioc.Rule;
import org.aioc.Where;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.RuleImpl#getLocDefinition <em>Loc Definition</em>}</li>
 *   <li>{@link org.aioc.impl.RuleImpl#getFunctionLocation <em>Function Location</em>}</li>
 *   <li>{@link org.aioc.impl.RuleImpl#getNewRoles <em>New Roles</em>}</li>
 *   <li>{@link org.aioc.impl.RuleImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.aioc.impl.RuleImpl#getChoreography <em>Choreography</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
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
   * The cached value of the '{@link #getFunctionLocation() <em>Function Location</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionLocation()
   * @generated
   * @ordered
   */
  protected EList<FunctionLocation> functionLocation;

  /**
   * The cached value of the '{@link #getNewRoles() <em>New Roles</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewRoles()
   * @generated
   * @ordered
   */
  protected EList<String> newRoles;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected Where where;

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
  protected RuleImpl()
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
    return AiocPackage.Literals.RULE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.RULE__LOC_DEFINITION, oldLocDefinition, newLocDefinition);
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
        msgs = ((InternalEObject)locDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.RULE__LOC_DEFINITION, null, msgs);
      if (newLocDefinition != null)
        msgs = ((InternalEObject)newLocDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.RULE__LOC_DEFINITION, null, msgs);
      msgs = basicSetLocDefinition(newLocDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.RULE__LOC_DEFINITION, newLocDefinition, newLocDefinition));
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
      functionLocation = new EObjectContainmentEList<FunctionLocation>(FunctionLocation.class, this, AiocPackage.RULE__FUNCTION_LOCATION);
    }
    return functionLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNewRoles()
  {
    if (newRoles == null)
    {
      newRoles = new EDataTypeEList<String>(String.class, this, AiocPackage.RULE__NEW_ROLES);
    }
    return newRoles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Where getWhere()
  {
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs)
  {
    Where oldWhere = where;
    where = newWhere;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.RULE__WHERE, oldWhere, newWhere);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhere(Where newWhere)
  {
    if (newWhere != where)
    {
      NotificationChain msgs = null;
      if (where != null)
        msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.RULE__WHERE, null, msgs);
      if (newWhere != null)
        msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.RULE__WHERE, null, msgs);
      msgs = basicSetWhere(newWhere, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.RULE__WHERE, newWhere, newWhere));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.RULE__CHOREOGRAPHY, oldChoreography, newChoreography);
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
        msgs = ((InternalEObject)choreography).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.RULE__CHOREOGRAPHY, null, msgs);
      if (newChoreography != null)
        msgs = ((InternalEObject)newChoreography).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.RULE__CHOREOGRAPHY, null, msgs);
      msgs = basicSetChoreography(newChoreography, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.RULE__CHOREOGRAPHY, newChoreography, newChoreography));
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
      case AiocPackage.RULE__LOC_DEFINITION:
        return basicSetLocDefinition(null, msgs);
      case AiocPackage.RULE__FUNCTION_LOCATION:
        return ((InternalEList<?>)getFunctionLocation()).basicRemove(otherEnd, msgs);
      case AiocPackage.RULE__WHERE:
        return basicSetWhere(null, msgs);
      case AiocPackage.RULE__CHOREOGRAPHY:
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
      case AiocPackage.RULE__LOC_DEFINITION:
        return getLocDefinition();
      case AiocPackage.RULE__FUNCTION_LOCATION:
        return getFunctionLocation();
      case AiocPackage.RULE__NEW_ROLES:
        return getNewRoles();
      case AiocPackage.RULE__WHERE:
        return getWhere();
      case AiocPackage.RULE__CHOREOGRAPHY:
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
      case AiocPackage.RULE__LOC_DEFINITION:
        setLocDefinition((LocationDefinition)newValue);
        return;
      case AiocPackage.RULE__FUNCTION_LOCATION:
        getFunctionLocation().clear();
        getFunctionLocation().addAll((Collection<? extends FunctionLocation>)newValue);
        return;
      case AiocPackage.RULE__NEW_ROLES:
        getNewRoles().clear();
        getNewRoles().addAll((Collection<? extends String>)newValue);
        return;
      case AiocPackage.RULE__WHERE:
        setWhere((Where)newValue);
        return;
      case AiocPackage.RULE__CHOREOGRAPHY:
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
      case AiocPackage.RULE__LOC_DEFINITION:
        setLocDefinition((LocationDefinition)null);
        return;
      case AiocPackage.RULE__FUNCTION_LOCATION:
        getFunctionLocation().clear();
        return;
      case AiocPackage.RULE__NEW_ROLES:
        getNewRoles().clear();
        return;
      case AiocPackage.RULE__WHERE:
        setWhere((Where)null);
        return;
      case AiocPackage.RULE__CHOREOGRAPHY:
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
      case AiocPackage.RULE__LOC_DEFINITION:
        return locDefinition != null;
      case AiocPackage.RULE__FUNCTION_LOCATION:
        return functionLocation != null && !functionLocation.isEmpty();
      case AiocPackage.RULE__NEW_ROLES:
        return newRoles != null && !newRoles.isEmpty();
      case AiocPackage.RULE__WHERE:
        return where != null;
      case AiocPackage.RULE__CHOREOGRAPHY:
        return choreography != null;
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
    result.append(" (newRoles: ");
    result.append(newRoles);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
