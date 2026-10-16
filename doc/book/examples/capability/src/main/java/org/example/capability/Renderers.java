package org.example.capability;

import static java.util.stream.Collectors.joining;
import static org.example.capability.Requirements.BOOK_RENDERER;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.function.Supplier;

import org.example.library.Book;
import org.example.library.Library;
import org.example.library.services.Samples;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.Requirement;

import io.opentelemetry.api.trace.Span;

// tag::factory[]
/**
 * One class, one entry in module-info, four capabilities. What each method provides
 * is its generic return type; what it needs are its parameters.
 */
public class Renderers extends ReflectiveCapabilityFactory {

	public Renderers() {
		super(MethodHandles.lookup());                                  // <1>
	}

	@Capability
	public Supplier<Library> sample() {                                 // <2>
		return Samples::library;
	}

	@Capability
	public Function<Book, String> markdownLine(Format format) {        // <3>
		if (!"markdown".equals(format.name())) {
			return null;                                                // <4>
		}
		return book -> "* _" + book.getName() + "_ (" + book.getYear() + ")";
	}

	@Capability
	public CompletionStage<Function<Library, String>> markdown(
			Format format,
			Loader loader,                                              // <5>
			Span span) {
		if (!"markdown".equals(format.name())) {
			return null;
		}
		span.setAttribute("format", format.name());
		CompletableFuture<List<Function<Book, String>>> lines =
				loader.loadAll(Requirement.of(BOOK_RENDERER, format));      // <6>
		return lines.thenApply(renderers -> library -> "# " + library.getName() + "\n\n"
				+ library.getBooks().stream().map(renderers.getFirst()).collect(joining("\n")));
	}

	@Capability
	public Function<Library, String> csv(Format format) {
		if (!"csv".equals(format.name())) {
			return null;
		}
		return library -> new CsvLibraryHandler().write(library);
	}

}
// end::factory[]
