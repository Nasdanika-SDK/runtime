package org.nasdanika.sdk.runtime.groovy;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow.Publisher;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Generic DSL for plain {@code .groovy} files: the {@code groovy} qualifier at index 0 with
 * {@code EObject[]} contents. It requests a {@link CompiledScript} from the source handler for the same
 * qualifier, and {@link DslResourceContentsHandler.Factory} and {@link DslResourceContentsHandler.Marker}
 * capabilities for the resource, which the handler delegates element creation and marking to.
 */
public class DslResourceContentsHandlerCapabilityFactory extends ServiceCapabilityFactory<ResourceContentsHandler.Requirement, ResourceContentsHandler<EObject[]>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type)
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& match(handlerRequirement);
	}

	private boolean match(ResourceContentsHandler.Requirement handlerRequirement) {
		return EObject[].class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() == 0
				&& "groovy".equalsIgnoreCase(handlerRequirement.getQualifiers()[0]);
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
				serviceRequirement.getQualifierIndex());

		CompletableFuture<List<ResourceContentsHandler<CompiledScript>>> sourceHandlers = loader.loadAll(ServiceCapabilityFactory.createRequirement(ResourceContentsHandler.class, sourceRequirement));
		CompletableFuture<List<DslResourceContentsHandler.Factory>> factories = loader.loadAll(ServiceCapabilityFactory.createRequirement(DslResourceContentsHandler.Factory.class, resource));
		CompletableFuture<List<DslResourceContentsHandler.Marker>> markers = loader.loadAll(ServiceCapabilityFactory.createRequirement(DslResourceContentsHandler.Marker.class, resource));

		record Hooks(List<DslResourceContentsHandler.Factory> factories, List<DslResourceContentsHandler.Marker> markers) {}
		CompletableFuture<Hooks> hooks = factories.thenCombine(markers, (f, m) -> new Hooks(f.stream().sorted().toList(), m));

		return Flows.fromFuture(sourceHandlers.thenCombine(hooks, (handlers, h) -> {
			List<ResourceContentsHandler<EObject[]>> dslHandlers = handlers
					.stream()
					.<ResourceContentsHandler<EObject[]>>map(sh -> createHandler(resource, sh, h.factories(), h.markers()))
					.toList();
			return CapabilityProvider.of(Flows.fromIterable(dslHandlers));
		}));
	}

	/**
	 * @param factories sorted by priority, highest first
	 */
	protected DslResourceContentsHandler createHandler(
			Resource resource,
			ResourceContentsHandler<CompiledScript> sourceHandler,
			List<DslResourceContentsHandler.Factory> factories,
			List<DslResourceContentsHandler.Marker> markers) {

		return new DslResourceContentsHandler(resource, sourceHandler) {

			@Override
			protected void mark(EObject eObject, EStructuralFeature feature, int line, int col) {
				markers.forEach(m -> m.mark(eObject, feature, line, col));
				super.mark(eObject, feature, line, col);
			}

			@Override
			protected EObject create(EReference eReference, Object value) {
				for (DslResourceContentsHandler.Factory factory: factories) {
					if (factory.canCreate(eReference, value)) {
						return factory.create(eReference, value);
					}
				}
				return super.create(eReference, value);
			}

		};
	}

}
