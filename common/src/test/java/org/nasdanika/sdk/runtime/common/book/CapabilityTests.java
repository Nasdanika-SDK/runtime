package org.nasdanika.sdk.runtime.common.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.TypeToken;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactorySource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.capability.ResolutionListener;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.StallException;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;

/**
 * Capabilities: requirements matched to factories by type and payload, resolved with their
 * dependencies.
 */
class CapabilityTests {

	interface Publication {}

	interface Book extends Publication {}

	record Novel(String title) implements Book {}

	record Credentials(String vault) {}

	record Catalog(String branch, String vault) {}

	// tag::factory[]
	static final CapabilityFactory<Object, Credentials> CREDENTIALS = new CapabilityFactory<>() {

		@Override
		public boolean canHandle(Object requirement) { // <1>
			return requirement == Credentials.class;
		}

		@Override
		public Flow.Publisher<CapabilityProvider<Credentials>> create(
				Object requirement,
				Loader loader,
				Span span,
				Logger logger) {
			return Flows.of(CapabilityProvider.of(new Credentials("vault"))); // <2>
		}

		@Override
		public String toString() {
			return "credentials";
		}

	};
	// end::factory[]

	@Test
	void handWritten() {
		// tag::load[]
		CapabilityLoader loader = CapabilityLoader.of(CREDENTIALS);
		List<Credentials> all = loader.loadAll(Credentials.class); // <1>
		assertThat(all).containsExactly(new Credentials("vault"));
		Credentials one = loader.loadOne(Credentials.class); // <2>
		assertThat(one).isEqualTo(new Credentials("vault"));
		assertThat(loader.<Object>loadOne(String.class)).isNull(); // <3>
		// end::load[]
	}

	// tag::reflective[]
	static class LibraryCapabilities extends ReflectiveCapabilityFactory {

		LibraryCapabilities() {
			super(MethodHandles.lookup()); // <1>
		}

		@Capability
		public Supplier<Book> books() { // <2>
			return () -> new Novel("Dune");
		}

		@Capability
		public Supplier<Publication> publications() {
			return () -> new Novel("Almanac");
		}

		@Capability
		public CompletionStage<Catalog> catalog(String branch, Loader loader) { // <3>
			return loader
				.<Credentials>loadAll(Credentials.class) // <4>
				.thenApply(credentials -> new Catalog(branch, credentials.get(0).vault()));
		}

	}
	// end::reflective[]

	@Test
	void reflective() {
		// tag::reflective-test[]
		CapabilityLoader loader = CapabilityLoader.of(new LibraryCapabilities(), CREDENTIALS);

		Type books = new TypeToken<Supplier<Book>>() {}.getType();
		assertThat(loader.<Supplier<Book>>loadAll(books)).hasSize(1); // <1>

		Requirement some = Requirement.of(new TypeToken<Supplier<? extends Publication>>() {});
		assertThat(loader.<Supplier<?>>loadAll(some)).hasSize(2); // <2>

		Requirement catalog = Requirement.of(Catalog.class, "Downtown"); // <3>
		assertThat(loader.<Catalog>loadOne(catalog)).isEqualTo(new Catalog("Downtown", "vault"));
		// end::reflective-test[]
	}

	static Supplier<Book> declared;

	@Test
	void requirementsAreValues() throws Exception {
		// tag::values[]
		Type reflected = CapabilityTests.class.getDeclaredField("declared").getGenericType();
		Requirement fromField = Requirement.of(reflected, "Downtown");
		Requirement fromToken = Requirement.of(new TypeToken<Supplier<Book>>() {}, "Downtown");
		assertThat(fromField).isEqualTo(fromToken).hasSameHashCodeAs(fromToken);
		// end::values[]
	}

	@Test
	void explaining() {
		// tag::explaining[]
		List<String> lines = new ArrayList<>();
		CapabilityLoader loader = CapabilityLoader
			.of(new LibraryCapabilities(), CREDENTIALS)
			.withListener(ResolutionListener.explaining(lines::add));
		loader.loadAll(Requirement.of(Catalog.class, "Downtown"));
		lines.forEach(System.out::println);
		// end::explaining[]
		assertThat(lines).anyMatch(line -> line.contains("credentials declines"));
		assertThat(lines).anyMatch(line -> line.contains("needs class " + Credentials.class.getName()));
	}

	@Test
	void cycle() {
		// tag::cycle[]
		CapabilityFactory<Object, String> poultry = new CapabilityFactory<>() {

			@Override
			public boolean canHandle(Object requirement) {
				return "chicken".equals(requirement) || "egg".equals(requirement);
			}

			@Override
			public Flow.Publisher<CapabilityProvider<String>> create(
					Object requirement,
					Loader loader,
					Span span,
					Logger logger) {
				Object other = "chicken".equals(requirement) ? "egg" : "chicken";
				return Flows.fromFuture(loader
					.<String>loadAll(other) // Waits for the other, which waits for this one
					.thenApply(o -> CapabilityProvider.of(requirement + " from " + o)));
			}

		};
		assertThatThrownBy(() -> CapabilityLoader.of(poultry).loadAll("chicken"))
			.isInstanceOf(StallException.class)
			.hasMessageContaining("cycle: chicken -> egg -> chicken");
		// end::cycle[]
	}

	@Test
	void composition() {
		// tag::composition[]
		CapabilityFactorySource global = CapabilityFactorySource.of(CREDENTIALS);
		CapabilityFactorySource local = CapabilityFactorySource.of(new LibraryCapabilities());
		CapabilityLoader loader = CapabilityLoader.of(CapabilityFactorySource.concat(local, global));
		assertThat(loader.<Catalog>loadOne(Requirement.of(Catalog.class, "Uptown"))).isNotNull();
		// end::composition[]
	}

}
