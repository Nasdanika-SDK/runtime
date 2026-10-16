package org.example.library.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Genre;
import org.example.library.Library;
import org.example.library.LibraryFactory;

/**
 * The sample library the examples of the book share.
 */
public final class Samples {

	private Samples() {
	}

	// tag::create[]
	/**
	 * A small library of books about software, science and the past.
	 */
	public static Library library() {
		LibraryFactory factory = LibraryFactory.eINSTANCE;
		Library library = factory.createLibrary();
		library.setName("A Modeler's Shelf");

		Map<String, Author> authors = new LinkedHashMap<>();
		Book sicp = book(library, authors, "Structure and Interpretation of Computer Programs", 1985, Genre.TECHNOLOGY, "Harold Abelson", "Gerald Jay Sussman");
		Book taocp = book(library, authors, "The Art of Computer Programming", 1968, Genre.TECHNOLOGY, "Donald Knuth");
		Book patterns = book(library, authors, "Design Patterns", 1994, Genre.TECHNOLOGY, "Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides");
		Book ddd = book(library, authors, "Domain-Driven Design", 2003, Genre.TECHNOLOGY, "Eric Evans");
		Book emf = book(library, authors, "EMF: Eclipse Modeling Framework", 2008, Genre.TECHNOLOGY, "Dave Steinberg", "Frank Budinsky", "Marcelo Paternostro", "Ed Merks");
		book(library, authors, "On the Origin of Species", 1859, Genre.SCIENCE, "Charles Darwin");
		book(library, authors, "A Brief History of Time", 1988, Genre.SCIENCE, "Stephen Hawking");
		book(library, authors, "War and Peace", 1869, Genre.FICTION, "Leo Tolstoy");

		sicp.setIsbn("978-0262510875");
		patterns.setIsbn("978-0201633610");
		ddd.setIsbn("978-0321125217");
		emf.setIsbn("978-0321331885");

		ddd.getCites().add(patterns);   // A reference without an opposite
		emf.getCites().addAll(List.of(patterns, ddd));
		patterns.getCites().add(sicp);
		sicp.getCites().add(taocp);

		library.getAuthors().addAll(authors.values()); // Authors are contained by the library
		return library;
	}

	private static Book book(Library library, Map<String, Author> authors, String title, int year, Genre genre, String... authorNames) {
		Book book = LibraryFactory.eINSTANCE.createBook();
		book.setName(title);
		book.setYear(year);
		book.setGenre(genre);
		for (String name: authorNames) {
			Author author = authors.computeIfAbsent(name, n -> {
				Author a = LibraryFactory.eINSTANCE.createAuthor();
				a.setName(n);
				return a;
			});
			book.getAuthors().add(author); // The opposite, author.getBooks(), is maintained by EMF
		}
		library.getBooks().add(book);
		return book;
	}
	// end::create[]

}
