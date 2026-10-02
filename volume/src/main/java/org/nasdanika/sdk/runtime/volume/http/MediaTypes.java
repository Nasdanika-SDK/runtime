package org.nasdanika.sdk.runtime.volume.http;

import java.util.Locale;
import java.util.Map;

/**
 * Media types by file extension, for the types a volume is likely to serve. Text types are UTF-8.
 */
public final class MediaTypes {

	public static final String DEFAULT = "application/octet-stream";

	private static final Map<String, String> BY_EXTENSION = Map.ofEntries(
			Map.entry("html", "text/html; charset=utf-8"),
			Map.entry("htm", "text/html; charset=utf-8"),
			Map.entry("md", "text/markdown; charset=utf-8"),
			Map.entry("txt", "text/plain; charset=utf-8"),
			Map.entry("css", "text/css; charset=utf-8"),
			Map.entry("csv", "text/csv; charset=utf-8"),
			Map.entry("js", "text/javascript; charset=utf-8"),
			Map.entry("mjs", "text/javascript; charset=utf-8"),
			Map.entry("json", "application/json"),
			Map.entry("xml", "application/xml"),
			Map.entry("xmi", "application/xml"),
			Map.entry("yaml", "application/yaml"),
			Map.entry("yml", "application/yaml"),
			Map.entry("svg", "image/svg+xml"),
			Map.entry("png", "image/png"),
			Map.entry("jpg", "image/jpeg"),
			Map.entry("jpeg", "image/jpeg"),
			Map.entry("gif", "image/gif"),
			Map.entry("webp", "image/webp"),
			Map.entry("ico", "image/x-icon"),
			Map.entry("pdf", "application/pdf"),
			Map.entry("zip", "application/zip"),
			Map.entry("jar", "application/java-archive"),
			Map.entry("wasm", "application/wasm"));

	private MediaTypes() {}

	/**
	 * @return The media type for the path's extension, or {@link #DEFAULT}
	 */
	public static String of(String path) {
		int slash = path.lastIndexOf('/');
		int dot = path.lastIndexOf('.');
		if (dot <= slash + 1) {
			return DEFAULT;
		}
		return BY_EXTENSION.getOrDefault(path.substring(dot + 1).toLowerCase(Locale.ROOT), DEFAULT);
	}

}
