package org.example.ui;

import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.Paragraph;
import org.nasdanika.sdk.runtime.models.html.Strong;

// tag::named[]
/**
 * Anything with a name, in any model built on the core model: the name, and the
 * documentation if there is any. It renders every named element without a view of its own.
 */
public class NamedElementView extends View<NamedElement> {

	public NamedElementView() {
		super(CorePackage.Literals.NAMED_ELEMENT);
	}

	@Override
	protected Node render(NamedElement element, Views views) {
		Strong name = HTML.createStrong();
		name.getContents().add(text(element.getName()));
		Paragraph paragraph = HTML.createParagraph();
		paragraph.getClasses().add("named-element");
		paragraph.getContents().add(name);
		if (element.getDocumentation() != null) {
			paragraph.getContents().add(text(": " + element.getDocumentation()));
		}
		return paragraph;
	}

}
// end::named[]
