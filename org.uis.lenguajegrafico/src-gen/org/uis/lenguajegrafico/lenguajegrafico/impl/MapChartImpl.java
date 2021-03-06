/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage;
import org.uis.lenguajegrafico.lenguajegrafico.MapChart;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.impl.MapChartImpl#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapChartImpl extends ChartImpl implements MapChart
{
  /**
   * The cached value of the '{@link #getTuple() <em>Tuple</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuple()
   * @generated
   * @ordered
   */
  protected Tuple3 tuple;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapChartImpl()
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
    return LenguajegraficoPackage.Literals.MAP_CHART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple3 getTuple()
  {
    if (tuple != null && tuple.eIsProxy())
    {
      InternalEObject oldTuple = (InternalEObject)tuple;
      tuple = (Tuple3)eResolveProxy(oldTuple);
      if (tuple != oldTuple)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LenguajegraficoPackage.MAP_CHART__TUPLE, oldTuple, tuple));
      }
    }
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple3 basicGetTuple()
  {
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuple(Tuple3 newTuple)
  {
    Tuple3 oldTuple = tuple;
    tuple = newTuple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajegraficoPackage.MAP_CHART__TUPLE, oldTuple, tuple));
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
      case LenguajegraficoPackage.MAP_CHART__TUPLE:
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
      case LenguajegraficoPackage.MAP_CHART__TUPLE:
        setTuple((Tuple3)newValue);
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
      case LenguajegraficoPackage.MAP_CHART__TUPLE:
        setTuple((Tuple3)null);
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
      case LenguajegraficoPackage.MAP_CHART__TUPLE:
        return tuple != null;
    }
    return super.eIsSet(featureID);
  }

} //MapChartImpl
