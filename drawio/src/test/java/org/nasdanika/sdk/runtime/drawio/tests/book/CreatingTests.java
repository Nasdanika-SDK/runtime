package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.ConnectionPoint;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.style.Arrow;

/**
 * Chapter "Creating and changing diagrams".
 */
public class CreatingTests {

	@Test
	public void testCreate() throws Exception {
		// tag::create[]
		Document document = Document.create(false, null); // <1>
		Page page = document.createPage();
		page.setName("Payments");
		Layer<?> layer = page.getModel().getRoot().getLayers().getFirst(); // <2>

		Node api = layer.createNode();
		api.setId("api");
		api.setLabel("API Application");
		api.setProperty("technology", "Java");
		api.getGeometry().setBounds(0, 0, 160, 60);
		api.getStyle()
			.backgroundColor("#438DD5")
			.fontColor("#FFFFFF")
			.rounded(true);

		Node gateway = layer.createNode();
		gateway.setId("gateway");
		gateway.setLabel("Payment Gateway");
		gateway.getGeometry().setBounds(300, 0, 160, 60);
		gateway.getStyle().backgroundColor("#999999").fontColor("#FFFFFF").rounded(true);
		gateway.getTags().add(page.createTag("external"));
		// end::create[]

		// tag::connect[]
		Connection payment = layer.createConnection(api, gateway);
		payment.setId("api-gateway");
		payment.setLabel("Submits payments to");
		payment.setProperty("protocol", "ISO 20022/HTTPS");
		payment.getStyle()
			.edgeStyle("orthogonalEdgeStyle")
			.dashed("1")
			.endArrow(Arrow.CLASSIC)
			.endFill(true);
		// end::connect[]

		// tag::points[]
		ConnectionPoint exit = api.createConnectionPoint(1, 0.5); // <1>
		ConnectionPoint entry = gateway.createConnectionPoint(0, 0.5);
		Connection status = layer.createConnection(gateway, api);
		status.setLabel("Reports status to");
		status.setSource(gateway.createConnectionPoint(0.5, 1));
		status.setTarget(api.createConnectionPoint(0.5, 1));
		status.getPoints().add(380, 100); // <2>
		status.getPoints().add(80, 100);
		payment.setSource(exit);
		payment.setTarget(entry);
		// end::points[]

		// tag::save[]
		Path path = Path.of("target", "book", "payments.drawio");
		Files.createDirectories(path.getParent());
		Files.writeString(path, document.save(false));

		Document reloaded = Document.load(path.toFile());
		Node reloadedApi = (Node) reloaded.getModelElementById("api");
		assertThat(reloadedApi.getAllOutgoingConnections()) // <1>
			.extracting(ModelElement::getLabel)
			.containsExactly("Submits payments to");
		assertThat(reloadedApi.getProperty("outgoing-connection/target/tags"))
			.isEqualTo("external");
		// end::save[]
		assertThat(reloadedApi.getAllIncomingConnections()).hasSize(1);
	}

	@Test
	public void testDangling() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::dangling[]
		document.getModelElementById("email").remove();
		Connection sendsEmail = (Connection) document.getModelElementById("ibs-email");
		assertThat(sendsEmail).isNotNull(); // <1>
		assertThat(sendsEmail.getTarget()).isNull();
		// end::dangling[]
	}

	@Test
	public void testChange() throws Exception {
		Document document = Diagrams.load("internet-banking.png");
		// tag::highlight[]
		document
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(node -> node.getTags().stream().anyMatch(tag -> "legacy".equals(tag.getName())))
			.forEach(node -> node.getStyle() // <1>
				.color("#B91C1C")
				.width("3")
				.dashed("1"));

		String saved = document.save(false);
		assertThat(saved).contains("strokeColor=#B91C1C");
		// end::highlight[]

		// tag::remove[]
		Node email = (Node) document.getModelElementById("email");
		for (Connection connection: email.getAllIncomingConnections()) {
			connection.remove(); // <1>
		}
		for (Connection connection: email.getAllOutgoingConnections()) {
			connection.remove();
		}
		email.remove();
		assertThat(document.getModelElementById("email")).isNull();
		assertThat(document.getModelElementById("ibs-email")).isNull();
		Node ibs = (Node) document.getModelElementById("ibs");
		assertThat(ibs.getOutgoingConnections())
			.extracting(Connection::getId)
			.containsExactly("ibs-mainframe");
		// end::remove[]
	}

}
