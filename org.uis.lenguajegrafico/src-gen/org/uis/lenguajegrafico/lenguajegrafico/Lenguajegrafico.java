/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lenguajegrafico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.Lenguajegrafico#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getLenguajegrafico()
 * @model
 * @generated
 */
public interface Lenguajegrafico extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.uis.lenguajegrafico.lenguajegrafico.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getLenguajegrafico_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Lenguajegrafico