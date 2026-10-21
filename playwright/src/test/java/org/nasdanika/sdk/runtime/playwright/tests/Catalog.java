package org.nasdanika.sdk.runtime.playwright.tests;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.logs.Severity;

/**
 * The application of the examples: a catalog of books, a page with a search box and its data.
 */
final class Catalog {

	record Book(String id, String title, String author) {

		String json() {
			return "{\"id\":\"%s\",\"title\":\"%s\",\"author\":\"%s\"}".formatted(id, title, author);
		}

	}

	static final List<Book> BOOKS = List.of(
		new Book("dune", "Dune", "Frank Herbert"),
		new Book("neuromancer", "Neuromancer", "William Gibson"),
		new Book("solaris", "Solaris", "Stanislaw Lem"),
		new Book("ubik", "Ubik", "Philip K. Dick"));

	private Catalog() {}

	// tag::routes[]
	static void routes(HttpServer routes) {
		Path site = Path.of("src", "test", "resources", "catalog");
		routes.createContext("/", new VolumeHttpHandler(Volume.of(site))); // <1>
		routes.createContext("/data", Catalog::data); // <2>
	}
	// end::routes[]

	// tag::data[]
	static void data(HttpExchange exchange) throws IOException {
		var logger = Telemetry.logger(Telemetry.current());
		String path = exchange.getRequestURI().getPath();
		if (path.equals("/data/books")) {
			String query = query(exchange);
			Telemetry.log(logger, Severity.INFO, null, "Searching for '" + query + "'", null);
			String books = BOOKS.stream()
				.filter(book -> book.title().toLowerCase(Locale.ROOT).contains(query))
				.map(Book::json)
				.collect(Collectors.joining(",", "[", "]"));
			json(exchange, 200, books);
		} else {
			String id = path.substring("/data/books/".length());
			Telemetry.log(logger, Severity.INFO, null, "Showing " + id, null);
			BOOKS.stream()
				.filter(book -> book.id().equals(id))
				.findFirst()
				.ifPresentOrElse(
					book -> json(exchange, 200, book.json()),
					() -> json(exchange, 404, "{}"));
		}
	}
	// end::data[]

	private static String query(HttpExchange exchange) {
		String query = exchange.getRequestURI().getRawQuery();
		if (query == null || !query.startsWith("q=")) {
			return "";
		}
		return URLDecoder.decode(query.substring(2), StandardCharsets.UTF_8).toLowerCase(Locale.ROOT);
	}

	private static void json(HttpExchange exchange, int status, String json) {
		try {
			byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
			exchange.getResponseHeaders().set("Content-Type", "application/json");
			exchange.sendResponseHeaders(status, bytes.length);
			try (OutputStream body = exchange.getResponseBody()) {
				body.write(bytes);
			}
		} catch (IOException e) {
			throw new java.io.UncheckedIOException(e);
		}
	}

}
