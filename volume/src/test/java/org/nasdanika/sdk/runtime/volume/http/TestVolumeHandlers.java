package org.nasdanika.sdk.runtime.volume.http;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sun.net.httpserver.HttpServer;

/**
 * Serving a volume: the JVM's modules as HTML pages over HTTP, and as Markdown files over WebDAV.
 * The caller builds the server; the handlers are registered on its contexts.
 * {@link JvmVolumeServer} runs the same setup on a fixed port for mounting the share.
 */
class TestVolumeHandlers {

	private static HttpServer server;
	private static HttpClient client;

	@BeforeAll
	static void start() throws IOException {
		server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
		server.createContext("/jvm", new VolumeHttpHandler(new JvmModuleVolume(ModuleLayer.boot(), JvmModuleVolume.HTML)));
		server.createContext("/dav", new WebDavHandler(new JvmModuleVolume(ModuleLayer.boot(), JvmModuleVolume.MARKDOWN)));
		server.start();
		client = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NEVER).build();
	}

	@AfterAll
	static void stop() {
		server.stop(0);
		client.close();
	}

	private static URI uri(String path) {
		return URI.create("http://127.0.0.1:" + server.getAddress().getPort() + path);
	}

	private static HttpResponse<String> send(String method, String path, String... headers) throws IOException, InterruptedException {
		HttpRequest.Builder request = HttpRequest.newBuilder(uri(path)).method(method, HttpRequest.BodyPublishers.noBody());
		if (headers.length > 0) {
			request.headers(headers);
		}
		return client.send(request.build(), HttpResponse.BodyHandlers.ofString());
	}

	// --- HTTP ---

	@Test
	void listingGroupsModulesBySegments() throws Exception {
		HttpResponse<String> root = send("GET", "/jvm/");
		assertThat(root.statusCode()).isEqualTo(200);
		assertThat(root.headers().firstValue("Content-Type")).hasValue("text/html; charset=utf-8");
		assertThat(root.body()).contains("href=\"java/\"").contains("href=\"org/\"");

		HttpResponse<String> runtime = send("GET", "/jvm/org/nasdanika/sdk/runtime/");
		assertThat(runtime.body())
				.contains("href=\"volume.html\"")
				.contains("href=\"common.html\"")
				.contains("href=\"../\"");
	}

	@Test
	void directoryWithoutSlashRedirects() throws Exception {
		HttpResponse<String> response = send("GET", "/jvm/java");
		assertThat(response.statusCode()).isEqualTo(301);
		assertThat(response.headers().firstValue("Location")).hasValue("/jvm/java/");
	}

	@Test
	void modulePageLinksRequiredModules() throws Exception {
		HttpResponse<String> response = send("GET", "/jvm/org/nasdanika/sdk/runtime/volume.html");
		assertThat(response.statusCode()).isEqualTo(200);
		assertThat(response.body())
				.contains("<h1>org.nasdanika.sdk.runtime.volume</h1>")
				.contains("<a href=\"../../../../java/base.html\">java.base</a>")
				.contains("<a href=\"common.html\">org.nasdanika.sdk.runtime.common</a>")
				.contains("<a href=\"../../../../jdk/httpserver.html\">jdk.httpserver</a> (transitive)")
				.contains("<code>org.nasdanika.sdk.runtime.volume.http</code>");

		// The link resolves
		assertThat(send("GET", "/jvm/jdk/httpserver.html").body()).contains("<code>com.sun.net.httpserver</code>");
	}

	@Test
	void conditionalAndHeadRequests() throws Exception {
		HttpResponse<String> first = send("GET", "/jvm/java/base.html");
		String etag = first.headers().firstValue("ETag").orElseThrow();
		assertThat(send("GET", "/jvm/java/base.html", "If-None-Match", etag).statusCode()).isEqualTo(304);

		HttpResponse<String> head = send("HEAD", "/jvm/java/base.html");
		assertThat(head.statusCode()).isEqualTo(200);
		assertThat(head.body()).isEmpty();
		assertThat(head.headers().firstValue("Content-Length")).hasValue(String.valueOf(first.body().getBytes(java.nio.charset.StandardCharsets.UTF_8).length));
	}

	@Test
	void errors() throws Exception {
		assertThat(send("GET", "/jvm/no/such.html").statusCode()).isEqualTo(404);
		assertThat(send("GET", "/jvm/java/../java/base.html").statusCode()).isIn(400, 404); // normalized by the client or refused
		HttpResponse<String> put = send("PUT", "/jvm/java/base.html");
		assertThat(put.statusCode()).isEqualTo(405);
		assertThat(put.headers().firstValue("Allow")).hasValue("GET, HEAD");
	}

	// --- WebDAV ---

	@Test
	void options() throws Exception {
		HttpResponse<String> response = send("OPTIONS", "/dav/");
		assertThat(response.statusCode()).isEqualTo(200);
		assertThat(response.headers().firstValue("DAV")).hasValue("1");
		assertThat(response.headers().firstValue("Allow")).hasValue("OPTIONS, GET, HEAD, PROPFIND");
	}

	@Test
	void propfindDirectory() throws Exception {
		HttpResponse<String> response = send("PROPFIND", "/dav/org/nasdanika/sdk/runtime/", "Depth", "1");
		assertThat(response.statusCode()).isEqualTo(207);
		assertThat(response.body())
				.contains("<D:href>/dav/org/nasdanika/sdk/runtime/</D:href>")
				.contains("<D:href>/dav/org/nasdanika/sdk/runtime/volume.md</D:href>")
				.contains("<D:collection/>")
				.contains("<D:getcontenttype>text/markdown; charset=utf-8</D:getcontenttype>");

		HttpResponse<String> depth0 = send("PROPFIND", "/dav/org/", "Depth", "0");
		assertThat(depth0.body()).contains("<D:href>/dav/org/</D:href>").doesNotContain("/dav/org/nasdanika/");
	}

	@Test
	void propfindAndGetFile() throws Exception {
		HttpResponse<String> props = send("PROPFIND", "/dav/org/nasdanika/sdk/runtime/volume.md", "Depth", "0");
		assertThat(props.statusCode()).isEqualTo(207);
		HttpResponse<String> file = send("GET", "/dav/org/nasdanika/sdk/runtime/volume.md");
		int length = file.body().getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
		assertThat(props.body()).contains("<D:getcontentlength>" + length + "</D:getcontentlength>").contains("<D:getetag>");
		assertThat(file.body())
				.startsWith("# org.nasdanika.sdk.runtime.volume\n")
				.contains("* [org.nasdanika.sdk.runtime.common](common.md)")
				.contains("* [jdk.httpserver](../../../../jdk/httpserver.md) (transitive)")
				.contains("* `org.nasdanika.sdk.runtime.volume.http`");
	}

	@Test
	void webDavRefusesWrites() throws Exception {
		for (String method: new String[] { "PUT", "DELETE", "MKCOL", "MOVE", "LOCK", "PROPPATCH" }) {
			assertThat(send(method, "/dav/java/base.md").statusCode()).as(method).isEqualTo(405);
		}
	}

}
