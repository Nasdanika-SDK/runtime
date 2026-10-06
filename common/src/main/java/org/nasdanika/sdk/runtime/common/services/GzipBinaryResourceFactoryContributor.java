package org.nasdanika.sdk.runtime.common.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Gzipped binary resources, with {@link ResourceTelemetry} spans for load, save and unload. The
 * byte counts are of the compressed stream.
 */
public class GzipBinaryResourceFactoryContributor implements ResourceSetContributor {

	public static final String GZIP_BINARY_RESOURCE_EXTENSION = "egz";

	@Override
	public void contribute(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(GZIP_BINARY_RESOURCE_EXTENSION, new Resource.Factory() {
			@Override
			public Resource createResource(URI uri) {
				return ResourceTelemetry.created(resourceSet, new BinaryResourceImpl(uri) {
					
					@Override
					protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
						ResourceTelemetry.load(this, inputStream, in -> {
							try (InputStream gzIn = new GZIPInputStream(in)) {
								super.doLoad(gzIn, options);
							}
						});
					}
					
					@Override
					protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
						ResourceTelemetry.save(this, outputStream, out -> {
							try (OutputStream gzOut = new GZIPOutputStream(out)) {
								super.doSave(gzOut, options);
							}
						});
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
