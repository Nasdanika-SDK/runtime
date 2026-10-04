package org.nasdanika.sdk.runtime.volume.emf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;
import org.nasdanika.sdk.runtime.volume.Volume.Entry;

/**
 * Bridges EMF onto a {@link Volume}: URIs below a base URI are paths in the volume, so a resource
 * set loads and saves resources through the volume's reads and writes. URIs stay identity and paths
 * are location: moving models from a working tree to an in-memory volume, a Git overlay or a volume
 * over a remote system (Jira, GitHub, a cloud provider, a running JVM) changes one handler, not the
 * models.
 *
 * <pre>
 * ResourceSet resourceSet = new ResourceSetImpl();
 * resourceSet.getURIConverter().getURIHandlers().add(0, new VolumeURIHandler(volume, URI.createURI("jira://example/")));
 * Resource issues = resourceSet.getResource(URI.createURI("jira://example/PROJ/issues.json"), true);
 * </pre>
 *
 * The URI {@code <base>a/b%20c.xmi} is the path {@code a/b c.xmi}: the part below the base,
 * split into segments, each decoded. The base itself is the root, {@code .}. A query and a fragment
 * are ignored, so object URIs map to the path of their resource. URIs whose decoded path has empty,
 * {@code .} or {@code ..} segments, or an encoded slash, are not handled.
 *
 * <ul>
 * <li>Reading opens the path's {@link Content}. A missing path is a {@code NoSuchFileException}.</li>
 * <li>Writing needs the {@link Volume.Writable} capability, and is otherwise refused. The bytes are
 * buffered and written as one content when the stream is closed, so a failed save writes nothing.
 * Missing parent directories are created first.</li>
 * <li>Attributes come from {@link Volume#stat(String)}: time stamp, length, directory, read-only
 * (no {@code Writable} capability), and {@link #ATTRIBUTE_HASH}. Setting attributes is ignored, as
 * by EMF's default handler.</li>
 * </ul>
 *
 * Telemetry: wrap the handler with
 * {@link org.nasdanika.sdk.runtime.common.telemetry.TelemetryURIHandler}, as
 * {@code TelemetryURIHandler.wrapAll} does for every handler of a converter. Content at a URI and
 * content produced by a writer report their own transfers.
 */
public class VolumeURIHandler extends URIHandlerImpl {

	/**
	 * The content hash of {@link Entry#hash()}: a content hash or a Git blob id. Not an EMF
	 * attribute; reported only when known.
	 */
	public static final String ATTRIBUTE_HASH = "hash";

	private final Volume volume;
	private final URI base;
	private final String prefix;

	/**
	 * @param base A hierarchical URI without a query or a fragment. A trailing separator is added if
	 * it has none, so {@code jira://example} and {@code jira://example/} are the same base.
	 */
	public VolumeURIHandler(Volume volume, URI base) {
		this.volume = Objects.requireNonNull(volume, "volume");
		Objects.requireNonNull(base, "base");
		if (!base.isHierarchical() || base.hasQuery() || base.hasFragment()) {
			throw new IllegalArgumentException("The base must be a hierarchical URI without a query or a fragment: " + base);
		}
		// Not hasTrailingPathSeparator(), which is false for "scheme://authority/"
		this.base = base.toString().endsWith("/") ? base : URI.createURI(base.toString() + "/");
		this.prefix = this.base.toString();
	}

	public Volume getVolume() {
		return volume;
	}

	public URI getBase() {
		return base;
	}

	// --- Mapping ---

	/**
	 * The volume path of a URI.
	 *
	 * @return Empty if the URI is not below the base or does not map to a valid volume path
	 */
	public Optional<String> path(URI uri) {
		if (uri == null) {
			return Optional.empty();
		}
		String str = uri.trimFragment().trimQuery().toString();
		if (str.equals(prefix) || str.equals(prefix.substring(0, prefix.length() - 1))) {
			return Optional.of(".");
		}
		if (!str.startsWith(prefix)) {
			return Optional.empty();
		}
		String relative = str.substring(prefix.length());
		if (relative.endsWith("/")) {
			relative = relative.substring(0, relative.length() - 1);
		}
		StringBuilder path = new StringBuilder();
		for (String segment: relative.split("/", -1)) {
			String decoded = URI.decode(segment);
			if (decoded.isEmpty() || ".".equals(decoded) || "..".equals(decoded) || decoded.indexOf('/') != -1) {
				return Optional.empty();
			}
			if (!path.isEmpty()) {
				path.append('/');
			}
			path.append(decoded);
		}
		return Optional.of(path.toString());
	}

