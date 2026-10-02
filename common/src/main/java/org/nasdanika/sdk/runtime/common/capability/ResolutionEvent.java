package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;

/**
 * What happened during a resolution. A sealed hierarchy of records rather than a wide listener
 * interface, so that adding an event does not break implementations and consumers can pattern
 * match.
 *
 * <p>
 * {@link DependencyRequested} plus {@link Resolved} carry enough to rebuild the dependency graph
 * (requirement, factory, dependency requirements), which the old loader accumulated in a field
 * and which is now one listener: {@link ResolutionListener.FactoryNodeCollector}.
 */
public sealed interface ResolutionEvent {

	/**
	 * The requirement this event concerns.
	 */
	Object requirement();

	/**
	 * Resolution of a requirement began.
	 *
	 * @param requestor The requirement whose factory asked for this one, null at the root
	 */
	record Requested(Object requirement, Object requestor) implements ResolutionEvent {}

	/**
	 * The requirement was already requested in this resolution and was not resolved again. Worth
	 * emitting: a trace without cache hits looks like more work than was done, and a trace with
	 * too many is how a requirement with bad equality semantics gets found.
	 */
	record CacheHit(Object requirement, Object requestor) implements ResolutionEvent {}

	/**
	 * A factory was asked whether it can handle the requirement, and answered. Negative answers
	 * included: they turn a resolution that produced nothing from a mystery into a list.
	 */
	record FactoryConsidered(Object requirement, CapabilityFactory<?, ?> factory, boolean canHandle) implements ResolutionEvent {}

	/**
	 * A factory raised a dependency while satisfying the requirement.
	 */
	record DependencyRequested(Object requirement, CapabilityFactory<?, ?> factory, Object dependency) implements ResolutionEvent {}

	/**
	 * A factory's publisher completed with these providers.
	 */
	record Resolved(Object requirement, CapabilityFactory<?, ?> factory, List<CapabilityProvider<Object>> providers) implements ResolutionEvent {}

	/**
	 * Resolution of the requirement failed. A stall, such as a requirement cycle, arrives here as a
	 * {@link org.nasdanika.sdk.runtime.common.flow.StallException} carrying the path.
	 */
	record Failed(Object requirement, Throwable error) implements ResolutionEvent {}

	/**
	 * Resolution of the requirement completed.
	 */
	record Completed(Object requirement, int providerCount, long durationNanos) implements ResolutionEvent {}

}
