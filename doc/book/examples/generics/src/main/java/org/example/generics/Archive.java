package org.example.generics;

import java.util.List;
import java.util.function.Supplier;

import org.example.generics.Catalogs.Catalog;
import org.example.generics.Catalogs.ReadingList;
import org.nasdanika.sdk.runtime.common.Adapter;

// tag::archive[]
/**
 * A plain object, not an Adaptable: the annotations are enough for Adapters.adapt().
 */
public class Archive {

	@Adapter
	public Supplier<Catalog> catalog() {
		return () -> new ReadingList(List.of("On the Origin of Species"));
	}

}
// end::archive[]
