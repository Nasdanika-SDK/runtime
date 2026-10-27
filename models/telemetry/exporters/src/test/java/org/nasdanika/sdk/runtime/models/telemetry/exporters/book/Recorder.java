package org.nasdanika.sdk.runtime.models.telemetry.exporters.book;

import java.io.IOException;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelLogRecordExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelMetricExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelSpanExporter;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Changes;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
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
 * A unit of work whose telemetry is saved as models next to the model it changed: traces
 * with the changes recorded in each span, logs and metrics.
 */
final class Recorder {

	static final String SCOPE = "org.example.librarian";

	private Recorder() {
	}

	// tag::sdk[]
	/**
	 * The SDK owns the exporters, and the exporters own the telemetry resources: shutting
	 * the SDK down exports what is pending and saves them. Log records emitted in a span go
	 * into that span.
	 */
	static OpenTelemetrySdk openTelemetry(
			ModelSpanExporter spans,
			Resource logs,
			Resource metrics) {

		var service = io.opentelemetry.sdk.resources.Resource.create(
				Attributes.of(AttributeKey.stringKey("service.name"), "librarian"));
		var resource = io.opentelemetry.sdk.resources.Resource.getDefault().merge(service);

		var logRecords = new ModelLogRecordExporter(logs, spans);                  // <1>
		var measurements = new ModelMetricExporter(metrics);
		return OpenTelemetrySdk.builder()
				.setPropagators(Telemetry.w3cPropagators())                         // <2>
				.setTracerProvider(SdkTracerProvider.builder()
						.setResource(resource)
						.addSpanProcessor(BatchSpanProcessor.builder(spans).build())
						.build())
				.setLoggerProvider(SdkLoggerProvider.builder()
						.setResource(resource)
						.addLogRecordProcessor(BatchLogRecordProcessor.builder(logRecords).build())
						.build())
				.setMeterProvider(SdkMeterProvider.builder()
						.setResource(resource)
						.registerMetricReader(PeriodicMetricReader.builder(measurements).build())
						.build())
				.build();
	}
	// end::sdk[]

	// tag::record[]
	static void curate(Path directory) throws IOException {
		NasdanikaResourceSet telemetry = NasdanikaResourceSet.createAndConfigure(); // <1>
		Resource traces = telemetry.createResource(uri(directory, "traces.xml"));
		Resource logs = telemetry.createResource(uri(directory, "logs.xml"));
		Resource metrics = telemetry.createResource(uri(directory, "metrics.xml"));
		ModelSpanExporter spans = new ModelSpanExporter(traces);

		try (OpenTelemetrySdk openTelemetry = openTelemetry(spans, logs, metrics);
				Scope telemetryScope = Telemetry.makeCurrent(openTelemetry);        // <2>
				Scope changesScope = Changes.makeCurrent(spans)) {                  // <3>

			Tracer tracer = openTelemetry.getTracer(SCOPE);
			Telemetry.inSpan(tracer, "Curate the shelf", null, span -> {
				NasdanikaResourceSet models = NasdanikaResourceSet.createAndConfigure();
				models.getPackageRegistry().put(Shelf.LIBRARY.getNsURI(), Shelf.LIBRARY);
				Resource shelf = models.createResource(uri(directory, "shelf.xml"));
				Changes.record(models, () -> {                                      // <4>
					shelf.getContents().add(Shelf.library());
					shelf.save(null);
					return null;
				});

				EObject library = shelf.getContents().getFirst();
				EObject ddd = Shelf.book(library, "Domain-Driven Design");
				return Telemetry.inSpan(tracer, "Correct the year", null, edit -> {
					return Changes.record(models, () -> {                           // <5>
						ddd.eSet(Shelf.YEAR, 2004);
						shelf.save(null);
						return null;
					});
				});
			});
		}                                                                           // <6>
	}
	// end::record[]

	static URI uri(Path directory, String name) {
		return URI.createFileURI(directory.resolve(name).toAbsolutePath().toString());
	}

}
