package org.nasdanika.sdk.runtime.emf.json;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

public class JsonResourceFactoryContributor implements ResourceSetContributor {

	public static final String JSON_RESOURCE_EXTENSION = "json";

	@Override
	public void contribute(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			JSON_RESOURCE_EXTENSION, 
			new JsonResourceFactory());
	}

}
