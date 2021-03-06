/**
 * generated by Xtext 2.11.0
 */
package org.uis.lenguajegrafico.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.uis.lenguajegrafico.LenguajegraficoRuntimeModule;
import org.uis.lenguajegrafico.LenguajegraficoStandaloneSetup;
import org.uis.lenguajegrafico.ide.LenguajegraficoIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class LenguajegraficoIdeSetup extends LenguajegraficoStandaloneSetup {
  @Override
  public Injector createInjector() {
    LenguajegraficoRuntimeModule _lenguajegraficoRuntimeModule = new LenguajegraficoRuntimeModule();
    LenguajegraficoIdeModule _lenguajegraficoIdeModule = new LenguajegraficoIdeModule();
    return Guice.createInjector(Modules2.mixin(_lenguajegraficoRuntimeModule, _lenguajegraficoIdeModule));
  }
}
