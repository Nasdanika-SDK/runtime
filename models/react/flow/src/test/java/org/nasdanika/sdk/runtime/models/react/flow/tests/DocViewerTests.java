package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.FACTORY;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.binding;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.defaultBinding;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.demoPause;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.function;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.get;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.method;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.methodNotAllowed;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.namedImport;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.notFound;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.path;
import static org.nasdanika.sdk.runtime.models.react.flow.tests.WebTestSupport.send;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.react.tests.DocViewerTests;
import org.nasdanika.sdk.runtime.models.react.tests.ModuleDocs;
import org.nasdanika.sdk.runtime.models.react.tests.ModuleGraph;
import org.nasdanika.sdk.runtime.models.react.tests.WebTestSupport;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

/**
 * A homogeneous documentation viewer: a navigation tree on the left, Markdown content
 * on the right, search, Bootswatch themes. One browser module serves both delivery
 * modes.
 * <p>
 * <b>Data.</b> A tree of items: an id unique within the parent (slashes allowed), a
 * label, an optional icon (a Bootstrap Icons class or an image URL), an optional tooltip,
 * and an optional Markdown URL. An item without Markdown is a group: clicking it
 * toggles it. An item with Markdown opens in the content panel.
 * <p>
 * <b>URLs.</b> An item's URL is its path of ids plus <code>index.html</code>, as on
 * the existing Nasdanika sites, e.g.
 * <code>modules/jdk/java.base/packages/java.lang/index.html</code>, where
 * <code>modules/jdk</code> is one id. Navigation uses the History API, so the address
 * bar always holds a shareable deep link, and the URL is mapped back to ids by longest
 * match at each level.
 * <p>
 * <b>Static site.</b> The whole tree is one JSON file; each item with Markdown gets an
 * <code>index.md</code> and a small HTML shell at its URL, whose
 * <code>&lt;base&gt;</code> points at the site root. Any static host serves deep links,
 * and the site works from any base path. Search runs in the browser over a generated
 * index.
 * <p>
 * <b>Server.</b> Items are served one level at a time as the reader opens them, so the
 * tree can be huge; Markdown, URL resolution and search are server calls; every page
 * path gets the same shell.
 * <p>
 * Expanded items are remembered in local storage per site, and the theme across sites.
 * Set <code>-Dnasdanika.react.demo.seconds=300</code> to keep the server running.
 */
public class DocViewerTests {

	private static final String MODULE_PATH = "_nsd/docs.js";

	private static final String NAV_PATH = "_nsd/nav.json";

	private static final String SEARCH_INDEX_PATH = "_nsd/search.json";

	private static final String TITLE = "JVM Modules";

	/**
	 * The viewer's own files and API live under this prefix, which item ids must not
	 * start with. Without it, a tree whose top level has an id like "modules" or "api"
	 * would collide with them.
	 */
	static final String RESERVED_PREFIX = "_nsd/";

	private static final String API_PREFIX = RESERVED_PREFIX + "api/";

	static final String BOOTSWATCH_VERSION = "5.3.8";

	static final String DEFAULT_THEME = "zephyr";

	private static final String BOOTSTRAP_ICONS_CSS = "https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css";

	private static final Map<String, String> IMPORT_MAP = new LinkedHashMap<>();

	static {
		WebTestSupport.putReact(IMPORT_MAP);
		IMPORT_MAP.put("marked", "https://esm.sh/marked@18.0.14");
		IMPORT_MAP.put("dompurify", "https://esm.sh/dompurify@3.4.16");
	}

	// --- Component source --------------------------------------------------------

	private static final String THEMES_INITIALIZER = """
			[
			  { name: "zephyr", label: "Zephyr (default)" },
			  { name: "cosmo", label: "Cosmo" },
			  { name: "flatly", label: "Flatly" },
			  { name: "yeti", label: "Yeti" },
			  { name: "litera", label: "Litera" },
			  { name: "lumen", label: "Lumen" },
			  { name: "sandstone", label: "Sandstone" },
			  { name: "spacelab", label: "Spacelab" },
			  { name: "darkly", label: "Darkly (dark)" },
			  { name: "slate", label: "Slate (dark)" }
			]""";

