package org.nasdanika.sdk.runtime.volume.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
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

/**
 * The listings of the Volumes and Content book.
 */
public class VolumeBookTests {

	private static String read(Content content) throws IOException {
		try (InputStream in = content.openStream()) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
	}

	@Test
	public void dataAsFiles() throws IOException {
		// tag::read[]
		Volume glossary = new GlossaryVolume(GlossaryVolume.terms());
		assertThat(glossary.list("."))
			.extracting(Volume.Entry::path)
			.containsExactly("index.md", "terms");
		assertThat(glossary.stat("terms/content.md")).hasValueSatisfying(entry -> {
			assertThat(entry.kind()).isEqualTo(Volume.Entry.Kind.FILE);
			assertThat(entry.hash()).isNotNull();                                // <1>
		});
		try (InputStream in = glossary.content("terms/content.md").openStream()) {
			assertThat(new String(in.readAllBytes(), StandardCharsets.UTF_8))
				.startsWith("# Content")
				.contains("[Glossary](../index.md)");
		}
		Content missing = glossary.content("terms/missing.md");                 // <2>
		assertThatThrownBy(missing::openStream).isInstanceOf(NoSuchFileException.class);
		// end::read[]
	}

	@Test
	public void directories(@TempDir Path directory) throws IOException {
		// tag::directory[]
		Volume volume = Volume.of(directory);
		Volume.Writable writable = volume.capability(Volume.Writable.class).orElseThrow();
		Content hello = Content.of("# Hello", StandardCharsets.UTF_8);

		assertThatThrownBy(() -> writable.write("notes/hello.md", hello))
			.isInstanceOf(NoSuchFileException.class);                            // <1>
		writable.createDirectory("notes");
		writable.write("notes/hello.md", hello);
		writable.move("notes/hello.md", "notes/welcome.md");                     // <2>

		assertThat(volume.list("notes"))
			.extracting(Volume.Entry::path)
			.containsExactly("notes/welcome.md");
		assertThat(directory.resolve("notes/welcome.md")).hasContent("# Hello");
		assertThatThrownBy(() -> volume.stat("../outside"))
			.isInstanceOf(IllegalArgumentException.class);                       // <3>
		// end::directory[]
	}

	@Test
	public void textVolume(@TempDir Path directory) throws IOException {
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
	public void content() throws IOException {
		// tag::content[]
		Content bytes = Content.of("in memory".getBytes(StandardCharsets.UTF_8));
		assertThat(bytes.length()).hasValue(9);                                  // <1>

		AtomicInteger runs = new AtomicInteger();
		Content written = Content.ofWriter(out -> {
			runs.incrementAndGet();
			out.write("written on demand".getBytes(StandardCharsets.UTF_8));
		});
		assertThat(runs).hasValue(0);                                            // <2>
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		written.writeTo(out);                                                    // <3>
		assertThat(read(written)).isEqualTo(out.toString(StandardCharsets.UTF_8)); // <4>
		assertThat(runs).hasValue(2);

		Content once = Content.once(InputStream.nullInputStream());
		assertThat(once.repeatable()).isFalse();                                 // <5>
		// end::content[]
	}

	@Test
	public void modelsInAVolume(@TempDir Path directory) throws IOException {
		// tag::models-in-volume[]
		Volume volume = Volume.of(directory);                                    // <1>
		Models.save(Models.glossary(), volume, "2026/glossary.ecore");           // <2>
		assertThat(directory.resolve("2026").resolve("glossary.ecore")).exists(); // <3>
		EPackage loaded = Models.load(volume, "2026/glossary.ecore");
		assertThat(loaded.getEClassifiers()).hasSize(4);
		// end::models-in-volume[]
	}

	@Test
	public void writerContent(@TempDir Path directory) throws IOException {
		Resource resource = Models.resourceSet(Volume.of(directory))
				.createResource(Models.BASE.appendSegment("source.ecore"));
		resource.getContents().add(Models.glossary());
		Models.copy(resource, Volume.of(directory), "copy.ecore");
		assertThat(Files.readString(directory.resolve("copy.ecore"))).contains("Capability");
	}

	@Test
	public void servedOverHttpAndWebDav() throws Exception {
		Volume volume = new GlossaryVolume(GlossaryVolume.terms());
		HttpServer server = Serve.serve(volume, OpenTelemetry.noop(), 0);
		String root = "http://127.0.0.1:" + server.getAddress().getPort();
		try {
			// tag::fetch[]
			Content index = Content.of(URI.create(root + "/glossary/index.md")); // <1>
			assertThat(read(index)).startsWith("# Glossary");
			// end::fetch[]

			// tag::propfind[]
			HttpResponse<String> listing = HttpClient.newHttpClient().send(
					HttpRequest.newBuilder(URI.create(root + "/dav/terms/"))
						.method("PROPFIND", HttpRequest.BodyPublishers.noBody())
						.header("Depth", "1")
						.build(),
					HttpResponse.BodyHandlers.ofString());
			assertThat(listing.statusCode()).isEqualTo(207);                    // <1>
			assertThat(listing.body()).contains("volume.md");
			// end::propfind[]
		} finally {
			server.stop(0);
		}
	}

	@Test
	public void oneTraceAcrossClientAndServer() throws Exception {
		Volume volume = new GlossaryVolume(GlossaryVolume.terms());
		// tag::trace[]
		InMemorySpanExporter exporter = InMemorySpanExporter.create();
		var tracerProvider = SdkTracerProvider.builder()
				.addSpanProcessor(SimpleSpanProcessor.create(exporter))
				.build();
		try (OpenTelemetrySdk sdk = OpenTelemetrySdk.builder()
				.setPropagators(Telemetry.w3cPropagators())                      // <1>
				.setTracerProvider(tracerProvider)
				.build()) {
			HttpServer server = Serve.serve(volume, sdk, 0);                     // <2>
			int port = server.getAddress().getPort();
			URI index = URI.create("http://127.0.0.1:" + port + "/glossary/index.md");
			try (Scope scope = Telemetry.makeCurrent(sdk);                       // <3>
					InputStream in = Content.of(index).openStream()) {
				in.readAllBytes();
			} finally {
				server.stop(0);
			}
			SpanData client = await(exporter, SpanKind.CLIENT);
			SpanData handled = await(exporter, SpanKind.SERVER);
			assertThat(handled.getTraceId()).isEqualTo(client.getTraceId());     // <4>
			assertThat(handled.getParentSpanId()).isEqualTo(client.getSpanId());
			assertThat(handled.getName()).isEqualTo("GET /glossary");
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
