package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.Flow.Publisher;

import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

public class RootCommandFactory extends SubCommandCapabilityFactory<RootCommand> {
	
	@Override
	protected Publisher<RootCommand> createCommand(
			List<CommandLine> parentPath, 
			Loader loader, 
			Span span,
			Logger logger) {
		return parentPath == null || parentPath.isEmpty() ? Flows.of(new RootCommand()) : Flows.empty();
	}

	@Override
	protected Class<RootCommand> getCommandType() {
		return RootCommand.class;
	}

}
