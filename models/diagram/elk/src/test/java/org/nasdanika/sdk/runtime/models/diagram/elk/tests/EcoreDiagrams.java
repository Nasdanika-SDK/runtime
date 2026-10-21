package org.nasdanika.sdk.runtime.models.diagram.elk.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.sdk.runtime.models.diagram.Connection;
import org.nasdanika.sdk.runtime.models.diagram.Diagram;
import org.nasdanika.sdk.runtime.models.diagram.DiagramFactory;
import org.nasdanika.sdk.runtime.models.diagram.Label;
import org.nasdanika.sdk.runtime.models.diagram.Node;
import org.nasdanika.sdk.runtime.models.diagram.Point;
import org.nasdanika.sdk.runtime.models.diagram.Port;

/**
 * Diagrams of Ecore models, in the diagram model, ready for layout:
 * <ul>
 * <li>a package diagram: the classes of a package, and the classes of other packages that they
 * extend or refer to;</li>
 * <li>a class context diagram: a class, its supertypes, its direct subtypes, the classes its
 * references lead to, and the classes whose references lead to it.</li>
 * </ul>
 * Classes are nodes inside nodes of their packages, and each node depicts its class through
 * {@code semanticElements}. Generalizations leave a port at the top of the subclass and arrive at
 * a port at the bottom of the superclass. References connect nodes. A reference and its opposite
 * are one connection, with a label at each end; any other reference has a label at its center.
 */
public class EcoreDiagrams {

	/** Property: what a diagram element stands for */
	public static final String KIND = "kind";

	public static final String PACKAGE = "package";
	public static final String CLASS = "class";
	public static final String GENERALIZATION = "generalization";
	public static final String REFERENCE = "reference";

	/** Property of a class node: abstract or interface */
	public static final String ABSTRACT = "abstract";

	/** Properties of a reference connection: containment at the source or at the target */
	public static final String CONTAINMENT = "containment";
	public static final String CONTAINER = "container";

	/** Property of a label: which end it names */
	public static final String PLACEMENT = "elk.edgeLabels.placement";

	public static final String TOP = "top";
	public static final String BOTTOM = "bottom";

	private final DiagramFactory factory = DiagramFactory.eINSTANCE;
	private final Diagram diagram;
	private final Map<EPackage, Node> packages = new LinkedHashMap<>();
	private final Map<EClass, Node> classes = new LinkedHashMap<>();

	private EcoreDiagrams(String id, String name) {
		diagram = factory.createDiagram();
		diagram.setId(id);
		diagram.setName(name);
		// tag::options[]
		var options = diagram.getProperties();
		options.put("elk.algorithm", "layered");
		options.put("elk.direction", "UP"); // <1>
		options.put("elk.edgeRouting", "ORTHOGONAL"); // <2>
		options.put("elk.hierarchyHandling", "INCLUDE_CHILDREN"); // <3>
		options.put("elk.layered.spacing.nodeNodeBetweenLayers", "50");
		options.put("elk.spacing.nodeNode", "40");
		options.put("elk.spacing.edgeLabel", "4");
		options.put("elk.layered.mergeEdges", "true"); // <4>
		// end::options[]
	}

	// tag::package[]
	/**
	 * The classes of a package, and the classes of other packages they extend or refer to.
	 */
	public static Diagram packageDiagram(EPackage ePackage) {
		String name = ePackage.getName();
		EcoreDiagrams diagrams = new EcoreDiagrams(name, name + " package");
		Set<EClass> members = new LinkedHashSet<>();
		for (EClassifier classifier: ePackage.getEClassifiers()) {
			if (classifier instanceof EClass eClass) {
				members.add(eClass);
			}
		}
		Set<EClass> all = new LinkedHashSet<>(members);
		for (EClass member: members) {
			all.addAll(member.getESuperTypes());
			for (EReference reference: member.getEReferences()) {
				all.add(reference.getEReferenceType());
			}
		}
		diagrams.classes(all);
		diagrams.generalizations();
		diagrams.references(members);
		return diagrams.diagram;
	}
	// end::package[]

	// tag::context[]
	/**
	 * A class, its supertypes, its direct subtypes in the class's package, the classes its
	 * references lead to, and the classes in its package whose references lead to it.
	 */
	public static Diagram classContext(EClass eClass) {
		EcoreDiagrams diagrams = new EcoreDiagrams(eClass.getName(), eClass.getName() + " context");
		Set<EClass> all = new LinkedHashSet<>();
		all.add(eClass);
		all.addAll(eClass.getEAllSuperTypes());
		Set<EClass> referrers = new LinkedHashSet<>();
		for (EClassifier classifier: eClass.getEPackage().getEClassifiers()) {
			if (classifier instanceof EClass other) {
				if (other.getESuperTypes().contains(eClass)) {
					all.add(other); // A direct subtype
				}
				for (EReference reference: other.getEReferences()) {
					if (reference.getEReferenceType() == eClass) {
						referrers.add(other);
					}
				}
			}
		}
		all.addAll(referrers);
		Set<EClass> sources = new LinkedHashSet<>(referrers);
		sources.add(eClass);
		for (EReference reference: eClass.getEAllReferences()) {
			all.add(reference.getEReferenceType());
			sources.add(reference.getEContainingClass());
		}
		diagrams.classes(all);
		diagrams.generalizations();
		diagrams.references(sources, reference -> reference.getEContainingClass() != eClass
				&& !eClass.getEAllSuperTypes().contains(reference.getEContainingClass())
				&& reference.getEReferenceType() != eClass);
		return diagrams.diagram;
	}
	// end::context[]

