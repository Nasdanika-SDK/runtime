package org.nasdanika.sdk.runtime.models.html.bootstrap.builders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.nasdanika.sdk.runtime.models.html.Anchor;
import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Details;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.Nav;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;
import org.nasdanika.sdk.runtime.models.html.Summary;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.UnorderedList;

/**
 * Builds a navigation tree for a side panel as nested lists of <code>details</code> and
 * <code>summary</code> elements. The tree works without JavaScript, so crawlers and agents
 * read it as plain links.
 * <p>
 * Branches on the path to the current item are open, and the current item is marked with
 * <code>aria-current="page"</code>. A click on a label follows its link, a click on the chevron
 * expands or collapses the branch.
 * <p>
 * The tree needs {@link #stylesheet()} in the head. Icons are CSS classes, e.g.
 * <code>bi bi-filetype-java</code>, and Bootstrap Icons need {@link #iconsStylesheet()}.
 * <p>
 * For large models, build a local tree with {@link #local(boolean)}: branches off the path
 * to the current item are rendered as links without their children.
 */
public class NavigationTree {

	private static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	public static final String ICONS_VERSION = "1.13.1";

	/**
	 * Styles of the tree: a chevron in place of the disclosure triangle, rotated when open,
	 * and Bootstrap colors so that the tree follows the theme and the color mode.
	 */
	public static final String CSS = """
			.nav-tree ul { list-style: none; margin: 0; padding-left: 0; }
			.nav-tree ul ul { padding-left: 1rem; }
			.nav-tree summary { display: flex; align-items: center; list-style: none; cursor: pointer; }
			.nav-tree summary::-webkit-details-marker { display: none; }
			.nav-tree summary::before, .nav-tree .nav-tree-leaf::before, .nav-tree .nav-tree-collapsed::before {
				content: ""; flex: none; width: 1rem; height: 1rem;
			}
			.nav-tree summary::before, .nav-tree .nav-tree-collapsed::before {
				background-color: var(--bs-secondary-color);
				mask: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 16'%3E%3Cpath fill-rule='evenodd' d='M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z'/%3E%3C/svg%3E") center / .75rem no-repeat;
				transition: transform .15s ease-in-out;
			}
			.nav-tree details[open] > summary::before { transform: rotate(90deg); }
			.nav-tree .nav-tree-leaf, .nav-tree .nav-tree-collapsed { display: flex; align-items: center; }
			.nav-tree .nav-tree-label {
				display: inline-flex; align-items: center; gap: .375rem; min-width: 0;
				padding: .125rem .375rem; border-radius: var(--bs-border-radius-sm);
				color: var(--bs-body-color); text-decoration: none; white-space: nowrap;
			}
			.nav-tree a.nav-tree-label:hover { background-color: var(--bs-tertiary-bg); }
			.nav-tree .nav-tree-label[aria-current="page"] {
				background-color: var(--bs-primary-bg-subtle); color: var(--bs-primary-text-emphasis); font-weight: 600;
			}
			.nav-tree .nav-tree-icon { color: var(--bs-secondary-color); }
			.nav-tree details:not([open]) > summary .nav-tree-icon-open,
			.nav-tree details[open] > summary .nav-tree-icon-closed { display: none; }
			@media (prefers-reduced-motion: reduce) {
				.nav-tree summary::before { transition: none; }
			}
			""";

	/**
	 * A tree item: a label with an optional link and icon, and children.
	 */
	public static class Item {

		private final String label;
		private String href;
		private String icon;
		private String openIcon;
		private boolean open;
		private boolean current;
		private final List<Item> children = new ArrayList<>();

		Item(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

		public Item href(String href) {
			this.href = href;
			return this;
		}

		/**
		 * @param icon Icon classes, e.g. <code>bi bi-filetype-java</code>
		 */
		public Item icon(String icon) {
			this.icon = icon;
			return this;
		}

		/**
		 * @param icon Icon classes of a collapsed branch, e.g. <code>bi bi-folder</code>
		 * @param openIcon Icon classes of an expanded branch, e.g. <code>bi bi-folder2-open</code>
		 */
		public Item icon(String icon, String openIcon) {
			this.icon = icon;
			this.openIcon = openIcon;
			return this;
		}

		/**
		 * Expanded even if not on the path to the current item.
		 */
		public Item open() {
			open = true;
			return this;
		}

		/**
		 * The item of the page the tree is shown on.
		 */
		public Item current() {
			current = true;
			return this;
		}

		/**
		 * @return New child item
		 */
		public Item add(String label) {
			Item child = new Item(label);
			children.add(child);
			return child;
		}

		public List<Item> getChildren() {
			return Collections.unmodifiableList(children);
		}

		boolean isOnCurrentPath() {
			return current || children.stream().anyMatch(Item::isOnCurrentPath);
		}

	}

