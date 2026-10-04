package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.InstrumentationScope;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.Resource;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryFactory;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsFactory;
import org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsFactory;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanKind;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink;
import org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus;
import org.nasdanika.sdk.runtime.models.telemetry.traces.StatusCode;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesFactory;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.DoublePointData;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramPointData;
import io.opentelemetry.sdk.metrics.data.HistogramPointData;
import io.opentelemetry.sdk.metrics.data.LongExemplarData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.data.SumData;
import io.opentelemetry.sdk.metrics.data.SummaryPointData;
import io.opentelemetry.sdk.metrics.data.ValueAtQuantile;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.SpanData;

/**
 * Converts OpenTelemetry SDK data to the telemetry model, field by field as the OTLP exporters do:
 * ids are lowercase hex strings, times are UNIX epoch nanoseconds, a dropped count is the recorded
 * total less what was kept.
 */
public final class TelemetryConverter {

	/** OTLP span flags: the low byte is the W3C trace flags. */
	private static final int TRACE_FLAGS_MASK = 0xFF;
	private static final int CONTEXT_HAS_IS_REMOTE = 0x100;
	private static final int CONTEXT_IS_REMOTE = 0x200;

	private TelemetryConverter() {}

	// --- Common ---

	public static Resource resource(io.opentelemetry.sdk.resources.Resource resource) {
		Resource ret = TelemetryFactory.eINSTANCE.createResource();
		ret.getAttributes().addAll(keyValues(resource.getAttributes()));
		ret.setSchemaUrl(resource.getSchemaUrl());
		return ret;
	}

	public static InstrumentationScope scope(InstrumentationScopeInfo scope) {
		InstrumentationScope ret = TelemetryFactory.eINSTANCE.createInstrumentationScope();
		ret.setName(scope.getName());
		ret.setVersion(scope.getVersion());
		ret.getAttributes().addAll(keyValues(scope.getAttributes()));
		return ret;
	}

	public static List<KeyValue> keyValues(Attributes attributes) {
		List<KeyValue> ret = new ArrayList<>(attributes.size());
		attributes.forEach((key, value) -> ret.add(keyValue(key.getKey(), anyValue(value))));
		return ret;
	}

	public static KeyValue keyValue(String key, AnyValue value) {
		KeyValue ret = TelemetryFactory.eINSTANCE.createKeyValue();
		ret.setKey(key);
		ret.setValue(value);
		return ret;
	}

	/**
	 * @param value An attribute value: a string, a boolean, a long, a double, a list of those, or a
	 * {@link Value}
	 */
	public static AnyValue anyValue(Object value) {
		if (value instanceof Value<?> v) {
			return anyValue(v);
		}
		AnyValue ret = TelemetryFactory.eINSTANCE.createAnyValue();
		switch (value) {
			case String s -> ret.setStringValue(s);
			case Boolean b -> ret.setBoolValue(b);
			case Long l -> ret.setIntValue(l);
			case Integer i -> ret.setIntValue(i.longValue());
			case Double d -> ret.setDoubleValue(d);
			case List<?> list -> list.forEach(e -> ret.getArrayValue().add(anyValue(e)));
			case null -> {
				// An empty value
			}
			default -> ret.setStringValue(String.valueOf(value));
		}
		return ret;
	}

	public static AnyValue anyValue(Value<?> value) {
		AnyValue ret = TelemetryFactory.eINSTANCE.createAnyValue();
		switch (value.getType()) {
			case STRING -> ret.setStringValue((String) value.getValue());
			case BOOLEAN -> ret.setBoolValue((Boolean) value.getValue());
			case LONG -> ret.setIntValue((Long) value.getValue());
			case DOUBLE -> ret.setDoubleValue((Double) value.getValue());
			case ARRAY -> ((List<?>) value.getValue()).forEach(e -> ret.getArrayValue().add(anyValue((Value<?>) e)));
			case KEY_VALUE_LIST -> ((List<?>) value.getValue()).forEach(e -> {
				io.opentelemetry.api.common.KeyValue kv = (io.opentelemetry.api.common.KeyValue) e;
				ret.getKvlistValue().add(keyValue(kv.getKey(), anyValue(kv.getValue())));
			});
			case BYTES -> {
				ByteBuffer buffer = ((ByteBuffer) value.getValue()).duplicate();
				byte[] bytes = new byte[buffer.remaining()];
				buffer.get(bytes);
				ret.setBytesValue(bytes);
			}
			case EMPTY -> {
				// No value set
			}
		}
		return ret;
	}

