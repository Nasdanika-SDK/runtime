package org.nasdanika.sdk.runtime.models.diagram.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;
import org.nasdanika.sdk.runtime.models.diagram.Node;

/**
 * Chapters "From Draw.io" and "Semantic elements": the figure of the diagram model, drawn in Draw.io,
 * converted to the diagram model and mapped to the metamodel it depicts.
 */
public class SemanticTests {

	// tag::load[]
	static Diagram figure() throws Exception {
		URL png = SemanticTests.class.getResource("diagram-model.png");
		Document document = Document.loadFromPngMetadata(png).getFirst(); // <1>
		return new DrawioToDiagram().convert(document);
	}
	// end::load[]

	static <T extends DiagramElement> List<T> all(Diagram diagram, Class<T> type) {
		List<T> ret = new java.util.ArrayList<>();
		diagram.eAllContents().forEachRemaining(e -> {
			if (type.isInstance(e)) {
				ret.add(type.cast(e));
			}
		});
		return ret;
	}

	@Test
	public void testConvert() throws Exception {
		// tag::convert[]
		Diagram diagram = figure();
		Diagram page = (Diagram) diagram.getChildren().getFirst();
		assertThat(page.getName()).isEqualTo("Diagram Model");

		List<Node> nodes = all(diagram, Node.class);
		assertThat(nodes).hasSize(13);
		Node node = nodes.stream().filter(n -> "Node".equals(n.getName())).findFirst().orElseThrow();
		assertThat(node.getAttributes().map()).containsEntry("package", "diagram"); // <1>
		assertThat(node.getDocumentation()).isEqualTo("A shape with bounds and ports");
		assertThat(node.getOutgoingConnections()) // <2>
			.extracting(DiagramElement::getName)
			.contains("ports", "bounds");
		// end::convert[]
	}

	// tag::map[]
	static void map(Diagram diagram) {
		Map<String, EPackage> packages = Map.of(
			"diagram", DiagramPackage.eINSTANCE,
			"core", CorePackage.eINSTANCE,
			"ecore", EcorePackage.eINSTANCE);

		for (Node node: all(diagram, Node.class)) {
			EPackage ePackage = packages.get(node.getAttributes().get("package"));
			node.getSemanticElements().add(ePackage.getEClassifier(node.getName())); // <1>
		}

		for (Connection connection: all(diagram, Connection.class)) {
			if ("reference".equals(connection.getAttributes().get("relationship"))) {
				EClass source = (EClass) connection.getSource().getSemanticElements().getFirst();
				String name = connection.getName();
				EReference reference = (EReference) source.getEStructuralFeature(name);
				connection.getSemanticElements().add(reference); // <2>
			}
		}
	}
	// end::map[]

	@Test
	public void testFigureMatchesModel() throws Exception {
		Diagram diagram = figure();
		map(diagram);
		// tag::check[]
		for (Connection connection: all(diagram, Connection.class)) {
			EClass source = (EClass) connection.getSource().getSemanticElements().getFirst();
			EClass target = (EClass) connection.getTarget().getSemanticElements().getFirst();
			switch (connection.getAttributes().get("relationship")) {
			case "extends" -> assertThat(source.getEAllSuperTypes()).contains(target);
			case "reference" -> {
				EReference reference = (EReference) connection.getSemanticElements().getFirst();
				assertThat(reference.getEReferenceType()).isEqualTo(target);
				String opposite = connection.getAttributes().get("opposite");
				if (opposite != null) {
					assertThat(reference.getEOpposite().getName()).isEqualTo(opposite);
				}
			}
			default -> throw new AssertionError("Unknown relationship of " + connection.getId());
			}
		}

		List<EObject> depicted = all(diagram, DiagramElement.class)
			.stream()
			.flatMap(element -> element.getSemanticElements().stream())
			.toList();
		assertThat(depicted).containsAll(DiagramPackage.eINSTANCE.getEClassifiers()); // <1>
		// end::check[]
	}

	@Test
	public void testInbound() throws Exception {
		Diagram diagram = figure();
		map(diagram);
		// tag::inbound[]
		Collection<Setting> settings = EcoreUtil.UsageCrossReferencer.find(
				DiagramPackage.Literals.NODE,
				diagram); // <1>
		List<String> depictions = settings
			.stream()
			.filter(setting -> setting.getEStructuralFeature()
					== DiagramPackage.Literals.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS)
			.map(setting -> ((DiagramElement) setting.getEObject()).getName())
			.toList();
		assertThat(depictions).containsExactly("Node");
		// end::inbound[]
	}

}
