package org.nasdanika.sdk.runtime.drawio.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.drawio.Connection;
import org.nasdanika.sdk.runtime.drawio.Document;
import org.nasdanika.sdk.runtime.drawio.Node;

/**
 * Chapter "The document model": the metamodel figure is checked against the API it depicts.
 */
public class MetamodelTests {

	// tag::check[]
	@Test
	public void testFigureMatchesApi() throws Exception {
		Document metamodel = Diagrams.load("metamodel.png");
		List<Node> types = metamodel
			.stream()
			.filter(Node.class::isInstance)
			.map(Node.class::cast)
			.toList();
		assertThat(types).hasSize(11);
		for (Node type: types) {
			assertThat(apiType(type).isInterface()).as(type.getLabel()).isTrue(); // <1>
		}

		List<Connection> relationships = metamodel
			.stream()
			.filter(Connection.class::isInstance)
			.map(Connection.class::cast)
			.toList();
		for (Connection relationship: relationships) {
			Class<?> source = apiType((Node) relationship.getSource());
			Class<?> target = apiType((Node) relationship.getTarget());
			switch (relationship.getProperty("relationship")) {
			case "extends" -> assertThat(target.isAssignableFrom(source)) // <2>
				.as(source.getSimpleName() + " extends " + target.getSimpleName())
				.isTrue();
			case "reference" -> {
				String name = relationship.getLabel();
				String getter = "get" + Character.toUpperCase(name.charAt(0)) + name.substring(1);
				Method method = source.getMethod(getter); // <3>
				assertThat(method.getGenericReturnType().getTypeName())
					.as(source.getSimpleName() + "." + getter + "()")
					.contains(target.getSimpleName());
			}
			default -> throw new AssertionError("Unknown relationship " + relationship);
			}
		}
	}

	private static Class<?> apiType(Node node) throws ClassNotFoundException {
		return Class.forName(Document.class.getPackageName() + "." + node.getLabel());
	}
	// end::check[]

}