	/**
	 * The W3C {@code tracestate} header value, or null if the state is empty.
	 */
	public static String traceState(TraceState traceState) {
		if (traceState.isEmpty()) {
			return null;
		}
		StringBuilder ret = new StringBuilder();
		traceState.forEach((key, value) -> {
			if (!ret.isEmpty()) {
				ret.append(',');
			}
			ret.append(key).append('=').append(value);
		});
		return ret.toString();
	}

	// --- Traces ---

	public static Span span(SpanData data) {
		TracesFactory factory = TracesFactory.eINSTANCE;
		Span span = factory.createSpan();
		span.setTraceId(data.getTraceId());
		span.setSpanId(data.getSpanId());
		span.setTraceState(traceState(data.getSpanContext().getTraceState()));
		SpanContext parent = data.getParentSpanContext();
		if (parent.isValid()) {
			span.setParentSpanId(parent.getSpanId());
		}
		span.setName(data.getName());
		span.setKind(spanKind(data.getKind()));
		span.setStartTimeUnixNano(data.getStartEpochNanos());
		span.setEndTimeUnixNano(data.getEndEpochNanos());
		span.getAttributes().addAll(keyValues(data.getAttributes()));
		span.setDroppedAttributesCount(data.getTotalAttributeCount() - data.getAttributes().size());

		for (EventData eventData : data.getEvents()) {
			SpanEvent event = factory.createSpanEvent();
			event.setTimeUnixNano(eventData.getEpochNanos());
			event.setName(eventData.getName());
			event.getAttributes().addAll(keyValues(eventData.getAttributes()));
			event.setDroppedAttributesCount(eventData.getDroppedAttributesCount());
			span.getEvents().add(event);
		}
		span.setDroppedEventsCount(data.getTotalRecordedEvents() - data.getEvents().size());

		for (LinkData linkData : data.getLinks()) {
			SpanContext linked = linkData.getSpanContext();
			SpanLink link = factory.createSpanLink();
			link.setTraceId(linked.getTraceId());
			link.setSpanId(linked.getSpanId());
			link.setTraceState(traceState(linked.getTraceState()));
			link.getAttributes().addAll(keyValues(linkData.getAttributes()));
			link.setDroppedAttributesCount(linkData.getTotalAttributeCount() - linkData.getAttributes().size());
			link.setFlags(flags(linked, linked.isRemote()));
			span.getLinks().add(link);
		}
		span.setDroppedLinksCount(data.getTotalRecordedLinks() - data.getLinks().size());

		SpanStatus status = factory.createSpanStatus();
		status.setCode(statusCode(data.getStatus().getStatusCode()));
		String description = data.getStatus().getDescription();
		if (description != null && !description.isEmpty()) {
			status.setMessage(description);
		}
		span.setStatus(status);
		span.setFlags(flags(data.getSpanContext(), parent.isRemote()));
		return span;
	}

	/**
	 * @param remote Whether the parent (for a span) or the linked span (for a link) is remote
	 */
	private static int flags(SpanContext context, boolean remote) {
		return (context.getTraceFlags().asByte() & TRACE_FLAGS_MASK) | CONTEXT_HAS_IS_REMOTE | (remote ? CONTEXT_IS_REMOTE : 0);
	}

	public static SpanKind spanKind(io.opentelemetry.api.trace.SpanKind kind) {
		return switch (kind) {
			case INTERNAL -> SpanKind.SPAN_KIND_INTERNAL;
			case SERVER -> SpanKind.SPAN_KIND_SERVER;
			case CLIENT -> SpanKind.SPAN_KIND_CLIENT;
			case PRODUCER -> SpanKind.SPAN_KIND_PRODUCER;
			case CONSUMER -> SpanKind.SPAN_KIND_CONSUMER;
		};
	}

	public static StatusCode statusCode(io.opentelemetry.api.trace.StatusCode code) {
		return switch (code) {
			case UNSET -> StatusCode.STATUS_CODE_UNSET;
			case OK -> StatusCode.STATUS_CODE_OK;
			case ERROR -> StatusCode.STATUS_CODE_ERROR;
		};
	}

	// --- Logs ---

