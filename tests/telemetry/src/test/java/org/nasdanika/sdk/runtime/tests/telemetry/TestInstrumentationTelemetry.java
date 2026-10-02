package org.nasdanika.sdk.runtime.tests.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.PumpedPublisher;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.logs.export.SimpleLogRecordProcessor;
import io.opentelemetry.sdk.testing.exporter.InMemoryLogRecordExporter;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;

/**
 * Runtime instrumentation recorded by an SDK with in-memory exporters, one instance per test.
 */
class TestInstrumentationTelemetry {

	private InMemorySpanExporter spans;
	private InMemoryLogRecordExporter logs;
	private OpenTelemetrySdk openTelemetry;
	private Scope scope;

	@BeforeEach
	void setUp() {
		spans = InMemorySpanExporter.create();
		logs = InMemoryLogRecordExporter.create();
		openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder().addSpanProcessor(SimpleSpanProcessor.create(spans)).build())
				.setLoggerProvider(SdkLoggerProvider.builder().addLogRecordProcessor(SimpleLogRecordProcessor.create(logs)).build())
				.build();
		scope = Telemetry.makeCurrent(openTelemetry);
	}

	@AfterEach
	void tearDown() {
		scope.close();
		openTelemetry.close();
	}

	private List<SpanData> spans(String name) {
		return spans.getFinishedSpanItems().stream().filter(s -> s.getName().equals(name)).toList();
	}

	private SpanData span(String name) {
		List<SpanData> named = spans(name);
		assertThat(named).as(name).hasSize(1);
		return named.getFirst();
	}

	private List<LogRecordData> logs(String eventName) {
		return logs.getFinishedLogRecordItems().stream().filter(l -> eventName.equals(l.getEventName())).toList();
	}

	@Test
	void jsonResource(@TempDir Path dir) throws IOException {
		URI uri = URI.createFileURI(dir.resolve("model.json").toString());

		NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource resource = resourceSet.createResource(uri);
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("json");
		resource.getContents().add(ePackage);
		resource.save(null);

		NasdanikaResourceSet loadingResourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource loaded = loadingResourceSet.getResource(uri, true);
		assertThat(((EPackage) loaded.getContents().getFirst()).getName()).isEqualTo("json");

		assertThat(spans("ResourceSetContributor.configure")).hasSize(2);
		assertThat(logs(Telemetry.CONTRIBUTION_EVENT))
				.anySatisfy(l -> assertThat(l.getAttributes().get(Telemetry.CONTRIBUTION)).endsWith("JsonResourceFactoryContributor"));

		SpanData save = span("Resource.save");
		assertThat(save.getAttributes().get(Telemetry.RESOURCE_TYPE)).isEqualTo("org.eclipse.emfcloud.jackson.resource.JsonResource");
		long bytes = save.getAttributes().get(Telemetry.IO_BYTES);
		assertThat(bytes).isPositive();
		assertThat(span("URIHandler.write").getAttributes().get(Telemetry.IO_BYTES)).isEqualTo(bytes);

		SpanData load = span("Resource.load");
		assertThat(load.getAttributes().get(Telemetry.IO_BYTES)).isEqualTo(bytes);
		assertThat(load.getAttributes().get(Telemetry.RESOURCE_CONTENTS)).isEqualTo(1L);
		assertThat(span("URIHandler.read").getAttributes().get(Telemetry.IO_BYTES)).isEqualTo(bytes);

		// Log records are correlated with the span they were emitted in
		assertThat(logs(Telemetry.RESOURCE_LOADED_EVENT)).singleElement()
				.satisfies(l -> assertThat(l.getSpanContext()).isEqualTo(load.getSpanContext()));
		assertThat(logs(Telemetry.RESOURCE_CREATED_EVENT)).hasSize(2);
	}

	/**
	 * A publisher driven by the test, so that items are emitted on the test thread, in the span the
	 * test makes current.
	 */
	private static final class ManualPublisher implements Flow.Publisher<String> {

		volatile Flow.Subscriber<? super String> subscriber;
		final CountDownLatch requested = new CountDownLatch(1);

		@Override
		public void subscribe(Flow.Subscriber<? super String> subscriber) {
			this.subscriber = subscriber;
			subscriber.onSubscribe(new Flow.Subscription() {

				@Override
				public void request(long n) {
					requested.countDown();
				}

				@Override
				public void cancel() {
					// Nothing to release
				}

			});
		}

	}

	/**
	 * An item emitted in one span and processed by a subscriber in another: the processing span is
	 * a child of the subscriber's span and links to the emitter's.
	 */
	@Test
	void pumpedPublisherLinksTheEmittingSpan() throws InterruptedException {
		Tracer tracer = Telemetry.tracer(openTelemetry);
		Pump pump = new Pump(Pump.Options.DEFAULT.withIdlePolicy(Pump.IdlePolicy.WAIT).withExecutor(Pump.Options.VIRTUAL_THREADS));
		ManualPublisher source = new ManualPublisher();
		PumpedPublisher<String> pumped = PumpedPublisher.of(source, pump);
		List<String> received = new CopyOnWriteArrayList<>();
		CountDownLatch completed = new CountDownLatch(1);

		Span consumer = tracer.spanBuilder("consumer").startSpan();
		try (Scope consumerScope = consumer.makeCurrent()) {
			pumped.subscribe(new Flow.Subscriber<String>() {

				@Override
				public void onSubscribe(Flow.Subscription subscription) {
					subscription.request(Long.MAX_VALUE);
				}

				@Override
				public void onNext(String item) {
					received.add(item);
					Telemetry.log(Telemetry.logger(Telemetry.current()), Severity.INFO, null, "Processing " + item, null);
				}

				@Override
				public void onError(Throwable throwable) {
					completed.countDown();
				}

				@Override
				public void onComplete() {
					completed.countDown();
				}

			});
		} finally {
			consumer.end();
		}
		assertThat(source.requested.await(10, TimeUnit.SECONDS)).isTrue();

		Span producer = tracer.spanBuilder("producer").setNoParent().startSpan();
		try (Scope producerScope = producer.makeCurrent()) {
			source.subscriber.onNext("a");
			source.subscriber.onNext("b");
		} finally {
			producer.end();
		}
		source.subscriber.onComplete();
		assertThat(completed.await(10, TimeUnit.SECONDS)).isTrue();

		assertThat(received).containsExactly("a", "b");
		SpanData consumerData = span("consumer");
		SpanContext producerContext = span("producer").getSpanContext();
		List<SpanData> processing = spans("PumpedPublisher.onNext");
		assertThat(processing).hasSize(2).allSatisfy(p -> {
			assertThat(p.getParentSpanContext()).isEqualTo(consumerData.getSpanContext());
			assertThat(p.getLinks()).singleElement().satisfies(link -> assertThat(link.getSpanContext()).isEqualTo(producerContext));
		});
		assertThat(logs.getFinishedLogRecordItems().stream().filter(l -> String.valueOf(l.getBodyValue()).contains("Processing")))
				.extracting(LogRecordData::getSpanContext)
				.containsExactlyInAnyOrderElementsOf(processing.stream().map(SpanData::getSpanContext).toList());
	}

	@Test
	void capabilityLoaderSpans() {
		CapabilityFactory<Object, Object> factory = new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return requirement instanceof String;
			}

			@Override
			public Flow.Publisher<CapabilityProvider<Object>> create(Object requirement, Loader loader) {
				return Flows.of(CapabilityProvider.of("capability for " + requirement));
			}

		};

		List<Object> capabilities = CapabilityLoader.of(factory).loadAll("req");
		assertThat(capabilities).containsExactly("capability for req");

		SpanData loadAll = span("CapabilityLoader.loadAll");
		SpanData create = span("Transformer.create");
		SpanData factoryCreate = span("CapabilityFactory.create");
		assertThat(loadAll.getAttributes().get(Telemetry.CAPABILITY_REQUIREMENT)).isEqualTo("req");
		assertThat(create.getParentSpanContext()).isEqualTo(loadAll.getSpanContext());
		assertThat(factoryCreate.getParentSpanContext()).isEqualTo(create.getSpanContext());
		assertThat(factoryCreate.getAttributes().get(Telemetry.CAPABILITY_PROVIDERS)).isEqualTo(1L);
	}

	/**
	 * Publishing over an SDK: subscribers watch log records live with their spans, and the SDK
	 * exports the same records.
	 */
	@Test
	void publishingOverTheSdk() {
		try (PublishingOpenTelemetry publishing = new PublishingOpenTelemetry(openTelemetry); Scope publishingScope = Telemetry.makeCurrent(publishing)) {
			List<SpanEvent> events = new CopyOnWriteArrayList<>();
			CountDownLatch ended = new CountDownLatch(1);
			publishing.subscribe(new Flow.Subscriber<SpanEvent>() {

				@Override
				public void onSubscribe(Flow.Subscription subscription) {
					subscription.request(Long.MAX_VALUE);
				}

				@Override
				public void onNext(SpanEvent item) {
					events.add(item);
					if (item instanceof SpanEvent.Ended) {
						ended.countDown();
					}
				}

				@Override
				public void onError(Throwable throwable) {
					// Not expected
				}

				@Override
				public void onComplete() {
					// Nothing to do
				}

			});

			Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "work", null, span -> {
				Telemetry.log(Telemetry.logger(Telemetry.current()), Severity.INFO, "test.event", "watched", null);
				return null;
			});
			assertThat(awaitQuietly(ended)).isTrue();

			SpanData work = span("work");
			assertThat(events).filteredOn(SpanEvent.LogEmitted.class::isInstance).singleElement().satisfies(e -> {
				SpanEvent.LogEmitted log = (SpanEvent.LogEmitted) e;
				assertThat(log.span().getName()).isEqualTo("work");
				assertThat(log.record().spanContext()).isEqualTo(work.getSpanContext());
				assertThat(log.record().bodyAsString()).isEqualTo("watched");
			});
			assertThat(logs("test.event")).singleElement().satisfies(l -> assertThat(l.getSpanContext()).isEqualTo(work.getSpanContext()));
		}
	}

	private static boolean awaitQuietly(CountDownLatch latch) {
		try {
			return latch.await(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}
	}

}
