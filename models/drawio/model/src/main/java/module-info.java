import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.drawio.services.DrawioCapabilityFactory;
import org.nasdanika.sdk.runtime.models.drawio.services.DrawioEPackageProvider;
import org.nasdanika.sdk.runtime.models.drawio.services.DrawioResourceSetContributor;

// tag::module[]
module org.nasdanika.sdk.runtime.models.drawio {
	
	exports org.nasdanika.sdk.runtime.models.drawio;
	exports org.nasdanika.sdk.runtime.models.drawio.impl;
	exports org.nasdanika.sdk.runtime.models.drawio.resource;
	exports org.nasdanika.sdk.runtime.models.drawio.services;
	exports org.nasdanika.sdk.runtime.models.drawio.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.presentation;
	requires transitive org.nasdanika.sdk.runtime.drawio;
	requires org.jsoup;
	
	provides EPackage with DrawioEPackageProvider;
	
	provides CapabilityFactory with DrawioCapabilityFactory;
	
	provides ResourceSetContributor with DrawioResourceSetContributor;
	
}
// end::module[]
