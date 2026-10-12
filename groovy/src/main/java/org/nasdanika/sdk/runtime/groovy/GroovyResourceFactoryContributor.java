package org.nasdanika.sdk.runtime.groovy;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.emf.ContentsHandlingResourceFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Registers a {@link ContentsHandlingResourceFactory} for the {@code groovy} extension. Contents are
 * handled by the {@link org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler}
 * capabilities this module provides, selected by the qualifiers of the file name.
 */
public class GroovyResourceFactoryContributor implements ResourceSetContributor {

	public static final String EXTENSION = "groovy";

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EXTENSION, new ContentsHandlingResourceFactory(getCapabilityLoader(), resourceSet));
	}

	/**
	 * @return The loader of contents handlers, the shared service loader one by default
	 */
	protected CapabilityLoader getCapabilityLoader() {
		return CapabilityLoader.getInstance();
	}

}
