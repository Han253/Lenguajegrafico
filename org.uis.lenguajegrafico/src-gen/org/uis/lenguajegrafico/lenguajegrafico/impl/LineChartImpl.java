/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage;
import org.uis.lenguajegrafico.lenguajegrafico.LineChart;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.impl.LineChartImpl#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineChartImpl extends ChartImpl implements LineChart
{
  /**
   * The cached value of the '{@link #getTuple() <em>Tuple</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuple()
   * @generated
   * @ordered
   */
  protected Tuple2 tuple;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineChartImpl()
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
    return LenguajegraficoPackage.Literals.LINE_CHART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple2 getTuple()
  {
    if (tuple != null && tuple.eIsProxy())
    {
      InternalEObject oldTuple = (InternalEObject)tuple;
      tuple = (Tuple2)eResolveProxy(oldTuple);
      if (tuple != oldTuple)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LenguajegraficoPackage.LINE_CHART__TUPLE, oldTuple, tuple));
      }
    }
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple2 basicGetTuple()
  {
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuple(Tuple2 newTuple)
  {
    Tuple2 oldTuple = tuple;
    tuple = newTuple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajegraficoPackage.LINE_CHART__TUPLE, oldTuple, tuple));
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
      case LenguajegraficoPackage.LINE_CHART__TUPLE:
        if (resolve) return getTuple();
        return basicGetTuple();
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
      case LenguajegraficoPackage.LINE_CHART__TUPLE:
        setTuple((Tuple2)newValue);
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
      case LenguajegraficoPackage.LINE_CHART__TUPLE:
        setTuple((Tuple2)null);
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
      case LenguajegraficoPackage.LINE_CHART__TUPLE:
        return tuple != null;
    }
    return super.eIsSet(featureID);
  }

} //LineChartImpl