	private static final String VIEWER_BODY = """
			const root = useMemo(() => new URL(document.baseURI), []);
			const source = useMemo(() => props.apiUrl
			  ? remoteSource(new URL(props.apiUrl, root).href)
			  : staticSource(new URL(props.navUrl, root).href, new URL(props.searchUrl, root).href), [root, props.apiUrl, props.navUrl, props.searchUrl]);
			const storageKey = "nsd-docs:" + root.pathname + ":expanded";

			const [info, setInfo] = useState(null);
			const [children, setChildren] = useState({});
			const [expanded, setExpanded] = useState(() => new Set(loadJson(storageKey, [])));
			const [current, setCurrent] = useState(null);
			const [content, setContent] = useState(null);
			const [query, setQuery] = useState(() => new URL(window.location.href).searchParams.get("q") || "");
			const [results, setResults] = useState(null);
			const [error, setError] = useState(null);
			const [theme, setTheme] = useState(currentTheme());
			const contentRef = useRef(null);
			const pending = useRef(new Map());
			const locateRef = useRef(null);

			// Children of the item at ids ([] for the top level), loaded once.
			const ensureChildren = ids => {
			  const key = JSON.stringify(ids);
			  if (!pending.current.has(key)) {
			    pending.current.set(key, source.children(ids).then(items => {
			      setChildren(previous => ({ ...previous, [key]: items || [] }));
			      return items;
			    }));
			  }
			  return pending.current.get(key);
			};

			// Maps the browser URL to what to show, loading and expanding the path to it.
			const locate = () => {
			  const location = parseLocation(root);
			  if (location.search !== null) {
			    setCurrent({ search: location.search });
			    return;
			  }
			  if (!location.segments.length) {
			    setCurrent({ home: true });
			    return;
			  }
			  source.resolve(location.segments)
			    .then(ids => {
			      if (!ids) {
			        setCurrent({ notFound: location.segments.join("/") });
			        return undefined;
			      }
			      return Promise.all(ids.map((id, i) => ensureChildren(ids.slice(0, i)))).then(() => {
			        setExpanded(previous => {
			          const next = new Set(previous);
			          for (let i = 1; i < ids.length; i++) {
			            next.add(JSON.stringify(ids.slice(0, i)));
			          }
			          return next;
			        });
			        setCurrent({ ids });
			      });
			    })
			    .catch(setError);
			};
			locateRef.current = locate;

			const navigate = href => {
			  window.history.pushState(null, "", href);
			  locate();
			};

			useEffect(() => {
			  source.info().then(setInfo).catch(setError);
			  ensureChildren([]).catch(setError);
			  expanded.forEach(key => ensureChildren(JSON.parse(key)).catch(() => undefined));
			  locateRef.current();
			  const onPopState = () => locateRef.current();
			  window.addEventListener("popstate", onPopState);
			  return () => window.removeEventListener("popstate", onPopState);
			}, [source]);

			useEffect(() => saveJson(storageKey, [...expanded]), [expanded]);

			const itemAt = ids => (children[JSON.stringify(ids.slice(0, -1))] || []).find(item => item.id === ids[ids.length - 1]);

			// Content for the current location.
			useEffect(() => {
			  if (!current) {
			    return undefined;
			  }
			  let cancelled = false;
			  // Links and images in Markdown are relative to the item's page, not to the <base>.
			  const show = (markdownUrl, pageUrl) => fetchText(new URL(markdownUrl, root).href)
			    .then(text => !cancelled && setContent({ current, html: rebase(DOMPurify.sanitize(marked.parse(text)), pageUrl) }))
			    .catch(e => !cancelled && setContent({ current, error: String(e) }));
			  setContent(null);
			  if (current.home) {
			    if (info && info.home) {
			      show(info.home, root.href);
			    }
			  } else if (current.search !== undefined) {
			    source.search(current.search)
			      .then(found => !cancelled && setContent({ current, results: found, query: current.search }))
			      .catch(e => !cancelled && setContent({ current, error: String(e) }));
			  } else if (current.notFound) {
			    setContent({ current, error: "Nothing here: " + current.notFound });
			  } else {
			    const item = itemAt(current.ids);
			    if (item && item.markdown) {
			      show(item.markdown, itemUrl(root, current.ids));
			    } else {
			      setContent({ current, html: "" });
			    }
			  }
			  return () => { cancelled = true; };
			}, [current, info]);

			// Rendered Markdown: Bootstrap table classes, scroll to top, selected tree row into view.
			useEffect(() => {
			  const element = contentRef.current;
			  if (element) {
			    element.querySelectorAll("table").forEach(table => table.classList.add("table", "table-sm", "table-striped", "table-hover"));
			    element.scrollTop = 0;
			  }
			  const row = document.querySelector("li[aria-selected=true] > .nsd-tree-row");
			  if (row) {
			    row.scrollIntoView({ block: "nearest" });
			  }
			}, [content]);

			useEffect(() => {
			  const title = current && current.ids ? (itemAt(current.ids) || {}).label : current && current.search !== undefined ? "Search" : null;
			  document.title = (title ? title + " - " : "") + (info ? info.title : "");
			}, [current, info, children]);

			// Search in the navigation panel, debounced.
			useEffect(() => {
			  if (!query.trim()) {
			    setResults(null);
			    return undefined;
			  }
			  let cancelled = false;
			  const timer = setTimeout(() => source.search(query).then(found => !cancelled && setResults(found)).catch(setError), 250);
			  return () => { cancelled = true; clearTimeout(timer); };
			}, [query, source]);

			const toggle = ids => {
			  const key = JSON.stringify(ids);
			  if (!expanded.has(key)) {
			    ensureChildren(ids).catch(setError);
			  }
			  setExpanded(previous => {
			    const next = new Set(previous);
			    if (next.has(key)) {
			      next.delete(key);
			    } else {
			      next.add(key);
			    }
			    return next;
			  });
			};

			const plainClick = event => event.button === 0 && !event.metaKey && !event.ctrlKey && !event.shiftKey && !event.altKey;

			const onRowClick = (event, item, ids) => {
			  if (item.markdown) {
			    if (!plainClick(event)) {
			      return;
			    }
			    event.preventDefault();
			    navigate(itemUrl(root, ids));
			    if (item.hasChildren && !expanded.has(JSON.stringify(ids))) {
			      toggle(ids);
			    }
			  } else if (item.hasChildren) {
			    toggle(ids);
			  }
			};

			// Links inside the content that stay within the site navigate without a reload.
			const onContentClick = event => {
			  const anchor = event.target.closest && event.target.closest("a");
			  if (!anchor || anchor.target || !plainClick(event)) {
			    return;
			  }
			  const url = new URL(anchor.href, window.location.href);
			  if (url.origin === root.origin && url.pathname.startsWith(root.pathname) && (url.pathname.endsWith("/") || url.pathname.endsWith(".html"))) {
			    event.preventDefault();
			    navigate(url.href);
			  }
			};

			const renderLevel = parentIds => {
			  const items = children[JSON.stringify(parentIds)];
			  if (!items) {
			    return h("div", { className: "small text-body-secondary ps-4" }, "Loading...");
			  }
			  return h("ul", { role: parentIds.length ? "group" : "tree", className: "nsd-tree", "aria-label": parentIds.length ? undefined : "Navigation" },
			    items.map(item => {
			      const ids = [...parentIds, item.id];
			      const key = JSON.stringify(ids);
			      const open = expanded.has(key);
			      const selected = !!(current && current.ids && JSON.stringify(current.ids) === key);
			      return h("li", { key: item.id, role: "treeitem", "aria-expanded": item.hasChildren ? open : undefined, "aria-selected": selected },
			        h("div", { className: "nsd-tree-row", title: item.tooltip || undefined, onClick: event => onRowClick(event, item, ids) },
			          h("span", {
			            className: "nsd-toggle",
			            onClick: event => {
			              if (item.hasChildren) {
			                event.stopPropagation();
			                event.preventDefault();
			                toggle(ids);
			              }
			            }
			          }, item.hasChildren ? h("i", { className: open ? "bi bi-chevron-down" : "bi bi-chevron-right" }) : null),
			          icon(item.icon, root),
			          item.markdown
			            ? h("a", { href: itemUrl(root, ids), className: "nsd-tree-link" }, item.label)
			            : h("span", { className: "nsd-tree-group" }, item.label)),
			        item.hasChildren && open ? renderLevel(ids) : null);
			    }));
			};

			const resultLink = (result, className, body) => {
			  const href = itemUrl(root, result.ids);
			  return h("a", { key: JSON.stringify(result.ids), href, className, onClick: event => { if (plainClick(event)) { event.preventDefault(); navigate(href); } } }, body);
			};

			const breadcrumb = () => {
			  if (!current || !current.ids) {
			    return null;
			  }
			  const crumbs = current.ids.slice(0, -1).map((id, i) => {
			    const ids = current.ids.slice(0, i + 1);
			    const item = itemAt(ids) || { label: id };
			    return item.markdown
			      ? h(Breadcrumb.Item, { key: i, href: itemUrl(root, ids), onClick: event => { if (plainClick(event)) { event.preventDefault(); navigate(itemUrl(root, ids)); } } }, item.label)
			      : h(Breadcrumb.Item, { key: i, active: true }, item.label);
			  });
			  return h(Breadcrumb, { className: "small" }, crumbs);
			};

			// Content counts only for the location it was produced for; anything else is stale.
			const shown = content && content.current === current ? content : null;

			const main = () => {
			  if (error) {
			    return h(Alert, { variant: "danger" }, String(error));
			  }
			  if (!current || (!shown && !(current.home && info && !info.home))) {
			    return h(Spinner, { animation: "border", role: "status", size: "sm" });
			  }
			  if (shown && shown.error) {
			    return h(Alert, { variant: "warning" }, shown.error);
			  }
			  if (current.home) {
			    return h("div", null,
			      h("h1", { className: "h2" }, info ? info.title : ""),
			      shown ? h("div", { className: "nsd-markdown", dangerouslySetInnerHTML: { __html: shown.html } }) : null);
			  }
			  if (shown && shown.results) {
			    return h("div", { id: "nsd-search-page" },
			      h("h1", { className: "h2" }, "Search"),
			      h("p", { className: "text-body-secondary" }, shown.results.length + (shown.results.length === 1 ? " result" : " results") + " for \\u201c" + shown.query + "\\u201d"),
			      h("div", { className: "list-group" }, shown.results.map(result => resultLink(result, "list-group-item list-group-item-action", [
			        h("div", { key: "t", className: "fw-semibold" }, icon(result.icon, root), result.label),
			        h("div", { key: "b", className: "small text-body-secondary" }, (result.breadcrumb || []).join(" / ")),
			        result.excerpt ? h("div", { key: "e", className: "small" }, result.excerpt) : null
			      ]))));
			  }
			  const item = itemAt(current.ids) || {};
			  return h("div", null,
			    breadcrumb(),
			    h("h1", { className: "h2 d-flex align-items-center gap-2" }, icon(item.icon, root), item.label),
			    item.tooltip ? h("p", { className: "text-body-secondary" }, item.tooltip) : null,
			    shown ? h("div", { className: "nsd-markdown", dangerouslySetInnerHTML: { __html: shown.html } }) : null);
			};

			return h("div", { className: "nsd-app" },
			  h(Navbar, { bg: "primary", "data-bs-theme": "dark", className: "px-3 nsd-navbar", expand: true },
			    h(Navbar.Brand, { href: root.href, onClick: event => { if (plainClick(event)) { event.preventDefault(); navigate(root.href); } } }, info ? info.title : ""),
			    h("div", { className: "ms-auto d-flex align-items-center gap-2" },
			      h("i", { className: "bi bi-palette text-white", "aria-hidden": true }),
			      h(Form.Select, {
			        size: "sm",
			        id: "nsd-theme-select",
			        "aria-label": "Theme",
			        style: { width: "auto" },
			        value: theme || DEFAULT_THEME,
			        onChange: event => { applyTheme(event.target.value); setTheme(event.target.value); }
			      }, THEMES.map(option => h("option", { key: option.name, value: option.name }, option.label))))),
			  h("div", { className: "nsd-body" },
			    h("nav", { className: "nsd-nav p-2", "aria-label": "Site" },
			      h(Form, { role: "search", className: "mb-2", onSubmit: event => { event.preventDefault(); if (query.trim()) { navigate(new URL("search.html?q=" + encodeURIComponent(query.trim()), root).href); } } },
			        h(InputGroup, { size: "sm" },
			          h(Form.Control, { type: "search", placeholder: "Search", "aria-label": "Search", value: query, onChange: event => setQuery(event.target.value) }),
			          h(Button, { variant: "outline-secondary", type: "submit", title: "Search page", disabled: !query.trim() }, h("i", { className: "bi bi-search" })))),
			      results
			        ? h("div", { className: "list-group list-group-flush small", id: "nsd-nav-results" },
			            results.length ? results.slice(0, 50).map(result => resultLink(result, "list-group-item list-group-item-action px-2 py-1", [
			              h("div", { key: "t" }, icon(result.icon, root), result.label),
			              h("div", { key: "b", className: "text-body-secondary" }, (result.breadcrumb || []).join(" / "))
			            ])) : h("div", { className: "text-body-secondary p-2" }, "No matches."))
			        : renderLevel([])),
			    h("main", { className: "nsd-content p-4", ref: contentRef, onClick: onContentClick }, main())));
			""";

