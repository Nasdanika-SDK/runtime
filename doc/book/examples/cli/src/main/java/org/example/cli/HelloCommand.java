package org.example.cli;

import org.nasdanika.sdk.runtime.cli.CommandBase;
import org.nasdanika.sdk.runtime.cli.Parent;
import org.nasdanika.sdk.runtime.cli.RootCommand;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

// tag::hello[]
@Command(
		name = "hello",
		description = "Says hello",
		mixinStandardHelpOptions = true)
public class HelloCommand extends CommandBase {                         // <1>

	@Parent
	private RootCommand root;                                           // <2>

	@Option(names = "--name", defaultValue = "World", description = "Whom to greet")
	private String name;

	@Override
	protected Integer execute(Span span, Logger logger, Meter meter) { // <3>
		span.setAttribute("greeting.name", name);
		Telemetry.log(logger, Severity.INFO, null, "Greeting " + name, null);
		spec.commandLine().getOut().println("Hello, " + name + "!");
		return 0;
	}

}
// end::hello[]
