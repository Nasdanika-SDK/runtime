package org.nasdanika.sdk.runtime.common.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.Transformer;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

/**
 * Instrumentation observed through a {@link PublishingOpenTelemetry} over the no-op instance: no SDK
 * is needed to see spans and log records live. Tests with an SDK are in the telemetry tests module.
 */
class TestInstrumentation {

	private static PublishingOpenTelemetry publishing() {
		return new PublishingOpenTelemetry(OpenTelemetry.noop(), new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 1024));
	}

	private static List<SpanEvent.Started> started(TestPublishingTracer.Collector collector, String name) {
		return collector.events.stream()
				.filter(SpanEvent.Started.class::isInstance)
				.map(SpanEvent.Started.class::cast)
				.filter(s -> s.name().equals(name))
				.toList();
	}

	private static List<SpanEvent.LogEmitted> logs(TestPublishingTracer.Collector collector, String eventName) {
		return collector.events.stream()
				.filter(SpanEvent.LogEmitted.class::isInstance)
				.map(SpanEvent.LogEmitted.class::cast)
				.filter(l -> eventName.equals(l.record().eventName()))
				.toList();
	}

	private static Optional<Object> attribute(TestPublishingTracer.Collector collector, PublishingSpan span, Object key) {
		return collector.events.stream()
				.filter(SpanEvent.AttributeSet.class::isInstance)
				.map(SpanEvent.AttributeSet.class::cast)
				.filter(a -> a.span() == span && a.key().equals(key))
				.map(SpanEvent.AttributeSet::value)
				.findFirst();
	}

	@Test
	void logRecordsArePublishedWithTheirSpan() {
		try (PublishingOpenTelemetry otel = publishing()) {
			TestPublishingTracer.Collector collector = new TestPublishingTracer.Collector();
			otel.subscribe(collector);
			try (Scope scope = Telemetry.makeCurrent(otel)) {
				assertThat(Telemetry.current()).isSameAs(otel);
				Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "work", null, span -> {
					Telemetry.log(Telemetry.logger(Telemetry.current()), Severity.INFO, null, "hello", null);
					return null;
				});
				Telemetry.log(Telemetry.logger(otel), Severity.INFO, null, "outside", null);
			}
			assertThat(Telemetry.current()).isSameAs(OpenTelemetry.noop());
			assertThat(collector.describe()).containsExactly("start work", "work log hello", "end work", "- log outside");
		}
	}

	@Test
	void resourcesAndStreams(@TempDir Path dir) throws IOException {
		URI uri = URI.createFileURI(dir.resolve("model.xmi").toString());
		try (PublishingOpenTelemetry otel = publishing()) {
			TestPublishingTracer.Collector collector = new TestPublishingTracer.Collector();
			otel.subscribe(collector);

			// Attached, not current: used by resources of the resource set
			ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure(otel);
			Resource resource = resourceSet.createResource(uri);
			EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
			ePackage.setName("test");
			resource.getContents().add(ePackage);
			resource.save(null);
			resource.unload();
			resource.load(null);
			assertThat(((EPackage) resource.getContents().get(0)).getName()).isEqualTo("test");

			assertThat(started(collector, "ResourceSetContributor.configure")).hasSize(1);
			assertThat(logs(collector, Telemetry.CONTRIBUTION_EVENT)).isNotEmpty();

			PublishingSpan save = started(collector, "Resource.save").getFirst().span();
			long saved = (Long) attribute(collector, save, Telemetry.IO_BYTES).orElseThrow();
			assertThat(saved).isPositive();
			PublishingSpan write = started(collector, "URIHandler.write").getFirst().span();
			assertThat(attribute(collector, write, Telemetry.IO_BYTES)).contains(saved);

			PublishingSpan load = started(collector, "Resource.load").getFirst().span();
			assertThat(attribute(collector, load, Telemetry.IO_BYTES)).contains(saved);
			assertThat(attribute(collector, load, Telemetry.RESOURCE_CONTENTS)).contains(1L);
			assertThat(started(collector, "URIHandler.read")).hasSize(1);
			assertThat(started(collector, "Resource.unload")).hasSize(1);
			assertThat(logs(collector, Telemetry.RESOURCE_LOADED_EVENT)).singleElement().satisfies(l -> assertThat(l.span()).isSameAs(load));
		}
	}

	@Test
	void transformerSpansFollowDependencies() {
		try (PublishingOpenTelemetry otel = publishing(); Scope scope = Telemetry.makeCurrent(otel)) {
			TestPublishingTracer.Collector collector = new TestPublishingTracer.Collector();
			otel.subscribe(collector);

			Transformer<String, String> transformer = new Transformer<>((source, context) -> {
				if (source.equals("a")) {
					context.get("b");
				}
				return Flows.of(source.toUpperCase());
			});
			Map<String, List<String>> results = transformer.transform(List.of("a"));
			assertThat(results).containsEntry("a", List.of("A")).containsEntry("b", List.of("B"));

			PublishingSpan transform = started(collector, "Transformer.transform").getFirst().span();
			List<SpanEvent.Started> creates = started(collector, "Transformer.create");
			assertThat(creates).hasSize(2);
			SpanEvent.Started a = creates.get(0);
			SpanEvent.Started b = creates.get(1);
			assertThat(a.attributes().get(Telemetry.TRANSFORMER_SOURCE)).isEqualTo("a");
			assertThat(b.attributes().get(Telemetry.TRANSFORMER_SOURCE)).isEqualTo("b");
			assertThat(a.span().getParent()).isSameAs(transform);
			assertThat(b.span().getParent()).isSameAs(a.span());
			assertThat(a.span().isEnded()).isTrue();
			assertThat(attribute(collector, transform, Telemetry.TRANSFORMER_TARGETS)).contains(2L);
		}
	}

	@Test
	void pumpPropagatesContextToItsDrainer() {
		try (PublishingOpenTelemetry otel = publishing(); Scope scope = Telemetry.makeCurrent(otel)) {
			Pump pump = new Pump(Pump.Options.DEFAULT.withExecutor(Pump.Options.VIRTUAL_THREADS));
			CompletableFuture<Span> current = new CompletableFuture<>();
			CompletableFuture<OpenTelemetry> openTelemetry = new CompletableFuture<>();
			Span span = Telemetry.tracer(otel).spanBuilder("enqueuing").startSpan();
			try (Scope spanScope = span.makeCurrent()) {
				pump.execute(() -> {
					current.complete(Span.current());
					openTelemetry.complete(Telemetry.current());
				});
			} finally {
				span.end();
			}
			assertThat(current.join()).isSameAs(span);
			assertThat(openTelemetry.join()).isSameAs(otel);
		}
	}

}
