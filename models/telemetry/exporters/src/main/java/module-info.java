module org.nasdanika.sdk.runtime.models.telemetry.exporters {

	exports org.nasdanika.sdk.runtime.models.telemetry.exporters;

	requires transitive org.nasdanika.sdk.runtime.models.telemetry;
	requires transitive io.opentelemetry.api;
	requires transitive io.opentelemetry.context;
	requires transitive io.opentelemetry.sdk.common;
	requires transitive io.opentelemetry.sdk.trace;
	requires transitive io.opentelemetry.sdk.logs;
	requires transitive io.opentelemetry.sdk.metrics;

}
