import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.services.ReactEPackageProvider;

module org.nasdanika.sdk.runtime.models.react {
	
	exports org.nasdanika.sdk.runtime.models.react;
	exports org.nasdanika.sdk.runtime.models.react.impl;
	exports org.nasdanika.sdk.runtime.models.react.util;
	exports org.nasdanika.sdk.runtime.models.react.generator;
	
	requires transitive org.nasdanika.sdk.runtime.models.typescript;
	requires transitive org.nasdanika.sdk.runtime.models.html;
	requires java.net.http;
	requires jdk.httpserver;
	
	provides EPackage with ReactEPackageProvider;
	
}