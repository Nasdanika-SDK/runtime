package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import org.nasdanika.sdk.runtime.common.Closeable;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.logs.Logger;
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
				
		AttributesBuilder attrBuidler = Attributes.builder();
		attrBuidler.put("qualifiedName", spec.qualifiedName());
		attrBuidler.put("commandClass", getClass().getName());
		attrBuidler.put("commandModule", getClass().getModule().getName());
		getClass().getModule().getDescriptor().version().ifPresent(v ->	attrBuidler.put("commandModuleVersion", v.toString()));
		
		return Telemetry.inSpan(tracer, spec.name(), attrBuidler.build(), span -> execute(span, logger));
	}
	
	protected abstract Integer execute(Span span, Logger logger) throws Exception;
	
	/**
	 * Closes all mix-ins and sub-commands implementing {@link Closeable}
	 */
	@Override
	public void close() {
		if (spec != null) {
			List<Entry<String, CommandLine>> closeableSubCommands = spec
					.subcommands()
					.entrySet()
					.stream()
					.filter(e -> e.getValue().getCommandSpec().userObject() instanceof Closeable)
					.toList();
			
			List<Entry<String, CommandSpec>> closeableMixIns= spec
					.mixins()
					.entrySet()
					.stream()
					.filter(e -> e.getValue().userObject() instanceof Closeable)
					.toList();
			
			int size = closeableSubCommands.size() + closeableMixIns.size();
			if (size > 0) {
				for (Entry<String, CommandLine> subCommandEntry: closeableSubCommands) {
					Object userObject = subCommandEntry.getValue().getCommandSpec().userObject();
					((Closeable) userObject).close();
				}
				for (Entry<String, CommandSpec> mixInEntry: closeableMixIns) {
					Object userObject = mixInEntry.getValue().userObject();
					((Closeable) userObject).close();
				}
			}
		}		
	}

}
