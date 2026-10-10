package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData;
import org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind;
import org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.SimpleLogRecordProcessor;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentSelector;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.View;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;

/**
 * Model exporters with XMI resources.
 */
class TestModelExporters {

	private static final String SCOPE = "org.nasdanika.sdk.runtime.models.telemetry.exporters.test";

	private static final io.opentelemetry.sdk.resources.Resource SDK_RESOURCE = io.opentelemetry.sdk.resources.Resource.create(
			Attributes.of(AttributeKey.stringKey("service.name"), "exporters-test"));

	private static ResourceSet resourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		return resourceSet;
	}

	private static URI uri(Path dir, String name) {
		return URI.createFileURI(dir.resolve(name).toAbsolutePath().toString());
	}

	private static OpenTelemetrySdk openTelemetry(ModelSpanExporter spans, ModelLogRecordExporter logs, ModelMetricExporter metrics) {
		return OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder()
						.setResource(SDK_RESOURCE)
						.addSpanProcessor(SimpleSpanProcessor.create(spans))
						.build())
				.setLoggerProvider(SdkLoggerProvider.builder()
						.setResource(SDK_RESOURCE)
						.addLogRecordProcessor(SimpleLogRecordProcessor.create(logs))
						.build())
				.setMeterProvider(SdkMeterProvider.builder()
						.setResource(SDK_RESOURCE)
						// The reader exports at shutdown, before the exporter saves
						.registerMetricReader(PeriodicMetricReader.builder(metrics).build())
						.registerView(
								InstrumentSelector.builder().setName("exponential").build(),
								View.builder().setAggregation(Aggregation.base2ExponentialBucketHistogram()).build())
						.build())
				.build();
	}

	/**
	 * Records a parent span with a child, an event, a link and an error, a log record in each span,
	 * log records outside of exported spans, and a counter, a histogram, an exponential histogram
	 * and a gauge.
	 */
	private static void record(OpenTelemetry openTelemetry) {
		Tracer tracer = openTelemetry.getTracer(SCOPE, "1.0");
		Logger logger = openTelemetry.getLogsBridge().get(SCOPE);
		Meter meter = openTelemetry.getMeter(SCOPE);

		logger.logRecordBuilder().setBody("no span").emit();

		// Sampled, but never exported to the span exporter: pending until shutdown
		try (Scope orphanScope = io.opentelemetry.api.trace.Span.wrap(SpanContext.create("0af7651916cd43dd8448eb211c80319c", "b7ad6b7169203331", TraceFlags.getSampled(), TraceState.getDefault())).makeCurrent()) {
			logger.logRecordBuilder().setBody("orphan").emit();
		}

		try (Scope unsampledScope = io.opentelemetry.api.trace.Span.wrap(SpanContext.create("0af7651916cd43dd8448eb211c80319d", "b7ad6b7169203332", TraceFlags.getDefault(), TraceState.getDefault())).makeCurrent()) {
			logger.logRecordBuilder().setBody("unsampled").emit();
		}

		io.opentelemetry.api.trace.Span parent = tracer.spanBuilder("parent")
				.setSpanKind(io.opentelemetry.api.trace.SpanKind.SERVER)
				.setAttribute("string", "text")
				.setAttribute("boolean", true)
				.setAttribute("long", 42L)
				.setAttribute("double", 2.5)
				.setAttribute(AttributeKey.stringArrayKey("strings"), List.of("a", "b"))
				.setAttribute(AttributeKey.longArrayKey("longs"), List.of(1L, 1L, 2L))
				.startSpan();
		try (Scope parentScope = parent.makeCurrent()) {
			io.opentelemetry.api.trace.Span child = tracer.spanBuilder("child")
					.addLink(parent.getSpanContext(), Attributes.of(AttributeKey.stringKey("link"), "to parent"))
					.startSpan();
			try (Scope childScope = child.makeCurrent()) {
				child.addEvent("event", Attributes.of(AttributeKey.longKey("n"), 1L));
				logger.logRecordBuilder()
						.setSeverity(Severity.WARN)
						.setSeverityText("WARN")
						.setEventName("test.event")
						.setBody(Value.of(Value.of("x"), Value.of(3L)))
						.setAttribute(AttributeKey.stringKey("key"), "value")
						.emit();
				child.recordException(new IllegalStateException("Boom"));
				child.setStatus(io.opentelemetry.api.trace.StatusCode.ERROR, "Failed");
			} finally {
				child.end();
			}
			logger.logRecordBuilder().setBody("in parent").emit();
		} finally {
			parent.end();
		}

		LongCounter counter = meter.counterBuilder("counter").setUnit("1").setDescription("A counter").build();
		counter.add(3, Attributes.of(AttributeKey.stringKey("kind"), "a"));
		counter.add(4, Attributes.of(AttributeKey.stringKey("kind"), "b"));

		// Explicit buckets [0, 5, 10, 25, ...]: most buckets stay at zero, so counts repeat
		DoubleHistogram histogram = meter.histogramBuilder("histogram").setUnit("ms").build();
		histogram.record(7);
		histogram.record(8);
		histogram.record(30);

		DoubleHistogram exponential = meter.histogramBuilder("exponential").build();
		exponential.record(1);
		exponential.record(100);

		meter.gaugeBuilder("gauge").buildWithCallback(m -> m.record(0.75));
	}

	private static <T extends EObject> T load(URI uri, Class<T> type) {
		Resource resource = resourceSet().getResource(uri, true);
		assertThat(resource.getContents()).singleElement().isInstanceOf(type);
		return type.cast(resource.getContents().getFirst());
	}

	private static AnyValue attribute(List<KeyValue> attributes, String key) {
		return attributes.stream()
				.filter(kv -> kv.getKey().equals(key))
				.map(KeyValue::getValue)
				.findFirst()
				.orElseThrow(() -> new AssertionError("No attribute " + key));
	}

	private static List<String> bodies(LogsData logs) {
		return logs.getResourceLogs().stream()
				.flatMap(r -> r.getScopeLogs().stream())
				.flatMap(s -> s.getLogRecords().stream())
				.map(l -> l.getBody().getStringValue())
				.toList();
	}

	private static Metric metric(MetricsData data, String name) {
		return data.getResourceMetrics().stream()
				.flatMap(r -> r.getScopeMetrics().stream())
				.flatMap(s -> s.getMetrics().stream())
				.filter(m -> m.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new AssertionError("No metric " + name));
	}

	@Test
	void exportToXmiResources(@TempDir Path dir) throws IOException {
		URI tracesURI = uri(dir, "traces.xmi");
		URI logsURI = uri(dir, "logs.xmi");
		URI metricsURI = uri(dir, "metrics.xmi");

		ResourceSet resourceSet = resourceSet();
		ModelSpanExporter spanExporter = new ModelSpanExporter(resourceSet.createResource(tracesURI));
		try (OpenTelemetrySdk openTelemetry = openTelemetry(
				spanExporter,
				new ModelLogRecordExporter(resourceSet.createResource(logsURI), spanExporter),
				new ModelMetricExporter(resourceSet.createResource(metricsURI)))) {
			record(openTelemetry);
		}

		// --- Traces ---
		TracesData traces = load(tracesURI, TracesData.class);
		assertThat(traces.getResourceSpans()).singleElement()
				.satisfies(rs -> assertThat(attribute(rs.getResource().getAttributes(), "service.name").getStringValue()).isEqualTo("exporters-test"));
		assertThat(traces.getResourceSpans().getFirst().getScopeSpans()).singleElement()
				.satisfies(ss -> {
					assertThat(ss.getScope().getName()).isEqualTo(SCOPE);
					assertThat(ss.getScope().getVersion()).isEqualTo("1.0");
				});
		List<Span> spans = traces.getResourceSpans().getFirst().getScopeSpans().getFirst().getSpans();
		// The child ended first, and was moved to the parent when it was exported
		assertThat(spans).extracting(Span::getName).containsExactly("parent");
		Span parent = spans.getFirst();
		assertThat(parent.getChildren()).extracting(Span::getName).containsExactly("child");
		Span child = parent.getChildren().getFirst();
		assertThat(child.getChildren()).isEmpty();
		assertThat(parent.getKind()).isEqualTo(SpanKind.SPAN_KIND_SERVER);
		assertThat(parent.getParentSpanId()).isNull();
		assertThat(parent.getTraceId()).hasSize(32);
		assertThat(parent.getSpanId()).hasSize(16);
		assertThat(parent.getEndTimeUnixNano()).isGreaterThanOrEqualTo(parent.getStartTimeUnixNano()).isPositive();
		assertThat(attribute(parent.getAttributes(), "string").getStringValue()).isEqualTo("text");
		assertThat(attribute(parent.getAttributes(), "boolean").getBoolValue()).isTrue();
		assertThat(attribute(parent.getAttributes(), "long").getIntValue()).isEqualTo(42L);
		assertThat(attribute(parent.getAttributes(), "double").getDoubleValue()).isEqualTo(2.5);
		assertThat(attribute(parent.getAttributes(), "strings").getArrayValue()).extracting(AnyValue::getStringValue).containsExactly("a", "b");
		assertThat(attribute(parent.getAttributes(), "longs").getArrayValue()).extracting(AnyValue::getIntValue).containsExactly(1L, 1L, 2L);
		assertThat(parent.getStatus().getCode()).isEqualTo(StatusCode.STATUS_CODE_UNSET);
		assertThat(parent.getFlags() & 0x1).as("sampled").isEqualTo(0x1);
		assertThat(parent.getFlags() & 0x300).as("parent known to be local").isEqualTo(0x100);

		assertThat(child.getTraceId()).isEqualTo(parent.getTraceId());
		assertThat(child.getParentSpanId()).isEqualTo(parent.getSpanId());
		assertThat(child.getKind()).isEqualTo(SpanKind.SPAN_KIND_INTERNAL);
		assertThat(child.getStatus().getCode()).isEqualTo(StatusCode.STATUS_CODE_ERROR);
		assertThat(child.getStatus().getMessage()).isEqualTo("Failed");
		assertThat(child.getEvents()).extracting(e -> e.getName()).containsExactly("event", "exception");
		assertThat(attribute(child.getEvents().get(1).getAttributes(), "exception.message").getStringValue()).isEqualTo("Boom");
		assertThat(child.getLinks()).singleElement().satisfies(l -> {
			assertThat(l.getSpanId()).isEqualTo(parent.getSpanId());
			assertThat(attribute(l.getAttributes(), "link").getStringValue()).isEqualTo("to parent");
		});

		// --- Logs ---
		// Pending until the span ended, then added to it
		LogRecord log = child.getLogRecords().getFirst();
		assertThat(child.getLogRecords()).hasSize(1);
		assertThat(log.getSeverityNumber()).isEqualTo(SeverityNumber.SEVERITY_NUMBER_WARN);
		assertThat(log.getSeverityText()).isEqualTo("WARN");
		assertThat(log.getEventName()).isEqualTo("test.event");
		assertThat(log.getBody().getArrayValue()).hasSize(2);
		assertThat(log.getBody().getArrayValue().get(0).getStringValue()).isEqualTo("x");
		assertThat(log.getBody().getArrayValue().get(1).getIntValue()).isEqualTo(3L);
		assertThat(attribute(log.getAttributes(), "key").getStringValue()).isEqualTo("value");
		assertThat(log.getTraceId()).isEqualTo(child.getTraceId());
		assertThat(log.getSpanId()).isEqualTo(child.getSpanId()); // correlated with the span it was emitted in
		assertThat(log.getObservedTimeUnixNano()).isPositive();
		assertThat(parent.getLogRecords()).singleElement().satisfies(l -> assertThat(l.getBody().getStringValue()).isEqualTo("in parent"));

		// The rest go to the logs, the orphan at shutdown
		assertThat(bodies(load(logsURI, LogsData.class))).containsExactly("no span", "unsampled", "orphan");

		// --- Metrics ---
		MetricsData metrics = load(metricsURI, MetricsData.class);

		Sum counter = (Sum) metric(metrics, "counter");
		assertThat(counter.isIsMonotonic()).isTrue();
		assertThat(counter.getAggregationTemporality()).isEqualTo(AggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE);
		assertThat(counter.getUnit()).isEqualTo("1");
		assertThat(counter.getDescription()).isEqualTo("A counter");
		assertThat(counter.getDataPoints()).extracting(p -> p.getAsInt()).containsExactlyInAnyOrder(3L, 4L);

		Histogram histogram = (Histogram) metric(metrics, "histogram");
		HistogramDataPoint point = histogram.getDataPoints().getFirst();
		assertThat(point.getCount()).isEqualTo(3);
		assertThat(point.getSum()).isEqualTo(45.0);
		assertThat(point.getMin()).isEqualTo(7.0);
		assertThat(point.getMax()).isEqualTo(30.0);
		assertThat(point.getBucketCounts()).hasSize(point.getExplicitBounds().size() + 1);
		assertThat(point.getBucketCounts().stream().mapToLong(Long::longValue).sum()).isEqualTo(3);
		assertThat(point.getBucketCounts().subList(0, 4)).containsExactly(0L, 0L, 2L, 0L); // repeated counts survive

		ExponentialHistogram exponential = (ExponentialHistogram) metric(metrics, "exponential");
		assertThat(exponential.getDataPoints()).singleElement().satisfies(p -> {
			assertThat(p.getCount()).isEqualTo(2);
			assertThat(p.getPositive().getBucketCounts().stream().mapToLong(Long::longValue).sum()).isEqualTo(2);
		});

		Gauge gauge = (Gauge) metric(metrics, "gauge");
		assertThat(gauge.getDataPoints()).singleElement().satisfies(p -> assertThat(p.getAsDouble()).isEqualTo(0.75));
	}

	/**
	 * Each export is a separate data root grouped by resource and scope.
	 */
	@Test
	void exportToConsumer() {
		List<TracesData> batches = new ArrayList<>();
		try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder()
						.setResource(SDK_RESOURCE)
						.addSpanProcessor(SimpleSpanProcessor.create(new ModelSpanExporter(batches::add)))
						.build())
				.build()) {

			openTelemetry.getTracer("a").spanBuilder("one").startSpan().end();
			openTelemetry.getTracer("b").spanBuilder("two").startSpan().end();
		}

		assertThat(batches).hasSize(2).allSatisfy(batch -> {
			assertThat(batch.eResource()).isNull();
			assertThat(batch.getResourceSpans()).singleElement()
					.satisfies(rs -> assertThat(rs.getScopeSpans()).singleElement()
							.satisfies(ss -> assertThat(ss.getSpans()).hasSize(1)));
		});
		assertThat(batches.get(0).getResourceSpans().getFirst().getScopeSpans().getFirst().getScope().getName()).isEqualTo("a");
		assertThat(batches.get(1).getResourceSpans().getFirst().getScopeSpans().getFirst().getSpans().getFirst().getName()).isEqualTo("two");
	}

	/**
	 * Exporting to a loaded resource appends to its data root.
	 */
	@Test
	void appendToLoadedResource(@TempDir Path dir) {
		URI tracesURI = uri(dir, "traces.xmi");
		for (String name : List.of("first", "second")) {
			ResourceSet resourceSet = resourceSet();
			Resource resource = name.equals("first") ? resourceSet.createResource(tracesURI) : resourceSet.getResource(tracesURI, true);
			try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
					.setTracerProvider(SdkTracerProvider.builder()
							.setResource(SDK_RESOURCE)
							.addSpanProcessor(SimpleSpanProcessor.create(new ModelSpanExporter(resource)))
							.build())
					.build()) {
				openTelemetry.getTracer(SCOPE).spanBuilder(name).startSpan().end();
			}
		}

		TracesData traces = load(tracesURI, TracesData.class);
		// Groups are per exporter: the second run adds its own resource group
		assertThat(traces.getResourceSpans())
				.flatExtracting(rs -> rs.getScopeSpans().getFirst().getSpans())
				.extracting(Span::getName)
				.containsExactly("first", "second");
	}

	/**
	 * Flush saves what has been exported so far; shutdown saves the rest and stops the exporter.
	 */
	@Test
	void flushAndShutdown(@TempDir Path dir) {
		URI tracesURI = uri(dir, "traces.xmi");
		ModelSpanExporter exporter = new ModelSpanExporter(resourceSet().createResource(tracesURI));
		try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder().addSpanProcessor(SimpleSpanProcessor.create(exporter)).build())
				.build()) {

			openTelemetry.getTracer(SCOPE).spanBuilder("before flush").startSpan().end();
			assertThat(exporter.flush().isSuccess()).isTrue();
			assertThat(load(tracesURI, TracesData.class).getResourceSpans().getFirst().getScopeSpans().getFirst().getSpans())
					.extracting(Span::getName)
					.containsExactly("before flush");

			openTelemetry.getTracer(SCOPE).spanBuilder("after flush").startSpan().end();
		}

		assertThat(load(tracesURI, TracesData.class).getResourceSpans().getFirst().getScopeSpans().getFirst().getSpans())
				.extracting(Span::getName)
				.containsExactly("before flush", "after flush");
		assertThat(exporter.export(List.of()).isSuccess()).isFalse();
	}

	private static OpenTelemetrySdk openTelemetry(ModelSpanExporter spans, ModelLogRecordExporter logs) {
		return OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder().addSpanProcessor(SimpleSpanProcessor.create(spans)).build())
				.setLoggerProvider(SdkLoggerProvider.builder().addLogRecordProcessor(SimpleLogRecordProcessor.create(logs)).build())
				.build();
	}

	private static List<Span> spans(TracesData traces) {
		return traces.getResourceSpans().stream()
				.flatMap(r -> r.getScopeSpans().stream())
				.flatMap(s -> s.getSpans().stream())
				.toList();
	}

	/**
	 * A log record in a span which has been exported is added to it, and the log record exporter
	 * saves the spans on flush.
	 */
	@Test
	void logRecordAfterSpanExported(@TempDir Path dir) {
		URI tracesURI = uri(dir, "traces.xmi");
		URI logsURI = uri(dir, "logs.xmi");
		ResourceSet resourceSet = resourceSet();
		ModelSpanExporter spanExporter = new ModelSpanExporter(resourceSet.createResource(tracesURI));
		ModelLogRecordExporter logExporter = new ModelLogRecordExporter(resourceSet.createResource(logsURI), spanExporter);
		try (OpenTelemetrySdk openTelemetry = openTelemetry(spanExporter, logExporter)) {
			io.opentelemetry.api.trace.Span span = openTelemetry.getTracer(SCOPE).spanBuilder("span").startSpan();
			span.end();
			assertThat(spanExporter.flush().isSuccess()).isTrue();

			try (Scope scope = span.makeCurrent()) {
				openTelemetry.getLogsBridge().get(SCOPE).logRecordBuilder().setBody("late").emit();
			}
			assertThat(logExporter.flush().isSuccess()).isTrue();
			assertThat(spans(load(tracesURI, TracesData.class)).getFirst().getLogRecords())
					.extracting(l -> l.getBody().getStringValue())
					.containsExactly("late");
		}
		assertThat(bodies(load(logsURI, LogsData.class))).isEmpty();
	}

	/**
	 * Shut down first, the log record exporter keeps its pending log records for spans exported
	 * later, and the span exporter writes the rest to the logs when it shuts down.
	 */
	@Test
	void logRecordExporterShutDownFirst(@TempDir Path dir) {
		URI tracesURI = uri(dir, "traces.xmi");
		URI logsURI = uri(dir, "logs.xmi");
		ResourceSet resourceSet = resourceSet();
		ModelSpanExporter spanExporter = new ModelSpanExporter(resourceSet.createResource(tracesURI));
		ModelLogRecordExporter logExporter = new ModelLogRecordExporter(resourceSet.createResource(logsURI), spanExporter);
		try (OpenTelemetrySdk openTelemetry = openTelemetry(spanExporter, logExporter)) {
			Logger logger = openTelemetry.getLogsBridge().get(SCOPE);
			io.opentelemetry.api.trace.Span span = openTelemetry.getTracer(SCOPE).spanBuilder("span").startSpan();
			try (Scope scope = span.makeCurrent()) {
				logger.logRecordBuilder().setBody("in span").emit();
			}
			try (Scope scope = io.opentelemetry.api.trace.Span.wrap(SpanContext.create("0af7651916cd43dd8448eb211c80319c", "b7ad6b7169203331", TraceFlags.getSampled(), TraceState.getDefault())).makeCurrent()) {
				logger.logRecordBuilder().setBody("orphan").emit();
			}

			assertThat(logExporter.shutdown().isSuccess()).isTrue();
			assertThat(bodies(load(logsURI, LogsData.class))).isEmpty();

			span.end();
			assertThat(spanExporter.shutdown().isSuccess()).isTrue();
		}

		assertThat(spans(load(tracesURI, TracesData.class)).getFirst().getLogRecords())
				.extracting(l -> l.getBody().getStringValue())
				.containsExactly("in span");
		assertThat(bodies(load(logsURI, LogsData.class))).containsExactly("orphan");
	}

	/**
	 * Shut down first, the span exporter takes no more spans: the log record exporter writes its
	 * pending log records to the logs, and adds log records to the spans exported before.
	 */
	@Test
	void spanExporterShutDownFirst(@TempDir Path dir) {
		URI tracesURI = uri(dir, "traces.xmi");
		URI logsURI = uri(dir, "logs.xmi");
		ResourceSet resourceSet = resourceSet();
		ModelSpanExporter spanExporter = new ModelSpanExporter(resourceSet.createResource(tracesURI));
		ModelLogRecordExporter logExporter = new ModelLogRecordExporter(resourceSet.createResource(logsURI), spanExporter);
		try (OpenTelemetrySdk openTelemetry = openTelemetry(spanExporter, logExporter)) {
			Logger logger = openTelemetry.getLogsBridge().get(SCOPE);
			io.opentelemetry.api.trace.Span exported = openTelemetry.getTracer(SCOPE).spanBuilder("exported").startSpan();
			exported.end();
			io.opentelemetry.api.trace.Span open = openTelemetry.getTracer(SCOPE).spanBuilder("open").startSpan();
			try (Scope scope = open.makeCurrent()) {
				logger.logRecordBuilder().setBody("pending").emit();
			}

			assertThat(spanExporter.shutdown().isSuccess()).isTrue();

			try (Scope scope = exported.makeCurrent()) {
				logger.logRecordBuilder().setBody("late").emit();
			}
			try (Scope scope = open.makeCurrent()) {
				logger.logRecordBuilder().setBody("after span exporter shutdown").emit();
			}
			assertThat(logExporter.shutdown().isSuccess()).isTrue();
		}

		assertThat(spans(load(tracesURI, TracesData.class)))
				.singleElement()
				.satisfies(s -> assertThat(s.getLogRecords()).extracting(l -> l.getBody().getStringValue()).containsExactly("late"));
		assertThat(bodies(load(logsURI, LogsData.class))).containsExactlyInAnyOrder("pending", "after span exporter shutdown");
	}

	/**
	 * Spans are nested in their parents on save, whether they end before or after them. Spans in a
	 * different scope or with a parent which is not exported stay in their scope groups.
	 */
	@Test
	void spanTree(@TempDir Path dir) {
		URI tracesURI = uri(dir, "traces.xmi");
		try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder()
						.addSpanProcessor(SimpleSpanProcessor.create(new ModelSpanExporter(resourceSet().createResource(tracesURI))))
						.build())
				.build()) {
			Tracer tracer = openTelemetry.getTracer(SCOPE);
			io.opentelemetry.api.trace.Span parent = tracer.spanBuilder("parent").startSpan();
			io.opentelemetry.context.Context parentContext = io.opentelemetry.context.Context.current().with(parent);
			io.opentelemetry.api.trace.Span late = tracer.spanBuilder("late").setParent(parentContext).startSpan();
			io.opentelemetry.api.trace.Span grandchild = tracer.spanBuilder("grandchild").setParent(parentContext.with(late)).startSpan();
			tracer.spanBuilder("early").setParent(parentContext).startSpan().end();
			openTelemetry.getTracer("other").spanBuilder("other scope").setParent(parentContext).startSpan().end();
			tracer.spanBuilder("unexported parent")
					.setParent(io.opentelemetry.context.Context.current().with(tracer.spanBuilder("never ended").startSpan()))
					.startSpan()
					.end();
			parent.end();
			late.end();
			grandchild.end();
		}

		TracesData traces = load(tracesURI, TracesData.class);
		List<Span> roots = spans(traces);
		assertThat(roots).extracting(Span::getName).containsExactly("unexported parent", "parent", "other scope"); // by scope group
		Span parent = roots.get(1);
		assertThat(parent.getChildren()).extracting(Span::getName).containsExactly("early", "late");
		assertThat(parent.getChildren().get(1).getChildren()).extracting(Span::getName).containsExactly("grandchild");
		assertThat(roots.get(2).getParentSpanId()).isEqualTo(parent.getSpanId());
	}

	/**
	 * Exporting to a consumer, spans are not nested - the consumer can resolve parents in a batch.
	 */
	@Test
	void spanTreeInBatch() {
		List<TracesData> batches = new ArrayList<>();
		try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder()
						.addSpanProcessor(BatchSpanProcessor.builder(new ModelSpanExporter(batch -> {
							assertThat(spans(batch)).hasSize(2);
							ModelSpanExporter.resolveParents(batch);
							batches.add(batch);
						})).build())
						.build())
				.build()) {
			Tracer tracer = openTelemetry.getTracer(SCOPE);
			io.opentelemetry.api.trace.Span parent = tracer.spanBuilder("parent").startSpan();
			tracer.spanBuilder("child").setParent(io.opentelemetry.context.Context.current().with(parent)).startSpan().end();
			parent.end();
		}

		assertThat(batches).singleElement().satisfies(batch -> assertThat(spans(batch))
				.singleElement()
				.satisfies(parent -> {
					assertThat(parent.getName()).isEqualTo("parent");
					assertThat(parent.getChildren()).extracting(Span::getName).containsExactly("child");
				}));
	}

	@Test
	void correlationRequiresSpansInResource() {
		ModelSpanExporter spanExporter = new ModelSpanExporter(data -> {});
		org.assertj.core.api.Assertions.assertThatIllegalArgumentException()
				.isThrownBy(() -> new ModelLogRecordExporter(data -> {}, spanExporter));
	}

}
