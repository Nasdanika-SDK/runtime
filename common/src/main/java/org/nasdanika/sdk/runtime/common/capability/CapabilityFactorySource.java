package org.nasdanika.sdk.runtime.common.capability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Predicate;

/**
 * Supplies {@link CapabilityFactory} instances to a {@link CapabilityLoader}: the half of the old
 * loader that acquires factories, separated from the half that resolves requirements.
 *
 * <p>
 * {@link AutoCloseable} lives here and not on the loader, because closing means disposing
 * factories, which is an ownership concern: a loader borrowing a shared source does not own them.
 * Closing closes the factories that are {@link AutoCloseable}.
 *
 * <p>
 * Sources created here materialize their factory list once. {@code ServiceLoader} iteration is
 * lazy and re-iterating re-instantiates, so without the snapshot factories would stop being
 * singletons per source, and any factory holding state would quietly fork.
 */
@FunctionalInterface
public interface CapabilityFactorySource extends AutoCloseable {

	List<CapabilityFactory<Object, Object>> getFactories();

	@Override
	default void close() {
		RuntimeException failure = null;
		for (CapabilityFactory<Object, Object> factory: getFactories()) {
			if (factory instanceof AutoCloseable closeable) {
				try {
					closeable.close();
				} catch (Exception e) {
					if (failure == null) {
						failure = new IllegalStateException("Failed to close capability factories");
					}
					failure.addSuppressed(e);
				}
			}
		}
		if (failure != null) {
			throw failure;
		}
	}

	/**
	 * Factories visible to this module's service loader.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static CapabilityFactorySource serviceLoader() {
		return of((Iterable) ServiceLoader.load(CapabilityFactory.class));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static CapabilityFactorySource serviceLoader(ClassLoader classLoader) {
		return of((Iterable) ServiceLoader.load(CapabilityFactory.class, classLoader));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	static CapabilityFactorySource serviceLoader(ModuleLayer moduleLayer) {
		return of((Iterable) ServiceLoader.load(moduleLayer, CapabilityFactory.class));
	}

	/**
	 * An explicit list, snapshotted. The shape tests and embedders want.
	 */
	@SuppressWarnings("unchecked")
	static CapabilityFactorySource of(Iterable<? extends CapabilityFactory<?, ?>> factories) {
		List<CapabilityFactory<Object, Object>> snapshot = new ArrayList<>();
		for (CapabilityFactory<?, ?> factory: factories) {
			snapshot.add((CapabilityFactory<Object, Object>) factory);
		}
		List<CapabilityFactory<Object, Object>> immutable = List.copyOf(snapshot);
		return () -> immutable;
	}

	static CapabilityFactorySource of(CapabilityFactory<?, ?>... factories) {
		return of(Arrays.asList(factories));
	}

	/**
	 * Sources in order, as one factory set.
	 *
	 * <p>
	 * Composing sources is not the same as composing loaders. Here, one resolution runs over the
	 * combined set, so a factory from one source can satisfy a dependency raised by a factory from
	 * another: a local, task-specific source in front of the global one can use everything global.
	 * {@link CapabilityLoader#concat(CapabilityLoader...)} keeps resolutions separate, which is
	 * what you want when isolation is the point. Closing closes every source.
	 */
	static CapabilityFactorySource concat(CapabilityFactorySource... sources) {
		List<CapabilityFactorySource> theSources = List.of(sources);
		return new CapabilityFactorySource() {

			@Override
			public List<CapabilityFactory<Object, Object>> getFactories() {
				List<CapabilityFactory<Object, Object>> factories = new ArrayList<>();
				for (CapabilityFactorySource source: theSources) {
					factories.addAll(source.getFactories());
				}
				return factories;
			}

			@Override
			public void close() {
				for (CapabilityFactorySource source: theSources) {
					source.close();
				}
			}

		};
	}

	/**
	 * The factories the predicate accepts. A view: closing it does not close the factories.
	 *
	 * <p>
	 * Filtering at the source is stronger than filtering results: a factory not in the set cannot
	 * satisfy a dependency raised by another factory either, so a restricted source is a closure,
	 * not a surface check. This is how a trust level is enforced structurally.
	 */
	default CapabilityFactorySource filtered(Predicate<? super CapabilityFactory<Object, Object>> predicate) {
		CapabilityFactorySource source = this;
		return new CapabilityFactorySource() {

			@Override
			public List<CapabilityFactory<Object, Object>> getFactories() {
				return source.getFactories().stream().filter(predicate).toList();
			}

			@Override
			public void close() {
				// A view does not own the factories
			}

		};
	}

}