	private static final String STATIC_SOURCE_BODY = """
			let nav = null;
			let index = null;
			const loadNav = () => nav || (nav = fetchJson(navUrl));
			return {
			  info: () => loadNav().then(site => ({ title: site.title, home: site.home })),
			  children: ids => loadNav().then(site => {
			    let level = site.items;
			    for (const id of ids) {
			      const item = level.find(candidate => candidate.id === id);
			      level = item && item.children ? item.children : [];
			    }
			    return level.map(({ children, ...item }) => ({ ...item, hasChildren: !!(children && children.length) }));
			  }),
			  resolve: segments => loadNav().then(site => resolveIds(site.items, segments)),
			  search: query => (index || (index = fetchJson(searchUrl))).then(entries => searchEntries(entries, query))
			};
			""";

	private static final String REMOTE_SOURCE_BODY = """
			return {
			  info: () => fetchJson(apiUrl + "info"),
			  children: ids => fetchJson(apiUrl + "children?path=" + encodeURIComponent(JSON.stringify(ids))),
			  resolve: segments => fetchJson(apiUrl + "resolve?path=" + encodeURIComponent(segments.join("/"))).then(result => result.ids),
			  search: query => fetchJson(apiUrl + "search?q=" + encodeURIComponent(query))
			};
			""";

