package org.example.recording;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;
import org.nasdanika.sdk.runtime.models.telemetry.traces.ChangeDescription;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;

/**
 * Reads recorded traces back: they are a model, so answering a question about a past run
 * is ordinary code over EMF objects, or a query.
 */
public final class TraceReader {

	private TraceReader() {
	}

	// tag::read[]
	public static List<String> read(Path directory) {
		TracesData traces = (TracesData) NasdanikaResourceSet.createAndConfigure()
				.getResource(Recorder.uri(directory, "traces.yml"), true)
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

		out.add(indent + span.getName() + bytes(span));
		ChangeDescription changes = span.getChangeDescription();                      // <1>
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

	private static String bytes(Span span) {
		for (KeyValue attribute: span.getAttributes()) {
			if ("nasdanika.io.bytes".equals(attribute.getKey()) && attribute.getValue() != null) {
				return " (" + attribute.getValue().getIntValue() + " bytes)";
			}
		}
		return "";
	}

	private static String label(EObject eObject) {
		if (eObject instanceof NamedElement named && named.getName() != null) {
			return named.eClass().getName() + " '" + named.getName() + "'";
		}
		EStructuralFeature name = eObject.eClass().getEStructuralFeature("name");
		String type = eObject.eClass().getName();
		return name == null ? type : type + " '" + eObject.eGet(name) + "'";
	}

	public static void main(String[] args) throws Exception {
		Path directory = Files.createTempDirectory("recording");
		Recorder.curate(directory);
		read(directory).forEach(System.out::println);
		System.out.println("Telemetry in " + directory);
	}

}
