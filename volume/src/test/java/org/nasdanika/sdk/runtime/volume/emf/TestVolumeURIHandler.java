package org.nasdanika.sdk.runtime.volume.emf;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.http.VolumeHttpHandler;

import com.sun.net.httpserver.HttpServer;

/**
 * A resource set loading and saving through a volume. The binary resource is used because it is in
 * EMF core; any resource factory works the same way.
 */
class TestVolumeURIHandler {

	private static final URI BASE = URI.createURI("memory://test/models/");

	private static ResourceSet resourceSet(VolumeURIHandler handler) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, (Resource.Factory) BinaryResourceImpl::new);
		resourceSet.getURIConverter().getURIHandlers().add(0, handler);
		return resourceSet;
	}

	@Test
	void mapsUrisToPathsAndBack() {
		VolumeURIHandler handler = new VolumeURIHandler(new MemoryVolume(false), URI.createURI("memory://test/models"));
		assertThat(handler.getBase()).isEqualTo(BASE);

		assertThat(handler.path(URI.createURI("memory://test/models/a/b%20c.bin#//x"))).contains("a/b c.bin");
		assertThat(handler.path(URI.createURI("memory://test/models/"))).contains(".");
		assertThat(handler.path(URI.createURI("memory://test/models"))).contains(".");
		assertThat(handler.path(URI.createURI("memory://test/models/dir/"))).contains("dir");

		assertThat(handler.uri("a/b c.bin")).isEqualTo(URI.createURI("memory://test/models/a/b%20c.bin"));
		assertThat(handler.uri(".")).isEqualTo(BASE);
		assertThat(handler.path(handler.uri("x/y%z.bin"))).contains("x/y%z.bin");

		assertThat(handler.canHandle(URI.createURI("memory://test/other/a.bin"))).isFalse();
		assertThat(handler.canHandle(URI.createURI("memory://test/modelsX/a.bin"))).isFalse();
		assertThat(handler.canHandle(URI.createURI("memory://test/models/../a.bin"))).isFalse();
		assertThat(handler.canHandle(URI.createURI("memory://test/models/a//b.bin"))).isFalse();
		assertThat(handler.canHandle(URI.createURI("memory://test/models/a%2Fb.bin"))).isFalse();
		assertThatThrownBy(() -> handler.uri("../a")).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void savesAndLoadsThroughTheVolume() throws IOException {
		MemoryVolume volume = new MemoryVolume(true);
		VolumeURIHandler handler = new VolumeURIHandler(volume, BASE);

		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("library");
		ePackage.setNsURI("urn:library");
		Resource resource = resourceSet(handler).createResource(handler.uri("nested/dir/library.bin"));
		resource.getContents().add(ePackage);
		resource.save(null);

		// Parent directories created, file written on close
		assertThat(volume.stat("nested/dir")).hasValueSatisfying(entry -> assertThat(entry.kind()).isEqualTo(org.nasdanika.sdk.runtime.volume.Volume.Entry.Kind.DIRECTORY));
		assertThat(volume.bytes("nested/dir/library.bin")).isNotEmpty();

		Resource loaded = resourceSet(handler).getResource(URI.createURI("memory://test/models/nested/dir/library.bin"), true);
		assertThat(((EPackage) loaded.getContents().get(0)).getNsURI()).isEqualTo("urn:library");
		assertThat(loaded.getTimeStamp()).isPositive();

		URIConverter converter = resourceSet(handler).getURIConverter();
		URI uri = handler.uri("nested/dir/library.bin");
		assertThat(converter.exists(uri, null)).isTrue();
		Map<String, ?> attributes = converter.getAttributes(uri, null);
		assertThat(attributes.get(URIConverter.ATTRIBUTE_LENGTH)).isEqualTo((long) volume.bytes("nested/dir/library.bin").length);
		assertThat(attributes.get(URIConverter.ATTRIBUTE_DIRECTORY)).isEqualTo(false);
		assertThat(attributes.get(URIConverter.ATTRIBUTE_READ_ONLY)).isEqualTo(false);
		assertThat(attributes.get(VolumeURIHandler.ATTRIBUTE_HASH)).isNotNull();

		Map<Object, Object> options = new HashMap<>();
		options.put(URIConverter.OPTION_REQUESTED_ATTRIBUTES, Set.of(URIConverter.ATTRIBUTE_DIRECTORY));
		Map<String, ?> directory = converter.getAttributes(handler.uri("nested"), options);
		assertThat(directory.keySet()).containsExactly(URIConverter.ATTRIBUTE_DIRECTORY);
		assertThat(directory.get(URIConverter.ATTRIBUTE_DIRECTORY)).isEqualTo(true);

		converter.delete(uri, null);
		assertThat(converter.exists(uri, null)).isFalse();
	}

	@Test
	void readOnlyVolume() throws IOException {
		MemoryVolume volume = new MemoryVolume(false).put("readme.txt", "Hello");
		VolumeURIHandler handler = new VolumeURIHandler(volume, BASE);
		URIConverter converter = resourceSet(handler).getURIConverter();

		try (InputStream in = converter.createInputStream(handler.uri("readme.txt"))) {
			assertThat(new String(in.readAllBytes(), StandardCharsets.UTF_8)).isEqualTo("Hello");
		}
		assertThat(converter.getAttributes(handler.uri("readme.txt"), null).get(URIConverter.ATTRIBUTE_READ_ONLY)).isEqualTo(true);
		assertThatThrownBy(() -> converter.createOutputStream(handler.uri("other.txt"))).isInstanceOf(IOException.class).hasMessageContaining("read-only");
		assertThatThrownBy(() -> converter.createInputStream(handler.uri("missing.txt"))).isInstanceOf(NoSuchFileException.class);
		assertThat(converter.exists(handler.uri("missing.txt"), null)).isFalse();
	}

	/**
	 * The composite: one volume holds models, a second process serves it over HTTP, and a resource
	 * set on the other side loads the same models by their logical URIs through a volume whose
	 * content is at HTTP URIs. Copying is reading one volume and writing another.
	 */
	@Test
	void composite() throws IOException {
		MemoryVolume source = new MemoryVolume(true);
		VolumeURIHandler sourceHandler = new VolumeURIHandler(source, BASE);
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("served");
		Resource resource = resourceSet(sourceHandler).createResource(sourceHandler.uri("served.bin"));
		resource.getContents().add(ePackage);
		resource.save(null);

		HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		server.createContext("/models", new VolumeHttpHandler(source));
		server.start();
		try {
			String root = "http://localhost:" + server.getAddress().getPort() + "/models/";
			// A read-only volume over HTTP: just enough of one for the bridge
			MemoryVolume remote = new MemoryVolume(false) {

				@Override
				public Content content(String path) {
					return Content.of(java.net.URI.create(root + path));
				}

				@Override
				public synchronized java.util.Optional<Entry> stat(String path) {
					return source.stat(path);
				}

			};
			VolumeURIHandler remoteHandler = new VolumeURIHandler(remote, URI.createURI("models://served"));
			assertThat(remoteHandler.getBase()).isEqualTo(URI.createURI("models://served/"));
			Resource loaded = resourceSet(remoteHandler).getResource(URI.createURI("models://served/served.bin"), true);
			assertThat(((EPackage) loaded.getContents().get(0)).getName()).isEqualTo("served");

			// A snapshot is a copy
			MemoryVolume snapshot = new MemoryVolume(true);
			snapshot.write("served.bin", remote.content("served.bin"));
			assertThat(snapshot.stat("served.bin").orElseThrow().hash()).isEqualTo(source.stat("served.bin").orElseThrow().hash());
		} finally {
			server.stop(0);
		}
	}

}
