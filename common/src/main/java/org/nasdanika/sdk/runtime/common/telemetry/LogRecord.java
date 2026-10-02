package org.nasdanika.sdk.runtime.common.telemetry;

import java.time.Instant;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;

/**
 * What a log record builder of a {@link PublishingLoggerProvider} emitted. The API has no log
 * record data type (that is the SDK's {@code LogRecordData}), so this one carries what was set on
 * the builder.
 *
 * @param timestamp When the event occurred. Null if not set, in which case the SDK uses the
 * observed timestamp
 * @param observedTimestamp When it was observed: set on the builder, or the time of {@code emit}
 * @param body Null if not set
 * @param eventName Null for a plain log record
 * @param exception Null if not set
 * @param spanContext Of the span current when the record was emitted, or of the span in the
 * context set on the builder. Invalid if there was none
 */
public record LogRecord(
		String instrumentationScope,
		Instant timestamp,
		Instant observedTimestamp,
		Severity severity,
		String severityText,
		Value<?> body,
		String eventName,
		Attributes attributes,
		Throwable exception,
		SpanContext spanContext) {

	/**
	 * @return The body as a string, or null.
	 */
	public String bodyAsString() {
		return body == null ? null : body.asString();
	}

}
