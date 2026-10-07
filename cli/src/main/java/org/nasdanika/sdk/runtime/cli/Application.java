package org.nasdanika.sdk.runtime.cli;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.LoggerProgressMonitor;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.osgi.service.log.LoggerFactory;

import picocli.CommandLine;

/**
 * Nasdanika command line application.
 * Collects sub-commands for the {@link RootCommand} using the capability framework
 */
public class Application {

	public static void main(String[] args) {
		execute(Application.class.getModule().getLayer(), args);
	}
	
	public static void execute(ModuleLayer moduleLayer, String[] args) {
		CapabilityLoader capabilityLoader = new CapabilityLoader(moduleLayer);

		// Sub-commands, sorting alphabetically
		List<CommandLine> rootCommands = new ArrayList<>();		
		Requirement<SubCommandRequirement, CommandLine> subCommandRequirement = ServiceCapabilityFactory.createRequirement(CommandLine.class, null,  new SubCommandRequirement(Collections.emptyList(), new AtomicInteger()));
		for (CapabilityProvider<Object> cp: capabilityLoader.load(subCommandRequirement, progressMonitor)) {
			cp.getPublisher().filter(Objects::nonNull).collectList().block().forEach(cmd -> rootCommands.add((CommandLine) cmd));
		}
		
		// Executing the first one
		for (CommandLine rootCommand: rootCommands) {	
			rootCommand.addSubcommand(new ShellCommand(rootCommand));
			int exitCode;
			try {
				exitCode = rootCommand.execute(args);
			} finally {
				if (rootCommand instanceof Closeable) {
					((Closeable) rootCommand).close(progressMonitor.split("Closing root command", 1));
				}
			}
			System.exit(exitCode);
		}
		
		throw new UnsupportedOperationException("There are no root commands");		
	}

}
