package org.nasdanika.sdk.runtime.models.html.bootstrap.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.CONTENT;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.CORE;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.HTML;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.NAVIGATION;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.element;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.size;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.text;
import static org.nasdanika.sdk.runtime.models.html.bootstrap.tests.Bootstrap.with;

import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Theme;
import org.nasdanika.sdk.runtime.models.html.bootstrap.builders.NavigationTree;
import org.nasdanika.sdk.runtime.models.html.bootstrap.generator.BootstrapStructure;
import org.nasdanika.sdk.runtime.models.html.generator.Generator;

/**
 * The files of this module as a static site with a navigation tree in a side panel: a folder per
 * file or directory, e.g. <code>tree/src/main/java/module-info.java/index.html</code>. Each page
 * shows the tree with the path to the page expanded, a breadcrumb, and the file content or the
 * directory listing.
 * <p>
 * Browse with <code>jwebserver -d target/html-bootstrap/site</code> and open
 * <a href="http://127.0.0.1:8000/tree/">http://127.0.0.1:8000/tree/</a>.
 */
public class NavigationTreeDemoTests {

	private static final Path MODULE = Path.of("").toAbsolutePath();

	private static final Path TREE = BootstrapDemoTests.SITE.resolve("tree");

	/**
	 * A file or directory of the module.
	 *
	 * @param segments Path from the module root, empty for the root
	 */
	private record Entry(List<String> segments, Path file, List<Entry> children) {

		boolean isDirectory() {
			return Files.isDirectory(file);
		}

		String name() {
			return segments.isEmpty() ? MODULE.getFileName().toString() : segments.getLast();
		}

		String path() {
			return String.join("/", segments);
		}

		/**
		 * Relative URL of the page of the target entry from the page of this entry.
		 */
		String href(Entry target) {
			String up = "../".repeat(segments.size());
			return target.segments.isEmpty() ? (up.isEmpty() ? "./" : up) : up + target.path() + "/";
		}

	}

	private static Entry load(Path file, List<String> segments) throws IOException {
		List<Entry> children = new ArrayList<>();
		if (Files.isDirectory(file)) {
			try (Stream<Path> list = Files.list(file)) {
				for (Path child: list.sorted(Comparator.comparing((Path p) -> !Files.isDirectory(p)).thenComparing(p -> p.getFileName().toString().toLowerCase())).toList()) {
					String name = child.getFileName().toString();
					if (name.startsWith(".") || (segments.isEmpty() && name.equals("target"))) {
						continue;
					}
					List<String> childSegments = new ArrayList<>(segments);
					childSegments.add(name);
					children.add(load(child, childSegments));
				}
			}
		}
		return new Entry(segments, file, children);
	}

	private static void walk(Entry entry, List<Entry> collector) {
		collector.add(entry);
		for (Entry child: entry.children()) {
			walk(child, collector);
		}
	}

	// --- Icons -------------------------------------------------------------------

	/**
	 * Bootstrap Icons classes by file type.
	 */
	private static String icon(String name) {
		String extension = name.contains(".") ? name.substring(name.lastIndexOf('.') + 1) : "";
		return switch (extension) {
			case "java" -> "bi bi-filetype-java";
			case "xml" -> "bi bi-filetype-xml";
			case "html" -> "bi bi-filetype-html";
			case "xcore" -> "bi bi-diagram-3";
			default -> "bi bi-file-earmark-text";
		};
	}

	// --- Tree --------------------------------------------------------------------

	private static NavigationTree tree(Entry root, Entry current) {
		NavigationTree tree = new NavigationTree("Files");
		add(tree.add(root.name()), root, current);
		return tree;
	}

	private static void add(NavigationTree.Item item, Entry entry, Entry current) {
		item.href(current.href(entry));
		if (entry.isDirectory()) {
			item.icon("bi bi-folder", "bi bi-folder2-open");
		} else {
			item.icon(icon(entry.name()));
		}
		if (entry == current) {
			item.current();
		}
		for (Entry child: entry.children()) {
			add(item.add(child.name()), child, current);
		}
	}

	// --- Pages -------------------------------------------------------------------

