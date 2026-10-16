// tag::module[]
import org.eclipse.emf.ecore.EPackage;
import org.example.library.services.LibraryEPackageProvider;
import org.example.library.services.LibraryResourceSetContributor;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

module org.example.library {

	exports org.example.library;        // Generated interfaces
	exports org.example.library.impl;   // Generated implementations
	exports org.example.library.util;   // Generated switch and adapter factory
	exports org.example.library.services;

	requires transitive org.nasdanika.sdk.runtime.models.core;
	requires transitive org.nasdanika.sdk.runtime.common;
	requires org.eclipse.emf.ecore.xmi;

	provides EPackage with LibraryEPackageProvider;                          // <1>
	provides ResourceSetContributor with LibraryResourceSetContributor;     // <2>

}
// end::module[]
