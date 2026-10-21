package org.nasdanika.sdk.runtime.common.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Flow;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;

/**
 * Telemetry: one OpenTelemetry per unit of work, and spans watched live without an SDK.
 */
class TelemetryTests {

	// tag::watcher[]
	static final class Watcher implements Flow.Subscriber<SpanEvent> {

		final List<String> lines = Collections.synchronizedList(new ArrayList<>());

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(SpanEvent event) {
			switch (event) { // <1>
				case SpanEvent.Started started -> lines.add("start " + started.name());
				case SpanEvent.Ended ended -> lines.add("end " + ended.span().getName());
				case SpanEvent.LogEmitted log -> lines.add("log " + log.record().bodyAsString());
				default -> {}
			}
		}

		@Override
		public void onError(Throwable throwable) {
			throw new AssertionError(throwable);
		}

		@Override
		public void onComplete() {
			// Nothing to release
		}

	}
	// end::watcher[]

	/**
	 * Delivers span events on the calling thread, so that a test sees them at once.
	 */
	static PublishingOpenTelemetry publishing() {
		TracerProvider noop = TracerProvider.noop();
		return new PublishingOpenTelemetry(
			OpenTelemetry.noop(),
			new PublishingTracerProvider(noop, Runnable::run, 1024));
	}

	@Test
	void unitOfWork() {
		// tag::unit-of-work[]
		try (PublishingOpenTelemetry otel = publishing(); Scope scope = Telemetry.makeCurrent(otel)) {
			Watcher watcher = new Watcher();
			otel.subscribe(watcher); // <1>

			OpenTelemetry current = Telemetry.current(); // <2>
			Telemetry.inSpan(Telemetry.tracer(current), "import", null, span -> { // <3>
				Telemetry.log(Telemetry.logger(current), Severity.INFO, null, "two files", null);
				return null;
			});

			assertThat(watcher.lines).containsExactly("start import", "log two files", "end import");
		}
		// end::unit-of-work[]
	}

	@Test
	void resources(@TempDir Path dir) throws Exception {
		// tag::resources[]
		try (PublishingOpenTelemetry otel = publishing()) {
			Watcher watcher = new Watcher();
			otel.subscribe(watcher);

			ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(otel); // <1>
			URI uri = URI.createFileURI(dir.resolve("library.xmi").toString());
			Resource resource = resourceSet.createResource(uri);
			EPackage library = EcoreFactory.eINSTANCE.createEPackage();
			library.setName("library");
			resource.getContents().add(library);
			resource.save(null);

			assertThat(watcher.lines).contains(
				"start ResourceSetContributor.configure",
				"start Resource.save",
				"start URIHandler.write", // <2>
				"end URIHandler.write",
				"end Resource.save");
		}
		// end::resources[]
	}

	@Test
	void propagation() {
		// tag::propagation[]
		OpenTelemetry otel = OpenTelemetry.propagating(Telemetry.w3cPropagators());
		Map<String, String> environment = Map.of(
			"TRACEPARENT", "00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01");
		Context parent = Telemetry.extract(otel, Context.root(), environment); // <1>
		assertThat(Span.fromContext(parent).getSpanContext().getTraceId())
			.isEqualTo("4bf92f3577b34da6a3ce929d0e0e4736");
		// end::propagation[]
	}

}
