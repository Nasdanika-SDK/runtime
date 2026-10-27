package org.nasdanika.sdk.runtime.volume.book;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.http.TelemetryHandler;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;
import org.nasdanika.sdk.runtime.volume.http.WebDavHandler;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import io.opentelemetry.api.OpenTelemetry;

/**
 * Serves the glossary over HTTP for browsers and over WebDAV for anything that mounts drives.
 */
public final class Serve {

	private Serve() {
	}

	// tag::serve[]
	public static HttpServer serve(Volume volume, OpenTelemetry openTelemetry, int port)
			throws IOException {
		var address = new InetSocketAddress(InetAddress.getLoopbackAddress(), port);
		HttpServer server = HttpServer.create(address, 0);
		server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());              // <1>

		HttpHandler files = new VolumeHttpHandler(volume);
		server.createContext("/glossary", new TelemetryHandler(files, openTelemetry)); // <2>

		HttpHandler share = new WebDavHandler(volume);
		server.createContext("/dav", new TelemetryHandler(share, openTelemetry));     // <3>

		server.start();
		return server;
	}
	// end::serve[]

	/**
	 * Serves the glossary until Enter is pressed: browse the first URL, mount the second.
	 */
	public static void main(String[] args) throws IOException {
		int port = args.length > 0 ? Integer.parseInt(args[0]) : 8080;
		Volume glossary = new GlossaryVolume(GlossaryVolume.terms());
		HttpServer server = serve(glossary, OpenTelemetry.noop(), port);
		String root = "http://127.0.0.1:" + server.getAddress().getPort();
		System.out.println("Browse: " + root + "/glossary/");
		System.out.println("Mount:  " + root + "/dav/");
		System.out.println("Press Enter to stop");
		System.in.read();
		server.stop(0);
	}

}
