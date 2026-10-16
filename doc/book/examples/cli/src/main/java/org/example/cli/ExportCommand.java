package org.example.cli;

import java.io.PrintWriter;
import java.util.List;

import org.example.library.Library;
import org.nasdanika.sdk.runtime.cli.CommandBase;
import org.nasdanika.sdk.runtime.cli.ExecutionSupplier;
import org.nasdanika.sdk.runtime.cli.Parent;
import org.nasdanika.sdk.runtime.cli.SubCommand;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;

// tag::export[]
@Command(
		name = "export",
		description = "Exports the library. Without a format, lists the formats",
		mixinStandardHelpOptions = true)
public class ExportCommand extends CommandBase {

	@Parent
	private ExecutionSupplier<? extends Library> library;                    // <1>

	@SubCommand
	private List<Exporter> exporters;                                       // <2>

	/**
	 * For the exporters, which take this command as their parent. Not an adapter: an
	 * adapter would offer the library to every command that needs one, and they would
	 * all appear under export.
	 */
	public ExecutionSupplier<? extends Library> library() {                 // <3>
		return library;
	}

	@Override
	protected Integer execute(Span span, Logger logger, Meter meter) {
		PrintWriter out = spec.commandLine().getOut();
		exporters.stream().map(Exporter::format).sorted().forEach(out::println);
		return 0;
	}

}
// end::export[]
