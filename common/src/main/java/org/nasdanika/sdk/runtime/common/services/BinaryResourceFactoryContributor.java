package org.nasdanika.sdk.runtime.common.services;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;

public class BinaryResourceFactoryContributor implements ResourceSetContributor {

	public static final String BINARY_RESOURCE_EXTENSION = "ebin";

	@Override
	public void contribute(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(BINARY_RESOURCE_EXTENSION, new Resource.Factory() {
			@Override
			public Resource createResource(URI uri) {
				return new BinaryResourceImpl(uri);
			}
		});
	}

}
