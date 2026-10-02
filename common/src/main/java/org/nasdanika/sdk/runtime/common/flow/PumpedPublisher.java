package org.nasdanika.sdk.runtime.common.flow;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

/**
 * A publisher whose signals, and the work they cause, go through one {@link Pump}, with terminals
 * that block by pumping until {@code onComplete} arrives.
 *
 * <pre>
 * var pumped = PumpedPublisher.of(source, Pump.IdlePolicy.COMPLETE);
 * List&lt;ModelEvent&gt; events = pumped.toList(); // pumps on this thread, or waits for the drainer
 * </pre>
 *
 * While a subscription has outstanding demand it is a {@link Pump.Waiter}: under
 * {@link Pump.IdlePolicy#COMPLETE} an idle pump completes it ("nothing more can arrive"), under
 * {@link Pump.IdlePolicy#FAIL} it is reported as a stall, and under {@link Pump.IdlePolicy#WAIT}
 * the pump waits for upstream. A subscription that has received everything it asked for is the
 * consumer's turn, not a stall, and is left alone.
 */
public final class PumpedPublisher<T> implements Flow.Publisher<T> {

	private final Flow.Publisher<? extends T> source;
	private final Pump pump;
	private final String description;

	public PumpedPublisher(Flow.Publisher<? extends T> source, Pump pump, String description) {
		this.source = Objects.requireNonNull(source, "source");
		this.pump = Objects.requireNonNull(pump, "pump");
		this.description = description == null ? String.valueOf(source) : description;
	}

	/**
	 * Over a new single-threaded pump with the given idle policy.
	 */
	public static <T> PumpedPublisher<T> of(Flow.Publisher<? extends T> source, Pump.IdlePolicy idlePolicy) {
		return of(source, new Pump(idlePolicy));
	}

	public static <T> PumpedPublisher<T> of(Flow.Publisher<? extends T> source, Pump pump) {
		return new PumpedPublisher<>(source, pump, null);
	}

	public Pump getPump() {
		return pump;
	}

	@Override
	public void subscribe(Flow.Subscriber<? super T> subscriber) {
		Objects.requireNonNull(subscriber, "subscriber");
		pump.execute("subscribe to " + description, () -> source.subscribe(new ConfinedSubscriber<T>(pump, subscriber, description, ConfinedSubscriber.Mode.WAITER)));
	}

	public List<T> toList() {
		return pump.join(Flows.toList(this));
	}

	public Optional<T> first() {
		return pump.join(Flows.first(this));
	}

	public void forEach(Consumer<? super T> action) {
		pump.join(Flows.forEach(this, action));
	}

}
