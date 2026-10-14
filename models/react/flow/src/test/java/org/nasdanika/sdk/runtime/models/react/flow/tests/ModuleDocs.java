package org.nasdanika.sdk.runtime.models.react.flow.tests;

import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleReader;
import java.lang.module.ResolvedModule;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.sdk.runtime.models.react.tests.DocViewerTests;
import org.nasdanika.sdk.runtime.models.react.tests.ModuleDocs;
import org.nasdanika.sdk.runtime.models.react.tests.ModuleGraph;

/**
 * A documentation tree over the modules of a module layer, in the shape the
 * documentation viewer consumes: items with an id unique within their parent, a label,
 * an optional icon and tooltip, optional Markdown, and children.
 * <p>
 * Tree: "Application modules" and "JDK modules" groups (ids <code>modules/application</code>
 * and <code>modules/jdk</code>, deliberately with a slash), a module per item, a
 * "Packages" group per module, and a package per item listing its types. Groups have
 * no Markdown, so the viewer toggles them instead of opening them.
 * <p>
 * The item's URL is the path of ids joined by <code>/</code> plus
 * <code>/index.html</code>, so ids containing slashes add path segments, as on the
 * existing Nasdanika documentation sites. {@link #resolve(List)} maps segments back to
 * ids by longest match at each level, which is what makes slashes in ids unambiguous
 * as long as no two siblings produce the same URL path; {@link #checkUrlPaths()}
 * verifies that.
 * <p>
 * Children and Markdown are computed on demand and cached, so a server can serve a tree
 * of any size and only compute what a reader opens.
 */
class ModuleDocs {

	static final String APPLICATION_GROUP = "modules/application";

	static final String JDK_GROUP = "modules/jdk";

	static final String PACKAGES_GROUP = "packages";

	record DocItem(String id, String label, String icon, String tooltip, Function<List<String>, String> markdown, Supplier<List<DocItem>> children) {

		boolean hasMarkdown() {
			return markdown != null;
		}

		List<DocItem> childItems() {
			return children == null ? List.of() : children.get();
		}

	}

	private final ModuleLayer layer;

	private final Predicate<String> include;

	private final Map<String, Supplier<Map<String, List<String>>>> types = new java.util.concurrent.ConcurrentHashMap<>();

	private final Supplier<List<DocItem>> roots;

	ModuleDocs(ModuleLayer layer, Predicate<String> include) {
		this.layer = layer;
		this.include = include;
		this.roots = memo(this::createRoots);
	}

	List<DocItem> roots() {
		return roots.get();
	}

	// --- Tree -----------------------------------------------------------------------

	private List<DocItem> createRoots() {
		List<Module> modules = layer.modules()
				.stream()
				.filter(module -> include.test(module.getName()))
				.sorted(Comparator.comparing(Module::getName))
				.toList();
		List<DocItem> ret = new ArrayList<>();
		List<Module> application = modules.stream().filter(module -> !ModuleGraph.isJdk(module.getName())).toList();
		List<Module> jdk = modules.stream().filter(module -> ModuleGraph.isJdk(module.getName())).toList();
		if (!application.isEmpty()) {
			ret.add(new DocItem(APPLICATION_GROUP, "Application modules", "bi-boxes", application.size() + " modules", null, memo(() -> application.stream().map(this::moduleItem).toList())));
		}
		if (!jdk.isEmpty()) {
			ret.add(new DocItem(JDK_GROUP, "JDK modules", "bi-cup-hot", jdk.size() + " modules", null, memo(() -> jdk.stream().map(this::moduleItem).toList())));
		}
		return ret;
	}

	private DocItem moduleItem(Module module) {
		ModuleDescriptor descriptor = module.getDescriptor();
		String tooltip = kind(descriptor) + descriptor.rawVersion().map(version -> ", " + version).orElse("");
		return new DocItem(module.getName(), module.getName(), "bi-box", tooltip, path -> moduleMarkdown(module, path), memo(() -> {
			List<String> packages = new ArrayList<>(descriptor.packages());
			if (packages.isEmpty()) {
				return List.of();
			}
			packages.sort(Comparator.naturalOrder());
			return List.of(new DocItem(PACKAGES_GROUP, "Packages", "bi-folder", packages.size() + " packages", null,
					memo(() -> packages.stream().map(name -> packageItem(module, name)).toList())));
		}));
	}

