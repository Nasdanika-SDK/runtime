package org.nasdanika.sdk.runtime.common.flow;

import java.util.Objects;
import java.util.concurrent.Flow;

/**
 * Relays an upstream publisher's signals to a downstream subscriber through a {@link Pump}, so
 * they are delivered on the pump and serialized with the rest of its work. Requests and
 * cancellations are made from the pump too. All fields are confined to the pump.
 */
final class ConfinedSubscriber<T> implements Flow.Subscriber<T>, Flow.Subscription, Pump.Waiter {

	enum Mode {

		/**
		 * Serialization only.
		 */
		PLAIN,

		/**
		 * Registered as a {@link Pump.Waiter} while items it requested are outstanding, so that
		 * an idle pump completes it under {@link Pump.IdlePolicy#COMPLETE}.
		 */
		WAITER,

		/**
		 * In flight from subscription to termination or cancellation, so the pump does not go
		 * idle while the upstream is producing outside it.
		 */
		TRACKED

	}

	private final Pump pump;
	private final Flow.Subscriber<? super T> downstream;
	private final String description;
	private final Mode mode;

	private Flow.Subscription upstream;
	private boolean terminated;
	private long outstanding;
	private Runnable registration;
	private long inFlightId = -1;

	ConfinedSubscriber(Pump pump, Flow.Subscriber<? super T> downstream, String description, Mode mode) {
		this.pump = pump;
		this.downstream = Objects.requireNonNull(downstream, "subscriber");
		this.description = description;
		this.mode = mode;
		if (mode == Mode.TRACKED) {
			inFlightId = pump.beginInFlight(description);
		}
	}

	// --- Upstream signals ---

	@Override
	public void onSubscribe(Flow.Subscription subscription) {
		Objects.requireNonNull(subscription, "subscription");
		pump.execute(description, () -> {
			if (upstream != null || terminated) {
				subscription.cancel();
				return;
			}
			upstream = subscription;
			downstream.onSubscribe(this);
		});
	}

	@Override
	public void onNext(T item) {
		pump.execute(description, () -> {
			if (terminated) {
				return;
			}
			if (outstanding != Long.MAX_VALUE && --outstanding == 0) {
				unregister();
			}
			downstream.onNext(item);
		});
	}

	@Override
	public void onError(Throwable throwable) {
		pump.execute(description, () -> terminate(throwable));
	}

	@Override
	public void onComplete() {
		pump.execute(description, () -> terminate(null));
	}

	// --- Downstream requests ---

	@Override
	public void request(long n) {
		onPump(() -> {
			if (terminated) {
				return;
			}
			if (n > 0) {
				outstanding = Flows.addCap(outstanding, n);
				register();
			}
			upstream.request(n); // n <= 0 is passed on, so that upstream signals the error per rule 3.9
		});
	}

	@Override
	public void cancel() {
		onPump(() -> {
			if (terminated) {
				return;
			}
			terminated = true;
			finish();
			upstream.cancel();
		});
	}

	// --- Waiter ---

	@Override
	public String describe() {
		return description + (outstanding == Long.MAX_VALUE ? " (unbounded demand)" : " (" + outstanding + " item(s) requested)");
	}

	@Override
	public void release() {
		registration = null;
		if (!terminated) {
			terminated = true;
			finish();
			upstream.cancel();
			downstream.onComplete();
		}
	}

	// --- Implementation ---

	private void terminate(Throwable error) {
		if (terminated) {
			return;
		}
		terminated = true;
		finish();
		if (error == null) {
			downstream.onComplete();
		} else {
			downstream.onError(error);
		}
	}

	private void finish() {
		unregister();
		if (inFlightId != -1) {
			pump.endInFlight(inFlightId);
			inFlightId = -1;
		}
	}

	private void register() {
		if (mode == Mode.WAITER && registration == null && outstanding > 0) {
			registration = pump.register(this);
		}
	}

	private void unregister() {
		if (registration != null) {
			registration.run();
			registration = null;
		}
	}

	private void onPump(Runnable action) {
		if (pump.isPumping()) {
			action.run();
		} else {
			pump.execute(description, action);
		}
	}

}
