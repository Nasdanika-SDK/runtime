package org.example.ui;

import java.util.List;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Library;
import org.example.library.LibraryPackage;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.Node;

// tag::library[]
/**
 * A library: its name, a card per book, and its authors. What a book or an author looks like
 * is not this view's business: it asks the resolver.
 */
public class LibraryView extends View<Library> {

	public LibraryView() {
		super(LibraryPackage.Literals.LIBRARY);
	}

	@Override
	protected Node render(Library library, Views views) {
		Div page = HTML.createDiv();
		page.getContents().add(heading(1, library.getName()));

		Div books = HTML.createDiv();
		books.getClasses().addAll(List.of("d-grid", "gap-3", "mb-4"));
		for (Book book: library.getBooks()) {
			books.getContents().add(views.render(book));                         // <1>
		}
		page.getContents().add(books);

		page.getContents().add(heading(2, "Authors"));
		for (Author author: library.getAuthors()) {
			page.getContents().add(views.render(author));                        // <2>
		}
		return page;
	}
	// end::library[]

	private static Heading heading(int level, String content) {
		Heading heading = HTML.createHeading();
		heading.setLevel(level);
		heading.getContents().add(text(content));
		return heading;
	}

}
