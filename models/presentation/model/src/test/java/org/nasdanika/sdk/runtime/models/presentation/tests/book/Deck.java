package org.nasdanika.sdk.runtime.models.presentation.tests.book;

import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.presentation.Cell;
import org.nasdanika.sdk.runtime.models.presentation.ConnectorShape;
import org.nasdanika.sdk.runtime.models.presentation.MasterSlide;
import org.nasdanika.sdk.runtime.models.presentation.Notes;
import org.nasdanika.sdk.runtime.models.presentation.Paragraph;
import org.nasdanika.sdk.runtime.models.presentation.Presentation;
import org.nasdanika.sdk.runtime.models.presentation.PresentationFactory;
import org.nasdanika.sdk.runtime.models.presentation.Row;
import org.nasdanika.sdk.runtime.models.presentation.Slide;
import org.nasdanika.sdk.runtime.models.presentation.TableShape;
import org.nasdanika.sdk.runtime.models.presentation.TextRun;
import org.nasdanika.sdk.runtime.models.presentation.TextShape;

/**
 * The deck of the Presentation Model book: a master, a slide with two shapes and a connector,
 * and a backup slide with a table.
 */
final class Deck {

	private static final PresentationFactory PRESENTATION = PresentationFactory.eINSTANCE;

	private Deck() {
	}

	// tag::deck[]
	static Presentation review() {
		Presentation deck = PRESENTATION.createPresentation();
		deck.setName("Quarterly architecture review");
		deck.setWidth(960);                                             // <1>
		deck.setHeight(540);

		MasterSlide corporate = PRESENTATION.createMasterSlide();
		corporate.setId("corporate");
		corporate.setName("Corporate");
		corporate.getChildren().add(text("footer", 20, 510, 400, 20, run("Internal")));
		deck.getChildren().add(corporate);                              // <2>

		Slide architecture = PRESENTATION.createSlide();
		architecture.setId("architecture");
		architecture.setName("Architecture");
		architecture.setMaster(corporate);
		TextShape web = text("web", 100, 200, 200, 80, run("Web application"));
		TextShape db = text("db", 600, 200, 200, 80, run("Accounts database"));
		ConnectorShape reads = PRESENTATION.createConnectorShape();
		reads.setId("reads");
		reads.setSource(web);                                           // <3>
		reads.setTarget(db);
		architecture.getChildren().add(web);
		architecture.getChildren().add(db);
		architecture.getChildren().add(reads);
		Notes notes = PRESENTATION.createNotes();
		notes.setText("The database is the system of record for accounts.");
		architecture.setNotes(notes);                                   // <4>
		deck.getChildren().add(architecture);

		Slide backup = PRESENTATION.createSlide();
		backup.setId("backup");
		backup.setName("Backup: volumes");
		backup.setHidden(true);                                         // <5>
		backup.setMaster(corporate);
		backup.getChildren().add(table("volumes",
				new String[] { "System", "Requests per day" },
				new String[] { "Web application", "1,200,000" }));
		deck.getChildren().add(backup);
		return deck;
	}
	// end::deck[]

	// tag::text[]
	static TextRun run(String text) {
		TextRun run = PRESENTATION.createTextRun();
		run.setText(text);
		return run;
	}

	static TextShape text(
			String id,
			double x,
			double y,
			double width,
			double height,
			TextRun... runs) {
		TextShape shape = PRESENTATION.createTextShape();
		shape.setId(id);
		shape.setBounds(bounds(x, y, width, height));                   // <1>
		Paragraph paragraph = PRESENTATION.createParagraph();
		for (TextRun run: runs) {
			paragraph.getRuns().add(run);                               // <2>
		}
		shape.getParagraphs().add(paragraph);
		return shape;
	}
	// end::text[]

	static TableShape table(String id, String[]... rows) {
		TableShape table = PRESENTATION.createTableShape();
		table.setId(id);
		table.setBounds(bounds(100, 150, 760, 120));
		for (String[] values: rows) {
			Row row = PRESENTATION.createRow();
			for (String value: values) {
				Cell cell = PRESENTATION.createCell();
				Paragraph paragraph = PRESENTATION.createParagraph();
				paragraph.getRuns().add(run(value));
				cell.getParagraphs().add(paragraph);
				row.getCells().add(cell);
			}
			table.getRows().add(row);
		}
		return table;
	}

	static Bounds bounds(double x, double y, double width, double height) {
		Bounds bounds = DiagramFactory.eINSTANCE.createBounds();
		bounds.setX(x);
		bounds.setY(y);
		bounds.setWidth(width);
		bounds.setHeight(height);
		return bounds;
	}

}
