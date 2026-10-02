package org.nasdanika.sdk.runtime.common.capability;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.CacheHit;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Completed;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.DependencyRequested;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.FactoryConsidered;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Failed;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Requested;
import org.nasdanika.sdk.runtime.common.capability.ResolutionEvent.Resolved;

/**
 * Receives {@link ResolutionEvent}s, on the resolution's pump. One method, so that adding an
 * event does not break implementations. Attached with {@link CapabilityLoader#withListener},
 * which returns a new loader rather than mutating one.
 */
@FunctionalInterface
public interface ResolutionListener {

	void on(ResolutionEvent event);

	/**
	 * The default. Costs nothing, which is why tracing can always be available.
	 */
	ResolutionListener NOP = event -> {};

	static ResolutionListener compose(ResolutionListener... listeners) {
		List<ResolutionListener> theListeners = List.of(listeners);
		return event -> {
			for (ResolutionListener listener: theListeners) {
				listener.on(event);
			}
		};
	}

	/**
	 * Rebuilds what the old {@code CapabilityLoader.getFactoryNodes()} returned, opt in and bounded
	 * by the caller's lifetime instead of a shared loader's.
	 */
	interface FactoryNodeCollector extends ResolutionListener {

		/**
		 * A requirement, the factory that satisfied it, the providers it produced, and the
		 * dependencies it raised. For troubleshooting and for visualizing resolution as a graph.
		 */
		record FactoryNode(
				Object requirement,
				CapabilityFactory<?, ?> factory,
				List<CapabilityProvider<Object>> providers,
				List<Object> dependencies) {}

		List<FactoryNode> getFactoryNodes();

		static FactoryNodeCollector create() {
			return new DefaultFactoryNodeCollector();
		}

	}

	/**
	 * Reports which factories were considered for each requirement and which answered, one line
	 * per event. The debug mode that keeps being needed: it distinguishes "no factory claimed the
	 * requirement" from "a factory claimed it and produced nothing", which have different fixes.
	 */
	static ResolutionListener explaining(Consumer<String> sink) {
		return event -> sink.accept(switch (event) {
			case Requested e -> "requested " + e.requirement() + (e.requestor() == null ? "" : " by " + e.requestor());
			case CacheHit e -> "reused " + e.requirement() + (e.requestor() == null ? "" : " for " + e.requestor());
			case FactoryConsidered e -> "  " + e.factory() + (e.canHandle() ? " handles " : " declines ") + e.requirement();
			case DependencyRequested e -> "  " + e.factory() + " needs " + e.dependency() + " for " + e.requirement();
			case Resolved e -> "  " + e.factory() + " produced " + e.providers().size() + " provider(s) for " + e.requirement();
			case Failed e -> "failed " + e.requirement() + ": " + e.error();
			case Completed e -> "completed " + e.requirement() + " with " + e.providerCount() + " provider(s) in " + TimeUnit.NANOSECONDS.toMicros(e.durationNanos()) + " us";
		});
	}

}
