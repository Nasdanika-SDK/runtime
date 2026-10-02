import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

module org.nasdanika.sdk.runtime.common {
	
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires transitive io.opentelemetry.api;
	requires transitive io.opentelemetry.context;

	exports org.nasdanika.sdk.runtime.common.services;
	exports org.nasdanika.sdk.runtime.common;
	exports org.nasdanika.sdk.runtime.common.flow;
	exports org.nasdanika.sdk.runtime.common.capability;
	exports org.nasdanika.sdk.runtime.common.telemetry;

	uses ResourceSetContributor;
	uses EPackage;
	uses CapabilityFactory;
	
}