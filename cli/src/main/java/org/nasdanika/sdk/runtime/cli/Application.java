package org.nasdanika.sdk.runtime.cli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.common.Closeable;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactorySource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;

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
		try (CapabilityFactorySource capabilityFactorySource = CapabilityFactorySource.serviceLoader(moduleLayer)) {
			CapabilityLoader capabilityLoader = CapabilityLoader.of(capabilityFactorySource);
			// Sub-commands, sorting alphabetically
			List<CommandLine> rootCommands = new ArrayList<>();		
			ServiceCapabilityFactory.Requirement<SubCommandRequirement, CommandLine> subCommandRequirement = ServiceCapabilityFactory.createRequirement(
					CommandLine.class, 
					new SubCommandRequirement(Collections.emptyList(), new AtomicInteger()));
			
			for (Object rootCommand: capabilityLoader.loadAll(subCommandRequirement)) {
				if (rootCommand instanceof CommandLine rootCommandLine) {
					rootCommands.add(rootCommandLine);
				}
			}
			
			// Executing the first one
			for (CommandLine rootCommand: rootCommands) {	
				rootCommand.addSubcommand(new ShellCommand(rootCommand));
				int exitCode;
				try {
					exitCode = rootCommand.execute(args);
				} finally {
					if (rootCommand instanceof Closeable closeable) {
						closeable.close();
					}
				}
				System.exit(exitCode);
			}
			
			throw new UnsupportedOperationException("There are no root commands");		
		}
	}

}