	private DocItem packageItem(Module module, String packageName) {
		return new DocItem(packageName, packageName, "bi-braces", exportStatus(module.getDescriptor(), packageName), path -> packageMarkdown(module, packageName, path), null);
	}

	static List<String> modulePath(String moduleName) {
		return List.of(ModuleGraph.isJdk(moduleName) ? JDK_GROUP : APPLICATION_GROUP, moduleName);
	}

	static List<String> packagePath(String moduleName, String packageName) {
		return List.of(ModuleGraph.isJdk(moduleName) ? JDK_GROUP : APPLICATION_GROUP, moduleName, PACKAGES_GROUP, packageName);
	}

	// --- Markdown -------------------------------------------------------------------

	String home() {
		String title = "Nasdanika documentation viewer, JVM modules demo";
		StringBuilder md = new StringBuilder();
		md.append("This site documents the modules of the JVM the test ran in: every module, its packages, and the types in each package. ");
		md.append("It is the same viewer for a static site and for a server, and the tree on the left is the site's structure: ");
		md.append("an item's URL is the path of the ids leading to it.\n\n");
		md.append("Start with [java.base](").append(relative(List.of(), modulePath("java.base"))).append(")");
		String self = ModuleDocs.class.getModule().getName();
		if (self != null && include.test(self)) {
			md.append(" or with the module this test runs in, [").append(self).append("](").append(relative(List.of(), modulePath(self))).append(")");
		}
		md.append(", or search for a type, for example `Optional` or `ResourceSet`.\n\n");
		md.append("> ").append(title).append(".\n");
		return md.toString();
	}

	private String moduleMarkdown(Module module, List<String> path) {
		ModuleDescriptor descriptor = module.getDescriptor();
		StringBuilder md = new StringBuilder();
		md.append("| Property | Value |\n|---|---|\n");
		md.append("| Name | `").append(module.getName()).append("` |\n");
		md.append("| Version | ").append(descriptor.rawVersion().orElse("-")).append(" |\n");
		md.append("| Kind | ").append(kind(descriptor)).append(" |\n");
		location(module).ifPresent(location -> md.append("| Location | `").append(location).append("` |\n"));
		descriptor.mainClass().ifPresent(mainClass -> md.append("| Main class | `").append(mainClass).append("` |\n"));

		md.append("\n## Requires\n\n");
		List<ModuleDescriptor.Requires> requires = descriptor.requires().stream().sorted(Comparator.comparing(ModuleDescriptor.Requires::name)).toList();
		if (requires.isEmpty()) {
			md.append("Nothing.\n");
		}
		for (ModuleDescriptor.Requires required : requires) {
			String modifiers = required.modifiers().stream().map(modifier -> modifier.name().toLowerCase(Locale.ROOT)).sorted().collect(Collectors.joining(", "));
			md.append("* ").append(moduleLink(required.name(), path)).append(modifiers.isEmpty() ? "" : " (" + modifiers + ")").append("\n");
		}

		md.append("\n## Exports\n\n");
		List<ModuleDescriptor.Exports> exports = descriptor.exports().stream().sorted(Comparator.comparing(ModuleDescriptor.Exports::source)).toList();
		if (exports.isEmpty()) {
			md.append("Nothing.\n");
		}
		for (ModuleDescriptor.Exports export : exports) {
			md.append("* [`").append(export.source()).append("`](").append(relative(path, packagePath(module.getName(), export.source()))).append(")");
			if (export.isQualified()) {
				md.append(" to ").append(export.targets().stream().sorted().map(target -> moduleLink(target, path)).collect(Collectors.joining(", ")));
			}
			md.append("\n");
		}

		md.append("\n## Packages\n\n").append(descriptor.packages().size()).append(" packages, ").append(exports.size()).append(" exported. See Packages in the navigation.\n");

		if (!descriptor.provides().isEmpty()) {
			md.append("\n## Provides\n\n");
			descriptor.provides().stream().sorted(Comparator.comparing(ModuleDescriptor.Provides::service)).forEach(provides -> md
					.append("* `").append(provides.service()).append("` with ")
					.append(provides.providers().stream().map(provider -> "`" + provider + "`").collect(Collectors.joining(", ")))
					.append("\n"));
		}
		if (!descriptor.uses().isEmpty()) {
			md.append("\n## Uses\n\n");
			descriptor.uses().stream().sorted().forEach(service -> md.append("* `").append(service).append("`\n"));
		}
		return md.toString();
	}

