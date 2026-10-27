package org.nasdanika.sdk.runtime.models.telemetry.exporters.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelSpanExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.Recording;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;

/**
 * The listings of the Telemetry Model book.
 */
public class TelemetryBookTests {

	@Test
	public void telemetryAndChangesAreModels(@TempDir Path directory) throws Exception {
		Recorder.curate(directory);
		assertThat(directory.resolve("traces.xml")).exists();
		assertThat(directory.resolve("logs.xml")).exists();
		assertThat(directory.resolve("metrics.xml")).exists();

		// Compared with the reviewed file the book includes
		List<String> lines = TraceReader.read(directory);
		Path expected = Path.of(
				"src/test/resources/org/nasdanika/sdk/runtime/models/telemetry/exporters/book/curate.txt");
		assertThat(lines).isEqualTo(Files.readAllLines(expected));
	}

	@Test
	public void consumer() {
		// tag::consumer[]
		List<TracesData> batches = new ArrayList<>();
		ModelSpanExporter exporter = new ModelSpanExporter(batch -> {
			ModelSpanExporter.resolveParents(batch);                        // <1>
			batches.add(batch);
		});
		try (OpenTelemetrySdk openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder()
						.addSpanProcessor(BatchSpanProcessor.builder(exporter).build())
						.build())
				.build()) {
			Tracer tracer = openTelemetry.getTracer(Recorder.SCOPE);
			Telemetry.inSpan(tracer, "Shelve", null, span ->
				Telemetry.inSpan(tracer, "Label", null, step -> null));
		}                                                                   // <2>
		// end::consumer[]

		assertThat(batches).singleElement().satisfies(batch -> {
			Span shelve = batch.getResourceSpans().getFirst()
					.getScopeSpans().getFirst()
					.getSpans().getFirst();
			assertThat(shelve.getName()).isEqualTo("Shelve");
			assertThat(shelve.getChildren()).extracting(Span::getName).containsExactly("Label");
			assertThat(batch.eResource()).isNull();
		});
	}

	@Test
	public void recording(@TempDir Path directory) {
		// tag::recording[]
		Recording recording = Recording.builder()
				.serviceName("librarian")
				.directory(directory)                                       // <1>
				.build();
		try (recording; Scope scope = recording.makeCurrent()) {            // <2>
			OpenTelemetry openTelemetry = Telemetry.current();
			Tracer tracer = Telemetry.tracer(openTelemetry);
			Telemetry.inSpan(tracer, "Import the catalog", null, span -> {
				Telemetry.log(
						Telemetry.logger(openTelemetry),
						Severity.INFO,
						null,
						"Two books found",
						null);                                              // <3>
				return Telemetry.inSpan(tracer, "Index the books", null, step -> null);
			});
		}                                                                   // <4>

		TracesData traces = recording.getTraces();                          // <5>
		Span work = traces.getResourceSpans().getFirst()
				.getScopeSpans().getFirst()
				.getSpans().getFirst();
		assertThat(work.getName()).isEqualTo("Import the catalog");
		assertThat(work.getChildren()).extracting(Span::getName).containsExactly("Index the books");
		assertThat(work.getLogRecords())
			.extracting(log -> log.getBody().getStringValue())
			.containsExactly("Two books found");
		// end::recording[]
		assertThat(directory.resolve("traces.xml")).exists();
	}

}
