package org.nasdanika.sdk.runtime.common.telemetry;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Context;

/**
 * Delegates to a span builder and remembers what the start event and the publishing parent need.
 */
final class PublishingSpanBuilder implements SpanBuilder {

	private final SpanBuilder delegate;
	private final String instrumentationScope;
	private final String name;
	private final SpanEventHub hub;
	private final AttributesBuilder attributes = Attributes.builder();
	private Context parent;
	private boolean noParent;
	private SpanKind kind = SpanKind.INTERNAL;
	private Instant startTimestamp;

	PublishingSpanBuilder(SpanBuilder delegate, String instrumentationScope, String name, SpanEventHub hub) {
		this.delegate = delegate;
		this.instrumentationScope = instrumentationScope;
		this.name = name;
		this.hub = hub;
	}

	@Override
	public SpanBuilder setParent(Context context) {
		delegate.setParent(context);
		parent = context;
		noParent = false;
		return this;
	}

	@Override
	public SpanBuilder setNoParent() {
		delegate.setNoParent();
		parent = null;
		noParent = true;
		return this;
	}

	@Override
	public SpanBuilder addLink(SpanContext spanContext) {
		delegate.addLink(spanContext);
		return this;
	}

	@Override
	public SpanBuilder addLink(SpanContext spanContext, Attributes attributes) {
		delegate.addLink(spanContext, attributes);
		return this;
	}

	@Override
	public SpanBuilder setAttribute(String key, String value) {
		delegate.setAttribute(key, value);
		attributes.put(key, value);
		return this;
	}

	@Override
	public SpanBuilder setAttribute(String key, long value) {
		delegate.setAttribute(key, value);
		attributes.put(key, value);
		return this;
	}

	@Override
	public SpanBuilder setAttribute(String key, double value) {
		delegate.setAttribute(key, value);
		attributes.put(key, value);
		return this;
	}

	@Override
	public SpanBuilder setAttribute(String key, boolean value) {
		delegate.setAttribute(key, value);
		attributes.put(key, value);
		return this;
	}

	@Override
	public <T> SpanBuilder setAttribute(AttributeKey<T> key, T value) {
		delegate.setAttribute(key, value);
		if (value != null) {
			attributes.put(key, value);
		}
		return this;
	}

	@Override
	public SpanBuilder setSpanKind(SpanKind spanKind) {
		delegate.setSpanKind(spanKind);
		kind = spanKind;
		return this;
	}

	@Override
	public SpanBuilder setStartTimestamp(long startTimestamp, TimeUnit unit) {
		delegate.setStartTimestamp(startTimestamp, unit);
		this.startTimestamp = PublishingSpan.instant(startTimestamp, unit);
		return this;
	}

	@Override
	public Span startSpan() {
		Span span = delegate.startSpan();
		PublishingSpan publishingParent = null;
		if (!noParent) {
			Span parentSpan = Span.fromContextOrNull(parent == null ? Context.current() : parent);
			if (parentSpan instanceof PublishingSpan ps) {
				publishingParent = ps;
			}
		}
		PublishingSpan result = new PublishingSpan(span, publishingParent, instrumentationScope, name, kind, hub);
		Instant timestamp = startTimestamp == null ? Instant.now() : startTimestamp;
		hub.publish(() -> new SpanEvent.Started(result, timestamp, name, kind, attributes.build()));
		return result;
	}

}
