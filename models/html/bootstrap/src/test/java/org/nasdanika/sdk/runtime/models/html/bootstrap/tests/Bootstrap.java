package org.nasdanika.sdk.runtime.models.html.bootstrap.tests;

import java.util.List;
import java.util.function.Consumer;

import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.OverlaysFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsFactory;

/**
 * Terse, typed construction of Bootstrap models in tests and demos.
 */
final class Bootstrap {

	static final BootstrapFactory CORE = BootstrapFactory.eINSTANCE;
	static final FormsFactory FORMS = FormsFactory.eINSTANCE;
	static final ContentFactory CONTENT = ContentFactory.eINSTANCE;
	static final NavigationFactory NAVIGATION = NavigationFactory.eINSTANCE;
	static final OverlaysFactory OVERLAYS = OverlaysFactory.eINSTANCE;
	static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	private Bootstrap() {
	}

	/**
	 * Configures a new object inline: with(CONTENT.createButton(), b -&gt; b.setContent("Save"))
	 */
	static <T> T with(T object, Consumer<T> configurator) {
		configurator.accept(object);
		return object;
	}

	static Text text(String content) {
		Text ret = HTML.createText();
		ret.setContent(content);
		return ret;
	}

	/**
	 * An HTML element with text and classes.
	 */
	static <T extends Element> T element(T element, String text, String... classes) {
		if (text != null) {
			((Container) element).getContents().add(text(text));
		}
		element.getClasses().addAll(List.of(classes));
		return element;
	}

	static ColumnSize size(Breakpoint breakpoint, int span) {
		ColumnSize ret = CORE.createColumnSize();
		ret.setBreakpoint(breakpoint);
		ret.setSpan(span);
		return ret;
	}

	static ColumnSize size(Breakpoint breakpoint, int span, int offset) {
		ColumnSize ret = size(breakpoint, span);
		ret.setOffset(offset);
		return ret;
	}

}
