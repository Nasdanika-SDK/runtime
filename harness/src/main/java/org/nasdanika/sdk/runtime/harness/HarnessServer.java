package org.nasdanika.sdk.runtime.harness;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedHashMap;
import java.util.Map;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;

/**
 * The server of a {@link Harness} body.
 */
final class HarnessServer implements Server, AutoCloseable {

	// HTTP semantic conventions, stable
	static final AttributeKey<String> HTTP_REQUEST_METHOD = AttributeKey.stringKey("http.request.method");
	static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE = AttributeKey.longKey("http.response.status_code");

	private final HttpServer httpServer;
	private final OpenTelemetry openTelemetry;
	private final URI base;
	private final HttpClient client;
	Span span;

	HarnessServer(HttpServer httpServer, OpenTelemetry openTelemetry) {
		this.httpServer = httpServer;
		this.openTelemetry = openTelemetry;
		base = URI.create("http://" + httpServer.getAddress().getHostString() + ":" + httpServer.getAddress().getPort() + "/");
		client = HttpClient.newHttpClient();
	}

	@Override
	public URI base() {
		return base;
	}

	@Override
	public int port() {
		return httpServer.getAddress().getPort();
	}

	@Override
	public URI uri(String path) {
		return base.resolve(path.startsWith("/") ? path.substring(1) : path);
	}

	@Override
	public HttpServer httpServer() {
		return httpServer;
	}

	@Override
	public OpenTelemetry openTelemetry() {
		return openTelemetry;
	}

	@Override
	public Span span() {
		return span;
	}

	@Override
	public HttpClient client() {
		return client;
	}

	@Override
	public <B> HttpResponse<B> send(HttpRequest request, HttpResponse.BodyHandler<B> bodyHandler) throws IOException {
		Span clientSpan = Telemetry.tracer(openTelemetry)
				.spanBuilder(request.method() + " " + request.uri().getPath())
				.setSpanKind(SpanKind.CLIENT)
				.setAttribute(HTTP_REQUEST_METHOD, request.method())
				.setAttribute(Harness.URL_FULL, request.uri().toString())
				.setAttribute(Harness.SERVER_ADDRESS, request.uri().getHost())
				.setAttribute(Harness.SERVER_PORT, (long) request.uri().getPort())
				.startSpan();
		try (Scope scope = clientSpan.makeCurrent()) {
			HttpRequest.Builder builder = HttpRequest.newBuilder(request, (name, value) -> true);
			propagationHeaders(Context.current()).forEach(builder::setHeader);
			HttpResponse<B> response = client.send(builder.build(), bodyHandler);
			clientSpan.setAttribute(HTTP_RESPONSE_STATUS_CODE, (long) response.statusCode());
			if (response.statusCode() >= 400) {
				clientSpan.setStatus(StatusCode.ERROR); // For a client, 4xx is an error too
			}
			return response;
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			Telemetry.recordFailure(clientSpan, e);
			InterruptedIOException interrupted = new InterruptedIOException("Interrupted: " + request.uri());
			interrupted.initCause(e);
			throw interrupted;
		} catch (IOException | RuntimeException e) {
			Telemetry.recordFailure(clientSpan, e);
			throw e;
		} finally {
			clientSpan.end();
		}
	}

	@Override
	public Map<String, String> propagationHeaders(Context context) {
		Map<String, String> headers = new LinkedHashMap<>();
		openTelemetry.getPropagators().getTextMapPropagator().inject(context, headers, (carrier, key, value) -> carrier.put(key, value));
		return headers;
	}

	@Override
	public void close() {
		client.close();
	}

}
