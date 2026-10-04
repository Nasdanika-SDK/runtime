package org.nasdanika.sdk.runtime.volume.emf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;

/**
 * A minimal writable in-memory volume for tests. Directories are explicit; writing into a missing
 * directory fails, as on a file system.
 */
class MemoryVolume implements Volume, Volume.Writable {

	private record Node(byte[] bytes, String hash, Instant modified) {

		boolean directory() {
			return bytes == null;
		}

	}

	private final Map<String, Node> nodes = new TreeMap<>();
	private final boolean writable;

	MemoryVolume(boolean writable) {
		this.writable = writable;
		nodes.put(".", new Node(null, null, Instant.now()));
	}

	/** Test setup, bypassing the capability. */
	synchronized MemoryVolume put(String path, String text) {
		nodes.put(path, file(text.getBytes()));
		return this;
	}

	synchronized byte[] bytes(String path) {
		Node node = nodes.get(path);
		return node == null ? null : node.bytes();
	}

	private static Node file(byte[] bytes) {
		try {
			String hash = HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
			return new Node(bytes, hash, Instant.now());
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e);
		}
	}

	private static String parent(String path) {
		int idx = path.lastIndexOf('/');
		return idx == -1 ? "." : path.substring(0, idx);
	}

	@Override
	public synchronized Optional<Entry> stat(String path) {
		Node node = nodes.get(path);
		if (node == null) {
			return Optional.empty();
		}
		return Optional.of(node.directory()
				? new Entry(path, Entry.Kind.DIRECTORY, -1, null, node.modified())
				: new Entry(path, Entry.Kind.FILE, node.bytes().length, node.hash(), node.modified()));
	}

	@Override
	public synchronized List<Entry> list(String directory) {
		List<Entry> children = new ArrayList<>();
		for (String path: nodes.keySet()) {
			if (!".".equals(path) && parent(path).equals(directory)) {
				children.add(stat(path).orElseThrow());
			}
		}
		return children;
	}

	@Override
	public Content content(String path) {
		return new Content() {

			@Override
			public InputStream openStream() throws IOException {
				byte[] bytes = bytes(path);
				if (bytes == null) {
					throw new NoSuchFileException(path);
				}
				return new ByteArrayInputStream(bytes);
			}

		};
	}

	@Override
	public boolean caseSensitive() {
		return true;
	}

	@Override
	public <T> Optional<T> capability(Class<T> type) {
		return writable && type == Writable.class ? Optional.of(type.cast(this)) : Optional.empty();
	}

	@Override
	public synchronized void write(String path, Content content) throws IOException {
		Node parent = nodes.get(parent(path));
		if (parent == null || !parent.directory()) {
			throw new NoSuchFileException(parent(path));
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		content.writeTo(out);
		nodes.put(path, file(out.toByteArray()));
	}

	@Override
	public synchronized void delete(String path) throws IOException {
		if (nodes.remove(path) == null) {
			throw new NoSuchFileException(path);
		}
	}

	@Override
	public synchronized void move(String from, String to) throws IOException {
		Node node = nodes.remove(from);
		if (node == null) {
			throw new NoSuchFileException(from);
		}
		nodes.put(to, node);
	}

	@Override
	public synchronized void createDirectory(String path) throws IOException {
		if (nodes.containsKey(path)) {
			throw new FileAlreadyExistsException(path);
		}
		nodes.put(path, new Node(null, null, Instant.now()));
	}

	@Override
	public boolean atomicMove() {
		return true;
	}

}
