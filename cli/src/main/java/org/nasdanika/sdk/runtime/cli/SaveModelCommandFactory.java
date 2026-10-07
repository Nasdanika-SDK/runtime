package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.swing.ProgressMonitor;

import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;

import picocli.CommandLine;

public class SaveModelCommandFactory extends SubCommandCapabilityFactory<SaveModelCommand> {

	@Override
	protected Class<SaveModelCommand> getCommandType() {
		return SaveModelCommand.class;
	}
	
	@Override
	protected CompletionStage<SaveModelCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new SaveModelCommand(loader.getCapabilityLoader()));
	}

}
