package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.swing.ProgressMonitor;

import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;

import picocli.CommandLine;

public class SaveDocumentCommandFactory extends SubCommandCapabilityFactory<SaveDocumentCommand> {

	@Override
	protected Class<SaveDocumentCommand> getCommandType() {
		return SaveDocumentCommand.class;
	}
	
	@Override
	protected CompletionStage<SaveDocumentCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new SaveDocumentCommand(loader.getCapabilityLoader()));
	}

}
