package org.nasdanika.sdk.runtime.common.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.TypeToken;
import org.nasdanika.sdk.runtime.common.Types;

/**
 * Generic types at run time: what survives erasure, and how Types matches it.
 */
class TypesTests {

	// tag::types[]
	interface Publication {}

	interface Book extends Publication {}

	record Novel(String title) implements Book {}
	// end::types[]

	// tag::library[]
	static class Library {

		final Supplier<Book> books = () -> new Novel("Dune");

	}
	// end::library[]

	@Test
	void instancesForgetDeclarationsRemember() throws Exception {
		// tag::erasure[]
		List<String> names = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();
		assertThat(names.getClass()).isSameAs(numbers.getClass()); // <1>

		Field books = Library.class.getDeclaredField("books");
		assertThat(books.getType()).isSameAs(Supplier.class); // <2>
		assertThat(books.getGenericType())
			.isEqualTo(new TypeToken<Supplier<Book>>() {}.getType()); // <3>
		// end::erasure[]
	}

	@Test
	void theCompilerAndTypesAgree() {
		// tag::compiler[]
		Supplier<Book> books = () -> new Novel("Dune");
		Supplier<? extends Publication> some = books; // Compiles
		// Supplier<Publication> exact = books;        // Does not compile: incompatible types
		// end::compiler[]
		assertThat(some.get()).isEqualTo(new Novel("Dune"));

		// tag::assignability[]
		Type bookSupplier = new TypeToken<Supplier<Book>>() {}.getType();
		Type publicationSupplier = new TypeToken<Supplier<Publication>>() {}.getType();
		Type someSupplier = new TypeToken<Supplier<? extends Publication>>() {}.getType();
		Type anySupplier = new TypeToken<Supplier<?>>() {}.getType();

		assertThat(Types.isAssignable(someSupplier, bookSupplier)).isTrue(); // <1>
		assertThat(Types.isAssignable(publicationSupplier, bookSupplier)).isFalse(); // <2>
		assertThat(Types.isAssignable(Supplier.class, bookSupplier)).isTrue(); // <3>
		assertThat(Types.isAssignable(bookSupplier, Supplier.class)).isFalse(); // <4>
		assertThat(Types.isAssignable(anySupplier, Supplier.class)).isTrue(); // <5>
		// end::assignability[]
	}

	// tag::shelves[]
	abstract static class Shelf<T extends Publication> implements Supplier<List<T>> {}

	static class NovelShelf extends Shelf<Novel> {

		@Override
		public List<Novel> get() {
			return List.of(new Novel("Dune"), new Novel("Solaris"));
		}

	}
	// end::shelves[]

	@Test
	void typeArgumentsOfDeclarations() {
		// tag::type-argument[]
		Type supplied = Types.getTypeArgument(NovelShelf.class, Supplier.class.getTypeParameters()[0]);
		assertThat(supplied).isEqualTo(new TypeToken<List<Novel>>() {}.getType()); // <1>

		Type wildcard = new TypeToken<List<? extends Book>>() {}.getType();
		assertThat(Types.getElementType(wildcard, List.class.getTypeParameters()[0]))
			.isEqualTo(Book.class); // <2>

		assertThat(Types.getTypeArgument(Shelf.class, Supplier.class.getTypeParameters()[0]))
			.isNull(); // <3>
		// end::type-argument[]
	}

	// tag::ground-method[]
	static <T> Type listOf() {
		return new TypeToken<List<T>>() {}.getType(); // Captures T, not what T stands for
	}
	// end::ground-method[]

	@Test
	void groundTypes() {
		// tag::ground[]
		assertThat(Types.isGround(new TypeToken<List<? extends Book>>() {}.getType())).isTrue();
		assertThat(Types.isGround(TypesTests.<Book>listOf())).isFalse();
		// end::ground[]
	}

}
