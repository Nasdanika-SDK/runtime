package org.nasdanika.sdk.runtime.common.telemetry;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.ContextKey;
import io.opentelemetry.context.Scope;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.context.propagation.TextMapGetter;
import io.opentelemetry.context.propagation.TextMapPropagator;

/**
 * Where instrumented runtime code gets its {@link OpenTelemetry}, and the runtime's attribute keys
 * and event names.
 *
 * <h2>One instance per unit of work</h2>
 *
 * The runtime does not use {@code GlobalOpenTelemetry}. A unit of work (a CLI command, an HTTP
 * request, a test) builds or is handed an instance and makes it current, the same way it makes a
 * span current:
 *
 * <pre>
 * try (OpenTelemetrySdk sdk = ...; Scope scope = Telemetry.makeCurrent(sdk)) {
 *     ... // everything instrumented in here reports to sdk
 * }
 * </pre>
 *
 * The instance travels in the OpenTelemetry {@link Context}, next to the current span, so it
 * crosses threads wherever the context does. {@link org.nasdanika.sdk.runtime.common.flow.Pump}
 * propagates the context to its tasks. A resource set can also be {@link #attach(ResourceSet,
 * OpenTelemetry) given} an instance for work that runs outside any context, such as proxy
 * resolution long after the resource set was configured; the context, when it has one, wins.
 *
 * <h2>Signals</h2>
 *
 * Spans for operations, and log records for what happens in them. Log records go to the Logs API
 * directly (no logging framework bridged in) and are correlated with the current span by the SDK.
 * Span events are not used: OpenTelemetry is moving events onto the Logs API.
 */
public final class Telemetry {

	/**
	 * The instrumentation scope of the runtime's own spans and log records.
	 */
	public static final String INSTRUMENTATION_SCOPE = "org.nasdanika.sdk.runtime";

	// --- Attribute keys ---

	public static final AttributeKey<String> RESOURCE_URI = AttributeKey.stringKey("nasdanika.resource.uri");

	public static final AttributeKey<String> RESOURCE_TYPE = AttributeKey.stringKey("nasdanika.resource.type");

	/**
	 * Root objects of a loaded or saved resource.
	 */
	public static final AttributeKey<Long> RESOURCE_CONTENTS = AttributeKey.longKey("nasdanika.resource.contents");

	/**
	 * Bytes read or written so far, or in total.
	 */
	public static final AttributeKey<Long> IO_BYTES = AttributeKey.longKey("nasdanika.io.bytes");

	/**
	 * The URI handler that served a stream.
	 */
	/**
	 * A {@code Content} of the volume SPI: its description.
	 */
	public static final AttributeKey<String> CONTENT = AttributeKey.stringKey("nasdanika.content");

	/**
	 * Whether the reader of a piped content closed it before the writer finished.
	 */
	public static final AttributeKey<Boolean> CONTENT_CANCELLED = AttributeKey.booleanKey("nasdanika.content.cancelled");

	public static final AttributeKey<String> URI_HANDLER = AttributeKey.stringKey("nasdanika.uri.handler");

	/**
	 * What was contributed to a resource set: {@code epackage}, {@code uri-handler},
	 * {@code adapter-factory} or {@code contributor}.
	 */
	public static final AttributeKey<String> CONTRIBUTION_KIND = AttributeKey.stringKey("nasdanika.contribution.kind");

	/**
	 * The contribution: an nsURI or a class name.
	 */
	public static final AttributeKey<String> CONTRIBUTION = AttributeKey.stringKey("nasdanika.contribution");

	public static final AttributeKey<Long> CONTRIBUTION_COUNT = AttributeKey.longKey("nasdanika.contribution.count");

	public static final AttributeKey<String> TRANSFORMER_SOURCE = AttributeKey.stringKey("nasdanika.transformer.source");

	public static final AttributeKey<Long> TRANSFORMER_SOURCES = AttributeKey.longKey("nasdanika.transformer.sources");

	public static final AttributeKey<Long> TRANSFORMER_TARGETS = AttributeKey.longKey("nasdanika.transformer.targets");

	public static final AttributeKey<String> CAPABILITY_REQUIREMENT = AttributeKey.stringKey("nasdanika.capability.requirement");

