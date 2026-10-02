import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.core.util.CoreEPackageProvider;
import org.nasdanika.sdk.runtime.models.core.util.KindEPackageProvider;

module org.nasdanika.sdk.runtime.models.core {
	
	exports org.nasdanika.sdk.runtime.models.core;
	exports org.nasdanika.sdk.runtime.models.core.impl;
	exports org.nasdanika.sdk.runtime.models.core.util;
	
	exports org.nasdanika.sdk.runtime.models.core.kind;
	exports org.nasdanika.sdk.runtime.models.core.kind.impl;
	exports org.nasdanika.sdk.runtime.models.core.kind.util;
	
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires java.scripting;
	
	provides EPackage with 
		CoreEPackageProvider, 
		KindEPackageProvider;
	
}