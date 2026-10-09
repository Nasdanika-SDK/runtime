module org.nasdanika.sdk.runtime.cli.launcher {

	exports org.nasdanika.sdk.runtime.cli.launcher;

	requires transitive org.nasdanika.sdk.runtime.cli;
	requires io.opentelemetry.sdk;
	requires org.eclipse.emf.ecore;
	requires io.opentelemetry.sdk.common;
	requires io.opentelemetry.sdk.trace;
	requires io.opentelemetry.sdk.metrics;
	requires org.nasdanika.sdk.runtime.models.telemetry.exporters;
	
}