package org.nasdanika.sdk.runtime.groovy.tests.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.nasdanika.sdk.runtime.groovy.tests.book.LanguageTests.uri;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.groovy.dsl.DslTelemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

/**
 * Errors with the line they were authored on, and the spans of a load.
 */
public class DiagnosticsTests {

	@Test
	public void unresolvedReference() {
		// tag::error[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		assertThatThrownBy(() -> resourceSet.getResource(uri("broken.ecore.groovy"), true))
			.hasRootCauseMessage("Cannot resolve segment '@eClassifiers[name='Book']'"
					+ " in '/eClassifiers[name='Book']'") // <1>
			.hasStackTraceContaining("broken.ecore.groovy:8: Cannot resolve"); // <2>
		// end::error[]
	}

	/**
	 * The started spans, indented by depth, with the script line where there is one.
	 */
	static String outline(List<SpanEvent.Started> started) {
		StringBuilder outline = new StringBuilder();
		int base = depth(started.getFirst().span());
		for (SpanEvent.Started span: started) {
			outline.append("  ".repeat(depth(span.span()) - base)).append(span.name());
			Long line = span.attributes().get(DslTelemetry.LINE);
			if (line != null) {
				outline.append(" (line ").append(line).append(')');
			}
			outline.append('\n');
		}
		return outline.toString();
	}

	static int depth(PublishingSpan span) {
		int depth = 0;
		for (PublishingSpan p = span.getParent(); p != null; p = p.getParent()) {
			++depth;
		}
		return depth;
	}

	@Test
	public void spans() throws IOException {
		// tag::spans[]
		List<SpanEvent.Started> started = new ArrayList<>();
		try (PublishingOpenTelemetry otel = new PublishingOpenTelemetry(
				OpenTelemetry.noop(),
				new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 1024));
				Scope scope = Telemetry.makeCurrent(otel)) { // <1>
			otel.subscribe(new Flow.Subscriber<SpanEvent>() {

				@Override
				public void onSubscribe(Flow.Subscription subscription) {
					subscription.request(Long.MAX_VALUE);
				}

				@Override
				public void onNext(SpanEvent event) {
					if (event instanceof SpanEvent.Started s) {
						started.add(s);
					}
				}

				@Override
				public void onError(Throwable throwable) {}

				@Override
				public void onComplete() {}

			});
			ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
			resourceSet.getResource(uri("tiny.ecore.groovy"), true);
		}
		List<SpanEvent.Started> load = started.stream()
			.dropWhile(s -> !s.name().equals("Compiling script"))
			.toList();
		assertThat(outline(load)).isEqualTo(resource("tiny-spans.txt")); // <2>
		// end::spans[]
	}

	static String resource(String name) throws IOException {
		try (InputStream in = DiagnosticsTests.class.getResourceAsStream(name)) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8).replace("\r\n", "\n");
		}
	}

}
