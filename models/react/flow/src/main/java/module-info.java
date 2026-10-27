import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.flow.services.FlowEPackageProvider;

// tag::module[]
module org.nasdanika.sdk.runtime.models.react.flow {

	exports org.nasdanika.sdk.runtime.models.react.flow;
	exports org.nasdanika.sdk.runtime.models.react.flow.impl;
	exports org.nasdanika.sdk.runtime.models.react.flow.util;
	exports org.nasdanika.sdk.runtime.models.react.flow.layout;

	requires transitive org.nasdanika.sdk.runtime.models.react;

	provides EPackage with FlowEPackageProvider;

}
// end::module[]
