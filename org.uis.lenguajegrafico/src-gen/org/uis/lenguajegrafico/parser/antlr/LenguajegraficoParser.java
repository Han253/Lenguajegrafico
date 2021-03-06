/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.uis.lenguajegrafico.parser.antlr.internal.InternalLenguajegraficoParser;
import org.uis.lenguajegrafico.services.LenguajegraficoGrammarAccess;

public class LenguajegraficoParser extends AbstractAntlrParser {

	@Inject
	private LenguajegraficoGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLenguajegraficoParser createParser(XtextTokenStream stream) {
		return new InternalLenguajegraficoParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Lenguajegrafico";
	}

	public LenguajegraficoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LenguajegraficoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
