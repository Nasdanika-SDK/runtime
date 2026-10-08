package org.nasdanika.sdk.runtime.cli;

import java.util.function.Supplier;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;

@Command(
		description = "Exits shell",
		name = "exit",
		versionProvider = ModuleVersionProvider.class)
public class ExitCommand extends CommandBase implements Supplier<Boolean> {
	
	private boolean value;
	
	public Boolean get() {
		return value;
	}
	
	@Override
	protected Integer execute(Span span, Logger logger) throws Exception {
		value = true;
		return 0;
	}

}
