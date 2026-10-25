import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.svg.services.SvgCapabilityFactory;
import org.nasdanika.sdk.runtime.models.svg.services.SvgEPackageProvider;
import org.nasdanika.sdk.runtime.models.svg.services.SvgResourceSetContributor;

// tag::module[]
module org.nasdanika.sdk.runtime.models.svg {
	
	exports org.nasdanika.sdk.runtime.models.svg;
	exports org.nasdanika.sdk.runtime.models.svg.impl;
	exports org.nasdanika.sdk.runtime.models.svg.resource;
	exports org.nasdanika.sdk.runtime.models.svg.services;
	exports org.nasdanika.sdk.runtime.models.svg.util;

	requires transitive org.nasdanika.sdk.runtime.common;
	requires transitive org.eclipse.emf.ecore.xmi;
	
	provides EPackage with SvgEPackageProvider;
	
	provides CapabilityFactory with SvgCapabilityFactory;
	
	provides ResourceSetContributor with SvgResourceSetContributor;
	
}
// end::module[]
