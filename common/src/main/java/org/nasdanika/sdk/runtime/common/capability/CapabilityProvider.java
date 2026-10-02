package org.nasdanika.sdk.runtime.common.capability;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Flow;
import java.util.function.Function;

import org.nasdanika.sdk.runtime.common.flow.Flows;

/**
 * Provides capabilities satisfying a requirement. Specializations may carry information about
 * the capability, such as quality attributes, to choose between providers without subscribing.
 */
@FunctionalInterface
public interface CapabilityProvider<T> {

	/**
	 * @return Publisher of the provided capabilities. Subscribed lazily, possibly more than once
	 */
	Flow.Publisher<T> getPublisher();

	/**
	 * Null capabilities are dropped.
	 */
	@SafeVarargs
	static <T> CapabilityProvider<T> of(T... capabilities) {
		Flow.Publisher<T> publisher = Flows.fromIterable(Arrays.stream(capabilities).filter(Objects::nonNull).toList());
		return () -> publisher;
	}

	static <T> CapabilityProvider<T> of(Flow.Publisher<T> publisher) {
		Objects.requireNonNull(publisher, "publisher");
		return () -> publisher;
	}

	static <T> CapabilityProvider<T> ofError(Throwable error) {
		Flow.Publisher<T> publisher = Flows.error(error);
		return () -> publisher;
	}

	default <V> CapabilityProvider<V> map(Function<? super T, ? extends V> mapper) {
		return () -> Flows.map(getPublisher(), mapper);
	}

}
