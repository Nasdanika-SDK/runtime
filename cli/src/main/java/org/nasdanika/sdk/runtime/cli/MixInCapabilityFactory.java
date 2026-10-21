package org.nasdanika.sdk.runtime.cli;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.Flow.Publisher;

import org.nasdanika.sdk.runtime.common.Adapters;
import org.nasdanika.sdk.runtime.common.Util;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

/**
 * Base class for MixIn factories.
 */
public abstract class MixInCapabilityFactory<T> extends ReflectiveCapabilityFactory {

	protected MixInCapabilityFactory() {
		super(MethodHandles.lookup());
	}

	/**
	 * Mix-ins for the last command of the path, named {@link #getName()}.
	 */
	@Capability
	public Publisher<MixInRecord> mixIns(
			MixInRequirement requirement,
			Loader loader,
			Span span,
			Logger logger) {

		Publisher<T> mixInPublisher = createMixIn(requirement.commandPath(), loader, span, logger);
		return mixInPublisher == null ? null : Flows.map(mixInPublisher, mixIn -> new MixInRecord(getName(), mixIn));
	}
	
	protected abstract String getName();
	
	protected abstract Class<T> getMixInType();
	
	/**
	 * Matches the mix-in to the command it would be mixed into, by declarations: the command accepts
	 * it through a {@link MixIns} member, by generic type, or its class's {@link MixIns} annotation
	 * lists a type the mix-in is adaptable to, or the mix-in takes the command through a
	 * {@link Parent} member. See {@link CommandWiring}.
	 */
	protected boolean match(List<CommandLine> commandPath) {
		if (commandPath == null || commandPath.isEmpty()) {
			return false;
		}
		Object command = commandPath.get(commandPath.size() - 1).getCommandSpec().userObject();
		Class<T> mixInType = getMixInType();
		if (command == null || mixInType == null) {
			return false;
		}
		for (Class<?> commandClass: Util.lineage(command.getClass())) {
			MixIns mixIns = commandClass.getAnnotation(MixIns.class);
			if (mixIns != null) {
				for (Class<?> accepted: mixIns.value()) {
					if (Adapters.isAdaptable(mixInType, accepted)) {
						return true;
					}
				}
			}
		}
		return CommandWiring.acceptsMixIn(command.getClass(), mixInType) || CommandWiring.acceptsParent(mixInType, command.getClass());
	}
	
	protected Publisher<T> createMixIn(
			List<CommandLine> commandPath, 
			Loader loader, 
			Span span, 
			Logger logger) {		
		return match(commandPath) ? doCreateMixIn(commandPath, loader, span, logger) : null;
	}

	protected abstract Publisher<T> doCreateMixIn(
			List<CommandLine> commandPath, 
			Loader loader, 
			Span span, 
			Logger logger);
	
}
