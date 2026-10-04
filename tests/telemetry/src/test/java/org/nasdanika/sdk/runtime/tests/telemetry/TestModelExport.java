package org.nasdanika.sdk.runtime.tests.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelLogRecordExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelMetricExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelSpanExporter;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;

/**
 * The root command of {@link TestFileExport}, exporting traces, logs and metrics to the telemetry
 * model instead of OTLP JSON lines: one resource per signal, saved in each format the runtime
 * contributes, then loaded back and checked like the in-memory exports of
 * {@link TestInstrumentationTelemetry}. Log records emitted in spans are added to the spans, the
 * rest go to the logs.
 *
 * <p>
 * The telemetry resources are created in a resource set configured before the instance is made
 * current and without an attached instance, so saving them at shutdown is not traced.
 */
class TestModelExport {

	private static final String SCOPE = "org.nasdanika.sdk.cli";

	private static final AttributeKey<String> SERVICE_NAME = AttributeKey.stringKey("service.name");

	@Test
	void json() throws IOException {
		rootCommand("json");
	}

	@Test
	void xmi() throws IOException {
		rootCommand("xmi");
	}

	@Test
	void binary() throws IOException {
		rootCommand("ebin");
	}

	@Test
	void compressedBinary() throws IOException {
		rootCommand("egz");
	}

