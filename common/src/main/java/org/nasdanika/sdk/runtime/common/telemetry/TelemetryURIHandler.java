package org.nasdanika.sdk.runtime.common.telemetry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.Meter;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredInputStream;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredOutputStream;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;

/**
 * A URI handler filter: wraps another handler, and every stream it opens is a span from opening to
 * closing ({@code URIHandler.read} or {@code URIHandler.write}) with the URI, the wrapped handler and
 * the byte count as attributes, and log records reporting progress
 * ({@link Telemetry#PROGRESS_EVENT}) at most once per {@link #PROGRESS_INTERVAL} while it is read or
 * written. Deletion is a span too. The other operations are delegated as they are.
 *
 * <p>
 * The stream span is not made current, because a stream is not a lexical scope. Its parent is the
 * span current when the stream was opened, and its progress records are correlated with it
 * explicitly.
 *
 * <p>
 * {@link #wrapAll(URIConverter, Supplier)} wraps every handler of a converter, the default one
 * included, which is how {@link org.nasdanika.sdk.runtime.common.services.ResourceSetContributor}
 * instruments a resource set.
 */
public class TelemetryURIHandler implements URIHandler {

	public static final Duration PROGRESS_INTERVAL = MeteredStreams.PROGRESS_INTERVAL;

	private final URIHandler delegate;
	private final Supplier<OpenTelemetry> openTelemetry;
	private final long intervalNanos;

	/**
	 * @param openTelemetry Called per operation, so that the instance current at the time is used
	 */
	public TelemetryURIHandler(URIHandler delegate, Supplier<OpenTelemetry> openTelemetry) {
		this(delegate, openTelemetry, PROGRESS_INTERVAL);
	}

	public TelemetryURIHandler(URIHandler delegate, Supplier<OpenTelemetry> openTelemetry, Duration progressInterval) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.openTelemetry = Objects.requireNonNull(openTelemetry, "openTelemetry");
		this.intervalNanos = progressInterval.toNanos();
	}

	public URIHandler getDelegate() {
		return delegate;
	}

	/**
	 * Wraps each handler of the converter that is not wrapped already.
	 */
	public static void wrapAll(URIConverter uriConverter, Supplier<OpenTelemetry> openTelemetry) {
		List<URIHandler> handlers = uriConverter.getURIHandlers();
		for (int i = 0; i < handlers.size(); ++i) {
			URIHandler handler = handlers.get(i);
			if (!(handler instanceof TelemetryURIHandler)) {
				handlers.set(i, new TelemetryURIHandler(handler, openTelemetry));
			}
		}
	}

	@Override
	public boolean canHandle(URI uri) {
		return delegate.canHandle(uri);
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		OpenTelemetry otel = openTelemetry.get();
		Span span = start(otel, "URIHandler.read", uri);
		InputStream in;
		try (Scope scope = span.makeCurrent()) {
			in = delegate.createInputStream(uri, options);
		} catch (IOException | RuntimeException e) {
			Telemetry.recordFailure(span, e);
			span.end();
			throw e;
		}
		return new MeteredInputStream(in, meter(otel, span, uri, "Read"), intervalNanos);
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		OpenTelemetry otel = openTelemetry.get();
		Span span = start(otel, "URIHandler.write", uri);
		OutputStream out;
		try (Scope scope = span.makeCurrent()) {
			out = delegate.createOutputStream(uri, options);
		} catch (IOException | RuntimeException e) {
			Telemetry.recordFailure(span, e);
			span.end();
			throw e;
		}
		return new MeteredOutputStream(out, meter(otel, span, uri, "Written"), intervalNanos);
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		Telemetry.inSpan(Telemetry.tracer(openTelemetry.get()), "URIHandler.delete", attributes(uri), span -> {
			delegate.delete(uri, options);
			return null;
		});
	}

	@Override
	public Map<String, ?> contentDescription(URI uri, Map<?, ?> options) throws IOException {
		return delegate.contentDescription(uri, options);
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return delegate.exists(uri, options);
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		return delegate.getAttributes(uri, options);
	}

	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
		delegate.setAttributes(uri, attributes, options);
	}

	private Span start(OpenTelemetry otel, String name, URI uri) {
		return Telemetry.tracer(otel)
				.spanBuilder(name)
				.setAllAttributes(attributes(uri))
				.startSpan();
	}

	private Attributes attributes(URI uri) {
		return Attributes.of(
				Telemetry.RESOURCE_URI, String.valueOf(uri),
				Telemetry.URI_HANDLER, delegate.getClass().getName());
	}

	private Meter meter(OpenTelemetry otel, Span span, URI uri, String verb) {
		return MeteredStreams.spanMeter(
				Telemetry.logger(otel),
				span,
				verb,
				String.valueOf(uri),
				Attributes.of(Telemetry.RESOURCE_URI, String.valueOf(uri)),
				true);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + delegate + "]";
	}

}