	private String packageMarkdown(Module module, String packageName, List<String> path) {
		List<String> packageTypes = types(module).getOrDefault(packageName, List.of());
		StringBuilder md = new StringBuilder();
		md.append("Package `").append(packageName).append("` in module ").append(moduleLink(module.getName(), path)).append(". ");
		md.append(exportStatus(module.getDescriptor(), packageName)).append(".\n\n");
		md.append("## Types\n\n");
		if (packageTypes.isEmpty()) {
			md.append("No top-level types found.\n");
		}
		for (String type : packageTypes) {
			md.append("* `").append(type).append("`\n");
		}
		return md.toString();
	}

	private String moduleLink(String moduleName, List<String> from) {
		boolean documented = include.test(moduleName) && layer.findModule(moduleName).isPresent();
		return documented ? "[" + moduleName + "](" + relative(from, modulePath(moduleName)) + ")" : "`" + moduleName + "`";
	}

	private static String kind(ModuleDescriptor descriptor) {
		return descriptor.isAutomatic() ? "automatic" : descriptor.isOpen() ? "open" : "explicit";
	}

	private static String exportStatus(ModuleDescriptor descriptor, String packageName) {
		for (ModuleDescriptor.Exports export : descriptor.exports()) {
			if (export.source().equals(packageName)) {
				return export.isQualified() ? "Exported to " + String.join(", ", export.targets().stream().sorted().toList()) : "Exported";
			}
		}
		return "Not exported";
	}

	private Optional<String> location(Module module) {
		return layer.configuration().findModule(module.getName()).flatMap(resolved -> resolved.reference().location()).map(Object::toString);
	}

	/**
	 * Top-level type names by package, read from the module's content: class files,
	 * without nested types and without module-info and package-info.
	 */
	private Map<String, List<String>> types(Module module) {
		return types.computeIfAbsent(module.getName(), name -> memo(() -> {
			Map<String, List<String>> ret = new TreeMap<>();
			Optional<ResolvedModule> resolved = layer.configuration().findModule(name);
			if (resolved.isEmpty()) {
				return ret;
			}
			try (ModuleReader reader = resolved.get().reference().open(); Stream<String> entries = reader.list()) {
				entries
						.filter(entry -> entry.endsWith(".class") && !entry.contains("$") && !entry.endsWith("module-info.class") && !entry.endsWith("package-info.class"))
						.forEach(entry -> {
							int slash = entry.lastIndexOf('/');
							if (slash > 0) {
								ret.computeIfAbsent(entry.substring(0, slash).replace('/', '.'), key -> new ArrayList<>())
										.add(entry.substring(slash + 1, entry.length() - ".class".length()));
							}
						});
			} catch (IOException e) {
				// Leave the module without type listings rather than fail the page.
			}
			ret.values().forEach(list -> list.sort(Comparator.naturalOrder()));
			return ret;
		})).get();
	}

	// --- URLs and resolution --------------------------------------------------------

	/**
	 * URL path of an item: ids joined by slashes, ids' own slashes kept, each segment
	 * percent-encoded. No trailing index.html.
	 */
	static String urlPath(List<String> ids) {
		return segments(ids).stream().map(ModuleDocs::encode).collect(Collectors.joining("/"));
	}

	static List<String> segments(List<String> ids) {
		List<String> ret = new ArrayList<>();
		for (String id : ids) {
			for (String segment : id.split("/")) {
				if (!segment.isEmpty()) {
					ret.add(segment);
				}
			}
		}
		return ret;
	}

	/**
	 * Relative link from one item's page to another's.
	 */
	static String relative(List<String> from, List<String> to) {
		List<String> fromSegments = segments(from);
		List<String> toSegments = segments(to);
		int common = 0;
		while (common < fromSegments.size() && common < toSegments.size() && fromSegments.get(common).equals(toSegments.get(common))) {
			common++;
		}
		StringBuilder ret = new StringBuilder();
		for (int i = common; i < fromSegments.size(); i++) {
			ret.append("../");
		}
		for (int i = common; i < toSegments.size(); i++) {
			ret.append(encode(toSegments.get(i))).append('/');
		}
		return ret.append("index.html").toString();
	}

	private static String encode(String segment) {
		return URLEncoder.encode(segment, StandardCharsets.UTF_8).replace("+", "%20");
	}

