package org.nasdanika.sdk.runtime.cli;

import java.util.concurrent.Callable;

import org.nasdanika.sdk.runtime.common.Closeable;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

/**
 * Base class for Nasdanika SDK CLI commands
 * @author Pavel
 *
 */
@Command(mixinStandardHelpOptions = true)
public abstract class CommandBase implements Callable<Integer>, Closeable {
		
	@Spec
	protected CommandSpec spec;
	
	@Override
	public Integer call() throws Exception {
		OpenTelemetry otel = Telemetry.current();
		Tracer tracer = Telemetry.tracer(otel);
		Logger logger = Telemetry.logger(otel);
		Meter meter = Telemetry.meter(otel);
				
		AttributesBuilder attrBuidler = Attributes.builder();
		attrBuidler.put("qualifiedName", spec.qualifiedName());
		attrBuidler.put("commandClass", getClass().getName());
		attrBuidler.put("commandModule", getClass().getModule().getName());
		getClass().getModule().getDescriptor().version().ifPresent(v ->	attrBuidler.put("commandModuleVersion", v.toString()));
		
		return Telemetry.inSpan(tracer, spec.name(), attrBuidler.build(), span -> execute(span, logger, meter));
	}
	
	protected abstract Integer execute(Span span, Logger logger, Meter meter) throws Exception;
	
	/**
	 * Closes the command's sub-commands and mix-ins, see {@link #closeSubCommandsAndMixIns(CommandSpec)}.
	 */
	@Override
	public void close() {
		closeSubCommandsAndMixIns(spec);
	}

	/**
	 * Closes a command line: its command if it implements {@link Closeable}, which closes what it
	 * holds, and otherwise its sub-commands and mix-ins. What an application calls when a run is over.
	 */
	public static void close(CommandLine commandLine) {
		if (commandLine != null) {
			if (commandLine.getCommandSpec().userObject() instanceof Closeable closeable) {
				closeable.close();
			} else {
				closeSubCommandsAndMixIns(commandLine.getCommandSpec());
			}
		}
	}

	/**
	 * Closes the sub-commands of a command, the whole tree below it, and its mix-ins that implement
	 * {@link Closeable}. A sub-command implementing {@link Closeable} is closed, and closes its own;
	 * the sub-commands and mix-ins of one that does not are closed here, so that a plain picocli
	 * command in the tree does not keep the commands below it open.
	 */
	public static void closeSubCommandsAndMixIns(CommandSpec spec) {
		if (spec == null) {
			return;
		}
		for (CommandLine subCommand: spec.subcommands().values()) {
			close(subCommand);
		}
		for (CommandSpec mixIn: spec.mixins().values()) {
			if (mixIn.userObject() instanceof Closeable closeable) {
				closeable.close();
			}
		}
	}

}
