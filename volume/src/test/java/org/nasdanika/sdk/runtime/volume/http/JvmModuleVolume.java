package org.nasdanika.sdk.runtime.volume.http;

import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.nasdanika.sdk.runtime.volume.Content;
import org.nasdanika.sdk.runtime.volume.Volume;

/**
 * A read-only volume over the modules of a module layer, one file per module, grouped into
 * directories by name segments as a Maven repository groups artifacts: {@code java.base} is
 * {@code java/base.html}, {@code org.nasdanika.sdk.runtime.volume} is
 * {@code org/nasdanika/sdk/runtime/volume.html}. A module and a package-like prefix of other modules
 * can share a name ({@code runtime.html} next to {@code runtime/}) because the file has an extension.
 *
 * <p>
 * The {@link Renderer} is the surface: HTML for browsers, Markdown for agents reading a mounted
 * WebDAV share. Pages are rendered on first use and kept, so that sizes and hashes are known, which
 * WebDAV clients need. The layer does not change.
 */
public class JvmModuleVolume implements Volume {

	/**
	 * Renders a module as a file.
	 */
	public interface Renderer {

		/**
		 * Without the dot.
		 */
		String extension();

		/**
		 * @param link The relative link from this module's file to another module's file, or null if
		 * the other module is not in the layer
		 */
		String render(Module module, java.util.function.Function<String, String> link);

	}

	private final Map<String, Module> files = new TreeMap<>(); // path to module
	private final Map<String, String> paths = new TreeMap<>(); // module name to path
	private final Set<String> directories = new TreeSet<>();
	private final Map<String, byte[]> rendered = new ConcurrentHashMap<>();
	private final Renderer renderer;
	private final Instant modified = ProcessHandle.current().info().startInstant().orElse(Instant.now());

	public JvmModuleVolume(ModuleLayer layer, Renderer renderer) {
		this.renderer = renderer;
		directories.add(".");
		for (Module module: layer.modules()) {
			String[] segments = module.getName().split("\\.");
			StringBuilder directory = new StringBuilder();
			for (int i = 0; i < segments.length - 1; ++i) {
				if (i > 0) {
					directory.append('/');
				}
				directory.append(segments[i]);
				directories.add(directory.toString());
			}
			String path = String.join("/", segments) + "." + renderer.extension();
			files.put(path, module);
			paths.put(module.getName(), path);
		}
	}

	@Override
	public Optional<Entry> stat(String path) {
		if (directories.contains(path)) {
			return Optional.of(new Entry(path, Entry.Kind.DIRECTORY, -1, null, modified));
		}
		byte[] bytes = bytes(path);
		if (bytes == null) {
			return Optional.empty();
		}
		return Optional.of(new Entry(path, Entry.Kind.FILE, bytes.length, hash(bytes), modified));
	}

	@Override
	public List<Entry> list(String directory) throws IOException {
		if (!directories.contains(directory)) {
			throw new NoSuchFileException(directory);
		}
		String prefix = ".".equals(directory) ? "" : directory + "/";
		List<Entry> children = new ArrayList<>();
		for (String candidate: concat(directories, files.keySet())) {
			if (!".".equals(candidate) && candidate.startsWith(prefix) && candidate.indexOf('/', prefix.length()) == -1) {
				stat(candidate).ifPresent(children::add);
			}
		}
		return children;
	}

	@Override
	public Content content(String path) {
		byte[] bytes = bytes(path);
		return bytes == null ? () -> { throw new NoSuchFileException(path); } : Content.of(bytes);
	}

	@Override
	public boolean caseSensitive() {
		return true;
	}

	@Override
	public <T> Optional<T> capability(Class<T> type) {
		return Optional.empty();
	}

	private byte[] bytes(String path) {
		Module module = files.get(path);
		if (module == null) {
			return null;
		}
		return rendered.computeIfAbsent(path, p -> renderer.render(module, name -> relative(p, paths.get(name))).getBytes(StandardCharsets.UTF_8));
	}

	/**
	 * The link from one file to another, relative to the first file's directory.
	 */
	static String relative(String from, String to) {
		if (to == null) {
			return null;
		}
		String[] fromSegments = from.split("/");
		String[] toSegments = to.split("/");
		int common = 0; // directories shared by both paths
		while (common < fromSegments.length - 1 && common < toSegments.length - 1 && fromSegments[common].equals(toSegments[common])) {
			++common;
		}
		StringBuilder link = new StringBuilder("../".repeat(fromSegments.length - 1 - common));
		for (int i = common; i < toSegments.length; ++i) {
			link.append(toSegments[i]);
			if (i < toSegments.length - 1) {
				link.append('/');
			}
		}
		return link.toString();
	}

	private static String hash(byte[] bytes) {
		try {
			return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-1").digest(bytes));
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException(e);
		}
	}

	private static List<String> concat(Collection<String> a, Collection<String> b) {
		List<String> all = new ArrayList<>(a);
		all.addAll(b);
		return all;
	}

	// --- Surfaces ---

	private static String requires(ModuleDescriptor.Requires requires) {
		String modifiers = requires.modifiers().stream()
				.filter(m -> m != ModuleDescriptor.Requires.Modifier.MANDATED)
				.map(m -> m.name().toLowerCase())
				.collect(Collectors.joining(" "));
		return modifiers.isEmpty() ? "" : " (" + modifiers + ")";
	}

