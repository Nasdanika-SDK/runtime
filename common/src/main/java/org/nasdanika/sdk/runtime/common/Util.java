package org.nasdanika.sdk.runtime.common;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EClass;

import io.leangen.geantyref.GenericTypeReflector;

public class Util {
	
	public static boolean isBlank(String s) {
		return s == null || s.isBlank();
	}
	
	/**
	 * Groups and then aggregates
	 * @param <K>
	 * @param <T>
	 * @param <V>
	 * @return
	 */
	public static <K, T, V> List<V> aggregate(
			Collection<T> elements, 
			java.util.function.Function<? super T, ? extends K> classifier,
			BiFunction<? super K, ? super List<? super T>, ? extends V> aggregator) {
		
		java.util.function.Function<Map.Entry<? extends K, ? extends List<T>>, V> mapper = e -> aggregator.apply(e.getKey(), e.getValue());
		return groupBy(elements, classifier)
				.entrySet()
				.stream()
				.map(mapper)
				.toList();
	}
	
	/**
	 * Grouping by with support of null keys.
	 * @param <K>
	 * @param <T>
	 * @param elements
	 * @param keyFeature
	 * @return
	 */
	public static <K, T> Map<K, List<T>> groupBy(
			Collection<? extends T> elements, 
			java.util.function.Function<? super T, ? extends K> classifier) {
		return groupBy(elements, classifier, new LinkedHashMap<>());
	}
	
	/**
	 * Grouping by with support of null keys.
	 * @param <K>
	 * @param <T>
	 * @param elements
	 * @param keyFeature
	 * @return
	 */
	@SuppressWarnings("unused")
	public static <K, T> Map<K, List<T>> groupBy(
			Collection<? extends T> elements, 
			java.util.function.Function<? super T, ? extends K> classifier, 
			Map<K, List<T>> collector) {
		return groupBy(elements, classifier, collector, key -> new ArrayList<>());
	}	
	
	/**
	 * Grouping by with support of null keys.
	 * @param <K>
	 * @param <T>
	 * @param elements
	 * @param keyFeature
	 * @return Collector argument
	 */
	public static <K, T, C extends Collection<T>> Map<K, C> groupBy(
			Collection<? extends T> elements, 
			java.util.function.Function<? super T, ? extends K> classifier, 
			Map<K, C> collector, 
			java.util.function.Function<K,C> collectionFactory) {
		
		for (T e: elements) {
			K k = classifier.apply(e);
			collector.computeIfAbsent(k, collectionFactory).add(e);
		}
		return collector;
	}	
		
	/**
	 * The class and its supertypes, each once, every type before its supertypes: see
	 * {@link #lineage(Object, java.util.function.Function)}. The superclass comes before the
	 * interfaces, and {@link Object} is last, for interfaces too, because every interface is
	 * assignable to it.
	 */
	public static List<Class<?>> lineage(Class<?> clazz) {
		if (clazz == null) {
			return Collections.emptyList();
		}
		return lineage(clazz, Util::directSupertypes);
	}

	/**
	 * The class and its supertypes, each once, every class before its supertypes, in the order of
	 * {@link EClass#getESuperTypes()} where the hierarchy leaves a choice: see
	 * {@link #lineage(Object, java.util.function.Function)}.
	 */
	public static List<EClass> lineage(EClass eClass) {
		if (eClass == null) {
			return Collections.emptyList();
		}
		return lineage(eClass, EClass::getESuperTypes);
	}

	/**
	 * The type and its supertypes with their type arguments, each once, every type before its
	 * supertypes: for {@code List<String>}, {@code List<String>}, {@code SequencedCollection<String>},
	 * {@code Collection<String>}, {@code Iterable<String>}, {@code Object}. A class that fixes type
	 * arguments, such as {@code class Names extends ArrayList<String>}, has the supertypes it
	 * declares, and a raw type has raw supertypes. The order is that of {@link #lineage(Class)}.
	 */
	public static List<Type> genericLineage(Type type) {
		if (type == null) {
			return Collections.emptyList();
		}
		return lineage(type, t -> directSupertypes(Types.erase(t))
				.stream()
				.map(supertype -> GenericTypeReflector.getExactSuperType(t, supertype))
				.toList());
	}

