// tag::module[]
import org.example.dsl.LibraryDsl;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;

module org.example.dsl {

	requires transitive org.example.library;
	requires transitive org.nasdanika.sdk.runtime.groovy;

	exports org.example.dsl;

	provides CapabilityFactory with LibraryDsl;

}
// end::module[]