	public static LogRecord logRecord(LogRecordData data) {
		LogRecord logRecord = LogsFactory.eINSTANCE.createLogRecord();
		logRecord.setTimeUnixNano(data.getTimestampEpochNanos());
		logRecord.setObservedTimeUnixNano(data.getObservedTimestampEpochNanos());
		SeverityNumber severityNumber = SeverityNumber.get(data.getSeverity().getSeverityNumber());
		logRecord.setSeverityNumber(severityNumber == null ? SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED : severityNumber);
		logRecord.setSeverityText(data.getSeverityText());
		Value<?> body = data.getBodyValue();
		if (body != null) {
			logRecord.setBody(anyValue(body));
		}
		logRecord.getAttributes().addAll(keyValues(data.getAttributes()));
		logRecord.setDroppedAttributesCount(data.getTotalAttributeCount() - data.getAttributes().size());
		SpanContext spanContext = data.getSpanContext();
		logRecord.setFlags(spanContext.getTraceFlags().asByte() & TRACE_FLAGS_MASK);
		if (spanContext.isValid()) {
			logRecord.setTraceId(spanContext.getTraceId());
			logRecord.setSpanId(spanContext.getSpanId());
		}
		logRecord.setEventName(data.getEventName());
		return logRecord;
	}

	// --- Metrics ---

	public static Metric metric(MetricData data) {
		MetricsFactory factory = MetricsFactory.eINSTANCE;
		Metric metric = switch (data.getType()) {
			case LONG_GAUGE -> {
				Gauge gauge = factory.createGauge();
				data.getLongGaugeData().getPoints().forEach(p -> gauge.getDataPoints().add(numberDataPoint(p)));
				yield gauge;
			}
			case DOUBLE_GAUGE -> {
				Gauge gauge = factory.createGauge();
				data.getDoubleGaugeData().getPoints().forEach(p -> gauge.getDataPoints().add(numberDataPoint(p)));
				yield gauge;
			}
			case LONG_SUM -> sum(data.getLongSumData());
			case DOUBLE_SUM -> sum(data.getDoubleSumData());
			case HISTOGRAM -> {
				Histogram histogram = factory.createHistogram();
				histogram.setAggregationTemporality(aggregationTemporality(data.getHistogramData().getAggregationTemporality()));
				data.getHistogramData().getPoints().forEach(p -> histogram.getDataPoints().add(histogramDataPoint(p)));
				yield histogram;
			}
			case EXPONENTIAL_HISTOGRAM -> {
				ExponentialHistogram histogram = factory.createExponentialHistogram();
				histogram.setAggregationTemporality(aggregationTemporality(data.getExponentialHistogramData().getAggregationTemporality()));
				data.getExponentialHistogramData().getPoints().forEach(p -> histogram.getDataPoints().add(exponentialHistogramDataPoint(p)));
				yield histogram;
			}
			case SUMMARY -> {
				Summary summary = factory.createSummary();
				data.getSummaryData().getPoints().forEach(p -> summary.getDataPoints().add(summaryDataPoint(p)));
				yield summary;
			}
		};
		metric.setName(data.getName());
		metric.setDescription(data.getDescription());
		metric.setUnit(data.getUnit());
		return metric;
	}

	private static Sum sum(SumData<? extends PointData> data) {
		Sum sum = MetricsFactory.eINSTANCE.createSum();
		sum.setAggregationTemporality(aggregationTemporality(data.getAggregationTemporality()));
		sum.setIsMonotonic(data.isMonotonic());
		data.getPoints().forEach(p -> sum.getDataPoints().add(numberDataPoint(p)));
		return sum;
	}

	public static AggregationTemporality aggregationTemporality(io.opentelemetry.sdk.metrics.data.AggregationTemporality temporality) {
		return switch (temporality) {
			case DELTA -> AggregationTemporality.AGGREGATION_TEMPORALITY_DELTA;
			case CUMULATIVE -> AggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE;
		};
	}

	/**
	 * @param point A {@link LongPointData} or a {@link DoublePointData}
	 */
	public static NumberDataPoint numberDataPoint(PointData point) {
		NumberDataPoint ret = MetricsFactory.eINSTANCE.createNumberDataPoint();
		ret.getAttributes().addAll(keyValues(point.getAttributes()));
		ret.setStartTimeUnixNano(point.getStartEpochNanos());
		ret.setTimeUnixNano(point.getEpochNanos());
		switch (point) {
			case LongPointData p -> ret.setAsInt(p.getValue());
			case DoublePointData p -> ret.setAsDouble(p.getValue());
			default -> throw new IllegalArgumentException("Not a number point: " + point);
		}
		point.getExemplars().forEach(e -> ret.getExemplars().add(exemplar(e)));
		return ret;
	}

