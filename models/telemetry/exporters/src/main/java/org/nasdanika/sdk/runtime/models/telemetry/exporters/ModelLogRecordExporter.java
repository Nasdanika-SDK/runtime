package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsFactory;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs;
import org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.logs.export.LogRecordExporter;

/**
 * Exports log records to {@link LogsData}, to a consumer or to an EMF resource saved on flush and
 * shutdown. See {@link AbstractModelExporter} for the two modes.
 *
 * <p>
 * Linked to a {@link ModelSpanExporter}, log records emitted in a sampled span are added to
 * {@link Span#getLogRecords() the span} instead:
 *
 * <ul>
 * <li>If the span has been exported, right away. The span exporter's resource is saved again on
 * flush and shutdown of this exporter if log records were added to its spans.</li>
 * <li>Otherwise they are pending until the span is exported - the log records of a span are
 * usually exported before it ends.</li>
 * <li>Log records still pending when both exporters have been shut down, in any order, go to the
 * logs: their spans were not exported to the span exporter. So do the log records exported after
 * the span exporter was shut down, unless their spans have been exported.</li>
 * </ul>
 *
 * Log records without a span or in a span that is not sampled go to the logs. The two exporters
 * share a lock.
 */
public class ModelLogRecordExporter extends AbstractModelExporter<LogRecordData, LogsData, ResourceLogs, ScopeLogs> implements LogRecordExporter {

	private final ModelSpanExporter spanExporter;
	private final Map<String, List<LogRecordData>> pending = new LinkedHashMap<>();
	private boolean spansModified;

	/**
	 * @param consumer Receives a {@link LogsData} per export
	 */
	public ModelLogRecordExporter(Consumer<? super LogsData> consumer) {
		this(consumer, null);
	}

	/**
	 * @param consumer Receives a {@link LogsData} per export of log records not added to spans
	 * @param spanExporter Exporter of the spans to add log records to, may be null
	 */
	public ModelLogRecordExporter(Consumer<? super LogsData> consumer, ModelSpanExporter spanExporter) {
		super(spanExporter == null ? null : spanExporter.getLock(), consumer);
		this.spanExporter = spanExporter;
		if (spanExporter != null) {
			spanExporter.link(this);
		}
	}

	/**
	 * @param resource Log records are added to its {@link LogsData} root
	 */
	public ModelLogRecordExporter(Resource resource) {
		this(resource, null, null);
	}

	/**
	 * @param resource Log records not added to spans are added to its {@link LogsData} root
	 * @param spanExporter Exporter of the spans to add log records to, may be null
	 */
	public ModelLogRecordExporter(Resource resource, ModelSpanExporter spanExporter) {
		this(resource, null, spanExporter);
	}

	/**
	 * @param spanExporter Exporter of the spans to add log records to, may be null
	 */
	public ModelLogRecordExporter(Resource resource, Map<?, ?> saveOptions, ModelSpanExporter spanExporter) {
		super(spanExporter == null ? null : spanExporter.getLock(), resource, saveOptions);
		this.spanExporter = spanExporter;
		if (spanExporter != null) {
			spanExporter.link(this);
		}
	}

	@Override
	public CompletableResultCode export(Collection<LogRecordData> logs) {
		if (spanExporter == null) {
			return doExport(logs);
		}
		synchronized (getLock()) {
			if (isShutdown()) {
				return CompletableResultCode.ofFailure();
			}
			List<LogRecordData> uncorrelated = new ArrayList<>();
			try {
				for (LogRecordData log : logs) {
					String key = ModelSpanExporter.key(log.getSpanContext());
					Span span = key == null ? null : spanExporter.getSpan(key);
					if (span != null) {
						span.getLogRecords().add(TelemetryConverter.logRecord(log));
						spansModified = true;
					} else if (key == null || spanExporter.isShutdown()) {
						uncorrelated.add(log);
					} else {
						pending.computeIfAbsent(key, k -> new ArrayList<>()).add(log);
					}
				}
			} catch (RuntimeException e) {
				return CompletableResultCode.ofExceptionalFailure(e);
			}
			return uncorrelated.isEmpty() ? CompletableResultCode.ofSuccess() : doExport(uncorrelated);
		}
	}

