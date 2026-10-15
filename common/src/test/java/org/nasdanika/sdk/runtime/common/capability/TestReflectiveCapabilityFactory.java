package org.nasdanika.sdk.runtime.common.capability;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Flow;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.TypeToken;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory.Capability;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.leangen.geantyref.TypeFactory;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;

class TestReflectiveCapabilityFactory {

	interface Writable {}

	interface Volume extends Writable {}

	/**
	 * A supplier that says which method produced it.
	 */
	record Tagged<T>(String tag) implements Supplier<T> {

		@Override
		public T get() {
			return null;
		}

	}

	record Label(String language) {}

	/**
	 * Subclass form: what a factory registered with ServiceLoader looks like.
	 */
	static class Suppliers extends ReflectiveCapabilityFactory {

		Suppliers() {
			super(MethodHandles.lookup());
		}

		@Capability
		public Supplier<Volume> volume() {
			return new Tagged<>("volume");
		}

		@Capability
		public Supplier<Writable> writable() {
			return new Tagged<>("writable");
		}

		@SuppressWarnings("rawtypes")
		@Capability
		public Supplier raw() {
			return new Tagged<>("raw");
		}

		@Capability
		public Supplier<String> label(Label label) {
			return "xx".equals(label.language()) ? null : new Tagged<>("label " + label.language());
		}

	}

	static List<String> tags(Object requirement) {
		return CapabilityLoader.of(new Suppliers())
				.<Supplier<?>>loadAll(requirement)
				.stream()
				.map(supplier -> ((Tagged<?>) supplier).tag())
				.sorted()
				.toList();
	}

	@Test
	void typeArgumentsDistinguishMethods() {
		// The raw method has said nothing about what it supplies, so it answers neither
		assertThat(tags(Requirement.of(new TypeToken<Supplier<Volume>>() {}))).containsExactly("volume");
		assertThat(tags(new TypeToken<Supplier<Writable>>() {}.getType())).containsExactly("writable");
	}

	@Test
	void wildcardRequirementFollowsJavaRules() {
		assertThat(tags(Requirement.of(new TypeToken<Supplier<? extends Writable>>() {}))).containsExactly("volume", "writable");
	}

	@Test
	void rawRequirementMatchesEveryParameterization() {
		assertThat(tags(Supplier.class)).containsExactly("raw", "volume", "writable");
		assertThat(tags(Requirement.of(new TypeToken<Supplier<?>>() {}))).containsExactly("raw", "volume", "writable");
	}

	@Test
	void payloadsSelectMethods() {
		assertThat(tags(Requirement.of(Supplier.class, new Label("en")))).containsExactly("label en");
		assertThat(tags(Requirement.of(Supplier.class, new Label("xx")))).as("declined by returning null").isEmpty();
		assertThat(tags(Requirement.of(Object.class, "not a label"))).as("no method takes a String").isEmpty();
		assertThat(new Suppliers().canHandle(Requirement.of(Supplier.class, "not a label"))).isFalse();
	}

	record Item(String source) {}

	/**
	 * One method per return shape, each answering only its own name.
	 */
	static class Shapes extends ReflectiveCapabilityFactory {

		Shapes() {
			super(MethodHandles.lookup());
		}

		@Capability
		public Item value(String shape) {
			return "value".equals(shape) ? new Item("value") : null;
		}

		@Capability
		public CapabilityProvider<Item> provider(String shape) {
			return "provider".equals(shape) ? CapabilityProvider.of(new Item("provider")) : null;
		}

		@Capability
		public Flow.Publisher<Item> publisher(String shape) {
			return "publisher".equals(shape) ? Flows.of(new Item("publisher 1"), new Item("publisher 2")) : null;
		}

		@Capability
		public Flow.Publisher<CapabilityProvider<Item>> providers(String shape) {
			return "providers".equals(shape) ? Flows.of(CapabilityProvider.of(new Item("providers"))) : null;
		}

		@Capability
		public CompletionStage<Item> stage(String shape) {
			return "stage".equals(shape) ? CompletableFuture.completedFuture(new Item("stage")) : null;
		}

		@Capability
		public Item[] array(String shape) {
			return "array".equals(shape) ? new Item[] { new Item("array 1"), null, new Item("array 2") } : null;
		}

		@Capability
		public List<Item> list(String shape) {
			return "list".equals(shape) ? Arrays.asList(new Item("list 1"), null, new Item("list 2")) : null;
		}

	}

	static List<Object> load(Object requirement) {
		return CapabilityLoader.of(new Shapes()).loadAll(requirement);
	}

	@Test
	void everyReturnShapeIsUnwrapped() {
		assertThat(load(Requirement.of(Item.class, "value"))).containsExactly(new Item("value"));
		assertThat(load(Requirement.of(Item.class, "provider"))).containsExactly(new Item("provider"));
		assertThat(load(Requirement.of(Item.class, "publisher"))).containsExactly(new Item("publisher 1"), new Item("publisher 2"));
		assertThat(load(Requirement.of(Item.class, "providers"))).containsExactly(new Item("providers"));
		assertThat(load(Requirement.of(Item.class, "stage"))).containsExactly(new Item("stage"));
		assertThat(load(Requirement.of(Item.class, "array"))).as("null elements dropped").containsExactly(new Item("array 1"), new Item("array 2"));
		assertThat(load(Requirement.of(Item.class, "list"))).containsExactly(new Item("list 1"), new Item("list 2"));
	}

