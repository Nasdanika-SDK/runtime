import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.jvm.services.JvmEPackageProvider;

module org.nasdanika.sdk.runtime.models.jvm {
	
	exports org.nasdanika.sdk.runtime.models.jvm;
	exports org.nasdanika.sdk.runtime.models.jvm.impl;
	exports org.nasdanika.sdk.runtime.models.jvm.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.core;
	
	provides EPackage with JvmEPackageProvider;
	
}