	/**
	 * Ids for URL path segments, by longest match at each level; null when nothing
	 * matches.
	 */
	List<String> resolve(List<String> urlSegments) {
		List<String> ids = new ArrayList<>();
		List<DocItem> level = roots();
		int position = 0;
		while (position < urlSegments.size()) {
			DocItem best = null;
			int bestLength = 0;
			for (DocItem item : level) {
				List<String> parts = segments(List.of(item.id()));
				if (parts.size() > bestLength && position + parts.size() <= urlSegments.size() && parts.equals(urlSegments.subList(position, position + parts.size()))) {
					best = item;
					bestLength = parts.size();
				}
			}
			if (best == null) {
				return null;
			}
			ids.add(best.id());
			position += bestLength;
			level = best.childItems();
		}
		return ids;
	}

	DocItem item(List<String> ids) {
		List<DocItem> level = roots();
		DocItem ret = null;
		for (String id : ids) {
			ret = level.stream().filter(item -> item.id().equals(id)).findFirst().orElse(null);
			if (ret == null) {
				return null;
			}
			level = ret.childItems();
		}
		return ret;
	}

	List<DocItem> children(List<String> ids) {
		if (ids.isEmpty()) {
			return roots();
		}
		DocItem item = item(ids);
		return item == null ? null : item.childItems();
	}

	/**
	 * Fails if two items would share a URL path, which is the one way ids with slashes
	 * could become ambiguous.
	 */
	void checkUrlPaths() {
		Map<String, List<String>> seen = new TreeMap<>();
		walk(List.of(), roots(), (ids, item) -> {
			if (urlPath(ids).startsWith(DocViewerTests.RESERVED_PREFIX.substring(0, DocViewerTests.RESERVED_PREFIX.length() - 1))) {
				throw new IllegalStateException("Item " + ids + " uses the viewer's reserved URL prefix " + DocViewerTests.RESERVED_PREFIX);
			}
			List<String> previous = seen.put(urlPath(ids), ids);
			if (previous != null) {
				throw new IllegalStateException("Items " + previous + " and " + ids + " share the URL path " + urlPath(ids));
			}
		});
	}

	interface Visitor {
		void visit(List<String> ids, DocItem item);
	}

	static void walk(List<String> parent, List<DocItem> items, Visitor visitor) {
		for (DocItem item : items) {
			List<String> ids = new ArrayList<>(parent);
			ids.add(item.id());
			visitor.visit(ids, item);
			walk(ids, item.childItems(), visitor);
		}
	}

	// --- JSON -----------------------------------------------------------------------

	/**
	 * The whole tree for a static site, Markdown referenced by URL relative to the site
	 * root.
	 */
	JSONArray navJson() {
		return navJson(List.of(), roots());
	}

	private static JSONArray navJson(List<String> parent, List<DocItem> items) {
		JSONArray ret = new JSONArray();
		for (DocItem item : items) {
			List<String> ids = new ArrayList<>(parent);
			ids.add(item.id());
			JSONObject json = itemJson(item);
			if (item.hasMarkdown()) {
				json.put("markdown", urlPath(ids) + "/index.md");
			}
			JSONArray children = navJson(ids, item.childItems());
			if (!children.isEmpty()) {
				json.put("children", children);
			}
			ret.put(json);
		}
		return ret;
	}

	/**
	 * One level for the server API: children are not included, only whether there are
	 * any, and Markdown is referenced through the API.
	 */
	static JSONArray levelJson(List<String> parent, List<DocItem> items, String apiPrefix) {
		JSONArray ret = new JSONArray();
		for (DocItem item : items) {
			List<String> ids = new ArrayList<>(parent);
			ids.add(item.id());
			JSONObject json = itemJson(item).put("hasChildren", !item.childItems().isEmpty());
			if (item.hasMarkdown()) {
				json.put("markdown", apiPrefix + "markdown?path=" + URLEncoder.encode(new JSONArray(ids).toString(), StandardCharsets.UTF_8));
			}
			ret.put(json);
		}
		return ret;
	}

	private static JSONObject itemJson(DocItem item) {
		JSONObject ret = new JSONObject().put("id", item.id()).put("label", item.label());
		if (item.icon() != null) {
			ret.put("icon", item.icon());
		}
		if (item.tooltip() != null) {
			ret.put("tooltip", item.tooltip());
		}
		return ret;
	}

	// --- Search ---------------------------------------------------------------------

	record SearchEntry(List<String> ids, DocItem item, List<String> breadcrumb, String text) {}

