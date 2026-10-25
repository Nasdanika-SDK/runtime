package org.nasdanika.sdk.runtime.models.drawio.services;

import java.util.Map;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.emf.ContentsHandlingResourceFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Registers a {@link ContentsHandlingResourceFactory} for the {@code drawio} extension, and for
 * {@code png} and {@code svg} unless a factory is registered for them already, so that
 * {@code .drawio.png} and {@code .drawio.svg} images load too. The contents are handled by the
 * capabilities of {@link DrawioCapabilityFactory}, selected by the qualifiers of the file name.
 */
public class DrawioResourceSetContributor implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		ContentsHandlingResourceFactory factory = new ContentsHandlingResourceFactory(getCapabilityLoader(), resourceSet);
		Map<String, Object> extensions = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensions.put(DrawioCapabilityFactory.QUALIFIER, factory);
		extensions.putIfAbsent("png", factory);
		extensions.putIfAbsent("svg", factory);
	}

	/**
	 * @return The loader of contents handlers, the shared service loader one by default
	 */
	protected CapabilityLoader getCapabilityLoader() {
		return CapabilityLoader.getInstance();
	}

}
