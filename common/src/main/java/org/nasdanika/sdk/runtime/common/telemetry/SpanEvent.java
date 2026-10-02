package org.nasdanika.sdk.runtime.common.telemetry;

import java.time.Instant;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;

/**
 * What happened to a {@link PublishingSpan}, as it happened, and the log records emitted in it.
 * Published by {@link PublishingTracer} and {@link PublishingLogger} while the span is live, unlike
 * exported span data, which arrives only after the span ends. That is what makes them usable for
 * progress reporting of long-running operations.
 *
 * <p>
 * A sealed hierarchy of records, so that consumers pattern match and adding an event does not
 * break them.
 */
public sealed interface SpanEvent {

	/**
	 * @return The span. Null only for a {@link LogEmitted} outside any publishing span
	 */
	PublishingSpan span();

	Instant timestamp();

	record Started(PublishingSpan span, Instant timestamp, String name, SpanKind kind, Attributes attributes) implements SpanEvent {}

	/**
	 * A span event: {@code Span.addEvent}. The runtime itself emits log records instead, see
	 * {@link LogEmitted}, because OpenTelemetry is moving events onto the Logs API.
	 */
	record EventAdded(PublishingSpan span, Instant timestamp, String name, Attributes attributes) implements SpanEvent {}

	record AttributeSet(PublishingSpan span, Instant timestamp, AttributeKey<?> key, Object value) implements SpanEvent {}

	record StatusSet(PublishingSpan span, Instant timestamp, StatusCode code, String description) implements SpanEvent {}

	record ExceptionRecorded(PublishingSpan span, Instant timestamp, Throwable exception, Attributes attributes) implements SpanEvent {}

	record Renamed(PublishingSpan span, Instant timestamp, String name) implements SpanEvent {}

	record Ended(PublishingSpan span, Instant timestamp) implements SpanEvent {}

	/**
	 * A log record emitted through a {@link PublishingLogger}: logs, progress and other events by
	 * the runtime's telemetry convention.
	 *
	 * @param span The publishing span current when the record was emitted, or null if there was
	 * none. {@link LogRecord#spanContext()} identifies a non-publishing current span
	 * @param timestamp The record's timestamp, or its observed timestamp if it has none
	 */
	record LogEmitted(PublishingSpan span, Instant timestamp, LogRecord record) implements SpanEvent {}

}
