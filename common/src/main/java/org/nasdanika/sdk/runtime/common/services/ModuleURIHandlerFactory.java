package org.nasdanika.sdk.runtime.common.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

public class ModuleURIHandlerFactory {

	public static final String MODULE_SCHEME = "module";

	public static final String MODULE_URL_PREFIX = MODULE_SCHEME + "://";

	public static URIHandler provider() {
			return new URIHandlerImpl() {

				@Override
				public boolean canHandle(URI uri) {
					return uri != null && MODULE_SCHEME.equals(uri.scheme());
				}

				@Override
				public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
					if (MODULE_SCHEME.equals(uri.scheme())) {
						Module targetModule = getClass().getModule().getLayer().findModule(uri.authority()).orElseThrow(() -> new IOException("Module not found: " + uri.authority()));
						return targetModule.getResourceAsStream(uri.path());
					}
					throw new IOException("Cannot handle URI: " + uri);
				}
			
		};
	}

}
