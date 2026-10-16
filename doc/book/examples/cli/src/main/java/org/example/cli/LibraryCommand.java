package org.example.cli;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.example.library.Library;
import org.example.library.services.Samples;
import org.nasdanika.sdk.runtime.cli.CommandGroup;
import org.nasdanika.sdk.runtime.cli.ExecutionSupplier;
import org.nasdanika.sdk.runtime.cli.Parent;
import org.nasdanika.sdk.runtime.cli.RootCommand;
import org.nasdanika.sdk.runtime.common.Adapter;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

// tag::library[]
/**
 * A group: it does nothing itself, and gives its sub-commands a library to work on. What
 * it gives is declared by the generic return types of its adapters.
 */
@Command(
		name = "library",
		description = "Works with a library of books",
		mixinStandardHelpOptions = true)
public class LibraryCommand extends CommandGroup {

	@Parent
	private RootCommand root;

	@Option(names = "--file", description = "Library file, the sample library if not set")
	private File file;                                                          // <1>

	@Adapter
	public ExecutionSupplier<Library> library() {                             // <2>
		return (span, logger, meter) -> load(span);
	}

	@Adapter
	public ExecutionSupplier<List<EObject>> contents() {                      // <3>
		return (span, logger, meter) -> List.of(load(span));
	}

	private Library load(Span span) {
		if (file == null) {
			span.setAttribute("library.source", "sample");
			return Samples.library();
		}
		span.setAttribute("library.source", file.getPath());
		URI uri = URI.createFileURI(file.getAbsolutePath());
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		return (Library) resourceSet.getResource(uri, true).getContents().getFirst(); // <4>
	}

}
// end::library[]
