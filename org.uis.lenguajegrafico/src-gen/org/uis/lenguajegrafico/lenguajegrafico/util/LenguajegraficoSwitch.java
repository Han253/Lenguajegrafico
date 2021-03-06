/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.lenguajegrafico.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.uis.lenguajegrafico.lenguajegrafico.Area;
import org.uis.lenguajegrafico.lenguajegrafico.BarChart;
import org.uis.lenguajegrafico.lenguajegrafico.CellSize;
import org.uis.lenguajegrafico.lenguajegrafico.Chart;
import org.uis.lenguajegrafico.lenguajegrafico.CodeGeneratedTarget;
import org.uis.lenguajegrafico.lenguajegrafico.Configuration;
import org.uis.lenguajegrafico.lenguajegrafico.DashBoard;
import org.uis.lenguajegrafico.lenguajegrafico.Datatype;
import org.uis.lenguajegrafico.lenguajegrafico.Element;
import org.uis.lenguajegrafico.lenguajegrafico.Hole;
import org.uis.lenguajegrafico.lenguajegrafico.Labelx;
import org.uis.lenguajegrafico.lenguajegrafico.Labely;
import org.uis.lenguajegrafico.lenguajegrafico.Legend;
import org.uis.lenguajegrafico.lenguajegrafico.Lenguajegrafico;
import org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage;
import org.uis.lenguajegrafico.lenguajegrafico.LineChart;
import org.uis.lenguajegrafico.lenguajegrafico.MakerType;
import org.uis.lenguajegrafico.lenguajegrafico.MapChart;
import org.uis.lenguajegrafico.lenguajegrafico.MapType;
import org.uis.lenguajegrafico.lenguajegrafico.NormaliceData;
import org.uis.lenguajegrafico.lenguajegrafico.Orientation;
import org.uis.lenguajegrafico.lenguajegrafico.PieChart;
import org.uis.lenguajegrafico.lenguajegrafico.TableChart;
import org.uis.lenguajegrafico.lenguajegrafico.Text;
import org.uis.lenguajegrafico.lenguajegrafico.Title;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple1;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple2;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple3;
import org.uis.lenguajegrafico.lenguajegrafico.Tuple4;
import org.uis.lenguajegrafico.lenguajegrafico.URL;
import org.uis.lenguajegrafico.lenguajegrafico.ZoomLevel;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.uis.lenguajegrafico.lenguajegrafico.LenguajegraficoPackage
 * @generated
 */