	private static final String RESOLVE_IDS_BODY = """
			const ids = [];
			let level = items;
			let position = 0;
			while (position < segments.length) {
			  let best = null;
			  let bestLength = 0;
			  for (const item of level) {
			    const parts = item.id.split("/").filter(part => part);
			    if (parts.length > bestLength && parts.every((part, i) => segments[position + i] === part)) {
			      best = item;
			      bestLength = parts.length;
			    }
			  }
			  if (!best) {
			    return null;
			  }
			  ids.push(best.id);
			  position += bestLength;
			  level = best.children || [];
			}
			return ids;
			""";

	private static final String SEARCH_ENTRIES_BODY = """
			const normalized = query.toLowerCase().trim();
			const terms = normalized.split(/\\s+/).filter(term => term);
			if (!terms.length) {
			  return [];
			}
			const found = [];
			for (const entry of entries) {
			  const label = entry.label.toLowerCase();
			  const haystack = label + " " + (entry.tooltip || "").toLowerCase() + " " + (entry.text || "").toLowerCase();
			  if (terms.every(term => haystack.includes(term))) {
			    const { text, ...result } = entry;
			    found.push({
			      ...result,
			      excerpt: excerpt(text || "", terms[0]),
			      score: terms.every(term => label.includes(term)) ? (label === normalized ? 3 : 2) : 1
			    });
			  }
			}
			found.sort((a, b) => b.score - a.score || (a.label < b.label ? -1 : a.label > b.label ? 1 : 0));
			return found.slice(0, 100);
			""";

	private static final String EXCERPT_BODY = """
			const index = text.toLowerCase().indexOf(term);
			if (index < 0) {
			  return text.length > 160 ? text.slice(0, 160) + "\\u2026" : text;
			}
			const start = Math.max(0, index - 60);
			const end = Math.min(text.length, index + term.length + 100);
			return (start > 0 ? "\\u2026" : "") + text.slice(start, end) + (end < text.length ? "\\u2026" : "");
			""";

	private static final String PARSE_LOCATION_BODY = """
			const url = new URL(window.location.href);
			let path = url.pathname.startsWith(root.pathname) ? url.pathname.slice(root.pathname.length) : "";
			if (path === "search.html") {
			  return { search: url.searchParams.get("q") || "", segments: [] };
			}
			if (path.endsWith("index.html")) {
			  path = path.slice(0, -"index.html".length);
			}
			return { search: null, segments: path.split("/").filter(segment => segment).map(decodeURIComponent) };
			""";

	private static final String REBASE_BODY = """
			const template = document.createElement("template");
			template.innerHTML = html;
			const fix = (element, attribute) => {
			  const value = element.getAttribute(attribute);
			  if (value === null || /^([a-z][a-z0-9+.-]*:|\\/)/i.test(value)) {
			    return;
			  }
			  element.setAttribute(attribute, value.startsWith("#") ? pageUrl.split("#")[0] + value : new URL(value, pageUrl).href);
			};
			template.content.querySelectorAll("a[href]").forEach(element => fix(element, "href"));
			template.content.querySelectorAll("img[src]").forEach(element => fix(element, "src"));
			return template.innerHTML;
			""";

