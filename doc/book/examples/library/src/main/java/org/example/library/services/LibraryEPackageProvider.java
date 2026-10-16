package org.example.library.services;

import org.eclipse.emf.ecore.EPackage;
import org.example.library.LibraryPackage;

// tag::provider[]
/**
 * Registers the library package with resource sets configured from services. A provider
 * method hands {@link java.util.ServiceLoader} the singleton instead of a new instance.
 */
public final class LibraryEPackageProvider {

	private LibraryEPackageProvider() {
	}

	public static EPackage provider() {
		return LibraryPackage.eINSTANCE;
	}

}
// end::provider[]
