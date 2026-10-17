package org.example.ui;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.sdk.runtime.models.html.Div;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableCell;
import org.nasdanika.sdk.runtime.models.html.TableRow;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Table;

/**
 * The reflective view: what the metamodel says about an element, for elements without a
 * view of their own. Dynamic objects, of classes without generated code, get it too.
 */
final class Properties {

	private static final HtmlFactory HTML = HtmlFactory.eINSTANCE;
	private static final ContentFactory CONTENT = ContentFactory.eINSTANCE;

	private Properties() {
	}

	// tag::properties[]
	/**
	 * A table of the element's class and of the features it has values for.
	 */
	static Node render(EObject element, Views views) {
		TableBody body = HTML.createTableBody();
		body.getRows().add(row(text("Class"), text(element.eClass().getName())));
		for (EStructuralFeature feature: element.eClass().getEAllStructuralFeatures()) {
			if (element.eIsSet(feature)) {
				body.getRows().add(row(text(feature.getName()), value(element, feature, views)));
			}
		}
		Table table = CONTENT.createTable();
		table.setSize(Size.SM);
		table.getClasses().add("properties");
		table.getBodies().add(body);
		return table;
	}

	private static Node value(EObject element, EStructuralFeature feature, Views views) {
		Object value = element.eGet(feature);
		List<?> values = value instanceof Collection<?> many ? List.copyOf(many) : List.of(value);
		if (feature instanceof EReference reference && reference.isContainment()) {
			Div contents = HTML.createDiv();
			for (Object child: values) {
				contents.getContents().add(views.render((EObject) child));       // <1>
			}
			return contents;
		}
		return text(values.stream().map(Properties::label).collect(Collectors.joining(", ")));
	}
	// end::properties[]

	/**
	 * A referenced object by its name, if its class has a name attribute.
	 */
	private static String label(Object value) {
		if (value instanceof EObject eObject) {
			EStructuralFeature name = eObject.eClass().getEStructuralFeature("name");
			if (name instanceof EAttribute && eObject.eGet(name) != null) {
				return String.valueOf(eObject.eGet(name));
			}
			return eObject.eClass().getName();
		}
		return String.valueOf(value);
	}

	private static TableRow row(Node name, Node value) {
		TableRow row = HTML.createTableRow();
		TableCell nameCell = HTML.createTableCell();
		nameCell.setHeader(true);
		nameCell.getContents().add(name);
		TableCell valueCell = HTML.createTableCell();
		valueCell.getContents().add(value);
		row.getCells().add(nameCell);
		row.getCells().add(valueCell);
		return row;
	}

	private static Text text(String content) {
		Text text = HTML.createText();
		text.setContent(content);
		return text;
	}

}
