package org.example.generics;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import org.example.generics.Catalogs.Catalog;
import org.example.generics.Catalogs.OakShelf;
import org.example.generics.Catalogs.ReadingList;
import org.example.generics.Catalogs.Shelf;
import org.nasdanika.sdk.runtime.common.Adaptable;
import org.nasdanika.sdk.runtime.common.Adapter;

// tag::branch[]
/**
 * A library branch. What it can be adapted to is declared by its adapter members,
 * and their generic types say exactly what each one provides.
 */
public class Branch implements Adaptable {

	private final Map<String, String> titles = Map.of(
			"978-0321125217", "Domain-Driven Design",
			"978-0201633610", "Design Patterns");

	@Adapter
	private final Supplier<Shelf> shelves = OakShelf::new;                   // <1>

	@Adapter
	private final Supplier<Catalog> catalogs =                               // <2>
			() -> new ReadingList(List.copyOf(titles.values()));

	@Adapter
	public String title(String isbn) {                                        // <3>
		return titles.get(isbn); // null declines: "not this time"
	}

}
// end::branch[]
