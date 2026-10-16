// tag::module[]
import org.example.cli.BooksCommandFactory;
import org.example.cli.CsvExporterFactory;
import org.example.cli.ExportCommandFactory;
import org.example.cli.HelloCommandFactory;
import org.example.cli.LibraryCommandFactory;
import org.example.cli.LimitMixInFactory;
import org.example.cli.MarkdownExporterFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;

module org.example.cli {

	requires transitive org.nasdanika.sdk.runtime.cli;
	requires transitive org.example.library;

	exports org.example.cli;

	opens org.example.cli; // <1>

	provides CapabilityFactory with // <2>
		HelloCommandFactory,
		LibraryCommandFactory,
		BooksCommandFactory,
		ExportCommandFactory,
		MarkdownExporterFactory,
		CsvExporterFactory,
		LimitMixInFactory;

}
// end::module[]
