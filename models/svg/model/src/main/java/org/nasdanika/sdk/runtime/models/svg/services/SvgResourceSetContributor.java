package org.nasdanika.sdk.runtime.models.svg.services;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.emf.ContentsHandlingResourceFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Registers a {@link ContentsHandlingResourceFactory} for the {@code svg} extension unless a
 * factory is registered for it already: the contents of {@code .svg} resources are handled by the
 * capabilities of {@link SvgCapabilityFactory} and of other modules, selected by the qualifiers of
 * the file name.
 */
public class SvgResourceSetContributor implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().putIfAbsent(
				SvgCapabilityFactory.QUALIFIER,
				new ContentsHandlingResourceFactory(getCapabilityLoader(), resourceSet));
	}

	/**
	 * @return The loader of contents handlers, the shared service loader one by default
	 */
	protected CapabilityLoader getCapabilityLoader() {
		return CapabilityLoader.getInstance();
	}

}
