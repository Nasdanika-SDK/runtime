package org.nasdanika.sdk.runtime.cli;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.ParentCommand;

/**
 * A base class for commands which are used for grouping and do not provide 
 * own functionality but may contain options or provide functionality 
 * which can be accessed by 
 * their children via a field annotated with {@link ParentCommand}. 
 * @author Pavel
 *
 */
public abstract class CommandGroup extends CommandBase {
	
	protected CommandGroup() {
		super();
	}

	@Override
	protected Integer execute(Span span, Logger logger) throws Exception {
		throw new ParameterException(spec.commandLine(), "Missing required subcommand");
	}

}