	/**
	 * Adds the log records pending for the span. Called by the span exporter, which saves them with
	 * the span.
	 */
	void spanExported(String key, Span span) {
		List<LogRecordData> logs = pending.remove(key);
		if (logs != null) {
			logs.forEach(log -> span.getLogRecords().add(TelemetryConverter.logRecord(log)));
		}
	}

	/**
	 * Writes the pending log records to the logs and saves them. Called when both exporters have
	 * been shut down.
	 */
	CompletableResultCode writePending() {
		synchronized (getLock()) {
			if (pending.isEmpty()) {
				return CompletableResultCode.ofSuccess();
			}
			try {
				drainPending();
			} catch (RuntimeException e) {
				return CompletableResultCode.ofExceptionalFailure(e);
			}
			return save();
		}
	}

	private void drainPending() {
		try {
			write(pending.values().stream().flatMap(List::stream).toList());
		} finally {
			pending.clear();
		}
	}

	/**
	 * Saves the span exporter's resource if log records were added to its spans since.
	 */
	private CompletableResultCode saveSpans() {
		if (!spansModified) {
			return CompletableResultCode.ofSuccess();
		}
		spansModified = false;
		return spanExporter.save();
	}

	/**
	 * Saves the logs, and the spans if log records were added to them. Pending log records stay
	 * pending.
	 */
	@Override
	public CompletableResultCode flush() {
		synchronized (getLock()) {
			CompletableResultCode result = super.flush();
			return isShutdown() || spanExporter == null ? result : CompletableResultCode.ofAll(List.of(result, saveSpans()));
		}
	}

	@Override
	public CompletableResultCode shutdown() {
		synchronized (getLock()) {
			if (isShutdown() || spanExporter == null) {
				return super.shutdown();
			}
			if (spanExporter.isShutdown()) {
				// No more spans: the pending log records go to the logs, saved by super.shutdown()
				try {
					drainPending();
				} catch (RuntimeException e) {
					return CompletableResultCode.ofExceptionalFailure(e);
				}
			}
			return CompletableResultCode.ofAll(List.of(super.shutdown(), saveSpans()));
		}
	}

	@Override
	protected Class<LogsData> getDataType() {
		return LogsData.class;
	}

	@Override
	protected LogsData createData() {
		return LogsFactory.eINSTANCE.createLogsData();
	}

	@Override
	protected ResourceLogs createResourceGroup(LogsData data, io.opentelemetry.sdk.resources.Resource resource) {
		ResourceLogs ret = LogsFactory.eINSTANCE.createResourceLogs();
		ret.setResource(TelemetryConverter.resource(resource));
		ret.setSchemaUrl(resource.getSchemaUrl());
		data.getResourceLogs().add(ret);
		return ret;
	}

	@Override
	protected ScopeLogs createScopeGroup(ResourceLogs resourceGroup, InstrumentationScopeInfo scope) {
		ScopeLogs ret = LogsFactory.eINSTANCE.createScopeLogs();
		ret.setScope(TelemetryConverter.scope(scope));
		ret.setSchemaUrl(scope.getSchemaUrl());
		resourceGroup.getScopeLogs().add(ret);
		return ret;
	}

	@Override
	protected io.opentelemetry.sdk.resources.Resource getResource(LogRecordData item) {
		return item.getResource();
	}

	@Override
	protected InstrumentationScopeInfo getScope(LogRecordData item) {
		return item.getInstrumentationScopeInfo();
	}

	@Override
	protected void add(ScopeLogs scopeGroup, LogRecordData item) {
		scopeGroup.getLogRecords().add(TelemetryConverter.logRecord(item));
	}

	@Override
	public String toString() {
		return "ModelLogRecordExporter";
	}

}
