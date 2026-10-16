package org.example.flow;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory.Mapping;
import org.nasdanika.sdk.runtime.common.flow.Transformer;
import org.nasdanika.sdk.runtime.common.flow.Transformer.Context;

/**
 * Renders a small document tree as outline lines, one mapping method per kind of node.
 */
public final class Outline {

	// tag::nodes[]
	public sealed interface Part permits Chapter, Section, Paragraph, Note {
	}

	public record Chapter(String title, List<Part> parts) implements Part {
	}

	public record Section(String title, List<Part> parts) implements Part {
	}

	public record Paragraph(String text) implements Part {
	}

	public record Note(String text) implements Part {
	}
	// end::nodes[]

	// tag::mappings[]
	public static class Mappings {

		@Mapping
		public Flow.Publisher<String> chapter(Chapter chapter, Context<Object, String> context) {
			return Flows.concat(
					Flows.of("# " + chapter.title()),
					Flows.concatMap(Flows.fromIterable(chapter.parts()), context::get)); // <1>
		}

		@Mapping
		public Flow.Publisher<String> section(Section section, Context<Object, String> context) {
			return Flows.concat(
					Flows.of("## " + section.title()),
					Flows.concatMap(Flows.fromIterable(section.parts()), context::get));
		}

		@Mapping
		public String paragraph(Paragraph paragraph) {                                      // <2>
			return paragraph.text();
		}

		@Mapping
		public String note(Note note) {                                                     // <3>
			return "> Note: " + note.text();
		}

	}

	public static List<String> render(Chapter chapter) {
		ReflectiveFactory<Object, String> factory =
				ReflectiveFactory.first(MethodHandles.lookup(), new Mappings());
		return new Transformer<>(factory).transform(List.of(chapter)).get(chapter);
	}
	// end::mappings[]

	private Outline() {
	}

}
