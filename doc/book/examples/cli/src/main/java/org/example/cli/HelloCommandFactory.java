package org.example.cli;

import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.cli.SubCommandCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

// tag::factory[]
/**
 * Contributes the hello command. The factory is asked once per candidate parent; it creates the
 * command where the declarations of the command and the parent match.
 */
public class HelloCommandFactory extends SubCommandCapabilityFactory<HelloCommand> {

	@Override
	protected Class<HelloCommand> getCommandType() {
		return HelloCommand.class;                                          // <1>
	}

	@Override
	protected Flow.Publisher<HelloCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			Span span,
			Logger logger) {
		return Flows.of(new HelloCommand());                                // <2>
	}

}
// end::factory[]
