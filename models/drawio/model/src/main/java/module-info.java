import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.drawio.services.DrawioEPackageProvider;

module org.nasdanika.sdk.runtime.models.drawio {
	
	exports org.nasdanika.sdk.runtime.models.drawio;
	exports org.nasdanika.sdk.runtime.models.drawio.impl;
	exports org.nasdanika.sdk.runtime.models.drawio.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.presentation;
	
	provides EPackage with DrawioEPackageProvider;
	
}