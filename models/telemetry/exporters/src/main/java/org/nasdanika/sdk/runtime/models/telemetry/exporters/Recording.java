package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;

/**
 * The telemetry of a unit of work, recorded as models: an OpenTelemetry SDK whose spans, log
 * records and metrics are exported to a traces, a logs and a metrics resource. Closing the
 * recording shuts the SDK down, which exports what is pending and saves the resources.
 *
 * <pre>
 * try (Recording recording = Recording.builder().serviceName("tests").directory(dir, "yml").build();
 *         Scope scope = recording.makeCurrent()) {
 *     ... // everything instrumented in here is recorded
 * }
 * </pre>
 *
 * Log records are added to the spans they were emitted in. W3C trace context and baggage
 * propagators are set, so that a recording can continue a trace from another process, and work it
 * starts in another process can continue it.
 */
public final class Recording implements AutoCloseable {

	/**
	 * The default extension of the resources {@link Builder#directory(Path) in a directory}: XMI,
	 * which the runtime's resource sets read and write without other modules.
	 */
	public static final String DEFAULT_EXTENSION = "xml";

	private final OpenTelemetrySdk openTelemetry;
	private final Resource traces;
	private final Resource logs;
	private final Resource metrics;

	private Recording(Builder builder) {
		traces = Objects.requireNonNull(builder.traces, "traces");
		logs = Objects.requireNonNull(builder.logs, "logs");
		metrics = Objects.requireNonNull(builder.metrics, "metrics");
		io.opentelemetry.sdk.resources.Resource resource = io.opentelemetry.sdk.resources.Resource.getDefault()
				.merge(io.opentelemetry.sdk.resources.Resource.create(builder.attributes.build()));

		ModelSpanExporter spanExporter = new ModelSpanExporter(traces);
		openTelemetry = OpenTelemetrySdk.builder()
				.setPropagators(Telemetry.w3cPropagators())
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

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private final AttributesBuilder attributes = Attributes.builder();
		private Resource traces;
		private Resource logs;
		private Resource metrics;

		private Builder() {}

		/**
		 * The {@code service.name} resource attribute.
		 */
		public Builder serviceName(String serviceName) {
			attributes.put("service.name", serviceName);
			return this;
		}

		/**
		 * The {@code service.version} resource attribute.
		 */
		public Builder serviceVersion(String serviceVersion) {
			attributes.put("service.version", serviceVersion);
			return this;
		}

		/**
		 * A resource attribute of the recorded telemetry.
		 */
		public Builder attribute(String key, String value) {
			attributes.put(key, value);
			return this;
		}

		/**
		 * The resources to record to. Saved when the recording is closed.
		 */
		public Builder resources(Resource traces, Resource logs, Resource metrics) {
			this.traces = traces;
			this.logs = logs;
			this.metrics = metrics;
			return this;
		}

		/**
		 * Records to {@code traces.xml}, {@code logs.xml} and {@code metrics.xml} in the directory.
		 */
		public Builder directory(Path directory) {
			return directory(directory, DEFAULT_EXTENSION);
		}

		/**
		 * Records to {@code traces}, {@code logs} and {@code metrics} files with the extension in
		 * the directory, which is created if it does not exist, in a resource set configured from
		 * the module path. The extension selects the format: {@code yml} or {@code json} with the
		 * runtime's EMF JSON module, {@code ebin} or {@code egz} for EMF's binary format.
		 */
		public Builder directory(Path directory, String extension) {
			try {
				Files.createDirectories(directory);
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
			ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
			return resources(
					resourceSet.createResource(uri(directory, "traces." + extension)),
					resourceSet.createResource(uri(directory, "logs." + extension)),
					resourceSet.createResource(uri(directory, "metrics." + extension)));
		}

		private static URI uri(Path directory, String name) {
			return URI.createFileURI(directory.resolve(name).toAbsolutePath().toString());
		}

		public Recording build() {
			return new Recording(this);
		}

	}

	public OpenTelemetrySdk getOpenTelemetry() {
		return openTelemetry;
	}

	/**
	 * Makes the recording's instance current: the unit of work's {@link Telemetry#current()}.
	 */
	public Scope makeCurrent() {
		return Telemetry.makeCurrent(openTelemetry);
	}

	public Resource getTracesResource() {
		return traces;
	}

	public Resource getLogsResource() {
		return logs;
	}

	public Resource getMetricsResource() {
		return metrics;
	}

	/**
	 * @return The recorded spans, complete once the recording is closed. Null if nothing was
	 * recorded
	 */
	public TracesData getTraces() {
		return traces.getContents().isEmpty() ? null : (TracesData) traces.getContents().get(0);
	}

	/**
	 * @return The log records not correlated with a recorded span. Null if there were none
	 */
	public LogsData getLogs() {
		return logs.getContents().isEmpty() ? null : (LogsData) logs.getContents().get(0);
	}

	public MetricsData getMetrics() {
		return metrics.getContents().isEmpty() ? null : (MetricsData) metrics.getContents().get(0);
	}

	/**
	 * Shuts the SDK down: pending telemetry is exported and the resources are saved.
	 */
	@Override
	public void close() {
		openTelemetry.close();
	}

}
