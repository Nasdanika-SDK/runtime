module org.nasdanika.sdk.runtime.volume {
	
	requires transitive io.opentelemetry.api;
	requires transitive io.opentelemetry.context;
	requires java.net.http;
	requires org.nasdanika.sdk.runtime.common;
	
	exports org.nasdanika.sdk.runtime.volume;
	
}