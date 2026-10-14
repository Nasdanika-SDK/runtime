import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.meta.services.MetaEPackageProvider;

module org.nasdanika.sdk.runtime.models.meta {
	
	exports org.nasdanika.sdk.runtime.models.meta;
	exports org.nasdanika.sdk.runtime.models.meta.impl;
	exports org.nasdanika.sdk.runtime.models.meta.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.core;
	
	provides EPackage with MetaEPackageProvider;
	
}