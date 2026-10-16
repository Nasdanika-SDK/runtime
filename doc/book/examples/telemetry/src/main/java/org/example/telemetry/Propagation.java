package org.example.telemetry;

import java.util.Map;
import java.util.function.Supplier;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;

/**
 * Continuing a trace started elsewhere: by a build step, a function invocation, a request.
 */
public final class Propagation {

	private Propagation() {
	}

	// tag::continue[]
	/**
	 * Runs the work as part of the trace whose context the carrier holds, for example
	 * traceparent from request parameters or TRACEPARENT from the environment.
	 */
	public static <T> T continueTrace(
			OpenTelemetry openTelemetry,
			Map<String, String> carrier,
			Supplier<T> work) {
		Context remote = Telemetry.extract(openTelemetry, Context.current(), carrier); // <1>
		try (Scope scope = Telemetry.with(remote, openTelemetry).makeCurrent()) {     // <2>
			return work.get();
		}
	}

	/**
	 * The launcher's way: TRACEPARENT, TRACESTATE and BAGGAGE environment variables.
	 */
	public static <T> T continueFromEnvironment(OpenTelemetry openTelemetry, Supplier<T> work) {
		Context remote = Telemetry.extractFromEnvironment(openTelemetry, Context.current());
		try (Scope scope = Telemetry.with(remote, openTelemetry).makeCurrent()) {
			return work.get();
		}
	}
	// end::continue[]

}
