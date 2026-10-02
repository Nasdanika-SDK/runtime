package org.nasdanika.sdk.runtime.common.telemetry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredInputStream;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredOutputStream;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Severity;

/**
 * Instrumentation for resource implementations, which call it from their {@code doLoad},
 * {@code doSave} and {@code doUnload}:
 *
 * <pre>
 * protected void doLoad(InputStream inputStream, Map&lt;?, ?&gt; options) throws IOException {
 *     ResourceTelemetry.load(this, inputStream, in -&gt; super.doLoad(in, options));
 * }
 * </pre>
 *
 * Each runs in a span ({@code Resource.load}, {@code Resource.save}, {@code Resource.unload}) with
 * the resource URI and type, and the number of bytes and root objects as attributes once done, and
 * emits a log record. The {@link OpenTelemetry} is the one {@link Telemetry#of(Notifier) of} the
 * resource.
 */
public final class ResourceTelemetry {

	@FunctionalInterface
	public interface IOConsumer<T> {

		void accept(T t) throws IOException;

	}

	private ResourceTelemetry() {}

	/**
	 * Logs creation of a resource by a factory.
	 *
	 * @param context What the factory was contributed to, usually the resource set. The resource is
	 * not in a resource set yet
	 * @return The resource
	 */
	public static <R extends Resource> R created(Notifier context, R resource) {
		Telemetry.log(
				Telemetry.logger(Telemetry.of(context)),
				Severity.DEBUG,
				Telemetry.RESOURCE_CREATED_EVENT,
				"Created " + type(resource) + " for " + resource.getURI(),
				attributes(resource));
		return resource;
	}

	public static void load(Resource resource, InputStream inputStream, IOConsumer<InputStream> loader) throws IOException {
		OpenTelemetry openTelemetry = Telemetry.of(resource);
		Telemetry.inSpan(Telemetry.tracer(openTelemetry), "Resource.load", attributes(resource), span -> {
			MeteredInputStream in = new MeteredInputStream(inputStream, null, 0);
			loader.accept(in);
			span.setAttribute(Telemetry.IO_BYTES, in.getCount());
			span.setAttribute(Telemetry.RESOURCE_CONTENTS, (long) resource.getContents().size());
			Telemetry.log(
					Telemetry.logger(openTelemetry),
					Severity.INFO,
					Telemetry.RESOURCE_LOADED_EVENT,
					"Loaded " + resource.getURI() + ": " + in.getCount() + " bytes",
					counts(resource, in.getCount()));
			return null;
		});
	}

	public static void save(Resource resource, OutputStream outputStream, IOConsumer<OutputStream> saver) throws IOException {
		OpenTelemetry openTelemetry = Telemetry.of(resource);
		Telemetry.inSpan(Telemetry.tracer(openTelemetry), "Resource.save", attributes(resource), span -> {
			MeteredOutputStream out = new MeteredOutputStream(outputStream, null, 0);
			saver.accept(out);
			out.flush();
			span.setAttribute(Telemetry.IO_BYTES, out.getCount());
			span.setAttribute(Telemetry.RESOURCE_CONTENTS, (long) resource.getContents().size());
			Telemetry.log(
					Telemetry.logger(openTelemetry),
					Severity.INFO,
					Telemetry.RESOURCE_SAVED_EVENT,
					"Saved " + resource.getURI() + ": " + out.getCount() + " bytes",
					counts(resource, out.getCount()));
			return null;
		});
	}

	public static void unload(Resource resource, Runnable unloader) {
		Telemetry.inSpan(Telemetry.tracer(Telemetry.of(resource)), "Resource.unload", attributes(resource), span -> {
			span.setAttribute(Telemetry.RESOURCE_CONTENTS, (long) resource.getContents().size());
			unloader.run();
			return null;
		});
	}

	static Attributes attributes(Resource resource) {
		return Attributes.of(
				Telemetry.RESOURCE_URI, String.valueOf(resource.getURI()),
				Telemetry.RESOURCE_TYPE, type(resource));
	}

	/**
	 * The class name, of the superclass for the anonymous subclasses that instrumentation creates.
	 */
	private static String type(Resource resource) {
		Class<?> type = resource.getClass();
		while (type.isAnonymousClass()) {
			type = type.getSuperclass();
		}
		return type.getName();
	}

	private static Attributes counts(Resource resource, long bytes) {
		return attributes(resource).toBuilder()
				.put(Telemetry.IO_BYTES, bytes)
				.put(Telemetry.RESOURCE_CONTENTS, (long) resource.getContents().size())
				.build();
	}

}
