package org.nasdanika.sdk.runtime.harness.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nasdanika.sdk.runtime.harness.tests.ServerTests.respond;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.harness.Harness;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.Recording;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind;
import org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.context.Context;

/**
 * The client's and the server's telemetry, recorded as one trace.
 */
class TraceTests {

	/**
	 * The root spans of a recording.
	 */
	static List<Span> roots(Recording recording) {
		return recording.getTraces().getResourceSpans().stream()
			.flatMap(r -> r.getScopeSpans().stream())
			.flatMap(s -> s.getSpans().stream())
			.toList();
	}

	@Test
	void oneTrace() throws IOException {
		Path dir = Path.of("target", "telemetry", "one-trace");
		// tag::recording[]
		Recording recording = Recording.builder()
			.serviceName("harness-tests")
			.directory(dir, "yml") // <1>
			.build();
		try (recording) {
			Harness.inServer(
				recording.getOpenTelemetry(), // <2>
				"Library",
				routes -> routes.createContext("/books", exchange -> {
					var logger = Telemetry.logger(Telemetry.current()); // <3>
					Telemetry.log(logger, Severity.INFO, null, "Listing books", null);
					respond(exchange, 200, "Dune, Solaris");
				}),
				server -> server.get("/books"));
		} // <4>
		// end::recording[]

		// tag::trace[]
		Span library = roots(recording).getFirst();
		assertThat(library.getName()).isEqualTo("Library");

		Span client = library.getChildren().getFirst(); // <1>
		assertThat(client.getName()).isEqualTo("GET /books");
		assertThat(client.getKind()).isEqualTo(SpanKind.SPAN_KIND_CLIENT);

		Span server = client.getChildren().getFirst(); // <2>
		assertThat(server.getName()).isEqualTo("GET /books");
		assertThat(server.getKind()).isEqualTo(SpanKind.SPAN_KIND_SERVER);
		assertThat(server.getTraceId()).isEqualTo(library.getTraceId());

		assertThat(server.getLogRecords()) // <3>
			.singleElement()
			.satisfies(log -> assertThat(log.getBody().getStringValue()).isEqualTo("Listing books"));
		// end::trace[]
		assertThat(dir.resolve("traces.yml")).exists();
	}

	@Test
	void failures() throws IOException {
		Path dir = Path.of("target", "telemetry", "failures");
		// tag::failures[]
		Recording recording = Recording.builder().directory(dir, "yml").build();
		try (recording) {
			Harness.inServer(
				recording.getOpenTelemetry(),
				"Missing",
				routes -> routes.createContext("/", exchange -> respond(exchange, 404, "Not found")),
				server -> server.get("/nothing"));
		}
		Span client = roots(recording).getFirst().getChildren().getFirst();
		assertThat(client.getStatus().getCode()).isEqualTo(StatusCode.STATUS_CODE_ERROR); // <1>
		Span server = client.getChildren().getFirst();
		assertThat(server.getStatus().getCode()).isEqualTo(StatusCode.STATUS_CODE_UNSET); // <2>
		// end::failures[]
	}

	@Test
	void propagationHeaders() {
		Path dir = Path.of("target", "telemetry", "headers");
		try (Recording recording = Recording.builder().directory(dir, "yml").build()) {
			// tag::headers[]
			Harness.inServer(recording.getOpenTelemetry(), "Headers", routes -> {}, server -> {
				String traceId = server.span().getSpanContext().getTraceId();
				assertThat(server.propagationHeaders(Context.current()))
					.hasEntrySatisfying("traceparent", value -> assertThat(value).contains(traceId));
				return null;
			});
			// end::headers[]
		}
	}

	@Test
	void noSdkNoPropagation() {
		Harness.inServer("Without an SDK", routes -> {}, server -> {
			assertThat(server.propagationHeaders(Context.current())).isEmpty();
			return null;
		});
	}

}
