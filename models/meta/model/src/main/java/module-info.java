import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.meta.services.MetaEPackageProvider;
import org.nasdanika.sdk.runtime.models.meta.services.MetaResourceSetContributor;

// tag::module[]
module org.nasdanika.sdk.runtime.models.meta {

	exports org.nasdanika.sdk.runtime.models.meta;
	exports org.nasdanika.sdk.runtime.models.meta.impl;
	exports org.nasdanika.sdk.runtime.models.meta.resource;
	exports org.nasdanika.sdk.runtime.models.meta.util;

	requires transitive org.nasdanika.sdk.runtime.models.core;
	requires transitive org.nasdanika.sdk.runtime.common;
	requires org.antlr.antlr4.runtime; // The text syntax's parser, not exported

	provides EPackage with MetaEPackageProvider;

	provides ResourceSetContributor with MetaResourceSetContributor;

}
// end::module[]
