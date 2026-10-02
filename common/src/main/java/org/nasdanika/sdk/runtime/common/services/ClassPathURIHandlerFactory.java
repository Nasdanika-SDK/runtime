package org.nasdanika.sdk.runtime.common.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

public class ClassPathURIHandlerFactory {

	public static final String CLASSPATH_SCHEME = "classpath";

	public static final String CLASSPATH_URL_PREFIX = CLASSPATH_SCHEME + "://";

	public static URIHandler provider() {
		return new URIHandlerImpl() {

			@Override
			public boolean canHandle(URI uri) {
				return uri != null && CLASSPATH_SCHEME.equals(uri.scheme());
			}

			@Override
			public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
				if (CLASSPATH_SCHEME.equals(uri.scheme())) {
					String resource = uri.toString().substring(CLASSPATH_URL_PREFIX.length());
			        ClassLoader cl = Thread.currentThread().getContextClassLoader();		
					return Objects.requireNonNull(cl.getResourceAsStream(resource), "ClassLoader resource not found: " + resource);
				}
				throw new IOException("Cannot handle URI: " + uri);
			}
			
		};
	}
	
}
