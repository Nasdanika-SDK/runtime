package org.nasdanika.sdk.runtime.models.meta.services;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaResource;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaResourceFactory;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Registers a {@link MetaResourceFactory} for the {@code nmeta} extension unless a factory is
 * registered for it already.
 */
public class MetaResourceSetContributor implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent(
				MetaResource.EXTENSION,
				new MetaResourceFactory(resourceSet));
	}

}
