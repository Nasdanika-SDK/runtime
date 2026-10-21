package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;

import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.graph.ElkEdge;
import org.eclipse.elk.graph.ElkNode;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.diagram.Bounds;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.diagram.Port;
import org.nasdanika.sdk.runtime.models.diagram.elk.DiagramElkGraph;
import org.nasdanika.sdk.runtime.models.diagram.elk.ElkLayout;

/**
 * Chapter "Laying out a diagram": the adapter on small diagrams.
 */
public class LayoutTests {

	static final DiagramFactory FACTORY = DiagramFactory.eINSTANCE;

	static Node node(Diagram diagram, String id) {
		Node node = FACTORY.createNode();
		node.setId(id);
		node.setName(id);
		diagram.getChildren().add(node);
		return node;
	}

	static Connection connect(Diagram diagram, String name,
			org.nasdanika.sdk.runtime.models.diagram.Connectable source,
			org.nasdanika.sdk.runtime.models.diagram.Connectable target) {
		Connection connection = FACTORY.createConnection();
		connection.setId(source.getId() + "-" + target.getId());
		connection.setName(name);
		connection.setSource(source);
		connection.setTarget(target);
		diagram.getChildren().add(connection);
		return connection;
	}

	@Test
	public void testPipeline() {
		// tag::pipeline[]
		Diagram diagram = FACTORY.createDiagram();
		diagram.setId("pipeline");
		diagram.getProperties().put("elk.direction", "RIGHT"); // <1>
		Node build = node(diagram, "Build");
		Node test = node(diagram, "Test");
		Node deploy = node(diagram, "Deploy");
		connect(diagram, "artifacts", build, test);
		Connection release = connect(diagram, "release", test, deploy);

		new ElkLayout().layout(diagram); // <2>

		Bounds b = build.getBounds();
		Bounds t = test.getBounds();
		Bounds d = deploy.getBounds();
		assertThat(b.getX() + b.getWidth()).isLessThan(t.getX()); // <3>
		assertThat(t.getX() + t.getWidth()).isLessThan(d.getX());
		assertThat(b.getWidth()).isEqualTo(80); // <4>

		List<Point> route = release.getWaypoints(); // <5>
		assertThat(route.getFirst().getX()).isEqualTo(t.getX() + t.getWidth());
		assertThat(route.getLast().getX()).isEqualTo(d.getX());
		Label label = (Label) release.getChildren().getFirst(); // <6>
		assertThat(label.getText()).isEqualTo("release");
		assertThat(label.getBounds().getWidth()).isPositive();
		// end::pipeline[]
	}

	@Test
	public void testPorts() {
		// tag::ports[]
		Diagram diagram = FACTORY.createDiagram();
		diagram.setId("ports");
		diagram.getProperties().put("elk.direction", "UP");
		diagram.getProperties().put("elk.edgeRouting", "ORTHOGONAL");
		Node general = node(diagram, "General");
		Node special = node(diagram, "Special");
		Port top = FACTORY.createPort(); // <1>
		top.setId("top");
		top.setLocation(point(0.5, 0));
		special.getPorts().add(top);
		Port bottom = FACTORY.createPort();
		bottom.setId("bottom");
		bottom.setLocation(point(0.5, 1));
		general.getPorts().add(bottom);
		Connection extension = connect(diagram, null, top, bottom);

		new ElkLayout().layout(diagram);

		Bounds g = general.getBounds();
		Bounds s = special.getBounds();
		assertThat(g.getY() + g.getHeight()).isLessThan(s.getY()); // <2>
		Point start = extension.getWaypoints().getFirst();
		Point end = extension.getWaypoints().getLast();
		assertThat(start.getX()).isEqualTo(s.getX() + s.getWidth() / 2); // <3>
		assertThat(start.getY()).isEqualTo(s.getY());
		assertThat(end.getX()).isEqualTo(g.getX() + g.getWidth() / 2);
		assertThat(end.getY()).isEqualTo(g.getY() + g.getHeight());
		assertThat(extension.getChildren()).isEmpty(); // <4>
		// end::ports[]
	}

	static Point point(double x, double y) {
		Point point = FACTORY.createPoint();
		point.setX(x);
		point.setY(y);
		return point;
	}

	@Test
	public void testNested() {
		// tag::nested[]
		Diagram diagram = FACTORY.createDiagram();
		diagram.setId("nested");
		Node system = node(diagram, "System");
		Node api = FACTORY.createNode();
		api.setId("API");
		api.setName("API");
		system.getChildren().add(api); // <1>
		Node database = FACTORY.createNode();
		database.setId("Database");
		database.setName("Database");
		system.getChildren().add(database);
		Node client = node(diagram, "Client");
		Connection calls = connect(diagram, "calls", client, api); // <2>
		system.getChildren().add(connect(diagram, "reads", api, database));

		DiagramElkGraph graph = new ElkLayout().layout(diagram);

		Bounds s = system.getBounds();
		Bounds a = api.getBounds();
		assertThat(a.getX()).isPositive(); // <3>
		assertThat(a.getX() + a.getWidth()).isLessThanOrEqualTo(s.getWidth());
		ElkEdge elkCalls = (ElkEdge) graph.getElkElement(calls);
		assertThat(elkCalls.getContainingNode()).isSameAs(graph.getElkRoot()); // <4>
		Point end = calls.getWaypoints().getLast();
		double apiLeft = s.getX() + a.getX();
		assertThat(end.getX()).isBetween(apiLeft, apiLeft + a.getWidth()); // <5>
		// end::nested[]
	}

	@Test
	public void testOptions() {
		// tag::options[]
		Diagram diagram = FACTORY.createDiagram();
		diagram.setId("options");
		node(diagram, "A").getProperties().put("elk.nodeSize.minimum", "(200, 100)");

		DiagramElkGraph graph = new ElkLayout()
			.option(CoreOptions.DIRECTION, Direction.DOWN) // <1>
			.build(diagram); // <2>
		ElkNode elkRoot = graph.getElkRoot();
		assertThat(elkRoot.getProperty(CoreOptions.DIRECTION)).isEqualTo(Direction.DOWN);
		ElkNode a = elkRoot.getChildren().getFirst();
		assertThat(a.getProperty(CoreOptions.NODE_SIZE_MINIMUM).x).isEqualTo(200);

		diagram.getProperties().put("elk.direction", "SIDEWAYS");
		assertThatThrownBy(() -> new ElkLayout().build(diagram)) // <3>
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("elk.direction");
		// end::options[]
	}

}
