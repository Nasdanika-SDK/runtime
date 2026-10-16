package org.example.dsl;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Flow;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.example.library.Book;
import org.example.library.Library;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

class TestDsl {

	private static URI uri(String name) {
		Path path = Path.of("src", "test", "resources", name).toAbsolutePath();
		return URI.createFileURI(path.toString());
	}

	@Test
	void libraryDsl() {
		// tag::load[]
		Library library = (Library) NasdanikaResourceSet.createAndConfigure()
				.getResource(uri("reading-group.library.groovy"), true) // <1>
				.getContents()
				.getFirst();

		Book ddd = library.getBooks().getFirst();
		assertThat(ddd.getAuthors()).extracting(a -> a.getName()).containsExactly("Eric Evans");
		assertThat(ddd.getCites()).containsExactly(library.getBooks().get(1));
		assertThat(ddd.getDocumentation()).contains("Published Language");
		// end::load[]
	}

	@Test
	void ecoreDsl() {
		// tag::ecore[]
		EPackage catalog = (EPackage) NasdanikaResourceSet.createAndConfigure()
				.getResource(uri("catalog.ecore.groovy"), true)
				.getContents()
				.getFirst();
		EClass entry = (EClass) catalog.getEClassifier("Entry");
		EClass catalogClass = (EClass) catalog.getEClassifier("Catalog");
		assertThat(catalogClass.getEStructuralFeature("entries").getEType()).isSameAs(entry);
		assertThat(catalogClass.getEStructuralFeature("entries").isMany()).isTrue();
		// end::ecore[]
	}

	@Test
	void tracedWithLineNumbers() {
		// tag::trace[]
		List<String> spans = Collections.synchronizedList(new ArrayList<>());
		var provider = new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 4096);
		try (var openTelemetry = new PublishingOpenTelemetry(OpenTelemetry.noop(), provider);
				Scope scope = Telemetry.makeCurrent(openTelemetry)) {
			openTelemetry.subscribe(new DslSpans(spans));                              // <1>
			NasdanikaResourceSet.createAndConfigure()
				.getResource(uri("reading-group.library.groovy"), true);
		}
		assertThat(spans).containsSubsequence(
				"      Setting books, line 7",
				"        Loading Book, line 7",                                         // <2>
				"          Setting cites, line 12",
				"      Resolving cites, line 12");                                      // <3>
		// end::trace[]
		spans.forEach(System.out::println);
	}

	/**
	 * Collects the spans of loading a script, with their script lines, indented by nesting.
	 */
	static final class DslSpans implements Flow.Subscriber<SpanEvent> {

		private static final AttributeKey<Long> LINE = AttributeKey.longKey("code.line.number");

		private static final List<String> NAMES = List.of(
				"Resource.load",
				"Compiling script",
				"Evaluating script",
				"Loading ",
				"Setting ",
				"Resolving ");

		private final List<String> spans;
		private final Map<PublishingSpan, Integer> depths = new ConcurrentHashMap<>();

		DslSpans(List<String> spans) {
			this.spans = spans;
		}

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(SpanEvent event) {
			if (event instanceof SpanEvent.Started started
					&& NAMES.stream().anyMatch(started.name()::startsWith)) {
				int depth = 0;
				for (PublishingSpan parent = started.span().getParent();
						parent != null;
						parent = parent.getParent()) {
					Integer parentDepth = depths.get(parent);
					if (parentDepth != null) {
						depth = parentDepth + 1;
						break;
					}
				}
				depths.put(started.span(), depth);
				Long line = started.attributes().get(LINE);
				String location = line == null ? "" : ", line " + line;
				spans.add("  ".repeat(depth) + started.name() + location);
			}
		}

		@Override
		public void onError(Throwable throwable) {
		}

		@Override
		public void onComplete() {
		}

	}

}