public class LenguajegraficoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LenguajegraficoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LenguajegraficoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LenguajegraficoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LenguajegraficoPackage.LENGUAJEGRAFICO:
      {
        Lenguajegrafico lenguajegrafico = (Lenguajegrafico)theEObject;
        T result = caseLenguajegrafico(lenguajegrafico);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.CHART:
      {
        Chart chart = (Chart)theEObject;
        T result = caseChart(chart);
        if (result == null) result = caseElement(chart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TUPLE:
      {
        Tuple tuple = (Tuple)theEObject;
        T result = caseTuple(tuple);
        if (result == null) result = caseElement(tuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseDatatype(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.NUMBER:
      {
        org.uis.lenguajegrafico.lenguajegrafico.Number number = (org.uis.lenguajegrafico.lenguajegrafico.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseDatatype(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.FLOAT:
      {
        org.uis.lenguajegrafico.lenguajegrafico.Float float_ = (org.uis.lenguajegrafico.lenguajegrafico.Float)theEObject;
        T result = caseFloat(float_);
        if (result == null) result = caseDatatype(float_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.URL:
      {
        URL url = (URL)theEObject;
        T result = caseURL(url);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TITLE:
      {
        Title title = (Title)theEObject;
        T result = caseTitle(title);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.LABELX:
      {
        Labelx labelx = (Labelx)theEObject;
        T result = caseLabelx(labelx);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.LABELY:
      {
        Labely labely = (Labely)theEObject;
        T result = caseLabely(labely);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.LEGEND:
      {
        Legend legend = (Legend)theEObject;
        T result = caseLegend(legend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.HOLE:
      {
        Hole hole = (Hole)theEObject;
        T result = caseHole(hole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.ORIENTATION:
      {
        Orientation orientation = (Orientation)theEObject;
        T result = caseOrientation(orientation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.AREA:
      {
        Area area = (Area)theEObject;
        T result = caseArea(area);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.ZOOM_LEVEL:
      {
        ZoomLevel zoomLevel = (ZoomLevel)theEObject;
        T result = caseZoomLevel(zoomLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.MAKER_TYPE:
      {
        MakerType makerType = (MakerType)theEObject;
        T result = caseMakerType(makerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.MAP_TYPE:
      {
        MapType mapType = (MapType)theEObject;
        T result = caseMapType(mapType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.CELL_SIZE:
      {
        CellSize cellSize = (CellSize)theEObject;
        T result = caseCellSize(cellSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.PIE_CHART:
      {
        PieChart pieChart = (PieChart)theEObject;
        T result = casePieChart(pieChart);
        if (result == null) result = caseChart(pieChart);
        if (result == null) result = caseElement(pieChart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.BAR_CHART:
      {
        BarChart barChart = (BarChart)theEObject;
        T result = caseBarChart(barChart);
        if (result == null) result = caseChart(barChart);
        if (result == null) result = caseElement(barChart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.LINE_CHART:
      {
        LineChart lineChart = (LineChart)theEObject;
        T result = caseLineChart(lineChart);
        if (result == null) result = caseChart(lineChart);
        if (result == null) result = caseElement(lineChart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.MAP_CHART:
      {
        MapChart mapChart = (MapChart)theEObject;
        T result = caseMapChart(mapChart);
        if (result == null) result = caseChart(mapChart);
        if (result == null) result = caseElement(mapChart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TABLE_CHART:
      {
        TableChart tableChart = (TableChart)theEObject;
        T result = caseTableChart(tableChart);
        if (result == null) result = caseChart(tableChart);
        if (result == null) result = caseElement(tableChart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.DASH_BOARD:
      {
        DashBoard dashBoard = (DashBoard)theEObject;
        T result = caseDashBoard(dashBoard);
        if (result == null) result = caseElement(dashBoard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TUPLE1:
      {
        Tuple1 tuple1 = (Tuple1)theEObject;
        T result = caseTuple1(tuple1);
        if (result == null) result = caseTuple(tuple1);
        if (result == null) result = caseElement(tuple1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TUPLE2:
      {
        Tuple2 tuple2 = (Tuple2)theEObject;
        T result = caseTuple2(tuple2);
        if (result == null) result = caseTuple(tuple2);
        if (result == null) result = caseElement(tuple2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TUPLE3:
      {
        Tuple3 tuple3 = (Tuple3)theEObject;
        T result = caseTuple3(tuple3);
        if (result == null) result = caseTuple(tuple3);
        if (result == null) result = caseElement(tuple3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.TUPLE4:
      {
        Tuple4 tuple4 = (Tuple4)theEObject;
        T result = caseTuple4(tuple4);
        if (result == null) result = caseTuple(tuple4);
        if (result == null) result = caseElement(tuple4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = caseElement(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.CODE_GENERATED_TARGET:
      {
        CodeGeneratedTarget codeGeneratedTarget = (CodeGeneratedTarget)theEObject;
        T result = caseCodeGeneratedTarget(codeGeneratedTarget);
        if (result == null) result = caseConfiguration(codeGeneratedTarget);
        if (result == null) result = caseElement(codeGeneratedTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LenguajegraficoPackage.NORMALICE_DATA:
      {
        NormaliceData normaliceData = (NormaliceData)theEObject;
        T result = caseNormaliceData(normaliceData);
        if (result == null) result = caseConfiguration(normaliceData);
        if (result == null) result = caseElement(normaliceData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lenguajegrafico</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lenguajegrafico</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLenguajegrafico(Lenguajegrafico object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatatype(Datatype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChart(Chart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple(Tuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.uis.lenguajegrafico.lenguajegrafico.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloat(org.uis.lenguajegrafico.lenguajegrafico.Float object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURL(URL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitle(Title object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labelx</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labelx</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelx(Labelx object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labely</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labely</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabely(Labely object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Legend</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Legend</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLegend(Legend object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hole</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hole</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHole(Hole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orientation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orientation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrientation(Orientation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Area</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArea(Area object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zoom Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zoom Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZoomLevel(ZoomLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maker Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maker Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMakerType(MakerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapType(MapType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellSize(CellSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pie Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pie Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePieChart(PieChart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bar Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bar Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBarChart(BarChart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineChart(LineChart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapChart(MapChart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableChart(TableChart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dash Board</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dash Board</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDashBoard(DashBoard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple1(Tuple1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple2(Tuple2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple3(Tuple3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple4(Tuple4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Generated Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Generated Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeGeneratedTarget(CodeGeneratedTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normalice Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normalice Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormaliceData(NormaliceData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LenguajegraficoSwitch
