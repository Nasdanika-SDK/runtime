package org.nasdanika.sdk.runtime.models.svg.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.models.svg.Svg;

/**
 * Loads and saves {@code .svg} files with {@link SvgFormat}. The contents of a resource is its
 * root {@link Svg} element.
 */
public class SvgResourceContentsHandler implements ResourceContentsHandler<EObject[]> {

	private final URI uri;

	public SvgResourceContentsHandler(URI uri) {
		this.uri = uri;
	}

	@Override
	public Order getOrder() {
		return Order.of(0);
	}

	@Override
	public EObject[] load(InputStream inputStream, Map<?, ?> options) throws IOException {
		return new EObject[] { SvgFormat.load(inputStream, uri) };
	}

	@Override
	public void save(EObject[] contents, OutputStream outputStream, Map<?, ?> options) throws IOException {
		if (contents.length != 1 || !(contents[0] instanceof Svg svg)) {
			throw new IOException("An SVG resource contains one svg element: " + uri);
		}
		SvgFormat.save(svg, outputStream);
	}

}
