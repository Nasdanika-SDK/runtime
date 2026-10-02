package org.nasdanika.sdk.runtime.volume;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Path;
import java.util.Objects;

import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredInputStream;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;

/**
 * Content at a URI, read on every {@link #openStream()}. HTTP(S) through the JDK HTTP client, any
 * {@code file} through NIO, any other scheme through {@link java.net.URL#openStream()} ({@code jar}).
 *
 * <p>
 * Each opened stream is a span from the request to the close of the body, with progress log records
 * at most once a second while it is read. An HTTP read is a client span named after the method,
 * with the HTTP semantic convention attributes, and propagates the trace context in the request
 * headers. The URL recorded on the span has no user info and no query string, which may carry
 * credentials. A 404 or a missing file is a {@link NoSuchFileException}, as for a missing path in a volume, and any
 * other status of 400 or above an {@link IOException}.
 */
final class UriContent implements Content {

	// HTTP semantic conventions, stable
	static final AttributeKey<String> HTTP_REQUEST_METHOD = AttributeKey.stringKey("http.request.method");
	static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE = AttributeKey.longKey("http.response.status_code");
	static final AttributeKey<String> URL_FULL = AttributeKey.stringKey("url.full");
	static final AttributeKey<String> SERVER_ADDRESS = AttributeKey.stringKey("server.address");
	static final AttributeKey<Long> SERVER_PORT = AttributeKey.longKey("server.port");

	/**
	 * Created on first use.
	 */
	private static final class DefaultClient {

		static final HttpClient INSTANCE = HttpClient.newBuilder()
				.followRedirects(HttpClient.Redirect.NORMAL)
				.build();

	}

	private final URI uri;
	private final HttpClient client;

	/**
	 * @param client Null for a shared client following redirects
	 */
	UriContent(URI uri, HttpClient client) {
		this.uri = Objects.requireNonNull(uri, "uri");
		this.client = client;
	}

	@Override
	public InputStream openStream() throws IOException {
		String scheme = uri.getScheme();
		return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme) ? openHttp() : openUrl();
	}

	private InputStream openHttp() throws IOException {
		OpenTelemetry openTelemetry = Telemetry.current();
		String url = redacted(uri);
		var builder = Telemetry.tracer(openTelemetry)
				.spanBuilder("GET")
				.setSpanKind(SpanKind.CLIENT)
				.setAttribute(HTTP_REQUEST_METHOD, "GET")
				.setAttribute(URL_FULL, url);
		if (uri.getHost() != null) {
			builder.setAttribute(SERVER_ADDRESS, uri.getHost());
		}
		if (uri.getPort() != -1) {
			builder.setAttribute(SERVER_PORT, (long) uri.getPort());
		}
		Span span = builder.startSpan();
		try (Scope scope = span.makeCurrent()) {
			HttpRequest.Builder request = HttpRequest.newBuilder(uri).GET();
			openTelemetry.getPropagators().getTextMapPropagator().inject(Context.current(), request, (carrier, key, value) -> carrier.header(key, value));
			HttpResponse<InputStream> response = (client == null ? DefaultClient.INSTANCE : client).send(request.build(), HttpResponse.BodyHandlers.ofInputStream());
			int status = response.statusCode();
			span.setAttribute(HTTP_RESPONSE_STATUS_CODE, (long) status);
			if (status >= 400) {
				response.body().close();
				throw status == 404 ? new NoSuchFileException(url) : new IOException("HTTP " + status + " for " + url);
			}
			return metered(openTelemetry, span, response.body(), url);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			InterruptedIOException failure = new InterruptedIOException("Interrupted while requesting " + url);
			Telemetry.recordFailure(span, failure);
			span.end();
			throw failure;
		} catch (IOException | RuntimeException e) {
			Telemetry.recordFailure(span, e);
			span.end();
			throw e;
		}
	}

	private InputStream openUrl() throws IOException {
		OpenTelemetry openTelemetry = Telemetry.current();
		String url = redacted(uri);
		Span span = Telemetry.tracer(openTelemetry)
				.spanBuilder("Content.read")
				.setAttribute(URL_FULL, url)
				.startSpan();
		try (Scope scope = span.makeCurrent()) {
			InputStream in = "file".equalsIgnoreCase(uri.getScheme()) ? Files.newInputStream(Path.of(uri)) : uri.toURL().openStream();
			return metered(openTelemetry, span, in, url);
		} catch (IOException | RuntimeException e) {
			Telemetry.recordFailure(span, e);
			span.end();
			throw e;
		}
	}

	private static InputStream metered(OpenTelemetry openTelemetry, Span span, InputStream in, String url) {
		return new MeteredInputStream(
				in,
				MeteredStreams.spanMeter(Telemetry.logger(openTelemetry), span, "Read", url, Attributes.of(URL_FULL, url), true),
				MeteredStreams.PROGRESS_INTERVAL.toNanos());
	}

	/**
	 * Without user info, query and fragment.
	 */
	static String redacted(URI uri) {
		if (uri.isOpaque()) {
			return uri.getScheme() + ":" + uri.getSchemeSpecificPart().replaceAll("[?#].*$", "");
		}
		try {
			return new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), uri.getPath(), null, null).toString();
		} catch (Exception e) {
			return uri.getScheme() + "://" + uri.getHost();
		}
	}

	@Override
	public String toString() {
		return redacted(uri);
	}

}