	// --- Nodes ---

	private void classes(Collection<EClass> eClasses) {
		for (EClass eClass: eClasses) {
			Node packageNode = packages.computeIfAbsent(eClass.getEPackage(), this::packageNode);
			Node node = factory.createNode();
			node.setId(eClass.getName());
			node.setName(eClass.getName());
			node.getSemanticElements().add(eClass);
			node.getProperties().put(KIND, CLASS);
			if (eClass.isAbstract() || eClass.isInterface()) {
				node.getProperties().put(ABSTRACT, "true");
			}
			packageNode.getChildren().add(node);
			classes.put(eClass, node);
		}
	}

	private Node packageNode(EPackage ePackage) {
		Node node = factory.createNode();
		node.setId(ePackage.getName());
		node.setName(ePackage.getName());
		node.getSemanticElements().add(ePackage);
		node.getProperties().put(KIND, PACKAGE);
		diagram.getChildren().add(node);
		return node;
	}

	// tag::port[]
	private Port port(Node node, String id, double y) {
		for (Port port: node.getPorts()) {
			if (id.equals(port.getId())) {
				return port;
			}
		}
		Port port = factory.createPort();
		port.setId(id);
		Point location = factory.createPoint();
		location.setX(0.5);
		location.setY(y); // <1>
		port.setLocation(location);
		node.getPorts().add(port);
		return port;
	}
	// end::port[]

	// --- Connections ---

	// tag::generalization[]
	private void generalizations() {
		for (Map.Entry<EClass, Node> entry: classes.entrySet()) {
			for (EClass superType: entry.getKey().getESuperTypes()) {
				Node superNode = classes.get(superType);
				if (superNode != null) {
					Connection connection = factory.createConnection();
					connection.setId(entry.getKey().getName() + "-extends-" + superType.getName());
					connection.setSource(port(entry.getValue(), TOP, 0)); // <1>
					connection.setTarget(port(superNode, BOTTOM, 1)); // <2>
					connection.getProperties().put(KIND, GENERALIZATION);
					diagram.getChildren().add(connection);
				}
			}
		}
	}
	// end::generalization[]

	private void references(Collection<EClass> sources) {
		references(sources, reference -> false);
	}

	// tag::references[]
	private void references(Collection<EClass> sources, Predicate<EReference> exclude) {
		Set<EReference> done = new HashSet<>();
		for (EClass source: sources) {
			for (EReference reference: source.getEReferences()) {
				Node target = classes.get(reference.getEReferenceType());
				if (target == null || done.contains(reference) || exclude.test(reference)) {
					continue;
				}
				EReference opposite = reference.getEOpposite();
				Connection connection = factory.createConnection();
				connection.setId(source.getName() + "." + reference.getName());
				connection.setSource(classes.get(source)); // <1>
				connection.setTarget(target);
				connection.getSemanticElements().add(reference);
				connection.getProperties().put(KIND, REFERENCE);
				if (reference.isContainment()) {
					connection.getProperties().put(CONTAINMENT, "true");
				}
				done.add(reference);
				if (opposite == null) {
					connection.getChildren().add(label(reference, "CENTER")); // <2>
				} else {
					connection.getSemanticElements().add(opposite);
					if (opposite.isContainment()) {
						connection.getProperties().put(CONTAINER, "true");
					}
					connection.getChildren().add(label(reference, "HEAD")); // <3>
					connection.getChildren().add(label(opposite, "TAIL"));
					done.add(opposite);
				}
				diagram.getChildren().add(connection);
			}
		}
	}

	private Label label(EReference reference, String placement) {
		Label label = factory.createLabel();
		label.setId(reference.getName());
		label.setText(reference.getName() + (reference.isMany() ? " *" : ""));
		label.getSemanticElements().add(reference);
		label.getProperties().put(PLACEMENT, placement);
		return label;
	}
	// end::references[]

	static List<Node> nodes(Diagram diagram) {
		List<Node> ret = new ArrayList<>();
		diagram.eAllContents().forEachRemaining(e -> {
			if (e instanceof Node node && !(node instanceof Label)) {
				ret.add(node);
			}
		});
		return ret;
	}

	static List<Connection> connections(Diagram diagram) {
		return diagram.getChildren().stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.toList();
	}

}
