/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.MapChart#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getMapChart()
 * @model
 * @generated
 */
public interface MapChart extends Chart
{
  /**
   * Returns the value of the '<em><b>Tuple</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuple</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple</em>' reference.
   * @see #setTuple(Tuple3)
   * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getMapChart_Tuple()
   * @model
   * @generated
   */
  Tuple3 getTuple();

  /**
   * Sets the value of the '{@link org.uis.lenguajegrafico.lenguajegrafico.MapChart#getTuple <em>Tuple</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuple</em>' reference.
   * @see #getTuple()
   * @generated
   */
  void setTuple(Tuple3 value);

} // MapChart
