package org.nasdanika.sdk.runtime.common.capability;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.Types;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Scope;

/**
 * A capability factory assembled from methods annotated with {@link Capability}, so that one
 * class - one {@code provides} entry - contributes many capabilities.
 *
 * <pre>
 * public class StorageCapabilities extends ReflectiveCapabilityFactory {
 *
 *     public StorageCapabilities() {
 *         super(MethodHandles.lookup());
 *     }
 *
 *     &#64;Capability
 *     public Supplier&lt;Volume&gt; volumes(Loader loader, Span span) { ... }          // Requirement.of(new TypeToken&lt;Supplier&lt;Volume&gt;&gt;() {})
 *
 *     &#64;Capability
 *     public Flow.Publisher&lt;Model&gt; models(URI uri, Logger logger) { ... }     // Requirement.of(Model.class, uri)
 * }
 * </pre>
 *
 * <h2>What a method provides</h2>
 *
 * Its generic return type, checked by the compiler and matched by {@link Types#isAssignable(Type, Type)},
 * so that type arguments count: a method returning {@code Supplier<Volume>} does not answer a
 * requirement for {@code Supplier<Writable>}. A method may return its capability directly, or
 * wrapped, one level deep:
 * <ul>
 * <li>{@code CapabilityProvider<X>}, {@code Flow.Publisher<X>}, {@code Flow.Publisher<CapabilityProvider<X>>}
 * and {@code CompletionStage<X>} are how a method delivers, many or later, and never what it
 * delivers: they are always unwrapped, and {@code X} is matched. A requirement for {@code Object}
 * gets the values, not the publisher. To provide a publisher as a capability, deliver it:
 * {@code CompletionStage<Flow.Publisher<X>>}.</li>
 * <li>{@code X[]} and any {@code Iterable<X>}, such as a list, are values that hold others, so the
 * declared type is matched first and the result is one capability if it satisfies the requirement.
 * Only if it does not are the elements matched. A requirement for {@code List<Volume>} gets the
 * list from a method returning one, a requirement for {@code Volume} its elements - and a
 * requirement for {@code Object} or {@code Iterable} gets the list.</li>
 * </ul>
 * Null, and null elements, provide nothing.
 *
 * <h2>What a method takes</h2>
 *
 * Parameters are injected by type, in any order: {@link CapabilityFactory.Loader} for dependencies,
 * {@link Span} (the method's own span), {@link Logger}, {@link Meter}, {@link OpenTelemetry}, and
 * {@link Type} - the required type, for a method that serves a range of them. Every other
 * parameter takes a payload of the {@link Requirement}, in order: a method matches when it has as
 * many as there are payloads and each payload is an instance of its parameter's class, or null for
 * a parameter that is not primitive. Payload type arguments are not checked, since objects carry
 * none.
 *
 * <p>
 * A requirement that is neither a {@link Requirement} nor a {@link Type} is read as one payload with
 * {@code Object} as the type, so that {@code loader.loadAll(new Greeting("en"))} reaches a method
 * {@code String greet(Greeting greeting)}.
 *
 * <h2>Several matching methods</h2>
 *
 * All contribute: the most specific provided type first, then by name and parameter count.
 * Choosing between the capabilities is the caller's business, as with any requirement several
 * factories answer. A method that declines a payload it was offered returns null.
 *
 * <p>
 * Methods are public, inherited ones included, and invoked through method handles. Pass a
 * {@link MethodHandles.Lookup} from the module declaring them, so that they need not be in an
 * exported package. Java does not inherit method annotations, so an override of a capability
 * method must repeat {@link Capability}, or it stops being one.
 */
public class ReflectiveCapabilityFactory implements CapabilityFactory<Object, Object> {

	@Retention(RUNTIME)
	@Target(METHOD)
	@Documented
	public @interface Capability {

	}

	/**
	 * How a method wraps what it provides. Delivery shapes are how a method delivers, never what it
	 * delivers, so they are always unwrapped.
	 */
	private enum Shape {

		VALUE(false),
		PROVIDER(true),
		PUBLISHER(true),
		PROVIDER_PUBLISHER(true),
		STAGE(true),
		ARRAY(false),
		ITERABLE(false);

		final boolean delivery;

		Shape(boolean delivery) {
			this.delivery = delivery;
		}

	}

	/**
	 * What a parameter receives.
	 */
	private enum Injection { LOADER, SPAN, LOGGER, METER, OPEN_TELEMETRY, TYPE, PAYLOAD }

	/**
	 * Whether a requirement was matched by the declared return type or by its element type.
	 */
	private enum Match { WHOLE, ELEMENTS }

	private record Candidate(
			Method method,
			MethodHandle handle,
			Type returnType,
			Shape shape,
			Type elementType,
			Injection[] injections,
			Class<?>[] payloadTypes) {}

	private final List<Candidate> candidates = new ArrayList<>();

