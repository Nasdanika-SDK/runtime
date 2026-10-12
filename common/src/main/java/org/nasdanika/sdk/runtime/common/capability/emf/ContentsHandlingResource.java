package org.nasdanika.sdk.runtime.common.capability.emf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;

/**
 * Loads and saves its contents with a {@link ResourceContentsHandler} obtained from a
 * {@link CapabilityLoader}. The last segment of the URI is split on dots into qualifiers, read
 * right to left: {@code family.ecore.groovy} has the qualifiers {@code groovy} and {@code ecore}.
 * Handlers are requested for the leftmost qualifier first, so the most specific one wins, and among
 * the handlers for a qualifier the one with the smallest {@link ResourceContentsHandler.Order}.
 *
 * <p>
 * The handler is resolved on the first load or save, inside the {@code Resource.load} or
 * {@code Resource.save} span, and kept for the lifetime of the resource, so a handler can carry
 * state from load to save.
 */
public class ContentsHandlingResource extends ResourceImpl {

	private final CapabilityLoader capabilityLoader;
	private ResourceContentsHandler<EObject[]> resourceContentsHandler;
	private boolean resolved;

	public ContentsHandlingResource(URI uri, CapabilityLoader capabilityLoader) {
		super(uri);
		this.capabilityLoader = capabilityLoader;
	}

	/**
	 * @return The handler, or null if there is none for the URI
	 */
	public ResourceContentsHandler<EObject[]> getResourceContentsHandler() {
		if (!resolved) {
			resourceContentsHandler = resolveResourceContentsHandler();
			resolved = true;
		}
		return resourceContentsHandler;
	}

	@SuppressWarnings("rawtypes")
	protected ResourceContentsHandler<EObject[]> resolveResourceContentsHandler() {
		String lastSegment = getURI() == null ? null : getURI().lastSegment();
		if (lastSegment == null || lastSegment.isBlank()) {
			return null;
		}
		String[] qualifiers = List.of(lastSegment.split("\\.")).reversed().toArray(String[]::new);
		for (int i = qualifiers.length - 1; i >= 0; --i) {
			ResourceContentsHandler.Requirement handlerRequirement = ResourceContentsHandler.createRequirement(this, EObject[].class, qualifiers, i);
			ServiceCapabilityFactory.Requirement<ResourceContentsHandler.Requirement, ResourceContentsHandler> serviceRequirement = ServiceCapabilityFactory.createRequirement(ResourceContentsHandler.class, handlerRequirement);
			List<ResourceContentsHandler<EObject[]>> handlers = capabilityLoader.loadAll(serviceRequirement);
			ResourceContentsHandler<EObject[]> handler = handlers
					.stream()
					.min(Comparator.comparing(ResourceContentsHandler::getOrder))
					.orElse(null);
			if (handler != null) {
				return handler;
			}
		}
		return null;
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		ResourceTelemetry.load(this, inputStream, in -> {
			for (EObject eObject : requireResourceContentsHandler().load(in, options)) {
				getContents().add(eObject);
			}
		});
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		ResourceTelemetry.save(this, outputStream, out -> requireResourceContentsHandler().save(getContents().toArray(EObject[]::new), out, options));
	}

	@Override
	protected void doUnload() {
		ResourceTelemetry.unload(this, super::doUnload);
	}

	private ResourceContentsHandler<EObject[]> requireResourceContentsHandler() throws IOException {
		ResourceContentsHandler<EObject[]> handler = getResourceContentsHandler();
		if (handler == null) {
			throw new IOException("No contents handler for " + getURI());
		}
		return handler;
	}

}
