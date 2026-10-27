// tag::module[]
module org.example.diagram {

	requires transitive org.nasdanika.sdk.runtime.models.drawio;       // <1>
	requires transitive org.nasdanika.sdk.runtime.models.diagram.elk;
	requires transitive org.nasdanika.sdk.runtime.models.svg;
	requires transitive org.example.library;

	exports org.example.diagram;

}
// end::module[]
