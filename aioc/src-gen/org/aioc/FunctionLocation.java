/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.FunctionLocation#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.aioc.FunctionLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link org.aioc.FunctionLocation#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getFunctionLocation()
 * @model
 * @generated
 */
public interface FunctionLocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference.
   * @see #setFunctions(FunctionList)
   * @see org.aioc.AiocPackage#getFunctionLocation_Functions()
   * @model containment="true"
   * @generated
   */
  FunctionList getFunctions();

  /**
   * Sets the value of the '{@link org.aioc.FunctionLocation#getFunctions <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functions</em>' containment reference.
   * @see #getFunctions()
   * @generated
   */
  void setFunctions(FunctionList value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.aioc.AiocPackage#getFunctionLocation_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.aioc.FunctionLocation#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' attribute.
   * @see #setProtocol(String)
   * @see org.aioc.AiocPackage#getFunctionLocation_Protocol()
   * @model
   * @generated
   */
  String getProtocol();

  /**
   * Sets the value of the '{@link org.aioc.FunctionLocation#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(String value);

} // FunctionLocation
