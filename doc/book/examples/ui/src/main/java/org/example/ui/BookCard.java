package org.example.ui;

import java.util.stream.Collectors;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.LibraryPackage;
import org.nasdanika.sdk.runtime.models.core.Marker;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Card;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardBody;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardSubtitle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardText;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CardTitle;

// tag::book[]
/**
 * A book as a Bootstrap card.
 */
public class BookCard extends View<Book> {

	public BookCard() {
		super(LibraryPackage.Literals.BOOK);
	}

	@Override
	protected Node render(Book book, Views views) {
		CardTitle title = CONTENT.createCardTitle();
		title.setContent(book.getName());
		CardSubtitle subtitle = CONTENT.createCardSubtitle();
		subtitle.setContent(book.getYear() + ", " + book.getGenre().getLiteral().toLowerCase());
		CardText authors = CONTENT.createCardText();
		authors.setContent(book.getAuthors().stream()
				.map(Author::getName)
				.collect(Collectors.joining(", ")));

		CardBody body = CONTENT.createCardBody();
		body.setTitle(title);
		body.setSubtitle(subtitle);
		body.getTexts().add(authors);
		for (Marker marker: book.getMarkers()) {
			body.getContents().add(views.render(marker));                        // <1>
		}

		Card card = CONTENT.createCard();
		card.getBodies().add(body);
		return card;
	}

}
// end::book[]
