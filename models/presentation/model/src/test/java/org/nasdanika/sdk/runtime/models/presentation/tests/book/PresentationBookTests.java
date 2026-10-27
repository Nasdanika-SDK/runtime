package org.nasdanika.sdk.runtime.models.presentation.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.presentation.ConnectorShape;
import org.nasdanika.sdk.runtime.models.presentation.MasterSlide;
import org.nasdanika.sdk.runtime.models.presentation.Paragraph;
import org.nasdanika.sdk.runtime.models.presentation.Presentation;
import org.nasdanika.sdk.runtime.models.presentation.Slide;
import org.nasdanika.sdk.runtime.models.presentation.TableShape;
import org.nasdanika.sdk.runtime.models.presentation.TextRun;
import org.nasdanika.sdk.runtime.models.presentation.TextShape;

/**
 * The listings of the Presentation Model book.
 */
public class PresentationBookTests {

	@Test
	public void saveAndLoad(@TempDir Path directory) throws IOException {
		// tag::save[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();   // <1>
		URI uri = URI.createFileURI(directory.resolve("review.xml").toString());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(Deck.review());
		resource.save(null);

		Presentation deck = (Presentation) NasdanikaResourceSet.createAndConfigure()
				.getResource(uri, true)
				.getContents()
				.getFirst();
		assertThat(deck.getMasterSlides()).extracting(Slide::getName).containsExactly("Corporate");
		// end::save[]

		Slide architecture = (Slide) deck.getChildren().get(1);
		assertThat(architecture.getMaster()).isSameAs(deck.getMasterSlides().getFirst());
		assertThat(architecture.getNotes().getText()).contains("system of record");
		ConnectorShape reads = (ConnectorShape) architecture.getChildren().get(2);
		assertThat(((TextShape) reads.getSource()).getId()).isEqualTo("web");
	}

	@Test
	public void query() {
		Presentation deck = Deck.review();
		// tag::words[]
		List<String> words = deck.getSlides().stream()
			.filter(slide -> !(slide instanceof MasterSlide))                  // <1>
			.filter(slide -> !slide.isHidden())                                // <2>
			.flatMap(slide -> slide.getChildren().stream())
			.flatMap(shape -> switch (shape) {
				case TextShape text -> text.getParagraphs().stream();
				case TableShape table -> table.getRows().stream()
						.flatMap(row -> row.getCells().stream())
						.flatMap(cell -> cell.getParagraphs().stream());
				default -> Stream.<Paragraph>empty();
			})
			.flatMap(paragraph -> paragraph.getRuns().stream())
			.map(TextRun::getText)
			.toList();
		assertThat(words).containsExactly("Web application", "Accounts database");
		// end::words[]
	}

	@Test
	public void topology() {
		Presentation deck = Deck.review();
		// tag::topology[]
		Slide architecture = deck.getSlides().stream()
			.filter(slide -> "architecture".equals(slide.getId()))
			.findFirst()
			.orElseThrow();
		TextShape web = (TextShape) architecture.getChildren().getFirst();
		List<String> targets = web.getOutgoingConnections().stream()          // <1>
			.map(Connection::getTarget)
			.map(target -> ((TextShape) target).getParagraphs().getFirst())
			.map(paragraph -> paragraph.getRuns().getFirst().getText())
			.toList();
		assertThat(targets).containsExactly("Accounts database");
		// end::topology[]
	}

	@Test
	public void slidesIncludeMasters() {
		Presentation deck = Deck.review();
		// In this edition slides is every Slide among the children, masters included
		assertThat(deck.getSlides()).hasSize(3);
		assertThat(deck.getMasterSlides()).hasSize(1);
	}

}
