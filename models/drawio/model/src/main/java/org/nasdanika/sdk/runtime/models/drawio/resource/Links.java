package org.nasdanika.sdk.runtime.models.drawio.resource;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.models.drawio.AbstractLink;
import org.nasdanika.sdk.runtime.models.drawio.CustomLink;
import org.nasdanika.sdk.runtime.models.drawio.DrawioFactory;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Page;
import org.nasdanika.sdk.runtime.models.drawio.SelectorType;
import org.nasdanika.sdk.runtime.models.drawio.SimpleLink;
import org.nasdanika.sdk.runtime.models.drawio.SpelLink;
import org.nasdanika.sdk.runtime.models.presentation.Presentation;

/**
 * The text of the {@code link} attribute and the {@link AbstractLink} model of it:
 *
 * <pre>
 * data:page/id,[document#]page-id                          CustomLink
 * data:page/name,[document#]page+name
 * data:element/id,[document#][id,page-id/]element-id
 * data:element/name,[document#][name,page+name/]label
 * data:spel,expression                                     SpelLink
 * anything else                                            SimpleLink
 * </pre>
 *
 * Names and labels are URL-encoded in the text and decoded in the model.
 */
public final class Links {

	static final String PAGE_ID = "data:page/id,";
	static final String PAGE_NAME = "data:page/name,";
	static final String ELEMENT_ID = "data:element/id,";
	static final String ELEMENT_NAME = "data:element/name,";
	static final String SPEL = "data:spel,";

	private Links() {
		// Static helpers
	}

	/**
	 * Parses a link. A custom link's target is not resolved.
	 *
	 * @return Null for a blank link
	 */
	public static AbstractLink parse(String link) {
		if (link == null || link.isBlank()) {
			return null;
		}
		DrawioFactory factory = DrawioFactory.eINSTANCE;
		if (link.startsWith(SPEL)) {
			SpelLink spelLink = factory.createSpelLink();
			spelLink.setExpression(link.substring(SPEL.length()));
			return spelLink;
		}
		if (link.startsWith(PAGE_ID) || link.startsWith(PAGE_NAME)) {
			boolean byName = link.startsWith(PAGE_NAME);
			CustomLink customLink = factory.createCustomLink();
			String rest = resource(customLink, link.substring(byName ? PAGE_NAME.length() : PAGE_ID.length()));
			customLink.setPageSelectorType(byName ? SelectorType.NAME : SelectorType.ID);
			customLink.setPageSelector(byName ? decode(rest) : rest);
			return customLink;
		}
		if (link.startsWith(ELEMENT_ID) || link.startsWith(ELEMENT_NAME)) {
			boolean byName = link.startsWith(ELEMENT_NAME);
			CustomLink customLink = factory.createCustomLink();
			String rest = resource(customLink, link.substring(byName ? ELEMENT_NAME.length() : ELEMENT_ID.length()));
			int slash = rest.indexOf('/');
			if (slash != -1 && (rest.startsWith("id,") || rest.startsWith("name,"))) {
				String page = rest.substring(0, slash);
				boolean pageByName = page.startsWith("name,");
				String pageSelector = page.substring(page.indexOf(',') + 1);
				customLink.setPageSelectorType(pageByName ? SelectorType.NAME : SelectorType.ID);
				customLink.setPageSelector(pageByName ? decode(pageSelector) : pageSelector);
				rest = rest.substring(slash + 1);
			}
			customLink.setElementSelectorType(byName ? SelectorType.NAME : SelectorType.ID);
			customLink.setElementSelector(byName ? decode(rest) : rest);
			return customLink;
		}
		SimpleLink simpleLink = factory.createSimpleLink();
		simpleLink.setTarget(link);
		return simpleLink;
	}

	private static String resource(CustomLink customLink, String rest) {
		int hash = rest.indexOf('#');
		if (hash == -1) {
			return rest;
		}
		customLink.setResource(rest.substring(0, hash));
		return rest.substring(hash + 1);
	}

	/**
	 * The text of a link. A custom link with selectors is written with them, as its author wrote
	 * it. One with a target and no selectors is written by id: the page's, or the element's, with
	 * its page's id if the page is not the page of the element that has the link.
	 *
	 * @param owner The element that has the link
	 * @return Null for a null link or one that cannot be written
	 */
	public static String format(AbstractLink link, ModelElement owner) {
		if (link instanceof SimpleLink simpleLink) {
			return simpleLink.getTarget();
		}
		if (link instanceof SpelLink spelLink) {
			return SPEL + spelLink.getExpression();
		}
		if (!(link instanceof CustomLink customLink)) {
			return null; // Actions are not written yet
		}
		String resource = isBlank(customLink.getResource()) ? "" : customLink.getResource() + "#";
		if (isBlank(customLink.getElementSelector())) {
			if (!isBlank(customLink.getPageSelector())) {
				boolean byName = customLink.getPageSelectorType() == SelectorType.NAME;
				return (byName ? PAGE_NAME : PAGE_ID) + resource + (byName ? encode(customLink.getPageSelector()) : customLink.getPageSelector());
			}
			LinkTarget target = customLink.getTarget();
			if (target instanceof Page page) {
				return PAGE_ID + page.getId();
			}
			if (target instanceof ModelElement element) {
				Page targetPage = page(element);
				String pageSelector = targetPage == null || targetPage == page(owner) ? "" : "id," + targetPage.getId() + "/";
				return ELEMENT_ID + pageSelector + ((org.nasdanika.sdk.runtime.models.diagram.DiagramElement) element).getId();
			}
			return null;
		}
		String pageSelector = "";
		if (!isBlank(customLink.getPageSelector())) {
			boolean pageByName = customLink.getPageSelectorType() == SelectorType.NAME;
			pageSelector = (pageByName ? "name," + encode(customLink.getPageSelector()) : "id," + customLink.getPageSelector()) + "/";
		}
		boolean byName = customLink.getElementSelectorType() == SelectorType.NAME;
		return (byName ? ELEMENT_NAME : ELEMENT_ID) + resource + pageSelector + (byName ? encode(customLink.getElementSelector()) : customLink.getElementSelector());
	}

	/**
	 * The page an element is on.
	 */
	static Page page(EObject element) {
		for (EObject container = element; container != null && !(container instanceof Presentation); container = container.eContainer()) {
			if (container instanceof Page page) {
				return page;
			}
		}
		return null;
	}

	private static boolean isBlank(String text) {
		return text == null || text.isBlank();
	}

	private static String encode(String text) {
		return URLEncoder.encode(text, StandardCharsets.UTF_8);
	}

	private static String decode(String text) {
		return URLDecoder.decode(text, StandardCharsets.UTF_8);
	}

}
