package org.nasdanika.sdk.runtime.groovy;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow.Publisher;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Ecore DSL: the {@code ecore} qualifier to the left of a {@code .groovy} source qualifier
 * (e.g. {@code family.ecore.groovy}). It requests a {@link CompiledScript} from the source handler one
 * qualifier to the right and binds the DSL to {@code EcorePackage}.
 */
public class EcoreResourceContentsHandlerCapabilityFactory extends ServiceCapabilityFactory<ResourceContentsHandler.Requirement, ResourceContentsHandler<EObject[]>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type)
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& EObject[].class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() > 0
				&& "ecore".equalsIgnoreCase(handlerRequirement.getQualifiers()[handlerRequirement.getQualifierIndex()]);
	}

	@Override
	protected Publisher<CapabilityProvider<ResourceContentsHandler<EObject[]>>> createService(
			Class<ResourceContentsHandler<EObject[]>> serviceType,
			ResourceContentsHandler.Requirement serviceRequirement,
			Loader loader,
			Span span,
			Logger logger) {

		Resource resource = serviceRequirement.getResource();
		ResourceContentsHandler.Requirement sourceRequirement = ResourceContentsHandler.createRequirement(
				resource,
				CompiledScript.class,
				serviceRequirement.getQualifiers(),
				serviceRequirement.getQualifierIndex() - 1);

		CompletableFuture<List<ResourceContentsHandler<CompiledScript>>> sourceHandlers = loader.loadAll(ServiceCapabilityFactory.createRequirement(ResourceContentsHandler.class, sourceRequirement));
		return Flows.fromFuture(sourceHandlers.thenApply(handlers -> {
			List<ResourceContentsHandler<EObject[]>> dslHandlers = handlers
					.stream()
					.<ResourceContentsHandler<EObject[]>>map(sh -> createHandler(resource, sh))
					.toList();
			return CapabilityProvider.of(Flows.fromIterable(dslHandlers));
		}));
	}

	protected EcoreResourceContentsHandler createHandler(Resource resource, ResourceContentsHandler<CompiledScript> sourceHandler) {
		return new EcoreResourceContentsHandler(resource, sourceHandler);
	}

}
