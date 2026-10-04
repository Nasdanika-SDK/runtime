module org.nasdanika.sdk.runtime.volume {
	
	requires transitive io.opentelemetry.api;
	requires transitive io.opentelemetry.context;
	requires java.net.http;
	requires org.nasdanika.sdk.runtime.common;
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires transitive jdk.httpserver;

	exports org.nasdanika.sdk.runtime.volume;
	exports org.nasdanika.sdk.runtime.volume.http;
	exports org.nasdanika.sdk.runtime.volume.emf;
	
}