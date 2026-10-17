package org.example.ui;

import java.util.concurrent.Flow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.models.html.HtmlFactory;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.Text;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentFactory;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

// tag::view[]
/**
 * The view of the instances of one class, contributed as a capability factory. It answers
 * the requirement for a view of its class, and the capability it provides is itself.
 */
public abstract class View<T extends EObject> implements CapabilityFactory<ViewOf, View<?>> {

	private final EClass eClass;

	protected View(EClass eClass) {
		this.eClass = eClass;
	}

	/**
	 * The page model of an element. Views of the elements it shows come from the resolver.
	 */
	protected abstract Node render(T element, Views views);

	@SuppressWarnings("unchecked")
	public Node apply(EObject element, Views views) {
		return render((T) element, views);
	}

	@Override
	public boolean canHandle(Object requirement) {
		return requirement instanceof ViewOf viewOf && viewOf.eClass() == eClass; // <1>
	}

	@Override
	public Flow.Publisher<CapabilityProvider<View<?>>> create(
			ViewOf requirement,
			Loader loader,
			Span span,
			Logger logger) {
		return Flows.of(CapabilityProvider.<View<?>>of(this));                    // <2>
	}
	// end::view[]

	// --- Helpers for views ---

	protected static final HtmlFactory HTML = HtmlFactory.eINSTANCE;

	protected static final ContentFactory CONTENT = ContentFactory.eINSTANCE;

	protected static Text text(String content) {
		Text text = HTML.createText();
		text.setContent(content);
		return text;
	}

}
