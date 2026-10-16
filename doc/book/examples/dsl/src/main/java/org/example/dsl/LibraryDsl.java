package org.example.dsl;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.flow.Flows;

// tag::factory[]
/**
 * Serves files named *.library.groovy: the library qualifier, with the groovy source to its
 * right.
 */
public class LibraryDsl extends ReflectiveCapabilityFactory {

	public LibraryDsl() {
		super(MethodHandles.lookup());
	}

	@Capability
	public Flow.Publisher<ResourceContentsHandler<EObject[]>> library(
			ResourceContentsHandler.Requirement requirement,
			Loader loader) {
		int index = requirement.getQualifierIndex();
		if (!EObject[].class.equals(requirement.getContentsType())
				|| index <= 0 // A source must be to the right
				|| !"library".equalsIgnoreCase(requirement.getQualifiers()[index])) {
			return null;                                                        // <1>
		}

		Resource resource = requirement.getResource();
		var source = ResourceContentsHandler.createRequirement(                 // <2>
				resource,
				CompiledScript.class,
				requirement.getQualifiers(),
				index - 1);
		CompletableFuture<List<ResourceContentsHandler<CompiledScript>>> sources =
				loader.loadAll(Requirement.of(ResourceContentsHandler.class, source));

		CompletableFuture<List<ResourceContentsHandler<EObject[]>>> handlers = sources
				.thenApply(list -> list.stream().map(s -> dsl(resource, s)).toList()); // <3>
		return Flows.concatMap(Flows.fromFuture(handlers), Flows::fromIterable);
	}

	private static ResourceContentsHandler<EObject[]> dsl(
			Resource resource,
			ResourceContentsHandler<CompiledScript> source) {
		return new LibraryDslHandler(resource, source);
	}

}
// end::factory[]
