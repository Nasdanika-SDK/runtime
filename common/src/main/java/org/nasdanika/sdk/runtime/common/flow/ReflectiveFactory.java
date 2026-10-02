package org.nasdanika.sdk.runtime.common.flow;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;

/**
 * A {@link Transformer.Factory} assembled from methods annotated with {@link Mapping}, so that one
 * class can contribute many mappings without a registration per mapping.
 *
 * <p>
 * A mapping method takes the source, and optionally the {@link Transformer.Context}:
 *
 * <pre>
 * &#64;Mapping
 * public Flow.Publisher&lt;Shape&gt; node(Node node, Transformer.Context&lt;Object, Shape&gt; context) { ... }
 *
 * &#64;Mapping(priority = 10)
 * public Shape start(StartNode node) { ... }
 * </pre>
 *
 * It may return a {@link Flow.Publisher} (any number of targets), a {@link CompletionStage} (one
 * target, later), null (none), or a target. A method matches a source that is an instance of
 * {@link Mapping#type()}, or of its first parameter type when no type is given.
 *
 * <p>
 * Matching methods are ordered by priority (higher first), then by specificity of the matched
 * type, then by specificity of the declaring class, then by name. With {@link Selection#FIRST}
 * only the first contributes: polymorphic dispatch, the old transformer's behaviour. With
 * {@link Selection#ALL} every matching method contributes, in that order.
 *
 * <p>
 * Methods are invoked through method handles. Pass a {@link MethodHandles.Lookup} from the module
 * declaring the methods so that they need not be in an exported package.
 */
public class ReflectiveFactory<S, T> implements Transformer.Factory<S, T> {

	@Retention(RUNTIME)
	@Target(METHOD)
	@Documented
	public @interface Mapping {

		/**
		 * Source type to match. Defaults to the first parameter's type.
		 */
		Class<?> type() default Object.class;

		/**
		 * Higher priorities are tried first.
		 */
		int priority() default 0;

	}

	public enum Selection {

		/**
		 * The best matching method only.
		 */
		FIRST,

		/**
		 * Every matching method, best first.
		 */
		ALL

	}

	private record Candidate(Method method, MethodHandle handle, Class<?> type, int priority, boolean withContext) {}

	private final Selection selection;
	private final List<Candidate> candidates = new ArrayList<>();

	public ReflectiveFactory(Selection selection, MethodHandles.Lookup lookup, Object... targets) {
		this.selection = Objects.requireNonNull(selection, "selection");
		MethodHandles.Lookup theLookup = lookup == null ? MethodHandles.publicLookup() : lookup;
		for (Object target: targets) {
			for (Method method: target.getClass().getMethods()) {
				Mapping mapping = method.getAnnotation(Mapping.class);
				if (mapping != null && !Modifier.isAbstract(method.getModifiers())) {
					candidates.add(candidate(target, method, mapping, theLookup));
				}
			}
		}
		candidates.sort(ORDER);
	}

	public static <S, T> ReflectiveFactory<S, T> first(MethodHandles.Lookup lookup, Object... targets) {
		return new ReflectiveFactory<>(Selection.FIRST, lookup, targets);
	}

	public static <S, T> ReflectiveFactory<S, T> all(MethodHandles.Lookup lookup, Object... targets) {
		return new ReflectiveFactory<>(Selection.ALL, lookup, targets);
	}

	@Override
	public boolean canHandle(S source) {
		return candidates.stream().anyMatch(c -> c.type().isInstance(source));
	}

	@Override
	public Flow.Publisher<? extends T> create(S source, Transformer.Context<S, T> context) {
		List<Candidate> matching = candidates.stream().filter(c -> c.type().isInstance(source)).toList();
		if (matching.isEmpty()) {
			return null;
		}
		if (selection == Selection.FIRST) {
			return invoke(matching.get(0), source, context);
		}
		return Flows.concatMap(Flows.fromIterable(matching), c -> invoke(c, source, context));
	}

	// --- Implementation ---

	private static Candidate candidate(Object target, Method method, Mapping mapping, MethodHandles.Lookup lookup) {
		Class<?>[] parameterTypes = method.getParameterTypes();
		boolean withContext = parameterTypes.length == 2 && parameterTypes[1].isAssignableFrom(Transformer.Context.class);
		if (parameterTypes.length != 1 && !withContext) {
			throw new IllegalArgumentException("A mapping method takes the source and optionally the context: " + method);
		}
		Class<?> type = mapping.type() == Object.class ? parameterTypes[0] : mapping.type();
		if (!parameterTypes[0].isAssignableFrom(type)) {
			throw new IllegalArgumentException("Mapping type " + type.getName() + " is not assignable to the source parameter of " + method);
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
		return new Candidate(method, handle, type, mapping.priority(), withContext);
	}

	private Flow.Publisher<? extends T> invoke(Candidate candidate, S source, Transformer.Context<S, T> context) {
		Object result;
		try {
			result = candidate.withContext() ? candidate.handle().invoke(source, context) : candidate.handle().invoke(source);
		} catch (Throwable e) {
			return Flows.error(e);
		}
		return toPublisher(result);
	}

	@SuppressWarnings("unchecked")
	private static <T> Flow.Publisher<T> toPublisher(Object result) {
		if (result == null) {
			return Flows.empty();
		}
		if (result instanceof Flow.Publisher<?> publisher) {
			return (Flow.Publisher<T>) publisher;
		}
		if (result instanceof CompletionStage<?> stage) {
			return Flows.fromFuture((CompletionStage<T>) stage);
		}
		return Flows.of((T) result);
	}

	/**
	 * A total order. Specificity is the number of supertypes, which is strictly greater for a
	 * subtype than for any of its supertypes, so the order is transitive where pairwise
	 * {@code isAssignableFrom} comparisons are not.
	 */
	private static final Comparator<Candidate> ORDER = Comparator
			.comparingInt((Candidate c) -> -c.priority())
			.thenComparingInt(c -> -depth(c.type()))
			.thenComparingInt(c -> -depth(c.method().getDeclaringClass()))
			.thenComparing(c -> c.method().getName())
			.thenComparingInt(c -> c.method().getParameterCount());

	private static int depth(Class<?> type) {
		Set<Class<?>> supertypes = new HashSet<>();
		collectSupertypes(type, supertypes);
		return supertypes.size();
	}

	private static void collectSupertypes(Class<?> type, Set<Class<?>> supertypes) {
		if (type != null && supertypes.add(type)) {
			collectSupertypes(type.getSuperclass(), supertypes);
			for (Class<?> i: type.getInterfaces()) {
				collectSupertypes(i, supertypes);
			}
		}
	}

}
