package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesFactory;

import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SpanExporter;

/**
 * Exports spans to {@link TracesData}, to a consumer or to an EMF resource saved on flush and
 * shutdown. See {@link AbstractModelExporter} for the two modes.
 *
 * <p>
 * Exporting to a resource, it can be linked to a {@link ModelLogRecordExporter}, which adds log
 * records to {@link Span#getLogRecords() the spans they were emitted in}.
 */
public class ModelSpanExporter extends AbstractModelExporter<SpanData, TracesData, ResourceSpans, ScopeSpans> implements SpanExporter {

	private final Map<String, Span> spans = new HashMap<>();
	private ModelLogRecordExporter logRecordExporter;

	/**
	 * @param consumer Receives a {@link TracesData} per export
	 */
	public ModelSpanExporter(Consumer<? super TracesData> consumer) {
		super(null, consumer);
	}

	/**
	 * @param resource Spans are added to its {@link TracesData} root
	 */
	public ModelSpanExporter(Resource resource) {
		this(resource, null);
	}

	public ModelSpanExporter(Resource resource, Map<?, ?> saveOptions) {
		super(null, resource, saveOptions);
	}

	/**
	 * Key of a span for log record correlation.
	 *
	 * @return null if the context is not of a sampled span: its log records are not correlated.
	 */
	static String key(SpanContext spanContext) {
		return spanContext.isValid() && spanContext.isSampled() ? spanContext.getTraceId() + spanContext.getSpanId() : null;
	}

	/**
	 * Called by the log record exporter on construction.
	 */
	void link(ModelLogRecordExporter logRecordExporter) {
		synchronized (getLock()) {
			if (getModelResource() == null) {
				throw new IllegalArgumentException("Log records can be correlated only with spans exported to a resource");
			}
			if (this.logRecordExporter != null) {
				throw new IllegalStateException("Already linked to " + this.logRecordExporter);
			}
			this.logRecordExporter = logRecordExporter;
		}
	}

	/**
	 * @return An exported span, or null
	 */
	Span getSpan(String key) {
		synchronized (getLock()) {
			return spans.get(key);
		}
	}

	@Override
	public CompletableResultCode export(Collection<SpanData> spans) {
		return doExport(spans);
	}

	/**
	 * When the linked log record exporter was shut down first, its pending log records go to its
	 * logs now: no more spans will come.
	 */
	@Override
	public CompletableResultCode shutdown() {
		synchronized (getLock()) {
			if (isShutdown()) {
				return CompletableResultCode.ofSuccess();
			}
			CompletableResultCode result = super.shutdown();
			if (logRecordExporter != null && logRecordExporter.isShutdown()) {
				return CompletableResultCode.ofAll(List.of(result, logRecordExporter.writePending()));
			}
			return result;
		}
	}

	@Override
	protected Class<TracesData> getDataType() {
		return TracesData.class;
	}

	@Override
	protected TracesData createData() {
		return TracesFactory.eINSTANCE.createTracesData();
	}

	@Override
	protected ResourceSpans createResourceGroup(TracesData data, io.opentelemetry.sdk.resources.Resource resource) {
		ResourceSpans ret = TracesFactory.eINSTANCE.createResourceSpans();
		ret.setResource(TelemetryConverter.resource(resource));
		ret.setSchemaUrl(resource.getSchemaUrl());
		data.getResourceSpans().add(ret);
		return ret;
	}

	@Override
	protected ScopeSpans createScopeGroup(ResourceSpans resourceGroup, InstrumentationScopeInfo scope) {
		ScopeSpans ret = TracesFactory.eINSTANCE.createScopeSpans();
		ret.setScope(TelemetryConverter.scope(scope));
		ret.setSchemaUrl(scope.getSchemaUrl());
		resourceGroup.getScopeSpans().add(ret);
		return ret;
	}

	@Override
	protected io.opentelemetry.sdk.resources.Resource getResource(SpanData item) {
		return item.getResource();
	}

	@Override
	protected InstrumentationScopeInfo getScope(SpanData item) {
		return item.getInstrumentationScopeInfo();
	}

	@Override
	protected void add(ScopeSpans scopeGroup, SpanData item) {
		Span span = TelemetryConverter.span(item);
		scopeGroup.getSpans().add(span);
		String key = key(item.getSpanContext());
		if (getModelResource() != null && key != null) {
			spans.put(key, span);
			if (logRecordExporter != null) {
				logRecordExporter.spanExported(key, span);
			}
		}
	}

	@Override
	public String toString() {
		return "ModelSpanExporter";
	}

}