	/**
	 * Builds the instance. The SDK owns the exporters, and the exporters own the telemetry
	 * resources: shutting the SDK down exports what is pending and saves them. The log record exporter
	 * is linked to the span exporter.
	 */
	static OpenTelemetrySdk openTelemetry(Resource traces, Resource logs, Resource metrics, String serviceName) {
		io.opentelemetry.sdk.resources.Resource resource = io.opentelemetry.sdk.resources.Resource.getDefault()
				.merge(io.opentelemetry.sdk.resources.Resource.create(Attributes.of(SERVICE_NAME, serviceName)));

		ModelSpanExporter spanExporter = new ModelSpanExporter(traces);
		return OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder()
						.setResource(resource)
						.addSpanProcessor(BatchSpanProcessor.builder(spanExporter).build())
						.build())
				.setLoggerProvider(SdkLoggerProvider.builder()
						.setResource(resource)
						.addLogRecordProcessor(BatchLogRecordProcessor.builder(new ModelLogRecordExporter(logs, spanExporter)).build())
						.build())
				.setMeterProvider(SdkMeterProvider.builder()
						.setResource(resource)
						.registerMetricReader(PeriodicMetricReader.builder(new ModelMetricExporter(metrics)).build())
						.build())
				.build();
	}

	private static void rootCommand(String extension) throws IOException {
		Path dir = Path.of("target", "telemetry", "model-export", extension);
		Files.createDirectories(dir);
		URI tracesURI = uri(dir, "traces." + extension);
		URI logsURI = uri(dir, "logs." + extension);
		URI metricsURI = uri(dir, "metrics." + extension);
		URI modelURI = uri(dir, "model.xmi");

		NasdanikaResourceSet telemetryResourceSet = NasdanikaResourceSet.createAndConfigure();

		// Resources close in reverse order: the scope first, then the SDK, which saves the telemetry
		try (OpenTelemetrySdk openTelemetry = openTelemetry(
						telemetryResourceSet.createResource(tracesURI),
						telemetryResourceSet.createResource(logsURI),
						telemetryResourceSet.createResource(metricsURI),
						"nsdk");
				Scope telemetryScope = Telemetry.makeCurrent(openTelemetry)) {

			Tracer tracer = openTelemetry.getTracer(SCOPE);
			Logger logger = openTelemetry.getLogsBridge().get(SCOPE);
			Meter meter = openTelemetry.getMeter(SCOPE);

			Telemetry.log(logger, Severity.INFO, null, "Starting the root command", null);

			io.opentelemetry.api.trace.Span span = tracer.spanBuilder("nsdk").setAttribute("nasdanika.command.args", "model save").startSpan();
			try (Scope spanScope = span.makeCurrent()) {
				Telemetry.log(logger, Severity.INFO, null, "Hello from the root command", null);

				// Instrumented runtime code reports to the current instance
				NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
				Resource resource = resourceSet.createResource(modelURI);
				EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
				ePackage.setName("root");
				resource.getContents().add(ePackage);
				resource.save(null);

				meter.counterBuilder("nsdk.models.saved").build().add(1);
				meter.histogramBuilder("nsdk.model.size").setUnit("By").build().record(Files.size(dir.resolve("model.xmi")));

				span.setStatus(io.opentelemetry.api.trace.StatusCode.OK);
			} catch (IOException | RuntimeException e) {
				Telemetry.recordFailure(span, e);
				throw e;
			} finally {
				span.end();
			}
		}

		// --- Traces ---
		List<Span> spans = load(tracesURI, TracesData.class).getResourceSpans().stream()
				.peek(rs -> assertThat(attribute(rs.getResource().getAttributes(), SERVICE_NAME.getKey()).getStringValue()).isEqualTo("nsdk"))
				.flatMap(rs -> rs.getScopeSpans().stream())
				.flatMap(ss -> ss.getSpans().stream())
				.toList();

		Span root = span(spans, "nsdk");
		assertThat(root.getParentSpanId()).isNull();
		assertThat(root.getStatus().getCode()).isEqualTo(StatusCode.STATUS_CODE_OK);
		assertThat(attribute(root.getAttributes(), "nasdanika.command.args").getStringValue()).isEqualTo("model save");

		Span save = span(spans, "Resource.save");
		assertThat(save.getTraceId()).isEqualTo(root.getTraceId());
		assertThat(save.getParentSpanId()).isEqualTo(root.getSpanId());
		long bytes = attribute(save.getAttributes(), Telemetry.IO_BYTES.getKey()).getIntValue();
		assertThat(bytes).isEqualTo(Files.size(dir.resolve("model.xmi")));
		assertThat(attribute(span(spans, "URIHandler.write").getAttributes(), Telemetry.IO_BYTES.getKey()).getIntValue()).isEqualTo(bytes);
		assertThat(spans).extracting(Span::getName).contains("ResourceSetContributor.configure");

		// --- Logs ---
		// Log records emitted in a span are added to it
		assertThat(root.getLogRecords()).hasSize(2).allSatisfy(l -> assertThat(l.getSpanId()).isEqualTo(root.getSpanId()));
		assertThat(root.getLogRecords().get(0).getBody().getStringValue()).isEqualTo("Hello from the root command");
		assertThat(root.getLogRecords().get(1).getEventName()).isEqualTo(Telemetry.RESOURCE_CREATED_EVENT);
		assertThat(save.getLogRecords()).extracting(LogRecord::getEventName).containsExactly(Telemetry.RESOURCE_SAVED_EVENT);
		assertThat(span(spans, "ResourceSetContributor.configure").getLogRecords())
				.isNotEmpty()
				.allSatisfy(l -> assertThat(l.getEventName()).isEqualTo(Telemetry.CONTRIBUTION_EVENT));

		// The rest go to the logs
		List<LogRecord> logs = load(logsURI, LogsData.class).getResourceLogs().stream()
				.flatMap(rl -> rl.getScopeLogs().stream())
				.flatMap(sl -> sl.getLogRecords().stream())
				.toList();
		assertThat(logs).singleElement().satisfies(l -> {
			assertThat(l.getBody().getStringValue()).isEqualTo("Starting the root command");
			assertThat(l.getSpanId()).isNull();
		});

		// --- Metrics ---
		MetricsData metrics = load(metricsURI, MetricsData.class);
		Sum saved = (Sum) metric(metrics, "nsdk.models.saved");
		assertThat(saved.getDataPoints()).singleElement().satisfies(p -> assertThat(p.getAsInt()).isEqualTo(1L));
		Histogram size = (Histogram) metric(metrics, "nsdk.model.size");
		assertThat(size.getDataPoints()).singleElement().satisfies(p -> {
			assertThat(p.getSum()).isEqualTo((double) bytes);
			assertThat(p.getBucketCounts().stream().mapToLong(Long::longValue).sum()).isEqualTo(1);
		});
	}

	private static URI uri(Path dir, String name) {
		return URI.createFileURI(dir.resolve(name).toAbsolutePath().toString());
	}

	/**
	 * Loads in a new resource set, as a reader of the telemetry would.
	 */
	private static <T extends EObject> T load(URI uri, Class<T> type) {
		Resource resource = NasdanikaResourceSet.createAndConfigure().getResource(uri, true);
		assertThat(resource.getContents()).singleElement().isInstanceOf(type);
		return type.cast(resource.getContents().getFirst());
	}

	private static Span span(List<Span> spans, String name) {
		List<Span> named = spans.stream().filter(s -> s.getName().equals(name)).toList();
		assertThat(named).as(name).hasSize(1);
		return named.getFirst();
	}

	private static AnyValue attribute(List<KeyValue> attributes, String key) {
		return attributes.stream()
				.filter(kv -> kv.getKey().equals(key))
				.map(KeyValue::getValue)
				.findFirst()
				.orElseThrow(() -> new AssertionError("No attribute " + key));
	}

	private static Metric metric(MetricsData data, String name) {
		return data.getResourceMetrics().stream()
				.flatMap(r -> r.getScopeMetrics().stream())
				.flatMap(s -> s.getMetrics().stream())
				.filter(m -> m.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new AssertionError("No metric " + name));
	}

}
