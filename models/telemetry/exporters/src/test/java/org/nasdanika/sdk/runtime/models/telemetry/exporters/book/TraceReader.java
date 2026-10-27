package org.nasdanika.sdk.runtime.models.telemetry.exporters.book;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ChangeDescription;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;

/**
 * Reads recorded traces back: they are a model, so answering a question about a past run is
 * ordinary code over EMF objects.
 */
final class TraceReader {

	private TraceReader() {
	}

	// tag::read[]
	static List<String> read(Path directory) {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		resourceSet.getPackageRegistry().put(Shelf.LIBRARY.getNsURI(), Shelf.LIBRARY); // <1>
		TracesData traces = (TracesData) resourceSet
				.getResource(Recorder.uri(directory, "traces.xml"), true)
				.getContents()
				.getFirst();

		// Spans nest within an instrumentation scope; across scopes they have parent ids
		Map<String, Span> spans = new LinkedHashMap<>();
		traces.getResourceSpans().stream()
			.flatMap(resourceSpans -> resourceSpans.getScopeSpans().stream())
			.flatMap(scopeSpans -> scopeSpans.getSpans().stream())
			.forEach(span -> collect(span, spans));
		Map<String, List<Span>> children = new LinkedHashMap<>();
		List<Span> roots = new ArrayList<>();
		for (Span span: spans.values()) {
			if (span.getParentSpanId() == null) {
				roots.add(span);
			} else {
				children.computeIfAbsent(span.getParentSpanId(), id -> new ArrayList<>()).add(span);
			}
		}

		List<String> lines = new ArrayList<>();
		roots.forEach(root -> print(root, children, "", lines));
		return lines;
	}

	static void print(
			Span span,
			Map<String, List<Span>> children,
			String indent,
			List<String> out) {

		out.add(indent + span.getName());
		ChangeDescription changes = span.getChangeDescription();                      // <2>
		if (changes != null) {
			for (EObject created: changes.getObjectsToAttach()) {
				out.add(indent + "  * created " + label(created));
			}
			changes.getObjectChanges().forEach(entry -> {
				for (FeatureChange change: entry.getValue()) {
					String feature = label(entry.getKey()) + "." + change.getFeatureName();
					out.add(indent + "  * " + feature + " = " + change.getValue());
				}
			});
		}
		children.getOrDefault(span.getSpanId(), List.of()).stream()
			.sorted(Comparator.comparingLong(Span::getStartTimeUnixNano))
			.forEach(child -> print(child, children, indent + "  ", out));
	}
	// end::read[]

	private static void collect(Span span, Map<String, Span> spans) {
		spans.put(span.getSpanId(), span);
		span.getChildren().forEach(child -> collect(child, spans));
	}

	private static String label(EObject eObject) {
		EStructuralFeature name = eObject.eClass().getEStructuralFeature("name");
		String type = eObject.eClass().getName();
		return name == null ? type : type + " '" + eObject.eGet(name) + "'";
	}

}
