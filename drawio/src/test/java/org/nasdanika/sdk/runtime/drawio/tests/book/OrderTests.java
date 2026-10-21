package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.comparators.AngularNodeComparator;
import org.nasdanika.sdk.runtime.drawio.comparators.CartesianNodeComparator;
import org.nasdanika.sdk.runtime.drawio.comparators.CartesianNodeComparator.Direction;
import org.nasdanika.sdk.runtime.drawio.comparators.EnumerateComparator;
import org.nasdanika.sdk.runtime.drawio.comparators.FlowComparator;
import org.nasdanika.sdk.runtime.drawio.comparators.LabelModelElementComparator;
import org.nasdanika.sdk.runtime.drawio.comparators.PropertyModelElementComparator;

/**
 * Chapter "Geometry and order".
 */
public class OrderTests {

	// tag::steps[]
	private static List<String> sort(List<Node> nodes, Comparator<? super Node> comparator) {
		return nodes.stream().sorted(comparator).map(Node::getLabel).toList();
	}
	// end::steps[]

	@Test
	public void testOrders() throws Exception {
		Document document = Diagrams.load("release-cycle.png");
		// tag::orders[]
		Node release = (Node) document.getModelElementById("release");
		List<Node> steps = document
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(node -> node != release)
			.toList();

		assertThat(sort(steps, new LabelModelElementComparator()))
			.containsExactly("Build", "Deploy", "Plan", "Test");
		assertThat(sort(steps, new PropertyModelElementComparator("owner")))
			.containsExactly("Test", "Build", "Deploy", "Plan"); // <1>
		assertThat(sort(steps, new FlowComparator()))
			.containsExactly("Plan", "Build", "Test", "Deploy"); // <2>
		assertThat(sort(steps, new EnumerateComparator()))
			.containsExactly("Plan", "Build", "Test", "Deploy");
		// end::orders[]

		// tag::geometry[]
		assertThat(sort(steps, new AngularNodeComparator(release, null))) // <1>
			.containsExactly("Plan", "Deploy", "Test", "Build");
		assertThat(sort(steps, new AngularNodeComparator(release, null).reversed()))
			.containsExactly("Build", "Test", "Deploy", "Plan");
		assertThat(sort(steps, new CartesianNodeComparator(Direction.rightDown))) // <2>
			.containsExactly("Deploy", "Plan", "Test", "Build");
		assertThat(sort(steps, new CartesianNodeComparator(Direction.downRight)))
			.containsExactly("Plan", "Deploy", "Build", "Test");
		// end::geometry[]

		// tag::enumerate[]
		ModelElement<?> plan = document.getModelElementById("plan");
		assertThat(plan.getStyle().enumerate()).isTrue();
		assertThat(plan.getEnumarateValue()).isEqualTo("1");
		// end::enumerate[]
	}

	@Test
	public void testContinuum() throws Exception {
		// tag::continuum[]
		Document continuum = Diagrams.load("continuum.png");
		List<Node> points = continuum
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(node -> node.getProperty("role").isEmpty()) // <1>
			.toList();
		assertThat(sort(points, new FlowComparator())).containsExactly(
			"Picture",
			"Interactive diagram",
			"Documented diagram",
			"Diagram as data",
			"Executable diagram",
			"Diagram as a model");
		assertThat(points)
			.filteredOn(point -> "available".equals(point.getProperty("status")))
			.extracting(Node::getLabel)
			.containsExactlyInAnyOrder("Interactive diagram", "Diagram as data");
		// end::continuum[]
	}

}
