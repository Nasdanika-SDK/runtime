package org.nasdanika.sdk.runtime.volume;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Stream;

/**
 * A volume over a directory of a NIO file system: the default one, a zip file system, an in-memory
 * one. Writable, with file system semantics: writing into a missing directory fails, and deleting a
 * non-empty directory fails. Hashes are unknown, so consumers compute them by reading if they need
 * them.
 *
 * <p>
 * Paths are validated here, at the boundary, so a path cannot escape the root.
 */
final class PathVolume implements Volume, Volume.Writable {

	private final Path root;
	private final boolean caseSensitive;

	PathVolume(Path root) {
		this.root = Objects.requireNonNull(root, "root").toAbsolutePath().normalize();
		this.caseSensitive = probeCaseSensitive(this.root);
	}

	/**
	 * Case sensitivity is a property of the file system, not of the OS: looks the root up with its
	 * case flipped. A root without letters, or one that does not exist yet, is assumed to be case
	 * sensitive.
	 */
	private static boolean probeCaseSensitive(Path root) {
		String str = root.toString();
		String flipped = str.toUpperCase().equals(str) ? str.toLowerCase() : str.toUpperCase();
		if (flipped.equals(str)) {
			return true;
		}
		try {
			Path other = root.getFileSystem().getPath(flipped);
			return !(Files.exists(root) && Files.exists(other) && Files.isSameFile(root, other));
		} catch (IOException | RuntimeException e) {
			return true;
		}
	}

	private Path resolve(String path) {
		Objects.requireNonNull(path, "path");
		if (".".equals(path)) {
			return root;
		}
		Path ret = root;
		for (String segment: path.split("/", -1)) {
			if (segment.isEmpty() || ".".equals(segment) || "..".equals(segment) || segment.indexOf('\\') != -1) {
				throw new IllegalArgumentException("Invalid volume path: " + path);
			}
			ret = ret.resolve(segment);
		}
		return ret;
	}

	private static String child(String directory, String name) {
		return ".".equals(directory) ? name : directory + "/" + name;
	}

	private static Optional<Entry> entry(String path, Path file) {
		try {
			BasicFileAttributes attributes = Files.readAttributes(file, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
			Entry.Kind kind = attributes.isSymbolicLink() ? Entry.Kind.LINK : attributes.isDirectory() ? Entry.Kind.DIRECTORY : Entry.Kind.FILE;
			long size = kind == Entry.Kind.FILE ? attributes.size() : -1;
			return Optional.of(new Entry(path, kind, size, null, attributes.lastModifiedTime().toInstant()));
		} catch (IOException e) {
			return Optional.empty();
		}
	}

	@Override
	public Optional<Entry> stat(String path) {
		return entry(path, resolve(path));
	}

	@Override
	public List<Entry> list(String directory) throws IOException {
		List<Entry> ret = new ArrayList<>();
		try (Stream<Path> children = Files.list(resolve(directory))) {
			for (Path child: children.sorted(Comparator.comparing(p -> p.getFileName().toString())).toList()) {
				entry(child(directory, child.getFileName().toString()), child).ifPresent(ret::add);
			}
		}
		return ret;
	}

	@Override
	public Content content(String path) {
		Path file = resolve(path);
		Content ofUri = Content.of(file.toUri());
		return new Content() {

			@Override
			public InputStream openStream() throws IOException {
				return ofUri.openStream();
			}

			@Override
			public OptionalLong length() {
				try {
					return Files.isRegularFile(file) ? OptionalLong.of(Files.size(file)) : OptionalLong.empty();
				} catch (IOException e) {
					return OptionalLong.empty();
				}
			}

			@Override
			public String toString() {
				return ofUri.toString();
			}

		};
	}

	@Override
	public boolean caseSensitive() {
		return caseSensitive;
	}

	@Override
	public <T> Optional<T> capability(Class<T> type) {
		return type == Writable.class || type == Volume.Writable.class || type == GenericVolume.Writable.class ? Optional.of(type.cast(this)) : Optional.empty();
	}

	@Override
	public void write(String path, Content content) throws IOException {
		try (OutputStream out = Files.newOutputStream(resolve(path))) {
			content.writeTo(out);
		}
	}

	@Override
	public void delete(String path) throws IOException {
		if (".".equals(path)) {
			throw new IOException("Cannot delete the root of a volume");
		}
		Files.delete(resolve(path));
	}

	@Override
	public void move(String from, String to) throws IOException {
		Files.move(resolve(from), resolve(to), StandardCopyOption.ATOMIC_MOVE);
	}

	@Override
	public void createDirectory(String path) throws IOException {
		Files.createDirectory(resolve(path));
	}

	/**
	 * Within one root, on one file system.
	 */
	@Override
	public boolean atomicMove() {
		return true;
	}

	@Override
	public String toString() {
		return "Volume.of(" + root + ")";
	}

}
