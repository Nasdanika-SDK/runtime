// tag::module[]
import org.example.capability.CsvContributor;
import org.example.capability.CsvHandlers;
import org.example.capability.IsbnLookup;
import org.example.capability.Renderers;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

module org.example.capability {

	requires transitive org.example.library;

	exports org.example.capability;

	// One entry per class, however many capabilities it has
	provides CapabilityFactory with
		Renderers,
		IsbnLookup,
		CsvHandlers;

	provides ResourceSetContributor with CsvContributor;

}
// end::module[]
