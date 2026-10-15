package org.nasdanika.sdk.runtime.cli;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Objects;
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
	 * Matches command to parent using annotations.
	 * @param commandPath
	 * @return
	 */
	protected boolean match(List<CommandLine> commandPath) {
		if (commandPath == null || commandPath.isEmpty()) {
			return false;
		}
		
		CommandLine parent = commandPath.get(commandPath.size() - 1);
		Object userObject = parent.getCommandSpec().userObject();
		if (userObject != null) {
			Class<T> mixInType = getMixInType();
			if (mixInType != null) {
				List<MixIns> mixInsAnnotations = Util.lineage(userObject.getClass())
						.stream()
						.map(c -> c.getAnnotation(MixIns.class))
						.filter(Objects::nonNull)
						.toList();
				for (MixIns mixInsAnnotation: mixInsAnnotations) {
					List<Class<?>> lineage = Util.lineage(mixInType);
					for (Class<?> at: mixInsAnnotation.value()) {
						for (Class<?> le: lineage) {
							if (at.isAssignableFrom(le)) {
								return true;
							}
						}
					}
				}
			}
			
			if (mixInType != null) {
				for (Class<?> le: Util.lineage(mixInType)) {
					ParentCommands parentCommands = le.getAnnotation(ParentCommands.class);
					if (parentCommands != null) {
						for (Class<?> pt: parentCommands.value()) {
							if (Adapters.adapt(userObject, pt) != null) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
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
