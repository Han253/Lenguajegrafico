package org.uis.lenguajegrafico.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uis.lenguajegrafico.services.LenguajegraficoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLenguajegraficoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Number'", "'Float'", "'URL'", "'='", "'Title'", "'Label_x'", "'Label_y'", "'Legend'", "'.'", "'True'", "'False'", "'Hole'", "'Orientation'", "'Horizontal'", "'Vertical'", "'Area'", "'ZoomLevel'", "'MakerType'", "'Normal'", "'Group'", "'MagnitudeCircle'", "'MapType'", "'general'", "'roadmap'", "'terrain'", "'satellite'", "'hybrid'", "'CellSize'", "'1x1'", "'1x2'", "'1x3'", "'2x1'", "'2x2'", "'3x3'", "'PieChart'", "'{'", "'}'", "'BarChart'", "'LineChart'", "'MapChart'", "'TableChart'", "'DashBoard'", "'Tuple1'", "'Tuple2'", "'Tuple3'", "'Tuple4'", "'CodeGeneratedTarget'", "'All'", "'Web'", "'Python'", "'NormaliceData'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLenguajegraficoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLenguajegraficoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLenguajegraficoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLenguajegrafico.g"; }



     	private LenguajegraficoGrammarAccess grammarAccess;

        public InternalLenguajegraficoParser(TokenStream input, LenguajegraficoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Lenguajegrafico";
       	}

       	@Override
       	protected LenguajegraficoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLenguajegrafico"
    // InternalLenguajegrafico.g:64:1: entryRuleLenguajegrafico returns [EObject current=null] : iv_ruleLenguajegrafico= ruleLenguajegrafico EOF ;
    public final EObject entryRuleLenguajegrafico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLenguajegrafico = null;


        try {
            // InternalLenguajegrafico.g:64:56: (iv_ruleLenguajegrafico= ruleLenguajegrafico EOF )
            // InternalLenguajegrafico.g:65:2: iv_ruleLenguajegrafico= ruleLenguajegrafico EOF
            {
             newCompositeNode(grammarAccess.getLenguajegraficoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLenguajegrafico=ruleLenguajegrafico();

            state._fsp--;

             current =iv_ruleLenguajegrafico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLenguajegrafico"


    // $ANTLR start "ruleLenguajegrafico"
    // InternalLenguajegrafico.g:71:1: ruleLenguajegrafico returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleLenguajegrafico() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalLenguajegrafico.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalLenguajegrafico.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==46||(LA1_0>=49 && LA1_0<=58)||LA1_0==62) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLenguajegrafico.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalLenguajegrafico.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalLenguajegrafico.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getLenguajegraficoAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLenguajegraficoRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.uis.lenguajegrafico.Lenguajegrafico.Element");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLenguajegrafico"


    // $ANTLR start "entryRuleElement"
    // InternalLenguajegrafico.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalLenguajegrafico.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalLenguajegrafico.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalLenguajegrafico.g:107:1: ruleElement returns [EObject current=null] : (this_Chart_0= ruleChart | this_Tuple_1= ruleTuple | this_DashBoard_2= ruleDashBoard | this_Configuration_3= ruleConfiguration ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Chart_0 = null;

        EObject this_Tuple_1 = null;

        EObject this_DashBoard_2 = null;

        EObject this_Configuration_3 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:113:2: ( (this_Chart_0= ruleChart | this_Tuple_1= ruleTuple | this_DashBoard_2= ruleDashBoard | this_Configuration_3= ruleConfiguration ) )
            // InternalLenguajegrafico.g:114:2: (this_Chart_0= ruleChart | this_Tuple_1= ruleTuple | this_DashBoard_2= ruleDashBoard | this_Configuration_3= ruleConfiguration )
            {
            // InternalLenguajegrafico.g:114:2: (this_Chart_0= ruleChart | this_Tuple_1= ruleTuple | this_DashBoard_2= ruleDashBoard | this_Configuration_3= ruleConfiguration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 46:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt2=1;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt2=2;
                }
                break;
            case 53:
                {
                alt2=3;
                }
                break;
            case 58:
            case 62:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLenguajegrafico.g:115:3: this_Chart_0= ruleChart
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getChartParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chart_0=ruleChart();

                    state._fsp--;


                    			current = this_Chart_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:124:3: this_Tuple_1= ruleTuple
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTupleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tuple_1=ruleTuple();

                    state._fsp--;


                    			current = this_Tuple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:133:3: this_DashBoard_2= ruleDashBoard
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDashBoardParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DashBoard_2=ruleDashBoard();

                    state._fsp--;


                    			current = this_DashBoard_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:142:3: this_Configuration_3= ruleConfiguration
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getConfigurationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Configuration_3=ruleConfiguration();

                    state._fsp--;


                    			current = this_Configuration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDatatype"
    // InternalLenguajegrafico.g:154:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalLenguajegrafico.g:154:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalLenguajegrafico.g:155:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalLenguajegrafico.g:161:1: ruleDatatype returns [EObject current=null] : (this_Text_0= ruleText | this_Number_1= ruleNumber | this_Float_2= ruleFloat ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Number_1 = null;

        EObject this_Float_2 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:167:2: ( (this_Text_0= ruleText | this_Number_1= ruleNumber | this_Float_2= ruleFloat ) )
            // InternalLenguajegrafico.g:168:2: (this_Text_0= ruleText | this_Number_1= ruleNumber | this_Float_2= ruleFloat )
            {
            // InternalLenguajegrafico.g:168:2: (this_Text_0= ruleText | this_Number_1= ruleNumber | this_Float_2= ruleFloat )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLenguajegrafico.g:169:3: this_Text_0= ruleText
                    {

                    			newCompositeNode(grammarAccess.getDatatypeAccess().getTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_0=ruleText();

                    state._fsp--;


                    			current = this_Text_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:178:3: this_Number_1= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getDatatypeAccess().getNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                    			current = this_Number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:187:3: this_Float_2= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getDatatypeAccess().getFloatParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_2=ruleFloat();

                    state._fsp--;


                    			current = this_Float_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleChart"
    // InternalLenguajegrafico.g:199:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // InternalLenguajegrafico.g:199:46: (iv_ruleChart= ruleChart EOF )
            // InternalLenguajegrafico.g:200:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalLenguajegrafico.g:206:1: ruleChart returns [EObject current=null] : (this_PieChart_0= rulePieChart | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_MapChart_3= ruleMapChart | this_TableChart_4= ruleTableChart ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        EObject this_PieChart_0 = null;

        EObject this_LineChart_1 = null;

        EObject this_BarChart_2 = null;

        EObject this_MapChart_3 = null;

        EObject this_TableChart_4 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:212:2: ( (this_PieChart_0= rulePieChart | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_MapChart_3= ruleMapChart | this_TableChart_4= ruleTableChart ) )
            // InternalLenguajegrafico.g:213:2: (this_PieChart_0= rulePieChart | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_MapChart_3= ruleMapChart | this_TableChart_4= ruleTableChart )
            {
            // InternalLenguajegrafico.g:213:2: (this_PieChart_0= rulePieChart | this_LineChart_1= ruleLineChart | this_BarChart_2= ruleBarChart | this_MapChart_3= ruleMapChart | this_TableChart_4= ruleTableChart )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt4=1;
                }
                break;
            case 50:
                {
                alt4=2;
                }
                break;
            case 49:
                {
                alt4=3;
                }
                break;
            case 51:
                {
                alt4=4;
                }
                break;
            case 52:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLenguajegrafico.g:214:3: this_PieChart_0= rulePieChart
                    {

                    			newCompositeNode(grammarAccess.getChartAccess().getPieChartParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PieChart_0=rulePieChart();

                    state._fsp--;


                    			current = this_PieChart_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:223:3: this_LineChart_1= ruleLineChart
                    {

                    			newCompositeNode(grammarAccess.getChartAccess().getLineChartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LineChart_1=ruleLineChart();

                    state._fsp--;


                    			current = this_LineChart_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:232:3: this_BarChart_2= ruleBarChart
                    {

                    			newCompositeNode(grammarAccess.getChartAccess().getBarChartParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BarChart_2=ruleBarChart();

                    state._fsp--;


                    			current = this_BarChart_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:241:3: this_MapChart_3= ruleMapChart
                    {

                    			newCompositeNode(grammarAccess.getChartAccess().getMapChartParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MapChart_3=ruleMapChart();

                    state._fsp--;


                    			current = this_MapChart_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:250:3: this_TableChart_4= ruleTableChart
                    {

                    			newCompositeNode(grammarAccess.getChartAccess().getTableChartParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_TableChart_4=ruleTableChart();

                    state._fsp--;


                    			current = this_TableChart_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleTuple"
    // InternalLenguajegrafico.g:262:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // InternalLenguajegrafico.g:262:46: (iv_ruleTuple= ruleTuple EOF )
            // InternalLenguajegrafico.g:263:2: iv_ruleTuple= ruleTuple EOF
            {
             newCompositeNode(grammarAccess.getTupleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuple=ruleTuple();

            state._fsp--;

             current =iv_ruleTuple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalLenguajegrafico.g:269:1: ruleTuple returns [EObject current=null] : (this_Tuple1_0= ruleTuple1 | this_Tuple2_1= ruleTuple2 | this_Tuple3_2= ruleTuple3 | this_Tuple4_3= ruleTuple4 ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        EObject this_Tuple1_0 = null;

        EObject this_Tuple2_1 = null;

        EObject this_Tuple3_2 = null;

        EObject this_Tuple4_3 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:275:2: ( (this_Tuple1_0= ruleTuple1 | this_Tuple2_1= ruleTuple2 | this_Tuple3_2= ruleTuple3 | this_Tuple4_3= ruleTuple4 ) )
            // InternalLenguajegrafico.g:276:2: (this_Tuple1_0= ruleTuple1 | this_Tuple2_1= ruleTuple2 | this_Tuple3_2= ruleTuple3 | this_Tuple4_3= ruleTuple4 )
            {
            // InternalLenguajegrafico.g:276:2: (this_Tuple1_0= ruleTuple1 | this_Tuple2_1= ruleTuple2 | this_Tuple3_2= ruleTuple3 | this_Tuple4_3= ruleTuple4 )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt5=1;
                }
                break;
            case 55:
                {
                alt5=2;
                }
                break;
            case 56:
                {
                alt5=3;
                }
                break;
            case 57:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLenguajegrafico.g:277:3: this_Tuple1_0= ruleTuple1
                    {

                    			newCompositeNode(grammarAccess.getTupleAccess().getTuple1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tuple1_0=ruleTuple1();

                    state._fsp--;


                    			current = this_Tuple1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:286:3: this_Tuple2_1= ruleTuple2
                    {

                    			newCompositeNode(grammarAccess.getTupleAccess().getTuple2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tuple2_1=ruleTuple2();

                    state._fsp--;


                    			current = this_Tuple2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:295:3: this_Tuple3_2= ruleTuple3
                    {

                    			newCompositeNode(grammarAccess.getTupleAccess().getTuple3ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tuple3_2=ruleTuple3();

                    state._fsp--;


                    			current = this_Tuple3_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:304:3: this_Tuple4_3= ruleTuple4
                    {

                    			newCompositeNode(grammarAccess.getTupleAccess().getTuple4ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tuple4_3=ruleTuple4();

                    state._fsp--;


                    			current = this_Tuple4_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleText"
    // InternalLenguajegrafico.g:316:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalLenguajegrafico.g:316:45: (iv_ruleText= ruleText EOF )
            // InternalLenguajegrafico.g:317:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalLenguajegrafico.g:323:1: ruleText returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:329:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLenguajegrafico.g:330:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLenguajegrafico.g:330:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLenguajegrafico.g:331:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getStringKeyword_0());
            		
            // InternalLenguajegrafico.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNumber"
    // InternalLenguajegrafico.g:357:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalLenguajegrafico.g:357:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalLenguajegrafico.g:358:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalLenguajegrafico.g:364:1: ruleNumber returns [EObject current=null] : (otherlv_0= 'Number' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:370:2: ( (otherlv_0= 'Number' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLenguajegrafico.g:371:2: (otherlv_0= 'Number' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLenguajegrafico.g:371:2: (otherlv_0= 'Number' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLenguajegrafico.g:372:3: otherlv_0= 'Number' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberAccess().getNumberKeyword_0());
            		
            // InternalLenguajegrafico.g:376:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:377:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:377:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:378:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFloat"
    // InternalLenguajegrafico.g:398:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalLenguajegrafico.g:398:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalLenguajegrafico.g:399:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalLenguajegrafico.g:405:1: ruleFloat returns [EObject current=null] : (otherlv_0= 'Float' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:411:2: ( (otherlv_0= 'Float' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLenguajegrafico.g:412:2: (otherlv_0= 'Float' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLenguajegrafico.g:412:2: (otherlv_0= 'Float' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLenguajegrafico.g:413:3: otherlv_0= 'Float' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFloatAccess().getFloatKeyword_0());
            		
            // InternalLenguajegrafico.g:417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:418:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFloatAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleURL"
    // InternalLenguajegrafico.g:439:1: entryRuleURL returns [EObject current=null] : iv_ruleURL= ruleURL EOF ;
    public final EObject entryRuleURL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURL = null;


        try {
            // InternalLenguajegrafico.g:439:44: (iv_ruleURL= ruleURL EOF )
            // InternalLenguajegrafico.g:440:2: iv_ruleURL= ruleURL EOF
            {
             newCompositeNode(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;

             current =iv_ruleURL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalLenguajegrafico.g:446:1: ruleURL returns [EObject current=null] : (otherlv_0= 'URL' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleURL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:452:2: ( (otherlv_0= 'URL' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalLenguajegrafico.g:453:2: (otherlv_0= 'URL' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalLenguajegrafico.g:453:2: (otherlv_0= 'URL' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalLenguajegrafico.g:454:3: otherlv_0= 'URL' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getURLAccess().getURLKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getURLAccess().getEqualsSignKeyword_1());
            		
            // InternalLenguajegrafico.g:462:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalLenguajegrafico.g:463:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalLenguajegrafico.g:463:4: (lv_value_2_0= RULE_STRING )
            // InternalLenguajegrafico.g:464:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getURLAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getURLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleTitle"
    // InternalLenguajegrafico.g:484:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalLenguajegrafico.g:484:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalLenguajegrafico.g:485:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalLenguajegrafico.g:491:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:497:2: ( (otherlv_0= 'Title' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalLenguajegrafico.g:498:2: (otherlv_0= 'Title' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalLenguajegrafico.g:498:2: (otherlv_0= 'Title' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalLenguajegrafico.g:499:3: otherlv_0= 'Title' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getEqualsSignKeyword_1());
            		
            // InternalLenguajegrafico.g:507:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalLenguajegrafico.g:508:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalLenguajegrafico.g:508:4: (lv_value_2_0= RULE_STRING )
            // InternalLenguajegrafico.g:509:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleLabelx"
    // InternalLenguajegrafico.g:529:1: entryRuleLabelx returns [EObject current=null] : iv_ruleLabelx= ruleLabelx EOF ;
    public final EObject entryRuleLabelx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelx = null;


        try {
            // InternalLenguajegrafico.g:529:47: (iv_ruleLabelx= ruleLabelx EOF )
            // InternalLenguajegrafico.g:530:2: iv_ruleLabelx= ruleLabelx EOF
            {
             newCompositeNode(grammarAccess.getLabelxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelx=ruleLabelx();

            state._fsp--;

             current =iv_ruleLabelx; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelx"


    // $ANTLR start "ruleLabelx"
    // InternalLenguajegrafico.g:536:1: ruleLabelx returns [EObject current=null] : (otherlv_0= 'Label_x' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabelx() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:542:2: ( (otherlv_0= 'Label_x' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalLenguajegrafico.g:543:2: (otherlv_0= 'Label_x' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalLenguajegrafico.g:543:2: (otherlv_0= 'Label_x' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalLenguajegrafico.g:544:3: otherlv_0= 'Label_x' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelxAccess().getLabel_xKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelxAccess().getEqualsSignKeyword_1());
            		
            // InternalLenguajegrafico.g:552:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalLenguajegrafico.g:553:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalLenguajegrafico.g:553:4: (lv_value_2_0= RULE_STRING )
            // InternalLenguajegrafico.g:554:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLabelxAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelx"


    // $ANTLR start "entryRuleLabely"
    // InternalLenguajegrafico.g:574:1: entryRuleLabely returns [EObject current=null] : iv_ruleLabely= ruleLabely EOF ;
    public final EObject entryRuleLabely() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabely = null;


        try {
            // InternalLenguajegrafico.g:574:47: (iv_ruleLabely= ruleLabely EOF )
            // InternalLenguajegrafico.g:575:2: iv_ruleLabely= ruleLabely EOF
            {
             newCompositeNode(grammarAccess.getLabelyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabely=ruleLabely();

            state._fsp--;

             current =iv_ruleLabely; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabely"


    // $ANTLR start "ruleLabely"
    // InternalLenguajegrafico.g:581:1: ruleLabely returns [EObject current=null] : (otherlv_0= 'Label_y' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabely() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:587:2: ( (otherlv_0= 'Label_y' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalLenguajegrafico.g:588:2: (otherlv_0= 'Label_y' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalLenguajegrafico.g:588:2: (otherlv_0= 'Label_y' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalLenguajegrafico.g:589:3: otherlv_0= 'Label_y' otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelyAccess().getLabel_yKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelyAccess().getEqualsSignKeyword_1());
            		
            // InternalLenguajegrafico.g:597:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalLenguajegrafico.g:598:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalLenguajegrafico.g:598:4: (lv_value_2_0= RULE_STRING )
            // InternalLenguajegrafico.g:599:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLabelyAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabely"


    // $ANTLR start "entryRuleLegend"
    // InternalLenguajegrafico.g:619:1: entryRuleLegend returns [EObject current=null] : iv_ruleLegend= ruleLegend EOF ;
    public final EObject entryRuleLegend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegend = null;


        try {
            // InternalLenguajegrafico.g:619:47: (iv_ruleLegend= ruleLegend EOF )
            // InternalLenguajegrafico.g:620:2: iv_ruleLegend= ruleLegend EOF
            {
             newCompositeNode(grammarAccess.getLegendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegend=ruleLegend();

            state._fsp--;

             current =iv_ruleLegend; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLegend"


    // $ANTLR start "ruleLegend"
    // InternalLenguajegrafico.g:626:1: ruleLegend returns [EObject current=null] : (otherlv_0= 'Legend' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) ;
    public final EObject ruleLegend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:632:2: ( (otherlv_0= 'Legend' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) )
            // InternalLenguajegrafico.g:633:2: (otherlv_0= 'Legend' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            {
            // InternalLenguajegrafico.g:633:2: (otherlv_0= 'Legend' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            // InternalLenguajegrafico.g:634:3: otherlv_0= 'Legend' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLegendAccess().getLegendKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLegendAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:642:3: ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            // InternalLenguajegrafico.g:643:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            {
            // InternalLenguajegrafico.g:643:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            // InternalLenguajegrafico.g:644:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            {
            // InternalLenguajegrafico.g:644:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLenguajegrafico.g:645:6: lv_value_2_1= 'True'
                    {
                    lv_value_2_1=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getLegendAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLegendRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:656:6: lv_value_2_2= 'False'
                    {
                    lv_value_2_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getLegendAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLegendRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLegend"


    // $ANTLR start "entryRuleHole"
    // InternalLenguajegrafico.g:673:1: entryRuleHole returns [EObject current=null] : iv_ruleHole= ruleHole EOF ;
    public final EObject entryRuleHole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHole = null;


        try {
            // InternalLenguajegrafico.g:673:45: (iv_ruleHole= ruleHole EOF )
            // InternalLenguajegrafico.g:674:2: iv_ruleHole= ruleHole EOF
            {
             newCompositeNode(grammarAccess.getHoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHole=ruleHole();

            state._fsp--;

             current =iv_ruleHole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHole"


    // $ANTLR start "ruleHole"
    // InternalLenguajegrafico.g:680:1: ruleHole returns [EObject current=null] : (otherlv_0= 'Hole' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) ;
    public final EObject ruleHole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:686:2: ( (otherlv_0= 'Hole' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) )
            // InternalLenguajegrafico.g:687:2: (otherlv_0= 'Hole' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            {
            // InternalLenguajegrafico.g:687:2: (otherlv_0= 'Hole' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            // InternalLenguajegrafico.g:688:3: otherlv_0= 'Hole' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHoleAccess().getHoleKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getHoleAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:696:3: ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            // InternalLenguajegrafico.g:697:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            {
            // InternalLenguajegrafico.g:697:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            // InternalLenguajegrafico.g:698:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            {
            // InternalLenguajegrafico.g:698:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLenguajegrafico.g:699:6: lv_value_2_1= 'True'
                    {
                    lv_value_2_1=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getHoleAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHoleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:710:6: lv_value_2_2= 'False'
                    {
                    lv_value_2_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getHoleAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHoleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHole"


    // $ANTLR start "entryRuleOrientation"
    // InternalLenguajegrafico.g:727:1: entryRuleOrientation returns [EObject current=null] : iv_ruleOrientation= ruleOrientation EOF ;
    public final EObject entryRuleOrientation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrientation = null;


        try {
            // InternalLenguajegrafico.g:727:52: (iv_ruleOrientation= ruleOrientation EOF )
            // InternalLenguajegrafico.g:728:2: iv_ruleOrientation= ruleOrientation EOF
            {
             newCompositeNode(grammarAccess.getOrientationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrientation=ruleOrientation();

            state._fsp--;

             current =iv_ruleOrientation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrientation"


    // $ANTLR start "ruleOrientation"
    // InternalLenguajegrafico.g:734:1: ruleOrientation returns [EObject current=null] : (otherlv_0= 'Orientation' otherlv_1= '.' ( ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) ) ) ) ;
    public final EObject ruleOrientation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:740:2: ( (otherlv_0= 'Orientation' otherlv_1= '.' ( ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) ) ) ) )
            // InternalLenguajegrafico.g:741:2: (otherlv_0= 'Orientation' otherlv_1= '.' ( ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) ) ) )
            {
            // InternalLenguajegrafico.g:741:2: (otherlv_0= 'Orientation' otherlv_1= '.' ( ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) ) ) )
            // InternalLenguajegrafico.g:742:3: otherlv_0= 'Orientation' otherlv_1= '.' ( ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOrientationAccess().getOrientationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOrientationAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:750:3: ( ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) ) )
            // InternalLenguajegrafico.g:751:4: ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) )
            {
            // InternalLenguajegrafico.g:751:4: ( (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' ) )
            // InternalLenguajegrafico.g:752:5: (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' )
            {
            // InternalLenguajegrafico.g:752:5: (lv_value_2_1= 'Horizontal' | lv_value_2_2= 'Vertical' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLenguajegrafico.g:753:6: lv_value_2_1= 'Horizontal'
                    {
                    lv_value_2_1=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getOrientationAccess().getValueHorizontalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrientationRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:764:6: lv_value_2_2= 'Vertical'
                    {
                    lv_value_2_2=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getOrientationAccess().getValueVerticalKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrientationRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "entryRuleArea"
    // InternalLenguajegrafico.g:781:1: entryRuleArea returns [EObject current=null] : iv_ruleArea= ruleArea EOF ;
    public final EObject entryRuleArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArea = null;


        try {
            // InternalLenguajegrafico.g:781:45: (iv_ruleArea= ruleArea EOF )
            // InternalLenguajegrafico.g:782:2: iv_ruleArea= ruleArea EOF
            {
             newCompositeNode(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArea=ruleArea();

            state._fsp--;

             current =iv_ruleArea; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalLenguajegrafico.g:788:1: ruleArea returns [EObject current=null] : (otherlv_0= 'Area' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) ;
    public final EObject ruleArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:794:2: ( (otherlv_0= 'Area' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) )
            // InternalLenguajegrafico.g:795:2: (otherlv_0= 'Area' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            {
            // InternalLenguajegrafico.g:795:2: (otherlv_0= 'Area' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            // InternalLenguajegrafico.g:796:3: otherlv_0= 'Area' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAreaAccess().getAreaKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAreaAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:804:3: ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            // InternalLenguajegrafico.g:805:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            {
            // InternalLenguajegrafico.g:805:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            // InternalLenguajegrafico.g:806:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            {
            // InternalLenguajegrafico.g:806:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLenguajegrafico.g:807:6: lv_value_2_1= 'True'
                    {
                    lv_value_2_1=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getAreaAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAreaRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:818:6: lv_value_2_2= 'False'
                    {
                    lv_value_2_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getAreaAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAreaRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleZoomLevel"
    // InternalLenguajegrafico.g:835:1: entryRuleZoomLevel returns [EObject current=null] : iv_ruleZoomLevel= ruleZoomLevel EOF ;
    public final EObject entryRuleZoomLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZoomLevel = null;


        try {
            // InternalLenguajegrafico.g:835:50: (iv_ruleZoomLevel= ruleZoomLevel EOF )
            // InternalLenguajegrafico.g:836:2: iv_ruleZoomLevel= ruleZoomLevel EOF
            {
             newCompositeNode(grammarAccess.getZoomLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZoomLevel=ruleZoomLevel();

            state._fsp--;

             current =iv_ruleZoomLevel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleZoomLevel"


    // $ANTLR start "ruleZoomLevel"
    // InternalLenguajegrafico.g:842:1: ruleZoomLevel returns [EObject current=null] : (otherlv_0= 'ZoomLevel' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleZoomLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:848:2: ( (otherlv_0= 'ZoomLevel' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalLenguajegrafico.g:849:2: (otherlv_0= 'ZoomLevel' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalLenguajegrafico.g:849:2: (otherlv_0= 'ZoomLevel' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalLenguajegrafico.g:850:3: otherlv_0= 'ZoomLevel' otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getZoomLevelAccess().getZoomLevelKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getZoomLevelAccess().getEqualsSignKeyword_1());
            		
            // InternalLenguajegrafico.g:858:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalLenguajegrafico.g:859:4: (lv_value_2_0= RULE_INT )
            {
            // InternalLenguajegrafico.g:859:4: (lv_value_2_0= RULE_INT )
            // InternalLenguajegrafico.g:860:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getZoomLevelAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZoomLevelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleZoomLevel"


    // $ANTLR start "entryRuleMakerType"
    // InternalLenguajegrafico.g:880:1: entryRuleMakerType returns [EObject current=null] : iv_ruleMakerType= ruleMakerType EOF ;
    public final EObject entryRuleMakerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakerType = null;


        try {
            // InternalLenguajegrafico.g:880:50: (iv_ruleMakerType= ruleMakerType EOF )
            // InternalLenguajegrafico.g:881:2: iv_ruleMakerType= ruleMakerType EOF
            {
             newCompositeNode(grammarAccess.getMakerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMakerType=ruleMakerType();

            state._fsp--;

             current =iv_ruleMakerType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMakerType"


    // $ANTLR start "ruleMakerType"
    // InternalLenguajegrafico.g:887:1: ruleMakerType returns [EObject current=null] : (otherlv_0= 'MakerType' otherlv_1= '.' ( ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) ) ) ) ;
    public final EObject ruleMakerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:893:2: ( (otherlv_0= 'MakerType' otherlv_1= '.' ( ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) ) ) ) )
            // InternalLenguajegrafico.g:894:2: (otherlv_0= 'MakerType' otherlv_1= '.' ( ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) ) ) )
            {
            // InternalLenguajegrafico.g:894:2: (otherlv_0= 'MakerType' otherlv_1= '.' ( ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) ) ) )
            // InternalLenguajegrafico.g:895:3: otherlv_0= 'MakerType' otherlv_1= '.' ( ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMakerTypeAccess().getMakerTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMakerTypeAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:903:3: ( ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) ) )
            // InternalLenguajegrafico.g:904:4: ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) )
            {
            // InternalLenguajegrafico.g:904:4: ( (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' ) )
            // InternalLenguajegrafico.g:905:5: (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' )
            {
            // InternalLenguajegrafico.g:905:5: (lv_value_2_1= 'Normal' | lv_value_2_2= 'Group' | lv_value_2_3= 'MagnitudeCircle' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLenguajegrafico.g:906:6: lv_value_2_1= 'Normal'
                    {
                    lv_value_2_1=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getMakerTypeAccess().getValueNormalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMakerTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:917:6: lv_value_2_2= 'Group'
                    {
                    lv_value_2_2=(Token)match(input,31,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getMakerTypeAccess().getValueGroupKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMakerTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:928:6: lv_value_2_3= 'MagnitudeCircle'
                    {
                    lv_value_2_3=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getMakerTypeAccess().getValueMagnitudeCircleKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMakerTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMakerType"


    // $ANTLR start "entryRuleMapType"
    // InternalLenguajegrafico.g:945:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // InternalLenguajegrafico.g:945:48: (iv_ruleMapType= ruleMapType EOF )
            // InternalLenguajegrafico.g:946:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalLenguajegrafico.g:952:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'MapType' otherlv_1= '.' ( ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) ) ) ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;
        Token lv_value_2_4=null;
        Token lv_value_2_5=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:958:2: ( (otherlv_0= 'MapType' otherlv_1= '.' ( ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) ) ) ) )
            // InternalLenguajegrafico.g:959:2: (otherlv_0= 'MapType' otherlv_1= '.' ( ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) ) ) )
            {
            // InternalLenguajegrafico.g:959:2: (otherlv_0= 'MapType' otherlv_1= '.' ( ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) ) ) )
            // InternalLenguajegrafico.g:960:3: otherlv_0= 'MapType' otherlv_1= '.' ( ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:968:3: ( ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) ) )
            // InternalLenguajegrafico.g:969:4: ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) )
            {
            // InternalLenguajegrafico.g:969:4: ( (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' ) )
            // InternalLenguajegrafico.g:970:5: (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' )
            {
            // InternalLenguajegrafico.g:970:5: (lv_value_2_1= 'general' | lv_value_2_2= 'roadmap' | lv_value_2_3= 'terrain' | lv_value_2_4= 'satellite' | lv_value_2_5= 'hybrid' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 37:
                {
                alt11=4;
                }
                break;
            case 38:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLenguajegrafico.g:971:6: lv_value_2_1= 'general'
                    {
                    lv_value_2_1=(Token)match(input,34,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getMapTypeAccess().getValueGeneralKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMapTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:982:6: lv_value_2_2= 'roadmap'
                    {
                    lv_value_2_2=(Token)match(input,35,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getMapTypeAccess().getValueRoadmapKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMapTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:993:6: lv_value_2_3= 'terrain'
                    {
                    lv_value_2_3=(Token)match(input,36,FOLLOW_2); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getMapTypeAccess().getValueTerrainKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMapTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1004:6: lv_value_2_4= 'satellite'
                    {
                    lv_value_2_4=(Token)match(input,37,FOLLOW_2); 

                    						newLeafNode(lv_value_2_4, grammarAccess.getMapTypeAccess().getValueSatelliteKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMapTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1015:6: lv_value_2_5= 'hybrid'
                    {
                    lv_value_2_5=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_value_2_5, grammarAccess.getMapTypeAccess().getValueHybridKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMapTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_5, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleCellSize"
    // InternalLenguajegrafico.g:1032:1: entryRuleCellSize returns [EObject current=null] : iv_ruleCellSize= ruleCellSize EOF ;
    public final EObject entryRuleCellSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellSize = null;


        try {
            // InternalLenguajegrafico.g:1032:49: (iv_ruleCellSize= ruleCellSize EOF )
            // InternalLenguajegrafico.g:1033:2: iv_ruleCellSize= ruleCellSize EOF
            {
             newCompositeNode(grammarAccess.getCellSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellSize=ruleCellSize();

            state._fsp--;

             current =iv_ruleCellSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellSize"


    // $ANTLR start "ruleCellSize"
    // InternalLenguajegrafico.g:1039:1: ruleCellSize returns [EObject current=null] : (otherlv_0= 'CellSize' otherlv_1= '.' ( ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) ) ) ) ;
    public final EObject ruleCellSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;
        Token lv_value_2_4=null;
        Token lv_value_2_5=null;
        Token lv_value_2_6=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:1045:2: ( (otherlv_0= 'CellSize' otherlv_1= '.' ( ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) ) ) ) )
            // InternalLenguajegrafico.g:1046:2: (otherlv_0= 'CellSize' otherlv_1= '.' ( ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) ) ) )
            {
            // InternalLenguajegrafico.g:1046:2: (otherlv_0= 'CellSize' otherlv_1= '.' ( ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) ) ) )
            // InternalLenguajegrafico.g:1047:3: otherlv_0= 'CellSize' otherlv_1= '.' ( ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCellSizeAccess().getCellSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCellSizeAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:1055:3: ( ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) ) )
            // InternalLenguajegrafico.g:1056:4: ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) )
            {
            // InternalLenguajegrafico.g:1056:4: ( (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' ) )
            // InternalLenguajegrafico.g:1057:5: (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' )
            {
            // InternalLenguajegrafico.g:1057:5: (lv_value_2_1= '1x1' | lv_value_2_2= '1x2' | lv_value_2_3= '1x3' | lv_value_2_4= '2x1' | lv_value_2_5= '2x2' | lv_value_2_6= '3x3' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            case 43:
                {
                alt12=4;
                }
                break;
            case 44:
                {
                alt12=5;
                }
                break;
            case 45:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalLenguajegrafico.g:1058:6: lv_value_2_1= '1x1'
                    {
                    lv_value_2_1=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getCellSizeAccess().getValue1x1Keyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellSizeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1069:6: lv_value_2_2= '1x2'
                    {
                    lv_value_2_2=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getCellSizeAccess().getValue1x2Keyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellSizeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1080:6: lv_value_2_3= '1x3'
                    {
                    lv_value_2_3=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getCellSizeAccess().getValue1x3Keyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellSizeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1091:6: lv_value_2_4= '2x1'
                    {
                    lv_value_2_4=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_value_2_4, grammarAccess.getCellSizeAccess().getValue2x1Keyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellSizeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1102:6: lv_value_2_5= '2x2'
                    {
                    lv_value_2_5=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_value_2_5, grammarAccess.getCellSizeAccess().getValue2x2Keyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellSizeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalLenguajegrafico.g:1113:6: lv_value_2_6= '3x3'
                    {
                    lv_value_2_6=(Token)match(input,45,FOLLOW_2); 

                    						newLeafNode(lv_value_2_6, grammarAccess.getCellSizeAccess().getValue3x3Keyword_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellSizeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_6, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellSize"


    // $ANTLR start "entryRulePieChart"
    // InternalLenguajegrafico.g:1130:1: entryRulePieChart returns [EObject current=null] : iv_rulePieChart= rulePieChart EOF ;
    public final EObject entryRulePieChart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePieChart = null;


        try {
            // InternalLenguajegrafico.g:1130:49: (iv_rulePieChart= rulePieChart EOF )
            // InternalLenguajegrafico.g:1131:2: iv_rulePieChart= rulePieChart EOF
            {
             newCompositeNode(grammarAccess.getPieChartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePieChart=rulePieChart();

            state._fsp--;

             current =iv_rulePieChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePieChart"


    // $ANTLR start "rulePieChart"
    // InternalLenguajegrafico.g:1137:1: rulePieChart returns [EObject current=null] : (otherlv_0= 'PieChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePieChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_1 = null;

        EObject lv_features_4_2 = null;

        EObject lv_features_4_3 = null;

        EObject lv_features_4_4 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1143:2: ( (otherlv_0= 'PieChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) ) )* otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:1144:2: (otherlv_0= 'PieChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) ) )* otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:1144:2: (otherlv_0= 'PieChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) ) )* otherlv_5= '}' )
            // InternalLenguajegrafico.g:1145:3: otherlv_0= 'PieChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPieChartAccess().getPieChartKeyword_0());
            		
            // InternalLenguajegrafico.g:1149:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1150:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1150:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1151:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPieChartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieChartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPieChartAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1171:3: ( (otherlv_3= RULE_ID ) )
            // InternalLenguajegrafico.g:1172:4: (otherlv_3= RULE_ID )
            {
            // InternalLenguajegrafico.g:1172:4: (otherlv_3= RULE_ID )
            // InternalLenguajegrafico.g:1173:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPieChartRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getPieChartAccess().getTupleTuple1CrossReference_3_0());
            				

            }


            }

            // InternalLenguajegrafico.g:1184:3: ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16||LA14_0==19||LA14_0==23||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1185:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) )
            	    {
            	    // InternalLenguajegrafico.g:1185:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize ) )
            	    // InternalLenguajegrafico.g:1186:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize )
            	    {
            	    // InternalLenguajegrafico.g:1186:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleHole | lv_features_4_4= ruleCellSize )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalLenguajegrafico.g:1187:6: lv_features_4_1= ruleTitle
            	            {

            	            						newCompositeNode(grammarAccess.getPieChartAccess().getFeaturesTitleParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_features_4_1=ruleTitle();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_1,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Title");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalLenguajegrafico.g:1203:6: lv_features_4_2= ruleLegend
            	            {

            	            						newCompositeNode(grammarAccess.getPieChartAccess().getFeaturesLegendParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_features_4_2=ruleLegend();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_2,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Legend");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalLenguajegrafico.g:1219:6: lv_features_4_3= ruleHole
            	            {

            	            						newCompositeNode(grammarAccess.getPieChartAccess().getFeaturesHoleParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_features_4_3=ruleHole();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_3,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Hole");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalLenguajegrafico.g:1235:6: lv_features_4_4= ruleCellSize
            	            {

            	            						newCompositeNode(grammarAccess.getPieChartAccess().getFeaturesCellSizeParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_features_4_4=ruleCellSize();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPieChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_4,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.CellSize");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPieChartAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePieChart"


    // $ANTLR start "entryRuleBarChart"
    // InternalLenguajegrafico.g:1261:1: entryRuleBarChart returns [EObject current=null] : iv_ruleBarChart= ruleBarChart EOF ;
    public final EObject entryRuleBarChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarChart = null;


        try {
            // InternalLenguajegrafico.g:1261:49: (iv_ruleBarChart= ruleBarChart EOF )
            // InternalLenguajegrafico.g:1262:2: iv_ruleBarChart= ruleBarChart EOF
            {
             newCompositeNode(grammarAccess.getBarChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarChart=ruleBarChart();

            state._fsp--;

             current =iv_ruleBarChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBarChart"


    // $ANTLR start "ruleBarChart"
    // InternalLenguajegrafico.g:1268:1: ruleBarChart returns [EObject current=null] : (otherlv_0= 'BarChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleBarChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_1 = null;

        EObject lv_features_4_2 = null;

        EObject lv_features_4_3 = null;

        EObject lv_features_4_4 = null;

        EObject lv_features_4_5 = null;

        EObject lv_features_4_6 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1274:2: ( (otherlv_0= 'BarChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:1275:2: (otherlv_0= 'BarChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:1275:2: (otherlv_0= 'BarChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' )
            // InternalLenguajegrafico.g:1276:3: otherlv_0= 'BarChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBarChartAccess().getBarChartKeyword_0());
            		
            // InternalLenguajegrafico.g:1280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1281:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBarChartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarChartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBarChartAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1302:3: ( (otherlv_3= RULE_ID ) )
            // InternalLenguajegrafico.g:1303:4: (otherlv_3= RULE_ID )
            {
            // InternalLenguajegrafico.g:1303:4: (otherlv_3= RULE_ID )
            // InternalLenguajegrafico.g:1304:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarChartRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getBarChartAccess().getTupleTuple2CrossReference_3_0());
            				

            }


            }

            // InternalLenguajegrafico.g:1315:3: ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=16 && LA16_0<=19)||LA16_0==24||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1316:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) )
            	    {
            	    // InternalLenguajegrafico.g:1316:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize ) )
            	    // InternalLenguajegrafico.g:1317:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize )
            	    {
            	    // InternalLenguajegrafico.g:1317:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleOrientation | lv_features_4_6= ruleCellSize )
            	    int alt15=6;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt15=5;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt15=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalLenguajegrafico.g:1318:6: lv_features_4_1= ruleTitle
            	            {

            	            						newCompositeNode(grammarAccess.getBarChartAccess().getFeaturesTitleParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_features_4_1=ruleTitle();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_1,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Title");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalLenguajegrafico.g:1334:6: lv_features_4_2= ruleLegend
            	            {

            	            						newCompositeNode(grammarAccess.getBarChartAccess().getFeaturesLegendParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_features_4_2=ruleLegend();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_2,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Legend");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalLenguajegrafico.g:1350:6: lv_features_4_3= ruleLabelx
            	            {

            	            						newCompositeNode(grammarAccess.getBarChartAccess().getFeaturesLabelxParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_features_4_3=ruleLabelx();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_3,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Labelx");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalLenguajegrafico.g:1366:6: lv_features_4_4= ruleLabely
            	            {

            	            						newCompositeNode(grammarAccess.getBarChartAccess().getFeaturesLabelyParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_features_4_4=ruleLabely();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_4,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Labely");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalLenguajegrafico.g:1382:6: lv_features_4_5= ruleOrientation
            	            {

            	            						newCompositeNode(grammarAccess.getBarChartAccess().getFeaturesOrientationParserRuleCall_4_0_4());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_features_4_5=ruleOrientation();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_5,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Orientation");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalLenguajegrafico.g:1398:6: lv_features_4_6= ruleCellSize
            	            {

            	            						newCompositeNode(grammarAccess.getBarChartAccess().getFeaturesCellSizeParserRuleCall_4_0_5());
            	            					
            	            pushFollow(FOLLOW_16);
            	            lv_features_4_6=ruleCellSize();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getBarChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_6,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.CellSize");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBarChartAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBarChart"


    // $ANTLR start "entryRuleLineChart"
    // InternalLenguajegrafico.g:1424:1: entryRuleLineChart returns [EObject current=null] : iv_ruleLineChart= ruleLineChart EOF ;
    public final EObject entryRuleLineChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineChart = null;


        try {
            // InternalLenguajegrafico.g:1424:50: (iv_ruleLineChart= ruleLineChart EOF )
            // InternalLenguajegrafico.g:1425:2: iv_ruleLineChart= ruleLineChart EOF
            {
             newCompositeNode(grammarAccess.getLineChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineChart=ruleLineChart();

            state._fsp--;

             current =iv_ruleLineChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineChart"


    // $ANTLR start "ruleLineChart"
    // InternalLenguajegrafico.g:1431:1: ruleLineChart returns [EObject current=null] : (otherlv_0= 'LineChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleLineChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_1 = null;

        EObject lv_features_4_2 = null;

        EObject lv_features_4_3 = null;

        EObject lv_features_4_4 = null;

        EObject lv_features_4_5 = null;

        EObject lv_features_4_6 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1437:2: ( (otherlv_0= 'LineChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:1438:2: (otherlv_0= 'LineChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:1438:2: (otherlv_0= 'LineChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}' )
            // InternalLenguajegrafico.g:1439:3: otherlv_0= 'LineChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLineChartAccess().getLineChartKeyword_0());
            		
            // InternalLenguajegrafico.g:1443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1444:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLineChartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineChartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLineChartAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1465:3: ( (otherlv_3= RULE_ID ) )
            // InternalLenguajegrafico.g:1466:4: (otherlv_3= RULE_ID )
            {
            // InternalLenguajegrafico.g:1466:4: (otherlv_3= RULE_ID )
            // InternalLenguajegrafico.g:1467:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineChartRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getLineChartAccess().getTupleTuple2CrossReference_3_0());
            				

            }


            }

            // InternalLenguajegrafico.g:1478:3: ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=16 && LA18_0<=19)||LA18_0==27||LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1479:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) )
            	    {
            	    // InternalLenguajegrafico.g:1479:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize ) )
            	    // InternalLenguajegrafico.g:1480:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize )
            	    {
            	    // InternalLenguajegrafico.g:1480:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleLegend | lv_features_4_3= ruleLabelx | lv_features_4_4= ruleLabely | lv_features_4_5= ruleArea | lv_features_4_6= ruleCellSize )
            	    int alt17=6;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt17=5;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt17=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalLenguajegrafico.g:1481:6: lv_features_4_1= ruleTitle
            	            {

            	            						newCompositeNode(grammarAccess.getLineChartAccess().getFeaturesTitleParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_features_4_1=ruleTitle();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_1,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Title");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalLenguajegrafico.g:1497:6: lv_features_4_2= ruleLegend
            	            {

            	            						newCompositeNode(grammarAccess.getLineChartAccess().getFeaturesLegendParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_features_4_2=ruleLegend();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_2,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Legend");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalLenguajegrafico.g:1513:6: lv_features_4_3= ruleLabelx
            	            {

            	            						newCompositeNode(grammarAccess.getLineChartAccess().getFeaturesLabelxParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_features_4_3=ruleLabelx();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_3,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Labelx");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalLenguajegrafico.g:1529:6: lv_features_4_4= ruleLabely
            	            {

            	            						newCompositeNode(grammarAccess.getLineChartAccess().getFeaturesLabelyParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_features_4_4=ruleLabely();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_4,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Labely");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalLenguajegrafico.g:1545:6: lv_features_4_5= ruleArea
            	            {

            	            						newCompositeNode(grammarAccess.getLineChartAccess().getFeaturesAreaParserRuleCall_4_0_4());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_features_4_5=ruleArea();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_5,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Area");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalLenguajegrafico.g:1561:6: lv_features_4_6= ruleCellSize
            	            {

            	            						newCompositeNode(grammarAccess.getLineChartAccess().getFeaturesCellSizeParserRuleCall_4_0_5());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_features_4_6=ruleCellSize();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_6,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.CellSize");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLineChartAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineChart"


    // $ANTLR start "entryRuleMapChart"
    // InternalLenguajegrafico.g:1587:1: entryRuleMapChart returns [EObject current=null] : iv_ruleMapChart= ruleMapChart EOF ;
    public final EObject entryRuleMapChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapChart = null;


        try {
            // InternalLenguajegrafico.g:1587:49: (iv_ruleMapChart= ruleMapChart EOF )
            // InternalLenguajegrafico.g:1588:2: iv_ruleMapChart= ruleMapChart EOF
            {
             newCompositeNode(grammarAccess.getMapChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapChart=ruleMapChart();

            state._fsp--;

             current =iv_ruleMapChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapChart"


    // $ANTLR start "ruleMapChart"
    // InternalLenguajegrafico.g:1594:1: ruleMapChart returns [EObject current=null] : (otherlv_0= 'MapChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleMapChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_1 = null;

        EObject lv_features_4_2 = null;

        EObject lv_features_4_3 = null;

        EObject lv_features_4_4 = null;

        EObject lv_features_4_5 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1600:2: ( (otherlv_0= 'MapChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) ) )* otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:1601:2: (otherlv_0= 'MapChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) ) )* otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:1601:2: (otherlv_0= 'MapChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) ) )* otherlv_5= '}' )
            // InternalLenguajegrafico.g:1602:3: otherlv_0= 'MapChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMapChartAccess().getMapChartKeyword_0());
            		
            // InternalLenguajegrafico.g:1606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1607:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1608:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMapChartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapChartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMapChartAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1628:3: ( (otherlv_3= RULE_ID ) )
            // InternalLenguajegrafico.g:1629:4: (otherlv_3= RULE_ID )
            {
            // InternalLenguajegrafico.g:1629:4: (otherlv_3= RULE_ID )
            // InternalLenguajegrafico.g:1630:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapChartRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_3, grammarAccess.getMapChartAccess().getTupleTuple3CrossReference_3_0());
            				

            }


            }

            // InternalLenguajegrafico.g:1641:3: ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16||(LA20_0>=28 && LA20_0<=29)||LA20_0==33||LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1642:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) )
            	    {
            	    // InternalLenguajegrafico.g:1642:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize ) )
            	    // InternalLenguajegrafico.g:1643:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize )
            	    {
            	    // InternalLenguajegrafico.g:1643:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleZoomLevel | lv_features_4_3= ruleMakerType | lv_features_4_4= ruleMapType | lv_features_4_5= ruleCellSize )
            	    int alt19=5;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalLenguajegrafico.g:1644:6: lv_features_4_1= ruleTitle
            	            {

            	            						newCompositeNode(grammarAccess.getMapChartAccess().getFeaturesTitleParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_features_4_1=ruleTitle();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMapChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_1,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Title");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalLenguajegrafico.g:1660:6: lv_features_4_2= ruleZoomLevel
            	            {

            	            						newCompositeNode(grammarAccess.getMapChartAccess().getFeaturesZoomLevelParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_features_4_2=ruleZoomLevel();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMapChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_2,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.ZoomLevel");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalLenguajegrafico.g:1676:6: lv_features_4_3= ruleMakerType
            	            {

            	            						newCompositeNode(grammarAccess.getMapChartAccess().getFeaturesMakerTypeParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_features_4_3=ruleMakerType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMapChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_3,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.MakerType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalLenguajegrafico.g:1692:6: lv_features_4_4= ruleMapType
            	            {

            	            						newCompositeNode(grammarAccess.getMapChartAccess().getFeaturesMapTypeParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_features_4_4=ruleMapType();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMapChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_4,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.MapType");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalLenguajegrafico.g:1708:6: lv_features_4_5= ruleCellSize
            	            {

            	            						newCompositeNode(grammarAccess.getMapChartAccess().getFeaturesCellSizeParserRuleCall_4_0_4());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_features_4_5=ruleCellSize();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMapChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_5,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.CellSize");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMapChartAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapChart"


    // $ANTLR start "entryRuleTableChart"
    // InternalLenguajegrafico.g:1734:1: entryRuleTableChart returns [EObject current=null] : iv_ruleTableChart= ruleTableChart EOF ;
    public final EObject entryRuleTableChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableChart = null;


        try {
            // InternalLenguajegrafico.g:1734:51: (iv_ruleTableChart= ruleTableChart EOF )
            // InternalLenguajegrafico.g:1735:2: iv_ruleTableChart= ruleTableChart EOF
            {
             newCompositeNode(grammarAccess.getTableChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableChart=ruleTableChart();

            state._fsp--;

             current =iv_ruleTableChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableChart"


    // $ANTLR start "ruleTableChart"
    // InternalLenguajegrafico.g:1741:1: ruleTableChart returns [EObject current=null] : (otherlv_0= 'TableChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTableChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_1 = null;

        EObject lv_features_4_2 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1747:2: ( (otherlv_0= 'TableChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) ) )* otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:1748:2: (otherlv_0= 'TableChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) ) )* otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:1748:2: (otherlv_0= 'TableChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) ) )* otherlv_5= '}' )
            // InternalLenguajegrafico.g:1749:3: otherlv_0= 'TableChart' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTableChartAccess().getTableChartKeyword_0());
            		
            // InternalLenguajegrafico.g:1753:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1754:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1754:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1755:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableChartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableChartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTableChartAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1775:3: ( (otherlv_3= RULE_ID ) )
            // InternalLenguajegrafico.g:1776:4: (otherlv_3= RULE_ID )
            {
            // InternalLenguajegrafico.g:1776:4: (otherlv_3= RULE_ID )
            // InternalLenguajegrafico.g:1777:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableChartRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getTableChartAccess().getTupleTuple4CrossReference_3_0());
            				

            }


            }

            // InternalLenguajegrafico.g:1788:3: ( ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16||LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1789:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) )
            	    {
            	    // InternalLenguajegrafico.g:1789:4: ( (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize ) )
            	    // InternalLenguajegrafico.g:1790:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize )
            	    {
            	    // InternalLenguajegrafico.g:1790:5: (lv_features_4_1= ruleTitle | lv_features_4_2= ruleCellSize )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==16) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==39) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalLenguajegrafico.g:1791:6: lv_features_4_1= ruleTitle
            	            {

            	            						newCompositeNode(grammarAccess.getTableChartAccess().getFeaturesTitleParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_features_4_1=ruleTitle();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_1,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.Title");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalLenguajegrafico.g:1807:6: lv_features_4_2= ruleCellSize
            	            {

            	            						newCompositeNode(grammarAccess.getTableChartAccess().getFeaturesCellSizeParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_features_4_2=ruleCellSize();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTableChartRule());
            	            						}
            	            						add(
            	            							current,
            	            							"features",
            	            							lv_features_4_2,
            	            							"org.uis.lenguajegrafico.Lenguajegrafico.CellSize");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTableChartAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableChart"


    // $ANTLR start "entryRuleDashBoard"
    // InternalLenguajegrafico.g:1833:1: entryRuleDashBoard returns [EObject current=null] : iv_ruleDashBoard= ruleDashBoard EOF ;
    public final EObject entryRuleDashBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashBoard = null;


        try {
            // InternalLenguajegrafico.g:1833:50: (iv_ruleDashBoard= ruleDashBoard EOF )
            // InternalLenguajegrafico.g:1834:2: iv_ruleDashBoard= ruleDashBoard EOF
            {
             newCompositeNode(grammarAccess.getDashBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDashBoard=ruleDashBoard();

            state._fsp--;

             current =iv_ruleDashBoard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDashBoard"


    // $ANTLR start "ruleDashBoard"
    // InternalLenguajegrafico.g:1840:1: ruleDashBoard returns [EObject current=null] : (otherlv_0= 'DashBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (lv_features_4_0= ruleTitle ) )* otherlv_5= '}' ) ;
    public final EObject ruleDashBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1846:2: ( (otherlv_0= 'DashBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (lv_features_4_0= ruleTitle ) )* otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:1847:2: (otherlv_0= 'DashBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (lv_features_4_0= ruleTitle ) )* otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:1847:2: (otherlv_0= 'DashBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (lv_features_4_0= ruleTitle ) )* otherlv_5= '}' )
            // InternalLenguajegrafico.g:1848:3: otherlv_0= 'DashBoard' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (lv_features_4_0= ruleTitle ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDashBoardAccess().getDashBoardKeyword_0());
            		
            // InternalLenguajegrafico.g:1852:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1853:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1853:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1854:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDashBoardAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDashBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1874:3: ( (otherlv_3= RULE_ID ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1875:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalLenguajegrafico.g:1875:4: (otherlv_3= RULE_ID )
            	    // InternalLenguajegrafico.g:1876:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDashBoardRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDashBoardAccess().getChartsChartCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // InternalLenguajegrafico.g:1887:3: ( (lv_features_4_0= ruleTitle ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLenguajegrafico.g:1888:4: (lv_features_4_0= ruleTitle )
            	    {
            	    // InternalLenguajegrafico.g:1888:4: (lv_features_4_0= ruleTitle )
            	    // InternalLenguajegrafico.g:1889:5: lv_features_4_0= ruleTitle
            	    {

            	    					newCompositeNode(grammarAccess.getDashBoardAccess().getFeaturesTitleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_features_4_0=ruleTitle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDashBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_4_0,
            	    						"org.uis.lenguajegrafico.Lenguajegrafico.Title");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDashBoard"


    // $ANTLR start "entryRuleTuple1"
    // InternalLenguajegrafico.g:1914:1: entryRuleTuple1 returns [EObject current=null] : iv_ruleTuple1= ruleTuple1 EOF ;
    public final EObject entryRuleTuple1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple1 = null;


        try {
            // InternalLenguajegrafico.g:1914:47: (iv_ruleTuple1= ruleTuple1 EOF )
            // InternalLenguajegrafico.g:1915:2: iv_ruleTuple1= ruleTuple1 EOF
            {
             newCompositeNode(grammarAccess.getTuple1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuple1=ruleTuple1();

            state._fsp--;

             current =iv_ruleTuple1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple1"


    // $ANTLR start "ruleTuple1"
    // InternalLenguajegrafico.g:1921:1: ruleTuple1 returns [EObject current=null] : (otherlv_0= 'Tuple1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleText ) ) ( (lv_value2_5_0= ruleNumber ) ) otherlv_6= '}' ) ;
    public final EObject ruleTuple1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_url_3_0 = null;

        EObject lv_value1_4_0 = null;

        EObject lv_value2_5_0 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:1927:2: ( (otherlv_0= 'Tuple1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleText ) ) ( (lv_value2_5_0= ruleNumber ) ) otherlv_6= '}' ) )
            // InternalLenguajegrafico.g:1928:2: (otherlv_0= 'Tuple1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleText ) ) ( (lv_value2_5_0= ruleNumber ) ) otherlv_6= '}' )
            {
            // InternalLenguajegrafico.g:1928:2: (otherlv_0= 'Tuple1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleText ) ) ( (lv_value2_5_0= ruleNumber ) ) otherlv_6= '}' )
            // InternalLenguajegrafico.g:1929:3: otherlv_0= 'Tuple1' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleText ) ) ( (lv_value2_5_0= ruleNumber ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTuple1Access().getTuple1Keyword_0());
            		
            // InternalLenguajegrafico.g:1933:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:1934:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:1934:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:1935:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTuple1Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTuple1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTuple1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:1955:3: ( (lv_url_3_0= ruleURL ) )
            // InternalLenguajegrafico.g:1956:4: (lv_url_3_0= ruleURL )
            {
            // InternalLenguajegrafico.g:1956:4: (lv_url_3_0= ruleURL )
            // InternalLenguajegrafico.g:1957:5: lv_url_3_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getTuple1Access().getUrlURLParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_url_3_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple1Rule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:1974:3: ( (lv_value1_4_0= ruleText ) )
            // InternalLenguajegrafico.g:1975:4: (lv_value1_4_0= ruleText )
            {
            // InternalLenguajegrafico.g:1975:4: (lv_value1_4_0= ruleText )
            // InternalLenguajegrafico.g:1976:5: lv_value1_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getTuple1Access().getValue1TextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_value1_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple1Rule());
            					}
            					set(
            						current,
            						"value1",
            						lv_value1_4_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:1993:3: ( (lv_value2_5_0= ruleNumber ) )
            // InternalLenguajegrafico.g:1994:4: (lv_value2_5_0= ruleNumber )
            {
            // InternalLenguajegrafico.g:1994:4: (lv_value2_5_0= ruleNumber )
            // InternalLenguajegrafico.g:1995:5: lv_value2_5_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getTuple1Access().getValue2NumberParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_value2_5_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple1Rule());
            					}
            					set(
            						current,
            						"value2",
            						lv_value2_5_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTuple1Access().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple1"


    // $ANTLR start "entryRuleTuple2"
    // InternalLenguajegrafico.g:2020:1: entryRuleTuple2 returns [EObject current=null] : iv_ruleTuple2= ruleTuple2 EOF ;
    public final EObject entryRuleTuple2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple2 = null;


        try {
            // InternalLenguajegrafico.g:2020:47: (iv_ruleTuple2= ruleTuple2 EOF )
            // InternalLenguajegrafico.g:2021:2: iv_ruleTuple2= ruleTuple2 EOF
            {
             newCompositeNode(grammarAccess.getTuple2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuple2=ruleTuple2();

            state._fsp--;

             current =iv_ruleTuple2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple2"


    // $ANTLR start "ruleTuple2"
    // InternalLenguajegrafico.g:2027:1: ruleTuple2 returns [EObject current=null] : (otherlv_0= 'Tuple2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) ) ) ( (lv_value2_5_0= ruleNumber ) )+ otherlv_6= '}' ) ;
    public final EObject ruleTuple2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_url_3_0 = null;

        EObject lv_value1_4_1 = null;

        EObject lv_value1_4_2 = null;

        EObject lv_value2_5_0 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:2033:2: ( (otherlv_0= 'Tuple2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) ) ) ( (lv_value2_5_0= ruleNumber ) )+ otherlv_6= '}' ) )
            // InternalLenguajegrafico.g:2034:2: (otherlv_0= 'Tuple2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) ) ) ( (lv_value2_5_0= ruleNumber ) )+ otherlv_6= '}' )
            {
            // InternalLenguajegrafico.g:2034:2: (otherlv_0= 'Tuple2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) ) ) ( (lv_value2_5_0= ruleNumber ) )+ otherlv_6= '}' )
            // InternalLenguajegrafico.g:2035:3: otherlv_0= 'Tuple2' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) ) ) ( (lv_value2_5_0= ruleNumber ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTuple2Access().getTuple2Keyword_0());
            		
            // InternalLenguajegrafico.g:2039:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:2040:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:2040:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:2041:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTuple2Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTuple2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTuple2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:2061:3: ( (lv_url_3_0= ruleURL ) )
            // InternalLenguajegrafico.g:2062:4: (lv_url_3_0= ruleURL )
            {
            // InternalLenguajegrafico.g:2062:4: (lv_url_3_0= ruleURL )
            // InternalLenguajegrafico.g:2063:5: lv_url_3_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getTuple2Access().getUrlURLParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_url_3_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple2Rule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:2080:3: ( ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) ) )
            // InternalLenguajegrafico.g:2081:4: ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) )
            {
            // InternalLenguajegrafico.g:2081:4: ( (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber ) )
            // InternalLenguajegrafico.g:2082:5: (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber )
            {
            // InternalLenguajegrafico.g:2082:5: (lv_value1_4_1= ruleText | lv_value1_4_2= ruleNumber )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11) ) {
                alt25=1;
            }
            else if ( (LA25_0==12) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalLenguajegrafico.g:2083:6: lv_value1_4_1= ruleText
                    {

                    						newCompositeNode(grammarAccess.getTuple2Access().getValue1TextParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_value1_4_1=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTuple2Rule());
                    						}
                    						set(
                    							current,
                    							"value1",
                    							lv_value1_4_1,
                    							"org.uis.lenguajegrafico.Lenguajegrafico.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:2099:6: lv_value1_4_2= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getTuple2Access().getValue1NumberParserRuleCall_4_0_1());
                    					
                    pushFollow(FOLLOW_23);
                    lv_value1_4_2=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTuple2Rule());
                    						}
                    						set(
                    							current,
                    							"value1",
                    							lv_value1_4_2,
                    							"org.uis.lenguajegrafico.Lenguajegrafico.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalLenguajegrafico.g:2117:3: ( (lv_value2_5_0= ruleNumber ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLenguajegrafico.g:2118:4: (lv_value2_5_0= ruleNumber )
            	    {
            	    // InternalLenguajegrafico.g:2118:4: (lv_value2_5_0= ruleNumber )
            	    // InternalLenguajegrafico.g:2119:5: lv_value2_5_0= ruleNumber
            	    {

            	    					newCompositeNode(grammarAccess.getTuple2Access().getValue2NumberParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_value2_5_0=ruleNumber();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTuple2Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"value2",
            	    						lv_value2_5_0,
            	    						"org.uis.lenguajegrafico.Lenguajegrafico.Number");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_6=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTuple2Access().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple2"


    // $ANTLR start "entryRuleTuple3"
    // InternalLenguajegrafico.g:2144:1: entryRuleTuple3 returns [EObject current=null] : iv_ruleTuple3= ruleTuple3 EOF ;
    public final EObject entryRuleTuple3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple3 = null;


        try {
            // InternalLenguajegrafico.g:2144:47: (iv_ruleTuple3= ruleTuple3 EOF )
            // InternalLenguajegrafico.g:2145:2: iv_ruleTuple3= ruleTuple3 EOF
            {
             newCompositeNode(grammarAccess.getTuple3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuple3=ruleTuple3();

            state._fsp--;

             current =iv_ruleTuple3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple3"


    // $ANTLR start "ruleTuple3"
    // InternalLenguajegrafico.g:2151:1: ruleTuple3 returns [EObject current=null] : (otherlv_0= 'Tuple3' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleFloat ) ) ( (lv_value2_5_0= ruleFloat ) ) ( ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleTuple3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_url_3_0 = null;

        EObject lv_value1_4_0 = null;

        EObject lv_value2_5_0 = null;

        EObject lv_value3_6_1 = null;

        EObject lv_value3_6_2 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:2157:2: ( (otherlv_0= 'Tuple3' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleFloat ) ) ( (lv_value2_5_0= ruleFloat ) ) ( ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) ) ) otherlv_7= '}' ) )
            // InternalLenguajegrafico.g:2158:2: (otherlv_0= 'Tuple3' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleFloat ) ) ( (lv_value2_5_0= ruleFloat ) ) ( ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) ) ) otherlv_7= '}' )
            {
            // InternalLenguajegrafico.g:2158:2: (otherlv_0= 'Tuple3' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleFloat ) ) ( (lv_value2_5_0= ruleFloat ) ) ( ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) ) ) otherlv_7= '}' )
            // InternalLenguajegrafico.g:2159:3: otherlv_0= 'Tuple3' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_value1_4_0= ruleFloat ) ) ( (lv_value2_5_0= ruleFloat ) ) ( ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTuple3Access().getTuple3Keyword_0());
            		
            // InternalLenguajegrafico.g:2163:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:2164:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:2164:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:2165:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTuple3Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTuple3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTuple3Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:2185:3: ( (lv_url_3_0= ruleURL ) )
            // InternalLenguajegrafico.g:2186:4: (lv_url_3_0= ruleURL )
            {
            // InternalLenguajegrafico.g:2186:4: (lv_url_3_0= ruleURL )
            // InternalLenguajegrafico.g:2187:5: lv_url_3_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getTuple3Access().getUrlURLParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_url_3_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple3Rule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:2204:3: ( (lv_value1_4_0= ruleFloat ) )
            // InternalLenguajegrafico.g:2205:4: (lv_value1_4_0= ruleFloat )
            {
            // InternalLenguajegrafico.g:2205:4: (lv_value1_4_0= ruleFloat )
            // InternalLenguajegrafico.g:2206:5: lv_value1_4_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getTuple3Access().getValue1FloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_value1_4_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple3Rule());
            					}
            					set(
            						current,
            						"value1",
            						lv_value1_4_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:2223:3: ( (lv_value2_5_0= ruleFloat ) )
            // InternalLenguajegrafico.g:2224:4: (lv_value2_5_0= ruleFloat )
            {
            // InternalLenguajegrafico.g:2224:4: (lv_value2_5_0= ruleFloat )
            // InternalLenguajegrafico.g:2225:5: lv_value2_5_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getTuple3Access().getValue2FloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_value2_5_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple3Rule());
            					}
            					set(
            						current,
            						"value2",
            						lv_value2_5_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:2242:3: ( ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) ) )
            // InternalLenguajegrafico.g:2243:4: ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) )
            {
            // InternalLenguajegrafico.g:2243:4: ( (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber ) )
            // InternalLenguajegrafico.g:2244:5: (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber )
            {
            // InternalLenguajegrafico.g:2244:5: (lv_value3_6_1= ruleText | lv_value3_6_2= ruleNumber )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==11) ) {
                alt27=1;
            }
            else if ( (LA27_0==12) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalLenguajegrafico.g:2245:6: lv_value3_6_1= ruleText
                    {

                    						newCompositeNode(grammarAccess.getTuple3Access().getValue3TextParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_value3_6_1=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTuple3Rule());
                    						}
                    						set(
                    							current,
                    							"value3",
                    							lv_value3_6_1,
                    							"org.uis.lenguajegrafico.Lenguajegrafico.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:2261:6: lv_value3_6_2= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getTuple3Access().getValue3NumberParserRuleCall_6_0_1());
                    					
                    pushFollow(FOLLOW_24);
                    lv_value3_6_2=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTuple3Rule());
                    						}
                    						set(
                    							current,
                    							"value3",
                    							lv_value3_6_2,
                    							"org.uis.lenguajegrafico.Lenguajegrafico.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTuple3Access().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple3"


    // $ANTLR start "entryRuleTuple4"
    // InternalLenguajegrafico.g:2287:1: entryRuleTuple4 returns [EObject current=null] : iv_ruleTuple4= ruleTuple4 EOF ;
    public final EObject entryRuleTuple4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple4 = null;


        try {
            // InternalLenguajegrafico.g:2287:47: (iv_ruleTuple4= ruleTuple4 EOF )
            // InternalLenguajegrafico.g:2288:2: iv_ruleTuple4= ruleTuple4 EOF
            {
             newCompositeNode(grammarAccess.getTuple4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTuple4=ruleTuple4();

            state._fsp--;

             current =iv_ruleTuple4; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuple4"


    // $ANTLR start "ruleTuple4"
    // InternalLenguajegrafico.g:2294:1: ruleTuple4 returns [EObject current=null] : (otherlv_0= 'Tuple4' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_values_4_0= ruleDatatype ) )+ otherlv_5= '}' ) ;
    public final EObject ruleTuple4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_url_3_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:2300:2: ( (otherlv_0= 'Tuple4' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_values_4_0= ruleDatatype ) )+ otherlv_5= '}' ) )
            // InternalLenguajegrafico.g:2301:2: (otherlv_0= 'Tuple4' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_values_4_0= ruleDatatype ) )+ otherlv_5= '}' )
            {
            // InternalLenguajegrafico.g:2301:2: (otherlv_0= 'Tuple4' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_values_4_0= ruleDatatype ) )+ otherlv_5= '}' )
            // InternalLenguajegrafico.g:2302:3: otherlv_0= 'Tuple4' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_url_3_0= ruleURL ) ) ( (lv_values_4_0= ruleDatatype ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTuple4Access().getTuple4Keyword_0());
            		
            // InternalLenguajegrafico.g:2306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLenguajegrafico.g:2307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLenguajegrafico.g:2307:4: (lv_name_1_0= RULE_ID )
            // InternalLenguajegrafico.g:2308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTuple4Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTuple4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTuple4Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLenguajegrafico.g:2328:3: ( (lv_url_3_0= ruleURL ) )
            // InternalLenguajegrafico.g:2329:4: (lv_url_3_0= ruleURL )
            {
            // InternalLenguajegrafico.g:2329:4: (lv_url_3_0= ruleURL )
            // InternalLenguajegrafico.g:2330:5: lv_url_3_0= ruleURL
            {

            					newCompositeNode(grammarAccess.getTuple4Access().getUrlURLParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_url_3_0=ruleURL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTuple4Rule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.uis.lenguajegrafico.Lenguajegrafico.URL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLenguajegrafico.g:2347:3: ( (lv_values_4_0= ruleDatatype ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=11 && LA28_0<=13)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLenguajegrafico.g:2348:4: (lv_values_4_0= ruleDatatype )
            	    {
            	    // InternalLenguajegrafico.g:2348:4: (lv_values_4_0= ruleDatatype )
            	    // InternalLenguajegrafico.g:2349:5: lv_values_4_0= ruleDatatype
            	    {

            	    					newCompositeNode(grammarAccess.getTuple4Access().getValuesDatatypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_values_4_0=ruleDatatype();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTuple4Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_4_0,
            	    						"org.uis.lenguajegrafico.Lenguajegrafico.Datatype");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_5=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTuple4Access().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple4"


    // $ANTLR start "entryRuleConfiguration"
    // InternalLenguajegrafico.g:2374:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalLenguajegrafico.g:2374:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalLenguajegrafico.g:2375:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalLenguajegrafico.g:2381:1: ruleConfiguration returns [EObject current=null] : (this_CodeGeneratedTarget_0= ruleCodeGeneratedTarget | this_NormaliceData_1= ruleNormaliceData ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject this_CodeGeneratedTarget_0 = null;

        EObject this_NormaliceData_1 = null;



        	enterRule();

        try {
            // InternalLenguajegrafico.g:2387:2: ( (this_CodeGeneratedTarget_0= ruleCodeGeneratedTarget | this_NormaliceData_1= ruleNormaliceData ) )
            // InternalLenguajegrafico.g:2388:2: (this_CodeGeneratedTarget_0= ruleCodeGeneratedTarget | this_NormaliceData_1= ruleNormaliceData )
            {
            // InternalLenguajegrafico.g:2388:2: (this_CodeGeneratedTarget_0= ruleCodeGeneratedTarget | this_NormaliceData_1= ruleNormaliceData )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            else if ( (LA29_0==62) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalLenguajegrafico.g:2389:3: this_CodeGeneratedTarget_0= ruleCodeGeneratedTarget
                    {

                    			newCompositeNode(grammarAccess.getConfigurationAccess().getCodeGeneratedTargetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeGeneratedTarget_0=ruleCodeGeneratedTarget();

                    state._fsp--;


                    			current = this_CodeGeneratedTarget_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:2398:3: this_NormaliceData_1= ruleNormaliceData
                    {

                    			newCompositeNode(grammarAccess.getConfigurationAccess().getNormaliceDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NormaliceData_1=ruleNormaliceData();

                    state._fsp--;


                    			current = this_NormaliceData_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleCodeGeneratedTarget"
    // InternalLenguajegrafico.g:2410:1: entryRuleCodeGeneratedTarget returns [EObject current=null] : iv_ruleCodeGeneratedTarget= ruleCodeGeneratedTarget EOF ;
    public final EObject entryRuleCodeGeneratedTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeGeneratedTarget = null;


        try {
            // InternalLenguajegrafico.g:2410:60: (iv_ruleCodeGeneratedTarget= ruleCodeGeneratedTarget EOF )
            // InternalLenguajegrafico.g:2411:2: iv_ruleCodeGeneratedTarget= ruleCodeGeneratedTarget EOF
            {
             newCompositeNode(grammarAccess.getCodeGeneratedTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeGeneratedTarget=ruleCodeGeneratedTarget();

            state._fsp--;

             current =iv_ruleCodeGeneratedTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeGeneratedTarget"


    // $ANTLR start "ruleCodeGeneratedTarget"
    // InternalLenguajegrafico.g:2417:1: ruleCodeGeneratedTarget returns [EObject current=null] : (otherlv_0= 'CodeGeneratedTarget' otherlv_1= '.' ( ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) ) ) ) ;
    public final EObject ruleCodeGeneratedTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token lv_value_2_3=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:2423:2: ( (otherlv_0= 'CodeGeneratedTarget' otherlv_1= '.' ( ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) ) ) ) )
            // InternalLenguajegrafico.g:2424:2: (otherlv_0= 'CodeGeneratedTarget' otherlv_1= '.' ( ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) ) ) )
            {
            // InternalLenguajegrafico.g:2424:2: (otherlv_0= 'CodeGeneratedTarget' otherlv_1= '.' ( ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) ) ) )
            // InternalLenguajegrafico.g:2425:3: otherlv_0= 'CodeGeneratedTarget' otherlv_1= '.' ( ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeGeneratedTargetAccess().getCodeGeneratedTargetKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCodeGeneratedTargetAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:2433:3: ( ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) ) )
            // InternalLenguajegrafico.g:2434:4: ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) )
            {
            // InternalLenguajegrafico.g:2434:4: ( (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' ) )
            // InternalLenguajegrafico.g:2435:5: (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' )
            {
            // InternalLenguajegrafico.g:2435:5: (lv_value_2_1= 'All' | lv_value_2_2= 'Web' | lv_value_2_3= 'Python' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt30=1;
                }
                break;
            case 60:
                {
                alt30=2;
                }
                break;
            case 61:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalLenguajegrafico.g:2436:6: lv_value_2_1= 'All'
                    {
                    lv_value_2_1=(Token)match(input,59,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getCodeGeneratedTargetAccess().getValueAllKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeGeneratedTargetRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:2447:6: lv_value_2_2= 'Web'
                    {
                    lv_value_2_2=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getCodeGeneratedTargetAccess().getValueWebKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeGeneratedTargetRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:2458:6: lv_value_2_3= 'Python'
                    {
                    lv_value_2_3=(Token)match(input,61,FOLLOW_2); 

                    						newLeafNode(lv_value_2_3, grammarAccess.getCodeGeneratedTargetAccess().getValuePythonKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeGeneratedTargetRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_3, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeGeneratedTarget"


    // $ANTLR start "entryRuleNormaliceData"
    // InternalLenguajegrafico.g:2475:1: entryRuleNormaliceData returns [EObject current=null] : iv_ruleNormaliceData= ruleNormaliceData EOF ;
    public final EObject entryRuleNormaliceData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormaliceData = null;


        try {
            // InternalLenguajegrafico.g:2475:54: (iv_ruleNormaliceData= ruleNormaliceData EOF )
            // InternalLenguajegrafico.g:2476:2: iv_ruleNormaliceData= ruleNormaliceData EOF
            {
             newCompositeNode(grammarAccess.getNormaliceDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormaliceData=ruleNormaliceData();

            state._fsp--;

             current =iv_ruleNormaliceData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormaliceData"


    // $ANTLR start "ruleNormaliceData"
    // InternalLenguajegrafico.g:2482:1: ruleNormaliceData returns [EObject current=null] : (otherlv_0= 'NormaliceData' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) ;
    public final EObject ruleNormaliceData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalLenguajegrafico.g:2488:2: ( (otherlv_0= 'NormaliceData' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) ) )
            // InternalLenguajegrafico.g:2489:2: (otherlv_0= 'NormaliceData' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            {
            // InternalLenguajegrafico.g:2489:2: (otherlv_0= 'NormaliceData' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) ) )
            // InternalLenguajegrafico.g:2490:3: otherlv_0= 'NormaliceData' otherlv_1= '.' ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNormaliceDataAccess().getNormaliceDataKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNormaliceDataAccess().getFullStopKeyword_1());
            		
            // InternalLenguajegrafico.g:2498:3: ( ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) ) )
            // InternalLenguajegrafico.g:2499:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            {
            // InternalLenguajegrafico.g:2499:4: ( (lv_value_2_1= 'True' | lv_value_2_2= 'False' ) )
            // InternalLenguajegrafico.g:2500:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            {
            // InternalLenguajegrafico.g:2500:5: (lv_value_2_1= 'True' | lv_value_2_2= 'False' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            else if ( (LA31_0==22) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalLenguajegrafico.g:2501:6: lv_value_2_1= 'True'
                    {
                    lv_value_2_1=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getNormaliceDataAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNormaliceDataRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:2512:6: lv_value_2_2= 'False'
                    {
                    lv_value_2_2=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getNormaliceDataAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNormaliceDataRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormaliceData"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x47FE400000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001008000890000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00010080018F0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00010080088F0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001008230890000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000003800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3800000000000000L});

}