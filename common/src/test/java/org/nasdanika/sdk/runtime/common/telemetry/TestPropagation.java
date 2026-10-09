package org.nasdanika.sdk.runtime.common.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.api.Test;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.context.Context;

/**
 * Extracting a remote parent from a map carrier, as from environment variables or request parameters.
 */
class TestPropagation {

	private static final String TRACE_ID = "4bf92f3577b34da6a3ce929d0e0e4736";

	private static final String SPAN_ID = "00f067aa0ba902b7";

	private static final String TRACEPARENT = "00-" + TRACE_ID + "-" + SPAN_ID + "-01";

	private static final OpenTelemetry OPEN_TELEMETRY = OpenTelemetry.propagating(Telemetry.w3cPropagators());

	@Test
	void upperCaseKeysAsInEnvironmentVariables() {
		Context context = Telemetry.extract(OPEN_TELEMETRY, Context.root(), Map.of(
				"TRACEPARENT", TRACEPARENT,
				"BAGGAGE", "commit=cd0d38a"));
		SpanContext spanContext = Span.fromContext(context).getSpanContext();
		assertThat(spanContext.isRemote()).isTrue();
		assertThat(spanContext.getTraceId()).isEqualTo(TRACE_ID);
		assertThat(spanContext.getSpanId()).isEqualTo(SPAN_ID);
		assertThat(Baggage.fromContext(context).getEntryValue("commit")).isEqualTo("cd0d38a");
	}

	@Test
	void lowerCaseKeysAsInRequestParameters() {
		Context context = Telemetry.extract(OPEN_TELEMETRY, Context.root(), Map.of("traceparent", TRACEPARENT));
		assertThat(Span.fromContext(context).getSpanContext().getTraceId()).isEqualTo(TRACE_ID);
	}

	@Test
	void nothingToExtract() {
		assertThat(Telemetry.extract(OPEN_TELEMETRY, Context.root(), Map.of("TRACEPARENT", "garbage"))).isSameAs(Context.root());
		assertThat(Telemetry.extract(OPEN_TELEMETRY, Context.root(), null)).isSameAs(Context.root());
		assertThat(Span.fromContext(Telemetry.extract(OpenTelemetry.noop(), Context.root(), Map.of("TRACEPARENT", TRACEPARENT))).getSpanContext().isValid()).isFalse();
	}

}
