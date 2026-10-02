package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.Objects;
import java.util.concurrent.Flow;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.LoggerProvider;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.context.propagation.ContextPropagators;

/**
 * An {@link OpenTelemetry} whose tracers publish span events. Everything else is the delegate's.
 * Pass it wherever instrumentation takes an {@code OpenTelemetry}, such as the HTTP wrappers, and
 * subscribe to watch their spans live.
 */
public class PublishingOpenTelemetry implements OpenTelemetry, Flow.Publisher<SpanEvent>, AutoCloseable {

	private final OpenTelemetry delegate;
	private final PublishingTracerProvider tracerProvider;

	public PublishingOpenTelemetry(OpenTelemetry delegate) {
		this(delegate, new PublishingTracerProvider(delegate.getTracerProvider()));
	}

	public PublishingOpenTelemetry(OpenTelemetry delegate, PublishingTracerProvider tracerProvider) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.tracerProvider = Objects.requireNonNull(tracerProvider, "tracerProvider");
	}

	public OpenTelemetry getDelegate() {
		return delegate;
	}

	@Override
	public PublishingTracerProvider getTracerProvider() {
		return tracerProvider;
	}

	@Override
	public MeterProvider getMeterProvider() {
		return delegate.getMeterProvider();
	}

	@Override
	public LoggerProvider getLogsBridge() {
		return delegate.getLogsBridge();
	}

	@Override
	public ContextPropagators getPropagators() {
		return delegate.getPropagators();
	}

	@Override
	public void subscribe(Flow.Subscriber<? super SpanEvent> subscriber) {
		tracerProvider.subscribe(subscriber);
	}

	@Override
	public void close() {
		tracerProvider.close();
	}

}
