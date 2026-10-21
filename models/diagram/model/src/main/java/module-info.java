// tag::module[]
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.diagram.services.DiagramEPackageProvider;

module org.nasdanika.sdk.runtime.models.diagram {
	
	exports org.nasdanika.sdk.runtime.models.diagram;
	exports org.nasdanika.sdk.runtime.models.diagram.impl;
	exports org.nasdanika.sdk.runtime.models.diagram.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.core;
	
	provides EPackage with DiagramEPackageProvider;
	
}
// end::module[]