	@Test
	void containersAreValuesFirst() {
		List<Item> list = Arrays.asList(new Item("list 1"), null, new Item("list 2"));
		assertThat(load(Requirement.of(new TypeToken<List<Item>>() {}, "list"))).containsExactly(list);
		assertThat(load(Requirement.of(Object.class, "list"))).as("Object is satisfied by the list itself").containsExactly(list);
	}

	@Test
	void deliveryShapesAreAlwaysUnwrapped() {
		assertThat(load(Requirement.of(Object.class, "stage"))).containsExactly(new Item("stage"));
		assertThat(load(Requirement.of(Object.class, "publisher"))).containsExactly(new Item("publisher 1"), new Item("publisher 2"));
		assertThat(load(Requirement.of(CompletionStage.class, "stage"))).as("a stage is not a capability").isEmpty();
	}

	static class Injected extends ReflectiveCapabilityFactory {

		Injected() {
			super(MethodHandles.lookup());
		}

		/**
		 * Injected parameters in any order, payloads interleaved and taken in order.
		 */
		@Capability
		public String describe(Type type, Span span, int number, Logger logger, Meter meter, OpenTelemetry openTelemetry, String text, Loader loader) {
			boolean injected = span != null && logger != null && meter != null && openTelemetry != null && loader != null;
			return type.getTypeName() + " " + number + " " + text + " " + injected;
		}

	}

	@Test
	void parametersAreInjectedByType() {
		CapabilityLoader loader = CapabilityLoader.of(new Injected());
		assertThat(loader.<String>loadAll(Requirement.of(CharSequence.class, 7, "seven"))).containsExactly("java.lang.CharSequence 7 seven true");
		assertThat(loader.<String>loadAll(Requirement.of(CharSequence.class, "seven", 7))).as("payloads are matched in order").isEmpty();
		assertThat(loader.<String>loadAll(Requirement.of(CharSequence.class, null, "seven"))).as("null cannot be an int").isEmpty();
		assertThat(loader.<String>loadAll(Requirement.of(CharSequence.class, 7, null))).containsExactly("java.lang.CharSequence 7 null true");
	}

	record Credentials(String vault) {}

	/**
	 * Target form: a plain object, not a subclass.
	 */
	static class Greetings {

		@Capability
		public CompletionStage<String> greeting(Label label, Loader loader) {
			return loader.<Credentials>loadAll(Credentials.class).thenApply(c -> label.language() + " greeting using " + c.get(0).vault());
		}

		@Capability
		public static Credentials credentials() {
			return new Credentials("vault");
		}

	}

	@Test
	void methodsChainThroughTheLoader() {
		CapabilityLoader loader = CapabilityLoader.of(new ReflectiveCapabilityFactory(MethodHandles.lookup(), new Greetings()));
		assertThat(loader.<String>loadAll(Requirement.of(String.class, new Label("en")))).containsExactly("en greeting using vault");
	}

	@Test
	void plainObjectRequirementIsOnePayload() {
		// What @Mapping methods did: the requirement object is the argument
		CapabilityLoader loader = CapabilityLoader.of(new ReflectiveCapabilityFactory(MethodHandles.lookup(), new Greetings()));
		assertThat(loader.<String>loadAll(new Label("fr"))).containsExactly("fr greeting using vault");
	}

	static class GenericMethod {

		@Capability
		public <T> Supplier<T> make(Class<T> type) {
			return null;
		}

	}

	static class VoidMethod {

		@Capability
		public void nothing() {
			// Provides nothing
		}

	}

	@Test
	void unmatchableMethodsAreRejected() {
		assertThatThrownBy(() -> new ReflectiveCapabilityFactory(MethodHandles.lookup(), new GenericMethod()))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("type variables");
		assertThatThrownBy(() -> new ReflectiveCapabilityFactory(MethodHandles.lookup(), new VoidMethod()))
			.isInstanceOf(IllegalArgumentException.class);
	}

	static <T> Type listOf() {
		return new TypeToken<List<T>>() {}.getType();
	}

	@Test
	void typeVariablesCannotBeRequired() {
		assertThat(new Suppliers().canHandle(Supplier.class.getTypeParameters()[0])).isFalse();
		assertThat(new Suppliers().canHandle(listOf())).isFalse();
		assertThatThrownBy(() -> Requirement.of(listOf())).isInstanceOf(IllegalArgumentException.class);
	}

	static Supplier<Volume> declared;

	@Test
	void requirementsAreValues() throws Exception {
		// The resolution cache is keyed by requirement, so the same type must make the same key however it was built
		Requirement reflected = Requirement.of(TestReflectiveCapabilityFactory.class.getDeclaredField("declared").getGenericType(), new Label("en"));
		Requirement token = Requirement.of(new TypeToken<Supplier<Volume>>() {}, new Label("en"));
		Requirement built = Requirement.of(TypeFactory.parameterizedClass(Supplier.class, Volume.class), new Label("en"));
		assertThat(reflected).isEqualTo(token).isEqualTo(built);
		assertThat(reflected.hashCode()).isEqualTo(token.hashCode()).isEqualTo(built.hashCode());

		assertThat(Requirement.of(Volume.class, (Object) null).payload()).hasSize(1).containsNull();
		assertThat(Requirement.of(Volume.class).payload()).isEmpty();
		assertThatThrownBy(() -> Requirement.of(Volume.class, "x").payload().add("y")).isInstanceOf(UnsupportedOperationException.class);
	}

}
