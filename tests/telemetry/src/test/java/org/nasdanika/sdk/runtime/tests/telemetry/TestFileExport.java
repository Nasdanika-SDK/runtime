package org.nasdanika.sdk.runtime.tests.telemetry;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.exporter.logging.otlp.internal.logs.OtlpStdoutLogRecordExporter;
import io.opentelemetry.exporter.logging.otlp.internal.traces.OtlpStdoutSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;

/**
 * The shape of a CLI root command: an OpenTelemetry instance built programmatically for one unit of
 * work, exporting traces and logs to files, made current for the duration of the work, and closed
 * at the end, which flushes and shuts down the exporters.
 *
 * <p>
 * The files are OTLP JSON lines, one export request per line, the format of the OTLP file exporter
 * specification. They can be replayed into a collector with its {@code otlpjsonfile} receiver.
 * The exporters writing them live in an {@code internal} package of
 * {@code opentelemetry-exporter-logging-otlp} (they back the experimental {@code otlp/stdout}
 * autoconfiguration option), so their API may change between OpenTelemetry releases.
 */
class TestFileExport {

	private static final AttributeKey<String> SERVICE_NAME = AttributeKey.stringKey("service.name");

	/**
	 * Builds the instance. The SDK owns the exporters, and the exporters own the streams: shutting
	 * the SDK down flushes and closes them.
	 */
	static OpenTelemetrySdk openTelemetry(OutputStream traces, OutputStream logs, String serviceName) {
		io.opentelemetry.sdk.resources.Resource resource = io.opentelemetry.sdk.resources.Resource.getDefault()
				.merge(io.opentelemetry.sdk.resources.Resource.create(Attributes.of(SERVICE_NAME, serviceName)));

		SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
				.setResource(resource)
				.addSpanProcessor(BatchSpanProcessor.builder(OtlpStdoutSpanExporter.builder().setOutput(traces).build()).build())
				.build();

		SdkLoggerProvider loggerProvider = SdkLoggerProvider.builder()
				.setResource(resource)
				.addLogRecordProcessor(BatchLogRecordProcessor.builder(OtlpStdoutLogRecordExporter.builder().setOutput(logs).build()).build())
				.build();

		return OpenTelemetrySdk.builder()
				.setTracerProvider(tracerProvider)
				.setLoggerProvider(loggerProvider)
				.build();
	}

	@Test
	void rootCommand() throws IOException {
		Path dir = Path.of("target", "telemetry", "root-command");
		Files.createDirectories(dir);
		Path tracesFile = dir.resolve("traces.jsonl");
		Path logsFile = dir.resolve("logs.jsonl");
		URI modelURI = URI.createFileURI(dir.resolve("model.xmi").toAbsolutePath().toString());

		// Resources close in reverse order: the scope first, then the SDK (flushing the exporters),
		// then the streams, which the exporters have closed already
		try (OutputStream traces = Files.newOutputStream(tracesFile);
				OutputStream logs = Files.newOutputStream(logsFile);
				OpenTelemetrySdk openTelemetry = openTelemetry(traces, logs, "nsdk");
				Scope telemetryScope = Telemetry.makeCurrent(openTelemetry)) {

			Tracer tracer = openTelemetry.getTracer("org.nasdanika.sdk.cli");
			Logger logger = openTelemetry.getLogsBridge().get("org.nasdanika.sdk.cli");

			Span span = tracer.spanBuilder("nsdk").setAttribute("nasdanika.command.args", "model save").startSpan();
			try (Scope spanScope = span.makeCurrent()) {
				Telemetry.log(logger, Severity.INFO, null, "Hello from the root command", null);

				// Instrumented runtime code reports to the current instance
				NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
				Resource resource = resourceSet.createResource(modelURI);
				EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
				ePackage.setName("root");
				resource.getContents().add(ePackage);
				resource.save(null);

				span.setStatus(StatusCode.OK);
			} catch (IOException | RuntimeException e) {
				Telemetry.recordFailure(span, e);
				throw e;
			} finally {
				span.end();
			}
		}

		String tracesJson = Files.readString(tracesFile);
		assertThat(tracesJson)
				.startsWith("{\"resourceSpans\":")
				.contains("\"name\":\"nsdk\"")
				.contains("\"name\":\"ResourceSetContributor.configure\"")
				.contains("\"name\":\"Resource.save\"")
				.contains("\"name\":\"URIHandler.write\"")
				.contains("\"stringValue\":\"nsdk\"");

		String logsJson = Files.readString(logsFile);
		assertThat(logsJson)
				.startsWith("{\"resourceLogs\":")
				.contains("Hello from the root command")
				.contains(Telemetry.RESOURCE_SAVED_EVENT);
	}

}
