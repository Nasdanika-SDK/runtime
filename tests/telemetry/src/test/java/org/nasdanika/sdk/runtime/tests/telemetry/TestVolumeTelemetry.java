package org.nasdanika.sdk.runtime.tests.telemetry;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.volume.Content;

import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.Scope;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.SimpleLogRecordProcessor;
import io.opentelemetry.sdk.testing.exporter.InMemoryLogRecordExporter;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;

/**
 * Volume content telemetry recorded by an SDK: HTTP reads as client spans with trace context
 * propagation, pushes, and pipes whose writer runs in the pipe's span on another thread.
 */
class TestVolumeTelemetry {

	private static final int SIZE = 64 * 1024;

	private InMemorySpanExporter spans;
	private OpenTelemetrySdk openTelemetry;
	private Scope scope;
	private HttpServer server;
	private final List<String> traceparents = new CopyOnWriteArrayList<>();

	@BeforeEach
	void setUp() throws IOException {
		spans = InMemorySpanExporter.create();
		openTelemetry = OpenTelemetrySdk.builder()
				.setTracerProvider(SdkTracerProvider.builder().addSpanProcessor(SimpleSpanProcessor.create(spans)).build())
				.setLoggerProvider(SdkLoggerProvider.builder().addLogRecordProcessor(SimpleLogRecordProcessor.create(InMemoryLogRecordExporter.create())).build())
				.setPropagators(ContextPropagators.create(W3CTraceContextPropagator.getInstance())) // the SDK's default propagates nothing
				.build();
		scope = Telemetry.makeCurrent(openTelemetry);

		// A server on a random port. Unregistered paths are 404.
		server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
		server.createContext("/data", exchange -> {
			traceparents.add(exchange.getRequestHeaders().getFirst("traceparent"));
			exchange.sendResponseHeaders(200, SIZE);
			try (OutputStream body = exchange.getResponseBody()) {
				body.write(new byte[SIZE]);
			}
		});
		server.start();
	}

	@AfterEach
	void tearDown() {
		server.stop(0);
		scope.close();
		openTelemetry.close();
	}

	private URI uri(String pathAndQuery) {
		return URI.create("http://127.0.0.1:" + server.getAddress().getPort() + pathAndQuery);
	}

	private SpanData span(String name) {
		List<SpanData> named = spans.getFinishedSpanItems().stream().filter(s -> s.getName().equals(name)).toList();
		assertThat(named).as(name).hasSize(1);
		return named.getFirst();
	}

	/**
	 * Pushing HTTP content: a {@code Content.writeTo} span over a {@code GET} client span, which
	 * propagated its context to the server and recorded no query string.
	 */
	@Test
	void httpContent() throws IOException {
		Tracer tracer = Telemetry.tracer(openTelemetry);
		Content content = Content.of(uri("/data?token=secret"));

		Span download = tracer.spanBuilder("download").startSpan();
		try (Scope downloadScope = download.makeCurrent()) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			content.writeTo(out);
			assertThat(out.size()).isEqualTo(SIZE);
		} finally {
			download.end();
		}

		SpanData writeTo = span("Content.writeTo");
		SpanData get = span("GET");
		assertThat(writeTo.getParentSpanContext()).isEqualTo(span("download").getSpanContext());
		assertThat(get.getParentSpanContext()).isEqualTo(writeTo.getSpanContext());
		assertThat(get.getKind()).isEqualTo(SpanKind.CLIENT);
		assertThat(get.getAttributes().get(AttributeKey.longKey("http.response.status_code"))).isEqualTo(200L);
		assertThat(get.getAttributes().get(AttributeKey.stringKey("url.full"))).isEqualTo(uri("/data").toString());
		assertThat(get.getAttributes().get(Telemetry.IO_BYTES)).isEqualTo((long) SIZE);
		assertThat(writeTo.getAttributes().get(Telemetry.IO_BYTES)).isEqualTo((long) SIZE);

		// The server saw the GET span as its parent
		assertThat(traceparents).singleElement().asString().startsWith("00-" + get.getTraceId() + "-" + get.getSpanId() + "-");
	}

	@Test
	void httpNotFound() {
		assertThatThrownBy(() -> {
			try (InputStream in = Content.of(uri("/missing")).openStream()) {
				in.readAllBytes();
			}
		}).isInstanceOf(NoSuchFileException.class);

		SpanData get = span("GET");
		assertThat(get.getStatus().getStatusCode()).isEqualTo(StatusCode.ERROR);
		assertThat(get.getAttributes().get(AttributeKey.longKey("http.response.status_code"))).isEqualTo(404L);
	}

	/**
	 * A model as content: {@code Content.ofWriter(out -> resource.save(out, null))} serializes
	 * nothing until read. Pulled as a stream, the save runs on the pipe's writer thread, and its
	 * span is a child of the pipe's.
	 */
	@Test
	void modelAsPipedContent() throws IOException {
		NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI("memory:/model.xmi"));
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("piped");
		resource.getContents().add(ePackage);

		Content content = Content.ofWriter(out -> resource.save(out, null));
		String xmi;
		try (InputStream in = content.openStream()) {
			xmi = new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
		assertThat(xmi).contains("name=\"piped\"");

		SpanData pipe = span("Content.pipe");
		SpanData save = span("Resource.save");
		assertThat(save.getParentSpanContext()).isEqualTo(pipe.getSpanContext());
		assertThat(pipe.getAttributes().get(Telemetry.IO_BYTES)).isEqualTo((long) xmi.getBytes(StandardCharsets.UTF_8).length);
		assertThat(save.getAttributes().get(Telemetry.IO_BYTES)).isEqualTo(pipe.getAttributes().get(Telemetry.IO_BYTES));
	}

	/**
	 * A reader that stops early cancels the writer, and the pipe span says so instead of reporting
	 * an error.
	 */
	@Test
	void cancelledPipe() throws IOException, InterruptedException {
		Content endless = Content.ofWriter(out -> {
			byte[] chunk = new byte[8192];
			while (true) {
				out.write(chunk);
			}
		});
		try (InputStream in = endless.openStream()) {
			in.readNBytes(100_000);
		}
		for (int i = 0; i < 100 && spans.getFinishedSpanItems().isEmpty(); ++i) {
			Thread.sleep(50); // the writer ends its span on its own thread
		}
		SpanData pipe = span("Content.pipe");
		assertThat(pipe.getAttributes().get(Telemetry.CONTENT_CANCELLED)).isTrue();
		assertThat(pipe.getStatus().getStatusCode()).isEqualTo(StatusCode.UNSET);
	}

}
