package org.nasdanika.sdk.runtime.common.services;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import java.util.ServiceLoader;

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
