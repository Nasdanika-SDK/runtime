package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Flow;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.LoggerBuilder;
import io.opentelemetry.api.logs.LoggerProvider;

/**
 * Wraps a logger provider so that every log record emitted through its loggers is also published
 * as a {@link SpanEvent.LogEmitted}, referencing the publishing span that was current when it was
 * emitted. Created by {@link PublishingOpenTelemetry}, which shares one set of subscribers between
 * spans and log records, so that a viewer sees a span's log records in order with its other events.
 *
 * <p>
 * Like {@link PublishingTracer}, it publishes whether or not an SDK is installed, and its loggers
 * are enabled while anybody listens.
 */
public class PublishingLoggerProvider implements LoggerProvider, Flow.Publisher<SpanEvent> {

	private record Key(String name, String version, String schemaUrl) {}

	private final LoggerProvider delegate;
	private final SpanEventHub hub;
	private final Map<Key, PublishingLogger> loggers = new ConcurrentHashMap<>();

	PublishingLoggerProvider(LoggerProvider delegate, SpanEventHub hub) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.hub = Objects.requireNonNull(hub, "hub");
	}

	public LoggerProvider getDelegate() {
		return delegate;
	}

	@Override
	public PublishingLogger get(String instrumentationScopeName) {
		return loggers.computeIfAbsent(
				new Key(instrumentationScopeName, null, null),
				k -> new PublishingLogger(delegate.get(instrumentationScopeName), instrumentationScopeName, hub));
	}

	@Override
	public LoggerBuilder loggerBuilder(String instrumentationScopeName) {
		LoggerBuilder builder = delegate.loggerBuilder(instrumentationScopeName);
		return new LoggerBuilder() {

			private String version;
			private String schemaUrl;

			@Override
			public LoggerBuilder setSchemaUrl(String schemaUrl) {
				builder.setSchemaUrl(schemaUrl);
				this.schemaUrl = schemaUrl;
				return this;
			}

			@Override
			public LoggerBuilder setInstrumentationVersion(String instrumentationScopeVersion) {
				builder.setInstrumentationVersion(instrumentationScopeVersion);
				this.version = instrumentationScopeVersion;
				return this;
			}

			@Override
			public PublishingLogger build() {
				return loggers.computeIfAbsent(
						new Key(instrumentationScopeName, version, schemaUrl),
						k -> new PublishingLogger(builder.build(), instrumentationScopeName, hub));
			}

		};
	}

	@Override
	public void subscribe(Flow.Subscriber<? super SpanEvent> subscriber) {
		hub.subscribe(subscriber);
	}

}
