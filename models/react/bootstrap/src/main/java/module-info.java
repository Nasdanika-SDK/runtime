import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.services.BootstrapEPackageProvider;

module org.nasdanika.sdk.runtime.models.react.bootstrap {
	
	exports org.nasdanika.sdk.runtime.models.react.bootstrap;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.impl;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.react;
	requires java.net.http;
	requires jdk.httpserver;
	
	provides EPackage with BootstrapEPackageProvider;
	
}