	private static final String ITEM_URL_BODY = """
			return new URL(ids.flatMap(id => id.split("/").filter(part => part)).map(encodeURIComponent).join("/") + "/index.html", root).href;
			""";

	private static final String ICON_BODY = """
			if (!value) {
			  return h("span", { className: "nsd-icon" });
			}
			if (value.includes("/") || value.includes(".")) {
			  return h("img", { className: "nsd-icon", src: new URL(value, root).href, alt: "" });
			}
			return h("i", { className: "nsd-icon bi " + value, "aria-hidden": true });
			""";

	private static final String FETCH_JSON_BODY = """
			return fetch(url).then(response => {
			  if (!response.ok) {
			    throw new Error(response.status + " " + response.statusText + ": " + url);
			  }
			  return response.json();
			});
			""";

	private static final String FETCH_TEXT_BODY = """
			return fetch(url).then(response => {
			  if (!response.ok) {
			    throw new Error(response.status + " " + response.statusText + ": " + url);
			  }
			  return response.text();
			});
			""";

	private static final String LOAD_JSON_BODY = """
			try {
			  const value = window.localStorage.getItem(key);
			  return value ? JSON.parse(value) : defaultValue;
			} catch (error) {
			  return defaultValue;
			}
			""";

	private static final String SAVE_JSON_BODY = """
			try {
			  window.localStorage.setItem(key, JSON.stringify(value));
			} catch (error) {
			  // Storage full or unavailable: the tree simply is not remembered.
			}
			""";

	private static final String CURRENT_THEME_BODY = """
			const link = document.getElementById("nsd-theme");
			const match = link && /bootswatch@[^/]+\\/dist\\/([^/]+)\\//.exec(link.href);
			return match ? match[1] : null;
			""";

	private static final String APPLY_THEME_BODY = """
			const link = document.getElementById("nsd-theme");
			if (link) {
			  link.href = link.href.replace(/(bootswatch@[^/]+\\/dist\\/)[^/]+\\//, "$1" + name + "/");
			}
			try {
			  window.localStorage.setItem("nsd-docs-theme", name);
			} catch (error) {
			  // Not remembered.
			}
			""";

	private static final String MOUNT_BODY = """
			createRoot(element).render(h(DocViewer, options));
			""";

	private static final String PAGE_STYLE = """
			html, body { height: 100%; }
			.nsd-app { display: flex; flex-direction: column; height: 100vh; }
			.nsd-body { display: flex; flex: 1; min-height: 0; }
			.nsd-nav { width: 22rem; min-width: 12rem; max-width: 60vw; overflow: auto; resize: horizontal; border-right: 1px solid var(--bs-border-color); }
			.nsd-content { flex: 1; overflow: auto; min-width: 0; }
			.nsd-tree, .nsd-tree ul { list-style: none; margin: 0; padding: 0; }
			.nsd-tree ul { padding-left: 1rem; }
			.nsd-tree-row { display: flex; align-items: center; gap: 0.25rem; padding: 0.1rem 0.25rem; border-radius: var(--bs-border-radius-sm); white-space: nowrap; cursor: pointer; }
			.nsd-tree-row:hover { background: var(--bs-tertiary-bg); }
			li[aria-selected=true] > .nsd-tree-row { background: var(--bs-primary-bg-subtle); font-weight: 500; }
			.nsd-tree-link { color: inherit; text-decoration: none; }
			.nsd-tree-group { color: var(--bs-secondary-color); }
			.nsd-toggle { display: inline-flex; flex: none; width: 1rem; justify-content: center; font-size: 0.75rem; color: var(--bs-secondary-color); }
			.nsd-icon { display: inline-block; flex: none; width: 1.1rem; text-align: center; margin-right: 0.25rem; }
			.nsd-content h1 .nsd-icon { width: auto; margin-right: 0; }
			img.nsd-icon { height: 1rem; object-fit: contain; }
			.nsd-markdown { max-width: 60rem; }
			.nsd-markdown table { width: auto; }
			""";

	// --- Tests -------------------------------------------------------------------

	@Test
	public void testResolution() {
		ModuleDocs docs = new ModuleDocs(ModuleLayer.boot(), name -> true);
		// An id with a slash is one item and two URL segments.
		assertEquals(List.of("modules/jdk", "java.base", "packages", "java.lang"), docs.resolve(List.of("modules", "jdk", "java.base", "packages", "java.lang")));
		assertEquals(List.of("modules/jdk"), docs.resolve(List.of("modules", "jdk")));
		assertNull(docs.resolve(List.of("modules")));
		assertNull(docs.resolve(List.of("modules", "jdk", "no.such.module")));
		assertEquals("modules/jdk/java.base/packages/java.lang", ModuleDocs.urlPath(List.of("modules/jdk", "java.base", "packages", "java.lang")));
		assertEquals("../java.xml/index.html", ModuleDocs.relative(List.of("modules/jdk", "java.base"), List.of("modules/jdk", "java.xml")));
		assertEquals("../../../../application/x/index.html", ModuleDocs.relative(List.of("modules/jdk", "java.base", "packages", "java.lang"), List.of("modules/application", "x")));

		// Two siblings producing the same URL path are refused.
		ModuleDocs clash = new ModuleDocs(ModuleLayer.boot(), name -> false) {
			@Override
			List<DocItem> roots() {
				return List.of(
						new DocItem("a/b", "A B", null, null, path -> "", null),
						new DocItem("a", "A", null, null, path -> "", () -> List.of(new DocItem("b", "B", null, null, path -> "", null))));
			}
		};
		assertThrows(IllegalStateException.class, clash::checkUrlPaths);
	}

