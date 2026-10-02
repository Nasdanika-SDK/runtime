import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.file.util.FileEPackageProvider;

module org.nasdanika.sdk.runtime.models.file {
	
	exports org.nasdanika.sdk.runtime.models.file;
	exports org.nasdanika.sdk.runtime.models.file.impl;
	exports org.nasdanika.sdk.runtime.models.file.util;
	
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.nasdanika.sdk.runtime.volume;
	
	provides EPackage with FileEPackageProvider;
	
}