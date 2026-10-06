package org.nasdanika.sdk.runtime.common.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * XMI for the default extension, with {@link ResourceTelemetry} spans for load, save and unload.
 */
public class XMIResourceFactoryContributor implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_EXTENSION, 
			new XMIResourceFactoryImpl() {
				
				@Override
				public Resource createResource(URI uri) {
					return ResourceTelemetry.created(resourceSet, new XMIResourceImpl(uri) {
						
						@Override
						public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
							ResourceTelemetry.load(this, inputStream, in -> super.doLoad(in, options));
						}
						
						@Override
						public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
							ResourceTelemetry.save(this, outputStream, out -> super.doSave(out, options));
						}
						
						@Override
						protected void doUnload() {
							ResourceTelemetry.unload(this, super::doUnload);
						}
						
					});
				}
				
			});
	}

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) {
		throw new UnsupportedOperationException("Should not be called, use contribute(ResourceSet) instead");
		
	}

}
