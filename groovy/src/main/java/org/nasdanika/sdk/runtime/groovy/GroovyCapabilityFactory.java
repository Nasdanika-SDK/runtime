package org.nasdanika.sdk.runtime.groovy;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.flow.Flows;

/**
 * The resource contents handlers this module contributes, one {@link Capability} method each. All
 * three answer a requirement for {@link ResourceContentsHandler} with a
 * {@link ResourceContentsHandler.Requirement} payload, and decline, by returning null, the
 * qualifiers that are not theirs.
 */
public class GroovyCapabilityFactory extends ReflectiveCapabilityFactory {

	public GroovyCapabilityFactory() {
		super(MethodHandles.lookup());
	}

	/**
	 * {@link CompiledScriptResourceContentsHandler} for the {@code groovy} qualifier at index 0: the
	 * source handler the DSL handlers evaluate.
	 */
	@Capability
	public ResourceContentsHandler<CompiledScript> compiledScript(ResourceContentsHandler.Requirement requirement) {
		if (CompiledScript.class.equals(requirement.getContentsType())
				&& requirement.getQualifierIndex() == 0
				&& "groovy".equalsIgnoreCase(requirement.getQualifiers()[0])) {
			return new CompiledScriptResourceContentsHandler(requirement.getResource());
		}
		return null;
	}

	/**
	 * Generic DSL for plain {@code .groovy} files: the {@code groovy} qualifier at index 0 with
	 * {@code EObject[]} contents. It requests a {@link CompiledScript} from the source handler for the
	 * same qualifier, and {@link DslResourceContentsHandler.Factory} and
	 * {@link DslResourceContentsHandler.Marker} capabilities for the resource, which the handler
	 * delegates element creation and marking to.
	 */
	@Capability
	public Flow.Publisher<ResourceContentsHandler<EObject[]>> dsl(ResourceContentsHandler.Requirement requirement, Loader loader) {
		if (!EObject[].class.equals(requirement.getContentsType())
				|| requirement.getQualifierIndex() != 0
				|| !"groovy".equalsIgnoreCase(requirement.getQualifiers()[0])) {
			return null;
		}

		Resource resource = requirement.getResource();
		CompletableFuture<List<ResourceContentsHandler<CompiledScript>>> sourceHandlers = loader.loadAll(sourceRequirement(requirement, requirement.getQualifierIndex()));
		CompletableFuture<List<DslResourceContentsHandler.Factory>> factories = loader.loadAll(Requirement.of(DslResourceContentsHandler.Factory.class, resource));
		CompletableFuture<List<DslResourceContentsHandler.Marker>> markers = loader.loadAll(Requirement.of(DslResourceContentsHandler.Marker.class, resource));

		record Hooks(List<DslResourceContentsHandler.Factory> factories, List<DslResourceContentsHandler.Marker> markers) {}
		CompletableFuture<Hooks> hooks = factories.thenCombine(markers, (f, m) -> new Hooks(f.stream().sorted().toList(), m));

		CompletableFuture<List<ResourceContentsHandler<EObject[]>>> dslHandlers = sourceHandlers.thenCombine(hooks, (handlers, h) -> handlers
				.stream()
				.<ResourceContentsHandler<EObject[]>>map(sh -> createDslHandler(resource, sh, h.factories(), h.markers()))
				.toList());
		return Flows.concatMap(Flows.fromFuture(dslHandlers), Flows::fromIterable);
	}

	/**
	 * Ecore DSL: the {@code ecore} qualifier to the left of a {@code .groovy} source qualifier (e.g.
	 * {@code family.ecore.groovy}). It requests a {@link CompiledScript} from the source handler one
	 * qualifier to the right and binds the DSL to {@code EcorePackage}.
	 */
	@Capability
	public Flow.Publisher<ResourceContentsHandler<EObject[]>> ecore(ResourceContentsHandler.Requirement requirement, Loader loader) {
		if (!EObject[].class.equals(requirement.getContentsType())
				|| requirement.getQualifierIndex() <= 0
				|| !"ecore".equalsIgnoreCase(requirement.getQualifiers()[requirement.getQualifierIndex()])) {
			return null;
		}

		Resource resource = requirement.getResource();
		CompletableFuture<List<ResourceContentsHandler<CompiledScript>>> sourceHandlers = loader.loadAll(sourceRequirement(requirement, requirement.getQualifierIndex() - 1));
		CompletableFuture<List<ResourceContentsHandler<EObject[]>>> ecoreHandlers = sourceHandlers.thenApply(handlers -> handlers
				.stream()
				.<ResourceContentsHandler<EObject[]>>map(sh -> createEcoreHandler(resource, sh))
				.toList());
		return Flows.concatMap(Flows.fromFuture(ecoreHandlers), Flows::fromIterable);
	}

	/**
	 * A requirement for the {@link CompiledScript} source handler of the qualifier at an index.
	 */
	protected Requirement sourceRequirement(ResourceContentsHandler.Requirement requirement, int qualifierIndex) {
		return Requirement.of(
				ResourceContentsHandler.class,
				ResourceContentsHandler.createRequirement(
						requirement.getResource(),
						CompiledScript.class,
						requirement.getQualifiers(),
						qualifierIndex));
	}

	/**
	 * @param factories sorted by priority, highest first
	 */
	protected DslResourceContentsHandler createDslHandler(
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

	protected EcoreResourceContentsHandler createEcoreHandler(Resource resource, ResourceContentsHandler<CompiledScript> sourceHandler) {
		return new EcoreResourceContentsHandler(resource, sourceHandler);
	}

}
