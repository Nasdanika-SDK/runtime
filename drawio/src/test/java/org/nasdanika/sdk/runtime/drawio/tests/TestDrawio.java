package org.nasdanika.sdk.runtime.drawio.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.nasdanika.sdk.runtime.common.Util;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.ConnectionBase;
import org.nasdanika.sdk.runtime.drawio.ConnectionPoint;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Element;
import org.nasdanika.sdk.runtime.drawio.Geometry;
import org.nasdanika.sdk.runtime.drawio.Layer;
import org.nasdanika.sdk.runtime.drawio.LayerElement;
import org.nasdanika.sdk.runtime.drawio.Model;
import org.nasdanika.sdk.runtime.drawio.ModelElement;
import org.nasdanika.sdk.runtime.drawio.Node;
import org.nasdanika.sdk.runtime.drawio.Page;
import org.nasdanika.sdk.runtime.drawio.Rectangle;
import org.nasdanika.sdk.runtime.drawio.Root;
import org.nasdanika.sdk.runtime.drawio.Tag;
import org.nasdanika.sdk.runtime.drawio.comparators.EnumerateComparator;
import org.nasdanika.sdk.runtime.drawio.style.ConnectionStyle;

public class TestDrawio {

	@Test
	public void testCompressed() throws Exception {
		Document document = Document.load(getClass().getResource("compressed.drawio"));
		assertThat(document.getElement().getTagName()).isEqualTo("mxfile");
		BiFunction<Element<?>, Map<Element<?>, String>, String> visitor = (element, childResults) -> {
			return element.getElement().getTagName() + "[" + element.getElement().getAttribute("id") + "] " + childResults;
		};
		String result = document.accept(visitor, null);
		System.out.println(result);
		
		for (Page page: document.getPages()) {
			System.out.println("Page: " + page.getName());
			Model model = page.getModel();
			Root root = model.getRoot();
			for (Layer<?> layer: root.getLayers()) {
				System.out.println("\tLayer: " + layer.getLabel());
				for (ModelElement<?> modelElement: layer.getElements()) {
					modelElement.setTooltip("Karamba");
					modelElement.setLink("https://nasdanika.org");
				}
				
			}
		}
		
		Files.writeString(new File("target/compressed.drawio").toPath(), document.save(null));
		Files.writeString(new File("target/compressed.html").toPath(), document.toHtml(null, "https://cdn.jsdelivr.net/gh/Nasdanika/drawio@dev/src/main/webapp/js/viewer-static.min.js"));

		Files.writeString(new File("target/decompressed.drawio").toPath(), document.save(false));
		Files.writeString(new File("target/decompressed.html").toPath(), document.toHtml(false, "https://cdn.jsdelivr.net/gh/Nasdanika/drawio@dev/src/main/webapp/js/viewer-static.min.js"));
	}
	
	@Test
	public void testUncompressed() throws Exception {
		Document document = Document.load(getClass().getResource("uncompressed.drawio"));
		assertThat(document.getElement().getTagName()).isEqualTo("mxfile");
		assertThat(document.getPages().size()).isEqualTo(2);
		
		BiFunction<Element<?>, Map<Element<?>, String>, String> visitor = (element, childResults) -> {
			return element.getElement().getTagName() + "[" + element.getElement().getAttribute("id") + "] " + childResults;
		};
		String result = document.accept(visitor, null);
		System.out.println(result);
		
		for (Page page: document.getPages()) {
			System.out.println("Page: " + page.getName());
			Model model = page.getModel();
			Root root = model.getRoot();
			for (Layer<?> layer: root.getLayers()) {
				System.out.println("\tLayer: " + layer.getLabel());
				for (ModelElement<?> modelElement: layer.getElements()) {
					dump(modelElement, "\t\t");
				}
				
			}
		}
		Files.writeString(new File("target/uncompressed.drawio").toPath(), document.save(null));
		Files.writeString(new File("target/uncompressed.html").toPath(), document.toHtml(null, "https://cdn.jsdelivr.net/gh/Nasdanika/drawio@dev/src/main/webapp/js/viewer-static.min.js"));
		Files.writeString(new File("target/recompressed.drawio").toPath(), document.save(true));
		Files.writeString(new File("target/recompressed.html").toPath(), document.toHtml(true, "https://cdn.jsdelivr.net/gh/Nasdanika/drawio@dev/src/main/webapp/js/viewer-static.min.js"));
	}
	
