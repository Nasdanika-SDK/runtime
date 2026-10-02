package org.nasdanika.sdk.runtime.common.flow;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class TestFlows {

	@Test
	void operators() {
		Flow.Publisher<Integer> numbers = Flows.fromIterable(IntStream.rangeClosed(1, 10).boxed().toList());
		Flow.Publisher<String> result = Flows.map(Flows.take(Flows.filter(numbers, n -> n % 2 == 0), 3), n -> "#" + n);
		assertThat(Flows.toList(result).join()).containsExactly("#2", "#4", "#6");
	}

	@Test
	void lazyAndResubscribable() {
		Flow.Publisher<Integer> doubled = Flows.map(Flows.of(1, 2, 3), n -> n * 2);
		assertThat(Flows.toList(doubled).join()).containsExactly(2, 4, 6);
		assertThat(Flows.toList(doubled).join()).containsExactly(2, 4, 6);
	}

	@Test
	void demandIsRespected() {
		List<Integer> received = new ArrayList<>();
		List<Flow.Subscription> subscription = new ArrayList<>();
		Flows.filter(Flows.of(1, 2, 3, 4, 5, 6), n -> n > 2).subscribe(new Flow.Subscriber<Integer>() {

			@Override
			public void onSubscribe(Flow.Subscription s) {
				subscription.add(s);
			}

			@Override
			public void onNext(Integer item) {
				received.add(item);
			}

			@Override
			public void onError(Throwable throwable) {
				throw new AssertionError(throwable);
			}

			@Override
			public void onComplete() {
				received.add(-1);
			}

		});
		assertThat(received).isEmpty();
		subscription.get(0).request(1);
		assertThat(received).containsExactly(3);
		subscription.get(0).request(2);
		assertThat(received).containsExactly(3, 4, 5);
		subscription.get(0).request(5);
		assertThat(received).containsExactly(3, 4, 5, 6, -1);
	}

	@Test
	void mapperExceptionBecomesError() {
		Flow.Publisher<Integer> failing = Flows.map(Flows.of(1, 2, 3), n -> {
			if (n == 2) {
				throw new IllegalStateException("two");
			}
			return n;
		});
		assertThatThrownBy(() -> Flows.toList(failing).join())
			.isInstanceOf(CompletionException.class)
			.hasCauseInstanceOf(IllegalStateException.class);
	}

	@Test
	void concatMapIsOrdered() {
		Flow.Publisher<String> result = Flows.concatMap(Flows.of("a", "b", "c"), s -> Flows.of(s + 1, s + 2));
		assertThat(Flows.toList(result).join()).containsExactly("a1", "a2", "b1", "b2", "c1", "c2");
		assertThat(Flows.first(result).join()).contains("a1");
		assertThat(Flows.toList(Flows.concat(Flows.of(1), Flows.empty(), Flows.of(2, 3))).join()).containsExactly(1, 2, 3);
	}

	@Test
	void concatMapDoesNotRecurseOnLongSources() {
		Flow.Publisher<Integer> result = Flows.concatMap(Flows.fromIterable(IntStream.range(0, 100_000).boxed().toList()), Flows::of);
		assertThat(Flows.toList(result).join()).hasSize(100_000);
	}

	@Test
	void futureAndStreamSources() {
		CompletableFuture<String> future = new CompletableFuture<>();
		CompletableFuture<List<String>> result = Flows.toList(Flows.fromFuture(future));
		assertThat(result).isNotDone();
		future.complete("done");
		assertThat(result.join()).containsExactly("done");

		Flow.Publisher<Integer> streamed = Flows.fromStream(Stream.of(1, 2));
		assertThat(Flows.toList(streamed).join()).containsExactly(1, 2);
		assertThatThrownBy(() -> Flows.toList(streamed).join()).hasCauseInstanceOf(IllegalStateException.class);
	}

	@Test
	void toStreamFromAnotherThread() throws Exception {
		try (SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>()) {
			Thread producer = Thread.ofVirtual().unstarted(() -> {
				IntStream.range(0, 100).forEach(publisher::submit);
				publisher.close();
			});
			try (Stream<Integer> stream = Flows.toStream(publisher, 4)) {
				producer.start();
				assertThat(stream.mapToInt(Integer::intValue).sum()).isEqualTo(4950);
			}
		}
	}

	@Test
	void onTerminate() {
		List<String> log = new ArrayList<>();
		Flows.toList(Flows.onTerminate(Flows.of(1), e -> log.add("terminated " + e))).join();
		assertThat(log).containsExactly("terminated null");
		Optional<Integer> none = Flows.<Integer>first(Flows.empty()).join();
		assertThat(none).isEmpty();
		assertThat(Flows.toList(Flows.mapNotNull(Flows.of(1, 2, 3), n -> n == 2 ? null : n)).join().stream().map(String::valueOf).collect(Collectors.joining())).isEqualTo("13");
	}

}
