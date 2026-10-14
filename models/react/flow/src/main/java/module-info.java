import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.flow.services.FlowEPackageProvider;

module org.nasdanika.sdk.runtime.models.react.flow {
	
	exports org.nasdanika.sdk.runtime.models.react.flow;
	exports org.nasdanika.sdk.runtime.models.react.flow.impl;
	exports org.nasdanika.sdk.runtime.models.react.flow.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.react;
	requires transitive org.nasdanika.sdk.runtime.models.html;
	requires java.net.http;
	requires jdk.httpserver;
	
	provides EPackage with FlowEPackageProvider;
	
}