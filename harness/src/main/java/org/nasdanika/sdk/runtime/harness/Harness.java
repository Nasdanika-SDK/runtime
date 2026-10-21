package org.nasdanika.sdk.runtime.harness;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.volume.http.TelemetryHandler;

import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;

/**
 * Runs code against an HTTP server that is up only while the code runs, in one trace: the code
 * runs in a span, requests it sends through the {@link Server} are client spans that carry the
 * trace to the server, and every request the server handles is a server span, a child of the
 * client span that sent it.
 *
 * <pre>
 * String body = Harness.inServer("Library", routes -&gt; routes.createContext("/", handler), server -&gt; {
 *     return server.get("/books").body();
 * });
 * </pre>
 *
 * Like {@link Telemetry#inSpan(io.opentelemetry.api.trace.Tracer, String, Attributes, Telemetry.SpanBody)},
 * with a server around the body. The server listens on the loopback address on a free port and
 * handles requests on virtual threads; every context created on it is instrumented with
 * {@link TelemetryHandler}. It is stopped when the body returns or throws.
 *
 * <p>
 * The telemetry goes to the {@link OpenTelemetry} given, or the {@link Telemetry#current() current}
 * one. With one instance for the client and the server, which is what running both in one JVM
 * gives for free, the client's and the server's spans are in one trace and one recording.
 */
public final class Harness {

	public static final AttributeKey<String> URL_FULL = AttributeKey.stringKey("url.full");

	public static final AttributeKey<String> SERVER_ADDRESS = AttributeKey.stringKey("server.address");

	public static final AttributeKey<Long> SERVER_PORT = AttributeKey.longKey("server.port");

	private Harness() {
		// Utility
	}

	/**
	 * Code to run while the server is up.
	 *
	 * @param <T> Result type
	 * @param <E> Exception type
	 */
	@FunctionalInterface
	public interface ServerBody<T, E extends Throwable> {

		T run(Server server) throws E;

	}

	/**
	 * With the {@link Telemetry#current() current} OpenTelemetry.
	 */
	public static <T, E extends Throwable> T inServer(String name, Consumer<? super HttpServer> routes, ServerBody<T, E> body) throws E {
		return inServer(Telemetry.current(), name, routes, body);
	}

	/**
	 * Starts a server, configures it, runs the body in a span with the server's address as
	 * attributes, and stops the server.
	 *
	 * @param openTelemetry Receives the spans of the body, its requests and the server
	 * @param name Name of the span the body runs in
	 * @param routes Creates the server's contexts. Contexts are instrumented as they are created
	 * @param body Runs while the server is up
	 * @return What the body returns
	 */
	public static <T, E extends Throwable> T inServer(
			OpenTelemetry openTelemetry,
			String name,
			Consumer<? super HttpServer> routes,
			ServerBody<T, E> body) throws E {

		Objects.requireNonNull(openTelemetry, "openTelemetry");
		HttpServer httpServer;
		try {
			httpServer = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
			httpServer.setExecutor(executor);
			routes.accept(new TracedHttpServer(httpServer, TelemetryHandler.filter(openTelemetry)));
			httpServer.start();
			try {
				HarnessServer server = new HarnessServer(httpServer, openTelemetry);
				Attributes attributes = Attributes.of(
						URL_FULL, server.base().toString(),
						SERVER_ADDRESS, server.base().getHost(),
						SERVER_PORT, (long) server.port());
				return Telemetry.inSpan(Telemetry.tracer(openTelemetry), name, attributes, span -> {
					server.span = span;
					try {
						return body.run(server);
					} finally {
						server.close();
					}
				});
			} finally {
				httpServer.stop(0);
			}
		}
	}

}
