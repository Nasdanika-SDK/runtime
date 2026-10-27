import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.html.services.HtmlEPackageProvider;

// tag::module[]
module org.nasdanika.sdk.runtime.models.html {

	exports org.nasdanika.sdk.runtime.models.html;
	exports org.nasdanika.sdk.runtime.models.html.impl;
	exports org.nasdanika.sdk.runtime.models.html.util;
	exports org.nasdanika.sdk.runtime.models.html.generator;

	requires transitive org.nasdanika.sdk.runtime.models.core;

	provides EPackage with HtmlEPackageProvider;

}
// end::module[]
