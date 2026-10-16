package org.example.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Flow;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;

class TestTelemetry {

	// tag::deterministic[]
	/**
	 * Delivers events on the instrumented thread, in order: deterministic, as tests want.
	 */
	static PublishingOpenTelemetry deterministic(OpenTelemetry delegate) {
		var provider = new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 1024);
		return new PublishingOpenTelemetry(delegate, provider);
	}
	// end::deterministic[]

	/**
	 * Collects the names of started spans.
	 */
	static final class Started implements Flow.Subscriber<SpanEvent> {

		final List<String> names = Collections.synchronizedList(new ArrayList<>());

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(SpanEvent event) {
			if (event instanceof SpanEvent.Started started) {
				names.add(started.name());
			}
		}

		@Override
		public void onError(Throwable throwable) {
		}

		@Override
		public void onComplete() {
		}

	}

	@Test
	void liveTree() {
		// tag::live-tree[]
		var bytes = new ByteArrayOutputStream();
		try (PublishingOpenTelemetry openTelemetry = deterministic(OpenTelemetry.noop())) {
			openTelemetry.subscribe(new SpanTree(new PrintStream(bytes, true, StandardCharsets.UTF_8)));
			try (Scope scope = Telemetry.makeCurrent(openTelemetry)) {
				List<String> titles = List.of("Domain-Driven Design", " ", "Design Patterns");
				assertThat(Cataloging.catalog(titles)).isEqualTo(3);
			}
		}
		String tree = bytes.toString(StandardCharsets.UTF_8).replaceAll("\\(\\d+ ms\\)", "(n ms)");
		assertThat(tree)
			.contains("+ Catalog books {library.books=3}")
			.contains("  ! a book needs a title")
			.contains("  [2/3] Processed 2 of 3")
			.contains("- Catalog books (n ms)");
		// end::live-tree[]
		System.out.println(tree);
	}

	@Test
	void followOneOperation() {
		// tag::within[]
		try (PublishingOpenTelemetry openTelemetry = deterministic(OpenTelemetry.noop());
				Scope scope = Telemetry.makeCurrent(openTelemetry)) {
			Tracer tracer = openTelemetry.getTracer("org.example.telemetry");
			Span unrelated = tracer.spanBuilder("Unrelated").startSpan();
			Span operation = tracer.spanBuilder("Operation").startSpan();

			Started started = new Started();
			openTelemetry.within((PublishingSpan) operation).subscribe(started);   // <1>

			try (Scope operationScope = operation.makeCurrent()) {
				tracer.spanBuilder("Step").startSpan().end();                       // Seen
			}
			Context elsewhere = Context.current().with(unrelated);
			tracer.spanBuilder("Elsewhere").setParent(elsewhere).startSpan().end(); // Not seen
			operation.end();
			unrelated.end();
			assertThat(started.names).containsExactly("Step");
		}
		// end::within[]
	}

	@Test
	void continuesARemoteTrace() {
		// tag::propagation[]
		var propagating = OpenTelemetry.propagating(Telemetry.w3cPropagators());   // <1>
		var carrier = Map.of("traceparent", "00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01");
		String traceId = Propagation.continueTrace(propagating, carrier, () -> {
			Tracer tracer = Telemetry.tracer(Telemetry.current());
			Span span = tracer.spanBuilder("Handle request").startSpan();
			try {
				return span.getSpanContext().getTraceId();
			} finally {
				span.end();
			}
		});
		assertThat(traceId).isEqualTo("4bf92f3577b34da6a3ce929d0e0e4736");          // <2>
		// end::propagation[]
	}

	@Test
	void unitOfWorkMain() throws InterruptedException {
		UnitOfWork.main(new String[0]); // Asynchronous delivery; the tree waits for completion
	}

}
