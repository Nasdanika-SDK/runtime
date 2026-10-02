package org.nasdanika.sdk.runtime.volume.http;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.Volume.Entry;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * Serves a {@link Volume} read-only over HTTP, in the manner of the JDK's {@code SimpleFileServer}:
 * files with a media type from their extension, an ETag from their hash, and conditional
 * {@code If-None-Match} requests; directories as generated HTML listings. Register it on a context
 * of a server the caller builds:
 *
 * <pre>
 * HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
 * server.createContext("/files", new VolumeHttpHandler(volume));
 * server.start();
 * </pre>
 *
 * The request path below the context path is the volume path. A directory requested without a
 * trailing slash is redirected to it, so relative links in pages and listings resolve. Paths with
 * empty, {@code .} or {@code ..} segments are refused. Methods other than GET and HEAD are 405.
 *
 * <p>
 * Telemetry: wrap the handler, or add the filter, from {@link TelemetryHandler}.
 */
public class VolumeHttpHandler implements HttpHandler {

	protected static final DateTimeFormatter HTTP_DATE = DateTimeFormatter.RFC_1123_DATE_TIME.withZone(ZoneOffset.UTC);

	protected final Volume volume;

	public VolumeHttpHandler(Volume volume) {
		this.volume = Objects.requireNonNull(volume, "volume");
	}

	public Volume getVolume() {
		return volume;
	}

