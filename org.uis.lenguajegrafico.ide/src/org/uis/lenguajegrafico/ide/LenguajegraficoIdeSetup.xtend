/*
 * generated by Xtext 2.11.0
 */
package org.uis.lenguajegrafico.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.uis.lenguajegrafico.LenguajegraficoRuntimeModule
import org.uis.lenguajegrafico.LenguajegraficoStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LenguajegraficoIdeSetup extends LenguajegraficoStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LenguajegraficoRuntimeModule, new LenguajegraficoIdeModule))
	}
	
}
