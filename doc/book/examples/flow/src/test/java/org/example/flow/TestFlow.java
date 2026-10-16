package org.example.flow;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.stream.Stream;

import org.example.flow.ModuleGraph.Description;
import org.example.flow.ModuleGraph.Node;
import org.example.flow.Outline.Chapter;
import org.example.flow.Outline.Note;
import org.example.flow.Outline.Paragraph;
import org.example.flow.Outline.Section;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.StallException;
import org.nasdanika.sdk.runtime.common.flow.Transformer;

class TestFlow {

	@Test
	void operators() {
		// tag::operators[]
		Flow.Publisher<String> titles =
				Flows.of("Design Patterns", "Domain-Driven Design", "War and Peace");
		Flow.Publisher<String> d = Flows.filter(titles, title -> title.startsWith("D"));
		Flow.Publisher<Integer> lengths = Flows.map(d, String::length);
		CompletableFuture<List<Integer>> result = Flows.toList(lengths); // Nothing ran until toList
		assertThat(result.join()).containsExactly(15, 20);
		// end::operators[]
	}

	@Test
	void pullSide() {
		// tag::stream[]
		// On a virtual thread blocking is cheap, so the pull side is java.util.stream
		try (Stream<String> stream = Flows.toStream(Flows.of("a", "bb", "ccc"))) {
			assertThat(stream.mapToInt(String::length).sum()).isEqualTo(6);
		}
		// end::stream[]
	}

	@Test
	void joinPumps() {
		// tag::join[]
		Pump pump = new Pump();                    // No executor: nothing runs until somebody pumps
		CompletableFuture<String> answer = new CompletableFuture<>();
		pump.execute("ask", () -> pump.execute("answer", () -> answer.complete("42")));
		assertThat(pump.join(answer)).isEqualTo("42"); // The calling thread drains the queue
		// end::join[]
	}

	@Test
	void trackWorkThatLeavesThePump() {
		// tag::track[]
		Pump pump = new Pump();
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			// Work that leaves the pump, like a remote call
			CompletableFuture<String> call = CompletableFuture.supplyAsync(() -> "response", executor);
			CompletableFuture<String> tracked = pump.track(call, "remote call"); // In flight
			assertThat(pump.join(tracked)).isEqualTo("response");
		}
		// end::track[]
	}

	@Test
	void stallsAreReported() {
		// tag::stall[]
		Pump pump = new Pump();
		CompletableFuture<String> nobodyCompletesThis = new CompletableFuture<>();
		pump.when(nobodyCompletesThis, "waiting for a reply that never comes", (value, error) -> {});
		assertThatThrownBy(pump::settle)
			.isInstanceOf(StallException.class)
			.hasMessageContaining("waiting for a reply that never comes");
		// end::stall[]
	}

	@Test
	void cyclicGraphWires() {
		// tag::wiring[]
		Map<String, Description> descriptions = Map.of(
				"app", new Description("app", List.of("model", "common")),
				"model", new Description("model", List.of("common", "app")),   // A cycle back to app
				"common", new Description("common", List.of()));

		Map<String, List<Node>> graph = ModuleGraph.build(descriptions, "app");

		assertThat(graph.keySet()).containsExactly("app", "model", "common"); // In request order
		Node app = graph.get("app").getFirst();
		Node model = graph.get("model").getFirst();
		Node common = graph.get("common").getFirst();
		assertThat(app.reads()).containsExactlyInAnyOrder(model, common);
		assertThat(model.reads()).containsExactlyInAnyOrder(common, app);     // The cycle, wired
		// end::wiring[]
		// References arrive in the order their targets are produced: app's node existed already
		assertThat(model).hasToString("model -> [app, common]");
	}

	@Test
	void waitingCycleFails() {
		// tag::cycle[]
		// Each source needs the other's targets before it can emit its own
		Transformer<String, String> transformer = new Transformer<>((name, context) -> {
			String other = name.equals("chicken") ? "egg" : "chicken";
			CompletableFuture<List<String>> others = Flows.toList(context.get(other));
			return Flows.fromFuture(others.thenApply(targets -> name + targets));
		});
		assertThatThrownBy(() -> transformer.transform(List.of("chicken")))
			.isInstanceOf(StallException.class)
			.hasMessageContaining("cycle: chicken -> egg -> chicken");
		// end::cycle[]
	}

	@Test
	void mappingMethods() {
		// tag::outline[]
		Chapter chapter = new Chapter("Flows", List.of(
				new Paragraph("Publishers, subscribers and pumps."),
				new Section("The pump", List.of(
						new Paragraph("Block by pumping."),
						new Note("Never join on the pumping thread.")))));
		assertThat(Outline.render(chapter)).containsExactly(
				"# Flows",
				"Publishers, subscribers and pumps.",
				"## The pump",
				"Block by pumping.",
				"> Note: Never join on the pumping thread.");
		// end::outline[]
	}

}
