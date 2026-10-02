package org.nasdanika.sdk.runtime.volume.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Objects;

import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredOutputStream;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpsExchange;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import io.opentelemetry.context.propagation.TextMapGetter;

/**
 * Makes each request a unit of work with a server span. Wraps a handler:
 *
 * <pre>
 * server.createContext("/files", new TelemetryHandler(new VolumeHttpHandler(volume), openTelemetry));
 * </pre>
 *
 * or, the JDK's own extension point, is added as a filter of a context:
 *
 * <pre>
 * server.createContext("/files", new VolumeHttpHandler(volume)).getFilters().add(TelemetryHandler.filter(openTelemetry));
 * </pre>
 *
 * Per request:
 *
 * <ul>
 * <li>The trace context is extracted from the request headers with the instance's propagators, so
 * a client's span (the {@code GET} span of a {@code Content.of(URI)} read, for one) is the parent.</li>
 * <li>A {@link SpanKind#SERVER} span named {@code <method> <route>}, the route being the context
 * path, with the HTTP semantic convention attributes: method, route, path, scheme, server and client
 * address, protocol version, user agent, response status and response body size.</li>
 * <li>The instance and the span are current while the delegate runs ({@link Telemetry#current()}),
 * so whatever the delegate does reports to this request: content transfers, resource loads, its
 * own log records.</li>
 * <li>A failure of the delegate is recorded on the span. If no response was sent yet, the client
 * gets a {@code 500}; if one was, the connection is dropped rather than the response completed. The span has the error status for a failure or a {@code 5xx}; a {@code 4xx}
 * is the client's error, not the server's, and leaves the status unset.</li>
 * <li>The span ends when the delegate returns: the JDK server's handlers write the response
 * before returning.</li>
 * </ul>
 */
public class TelemetryHandler implements HttpHandler {

	// HTTP semantic conventions, stable
	static final AttributeKey<String> HTTP_REQUEST_METHOD = AttributeKey.stringKey("http.request.method");
	static final AttributeKey<String> HTTP_ROUTE = AttributeKey.stringKey("http.route");
	static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE = AttributeKey.longKey("http.response.status_code");
	static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE = AttributeKey.longKey("http.response.body.size");
	static final AttributeKey<String> URL_PATH = AttributeKey.stringKey("url.path");
	static final AttributeKey<String> URL_SCHEME = AttributeKey.stringKey("url.scheme");
	static final AttributeKey<String> SERVER_ADDRESS = AttributeKey.stringKey("server.address");
	static final AttributeKey<Long> SERVER_PORT = AttributeKey.longKey("server.port");
	static final AttributeKey<String> CLIENT_ADDRESS = AttributeKey.stringKey("client.address");
	static final AttributeKey<String> NETWORK_PROTOCOL_VERSION = AttributeKey.stringKey("network.protocol.version");
	static final AttributeKey<String> USER_AGENT_ORIGINAL = AttributeKey.stringKey("user_agent.original");

	private static final TextMapGetter<Headers> HEADERS = new TextMapGetter<>() {

		@Override
		public Iterable<String> keys(Headers carrier) {
			return carrier.keySet();
		}

		@Override
		public String get(Headers carrier, String key) {
			return carrier == null ? null : carrier.getFirst(key); // case-insensitive
		}

	};

	@FunctionalInterface
	private interface Delegate {

		void handle(HttpExchange exchange) throws IOException;

	}

	private final HttpHandler delegate;
	private final OpenTelemetry openTelemetry;

	public TelemetryHandler(HttpHandler delegate, OpenTelemetry openTelemetry) {
		this.delegate = Objects.requireNonNull(delegate, "delegate");
		this.openTelemetry = Objects.requireNonNull(openTelemetry, "openTelemetry");
	}

	public HttpHandler getDelegate() {
		return delegate;
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		handle(exchange, openTelemetry, delegate::handle);
	}

	/**
	 * The same, as a filter of a context.
	 */
	public static Filter filter(OpenTelemetry openTelemetry) {
		Objects.requireNonNull(openTelemetry, "openTelemetry");
		return new Filter() {

			@Override
			public void doFilter(HttpExchange exchange, Chain chain) throws IOException {
				handle(exchange, openTelemetry, chain::doFilter);
			}

			@Override
			public String description() {
				return "OpenTelemetry server spans";
			}

		};
	}

	private static void handle(HttpExchange exchange, OpenTelemetry openTelemetry, Delegate delegate) throws IOException {
		Context parent = openTelemetry.getPropagators().getTextMapPropagator().extract(
				Telemetry.with(Context.root(), openTelemetry),
				exchange.getRequestHeaders(),
				HEADERS);

		String method = exchange.getRequestMethod();
		String route = exchange.getHttpContext().getPath();
		var builder = Telemetry.tracer(openTelemetry)
				.spanBuilder(method + " " + route)
				.setParent(parent)
				.setSpanKind(SpanKind.SERVER)
				.setAttribute(HTTP_REQUEST_METHOD, method)
				.setAttribute(HTTP_ROUTE, route)
				.setAttribute(URL_PATH, exchange.getRequestURI().getRawPath())
				.setAttribute(URL_SCHEME, exchange instanceof HttpsExchange ? "https" : "http");
		InetSocketAddress local = exchange.getLocalAddress();
		if (local != null) {
			builder.setAttribute(SERVER_ADDRESS, local.getHostString()).setAttribute(SERVER_PORT, (long) local.getPort());
		}
		InetSocketAddress remote = exchange.getRemoteAddress();
		if (remote != null) {
			builder.setAttribute(CLIENT_ADDRESS, remote.getAddress() == null ? remote.getHostString() : remote.getAddress().getHostAddress());
		}
		String protocol = exchange.getProtocol();
		if (protocol != null && protocol.startsWith("HTTP/")) {
			builder.setAttribute(NETWORK_PROTOCOL_VERSION, protocol.substring("HTTP/".length()));
		}
		String userAgent = exchange.getRequestHeaders().getFirst("User-Agent");
		if (userAgent != null) {
			builder.setAttribute(USER_AGENT_ORIGINAL, userAgent);
		}
		Span span = builder.startSpan();

		MeteredOutputStream body = new MeteredOutputStream(exchange.getResponseBody(), null, 0);
		exchange.setStreams(null, body);
		try (Scope scope = parent.with(span).makeCurrent()) {
			delegate.handle(exchange);
		} catch (IOException | RuntimeException | Error e) {
			Telemetry.recordFailure(span, e);
			if (exchange.getResponseCode() == -1) {
				try {
					exchange.sendResponseHeaders(500, -1);
					exchange.close();
				} catch (IOException ignored) {
					// The connection is gone
				}
			}
			// After the response started, the exchange is left open: closing it would complete a
			// truncated response. The JDK server drops the connection when the failure propagates.
			throw e;
		} finally {
			int status = exchange.getResponseCode();
			if (status != -1) {
				span.setAttribute(HTTP_RESPONSE_STATUS_CODE, (long) status);
				if (status >= 500) {
					span.setStatus(StatusCode.ERROR);
				}
			}
			span.setAttribute(HTTP_RESPONSE_BODY_SIZE, body.getCount());
			span.end();
		}
	}

}