	private static BootstrapDocument page(Entry root, Entry entry) throws IOException {
		BootstrapDocument document = with(CORE.createBootstrapDocument(), d -> {
			d.setLang("en");
			d.setTheme(Theme.BOOTSTRAP);
		});
		document.setHead(with(HTML.createHead(), head -> {
			head.setTitle(entry.name() + " - " + root.name());
			Meta viewport = HTML.createMeta();
			viewport.setName("viewport");
			viewport.setContent("width=device-width, initial-scale=1");
			head.getMetas().add(viewport);
			head.getStylesheets().add(NavigationTree.iconsStylesheet());
			head.getStylesheets().add(NavigationTree.stylesheet());
		}));

		var panel = with(CORE.createCol(), col -> {
			col.getSizes().add(size(Breakpoint.MD, 4));
			col.getSizes().add(size(Breakpoint.LG, 3));
			col.getClasses().addAll(List.of("sticky-md-top", "align-self-start", "overflow-auto", "border-end", "py-3", "small"));
			col.getStyle().put("max-height", "100vh");
			col.getContents().add(tree(root, entry).build());
		});

		Node details = entry.isDirectory() ? listing(entry) : content(entry);
		var main = with(CORE.createCol(), col -> {
			col.getSizes().add(size(Breakpoint.MD, 8));
			col.getSizes().add(size(Breakpoint.LG, 9));
			col.getClasses().add("py-3");
			col.getContents().add(breadcrumb(root, entry));
			col.getContents().add(element(with(HTML.createHeading(), h -> h.setLevel(1)), entry.name(), "h3"));
			col.getContents().add(details);
		});

		document.setBody(with(HTML.createBody(), body -> {
			body.getContents().add(BootstrapDemoTests.navbar("../".repeat(entry.segments().size() + 1), Theme.BOOTSTRAP));
			body.getContents().add(with(CORE.createContainer(), c -> {
				c.setFluid(true);
				c.getRows().add(with(CORE.createRow(), r -> {
					r.getColumns().add(panel);
					r.getColumns().add(main);
				}));
			}));
		}));
		return document;
	}

	private static Node breadcrumb(Entry root, Entry entry) {
		return with(NAVIGATION.createBreadcrumb(), b -> {
			Entry ancestor = root;
			b.getItems().add(crumb(root, entry));
			for (String segment: entry.segments()) {
				Entry parent = ancestor;
				ancestor = parent.children().stream().filter(c -> c.name().equals(segment)).findFirst().orElseThrow();
				b.getItems().add(crumb(ancestor, entry));
			}
		});
	}

	private static org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.BreadcrumbItem crumb(Entry target, Entry current) {
		return with(NAVIGATION.createBreadcrumbItem(), i -> {
			i.setContent(target.name());
			if (target == current) {
				i.setActive(true);
			} else {
				i.setHref(current.href(target));
			}
		});
	}

	private static Node listing(Entry directory) {
		return with(CONTENT.createListGroup(), l -> {
			for (Entry child: directory.children()) {
				l.getItems().add(with(CONTENT.createListGroupItem(), i -> {
					i.setHref(directory.href(child));
					i.setAction(true);
					i.getContents().add(element(with(HTML.createGenericElement(), e -> e.setName("i")), null, (child.isDirectory() ? "bi bi-folder me-2" : icon(child.name()) + " me-2").split(" ")));
					i.getContents().add(text(child.name()));
				}));
			}
		});
	}

	private static Node content(Entry file) throws IOException {
		String content;
		try {
			content = Files.readString(file.file());
		} catch (CharacterCodingException e) {
			return element(HTML.createParagraph(), "Binary file", "text-body-secondary");
		}
		var code = HTML.createCode();
		code.getContents().add(text(content));
		return with(HTML.createPre(), pre -> {
			pre.getClasses().addAll(List.of("border", "rounded", "p-3", "bg-body-tertiary", "small"));
			pre.getContents().add(code);
		});
	}

	@Test
	public void testTree() throws IOException {
		Entry root = load(MODULE, List.of());
		List<Entry> entries = new ArrayList<>();
		walk(root, entries);
		for (Entry entry: entries) {
			// Compact, because every page carries the whole tree
			String html = new Generator(new BootstrapStructure()).setIndent(null).generate(page(root, entry)) + "\n";
			Path file = TREE.resolve(entry.path()).resolve("index.html");
			Files.createDirectories(file.getParent());
			Files.writeString(file, html);
		}

		String structure = Files.readString(TREE.resolve("src/main/java/org/nasdanika/sdk/runtime/models/html/bootstrap/generator/BootstrapStructure.java/index.html"));
		assertTrue(structure.contains("aria-current=\"page\""), structure);
		assertTrue(structure.contains("bi-filetype-java"), structure);
		assertTrue(structure.contains("<details open"), structure);
		assertTrue(Files.readString(TREE.resolve("index.html")).contains("bi-filetype-xml"));
	}

	/**
	 * A small tree without icons or links, collapsed except for the branches set open, and the
	 * local mode, where branches off the current path are links without children.
	 */
	@Test
	public void testBuilder() {
		NavigationTree tree = new NavigationTree("Family");
		NavigationTree.Item family = tree.add("Family");
		NavigationTree.Item members = family.add("Members").open();
		members.add("Alain");
		members.add("Bob");
		family.add("Pets").add("Rex");
		String html = BootstrapStructure.generate(tree.build());
		assertTrue(html.contains("<details open"), html);
		assertTrue(html.contains("<span class=\"nav-tree-label\">Rex</span>"), html);
		assertTrue(!html.contains("<i "), html);

		tree.local(true);
		html = BootstrapStructure.generate(tree.build());
		assertTrue(html.contains("nav-tree-collapsed"), html);
		assertTrue(!html.contains("Rex"), html);
	}

}
