package org.example.cli;

import java.util.stream.Collectors;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.cli.CommandBase;
import org.nasdanika.sdk.runtime.cli.Parent;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;

@Command(
		name = "csv",
		description = "Exports the library as CSV",
		mixinStandardHelpOptions = true)
public class CsvExporter extends CommandBase implements Exporter {

	@Parent
	private ExportCommand parent;

	@Override
	public String format() {
		return "csv";
	}

	@Override
	public String export(Library library) {
		StringBuilder csv = new StringBuilder("title,year,authors\n");
		for (Book book: library.getBooks()) {
			String authors = book.getAuthors().stream()
					.map(Author::getName)
					.collect(Collectors.joining("; "));
			csv.append('"').append(book.getName()).append("\",").append(book.getYear())
				.append(",\"").append(authors).append("\"\n");
		}
		return csv.toString();
	}

	@Override
	protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
		Library library = parent.library().get(span, logger, meter);
		spec.commandLine().getOut().print(export(library));
		return 0;
	}

}
