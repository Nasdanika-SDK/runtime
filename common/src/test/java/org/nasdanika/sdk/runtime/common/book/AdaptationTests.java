package org.nasdanika.sdk.runtime.common.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.Adaptable;
import org.nasdanika.sdk.runtime.common.Adapter;
import org.nasdanika.sdk.runtime.common.Adapters;
import org.nasdanika.sdk.runtime.common.TypeToken;

/**
 * Adaptation: objects declare what they can be adapted to, and requests are matched against the
 * declarations.
 */
class AdaptationTests {

	interface Publication {}

	interface Book extends Publication {}

	record Novel(String title) implements Book {}

	record Chapter(int number) {}

	static final Type BOOKS = new TypeToken<Supplier<Book>>() {}.getType();

	static final Type PUBLICATIONS = new TypeToken<Supplier<Publication>>() {}.getType();

	// tag::branch[]
	static class Branch implements Adaptable {

		@Adapter
		private final Supplier<Book> books = () -> new Novel("Dune"); // <1>

		@Adapter
		private final Supplier<Publication> publications = () -> new Novel("Almanac"); // <2>

	}
	// end::branch[]

	@Test
	void fields() {
		// tag::fields[]
		Branch branch = new Branch();
		Supplier<Book> books = branch.adaptTo(BOOKS);
		assertThat(books.get()).isEqualTo(new Novel("Dune"));

		Supplier<Publication> publications = branch.adaptTo(PUBLICATIONS);
		assertThat(publications.get()).isEqualTo(new Novel("Almanac"));

		Type strings = new TypeToken<Supplier<String>>() {}.getType();
		assertThat(branch.<Object>adaptTo(strings)).isNull(); // <1>
		// end::fields[]
	}

	// tag::self[]
	static class Bookcase implements Supplier<Book>, Adaptable {

		@Override
		public Book get() {
			return new Novel("Solaris");
		}

	}
	// end::self[]

	@Test
	void self() {
		// tag::self-test[]
		Bookcase bookcase = new Bookcase();
		assertThat(bookcase.<Object>adaptTo(BOOKS)).isSameAs(bookcase);
		assertThat(bookcase.<Object>adaptTo(PUBLICATIONS)).isNull(); // Invariance
		// end::self-test[]
	}

	// tag::methods[]
	static class Manuscript implements Adaptable {

		private final int chapters;

		Manuscript(int chapters) {
			this.chapters = chapters;
		}

		@Adapter
		public Chapter chapter(int number) { // <1>
			return number <= chapters ? new Chapter(number) : null; // <2>
		}

		@Adapter
		public List<Chapter> chapters() { // <3>
			return IntStream.rangeClosed(1, chapters).mapToObj(Chapter::new).toList();
		}

	}
	// end::methods[]

	@Test
	void methods() {
		// tag::methods-test[]
		Manuscript manuscript = new Manuscript(3);
		assertThat(manuscript.<Chapter>adaptTo(Chapter.class, 2)).isEqualTo(new Chapter(2));
		assertThat(manuscript.<Chapter>adaptTo(Chapter.class, 7)).isNull(); // Declined
		assertThat(manuscript.<Chapter>adaptTo(Chapter.class, "2")).isNull(); // Not an int
		assertThat(manuscript.<Chapter>adaptTo(Chapter.class)).isNull(); // No context

		List<Chapter> chapters = manuscript.adaptTo(new TypeToken<List<Chapter>>() {}.getType());
		assertThat(chapters).hasSize(3);
		// end::methods-test[]
	}

	// tag::plain[]
	static class Catalog { // Not Adaptable

		@Adapter
		public final Supplier<Book> books = () -> new Novel("Neuromancer");

	}
	// end::plain[]

	@Test
	void plain() {
		// tag::plain-test[]
		Supplier<Book> books = Adapters.adapt(new Catalog(), BOOKS);
		assertThat(books.get()).isEqualTo(new Novel("Neuromancer"));
		// end::plain-test[]
	}

	// tag::override[]
	static class Archive implements Adaptable {

		@Adapter
		private final Supplier<Book> books = () -> new Novel("Ubik");

		@Override
		public <T> T adaptTo(Type type, Object... context) {
			if (type == String.class && context.length == 1 && context[0] instanceof String key) {
				@SuppressWarnings("unchecked")
				T label = (T) ("archive:" + key);
				return label;
			}
			return Adaptable.super.adaptTo(type, context); // <1>
		}

	}
	// end::override[]

	@Test
	void override() {
		// tag::override-test[]
		Archive archive = new Archive();
		assertThat(archive.<String>adaptTo(String.class, "ubik")).isEqualTo("archive:ubik");
		Supplier<Book> books = archive.adaptTo(BOOKS);
		assertThat(books.get()).isEqualTo(new Novel("Ubik"));
		// end::override-test[]
	}

	// tag::generic-class[]
	static class Box<T> implements Adaptable {

		@Adapter
		protected final T content;

		Box(T content) {
			this.content = content;
		}

	}

	static class NovelBox extends Box<Novel> {

		NovelBox(Novel novel) {
			super(novel);
		}

	}
	// end::generic-class[]

	@Test
	void genericClasses() {
		// tag::generic-class-test[]
		assertThat(new NovelBox(new Novel("Dune")).<Book>adaptTo(Book.class)).isNotNull(); // <1>
		assertThat(new Box<>(new Novel("Dune")).<Book>adaptTo(Book.class)).isNull(); // <2>
		// end::generic-class-test[]
	}

	@Test
	void declarations() {
		// tag::declarations[]
		assertThat(Adapters.isAdaptable(Branch.class, BOOKS)).isTrue();
		assertThat(Adapters.isAdaptable(Bookcase.class, BOOKS)).isTrue();
		assertThat(Adapters.isAdaptable(NovelBox.class, Book.class)).isTrue();
		assertThat(Adapters.isAdaptable(Manuscript.class, Chapter.class, int.class)).isTrue();
		assertThat(Adapters.isAdaptable(Manuscript.class, Chapter.class)).isFalse(); // <1>
		assertThat(Adapters.isAdaptable(Archive.class, String.class, String.class)).isFalse(); // <2>
		// end::declarations[]
	}

	// tag::wildcards[]
	static class NovelList {

		@Adapter
		public List<Novel> novels() {
			return List.of(new Novel("Dune"));
		}

	}
	// end::wildcards[]

	@Test
	void wildcards() {
		// tag::wildcards-test[]
		Type exact = new TypeToken<List<Book>>() {}.getType();
		Type readable = new TypeToken<Iterable<? extends Book>>() {}.getType();
		assertThat(Adapters.isAdaptable(NovelList.class, exact)).isFalse(); // <1>
		assertThat(Adapters.isAdaptable(NovelList.class, readable)).isTrue(); // <2>
		// end::wildcards-test[]
	}

	@Test
	void specificity() {
		// Both fields answer Supplier<? extends Publication>; the more specific declaration should
		// come first. It does here because "books" sorts before "publications": see the editor's note
		Type some = new TypeToken<Supplier<? extends Publication>>() {}.getType();
		Supplier<? extends Publication> supplier = new Branch().adaptTo(some);
		assertThat(supplier.get()).isEqualTo(new Novel("Dune"));
	}

}