	@Test
	public void testNewUncompressed() throws Exception {
		Document document = Document.create(false, null);
		Page page = document.createPage();
		page.setName("My first new page");
		
		Model model = page.getModel();
		Root root = model.getRoot();
		List<Layer<?>> layers = root.getLayers();
		assertThat(layers).singleElement();
		
		// Add layer
		Layer<?> newLayer = root.createLayer();
		newLayer.setLabel("My new layer");
				
		// Add nodes
		Node source = newLayer.createNode();
		source.setLabel("My source node");
		Rectangle sourceGeometry = source.getGeometry();
		sourceGeometry.setX(200);
		sourceGeometry.setX(100);
		sourceGeometry.setWidth(70);
		sourceGeometry.setHeight(30);
		source.getTags().add(page.createTag("aws"));		
		
		Node target = newLayer.createNode();
		target.setLabel("My target node");
		target.getGeometry().setBounds(300, 150, 100, 30);
		Set<Tag> targetTags = target.getTags();
		targetTags.add(page.createTag("aws"));
		targetTags.add(page.createTag("azure"));
		
		// Add connection
		
		ConnectionPoint sourceConnectionPoint = source.createConnectionPoint(0.5, 1);
				
		ConnectionPoint targetConnectionPoint = target.createConnectionPoint(0, 0.66);
		
		Connection connection = newLayer.createConnection(
				sourceConnectionPoint, 
				targetConnectionPoint);
		connection.setLabel("My connection");
		connection.setOffset(100, -15);
		ConnectionStyle connectionStyle = connection.getStyle();
		connectionStyle.put("orthogonalLoop", "1");
		connectionStyle.put("jettySize", "auto");
		connectionStyle.put("html", "1");
		
		connectionStyle
			.edgeStyle("orthogonalEdgeStyle")
			.rounded(true)
			.dashed("1")
			.width("2")
			.color("#0077ff");
		
		targetConnectionPoint.setLocation(0, 0.33);		
		
		// Label
//	    <mxCell id="xssCvPtsf-id2eiGLFJD-5" connectable="0" 
//			parent="xssCvPtsf-id2eiGLFJD-3" 
//			style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" value="Target" vertex="1">
//	    <mxGeometry relative="1" x="0.8979" as="geometry">
//	      <mxPoint x="20" as="offset" />
//	    </mxGeometry>
	//  </mxCell>
		
		Node connectionLabel = connection.createNode();
		connectionLabel.setLabel("Connection label");
		Geometry clg = connectionLabel.getGeometry();
		clg.setX(0.9);
		clg.setRelative(true);
		
		org.nasdanika.sdk.runtime.drawio.Point clgp = clg.getPoints().add();
		clgp.setRole("offset");
		clgp.setY(20);		
				
		File file = new File("target/new-uncompressed.drawio");
		Files.writeString(file.toPath(), document.save(null));
				
		// Reading 
		Document loadedDocument = Document.load(file);		
		loadedDocument
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.forEach(node -> {
				System.out.println(node.getIncomingConnections().size() + " : " + node.getAllIncomingConnections().size());
				System.out.println(node.getOutgoingConnections().size() + " : " + node.getAllOutgoingConnections().size());
				for (ConnectionPoint cp: node.getConnectionPoints()) {
					System.out.println("\t" + cp.getIncomingConnections().size() + " : " + cp.getOutgoingConnections().size());
				}
			});
		
	}	
	
