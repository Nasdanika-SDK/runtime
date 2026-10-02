package org.nasdanika.sdk.runtime.emf.json;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emfcloud.jackson.module.EMFModule;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YmlResourceFactoryContributor implements ResourceSetContributor {

	public static final String YML_RESOURCE_EXTENSION = "yml";

	@Override
	public void contribute(ResourceSet resourceSet) {		
		ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
        yamlMapper.registerModule(new EMFModule());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			YML_RESOURCE_EXTENSION, 
			new TelemetryJsonResourceFactory(resourceSet, yamlMapper));
	}

}