	/**
	 * The superclass, then the interfaces. {@link Object} only when there is nothing else, because
	 * declared first it would contradict the order of the interfaces, which lead to it as well.
	 */
	private static List<Class<?>> directSupertypes(Class<?> clazz) {
		if (clazz == Object.class || clazz.isPrimitive()) {
			return List.of();
		}
		List<Class<?>> ret = new ArrayList<>();
		Class<?> superclass = clazz.getSuperclass();
		if (superclass != null && superclass != Object.class) {
			ret.add(superclass);
		}
		ret.addAll(Arrays.asList(clazz.getInterfaces()));
		if (ret.isEmpty()) {
			ret.add(Object.class);
		}
		return ret;
	}

	/**
	 * A type and its supertypes, each once, linearized with C3, as Python orders base classes:
	 * every type comes before its supertypes, the direct supertypes of a type keep their declared
	 * order, and the lineage of a type is a subsequence of the lineage of each of its subtypes. So
	 * the first type in the lineage that answers a question, such as which view renders an element,
	 * is the most specific one.
	 *
	 * <p>
	 * Where the declared orders contradict each other, as with {@code interface K extends I, J} and
	 * {@code interface J extends I}, C3 has no answer and the declared order gives way: the next type
	 * is the first one none of whose subtypes is still to come. Every type still comes before its
	 * supertypes.
	 *
	 * @param type The type
	 * @param supertypes Direct supertypes of a type, in declared order
	 * @throws IllegalArgumentException if a type is its own supertype
	 */
	public static <T> List<T> lineage(T type, java.util.function.Function<? super T, ? extends Collection<? extends T>> supertypes) {
		return linearize(type, supertypes, new HashMap<>());
	}

	private static <T> List<T> linearize(
			T type,
			java.util.function.Function<? super T, ? extends Collection<? extends T>> supertypes,
			Map<T, List<T>> linearizations) {

		List<T> linearization = linearizations.get(type);
		if (linearization != null) {
			return linearization;
		}
		if (linearizations.containsKey(type)) {
			throw new IllegalArgumentException("Cyclic supertypes: " + type);
		}
		linearizations.put(type, null); // In progress

		List<T> direct = new ArrayList<>(new LinkedHashSet<T>(supertypes.apply(type)));
		List<List<T>> sequences = new ArrayList<>();
		for (T supertype: direct) {
			sequences.add(new ArrayList<>(linearize(supertype, supertypes, linearizations)));
		}
		sequences.add(new ArrayList<>(direct));

		List<T> ret = new ArrayList<>();
		ret.add(type);
		for (sequences.removeIf(List::isEmpty); !sequences.isEmpty(); sequences.removeIf(List::isEmpty)) {
			T next = c3Head(sequences);
			if (next == null) {
				next = mostSpecific(sequences, linearizations);
			}
			ret.add(next);
			for (List<T> sequence: sequences) {
				sequence.remove(next);
			}
		}
		linearization = Collections.unmodifiableList(ret);
		linearizations.put(type, linearization);
		return linearization;
	}

	/**
	 * The first head that is in no sequence's tail, or null if there is none.
	 */
	private static <T> T c3Head(List<List<T>> sequences) {
		for (List<T> candidate: sequences) {
			T head = candidate.get(0);
			if (sequences.stream().noneMatch(sequence -> sequence.indexOf(head) > 0)) {
				return head;
			}
		}
		return null;
	}

	/**
	 * The first pending type none of whose subtypes is pending. There is one, because the
	 * hierarchy has no cycles.
	 */
	private static <T> T mostSpecific(List<List<T>> sequences, Map<T, List<T>> linearizations) {
		Set<T> pending = new LinkedHashSet<>();
		sequences.forEach(pending::addAll);
		for (T candidate: pending) {
			if (pending.stream().noneMatch(other -> other != candidate && linearizations.get(other).contains(candidate))) {
				return candidate;
			}
		}
		throw new IllegalStateException("Cyclic supertypes: " + pending);
	}

}
