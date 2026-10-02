package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.concurrent.Executor;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Supplier;

/**
 * Multicasts span events to subscribers through a {@link SubmissionPublisher}. Instrumented code
 * must never block or fail because somebody is watching it, so events are offered, not submitted:
 * a subscriber whose buffer is full loses the event, and the loss is counted. With no subscribers,
 * events are not even created.
 */
final class SpanEventHub implements AutoCloseable {

	static final Executor VIRTUAL_THREADS = command -> Thread.ofVirtual().name("span-events").start(command);

	private final SubmissionPublisher<SpanEvent> publisher;
	private final LongAdder dropped = new LongAdder();

	SpanEventHub(Executor executor, int maxBufferCapacity) {
		publisher = new SubmissionPublisher<>(executor, maxBufferCapacity);
	}

	SpanEventHub() {
		this(VIRTUAL_THREADS, Flow.defaultBufferSize());
	}

	boolean isActive() {
		return publisher.hasSubscribers();
	}

	void publish(Supplier<? extends SpanEvent> event) {
		if (!publisher.hasSubscribers()) {
			return;
		}
		try {
			publisher.offer(event.get(), (subscriber, item) -> {
				dropped.increment();
				return false;
			});
		} catch (IllegalStateException e) {
			// Closed: instrumentation keeps working, nobody is listening
		}
	}

	void subscribe(Flow.Subscriber<? super SpanEvent> subscriber) {
		publisher.subscribe(subscriber);
	}

	long getDroppedCount() {
		return dropped.sum();
	}

	@Override
	public void close() {
		publisher.close();
	}

}
