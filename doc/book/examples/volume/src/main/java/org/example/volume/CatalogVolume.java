package org.example.volume;

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
import java.util.stream.Collectors;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Library;
import org.example.library.LibraryPackage;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;

// tag::catalog[]
/**
 * A library presented as Markdown files: an index, a page per book and a page per author,
 * linked to each other. A browser, a WebDAV client or an agent with file tools reads it
 * like any folder.
 *
 * <p>
 * A read-only volume is the core of the SPI: stat, list, content, case sensitivity, and no
 * capabilities.
 */
public class CatalogVolume implements Volume {

	private final Map<String, byte[]> files = new TreeMap<>();
	private final Instant modified = Instant.now();

	public CatalogVolume(Library library) {
		files.put("index.md", bytes(index(library)));
		for (Book book: library.getBooks()) {
			files.put("books/" + slug(book.getName()) + ".md", bytes(book(book)));
		}
		for (Author author: library.getAuthors()) {
			files.put("authors/" + slug(author.getName()) + ".md", bytes(author(author)));
		}
	}

	@Override
	public Optional<Entry> stat(String path) {
		if (".".equals(path) || "books".equals(path) || "authors".equals(path)) {
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
			return List.of(
					stat("authors").orElseThrow(),
					stat("books").orElseThrow(),
					stat("index.md").orElseThrow());
		}
		if (!"books".equals(directory) && !"authors".equals(directory)) {
			throw new NoSuchFileException(directory);
		}
		List<Entry> entries = new ArrayList<>();
		for (String path: files.keySet()) {
			if (path.startsWith(directory + "/")) {
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
	// end::catalog[]

	// --- Rendering ---

	private static String index(Library library) {
		StringBuilder md = new StringBuilder("# ").append(library.getName());
		md.append("\n\n## Books\n\n");
		for (Book book: library.getBooks()) {
			md.append("- ").append(link(book.getName(), "books/")).append(" (")
				.append(book.getYear()).append(")\n");
		}
		md.append("\n## Authors\n\n");
		for (Author author: library.getAuthors()) {
			md.append("- ").append(link(author.getName(), "authors/")).append('\n');
		}
		return md.toString();
	}

	private static String book(Book book) {
		StringBuilder md = new StringBuilder("# ").append(book.getName()).append("\n\n");
		md.append("* Year: ").append(book.getYear()).append('\n');
		md.append("* Genre: ").append(book.getGenre()).append('\n');
		if (book.getIsbn() != null) {
			md.append("* ISBN: ").append(book.getIsbn()).append('\n');
		}
		String authors = book.getAuthors().stream()
				.map(a -> link(a.getName(), "../authors/"))
				.collect(Collectors.joining(", "));
		md.append("* Authors: ").append(authors).append('\n');
		List<Book> citedBy = book.getReferrers(LibraryPackage.Literals.BOOK__CITES).stream()
				.map(Book.class::cast)
				.toList();
		if (!citedBy.isEmpty()) {
			String citing = citedBy.stream()
					.map(b -> link(b.getName(), ""))
					.collect(Collectors.joining(", "));
			md.append("* Cited by: ").append(citing).append('\n');
		}
		return md.toString();
	}

	private static String author(Author author) {
		StringBuilder md = new StringBuilder("# ").append(author.getName());
		md.append("\n\n## Books\n\n");
		for (Book book: author.getBooks()) {
			md.append("- ").append(link(book.getName(), "../books/")).append('\n');
		}
		return md.toString();
	}

	private static String link(String name, String directory) {
		return "[" + name + "](" + directory + slug(name) + ".md)";
	}

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

}
