package org.nasdanika.sdk.runtime.volume;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestPathVolume {

	private static Path cleanRoot(String name) throws IOException {
		Path root = Path.of("target", "path-volume", name);
		if (Files.exists(root)) {
			try (var walk = Files.walk(root)) {
				for (Path p: walk.sorted(Comparator.reverseOrder()).toList()) {
					Files.delete(p);
				}
			}
		}
		Files.createDirectories(root);
		return root;
	}

	private static String read(Content content) throws IOException {
		try (InputStream in = content.openStream()) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		}
	}

	@Test
	public void testWriteReadList() throws IOException {
		Path root = cleanRoot("write-read-list");
		Volume volume = Volume.of(root);
		Volume.Writable writable = volume.capability(Volume.Writable.class).orElseThrow();

		// File system semantics: no implicit parent directories
		assertThrows(NoSuchFileException.class, () -> writable.write("dir/a.txt", Content.of("A", StandardCharsets.UTF_8)));

		writable.createDirectory("dir");
		writable.write("dir/a.txt", Content.of("A", StandardCharsets.UTF_8));
		writable.write("b.txt", Content.of("Bee", StandardCharsets.UTF_8));

		assertEquals("A", Files.readString(root.resolve("dir/a.txt")));
		assertEquals("Bee", read(volume.content("b.txt")));
		assertEquals(3, volume.content("b.txt").length().getAsLong());

		GenericVolume.Entry dir = volume.stat("dir").orElseThrow();
		assertEquals(GenericVolume.Entry.Kind.DIRECTORY, dir.kind());
		assertEquals(-1, dir.size());
		assertEquals(3, volume.stat("b.txt").orElseThrow().size());
		assertTrue(volume.stat("missing").isEmpty());
		assertThrows(NoSuchFileException.class, () -> read(volume.content("missing")));

		List<String> rootChildren = volume.list(".").stream().map(GenericVolume.Entry::path).toList();
		assertEquals(List.of("b.txt", "dir"), rootChildren);
		assertEquals(List.of("dir/a.txt"), volume.list("dir").stream().map(GenericVolume.Entry::path).toList());

		writable.move("b.txt", "dir/b.txt");
		assertFalse(Files.exists(root.resolve("b.txt")));
		assertEquals("Bee", read(volume.content("dir/b.txt")));

		writable.delete("dir/a.txt");
		assertTrue(volume.stat("dir/a.txt").isEmpty());
	}

	@Test
	public void testInvalidPaths() throws IOException {
		Volume volume = Volume.of(cleanRoot("invalid-paths"));
		for (String path: List.of("../escape", "a/../b", "/abs", "trailing/", "a//b", "./a", "a\\b")) {
			assertThrows(IllegalArgumentException.class, () -> volume.stat(path), path);
		}
	}

	@Test
	public void testTextAdapter() throws IOException {
		Path root = cleanRoot("text-adapter");
		GenericVolume<String> volume = Volume.of(root).adapt(
				content -> {
					try {
						return read(content);
					} catch (IOException e) {
						throw new UncheckedIOException(e);
					}
				},
				text -> Content.of(text, StandardCharsets.UTF_8));
		@SuppressWarnings("unchecked")
		GenericVolume.Writable<String> writable = volume.capability(GenericVolume.Writable.class).orElseThrow();
		writable.write("hello.txt", "Hello");
		assertEquals("Hello", volume.content("hello.txt"));
		assertEquals("Hello", Files.readString(root.resolve("hello.txt")));
	}

	/**
	 * Writes part of its bytes, then fails, as a network or a full disk would.
	 */
	private static Content failing(Exception failure) {
		return Content.ofWriter(out -> {
			out.write("partial".getBytes(StandardCharsets.UTF_8));
			out.flush();
			if (failure instanceof IOException e) {
				throw e;
			}
			throw (RuntimeException) failure;
		});
	}

	private static List<String> names(Path directory) throws IOException {
		try (var list = Files.list(directory)) {
			return list.map(p -> p.getFileName().toString()).sorted().toList();
		}
	}

	@Test
	public void testFailedWriteKeepsTheTarget() throws IOException {
		Path root = cleanRoot("failed-write");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();
		Files.writeString(root.resolve("a.txt"), "original");

		IOException failure = new IOException("Disk full");
		assertEquals(failure.getMessage(), assertThrows(IOException.class, () -> writable.write("a.txt", failing(failure))).getMessage());
		assertEquals("original", Files.readString(root.resolve("a.txt")));
		assertEquals(List.of("a.txt"), names(root), "No temporary file is left behind");

		IllegalStateException unchecked = new IllegalStateException("Broken");
		assertEquals(unchecked.getMessage(), assertThrows(IllegalStateException.class, () -> writable.write("a.txt", failing(unchecked))).getMessage());
		assertEquals("original", Files.readString(root.resolve("a.txt")));
		assertEquals(List.of("a.txt"), names(root));
	}

	@Test
	public void testFailedWriteOfANewFileLeavesNothing() throws IOException {
		Path root = cleanRoot("failed-new");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();
		assertThrows(IOException.class, () -> writable.write("new.txt", failing(new IOException("Disk full"))));
		assertEquals(List.of(), names(root));
	}

	@Test
	public void testWriteReplacesAndLeavesNothingElse() throws IOException {
		Path root = cleanRoot("replace");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();
		writable.write("a.txt", Content.of("first and longer", StandardCharsets.UTF_8));
		writable.write("a.txt", Content.of("second", StandardCharsets.UTF_8));
		assertEquals("second", Files.readString(root.resolve("a.txt")));
		assertEquals(List.of("a.txt"), names(root));
	}

	/**
	 * The content is read before the target is touched, so a file can be its own source.
	 */
	@Test
	public void testWriteAFileOntoItself() throws IOException {
		Path root = cleanRoot("onto-itself");
		Volume volume = Volume.of(root);
		Volume.Writable writable = volume.capability(Volume.Writable.class).orElseThrow();
		Files.writeString(root.resolve("a.txt"), "kept");
		writable.write("a.txt", volume.content("a.txt"));
		assertEquals("kept", Files.readString(root.resolve("a.txt")));
	}

	/**
	 * A move would replace an empty directory with a file.
	 */
	@Test
	public void testWriteOntoADirectoryFails() throws IOException {
		Path root = cleanRoot("onto-directory");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();
		Files.createDirectory(root.resolve("dir"));
		assertThrows(IOException.class, () -> writable.write("dir", Content.of("A", StandardCharsets.UTF_8)));
		assertTrue(Files.isDirectory(root.resolve("dir")));
		assertEquals(List.of("dir"), names(root));
	}

	/**
	 * A move needs only a writable directory, so it would overwrite a read-only file.
	 */
	@Test
	public void testWriteOntoAReadOnlyFileFails() throws IOException {
		Path root = cleanRoot("read-only");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();
		Path file = root.resolve("a.txt");
		Files.writeString(file, "original");
		assertTrue(file.toFile().setReadOnly());
		try {
			assertThrows(IOException.class, () -> writable.write("a.txt", Content.of("new", StandardCharsets.UTF_8)));
			assertEquals("original", Files.readString(file));
			assertEquals(List.of("a.txt"), names(root));
		} finally {
			file.toFile().setWritable(true);
		}
	}

	/**
	 * A move would replace the link with a file, and leave the file it points to as it was.
	 */
	@Test
	public void testWriteThroughASymbolicLink() throws IOException {
		Path root = cleanRoot("symlink");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();
		Path file = root.resolve("file.txt");
		Files.writeString(file, "original");
		Path link = root.resolve("link.txt");
		try {
			Files.createSymbolicLink(link, Path.of("file.txt"));
		} catch (IOException | UnsupportedOperationException e) {
			assumeTrue(false, "Symbolic links are not available here: " + e);
		}
		writable.write("link.txt", Content.of("through the link", StandardCharsets.UTF_8));
		assertTrue(Files.isSymbolicLink(link));
		assertEquals("through the link", Files.readString(file));
	}

	/**
	 * A temporary file created by {@code createTempFile} is private, so replacing a target with it
	 * would quietly change who can read the target.
	 */
	@Test
	public void testPermissionsAreKept() throws IOException {
		Path root = cleanRoot("permissions");
		assumeTrue(Files.getFileAttributeView(root, PosixFileAttributeView.class) != null, "Not a POSIX file system");
		Volume.Writable writable = Volume.of(root).capability(Volume.Writable.class).orElseThrow();

		Path shared = root.resolve("shared.txt");
		Files.writeString(shared, "original");
		Files.setPosixFilePermissions(shared, PosixFilePermissions.fromString("rw-rw-r--"));
		writable.write("shared.txt", Content.of("new", StandardCharsets.UTF_8));
		assertEquals(PosixFilePermissions.fromString("rw-rw-r--"), Files.getPosixFilePermissions(shared));

		// A new file gets what the system gives a new file, not the private mode of a temporary one
		Path reference = root.resolve("reference.txt");
		Files.writeString(reference, "");
		writable.write("new.txt", Content.of("new", StandardCharsets.UTF_8));
		assertEquals(Files.getPosixFilePermissions(reference), Files.getPosixFilePermissions(root.resolve("new.txt")));
	}

	@Test
	public void testZipFileSystem() throws IOException {
		Path zip = cleanRoot("zip").resolve("volume.zip");
		try (FileSystem fileSystem = FileSystems.newFileSystem(URI.create("jar:" + zip.toUri()), Map.of("create", "true"))) {
			Path root = fileSystem.getPath("/");
			Volume volume = Volume.of(root);
			Volume.Writable writable = volume.capability(Volume.Writable.class).orElseThrow();
			writable.write("a.txt", Content.of("first", StandardCharsets.UTF_8));
			writable.write("a.txt", Content.of("second", StandardCharsets.UTF_8));
			assertEquals("second", read(volume.content("a.txt")), "Read from the open file system, not from the file on disk");
			assertThrows(IOException.class, () -> writable.write("a.txt", failing(new IOException("Disk full"))));
			assertEquals("second", read(volume.content("a.txt")));
			assertThrows(NoSuchFileException.class, () -> read(volume.content("missing.txt")));
			assertEquals(List.of("a.txt"), volume.list(".").stream().map(GenericVolume.Entry::path).toList());
		}
		try (FileSystem fileSystem = FileSystems.newFileSystem(zip)) {
			assertEquals("second", Files.readString(fileSystem.getPath("/a.txt")));
		}
	}

}