	@Test
	public void testStaticSite() throws Exception {
		Set<String> reachable = new HashSet<>();
		new ModuleGraph(DocViewerTests.class).nodes.forEach(node -> reachable.add(node.name()));
		ModuleDocs docs = new ModuleDocs(layer(), reachable::contains);
		docs.checkUrlPaths();

		Path site = Path.of("target", "react", "doc-viewer-site").toAbsolutePath();
		String staticOptions = new JSONObject().put("navUrl", NAV_PATH).put("searchUrl", SEARCH_INDEX_PATH).toString();
		Map<String, String> files = new LinkedHashMap<>();
		files.put("index.html", shell("./", staticOptions));
		files.put("search.html", shell("./", staticOptions));
		files.put("index.md", docs.home());
		files.put(MODULE_PATH, module());
		files.put(NAV_PATH, new JSONObject().put("title", TITLE).put("home", "index.md").put("items", docs.navJson()).toString());
		files.put(SEARCH_INDEX_PATH, docs.searchIndexJson().toString());
		int[] pages = { 0 };
		ModuleDocs.walk(List.of(), docs.roots(), (ids, item) -> {
			if (item.hasMarkdown()) {
				String path = ModuleDocs.urlPath(ids);
				String decoded = URLDecoder.decode(path, StandardCharsets.UTF_8);
				files.put(decoded + "/index.html", shell("../".repeat(ModuleDocs.segments(ids).size()), staticOptions));
				files.put(decoded + "/index.md", item.markdown().apply(ids));
				pages[0]++;
			}
		});
		WebTestSupport.writeSite(site, files);
		System.out.println(pages[0] + " pages");

		// A deep link's shell points its base at the site root.
		String shell = Files.readString(site.resolve("modules/jdk/java.base/packages/java.lang/index.html"));
		assertTrue(shell.contains("<base href=\"../../../../../\">"), shell);
		String markdown = Files.readString(site.resolve("modules/jdk/java.base/packages/java.lang/index.md"));
		assertTrue(markdown.contains("`String`"), markdown);
		assertTrue(markdown.contains("[java.base](../../index.html)"), markdown);

		JSONObject nav = new JSONObject(Files.readString(site.resolve(NAV_PATH)));
		JSONArray items = nav.getJSONArray("items");
		assertEquals(ModuleDocs.JDK_GROUP, items.getJSONObject(items.length() - 1).getString("id"));
		assertTrue(!items.getJSONObject(0).has("markdown"), "Groups have no Markdown");

		String module = Files.readString(site.resolve(MODULE_PATH));
		assertTrue(module.contains("import DOMPurify from \"dompurify\";"), module);
		assertTrue(module.contains("export function DocViewer(props) {"), module);
	}

