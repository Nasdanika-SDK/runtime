package org.nasdanika.sdk.runtime.harness;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Context;

/**
 * A server that is up while a {@link Harness} body runs, and a client for it whose requests carry
 * the trace.
 */
public interface Server {

	/**
	 * The server's base URI, {@code http://127.0.0.1:<port>/}.
	 */
	URI base();

	int port();

	/**
	 * The base URI resolved against a path, such as {@code "books/1"} or {@code "/books/1"}.
	 */
	URI uri(String path);

	HttpServer httpServer();

	OpenTelemetry openTelemetry();

	/**
	 * The span the body runs in.
	 */
	Span span();

	/**
	 * A client for the server, open while the body runs.
	 */
	HttpClient client();

	/**
	 * Sends a request in a client span, a child of the current span, with the trace context
	 * propagated in the request headers. The server's span for the request is a child of it.
	 *
	 * @throws java.io.InterruptedIOException if interrupted, with the interrupt status set
	 */
	<B> HttpResponse<B> send(HttpRequest request, HttpResponse.BodyHandler<B> bodyHandler) throws IOException;

	/**
	 * {@code GET} of a path, with the body as a string.
	 */
	default HttpResponse<String> get(String path) throws IOException {
		return send(HttpRequest.newBuilder(uri(path)).GET().build(), HttpResponse.BodyHandlers.ofString());
	}

	/**
	 * The headers that propagate a context, {@code traceparent} and {@code baggage} for W3C
	 * propagators, for clients that send requests themselves, such as a browser.
	 */
	Map<String, String> propagationHeaders(Context context);

}
