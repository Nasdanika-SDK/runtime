package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.swing.ProgressMonitor;

import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;

import picocli.CommandLine;

public class InvokeCommandFactory extends SubCommandCapabilityFactory<InvokeCommand> {

	@Override
	protected Class<InvokeCommand> getCommandType() {
		return InvokeCommand.class;
	}
	
	@Override
	protected CompletionStage<InvokeCommand> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			ProgressMonitor progressMonitor) {
		return CompletableFuture.completedStage(new InvokeCommand(loader.getCapabilityLoader()));
	}

}
