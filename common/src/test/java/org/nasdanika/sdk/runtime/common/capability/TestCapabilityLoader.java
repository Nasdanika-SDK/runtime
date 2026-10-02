package org.nasdanika.sdk.runtime.common.capability;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory;
import org.nasdanika.sdk.runtime.common.flow.ReflectiveFactory.Mapping;
import org.nasdanika.sdk.runtime.common.flow.StallException;

class TestCapabilityLoader {

	record Greeting(String language) {}

	record Credentials(String vault) {}

	/**
	 * Satisfies a requirement for a type with a fixed value.
	 */
	static <C> CapabilityFactory<Object, C> constant(Class<?> type, C capability) {
		return new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return requirement == type;
			}

			@Override
			public Flow.Publisher<CapabilityProvider<C>> create(Object requirement, Loader loader) {
				return Flows.of(CapabilityProvider.of(capability));
			}

			@Override
			public String toString() {
				return "constant " + capability;
			}

		};
	}

	/**
	 * A chain: a greeting needs credentials, resolved within the same resolution.
	 */
	static final CapabilityFactory<Greeting, String> GREETER = new CapabilityFactory<>() {

		@Override
		public boolean canHandle(Object requirement) {
			return requirement instanceof Greeting;
		}

		@Override
		public Flow.Publisher<CapabilityProvider<String>> create(Greeting requirement, Loader loader) {
			CompletableFuture<List<Credentials>> credentials = loader.loadAll(Credentials.class);
			return Flows.fromFuture(credentials.thenApply(c -> CapabilityProvider.of(requirement.language() + " greeting using " + c.get(0).vault())));
		}

		@Override
		public String toString() {
			return "greeter";
		}

	};

	@Test
	void chainedResolution() {
		CapabilityLoader loader = CapabilityLoader.of(GREETER, constant(Credentials.class, new Credentials("vault")));
		assertThat(loader.<String>loadAll(new Greeting("en"))).containsExactly("en greeting using vault");
		assertThat(loader.<String>loadOne(new Greeting("fr"))).isEqualTo("fr greeting using vault");
		assertThat(loader.<String>loadOne("nobody handles this")).isNull();
	}

	@Test
	void explainingListener() {
		List<String> lines = new ArrayList<>();
		CapabilityLoader loader = CapabilityLoader
				.of(GREETER, constant(Credentials.class, new Credentials("vault")))
				.withListener(ResolutionListener.explaining(lines::add));
		loader.loadAll(new Greeting("en"));
		assertThat(lines).contains(
				"requested Greeting[language=en]",
				"  greeter handles Greeting[language=en]",
				"  constant Credentials[vault=vault] declines Greeting[language=en]",
				"  greeter needs class " + Credentials.class.getName() + " for Greeting[language=en]",
				"  greeter produced 1 provider(s) for Greeting[language=en]");
	}

	@Test
	void factoryNodes() {
		ResolutionListener.FactoryNodeCollector collector = ResolutionListener.FactoryNodeCollector.create();
		CapabilityLoader.of(GREETER, constant(Credentials.class, new Credentials("vault"))).withListener(collector).loadAll(new Greeting("en"));
		assertThat(collector.getFactoryNodes())
			.anySatisfy(node -> {
				assertThat(node.factory()).isSameAs(GREETER);
				assertThat(node.dependencies()).containsExactly(Credentials.class);
			});
	}

	@Test
	void sharedDependencyIsResolvedOncePerResolution() {
		AtomicInteger created = new AtomicInteger();
		CapabilityFactory<Object, String> counted = new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return requirement == Credentials.class;
			}

			@Override
			public Flow.Publisher<CapabilityProvider<String>> create(Object requirement, Loader loader) {
				created.incrementAndGet();
				return Flows.of(CapabilityProvider.of("shared"));
			}

		};
		CapabilityFactory<Object, String> twice = new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return "twice".equals(requirement);
			}

			@Override
			public Flow.Publisher<CapabilityProvider<String>> create(Object requirement, Loader loader) {
				return Flows.concat(loader.load(Credentials.class), loader.load(Credentials.class));
			}

		};
		assertThat(CapabilityLoader.of(counted, twice).<String>loadAll("twice")).containsExactly("shared", "shared");
		assertThat(created).hasValue(1);
	}

	@Test
	void requirementCycleIsReported() {
		CapabilityFactory<Object, String> cyclic = new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return "chicken".equals(requirement) || "egg".equals(requirement);
			}

			@Override
			public Flow.Publisher<CapabilityProvider<String>> create(Object requirement, Loader loader) {
				Object other = "chicken".equals(requirement) ? "egg" : "chicken";
				return Flows.fromFuture(loader.<String>loadAll(other).thenApply(o -> CapabilityProvider.of(requirement + " from " + o)));
			}

		};
		assertThatThrownBy(() -> CapabilityLoader.of(cyclic).loadAll("chicken"))
			.isInstanceOf(StallException.class)
			.hasMessageContaining("cycle: chicken -> egg -> chicken");
	}

	public static class Mappings {

		@Mapping
		public String greeting(Greeting greeting, org.nasdanika.sdk.runtime.common.flow.Transformer.Context<Object, Object> context) {
			// Through a transformer-backed factory, the context yields capabilities, not providers
			return greeting.language() + "!";
		}

		@Mapping
		public Flow.Publisher<Integer> length(String text) {
			return Flows.of(text.length(), text.length() * 2);
		}

	}

	@Test
	void transformerBackedLoader() {
		CapabilityLoader loader = CapabilityLoader.of(ReflectiveFactory.first(MethodHandles.lookup(), new Mappings()));
		assertThat(loader.<String>loadAll(new Greeting("de"))).containsExactly("de!");
		assertThat(loader.<Integer>loadAll("abc")).containsExactly(3, 6);
	}

	@Test
	void localSourceInFrontOfAnother() {
		CapabilityFactorySource global = CapabilityFactorySource.of(constant(Credentials.class, new Credentials("global vault")));
		CapabilityFactorySource local = CapabilityFactorySource.of(GREETER);
		CapabilityLoader loader = CapabilityLoader.of(CapabilityFactorySource.concat(local, global));
		assertThat(loader.<String>loadOne(new Greeting("en"))).isEqualTo("en greeting using global vault");
	}

	@Test
	void composition() {
		CapabilityLoader first = CapabilityLoader.of(constant(Credentials.class, new Credentials("first")));
		CapabilityLoader second = CapabilityLoader.of(constant(Credentials.class, new Credentials("second")));
		CapabilityLoader empty = CapabilityLoader.of();

		assertThat(CapabilityLoader.concat(first, second).<Credentials>loadAll(Credentials.class))
			.extracting(Credentials::vault).containsExactly("first", "second");
		assertThat(CapabilityLoader.fallback(empty, first, second).<Credentials>loadAll(Credentials.class))
			.extracting(Credentials::vault).containsExactly("first");
	}

	@Test
	void cachedAcrossCalls() {
		AtomicInteger created = new AtomicInteger();
		CapabilityFactory<Object, String> counted = new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return true;
			}

			@Override
			public Flow.Publisher<CapabilityProvider<String>> create(Object requirement, Loader loader) {
				return Flows.of(CapabilityProvider.of("call " + created.incrementAndGet()));
			}

		};
		CapabilityLoader cached = CapabilityLoader.cached(CapabilityLoader.of(counted));
		assertThat(cached.<String>loadOne("x")).isEqualTo("call 1");
		assertThat(cached.<String>loadOne("x")).isEqualTo("call 1");
		assertThat(cached.<String>loadOne("y")).isEqualTo("call 2");
	}

	@Test
	void resolvesInsideACallersPump() {
		Pump pump = new Pump();
		CapabilityLoader loader = CapabilityLoader.of(constant(Credentials.class, new Credentials("vault")));
		CompletableFuture<List<Credentials>> result = Flows.toList(CapabilityLoader.capabilities(loader.<Credentials>load(Credentials.class, pump), pump, Credentials.class));
		pump.settle();
		assertThat(result.join()).extracting(Credentials::vault).containsExactly("vault");
	}

	@Test
	void asyncLoadForNonPumpingSubscribers() {
		CapabilityLoader loader = CapabilityLoader.of(constant(Credentials.class, new Credentials("vault")));
		List<CapabilityProvider<Credentials>> providers = Flows.toList(loader.<Credentials>load(Credentials.class)).join();
		assertThat(providers).hasSize(1);
	}

}
