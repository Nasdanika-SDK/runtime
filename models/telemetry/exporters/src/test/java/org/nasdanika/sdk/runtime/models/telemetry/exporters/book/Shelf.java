package org.nasdanika.sdk.runtime.models.telemetry.exporters.book;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * The model the book's unit of work changes: a library of books, as a dynamic EMF package, so
 * that the book needs no generated model of its own. Any EMF model records the same way.
 */
final class Shelf {

	static final EPackage LIBRARY = EcoreFactory.eINSTANCE.createEPackage();
	static final EClass LIBRARY_CLASS = EcoreFactory.eINSTANCE.createEClass();
	static final EClass BOOK_CLASS = EcoreFactory.eINSTANCE.createEClass();
	static final EAttribute NAME = attribute("name", EcorePackage.Literals.ESTRING);
	static final EAttribute YEAR = attribute("year", EcorePackage.Literals.EINT);
	static final EReference BOOKS = EcoreFactory.eINSTANCE.createEReference();

	static {
		LIBRARY.setName("library");
		LIBRARY.setNsPrefix("library");
		LIBRARY.setNsURI("https://example.org/library");
		LIBRARY_CLASS.setName("Library");
		BOOK_CLASS.setName("Book");
		LIBRARY_CLASS.getEStructuralFeatures().add(NAME);
		BOOK_CLASS.getEStructuralFeatures().add(EcoreUtil.copy(NAME));
		BOOK_CLASS.getEStructuralFeatures().add(YEAR);
		BOOKS.setName("books");
		BOOKS.setEType(BOOK_CLASS);
		BOOKS.setContainment(true);
		BOOKS.setUpperBound(-1);
		LIBRARY_CLASS.getEStructuralFeatures().add(BOOKS);
		LIBRARY.getEClassifiers().add(LIBRARY_CLASS);
		LIBRARY.getEClassifiers().add(BOOK_CLASS);
	}

	private Shelf() {
	}

	private static EAttribute attribute(String name, EDataType type) {
		EAttribute ret = EcoreFactory.eINSTANCE.createEAttribute();
		ret.setName(name);
		ret.setEType(type);
		return ret;
	}

	static EObject library() {
		EObject library = EcoreUtil.create(LIBRARY_CLASS);
		library.eSet(NAME, "A Modeler's Shelf");
		books(library).add(book("Domain-Driven Design", 2003));
		books(library).add(book("EMF: Eclipse Modeling Framework", 2008));
		return library;
	}

	static EObject book(String name, int year) {
		EObject book = EcoreUtil.create(BOOK_CLASS);
		book.eSet(BOOK_CLASS.getEStructuralFeature("name"), name);
		book.eSet(YEAR, year);
		return book;
	}

	@SuppressWarnings("unchecked")
	static EList<EObject> books(EObject library) {
		return (EList<EObject>) library.eGet(BOOKS);
	}

	static EObject book(EObject library, String name) {
		return books(library).stream()
			.filter(b -> name.equals(b.eGet(BOOK_CLASS.getEStructuralFeature("name"))))
			.findFirst()
			.orElseThrow();
	}

}
