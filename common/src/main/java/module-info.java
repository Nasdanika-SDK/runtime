import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.services.BinaryResourceFactoryContributor;
import org.nasdanika.sdk.runtime.common.services.ClassPathURIHandlerFactory;
import org.nasdanika.sdk.runtime.common.services.GzipBinaryResourceFactoryContributor;
import org.nasdanika.sdk.runtime.common.services.ModuleURIHandlerFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.common.services.XMIResourceFactoryContributor;

module org.nasdanika.sdk.runtime.common {
	
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires transitive io.opentelemetry.api;
	requires transitive io.opentelemetry.context;
	requires org.eclipse.emf.ecore.xmi;
	requires java.xml;

	exports org.nasdanika.sdk.runtime.common.services;
	exports org.nasdanika.sdk.runtime.common;
	exports org.nasdanika.sdk.runtime.common.flow;
	exports org.nasdanika.sdk.runtime.common.capability;
	exports org.nasdanika.sdk.runtime.common.capability.emf;
	exports org.nasdanika.sdk.runtime.common.telemetry;

	uses ResourceSetContributor;
	uses URIHandler;
	uses AdapterFactory;
	uses EPackage;
	uses CapabilityFactory;

	provides URIHandler with 
		ClassPathURIHandlerFactory, 
		ModuleURIHandlerFactory;

	provides ResourceSetContributor with 
		BinaryResourceFactoryContributor,
		GzipBinaryResourceFactoryContributor,
		XMIResourceFactoryContributor;
	
}