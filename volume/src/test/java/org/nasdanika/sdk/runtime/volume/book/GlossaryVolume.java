package org.nasdanika.sdk.runtime.volume.book;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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

// tag::glossary[]
/**
 * A glossary presented as Markdown files: an index, and a page per term that links back to
 * it. A browser, a WebDAV client or an agent with file tools reads it like any folder.
 *
 * <p>
 * A read-only volume is the core of the SPI: stat, list, content, case sensitivity, and no
 * capabilities.
 */
public class GlossaryVolume implements Volume {

	private final Map<String, byte[]> files = new TreeMap<>();
	private final Instant modified = Instant.now();

	public GlossaryVolume(Map<String, String> terms) {
		StringBuilder index = new StringBuilder("# Glossary\n\n");
		terms.forEach((term, definition) -> {
			String path = "terms/" + slug(term) + ".md";
			String page = "# " + term + "\n\n" + definition + "\n\n[Glossary](../index.md)\n";
			files.put(path, bytes(page));
			index.append("- [").append(term).append("](").append(path).append(")\n");
		});
		files.put("index.md", bytes(index.toString()));
	}

	@Override
	public Optional<Entry> stat(String path) {
		if (".".equals(path) || "terms".equals(path)) {
			return Optional.of(new Entry(path, Entry.Kind.DIRECTORY, -1, null, modified));
		}
		byte[] bytes = files.get(path);
		if (bytes == null) {
			return Optional.empty();
		}
		Entry file = new Entry(path, Entry.Kind.FILE, bytes.length, hash(bytes), modified);
		return Optional.of(file);
	}

	@Override
	public List<Entry> list(String directory) throws IOException {
		if (".".equals(directory)) {
			return List.of(stat("index.md").orElseThrow(), stat("terms").orElseThrow());
		}
		if (!"terms".equals(directory)) {
			throw new NoSuchFileException(directory);
		}
		List<Entry> entries = new ArrayList<>();
		for (String path: files.keySet()) {
			if (path.startsWith("terms/")) {
				entries.add(stat(path).orElseThrow());
			}
		}
		return entries;
	}

	@Override
	public Content content(String path) {
		byte[] bytes = files.get(path);
		if (bytes == null) {
			return () -> {
				throw new NoSuchFileException(path); // Lazy: opening fails, asking does not
			};
		}
		return Content.of(bytes);
	}

	@Override
	public boolean caseSensitive() {
		return true;
	}

	@Override
	public <T> Optional<T> capability(Class<T> type) {
		return Optional.empty(); // Not writable, not watchable, not searchable
	}
	// end::glossary[]

	static String slug(String name) {
		return name.toLowerCase().replaceAll("[^a-z0-9]+", "-").replaceAll("(^-|-$)", "");
	}

	private static byte[] bytes(String text) {
		return text.getBytes(StandardCharsets.UTF_8);
	}

	private static String hash(byte[] bytes) {
		try {
			return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * The terms of this book's glossary, in the book's order.
	 */
	static Map<String, String> terms() {
		Map<String, String> terms = new TreeMap<>();
		terms.put("Volume", "A tree of files and directories behind five methods.");
		terms.put("Content", "A re-readable source of bytes: nothing moves until it is read.");
		terms.put("Capability", "An optional ability of a volume, such as writing, found by asking.");
		terms.put("Entry", "A path, a kind, a size, a hash and a modification time.");
		return terms;
	}

}