	public static final AttributeKey<String> CAPABILITY_FACTORY = AttributeKey.stringKey("nasdanika.capability.factory");

	public static final AttributeKey<Long> CAPABILITY_PROVIDERS = AttributeKey.longKey("nasdanika.capability.providers");

	public static final AttributeKey<String> FLOW_DESCRIPTION = AttributeKey.stringKey("nasdanika.flow.description");

	public static final AttributeKey<Long> PROGRESS_WORKED = AttributeKey.longKey("nasdanika.progress.worked");

	public static final AttributeKey<Long> PROGRESS_TOTAL = AttributeKey.longKey("nasdanika.progress.total");

	// --- Event names, for log records that are events ---

	public static final String PROGRESS_EVENT = "nasdanika.progress";

	public static final String CONTRIBUTION_EVENT = "nasdanika.resource_set.contribution";

	public static final String RESOURCE_CREATED_EVENT = "nasdanika.resource.created";

	public static final String RESOURCE_LOADED_EVENT = "nasdanika.resource.loaded";

	public static final String RESOURCE_SAVED_EVENT = "nasdanika.resource.saved";

	private static final ContextKey<OpenTelemetry> KEY = ContextKey.named("nasdanika-open-telemetry");

	private Telemetry() {}

	// --- Finding the instance ---

	/**
	 * @return The instance in the current context, or the no-op instance.
	 */
	public static OpenTelemetry current() {
		return get(Context.current());
	}

	/**
	 * @return The instance in the context, or the no-op instance.
	 */
	public static OpenTelemetry get(Context context) {
		OpenTelemetry openTelemetry = context.get(KEY);
		return openTelemetry == null ? OpenTelemetry.noop() : openTelemetry;
	}

	/**
	 * The instance in the current context, or the one attached to the notifier's resource set, or
	 * the no-op instance.
	 *
	 * @param notifier A resource set, a resource or an object in one. May be null
	 */
	public static OpenTelemetry of(Notifier notifier) {
		OpenTelemetry openTelemetry = Context.current().get(KEY);
		if (openTelemetry == null) {
			ResourceSet resourceSet = resourceSet(notifier);
			if (resourceSet != null) {
				for (Adapter adapter: resourceSet.eAdapters()) {
					if (adapter instanceof OpenTelemetryAdapter ota) {
						return ota.openTelemetry;
					}
				}
			}
			return OpenTelemetry.noop();
		}
		return openTelemetry;
	}

	private static ResourceSet resourceSet(Notifier notifier) {
		if (notifier instanceof ResourceSet resourceSet) {
			return resourceSet;
		}
		if (notifier instanceof Resource resource) {
			return resource.getResourceSet();
		}
		if (notifier instanceof EObject eObject && eObject.eResource() != null) {
			return eObject.eResource().getResourceSet();
		}
		return null;
	}

	// --- Installing the instance ---

	public static Context with(Context context, OpenTelemetry openTelemetry) {
		return context.with(KEY, Objects.requireNonNull(openTelemetry, "openTelemetry"));
	}

	/**
	 * Makes the instance current until the scope is closed.
	 */
	public static Scope makeCurrent(OpenTelemetry openTelemetry) {
		return with(Context.current(), openTelemetry).makeCurrent();
	}

	/**
	 * Associates the instance with a resource set, replacing any previous association. Used when no
	 * instance is current.
	 */
	public static void attach(ResourceSet resourceSet, OpenTelemetry openTelemetry) {
		Objects.requireNonNull(openTelemetry, "openTelemetry");
		resourceSet.eAdapters().removeIf(OpenTelemetryAdapter.class::isInstance);
		resourceSet.eAdapters().add(new OpenTelemetryAdapter(openTelemetry));
	}

	private static final class OpenTelemetryAdapter extends AdapterImpl {

		final OpenTelemetry openTelemetry;

		OpenTelemetryAdapter(OpenTelemetry openTelemetry) {
			this.openTelemetry = openTelemetry;
		}

	}

	// --- Using it ---

	public static Tracer tracer(OpenTelemetry openTelemetry) {
		return openTelemetry.getTracer(INSTRUMENTATION_SCOPE);
	}

