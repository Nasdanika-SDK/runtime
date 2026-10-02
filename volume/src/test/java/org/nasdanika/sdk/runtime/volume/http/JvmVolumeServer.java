package org.nasdanika.sdk.runtime.volume.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.HttpServer;

/**
 * Demo: serves this JVM's modules until stopped. Run it from the IDE (with the module path, as the
 * tests run), then:
 *
 * <ul>
 * <li>browse {@code http://127.0.0.1:8080/jvm/};</li>
 * <li>mount {@code http://127.0.0.1:8080/dav/} and point an agent at a directory of Markdown files,
 * {@code org/nasdanika} for example:
 * <ul>
 * <li>macOS: Finder, Go, Connect to Server, the URL;</li>
 * <li>Windows: {@code net use N: http://127.0.0.1:8080/dav/} (the WebClient service must be
 * running);</li>
 * <li>Linux: {@code mount -t davfs http://127.0.0.1:8080/dav/ /mnt/jvm};</li>
 * <li>anywhere: {@code rclone mount :webdav: /mnt/jvm --webdav-url http://127.0.0.1:8080/dav/ --read-only}.</li>
 * </ul>
 * </li>
 * </ul>
 *
 * An argument sets the port.
 */
public final class JvmVolumeServer {

	private JvmVolumeServer() {}

	public static void main(String[] args) throws IOException {
		int port = args.length > 0 ? Integer.parseInt(args[0]) : 8080;
		HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), port), 0);
		server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
		server.createContext("/jvm", new VolumeHttpHandler(new JvmModuleVolume(ModuleLayer.boot(), JvmModuleVolume.HTML)));
		server.createContext("/dav", new WebDavHandler(new JvmModuleVolume(ModuleLayer.boot(), JvmModuleVolume.MARKDOWN)));
		server.start();
		System.out.println("HTML:   http://127.0.0.1:" + port + "/jvm/");
		System.out.println("WebDAV: http://127.0.0.1:" + port + "/dav/");
	}

}
