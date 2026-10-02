package org.nasdanika.sdk.runtime.common.services;

import java.util.List;
import java.util.ServiceLoader;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;

/**
 * A service interface for contributing to a resource set.
 * For example, registering an {@link EPackage} or {@link Resource.Factory}.
 */
public interface ResourceSetContributor {
	
	void contribute(ResourceSet resourceSet);
	
	static void configure(ResourceSet resourceSet, ClassLoader loader) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet must not be null");
		}
		
		ServiceLoader<EPackage> ePackageLoader = ServiceLoader.load(EPackage.class, loader);
		for (EPackage ePackage : ePackageLoader) {
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}
		
		ServiceLoader<ResourceSetContributor> sl = ServiceLoader.load(ResourceSetContributor.class, loader);
		for (ResourceSetContributor contributor : sl) {
			contributor.contribute(resourceSet);
		}
	}	
	
	static void configure(ResourceSet resourceSet) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet must not be null");
		}
		
		URIConverter uriConverter = resourceSet.getURIConverter();
		ServiceLoader<URIHandler> uriHandlerLoader = ServiceLoader.load(URIHandler.class);
		for (URIHandler uriHandler : uriHandlerLoader) {
			uriConverter.getURIHandlers().add(0, uriHandler);
		}

		List<AdapterFactory> adapterFactories = resourceSet.getAdapterFactories();
		ServiceLoader<AdapterFactory> adapterFactoryLoader = ServiceLoader.load(AdapterFactory.class);
		for (AdapterFactory adapterFactory : adapterFactoryLoader) {
			adapterFactories.add(adapterFactory);
		}

		ServiceLoader<EPackage> ePackageLoader = ServiceLoader.load(EPackage.class);
		for (EPackage ePackage : ePackageLoader) {
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}
		
		
		ServiceLoader<ResourceSetContributor> sl = ServiceLoader.load(ResourceSetContributor.class);
		for (ResourceSetContributor contributor : sl) {
			contributor.contribute(resourceSet);
		}
	}	

}
