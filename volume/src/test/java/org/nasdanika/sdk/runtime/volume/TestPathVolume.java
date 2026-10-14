package org.nasdanika.sdk.runtime.volume;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

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

}
