/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple3#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple3#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple3#getValue3 <em>Value3</em>}</li>
 * </ul>
 *
 * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getTuple3()
 * @model
 * @generated
 */
public interface Tuple3 extends Tuple
{
  /**
   * Returns the value of the '<em><b>Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value1</em>' containment reference.
   * @see #setValue1(org.uis.lenguajegrafico.lenguajegrafico.Float)
   * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getTuple3_Value1()
   * @model containment="true"
   * @generated
   */
  org.uis.lenguajegrafico.lenguajegrafico.Float getValue1();

  /**
   * Sets the value of the '{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple3#getValue1 <em>Value1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value1</em>' containment reference.
   * @see #getValue1()
   * @generated
   */
  void setValue1(org.uis.lenguajegrafico.lenguajegrafico.Float value);

  /**
   * Returns the value of the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value2</em>' containment reference.
   * @see #setValue2(org.uis.lenguajegrafico.lenguajegrafico.Float)
   * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getTuple3_Value2()
   * @model containment="true"
   * @generated
   */
  org.uis.lenguajegrafico.lenguajegrafico.Float getValue2();

  /**
   * Sets the value of the '{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple3#getValue2 <em>Value2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value2</em>' containment reference.
   * @see #getValue2()
   * @generated
   */
  void setValue2(org.uis.lenguajegrafico.lenguajegrafico.Float value);

  /**
   * Returns the value of the '<em><b>Value3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value3</em>' containment reference.
   * @see #setValue3(Datatype)
   * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage#getTuple3_Value3()
   * @model containment="true"
   * @generated
   */
  Datatype getValue3();

  /**
   * Sets the value of the '{@link org.uis.lenguajegrafico.lenguajegrafico.Tuple3#getValue3 <em>Value3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value3</em>' containment reference.
   * @see #getValue3()
   * @generated
   */
  void setValue3(Datatype value);

} // Tuple3