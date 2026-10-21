package org.nasdanika.sdk.runtime.harness.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.harness.Harness;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;

import com.sun.net.httpserver.HttpExchange;

/**
 * A server that is up while code runs against it.
 */
class ServerTests {

	// tag::respond[]
	static void respond(HttpExchange exchange, int status, String text) throws IOException {
		byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
		exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
		exchange.sendResponseHeaders(status, bytes.length);
		try (OutputStream body = exchange.getResponseBody()) {
			body.write(bytes);
		}
	}
	// end::respond[]

	@Test
	void inServer() throws IOException {
		// tag::in-server[]
		String greeting = Harness.inServer(
			"Greeting", // <1>
			routes -> routes.createContext("/hello", ex -> respond(ex, 200, "Hello!")), // <2>
			server -> {
				HttpResponse<String> response = server.get("/hello"); // <3>
				assertThat(response.statusCode()).isEqualTo(200);
				return response.body(); // <4>
			});
		assertThat(greeting).isEqualTo("Hello!");
		// end::in-server[]
	}

	@Test
	void stoppedAfterTheBody() throws Exception {
		// tag::stopped[]
		URI base = Harness.inServer("Stopping", routes -> {}, server -> server.base());
		try (HttpClient client = HttpClient.newHttpClient()) {
			HttpRequest request = HttpRequest.newBuilder(base).build();
			assertThatThrownBy(() -> client.send(request, HttpResponse.BodyHandlers.ofString()))
				.isInstanceOf(ConnectException.class);
		}
		// end::stopped[]
	}

	@Test
	void volume(@TempDir Path dir) throws IOException {
		Files.writeString(dir.resolve("readme.txt"), "Read me");
		// tag::volume[]
		String readme = Harness.inServer(
			"Files",
			routes -> routes.createContext("/files", new VolumeHttpHandler(Volume.of(dir))),
			server -> server.get("/files/readme.txt").body());
		assertThat(readme).isEqualTo("Read me");
		// end::volume[]
	}

}
