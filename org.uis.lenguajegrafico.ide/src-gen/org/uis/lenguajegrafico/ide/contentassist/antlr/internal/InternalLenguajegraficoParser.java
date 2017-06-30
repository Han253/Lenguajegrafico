package org.uis.lenguajegrafico.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.uis.lenguajegrafico.services.LenguajegraficoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLenguajegraficoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'True'", "'False'", "'Horizontal'", "'Vertical'", "'Normal'", "'Group'", "'MagnitudeCircle'", "'general'", "'roadmap'", "'terrain'", "'satellite'", "'hybrid'", "'1x1'", "'1x2'", "'1x3'", "'2x1'", "'2x2'", "'3x3'", "'All'", "'Web'", "'Python'", "'String'", "'Number'", "'Float'", "'URL'", "'='", "'Title'", "'Label_x'", "'Label_y'", "'Legend'", "'.'", "'Hole'", "'Orientation'", "'Area'", "'ZoomLevel'", "'MakerType'", "'MapType'", "'CellSize'", "'PieChart'", "'{'", "'}'", "'BarChart'", "'LineChart'", "'MapChart'", "'TableChart'", "'DashBoard'", "'Tuple1'", "'Tuple2'", "'Tuple3'", "'Tuple4'", "'CodeGeneratedTarget'", "'NormaliceData'"
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

    	public void setGrammarAccess(LenguajegraficoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLenguajegrafico"
    // InternalLenguajegrafico.g:53:1: entryRuleLenguajegrafico : ruleLenguajegrafico EOF ;
    public final void entryRuleLenguajegrafico() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:54:1: ( ruleLenguajegrafico EOF )
            // InternalLenguajegrafico.g:55:1: ruleLenguajegrafico EOF
            {
             before(grammarAccess.getLenguajegraficoRule()); 
            pushFollow(FOLLOW_1);
            ruleLenguajegrafico();

            state._fsp--;

             after(grammarAccess.getLenguajegraficoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLenguajegrafico"


    // $ANTLR start "ruleLenguajegrafico"
    // InternalLenguajegrafico.g:62:1: ruleLenguajegrafico : ( ( rule__Lenguajegrafico__ElementsAssignment )* ) ;
    public final void ruleLenguajegrafico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:66:2: ( ( ( rule__Lenguajegrafico__ElementsAssignment )* ) )
            // InternalLenguajegrafico.g:67:2: ( ( rule__Lenguajegrafico__ElementsAssignment )* )
            {
            // InternalLenguajegrafico.g:67:2: ( ( rule__Lenguajegrafico__ElementsAssignment )* )
            // InternalLenguajegrafico.g:68:3: ( rule__Lenguajegrafico__ElementsAssignment )*
            {
             before(grammarAccess.getLenguajegraficoAccess().getElementsAssignment()); 
            // InternalLenguajegrafico.g:69:3: ( rule__Lenguajegrafico__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==49||(LA1_0>=52 && LA1_0<=62)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLenguajegrafico.g:69:4: rule__Lenguajegrafico__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Lenguajegrafico__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLenguajegraficoAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLenguajegrafico"


    // $ANTLR start "entryRuleElement"
    // InternalLenguajegrafico.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:79:1: ( ruleElement EOF )
            // InternalLenguajegrafico.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalLenguajegrafico.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalLenguajegrafico.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalLenguajegrafico.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalLenguajegrafico.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalLenguajegrafico.g:94:3: ( rule__Element__Alternatives )
            // InternalLenguajegrafico.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDatatype"
    // InternalLenguajegrafico.g:103:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:104:1: ( ruleDatatype EOF )
            // InternalLenguajegrafico.g:105:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalLenguajegrafico.g:112:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:116:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalLenguajegrafico.g:117:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalLenguajegrafico.g:117:2: ( ( rule__Datatype__Alternatives ) )
            // InternalLenguajegrafico.g:118:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalLenguajegrafico.g:119:3: ( rule__Datatype__Alternatives )
            // InternalLenguajegrafico.g:119:4: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleChart"
    // InternalLenguajegrafico.g:128:1: entryRuleChart : ruleChart EOF ;
    public final void entryRuleChart() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:129:1: ( ruleChart EOF )
            // InternalLenguajegrafico.g:130:1: ruleChart EOF
            {
             before(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            ruleChart();

            state._fsp--;

             after(grammarAccess.getChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalLenguajegrafico.g:137:1: ruleChart : ( ( rule__Chart__Alternatives ) ) ;
    public final void ruleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:141:2: ( ( ( rule__Chart__Alternatives ) ) )
            // InternalLenguajegrafico.g:142:2: ( ( rule__Chart__Alternatives ) )
            {
            // InternalLenguajegrafico.g:142:2: ( ( rule__Chart__Alternatives ) )
            // InternalLenguajegrafico.g:143:3: ( rule__Chart__Alternatives )
            {
             before(grammarAccess.getChartAccess().getAlternatives()); 
            // InternalLenguajegrafico.g:144:3: ( rule__Chart__Alternatives )
            // InternalLenguajegrafico.g:144:4: rule__Chart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Chart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleTuple"
    // InternalLenguajegrafico.g:153:1: entryRuleTuple : ruleTuple EOF ;
    public final void entryRuleTuple() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:154:1: ( ruleTuple EOF )
            // InternalLenguajegrafico.g:155:1: ruleTuple EOF
            {
             before(grammarAccess.getTupleRule()); 
            pushFollow(FOLLOW_1);
            ruleTuple();

            state._fsp--;

             after(grammarAccess.getTupleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // InternalLenguajegrafico.g:162:1: ruleTuple : ( ( rule__Tuple__Alternatives ) ) ;
    public final void ruleTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:166:2: ( ( ( rule__Tuple__Alternatives ) ) )
            // InternalLenguajegrafico.g:167:2: ( ( rule__Tuple__Alternatives ) )
            {
            // InternalLenguajegrafico.g:167:2: ( ( rule__Tuple__Alternatives ) )
            // InternalLenguajegrafico.g:168:3: ( rule__Tuple__Alternatives )
            {
             before(grammarAccess.getTupleAccess().getAlternatives()); 
            // InternalLenguajegrafico.g:169:3: ( rule__Tuple__Alternatives )
            // InternalLenguajegrafico.g:169:4: rule__Tuple__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tuple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTupleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRuleText"
    // InternalLenguajegrafico.g:178:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:179:1: ( ruleText EOF )
            // InternalLenguajegrafico.g:180:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalLenguajegrafico.g:187:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:191:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalLenguajegrafico.g:192:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalLenguajegrafico.g:192:2: ( ( rule__Text__Group__0 ) )
            // InternalLenguajegrafico.g:193:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalLenguajegrafico.g:194:3: ( rule__Text__Group__0 )
            // InternalLenguajegrafico.g:194:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNumber"
    // InternalLenguajegrafico.g:203:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:204:1: ( ruleNumber EOF )
            // InternalLenguajegrafico.g:205:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalLenguajegrafico.g:212:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:216:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalLenguajegrafico.g:217:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalLenguajegrafico.g:217:2: ( ( rule__Number__Group__0 ) )
            // InternalLenguajegrafico.g:218:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalLenguajegrafico.g:219:3: ( rule__Number__Group__0 )
            // InternalLenguajegrafico.g:219:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFloat"
    // InternalLenguajegrafico.g:228:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:229:1: ( ruleFloat EOF )
            // InternalLenguajegrafico.g:230:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalLenguajegrafico.g:237:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:241:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalLenguajegrafico.g:242:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalLenguajegrafico.g:242:2: ( ( rule__Float__Group__0 ) )
            // InternalLenguajegrafico.g:243:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalLenguajegrafico.g:244:3: ( rule__Float__Group__0 )
            // InternalLenguajegrafico.g:244:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleURL"
    // InternalLenguajegrafico.g:253:1: entryRuleURL : ruleURL EOF ;
    public final void entryRuleURL() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:254:1: ( ruleURL EOF )
            // InternalLenguajegrafico.g:255:1: ruleURL EOF
            {
             before(grammarAccess.getURLRule()); 
            pushFollow(FOLLOW_1);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getURLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalLenguajegrafico.g:262:1: ruleURL : ( ( rule__URL__Group__0 ) ) ;
    public final void ruleURL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:266:2: ( ( ( rule__URL__Group__0 ) ) )
            // InternalLenguajegrafico.g:267:2: ( ( rule__URL__Group__0 ) )
            {
            // InternalLenguajegrafico.g:267:2: ( ( rule__URL__Group__0 ) )
            // InternalLenguajegrafico.g:268:3: ( rule__URL__Group__0 )
            {
             before(grammarAccess.getURLAccess().getGroup()); 
            // InternalLenguajegrafico.g:269:3: ( rule__URL__Group__0 )
            // InternalLenguajegrafico.g:269:4: rule__URL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURL"


    // $ANTLR start "entryRuleTitle"
    // InternalLenguajegrafico.g:278:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:279:1: ( ruleTitle EOF )
            // InternalLenguajegrafico.g:280:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalLenguajegrafico.g:287:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:291:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalLenguajegrafico.g:292:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalLenguajegrafico.g:292:2: ( ( rule__Title__Group__0 ) )
            // InternalLenguajegrafico.g:293:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalLenguajegrafico.g:294:3: ( rule__Title__Group__0 )
            // InternalLenguajegrafico.g:294:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleLabelx"
    // InternalLenguajegrafico.g:303:1: entryRuleLabelx : ruleLabelx EOF ;
    public final void entryRuleLabelx() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:304:1: ( ruleLabelx EOF )
            // InternalLenguajegrafico.g:305:1: ruleLabelx EOF
            {
             before(grammarAccess.getLabelxRule()); 
            pushFollow(FOLLOW_1);
            ruleLabelx();

            state._fsp--;

             after(grammarAccess.getLabelxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabelx"


    // $ANTLR start "ruleLabelx"
    // InternalLenguajegrafico.g:312:1: ruleLabelx : ( ( rule__Labelx__Group__0 ) ) ;
    public final void ruleLabelx() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:316:2: ( ( ( rule__Labelx__Group__0 ) ) )
            // InternalLenguajegrafico.g:317:2: ( ( rule__Labelx__Group__0 ) )
            {
            // InternalLenguajegrafico.g:317:2: ( ( rule__Labelx__Group__0 ) )
            // InternalLenguajegrafico.g:318:3: ( rule__Labelx__Group__0 )
            {
             before(grammarAccess.getLabelxAccess().getGroup()); 
            // InternalLenguajegrafico.g:319:3: ( rule__Labelx__Group__0 )
            // InternalLenguajegrafico.g:319:4: rule__Labelx__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Labelx__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabelx"


    // $ANTLR start "entryRuleLabely"
    // InternalLenguajegrafico.g:328:1: entryRuleLabely : ruleLabely EOF ;
    public final void entryRuleLabely() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:329:1: ( ruleLabely EOF )
            // InternalLenguajegrafico.g:330:1: ruleLabely EOF
            {
             before(grammarAccess.getLabelyRule()); 
            pushFollow(FOLLOW_1);
            ruleLabely();

            state._fsp--;

             after(grammarAccess.getLabelyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabely"


    // $ANTLR start "ruleLabely"
    // InternalLenguajegrafico.g:337:1: ruleLabely : ( ( rule__Labely__Group__0 ) ) ;
    public final void ruleLabely() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:341:2: ( ( ( rule__Labely__Group__0 ) ) )
            // InternalLenguajegrafico.g:342:2: ( ( rule__Labely__Group__0 ) )
            {
            // InternalLenguajegrafico.g:342:2: ( ( rule__Labely__Group__0 ) )
            // InternalLenguajegrafico.g:343:3: ( rule__Labely__Group__0 )
            {
             before(grammarAccess.getLabelyAccess().getGroup()); 
            // InternalLenguajegrafico.g:344:3: ( rule__Labely__Group__0 )
            // InternalLenguajegrafico.g:344:4: rule__Labely__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Labely__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabely"


    // $ANTLR start "entryRuleLegend"
    // InternalLenguajegrafico.g:353:1: entryRuleLegend : ruleLegend EOF ;
    public final void entryRuleLegend() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:354:1: ( ruleLegend EOF )
            // InternalLenguajegrafico.g:355:1: ruleLegend EOF
            {
             before(grammarAccess.getLegendRule()); 
            pushFollow(FOLLOW_1);
            ruleLegend();

            state._fsp--;

             after(grammarAccess.getLegendRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLegend"


    // $ANTLR start "ruleLegend"
    // InternalLenguajegrafico.g:362:1: ruleLegend : ( ( rule__Legend__Group__0 ) ) ;
    public final void ruleLegend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:366:2: ( ( ( rule__Legend__Group__0 ) ) )
            // InternalLenguajegrafico.g:367:2: ( ( rule__Legend__Group__0 ) )
            {
            // InternalLenguajegrafico.g:367:2: ( ( rule__Legend__Group__0 ) )
            // InternalLenguajegrafico.g:368:3: ( rule__Legend__Group__0 )
            {
             before(grammarAccess.getLegendAccess().getGroup()); 
            // InternalLenguajegrafico.g:369:3: ( rule__Legend__Group__0 )
            // InternalLenguajegrafico.g:369:4: rule__Legend__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Legend__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLegendAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLegend"


    // $ANTLR start "entryRuleHole"
    // InternalLenguajegrafico.g:378:1: entryRuleHole : ruleHole EOF ;
    public final void entryRuleHole() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:379:1: ( ruleHole EOF )
            // InternalLenguajegrafico.g:380:1: ruleHole EOF
            {
             before(grammarAccess.getHoleRule()); 
            pushFollow(FOLLOW_1);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getHoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHole"


    // $ANTLR start "ruleHole"
    // InternalLenguajegrafico.g:387:1: ruleHole : ( ( rule__Hole__Group__0 ) ) ;
    public final void ruleHole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:391:2: ( ( ( rule__Hole__Group__0 ) ) )
            // InternalLenguajegrafico.g:392:2: ( ( rule__Hole__Group__0 ) )
            {
            // InternalLenguajegrafico.g:392:2: ( ( rule__Hole__Group__0 ) )
            // InternalLenguajegrafico.g:393:3: ( rule__Hole__Group__0 )
            {
             before(grammarAccess.getHoleAccess().getGroup()); 
            // InternalLenguajegrafico.g:394:3: ( rule__Hole__Group__0 )
            // InternalLenguajegrafico.g:394:4: rule__Hole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHole"


    // $ANTLR start "entryRuleOrientation"
    // InternalLenguajegrafico.g:403:1: entryRuleOrientation : ruleOrientation EOF ;
    public final void entryRuleOrientation() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:404:1: ( ruleOrientation EOF )
            // InternalLenguajegrafico.g:405:1: ruleOrientation EOF
            {
             before(grammarAccess.getOrientationRule()); 
            pushFollow(FOLLOW_1);
            ruleOrientation();

            state._fsp--;

             after(grammarAccess.getOrientationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrientation"


    // $ANTLR start "ruleOrientation"
    // InternalLenguajegrafico.g:412:1: ruleOrientation : ( ( rule__Orientation__Group__0 ) ) ;
    public final void ruleOrientation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:416:2: ( ( ( rule__Orientation__Group__0 ) ) )
            // InternalLenguajegrafico.g:417:2: ( ( rule__Orientation__Group__0 ) )
            {
            // InternalLenguajegrafico.g:417:2: ( ( rule__Orientation__Group__0 ) )
            // InternalLenguajegrafico.g:418:3: ( rule__Orientation__Group__0 )
            {
             before(grammarAccess.getOrientationAccess().getGroup()); 
            // InternalLenguajegrafico.g:419:3: ( rule__Orientation__Group__0 )
            // InternalLenguajegrafico.g:419:4: rule__Orientation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Orientation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrientationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrientation"


    // $ANTLR start "entryRuleArea"
    // InternalLenguajegrafico.g:428:1: entryRuleArea : ruleArea EOF ;
    public final void entryRuleArea() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:429:1: ( ruleArea EOF )
            // InternalLenguajegrafico.g:430:1: ruleArea EOF
            {
             before(grammarAccess.getAreaRule()); 
            pushFollow(FOLLOW_1);
            ruleArea();

            state._fsp--;

             after(grammarAccess.getAreaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArea"


    // $ANTLR start "ruleArea"
    // InternalLenguajegrafico.g:437:1: ruleArea : ( ( rule__Area__Group__0 ) ) ;
    public final void ruleArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:441:2: ( ( ( rule__Area__Group__0 ) ) )
            // InternalLenguajegrafico.g:442:2: ( ( rule__Area__Group__0 ) )
            {
            // InternalLenguajegrafico.g:442:2: ( ( rule__Area__Group__0 ) )
            // InternalLenguajegrafico.g:443:3: ( rule__Area__Group__0 )
            {
             before(grammarAccess.getAreaAccess().getGroup()); 
            // InternalLenguajegrafico.g:444:3: ( rule__Area__Group__0 )
            // InternalLenguajegrafico.g:444:4: rule__Area__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArea"


    // $ANTLR start "entryRuleZoomLevel"
    // InternalLenguajegrafico.g:453:1: entryRuleZoomLevel : ruleZoomLevel EOF ;
    public final void entryRuleZoomLevel() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:454:1: ( ruleZoomLevel EOF )
            // InternalLenguajegrafico.g:455:1: ruleZoomLevel EOF
            {
             before(grammarAccess.getZoomLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleZoomLevel();

            state._fsp--;

             after(grammarAccess.getZoomLevelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZoomLevel"


    // $ANTLR start "ruleZoomLevel"
    // InternalLenguajegrafico.g:462:1: ruleZoomLevel : ( ( rule__ZoomLevel__Group__0 ) ) ;
    public final void ruleZoomLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:466:2: ( ( ( rule__ZoomLevel__Group__0 ) ) )
            // InternalLenguajegrafico.g:467:2: ( ( rule__ZoomLevel__Group__0 ) )
            {
            // InternalLenguajegrafico.g:467:2: ( ( rule__ZoomLevel__Group__0 ) )
            // InternalLenguajegrafico.g:468:3: ( rule__ZoomLevel__Group__0 )
            {
             before(grammarAccess.getZoomLevelAccess().getGroup()); 
            // InternalLenguajegrafico.g:469:3: ( rule__ZoomLevel__Group__0 )
            // InternalLenguajegrafico.g:469:4: rule__ZoomLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ZoomLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZoomLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZoomLevel"


    // $ANTLR start "entryRuleMakerType"
    // InternalLenguajegrafico.g:478:1: entryRuleMakerType : ruleMakerType EOF ;
    public final void entryRuleMakerType() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:479:1: ( ruleMakerType EOF )
            // InternalLenguajegrafico.g:480:1: ruleMakerType EOF
            {
             before(grammarAccess.getMakerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMakerType();

            state._fsp--;

             after(grammarAccess.getMakerTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMakerType"


    // $ANTLR start "ruleMakerType"
    // InternalLenguajegrafico.g:487:1: ruleMakerType : ( ( rule__MakerType__Group__0 ) ) ;
    public final void ruleMakerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:491:2: ( ( ( rule__MakerType__Group__0 ) ) )
            // InternalLenguajegrafico.g:492:2: ( ( rule__MakerType__Group__0 ) )
            {
            // InternalLenguajegrafico.g:492:2: ( ( rule__MakerType__Group__0 ) )
            // InternalLenguajegrafico.g:493:3: ( rule__MakerType__Group__0 )
            {
             before(grammarAccess.getMakerTypeAccess().getGroup()); 
            // InternalLenguajegrafico.g:494:3: ( rule__MakerType__Group__0 )
            // InternalLenguajegrafico.g:494:4: rule__MakerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MakerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMakerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMakerType"


    // $ANTLR start "entryRuleMapType"
    // InternalLenguajegrafico.g:503:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:504:1: ( ruleMapType EOF )
            // InternalLenguajegrafico.g:505:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalLenguajegrafico.g:512:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:516:2: ( ( ( rule__MapType__Group__0 ) ) )
            // InternalLenguajegrafico.g:517:2: ( ( rule__MapType__Group__0 ) )
            {
            // InternalLenguajegrafico.g:517:2: ( ( rule__MapType__Group__0 ) )
            // InternalLenguajegrafico.g:518:3: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // InternalLenguajegrafico.g:519:3: ( rule__MapType__Group__0 )
            // InternalLenguajegrafico.g:519:4: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleCellSize"
    // InternalLenguajegrafico.g:528:1: entryRuleCellSize : ruleCellSize EOF ;
    public final void entryRuleCellSize() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:529:1: ( ruleCellSize EOF )
            // InternalLenguajegrafico.g:530:1: ruleCellSize EOF
            {
             before(grammarAccess.getCellSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleCellSize();

            state._fsp--;

             after(grammarAccess.getCellSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellSize"


    // $ANTLR start "ruleCellSize"
    // InternalLenguajegrafico.g:537:1: ruleCellSize : ( ( rule__CellSize__Group__0 ) ) ;
    public final void ruleCellSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:541:2: ( ( ( rule__CellSize__Group__0 ) ) )
            // InternalLenguajegrafico.g:542:2: ( ( rule__CellSize__Group__0 ) )
            {
            // InternalLenguajegrafico.g:542:2: ( ( rule__CellSize__Group__0 ) )
            // InternalLenguajegrafico.g:543:3: ( rule__CellSize__Group__0 )
            {
             before(grammarAccess.getCellSizeAccess().getGroup()); 
            // InternalLenguajegrafico.g:544:3: ( rule__CellSize__Group__0 )
            // InternalLenguajegrafico.g:544:4: rule__CellSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellSize"


    // $ANTLR start "entryRulePieChart"
    // InternalLenguajegrafico.g:553:1: entryRulePieChart : rulePieChart EOF ;
    public final void entryRulePieChart() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:554:1: ( rulePieChart EOF )
            // InternalLenguajegrafico.g:555:1: rulePieChart EOF
            {
             before(grammarAccess.getPieChartRule()); 
            pushFollow(FOLLOW_1);
            rulePieChart();

            state._fsp--;

             after(grammarAccess.getPieChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePieChart"


    // $ANTLR start "rulePieChart"
    // InternalLenguajegrafico.g:562:1: rulePieChart : ( ( rule__PieChart__Group__0 ) ) ;
    public final void rulePieChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:566:2: ( ( ( rule__PieChart__Group__0 ) ) )
            // InternalLenguajegrafico.g:567:2: ( ( rule__PieChart__Group__0 ) )
            {
            // InternalLenguajegrafico.g:567:2: ( ( rule__PieChart__Group__0 ) )
            // InternalLenguajegrafico.g:568:3: ( rule__PieChart__Group__0 )
            {
             before(grammarAccess.getPieChartAccess().getGroup()); 
            // InternalLenguajegrafico.g:569:3: ( rule__PieChart__Group__0 )
            // InternalLenguajegrafico.g:569:4: rule__PieChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePieChart"


    // $ANTLR start "entryRuleBarChart"
    // InternalLenguajegrafico.g:578:1: entryRuleBarChart : ruleBarChart EOF ;
    public final void entryRuleBarChart() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:579:1: ( ruleBarChart EOF )
            // InternalLenguajegrafico.g:580:1: ruleBarChart EOF
            {
             before(grammarAccess.getBarChartRule()); 
            pushFollow(FOLLOW_1);
            ruleBarChart();

            state._fsp--;

             after(grammarAccess.getBarChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBarChart"


    // $ANTLR start "ruleBarChart"
    // InternalLenguajegrafico.g:587:1: ruleBarChart : ( ( rule__BarChart__Group__0 ) ) ;
    public final void ruleBarChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:591:2: ( ( ( rule__BarChart__Group__0 ) ) )
            // InternalLenguajegrafico.g:592:2: ( ( rule__BarChart__Group__0 ) )
            {
            // InternalLenguajegrafico.g:592:2: ( ( rule__BarChart__Group__0 ) )
            // InternalLenguajegrafico.g:593:3: ( rule__BarChart__Group__0 )
            {
             before(grammarAccess.getBarChartAccess().getGroup()); 
            // InternalLenguajegrafico.g:594:3: ( rule__BarChart__Group__0 )
            // InternalLenguajegrafico.g:594:4: rule__BarChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarChart"


    // $ANTLR start "entryRuleLineChart"
    // InternalLenguajegrafico.g:603:1: entryRuleLineChart : ruleLineChart EOF ;
    public final void entryRuleLineChart() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:604:1: ( ruleLineChart EOF )
            // InternalLenguajegrafico.g:605:1: ruleLineChart EOF
            {
             before(grammarAccess.getLineChartRule()); 
            pushFollow(FOLLOW_1);
            ruleLineChart();

            state._fsp--;

             after(grammarAccess.getLineChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineChart"


    // $ANTLR start "ruleLineChart"
    // InternalLenguajegrafico.g:612:1: ruleLineChart : ( ( rule__LineChart__Group__0 ) ) ;
    public final void ruleLineChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:616:2: ( ( ( rule__LineChart__Group__0 ) ) )
            // InternalLenguajegrafico.g:617:2: ( ( rule__LineChart__Group__0 ) )
            {
            // InternalLenguajegrafico.g:617:2: ( ( rule__LineChart__Group__0 ) )
            // InternalLenguajegrafico.g:618:3: ( rule__LineChart__Group__0 )
            {
             before(grammarAccess.getLineChartAccess().getGroup()); 
            // InternalLenguajegrafico.g:619:3: ( rule__LineChart__Group__0 )
            // InternalLenguajegrafico.g:619:4: rule__LineChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineChart"


    // $ANTLR start "entryRuleMapChart"
    // InternalLenguajegrafico.g:628:1: entryRuleMapChart : ruleMapChart EOF ;
    public final void entryRuleMapChart() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:629:1: ( ruleMapChart EOF )
            // InternalLenguajegrafico.g:630:1: ruleMapChart EOF
            {
             before(grammarAccess.getMapChartRule()); 
            pushFollow(FOLLOW_1);
            ruleMapChart();

            state._fsp--;

             after(grammarAccess.getMapChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapChart"


    // $ANTLR start "ruleMapChart"
    // InternalLenguajegrafico.g:637:1: ruleMapChart : ( ( rule__MapChart__Group__0 ) ) ;
    public final void ruleMapChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:641:2: ( ( ( rule__MapChart__Group__0 ) ) )
            // InternalLenguajegrafico.g:642:2: ( ( rule__MapChart__Group__0 ) )
            {
            // InternalLenguajegrafico.g:642:2: ( ( rule__MapChart__Group__0 ) )
            // InternalLenguajegrafico.g:643:3: ( rule__MapChart__Group__0 )
            {
             before(grammarAccess.getMapChartAccess().getGroup()); 
            // InternalLenguajegrafico.g:644:3: ( rule__MapChart__Group__0 )
            // InternalLenguajegrafico.g:644:4: rule__MapChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MapChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapChart"


    // $ANTLR start "entryRuleTableChart"
    // InternalLenguajegrafico.g:653:1: entryRuleTableChart : ruleTableChart EOF ;
    public final void entryRuleTableChart() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:654:1: ( ruleTableChart EOF )
            // InternalLenguajegrafico.g:655:1: ruleTableChart EOF
            {
             before(grammarAccess.getTableChartRule()); 
            pushFollow(FOLLOW_1);
            ruleTableChart();

            state._fsp--;

             after(grammarAccess.getTableChartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableChart"


    // $ANTLR start "ruleTableChart"
    // InternalLenguajegrafico.g:662:1: ruleTableChart : ( ( rule__TableChart__Group__0 ) ) ;
    public final void ruleTableChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:666:2: ( ( ( rule__TableChart__Group__0 ) ) )
            // InternalLenguajegrafico.g:667:2: ( ( rule__TableChart__Group__0 ) )
            {
            // InternalLenguajegrafico.g:667:2: ( ( rule__TableChart__Group__0 ) )
            // InternalLenguajegrafico.g:668:3: ( rule__TableChart__Group__0 )
            {
             before(grammarAccess.getTableChartAccess().getGroup()); 
            // InternalLenguajegrafico.g:669:3: ( rule__TableChart__Group__0 )
            // InternalLenguajegrafico.g:669:4: rule__TableChart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableChart"


    // $ANTLR start "entryRuleDashBoard"
    // InternalLenguajegrafico.g:678:1: entryRuleDashBoard : ruleDashBoard EOF ;
    public final void entryRuleDashBoard() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:679:1: ( ruleDashBoard EOF )
            // InternalLenguajegrafico.g:680:1: ruleDashBoard EOF
            {
             before(grammarAccess.getDashBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleDashBoard();

            state._fsp--;

             after(grammarAccess.getDashBoardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDashBoard"


    // $ANTLR start "ruleDashBoard"
    // InternalLenguajegrafico.g:687:1: ruleDashBoard : ( ( rule__DashBoard__Group__0 ) ) ;
    public final void ruleDashBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:691:2: ( ( ( rule__DashBoard__Group__0 ) ) )
            // InternalLenguajegrafico.g:692:2: ( ( rule__DashBoard__Group__0 ) )
            {
            // InternalLenguajegrafico.g:692:2: ( ( rule__DashBoard__Group__0 ) )
            // InternalLenguajegrafico.g:693:3: ( rule__DashBoard__Group__0 )
            {
             before(grammarAccess.getDashBoardAccess().getGroup()); 
            // InternalLenguajegrafico.g:694:3: ( rule__DashBoard__Group__0 )
            // InternalLenguajegrafico.g:694:4: rule__DashBoard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDashBoard"


    // $ANTLR start "entryRuleTuple1"
    // InternalLenguajegrafico.g:703:1: entryRuleTuple1 : ruleTuple1 EOF ;
    public final void entryRuleTuple1() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:704:1: ( ruleTuple1 EOF )
            // InternalLenguajegrafico.g:705:1: ruleTuple1 EOF
            {
             before(grammarAccess.getTuple1Rule()); 
            pushFollow(FOLLOW_1);
            ruleTuple1();

            state._fsp--;

             after(grammarAccess.getTuple1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuple1"


    // $ANTLR start "ruleTuple1"
    // InternalLenguajegrafico.g:712:1: ruleTuple1 : ( ( rule__Tuple1__Group__0 ) ) ;
    public final void ruleTuple1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:716:2: ( ( ( rule__Tuple1__Group__0 ) ) )
            // InternalLenguajegrafico.g:717:2: ( ( rule__Tuple1__Group__0 ) )
            {
            // InternalLenguajegrafico.g:717:2: ( ( rule__Tuple1__Group__0 ) )
            // InternalLenguajegrafico.g:718:3: ( rule__Tuple1__Group__0 )
            {
             before(grammarAccess.getTuple1Access().getGroup()); 
            // InternalLenguajegrafico.g:719:3: ( rule__Tuple1__Group__0 )
            // InternalLenguajegrafico.g:719:4: rule__Tuple1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTuple1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuple1"


    // $ANTLR start "entryRuleTuple2"
    // InternalLenguajegrafico.g:728:1: entryRuleTuple2 : ruleTuple2 EOF ;
    public final void entryRuleTuple2() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:729:1: ( ruleTuple2 EOF )
            // InternalLenguajegrafico.g:730:1: ruleTuple2 EOF
            {
             before(grammarAccess.getTuple2Rule()); 
            pushFollow(FOLLOW_1);
            ruleTuple2();

            state._fsp--;

             after(grammarAccess.getTuple2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuple2"


    // $ANTLR start "ruleTuple2"
    // InternalLenguajegrafico.g:737:1: ruleTuple2 : ( ( rule__Tuple2__Group__0 ) ) ;
    public final void ruleTuple2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:741:2: ( ( ( rule__Tuple2__Group__0 ) ) )
            // InternalLenguajegrafico.g:742:2: ( ( rule__Tuple2__Group__0 ) )
            {
            // InternalLenguajegrafico.g:742:2: ( ( rule__Tuple2__Group__0 ) )
            // InternalLenguajegrafico.g:743:3: ( rule__Tuple2__Group__0 )
            {
             before(grammarAccess.getTuple2Access().getGroup()); 
            // InternalLenguajegrafico.g:744:3: ( rule__Tuple2__Group__0 )
            // InternalLenguajegrafico.g:744:4: rule__Tuple2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTuple2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuple2"


    // $ANTLR start "entryRuleTuple3"
    // InternalLenguajegrafico.g:753:1: entryRuleTuple3 : ruleTuple3 EOF ;
    public final void entryRuleTuple3() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:754:1: ( ruleTuple3 EOF )
            // InternalLenguajegrafico.g:755:1: ruleTuple3 EOF
            {
             before(grammarAccess.getTuple3Rule()); 
            pushFollow(FOLLOW_1);
            ruleTuple3();

            state._fsp--;

             after(grammarAccess.getTuple3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuple3"


    // $ANTLR start "ruleTuple3"
    // InternalLenguajegrafico.g:762:1: ruleTuple3 : ( ( rule__Tuple3__Group__0 ) ) ;
    public final void ruleTuple3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:766:2: ( ( ( rule__Tuple3__Group__0 ) ) )
            // InternalLenguajegrafico.g:767:2: ( ( rule__Tuple3__Group__0 ) )
            {
            // InternalLenguajegrafico.g:767:2: ( ( rule__Tuple3__Group__0 ) )
            // InternalLenguajegrafico.g:768:3: ( rule__Tuple3__Group__0 )
            {
             before(grammarAccess.getTuple3Access().getGroup()); 
            // InternalLenguajegrafico.g:769:3: ( rule__Tuple3__Group__0 )
            // InternalLenguajegrafico.g:769:4: rule__Tuple3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuple3"


    // $ANTLR start "entryRuleTuple4"
    // InternalLenguajegrafico.g:778:1: entryRuleTuple4 : ruleTuple4 EOF ;
    public final void entryRuleTuple4() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:779:1: ( ruleTuple4 EOF )
            // InternalLenguajegrafico.g:780:1: ruleTuple4 EOF
            {
             before(grammarAccess.getTuple4Rule()); 
            pushFollow(FOLLOW_1);
            ruleTuple4();

            state._fsp--;

             after(grammarAccess.getTuple4Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTuple4"


    // $ANTLR start "ruleTuple4"
    // InternalLenguajegrafico.g:787:1: ruleTuple4 : ( ( rule__Tuple4__Group__0 ) ) ;
    public final void ruleTuple4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:791:2: ( ( ( rule__Tuple4__Group__0 ) ) )
            // InternalLenguajegrafico.g:792:2: ( ( rule__Tuple4__Group__0 ) )
            {
            // InternalLenguajegrafico.g:792:2: ( ( rule__Tuple4__Group__0 ) )
            // InternalLenguajegrafico.g:793:3: ( rule__Tuple4__Group__0 )
            {
             before(grammarAccess.getTuple4Access().getGroup()); 
            // InternalLenguajegrafico.g:794:3: ( rule__Tuple4__Group__0 )
            // InternalLenguajegrafico.g:794:4: rule__Tuple4__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTuple4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTuple4"


    // $ANTLR start "entryRuleConfiguration"
    // InternalLenguajegrafico.g:803:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:804:1: ( ruleConfiguration EOF )
            // InternalLenguajegrafico.g:805:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalLenguajegrafico.g:812:1: ruleConfiguration : ( ( rule__Configuration__Alternatives ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:816:2: ( ( ( rule__Configuration__Alternatives ) ) )
            // InternalLenguajegrafico.g:817:2: ( ( rule__Configuration__Alternatives ) )
            {
            // InternalLenguajegrafico.g:817:2: ( ( rule__Configuration__Alternatives ) )
            // InternalLenguajegrafico.g:818:3: ( rule__Configuration__Alternatives )
            {
             before(grammarAccess.getConfigurationAccess().getAlternatives()); 
            // InternalLenguajegrafico.g:819:3: ( rule__Configuration__Alternatives )
            // InternalLenguajegrafico.g:819:4: rule__Configuration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleCodeGeneratedTarget"
    // InternalLenguajegrafico.g:828:1: entryRuleCodeGeneratedTarget : ruleCodeGeneratedTarget EOF ;
    public final void entryRuleCodeGeneratedTarget() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:829:1: ( ruleCodeGeneratedTarget EOF )
            // InternalLenguajegrafico.g:830:1: ruleCodeGeneratedTarget EOF
            {
             before(grammarAccess.getCodeGeneratedTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeGeneratedTarget();

            state._fsp--;

             after(grammarAccess.getCodeGeneratedTargetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCodeGeneratedTarget"


    // $ANTLR start "ruleCodeGeneratedTarget"
    // InternalLenguajegrafico.g:837:1: ruleCodeGeneratedTarget : ( ( rule__CodeGeneratedTarget__Group__0 ) ) ;
    public final void ruleCodeGeneratedTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:841:2: ( ( ( rule__CodeGeneratedTarget__Group__0 ) ) )
            // InternalLenguajegrafico.g:842:2: ( ( rule__CodeGeneratedTarget__Group__0 ) )
            {
            // InternalLenguajegrafico.g:842:2: ( ( rule__CodeGeneratedTarget__Group__0 ) )
            // InternalLenguajegrafico.g:843:3: ( rule__CodeGeneratedTarget__Group__0 )
            {
             before(grammarAccess.getCodeGeneratedTargetAccess().getGroup()); 
            // InternalLenguajegrafico.g:844:3: ( rule__CodeGeneratedTarget__Group__0 )
            // InternalLenguajegrafico.g:844:4: rule__CodeGeneratedTarget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodeGeneratedTarget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeGeneratedTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeGeneratedTarget"


    // $ANTLR start "entryRuleNormaliceData"
    // InternalLenguajegrafico.g:853:1: entryRuleNormaliceData : ruleNormaliceData EOF ;
    public final void entryRuleNormaliceData() throws RecognitionException {
        try {
            // InternalLenguajegrafico.g:854:1: ( ruleNormaliceData EOF )
            // InternalLenguajegrafico.g:855:1: ruleNormaliceData EOF
            {
             before(grammarAccess.getNormaliceDataRule()); 
            pushFollow(FOLLOW_1);
            ruleNormaliceData();

            state._fsp--;

             after(grammarAccess.getNormaliceDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormaliceData"


    // $ANTLR start "ruleNormaliceData"
    // InternalLenguajegrafico.g:862:1: ruleNormaliceData : ( ( rule__NormaliceData__Group__0 ) ) ;
    public final void ruleNormaliceData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:866:2: ( ( ( rule__NormaliceData__Group__0 ) ) )
            // InternalLenguajegrafico.g:867:2: ( ( rule__NormaliceData__Group__0 ) )
            {
            // InternalLenguajegrafico.g:867:2: ( ( rule__NormaliceData__Group__0 ) )
            // InternalLenguajegrafico.g:868:3: ( rule__NormaliceData__Group__0 )
            {
             before(grammarAccess.getNormaliceDataAccess().getGroup()); 
            // InternalLenguajegrafico.g:869:3: ( rule__NormaliceData__Group__0 )
            // InternalLenguajegrafico.g:869:4: rule__NormaliceData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormaliceData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormaliceDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormaliceData"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalLenguajegrafico.g:877:1: rule__Element__Alternatives : ( ( ruleChart ) | ( ruleTuple ) | ( ruleDashBoard ) | ( ruleConfiguration ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:881:1: ( ( ruleChart ) | ( ruleTuple ) | ( ruleDashBoard ) | ( ruleConfiguration ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt2=1;
                }
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt2=2;
                }
                break;
            case 56:
                {
                alt2=3;
                }
                break;
            case 61:
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
                    // InternalLenguajegrafico.g:882:2: ( ruleChart )
                    {
                    // InternalLenguajegrafico.g:882:2: ( ruleChart )
                    // InternalLenguajegrafico.g:883:3: ruleChart
                    {
                     before(grammarAccess.getElementAccess().getChartParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChart();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getChartParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:888:2: ( ruleTuple )
                    {
                    // InternalLenguajegrafico.g:888:2: ( ruleTuple )
                    // InternalLenguajegrafico.g:889:3: ruleTuple
                    {
                     before(grammarAccess.getElementAccess().getTupleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTuple();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTupleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:894:2: ( ruleDashBoard )
                    {
                    // InternalLenguajegrafico.g:894:2: ( ruleDashBoard )
                    // InternalLenguajegrafico.g:895:3: ruleDashBoard
                    {
                     before(grammarAccess.getElementAccess().getDashBoardParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDashBoard();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDashBoardParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:900:2: ( ruleConfiguration )
                    {
                    // InternalLenguajegrafico.g:900:2: ( ruleConfiguration )
                    // InternalLenguajegrafico.g:901:3: ruleConfiguration
                    {
                     before(grammarAccess.getElementAccess().getConfigurationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConfiguration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getConfigurationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Datatype__Alternatives"
    // InternalLenguajegrafico.g:910:1: rule__Datatype__Alternatives : ( ( ruleText ) | ( ruleNumber ) | ( ruleFloat ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:914:1: ( ( ruleText ) | ( ruleNumber ) | ( ruleFloat ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 34:
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
                    // InternalLenguajegrafico.g:915:2: ( ruleText )
                    {
                    // InternalLenguajegrafico.g:915:2: ( ruleText )
                    // InternalLenguajegrafico.g:916:3: ruleText
                    {
                     before(grammarAccess.getDatatypeAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getDatatypeAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:921:2: ( ruleNumber )
                    {
                    // InternalLenguajegrafico.g:921:2: ( ruleNumber )
                    // InternalLenguajegrafico.g:922:3: ruleNumber
                    {
                     before(grammarAccess.getDatatypeAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getDatatypeAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:927:2: ( ruleFloat )
                    {
                    // InternalLenguajegrafico.g:927:2: ( ruleFloat )
                    // InternalLenguajegrafico.g:928:3: ruleFloat
                    {
                     before(grammarAccess.getDatatypeAccess().getFloatParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getDatatypeAccess().getFloatParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__Chart__Alternatives"
    // InternalLenguajegrafico.g:937:1: rule__Chart__Alternatives : ( ( rulePieChart ) | ( ruleLineChart ) | ( ruleBarChart ) | ( ruleMapChart ) | ( ruleTableChart ) );
    public final void rule__Chart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:941:1: ( ( rulePieChart ) | ( ruleLineChart ) | ( ruleBarChart ) | ( ruleMapChart ) | ( ruleTableChart ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case 53:
                {
                alt4=2;
                }
                break;
            case 52:
                {
                alt4=3;
                }
                break;
            case 54:
                {
                alt4=4;
                }
                break;
            case 55:
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
                    // InternalLenguajegrafico.g:942:2: ( rulePieChart )
                    {
                    // InternalLenguajegrafico.g:942:2: ( rulePieChart )
                    // InternalLenguajegrafico.g:943:3: rulePieChart
                    {
                     before(grammarAccess.getChartAccess().getPieChartParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePieChart();

                    state._fsp--;

                     after(grammarAccess.getChartAccess().getPieChartParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:948:2: ( ruleLineChart )
                    {
                    // InternalLenguajegrafico.g:948:2: ( ruleLineChart )
                    // InternalLenguajegrafico.g:949:3: ruleLineChart
                    {
                     before(grammarAccess.getChartAccess().getLineChartParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLineChart();

                    state._fsp--;

                     after(grammarAccess.getChartAccess().getLineChartParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:954:2: ( ruleBarChart )
                    {
                    // InternalLenguajegrafico.g:954:2: ( ruleBarChart )
                    // InternalLenguajegrafico.g:955:3: ruleBarChart
                    {
                     before(grammarAccess.getChartAccess().getBarChartParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBarChart();

                    state._fsp--;

                     after(grammarAccess.getChartAccess().getBarChartParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:960:2: ( ruleMapChart )
                    {
                    // InternalLenguajegrafico.g:960:2: ( ruleMapChart )
                    // InternalLenguajegrafico.g:961:3: ruleMapChart
                    {
                     before(grammarAccess.getChartAccess().getMapChartParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMapChart();

                    state._fsp--;

                     after(grammarAccess.getChartAccess().getMapChartParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:966:2: ( ruleTableChart )
                    {
                    // InternalLenguajegrafico.g:966:2: ( ruleTableChart )
                    // InternalLenguajegrafico.g:967:3: ruleTableChart
                    {
                     before(grammarAccess.getChartAccess().getTableChartParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTableChart();

                    state._fsp--;

                     after(grammarAccess.getChartAccess().getTableChartParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chart__Alternatives"


    // $ANTLR start "rule__Tuple__Alternatives"
    // InternalLenguajegrafico.g:976:1: rule__Tuple__Alternatives : ( ( ruleTuple1 ) | ( ruleTuple2 ) | ( ruleTuple3 ) | ( ruleTuple4 ) );
    public final void rule__Tuple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:980:1: ( ( ruleTuple1 ) | ( ruleTuple2 ) | ( ruleTuple3 ) | ( ruleTuple4 ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt5=1;
                }
                break;
            case 58:
                {
                alt5=2;
                }
                break;
            case 59:
                {
                alt5=3;
                }
                break;
            case 60:
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
                    // InternalLenguajegrafico.g:981:2: ( ruleTuple1 )
                    {
                    // InternalLenguajegrafico.g:981:2: ( ruleTuple1 )
                    // InternalLenguajegrafico.g:982:3: ruleTuple1
                    {
                     before(grammarAccess.getTupleAccess().getTuple1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTuple1();

                    state._fsp--;

                     after(grammarAccess.getTupleAccess().getTuple1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:987:2: ( ruleTuple2 )
                    {
                    // InternalLenguajegrafico.g:987:2: ( ruleTuple2 )
                    // InternalLenguajegrafico.g:988:3: ruleTuple2
                    {
                     before(grammarAccess.getTupleAccess().getTuple2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTuple2();

                    state._fsp--;

                     after(grammarAccess.getTupleAccess().getTuple2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:993:2: ( ruleTuple3 )
                    {
                    // InternalLenguajegrafico.g:993:2: ( ruleTuple3 )
                    // InternalLenguajegrafico.g:994:3: ruleTuple3
                    {
                     before(grammarAccess.getTupleAccess().getTuple3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTuple3();

                    state._fsp--;

                     after(grammarAccess.getTupleAccess().getTuple3ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:999:2: ( ruleTuple4 )
                    {
                    // InternalLenguajegrafico.g:999:2: ( ruleTuple4 )
                    // InternalLenguajegrafico.g:1000:3: ruleTuple4
                    {
                     before(grammarAccess.getTupleAccess().getTuple4ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTuple4();

                    state._fsp--;

                     after(grammarAccess.getTupleAccess().getTuple4ParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple__Alternatives"


    // $ANTLR start "rule__Legend__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1009:1: rule__Legend__ValueAlternatives_2_0 : ( ( 'True' ) | ( 'False' ) );
    public final void rule__Legend__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1013:1: ( ( 'True' ) | ( 'False' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLenguajegrafico.g:1014:2: ( 'True' )
                    {
                    // InternalLenguajegrafico.g:1014:2: ( 'True' )
                    // InternalLenguajegrafico.g:1015:3: 'True'
                    {
                     before(grammarAccess.getLegendAccess().getValueTrueKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLegendAccess().getValueTrueKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1020:2: ( 'False' )
                    {
                    // InternalLenguajegrafico.g:1020:2: ( 'False' )
                    // InternalLenguajegrafico.g:1021:3: 'False'
                    {
                     before(grammarAccess.getLegendAccess().getValueFalseKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLegendAccess().getValueFalseKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__ValueAlternatives_2_0"


    // $ANTLR start "rule__Hole__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1030:1: rule__Hole__ValueAlternatives_2_0 : ( ( 'True' ) | ( 'False' ) );
    public final void rule__Hole__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1034:1: ( ( 'True' ) | ( 'False' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLenguajegrafico.g:1035:2: ( 'True' )
                    {
                    // InternalLenguajegrafico.g:1035:2: ( 'True' )
                    // InternalLenguajegrafico.g:1036:3: 'True'
                    {
                     before(grammarAccess.getHoleAccess().getValueTrueKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHoleAccess().getValueTrueKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1041:2: ( 'False' )
                    {
                    // InternalLenguajegrafico.g:1041:2: ( 'False' )
                    // InternalLenguajegrafico.g:1042:3: 'False'
                    {
                     before(grammarAccess.getHoleAccess().getValueFalseKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHoleAccess().getValueFalseKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__ValueAlternatives_2_0"


    // $ANTLR start "rule__Orientation__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1051:1: rule__Orientation__ValueAlternatives_2_0 : ( ( 'Horizontal' ) | ( 'Vertical' ) );
    public final void rule__Orientation__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1055:1: ( ( 'Horizontal' ) | ( 'Vertical' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLenguajegrafico.g:1056:2: ( 'Horizontal' )
                    {
                    // InternalLenguajegrafico.g:1056:2: ( 'Horizontal' )
                    // InternalLenguajegrafico.g:1057:3: 'Horizontal'
                    {
                     before(grammarAccess.getOrientationAccess().getValueHorizontalKeyword_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOrientationAccess().getValueHorizontalKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1062:2: ( 'Vertical' )
                    {
                    // InternalLenguajegrafico.g:1062:2: ( 'Vertical' )
                    // InternalLenguajegrafico.g:1063:3: 'Vertical'
                    {
                     before(grammarAccess.getOrientationAccess().getValueVerticalKeyword_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOrientationAccess().getValueVerticalKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__ValueAlternatives_2_0"


    // $ANTLR start "rule__Area__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1072:1: rule__Area__ValueAlternatives_2_0 : ( ( 'True' ) | ( 'False' ) );
    public final void rule__Area__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1076:1: ( ( 'True' ) | ( 'False' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLenguajegrafico.g:1077:2: ( 'True' )
                    {
                    // InternalLenguajegrafico.g:1077:2: ( 'True' )
                    // InternalLenguajegrafico.g:1078:3: 'True'
                    {
                     before(grammarAccess.getAreaAccess().getValueTrueKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAreaAccess().getValueTrueKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1083:2: ( 'False' )
                    {
                    // InternalLenguajegrafico.g:1083:2: ( 'False' )
                    // InternalLenguajegrafico.g:1084:3: 'False'
                    {
                     before(grammarAccess.getAreaAccess().getValueFalseKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAreaAccess().getValueFalseKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__ValueAlternatives_2_0"


    // $ANTLR start "rule__MakerType__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1093:1: rule__MakerType__ValueAlternatives_2_0 : ( ( 'Normal' ) | ( 'Group' ) | ( 'MagnitudeCircle' ) );
    public final void rule__MakerType__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1097:1: ( ( 'Normal' ) | ( 'Group' ) | ( 'MagnitudeCircle' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            case 17:
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
                    // InternalLenguajegrafico.g:1098:2: ( 'Normal' )
                    {
                    // InternalLenguajegrafico.g:1098:2: ( 'Normal' )
                    // InternalLenguajegrafico.g:1099:3: 'Normal'
                    {
                     before(grammarAccess.getMakerTypeAccess().getValueNormalKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMakerTypeAccess().getValueNormalKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1104:2: ( 'Group' )
                    {
                    // InternalLenguajegrafico.g:1104:2: ( 'Group' )
                    // InternalLenguajegrafico.g:1105:3: 'Group'
                    {
                     before(grammarAccess.getMakerTypeAccess().getValueGroupKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMakerTypeAccess().getValueGroupKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1110:2: ( 'MagnitudeCircle' )
                    {
                    // InternalLenguajegrafico.g:1110:2: ( 'MagnitudeCircle' )
                    // InternalLenguajegrafico.g:1111:3: 'MagnitudeCircle'
                    {
                     before(grammarAccess.getMakerTypeAccess().getValueMagnitudeCircleKeyword_2_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMakerTypeAccess().getValueMagnitudeCircleKeyword_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__ValueAlternatives_2_0"


    // $ANTLR start "rule__MapType__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1120:1: rule__MapType__ValueAlternatives_2_0 : ( ( 'general' ) | ( 'roadmap' ) | ( 'terrain' ) | ( 'satellite' ) | ( 'hybrid' ) );
    public final void rule__MapType__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1124:1: ( ( 'general' ) | ( 'roadmap' ) | ( 'terrain' ) | ( 'satellite' ) | ( 'hybrid' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
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
                    // InternalLenguajegrafico.g:1125:2: ( 'general' )
                    {
                    // InternalLenguajegrafico.g:1125:2: ( 'general' )
                    // InternalLenguajegrafico.g:1126:3: 'general'
                    {
                     before(grammarAccess.getMapTypeAccess().getValueGeneralKeyword_2_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMapTypeAccess().getValueGeneralKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1131:2: ( 'roadmap' )
                    {
                    // InternalLenguajegrafico.g:1131:2: ( 'roadmap' )
                    // InternalLenguajegrafico.g:1132:3: 'roadmap'
                    {
                     before(grammarAccess.getMapTypeAccess().getValueRoadmapKeyword_2_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMapTypeAccess().getValueRoadmapKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1137:2: ( 'terrain' )
                    {
                    // InternalLenguajegrafico.g:1137:2: ( 'terrain' )
                    // InternalLenguajegrafico.g:1138:3: 'terrain'
                    {
                     before(grammarAccess.getMapTypeAccess().getValueTerrainKeyword_2_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMapTypeAccess().getValueTerrainKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1143:2: ( 'satellite' )
                    {
                    // InternalLenguajegrafico.g:1143:2: ( 'satellite' )
                    // InternalLenguajegrafico.g:1144:3: 'satellite'
                    {
                     before(grammarAccess.getMapTypeAccess().getValueSatelliteKeyword_2_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMapTypeAccess().getValueSatelliteKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1149:2: ( 'hybrid' )
                    {
                    // InternalLenguajegrafico.g:1149:2: ( 'hybrid' )
                    // InternalLenguajegrafico.g:1150:3: 'hybrid'
                    {
                     before(grammarAccess.getMapTypeAccess().getValueHybridKeyword_2_0_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMapTypeAccess().getValueHybridKeyword_2_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__ValueAlternatives_2_0"


    // $ANTLR start "rule__CellSize__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1159:1: rule__CellSize__ValueAlternatives_2_0 : ( ( '1x1' ) | ( '1x2' ) | ( '1x3' ) | ( '2x1' ) | ( '2x2' ) | ( '3x3' ) );
    public final void rule__CellSize__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1163:1: ( ( '1x1' ) | ( '1x2' ) | ( '1x3' ) | ( '2x1' ) | ( '2x2' ) | ( '3x3' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            case 27:
                {
                alt12=5;
                }
                break;
            case 28:
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
                    // InternalLenguajegrafico.g:1164:2: ( '1x1' )
                    {
                    // InternalLenguajegrafico.g:1164:2: ( '1x1' )
                    // InternalLenguajegrafico.g:1165:3: '1x1'
                    {
                     before(grammarAccess.getCellSizeAccess().getValue1x1Keyword_2_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCellSizeAccess().getValue1x1Keyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1170:2: ( '1x2' )
                    {
                    // InternalLenguajegrafico.g:1170:2: ( '1x2' )
                    // InternalLenguajegrafico.g:1171:3: '1x2'
                    {
                     before(grammarAccess.getCellSizeAccess().getValue1x2Keyword_2_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCellSizeAccess().getValue1x2Keyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1176:2: ( '1x3' )
                    {
                    // InternalLenguajegrafico.g:1176:2: ( '1x3' )
                    // InternalLenguajegrafico.g:1177:3: '1x3'
                    {
                     before(grammarAccess.getCellSizeAccess().getValue1x3Keyword_2_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getCellSizeAccess().getValue1x3Keyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1182:2: ( '2x1' )
                    {
                    // InternalLenguajegrafico.g:1182:2: ( '2x1' )
                    // InternalLenguajegrafico.g:1183:3: '2x1'
                    {
                     before(grammarAccess.getCellSizeAccess().getValue2x1Keyword_2_0_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCellSizeAccess().getValue2x1Keyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1188:2: ( '2x2' )
                    {
                    // InternalLenguajegrafico.g:1188:2: ( '2x2' )
                    // InternalLenguajegrafico.g:1189:3: '2x2'
                    {
                     before(grammarAccess.getCellSizeAccess().getValue2x2Keyword_2_0_4()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getCellSizeAccess().getValue2x2Keyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLenguajegrafico.g:1194:2: ( '3x3' )
                    {
                    // InternalLenguajegrafico.g:1194:2: ( '3x3' )
                    // InternalLenguajegrafico.g:1195:3: '3x3'
                    {
                     before(grammarAccess.getCellSizeAccess().getValue3x3Keyword_2_0_5()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getCellSizeAccess().getValue3x3Keyword_2_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__ValueAlternatives_2_0"


    // $ANTLR start "rule__PieChart__FeaturesAlternatives_4_0"
    // InternalLenguajegrafico.g:1204:1: rule__PieChart__FeaturesAlternatives_4_0 : ( ( ruleTitle ) | ( ruleLegend ) | ( ruleHole ) | ( ruleCellSize ) );
    public final void rule__PieChart__FeaturesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1208:1: ( ( ruleTitle ) | ( ruleLegend ) | ( ruleHole ) | ( ruleCellSize ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 40:
                {
                alt13=2;
                }
                break;
            case 42:
                {
                alt13=3;
                }
                break;
            case 48:
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
                    // InternalLenguajegrafico.g:1209:2: ( ruleTitle )
                    {
                    // InternalLenguajegrafico.g:1209:2: ( ruleTitle )
                    // InternalLenguajegrafico.g:1210:3: ruleTitle
                    {
                     before(grammarAccess.getPieChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getPieChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1215:2: ( ruleLegend )
                    {
                    // InternalLenguajegrafico.g:1215:2: ( ruleLegend )
                    // InternalLenguajegrafico.g:1216:3: ruleLegend
                    {
                     before(grammarAccess.getPieChartAccess().getFeaturesLegendParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLegend();

                    state._fsp--;

                     after(grammarAccess.getPieChartAccess().getFeaturesLegendParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1221:2: ( ruleHole )
                    {
                    // InternalLenguajegrafico.g:1221:2: ( ruleHole )
                    // InternalLenguajegrafico.g:1222:3: ruleHole
                    {
                     before(grammarAccess.getPieChartAccess().getFeaturesHoleParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHole();

                    state._fsp--;

                     after(grammarAccess.getPieChartAccess().getFeaturesHoleParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1227:2: ( ruleCellSize )
                    {
                    // InternalLenguajegrafico.g:1227:2: ( ruleCellSize )
                    // InternalLenguajegrafico.g:1228:3: ruleCellSize
                    {
                     before(grammarAccess.getPieChartAccess().getFeaturesCellSizeParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCellSize();

                    state._fsp--;

                     after(grammarAccess.getPieChartAccess().getFeaturesCellSizeParserRuleCall_4_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__FeaturesAlternatives_4_0"


    // $ANTLR start "rule__BarChart__FeaturesAlternatives_4_0"
    // InternalLenguajegrafico.g:1237:1: rule__BarChart__FeaturesAlternatives_4_0 : ( ( ruleTitle ) | ( ruleLegend ) | ( ruleLabelx ) | ( ruleLabely ) | ( ruleOrientation ) | ( ruleCellSize ) );
    public final void rule__BarChart__FeaturesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1241:1: ( ( ruleTitle ) | ( ruleLegend ) | ( ruleLabelx ) | ( ruleLabely ) | ( ruleOrientation ) | ( ruleCellSize ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 38:
                {
                alt14=3;
                }
                break;
            case 39:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case 48:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalLenguajegrafico.g:1242:2: ( ruleTitle )
                    {
                    // InternalLenguajegrafico.g:1242:2: ( ruleTitle )
                    // InternalLenguajegrafico.g:1243:3: ruleTitle
                    {
                     before(grammarAccess.getBarChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getBarChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1248:2: ( ruleLegend )
                    {
                    // InternalLenguajegrafico.g:1248:2: ( ruleLegend )
                    // InternalLenguajegrafico.g:1249:3: ruleLegend
                    {
                     before(grammarAccess.getBarChartAccess().getFeaturesLegendParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLegend();

                    state._fsp--;

                     after(grammarAccess.getBarChartAccess().getFeaturesLegendParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1254:2: ( ruleLabelx )
                    {
                    // InternalLenguajegrafico.g:1254:2: ( ruleLabelx )
                    // InternalLenguajegrafico.g:1255:3: ruleLabelx
                    {
                     before(grammarAccess.getBarChartAccess().getFeaturesLabelxParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLabelx();

                    state._fsp--;

                     after(grammarAccess.getBarChartAccess().getFeaturesLabelxParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1260:2: ( ruleLabely )
                    {
                    // InternalLenguajegrafico.g:1260:2: ( ruleLabely )
                    // InternalLenguajegrafico.g:1261:3: ruleLabely
                    {
                     before(grammarAccess.getBarChartAccess().getFeaturesLabelyParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLabely();

                    state._fsp--;

                     after(grammarAccess.getBarChartAccess().getFeaturesLabelyParserRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1266:2: ( ruleOrientation )
                    {
                    // InternalLenguajegrafico.g:1266:2: ( ruleOrientation )
                    // InternalLenguajegrafico.g:1267:3: ruleOrientation
                    {
                     before(grammarAccess.getBarChartAccess().getFeaturesOrientationParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOrientation();

                    state._fsp--;

                     after(grammarAccess.getBarChartAccess().getFeaturesOrientationParserRuleCall_4_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLenguajegrafico.g:1272:2: ( ruleCellSize )
                    {
                    // InternalLenguajegrafico.g:1272:2: ( ruleCellSize )
                    // InternalLenguajegrafico.g:1273:3: ruleCellSize
                    {
                     before(grammarAccess.getBarChartAccess().getFeaturesCellSizeParserRuleCall_4_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCellSize();

                    state._fsp--;

                     after(grammarAccess.getBarChartAccess().getFeaturesCellSizeParserRuleCall_4_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__FeaturesAlternatives_4_0"


    // $ANTLR start "rule__LineChart__FeaturesAlternatives_4_0"
    // InternalLenguajegrafico.g:1282:1: rule__LineChart__FeaturesAlternatives_4_0 : ( ( ruleTitle ) | ( ruleLegend ) | ( ruleLabelx ) | ( ruleLabely ) | ( ruleArea ) | ( ruleCellSize ) );
    public final void rule__LineChart__FeaturesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1286:1: ( ( ruleTitle ) | ( ruleLegend ) | ( ruleLabelx ) | ( ruleLabely ) | ( ruleArea ) | ( ruleCellSize ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 40:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case 39:
                {
                alt15=4;
                }
                break;
            case 44:
                {
                alt15=5;
                }
                break;
            case 48:
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
                    // InternalLenguajegrafico.g:1287:2: ( ruleTitle )
                    {
                    // InternalLenguajegrafico.g:1287:2: ( ruleTitle )
                    // InternalLenguajegrafico.g:1288:3: ruleTitle
                    {
                     before(grammarAccess.getLineChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getLineChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1293:2: ( ruleLegend )
                    {
                    // InternalLenguajegrafico.g:1293:2: ( ruleLegend )
                    // InternalLenguajegrafico.g:1294:3: ruleLegend
                    {
                     before(grammarAccess.getLineChartAccess().getFeaturesLegendParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLegend();

                    state._fsp--;

                     after(grammarAccess.getLineChartAccess().getFeaturesLegendParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1299:2: ( ruleLabelx )
                    {
                    // InternalLenguajegrafico.g:1299:2: ( ruleLabelx )
                    // InternalLenguajegrafico.g:1300:3: ruleLabelx
                    {
                     before(grammarAccess.getLineChartAccess().getFeaturesLabelxParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLabelx();

                    state._fsp--;

                     after(grammarAccess.getLineChartAccess().getFeaturesLabelxParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1305:2: ( ruleLabely )
                    {
                    // InternalLenguajegrafico.g:1305:2: ( ruleLabely )
                    // InternalLenguajegrafico.g:1306:3: ruleLabely
                    {
                     before(grammarAccess.getLineChartAccess().getFeaturesLabelyParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLabely();

                    state._fsp--;

                     after(grammarAccess.getLineChartAccess().getFeaturesLabelyParserRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1311:2: ( ruleArea )
                    {
                    // InternalLenguajegrafico.g:1311:2: ( ruleArea )
                    // InternalLenguajegrafico.g:1312:3: ruleArea
                    {
                     before(grammarAccess.getLineChartAccess().getFeaturesAreaParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleArea();

                    state._fsp--;

                     after(grammarAccess.getLineChartAccess().getFeaturesAreaParserRuleCall_4_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLenguajegrafico.g:1317:2: ( ruleCellSize )
                    {
                    // InternalLenguajegrafico.g:1317:2: ( ruleCellSize )
                    // InternalLenguajegrafico.g:1318:3: ruleCellSize
                    {
                     before(grammarAccess.getLineChartAccess().getFeaturesCellSizeParserRuleCall_4_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCellSize();

                    state._fsp--;

                     after(grammarAccess.getLineChartAccess().getFeaturesCellSizeParserRuleCall_4_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__FeaturesAlternatives_4_0"


    // $ANTLR start "rule__MapChart__FeaturesAlternatives_4_0"
    // InternalLenguajegrafico.g:1327:1: rule__MapChart__FeaturesAlternatives_4_0 : ( ( ruleTitle ) | ( ruleZoomLevel ) | ( ruleMakerType ) | ( ruleMapType ) | ( ruleCellSize ) );
    public final void rule__MapChart__FeaturesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1331:1: ( ( ruleTitle ) | ( ruleZoomLevel ) | ( ruleMakerType ) | ( ruleMapType ) | ( ruleCellSize ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 45:
                {
                alt16=2;
                }
                break;
            case 46:
                {
                alt16=3;
                }
                break;
            case 47:
                {
                alt16=4;
                }
                break;
            case 48:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalLenguajegrafico.g:1332:2: ( ruleTitle )
                    {
                    // InternalLenguajegrafico.g:1332:2: ( ruleTitle )
                    // InternalLenguajegrafico.g:1333:3: ruleTitle
                    {
                     before(grammarAccess.getMapChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getMapChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1338:2: ( ruleZoomLevel )
                    {
                    // InternalLenguajegrafico.g:1338:2: ( ruleZoomLevel )
                    // InternalLenguajegrafico.g:1339:3: ruleZoomLevel
                    {
                     before(grammarAccess.getMapChartAccess().getFeaturesZoomLevelParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleZoomLevel();

                    state._fsp--;

                     after(grammarAccess.getMapChartAccess().getFeaturesZoomLevelParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1344:2: ( ruleMakerType )
                    {
                    // InternalLenguajegrafico.g:1344:2: ( ruleMakerType )
                    // InternalLenguajegrafico.g:1345:3: ruleMakerType
                    {
                     before(grammarAccess.getMapChartAccess().getFeaturesMakerTypeParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMakerType();

                    state._fsp--;

                     after(grammarAccess.getMapChartAccess().getFeaturesMakerTypeParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLenguajegrafico.g:1350:2: ( ruleMapType )
                    {
                    // InternalLenguajegrafico.g:1350:2: ( ruleMapType )
                    // InternalLenguajegrafico.g:1351:3: ruleMapType
                    {
                     before(grammarAccess.getMapChartAccess().getFeaturesMapTypeParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getMapChartAccess().getFeaturesMapTypeParserRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLenguajegrafico.g:1356:2: ( ruleCellSize )
                    {
                    // InternalLenguajegrafico.g:1356:2: ( ruleCellSize )
                    // InternalLenguajegrafico.g:1357:3: ruleCellSize
                    {
                     before(grammarAccess.getMapChartAccess().getFeaturesCellSizeParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCellSize();

                    state._fsp--;

                     after(grammarAccess.getMapChartAccess().getFeaturesCellSizeParserRuleCall_4_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__FeaturesAlternatives_4_0"


    // $ANTLR start "rule__TableChart__FeaturesAlternatives_4_0"
    // InternalLenguajegrafico.g:1366:1: rule__TableChart__FeaturesAlternatives_4_0 : ( ( ruleTitle ) | ( ruleCellSize ) );
    public final void rule__TableChart__FeaturesAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1370:1: ( ( ruleTitle ) | ( ruleCellSize ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==48) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLenguajegrafico.g:1371:2: ( ruleTitle )
                    {
                    // InternalLenguajegrafico.g:1371:2: ( ruleTitle )
                    // InternalLenguajegrafico.g:1372:3: ruleTitle
                    {
                     before(grammarAccess.getTableChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getTableChartAccess().getFeaturesTitleParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1377:2: ( ruleCellSize )
                    {
                    // InternalLenguajegrafico.g:1377:2: ( ruleCellSize )
                    // InternalLenguajegrafico.g:1378:3: ruleCellSize
                    {
                     before(grammarAccess.getTableChartAccess().getFeaturesCellSizeParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCellSize();

                    state._fsp--;

                     after(grammarAccess.getTableChartAccess().getFeaturesCellSizeParserRuleCall_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__FeaturesAlternatives_4_0"


    // $ANTLR start "rule__Tuple2__Value1Alternatives_4_0"
    // InternalLenguajegrafico.g:1387:1: rule__Tuple2__Value1Alternatives_4_0 : ( ( ruleText ) | ( ruleNumber ) );
    public final void rule__Tuple2__Value1Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1391:1: ( ( ruleText ) | ( ruleNumber ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLenguajegrafico.g:1392:2: ( ruleText )
                    {
                    // InternalLenguajegrafico.g:1392:2: ( ruleText )
                    // InternalLenguajegrafico.g:1393:3: ruleText
                    {
                     before(grammarAccess.getTuple2Access().getValue1TextParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getTuple2Access().getValue1TextParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1398:2: ( ruleNumber )
                    {
                    // InternalLenguajegrafico.g:1398:2: ( ruleNumber )
                    // InternalLenguajegrafico.g:1399:3: ruleNumber
                    {
                     before(grammarAccess.getTuple2Access().getValue1NumberParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getTuple2Access().getValue1NumberParserRuleCall_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Value1Alternatives_4_0"


    // $ANTLR start "rule__Tuple3__Value3Alternatives_6_0"
    // InternalLenguajegrafico.g:1408:1: rule__Tuple3__Value3Alternatives_6_0 : ( ( ruleText ) | ( ruleNumber ) );
    public final void rule__Tuple3__Value3Alternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1412:1: ( ( ruleText ) | ( ruleNumber ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLenguajegrafico.g:1413:2: ( ruleText )
                    {
                    // InternalLenguajegrafico.g:1413:2: ( ruleText )
                    // InternalLenguajegrafico.g:1414:3: ruleText
                    {
                     before(grammarAccess.getTuple3Access().getValue3TextParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getTuple3Access().getValue3TextParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1419:2: ( ruleNumber )
                    {
                    // InternalLenguajegrafico.g:1419:2: ( ruleNumber )
                    // InternalLenguajegrafico.g:1420:3: ruleNumber
                    {
                     before(grammarAccess.getTuple3Access().getValue3NumberParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getTuple3Access().getValue3NumberParserRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Value3Alternatives_6_0"


    // $ANTLR start "rule__Configuration__Alternatives"
    // InternalLenguajegrafico.g:1429:1: rule__Configuration__Alternatives : ( ( ruleCodeGeneratedTarget ) | ( ruleNormaliceData ) );
    public final void rule__Configuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1433:1: ( ( ruleCodeGeneratedTarget ) | ( ruleNormaliceData ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==61) ) {
                alt20=1;
            }
            else if ( (LA20_0==62) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLenguajegrafico.g:1434:2: ( ruleCodeGeneratedTarget )
                    {
                    // InternalLenguajegrafico.g:1434:2: ( ruleCodeGeneratedTarget )
                    // InternalLenguajegrafico.g:1435:3: ruleCodeGeneratedTarget
                    {
                     before(grammarAccess.getConfigurationAccess().getCodeGeneratedTargetParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCodeGeneratedTarget();

                    state._fsp--;

                     after(grammarAccess.getConfigurationAccess().getCodeGeneratedTargetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1440:2: ( ruleNormaliceData )
                    {
                    // InternalLenguajegrafico.g:1440:2: ( ruleNormaliceData )
                    // InternalLenguajegrafico.g:1441:3: ruleNormaliceData
                    {
                     before(grammarAccess.getConfigurationAccess().getNormaliceDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNormaliceData();

                    state._fsp--;

                     after(grammarAccess.getConfigurationAccess().getNormaliceDataParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Alternatives"


    // $ANTLR start "rule__CodeGeneratedTarget__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1450:1: rule__CodeGeneratedTarget__ValueAlternatives_2_0 : ( ( 'All' ) | ( 'Web' ) | ( 'Python' ) );
    public final void rule__CodeGeneratedTarget__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1454:1: ( ( 'All' ) | ( 'Web' ) | ( 'Python' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLenguajegrafico.g:1455:2: ( 'All' )
                    {
                    // InternalLenguajegrafico.g:1455:2: ( 'All' )
                    // InternalLenguajegrafico.g:1456:3: 'All'
                    {
                     before(grammarAccess.getCodeGeneratedTargetAccess().getValueAllKeyword_2_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getCodeGeneratedTargetAccess().getValueAllKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1461:2: ( 'Web' )
                    {
                    // InternalLenguajegrafico.g:1461:2: ( 'Web' )
                    // InternalLenguajegrafico.g:1462:3: 'Web'
                    {
                     before(grammarAccess.getCodeGeneratedTargetAccess().getValueWebKeyword_2_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getCodeGeneratedTargetAccess().getValueWebKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLenguajegrafico.g:1467:2: ( 'Python' )
                    {
                    // InternalLenguajegrafico.g:1467:2: ( 'Python' )
                    // InternalLenguajegrafico.g:1468:3: 'Python'
                    {
                     before(grammarAccess.getCodeGeneratedTargetAccess().getValuePythonKeyword_2_0_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getCodeGeneratedTargetAccess().getValuePythonKeyword_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__ValueAlternatives_2_0"


    // $ANTLR start "rule__NormaliceData__ValueAlternatives_2_0"
    // InternalLenguajegrafico.g:1477:1: rule__NormaliceData__ValueAlternatives_2_0 : ( ( 'True' ) | ( 'False' ) );
    public final void rule__NormaliceData__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1481:1: ( ( 'True' ) | ( 'False' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==11) ) {
                alt22=1;
            }
            else if ( (LA22_0==12) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLenguajegrafico.g:1482:2: ( 'True' )
                    {
                    // InternalLenguajegrafico.g:1482:2: ( 'True' )
                    // InternalLenguajegrafico.g:1483:3: 'True'
                    {
                     before(grammarAccess.getNormaliceDataAccess().getValueTrueKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getNormaliceDataAccess().getValueTrueKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLenguajegrafico.g:1488:2: ( 'False' )
                    {
                    // InternalLenguajegrafico.g:1488:2: ( 'False' )
                    // InternalLenguajegrafico.g:1489:3: 'False'
                    {
                     before(grammarAccess.getNormaliceDataAccess().getValueFalseKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNormaliceDataAccess().getValueFalseKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__ValueAlternatives_2_0"


    // $ANTLR start "rule__Text__Group__0"
    // InternalLenguajegrafico.g:1498:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1502:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalLenguajegrafico.g:1503:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalLenguajegrafico.g:1510:1: rule__Text__Group__0__Impl : ( 'String' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1514:1: ( ( 'String' ) )
            // InternalLenguajegrafico.g:1515:1: ( 'String' )
            {
            // InternalLenguajegrafico.g:1515:1: ( 'String' )
            // InternalLenguajegrafico.g:1516:2: 'String'
            {
             before(grammarAccess.getTextAccess().getStringKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalLenguajegrafico.g:1525:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1529:1: ( rule__Text__Group__1__Impl )
            // InternalLenguajegrafico.g:1530:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalLenguajegrafico.g:1536:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1540:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:1541:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:1541:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:1542:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:1543:2: ( rule__Text__NameAssignment_1 )
            // InternalLenguajegrafico.g:1543:3: rule__Text__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalLenguajegrafico.g:1552:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1556:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalLenguajegrafico.g:1557:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalLenguajegrafico.g:1564:1: rule__Number__Group__0__Impl : ( 'Number' ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1568:1: ( ( 'Number' ) )
            // InternalLenguajegrafico.g:1569:1: ( 'Number' )
            {
            // InternalLenguajegrafico.g:1569:1: ( 'Number' )
            // InternalLenguajegrafico.g:1570:2: 'Number'
            {
             before(grammarAccess.getNumberAccess().getNumberKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNumberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalLenguajegrafico.g:1579:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1583:1: ( rule__Number__Group__1__Impl )
            // InternalLenguajegrafico.g:1584:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalLenguajegrafico.g:1590:1: rule__Number__Group__1__Impl : ( ( rule__Number__NameAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1594:1: ( ( ( rule__Number__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:1595:1: ( ( rule__Number__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:1595:1: ( ( rule__Number__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:1596:2: ( rule__Number__NameAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:1597:2: ( rule__Number__NameAssignment_1 )
            // InternalLenguajegrafico.g:1597:3: rule__Number__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalLenguajegrafico.g:1606:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1610:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalLenguajegrafico.g:1611:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalLenguajegrafico.g:1618:1: rule__Float__Group__0__Impl : ( 'Float' ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1622:1: ( ( 'Float' ) )
            // InternalLenguajegrafico.g:1623:1: ( 'Float' )
            {
            // InternalLenguajegrafico.g:1623:1: ( 'Float' )
            // InternalLenguajegrafico.g:1624:2: 'Float'
            {
             before(grammarAccess.getFloatAccess().getFloatKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFloatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalLenguajegrafico.g:1633:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1637:1: ( rule__Float__Group__1__Impl )
            // InternalLenguajegrafico.g:1638:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalLenguajegrafico.g:1644:1: rule__Float__Group__1__Impl : ( ( rule__Float__NameAssignment_1 ) ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1648:1: ( ( ( rule__Float__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:1649:1: ( ( rule__Float__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:1649:1: ( ( rule__Float__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:1650:2: ( rule__Float__NameAssignment_1 )
            {
             before(grammarAccess.getFloatAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:1651:2: ( rule__Float__NameAssignment_1 )
            // InternalLenguajegrafico.g:1651:3: rule__Float__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Float__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__URL__Group__0"
    // InternalLenguajegrafico.g:1660:1: rule__URL__Group__0 : rule__URL__Group__0__Impl rule__URL__Group__1 ;
    public final void rule__URL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1664:1: ( rule__URL__Group__0__Impl rule__URL__Group__1 )
            // InternalLenguajegrafico.g:1665:2: rule__URL__Group__0__Impl rule__URL__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__URL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0"


    // $ANTLR start "rule__URL__Group__0__Impl"
    // InternalLenguajegrafico.g:1672:1: rule__URL__Group__0__Impl : ( 'URL' ) ;
    public final void rule__URL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1676:1: ( ( 'URL' ) )
            // InternalLenguajegrafico.g:1677:1: ( 'URL' )
            {
            // InternalLenguajegrafico.g:1677:1: ( 'URL' )
            // InternalLenguajegrafico.g:1678:2: 'URL'
            {
             before(grammarAccess.getURLAccess().getURLKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getURLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__0__Impl"


    // $ANTLR start "rule__URL__Group__1"
    // InternalLenguajegrafico.g:1687:1: rule__URL__Group__1 : rule__URL__Group__1__Impl rule__URL__Group__2 ;
    public final void rule__URL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1691:1: ( rule__URL__Group__1__Impl rule__URL__Group__2 )
            // InternalLenguajegrafico.g:1692:2: rule__URL__Group__1__Impl rule__URL__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__URL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1"


    // $ANTLR start "rule__URL__Group__1__Impl"
    // InternalLenguajegrafico.g:1699:1: rule__URL__Group__1__Impl : ( '=' ) ;
    public final void rule__URL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1703:1: ( ( '=' ) )
            // InternalLenguajegrafico.g:1704:1: ( '=' )
            {
            // InternalLenguajegrafico.g:1704:1: ( '=' )
            // InternalLenguajegrafico.g:1705:2: '='
            {
             before(grammarAccess.getURLAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__1__Impl"


    // $ANTLR start "rule__URL__Group__2"
    // InternalLenguajegrafico.g:1714:1: rule__URL__Group__2 : rule__URL__Group__2__Impl ;
    public final void rule__URL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1718:1: ( rule__URL__Group__2__Impl )
            // InternalLenguajegrafico.g:1719:2: rule__URL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__2"


    // $ANTLR start "rule__URL__Group__2__Impl"
    // InternalLenguajegrafico.g:1725:1: rule__URL__Group__2__Impl : ( ( rule__URL__ValueAssignment_2 ) ) ;
    public final void rule__URL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1729:1: ( ( ( rule__URL__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:1730:1: ( ( rule__URL__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:1730:1: ( ( rule__URL__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:1731:2: ( rule__URL__ValueAssignment_2 )
            {
             before(grammarAccess.getURLAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:1732:2: ( rule__URL__ValueAssignment_2 )
            // InternalLenguajegrafico.g:1732:3: rule__URL__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__URL__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getURLAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__Group__2__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalLenguajegrafico.g:1741:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1745:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalLenguajegrafico.g:1746:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalLenguajegrafico.g:1753:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1757:1: ( ( 'Title' ) )
            // InternalLenguajegrafico.g:1758:1: ( 'Title' )
            {
            // InternalLenguajegrafico.g:1758:1: ( 'Title' )
            // InternalLenguajegrafico.g:1759:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalLenguajegrafico.g:1768:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1772:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalLenguajegrafico.g:1773:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Title__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalLenguajegrafico.g:1780:1: rule__Title__Group__1__Impl : ( '=' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1784:1: ( ( '=' ) )
            // InternalLenguajegrafico.g:1785:1: ( '=' )
            {
            // InternalLenguajegrafico.g:1785:1: ( '=' )
            // InternalLenguajegrafico.g:1786:2: '='
            {
             before(grammarAccess.getTitleAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__2"
    // InternalLenguajegrafico.g:1795:1: rule__Title__Group__2 : rule__Title__Group__2__Impl ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1799:1: ( rule__Title__Group__2__Impl )
            // InternalLenguajegrafico.g:1800:2: rule__Title__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2"


    // $ANTLR start "rule__Title__Group__2__Impl"
    // InternalLenguajegrafico.g:1806:1: rule__Title__Group__2__Impl : ( ( rule__Title__ValueAssignment_2 ) ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1810:1: ( ( ( rule__Title__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:1811:1: ( ( rule__Title__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:1811:1: ( ( rule__Title__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:1812:2: ( rule__Title__ValueAssignment_2 )
            {
             before(grammarAccess.getTitleAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:1813:2: ( rule__Title__ValueAssignment_2 )
            // InternalLenguajegrafico.g:1813:3: rule__Title__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Title__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2__Impl"


    // $ANTLR start "rule__Labelx__Group__0"
    // InternalLenguajegrafico.g:1822:1: rule__Labelx__Group__0 : rule__Labelx__Group__0__Impl rule__Labelx__Group__1 ;
    public final void rule__Labelx__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1826:1: ( rule__Labelx__Group__0__Impl rule__Labelx__Group__1 )
            // InternalLenguajegrafico.g:1827:2: rule__Labelx__Group__0__Impl rule__Labelx__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Labelx__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labelx__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__Group__0"


    // $ANTLR start "rule__Labelx__Group__0__Impl"
    // InternalLenguajegrafico.g:1834:1: rule__Labelx__Group__0__Impl : ( 'Label_x' ) ;
    public final void rule__Labelx__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1838:1: ( ( 'Label_x' ) )
            // InternalLenguajegrafico.g:1839:1: ( 'Label_x' )
            {
            // InternalLenguajegrafico.g:1839:1: ( 'Label_x' )
            // InternalLenguajegrafico.g:1840:2: 'Label_x'
            {
             before(grammarAccess.getLabelxAccess().getLabel_xKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLabelxAccess().getLabel_xKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__Group__0__Impl"


    // $ANTLR start "rule__Labelx__Group__1"
    // InternalLenguajegrafico.g:1849:1: rule__Labelx__Group__1 : rule__Labelx__Group__1__Impl rule__Labelx__Group__2 ;
    public final void rule__Labelx__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1853:1: ( rule__Labelx__Group__1__Impl rule__Labelx__Group__2 )
            // InternalLenguajegrafico.g:1854:2: rule__Labelx__Group__1__Impl rule__Labelx__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Labelx__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labelx__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__Group__1"


    // $ANTLR start "rule__Labelx__Group__1__Impl"
    // InternalLenguajegrafico.g:1861:1: rule__Labelx__Group__1__Impl : ( '=' ) ;
    public final void rule__Labelx__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1865:1: ( ( '=' ) )
            // InternalLenguajegrafico.g:1866:1: ( '=' )
            {
            // InternalLenguajegrafico.g:1866:1: ( '=' )
            // InternalLenguajegrafico.g:1867:2: '='
            {
             before(grammarAccess.getLabelxAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLabelxAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__Group__1__Impl"


    // $ANTLR start "rule__Labelx__Group__2"
    // InternalLenguajegrafico.g:1876:1: rule__Labelx__Group__2 : rule__Labelx__Group__2__Impl ;
    public final void rule__Labelx__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1880:1: ( rule__Labelx__Group__2__Impl )
            // InternalLenguajegrafico.g:1881:2: rule__Labelx__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Labelx__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__Group__2"


    // $ANTLR start "rule__Labelx__Group__2__Impl"
    // InternalLenguajegrafico.g:1887:1: rule__Labelx__Group__2__Impl : ( ( rule__Labelx__ValueAssignment_2 ) ) ;
    public final void rule__Labelx__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1891:1: ( ( ( rule__Labelx__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:1892:1: ( ( rule__Labelx__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:1892:1: ( ( rule__Labelx__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:1893:2: ( rule__Labelx__ValueAssignment_2 )
            {
             before(grammarAccess.getLabelxAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:1894:2: ( rule__Labelx__ValueAssignment_2 )
            // InternalLenguajegrafico.g:1894:3: rule__Labelx__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Labelx__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelxAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__Group__2__Impl"


    // $ANTLR start "rule__Labely__Group__0"
    // InternalLenguajegrafico.g:1903:1: rule__Labely__Group__0 : rule__Labely__Group__0__Impl rule__Labely__Group__1 ;
    public final void rule__Labely__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1907:1: ( rule__Labely__Group__0__Impl rule__Labely__Group__1 )
            // InternalLenguajegrafico.g:1908:2: rule__Labely__Group__0__Impl rule__Labely__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Labely__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labely__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__Group__0"


    // $ANTLR start "rule__Labely__Group__0__Impl"
    // InternalLenguajegrafico.g:1915:1: rule__Labely__Group__0__Impl : ( 'Label_y' ) ;
    public final void rule__Labely__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1919:1: ( ( 'Label_y' ) )
            // InternalLenguajegrafico.g:1920:1: ( 'Label_y' )
            {
            // InternalLenguajegrafico.g:1920:1: ( 'Label_y' )
            // InternalLenguajegrafico.g:1921:2: 'Label_y'
            {
             before(grammarAccess.getLabelyAccess().getLabel_yKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLabelyAccess().getLabel_yKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__Group__0__Impl"


    // $ANTLR start "rule__Labely__Group__1"
    // InternalLenguajegrafico.g:1930:1: rule__Labely__Group__1 : rule__Labely__Group__1__Impl rule__Labely__Group__2 ;
    public final void rule__Labely__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1934:1: ( rule__Labely__Group__1__Impl rule__Labely__Group__2 )
            // InternalLenguajegrafico.g:1935:2: rule__Labely__Group__1__Impl rule__Labely__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Labely__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Labely__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__Group__1"


    // $ANTLR start "rule__Labely__Group__1__Impl"
    // InternalLenguajegrafico.g:1942:1: rule__Labely__Group__1__Impl : ( '=' ) ;
    public final void rule__Labely__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1946:1: ( ( '=' ) )
            // InternalLenguajegrafico.g:1947:1: ( '=' )
            {
            // InternalLenguajegrafico.g:1947:1: ( '=' )
            // InternalLenguajegrafico.g:1948:2: '='
            {
             before(grammarAccess.getLabelyAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLabelyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__Group__1__Impl"


    // $ANTLR start "rule__Labely__Group__2"
    // InternalLenguajegrafico.g:1957:1: rule__Labely__Group__2 : rule__Labely__Group__2__Impl ;
    public final void rule__Labely__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1961:1: ( rule__Labely__Group__2__Impl )
            // InternalLenguajegrafico.g:1962:2: rule__Labely__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Labely__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__Group__2"


    // $ANTLR start "rule__Labely__Group__2__Impl"
    // InternalLenguajegrafico.g:1968:1: rule__Labely__Group__2__Impl : ( ( rule__Labely__ValueAssignment_2 ) ) ;
    public final void rule__Labely__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1972:1: ( ( ( rule__Labely__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:1973:1: ( ( rule__Labely__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:1973:1: ( ( rule__Labely__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:1974:2: ( rule__Labely__ValueAssignment_2 )
            {
             before(grammarAccess.getLabelyAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:1975:2: ( rule__Labely__ValueAssignment_2 )
            // InternalLenguajegrafico.g:1975:3: rule__Labely__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Labely__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__Group__2__Impl"


    // $ANTLR start "rule__Legend__Group__0"
    // InternalLenguajegrafico.g:1984:1: rule__Legend__Group__0 : rule__Legend__Group__0__Impl rule__Legend__Group__1 ;
    public final void rule__Legend__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:1988:1: ( rule__Legend__Group__0__Impl rule__Legend__Group__1 )
            // InternalLenguajegrafico.g:1989:2: rule__Legend__Group__0__Impl rule__Legend__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Legend__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Legend__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__Group__0"


    // $ANTLR start "rule__Legend__Group__0__Impl"
    // InternalLenguajegrafico.g:1996:1: rule__Legend__Group__0__Impl : ( 'Legend' ) ;
    public final void rule__Legend__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2000:1: ( ( 'Legend' ) )
            // InternalLenguajegrafico.g:2001:1: ( 'Legend' )
            {
            // InternalLenguajegrafico.g:2001:1: ( 'Legend' )
            // InternalLenguajegrafico.g:2002:2: 'Legend'
            {
             before(grammarAccess.getLegendAccess().getLegendKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLegendAccess().getLegendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__Group__0__Impl"


    // $ANTLR start "rule__Legend__Group__1"
    // InternalLenguajegrafico.g:2011:1: rule__Legend__Group__1 : rule__Legend__Group__1__Impl rule__Legend__Group__2 ;
    public final void rule__Legend__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2015:1: ( rule__Legend__Group__1__Impl rule__Legend__Group__2 )
            // InternalLenguajegrafico.g:2016:2: rule__Legend__Group__1__Impl rule__Legend__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Legend__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Legend__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__Group__1"


    // $ANTLR start "rule__Legend__Group__1__Impl"
    // InternalLenguajegrafico.g:2023:1: rule__Legend__Group__1__Impl : ( '.' ) ;
    public final void rule__Legend__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2027:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2028:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2028:1: ( '.' )
            // InternalLenguajegrafico.g:2029:2: '.'
            {
             before(grammarAccess.getLegendAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLegendAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__Group__1__Impl"


    // $ANTLR start "rule__Legend__Group__2"
    // InternalLenguajegrafico.g:2038:1: rule__Legend__Group__2 : rule__Legend__Group__2__Impl ;
    public final void rule__Legend__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2042:1: ( rule__Legend__Group__2__Impl )
            // InternalLenguajegrafico.g:2043:2: rule__Legend__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Legend__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__Group__2"


    // $ANTLR start "rule__Legend__Group__2__Impl"
    // InternalLenguajegrafico.g:2049:1: rule__Legend__Group__2__Impl : ( ( rule__Legend__ValueAssignment_2 ) ) ;
    public final void rule__Legend__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2053:1: ( ( ( rule__Legend__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2054:1: ( ( rule__Legend__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2054:1: ( ( rule__Legend__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2055:2: ( rule__Legend__ValueAssignment_2 )
            {
             before(grammarAccess.getLegendAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2056:2: ( rule__Legend__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2056:3: rule__Legend__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Legend__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLegendAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__Group__2__Impl"


    // $ANTLR start "rule__Hole__Group__0"
    // InternalLenguajegrafico.g:2065:1: rule__Hole__Group__0 : rule__Hole__Group__0__Impl rule__Hole__Group__1 ;
    public final void rule__Hole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2069:1: ( rule__Hole__Group__0__Impl rule__Hole__Group__1 )
            // InternalLenguajegrafico.g:2070:2: rule__Hole__Group__0__Impl rule__Hole__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Hole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__0"


    // $ANTLR start "rule__Hole__Group__0__Impl"
    // InternalLenguajegrafico.g:2077:1: rule__Hole__Group__0__Impl : ( 'Hole' ) ;
    public final void rule__Hole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2081:1: ( ( 'Hole' ) )
            // InternalLenguajegrafico.g:2082:1: ( 'Hole' )
            {
            // InternalLenguajegrafico.g:2082:1: ( 'Hole' )
            // InternalLenguajegrafico.g:2083:2: 'Hole'
            {
             before(grammarAccess.getHoleAccess().getHoleKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getHoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__0__Impl"


    // $ANTLR start "rule__Hole__Group__1"
    // InternalLenguajegrafico.g:2092:1: rule__Hole__Group__1 : rule__Hole__Group__1__Impl rule__Hole__Group__2 ;
    public final void rule__Hole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2096:1: ( rule__Hole__Group__1__Impl rule__Hole__Group__2 )
            // InternalLenguajegrafico.g:2097:2: rule__Hole__Group__1__Impl rule__Hole__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Hole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__1"


    // $ANTLR start "rule__Hole__Group__1__Impl"
    // InternalLenguajegrafico.g:2104:1: rule__Hole__Group__1__Impl : ( '.' ) ;
    public final void rule__Hole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2108:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2109:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2109:1: ( '.' )
            // InternalLenguajegrafico.g:2110:2: '.'
            {
             before(grammarAccess.getHoleAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__1__Impl"


    // $ANTLR start "rule__Hole__Group__2"
    // InternalLenguajegrafico.g:2119:1: rule__Hole__Group__2 : rule__Hole__Group__2__Impl ;
    public final void rule__Hole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2123:1: ( rule__Hole__Group__2__Impl )
            // InternalLenguajegrafico.g:2124:2: rule__Hole__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__2"


    // $ANTLR start "rule__Hole__Group__2__Impl"
    // InternalLenguajegrafico.g:2130:1: rule__Hole__Group__2__Impl : ( ( rule__Hole__ValueAssignment_2 ) ) ;
    public final void rule__Hole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2134:1: ( ( ( rule__Hole__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2135:1: ( ( rule__Hole__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2135:1: ( ( rule__Hole__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2136:2: ( rule__Hole__ValueAssignment_2 )
            {
             before(grammarAccess.getHoleAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2137:2: ( rule__Hole__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2137:3: rule__Hole__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Hole__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__2__Impl"


    // $ANTLR start "rule__Orientation__Group__0"
    // InternalLenguajegrafico.g:2146:1: rule__Orientation__Group__0 : rule__Orientation__Group__0__Impl rule__Orientation__Group__1 ;
    public final void rule__Orientation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2150:1: ( rule__Orientation__Group__0__Impl rule__Orientation__Group__1 )
            // InternalLenguajegrafico.g:2151:2: rule__Orientation__Group__0__Impl rule__Orientation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Orientation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Orientation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__Group__0"


    // $ANTLR start "rule__Orientation__Group__0__Impl"
    // InternalLenguajegrafico.g:2158:1: rule__Orientation__Group__0__Impl : ( 'Orientation' ) ;
    public final void rule__Orientation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2162:1: ( ( 'Orientation' ) )
            // InternalLenguajegrafico.g:2163:1: ( 'Orientation' )
            {
            // InternalLenguajegrafico.g:2163:1: ( 'Orientation' )
            // InternalLenguajegrafico.g:2164:2: 'Orientation'
            {
             before(grammarAccess.getOrientationAccess().getOrientationKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOrientationAccess().getOrientationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__Group__0__Impl"


    // $ANTLR start "rule__Orientation__Group__1"
    // InternalLenguajegrafico.g:2173:1: rule__Orientation__Group__1 : rule__Orientation__Group__1__Impl rule__Orientation__Group__2 ;
    public final void rule__Orientation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2177:1: ( rule__Orientation__Group__1__Impl rule__Orientation__Group__2 )
            // InternalLenguajegrafico.g:2178:2: rule__Orientation__Group__1__Impl rule__Orientation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Orientation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Orientation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__Group__1"


    // $ANTLR start "rule__Orientation__Group__1__Impl"
    // InternalLenguajegrafico.g:2185:1: rule__Orientation__Group__1__Impl : ( '.' ) ;
    public final void rule__Orientation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2189:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2190:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2190:1: ( '.' )
            // InternalLenguajegrafico.g:2191:2: '.'
            {
             before(grammarAccess.getOrientationAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOrientationAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__Group__1__Impl"


    // $ANTLR start "rule__Orientation__Group__2"
    // InternalLenguajegrafico.g:2200:1: rule__Orientation__Group__2 : rule__Orientation__Group__2__Impl ;
    public final void rule__Orientation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2204:1: ( rule__Orientation__Group__2__Impl )
            // InternalLenguajegrafico.g:2205:2: rule__Orientation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Orientation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__Group__2"


    // $ANTLR start "rule__Orientation__Group__2__Impl"
    // InternalLenguajegrafico.g:2211:1: rule__Orientation__Group__2__Impl : ( ( rule__Orientation__ValueAssignment_2 ) ) ;
    public final void rule__Orientation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2215:1: ( ( ( rule__Orientation__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2216:1: ( ( rule__Orientation__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2216:1: ( ( rule__Orientation__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2217:2: ( rule__Orientation__ValueAssignment_2 )
            {
             before(grammarAccess.getOrientationAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2218:2: ( rule__Orientation__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2218:3: rule__Orientation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Orientation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrientationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__Group__2__Impl"


    // $ANTLR start "rule__Area__Group__0"
    // InternalLenguajegrafico.g:2227:1: rule__Area__Group__0 : rule__Area__Group__0__Impl rule__Area__Group__1 ;
    public final void rule__Area__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2231:1: ( rule__Area__Group__0__Impl rule__Area__Group__1 )
            // InternalLenguajegrafico.g:2232:2: rule__Area__Group__0__Impl rule__Area__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Area__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0"


    // $ANTLR start "rule__Area__Group__0__Impl"
    // InternalLenguajegrafico.g:2239:1: rule__Area__Group__0__Impl : ( 'Area' ) ;
    public final void rule__Area__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2243:1: ( ( 'Area' ) )
            // InternalLenguajegrafico.g:2244:1: ( 'Area' )
            {
            // InternalLenguajegrafico.g:2244:1: ( 'Area' )
            // InternalLenguajegrafico.g:2245:2: 'Area'
            {
             before(grammarAccess.getAreaAccess().getAreaKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getAreaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__0__Impl"


    // $ANTLR start "rule__Area__Group__1"
    // InternalLenguajegrafico.g:2254:1: rule__Area__Group__1 : rule__Area__Group__1__Impl rule__Area__Group__2 ;
    public final void rule__Area__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2258:1: ( rule__Area__Group__1__Impl rule__Area__Group__2 )
            // InternalLenguajegrafico.g:2259:2: rule__Area__Group__1__Impl rule__Area__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Area__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Area__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1"


    // $ANTLR start "rule__Area__Group__1__Impl"
    // InternalLenguajegrafico.g:2266:1: rule__Area__Group__1__Impl : ( '.' ) ;
    public final void rule__Area__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2270:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2271:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2271:1: ( '.' )
            // InternalLenguajegrafico.g:2272:2: '.'
            {
             before(grammarAccess.getAreaAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAreaAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__1__Impl"


    // $ANTLR start "rule__Area__Group__2"
    // InternalLenguajegrafico.g:2281:1: rule__Area__Group__2 : rule__Area__Group__2__Impl ;
    public final void rule__Area__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2285:1: ( rule__Area__Group__2__Impl )
            // InternalLenguajegrafico.g:2286:2: rule__Area__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Area__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2"


    // $ANTLR start "rule__Area__Group__2__Impl"
    // InternalLenguajegrafico.g:2292:1: rule__Area__Group__2__Impl : ( ( rule__Area__ValueAssignment_2 ) ) ;
    public final void rule__Area__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2296:1: ( ( ( rule__Area__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2297:1: ( ( rule__Area__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2297:1: ( ( rule__Area__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2298:2: ( rule__Area__ValueAssignment_2 )
            {
             before(grammarAccess.getAreaAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2299:2: ( rule__Area__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2299:3: rule__Area__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Area__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__Group__2__Impl"


    // $ANTLR start "rule__ZoomLevel__Group__0"
    // InternalLenguajegrafico.g:2308:1: rule__ZoomLevel__Group__0 : rule__ZoomLevel__Group__0__Impl rule__ZoomLevel__Group__1 ;
    public final void rule__ZoomLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2312:1: ( rule__ZoomLevel__Group__0__Impl rule__ZoomLevel__Group__1 )
            // InternalLenguajegrafico.g:2313:2: rule__ZoomLevel__Group__0__Impl rule__ZoomLevel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ZoomLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZoomLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__Group__0"


    // $ANTLR start "rule__ZoomLevel__Group__0__Impl"
    // InternalLenguajegrafico.g:2320:1: rule__ZoomLevel__Group__0__Impl : ( 'ZoomLevel' ) ;
    public final void rule__ZoomLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2324:1: ( ( 'ZoomLevel' ) )
            // InternalLenguajegrafico.g:2325:1: ( 'ZoomLevel' )
            {
            // InternalLenguajegrafico.g:2325:1: ( 'ZoomLevel' )
            // InternalLenguajegrafico.g:2326:2: 'ZoomLevel'
            {
             before(grammarAccess.getZoomLevelAccess().getZoomLevelKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getZoomLevelAccess().getZoomLevelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__Group__0__Impl"


    // $ANTLR start "rule__ZoomLevel__Group__1"
    // InternalLenguajegrafico.g:2335:1: rule__ZoomLevel__Group__1 : rule__ZoomLevel__Group__1__Impl rule__ZoomLevel__Group__2 ;
    public final void rule__ZoomLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2339:1: ( rule__ZoomLevel__Group__1__Impl rule__ZoomLevel__Group__2 )
            // InternalLenguajegrafico.g:2340:2: rule__ZoomLevel__Group__1__Impl rule__ZoomLevel__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ZoomLevel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZoomLevel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__Group__1"


    // $ANTLR start "rule__ZoomLevel__Group__1__Impl"
    // InternalLenguajegrafico.g:2347:1: rule__ZoomLevel__Group__1__Impl : ( '=' ) ;
    public final void rule__ZoomLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2351:1: ( ( '=' ) )
            // InternalLenguajegrafico.g:2352:1: ( '=' )
            {
            // InternalLenguajegrafico.g:2352:1: ( '=' )
            // InternalLenguajegrafico.g:2353:2: '='
            {
             before(grammarAccess.getZoomLevelAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getZoomLevelAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__Group__1__Impl"


    // $ANTLR start "rule__ZoomLevel__Group__2"
    // InternalLenguajegrafico.g:2362:1: rule__ZoomLevel__Group__2 : rule__ZoomLevel__Group__2__Impl ;
    public final void rule__ZoomLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2366:1: ( rule__ZoomLevel__Group__2__Impl )
            // InternalLenguajegrafico.g:2367:2: rule__ZoomLevel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZoomLevel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__Group__2"


    // $ANTLR start "rule__ZoomLevel__Group__2__Impl"
    // InternalLenguajegrafico.g:2373:1: rule__ZoomLevel__Group__2__Impl : ( ( rule__ZoomLevel__ValueAssignment_2 ) ) ;
    public final void rule__ZoomLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2377:1: ( ( ( rule__ZoomLevel__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2378:1: ( ( rule__ZoomLevel__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2378:1: ( ( rule__ZoomLevel__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2379:2: ( rule__ZoomLevel__ValueAssignment_2 )
            {
             before(grammarAccess.getZoomLevelAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2380:2: ( rule__ZoomLevel__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2380:3: rule__ZoomLevel__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ZoomLevel__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZoomLevelAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__Group__2__Impl"


    // $ANTLR start "rule__MakerType__Group__0"
    // InternalLenguajegrafico.g:2389:1: rule__MakerType__Group__0 : rule__MakerType__Group__0__Impl rule__MakerType__Group__1 ;
    public final void rule__MakerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2393:1: ( rule__MakerType__Group__0__Impl rule__MakerType__Group__1 )
            // InternalLenguajegrafico.g:2394:2: rule__MakerType__Group__0__Impl rule__MakerType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MakerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__Group__0"


    // $ANTLR start "rule__MakerType__Group__0__Impl"
    // InternalLenguajegrafico.g:2401:1: rule__MakerType__Group__0__Impl : ( 'MakerType' ) ;
    public final void rule__MakerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2405:1: ( ( 'MakerType' ) )
            // InternalLenguajegrafico.g:2406:1: ( 'MakerType' )
            {
            // InternalLenguajegrafico.g:2406:1: ( 'MakerType' )
            // InternalLenguajegrafico.g:2407:2: 'MakerType'
            {
             before(grammarAccess.getMakerTypeAccess().getMakerTypeKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMakerTypeAccess().getMakerTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__Group__0__Impl"


    // $ANTLR start "rule__MakerType__Group__1"
    // InternalLenguajegrafico.g:2416:1: rule__MakerType__Group__1 : rule__MakerType__Group__1__Impl rule__MakerType__Group__2 ;
    public final void rule__MakerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2420:1: ( rule__MakerType__Group__1__Impl rule__MakerType__Group__2 )
            // InternalLenguajegrafico.g:2421:2: rule__MakerType__Group__1__Impl rule__MakerType__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__MakerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MakerType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__Group__1"


    // $ANTLR start "rule__MakerType__Group__1__Impl"
    // InternalLenguajegrafico.g:2428:1: rule__MakerType__Group__1__Impl : ( '.' ) ;
    public final void rule__MakerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2432:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2433:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2433:1: ( '.' )
            // InternalLenguajegrafico.g:2434:2: '.'
            {
             before(grammarAccess.getMakerTypeAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMakerTypeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__Group__1__Impl"


    // $ANTLR start "rule__MakerType__Group__2"
    // InternalLenguajegrafico.g:2443:1: rule__MakerType__Group__2 : rule__MakerType__Group__2__Impl ;
    public final void rule__MakerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2447:1: ( rule__MakerType__Group__2__Impl )
            // InternalLenguajegrafico.g:2448:2: rule__MakerType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MakerType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__Group__2"


    // $ANTLR start "rule__MakerType__Group__2__Impl"
    // InternalLenguajegrafico.g:2454:1: rule__MakerType__Group__2__Impl : ( ( rule__MakerType__ValueAssignment_2 ) ) ;
    public final void rule__MakerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2458:1: ( ( ( rule__MakerType__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2459:1: ( ( rule__MakerType__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2459:1: ( ( rule__MakerType__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2460:2: ( rule__MakerType__ValueAssignment_2 )
            {
             before(grammarAccess.getMakerTypeAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2461:2: ( rule__MakerType__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2461:3: rule__MakerType__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MakerType__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMakerTypeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // InternalLenguajegrafico.g:2470:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2474:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // InternalLenguajegrafico.g:2475:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // InternalLenguajegrafico.g:2482:1: rule__MapType__Group__0__Impl : ( 'MapType' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2486:1: ( ( 'MapType' ) )
            // InternalLenguajegrafico.g:2487:1: ( 'MapType' )
            {
            // InternalLenguajegrafico.g:2487:1: ( 'MapType' )
            // InternalLenguajegrafico.g:2488:2: 'MapType'
            {
             before(grammarAccess.getMapTypeAccess().getMapTypeKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getMapTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // InternalLenguajegrafico.g:2497:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2501:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // InternalLenguajegrafico.g:2502:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // InternalLenguajegrafico.g:2509:1: rule__MapType__Group__1__Impl : ( '.' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2513:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2514:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2514:1: ( '.' )
            // InternalLenguajegrafico.g:2515:2: '.'
            {
             before(grammarAccess.getMapTypeAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMapTypeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // InternalLenguajegrafico.g:2524:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2528:1: ( rule__MapType__Group__2__Impl )
            // InternalLenguajegrafico.g:2529:2: rule__MapType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // InternalLenguajegrafico.g:2535:1: rule__MapType__Group__2__Impl : ( ( rule__MapType__ValueAssignment_2 ) ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2539:1: ( ( ( rule__MapType__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2540:1: ( ( rule__MapType__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2540:1: ( ( rule__MapType__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2541:2: ( rule__MapType__ValueAssignment_2 )
            {
             before(grammarAccess.getMapTypeAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2542:2: ( rule__MapType__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2542:3: rule__MapType__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MapType__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__CellSize__Group__0"
    // InternalLenguajegrafico.g:2551:1: rule__CellSize__Group__0 : rule__CellSize__Group__0__Impl rule__CellSize__Group__1 ;
    public final void rule__CellSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2555:1: ( rule__CellSize__Group__0__Impl rule__CellSize__Group__1 )
            // InternalLenguajegrafico.g:2556:2: rule__CellSize__Group__0__Impl rule__CellSize__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CellSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__Group__0"


    // $ANTLR start "rule__CellSize__Group__0__Impl"
    // InternalLenguajegrafico.g:2563:1: rule__CellSize__Group__0__Impl : ( 'CellSize' ) ;
    public final void rule__CellSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2567:1: ( ( 'CellSize' ) )
            // InternalLenguajegrafico.g:2568:1: ( 'CellSize' )
            {
            // InternalLenguajegrafico.g:2568:1: ( 'CellSize' )
            // InternalLenguajegrafico.g:2569:2: 'CellSize'
            {
             before(grammarAccess.getCellSizeAccess().getCellSizeKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCellSizeAccess().getCellSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__Group__0__Impl"


    // $ANTLR start "rule__CellSize__Group__1"
    // InternalLenguajegrafico.g:2578:1: rule__CellSize__Group__1 : rule__CellSize__Group__1__Impl rule__CellSize__Group__2 ;
    public final void rule__CellSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2582:1: ( rule__CellSize__Group__1__Impl rule__CellSize__Group__2 )
            // InternalLenguajegrafico.g:2583:2: rule__CellSize__Group__1__Impl rule__CellSize__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__CellSize__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellSize__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__Group__1"


    // $ANTLR start "rule__CellSize__Group__1__Impl"
    // InternalLenguajegrafico.g:2590:1: rule__CellSize__Group__1__Impl : ( '.' ) ;
    public final void rule__CellSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2594:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:2595:1: ( '.' )
            {
            // InternalLenguajegrafico.g:2595:1: ( '.' )
            // InternalLenguajegrafico.g:2596:2: '.'
            {
             before(grammarAccess.getCellSizeAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCellSizeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__Group__1__Impl"


    // $ANTLR start "rule__CellSize__Group__2"
    // InternalLenguajegrafico.g:2605:1: rule__CellSize__Group__2 : rule__CellSize__Group__2__Impl ;
    public final void rule__CellSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2609:1: ( rule__CellSize__Group__2__Impl )
            // InternalLenguajegrafico.g:2610:2: rule__CellSize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellSize__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__Group__2"


    // $ANTLR start "rule__CellSize__Group__2__Impl"
    // InternalLenguajegrafico.g:2616:1: rule__CellSize__Group__2__Impl : ( ( rule__CellSize__ValueAssignment_2 ) ) ;
    public final void rule__CellSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2620:1: ( ( ( rule__CellSize__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:2621:1: ( ( rule__CellSize__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:2621:1: ( ( rule__CellSize__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:2622:2: ( rule__CellSize__ValueAssignment_2 )
            {
             before(grammarAccess.getCellSizeAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:2623:2: ( rule__CellSize__ValueAssignment_2 )
            // InternalLenguajegrafico.g:2623:3: rule__CellSize__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CellSize__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellSizeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__Group__2__Impl"


    // $ANTLR start "rule__PieChart__Group__0"
    // InternalLenguajegrafico.g:2632:1: rule__PieChart__Group__0 : rule__PieChart__Group__0__Impl rule__PieChart__Group__1 ;
    public final void rule__PieChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2636:1: ( rule__PieChart__Group__0__Impl rule__PieChart__Group__1 )
            // InternalLenguajegrafico.g:2637:2: rule__PieChart__Group__0__Impl rule__PieChart__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PieChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__0"


    // $ANTLR start "rule__PieChart__Group__0__Impl"
    // InternalLenguajegrafico.g:2644:1: rule__PieChart__Group__0__Impl : ( 'PieChart' ) ;
    public final void rule__PieChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2648:1: ( ( 'PieChart' ) )
            // InternalLenguajegrafico.g:2649:1: ( 'PieChart' )
            {
            // InternalLenguajegrafico.g:2649:1: ( 'PieChart' )
            // InternalLenguajegrafico.g:2650:2: 'PieChart'
            {
             before(grammarAccess.getPieChartAccess().getPieChartKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getPieChartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__0__Impl"


    // $ANTLR start "rule__PieChart__Group__1"
    // InternalLenguajegrafico.g:2659:1: rule__PieChart__Group__1 : rule__PieChart__Group__1__Impl rule__PieChart__Group__2 ;
    public final void rule__PieChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2663:1: ( rule__PieChart__Group__1__Impl rule__PieChart__Group__2 )
            // InternalLenguajegrafico.g:2664:2: rule__PieChart__Group__1__Impl rule__PieChart__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PieChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__1"


    // $ANTLR start "rule__PieChart__Group__1__Impl"
    // InternalLenguajegrafico.g:2671:1: rule__PieChart__Group__1__Impl : ( ( rule__PieChart__NameAssignment_1 ) ) ;
    public final void rule__PieChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2675:1: ( ( ( rule__PieChart__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:2676:1: ( ( rule__PieChart__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:2676:1: ( ( rule__PieChart__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:2677:2: ( rule__PieChart__NameAssignment_1 )
            {
             before(grammarAccess.getPieChartAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:2678:2: ( rule__PieChart__NameAssignment_1 )
            // InternalLenguajegrafico.g:2678:3: rule__PieChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__1__Impl"


    // $ANTLR start "rule__PieChart__Group__2"
    // InternalLenguajegrafico.g:2686:1: rule__PieChart__Group__2 : rule__PieChart__Group__2__Impl rule__PieChart__Group__3 ;
    public final void rule__PieChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2690:1: ( rule__PieChart__Group__2__Impl rule__PieChart__Group__3 )
            // InternalLenguajegrafico.g:2691:2: rule__PieChart__Group__2__Impl rule__PieChart__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PieChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__2"


    // $ANTLR start "rule__PieChart__Group__2__Impl"
    // InternalLenguajegrafico.g:2698:1: rule__PieChart__Group__2__Impl : ( '{' ) ;
    public final void rule__PieChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2702:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:2703:1: ( '{' )
            {
            // InternalLenguajegrafico.g:2703:1: ( '{' )
            // InternalLenguajegrafico.g:2704:2: '{'
            {
             before(grammarAccess.getPieChartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__2__Impl"


    // $ANTLR start "rule__PieChart__Group__3"
    // InternalLenguajegrafico.g:2713:1: rule__PieChart__Group__3 : rule__PieChart__Group__3__Impl rule__PieChart__Group__4 ;
    public final void rule__PieChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2717:1: ( rule__PieChart__Group__3__Impl rule__PieChart__Group__4 )
            // InternalLenguajegrafico.g:2718:2: rule__PieChart__Group__3__Impl rule__PieChart__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__PieChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__3"


    // $ANTLR start "rule__PieChart__Group__3__Impl"
    // InternalLenguajegrafico.g:2725:1: rule__PieChart__Group__3__Impl : ( ( rule__PieChart__TupleAssignment_3 ) ) ;
    public final void rule__PieChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2729:1: ( ( ( rule__PieChart__TupleAssignment_3 ) ) )
            // InternalLenguajegrafico.g:2730:1: ( ( rule__PieChart__TupleAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:2730:1: ( ( rule__PieChart__TupleAssignment_3 ) )
            // InternalLenguajegrafico.g:2731:2: ( rule__PieChart__TupleAssignment_3 )
            {
             before(grammarAccess.getPieChartAccess().getTupleAssignment_3()); 
            // InternalLenguajegrafico.g:2732:2: ( rule__PieChart__TupleAssignment_3 )
            // InternalLenguajegrafico.g:2732:3: rule__PieChart__TupleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__TupleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getTupleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__3__Impl"


    // $ANTLR start "rule__PieChart__Group__4"
    // InternalLenguajegrafico.g:2740:1: rule__PieChart__Group__4 : rule__PieChart__Group__4__Impl rule__PieChart__Group__5 ;
    public final void rule__PieChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2744:1: ( rule__PieChart__Group__4__Impl rule__PieChart__Group__5 )
            // InternalLenguajegrafico.g:2745:2: rule__PieChart__Group__4__Impl rule__PieChart__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__PieChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PieChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__4"


    // $ANTLR start "rule__PieChart__Group__4__Impl"
    // InternalLenguajegrafico.g:2752:1: rule__PieChart__Group__4__Impl : ( ( rule__PieChart__FeaturesAssignment_4 )* ) ;
    public final void rule__PieChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2756:1: ( ( ( rule__PieChart__FeaturesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:2757:1: ( ( rule__PieChart__FeaturesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:2757:1: ( ( rule__PieChart__FeaturesAssignment_4 )* )
            // InternalLenguajegrafico.g:2758:2: ( rule__PieChart__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getPieChartAccess().getFeaturesAssignment_4()); 
            // InternalLenguajegrafico.g:2759:2: ( rule__PieChart__FeaturesAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37||LA23_0==40||LA23_0==42||LA23_0==48) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLenguajegrafico.g:2759:3: rule__PieChart__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__PieChart__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPieChartAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__4__Impl"


    // $ANTLR start "rule__PieChart__Group__5"
    // InternalLenguajegrafico.g:2767:1: rule__PieChart__Group__5 : rule__PieChart__Group__5__Impl ;
    public final void rule__PieChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2771:1: ( rule__PieChart__Group__5__Impl )
            // InternalLenguajegrafico.g:2772:2: rule__PieChart__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__5"


    // $ANTLR start "rule__PieChart__Group__5__Impl"
    // InternalLenguajegrafico.g:2778:1: rule__PieChart__Group__5__Impl : ( '}' ) ;
    public final void rule__PieChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2782:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:2783:1: ( '}' )
            {
            // InternalLenguajegrafico.g:2783:1: ( '}' )
            // InternalLenguajegrafico.g:2784:2: '}'
            {
             before(grammarAccess.getPieChartAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__Group__5__Impl"


    // $ANTLR start "rule__BarChart__Group__0"
    // InternalLenguajegrafico.g:2794:1: rule__BarChart__Group__0 : rule__BarChart__Group__0__Impl rule__BarChart__Group__1 ;
    public final void rule__BarChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2798:1: ( rule__BarChart__Group__0__Impl rule__BarChart__Group__1 )
            // InternalLenguajegrafico.g:2799:2: rule__BarChart__Group__0__Impl rule__BarChart__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BarChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__0"


    // $ANTLR start "rule__BarChart__Group__0__Impl"
    // InternalLenguajegrafico.g:2806:1: rule__BarChart__Group__0__Impl : ( 'BarChart' ) ;
    public final void rule__BarChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2810:1: ( ( 'BarChart' ) )
            // InternalLenguajegrafico.g:2811:1: ( 'BarChart' )
            {
            // InternalLenguajegrafico.g:2811:1: ( 'BarChart' )
            // InternalLenguajegrafico.g:2812:2: 'BarChart'
            {
             before(grammarAccess.getBarChartAccess().getBarChartKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getBarChartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__0__Impl"


    // $ANTLR start "rule__BarChart__Group__1"
    // InternalLenguajegrafico.g:2821:1: rule__BarChart__Group__1 : rule__BarChart__Group__1__Impl rule__BarChart__Group__2 ;
    public final void rule__BarChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2825:1: ( rule__BarChart__Group__1__Impl rule__BarChart__Group__2 )
            // InternalLenguajegrafico.g:2826:2: rule__BarChart__Group__1__Impl rule__BarChart__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BarChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__1"


    // $ANTLR start "rule__BarChart__Group__1__Impl"
    // InternalLenguajegrafico.g:2833:1: rule__BarChart__Group__1__Impl : ( ( rule__BarChart__NameAssignment_1 ) ) ;
    public final void rule__BarChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2837:1: ( ( ( rule__BarChart__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:2838:1: ( ( rule__BarChart__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:2838:1: ( ( rule__BarChart__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:2839:2: ( rule__BarChart__NameAssignment_1 )
            {
             before(grammarAccess.getBarChartAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:2840:2: ( rule__BarChart__NameAssignment_1 )
            // InternalLenguajegrafico.g:2840:3: rule__BarChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__1__Impl"


    // $ANTLR start "rule__BarChart__Group__2"
    // InternalLenguajegrafico.g:2848:1: rule__BarChart__Group__2 : rule__BarChart__Group__2__Impl rule__BarChart__Group__3 ;
    public final void rule__BarChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2852:1: ( rule__BarChart__Group__2__Impl rule__BarChart__Group__3 )
            // InternalLenguajegrafico.g:2853:2: rule__BarChart__Group__2__Impl rule__BarChart__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__BarChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__2"


    // $ANTLR start "rule__BarChart__Group__2__Impl"
    // InternalLenguajegrafico.g:2860:1: rule__BarChart__Group__2__Impl : ( '{' ) ;
    public final void rule__BarChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2864:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:2865:1: ( '{' )
            {
            // InternalLenguajegrafico.g:2865:1: ( '{' )
            // InternalLenguajegrafico.g:2866:2: '{'
            {
             before(grammarAccess.getBarChartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__2__Impl"


    // $ANTLR start "rule__BarChart__Group__3"
    // InternalLenguajegrafico.g:2875:1: rule__BarChart__Group__3 : rule__BarChart__Group__3__Impl rule__BarChart__Group__4 ;
    public final void rule__BarChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2879:1: ( rule__BarChart__Group__3__Impl rule__BarChart__Group__4 )
            // InternalLenguajegrafico.g:2880:2: rule__BarChart__Group__3__Impl rule__BarChart__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__BarChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__3"


    // $ANTLR start "rule__BarChart__Group__3__Impl"
    // InternalLenguajegrafico.g:2887:1: rule__BarChart__Group__3__Impl : ( ( rule__BarChart__TupleAssignment_3 ) ) ;
    public final void rule__BarChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2891:1: ( ( ( rule__BarChart__TupleAssignment_3 ) ) )
            // InternalLenguajegrafico.g:2892:1: ( ( rule__BarChart__TupleAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:2892:1: ( ( rule__BarChart__TupleAssignment_3 ) )
            // InternalLenguajegrafico.g:2893:2: ( rule__BarChart__TupleAssignment_3 )
            {
             before(grammarAccess.getBarChartAccess().getTupleAssignment_3()); 
            // InternalLenguajegrafico.g:2894:2: ( rule__BarChart__TupleAssignment_3 )
            // InternalLenguajegrafico.g:2894:3: rule__BarChart__TupleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__TupleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getTupleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__3__Impl"


    // $ANTLR start "rule__BarChart__Group__4"
    // InternalLenguajegrafico.g:2902:1: rule__BarChart__Group__4 : rule__BarChart__Group__4__Impl rule__BarChart__Group__5 ;
    public final void rule__BarChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2906:1: ( rule__BarChart__Group__4__Impl rule__BarChart__Group__5 )
            // InternalLenguajegrafico.g:2907:2: rule__BarChart__Group__4__Impl rule__BarChart__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__BarChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__4"


    // $ANTLR start "rule__BarChart__Group__4__Impl"
    // InternalLenguajegrafico.g:2914:1: rule__BarChart__Group__4__Impl : ( ( rule__BarChart__FeaturesAssignment_4 )* ) ;
    public final void rule__BarChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2918:1: ( ( ( rule__BarChart__FeaturesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:2919:1: ( ( rule__BarChart__FeaturesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:2919:1: ( ( rule__BarChart__FeaturesAssignment_4 )* )
            // InternalLenguajegrafico.g:2920:2: ( rule__BarChart__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getBarChartAccess().getFeaturesAssignment_4()); 
            // InternalLenguajegrafico.g:2921:2: ( rule__BarChart__FeaturesAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=37 && LA24_0<=40)||LA24_0==43||LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLenguajegrafico.g:2921:3: rule__BarChart__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BarChart__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getBarChartAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__4__Impl"


    // $ANTLR start "rule__BarChart__Group__5"
    // InternalLenguajegrafico.g:2929:1: rule__BarChart__Group__5 : rule__BarChart__Group__5__Impl ;
    public final void rule__BarChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2933:1: ( rule__BarChart__Group__5__Impl )
            // InternalLenguajegrafico.g:2934:2: rule__BarChart__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__5"


    // $ANTLR start "rule__BarChart__Group__5__Impl"
    // InternalLenguajegrafico.g:2940:1: rule__BarChart__Group__5__Impl : ( '}' ) ;
    public final void rule__BarChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2944:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:2945:1: ( '}' )
            {
            // InternalLenguajegrafico.g:2945:1: ( '}' )
            // InternalLenguajegrafico.g:2946:2: '}'
            {
             before(grammarAccess.getBarChartAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__Group__5__Impl"


    // $ANTLR start "rule__LineChart__Group__0"
    // InternalLenguajegrafico.g:2956:1: rule__LineChart__Group__0 : rule__LineChart__Group__0__Impl rule__LineChart__Group__1 ;
    public final void rule__LineChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2960:1: ( rule__LineChart__Group__0__Impl rule__LineChart__Group__1 )
            // InternalLenguajegrafico.g:2961:2: rule__LineChart__Group__0__Impl rule__LineChart__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LineChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__0"


    // $ANTLR start "rule__LineChart__Group__0__Impl"
    // InternalLenguajegrafico.g:2968:1: rule__LineChart__Group__0__Impl : ( 'LineChart' ) ;
    public final void rule__LineChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2972:1: ( ( 'LineChart' ) )
            // InternalLenguajegrafico.g:2973:1: ( 'LineChart' )
            {
            // InternalLenguajegrafico.g:2973:1: ( 'LineChart' )
            // InternalLenguajegrafico.g:2974:2: 'LineChart'
            {
             before(grammarAccess.getLineChartAccess().getLineChartKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLineChartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__0__Impl"


    // $ANTLR start "rule__LineChart__Group__1"
    // InternalLenguajegrafico.g:2983:1: rule__LineChart__Group__1 : rule__LineChart__Group__1__Impl rule__LineChart__Group__2 ;
    public final void rule__LineChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2987:1: ( rule__LineChart__Group__1__Impl rule__LineChart__Group__2 )
            // InternalLenguajegrafico.g:2988:2: rule__LineChart__Group__1__Impl rule__LineChart__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__LineChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__1"


    // $ANTLR start "rule__LineChart__Group__1__Impl"
    // InternalLenguajegrafico.g:2995:1: rule__LineChart__Group__1__Impl : ( ( rule__LineChart__NameAssignment_1 ) ) ;
    public final void rule__LineChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:2999:1: ( ( ( rule__LineChart__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:3000:1: ( ( rule__LineChart__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:3000:1: ( ( rule__LineChart__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:3001:2: ( rule__LineChart__NameAssignment_1 )
            {
             before(grammarAccess.getLineChartAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:3002:2: ( rule__LineChart__NameAssignment_1 )
            // InternalLenguajegrafico.g:3002:3: rule__LineChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__1__Impl"


    // $ANTLR start "rule__LineChart__Group__2"
    // InternalLenguajegrafico.g:3010:1: rule__LineChart__Group__2 : rule__LineChart__Group__2__Impl rule__LineChart__Group__3 ;
    public final void rule__LineChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3014:1: ( rule__LineChart__Group__2__Impl rule__LineChart__Group__3 )
            // InternalLenguajegrafico.g:3015:2: rule__LineChart__Group__2__Impl rule__LineChart__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__LineChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__2"


    // $ANTLR start "rule__LineChart__Group__2__Impl"
    // InternalLenguajegrafico.g:3022:1: rule__LineChart__Group__2__Impl : ( '{' ) ;
    public final void rule__LineChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3026:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:3027:1: ( '{' )
            {
            // InternalLenguajegrafico.g:3027:1: ( '{' )
            // InternalLenguajegrafico.g:3028:2: '{'
            {
             before(grammarAccess.getLineChartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__2__Impl"


    // $ANTLR start "rule__LineChart__Group__3"
    // InternalLenguajegrafico.g:3037:1: rule__LineChart__Group__3 : rule__LineChart__Group__3__Impl rule__LineChart__Group__4 ;
    public final void rule__LineChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3041:1: ( rule__LineChart__Group__3__Impl rule__LineChart__Group__4 )
            // InternalLenguajegrafico.g:3042:2: rule__LineChart__Group__3__Impl rule__LineChart__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__LineChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__3"


    // $ANTLR start "rule__LineChart__Group__3__Impl"
    // InternalLenguajegrafico.g:3049:1: rule__LineChart__Group__3__Impl : ( ( rule__LineChart__TupleAssignment_3 ) ) ;
    public final void rule__LineChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3053:1: ( ( ( rule__LineChart__TupleAssignment_3 ) ) )
            // InternalLenguajegrafico.g:3054:1: ( ( rule__LineChart__TupleAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:3054:1: ( ( rule__LineChart__TupleAssignment_3 ) )
            // InternalLenguajegrafico.g:3055:2: ( rule__LineChart__TupleAssignment_3 )
            {
             before(grammarAccess.getLineChartAccess().getTupleAssignment_3()); 
            // InternalLenguajegrafico.g:3056:2: ( rule__LineChart__TupleAssignment_3 )
            // InternalLenguajegrafico.g:3056:3: rule__LineChart__TupleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__TupleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getTupleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__3__Impl"


    // $ANTLR start "rule__LineChart__Group__4"
    // InternalLenguajegrafico.g:3064:1: rule__LineChart__Group__4 : rule__LineChart__Group__4__Impl rule__LineChart__Group__5 ;
    public final void rule__LineChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3068:1: ( rule__LineChart__Group__4__Impl rule__LineChart__Group__5 )
            // InternalLenguajegrafico.g:3069:2: rule__LineChart__Group__4__Impl rule__LineChart__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__LineChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LineChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__4"


    // $ANTLR start "rule__LineChart__Group__4__Impl"
    // InternalLenguajegrafico.g:3076:1: rule__LineChart__Group__4__Impl : ( ( rule__LineChart__FeaturesAssignment_4 )* ) ;
    public final void rule__LineChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3080:1: ( ( ( rule__LineChart__FeaturesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:3081:1: ( ( rule__LineChart__FeaturesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:3081:1: ( ( rule__LineChart__FeaturesAssignment_4 )* )
            // InternalLenguajegrafico.g:3082:2: ( rule__LineChart__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getLineChartAccess().getFeaturesAssignment_4()); 
            // InternalLenguajegrafico.g:3083:2: ( rule__LineChart__FeaturesAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=37 && LA25_0<=40)||LA25_0==44||LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLenguajegrafico.g:3083:3: rule__LineChart__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__LineChart__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getLineChartAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__4__Impl"


    // $ANTLR start "rule__LineChart__Group__5"
    // InternalLenguajegrafico.g:3091:1: rule__LineChart__Group__5 : rule__LineChart__Group__5__Impl ;
    public final void rule__LineChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3095:1: ( rule__LineChart__Group__5__Impl )
            // InternalLenguajegrafico.g:3096:2: rule__LineChart__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__5"


    // $ANTLR start "rule__LineChart__Group__5__Impl"
    // InternalLenguajegrafico.g:3102:1: rule__LineChart__Group__5__Impl : ( '}' ) ;
    public final void rule__LineChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3106:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:3107:1: ( '}' )
            {
            // InternalLenguajegrafico.g:3107:1: ( '}' )
            // InternalLenguajegrafico.g:3108:2: '}'
            {
             before(grammarAccess.getLineChartAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__Group__5__Impl"


    // $ANTLR start "rule__MapChart__Group__0"
    // InternalLenguajegrafico.g:3118:1: rule__MapChart__Group__0 : rule__MapChart__Group__0__Impl rule__MapChart__Group__1 ;
    public final void rule__MapChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3122:1: ( rule__MapChart__Group__0__Impl rule__MapChart__Group__1 )
            // InternalLenguajegrafico.g:3123:2: rule__MapChart__Group__0__Impl rule__MapChart__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MapChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__0"


    // $ANTLR start "rule__MapChart__Group__0__Impl"
    // InternalLenguajegrafico.g:3130:1: rule__MapChart__Group__0__Impl : ( 'MapChart' ) ;
    public final void rule__MapChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3134:1: ( ( 'MapChart' ) )
            // InternalLenguajegrafico.g:3135:1: ( 'MapChart' )
            {
            // InternalLenguajegrafico.g:3135:1: ( 'MapChart' )
            // InternalLenguajegrafico.g:3136:2: 'MapChart'
            {
             before(grammarAccess.getMapChartAccess().getMapChartKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMapChartAccess().getMapChartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__0__Impl"


    // $ANTLR start "rule__MapChart__Group__1"
    // InternalLenguajegrafico.g:3145:1: rule__MapChart__Group__1 : rule__MapChart__Group__1__Impl rule__MapChart__Group__2 ;
    public final void rule__MapChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3149:1: ( rule__MapChart__Group__1__Impl rule__MapChart__Group__2 )
            // InternalLenguajegrafico.g:3150:2: rule__MapChart__Group__1__Impl rule__MapChart__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MapChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__1"


    // $ANTLR start "rule__MapChart__Group__1__Impl"
    // InternalLenguajegrafico.g:3157:1: rule__MapChart__Group__1__Impl : ( ( rule__MapChart__NameAssignment_1 ) ) ;
    public final void rule__MapChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3161:1: ( ( ( rule__MapChart__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:3162:1: ( ( rule__MapChart__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:3162:1: ( ( rule__MapChart__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:3163:2: ( rule__MapChart__NameAssignment_1 )
            {
             before(grammarAccess.getMapChartAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:3164:2: ( rule__MapChart__NameAssignment_1 )
            // InternalLenguajegrafico.g:3164:3: rule__MapChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MapChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__1__Impl"


    // $ANTLR start "rule__MapChart__Group__2"
    // InternalLenguajegrafico.g:3172:1: rule__MapChart__Group__2 : rule__MapChart__Group__2__Impl rule__MapChart__Group__3 ;
    public final void rule__MapChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3176:1: ( rule__MapChart__Group__2__Impl rule__MapChart__Group__3 )
            // InternalLenguajegrafico.g:3177:2: rule__MapChart__Group__2__Impl rule__MapChart__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MapChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__2"


    // $ANTLR start "rule__MapChart__Group__2__Impl"
    // InternalLenguajegrafico.g:3184:1: rule__MapChart__Group__2__Impl : ( '{' ) ;
    public final void rule__MapChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3188:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:3189:1: ( '{' )
            {
            // InternalLenguajegrafico.g:3189:1: ( '{' )
            // InternalLenguajegrafico.g:3190:2: '{'
            {
             before(grammarAccess.getMapChartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMapChartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__2__Impl"


    // $ANTLR start "rule__MapChart__Group__3"
    // InternalLenguajegrafico.g:3199:1: rule__MapChart__Group__3 : rule__MapChart__Group__3__Impl rule__MapChart__Group__4 ;
    public final void rule__MapChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3203:1: ( rule__MapChart__Group__3__Impl rule__MapChart__Group__4 )
            // InternalLenguajegrafico.g:3204:2: rule__MapChart__Group__3__Impl rule__MapChart__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__MapChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__3"


    // $ANTLR start "rule__MapChart__Group__3__Impl"
    // InternalLenguajegrafico.g:3211:1: rule__MapChart__Group__3__Impl : ( ( rule__MapChart__TupleAssignment_3 ) ) ;
    public final void rule__MapChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3215:1: ( ( ( rule__MapChart__TupleAssignment_3 ) ) )
            // InternalLenguajegrafico.g:3216:1: ( ( rule__MapChart__TupleAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:3216:1: ( ( rule__MapChart__TupleAssignment_3 ) )
            // InternalLenguajegrafico.g:3217:2: ( rule__MapChart__TupleAssignment_3 )
            {
             before(grammarAccess.getMapChartAccess().getTupleAssignment_3()); 
            // InternalLenguajegrafico.g:3218:2: ( rule__MapChart__TupleAssignment_3 )
            // InternalLenguajegrafico.g:3218:3: rule__MapChart__TupleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MapChart__TupleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapChartAccess().getTupleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__3__Impl"


    // $ANTLR start "rule__MapChart__Group__4"
    // InternalLenguajegrafico.g:3226:1: rule__MapChart__Group__4 : rule__MapChart__Group__4__Impl rule__MapChart__Group__5 ;
    public final void rule__MapChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3230:1: ( rule__MapChart__Group__4__Impl rule__MapChart__Group__5 )
            // InternalLenguajegrafico.g:3231:2: rule__MapChart__Group__4__Impl rule__MapChart__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__MapChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MapChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__4"


    // $ANTLR start "rule__MapChart__Group__4__Impl"
    // InternalLenguajegrafico.g:3238:1: rule__MapChart__Group__4__Impl : ( ( rule__MapChart__FeaturesAssignment_4 )* ) ;
    public final void rule__MapChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3242:1: ( ( ( rule__MapChart__FeaturesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:3243:1: ( ( rule__MapChart__FeaturesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:3243:1: ( ( rule__MapChart__FeaturesAssignment_4 )* )
            // InternalLenguajegrafico.g:3244:2: ( rule__MapChart__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getMapChartAccess().getFeaturesAssignment_4()); 
            // InternalLenguajegrafico.g:3245:2: ( rule__MapChart__FeaturesAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37||(LA26_0>=45 && LA26_0<=48)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLenguajegrafico.g:3245:3: rule__MapChart__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MapChart__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMapChartAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__4__Impl"


    // $ANTLR start "rule__MapChart__Group__5"
    // InternalLenguajegrafico.g:3253:1: rule__MapChart__Group__5 : rule__MapChart__Group__5__Impl ;
    public final void rule__MapChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3257:1: ( rule__MapChart__Group__5__Impl )
            // InternalLenguajegrafico.g:3258:2: rule__MapChart__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MapChart__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__5"


    // $ANTLR start "rule__MapChart__Group__5__Impl"
    // InternalLenguajegrafico.g:3264:1: rule__MapChart__Group__5__Impl : ( '}' ) ;
    public final void rule__MapChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3268:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:3269:1: ( '}' )
            {
            // InternalLenguajegrafico.g:3269:1: ( '}' )
            // InternalLenguajegrafico.g:3270:2: '}'
            {
             before(grammarAccess.getMapChartAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMapChartAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__Group__5__Impl"


    // $ANTLR start "rule__TableChart__Group__0"
    // InternalLenguajegrafico.g:3280:1: rule__TableChart__Group__0 : rule__TableChart__Group__0__Impl rule__TableChart__Group__1 ;
    public final void rule__TableChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3284:1: ( rule__TableChart__Group__0__Impl rule__TableChart__Group__1 )
            // InternalLenguajegrafico.g:3285:2: rule__TableChart__Group__0__Impl rule__TableChart__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TableChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__0"


    // $ANTLR start "rule__TableChart__Group__0__Impl"
    // InternalLenguajegrafico.g:3292:1: rule__TableChart__Group__0__Impl : ( 'TableChart' ) ;
    public final void rule__TableChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3296:1: ( ( 'TableChart' ) )
            // InternalLenguajegrafico.g:3297:1: ( 'TableChart' )
            {
            // InternalLenguajegrafico.g:3297:1: ( 'TableChart' )
            // InternalLenguajegrafico.g:3298:2: 'TableChart'
            {
             before(grammarAccess.getTableChartAccess().getTableChartKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTableChartAccess().getTableChartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__0__Impl"


    // $ANTLR start "rule__TableChart__Group__1"
    // InternalLenguajegrafico.g:3307:1: rule__TableChart__Group__1 : rule__TableChart__Group__1__Impl rule__TableChart__Group__2 ;
    public final void rule__TableChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3311:1: ( rule__TableChart__Group__1__Impl rule__TableChart__Group__2 )
            // InternalLenguajegrafico.g:3312:2: rule__TableChart__Group__1__Impl rule__TableChart__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TableChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__1"


    // $ANTLR start "rule__TableChart__Group__1__Impl"
    // InternalLenguajegrafico.g:3319:1: rule__TableChart__Group__1__Impl : ( ( rule__TableChart__NameAssignment_1 ) ) ;
    public final void rule__TableChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3323:1: ( ( ( rule__TableChart__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:3324:1: ( ( rule__TableChart__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:3324:1: ( ( rule__TableChart__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:3325:2: ( rule__TableChart__NameAssignment_1 )
            {
             before(grammarAccess.getTableChartAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:3326:2: ( rule__TableChart__NameAssignment_1 )
            // InternalLenguajegrafico.g:3326:3: rule__TableChart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableChart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableChartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__1__Impl"


    // $ANTLR start "rule__TableChart__Group__2"
    // InternalLenguajegrafico.g:3334:1: rule__TableChart__Group__2 : rule__TableChart__Group__2__Impl rule__TableChart__Group__3 ;
    public final void rule__TableChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3338:1: ( rule__TableChart__Group__2__Impl rule__TableChart__Group__3 )
            // InternalLenguajegrafico.g:3339:2: rule__TableChart__Group__2__Impl rule__TableChart__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__TableChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__2"


    // $ANTLR start "rule__TableChart__Group__2__Impl"
    // InternalLenguajegrafico.g:3346:1: rule__TableChart__Group__2__Impl : ( '{' ) ;
    public final void rule__TableChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3350:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:3351:1: ( '{' )
            {
            // InternalLenguajegrafico.g:3351:1: ( '{' )
            // InternalLenguajegrafico.g:3352:2: '{'
            {
             before(grammarAccess.getTableChartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTableChartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__2__Impl"


    // $ANTLR start "rule__TableChart__Group__3"
    // InternalLenguajegrafico.g:3361:1: rule__TableChart__Group__3 : rule__TableChart__Group__3__Impl rule__TableChart__Group__4 ;
    public final void rule__TableChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3365:1: ( rule__TableChart__Group__3__Impl rule__TableChart__Group__4 )
            // InternalLenguajegrafico.g:3366:2: rule__TableChart__Group__3__Impl rule__TableChart__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TableChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__3"


    // $ANTLR start "rule__TableChart__Group__3__Impl"
    // InternalLenguajegrafico.g:3373:1: rule__TableChart__Group__3__Impl : ( ( rule__TableChart__TupleAssignment_3 ) ) ;
    public final void rule__TableChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3377:1: ( ( ( rule__TableChart__TupleAssignment_3 ) ) )
            // InternalLenguajegrafico.g:3378:1: ( ( rule__TableChart__TupleAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:3378:1: ( ( rule__TableChart__TupleAssignment_3 ) )
            // InternalLenguajegrafico.g:3379:2: ( rule__TableChart__TupleAssignment_3 )
            {
             before(grammarAccess.getTableChartAccess().getTupleAssignment_3()); 
            // InternalLenguajegrafico.g:3380:2: ( rule__TableChart__TupleAssignment_3 )
            // InternalLenguajegrafico.g:3380:3: rule__TableChart__TupleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TableChart__TupleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableChartAccess().getTupleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__3__Impl"


    // $ANTLR start "rule__TableChart__Group__4"
    // InternalLenguajegrafico.g:3388:1: rule__TableChart__Group__4 : rule__TableChart__Group__4__Impl rule__TableChart__Group__5 ;
    public final void rule__TableChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3392:1: ( rule__TableChart__Group__4__Impl rule__TableChart__Group__5 )
            // InternalLenguajegrafico.g:3393:2: rule__TableChart__Group__4__Impl rule__TableChart__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__TableChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__4"


    // $ANTLR start "rule__TableChart__Group__4__Impl"
    // InternalLenguajegrafico.g:3400:1: rule__TableChart__Group__4__Impl : ( ( rule__TableChart__FeaturesAssignment_4 )* ) ;
    public final void rule__TableChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3404:1: ( ( ( rule__TableChart__FeaturesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:3405:1: ( ( rule__TableChart__FeaturesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:3405:1: ( ( rule__TableChart__FeaturesAssignment_4 )* )
            // InternalLenguajegrafico.g:3406:2: ( rule__TableChart__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getTableChartAccess().getFeaturesAssignment_4()); 
            // InternalLenguajegrafico.g:3407:2: ( rule__TableChart__FeaturesAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37||LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLenguajegrafico.g:3407:3: rule__TableChart__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TableChart__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTableChartAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__4__Impl"


    // $ANTLR start "rule__TableChart__Group__5"
    // InternalLenguajegrafico.g:3415:1: rule__TableChart__Group__5 : rule__TableChart__Group__5__Impl ;
    public final void rule__TableChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3419:1: ( rule__TableChart__Group__5__Impl )
            // InternalLenguajegrafico.g:3420:2: rule__TableChart__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableChart__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__5"


    // $ANTLR start "rule__TableChart__Group__5__Impl"
    // InternalLenguajegrafico.g:3426:1: rule__TableChart__Group__5__Impl : ( '}' ) ;
    public final void rule__TableChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3430:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:3431:1: ( '}' )
            {
            // InternalLenguajegrafico.g:3431:1: ( '}' )
            // InternalLenguajegrafico.g:3432:2: '}'
            {
             before(grammarAccess.getTableChartAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTableChartAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__Group__5__Impl"


    // $ANTLR start "rule__DashBoard__Group__0"
    // InternalLenguajegrafico.g:3442:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3446:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalLenguajegrafico.g:3447:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DashBoard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__0"


    // $ANTLR start "rule__DashBoard__Group__0__Impl"
    // InternalLenguajegrafico.g:3454:1: rule__DashBoard__Group__0__Impl : ( 'DashBoard' ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3458:1: ( ( 'DashBoard' ) )
            // InternalLenguajegrafico.g:3459:1: ( 'DashBoard' )
            {
            // InternalLenguajegrafico.g:3459:1: ( 'DashBoard' )
            // InternalLenguajegrafico.g:3460:2: 'DashBoard'
            {
             before(grammarAccess.getDashBoardAccess().getDashBoardKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getDashBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__0__Impl"


    // $ANTLR start "rule__DashBoard__Group__1"
    // InternalLenguajegrafico.g:3469:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3473:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalLenguajegrafico.g:3474:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DashBoard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__1"


    // $ANTLR start "rule__DashBoard__Group__1__Impl"
    // InternalLenguajegrafico.g:3481:1: rule__DashBoard__Group__1__Impl : ( ( rule__DashBoard__NameAssignment_1 ) ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3485:1: ( ( ( rule__DashBoard__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:3486:1: ( ( rule__DashBoard__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:3486:1: ( ( rule__DashBoard__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:3487:2: ( rule__DashBoard__NameAssignment_1 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:3488:2: ( rule__DashBoard__NameAssignment_1 )
            // InternalLenguajegrafico.g:3488:3: rule__DashBoard__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__1__Impl"


    // $ANTLR start "rule__DashBoard__Group__2"
    // InternalLenguajegrafico.g:3496:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3500:1: ( rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 )
            // InternalLenguajegrafico.g:3501:2: rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DashBoard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__2"


    // $ANTLR start "rule__DashBoard__Group__2__Impl"
    // InternalLenguajegrafico.g:3508:1: rule__DashBoard__Group__2__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3512:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:3513:1: ( '{' )
            {
            // InternalLenguajegrafico.g:3513:1: ( '{' )
            // InternalLenguajegrafico.g:3514:2: '{'
            {
             before(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__2__Impl"


    // $ANTLR start "rule__DashBoard__Group__3"
    // InternalLenguajegrafico.g:3523:1: rule__DashBoard__Group__3 : rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 ;
    public final void rule__DashBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3527:1: ( rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 )
            // InternalLenguajegrafico.g:3528:2: rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DashBoard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__3"


    // $ANTLR start "rule__DashBoard__Group__3__Impl"
    // InternalLenguajegrafico.g:3535:1: rule__DashBoard__Group__3__Impl : ( ( ( rule__DashBoard__ChartsAssignment_3 ) ) ( ( rule__DashBoard__ChartsAssignment_3 )* ) ) ;
    public final void rule__DashBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3539:1: ( ( ( ( rule__DashBoard__ChartsAssignment_3 ) ) ( ( rule__DashBoard__ChartsAssignment_3 )* ) ) )
            // InternalLenguajegrafico.g:3540:1: ( ( ( rule__DashBoard__ChartsAssignment_3 ) ) ( ( rule__DashBoard__ChartsAssignment_3 )* ) )
            {
            // InternalLenguajegrafico.g:3540:1: ( ( ( rule__DashBoard__ChartsAssignment_3 ) ) ( ( rule__DashBoard__ChartsAssignment_3 )* ) )
            // InternalLenguajegrafico.g:3541:2: ( ( rule__DashBoard__ChartsAssignment_3 ) ) ( ( rule__DashBoard__ChartsAssignment_3 )* )
            {
            // InternalLenguajegrafico.g:3541:2: ( ( rule__DashBoard__ChartsAssignment_3 ) )
            // InternalLenguajegrafico.g:3542:3: ( rule__DashBoard__ChartsAssignment_3 )
            {
             before(grammarAccess.getDashBoardAccess().getChartsAssignment_3()); 
            // InternalLenguajegrafico.g:3543:3: ( rule__DashBoard__ChartsAssignment_3 )
            // InternalLenguajegrafico.g:3543:4: rule__DashBoard__ChartsAssignment_3
            {
            pushFollow(FOLLOW_24);
            rule__DashBoard__ChartsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getChartsAssignment_3()); 

            }

            // InternalLenguajegrafico.g:3546:2: ( ( rule__DashBoard__ChartsAssignment_3 )* )
            // InternalLenguajegrafico.g:3547:3: ( rule__DashBoard__ChartsAssignment_3 )*
            {
             before(grammarAccess.getDashBoardAccess().getChartsAssignment_3()); 
            // InternalLenguajegrafico.g:3548:3: ( rule__DashBoard__ChartsAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLenguajegrafico.g:3548:4: rule__DashBoard__ChartsAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DashBoard__ChartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDashBoardAccess().getChartsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__3__Impl"


    // $ANTLR start "rule__DashBoard__Group__4"
    // InternalLenguajegrafico.g:3557:1: rule__DashBoard__Group__4 : rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 ;
    public final void rule__DashBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3561:1: ( rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 )
            // InternalLenguajegrafico.g:3562:2: rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__DashBoard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__4"


    // $ANTLR start "rule__DashBoard__Group__4__Impl"
    // InternalLenguajegrafico.g:3569:1: rule__DashBoard__Group__4__Impl : ( ( rule__DashBoard__FeaturesAssignment_4 )* ) ;
    public final void rule__DashBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3573:1: ( ( ( rule__DashBoard__FeaturesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:3574:1: ( ( rule__DashBoard__FeaturesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:3574:1: ( ( rule__DashBoard__FeaturesAssignment_4 )* )
            // InternalLenguajegrafico.g:3575:2: ( rule__DashBoard__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getDashBoardAccess().getFeaturesAssignment_4()); 
            // InternalLenguajegrafico.g:3576:2: ( rule__DashBoard__FeaturesAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLenguajegrafico.g:3576:3: rule__DashBoard__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DashBoard__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDashBoardAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__4__Impl"


    // $ANTLR start "rule__DashBoard__Group__5"
    // InternalLenguajegrafico.g:3584:1: rule__DashBoard__Group__5 : rule__DashBoard__Group__5__Impl ;
    public final void rule__DashBoard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3588:1: ( rule__DashBoard__Group__5__Impl )
            // InternalLenguajegrafico.g:3589:2: rule__DashBoard__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__5"


    // $ANTLR start "rule__DashBoard__Group__5__Impl"
    // InternalLenguajegrafico.g:3595:1: rule__DashBoard__Group__5__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3599:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:3600:1: ( '}' )
            {
            // InternalLenguajegrafico.g:3600:1: ( '}' )
            // InternalLenguajegrafico.g:3601:2: '}'
            {
             before(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__5__Impl"


    // $ANTLR start "rule__Tuple1__Group__0"
    // InternalLenguajegrafico.g:3611:1: rule__Tuple1__Group__0 : rule__Tuple1__Group__0__Impl rule__Tuple1__Group__1 ;
    public final void rule__Tuple1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3615:1: ( rule__Tuple1__Group__0__Impl rule__Tuple1__Group__1 )
            // InternalLenguajegrafico.g:3616:2: rule__Tuple1__Group__0__Impl rule__Tuple1__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tuple1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__0"


    // $ANTLR start "rule__Tuple1__Group__0__Impl"
    // InternalLenguajegrafico.g:3623:1: rule__Tuple1__Group__0__Impl : ( 'Tuple1' ) ;
    public final void rule__Tuple1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3627:1: ( ( 'Tuple1' ) )
            // InternalLenguajegrafico.g:3628:1: ( 'Tuple1' )
            {
            // InternalLenguajegrafico.g:3628:1: ( 'Tuple1' )
            // InternalLenguajegrafico.g:3629:2: 'Tuple1'
            {
             before(grammarAccess.getTuple1Access().getTuple1Keyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTuple1Access().getTuple1Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__0__Impl"


    // $ANTLR start "rule__Tuple1__Group__1"
    // InternalLenguajegrafico.g:3638:1: rule__Tuple1__Group__1 : rule__Tuple1__Group__1__Impl rule__Tuple1__Group__2 ;
    public final void rule__Tuple1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3642:1: ( rule__Tuple1__Group__1__Impl rule__Tuple1__Group__2 )
            // InternalLenguajegrafico.g:3643:2: rule__Tuple1__Group__1__Impl rule__Tuple1__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tuple1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__1"


    // $ANTLR start "rule__Tuple1__Group__1__Impl"
    // InternalLenguajegrafico.g:3650:1: rule__Tuple1__Group__1__Impl : ( ( rule__Tuple1__NameAssignment_1 ) ) ;
    public final void rule__Tuple1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3654:1: ( ( ( rule__Tuple1__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:3655:1: ( ( rule__Tuple1__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:3655:1: ( ( rule__Tuple1__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:3656:2: ( rule__Tuple1__NameAssignment_1 )
            {
             before(grammarAccess.getTuple1Access().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:3657:2: ( rule__Tuple1__NameAssignment_1 )
            // InternalLenguajegrafico.g:3657:3: rule__Tuple1__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tuple1__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTuple1Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__1__Impl"


    // $ANTLR start "rule__Tuple1__Group__2"
    // InternalLenguajegrafico.g:3665:1: rule__Tuple1__Group__2 : rule__Tuple1__Group__2__Impl rule__Tuple1__Group__3 ;
    public final void rule__Tuple1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3669:1: ( rule__Tuple1__Group__2__Impl rule__Tuple1__Group__3 )
            // InternalLenguajegrafico.g:3670:2: rule__Tuple1__Group__2__Impl rule__Tuple1__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Tuple1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__2"


    // $ANTLR start "rule__Tuple1__Group__2__Impl"
    // InternalLenguajegrafico.g:3677:1: rule__Tuple1__Group__2__Impl : ( '{' ) ;
    public final void rule__Tuple1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3681:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:3682:1: ( '{' )
            {
            // InternalLenguajegrafico.g:3682:1: ( '{' )
            // InternalLenguajegrafico.g:3683:2: '{'
            {
             before(grammarAccess.getTuple1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTuple1Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__2__Impl"


    // $ANTLR start "rule__Tuple1__Group__3"
    // InternalLenguajegrafico.g:3692:1: rule__Tuple1__Group__3 : rule__Tuple1__Group__3__Impl rule__Tuple1__Group__4 ;
    public final void rule__Tuple1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3696:1: ( rule__Tuple1__Group__3__Impl rule__Tuple1__Group__4 )
            // InternalLenguajegrafico.g:3697:2: rule__Tuple1__Group__3__Impl rule__Tuple1__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Tuple1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__3"


    // $ANTLR start "rule__Tuple1__Group__3__Impl"
    // InternalLenguajegrafico.g:3704:1: rule__Tuple1__Group__3__Impl : ( ( rule__Tuple1__UrlAssignment_3 ) ) ;
    public final void rule__Tuple1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3708:1: ( ( ( rule__Tuple1__UrlAssignment_3 ) ) )
            // InternalLenguajegrafico.g:3709:1: ( ( rule__Tuple1__UrlAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:3709:1: ( ( rule__Tuple1__UrlAssignment_3 ) )
            // InternalLenguajegrafico.g:3710:2: ( rule__Tuple1__UrlAssignment_3 )
            {
             before(grammarAccess.getTuple1Access().getUrlAssignment_3()); 
            // InternalLenguajegrafico.g:3711:2: ( rule__Tuple1__UrlAssignment_3 )
            // InternalLenguajegrafico.g:3711:3: rule__Tuple1__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tuple1__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTuple1Access().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__3__Impl"


    // $ANTLR start "rule__Tuple1__Group__4"
    // InternalLenguajegrafico.g:3719:1: rule__Tuple1__Group__4 : rule__Tuple1__Group__4__Impl rule__Tuple1__Group__5 ;
    public final void rule__Tuple1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3723:1: ( rule__Tuple1__Group__4__Impl rule__Tuple1__Group__5 )
            // InternalLenguajegrafico.g:3724:2: rule__Tuple1__Group__4__Impl rule__Tuple1__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Tuple1__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__4"


    // $ANTLR start "rule__Tuple1__Group__4__Impl"
    // InternalLenguajegrafico.g:3731:1: rule__Tuple1__Group__4__Impl : ( ( rule__Tuple1__Value1Assignment_4 ) ) ;
    public final void rule__Tuple1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3735:1: ( ( ( rule__Tuple1__Value1Assignment_4 ) ) )
            // InternalLenguajegrafico.g:3736:1: ( ( rule__Tuple1__Value1Assignment_4 ) )
            {
            // InternalLenguajegrafico.g:3736:1: ( ( rule__Tuple1__Value1Assignment_4 ) )
            // InternalLenguajegrafico.g:3737:2: ( rule__Tuple1__Value1Assignment_4 )
            {
             before(grammarAccess.getTuple1Access().getValue1Assignment_4()); 
            // InternalLenguajegrafico.g:3738:2: ( rule__Tuple1__Value1Assignment_4 )
            // InternalLenguajegrafico.g:3738:3: rule__Tuple1__Value1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tuple1__Value1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTuple1Access().getValue1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__4__Impl"


    // $ANTLR start "rule__Tuple1__Group__5"
    // InternalLenguajegrafico.g:3746:1: rule__Tuple1__Group__5 : rule__Tuple1__Group__5__Impl rule__Tuple1__Group__6 ;
    public final void rule__Tuple1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3750:1: ( rule__Tuple1__Group__5__Impl rule__Tuple1__Group__6 )
            // InternalLenguajegrafico.g:3751:2: rule__Tuple1__Group__5__Impl rule__Tuple1__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Tuple1__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__5"


    // $ANTLR start "rule__Tuple1__Group__5__Impl"
    // InternalLenguajegrafico.g:3758:1: rule__Tuple1__Group__5__Impl : ( ( rule__Tuple1__Value2Assignment_5 ) ) ;
    public final void rule__Tuple1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3762:1: ( ( ( rule__Tuple1__Value2Assignment_5 ) ) )
            // InternalLenguajegrafico.g:3763:1: ( ( rule__Tuple1__Value2Assignment_5 ) )
            {
            // InternalLenguajegrafico.g:3763:1: ( ( rule__Tuple1__Value2Assignment_5 ) )
            // InternalLenguajegrafico.g:3764:2: ( rule__Tuple1__Value2Assignment_5 )
            {
             before(grammarAccess.getTuple1Access().getValue2Assignment_5()); 
            // InternalLenguajegrafico.g:3765:2: ( rule__Tuple1__Value2Assignment_5 )
            // InternalLenguajegrafico.g:3765:3: rule__Tuple1__Value2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Tuple1__Value2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTuple1Access().getValue2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__5__Impl"


    // $ANTLR start "rule__Tuple1__Group__6"
    // InternalLenguajegrafico.g:3773:1: rule__Tuple1__Group__6 : rule__Tuple1__Group__6__Impl ;
    public final void rule__Tuple1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3777:1: ( rule__Tuple1__Group__6__Impl )
            // InternalLenguajegrafico.g:3778:2: rule__Tuple1__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple1__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__6"


    // $ANTLR start "rule__Tuple1__Group__6__Impl"
    // InternalLenguajegrafico.g:3784:1: rule__Tuple1__Group__6__Impl : ( '}' ) ;
    public final void rule__Tuple1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3788:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:3789:1: ( '}' )
            {
            // InternalLenguajegrafico.g:3789:1: ( '}' )
            // InternalLenguajegrafico.g:3790:2: '}'
            {
             before(grammarAccess.getTuple1Access().getRightCurlyBracketKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTuple1Access().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Group__6__Impl"


    // $ANTLR start "rule__Tuple2__Group__0"
    // InternalLenguajegrafico.g:3800:1: rule__Tuple2__Group__0 : rule__Tuple2__Group__0__Impl rule__Tuple2__Group__1 ;
    public final void rule__Tuple2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3804:1: ( rule__Tuple2__Group__0__Impl rule__Tuple2__Group__1 )
            // InternalLenguajegrafico.g:3805:2: rule__Tuple2__Group__0__Impl rule__Tuple2__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tuple2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__0"


    // $ANTLR start "rule__Tuple2__Group__0__Impl"
    // InternalLenguajegrafico.g:3812:1: rule__Tuple2__Group__0__Impl : ( 'Tuple2' ) ;
    public final void rule__Tuple2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3816:1: ( ( 'Tuple2' ) )
            // InternalLenguajegrafico.g:3817:1: ( 'Tuple2' )
            {
            // InternalLenguajegrafico.g:3817:1: ( 'Tuple2' )
            // InternalLenguajegrafico.g:3818:2: 'Tuple2'
            {
             before(grammarAccess.getTuple2Access().getTuple2Keyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTuple2Access().getTuple2Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__0__Impl"


    // $ANTLR start "rule__Tuple2__Group__1"
    // InternalLenguajegrafico.g:3827:1: rule__Tuple2__Group__1 : rule__Tuple2__Group__1__Impl rule__Tuple2__Group__2 ;
    public final void rule__Tuple2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3831:1: ( rule__Tuple2__Group__1__Impl rule__Tuple2__Group__2 )
            // InternalLenguajegrafico.g:3832:2: rule__Tuple2__Group__1__Impl rule__Tuple2__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tuple2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__1"


    // $ANTLR start "rule__Tuple2__Group__1__Impl"
    // InternalLenguajegrafico.g:3839:1: rule__Tuple2__Group__1__Impl : ( ( rule__Tuple2__NameAssignment_1 ) ) ;
    public final void rule__Tuple2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3843:1: ( ( ( rule__Tuple2__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:3844:1: ( ( rule__Tuple2__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:3844:1: ( ( rule__Tuple2__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:3845:2: ( rule__Tuple2__NameAssignment_1 )
            {
             before(grammarAccess.getTuple2Access().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:3846:2: ( rule__Tuple2__NameAssignment_1 )
            // InternalLenguajegrafico.g:3846:3: rule__Tuple2__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tuple2__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTuple2Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__1__Impl"


    // $ANTLR start "rule__Tuple2__Group__2"
    // InternalLenguajegrafico.g:3854:1: rule__Tuple2__Group__2 : rule__Tuple2__Group__2__Impl rule__Tuple2__Group__3 ;
    public final void rule__Tuple2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3858:1: ( rule__Tuple2__Group__2__Impl rule__Tuple2__Group__3 )
            // InternalLenguajegrafico.g:3859:2: rule__Tuple2__Group__2__Impl rule__Tuple2__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Tuple2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__2"


    // $ANTLR start "rule__Tuple2__Group__2__Impl"
    // InternalLenguajegrafico.g:3866:1: rule__Tuple2__Group__2__Impl : ( '{' ) ;
    public final void rule__Tuple2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3870:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:3871:1: ( '{' )
            {
            // InternalLenguajegrafico.g:3871:1: ( '{' )
            // InternalLenguajegrafico.g:3872:2: '{'
            {
             before(grammarAccess.getTuple2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTuple2Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__2__Impl"


    // $ANTLR start "rule__Tuple2__Group__3"
    // InternalLenguajegrafico.g:3881:1: rule__Tuple2__Group__3 : rule__Tuple2__Group__3__Impl rule__Tuple2__Group__4 ;
    public final void rule__Tuple2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3885:1: ( rule__Tuple2__Group__3__Impl rule__Tuple2__Group__4 )
            // InternalLenguajegrafico.g:3886:2: rule__Tuple2__Group__3__Impl rule__Tuple2__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Tuple2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__3"


    // $ANTLR start "rule__Tuple2__Group__3__Impl"
    // InternalLenguajegrafico.g:3893:1: rule__Tuple2__Group__3__Impl : ( ( rule__Tuple2__UrlAssignment_3 ) ) ;
    public final void rule__Tuple2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3897:1: ( ( ( rule__Tuple2__UrlAssignment_3 ) ) )
            // InternalLenguajegrafico.g:3898:1: ( ( rule__Tuple2__UrlAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:3898:1: ( ( rule__Tuple2__UrlAssignment_3 ) )
            // InternalLenguajegrafico.g:3899:2: ( rule__Tuple2__UrlAssignment_3 )
            {
             before(grammarAccess.getTuple2Access().getUrlAssignment_3()); 
            // InternalLenguajegrafico.g:3900:2: ( rule__Tuple2__UrlAssignment_3 )
            // InternalLenguajegrafico.g:3900:3: rule__Tuple2__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tuple2__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTuple2Access().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__3__Impl"


    // $ANTLR start "rule__Tuple2__Group__4"
    // InternalLenguajegrafico.g:3908:1: rule__Tuple2__Group__4 : rule__Tuple2__Group__4__Impl rule__Tuple2__Group__5 ;
    public final void rule__Tuple2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3912:1: ( rule__Tuple2__Group__4__Impl rule__Tuple2__Group__5 )
            // InternalLenguajegrafico.g:3913:2: rule__Tuple2__Group__4__Impl rule__Tuple2__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Tuple2__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__4"


    // $ANTLR start "rule__Tuple2__Group__4__Impl"
    // InternalLenguajegrafico.g:3920:1: rule__Tuple2__Group__4__Impl : ( ( rule__Tuple2__Value1Assignment_4 ) ) ;
    public final void rule__Tuple2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3924:1: ( ( ( rule__Tuple2__Value1Assignment_4 ) ) )
            // InternalLenguajegrafico.g:3925:1: ( ( rule__Tuple2__Value1Assignment_4 ) )
            {
            // InternalLenguajegrafico.g:3925:1: ( ( rule__Tuple2__Value1Assignment_4 ) )
            // InternalLenguajegrafico.g:3926:2: ( rule__Tuple2__Value1Assignment_4 )
            {
             before(grammarAccess.getTuple2Access().getValue1Assignment_4()); 
            // InternalLenguajegrafico.g:3927:2: ( rule__Tuple2__Value1Assignment_4 )
            // InternalLenguajegrafico.g:3927:3: rule__Tuple2__Value1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tuple2__Value1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTuple2Access().getValue1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__4__Impl"


    // $ANTLR start "rule__Tuple2__Group__5"
    // InternalLenguajegrafico.g:3935:1: rule__Tuple2__Group__5 : rule__Tuple2__Group__5__Impl rule__Tuple2__Group__6 ;
    public final void rule__Tuple2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3939:1: ( rule__Tuple2__Group__5__Impl rule__Tuple2__Group__6 )
            // InternalLenguajegrafico.g:3940:2: rule__Tuple2__Group__5__Impl rule__Tuple2__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Tuple2__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__5"


    // $ANTLR start "rule__Tuple2__Group__5__Impl"
    // InternalLenguajegrafico.g:3947:1: rule__Tuple2__Group__5__Impl : ( ( ( rule__Tuple2__Value2Assignment_5 ) ) ( ( rule__Tuple2__Value2Assignment_5 )* ) ) ;
    public final void rule__Tuple2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3951:1: ( ( ( ( rule__Tuple2__Value2Assignment_5 ) ) ( ( rule__Tuple2__Value2Assignment_5 )* ) ) )
            // InternalLenguajegrafico.g:3952:1: ( ( ( rule__Tuple2__Value2Assignment_5 ) ) ( ( rule__Tuple2__Value2Assignment_5 )* ) )
            {
            // InternalLenguajegrafico.g:3952:1: ( ( ( rule__Tuple2__Value2Assignment_5 ) ) ( ( rule__Tuple2__Value2Assignment_5 )* ) )
            // InternalLenguajegrafico.g:3953:2: ( ( rule__Tuple2__Value2Assignment_5 ) ) ( ( rule__Tuple2__Value2Assignment_5 )* )
            {
            // InternalLenguajegrafico.g:3953:2: ( ( rule__Tuple2__Value2Assignment_5 ) )
            // InternalLenguajegrafico.g:3954:3: ( rule__Tuple2__Value2Assignment_5 )
            {
             before(grammarAccess.getTuple2Access().getValue2Assignment_5()); 
            // InternalLenguajegrafico.g:3955:3: ( rule__Tuple2__Value2Assignment_5 )
            // InternalLenguajegrafico.g:3955:4: rule__Tuple2__Value2Assignment_5
            {
            pushFollow(FOLLOW_31);
            rule__Tuple2__Value2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTuple2Access().getValue2Assignment_5()); 

            }

            // InternalLenguajegrafico.g:3958:2: ( ( rule__Tuple2__Value2Assignment_5 )* )
            // InternalLenguajegrafico.g:3959:3: ( rule__Tuple2__Value2Assignment_5 )*
            {
             before(grammarAccess.getTuple2Access().getValue2Assignment_5()); 
            // InternalLenguajegrafico.g:3960:3: ( rule__Tuple2__Value2Assignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLenguajegrafico.g:3960:4: rule__Tuple2__Value2Assignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Tuple2__Value2Assignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTuple2Access().getValue2Assignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__5__Impl"


    // $ANTLR start "rule__Tuple2__Group__6"
    // InternalLenguajegrafico.g:3969:1: rule__Tuple2__Group__6 : rule__Tuple2__Group__6__Impl ;
    public final void rule__Tuple2__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3973:1: ( rule__Tuple2__Group__6__Impl )
            // InternalLenguajegrafico.g:3974:2: rule__Tuple2__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple2__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__6"


    // $ANTLR start "rule__Tuple2__Group__6__Impl"
    // InternalLenguajegrafico.g:3980:1: rule__Tuple2__Group__6__Impl : ( '}' ) ;
    public final void rule__Tuple2__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:3984:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:3985:1: ( '}' )
            {
            // InternalLenguajegrafico.g:3985:1: ( '}' )
            // InternalLenguajegrafico.g:3986:2: '}'
            {
             before(grammarAccess.getTuple2Access().getRightCurlyBracketKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTuple2Access().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Group__6__Impl"


    // $ANTLR start "rule__Tuple3__Group__0"
    // InternalLenguajegrafico.g:3996:1: rule__Tuple3__Group__0 : rule__Tuple3__Group__0__Impl rule__Tuple3__Group__1 ;
    public final void rule__Tuple3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4000:1: ( rule__Tuple3__Group__0__Impl rule__Tuple3__Group__1 )
            // InternalLenguajegrafico.g:4001:2: rule__Tuple3__Group__0__Impl rule__Tuple3__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tuple3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__0"


    // $ANTLR start "rule__Tuple3__Group__0__Impl"
    // InternalLenguajegrafico.g:4008:1: rule__Tuple3__Group__0__Impl : ( 'Tuple3' ) ;
    public final void rule__Tuple3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4012:1: ( ( 'Tuple3' ) )
            // InternalLenguajegrafico.g:4013:1: ( 'Tuple3' )
            {
            // InternalLenguajegrafico.g:4013:1: ( 'Tuple3' )
            // InternalLenguajegrafico.g:4014:2: 'Tuple3'
            {
             before(grammarAccess.getTuple3Access().getTuple3Keyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTuple3Access().getTuple3Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__0__Impl"


    // $ANTLR start "rule__Tuple3__Group__1"
    // InternalLenguajegrafico.g:4023:1: rule__Tuple3__Group__1 : rule__Tuple3__Group__1__Impl rule__Tuple3__Group__2 ;
    public final void rule__Tuple3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4027:1: ( rule__Tuple3__Group__1__Impl rule__Tuple3__Group__2 )
            // InternalLenguajegrafico.g:4028:2: rule__Tuple3__Group__1__Impl rule__Tuple3__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tuple3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__1"


    // $ANTLR start "rule__Tuple3__Group__1__Impl"
    // InternalLenguajegrafico.g:4035:1: rule__Tuple3__Group__1__Impl : ( ( rule__Tuple3__NameAssignment_1 ) ) ;
    public final void rule__Tuple3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4039:1: ( ( ( rule__Tuple3__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:4040:1: ( ( rule__Tuple3__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:4040:1: ( ( rule__Tuple3__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:4041:2: ( rule__Tuple3__NameAssignment_1 )
            {
             before(grammarAccess.getTuple3Access().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:4042:2: ( rule__Tuple3__NameAssignment_1 )
            // InternalLenguajegrafico.g:4042:3: rule__Tuple3__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__1__Impl"


    // $ANTLR start "rule__Tuple3__Group__2"
    // InternalLenguajegrafico.g:4050:1: rule__Tuple3__Group__2 : rule__Tuple3__Group__2__Impl rule__Tuple3__Group__3 ;
    public final void rule__Tuple3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4054:1: ( rule__Tuple3__Group__2__Impl rule__Tuple3__Group__3 )
            // InternalLenguajegrafico.g:4055:2: rule__Tuple3__Group__2__Impl rule__Tuple3__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Tuple3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__2"


    // $ANTLR start "rule__Tuple3__Group__2__Impl"
    // InternalLenguajegrafico.g:4062:1: rule__Tuple3__Group__2__Impl : ( '{' ) ;
    public final void rule__Tuple3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4066:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:4067:1: ( '{' )
            {
            // InternalLenguajegrafico.g:4067:1: ( '{' )
            // InternalLenguajegrafico.g:4068:2: '{'
            {
             before(grammarAccess.getTuple3Access().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTuple3Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__2__Impl"


    // $ANTLR start "rule__Tuple3__Group__3"
    // InternalLenguajegrafico.g:4077:1: rule__Tuple3__Group__3 : rule__Tuple3__Group__3__Impl rule__Tuple3__Group__4 ;
    public final void rule__Tuple3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4081:1: ( rule__Tuple3__Group__3__Impl rule__Tuple3__Group__4 )
            // InternalLenguajegrafico.g:4082:2: rule__Tuple3__Group__3__Impl rule__Tuple3__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Tuple3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__3"


    // $ANTLR start "rule__Tuple3__Group__3__Impl"
    // InternalLenguajegrafico.g:4089:1: rule__Tuple3__Group__3__Impl : ( ( rule__Tuple3__UrlAssignment_3 ) ) ;
    public final void rule__Tuple3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4093:1: ( ( ( rule__Tuple3__UrlAssignment_3 ) ) )
            // InternalLenguajegrafico.g:4094:1: ( ( rule__Tuple3__UrlAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:4094:1: ( ( rule__Tuple3__UrlAssignment_3 ) )
            // InternalLenguajegrafico.g:4095:2: ( rule__Tuple3__UrlAssignment_3 )
            {
             before(grammarAccess.getTuple3Access().getUrlAssignment_3()); 
            // InternalLenguajegrafico.g:4096:2: ( rule__Tuple3__UrlAssignment_3 )
            // InternalLenguajegrafico.g:4096:3: rule__Tuple3__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__3__Impl"


    // $ANTLR start "rule__Tuple3__Group__4"
    // InternalLenguajegrafico.g:4104:1: rule__Tuple3__Group__4 : rule__Tuple3__Group__4__Impl rule__Tuple3__Group__5 ;
    public final void rule__Tuple3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4108:1: ( rule__Tuple3__Group__4__Impl rule__Tuple3__Group__5 )
            // InternalLenguajegrafico.g:4109:2: rule__Tuple3__Group__4__Impl rule__Tuple3__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Tuple3__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__4"


    // $ANTLR start "rule__Tuple3__Group__4__Impl"
    // InternalLenguajegrafico.g:4116:1: rule__Tuple3__Group__4__Impl : ( ( rule__Tuple3__Value1Assignment_4 ) ) ;
    public final void rule__Tuple3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4120:1: ( ( ( rule__Tuple3__Value1Assignment_4 ) ) )
            // InternalLenguajegrafico.g:4121:1: ( ( rule__Tuple3__Value1Assignment_4 ) )
            {
            // InternalLenguajegrafico.g:4121:1: ( ( rule__Tuple3__Value1Assignment_4 ) )
            // InternalLenguajegrafico.g:4122:2: ( rule__Tuple3__Value1Assignment_4 )
            {
             before(grammarAccess.getTuple3Access().getValue1Assignment_4()); 
            // InternalLenguajegrafico.g:4123:2: ( rule__Tuple3__Value1Assignment_4 )
            // InternalLenguajegrafico.g:4123:3: rule__Tuple3__Value1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__Value1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getValue1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__4__Impl"


    // $ANTLR start "rule__Tuple3__Group__5"
    // InternalLenguajegrafico.g:4131:1: rule__Tuple3__Group__5 : rule__Tuple3__Group__5__Impl rule__Tuple3__Group__6 ;
    public final void rule__Tuple3__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4135:1: ( rule__Tuple3__Group__5__Impl rule__Tuple3__Group__6 )
            // InternalLenguajegrafico.g:4136:2: rule__Tuple3__Group__5__Impl rule__Tuple3__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Tuple3__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__5"


    // $ANTLR start "rule__Tuple3__Group__5__Impl"
    // InternalLenguajegrafico.g:4143:1: rule__Tuple3__Group__5__Impl : ( ( rule__Tuple3__Value2Assignment_5 ) ) ;
    public final void rule__Tuple3__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4147:1: ( ( ( rule__Tuple3__Value2Assignment_5 ) ) )
            // InternalLenguajegrafico.g:4148:1: ( ( rule__Tuple3__Value2Assignment_5 ) )
            {
            // InternalLenguajegrafico.g:4148:1: ( ( rule__Tuple3__Value2Assignment_5 ) )
            // InternalLenguajegrafico.g:4149:2: ( rule__Tuple3__Value2Assignment_5 )
            {
             before(grammarAccess.getTuple3Access().getValue2Assignment_5()); 
            // InternalLenguajegrafico.g:4150:2: ( rule__Tuple3__Value2Assignment_5 )
            // InternalLenguajegrafico.g:4150:3: rule__Tuple3__Value2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__Value2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getValue2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__5__Impl"


    // $ANTLR start "rule__Tuple3__Group__6"
    // InternalLenguajegrafico.g:4158:1: rule__Tuple3__Group__6 : rule__Tuple3__Group__6__Impl rule__Tuple3__Group__7 ;
    public final void rule__Tuple3__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4162:1: ( rule__Tuple3__Group__6__Impl rule__Tuple3__Group__7 )
            // InternalLenguajegrafico.g:4163:2: rule__Tuple3__Group__6__Impl rule__Tuple3__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Tuple3__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__6"


    // $ANTLR start "rule__Tuple3__Group__6__Impl"
    // InternalLenguajegrafico.g:4170:1: rule__Tuple3__Group__6__Impl : ( ( rule__Tuple3__Value3Assignment_6 ) ) ;
    public final void rule__Tuple3__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4174:1: ( ( ( rule__Tuple3__Value3Assignment_6 ) ) )
            // InternalLenguajegrafico.g:4175:1: ( ( rule__Tuple3__Value3Assignment_6 ) )
            {
            // InternalLenguajegrafico.g:4175:1: ( ( rule__Tuple3__Value3Assignment_6 ) )
            // InternalLenguajegrafico.g:4176:2: ( rule__Tuple3__Value3Assignment_6 )
            {
             before(grammarAccess.getTuple3Access().getValue3Assignment_6()); 
            // InternalLenguajegrafico.g:4177:2: ( rule__Tuple3__Value3Assignment_6 )
            // InternalLenguajegrafico.g:4177:3: rule__Tuple3__Value3Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__Value3Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getValue3Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__6__Impl"


    // $ANTLR start "rule__Tuple3__Group__7"
    // InternalLenguajegrafico.g:4185:1: rule__Tuple3__Group__7 : rule__Tuple3__Group__7__Impl ;
    public final void rule__Tuple3__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4189:1: ( rule__Tuple3__Group__7__Impl )
            // InternalLenguajegrafico.g:4190:2: rule__Tuple3__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__7"


    // $ANTLR start "rule__Tuple3__Group__7__Impl"
    // InternalLenguajegrafico.g:4196:1: rule__Tuple3__Group__7__Impl : ( '}' ) ;
    public final void rule__Tuple3__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4200:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:4201:1: ( '}' )
            {
            // InternalLenguajegrafico.g:4201:1: ( '}' )
            // InternalLenguajegrafico.g:4202:2: '}'
            {
             before(grammarAccess.getTuple3Access().getRightCurlyBracketKeyword_7()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTuple3Access().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Group__7__Impl"


    // $ANTLR start "rule__Tuple4__Group__0"
    // InternalLenguajegrafico.g:4212:1: rule__Tuple4__Group__0 : rule__Tuple4__Group__0__Impl rule__Tuple4__Group__1 ;
    public final void rule__Tuple4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4216:1: ( rule__Tuple4__Group__0__Impl rule__Tuple4__Group__1 )
            // InternalLenguajegrafico.g:4217:2: rule__Tuple4__Group__0__Impl rule__Tuple4__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tuple4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__0"


    // $ANTLR start "rule__Tuple4__Group__0__Impl"
    // InternalLenguajegrafico.g:4224:1: rule__Tuple4__Group__0__Impl : ( 'Tuple4' ) ;
    public final void rule__Tuple4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4228:1: ( ( 'Tuple4' ) )
            // InternalLenguajegrafico.g:4229:1: ( 'Tuple4' )
            {
            // InternalLenguajegrafico.g:4229:1: ( 'Tuple4' )
            // InternalLenguajegrafico.g:4230:2: 'Tuple4'
            {
             before(grammarAccess.getTuple4Access().getTuple4Keyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTuple4Access().getTuple4Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__0__Impl"


    // $ANTLR start "rule__Tuple4__Group__1"
    // InternalLenguajegrafico.g:4239:1: rule__Tuple4__Group__1 : rule__Tuple4__Group__1__Impl rule__Tuple4__Group__2 ;
    public final void rule__Tuple4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4243:1: ( rule__Tuple4__Group__1__Impl rule__Tuple4__Group__2 )
            // InternalLenguajegrafico.g:4244:2: rule__Tuple4__Group__1__Impl rule__Tuple4__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tuple4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__1"


    // $ANTLR start "rule__Tuple4__Group__1__Impl"
    // InternalLenguajegrafico.g:4251:1: rule__Tuple4__Group__1__Impl : ( ( rule__Tuple4__NameAssignment_1 ) ) ;
    public final void rule__Tuple4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4255:1: ( ( ( rule__Tuple4__NameAssignment_1 ) ) )
            // InternalLenguajegrafico.g:4256:1: ( ( rule__Tuple4__NameAssignment_1 ) )
            {
            // InternalLenguajegrafico.g:4256:1: ( ( rule__Tuple4__NameAssignment_1 ) )
            // InternalLenguajegrafico.g:4257:2: ( rule__Tuple4__NameAssignment_1 )
            {
             before(grammarAccess.getTuple4Access().getNameAssignment_1()); 
            // InternalLenguajegrafico.g:4258:2: ( rule__Tuple4__NameAssignment_1 )
            // InternalLenguajegrafico.g:4258:3: rule__Tuple4__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tuple4__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTuple4Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__1__Impl"


    // $ANTLR start "rule__Tuple4__Group__2"
    // InternalLenguajegrafico.g:4266:1: rule__Tuple4__Group__2 : rule__Tuple4__Group__2__Impl rule__Tuple4__Group__3 ;
    public final void rule__Tuple4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4270:1: ( rule__Tuple4__Group__2__Impl rule__Tuple4__Group__3 )
            // InternalLenguajegrafico.g:4271:2: rule__Tuple4__Group__2__Impl rule__Tuple4__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Tuple4__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__2"


    // $ANTLR start "rule__Tuple4__Group__2__Impl"
    // InternalLenguajegrafico.g:4278:1: rule__Tuple4__Group__2__Impl : ( '{' ) ;
    public final void rule__Tuple4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4282:1: ( ( '{' ) )
            // InternalLenguajegrafico.g:4283:1: ( '{' )
            {
            // InternalLenguajegrafico.g:4283:1: ( '{' )
            // InternalLenguajegrafico.g:4284:2: '{'
            {
             before(grammarAccess.getTuple4Access().getLeftCurlyBracketKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTuple4Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__2__Impl"


    // $ANTLR start "rule__Tuple4__Group__3"
    // InternalLenguajegrafico.g:4293:1: rule__Tuple4__Group__3 : rule__Tuple4__Group__3__Impl rule__Tuple4__Group__4 ;
    public final void rule__Tuple4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4297:1: ( rule__Tuple4__Group__3__Impl rule__Tuple4__Group__4 )
            // InternalLenguajegrafico.g:4298:2: rule__Tuple4__Group__3__Impl rule__Tuple4__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Tuple4__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__3"


    // $ANTLR start "rule__Tuple4__Group__3__Impl"
    // InternalLenguajegrafico.g:4305:1: rule__Tuple4__Group__3__Impl : ( ( rule__Tuple4__UrlAssignment_3 ) ) ;
    public final void rule__Tuple4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4309:1: ( ( ( rule__Tuple4__UrlAssignment_3 ) ) )
            // InternalLenguajegrafico.g:4310:1: ( ( rule__Tuple4__UrlAssignment_3 ) )
            {
            // InternalLenguajegrafico.g:4310:1: ( ( rule__Tuple4__UrlAssignment_3 ) )
            // InternalLenguajegrafico.g:4311:2: ( rule__Tuple4__UrlAssignment_3 )
            {
             before(grammarAccess.getTuple4Access().getUrlAssignment_3()); 
            // InternalLenguajegrafico.g:4312:2: ( rule__Tuple4__UrlAssignment_3 )
            // InternalLenguajegrafico.g:4312:3: rule__Tuple4__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tuple4__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTuple4Access().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__3__Impl"


    // $ANTLR start "rule__Tuple4__Group__4"
    // InternalLenguajegrafico.g:4320:1: rule__Tuple4__Group__4 : rule__Tuple4__Group__4__Impl rule__Tuple4__Group__5 ;
    public final void rule__Tuple4__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4324:1: ( rule__Tuple4__Group__4__Impl rule__Tuple4__Group__5 )
            // InternalLenguajegrafico.g:4325:2: rule__Tuple4__Group__4__Impl rule__Tuple4__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Tuple4__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__4"


    // $ANTLR start "rule__Tuple4__Group__4__Impl"
    // InternalLenguajegrafico.g:4332:1: rule__Tuple4__Group__4__Impl : ( ( ( rule__Tuple4__ValuesAssignment_4 ) ) ( ( rule__Tuple4__ValuesAssignment_4 )* ) ) ;
    public final void rule__Tuple4__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4336:1: ( ( ( ( rule__Tuple4__ValuesAssignment_4 ) ) ( ( rule__Tuple4__ValuesAssignment_4 )* ) ) )
            // InternalLenguajegrafico.g:4337:1: ( ( ( rule__Tuple4__ValuesAssignment_4 ) ) ( ( rule__Tuple4__ValuesAssignment_4 )* ) )
            {
            // InternalLenguajegrafico.g:4337:1: ( ( ( rule__Tuple4__ValuesAssignment_4 ) ) ( ( rule__Tuple4__ValuesAssignment_4 )* ) )
            // InternalLenguajegrafico.g:4338:2: ( ( rule__Tuple4__ValuesAssignment_4 ) ) ( ( rule__Tuple4__ValuesAssignment_4 )* )
            {
            // InternalLenguajegrafico.g:4338:2: ( ( rule__Tuple4__ValuesAssignment_4 ) )
            // InternalLenguajegrafico.g:4339:3: ( rule__Tuple4__ValuesAssignment_4 )
            {
             before(grammarAccess.getTuple4Access().getValuesAssignment_4()); 
            // InternalLenguajegrafico.g:4340:3: ( rule__Tuple4__ValuesAssignment_4 )
            // InternalLenguajegrafico.g:4340:4: rule__Tuple4__ValuesAssignment_4
            {
            pushFollow(FOLLOW_34);
            rule__Tuple4__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTuple4Access().getValuesAssignment_4()); 

            }

            // InternalLenguajegrafico.g:4343:2: ( ( rule__Tuple4__ValuesAssignment_4 )* )
            // InternalLenguajegrafico.g:4344:3: ( rule__Tuple4__ValuesAssignment_4 )*
            {
             before(grammarAccess.getTuple4Access().getValuesAssignment_4()); 
            // InternalLenguajegrafico.g:4345:3: ( rule__Tuple4__ValuesAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=32 && LA31_0<=34)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLenguajegrafico.g:4345:4: rule__Tuple4__ValuesAssignment_4
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Tuple4__ValuesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTuple4Access().getValuesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__4__Impl"


    // $ANTLR start "rule__Tuple4__Group__5"
    // InternalLenguajegrafico.g:4354:1: rule__Tuple4__Group__5 : rule__Tuple4__Group__5__Impl ;
    public final void rule__Tuple4__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4358:1: ( rule__Tuple4__Group__5__Impl )
            // InternalLenguajegrafico.g:4359:2: rule__Tuple4__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tuple4__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__5"


    // $ANTLR start "rule__Tuple4__Group__5__Impl"
    // InternalLenguajegrafico.g:4365:1: rule__Tuple4__Group__5__Impl : ( '}' ) ;
    public final void rule__Tuple4__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4369:1: ( ( '}' ) )
            // InternalLenguajegrafico.g:4370:1: ( '}' )
            {
            // InternalLenguajegrafico.g:4370:1: ( '}' )
            // InternalLenguajegrafico.g:4371:2: '}'
            {
             before(grammarAccess.getTuple4Access().getRightCurlyBracketKeyword_5()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTuple4Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__Group__5__Impl"


    // $ANTLR start "rule__CodeGeneratedTarget__Group__0"
    // InternalLenguajegrafico.g:4381:1: rule__CodeGeneratedTarget__Group__0 : rule__CodeGeneratedTarget__Group__0__Impl rule__CodeGeneratedTarget__Group__1 ;
    public final void rule__CodeGeneratedTarget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4385:1: ( rule__CodeGeneratedTarget__Group__0__Impl rule__CodeGeneratedTarget__Group__1 )
            // InternalLenguajegrafico.g:4386:2: rule__CodeGeneratedTarget__Group__0__Impl rule__CodeGeneratedTarget__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CodeGeneratedTarget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeGeneratedTarget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__Group__0"


    // $ANTLR start "rule__CodeGeneratedTarget__Group__0__Impl"
    // InternalLenguajegrafico.g:4393:1: rule__CodeGeneratedTarget__Group__0__Impl : ( 'CodeGeneratedTarget' ) ;
    public final void rule__CodeGeneratedTarget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4397:1: ( ( 'CodeGeneratedTarget' ) )
            // InternalLenguajegrafico.g:4398:1: ( 'CodeGeneratedTarget' )
            {
            // InternalLenguajegrafico.g:4398:1: ( 'CodeGeneratedTarget' )
            // InternalLenguajegrafico.g:4399:2: 'CodeGeneratedTarget'
            {
             before(grammarAccess.getCodeGeneratedTargetAccess().getCodeGeneratedTargetKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCodeGeneratedTargetAccess().getCodeGeneratedTargetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__Group__0__Impl"


    // $ANTLR start "rule__CodeGeneratedTarget__Group__1"
    // InternalLenguajegrafico.g:4408:1: rule__CodeGeneratedTarget__Group__1 : rule__CodeGeneratedTarget__Group__1__Impl rule__CodeGeneratedTarget__Group__2 ;
    public final void rule__CodeGeneratedTarget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4412:1: ( rule__CodeGeneratedTarget__Group__1__Impl rule__CodeGeneratedTarget__Group__2 )
            // InternalLenguajegrafico.g:4413:2: rule__CodeGeneratedTarget__Group__1__Impl rule__CodeGeneratedTarget__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__CodeGeneratedTarget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeGeneratedTarget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__Group__1"


    // $ANTLR start "rule__CodeGeneratedTarget__Group__1__Impl"
    // InternalLenguajegrafico.g:4420:1: rule__CodeGeneratedTarget__Group__1__Impl : ( '.' ) ;
    public final void rule__CodeGeneratedTarget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4424:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:4425:1: ( '.' )
            {
            // InternalLenguajegrafico.g:4425:1: ( '.' )
            // InternalLenguajegrafico.g:4426:2: '.'
            {
             before(grammarAccess.getCodeGeneratedTargetAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCodeGeneratedTargetAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__Group__1__Impl"


    // $ANTLR start "rule__CodeGeneratedTarget__Group__2"
    // InternalLenguajegrafico.g:4435:1: rule__CodeGeneratedTarget__Group__2 : rule__CodeGeneratedTarget__Group__2__Impl ;
    public final void rule__CodeGeneratedTarget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4439:1: ( rule__CodeGeneratedTarget__Group__2__Impl )
            // InternalLenguajegrafico.g:4440:2: rule__CodeGeneratedTarget__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeGeneratedTarget__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__Group__2"


    // $ANTLR start "rule__CodeGeneratedTarget__Group__2__Impl"
    // InternalLenguajegrafico.g:4446:1: rule__CodeGeneratedTarget__Group__2__Impl : ( ( rule__CodeGeneratedTarget__ValueAssignment_2 ) ) ;
    public final void rule__CodeGeneratedTarget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4450:1: ( ( ( rule__CodeGeneratedTarget__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:4451:1: ( ( rule__CodeGeneratedTarget__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:4451:1: ( ( rule__CodeGeneratedTarget__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:4452:2: ( rule__CodeGeneratedTarget__ValueAssignment_2 )
            {
             before(grammarAccess.getCodeGeneratedTargetAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:4453:2: ( rule__CodeGeneratedTarget__ValueAssignment_2 )
            // InternalLenguajegrafico.g:4453:3: rule__CodeGeneratedTarget__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CodeGeneratedTarget__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeGeneratedTargetAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__Group__2__Impl"


    // $ANTLR start "rule__NormaliceData__Group__0"
    // InternalLenguajegrafico.g:4462:1: rule__NormaliceData__Group__0 : rule__NormaliceData__Group__0__Impl rule__NormaliceData__Group__1 ;
    public final void rule__NormaliceData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4466:1: ( rule__NormaliceData__Group__0__Impl rule__NormaliceData__Group__1 )
            // InternalLenguajegrafico.g:4467:2: rule__NormaliceData__Group__0__Impl rule__NormaliceData__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NormaliceData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormaliceData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__Group__0"


    // $ANTLR start "rule__NormaliceData__Group__0__Impl"
    // InternalLenguajegrafico.g:4474:1: rule__NormaliceData__Group__0__Impl : ( 'NormaliceData' ) ;
    public final void rule__NormaliceData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4478:1: ( ( 'NormaliceData' ) )
            // InternalLenguajegrafico.g:4479:1: ( 'NormaliceData' )
            {
            // InternalLenguajegrafico.g:4479:1: ( 'NormaliceData' )
            // InternalLenguajegrafico.g:4480:2: 'NormaliceData'
            {
             before(grammarAccess.getNormaliceDataAccess().getNormaliceDataKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getNormaliceDataAccess().getNormaliceDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__Group__0__Impl"


    // $ANTLR start "rule__NormaliceData__Group__1"
    // InternalLenguajegrafico.g:4489:1: rule__NormaliceData__Group__1 : rule__NormaliceData__Group__1__Impl rule__NormaliceData__Group__2 ;
    public final void rule__NormaliceData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4493:1: ( rule__NormaliceData__Group__1__Impl rule__NormaliceData__Group__2 )
            // InternalLenguajegrafico.g:4494:2: rule__NormaliceData__Group__1__Impl rule__NormaliceData__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NormaliceData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormaliceData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__Group__1"


    // $ANTLR start "rule__NormaliceData__Group__1__Impl"
    // InternalLenguajegrafico.g:4501:1: rule__NormaliceData__Group__1__Impl : ( '.' ) ;
    public final void rule__NormaliceData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4505:1: ( ( '.' ) )
            // InternalLenguajegrafico.g:4506:1: ( '.' )
            {
            // InternalLenguajegrafico.g:4506:1: ( '.' )
            // InternalLenguajegrafico.g:4507:2: '.'
            {
             before(grammarAccess.getNormaliceDataAccess().getFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNormaliceDataAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__Group__1__Impl"


    // $ANTLR start "rule__NormaliceData__Group__2"
    // InternalLenguajegrafico.g:4516:1: rule__NormaliceData__Group__2 : rule__NormaliceData__Group__2__Impl ;
    public final void rule__NormaliceData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4520:1: ( rule__NormaliceData__Group__2__Impl )
            // InternalLenguajegrafico.g:4521:2: rule__NormaliceData__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormaliceData__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__Group__2"


    // $ANTLR start "rule__NormaliceData__Group__2__Impl"
    // InternalLenguajegrafico.g:4527:1: rule__NormaliceData__Group__2__Impl : ( ( rule__NormaliceData__ValueAssignment_2 ) ) ;
    public final void rule__NormaliceData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4531:1: ( ( ( rule__NormaliceData__ValueAssignment_2 ) ) )
            // InternalLenguajegrafico.g:4532:1: ( ( rule__NormaliceData__ValueAssignment_2 ) )
            {
            // InternalLenguajegrafico.g:4532:1: ( ( rule__NormaliceData__ValueAssignment_2 ) )
            // InternalLenguajegrafico.g:4533:2: ( rule__NormaliceData__ValueAssignment_2 )
            {
             before(grammarAccess.getNormaliceDataAccess().getValueAssignment_2()); 
            // InternalLenguajegrafico.g:4534:2: ( rule__NormaliceData__ValueAssignment_2 )
            // InternalLenguajegrafico.g:4534:3: rule__NormaliceData__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormaliceData__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormaliceDataAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__Group__2__Impl"


    // $ANTLR start "rule__Lenguajegrafico__ElementsAssignment"
    // InternalLenguajegrafico.g:4543:1: rule__Lenguajegrafico__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Lenguajegrafico__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4547:1: ( ( ruleElement ) )
            // InternalLenguajegrafico.g:4548:2: ( ruleElement )
            {
            // InternalLenguajegrafico.g:4548:2: ( ruleElement )
            // InternalLenguajegrafico.g:4549:3: ruleElement
            {
             before(grammarAccess.getLenguajegraficoAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getLenguajegraficoAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lenguajegrafico__ElementsAssignment"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalLenguajegrafico.g:4558:1: rule__Text__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4562:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4563:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4563:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4564:3: RULE_ID
            {
             before(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__NameAssignment_1"


    // $ANTLR start "rule__Number__NameAssignment_1"
    // InternalLenguajegrafico.g:4573:1: rule__Number__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Number__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4577:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4578:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4578:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4579:3: RULE_ID
            {
             before(grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__NameAssignment_1"


    // $ANTLR start "rule__Float__NameAssignment_1"
    // InternalLenguajegrafico.g:4588:1: rule__Float__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Float__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4592:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4593:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4593:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4594:3: RULE_ID
            {
             before(grammarAccess.getFloatAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__NameAssignment_1"


    // $ANTLR start "rule__URL__ValueAssignment_2"
    // InternalLenguajegrafico.g:4603:1: rule__URL__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__URL__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4607:1: ( ( RULE_STRING ) )
            // InternalLenguajegrafico.g:4608:2: ( RULE_STRING )
            {
            // InternalLenguajegrafico.g:4608:2: ( RULE_STRING )
            // InternalLenguajegrafico.g:4609:3: RULE_STRING
            {
             before(grammarAccess.getURLAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getURLAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URL__ValueAssignment_2"


    // $ANTLR start "rule__Title__ValueAssignment_2"
    // InternalLenguajegrafico.g:4618:1: rule__Title__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Title__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4622:1: ( ( RULE_STRING ) )
            // InternalLenguajegrafico.g:4623:2: ( RULE_STRING )
            {
            // InternalLenguajegrafico.g:4623:2: ( RULE_STRING )
            // InternalLenguajegrafico.g:4624:3: RULE_STRING
            {
             before(grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__ValueAssignment_2"


    // $ANTLR start "rule__Labelx__ValueAssignment_2"
    // InternalLenguajegrafico.g:4633:1: rule__Labelx__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Labelx__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4637:1: ( ( RULE_STRING ) )
            // InternalLenguajegrafico.g:4638:2: ( RULE_STRING )
            {
            // InternalLenguajegrafico.g:4638:2: ( RULE_STRING )
            // InternalLenguajegrafico.g:4639:3: RULE_STRING
            {
             before(grammarAccess.getLabelxAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelxAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labelx__ValueAssignment_2"


    // $ANTLR start "rule__Labely__ValueAssignment_2"
    // InternalLenguajegrafico.g:4648:1: rule__Labely__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Labely__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4652:1: ( ( RULE_STRING ) )
            // InternalLenguajegrafico.g:4653:2: ( RULE_STRING )
            {
            // InternalLenguajegrafico.g:4653:2: ( RULE_STRING )
            // InternalLenguajegrafico.g:4654:3: RULE_STRING
            {
             before(grammarAccess.getLabelyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelyAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Labely__ValueAssignment_2"


    // $ANTLR start "rule__Legend__ValueAssignment_2"
    // InternalLenguajegrafico.g:4663:1: rule__Legend__ValueAssignment_2 : ( ( rule__Legend__ValueAlternatives_2_0 ) ) ;
    public final void rule__Legend__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4667:1: ( ( ( rule__Legend__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4668:2: ( ( rule__Legend__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4668:2: ( ( rule__Legend__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4669:3: ( rule__Legend__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getLegendAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4670:3: ( rule__Legend__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4670:4: rule__Legend__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Legend__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLegendAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Legend__ValueAssignment_2"


    // $ANTLR start "rule__Hole__ValueAssignment_2"
    // InternalLenguajegrafico.g:4678:1: rule__Hole__ValueAssignment_2 : ( ( rule__Hole__ValueAlternatives_2_0 ) ) ;
    public final void rule__Hole__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4682:1: ( ( ( rule__Hole__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4683:2: ( ( rule__Hole__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4683:2: ( ( rule__Hole__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4684:3: ( rule__Hole__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getHoleAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4685:3: ( rule__Hole__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4685:4: rule__Hole__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Hole__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__ValueAssignment_2"


    // $ANTLR start "rule__Orientation__ValueAssignment_2"
    // InternalLenguajegrafico.g:4693:1: rule__Orientation__ValueAssignment_2 : ( ( rule__Orientation__ValueAlternatives_2_0 ) ) ;
    public final void rule__Orientation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4697:1: ( ( ( rule__Orientation__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4698:2: ( ( rule__Orientation__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4698:2: ( ( rule__Orientation__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4699:3: ( rule__Orientation__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getOrientationAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4700:3: ( rule__Orientation__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4700:4: rule__Orientation__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Orientation__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOrientationAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orientation__ValueAssignment_2"


    // $ANTLR start "rule__Area__ValueAssignment_2"
    // InternalLenguajegrafico.g:4708:1: rule__Area__ValueAssignment_2 : ( ( rule__Area__ValueAlternatives_2_0 ) ) ;
    public final void rule__Area__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4712:1: ( ( ( rule__Area__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4713:2: ( ( rule__Area__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4713:2: ( ( rule__Area__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4714:3: ( rule__Area__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getAreaAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4715:3: ( rule__Area__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4715:4: rule__Area__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Area__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAreaAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Area__ValueAssignment_2"


    // $ANTLR start "rule__ZoomLevel__ValueAssignment_2"
    // InternalLenguajegrafico.g:4723:1: rule__ZoomLevel__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__ZoomLevel__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4727:1: ( ( RULE_INT ) )
            // InternalLenguajegrafico.g:4728:2: ( RULE_INT )
            {
            // InternalLenguajegrafico.g:4728:2: ( RULE_INT )
            // InternalLenguajegrafico.g:4729:3: RULE_INT
            {
             before(grammarAccess.getZoomLevelAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getZoomLevelAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZoomLevel__ValueAssignment_2"


    // $ANTLR start "rule__MakerType__ValueAssignment_2"
    // InternalLenguajegrafico.g:4738:1: rule__MakerType__ValueAssignment_2 : ( ( rule__MakerType__ValueAlternatives_2_0 ) ) ;
    public final void rule__MakerType__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4742:1: ( ( ( rule__MakerType__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4743:2: ( ( rule__MakerType__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4743:2: ( ( rule__MakerType__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4744:3: ( rule__MakerType__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getMakerTypeAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4745:3: ( rule__MakerType__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4745:4: rule__MakerType__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MakerType__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMakerTypeAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MakerType__ValueAssignment_2"


    // $ANTLR start "rule__MapType__ValueAssignment_2"
    // InternalLenguajegrafico.g:4753:1: rule__MapType__ValueAssignment_2 : ( ( rule__MapType__ValueAlternatives_2_0 ) ) ;
    public final void rule__MapType__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4757:1: ( ( ( rule__MapType__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4758:2: ( ( rule__MapType__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4758:2: ( ( rule__MapType__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4759:3: ( rule__MapType__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getMapTypeAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4760:3: ( rule__MapType__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4760:4: rule__MapType__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MapType__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__ValueAssignment_2"


    // $ANTLR start "rule__CellSize__ValueAssignment_2"
    // InternalLenguajegrafico.g:4768:1: rule__CellSize__ValueAssignment_2 : ( ( rule__CellSize__ValueAlternatives_2_0 ) ) ;
    public final void rule__CellSize__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4772:1: ( ( ( rule__CellSize__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:4773:2: ( ( rule__CellSize__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:4773:2: ( ( rule__CellSize__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:4774:3: ( rule__CellSize__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getCellSizeAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:4775:3: ( rule__CellSize__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:4775:4: rule__CellSize__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CellSize__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCellSizeAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellSize__ValueAssignment_2"


    // $ANTLR start "rule__PieChart__NameAssignment_1"
    // InternalLenguajegrafico.g:4783:1: rule__PieChart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PieChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4787:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4788:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4788:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4789:3: RULE_ID
            {
             before(grammarAccess.getPieChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__NameAssignment_1"


    // $ANTLR start "rule__PieChart__TupleAssignment_3"
    // InternalLenguajegrafico.g:4798:1: rule__PieChart__TupleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__PieChart__TupleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4802:1: ( ( ( RULE_ID ) ) )
            // InternalLenguajegrafico.g:4803:2: ( ( RULE_ID ) )
            {
            // InternalLenguajegrafico.g:4803:2: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4804:3: ( RULE_ID )
            {
             before(grammarAccess.getPieChartAccess().getTupleTuple1CrossReference_3_0()); 
            // InternalLenguajegrafico.g:4805:3: ( RULE_ID )
            // InternalLenguajegrafico.g:4806:4: RULE_ID
            {
             before(grammarAccess.getPieChartAccess().getTupleTuple1IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPieChartAccess().getTupleTuple1IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPieChartAccess().getTupleTuple1CrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__TupleAssignment_3"


    // $ANTLR start "rule__PieChart__FeaturesAssignment_4"
    // InternalLenguajegrafico.g:4817:1: rule__PieChart__FeaturesAssignment_4 : ( ( rule__PieChart__FeaturesAlternatives_4_0 ) ) ;
    public final void rule__PieChart__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4821:1: ( ( ( rule__PieChart__FeaturesAlternatives_4_0 ) ) )
            // InternalLenguajegrafico.g:4822:2: ( ( rule__PieChart__FeaturesAlternatives_4_0 ) )
            {
            // InternalLenguajegrafico.g:4822:2: ( ( rule__PieChart__FeaturesAlternatives_4_0 ) )
            // InternalLenguajegrafico.g:4823:3: ( rule__PieChart__FeaturesAlternatives_4_0 )
            {
             before(grammarAccess.getPieChartAccess().getFeaturesAlternatives_4_0()); 
            // InternalLenguajegrafico.g:4824:3: ( rule__PieChart__FeaturesAlternatives_4_0 )
            // InternalLenguajegrafico.g:4824:4: rule__PieChart__FeaturesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__PieChart__FeaturesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPieChartAccess().getFeaturesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PieChart__FeaturesAssignment_4"


    // $ANTLR start "rule__BarChart__NameAssignment_1"
    // InternalLenguajegrafico.g:4832:1: rule__BarChart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BarChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4836:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4837:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4837:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4838:3: RULE_ID
            {
             before(grammarAccess.getBarChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__NameAssignment_1"


    // $ANTLR start "rule__BarChart__TupleAssignment_3"
    // InternalLenguajegrafico.g:4847:1: rule__BarChart__TupleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__BarChart__TupleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4851:1: ( ( ( RULE_ID ) ) )
            // InternalLenguajegrafico.g:4852:2: ( ( RULE_ID ) )
            {
            // InternalLenguajegrafico.g:4852:2: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4853:3: ( RULE_ID )
            {
             before(grammarAccess.getBarChartAccess().getTupleTuple2CrossReference_3_0()); 
            // InternalLenguajegrafico.g:4854:3: ( RULE_ID )
            // InternalLenguajegrafico.g:4855:4: RULE_ID
            {
             before(grammarAccess.getBarChartAccess().getTupleTuple2IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBarChartAccess().getTupleTuple2IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBarChartAccess().getTupleTuple2CrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__TupleAssignment_3"


    // $ANTLR start "rule__BarChart__FeaturesAssignment_4"
    // InternalLenguajegrafico.g:4866:1: rule__BarChart__FeaturesAssignment_4 : ( ( rule__BarChart__FeaturesAlternatives_4_0 ) ) ;
    public final void rule__BarChart__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4870:1: ( ( ( rule__BarChart__FeaturesAlternatives_4_0 ) ) )
            // InternalLenguajegrafico.g:4871:2: ( ( rule__BarChart__FeaturesAlternatives_4_0 ) )
            {
            // InternalLenguajegrafico.g:4871:2: ( ( rule__BarChart__FeaturesAlternatives_4_0 ) )
            // InternalLenguajegrafico.g:4872:3: ( rule__BarChart__FeaturesAlternatives_4_0 )
            {
             before(grammarAccess.getBarChartAccess().getFeaturesAlternatives_4_0()); 
            // InternalLenguajegrafico.g:4873:3: ( rule__BarChart__FeaturesAlternatives_4_0 )
            // InternalLenguajegrafico.g:4873:4: rule__BarChart__FeaturesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__BarChart__FeaturesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getBarChartAccess().getFeaturesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarChart__FeaturesAssignment_4"


    // $ANTLR start "rule__LineChart__NameAssignment_1"
    // InternalLenguajegrafico.g:4881:1: rule__LineChart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LineChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4885:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4886:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4886:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4887:3: RULE_ID
            {
             before(grammarAccess.getLineChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__NameAssignment_1"


    // $ANTLR start "rule__LineChart__TupleAssignment_3"
    // InternalLenguajegrafico.g:4896:1: rule__LineChart__TupleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__LineChart__TupleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4900:1: ( ( ( RULE_ID ) ) )
            // InternalLenguajegrafico.g:4901:2: ( ( RULE_ID ) )
            {
            // InternalLenguajegrafico.g:4901:2: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4902:3: ( RULE_ID )
            {
             before(grammarAccess.getLineChartAccess().getTupleTuple2CrossReference_3_0()); 
            // InternalLenguajegrafico.g:4903:3: ( RULE_ID )
            // InternalLenguajegrafico.g:4904:4: RULE_ID
            {
             before(grammarAccess.getLineChartAccess().getTupleTuple2IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineChartAccess().getTupleTuple2IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLineChartAccess().getTupleTuple2CrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__TupleAssignment_3"


    // $ANTLR start "rule__LineChart__FeaturesAssignment_4"
    // InternalLenguajegrafico.g:4915:1: rule__LineChart__FeaturesAssignment_4 : ( ( rule__LineChart__FeaturesAlternatives_4_0 ) ) ;
    public final void rule__LineChart__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4919:1: ( ( ( rule__LineChart__FeaturesAlternatives_4_0 ) ) )
            // InternalLenguajegrafico.g:4920:2: ( ( rule__LineChart__FeaturesAlternatives_4_0 ) )
            {
            // InternalLenguajegrafico.g:4920:2: ( ( rule__LineChart__FeaturesAlternatives_4_0 ) )
            // InternalLenguajegrafico.g:4921:3: ( rule__LineChart__FeaturesAlternatives_4_0 )
            {
             before(grammarAccess.getLineChartAccess().getFeaturesAlternatives_4_0()); 
            // InternalLenguajegrafico.g:4922:3: ( rule__LineChart__FeaturesAlternatives_4_0 )
            // InternalLenguajegrafico.g:4922:4: rule__LineChart__FeaturesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__LineChart__FeaturesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLineChartAccess().getFeaturesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineChart__FeaturesAssignment_4"


    // $ANTLR start "rule__MapChart__NameAssignment_1"
    // InternalLenguajegrafico.g:4930:1: rule__MapChart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MapChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4934:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4935:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4935:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4936:3: RULE_ID
            {
             before(grammarAccess.getMapChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMapChartAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__NameAssignment_1"


    // $ANTLR start "rule__MapChart__TupleAssignment_3"
    // InternalLenguajegrafico.g:4945:1: rule__MapChart__TupleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MapChart__TupleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4949:1: ( ( ( RULE_ID ) ) )
            // InternalLenguajegrafico.g:4950:2: ( ( RULE_ID ) )
            {
            // InternalLenguajegrafico.g:4950:2: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4951:3: ( RULE_ID )
            {
             before(grammarAccess.getMapChartAccess().getTupleTuple3CrossReference_3_0()); 
            // InternalLenguajegrafico.g:4952:3: ( RULE_ID )
            // InternalLenguajegrafico.g:4953:4: RULE_ID
            {
             before(grammarAccess.getMapChartAccess().getTupleTuple3IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMapChartAccess().getTupleTuple3IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMapChartAccess().getTupleTuple3CrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__TupleAssignment_3"


    // $ANTLR start "rule__MapChart__FeaturesAssignment_4"
    // InternalLenguajegrafico.g:4964:1: rule__MapChart__FeaturesAssignment_4 : ( ( rule__MapChart__FeaturesAlternatives_4_0 ) ) ;
    public final void rule__MapChart__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4968:1: ( ( ( rule__MapChart__FeaturesAlternatives_4_0 ) ) )
            // InternalLenguajegrafico.g:4969:2: ( ( rule__MapChart__FeaturesAlternatives_4_0 ) )
            {
            // InternalLenguajegrafico.g:4969:2: ( ( rule__MapChart__FeaturesAlternatives_4_0 ) )
            // InternalLenguajegrafico.g:4970:3: ( rule__MapChart__FeaturesAlternatives_4_0 )
            {
             before(grammarAccess.getMapChartAccess().getFeaturesAlternatives_4_0()); 
            // InternalLenguajegrafico.g:4971:3: ( rule__MapChart__FeaturesAlternatives_4_0 )
            // InternalLenguajegrafico.g:4971:4: rule__MapChart__FeaturesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MapChart__FeaturesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMapChartAccess().getFeaturesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapChart__FeaturesAssignment_4"


    // $ANTLR start "rule__TableChart__NameAssignment_1"
    // InternalLenguajegrafico.g:4979:1: rule__TableChart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TableChart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4983:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:4984:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:4984:2: ( RULE_ID )
            // InternalLenguajegrafico.g:4985:3: RULE_ID
            {
             before(grammarAccess.getTableChartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableChartAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__NameAssignment_1"


    // $ANTLR start "rule__TableChart__TupleAssignment_3"
    // InternalLenguajegrafico.g:4994:1: rule__TableChart__TupleAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TableChart__TupleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:4998:1: ( ( ( RULE_ID ) ) )
            // InternalLenguajegrafico.g:4999:2: ( ( RULE_ID ) )
            {
            // InternalLenguajegrafico.g:4999:2: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5000:3: ( RULE_ID )
            {
             before(grammarAccess.getTableChartAccess().getTupleTuple4CrossReference_3_0()); 
            // InternalLenguajegrafico.g:5001:3: ( RULE_ID )
            // InternalLenguajegrafico.g:5002:4: RULE_ID
            {
             before(grammarAccess.getTableChartAccess().getTupleTuple4IDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableChartAccess().getTupleTuple4IDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTableChartAccess().getTupleTuple4CrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__TupleAssignment_3"


    // $ANTLR start "rule__TableChart__FeaturesAssignment_4"
    // InternalLenguajegrafico.g:5013:1: rule__TableChart__FeaturesAssignment_4 : ( ( rule__TableChart__FeaturesAlternatives_4_0 ) ) ;
    public final void rule__TableChart__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5017:1: ( ( ( rule__TableChart__FeaturesAlternatives_4_0 ) ) )
            // InternalLenguajegrafico.g:5018:2: ( ( rule__TableChart__FeaturesAlternatives_4_0 ) )
            {
            // InternalLenguajegrafico.g:5018:2: ( ( rule__TableChart__FeaturesAlternatives_4_0 ) )
            // InternalLenguajegrafico.g:5019:3: ( rule__TableChart__FeaturesAlternatives_4_0 )
            {
             before(grammarAccess.getTableChartAccess().getFeaturesAlternatives_4_0()); 
            // InternalLenguajegrafico.g:5020:3: ( rule__TableChart__FeaturesAlternatives_4_0 )
            // InternalLenguajegrafico.g:5020:4: rule__TableChart__FeaturesAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TableChart__FeaturesAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTableChartAccess().getFeaturesAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableChart__FeaturesAssignment_4"


    // $ANTLR start "rule__DashBoard__NameAssignment_1"
    // InternalLenguajegrafico.g:5028:1: rule__DashBoard__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DashBoard__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5032:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5033:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:5033:2: ( RULE_ID )
            // InternalLenguajegrafico.g:5034:3: RULE_ID
            {
             before(grammarAccess.getDashBoardAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__NameAssignment_1"


    // $ANTLR start "rule__DashBoard__ChartsAssignment_3"
    // InternalLenguajegrafico.g:5043:1: rule__DashBoard__ChartsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DashBoard__ChartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5047:1: ( ( ( RULE_ID ) ) )
            // InternalLenguajegrafico.g:5048:2: ( ( RULE_ID ) )
            {
            // InternalLenguajegrafico.g:5048:2: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5049:3: ( RULE_ID )
            {
             before(grammarAccess.getDashBoardAccess().getChartsChartCrossReference_3_0()); 
            // InternalLenguajegrafico.g:5050:3: ( RULE_ID )
            // InternalLenguajegrafico.g:5051:4: RULE_ID
            {
             before(grammarAccess.getDashBoardAccess().getChartsChartIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getChartsChartIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDashBoardAccess().getChartsChartCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__ChartsAssignment_3"


    // $ANTLR start "rule__DashBoard__FeaturesAssignment_4"
    // InternalLenguajegrafico.g:5062:1: rule__DashBoard__FeaturesAssignment_4 : ( ruleTitle ) ;
    public final void rule__DashBoard__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5066:1: ( ( ruleTitle ) )
            // InternalLenguajegrafico.g:5067:2: ( ruleTitle )
            {
            // InternalLenguajegrafico.g:5067:2: ( ruleTitle )
            // InternalLenguajegrafico.g:5068:3: ruleTitle
            {
             before(grammarAccess.getDashBoardAccess().getFeaturesTitleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getFeaturesTitleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__FeaturesAssignment_4"


    // $ANTLR start "rule__Tuple1__NameAssignment_1"
    // InternalLenguajegrafico.g:5077:1: rule__Tuple1__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tuple1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5081:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5082:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:5082:2: ( RULE_ID )
            // InternalLenguajegrafico.g:5083:3: RULE_ID
            {
             before(grammarAccess.getTuple1Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTuple1Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__NameAssignment_1"


    // $ANTLR start "rule__Tuple1__UrlAssignment_3"
    // InternalLenguajegrafico.g:5092:1: rule__Tuple1__UrlAssignment_3 : ( ruleURL ) ;
    public final void rule__Tuple1__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5096:1: ( ( ruleURL ) )
            // InternalLenguajegrafico.g:5097:2: ( ruleURL )
            {
            // InternalLenguajegrafico.g:5097:2: ( ruleURL )
            // InternalLenguajegrafico.g:5098:3: ruleURL
            {
             before(grammarAccess.getTuple1Access().getUrlURLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getTuple1Access().getUrlURLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__UrlAssignment_3"


    // $ANTLR start "rule__Tuple1__Value1Assignment_4"
    // InternalLenguajegrafico.g:5107:1: rule__Tuple1__Value1Assignment_4 : ( ruleText ) ;
    public final void rule__Tuple1__Value1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5111:1: ( ( ruleText ) )
            // InternalLenguajegrafico.g:5112:2: ( ruleText )
            {
            // InternalLenguajegrafico.g:5112:2: ( ruleText )
            // InternalLenguajegrafico.g:5113:3: ruleText
            {
             before(grammarAccess.getTuple1Access().getValue1TextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTuple1Access().getValue1TextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Value1Assignment_4"


    // $ANTLR start "rule__Tuple1__Value2Assignment_5"
    // InternalLenguajegrafico.g:5122:1: rule__Tuple1__Value2Assignment_5 : ( ruleNumber ) ;
    public final void rule__Tuple1__Value2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5126:1: ( ( ruleNumber ) )
            // InternalLenguajegrafico.g:5127:2: ( ruleNumber )
            {
            // InternalLenguajegrafico.g:5127:2: ( ruleNumber )
            // InternalLenguajegrafico.g:5128:3: ruleNumber
            {
             before(grammarAccess.getTuple1Access().getValue2NumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTuple1Access().getValue2NumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple1__Value2Assignment_5"


    // $ANTLR start "rule__Tuple2__NameAssignment_1"
    // InternalLenguajegrafico.g:5137:1: rule__Tuple2__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tuple2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5141:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5142:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:5142:2: ( RULE_ID )
            // InternalLenguajegrafico.g:5143:3: RULE_ID
            {
             before(grammarAccess.getTuple2Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTuple2Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__NameAssignment_1"


    // $ANTLR start "rule__Tuple2__UrlAssignment_3"
    // InternalLenguajegrafico.g:5152:1: rule__Tuple2__UrlAssignment_3 : ( ruleURL ) ;
    public final void rule__Tuple2__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5156:1: ( ( ruleURL ) )
            // InternalLenguajegrafico.g:5157:2: ( ruleURL )
            {
            // InternalLenguajegrafico.g:5157:2: ( ruleURL )
            // InternalLenguajegrafico.g:5158:3: ruleURL
            {
             before(grammarAccess.getTuple2Access().getUrlURLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getTuple2Access().getUrlURLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__UrlAssignment_3"


    // $ANTLR start "rule__Tuple2__Value1Assignment_4"
    // InternalLenguajegrafico.g:5167:1: rule__Tuple2__Value1Assignment_4 : ( ( rule__Tuple2__Value1Alternatives_4_0 ) ) ;
    public final void rule__Tuple2__Value1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5171:1: ( ( ( rule__Tuple2__Value1Alternatives_4_0 ) ) )
            // InternalLenguajegrafico.g:5172:2: ( ( rule__Tuple2__Value1Alternatives_4_0 ) )
            {
            // InternalLenguajegrafico.g:5172:2: ( ( rule__Tuple2__Value1Alternatives_4_0 ) )
            // InternalLenguajegrafico.g:5173:3: ( rule__Tuple2__Value1Alternatives_4_0 )
            {
             before(grammarAccess.getTuple2Access().getValue1Alternatives_4_0()); 
            // InternalLenguajegrafico.g:5174:3: ( rule__Tuple2__Value1Alternatives_4_0 )
            // InternalLenguajegrafico.g:5174:4: rule__Tuple2__Value1Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple2__Value1Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTuple2Access().getValue1Alternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Value1Assignment_4"


    // $ANTLR start "rule__Tuple2__Value2Assignment_5"
    // InternalLenguajegrafico.g:5182:1: rule__Tuple2__Value2Assignment_5 : ( ruleNumber ) ;
    public final void rule__Tuple2__Value2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5186:1: ( ( ruleNumber ) )
            // InternalLenguajegrafico.g:5187:2: ( ruleNumber )
            {
            // InternalLenguajegrafico.g:5187:2: ( ruleNumber )
            // InternalLenguajegrafico.g:5188:3: ruleNumber
            {
             before(grammarAccess.getTuple2Access().getValue2NumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTuple2Access().getValue2NumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple2__Value2Assignment_5"


    // $ANTLR start "rule__Tuple3__NameAssignment_1"
    // InternalLenguajegrafico.g:5197:1: rule__Tuple3__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tuple3__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5201:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5202:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:5202:2: ( RULE_ID )
            // InternalLenguajegrafico.g:5203:3: RULE_ID
            {
             before(grammarAccess.getTuple3Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTuple3Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__NameAssignment_1"


    // $ANTLR start "rule__Tuple3__UrlAssignment_3"
    // InternalLenguajegrafico.g:5212:1: rule__Tuple3__UrlAssignment_3 : ( ruleURL ) ;
    public final void rule__Tuple3__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5216:1: ( ( ruleURL ) )
            // InternalLenguajegrafico.g:5217:2: ( ruleURL )
            {
            // InternalLenguajegrafico.g:5217:2: ( ruleURL )
            // InternalLenguajegrafico.g:5218:3: ruleURL
            {
             before(grammarAccess.getTuple3Access().getUrlURLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getTuple3Access().getUrlURLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__UrlAssignment_3"


    // $ANTLR start "rule__Tuple3__Value1Assignment_4"
    // InternalLenguajegrafico.g:5227:1: rule__Tuple3__Value1Assignment_4 : ( ruleFloat ) ;
    public final void rule__Tuple3__Value1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5231:1: ( ( ruleFloat ) )
            // InternalLenguajegrafico.g:5232:2: ( ruleFloat )
            {
            // InternalLenguajegrafico.g:5232:2: ( ruleFloat )
            // InternalLenguajegrafico.g:5233:3: ruleFloat
            {
             before(grammarAccess.getTuple3Access().getValue1FloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getTuple3Access().getValue1FloatParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Value1Assignment_4"


    // $ANTLR start "rule__Tuple3__Value2Assignment_5"
    // InternalLenguajegrafico.g:5242:1: rule__Tuple3__Value2Assignment_5 : ( ruleFloat ) ;
    public final void rule__Tuple3__Value2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5246:1: ( ( ruleFloat ) )
            // InternalLenguajegrafico.g:5247:2: ( ruleFloat )
            {
            // InternalLenguajegrafico.g:5247:2: ( ruleFloat )
            // InternalLenguajegrafico.g:5248:3: ruleFloat
            {
             before(grammarAccess.getTuple3Access().getValue2FloatParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getTuple3Access().getValue2FloatParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Value2Assignment_5"


    // $ANTLR start "rule__Tuple3__Value3Assignment_6"
    // InternalLenguajegrafico.g:5257:1: rule__Tuple3__Value3Assignment_6 : ( ( rule__Tuple3__Value3Alternatives_6_0 ) ) ;
    public final void rule__Tuple3__Value3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5261:1: ( ( ( rule__Tuple3__Value3Alternatives_6_0 ) ) )
            // InternalLenguajegrafico.g:5262:2: ( ( rule__Tuple3__Value3Alternatives_6_0 ) )
            {
            // InternalLenguajegrafico.g:5262:2: ( ( rule__Tuple3__Value3Alternatives_6_0 ) )
            // InternalLenguajegrafico.g:5263:3: ( rule__Tuple3__Value3Alternatives_6_0 )
            {
             before(grammarAccess.getTuple3Access().getValue3Alternatives_6_0()); 
            // InternalLenguajegrafico.g:5264:3: ( rule__Tuple3__Value3Alternatives_6_0 )
            // InternalLenguajegrafico.g:5264:4: rule__Tuple3__Value3Alternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Tuple3__Value3Alternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTuple3Access().getValue3Alternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple3__Value3Assignment_6"


    // $ANTLR start "rule__Tuple4__NameAssignment_1"
    // InternalLenguajegrafico.g:5272:1: rule__Tuple4__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tuple4__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5276:1: ( ( RULE_ID ) )
            // InternalLenguajegrafico.g:5277:2: ( RULE_ID )
            {
            // InternalLenguajegrafico.g:5277:2: ( RULE_ID )
            // InternalLenguajegrafico.g:5278:3: RULE_ID
            {
             before(grammarAccess.getTuple4Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTuple4Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__NameAssignment_1"


    // $ANTLR start "rule__Tuple4__UrlAssignment_3"
    // InternalLenguajegrafico.g:5287:1: rule__Tuple4__UrlAssignment_3 : ( ruleURL ) ;
    public final void rule__Tuple4__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5291:1: ( ( ruleURL ) )
            // InternalLenguajegrafico.g:5292:2: ( ruleURL )
            {
            // InternalLenguajegrafico.g:5292:2: ( ruleURL )
            // InternalLenguajegrafico.g:5293:3: ruleURL
            {
             before(grammarAccess.getTuple4Access().getUrlURLParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURL();

            state._fsp--;

             after(grammarAccess.getTuple4Access().getUrlURLParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__UrlAssignment_3"


    // $ANTLR start "rule__Tuple4__ValuesAssignment_4"
    // InternalLenguajegrafico.g:5302:1: rule__Tuple4__ValuesAssignment_4 : ( ruleDatatype ) ;
    public final void rule__Tuple4__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5306:1: ( ( ruleDatatype ) )
            // InternalLenguajegrafico.g:5307:2: ( ruleDatatype )
            {
            // InternalLenguajegrafico.g:5307:2: ( ruleDatatype )
            // InternalLenguajegrafico.g:5308:3: ruleDatatype
            {
             before(grammarAccess.getTuple4Access().getValuesDatatypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getTuple4Access().getValuesDatatypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tuple4__ValuesAssignment_4"


    // $ANTLR start "rule__CodeGeneratedTarget__ValueAssignment_2"
    // InternalLenguajegrafico.g:5317:1: rule__CodeGeneratedTarget__ValueAssignment_2 : ( ( rule__CodeGeneratedTarget__ValueAlternatives_2_0 ) ) ;
    public final void rule__CodeGeneratedTarget__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5321:1: ( ( ( rule__CodeGeneratedTarget__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:5322:2: ( ( rule__CodeGeneratedTarget__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:5322:2: ( ( rule__CodeGeneratedTarget__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:5323:3: ( rule__CodeGeneratedTarget__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getCodeGeneratedTargetAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:5324:3: ( rule__CodeGeneratedTarget__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:5324:4: rule__CodeGeneratedTarget__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CodeGeneratedTarget__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCodeGeneratedTargetAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeGeneratedTarget__ValueAssignment_2"


    // $ANTLR start "rule__NormaliceData__ValueAssignment_2"
    // InternalLenguajegrafico.g:5332:1: rule__NormaliceData__ValueAssignment_2 : ( ( rule__NormaliceData__ValueAlternatives_2_0 ) ) ;
    public final void rule__NormaliceData__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLenguajegrafico.g:5336:1: ( ( ( rule__NormaliceData__ValueAlternatives_2_0 ) ) )
            // InternalLenguajegrafico.g:5337:2: ( ( rule__NormaliceData__ValueAlternatives_2_0 ) )
            {
            // InternalLenguajegrafico.g:5337:2: ( ( rule__NormaliceData__ValueAlternatives_2_0 ) )
            // InternalLenguajegrafico.g:5338:3: ( rule__NormaliceData__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getNormaliceDataAccess().getValueAlternatives_2_0()); 
            // InternalLenguajegrafico.g:5339:3: ( rule__NormaliceData__ValueAlternatives_2_0 )
            // InternalLenguajegrafico.g:5339:4: rule__NormaliceData__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__NormaliceData__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNormaliceDataAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormaliceData__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x7FF2000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0009052000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001052000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00090DE000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00010DE000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000915E000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000115E000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0009E52000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001E52000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000E0000000L});

}