package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.swing.ProgressMonitor;

import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;

import picocli.CommandLine;

public class HelpCommandFactory extends SubCommandCapabilityFactory<HelpCommand> {

	@Override
	protected CompletionStage<HelpCommand> doCreateCommand(
			List<CommandLine> parentPath, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new HelpCommand(parentPath.get(parentPath.size() - 1)));			
	}

	@Override
	protected Class<HelpCommand> getCommandType() {
		return HelpCommand.class;
	}

}
