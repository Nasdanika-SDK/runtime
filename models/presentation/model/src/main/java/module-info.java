import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.presentation.services.PresentationEPackageProvider;

module org.nasdanika.sdk.runtime.models.presentation {
	
	exports org.nasdanika.sdk.runtime.models.presentation;
	exports org.nasdanika.sdk.runtime.models.presentation.impl;
	exports org.nasdanika.sdk.runtime.models.presentation.util;
	
	requires org.nasdanika.sdk.runtime.common;
	requires transitive org.nasdanika.sdk.runtime.models.diagram;
	
	provides EPackage with PresentationEPackageProvider;
	
}