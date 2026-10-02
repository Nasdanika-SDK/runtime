package org.nasdanika.sdk.runtime.tests.telemetry;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.http.TelemetryHandler;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;

import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.Scope;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;

/**
 * Server spans from {@link TelemetryHandler}: a client read of {@code Content.of(URI)} and the
 * server handling it are one trace, and what the handler does nests under the server span.
 */
class TestServerTelemetry {

	/**
	 * Two files: text produced by a writer, and one whose content fails while it is sent.
	 */
	private static final class TestVolume implements Volume {

		private final Map<String, Content> files = Map.of(
				"hello.txt", Content.of("Hello, volume", StandardCharsets.UTF_8),
				"broken.txt", Content.ofWriter(out -> {
					out.write("partial".getBytes(StandardCharsets.UTF_8));
					throw new IOException("Backend failed");
				}));

		@Override
		public Optional<Entry> stat(String path) {
			if (".".equals(path)) {
				return Optional.of(new Entry(path, Entry.Kind.DIRECTORY, -1, null, null));
			}
			return files.containsKey(path) ? Optional.of(new Entry(path, Entry.Kind.FILE, -1, null, Instant.EPOCH)) : Optional.empty();
		}

		@Override
		public List<Entry> list(String directory) {
			return files.keySet().stream().sorted().map(p -> stat(p).orElseThrow()).toList();
		}

		@Override
		public Content content(String path) {
			return files.get(path);
		}

		@Override
		public boolean caseSensitive() {
			return true;
		}

		@Override
		public <T> Optional<T> capability(Class<T> type) {
			return Optional.empty();
		}

	}

	private InMemorySpanExporter spans;
	private OpenTelemetrySdk openTelemetry;
	private Scope scope;
	private HttpServer server;

	@BeforeEach
	void setUp() throws IOException {
		spans = InMemorySpanExporter.create();
		openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder().addSpanProcessor(SimpleSpanProcessor.create(spans)).build())
				.setPropagators(ContextPropagators.create(W3CTraceContextPropagator.getInstance()))
				.build();
		scope = Telemetry.makeCurrent(openTelemetry); // the client's unit of work

		server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
		VolumeHttpHandler files = new VolumeHttpHandler(new TestVolume());
		server.createContext("/files", new TelemetryHandler(files, openTelemetry)); // wrapping
		server.createContext("/filtered", files).getFilters().add(TelemetryHandler.filter(openTelemetry)); // or filtering
		server.start();
	}

	@AfterEach
	void tearDown() {
		server.stop(0);
		scope.close();
		openTelemetry.close();
	}

	private URI uri(String path) {
		return URI.create("http://127.0.0.1:" + server.getAddress().getPort() + path);
	}

	/**
	 * The server span ends on the server's thread after the response is complete, possibly after the
	 * client has read it.
	 */
	private SpanData await(String name) throws InterruptedException {
		for (int i = 0; i < 100; ++i) {
			Optional<SpanData> span = spans.getFinishedSpanItems().stream().filter(s -> s.getName().equals(name)).findFirst();
			if (span.isPresent()) {
				return span.get();
			}
			Thread.sleep(50);
		}
		throw new AssertionError("No span " + name + " in " + spans.getFinishedSpanItems());
	}

	@Test
	void oneTraceAcrossTheWire() throws Exception {
		String text;
		try (InputStream in = Content.of(uri("/files/hello.txt")).openStream()) {
			text = new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
		assertThat(text).isEqualTo("Hello, volume");

		SpanData client = await("GET");
		SpanData server = await("GET /files");
		SpanData writeTo = await("Content.writeTo");

		assertThat(server.getKind()).isEqualTo(SpanKind.SERVER);
		assertThat(server.getParentSpanContext().getSpanId()).isEqualTo(client.getSpanId()); // a remote copy of the client span context
		assertThat(server.getParentSpanContext().isRemote()).isTrue();
		assertThat(server.getTraceId()).isEqualTo(client.getTraceId());
		assertThat(writeTo.getParentSpanContext()).isEqualTo(server.getSpanContext());

		var attributes = server.getAttributes();
		assertThat(attributes.get(AttributeKey.stringKey("http.route"))).isEqualTo("/files");
		assertThat(attributes.get(AttributeKey.stringKey("url.path"))).isEqualTo("/files/hello.txt");
		assertThat(attributes.get(AttributeKey.longKey("http.response.status_code"))).isEqualTo(200L);
		assertThat(attributes.get(AttributeKey.longKey("http.response.body.size"))).isEqualTo(13L);
		assertThat(attributes.get(AttributeKey.stringKey("user_agent.original"))).startsWith("Java-http-client");
		assertThat(server.getStatus().getStatusCode()).isEqualTo(StatusCode.UNSET);
	}

	/**
	 * A 404 is the client's error: the client span has the error status, the server span does not.
	 */
	@Test
	void notFoundThroughTheFilter() throws Exception {
		assertThatThrownBy(() -> Content.of(uri("/filtered/missing.txt")).openStream()).isInstanceOf(NoSuchFileException.class);

		SpanData server = await("GET /filtered");
		assertThat(server.getAttributes().get(AttributeKey.longKey("http.response.status_code"))).isEqualTo(404L);
		assertThat(server.getStatus().getStatusCode()).isEqualTo(StatusCode.UNSET);
		assertThat(await("GET").getStatus().getStatusCode()).isEqualTo(StatusCode.ERROR);
	}

	/**
	 * A failure after the response started: the client sees a truncated response, the server span
	 * records the exception.
	 */
	@Test
	void failureWhileSending() throws Exception {
		assertThatThrownBy(() -> {
			try (InputStream in = Content.of(uri("/files/broken.txt")).openStream()) {
				in.readAllBytes();
			}
		}).isInstanceOf(IOException.class);

		SpanData server = await("GET /files");
		assertThat(server.getStatus().getStatusCode()).isEqualTo(StatusCode.ERROR);
		assertThat(server.getEvents()).anySatisfy(e -> assertThat(e.getName()).isEqualTo("exception"));
	}

}
