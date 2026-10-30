package org.nasdanika.sdk.runtime.models.meta.resource;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;

/**
 * Creates {@link MetaResource}s. Registered for the {@code nmeta} extension by the module's
 * resource set contributor; register it by hand with a resource set that is not configured from
 * the module path.
 */
public class MetaResourceFactory extends ResourceFactoryImpl {

	private final Notifier context;

	public MetaResourceFactory() {
		this(null);
	}

	/**
	 * @param context What the factory is contributed to, usually the resource set. Used for telemetry, may be null
	 */
	public MetaResourceFactory(Notifier context) {
		this.context = context;
	}

	@Override
	public Resource createResource(URI uri) {
		return ResourceTelemetry.created(context, new MetaResource(uri));
	}

}
