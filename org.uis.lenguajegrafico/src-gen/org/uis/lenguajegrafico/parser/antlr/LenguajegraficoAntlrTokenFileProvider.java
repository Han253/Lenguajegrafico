/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package org.uis.lenguajegrafico.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LenguajegraficoAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/uis/lenguajegrafico/parser/antlr/internal/InternalLenguajegrafico.tokens");
	}
}