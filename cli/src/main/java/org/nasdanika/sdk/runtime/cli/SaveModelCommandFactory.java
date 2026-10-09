package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.Flow.Publisher;

import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

public class SaveModelCommandFactory extends SubCommandCapabilityFactory<SaveModelCommand> {

	@Override
	protected Class<SaveModelCommand> getCommandType() {
		return SaveModelCommand.class;
	}
	
	@Override
	protected Publisher<SaveModelCommand> doCreateCommand(
			List<CommandLine> parentPath, 
			Loader loader, 
			Span span,
			Logger logger) {
		return Flows.of(new SaveModelCommand());
	}

}
