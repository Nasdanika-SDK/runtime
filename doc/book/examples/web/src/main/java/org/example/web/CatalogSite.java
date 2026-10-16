package org.example.web;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.example.library.Author;
import org.example.library.Book;
import org.example.library.Genre;
import org.example.library.Library;
import org.example.library.LibraryPackage;
import org.nasdanika.sdk.runtime.models.html.Anchor;
import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Heading;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableHead;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Container;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Badge;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Breadcrumb;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.BreadcrumbItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;
import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;

/**
 * A catalog site generated from a library: the page is a model too, and the generator writes
 * the model of the page, not strings. One index page and one page per book, into any writable
 * volume.
 */
public final class CatalogSite {

	private static final HtmlFactory HTML = HtmlFactory.eINSTANCE;
	private static final BootstrapFactory BOOTSTRAP = BootstrapFactory.eINSTANCE;
	private static final ContentFactory CONTENT = ContentFactory.eINSTANCE;
	private static final NavigationFactory NAVIGATION = NavigationFactory.eINSTANCE;

	private CatalogSite() {
	}

	// tag::generate[]
	public static void generate(Library library, Volume volume) throws IOException {
		Volume.Writable site = volume.capability(Volume.Writable.class)
				.orElseThrow(() -> new IOException("Read-only volume"));
		String name = library.getName();
		site.write("index.html", html(page(name, heading(name), table(library)))); // <1>
		if (volume.stat("books").isEmpty()) {
			site.createDirectory("books");                                     // <2>
		}
		for (Book book: library.getBooks()) {
			site.write("books/" + slug(book.getName()) + ".html", html(page(
					book.getName(),
					breadcrumb(library, book),
					heading(book.getName()),
					facts(book))));
		}
	}

	private static Content html(BootstrapDocument document) {
		String html = BootstrapStructure.generate(document);                   // <3>
		return Content.of(html, StandardCharsets.UTF_8);
	}
	// end::generate[]

	// tag::page[]
	static BootstrapDocument page(String title, Node... contents) {
		BootstrapDocument document = BOOTSTRAP.createBootstrapDocument();
		document.setTheme(Theme.FLATLY);                                       // <1>
		document.setLang("en");

		Head head = HTML.createHead();
		head.setTitle(title);
		document.setHead(head);

		Container container = BOOTSTRAP.createContainer();
		container.getClasses().add("my-4");
		container.getContents().addAll(List.of(contents));
		Body body = HTML.createBody();
		body.getContents().add(container);
		document.setBody(body);
		return document;
	}
	// end::page[]

	// tag::table[]
	static Table table(Library library) {
		Table table = CONTENT.createTable();
		table.setStriped(true);
		table.setHover(true);

		TableHead head = HTML.createTableHead();
		head.getRows().add(row(true, text("Title"), text("Year"), text("Genre"), text("Authors")));
		table.setHead(head);

		TableBody body = HTML.createTableBody();
		for (Book book: library.getBooks()) {
			Anchor link = HTML.createAnchor();
			link.setHref("books/" + slug(book.getName()) + ".html");
			link.getContents().add(text(book.getName()));

			Badge genre = CONTENT.createBadge();
			genre.setBg(book.getGenre() == Genre.TECHNOLOGY ? Variant.PRIMARY : Variant.SECONDARY);
			genre.setContent(book.getGenre().getLiteral());

			String authors = book.getAuthors().stream()
					.map(Author::getName)
					.collect(Collectors.joining(", "));
			body.getRows().add(row(
					false,
					link,
					text(String.valueOf(book.getYear())),
					genre,
					text(authors)));
		}
		table.getBodies().add(body);
		return table;
	}
	// end::table[]

	static Breadcrumb breadcrumb(Library library, Book book) {
		Breadcrumb breadcrumb = NAVIGATION.createBreadcrumb();
		BreadcrumbItem home = NAVIGATION.createBreadcrumbItem();
		home.setHref("../index.html");
		home.setContent(library.getName());
		BreadcrumbItem current = NAVIGATION.createBreadcrumbItem();
		current.setActive(true);
		current.setContent(book.getName());
		breadcrumb.getItems().addAll(List.of(home, current));
		return breadcrumb;
	}

	static ListGroup facts(Book book) {
		ListGroup facts = CONTENT.createListGroup();
		facts.getItems().add(item("Published in " + book.getYear()));
		String authors = book.getAuthors().stream()
				.map(Author::getName)
				.collect(Collectors.joining(", "));
		facts.getItems().add(item("By " + authors));
		if (book.getIsbn() != null) {
			facts.getItems().add(item("ISBN " + book.getIsbn()));
		}
		for (Book cited: book.getCites()) {
			ListGroupItem item = item("Cites " + cited.getName());
			item.setHref(slug(cited.getName()) + ".html");
			item.setAction(true);
			facts.getItems().add(item);
		}
		for (Object referrer: book.getReferrers(LibraryPackage.Literals.BOOK__CITES)) {
			Book citing = (Book) referrer;
			ListGroupItem item = item("Cited by " + citing.getName());
			item.setHref(slug(citing.getName()) + ".html");
			item.setAction(true);
			facts.getItems().add(item);
		}
		return facts;
	}

	private static ListGroupItem item(String content) {
		ListGroupItem item = CONTENT.createListGroupItem();
		item.setContent(content);
		return item;
	}

	private static Heading heading(String content) {
		Heading heading = HTML.createHeading();
		heading.setLevel(1);
		heading.getContents().add(text(content));
		return heading;
	}

	private static TableRow row(boolean header, Node... contents) {
		TableRow row = HTML.createTableRow();
		for (Node content: contents) {
			TableCell cell = HTML.createTableCell();
			cell.setHeader(header);
			cell.getContents().add(content);
			row.getCells().add(cell);
		}
		return row;
	}

	private static Text text(String content) {
		Text text = HTML.createText();
		text.setContent(content);
		return text;
	}

	static String slug(String name) {
		return name.toLowerCase().replaceAll("[^a-z0-9]+", "-").replaceAll("(^-|-$)", "");
	}

	public static void main(String[] args) throws IOException {
		java.nio.file.Path directory = java.nio.file.Path.of(args.length > 0 ? args[0] : "site");
		java.nio.file.Files.createDirectories(directory);
		generate(org.example.library.services.Samples.library(), Volume.of(directory));
		System.out.println("Open " + directory.resolve("index.html").toAbsolutePath());
	}

}
