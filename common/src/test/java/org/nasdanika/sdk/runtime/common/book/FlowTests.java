package org.nasdanika.sdk.runtime.common.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory.Mapping;
import org.nasdanika.sdk.runtime.common.flow.StallException;
import org.nasdanika.sdk.runtime.common.flow.Transformer;
import org.nasdanika.sdk.runtime.common.flow.Transformer.Context;

/**
 * Flows, the pump and the transformer: wiring objects that refer to each other.
 */
class FlowTests {

	@Test
	void operators() {
		// tag::operators[]
		Flow.Publisher<Integer> numbers = Flows.fromIterable(List.of(1, 2, 3, 4, 5, 6, 7, 8));
		Flow.Publisher<Integer> even = Flows.filter(numbers, n -> n % 2 == 0);
		Flow.Publisher<String> labels = Flows.map(Flows.take(even, 3), n -> "#" + n);
		assertThat(Flows.toList(labels).join()).containsExactly("#2", "#4", "#6"); // <1>

		try (Stream<String> stream = Flows.toStream(labels)) { // <2>
			assertThat(stream.count()).isEqualTo(3);
		}
		// end::operators[]
	}

	@Test
	void pump() {
		// tag::pump[]
		Pump pump = new Pump();
		List<String> log = new ArrayList<>();
		CompletableFuture<String> result = new CompletableFuture<>();
		pump.execute(() -> {
			log.add("a");
			pump.execute(() -> {
				log.add("c");
				result.complete("done");
			});
		});
		pump.execute(() -> log.add("b"));
		assertThat(log).isEmpty(); // <1>
		assertThat(pump.join(result)).isEqualTo("done"); // <2>
		assertThat(log).containsExactly("a", "b", "c");
		// end::pump[]
	}

	@Test
	void stall() {
		// tag::stall[]
		Pump pump = new Pump();
		pump.when(new CompletableFuture<>(), "waits for a reply nobody sends", (value, error) -> {});
		assertThatThrownBy(pump::settle)
			.isInstanceOf(StallException.class)
			.hasMessageContaining("parked: waits for a reply nobody sends");
		// end::stall[]
	}

	// tag::graph-types[]
	record Node(String name, List<String> references) {}

	static final class Vertex {

		final String name;
		final List<Vertex> connections = new ArrayList<>();

		Vertex(String name) {
			this.name = name;
		}

	}
	// end::graph-types[]

	@Test
	void wiring() {
		// tag::wiring[]
		Map<String, Node> nodes = Map.of(
			"a", new Node("a", List.of("b")),
			"b", new Node("b", List.of("a", "c")), // a and b refer to each other
			"c", new Node("c", List.of()));

		Transformer<String, Vertex> transformer = new Transformer<>((name, context) -> {
			Vertex vertex = new Vertex(name);
			for (String reference: nodes.get(name).references()) {
				Flows.forEach(context.get(reference), vertex.connections::add); // <1>
			}
			return Flows.of(vertex); // <2>
		});

		Map<String, List<Vertex>> vertices = transformer.transform(List.of("a")); // <3>
		Vertex a = vertices.get("a").get(0);
		Vertex b = vertices.get("b").get(0);
		assertThat(a.connections).containsExactly(b);
		assertThat(b.connections.get(0)).isSameAs(a);
		assertThat(vertices).containsKey("c");
		// end::wiring[]
	}

	@Test
	void waitingCycle() {
		// tag::waiting[]
		Transformer<String, String> transformer = new Transformer<>((name, context) -> {
			String other = name.equals("x") ? "y" : "x";
			return Flows.fromFuture(Flows.toList(context.get(other)) // Waits for the other
				.thenApply(targets -> name + targets));
		});
		assertThatThrownBy(() -> transformer.transform(List.of("x")))
			.isInstanceOf(StallException.class)
			.hasMessageContaining("cycle: x -> y -> x");
		// end::waiting[]
	}

	// tag::mappings[]
	public static class Describer {

		@Mapping
		public String number(Number number) {
			return "number " + number;
		}

		@Mapping
		public String integer(Integer integer) { // <1>
			return "integer " + integer;
		}

		@Mapping
		public Flow.Publisher<String> text(CharSequence text, Context<Object, String> context) {
			return Flows.concat(Flows.of("text " + text), context.get(text.length())); // <2>
		}

	}
	// end::mappings[]

	@Test
	void mappings() {
		// tag::mappings-test[]
		Transformer<Object, String> transformer = new Transformer<>(
			ReflectiveFactory.first(MethodHandles.lookup(), new Describer()));
		Map<Object, List<String>> described = transformer.transform(List.of(1.5, 7, "abc"));
		assertThat(described.get(1.5)).containsExactly("number 1.5");
		assertThat(described.get(7)).containsExactly("integer 7");
		assertThat(described.get("abc")).containsExactly("text abc", "integer 3");
		// end::mappings-test[]
	}

	@Test
	void longSources() {
		Flow.Publisher<Integer> many = Flows.concatMap(Flows.fromIterable(IntStream.range(0, 10_000).boxed().toList()), Flows::of);
		assertThat(Flows.toList(many).join()).hasSize(10_000);
	}

}
