package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.swing.ProgressMonitor;

import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;

import picocli.CommandLine;

public class RootCommandFactory extends SubCommandCapabilityFactory<RootCommand> {

	@Override
	protected CompletionStage<RootCommand> createCommand(
			List<CommandLine> parentPath, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		return parentPath == null || parentPath.isEmpty() ? CompletableFuture.completedStage(new RootCommand()) : null;
	}

	@Override
	protected Class<RootCommand> getCommandType() {
		return RootCommand.class;
	}

}
