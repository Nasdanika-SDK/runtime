package org.nasdanika.sdk.runtime.common.flow;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

class TestPump {

	@Test
	void joinPumpsOnTheCallingThread() {
		Pump pump = new Pump();
		Thread caller = Thread.currentThread();
		List<String> log = new ArrayList<>();
		CompletableFuture<String> result = new CompletableFuture<>();
		pump.execute(() -> {
			log.add("a");
			pump.execute(() -> {
				log.add("c");
				assertThat(Thread.currentThread()).isSameAs(caller);
				result.complete("done");
			});
		});
		pump.execute(() -> log.add("b"));
		assertThat(log).isEmpty(); // Nothing runs until somebody pumps
		assertThat(pump.join(result)).isEqualTo("done");
		assertThat(log).containsExactly("a", "b", "c");
	}

	@Test
	void nestedJoinIsRefused() {
		Pump pump = new Pump();
		CompletableFuture<Void> outer = new CompletableFuture<>();
		pump.execute(() -> {
			try {
				pump.join(new CompletableFuture<>());
			} catch (IllegalStateException e) {
				outer.complete(null);
			}
		});
		pump.join(outer);
	}

	@Test
	void blindYieldRetriesUntilDone() {
		Pump pump = new Pump();
		AtomicInteger counter = new AtomicInteger();
		List<String> log = new ArrayList<>();
		pump.submit("waits for 3", () -> {
			if (counter.get() < 3) {
				return false;
			}
			log.add("done at " + counter.get());
			return true;
		});
		for (int i = 0; i < 3; ++i) {
			pump.execute(counter::incrementAndGet);
		}
		pump.settle();
		assertThat(log).containsExactly("done at 3");
	}

	@Test
	void blindYieldWithoutProgressIsAStall() {
		Pump pump = new Pump();
		pump.submit("waits forever", () -> false);
		assertThatThrownBy(pump::settle)
			.isInstanceOf(StallException.class)
			.hasMessageContaining("waits forever");
	}

	@Test
	void parkedItemRunsWhenItsReasonCompletes() {
		Pump pump = new Pump();
		CompletableFuture<String> reason = new CompletableFuture<>();
		List<String> log = new ArrayList<>();
		pump.when(reason, "waits for the reason", (value, error) -> log.add("got " + value));
		pump.execute(() -> reason.complete("it"));
		pump.settle();
		assertThat(log).containsExactly("got it");
	}

	@Test
	void parkedItemWithoutAProducerIsAStall() {
		Pump pump = new Pump();
		pump.when(new CompletableFuture<>(), "waits for nothing", (value, error) -> {});
		assertThatThrownBy(pump::settle)
			.isInstanceOf(StallException.class)
			.hasMessageContaining("parked: waits for nothing");
	}

	@Test
	void trackedWorkKeepsThePumpBusy() {
		Pump pump = new Pump();
		CompletableFuture<String> external = new CompletableFuture<>();
		CompletableFuture<String> tracked = pump.track(external, "external call");
		Thread.ofVirtual().start(() -> {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			external.complete("response");
		});
		assertThat(pump.join(tracked)).isEqualTo("response");
	}

	@Test
	void untrackedExternalWorkIsAStall() {
		Pump pump = new Pump();
		assertThatThrownBy(() -> pump.join(new CompletableFuture<>()))
			.isInstanceOf(StallException.class);
	}

	@Test
	void stepBudget() {
		Pump pump = new Pump(Pump.Options.DEFAULT.withStepBudget(10));
		Runnable[] loop = new Runnable[1];
		loop[0] = () -> pump.execute("loop", loop[0]);
		pump.execute("loop", loop[0]);
		assertThatThrownBy(pump::settle).isInstanceOf(PumpException.class).hasMessageContaining("budget");
	}

	@Test
	void taskFailureFailsThePump() {
		Pump pump = new Pump();
		pump.execute("boom", () -> { throw new IllegalStateException("boom"); });
		assertThatThrownBy(pump::settle).isInstanceOf(PumpException.class).hasRootCauseMessage("boom");
	}

	/**
	 * A publisher that emits and never completes.
	 */
	private static <T> Flow.Publisher<T> endless(List<T> items) {
		return subscriber -> subscriber.onSubscribe(new Flow.Subscription() {

			int index;

			@Override
			public void request(long n) {
				for (long i = 0; i < n && index < items.size(); ++i) {
					subscriber.onNext(items.get(index++));
				}
			}

			@Override
			public void cancel() {
				// Nothing to release
			}

		});
	}

	@Test
	void completePolicyCompletesAnIdlePublisher() {
		PumpedPublisher<String> pumped = PumpedPublisher.of(endless(List.of("a", "b")), Pump.IdlePolicy.COMPLETE);
		assertThat(pumped.toList()).containsExactly("a", "b");
	}

	@Test
	void failPolicyReportsAnIdlePublisher() {
		PumpedPublisher<String> pumped = PumpedPublisher.of(endless(List.of("a", "b")), Pump.IdlePolicy.FAIL);
		assertThatThrownBy(pumped::toList)
			.isInstanceOf(StallException.class)
			.hasMessageContaining("unbounded demand");
	}

	@Test
	void pumpedPublisherOverACompletingSource() {
		assertThat(PumpedPublisher.of(Flows.of(1, 2, 3), Pump.IdlePolicy.FAIL).toList()).containsExactly(1, 2, 3);
	}

	@Test
	void executorDrainsWithoutABlockingCaller() throws Exception {
		Pump pump = new Pump(Pump.Options.DEFAULT.withExecutor(Pump.Options.VIRTUAL_THREADS));
		CompletableFuture<Boolean> ran = new CompletableFuture<>();
		pump.execute(() -> ran.complete(pump.isPumping()));
		assertThat(ran.get()).isTrue();
	}

}
