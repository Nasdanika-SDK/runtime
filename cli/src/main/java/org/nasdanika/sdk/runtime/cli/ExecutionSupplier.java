package org.nasdanika.sdk.runtime.cli;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;

/**
 * A value produced while a command executes, with that execution's telemetry. What a parent hands a
 * {@link Parent} member when producing the value is not cheap - loading a model, calling a service -
 * so that the work happens only if the command runs, inside its span, attributed to it:
 *
 * <pre>
 * &#64;Override
 * protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
 *     Collection&lt;? extends EObject&gt; objects = contents.get(span, logger, meter);
 *     ...
 * }
 * </pre>
 *
 * A cheap value is better asked for directly: adapting the parent is then all it takes.
 *
 * @param <T> Supplied type
 */
@FunctionalInterface
public interface ExecutionSupplier<T> {

	/**
	 * @param span The executing command's span, for events and attributes, and as the parent of spans the work creates
	 */
	T get(Span span, Logger logger, Meter meter) throws Exception;

}
