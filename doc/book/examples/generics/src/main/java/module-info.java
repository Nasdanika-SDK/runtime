// tag::module[]
module org.example.generics {

	requires transitive org.nasdanika.sdk.runtime.common;

	exports org.example.generics;

	// Adapter fields and methods are read reflectively by common
	opens org.example.generics to org.nasdanika.sdk.runtime.common;

}
// end::module[]
