/*
 * generated by Xtext 2.11.0
 */
package org.uis.lenguajegrafico


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LenguajegraficoStandaloneSetup extends LenguajegraficoStandaloneSetupGenerated {

	def static void doSetup() {
		new LenguajegraficoStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}