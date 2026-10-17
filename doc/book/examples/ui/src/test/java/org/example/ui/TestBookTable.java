package org.example.ui;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

import org.example.library.services.Samples;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.html.generator.Generator;
import org.nasdanika.sdk.runtime.models.react.generator.ReactGenerator;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;

import com.sun.net.httpserver.HttpServer;

class TestBookTable {

	private static final Path EXPECTED = Path.of("src", "test", "resources", "expected");

	private static String expected(String name) throws IOException {
		return Files.readString(EXPECTED.resolve(name)).replace("\r\n", "\n");
	}

	/**
	 * The generated module and page are compared with the files the book shows.
	 */
	@Test
	void generated() throws IOException {
		String module = new ReactGenerator().generate(BookTable.module()).replace("\r\n", "\n");
		String page = (new Generator().generate(BookTable.page()) + "\n").replace("\r\n", "\n");
		Path out = Path.of("target", "book-table");
		Files.createDirectories(out);
		Files.writeString(out.resolve("books.js"), module);
		Files.writeString(out.resolve("index.html"), page);
		assertThat(module).isEqualTo(expected("books.js"));
		assertThat(page).isEqualTo(expected("index.html"));
	}

	@Test
	void staticSite(@TempDir Path directory) throws IOException {
		// tag::static[]
		BookTable.write(Samples.library(), Volume.of(directory));                    // <1>

		assertThat(directory.resolve("index.html")).content()
			.contains("<script type=\"importmap\">");
		assertThat(directory.resolve("modules/books.js")).content()
			.contains("export function BookTable(props)");
		JSONArray books = new JSONArray(Files.readString(directory.resolve("data/books.json")));
		assertThat(books.length()).isEqualTo(8);
		// end::static[]
	}

	@Test
	void served(@TempDir Path directory) throws Exception {
		// tag::serve[]
		Volume site = Volume.of(directory);
		BookTable.write(Samples.library(), site);

		var address = new InetSocketAddress(InetAddress.getLoopbackAddress(), 0);
		HttpServer server = HttpServer.create(address, 0);
		server.createContext("/", new VolumeHttpHandler(site));                       // <1>
		server.start();
		try (HttpClient client = HttpClient.newHttpClient()) {
			URI base = URI.create("http://127.0.0.1:" + server.getAddress().getPort() + "/");
			assertThat(contentType(client, base.resolve(BookTable.PAGE))).startsWith("text/html");
			assertThat(contentType(client, base.resolve(BookTable.MODULE)))
				.startsWith("text/javascript");                                          // <2>
			assertThat(contentType(client, base.resolve(BookTable.DATA)))
				.startsWith("application/json");
		} finally {
			server.stop(0);
		}
		// end::serve[]
	}

	private static String contentType(HttpClient client, URI uri) throws Exception {
		HttpResponse<String> response = client.send(
				HttpRequest.newBuilder(uri).GET().build(),
				HttpResponse.BodyHandlers.ofString());
		assertThat(response.statusCode()).isEqualTo(200);
		return response.headers().firstValue("Content-Type").orElse("");
	}

}