	private void dump(ModelElement<?> modelElement, String indent) throws TransformerException, IOException {
		modelElement.setTooltip("Kurumba");
		modelElement.setLink("https://nasdanika.org");
		
		System.out.print(indent);
		System.out.println(modelElement.getClass() + " " + modelElement.getLabel());
		if (modelElement instanceof Node) {
			Node node = (Node) modelElement;
			List<Connection> outcomingConnections = node.getAllOutgoingConnections();
			if (!outcomingConnections.isEmpty()) {
				System.out.println(indent + "\tOutgoing connections:");
				for (Connection connection: outcomingConnections) {
					Node target = org.nasdanika.sdk.runtime.drawio.util.Util.getConnectableNode(connection.getTarget());
					System.out.println(indent + "\t\t" + connection.getLabel() + " -> " + target.getLabel());
				}
			}
			List<Connection> inboundConnections = node.getAllIncomingConnections();
			if (!inboundConnections.isEmpty()) {
				System.out.println(indent + "\tIncoming connections:");
				for (Connection connection: inboundConnections) {
					System.out.println(indent + "\t\t" + connection.getLabel() + " <- " + org.nasdanika.sdk.runtime.drawio.util.Util.getConnectableNode(connection.getSource()).getLabel());
				}
			}
			List<LayerElement<?>> children = node.getElements();
			if (!children.isEmpty()) {
				System.out.println(indent + "\tChildren:");
				for (ModelElement<?> child: children) {
					dump(child, indent + "\t\t");
				}
			}
		} else if (modelElement instanceof Connection) {
			Connection connection = (Connection) modelElement;
			System.out.println(indent + "\tSource: " + org.nasdanika.sdk.runtime.drawio.util.Util.getConnectableNode(connection.getSource()).getLabel());
			System.out.println(indent + "\tTarget: " + org.nasdanika.sdk.runtime.drawio.util.Util.getConnectableNode(connection.getTarget()).getLabel());			
		}		
	}	
	
