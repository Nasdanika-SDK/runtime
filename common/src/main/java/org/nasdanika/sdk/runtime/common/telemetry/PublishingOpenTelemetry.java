package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.Objects;
import java.util.concurrent.Flow;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.context.propagation.ContextPropagators;

/**
 * An {@link OpenTelemetry} whose tracers publish span events and whose loggers publish the log
 * records they emit, to the same subscribers. Meters and propagators are the delegate's. Make it
 * current for a unit of work ({@link Telemetry#makeCurrent(OpenTelemetry)}), or pass it wherever
 * instrumentation takes an {@code OpenTelemetry}, and subscribe to watch spans and their log
 * records live.
 */
public class PublishingOpenTelemetry implements OpenTelemetry, Flow.Publisher<SpanEvent>, AutoCloseable {

	private final OpenTelemetry delegate;
	private final PublishingTracerProvider tracerProvider;
	private final PublishingLoggerProvider loggerProvider;

	public PublishingOpenTelemetry(OpenTelemetry delegate) {
		this(delegate, new PublishingTracerProvider(delegate.getTracerProvider()));
	}

	/**
	 * Log records are published to the tracer provider's subscribers.
	 */
	public PublishingOpenTelemetry(OpenTelemetry delegate, PublishingTracerProvider tracerProvider) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.tracerProvider = Objects.requireNonNull(tracerProvider, "tracerProvider");
		this.loggerProvider = new PublishingLoggerProvider(delegate.getLogsBridge(), tracerProvider.getHub());
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

	/**
	 * The name is the API's: there is no logging framework bridged in here, the runtime uses this
	 * API directly.
	 */
	@Override
	public PublishingLoggerProvider getLogsBridge() {
		return loggerProvider;
	}

	@Override
	public ContextPropagators getPropagators() {
		return delegate.getPropagators();
	}

	@Override
	public void subscribe(Flow.Subscriber<? super SpanEvent> subscriber) {
		tracerProvider.subscribe(subscriber);
	}

	/**
	 * Events of a span and of the publishing spans started under it, including their log records.
	 */
	public Flow.Publisher<SpanEvent> within(PublishingSpan span) {
		return PublishingTracer.within(this, span);
	}

	public long getDroppedCount() {
		return tracerProvider.getDroppedCount();
	}

	/**
	 * Completes subscribers. Does not close the delegate, which the unit of work owns.
	 */
	@Override
	public void close() {
		tracerProvider.close();
	}

}
