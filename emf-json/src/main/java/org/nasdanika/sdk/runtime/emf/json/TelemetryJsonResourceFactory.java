package org.nasdanika.sdk.runtime.emf.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emfcloud.jackson.resource.JsonResource;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * A JSON resource factory whose resources load, save and unload in
 * {@link ResourceTelemetry} spans, for JSON and, with a YAML mapper, YAML.
 */
public class TelemetryJsonResourceFactory extends JsonResourceFactory {

	private final Notifier context;

	/**
	 * @param context What the factory is contributed to, usually a resource set. Resource creation
	 * is logged to its telemetry
	 */
	public TelemetryJsonResourceFactory(Notifier context) {
		this.context = context;
	}

	public TelemetryJsonResourceFactory(Notifier context, ObjectMapper mapper) {
		super(mapper);
		this.context = context;
	}

	@Override
	public Resource createResource(URI uri) {
		return ResourceTelemetry.created(context, new JsonResource(uri, getMapper()) {

			@Override
			protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
				ResourceTelemetry.load(this, inputStream, in -> super.doLoad(in, options));
			}

			@Override
			protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
				ResourceTelemetry.save(this, outputStream, out -> super.doSave(out, options));
			}

			@Override
			protected void doUnload() {
				ResourceTelemetry.unload(this, super::doUnload);
			}

		});
	}

}
