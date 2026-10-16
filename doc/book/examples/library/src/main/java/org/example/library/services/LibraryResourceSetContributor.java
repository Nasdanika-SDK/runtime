package org.example.library.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;

// tag::contributor[]
/**
 * Gives libraries a file extension of their own: {@code catalog.library} is XMI,
 * loaded and saved in spans like every resource the runtime creates.
 */
public class LibraryResourceSetContributor implements ResourceSetContributor {

	public static final String EXTENSION = "library";

	@Override
	public void contribute(ResourceSet resourceSet, Span span, Logger logger) { // <1>
		Map<String, Object> factories =
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		factories.put(EXTENSION, new XMIResourceFactoryImpl() {

			@Override
			public Resource createResource(URI uri) {
				return ResourceTelemetry.created(resourceSet, new XMIResourceImpl(uri) { // <2>

					@Override
					public void doLoad(InputStream in, Map<?, ?> options) throws IOException {
						ResourceTelemetry.load(this, in, s -> super.doLoad(s, options));
					}

					@Override
					public void doSave(OutputStream out, Map<?, ?> options) throws IOException {
						ResourceTelemetry.save(this, out, s -> super.doSave(s, options));
					}

				});
			}

		});
		span.setAttribute("library.extension", EXTENSION);                          // <3>
		Telemetry.log(logger, Severity.DEBUG, null, "Registered ." + EXTENSION, null);
	}

}
// end::contributor[]
