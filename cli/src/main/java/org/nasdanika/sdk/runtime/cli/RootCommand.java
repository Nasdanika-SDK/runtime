package org.nasdanika.sdk.runtime.cli;

import picocli.CommandLine.Command;

@Command(
		description= "Nasdanika SDK Command Line Interface" , 
		synopsisSubcommandLabel = "COMMAND", 
		name="nsdk", 
		mixinStandardHelpOptions = true,
		versionProvider = ModuleVersionProvider.class,
		subcommands = {
			LauncherCommand.class	
		})
public class RootCommand {


}