	/**
	 * The URI of a volume path, the inverse of {@link #path(URI)}: a valid path in Go's
	 * {@code io/fs} form, {@code .} for the base.
	 */
	public URI uri(String path) {
		if (".".equals(path)) {
			return base;
		}
		StringBuilder uri = new StringBuilder(prefix);
		String[] segments = path.split("/", -1);
		for (int i = 0; i < segments.length; ++i) {
			String segment = segments[i];
			if (segment.isEmpty() || ".".equals(segment) || "..".equals(segment)) {
				throw new IllegalArgumentException("Invalid volume path: " + path);
			}
			if (i > 0) {
				uri.append('/');
			}
			uri.append(URI.encodeSegment(segment, false));
		}
		return URI.createURI(uri.toString());
	}

	private String requirePath(URI uri) throws IOException {
		return path(uri).orElseThrow(() -> new IOException("Not a path of " + base + ": " + uri));
	}

	private Volume.Writable writable(URI uri) throws IOException {
		return volume.capability(Volume.Writable.class).orElseThrow(() -> new IOException("Volume is read-only, cannot write " + uri));
	}

	// --- URIHandler ---

	@Override
	public boolean canHandle(URI uri) {
		return path(uri).isPresent();
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		String path = requirePath(uri);
		InputStream in = volume.content(path).openStream();
		Map<Object, Object> response = getResponse(options);
		if (response != null) {
			volume.stat(path)
				.filter(entry -> entry.modified() != null)
				.ifPresent(entry -> response.put(URIConverter.RESPONSE_TIME_STAMP_PROPERTY, entry.modified().toEpochMilli()));
		}
		return in;
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		String path = requirePath(uri);
		if (".".equals(path)) {
			throw new IOException("Cannot write the root of " + base);
		}
		Volume.Writable writable = writable(uri);
		Map<Object, Object> response = getResponse(options);
		return new ByteArrayOutputStream() {

			private boolean closed;

			@Override
			public void close() throws IOException {
				if (closed) {
					return;
				}
				closed = true;
				createParents(writable, path);
				writable.write(path, Content.of(toByteArray()));
				if (response != null) {
					volume.stat(path)
						.filter(entry -> entry.modified() != null)
						.ifPresent(entry -> response.put(URIConverter.RESPONSE_TIME_STAMP_PROPERTY, entry.modified().toEpochMilli()));
				}
			}

		};
	}

	private void createParents(Volume.Writable writable, String path) throws IOException {
		int idx = path.lastIndexOf('/');
		if (idx == -1) {
			return;
		}
		String parent = path.substring(0, idx);
		Optional<Entry> entry = volume.stat(parent);
		if (entry.isEmpty()) {
			createParents(writable, parent);
			writable.createDirectory(parent);
		} else if (entry.get().kind() != Entry.Kind.DIRECTORY) {
			throw new IOException("Not a directory: " + parent);
		}
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		writable(uri).delete(requirePath(uri));
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return path(uri).flatMap(volume::stat).isPresent();
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		Map<String, Object> result = new HashMap<>();
		Optional<Entry> stat = path(uri).flatMap(volume::stat);
		if (stat.isEmpty()) {
			return result;
		}
		Entry entry = stat.get();
		Set<String> requested = getRequestedAttributes(options);
		if (isRequested(requested, URIConverter.ATTRIBUTE_TIME_STAMP) && entry.modified() != null) {
			result.put(URIConverter.ATTRIBUTE_TIME_STAMP, entry.modified().toEpochMilli());
		}
		if (isRequested(requested, URIConverter.ATTRIBUTE_LENGTH) && entry.size() != -1) {
			result.put(URIConverter.ATTRIBUTE_LENGTH, entry.size());
		}
		if (isRequested(requested, URIConverter.ATTRIBUTE_DIRECTORY)) {
			result.put(URIConverter.ATTRIBUTE_DIRECTORY, entry.kind() == Entry.Kind.DIRECTORY);
		}
		if (isRequested(requested, URIConverter.ATTRIBUTE_READ_ONLY)) {
			result.put(URIConverter.ATTRIBUTE_READ_ONLY, volume.capability(Volume.Writable.class).isEmpty());
		}
		if (isRequested(requested, ATTRIBUTE_HASH) && entry.hash() != null) {
			result.put(ATTRIBUTE_HASH, entry.hash());
		}
		return result;
	}

	private static boolean isRequested(Set<String> requested, String attribute) {
		return requested == null || requested.contains(attribute);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + base + " -> " + volume + "]";
	}

}
