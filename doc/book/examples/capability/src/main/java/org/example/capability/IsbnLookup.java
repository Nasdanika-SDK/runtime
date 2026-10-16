package org.example.capability;

import static org.example.capability.Requirements.LIBRARY_SUPPLIER;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;
import java.util.function.Supplier;

import org.example.library.Book;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

// tag::lookup[]
/**
 * A factory written against the interface: it interprets requirements of its own type
 * and depends on another capability, the libraries, which it requests through the loader.
 */
public class IsbnLookup implements CapabilityFactory<Isbn, Book> {

	@Override
	public boolean canHandle(Object requirement) {                       // <1>
		return requirement instanceof Isbn;
	}

	@Override
	public Flow.Publisher<CapabilityProvider<Book>> create(
			Isbn isbn,
			Loader loader,
			Span span,
			Logger logger) {                                               // <2>
		span.setAttribute("isbn", isbn.value());
		CompletableFuture<List<Supplier<Library>>> libraries =
				loader.loadAll(Requirement.of(LIBRARY_SUPPLIER));           // <3>
		return Flows.fromFuture(libraries.thenApply(suppliers -> CapabilityProvider.of(
				suppliers.stream()
					.map(Supplier::get)
					.flatMap(library -> library.getBooks().stream())
					.filter(book -> isbn.value().equals(book.getIsbn()))
					.toArray(Book[]::new))));                            // <4>
	}

	@Override
	public String toString() {
		return "IsbnLookup";
	}

}
// end::lookup[]
