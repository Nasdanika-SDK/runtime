package org.nasdanika.sdk.runtime.common.services;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class XMIResourceFactoryContributor implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_EXTENSION, 
			new XMIResourceFactoryImpl());
	}

}
