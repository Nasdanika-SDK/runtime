import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

module org.nasdanika.sdk.runtime.common {
	
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	
	exports org.nasdanika.sdk.runtime.common.services;
	exports org.nasdanika.sdk.runtime.common;
	
	uses ResourceSetContributor;
	
}