	/**
	 * @param lookup From the module declaring the methods, usually {@code MethodHandles.lookup()}
	 * @param targets Objects whose {@link Capability} methods to use. None for this object's own,
	 * which is what a subclass registered with {@link java.util.ServiceLoader} wants
	 */
	public ReflectiveCapabilityFactory(MethodHandles.Lookup lookup, Object... targets) {
		MethodHandles.Lookup theLookup = lookup == null ? MethodHandles.publicLookup() : lookup;
		Object[] theTargets = targets == null || targets.length == 0 ? new Object[] { this } : targets;
		for (Object target: theTargets) {
			for (Method method: target.getClass().getMethods()) {
				if (method.isAnnotationPresent(Capability.class) && !Modifier.isAbstract(method.getModifiers()) && !method.isBridge()) {
					candidates.add(candidate(target, method, theLookup));
				}
			}
		}
		candidates.sort(ORDER);
	}

	@Override
	public boolean canHandle(Object requirement) {
		Requirement theRequirement = requirement(requirement);
		return theRequirement != null && candidates.stream().anyMatch(c -> match(c, theRequirement) != null);
	}

	@Override
	public Flow.Publisher<CapabilityProvider<Object>> create(Object requirement, Loader loader, Span span, Logger logger) {
		Requirement theRequirement = requirement(requirement);
		if (theRequirement == null) {
			return Flows.empty();
		}
		List<Flow.Publisher<CapabilityProvider<Object>>> providers = new ArrayList<>();
		for (Candidate candidate: candidates) {
			Match match = match(candidate, theRequirement);
			if (match != null) {
				providers.add(invoke(candidate, match, theRequirement, loader, logger));
			}
		}
		return Flows.concat(providers);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + candidates.stream().map(c -> c.method().getName()).toList();
	}

	// --- Implementation ---

	private static Requirement requirement(Object requirement) {
		if (requirement instanceof Requirement theRequirement) {
			return theRequirement;
		}
		if (requirement instanceof Type type) {
			return Types.isGround(type) ? new Requirement(type, List.of()) : null;
		}
		return requirement == null ? null : new Requirement(Object.class, List.of(requirement));
	}

	private static Match match(Candidate candidate, Requirement requirement) {
		List<Object> payload = requirement.payload();
		Class<?>[] payloadTypes = candidate.payloadTypes();
		if (payload.size() != payloadTypes.length) {
			return null;
		}
		for (int i = 0; i < payloadTypes.length; ++i) {
			Object value = payload.get(i);
			if (value == null ? payloadTypes[i].isPrimitive() : !Types.box(payloadTypes[i]).isInstance(value)) {
				return null;
			}
		}
		if (!candidate.shape().delivery && Types.isAssignable(requirement.type(), candidate.returnType())) {
			return Match.WHOLE;
		}
		if (candidate.elementType() != null && Types.isAssignable(requirement.type(), candidate.elementType())) {
			return Match.ELEMENTS;
		}
		return null;
	}

	private Flow.Publisher<CapabilityProvider<Object>> invoke(Candidate candidate, Match match, Requirement requirement, Loader loader, Logger logger) {
		OpenTelemetry openTelemetry = Telemetry.current();
		Method method = candidate.method();
		Span span = Telemetry.tracer(openTelemetry)
				.spanBuilder("CapabilityFactory.method")
				.setAttribute(Telemetry.CAPABILITY_METHOD, method.getDeclaringClass().getName() + "." + method.getName())
				.setAttribute(Telemetry.CAPABILITY_REQUIREMENT, String.valueOf(requirement))
				.startSpan();

		Injection[] injections = candidate.injections();
		Object[] arguments = new Object[injections.length];
		int payloadIndex = 0;
		for (int i = 0; i < injections.length; ++i) {
			arguments[i] = switch (injections[i]) {
				case LOADER -> loader;
				case SPAN -> span;
				case LOGGER -> logger;
				case METER -> Telemetry.meter(openTelemetry);
				case OPEN_TELEMETRY -> openTelemetry;
				case TYPE -> requirement.type();
				case PAYLOAD -> requirement.payload().get(payloadIndex++);
			};
		}

		Flow.Publisher<CapabilityProvider<Object>> providers;
		try (Scope scope = span.makeCurrent()) {
			providers = providers(candidate.handle().invokeWithArguments(arguments), candidate.shape(), match);
		} catch (Throwable e) {
			Telemetry.recordFailure(span, e);
			span.end();
			return Flows.error(e);
		}
		return Flows.onTerminate(providers, error -> {
			if (error != null) {
				Telemetry.recordFailure(span, error);
			}
			span.end();
		});
	}

