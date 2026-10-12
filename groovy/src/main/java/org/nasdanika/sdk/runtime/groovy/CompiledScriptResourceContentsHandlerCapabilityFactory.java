package org.nasdanika.sdk.runtime.groovy;

import java.util.concurrent.Flow.Publisher;

import javax.script.CompiledScript;

import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Provides {@link CompiledScriptResourceContentsHandler} for the {@code groovy} qualifier at index 0,
 * the source handler the DSL handlers evaluate.
 */
public class CompiledScriptResourceContentsHandlerCapabilityFactory extends ServiceCapabilityFactory<ResourceContentsHandler.Requirement, ResourceContentsHandler<CompiledScript>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type)
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& match(handlerRequirement);
	}

	private boolean match(ResourceContentsHandler.Requirement handlerRequirement) {
		return CompiledScript.class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() == 0
				&& "groovy".equalsIgnoreCase(handlerRequirement.getQualifiers()[0]);
	}

	@Override
	protected Publisher<CapabilityProvider<ResourceContentsHandler<CompiledScript>>> createService(
			Class<ResourceContentsHandler<CompiledScript>> serviceType,
			ResourceContentsHandler.Requirement serviceRequirement,
			Loader loader, Span span, Logger logger) {

		return Flows.of(CapabilityProvider.of(new CompiledScriptResourceContentsHandler(serviceRequirement.getResource())));
	}

}
