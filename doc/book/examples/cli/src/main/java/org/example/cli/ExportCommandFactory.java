package org.example.cli;

import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.cli.SubCommandCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

public class ExportCommandFactory extends SubCommandCapabilityFactory<ExportCommand> {

	@Override
	protected Class<ExportCommand> getCommandType() {
		return ExportCommand.class;
	}

	@Override
	protected Flow.Publisher<ExportCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			Span span,
			Logger logger) {
		return Flows.of(new ExportCommand());
	}

}
