package org.nasdanika.sdk.runtime.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

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
		
	public static List<Class<?>> lineage(Class<?> clazz) {
		if (clazz == null) {
			return Collections.emptyList();
		}
		List<Class<?>> ret = new ArrayList<>();
		ret.add(clazz);
		ret.addAll(lineage(clazz.getSuperclass()));
		for (Class<?> i: clazz.getInterfaces()) {
			ret.addAll(lineage(i));
		}
		return ret.stream().distinct().toList();
	}		

}
