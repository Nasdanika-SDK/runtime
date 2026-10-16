package org.example.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * The types the examples adapt to.
 */
public final class Catalogs {

	private Catalogs() {
	}

	// tag::types[]
	/**
	 * Something that lists book titles.
	 */
	public interface Catalog {

		List<String> titles();

	}

	/**
	 * A catalog you can also put books on.
	 */
	public interface Shelf extends Catalog {

		void put(String title);

	}

	public record ReadingList(List<String> titles) implements Catalog {
	}

	public static final class OakShelf implements Shelf {

		private final List<String> titles = new ArrayList<>();

		@Override
		public List<String> titles() {
			return titles;
		}

		@Override
		public void put(String title) {
			titles.add(title);
		}

	}
	// end::types[]

}