	public static Logger logger(OpenTelemetry openTelemetry) {
		return openTelemetry.getLogsBridge().get(INSTRUMENTATION_SCOPE);
	}

	/**
	 * Emits a log record in the current context, if the logger is enabled for the severity.
	 *
	 * @param eventName Null for a plain log record
	 * @param attributes May be null
	 */
	public static void log(Logger logger, Severity severity, String eventName, String body, Attributes attributes) {
		log(logger, Context.current(), severity, eventName, body, attributes);
	}

	/**
	 * Emits a log record correlated with the span in the given context, for example with a span
	 * that is not current.
	 */
	public static void log(Logger logger, Context context, Severity severity, String eventName, String body, Attributes attributes) {
		if (!logger.isEnabled(severity, context)) {
			return;
		}
		var builder = logger.logRecordBuilder()
				.setContext(context)
				.setSeverity(severity)
				.setBody(body);
		if (eventName != null) {
			builder.setEventName(eventName);
		}
		if (attributes != null) {
			builder.setAllAttributes(attributes);
		}
		builder.emit();
	}

	/**
	 * The body of a span.
	 */
	@FunctionalInterface
	public interface SpanBody<T, E extends Throwable> {

		T apply(Span span) throws E;

	}

	/**
	 * Runs the body in a new current span. A failure is recorded on the span, which then has the
	 * error status, and rethrown.
	 */
	public static <T, E extends Throwable> T inSpan(Tracer tracer, String name, Attributes attributes, SpanBody<T, E> body) throws E {
		var builder = tracer.spanBuilder(name);
		if (attributes != null) {
			builder.setAllAttributes(attributes);
		}
		Span span = builder.startSpan();
		try (Scope scope = span.makeCurrent()) {
			return body.apply(span);
		} catch (Throwable e) {
			recordFailure(span, e);
			throw e;
		} finally {
			span.end();
		}
	}

	/**
	 * Records the exception and sets the error status.
	 */
	public static void recordFailure(Span span, Throwable failure) {
		span.recordException(failure);
		span.setStatus(StatusCode.ERROR, String.valueOf(failure.getMessage()));
	}

	// --- Propagation ---

	/**
	 * W3C trace context and baggage. The SDK's default propagates nothing, so an instance that should
	 * continue a trace started elsewhere is built with these.
	 */
	public static ContextPropagators w3cPropagators() {
		return ContextPropagators.create(TextMapPropagator.composite(
				W3CTraceContextPropagator.getInstance(),
				W3CBaggagePropagator.getInstance()));
	}

	/**
	 * Reads a map carrier. A key is looked up as the propagator names it ({@code traceparent}) and
	 * then in upper case ({@code TRACEPARENT}), which is how the OpenTelemetry specification names
	 * environment variables used as carriers.
	 */
	private static final TextMapGetter<Map<String, String>> MAP_GETTER = new TextMapGetter<>() {

		@Override
		public Iterable<String> keys(Map<String, String> carrier) {
			return carrier.keySet();
		}

		@Override
		public String get(Map<String, String> carrier, String key) {
			if (carrier == null) {
				return null;
			}
			String value = carrier.get(key);
			return value == null ? carrier.get(key.toUpperCase(Locale.ROOT)) : value;
		}

	};

	/**
	 * Extracts a remote parent and baggage from a map, for example the parameters or headers of a
	 * request that invoked a function. Nothing is extracted if the map carries nothing valid or the
	 * instance has no propagators.
	 *
	 * @param carrier May be null
	 * @return The context with the remote span context and baggage, or the given context
	 */
	public static Context extract(OpenTelemetry openTelemetry, Context context, Map<String, String> carrier) {
		if (carrier == null) {
			return context;
		}
		return openTelemetry.getPropagators().getTextMapPropagator().extract(context, carrier, MAP_GETTER);
	}

	/**
	 * Extracts a remote parent and baggage from the {@code TRACEPARENT}, {@code TRACESTATE} and
	 * {@code BAGGAGE} environment variables, if they are set. This lets a process continue a trace
	 * started by whatever launched it, such as a build step or a function invocation.
	 */
	public static Context extractFromEnvironment(OpenTelemetry openTelemetry, Context context) {
		return extract(openTelemetry, context, System.getenv());
	}

}
