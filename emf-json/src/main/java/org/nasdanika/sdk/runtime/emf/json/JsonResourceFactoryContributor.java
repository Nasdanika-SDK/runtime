package org.nasdanika.sdk.runtime.emf.json;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

public class JsonResourceFactoryContributor implements ResourceSetContributor {

	public static final String JSON_RESOURCE_EXTENSION = "json";

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			JSON_RESOURCE_EXTENSION, 
			new TelemetryJsonResourceFactory(resourceSet));
	}

}
