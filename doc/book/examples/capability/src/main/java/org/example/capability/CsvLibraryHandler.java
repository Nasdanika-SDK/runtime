package org.example.capability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Genre;
import org.example.library.Library;
import org.example.library.LibraryFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;

// tag::handler[]
/**
 * Libraries as CSV: an optional "# name" line, a header, then one book per line with
 * its authors separated by semicolons. Loading builds the model; saving writes it back.
 */
public class CsvLibraryHandler implements ResourceContentsHandler<EObject[]> {

	static final String HEADER = "title,year,genre,isbn,authors";

	@Override
	public Order getOrder() {
		return Order.of(0);
	}

	@Override
	public EObject[] load(InputStream in, Map<?, ?> options) throws IOException {
		LibraryFactory factory = LibraryFactory.eINSTANCE;
		Library library = factory.createLibrary();
		Map<String, Author> authors = new LinkedHashMap<>();
		var reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
			if (line.startsWith("# ")) {
				library.setName(line.substring(2).trim());
			} else if (!line.isBlank() && !line.equals(HEADER)) {
				List<String> cells = split(line);
				Book book = factory.createBook();
				book.setName(cells.get(0));
				book.setYear(Integer.parseInt(cells.get(1)));
				book.setGenre(Genre.get(cells.get(2)));
				book.setIsbn(cells.get(3).isEmpty() ? null : cells.get(3));
				for (String name: cells.get(4).split(";")) {
					book.getAuthors().add(authors.computeIfAbsent(name.trim(), n -> {
						Author author = factory.createAuthor();
						author.setName(n);
						return author;
					}));
				}
				library.getBooks().add(book);
			}
		}
		library.getAuthors().addAll(authors.values());
		return new EObject[] { library };
	}

	@Override
	public void save(EObject[] roots, OutputStream out, Map<?, ?> options) throws IOException {
		out.write(write((Library) roots[0]).getBytes(StandardCharsets.UTF_8));
	}
	// end::handler[]

	String write(Library library) {
		StringBuilder csv = new StringBuilder();
		if (library.getName() != null) {
			csv.append("# ").append(library.getName()).append('\n');
		}
		csv.append(HEADER).append('\n');
		for (Book book: library.getBooks()) {
			csv.append(String.join(",",
					quote(book.getName()),
					String.valueOf(book.getYear()),
					book.getGenre().getLiteral(),
					book.getIsbn() == null ? "" : book.getIsbn(),
					quote(book.getAuthors().stream().map(Author::getName).collect(Collectors.joining("; ")))));
			csv.append('\n');
		}
		return csv.toString();
	}

	private static String quote(String value) {
		return value.contains(",") || value.contains("\"") ? "\"" + value.replace("\"", "\"\"") + "\"" : value;
	}

	private static List<String> split(String line) {
		List<String> cells = new ArrayList<>();
		StringBuilder cell = new StringBuilder();
		boolean quoted = false;
		for (int i = 0; i < line.length(); ++i) {
			char c = line.charAt(i);
			if (quoted) {
				if (c == '"' && i + 1 < line.length() && line.charAt(i + 1) == '"') {
					cell.append('"');
					++i;
				} else if (c == '"') {
					quoted = false;
				} else {
					cell.append(c);
				}
			} else if (c == '"') {
				quoted = true;
			} else if (c == ',') {
				cells.add(cell.toString());
				cell.setLength(0);
			} else {
				cell.append(c);
			}
		}
		cells.add(cell.toString());
		return cells;
	}

}
