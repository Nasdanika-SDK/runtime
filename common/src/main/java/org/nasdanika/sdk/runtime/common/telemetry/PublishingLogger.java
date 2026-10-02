package org.nasdanika.sdk.runtime.common.telemetry;

import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Context;

/**
 * A logger whose log records are published as {@link SpanEvent.LogEmitted} as well as emitted
 * through the delegate. Obtained from a {@link PublishingLoggerProvider}.
 */
public class PublishingLogger implements Logger {

	private final Logger delegate;
	private final String instrumentationScope;
	private final SpanEventHub hub;

	PublishingLogger(Logger delegate, String instrumentationScope, SpanEventHub hub) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.instrumentationScope = instrumentationScope;
		this.hub = hub;
	}

	public Logger getDelegate() {
		return delegate;
	}

	public String getInstrumentationScope() {
		return instrumentationScope;
	}

	/**
	 * Enabled if the delegate is, or if anybody is listening.
	 */
	@Override
	public boolean isEnabled(Severity severity, Context context) {
		return delegate.isEnabled(severity, context) || hub.isActive();
	}

	@Override
	public boolean isEnabled(Severity severity) {
		return delegate.isEnabled(severity) || hub.isActive();
	}

	@Override
	public LogRecordBuilder logRecordBuilder() {
		return new Builder(delegate.logRecordBuilder());
	}

	private final class Builder implements LogRecordBuilder {

		private final LogRecordBuilder delegate;
		private final AttributesBuilder attributes = Attributes.builder();
		private Instant timestamp;
		private Instant observedTimestamp;
		private Context context;
		private Severity severity = Severity.UNDEFINED_SEVERITY_NUMBER;
		private String severityText;
		private Value<?> body;
		private String eventName;
		private Throwable exception;

		Builder(LogRecordBuilder delegate) {
			this.delegate = delegate;
		}

		@Override
		public LogRecordBuilder setTimestamp(long timestamp, TimeUnit unit) {
			delegate.setTimestamp(timestamp, unit);
			this.timestamp = PublishingSpan.instant(timestamp, unit);
			return this;
		}

		@Override
		public LogRecordBuilder setTimestamp(Instant instant) {
			delegate.setTimestamp(instant);
			this.timestamp = instant;
			return this;
		}

		@Override
		public LogRecordBuilder setObservedTimestamp(long timestamp, TimeUnit unit) {
			delegate.setObservedTimestamp(timestamp, unit);
			this.observedTimestamp = PublishingSpan.instant(timestamp, unit);
			return this;
		}

		@Override
		public LogRecordBuilder setObservedTimestamp(Instant instant) {
			delegate.setObservedTimestamp(instant);
			this.observedTimestamp = instant;
			return this;
		}

		@Override
		public LogRecordBuilder setContext(Context context) {
			delegate.setContext(context);
			this.context = context;
			return this;
		}

		@Override
		public LogRecordBuilder setSeverity(Severity severity) {
			delegate.setSeverity(severity);
			this.severity = severity;
			return this;
		}

		@Override
		public LogRecordBuilder setSeverityText(String severityText) {
			delegate.setSeverityText(severityText);
			this.severityText = severityText;
			return this;
		}

		@Override
		public LogRecordBuilder setBody(String body) {
			delegate.setBody(body);
			this.body = body == null ? null : Value.of(body);
			return this;
		}

		@Override
		public LogRecordBuilder setBody(Value<?> body) {
			delegate.setBody(body);
			this.body = body;
			return this;
		}

		@Override
		public <T> LogRecordBuilder setAttribute(AttributeKey<T> key, T value) {
			delegate.setAttribute(key, value);
			if (key != null && value != null) {
				attributes.put(key, value);
			}
			return this;
		}

		@Override
		public LogRecordBuilder setEventName(String eventName) {
			delegate.setEventName(eventName);
			this.eventName = eventName;
			return this;
		}

		@Override
		public LogRecordBuilder setException(Throwable throwable) {
			delegate.setException(throwable);
			this.exception = throwable;
			return this;
		}

		@Override
		public void emit() {
			Context emitContext = context == null ? Context.current() : context;
			Instant emitted = observedTimestamp == null ? Instant.now() : observedTimestamp;
			delegate.emit();
			hub.publish(() -> {
				Span span = Span.fromContext(emitContext);
				LogRecord record = new LogRecord(
						instrumentationScope,
						timestamp,
						emitted,
						severity,
						severityText,
						body,
						eventName,
						attributes.build(),
						exception,
						span.getSpanContext());
				return new SpanEvent.LogEmitted(span instanceof PublishingSpan ps ? ps : null, timestamp == null ? emitted : timestamp, record);
			});
		}

	}

}
