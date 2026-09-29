module org.nasdanika.sdk.runtime.models.core {
	
	exports org.nasdanika.sdk.runtime.models.core;
	exports org.nasdanika.sdk.runtime.models.core.impl;
	exports org.nasdanika.sdk.runtime.models.core.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires java.scripting;
	
}