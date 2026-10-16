// tag::module[]
module org.example.start {

	requires org.nasdanika.sdk.runtime.common;

	// JSON and YAML resource factories. Service binding would resolve the module
	// anyway, because it provides a service common uses; requiring it says so.
	requires org.nasdanika.sdk.runtime.emf.json;

	exports org.example.start;

}
// end::module[]
