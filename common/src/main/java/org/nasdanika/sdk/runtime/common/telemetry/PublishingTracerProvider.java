package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Flow;

import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerBuilder;
import io.opentelemetry.api.trace.TracerProvider;

/**
 * Wraps a tracer provider so that every tracer it hands out is a {@link PublishingTracer}, all
 * publishing to this provider's subscribers. Instrumentation that is given a tracer provider, or an
 * {@code OpenTelemetry} through {@link PublishingOpenTelemetry}, then publishes without knowing it.
 */
public class PublishingTracerProvider implements TracerProvider, Flow.Publisher<SpanEvent>, AutoCloseable {

	private record Key(String name, String version, String schemaUrl) {}

	private final TracerProvider delegate;
	private final SpanEventHub hub;
	private final Map<Key, PublishingTracer> tracers = new ConcurrentHashMap<>();

	public PublishingTracerProvider(TracerProvider delegate) {
		this(delegate, new SpanEventHub());
	}

	public PublishingTracerProvider(TracerProvider delegate, Executor executor, int maxBufferCapacity) {
		this(delegate, new SpanEventHub(executor, maxBufferCapacity));
	}

	private PublishingTracerProvider(TracerProvider delegate, SpanEventHub hub) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.hub = hub;
	}

	public TracerProvider getDelegate() {
		return delegate;
	}

	@Override
	public PublishingTracer get(String instrumentationScopeName) {
		return tracers.computeIfAbsent(new Key(instrumentationScopeName, null, null), k -> wrap(delegate.get(instrumentationScopeName), instrumentationScopeName));
	}

	@Override
	public PublishingTracer get(String instrumentationScopeName, String instrumentationScopeVersion) {
		return tracers.computeIfAbsent(
				new Key(instrumentationScopeName, instrumentationScopeVersion, null),
				k -> wrap(delegate.get(instrumentationScopeName, instrumentationScopeVersion), instrumentationScopeName));
	}

	@Override
	public TracerBuilder tracerBuilder(String instrumentationScopeName) {
		TracerBuilder builder = delegate.tracerBuilder(instrumentationScopeName);
		return new TracerBuilder() {

			private String version;
			private String schemaUrl;

			@Override
			public TracerBuilder setSchemaUrl(String schemaUrl) {
				builder.setSchemaUrl(schemaUrl);
				this.schemaUrl = schemaUrl;
				return this;
			}

			@Override
			public TracerBuilder setInstrumentationVersion(String instrumentationScopeVersion) {
				builder.setInstrumentationVersion(instrumentationScopeVersion);
				this.version = instrumentationScopeVersion;
				return this;
			}

			@Override
			public Tracer build() {
				return tracers.computeIfAbsent(new Key(instrumentationScopeName, version, schemaUrl), k -> wrap(builder.build(), instrumentationScopeName));
			}

		};
	}

	private PublishingTracer wrap(Tracer tracer, String instrumentationScopeName) {
		return new PublishingTracer(tracer, instrumentationScopeName, hub, false);
	}

	@Override
	public void subscribe(Flow.Subscriber<? super SpanEvent> subscriber) {
		hub.subscribe(subscriber);
	}

	public long getDroppedCount() {
		return hub.getDroppedCount();
	}

	@Override
	public void close() {
		hub.close();
	}

}