	private static String kind(ModuleDescriptor descriptor) {
		return descriptor.isAutomatic() ? "automatic module" : descriptor.isOpen() ? "open module" : "module";
	}

	/**
	 * HTML pages for browsers.
	 */
	public static final Renderer HTML = new Renderer() {

		@Override
		public String extension() {
			return "html";
		}

		@Override
		public String render(Module module, java.util.function.Function<String, String> link) {
			ModuleDescriptor descriptor = module.getDescriptor();
			StringBuilder html = new StringBuilder("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"utf-8\">\n<title>")
					.append(module.getName())
					.append("</title>\n</head>\n<body>\n<h1>")
					.append(module.getName())
					.append("</h1>\n<p>")
					.append(kind(descriptor));
			descriptor.rawVersion().ifPresent(v -> html.append(", version ").append(VolumeHttpHandler.escape(v)));
			html.append(", ").append(descriptor.packages().size()).append(" packages</p>\n");

			html.append("<h2>Requires</h2>\n<ul>\n");
			for (ModuleDescriptor.Requires requires: new TreeSet<>(descriptor.requires())) {
				html.append("<li>").append(anchor(requires.name(), link)).append(requires(requires)).append("</li>\n");
			}
			html.append("</ul>\n<h2>Exports</h2>\n<ul>\n");
			for (ModuleDescriptor.Exports exports: new TreeSet<>(descriptor.exports())) {
				html.append("<li><code>").append(exports.source()).append("</code>");
				if (exports.isQualified()) {
					html.append(" to ").append(new TreeSet<>(exports.targets()).stream().map(t -> anchor(t, link)).collect(Collectors.joining(", ")));
				}
				html.append("</li>\n");
			}
			html.append("</ul>\n");
			if (!descriptor.uses().isEmpty()) {
				html.append("<h2>Uses</h2>\n<ul>\n");
				new TreeSet<>(descriptor.uses()).forEach(u -> html.append("<li><code>").append(u).append("</code></li>\n"));
				html.append("</ul>\n");
			}
			if (!descriptor.provides().isEmpty()) {
				html.append("<h2>Provides</h2>\n<ul>\n");
				for (ModuleDescriptor.Provides provides: new TreeSet<>(descriptor.provides())) {
					html.append("<li><code>").append(provides.service()).append("</code> with ")
							.append(provides.providers().stream().map(p -> "<code>" + p + "</code>").collect(Collectors.joining(", ")))
							.append("</li>\n");
				}
				html.append("</ul>\n");
			}
			return html.append("</body>\n</html>\n").toString();
		}

		private static String anchor(String moduleName, java.util.function.Function<String, String> link) {
			String href = link.apply(moduleName);
			return href == null ? moduleName : "<a href=\"" + VolumeHttpHandler.escape(href) + "\">" + moduleName + "</a>";
		}

	};

	/**
	 * Markdown for agents: the same information, with relative links an agent can follow on a
	 * mounted share.
	 */
	public static final Renderer MARKDOWN = new Renderer() {

		@Override
		public String extension() {
			return "md";
		}

		@Override
		public String render(Module module, java.util.function.Function<String, String> link) {
			ModuleDescriptor descriptor = module.getDescriptor();
			StringBuilder md = new StringBuilder("# ").append(module.getName()).append("\n\n");
			md.append("A Java ").append(kind(descriptor));
			descriptor.rawVersion().ifPresent(v -> md.append(", version ").append(v));
			md.append(", with ").append(descriptor.packages().size()).append(" packages.\n\n");

			md.append("## Requires\n\n");
			for (ModuleDescriptor.Requires requires: new TreeSet<>(descriptor.requires())) {
				md.append("* ").append(link(requires.name(), link)).append(requires(requires)).append('\n');
			}
			md.append("\n## Exports\n\n");
			if (descriptor.exports().isEmpty()) {
				md.append("None.\n");
			}
			for (ModuleDescriptor.Exports exports: new TreeSet<>(descriptor.exports())) {
				md.append("* `").append(exports.source()).append('`');
				if (exports.isQualified()) {
					md.append(" to ").append(new TreeSet<>(exports.targets()).stream().map(t -> link(t, link)).collect(Collectors.joining(", ")));
				}
				md.append('\n');
			}
			if (!descriptor.uses().isEmpty()) {
				md.append("\n## Uses\n\n");
				new TreeSet<>(descriptor.uses()).forEach(u -> md.append("* `").append(u).append("`\n"));
			}
			if (!descriptor.provides().isEmpty()) {
				md.append("\n## Provides\n\n");
				for (ModuleDescriptor.Provides provides: new TreeSet<>(descriptor.provides())) {
					md.append("* `").append(provides.service()).append("` with ")
							.append(provides.providers().stream().map(p -> "`" + p + "`").collect(Collectors.joining(", ")))
							.append('\n');
				}
			}
			return md.toString();
		}

		private static String link(String moduleName, java.util.function.Function<String, String> link) {
			String href = link.apply(moduleName);
			return href == null ? "`" + moduleName + "`" : "[" + moduleName + "](" + href + ")";
		}

	};

}
