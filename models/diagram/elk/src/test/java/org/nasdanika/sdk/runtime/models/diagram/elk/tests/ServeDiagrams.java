package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.util.concurrent.Executors;

import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;

import com.sun.net.httpserver.HttpServer;

/**
 * Serves the diagram site over HTTP.
 * <p>
 * Build it with <code>mvn -pl models/diagram/elk test</code>, then run this class from an IDE, or
 * from the module directory with the test class path, and open the URL it prints.
 */
public final class ServeDiagrams {

	private ServeDiagrams() {
	}

	// tag::serve[]
	public static HttpServer serve(Path site, int port) throws IOException {
		var address = new InetSocketAddress(InetAddress.getLoopbackAddress(), port);
		HttpServer server = HttpServer.create(address, 0);
		server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
		server.createContext("/diagrams", new VolumeHttpHandler(Volume.of(site))); // <1>
		server.start();
		return server;
	}
	// end::serve[]

	public static void main(String[] args) throws IOException {
		int port = args.length > 0 ? Integer.parseInt(args[0]) : 8080;
		HttpServer server = serve(DiagramSite.SITE, port);
		System.out.println("Open http://127.0.0.1:" + server.getAddress().getPort() + "/diagrams/index.html");
		System.out.println("Press Enter to stop");
		System.in.read();
		server.stop(0);
	}

}
