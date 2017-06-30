/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.uis.lenguajegrafico.ide.contentassist.antlr.internal.InternalLenguajegraficoParser;
import org.uis.lenguajegrafico.services.LenguajegraficoGrammarAccess;

public class LenguajegraficoParser extends AbstractContentAssistParser {

	@Inject
	private LenguajegraficoGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLenguajegraficoParser createParser() {
		InternalLenguajegraficoParser result = new InternalLenguajegraficoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getDatatypeAccess().getAlternatives(), "rule__Datatype__Alternatives");
					put(grammarAccess.getChartAccess().getAlternatives(), "rule__Chart__Alternatives");
					put(grammarAccess.getTupleAccess().getAlternatives(), "rule__Tuple__Alternatives");
					put(grammarAccess.getLegendAccess().getValueAlternatives_2_0(), "rule__Legend__ValueAlternatives_2_0");
					put(grammarAccess.getHoleAccess().getValueAlternatives_2_0(), "rule__Hole__ValueAlternatives_2_0");
					put(grammarAccess.getOrientationAccess().getValueAlternatives_2_0(), "rule__Orientation__ValueAlternatives_2_0");
					put(grammarAccess.getAreaAccess().getValueAlternatives_2_0(), "rule__Area__ValueAlternatives_2_0");
					put(grammarAccess.getMakerTypeAccess().getValueAlternatives_2_0(), "rule__MakerType__ValueAlternatives_2_0");
					put(grammarAccess.getMapTypeAccess().getValueAlternatives_2_0(), "rule__MapType__ValueAlternatives_2_0");
					put(grammarAccess.getCellSizeAccess().getValueAlternatives_2_0(), "rule__CellSize__ValueAlternatives_2_0");
					put(grammarAccess.getPieChartAccess().getFeaturesAlternatives_4_0(), "rule__PieChart__FeaturesAlternatives_4_0");
					put(grammarAccess.getBarChartAccess().getFeaturesAlternatives_4_0(), "rule__BarChart__FeaturesAlternatives_4_0");
					put(grammarAccess.getLineChartAccess().getFeaturesAlternatives_4_0(), "rule__LineChart__FeaturesAlternatives_4_0");
					put(grammarAccess.getMapChartAccess().getFeaturesAlternatives_4_0(), "rule__MapChart__FeaturesAlternatives_4_0");
					put(grammarAccess.getTableChartAccess().getFeaturesAlternatives_4_0(), "rule__TableChart__FeaturesAlternatives_4_0");
					put(grammarAccess.getTuple2Access().getValue1Alternatives_4_0(), "rule__Tuple2__Value1Alternatives_4_0");
					put(grammarAccess.getTuple3Access().getValue3Alternatives_6_0(), "rule__Tuple3__Value3Alternatives_6_0");
					put(grammarAccess.getConfigurationAccess().getAlternatives(), "rule__Configuration__Alternatives");
					put(grammarAccess.getCodeGeneratedTargetAccess().getValueAlternatives_2_0(), "rule__CodeGeneratedTarget__ValueAlternatives_2_0");
					put(grammarAccess.getNormaliceDataAccess().getValueAlternatives_2_0(), "rule__NormaliceData__ValueAlternatives_2_0");
					put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
					put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
					put(grammarAccess.getFloatAccess().getGroup(), "rule__Float__Group__0");
					put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
					put(grammarAccess.getTitleAccess().getGroup(), "rule__Title__Group__0");
					put(grammarAccess.getLabelxAccess().getGroup(), "rule__Labelx__Group__0");
					put(grammarAccess.getLabelyAccess().getGroup(), "rule__Labely__Group__0");
					put(grammarAccess.getLegendAccess().getGroup(), "rule__Legend__Group__0");
					put(grammarAccess.getHoleAccess().getGroup(), "rule__Hole__Group__0");
					put(grammarAccess.getOrientationAccess().getGroup(), "rule__Orientation__Group__0");
					put(grammarAccess.getAreaAccess().getGroup(), "rule__Area__Group__0");
					put(grammarAccess.getZoomLevelAccess().getGroup(), "rule__ZoomLevel__Group__0");
					put(grammarAccess.getMakerTypeAccess().getGroup(), "rule__MakerType__Group__0");
					put(grammarAccess.getMapTypeAccess().getGroup(), "rule__MapType__Group__0");
					put(grammarAccess.getCellSizeAccess().getGroup(), "rule__CellSize__Group__0");
					put(grammarAccess.getPieChartAccess().getGroup(), "rule__PieChart__Group__0");
					put(grammarAccess.getBarChartAccess().getGroup(), "rule__BarChart__Group__0");
					put(grammarAccess.getLineChartAccess().getGroup(), "rule__LineChart__Group__0");
					put(grammarAccess.getMapChartAccess().getGroup(), "rule__MapChart__Group__0");
					put(grammarAccess.getTableChartAccess().getGroup(), "rule__TableChart__Group__0");
					put(grammarAccess.getDashBoardAccess().getGroup(), "rule__DashBoard__Group__0");
					put(grammarAccess.getTuple1Access().getGroup(), "rule__Tuple1__Group__0");
					put(grammarAccess.getTuple2Access().getGroup(), "rule__Tuple2__Group__0");
					put(grammarAccess.getTuple3Access().getGroup(), "rule__Tuple3__Group__0");
					put(grammarAccess.getTuple4Access().getGroup(), "rule__Tuple4__Group__0");
					put(grammarAccess.getCodeGeneratedTargetAccess().getGroup(), "rule__CodeGeneratedTarget__Group__0");
					put(grammarAccess.getNormaliceDataAccess().getGroup(), "rule__NormaliceData__Group__0");
					put(grammarAccess.getLenguajegraficoAccess().getElementsAssignment(), "rule__Lenguajegrafico__ElementsAssignment");
					put(grammarAccess.getTextAccess().getNameAssignment_1(), "rule__Text__NameAssignment_1");
					put(grammarAccess.getNumberAccess().getNameAssignment_1(), "rule__Number__NameAssignment_1");
					put(grammarAccess.getFloatAccess().getNameAssignment_1(), "rule__Float__NameAssignment_1");
					put(grammarAccess.getURLAccess().getValueAssignment_2(), "rule__URL__ValueAssignment_2");
					put(grammarAccess.getTitleAccess().getValueAssignment_2(), "rule__Title__ValueAssignment_2");
					put(grammarAccess.getLabelxAccess().getValueAssignment_2(), "rule__Labelx__ValueAssignment_2");
					put(grammarAccess.getLabelyAccess().getValueAssignment_2(), "rule__Labely__ValueAssignment_2");
					put(grammarAccess.getLegendAccess().getValueAssignment_2(), "rule__Legend__ValueAssignment_2");
					put(grammarAccess.getHoleAccess().getValueAssignment_2(), "rule__Hole__ValueAssignment_2");
					put(grammarAccess.getOrientationAccess().getValueAssignment_2(), "rule__Orientation__ValueAssignment_2");
					put(grammarAccess.getAreaAccess().getValueAssignment_2(), "rule__Area__ValueAssignment_2");
					put(grammarAccess.getZoomLevelAccess().getValueAssignment_2(), "rule__ZoomLevel__ValueAssignment_2");
					put(grammarAccess.getMakerTypeAccess().getValueAssignment_2(), "rule__MakerType__ValueAssignment_2");
					put(grammarAccess.getMapTypeAccess().getValueAssignment_2(), "rule__MapType__ValueAssignment_2");
					put(grammarAccess.getCellSizeAccess().getValueAssignment_2(), "rule__CellSize__ValueAssignment_2");
					put(grammarAccess.getPieChartAccess().getNameAssignment_1(), "rule__PieChart__NameAssignment_1");
					put(grammarAccess.getPieChartAccess().getTupleAssignment_3(), "rule__PieChart__TupleAssignment_3");
					put(grammarAccess.getPieChartAccess().getFeaturesAssignment_4(), "rule__PieChart__FeaturesAssignment_4");
					put(grammarAccess.getBarChartAccess().getNameAssignment_1(), "rule__BarChart__NameAssignment_1");
					put(grammarAccess.getBarChartAccess().getTupleAssignment_3(), "rule__BarChart__TupleAssignment_3");
					put(grammarAccess.getBarChartAccess().getFeaturesAssignment_4(), "rule__BarChart__FeaturesAssignment_4");
					put(grammarAccess.getLineChartAccess().getNameAssignment_1(), "rule__LineChart__NameAssignment_1");
					put(grammarAccess.getLineChartAccess().getTupleAssignment_3(), "rule__LineChart__TupleAssignment_3");
					put(grammarAccess.getLineChartAccess().getFeaturesAssignment_4(), "rule__LineChart__FeaturesAssignment_4");
					put(grammarAccess.getMapChartAccess().getNameAssignment_1(), "rule__MapChart__NameAssignment_1");
					put(grammarAccess.getMapChartAccess().getTupleAssignment_3(), "rule__MapChart__TupleAssignment_3");
					put(grammarAccess.getMapChartAccess().getFeaturesAssignment_4(), "rule__MapChart__FeaturesAssignment_4");
					put(grammarAccess.getTableChartAccess().getNameAssignment_1(), "rule__TableChart__NameAssignment_1");
					put(grammarAccess.getTableChartAccess().getTupleAssignment_3(), "rule__TableChart__TupleAssignment_3");
					put(grammarAccess.getTableChartAccess().getFeaturesAssignment_4(), "rule__TableChart__FeaturesAssignment_4");
					put(grammarAccess.getDashBoardAccess().getNameAssignment_1(), "rule__DashBoard__NameAssignment_1");
					put(grammarAccess.getDashBoardAccess().getChartsAssignment_3(), "rule__DashBoard__ChartsAssignment_3");
					put(grammarAccess.getDashBoardAccess().getFeaturesAssignment_4(), "rule__DashBoard__FeaturesAssignment_4");
					put(grammarAccess.getTuple1Access().getNameAssignment_1(), "rule__Tuple1__NameAssignment_1");
					put(grammarAccess.getTuple1Access().getUrlAssignment_3(), "rule__Tuple1__UrlAssignment_3");
					put(grammarAccess.getTuple1Access().getValue1Assignment_4(), "rule__Tuple1__Value1Assignment_4");
					put(grammarAccess.getTuple1Access().getValue2Assignment_5(), "rule__Tuple1__Value2Assignment_5");
					put(grammarAccess.getTuple2Access().getNameAssignment_1(), "rule__Tuple2__NameAssignment_1");
					put(grammarAccess.getTuple2Access().getUrlAssignment_3(), "rule__Tuple2__UrlAssignment_3");
					put(grammarAccess.getTuple2Access().getValue1Assignment_4(), "rule__Tuple2__Value1Assignment_4");
					put(grammarAccess.getTuple2Access().getValue2Assignment_5(), "rule__Tuple2__Value2Assignment_5");
					put(grammarAccess.getTuple3Access().getNameAssignment_1(), "rule__Tuple3__NameAssignment_1");
					put(grammarAccess.getTuple3Access().getUrlAssignment_3(), "rule__Tuple3__UrlAssignment_3");
					put(grammarAccess.getTuple3Access().getValue1Assignment_4(), "rule__Tuple3__Value1Assignment_4");
					put(grammarAccess.getTuple3Access().getValue2Assignment_5(), "rule__Tuple3__Value2Assignment_5");
					put(grammarAccess.getTuple3Access().getValue3Assignment_6(), "rule__Tuple3__Value3Assignment_6");
					put(grammarAccess.getTuple4Access().getNameAssignment_1(), "rule__Tuple4__NameAssignment_1");
					put(grammarAccess.getTuple4Access().getUrlAssignment_3(), "rule__Tuple4__UrlAssignment_3");
					put(grammarAccess.getTuple4Access().getValuesAssignment_4(), "rule__Tuple4__ValuesAssignment_4");
					put(grammarAccess.getCodeGeneratedTargetAccess().getValueAssignment_2(), "rule__CodeGeneratedTarget__ValueAssignment_2");
					put(grammarAccess.getNormaliceDataAccess().getValueAssignment_2(), "rule__NormaliceData__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LenguajegraficoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LenguajegraficoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
