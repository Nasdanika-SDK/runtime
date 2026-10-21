package org.nasdanika.sdk.runtime.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Flow;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.Adapter;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;
import picocli.CommandLine;
import picocli.CommandLine.Command;

/**
 * Parents that produce lazily, sub-commands taken by type, and parents that cannot provide.
 */
class WiringTests {

	static CommandLine commandLine(Object root, Object... subCommands) {
		CommandLine commandLine = new CommandLine(root);
		for (Object subCommand: subCommands) {
			commandLine.addSubcommand(subCommand);
		}
		commandLine.setExecutionStrategy(new WiringExecutionStrategy()); // <1>
		commandLine.setOut(new PrintWriter(new StringWriter()));
		commandLine.setErr(new PrintWriter(new StringWriter()));
		return commandLine;
	}

	// tag::catalog[]
	@Command(name = "catalog")
	public static class CatalogCommand extends CommandGroup {

		int loads;

		@Adapter
		public ExecutionSupplier<List<EObject>> contents() { // <1>
			return (span, logger, meter) -> Telemetry.inSpan(
				Telemetry.tracer(Telemetry.current()),
				"Load the catalog",
				null,
				load -> {
					++loads;
					return List.of(EcoreFactory.eINSTANCE.createEPackage());
				});
		}

	}

	@Command(name = "count")
	public static class CountCommand extends CommandBase {

		@Parent
		ExecutionSupplier<? extends Collection<? extends EObject>> contents; // <2>

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
			return contents.get(span, logger, meter).size(); // <3>
		}

	}
	// end::catalog[]

	@Test
	void lazyParent() {
		// tag::lazy[]
		List<String> started = new ArrayList<>();
		TracerProvider noop = TracerProvider.noop();
		try (PublishingOpenTelemetry otel = new PublishingOpenTelemetry(
				OpenTelemetry.noop(),
				new PublishingTracerProvider(noop, Runnable::run, 64));
				Scope scope = Telemetry.makeCurrent(otel)) {
			otel.subscribe(new Flow.Subscriber<SpanEvent>() {

				@Override
				public void onSubscribe(Flow.Subscription subscription) {
					subscription.request(Long.MAX_VALUE);
				}

				@Override
				public void onNext(SpanEvent event) {
					if (event instanceof SpanEvent.Started s) {
						var parent = s.span().getParent();
						started.add(s.name() + " in " + (parent == null ? "-" : parent.getName()));
					}
				}

				@Override
				public void onError(Throwable throwable) {}

				@Override
				public void onComplete() {}

			});

			CatalogCommand catalog = new CatalogCommand();
			assertThat(commandLine(catalog, new CountCommand()).execute("count", "--help")).isZero();
			assertThat(catalog.loads).isZero(); // <1>

			assertThat(commandLine(catalog, new CountCommand()).execute("count")).isEqualTo(1);
			assertThat(catalog.loads).isEqualTo(1);
		}
		assertThat(started).containsExactly("count in -", "Load the catalog in count"); // <2>
		// end::lazy[]
	}

	// tag::exporters[]
	public interface Exporter {

		String format();

	}

	@Command(name = "json")
	public static class JsonCommand extends CommandBase implements Exporter {

		@Override
		public String format() {
			return "json";
		}

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			return 0;
		}

	}

	@Command(name = "export")
	public static class ExportCommand extends CommandBase {

		@SubCommand
		List<Exporter> exporters; // <1>

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			spec.commandLine().getOut().print(exporters.stream().map(Exporter::format).toList());
			return 0;
		}

	}
	// end::exporters[]

	@Test
	void subCommandsByType() {
		// tag::sub-commands[]
		assertThat(CommandWiring.acceptsSubCommand(ExportCommand.class, JsonCommand.class)).isTrue();
		assertThat(CommandWiring.acceptsSubCommand(ExportCommand.class, CountCommand.class)).isFalse();

		StringWriter out = new StringWriter();
		CommandLine export = commandLine(new ExportCommand(), new JsonCommand(), new CountCommand());
		export.setOut(new PrintWriter(out, true));
		assertThat(export.execute()).isZero();
		assertThat(out.toString()).isEqualTo("[json]"); // <1>
		// end::sub-commands[]
	}

	// tag::decline[]
	@Command(name = "empty")
	public static class EmptyCommand extends CommandGroup {

		@Adapter
		public ExecutionSupplier<List<EObject>> contents() {
			return null; // Declines
		}

	}
	// end::decline[]

	@Test
	void parentThatDeclines() {
		// tag::declined[]
		CommandLine empty = commandLine(new EmptyCommand(), new CountCommand());
		assertThat(empty.execute("count")).isEqualTo(CommandLine.ExitCode.SOFTWARE); // <1>
		assertThat(empty.execute("count", "--help")).isEqualTo(CommandLine.ExitCode.OK); // <2>
		// end::declined[]
	}

	@Test
	void shellLines() {
		// tag::shell[]
		assertThat(ShellCommand.parseLine("text --value 'Hi there' print", null, null))
			.containsExactly("text", "--value", "Hi there", "print");
		// end::shell[]
	}

}
