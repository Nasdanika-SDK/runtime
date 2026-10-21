package org.nasdanika.sdk.runtime.groovy.tests.book;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.flow.Flows;

// tag::factory[]
/**
 * Contents handlers for files with the {@code rules} qualifier: {@code orders.rules.groovy}.
 */
public class RulesCapabilityFactory extends ReflectiveCapabilityFactory {

	private final EPackage metamodel;

	public RulesCapabilityFactory(EPackage metamodel) {
		super(MethodHandles.lookup());
		this.metamodel = metamodel;
	}

	@Capability
	public Flow.Publisher<ResourceContentsHandler<EObject[]>> rules(
			ResourceContentsHandler.Requirement requirement, // <1>
			Loader loader) {

		int index = requirement.getQualifierIndex();
		if (!EObject[].class.equals(requirement.getContentsType())
				|| index <= 0
				|| !"rules".equals(requirement.getQualifiers()[index])) { // <2>
			return null;
		}

		Resource resource = requirement.getResource();
		ResourceContentsHandler.Requirement script = ResourceContentsHandler.createRequirement(
				resource,
				CompiledScript.class,
				requirement.getQualifiers(),
				index - 1); // <3>
		CompletableFuture<List<ResourceContentsHandler<CompiledScript>>> sources =
				loader.loadAll(Requirement.of(ResourceContentsHandler.class, script));

		CompletableFuture<List<ResourceContentsHandler<EObject[]>>> handlers = sources
				.thenApply(list -> list
					.stream()
					.<ResourceContentsHandler<EObject[]>>map(source ->
						new RulesResourceContentsHandler(resource, source, metamodel)) // <4>
					.toList());
		return Flows.concatMap(Flows.fromFuture(handlers), Flows::fromIterable);
	}

}
// end::factory[]
