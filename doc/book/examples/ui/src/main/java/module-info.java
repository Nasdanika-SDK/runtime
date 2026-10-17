// tag::module[]
import org.example.ui.BookCard;
import org.example.ui.LibraryView;
import org.example.ui.NamedElementView;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;

module org.example.ui {

	requires transitive org.example.library;
	requires transitive org.nasdanika.sdk.runtime.models.html.bootstrap;
	requires transitive org.nasdanika.sdk.runtime.models.react;
	requires transitive org.nasdanika.sdk.runtime.volume;
	requires org.json;

	exports org.example.ui;

	provides CapabilityFactory with // <1>
		LibraryView,
		BookCard,
		NamedElementView;

}
// end::module[]
