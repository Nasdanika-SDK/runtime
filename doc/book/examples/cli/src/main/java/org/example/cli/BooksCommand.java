package org.example.cli;

import java.util.List;

import org.example.library.Book;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.cli.CommandBase;
import org.nasdanika.sdk.runtime.cli.ExecutionSupplier;
import org.nasdanika.sdk.runtime.cli.MixIns;
import org.nasdanika.sdk.runtime.cli.Parent;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;

// tag::books[]
@Command(
		name = "books",
		description = "Lists books",
		mixinStandardHelpOptions = true)
@MixIns(LimitMixIn.class)                                                        // <1>
public class BooksCommand extends CommandBase {

	@Parent
	private ExecutionSupplier<? extends Library> library;                        // <2>

	@Option(names = "--before", description = "Only books published before this year")
	private Integer before;

	@Override
	protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
		Library theLibrary = library.get(span, logger, meter);                    // <3>
		List<Book> books = before == null
				? theLibrary.getBooks()
				: theLibrary.publishedBefore(before);
		for (Book book: limit(books)) {
			spec.commandLine().getOut().println(book.getName() + " (" + book.getYear() + ")");
		}
		span.setAttribute("library.books", (long) books.size());
		return 0;
	}

	private <T> List<T> limit(List<T> items) {
		for (CommandSpec mixIn: spec.mixins().values()) {                          // <4>
			if (mixIn.userObject() instanceof LimitMixIn limit) {
				return limit.apply(items);
			}
		}
		return items;
	}

}
// end::books[]