	@Test
	public void testServer() throws Exception {
		ModuleDocs docs = new ModuleDocs(layer(), name -> true);
		String shell = shell("/", new JSONObject().put("apiUrl", API_PREFIX).toString());
		Map<String, String> modules = Map.of(MODULE_PATH, module());

		HttpServer server = HttpServer.create(new InetSocketAddress(InetAddress.getLoopbackAddress(), 0), 0);
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
			server.setExecutor(executor);

			// Page handler: the same shell for the root, the search page, and every item path.
			server.createContext("/", exchange -> {
				String path = path(exchange);
				if (!"GET".equals(method(exchange))) {
					methodNotAllowed(exchange);
				} else if (path.endsWith("/") || path.endsWith(".html")) {
					send(exchange, 200, "text/html; charset=utf-8", shell);
				} else {
					notFound(exchange);
				}
			});

			server.createContext("/" + RESERVED_PREFIX, exchange -> {
				String source = modules.get(path(exchange).substring(1));
				if (!"GET".equals(method(exchange))) {
					methodNotAllowed(exchange);
				} else if (source == null) {
					notFound(exchange);
				} else {
					send(exchange, 200, "text/javascript; charset=utf-8", source);
				}
			});

			// Data handler: one level of the tree at a time, URL resolution, Markdown, search.
			server.createContext("/" + API_PREFIX, exchange -> {
				if (!"GET".equals(method(exchange))) {
					methodNotAllowed(exchange);
					return;
				}
				Map<String, String> query = query(exchange);
				switch (path(exchange).substring(API_PREFIX.length() + 1)) {
					case "info" -> send(exchange, 200, "application/json", new JSONObject().put("title", TITLE).put("home", API_PREFIX + "home").toString());
					case "home" -> send(exchange, 200, "text/markdown; charset=utf-8", docs.home());
					case "children" -> {
						List<String> ids = ids(query.get("path"));
						List<ModuleDocs.DocItem> items = docs.children(ids);
						respond(exchange, items == null ? null : () -> ModuleDocs.levelJson(ids, items, API_PREFIX).toString(), "application/json");
					}
					case "resolve" -> {
						List<String> segments = new ArrayList<>();
						for (String segment : query.getOrDefault("path", "").split("/")) {
							if (!segment.isEmpty()) {
								segments.add(segment);
							}
						}
						List<String> ids = docs.resolve(segments);
						send(exchange, 200, "application/json", new JSONObject().put("ids", ids == null ? JSONObject.NULL : new JSONArray(ids)).toString());
					}
					case "markdown" -> {
						List<String> ids = ids(query.get("path"));
						ModuleDocs.DocItem item = docs.item(ids);
						respond(exchange, item == null || !item.hasMarkdown() ? null : () -> item.markdown().apply(ids), "text/markdown; charset=utf-8");
					}
					case "search" -> send(exchange, 200, "application/json", docs.search(query.getOrDefault("q", "")).toString());
					default -> notFound(exchange);
				}
			});

			server.start();
			try (HttpClient client = HttpClient.newHttpClient()) {
				URI base = URI.create("http://127.0.0.1:" + server.getAddress().getPort() + "/");

				// Any item path gets the shell; the browser resolves it.
				assertEquals(shell, get(client, base.resolve("modules/jdk/java.base/packages/java.lang/index.html")).body());
				assertEquals(404, get(client, base.resolve("favicon.ico")).statusCode());

				JSONArray roots = new JSONArray(get(client, base.resolve(API_PREFIX + "children?path=" + encode("[]"))).body());
				assertEquals(ModuleDocs.JDK_GROUP, roots.getJSONObject(roots.length() - 1).getString("id"));
				assertTrue(roots.getJSONObject(0).getBoolean("hasChildren"));

				JSONArray jdk = new JSONArray(get(client, base.resolve(API_PREFIX + "children?path=" + encode(new JSONArray(List.of(ModuleDocs.JDK_GROUP)).toString()))).body());
				JSONObject javaBase = null;
				for (int i = 0; i < jdk.length(); i++) {
					if ("java.base".equals(jdk.getJSONObject(i).getString("id"))) {
						javaBase = jdk.getJSONObject(i);
					}
				}
				assertTrue(javaBase != null && javaBase.getBoolean("hasChildren") && javaBase.getString("markdown").startsWith(API_PREFIX + "markdown?path="));

				JSONObject resolved = new JSONObject(get(client, base.resolve(API_PREFIX + "resolve?path=" + encode("modules/jdk/java.base/packages/java.lang"))).body());
				assertEquals(List.of("modules/jdk", "java.base", "packages", "java.lang"), resolved.getJSONArray("ids").toList());
				assertTrue(new JSONObject(get(client, base.resolve(API_PREFIX + "resolve?path=" + encode("nothing/here"))).body()).isNull("ids"));

				String markdown = get(client, base.resolve(javaBase.getString("markdown"))).body();
				assertTrue(markdown.contains("## Exports"), markdown);

				JSONArray found = new JSONArray(get(client, base.resolve(API_PREFIX + "search?q=" + encode("java.lang"))).body());
				assertEquals("java.lang", found.getJSONObject(0).getString("label"));
				JSONArray optional = new JSONArray(get(client, base.resolve(API_PREFIX + "search?q=" + encode("Optional"))).body());
				assertTrue(optional.toList().stream().anyMatch(result -> "java.util".equals(((Map<?, ?>) result).get("label"))), optional::toString);

				demoPause(base);
			} finally {
				server.stop(0);
			}
		}
	}

	// --- Server helpers ---------------------------------------------------------------

	private static ModuleLayer layer() {
		java.lang.Module self = DocViewerTests.class.getModule();
		return self.getLayer() == null ? ModuleLayer.boot() : self.getLayer();
	}

	private static Map<String, String> query(HttpExchange exchange) {
		Map<String, String> ret = new LinkedHashMap<>();
		String raw = exchange.getRequestURI().getRawQuery();
		if (raw != null) {
			for (String pair : raw.split("&")) {
				int equals = pair.indexOf('=');
				if (equals > 0) {
					ret.put(URLDecoder.decode(pair.substring(0, equals), StandardCharsets.UTF_8), URLDecoder.decode(pair.substring(equals + 1), StandardCharsets.UTF_8));
				}
			}
		}
		return ret;
	}

	private static List<String> ids(String json) {
		List<String> ret = new ArrayList<>();
		if (json != null && !json.isBlank()) {
			JSONArray array = new JSONArray(json);
			for (int i = 0; i < array.length(); i++) {
				ret.add(array.getString(i));
			}
		}
		return ret;
	}

	private static void respond(HttpExchange exchange, Supplier<String> body, String contentType) throws java.io.IOException {
		if (body == null) {
			notFound(exchange);
		} else {
			send(exchange, 200, contentType, body.get());
		}
	}

	private static String encode(String value) {
		return URLEncoder.encode(value, StandardCharsets.UTF_8);
	}

	// --- Artifacts ---------------------------------------------------------------

	private static String module() {
		Module module = FACTORY.createModule();
		module.setName("docs");
		module.setPath(MODULE_PATH.substring(0, MODULE_PATH.length() - ".js".length()));
		module.setHeader("// Generated from a Nasdanika TypeScript model by DocViewerTests. Do not edit.");

		module.getImports().add(namedImport("react", binding("createElement", "h"), binding("useEffect"), binding("useMemo"), binding("useRef"), binding("useState")));
		module.getImports().add(namedImport("react-dom/client", binding("createRoot")));
		module.getImports().add(namedImport("react-bootstrap",
				binding("Alert"), binding("Breadcrumb"), binding("Button"), binding("Form"), binding("InputGroup"),
				binding("Navbar"), binding("Spinner")));
		module.getImports().add(namedImport("marked", binding("marked")));
		module.getImports().add(namedImport("dompurify", defaultBinding("DOMPurify")));

		VariableDeclaration themes = FACTORY.createVariableDeclaration();
		themes.setName("THEMES");
		CodeBlock themesInitializer = FACTORY.createCodeBlock();
		themesInitializer.setName("initializer");
		themesInitializer.setText(THEMES_INITIALIZER);
		themes.setInitializer(themesInitializer);
		module.getDeclarations().add(themes);

		VariableDeclaration defaultTheme = FACTORY.createVariableDeclaration();
		defaultTheme.setName("DEFAULT_THEME");
		CodeBlock defaultThemeInitializer = FACTORY.createCodeBlock();
		defaultThemeInitializer.setName("initializer");
		defaultThemeInitializer.setText("\"" + DEFAULT_THEME + "\"");
		defaultTheme.setInitializer(defaultThemeInitializer);
		module.getDeclarations().add(defaultTheme);

		module.getDeclarations().add(function("DocViewer", true,
				"""
				Documentation viewer: a navigation tree, Markdown content, search and themes.
				Static mode loads the whole tree from props.navUrl and searches
				props.searchUrl in the browser; server mode loads levels, Markdown and search
				results from props.apiUrl. Relative URLs resolve against the page's base,
				which is the site root.""",
				VIEWER_BODY, "props"));
		module.getDeclarations().add(function("staticSource", false, "Tree, resolution and search over a static site's files.", STATIC_SOURCE_BODY, "navUrl", "searchUrl"));
		module.getDeclarations().add(function("remoteSource", false, "Tree levels, resolution and search from a server API.", REMOTE_SOURCE_BODY, "apiUrl"));
		module.getDeclarations().add(function("resolveIds", false, "Ids for URL path segments, by longest match at each level; null when nothing matches.", RESOLVE_IDS_BODY, "items", "segments"));
		module.getDeclarations().add(function("searchEntries", false, "The static site's search: the same algorithm as the server's.", SEARCH_ENTRIES_BODY, "entries", "query"));
		module.getDeclarations().add(function("excerpt", false, "Text around the first match.", EXCERPT_BODY, "text", "term"));
		module.getDeclarations().add(function("parseLocation", false, "The browser URL relative to the site root: path segments, or a search query.", PARSE_LOCATION_BODY, "root"));
		module.getDeclarations().add(function("rebase", false,
				"Makes relative links and images in rendered Markdown absolute against the item's page, because the shell's base is the site root.",
				REBASE_BODY, "html", "pageUrl"));
		module.getDeclarations().add(function("itemUrl", false, "An item's URL: its ids as path segments, then index.html.", ITEM_URL_BODY, "root", "ids"));
		module.getDeclarations().add(function("icon", false, "A Bootstrap Icons class, or an image when the value looks like a URL.", ICON_BODY, "value", "root"));
		module.getDeclarations().add(function("fetchJson", false, "Fetches JSON, failing on an error status.", FETCH_JSON_BODY, "url"));
		module.getDeclarations().add(function("fetchText", false, "Fetches text, failing on an error status.", FETCH_TEXT_BODY, "url"));
		module.getDeclarations().add(function("loadJson", false, "A value from local storage, or the default.", LOAD_JSON_BODY, "key", "defaultValue"));
		module.getDeclarations().add(function("saveJson", false, "A value to local storage, if available.", SAVE_JSON_BODY, "key", "value"));
		module.getDeclarations().add(function("currentTheme", false, "The Bootswatch theme the page loaded.", CURRENT_THEME_BODY));
		module.getDeclarations().add(function("applyTheme", false, "Switches the Bootswatch theme and remembers it.", APPLY_THEME_BODY, "name"));
		module.getDeclarations().add(function("mount", true, "Renders the viewer into the element.", MOUNT_BODY, "element", "options"));

		return new Generator().generate(module);
	}

	/**
	 * The page every URL gets. <code>&lt;base&gt;</code> makes every relative URL, and
	 * the viewer's idea of the site root, independent of how deep the page is. The
	 * theme remembered in local storage is applied before the first paint.
	 */
	private static String shell(String baseHref, String options) {
		Document page = WebTestSupport.page(TITLE, IMPORT_MAP, WebTestSupport.mountPoint(), MODULE_PATH, options);
		Head head = page.getHead();
		head.setBase(baseHref);

		Stylesheet theme = WebTestSupport.stylesheet("https://cdn.jsdelivr.net/npm/bootswatch@" + BOOTSWATCH_VERSION + "/dist/" + DEFAULT_THEME + "/bootstrap.min.css");
		theme.setId(THEME_LINK_ID);
		head.getStylesheets().add(theme);
		head.getStylesheets().add(WebTestSupport.stylesheet(BOOTSTRAP_ICONS_CSS));
		head.getStylesheets().add(WebTestSupport.style(PAGE_STYLE));

		// Classic script in the head, so the remembered theme is applied before the first paint
		Script themeScript = WebTestSupport.HTML.createScript();
		themeScript.setContent("""

				try {
				  const theme = localStorage.getItem("nsd-docs-theme");
				  if (theme && /^[a-z]+$/.test(theme)) {
				    const link = document.getElementById("%s");
				    link.href = link.href.replace(/(bootswatch@[^/]+\\/dist\\/)[^/]+\\//, "$1" + theme + "/");
				  }
				} catch (error) {
				}
				""".formatted(THEME_LINK_ID));
		head.getScripts().add(themeScript);
		return WebTestSupport.html(page);
	}

	private static final String THEME_LINK_ID = "nsd-theme";

}
