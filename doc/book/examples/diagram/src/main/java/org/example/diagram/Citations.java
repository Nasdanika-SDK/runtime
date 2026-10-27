package org.example.diagram;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.DrawioFactory;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.Page;

/**
 * The citations between the books of a library, as a diagram: a node per book that cites or is
 * cited, and a connection per citation.
 */
public final class Citations {

	/**
	 * The attribute that names the book a node depicts.
	 */
	public static final String BOOK = "book";

	private Citations() {
	}

	// tag::generate[]
	/**
	 * A Draw.io document with one page of the library's citations.
	 */
	public static Document diagram(Library library) {
		DrawioFactory factory = DrawioFactory.eINSTANCE;
		Document document = factory.createDocument();
		Page page = factory.createPage();
		page.setId("citations");
		page.setName("Citations");
		page.getAttributes().put("elk.direction", "DOWN");                   // <1>
		document.getChildren().add(page);
		Layer layer = factory.createLayer();
		page.getChildren().add(layer);

		Map<Book, org.nasdanika.sdk.runtime.models.drawio.Node> nodes = new LinkedHashMap<>();
		for (Book book : library.getBooks()) {
			if (book.getCites().isEmpty() && cited(library, book).isEmpty()) {
				continue;
			}
			var node = factory.createNode();
			node.setId("book-" + library.getBooks().indexOf(book));
			node.setName(book.getName());
			node.setDocumentation(book.getYear() + ", " + authors(book));      // <2>
			node.getAttributes().put(BOOK, book.getName());                    // <3>
			node.getSemanticElements().add(book);                              // <4>
			node.getStyle().put("rounded", "1");
			node.getStyle().put("fillColor", "#dae8fc");
			node.getStyle().put("strokeColor", "#6c8ebf");
			layer.getChildren().add(node);
			nodes.put(book, node);
		}
		for (Book book : nodes.keySet()) {
			for (Book cited : book.getCites()) {
				var connection = factory.createConnection();
				connection.setId(nodes.get(book).getId() + "-cites-" + nodes.get(cited).getId());
				connection.setSource(nodes.get(book));
				connection.setTarget(nodes.get(cited));
				connection.getStyle().put("endArrow", "open");
				layer.getChildren().add(connection);
			}
		}
		return document;
	}
	// end::generate[]

	// tag::map[]
	/**
	 * Maps the nodes of a diagram to the books they depict, by the book attribute, and returns
	 * the citations the diagram shows that the library does not have.
	 */
	public static List<String> check(DiagramElement diagram, Library library) {
		Map<String, Book> books = new LinkedHashMap<>();
		library.getBooks().forEach(book -> books.put(book.getName(), book));
		List<String> problems = new ArrayList<>();
		for (EObject element : contents(diagram)) {
			if (element instanceof Node node && node.getAttributes().containsKey(BOOK)) {
				Book book = books.get(node.getAttributes().get(BOOK));
				if (book == null) {
					problems.add("No book " + node.getAttributes().get(BOOK));
				} else {
					node.getSemanticElements().add(book);                      // <1>
				}
			}
		}
		for (EObject element : contents(diagram)) {
			if (element instanceof Connection connection) {
				Book source = book(connection.getSource());
				Book target = book(connection.getTarget());
				if (source != null && target != null && !source.getCites().contains(target)) {
					problems.add(source.getName() + " does not cite " + target.getName()); // <2>
				}
			}
		}
		return problems;
	}
	// end::map[]

	private static List<EObject> contents(EObject root) {
		List<EObject> contents = new ArrayList<>();
		root.eAllContents().forEachRemaining(contents::add);
		return contents;
	}

	private static Book book(DiagramElement element) {
		return element == null ? null : element.getSemanticElements()
			.stream()
			.filter(Book.class::isInstance)
			.map(Book.class::cast)
			.findFirst()
			.orElse(null);
	}

	private static List<Book> cited(Library library, Book book) {
		return library.getBooks().stream().filter(b -> b.getCites().contains(book)).toList();
	}

	private static String authors(Book book) {
		return String.join(", ", book.getAuthors().stream().map(Author::getName).toList());
	}

}
