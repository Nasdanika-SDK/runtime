package org.example.cli;

import org.example.library.Book;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.cli.CommandBase;
import org.nasdanika.sdk.runtime.cli.Parent;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;

// tag::markdown[]
@Command(
		name = "markdown",
		description = "Exports the library as Markdown",
		mixinStandardHelpOptions = true)
public class MarkdownExporter extends CommandBase implements Exporter {

	@Parent
	private ExportCommand parent; // A parent typed by its class

	@Override
	public String format() {
		return "markdown";
	}

	@Override
	public String export(Library library) {
		StringBuilder markdown = new StringBuilder("# ").append(library.getName());
		markdown.append("\n\n");
		for (Book book: library.getBooks()) {
			markdown.append("* _").append(book.getName()).append("_ (")
				.append(book.getYear()).append(")\n");
		}
		return markdown.toString();
	}

	@Override
	protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
		Library library = parent.library().get(span, logger, meter);
		spec.commandLine().getOut().print(export(library));
		return 0;
	}

}
// end::markdown[]
