package org.nasdanika.sdk.runtime.volume.http;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.GenericVolume.Entry;

import com.sun.net.httpserver.HttpExchange;

/**
 * Serves a {@link Volume} as a read-only WebDAV (RFC 4918) class 1 share: enough to mount it in
 * macOS Finder ("Connect to Server"), Windows ({@code net use}), Linux (davfs2) or rclone, and read
 * it with any tool, an agent included.
 *
 * <ul>
 * <li>{@code OPTIONS}: {@code DAV: 1} and the allowed methods.</li>
 * <li>{@code PROPFIND}: a {@code 207 Multi-Status} with {@code resourcetype},
 * {@code displayname}, {@code getcontentlength}, {@code getcontenttype}, {@code getetag} and
 * {@code getlastmodified}, as far as the volume knows them. The request body is not interpreted:
 * the same properties are returned for {@code allprop}, {@code prop} and {@code propname}
 * requests, which clients tolerate. {@code Depth: infinity} is answered as {@code 1}, so that a
 * client cannot make the server walk a large volume.</li>
 * <li>{@code GET} and {@code HEAD}: as {@link VolumeHttpHandler}, listings included, so the share
 * also browses in a web browser.</li>
 * <li>Anything that writes or locks ({@code PUT}, {@code DELETE}, {@code MKCOL}, {@code COPY},
 * {@code MOVE}, {@code PROPPATCH}, {@code LOCK}, {@code UNLOCK}): {@code 405}. Writing belongs
 * behind the volume's {@link Volume.Writable} capability and is not implemented yet.</li>
 * </ul>
 *
 * Clients need the content length of files to read them reliably, so a volume served over WebDAV
 * should know its file sizes in {@link Volume#stat(String)}.
 */
public class WebDavHandler extends VolumeHttpHandler {

	public WebDavHandler(Volume volume) {
		super(volume);
	}

	@Override
	protected void dispatch(HttpExchange exchange) throws IOException {
		switch (exchange.getRequestMethod()) {
			case "GET" -> get(exchange, false);
			case "HEAD" -> get(exchange, true);
			case "OPTIONS" -> options(exchange);
			case "PROPFIND" -> propfind(exchange);
			default -> {
				drain(exchange);
				exchange.getResponseHeaders().set("Allow", allow());
				sendEmpty(exchange, 405);
			}
		}
	}

	@Override
	protected String allow() {
		return "OPTIONS, GET, HEAD, PROPFIND";
	}

	protected void options(HttpExchange exchange) throws IOException {
		var headers = exchange.getResponseHeaders();
		headers.set("DAV", "1");
		headers.set("Allow", allow());
		headers.set("MS-Author-Via", "DAV"); // Windows clients look for it
		sendEmpty(exchange, 200);
	}

	protected void propfind(HttpExchange exchange) throws IOException {
		drain(exchange);
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
		String depth = exchange.getRequestHeaders().getFirst("Depth");
		List<Entry> entries = new ArrayList<>();
		entries.add(entry.get());
		if (entry.get().kind() == Entry.Kind.DIRECTORY && !"0".equals(depth)) {
			entries.addAll(volume.list(path));
		}

		StringBuilder xml = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<D:multistatus xmlns:D=\"DAV:\">\n");
		for (Entry e: entries) {
			response(exchange, e, xml);
		}
		xml.append("</D:multistatus>\n");
		exchange.getResponseHeaders().set("Content-Type", "application/xml; charset=utf-8");
		sendBytes(exchange, 207, xml.toString().getBytes(StandardCharsets.UTF_8), false);
	}

	protected void response(HttpExchange exchange, Entry entry, StringBuilder xml) {
		boolean directory = entry.kind() == Entry.Kind.DIRECTORY;
		String name = ".".equals(entry.path()) ? "" : name(entry.path());
		xml.append(" <D:response>\n  <D:href>")
				.append(escape(href(exchange, entry.path(), directory)))
				.append("</D:href>\n  <D:propstat>\n   <D:prop>\n")
				.append("    <D:displayname>").append(escape(name)).append("</D:displayname>\n");
		if (directory) {
			xml.append("    <D:resourcetype><D:collection/></D:resourcetype>\n");
		} else {
			xml.append("    <D:resourcetype/>\n")
					.append("    <D:getcontenttype>").append(escape(MediaTypes.of(entry.path()))).append("</D:getcontenttype>\n");
			if (entry.size() >= 0) {
				xml.append("    <D:getcontentlength>").append(entry.size()).append("</D:getcontentlength>\n");
			}
			if (entry.hash() != null) {
				xml.append("    <D:getetag>").append(escape(etag(entry))).append("</D:getetag>\n");
			}
		}
		if (entry.modified() != null) {
			xml.append("    <D:getlastmodified>").append(HTTP_DATE.format(entry.modified())).append("</D:getlastmodified>\n");
		}
		xml.append("   </D:prop>\n   <D:status>HTTP/1.1 200 OK</D:status>\n  </D:propstat>\n </D:response>\n");
	}

	/**
	 * Reads and discards the request body, so that the connection can be reused.
	 */
	protected static void drain(HttpExchange exchange) throws IOException {
		try (InputStream body = exchange.getRequestBody()) {
			body.transferTo(java.io.OutputStream.nullOutputStream());
		}
	}

}
