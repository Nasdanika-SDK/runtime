package org.example.meta;

import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.Class;            // Shadows java.lang.Class in this file
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.MetaFactory;
import org.nasdanika.sdk.runtime.models.meta.Package;          // Shadows java.lang.Package in this file
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;

/**
 * A library's vocabulary written down once, in the language-neutral type system: terms with
 * definitions, types and identity. Projections turn it into whatever a consumer needs.
 */
public final class Vocabulary {

	private static final MetaFactory META = MetaFactory.eINSTANCE;

	private Vocabulary() {
	}

	// tag::vocabulary[]
	public static Package library() {
		Package vocabulary = META.createPackage();
		vocabulary.setName("library");
		vocabulary.setNamespace("https://example.org/vocabulary/library");
		vocabulary.setDocumentation("The words a library uses, and what they mean here.");

		Class person = type(vocabulary, "Person",
				"Someone who wrote, edited or translated a book.");
		attribute(person, "name", PrimitiveKind.STRING, true,
				"The name as printed on the title page.");

		Class book = type(vocabulary, "Book",
				"A published work, identified by its ISBN.");
		attribute(book, "isbn", PrimitiveKind.STRING, true,
				"International Standard Book Number, 13 digits.");
		attribute(book, "title", PrimitiveKind.STRING, false,
				"The title as printed, subtitle excluded.");
		attribute(book, "published", PrimitiveKind.DATE, false,
				"The date of the first edition.");
		reference(book, "authors", person,
				"The people credited as authors, in the order printed.");
		return vocabulary;
	}
	// end::vocabulary[]

	// tag::builders[]
	static Class type(Package vocabulary, String name, String definition) {
		Class type = META.createClass();
		type.setName(name);
		type.setDocumentation(definition);                      // <1>
		vocabulary.getClassifiers().add(type);
		return type;
	}

	static Attribute attribute(
			Class owner,
			String name,
			PrimitiveKind kind,
			boolean identifying,
			String definition) {
		Attribute attribute = META.createAttribute();
		attribute.setName(name);
		attribute.setDocumentation(definition);
		attribute.setIdentifying(identifying);                  // <2>
		attribute.setLowerBound(identifying ? 1 : 0);
		PrimitiveTypeReference type = META.createPrimitiveTypeReference();
		type.setKind(kind);
		attribute.setType(type);
		owner.getFeatures().add(attribute);
		return attribute;
	}

	static Reference reference(Class owner, String name, Class target, String definition) {
		Reference reference = META.createReference();
		reference.setName(name);
		reference.setDocumentation(definition);
		reference.setUpperBound(-1);
		ClassifierReference type = META.createClassifierReference();
		type.setTarget(target);
		reference.setType(type);
		owner.getFeatures().add(reference);
		return reference;
	}
	// end::builders[]

}