	@SuppressWarnings("unchecked")
	private static Flow.Publisher<CapabilityProvider<Object>> providers(Object result, Shape shape, Match match) {
		if (result == null) {
			return Flows.empty();
		}
		if (match == Match.WHOLE) {
			return Flows.of(CapabilityProvider.of(result));
		}
		return switch (shape) {
			case PROVIDER -> Flows.of((CapabilityProvider<Object>) result);
			case PUBLISHER -> Flows.of(CapabilityProvider.of((Flow.Publisher<Object>) result));
			case PROVIDER_PUBLISHER -> (Flow.Publisher<CapabilityProvider<Object>>) result;
			case STAGE -> Flows.of(CapabilityProvider.of(Flows.fromFuture((CompletionStage<Object>) result)));
			case ARRAY -> {
				List<Object> elements = new ArrayList<>();
				for (int i = 0; i < Array.getLength(result); ++i) {
					elements.add(Array.get(result, i));
				}
				yield Flows.of(CapabilityProvider.of(elements.toArray()));
			}
			case ITERABLE -> {
				List<Object> elements = new ArrayList<>();
				((Iterable<?>) result).forEach(elements::add);
				yield Flows.of(CapabilityProvider.of(elements.toArray()));
			}
			case VALUE -> throw new IllegalStateException("A value has no elements to match"); // Not reached: VALUE has no element type
		};
	}

	private static Candidate candidate(Object target, Method method, MethodHandles.Lookup lookup) {
		Type returnType = method.getGenericReturnType();
		if (returnType == void.class) {
			throw new IllegalArgumentException("A capability method must return its capabilities: " + method);
		}
		if (!Types.isGround(returnType)) {
			// <T> Supplier<T> make(Class<T> type): what it provides depends on its arguments, so it cannot be matched in advance
			throw new IllegalArgumentException("A capability method's return type must not contain type variables: " + method);
		}
		returnType = Types.box(returnType);

		Shape shape;
		Type elementType;
		Class<?> rawReturnType = Types.erase(returnType);
		if (Flow.Publisher.class.isAssignableFrom(rawReturnType)) {
			elementType = Types.getElementType(returnType, Flow.Publisher.class.getTypeParameters()[0]);
			if (elementType != null && CapabilityProvider.class.isAssignableFrom(Types.erase(elementType))) {
				shape = Shape.PROVIDER_PUBLISHER;
				elementType = Types.getElementType(elementType, CapabilityProvider.class.getTypeParameters()[0]);
			} else {
				shape = Shape.PUBLISHER;
			}
		} else if (CapabilityProvider.class.isAssignableFrom(rawReturnType)) {
			shape = Shape.PROVIDER;
			elementType = Types.getElementType(returnType, CapabilityProvider.class.getTypeParameters()[0]);
		} else if (CompletionStage.class.isAssignableFrom(rawReturnType)) {
			shape = Shape.STAGE;
			elementType = Types.getElementType(returnType, CompletionStage.class.getTypeParameters()[0]);
		} else if (rawReturnType.isArray()) {
			shape = Shape.ARRAY;
			elementType = Types.box(returnType instanceof GenericArrayType arrayType ? arrayType.getGenericComponentType() : rawReturnType.getComponentType());
		} else if (Iterable.class.isAssignableFrom(rawReturnType)) {
			shape = Shape.ITERABLE;
			elementType = Types.getElementType(returnType, Iterable.class.getTypeParameters()[0]);
		} else {
			shape = Shape.VALUE;
			elementType = null;
		}
		if (shape != Shape.VALUE && elementType == null) {
			elementType = Object.class; // Raw: a raw List or Publisher holds Objects
		}

		Class<?>[] parameterTypes = method.getParameterTypes();
		Injection[] injections = new Injection[parameterTypes.length];
		List<Class<?>> payloadTypes = new ArrayList<>();
		for (int i = 0; i < parameterTypes.length; ++i) {
			injections[i] = injection(parameterTypes[i]);
			if (injections[i] == Injection.PAYLOAD) {
				payloadTypes.add(parameterTypes[i]);
			}
		}

		MethodHandle handle;
		try {
			handle = lookup.unreflect(method);
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException("Cannot access " + method + ", pass a lookup from its module", e);
		}
		if (!Modifier.isStatic(method.getModifiers())) {
			handle = handle.bindTo(target);
		}
		return new Candidate(method, handle, returnType, shape, elementType, injections, payloadTypes.toArray(Class<?>[]::new));
	}

	/**
	 * By exact type: a parameter declared as {@code Object} takes a payload, it is not injected.
	 */
	private static Injection injection(Class<?> parameterType) {
		if (parameterType == Loader.class) {
			return Injection.LOADER;
		}
		if (parameterType == Span.class) {
			return Injection.SPAN;
		}
		if (parameterType == Logger.class) {
			return Injection.LOGGER;
		}
		if (parameterType == Meter.class) {
			return Injection.METER;
		}
		if (parameterType == OpenTelemetry.class) {
			return Injection.OPEN_TELEMETRY;
		}
		if (parameterType == Type.class) {
			return Injection.TYPE;
		}
		return Injection.PAYLOAD;
	}

	/**
	 * A total order, most specific provided type first.
	 */
	private static final Comparator<Candidate> ORDER = Comparator
			.comparingInt((Candidate c) -> -Types.specificity(c.elementType() == null ? c.returnType() : c.elementType()))
			.thenComparing(c -> c.method().getName())
			.thenComparingInt(c -> c.method().getParameterCount())
			.thenComparing(c -> c.method().getDeclaringClass().getName());

}