	public static HistogramDataPoint histogramDataPoint(HistogramPointData point) {
		HistogramDataPoint ret = MetricsFactory.eINSTANCE.createHistogramDataPoint();
		ret.getAttributes().addAll(keyValues(point.getAttributes()));
		ret.setStartTimeUnixNano(point.getStartEpochNanos());
		ret.setTimeUnixNano(point.getEpochNanos());
		ret.setCount(point.getCount());
		ret.setSum(point.getSum());
		ret.getBucketCounts().addAll(point.getCounts());
		ret.getExplicitBounds().addAll(point.getBoundaries());
		point.getExemplars().forEach(e -> ret.getExemplars().add(exemplar(e)));
		if (point.hasMin()) {
			ret.setMin(point.getMin());
		}
		if (point.hasMax()) {
			ret.setMax(point.getMax());
		}
		return ret;
	}

	public static ExponentialHistogramDataPoint exponentialHistogramDataPoint(ExponentialHistogramPointData point) {
		ExponentialHistogramDataPoint ret = MetricsFactory.eINSTANCE.createExponentialHistogramDataPoint();
		ret.getAttributes().addAll(keyValues(point.getAttributes()));
		ret.setStartTimeUnixNano(point.getStartEpochNanos());
		ret.setTimeUnixNano(point.getEpochNanos());
		ret.setCount(point.getCount());
		ret.setSum(point.getSum());
		ret.setScale(point.getScale());
		ret.setZeroCount(point.getZeroCount());
		ret.setPositive(buckets(point.getPositiveBuckets()));
		ret.setNegative(buckets(point.getNegativeBuckets()));
		point.getExemplars().forEach(e -> ret.getExemplars().add(exemplar(e)));
		if (point.hasMin()) {
			ret.setMin(point.getMin());
		}
		if (point.hasMax()) {
			ret.setMax(point.getMax());
		}
		return ret;
	}

	private static ExponentialHistogramDataPointBuckets buckets(ExponentialHistogramBuckets buckets) {
		ExponentialHistogramDataPointBuckets ret = MetricsFactory.eINSTANCE.createExponentialHistogramDataPointBuckets();
		ret.setOffset(buckets.getOffset());
		ret.getBucketCounts().addAll(buckets.getBucketCounts());
		return ret;
	}

	public static SummaryDataPoint summaryDataPoint(SummaryPointData point) {
		MetricsFactory factory = MetricsFactory.eINSTANCE;
		SummaryDataPoint ret = factory.createSummaryDataPoint();
		ret.getAttributes().addAll(keyValues(point.getAttributes()));
		ret.setStartTimeUnixNano(point.getStartEpochNanos());
		ret.setTimeUnixNano(point.getEpochNanos());
		ret.setCount(point.getCount());
		ret.setSum(point.getSum());
		for (ValueAtQuantile valueAtQuantile : point.getValues()) {
			SummaryDataPointValueAtQuantile quantileValue = factory.createSummaryDataPointValueAtQuantile();
			quantileValue.setQuantile(valueAtQuantile.getQuantile());
			quantileValue.setValue(valueAtQuantile.getValue());
			ret.getQuantileValues().add(quantileValue);
		}
		return ret;
	}

	/**
	 * Carries the ids of the span the measurement was recorded in. {@link Exemplar#getSpan()} is
	 * left for a loader that has the spans to resolve.
	 */
	public static Exemplar exemplar(ExemplarData data) {
		Exemplar ret = MetricsFactory.eINSTANCE.createExemplar();
		ret.getFilteredAttributes().addAll(keyValues(data.getFilteredAttributes()));
		ret.setTimeUnixNano(data.getEpochNanos());
		switch (data) {
			case LongExemplarData e -> ret.setAsInt(e.getValue());
			case DoubleExemplarData e -> ret.setAsDouble(e.getValue());
			default -> {
				// Value type unknown
			}
		}
		SpanContext spanContext = data.getSpanContext();
		if (spanContext.isValid()) {
			ret.setTraceId(spanContext.getTraceId());
			ret.setSpanId(spanContext.getSpanId());
		}
		return ret;
	}

}
