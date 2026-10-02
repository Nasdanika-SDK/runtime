package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.Tracer;

/**
 * A tracer that wraps another and publishes {@link SpanEvent}s for the spans it starts: start,
 * span events, attributes, status, exceptions, end. Long-running operations report progress through
 * the plain OpenTelemetry API:
 *
 * <pre>
 * Span span = tracer.spanBuilder("import").startSpan();
 * try (Scope scope = span.makeCurrent()) {
 *     for (...) {
 *         Telemetry.log(logger, Severity.INFO, Telemetry.PROGRESS_EVENT, "Imported " + i, Attributes.of(PROGRESS_WORKED, i, PROGRESS_TOTAL, n));
 *     }
 * } finally {
 *     span.end();
 * }
 * </pre>
 *
 * and a viewer, a console line or a test subscribes to {@link #within(PublishingSpan)} the
 * operation's span. Events are delivered asynchronously, in order per subscriber, from a bounded
 * buffer: instrumented code never blocks on a slow subscriber, and what such a subscriber misses is
 * counted in {@link #getDroppedCount()}.
 *
 * <p>
 * Delivery does not depend on an OpenTelemetry SDK. With the no-op tracer, spans record nothing
 * and events are still published, so progress reporting costs one wrapper and works everywhere.
 * With no subscribers, no events are created.
 */
public class PublishingTracer implements Tracer, Flow.Publisher<SpanEvent>, AutoCloseable {

	private final Tracer delegate;
	private final String instrumentationScope;
	private final SpanEventHub hub;
	private final boolean ownsHub;

	/**
	 * Delivers on virtual threads with the default buffer size.
	 */
	public PublishingTracer(Tracer delegate, String instrumentationScope) {
		this(delegate, instrumentationScope, new SpanEventHub(), true);
	}

	/**
	 * @param executor Delivers events to subscribers. {@code Runnable::run} delivers on the
	 * instrumented thread, which is deterministic and suits tests
	 * @param maxBufferCapacity Per subscriber, rounded up to a power of two
	 */
	public PublishingTracer(Tracer delegate, String instrumentationScope, Executor executor, int maxBufferCapacity) {
		this(delegate, instrumentationScope, new SpanEventHub(executor, maxBufferCapacity), true);
	}

	PublishingTracer(Tracer delegate, String instrumentationScope, SpanEventHub hub, boolean ownsHub) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.instrumentationScope = instrumentationScope;
		this.hub = hub;
		this.ownsHub = ownsHub;
	}

	public Tracer getDelegate() {
		return delegate;
	}

	public String getInstrumentationScope() {
		return instrumentationScope;
	}

	/**
	 * The current span, if it is a publishing one.
	 */
	public static Optional<PublishingSpan> currentSpan() {
		return Span.current() instanceof PublishingSpan span ? Optional.of(span) : Optional.empty();
	}

	@Override
	public SpanBuilder spanBuilder(String spanName) {
		return new PublishingSpanBuilder(delegate.spanBuilder(spanName), instrumentationScope, spanName, hub);
	}

	/**
	 * Enabled if the delegate is, or if anybody is listening: instrumentation that skips disabled
	 * tracers must not go quiet on a progress subscriber because no SDK is installed.
	 */
	@Override
	public boolean isEnabled() {
		return delegate.isEnabled() || hub.isActive();
	}

	/**
	 * Events of every span this tracer starts. Subscribers sharing a provider see the spans of all
	 * its tracers.
	 */
	@Override
	public void subscribe(Flow.Subscriber<? super SpanEvent> subscriber) {
		hub.subscribe(subscriber);
	}

	/**
	 * Events of a span and of the publishing spans started under it, including the log records
	 * emitted in them when the tracer was obtained from a {@link PublishingOpenTelemetry}.
	 */
	public Flow.Publisher<SpanEvent> within(PublishingSpan span) {
		return within(this, span);
	}

	/**
	 * Events of a span and of the publishing spans started under it.
	 */
	public static Flow.Publisher<SpanEvent> within(Flow.Publisher<SpanEvent> events, PublishingSpan span) {
		return Flows.filter(events, event -> event.span() != null && event.span().isWithin(span));
	}

	/**
	 * @return Events not delivered because a subscriber's buffer was full.
	 */
	public long getDroppedCount() {
		return hub.getDroppedCount();
	}

	/**
	 * Completes subscribers. Spans keep working and stop publishing. A tracer obtained from a
	 * {@link PublishingTracerProvider} shares the provider's subscribers and is closed with it.
	 */
	@Override
	public void close() {
		if (ownsHub) {
			hub.close();
		}
	}

}
