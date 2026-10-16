package org.example.capability;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.emf.ContentsHandlingResourceFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

// tag::csv-contributor[]
/**
 * Registers a factory for the csv extension whose resources find their contents handler
 * as a capability. The registration is a plain service (a lookup by extension); the
 * handler is a capability (a requirement the providers interpret).
 */
public class CsvContributor implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		CapabilityLoader loader = CapabilityLoader.getInstance();
		var factory = new ContentsHandlingResourceFactory(loader, resourceSet);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("csv", factory);
	}

}
// end::csv-contributor[]