	/**
	 * Dispatches, and closes the exchange when done. On a failure before the response started, the
	 * client gets a {@code 500}. On a failure after it started, the exchange is deliberately not
	 * closed: closing would complete a truncated response as if it were whole. The failure
	 * propagates, and the JDK server drops the connection, so the client sees an error.
	 */
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		try {
			dispatch(exchange);
		} catch (IOException | RuntimeException | Error e) {
			if (exchange.getResponseCode() == -1) {
				try {
					sendEmpty(exchange, 500);
					exchange.close();
				} catch (IOException suppressed) {
					e.addSuppressed(suppressed);
				}
			}
			throw e;
		}
		exchange.close();
	}

	protected void dispatch(HttpExchange exchange) throws IOException {
		String method = exchange.getRequestMethod();
		if ("GET".equals(method) || "HEAD".equals(method)) {
			get(exchange, "HEAD".equals(method));
		} else {
			exchange.getResponseHeaders().set("Allow", allow());
			sendEmpty(exchange, 405);
		}
	}

	/**
	 * The value of the {@code Allow} header.
	 */
	protected String allow() {
		return "GET, HEAD";
	}

	// --- GET and HEAD ---

	protected void get(HttpExchange exchange, boolean head) throws IOException {
		String path = volumePath(exchange);
		if (path == null) {
			sendEmpty(exchange, 400);
			return;
		}
		Optional<Entry> entry = volume.stat(path);
		if (entry.isEmpty()) {
			sendEmpty(exchange, 404);
			return;
		}
		if (entry.get().kind() == Entry.Kind.DIRECTORY) {
			if (!exchange.getRequestURI().getPath().endsWith("/")) {
				exchange.getResponseHeaders().set("Location", exchange.getRequestURI().getRawPath() + "/");
				sendEmpty(exchange, 301);
				return;
			}
			byte[] listing = listing(exchange, path, volume.list(path)).getBytes(StandardCharsets.UTF_8);
			exchange.getResponseHeaders().set("Content-Type", "text/html; charset=utf-8");
			sendBytes(exchange, 200, listing, head);
			return;
		}
		sendFile(exchange, entry.get(), head);
	}

	protected void sendFile(HttpExchange exchange, Entry entry, boolean head) throws IOException {
		var headers = exchange.getResponseHeaders();
		headers.set("Content-Type", MediaTypes.of(entry.path()));
		if (entry.modified() != null) {
			headers.set("Last-Modified", HTTP_DATE.format(entry.modified()));
		}
		if (entry.hash() != null) {
			String etag = etag(entry);
			headers.set("ETag", etag);
			String ifNoneMatch = exchange.getRequestHeaders().getFirst("If-None-Match");
			if (ifNoneMatch != null && (ifNoneMatch.equals("*") || List.of(ifNoneMatch.split("\\s*,\\s*")).contains(etag))) {
				sendEmpty(exchange, 304);
				return;
			}
		}
		if (head) {
			if (entry.size() >= 0) {
				headers.set("Content-Length", String.valueOf(entry.size()));
			}
			exchange.sendResponseHeaders(200, -1);
			return;
		}
		// Known size: a fixed length (-1 means none in this API). Unknown: chunked (0)
		long size = entry.size();
		exchange.sendResponseHeaders(200, size > 0 ? size : size == 0 ? -1 : 0);
		if (size != 0) {
			// Closed on success only, see handle()
			OutputStream body = exchange.getResponseBody();
			volume.content(entry.path()).writeTo(body);
			body.close();
		}
	}

	/**
	 * A generated listing with links relative to the directory, which is served with a trailing
	 * slash.
	 */
	protected String listing(HttpExchange exchange, String path, List<Entry> children) {
		String title = ".".equals(path) ? "/" : "/" + path + "/";
		StringBuilder html = new StringBuilder()
				.append("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"utf-8\">\n<title>")
				.append(escape(title))
				.append("</title>\n</head>\n<body>\n<h1>")
				.append(escape(title))
				.append("</h1>\n<ul>\n");
		if (!".".equals(path)) {
			html.append("<li><a href=\"../\">..</a></li>\n");
		}
		for (Entry child: children) {
			String name = name(child.path()) + (child.kind() == Entry.Kind.DIRECTORY ? "/" : "");
			html.append("<li><a href=\"").append(escape(encodeSegment(name))).append("\">").append(escape(name)).append("</a></li>\n");
		}
		return html.append("</ul>\n</body>\n</html>\n").toString();
	}

	// --- Paths ---

	/**
	 * The volume path of the request: the decoded request path below the context path, without
	 * leading and trailing slashes, {@code .} for the root.
	 *
	 * @return Null if the path is not a valid volume path
	 */
	protected String volumePath(HttpExchange exchange) {
		String requestPath = exchange.getRequestURI().getPath();
		String contextPath = exchange.getHttpContext().getPath();
		String relative = requestPath.startsWith(contextPath) ? requestPath.substring(contextPath.length()) : requestPath;
		while (relative.startsWith("/")) {
			relative = relative.substring(1);
		}
		while (relative.endsWith("/")) {
			relative = relative.substring(0, relative.length() - 1);
		}
		if (relative.isEmpty()) {
			return ".";
		}
		for (String segment: relative.split("/", -1)) {
			if (segment.isEmpty() || ".".equals(segment) || "..".equals(segment)) {
				return null;
			}
		}
		return relative;
	}

	/**
	 * The absolute, encoded request path of a volume path, with a trailing slash for a directory.
	 */
	protected String href(HttpExchange exchange, String path, boolean directory) {
		String contextPath = exchange.getHttpContext().getPath();
		StringBuilder href = new StringBuilder(contextPath.endsWith("/") ? contextPath.substring(0, contextPath.length() - 1) : contextPath);
		if (!".".equals(path)) {
			for (String segment: path.split("/")) {
				href.append('/').append(encodeSegment(segment));
			}
		}
		if (directory) {
			href.append('/');
		}
		return href.toString();
	}

	protected static String name(String path) {
		return path.substring(path.lastIndexOf('/') + 1);
	}

	protected static String encodeSegment(String segment) {
		try {
			return new URI(null, null, segment, null).getRawPath().replace(":", "%3A");
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}

	protected static String etag(Entry entry) {
		return "\"" + entry.hash() + "\"";
	}

	protected static String escape(String text) {
		StringBuilder escaped = new StringBuilder(text.length());
		for (char c: text.toCharArray()) {
			switch (c) {
				case '<' -> escaped.append("&lt;");
				case '>' -> escaped.append("&gt;");
				case '&' -> escaped.append("&amp;");
				case '"' -> escaped.append("&quot;");
				case '\'' -> escaped.append("&#39;");
				default -> escaped.append(c);
			}
		}
		return escaped.toString();
	}

	// --- Responses ---

	protected static void sendEmpty(HttpExchange exchange, int status) throws IOException {
		exchange.sendResponseHeaders(status, -1);
	}

	protected static void sendBytes(HttpExchange exchange, int status, byte[] bytes, boolean head) throws IOException {
		if (head) {
			exchange.getResponseHeaders().set("Content-Length", String.valueOf(bytes.length));
			exchange.sendResponseHeaders(status, -1);
			return;
		}
		exchange.sendResponseHeaders(status, bytes.length == 0 ? -1 : bytes.length);
		if (bytes.length > 0) {
			try (OutputStream body = exchange.getResponseBody()) {
				body.write(bytes);
			}
		}
	}

}
