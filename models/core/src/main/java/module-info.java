import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.core.util.CoreEPackageResourceSetConfigurator;

module org.nasdanika.sdk.runtime.models.core {
	
	exports org.nasdanika.sdk.runtime.models.core;
	exports org.nasdanika.sdk.runtime.models.core.impl;
	exports org.nasdanika.sdk.runtime.models.core.util;
	
	requires transitive org.nasdanika.sdk.runtime.common;
	requires java.scripting;
	
	provides ResourceSetContributor with CoreEPackageResourceSetConfigurator;
	
}