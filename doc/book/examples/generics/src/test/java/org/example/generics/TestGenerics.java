package org.example.generics;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Supplier;

import org.example.generics.Catalogs.Catalog;
import org.example.generics.Catalogs.OakShelf;
import org.example.generics.Catalogs.Shelf;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.Adapters;
import org.nasdanika.sdk.runtime.common.TypeToken;
import org.nasdanika.sdk.runtime.common.Types;

class TestGenerics {

	// tag::tokens[]
	static final Type SHELVES = new TypeToken<Supplier<Shelf>>() {}.getType();
	static final Type CATALOGS = new TypeToken<Supplier<Catalog>>() {}.getType();
	static final Type ANY_CATALOGS =
			new TypeToken<Supplier<? extends Catalog>>() {}.getType();
	// end::tokens[]

	@Test
	void assignability() {
		// tag::assignability[]
		// ? extends Catalog accepts Shelf
		assertThat(Types.isAssignable(ANY_CATALOGS, SHELVES)).isTrue();
		// Supplier<Shelf> is not a Supplier<Catalog>
		assertThat(Types.isAssignable(CATALOGS, SHELVES)).isFalse();
		// A raw target accepts any parameterization
		assertThat(Types.isAssignable(Supplier.class, SHELVES)).isTrue();
		// A raw source promises nothing about shelves
		assertThat(Types.isAssignable(SHELVES, Supplier.class)).isFalse();
		// end::assignability[]
	}

	@Test
	void typeArguments() {
		// tag::type-argument[]
		final class ShelfSupplier implements Supplier<Shelf> {

			@Override
			public Shelf get() {
				return new OakShelf();
			}

		}
		Type argument = Types.getTypeArgument(
				ShelfSupplier.class,
				Supplier.class.getTypeParameters()[0]);
		assertThat(argument).isEqualTo(Shelf.class); // What survives erasure: the declaration
		// end::type-argument[]
	}

	@Test
	void adaptation() {
		// tag::adapt[]
		Branch branch = new Branch();

		Supplier<Shelf> shelves = branch.adaptTo(SHELVES);
		Supplier<Catalog> catalogs = branch.adaptTo(CATALOGS);
		Supplier<? extends Catalog> any = branch.adaptTo(ANY_CATALOGS); // Both members qualify

		assertThat(shelves.get()).isInstanceOf(Shelf.class);
		assertThat(catalogs.get().titles()).contains("Design Patterns");
		assertThat(any.get()).isInstanceOf(Catalog.class);

		// Context is matched to the parameters of adapter methods
		String title = branch.adaptTo(String.class, "978-0321125217");
		assertThat(title).isEqualTo("Domain-Driven Design");
		assertThat(branch.<String>adaptTo(String.class, "000")).isNull(); // Declined
		Type strings = new TypeToken<Supplier<String>>() {}.getType();
		assertThat(branch.<Object>adaptTo(strings)).isNull();
		// end::adapt[]
	}

	@Test
	void plainObjects() {
		// tag::plain[]
		Supplier<Catalog> catalog = Adapters.adapt(new Archive(), CATALOGS);
		assertThat(catalog.get().titles()).containsExactly("On the Origin of Species");
		// end::plain[]
	}

	@Test
	void declarations() {
		// tag::declarations[]
		// Before there is an instance: can a Branch be asked for these?
		assertThat(Adapters.isAdaptable(Branch.class, SHELVES)).isTrue();
		assertThat(Adapters.isAdaptable(Branch.class, String.class, String.class)).isTrue();
		assertThat(Adapters.isAdaptable(Branch.class, String.class, Integer.class)).isFalse();
		// end::declarations[]
	}

	@Test
	void override() {
		// tag::override[]
		Reserve reserve = new Reserve();
		assertThat(reserve.<String>adaptTo(String.class, 3)).isEqualTo("Reserve, floor 3");
		Supplier<Shelf> shelves = reserve.adaptTo(SHELVES);
		assertThat(shelves.get().titles()).isEqualTo(List.of());
		// end::override[]
	}

}
