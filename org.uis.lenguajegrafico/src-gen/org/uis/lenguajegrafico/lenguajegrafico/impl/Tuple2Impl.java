/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.uis.lenguajegrafico.lenguajegrafico.Datatype;
import org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.impl.Tuple2Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.uis.lenguajegrafico.lenguajegrafico.impl.Tuple2Impl#getValue2 <em>Value2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tuple2Impl extends TupleImpl implements Tuple2
{
  /**
   * The cached value of the '{@link #getValue1() <em>Value1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected Datatype value1;

  /**
   * The cached value of the '{@link #getValue2() <em>Value2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue2()
   * @generated
   * @ordered
   */
  protected EList<org.uis.lenguajegrafico.lenguajegrafico.Number> value2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Tuple2Impl()
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
    return LenguajegraficoPackage.Literals.TUPLE2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype getValue1()
  {
    return value1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue1(Datatype newValue1, NotificationChain msgs)
  {
    Datatype oldValue1 = value1;
    value1 = newValue1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LenguajegraficoPackage.TUPLE2__VALUE1, oldValue1, newValue1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue1(Datatype newValue1)
  {
    if (newValue1 != value1)
    {
      NotificationChain msgs = null;
      if (value1 != null)
        msgs = ((InternalEObject)value1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LenguajegraficoPackage.TUPLE2__VALUE1, null, msgs);
      if (newValue1 != null)
        msgs = ((InternalEObject)newValue1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LenguajegraficoPackage.TUPLE2__VALUE1, null, msgs);
      msgs = basicSetValue1(newValue1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LenguajegraficoPackage.TUPLE2__VALUE1, newValue1, newValue1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.uis.lenguajegrafico.lenguajegrafico.Number> getValue2()
  {
    if (value2 == null)
    {
      value2 = new EObjectContainmentEList<org.uis.lenguajegrafico.lenguajegrafico.Number>(org.uis.lenguajegrafico.lenguajegrafico.Number.class, this, LenguajegraficoPackage.TUPLE2__VALUE2);
    }
    return value2;
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
      case LenguajegraficoPackage.TUPLE2__VALUE1:
        return basicSetValue1(null, msgs);
      case LenguajegraficoPackage.TUPLE2__VALUE2:
        return ((InternalEList<?>)getValue2()).basicRemove(otherEnd, msgs);
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
      case LenguajegraficoPackage.TUPLE2__VALUE1:
        return getValue1();
      case LenguajegraficoPackage.TUPLE2__VALUE2:
        return getValue2();
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
      case LenguajegraficoPackage.TUPLE2__VALUE1:
        setValue1((Datatype)newValue);
        return;
      case LenguajegraficoPackage.TUPLE2__VALUE2:
        getValue2().clear();
        getValue2().addAll((Collection<? extends org.uis.lenguajegrafico.lenguajegrafico.Number>)newValue);
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
      case LenguajegraficoPackage.TUPLE2__VALUE1:
        setValue1((Datatype)null);
        return;
      case LenguajegraficoPackage.TUPLE2__VALUE2:
        getValue2().clear();
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
      case LenguajegraficoPackage.TUPLE2__VALUE1:
        return value1 != null;
      case LenguajegraficoPackage.TUPLE2__VALUE2:
        return value2 != null && !value2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Tuple2Impl