/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple4#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getTuple4()
 * @model
 * @generated
 */
public interface Tuple4 extends Tuple
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.uis.lenguajegrafico.lenguajegrafico.Datatype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getTuple4_Values()
   * @model containment="true"
   * @generated
   */
  EList<Datatype> getValues();

} // Tuple4
