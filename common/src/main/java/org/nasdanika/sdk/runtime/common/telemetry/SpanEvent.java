package org.nasdanika.sdk.runtime.common.telemetry;

import java.time.Instant;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;

/**
 * What happened to a {@link PublishingSpan}, as it happened. Published by {@link PublishingTracer}
 * while the span is live, unlike exported span data, which arrives only after the span ends. That
 * is what makes span events usable for progress reporting of long-running operations.
 *
 * <p>
 * A sealed hierarchy of records, so that consumers pattern match and adding an event does not
 * break them.
 */
public sealed interface SpanEvent {

	PublishingSpan span();

	Instant timestamp();

	record Started(PublishingSpan span, Instant timestamp, String name, SpanKind kind, Attributes attributes) implements SpanEvent {}

	/**
	 * A span event: {@code Span.addEvent}. Progress, logs and metric observations are span events
	 * by the runtime's telemetry convention.
	 */
	record EventAdded(PublishingSpan span, Instant timestamp, String name, Attributes attributes) implements SpanEvent {}

	record AttributeSet(PublishingSpan span, Instant timestamp, AttributeKey<?> key, Object value) implements SpanEvent {}

	record StatusSet(PublishingSpan span, Instant timestamp, StatusCode code, String description) implements SpanEvent {}

	record ExceptionRecorded(PublishingSpan span, Instant timestamp, Throwable exception, Attributes attributes) implements SpanEvent {}

	record Renamed(PublishingSpan span, Instant timestamp, String name) implements SpanEvent {}

	record Ended(PublishingSpan span, Instant timestamp) implements SpanEvent {}

}