	private final String label;
	private boolean local;
	private final List<Item> items = new ArrayList<>();

	/**
	 * @param label Accessible name of the navigation, e.g. "Files"
	 */
	public NavigationTree(String label) {
		this.label = label;
	}

	/**
	 * @return New root item
	 */
	public Item add(String label) {
		Item item = new Item(label);
		items.add(item);
		return item;
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}

	/**
	 * @param local If true, branches which are neither on the path to the current item nor open
	 * are rendered without their children, as links to their own pages, which show them expanded.
	 */
	public NavigationTree local(boolean local) {
		this.local = local;
		return this;
	}

	/**
	 * @return <code>nav.nav-tree</code> with the tree
	 */
	public Nav build() {
		Nav nav = HTML.createNav();
		nav.getClasses().add("nav-tree");
		nav.getAttributes().put("aria-label", label);
		nav.getContents().add(list(items));
		return nav;
	}

	/**
	 * @return Inline stylesheet with {@link #CSS}
	 */
	public static Stylesheet stylesheet() {
		Stylesheet stylesheet = HTML.createStylesheet();
		stylesheet.setContent(CSS);
		return stylesheet;
	}

	/**
	 * @return Bootstrap Icons stylesheet on jsDelivr
	 */
	public static Stylesheet iconsStylesheet() {
		Stylesheet stylesheet = HTML.createStylesheet();
		stylesheet.setHref("https://cdn.jsdelivr.net/npm/bootstrap-icons@" + ICONS_VERSION + "/font/bootstrap-icons.min.css");
		return stylesheet;
	}

	private UnorderedList list(List<Item> items) {
		UnorderedList list = HTML.createUnorderedList();
		for (Item item: items) {
			list.getItems().add(listItem(item));
		}
		return list;
	}

	private ListItem listItem(Item item) {
		ListItem listItem = HTML.createListItem();
		boolean expanded = item.open || item.isOnCurrentPath();
		if (item.children.isEmpty()) {
			listItem.getClasses().add("nav-tree-leaf");
			listItem.getContents().add(label(item, false));
		} else if (local && !expanded) {
			listItem.getClasses().add("nav-tree-collapsed");
			listItem.getContents().add(label(item, false));
		} else {
			Details details = HTML.createDetails();
			details.setOpen(expanded);
			Summary summary = HTML.createSummary();
			summary.getContents().add(label(item, true));
			details.setSummary(summary);
			details.getContents().add(list(item.children));
			listItem.getContents().add(details);
		}
		return listItem;
	}

	/**
	 * A link, or a span if the item has no href, with icons and the label.
	 *
	 * @param branch If true and the item has an open icon, both icons are rendered and CSS shows one
	 */
	private Element label(Item item, boolean branch) {
		Element label;
		if (item.href == null) {
			label = HTML.createSpan();
		} else {
			Anchor anchor = HTML.createAnchor();
			anchor.setHref(item.href);
			label = anchor;
		}
		label.getClasses().add("nav-tree-label");
		if (item.current) {
			label.getAttributes().put("aria-current", "page");
		}
		Container contents = (Container) label;
		if (branch && item.openIcon != null) {
			contents.getContents().add(icon(item.icon, "nav-tree-icon-closed"));
			contents.getContents().add(icon(item.openIcon, "nav-tree-icon-open"));
		} else if (item.icon != null) {
			contents.getContents().add(icon(item.icon, null));
		}
		Text text = HTML.createText();
		text.setContent(item.label);
		contents.getContents().add(text);
		return label;
	}

	private static Element icon(String classes, String state) {
		var icon = HTML.createGenericElement();
		icon.setName("i");
		icon.getClasses().addAll(List.of(classes.split("\\s+")));
		icon.getClasses().add("nav-tree-icon");
		if (state != null) {
			icon.getClasses().add(state);
		}
		icon.getAttributes().put("aria-hidden", "true");
		return icon;
	}

}
