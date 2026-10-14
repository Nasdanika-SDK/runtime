import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.typescript.services.TypescriptEPackageProvider;

module org.nasdanika.sdk.runtime.models.typescript {
	
	exports org.nasdanika.sdk.runtime.models.typescript;
	exports org.nasdanika.sdk.runtime.models.typescript.impl;
	exports org.nasdanika.sdk.runtime.models.typescript.generator;
	
	requires transitive org.nasdanika.sdk.runtime.models.core;
	requires transitive org.nasdanika.sdk.runtime.volume;
	
	provides EPackage with TypescriptEPackageProvider;
	
}