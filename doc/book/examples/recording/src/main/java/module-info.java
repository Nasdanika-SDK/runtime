module org.example.recording {

	requires transitive org.example.library;
	requires transitive org.nasdanika.sdk.runtime.models.telemetry.exporters;
	requires io.opentelemetry.sdk;
	requires org.nasdanika.sdk.runtime.emf.json;

	exports org.example.recording;

}
