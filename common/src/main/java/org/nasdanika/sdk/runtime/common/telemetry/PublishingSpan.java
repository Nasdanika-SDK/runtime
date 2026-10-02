package org.nasdanika.sdk.runtime.common.telemetry;

import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;

/**
 * A span that delegates to another and publishes a {@link SpanEvent} for each change. Created by
 * {@link PublishingTracer}. Making it current stores the wrapper in the context, so spans started
 * under it by any tracer are its children, and spans started by a publishing tracer know their
 * publishing parent, which is what {@link #isWithin(PublishingSpan)} follows.
 *
 * <p>
 * Events are published whether or not the delegate is recording, so progress is reported even when
 * no OpenTelemetry SDK is installed. Nothing is published after the span ends, mirroring the SDK,
 * which ignores such calls.
 */
public class PublishingSpan implements Span {

	private final Span delegate;
	private final PublishingSpan parent;
	private final String instrumentationScope;
	private final SpanKind kind;
	private final SpanEventHub hub;
	private volatile String name;
	private volatile boolean ended;

	PublishingSpan(Span delegate, PublishingSpan parent, String instrumentationScope, String name, SpanKind kind, SpanEventHub hub) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.parent = parent;
		this.instrumentationScope = instrumentationScope;
		this.name = name;
		this.kind = kind;
		this.hub = hub;
	}

	public Span getDelegate() {
		return delegate;
	}

	/**
	 * @return The publishing span this one was started under, or null if it was started under none,
	 * for example under a span from a tracer that does not publish
	 */
	public PublishingSpan getParent() {
		return parent;
	}

	public String getInstrumentationScope() {
		return instrumentationScope;
	}

	public String getName() {
		return name;
	}

	public SpanKind getKind() {
		return kind;
	}

	public boolean isEnded() {
		return ended;
	}

	/**
	 * @return true if this span is the ancestor or one of its publishing descendants. For following
	 * one long-running operation: the events of a span and everything under it
	 */
	public boolean isWithin(PublishingSpan ancestor) {
		for (PublishingSpan span = this; span != null; span = span.parent) {
			if (span == ancestor) {
				return true;
			}
		}
		return false;
	}

	// --- Span ---

	@Override
	public <T> Span setAttribute(AttributeKey<T> key, T value) {
		delegate.setAttribute(key, value);
		if (!ended) {
			hub.publish(() -> new SpanEvent.AttributeSet(this, Instant.now(), key, value));
		}
		return this;
	}

	@Override
	public Span setAttribute(String key, Value<?> value) {
		delegate.setAttribute(key, value);
		if (!ended) {
			hub.publish(() -> new SpanEvent.AttributeSet(this, Instant.now(), AttributeKey.stringKey(key), value));
		}
		return this;
	}

	@Override
	public Span addEvent(String name, Attributes attributes) {
		delegate.addEvent(name, attributes);
		if (!ended) {
			hub.publish(() -> new SpanEvent.EventAdded(this, Instant.now(), name, attributes));
		}
		return this;
	}

	@Override
	public Span addEvent(String name, Attributes attributes, long timestamp, TimeUnit unit) {
		delegate.addEvent(name, attributes, timestamp, unit);
		if (!ended) {
			hub.publish(() -> new SpanEvent.EventAdded(this, instant(timestamp, unit), name, attributes));
		}
		return this;
	}

	@Override
	public Span setStatus(StatusCode statusCode, String description) {
		delegate.setStatus(statusCode, description);
		if (!ended) {
			hub.publish(() -> new SpanEvent.StatusSet(this, Instant.now(), statusCode, description));
		}
		return this;
	}

	@Override
	public Span recordException(Throwable exception, Attributes additionalAttributes) {
		delegate.recordException(exception, additionalAttributes);
		if (!ended) {
			hub.publish(() -> new SpanEvent.ExceptionRecorded(this, Instant.now(), exception, additionalAttributes));
		}
		return this;
	}

	@Override
	public Span updateName(String name) {
		delegate.updateName(name);
		if (!ended) {
			this.name = name;
			hub.publish(() -> new SpanEvent.Renamed(this, Instant.now(), name));
		}
		return this;
	}

	/**
	 * Delegated explicitly: the API's default implementation does nothing.
	 */
	@Override
	public Span addLink(SpanContext spanContext, Attributes attributes) {
		delegate.addLink(spanContext, attributes);
		return this;
	}

	@Override
	public void end() {
		delegate.end();
		ended(Instant.now());
	}

	@Override
	public void end(long timestamp, TimeUnit unit) {
		delegate.end(timestamp, unit);
		ended(instant(timestamp, unit));
	}

	private void ended(Instant timestamp) {
		if (!ended) {
			ended = true;
			hub.publish(() -> new SpanEvent.Ended(this, timestamp));
		}
	}

	@Override
	public SpanContext getSpanContext() {
		return delegate.getSpanContext();
	}

	@Override
	public boolean isRecording() {
		return delegate.isRecording();
	}

	static Instant instant(long timestamp, TimeUnit unit) {
		long nanos = unit.toNanos(timestamp);
		return Instant.ofEpochSecond(0, nanos);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + instrumentationScope + ": " + name + ", " + delegate.getSpanContext().getSpanId() + "]";
	}

}
