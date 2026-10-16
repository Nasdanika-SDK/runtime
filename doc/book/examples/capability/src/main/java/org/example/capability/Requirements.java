package org.example.capability;

import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.function.Supplier;

import org.example.library.Book;
import org.example.library.Library;
import org.nasdanika.sdk.runtime.common.TypeToken;

// tag::types[]
/**
 * Generic types used in requirements. A class literal cannot say
 * Function<Library, String>; a type token can.
 */
public final class Requirements {

	public static final Type LIBRARY_SUPPLIER =
			new TypeToken<Supplier<Library>>() {}.getType();

	public static final Type LIBRARY_RENDERER =
			new TypeToken<Function<Library, String>>() {}.getType();

	public static final Type BOOK_RENDERER =
			new TypeToken<Function<Book, String>>() {}.getType();

	private Requirements() {
	}

}
// end::types[]
