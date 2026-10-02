package org.nasdanika.sdk.runtime.common.flow;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Flow;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory.Mapping;

class TestTransformer {

	record Node(String name, List<String> references) {}

	static final class Vertex {

		final String name;
		final List<Vertex> connections = new ArrayList<>();

		Vertex(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name + "->" + connections.stream().map(v -> v.name).toList();
		}

	}

	@Test
	void cyclicGraphWiresBySubscription() {
		Map<String, Node> nodes = Map.of(
				"a", new Node("a", List.of("b")),
				"b", new Node("b", List.of("a", "c")),
				"c", new Node("c", List.of()));

		Transformer<String, Vertex> transformer = new Transformer<>((name, context) -> {
			Vertex vertex = new Vertex(name);
			for (String reference: nodes.get(name).references()) {
				Flows.forEach(context.get(reference), vertex.connections::add);
			}
			return Flows.of(vertex);
		});

		Map<String, List<Vertex>> result = transformer.transform(List.of("a"));
		assertThat(result.keySet()).containsExactly("a", "b", "c"); // Related sources resolved too, in request order
		assertThat(result.get("a").get(0)).hasToString("a->[b]");
		assertThat(result.get("b").get(0)).hasToString("b->[a, c]");
		assertThat(result.get("b").get(0).connections.get(0)).isSameAs(result.get("a").get(0));
	}

	@Test
	void oneSourceManyTargets() {
		Transformer<Integer, Integer> transformer = new Transformer<>((n, context) -> Flows.of(n, n * 10, n * 100));
		assertThat(transformer.transform(List.of(1, 2))).containsExactly(
				Map.entry(1, List.of(1, 10, 100)),
				Map.entry(2, List.of(2, 20, 200)));
	}

	@Test
	void waitingCycleIsReportedWithItsPath() {
		// Each source needs the other's targets before it can emit its own
		Transformer<String, String> transformer = new Transformer<>((name, context) -> {
			String other = name.equals("x") ? "y" : "x";
			return Flows.fromFuture(Flows.toList(context.get(other)).thenApply(targets -> name + targets));
		});
		assertThatThrownBy(() -> transformer.transform(List.of("x")))
			.isInstanceOf(StallException.class)
			.hasMessageContaining("cycle: x -> y -> x");
	}

	@Test
	void selfDependencyIsReported() {
		Transformer<String, String> transformer = new Transformer<>((name, context) -> Flows.fromFuture(Flows.toList(context.get(name)).thenApply(List::toString)));
		assertThatThrownBy(() -> transformer.transform(List.of("me")))
			.isInstanceOf(StallException.class)
			.hasMessageContaining("cycle: me -> me");
	}

	@Test
	void dependencyBeforeEmitting() {
		Transformer<Integer, Integer> factorial = new Transformer<>((n, context) -> n == 0
				? Flows.of(1)
				: Flows.fromFuture(Flows.toList(context.get(n - 1)).thenApply(previous -> n * previous.get(0))));
		assertThat(factorial.transform(List.of(5)).get(5)).containsExactly(120);
	}

	public static class Shapes {

		@Mapping
		public String number(Number number) {
			return "number " + number;
		}

		@Mapping
		public String integer(Integer integer) {
			return "integer " + integer;
		}

		@Mapping(priority = 10)
		public Flow.Publisher<String> text(CharSequence text, Transformer.Context<Object, String> context) {
			return Flows.concat(Flows.of("text " + text), context.get(text.length()));
		}

	}

	@Test
	void reflectiveFirstIsPolymorphic() {
		Transformer<Object, String> transformer = new Transformer<>(ReflectiveFactory.first(MethodHandles.lookup(), new Shapes()));
		Map<Object, List<String>> result = transformer.transform(List.of(1.5, 7, "abc"));
		assertThat(result.get(1.5)).containsExactly("number 1.5");
		assertThat(result.get(7)).containsExactly("integer 7");
		assertThat(result.get("abc")).containsExactly("text abc", "integer 3");
	}

	@Test
	void reflectiveAllContributesEveryMatch() {
		Transformer<Object, String> transformer = new Transformer<>(ReflectiveFactory.all(MethodHandles.lookup(), new Shapes()));
		assertThat(transformer.transform(List.of(7)).get(7)).containsExactly("integer 7", "number 7");
	}

}