	private Supplier<List<SearchEntry>> index = memo(this::createIndex);

	List<SearchEntry> index() {
		return index.get();
	}

	private List<SearchEntry> createIndex() {
		List<SearchEntry> ret = new ArrayList<>();
		walkWithBreadcrumb(List.of(), List.of(), roots(), ret);
		return ret;
	}

	private void walkWithBreadcrumb(List<String> parent, List<String> breadcrumb, List<DocItem> items, List<SearchEntry> entries) {
		for (DocItem item : items) {
			List<String> ids = new ArrayList<>(parent);
			ids.add(item.id());
			if (item.hasMarkdown()) {
				entries.add(new SearchEntry(ids, item, breadcrumb, plainText(item.markdown().apply(ids))));
			}
			List<String> childBreadcrumb = new ArrayList<>(breadcrumb);
			childBreadcrumb.add(item.label());
			walkWithBreadcrumb(ids, childBreadcrumb, item.childItems(), entries);
		}
	}

	/**
	 * The static site's search index: what {@link #search(String)} searches, as JSON, for
	 * the same algorithm to run in the browser.
	 */
	JSONArray searchIndexJson() {
		JSONArray ret = new JSONArray();
		for (SearchEntry entry : index()) {
			ret.put(itemJson(entry.item())
					.put("ids", new JSONArray(entry.ids()))
					.put("breadcrumb", new JSONArray(entry.breadcrumb()))
					.put("text", entry.text()));
		}
		return ret;
	}

	/**
	 * Every term must appear in the label, tooltip or text; label matches rank first,
	 * an exact label match highest. The browser's static search is the same algorithm.
	 */
	JSONArray search(String query) {
		String normalized = query.toLowerCase(Locale.ROOT).strip();
		List<String> terms = List.of(normalized.split("\\s+")).stream().filter(term -> !term.isEmpty()).toList();
		List<JSONObject> results = new ArrayList<>();
		if (!terms.isEmpty()) {
			for (SearchEntry entry : index()) {
				String label = entry.item().label().toLowerCase(Locale.ROOT);
				String haystack = label + " " + Optional.ofNullable(entry.item().tooltip()).orElse("").toLowerCase(Locale.ROOT) + " " + entry.text().toLowerCase(Locale.ROOT);
				if (terms.stream().allMatch(haystack::contains)) {
					int score = terms.stream().allMatch(label::contains) ? (label.equals(normalized) ? 3 : 2) : 1;
					results.add(itemJson(entry.item())
							.put("ids", new JSONArray(entry.ids()))
							.put("breadcrumb", new JSONArray(entry.breadcrumb()))
							.put("excerpt", excerpt(entry.text(), terms.get(0)))
							.put("score", score));
				}
			}
		}
		results.sort(Comparator.<JSONObject>comparingInt(result -> -result.getInt("score")).thenComparing(result -> result.getString("label")));
		JSONArray ret = new JSONArray();
		results.stream().limit(100).forEach(result -> {
			result.remove("score");
			ret.put(result);
		});
		return ret;
	}

	static String excerpt(String text, String term) {
		int index = text.toLowerCase(Locale.ROOT).indexOf(term);
		if (index < 0) {
			return text.length() > 160 ? text.substring(0, 160) + "…" : text;
		}
		int start = Math.max(0, index - 60);
		int end = Math.min(text.length(), index + term.length() + 100);
		return (start > 0 ? "…" : "") + text.substring(start, end) + (end < text.length() ? "…" : "");
	}

	/**
	 * Markdown reduced to searchable text: links to their text, formatting characters
	 * and table rules removed, whitespace collapsed.
	 */
	static String plainText(String markdown) {
		String text = markdown
				.replaceAll("\\[([^\\]]*)\\]\\([^)]*\\)", "$1")
				.replaceAll("(?m)^\\|?\\s*-{3,}.*$", " ")
				.replaceAll("[`*_#>|]", " ")
				.replaceAll("\\s+", " ")
				.strip();
		return text.length() > 4000 ? text.substring(0, 4000) : text;
	}

	// --- Utilities ------------------------------------------------------------------

	static <T> Supplier<T> memo(Supplier<T> supplier) {
		return new Supplier<>() {

			private volatile T value;

			@Override
			public T get() {
				T result = value;
				if (result == null) {
					synchronized (this) {
						result = value;
						if (result == null) {
							value = result = supplier.get();
						}
					}
				}
				return result;
			}

		};
	}

}
