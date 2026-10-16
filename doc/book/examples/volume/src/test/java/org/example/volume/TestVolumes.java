package org.example.volume;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.example.library.Library;
import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.GenericVolume;
import org.nasdanika.sdk.runtime.volume.Volume;

import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;

class TestVolumes {

	@Test
	void aModelAsFiles() throws IOException {
		// tag::read[]
		Volume catalog = new CatalogVolume(Samples.library());
		assertThat(catalog.list("."))
			.extracting(Volume.Entry::path)
			.containsExactly("authors", "books", "index.md");
		assertThat(catalog.stat("books/domain-driven-design.md")).hasValueSatisfying(entry -> {
			assertThat(entry.kind()).isEqualTo(Volume.Entry.Kind.FILE);
			assertThat(entry.hash()).isNotNull();                                // <1>
		});
		try (InputStream in = catalog.content("books/design-patterns.md").openStream()) {
			assertThat(new String(in.readAllBytes(), StandardCharsets.UTF_8))
				.contains("* Cited by: [Domain-Driven Design](domain-driven-design.md)");
		}
		// end::read[]
	}

	@Test
	void modelsInAVolume(@TempDir Path directory) throws IOException {
		// tag::models-in-volume[]
		Volume volume = Volume.of(directory);                                    // <1>
		Shelves.save(Samples.library(), volume, "2026/shelf.library");           // <2>
		assertThat(directory.resolve("2026").resolve("shelf.library")).exists(); // <3>
		Library loaded = Shelves.load(volume, "2026/shelf.library");
		assertThat(loaded.getBooks()).hasSize(8);
		// end::models-in-volume[]
	}

	@Test
	void aTextVolume(@TempDir Path directory) throws IOException {
		// tag::text-volume[]
		GenericVolume<String> text = Volume.of(directory).adapt(
				content -> {                                                     // <1>
					try (InputStream in = content.openStream()) {
						return new String(in.readAllBytes(), StandardCharsets.UTF_8);
					} catch (IOException e) {
						throw new UncheckedIOException(e);
					}
				},
				string -> Content.of(string, StandardCharsets.UTF_8));           // <2>

		@SuppressWarnings("unchecked")
		GenericVolume.Writable<String> writable = text.capability(GenericVolume.Writable.class)
				.orElseThrow();
		writable.write("hello.md", "# Hello");
		assertThat(text.content("hello.md")).isEqualTo("# Hello");
		assertThat(directory.resolve("hello.md")).hasContent("# Hello");
		// end::text-volume[]
	}

	@Test
	void writerContent(@TempDir Path directory) throws IOException {
		Resource resource = Shelves.resourceSet(Volume.of(directory))
				.createResource(Shelves.BASE.appendSegment("source.library"));
		resource.getContents().add(Samples.library());
		Shelves.copy(resource, Volume.of(directory), "copy.library");
		assertThat(Files.readString(directory.resolve("copy.library")))
			.contains("Domain-Driven Design");
	}

	@Test
	void servedOverHttpAndWebDav() throws Exception {
		HttpServer server = Serve.serve(Samples.library(), OpenTelemetry.noop(), 0);
		String root = "http://127.0.0.1:" + server.getAddress().getPort();
		try {
			// tag::fetch[]
			Content index = Content.of(URI.create(root + "/catalog/index.md")); // <1>
			try (InputStream in = index.openStream()) {
				String markdown = new String(in.readAllBytes(), StandardCharsets.UTF_8);
				assertThat(markdown).startsWith("# A Modeler's Shelf");
			}
			// end::fetch[]

			// tag::propfind[]
			HttpResponse<String> listing = HttpClient.newHttpClient().send(
					HttpRequest.newBuilder(URI.create(root + "/dav/books/"))
						.method("PROPFIND", HttpRequest.BodyPublishers.noBody())
						.header("Depth", "1")
						.build(),
					HttpResponse.BodyHandlers.ofString());
			assertThat(listing.statusCode()).isEqualTo(207); // Multi-Status
			assertThat(listing.body()).contains("domain-driven-design.md");
			// end::propfind[]
		} finally {
			server.stop(0);
		}
	}

	@Test
	void oneTraceAcrossClientAndServer() throws Exception {
		// tag::trace[]
		InMemorySpanExporter exporter = InMemorySpanExporter.create();
		var tracerProvider = SdkTracerProvider.builder()
				.addSpanProcessor(SimpleSpanProcessor.create(exporter))
				.build();
		try (OpenTelemetrySdk sdk = OpenTelemetrySdk.builder()
				.setPropagators(Telemetry.w3cPropagators())                      // <1>
				.setTracerProvider(tracerProvider)
				.build()) {
			HttpServer server = Serve.serve(Samples.library(), sdk, 0);          // <2>
			String index = "http://127.0.0.1:" + server.getAddress().getPort() + "/catalog/index.md";
			try (Scope scope = Telemetry.makeCurrent(sdk);                       // <3>
					InputStream in = Content.of(URI.create(index)).openStream()) {
				in.readAllBytes();
			} finally {
				server.stop(0);
			}
			SpanData client = await(exporter, SpanKind.CLIENT);
			SpanData handled = await(exporter, SpanKind.SERVER);
			assertThat(handled.getTraceId()).isEqualTo(client.getTraceId());     // <4>
			assertThat(handled.getParentSpanId()).isEqualTo(client.getSpanId());
			assertThat(handled.getName()).isEqualTo("GET /catalog");
		}
		// end::trace[]
	}

	private static SpanData await(InMemorySpanExporter exporter, SpanKind kind)
			throws InterruptedException {
		Instant deadline = Instant.now().plus(Duration.ofSeconds(5));
		while (Instant.now().isBefore(deadline)) {
			List<SpanData> spans = exporter.getFinishedSpanItems().stream()
					.filter(s -> s.getKind() == kind)
					.toList();
			if (!spans.isEmpty()) {
				return spans.getFirst();
			}
			Thread.sleep(20);
		}
		throw new AssertionError("No " + kind + " span");
	}

}
