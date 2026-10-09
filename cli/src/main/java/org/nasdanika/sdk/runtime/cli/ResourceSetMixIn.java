package org.nasdanika.sdk.runtime.cli;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

/**
 * Mixes in a {@link ResourceSet}
 * @author Pavel
 *
 */
public class ResourceSetMixIn {
	
	@Spec(Spec.Target.MIXEE) CommandSpec mixee;	
	
	@Option(
			names = "--extension-resource-factory",
			description = "Maps extension to resource factory class")
    Map<String, Class<?>> extensionResourceFactories;	
	
	@Option(
			names = "--protocol-resource-factory",
			description = "Maps protocol to resource factory class")
    Map<String, Class<?>> protocolResourceFactories;
	
	@Option(
			names = "--content-type-resource-factory",
			description = "Maps content type to resource factory class")
    Map<String, Class<?>> contentTypeResourceFactories;
	
	
	public ResourceSet createResourceSet() {
		return createResourceSet(null);
	}
		
	public ResourceSet createResourceSet(Consumer<ResourceSet> configurator) {		
		NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		configureResourceSet(resourceSet);
		return resourceSet; 
	}
	
	protected void configureResourceSet(ResourceSet resourceSet) {
		if (extensionResourceFactories != null) {
			Map<String, Object> extensionToFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
			for (Entry<String, Class<?>> ee: extensionResourceFactories.entrySet()) {
				try {
					extensionToFactoryMap.put(ee.getKey(), ee.getValue().getDeclaredConstructor().newInstance());
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException	| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					throw new NasdanikaException("Could not instantiate resource factory " + ee.getValue() + ": " + e, e);
				}
			}
		}
		if (protocolResourceFactories != null) {
			Map<String, Object> protocolToFactoryMap = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap();
			for (Entry<String, Class<?>> pe: protocolResourceFactories.entrySet()) {
				try {
					protocolToFactoryMap.put(pe.getKey(), pe.getValue().getDeclaredConstructor().newInstance());
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException	| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					throw new NasdanikaException("Could not instantiate resource factory " + pe.getValue() + ": " + e, e);
				}
			}
		}
		if (contentTypeResourceFactories != null) {
			Map<String, Object> contentTypeToFactoryMap = resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap();
			for (Entry<String, Class<?>> ce: contentTypeResourceFactories.entrySet()) {
				try {
					contentTypeToFactoryMap.put(ce.getKey(), ce.getValue().getDeclaredConstructor().newInstance());
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException	| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					throw new NasdanikaException("Could not instantiate resource factory " + ce.getValue() + ": " + e, e);
				}
			}
		}
	}

}