	@Test
	public void testStream() throws Exception {
		Document document = Document.load(getClass().getResource("uncompressed.drawio"));
		long actors = document.stream(ConnectionBase.SOURCE).filter(ModelElement.class::isInstance).map(ModelElement.class::cast).filter(me -> "Actor".equals(me.getLabel())).count();
		assertThat(actors).isEqualTo(1);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testURI() throws Exception {
		Document document = Document.load(getClass().getResource("uris.drawio"));
		URI base = URI.createURI("nasdanika://drawio/tests/");
		Function<ModelElement<?>, URI> uriProvider = e -> {
			String uriProperty = e.getProperty("uri");
			if (Util.isBlank(uriProperty)) {
				return null;
			}
			URI uri = URI.createURI(uriProperty);
			return uri.appendSegment(""); // Adding a hanging / for "under the parent" resolution.
		};
		
		Optional<ModelElement> actorOptional = document.stream(null).filter(ModelElement.class::isInstance).map(ModelElement.class::cast).filter(me -> "Actor".equals(me.getLabel())).findFirst();
		assertThat(actorOptional.isPresent()).isEqualTo(true);
		URI actorURI = actorOptional.get().resolveURI(base, uriProvider, null);
		assertThat(actorURI).isEqualTo(URI.createURI("nasdanika://drawio/tests/root/container/actor/"));
		
		Optional<ModelElement> simpleConnectionOptional = document.stream(ConnectionBase.SOURCE).filter(ModelElement.class::isInstance).map(ModelElement.class::cast).filter(me -> "Simple Connection".equals(me.getLabel())).findFirst();
		assertThat(simpleConnectionOptional.isPresent()).isEqualTo(true);
		URI simpleConnectionURI = simpleConnectionOptional.get().resolveURI(base, uriProvider, ConnectionBase.SOURCE);
		assertThat(simpleConnectionURI).isEqualTo(URI.createURI("nasdanika://drawio/tests/root/simple-shape/simple-connection/"));
		
		Optional<ModelElement> toActorConnectionOptional = document.stream(ConnectionBase.SOURCE).filter(ModelElement.class::isInstance).map(ModelElement.class::cast).filter(me -> "To Actor".equals(me.getLabel())).findFirst();
		assertThat(toActorConnectionOptional.isPresent()).isEqualTo(true);
		URI toActorConnectionURI = toActorConnectionOptional.get().resolveURI(base, uriProvider, ConnectionBase.TARGET);
		assertThat(toActorConnectionURI).isEqualTo(URI.createURI("nasdanika://drawio/tests/root/container/actor/to-actor/"));
	}
	
	@Test 
	public void testLoadFromPngMetadata() throws Exception {
		List<Document> documents = Document.loadFromPngMetadata(getClass().getResource("illustration.png"));
		assertThat(documents).singleElement();
	}
	
	@Test
	public void testContainer() throws Exception {
		Document document = Document.create(false, null);
		Page page = document.createPage();
		page.setName("My first new page");
		
		Model model = page.getModel();
		Root root = model.getRoot();
		List<Layer<?>> layers = root.getLayers();
		assertThat(layers).singleElement();
		
		Layer<?> backgroundLayer = root.getLayers().get(0);
		
		Node container = backgroundLayer.createNode();
		Map<String, String> containerStyle = container.getStyle();
		containerStyle.put("swimlane", null);
		containerStyle.put("whitespace", "wrap");
		containerStyle.put("html", "1");
		containerStyle.put("collapsible", "0");
		container.getGeometry().setBounds(200, 100, 300, 400);
		container.setLabel("My Container");
		
		Node person = container.createNode();
		person.getGeometry().setBounds(100, 100, 48, 48);
		person.style("shape", "image");
		Map<String, String> personStyle = person.getStyle();
		personStyle.put("verticalLabelPosition", "bottom");
		personStyle.put("labelBackgroundColor", "default");
		personStyle.put("verticalAlign", "top");
		personStyle.put("aspect", "fixed");
		personStyle.put("imageAspect", "0");
		personStyle.put("image", "https://img.icons8.com/color/48/user-male.png");
		
		Files.writeString(new File("target/container.drawio").toPath(), document.save(null));
	}
	
	@Test 
	public void testDeleteAliceFromLayer() throws Exception {
		Document document = Document.load(getClass().getResource("alice-bob.drawio"));
		for (Page page: document.getPages()) {
			for (Layer<?> layer: page.getModel().getRoot().getLayers()) {
				for (LayerElement<?> layerElement: layer.getElements()) {
					if ("Alice".equals(layerElement.getLabel())) {
						layer.getElements().remove(layerElement);
						break;
					}
				}
			}
		}
		Files.writeString(new File("target/no-alice.drawio").toPath(), document.save(null));
	}	
	
	@Test 
	public void testDeleteBob() throws Exception {
		Document document = Document.load(getClass().getResource("alice-bob.drawio"));
		for (Page page: document.getPages()) {
			for (Layer<?> layer: page.getModel().getRoot().getLayers()) {
				for (LayerElement<?> layerElement: layer.getElements()) {
					if ("bobs-house".equals(layerElement.getId()) && layerElement instanceof Node node) {
						node.getElements().clear();
						break;
					}
				}
			}
		}
		Files.writeString(new File("target/no-bob.drawio").toPath(), document.save(null));
	}
	
	@Test
	public void testLoadStyle() {
		String styleStr = "rounded=1;whiteSpace=wrap;html=1;fillColor=#f5f5f5;strokeColor=#666666;gradientColor=#b3b3b3;";
		Map<String, String> styleMap = org.nasdanika.sdk.runtime.drawio.util.Util.loadStyle(styleStr);
		styleMap.entrySet().forEach(System.out::println);
	}
		
	@Test 
	public void testStyleMagicProperty() throws Exception {
		Document document = Document.load(getClass().getResource("alice-bob.drawio"));
		document.accept(el -> {
			if (el instanceof ModelElement) {
				ModelElement<?> mel = (ModelElement<?>) el;
				if ("Alice".equals(mel.getLabel())) {
					System.out.println(mel.getProperty("$style:fillColor"));
				}
			}
		}, null);	
	}
	
	@Test 
	public void testEnumerate() throws Exception {
		Document document = Document.load(getClass().getResource("alice-bob-enumerate.drawio"));
		document
			.stream()
			.filter(ModelElement.class::isInstance)
			.map(me -> (ModelElement<?>) me)
			.sorted(new EnumerateComparator())
			.forEach(me -> {
				Object ev = me.getEnumarateValue();
				if (ev != null) {
					System.out.println(ev + " " + ev.getClass() + " " + me);
				}
			});
	}
	
	@Test
	public void testSegmentMatch() {
	    Pattern CHILD_PATTERN = Pattern.compile("child\\[(.+?)\\]");
        String input = "child[status=active]";

        Matcher m = CHILD_PATTERN.matcher(input);
        if (m.matches()) {
            String qualifier = m.group(1);
            System.out.println("Qualifier: " + qualifier);
        } else {
            System.out.println("No match");
	    }
	}
		
	/**
	 * Does not create processor instances - wires endpoints and handlers in code.
	 * @throws Exception
	 */
	@Test 
	public void testSelectors() throws Exception {
		Document document = Document.load(getClass().getResource("alice-bob.drawio"));
		Node bob = document
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(n -> "Bob".equals(n.getLabel()))
			.findAny()
			.get();
		
		// Parent
		ModelElement<?> bobsHouse = bob.select("..").getFirst();
		assertEquals("bobs-house", bobsHouse.getId());
		
		// Child
		assertEquals("bob", bobsHouse.select("child").getFirst().getId());
		assertEquals("bob", bobsHouse.select("child[bob]").getFirst().getId());
		assertEquals("bob", bobsHouse.select("child[alias=bobby]").getFirst().getId());
		
		// Incoming Connection
		assertEquals("alice-to-bob", bob.select("incoming-connection").getFirst().getId());
		assertEquals("alice-to-bob", bob.select("incoming-connection[alice-to-bob]").getFirst().getId());
		assertEquals("alice-to-bob", bob.select("incoming-connection[classification=top-secret]").getFirst().getId());
		
		// Source
		ModelElement<?> alice = bob.select("incoming-connection/source").getFirst();
		assertEquals("alice", alice.getId());

		// Outgoing connection		
		assertEquals("alice-to-bob", alice.select("outgoing-connection").getFirst().getId());
		assertEquals("alice-to-bob", alice.select("outgoing-connection[alice-to-bob]").getFirst().getId());
		assertEquals("alice-to-bob", alice.select("outgoing-connection[classification=top-secret]").getFirst().getId());
		
		// Target
		ModelElement<?> bob2 = alice.select("outgoing-connection/target").getFirst();
		assertEquals("bob", bob2.getId());
		
		// Long path
		assertEquals("bobs-house", alice.select("outgoing-connection/target/..").getFirst().getId());		
	}		
	
	/**
	 * Does not create processor instances - wires endpoints and handlers in code.
	 * @throws Exception
	 */
	@Test 
	public void testProperyPaths() throws Exception {
		Document document = Document.load(getClass().getResource("alice-bob.drawio"));
		Node bob = document
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.filter(n -> "Bob".equals(n.getLabel()))
			.findAny()
			.get();
		
		// Parent
		assertEquals("bobs-house", bob.getProperty("../id"));
		
		// Child
		ModelElement<?> bobsHouse = bob.select("..").getFirst();
		assertEquals("bobby", bobsHouse.getProperty("child/alias"));
		assertEquals("bob", bobsHouse.getProperty("child[bob]/id"));
		assertEquals("bob", bobsHouse.getProperty("child[alias=bobby]/id"));
		
		// Incoming Connection
		assertEquals("top-secret", bob.getProperty("incoming-connection/classification"));
		assertEquals("alice-to-bob", bob.getProperty("incoming-connection[alice-to-bob]/id"));
		assertEquals("alice-to-bob", bob.getProperty("incoming-connection[classification=top-secret]/id"));
		
		// Source
		ModelElement<?> alice = bob.select("incoming-connection/source").getFirst();
		assertEquals("alice", alice.getId());

		// Outgoing connection		
		assertEquals("top-secret", alice.getProperty("outgoing-connection/classification"));
		assertEquals("alice-to-bob", alice.getProperty("outgoing-connection[alice-to-bob]/id"));
		assertEquals("alice-to-bob", alice.getProperty("outgoing-connection[classification=top-secret]/id"));
		
		// Target
		assertEquals("bobby", alice.getProperty("outgoing-connection/target/alias"));
		
		// Long path
		assertEquals("bobs-house", alice.getProperty("outgoing-connection/target/../id"));		
		
	}
	
}
