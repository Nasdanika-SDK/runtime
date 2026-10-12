package org.nasdanika.sdk.runtime.common.capability.emf;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;

/**
 * Creates {@link ContentsHandlingResource}s. Register it with a resource set for the extensions
 * whose contents are handled by {@link ResourceContentsHandler} capabilities, usually from a
 * {@link org.nasdanika.sdk.runtime.common.services.ResourceSetContributor}.
 */
public class ContentsHandlingResourceFactory extends ResourceFactoryImpl {

	private final CapabilityLoader capabilityLoader;
	private final Notifier context;

	/**
	 * @param context What the factory is contributed to, usually the resource set. Used for telemetry, may be null
	 */
	public ContentsHandlingResourceFactory(CapabilityLoader capabilityLoader, Notifier context) {
		this.capabilityLoader = capabilityLoader;
		this.context = context;
	}

	@Override
	public Resource createResource(URI uri) {
		return ResourceTelemetry.created(context, new ContentsHandlingResource(uri, capabilityLoader));
	}

}
