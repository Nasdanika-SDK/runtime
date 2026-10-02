module org.nasdanika.sdk.runtime.tests.telemetry {

	requires org.nasdanika.sdk.runtime.models.core;
	requires org.nasdanika.sdk.runtime.common;
	requires org.nasdanika.sdk.runtime.emf.json;
	requires io.opentelemetry.sdk;
	requires io.opentelemetry.sdk.common;
	requires io.opentelemetry.sdk.trace;
	requires io.opentelemetry.sdk.logs;
	requires io.opentelemetry.exporter.logging.otlp;

}
