import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.groovy.CompiledScriptResourceContentsHandlerCapabilityFactory;
import org.nasdanika.sdk.runtime.groovy.DslResourceContentsHandlerCapabilityFactory;
import org.nasdanika.sdk.runtime.groovy.EcoreResourceContentsHandlerCapabilityFactory;
import org.nasdanika.sdk.runtime.groovy.GroovyResourceFactoryContributor;

module org.nasdanika.sdk.runtime.groovy {

	exports org.nasdanika.sdk.runtime.groovy;
	exports org.nasdanika.sdk.runtime.groovy.dsl;
	opens org.nasdanika.sdk.runtime.groovy.dsl;

	requires transitive org.apache.groovy.jsr223;
	requires transitive org.apache.groovy;
	requires transitive org.nasdanika.sdk.runtime.common;
	requires transitive java.scripting;

	provides CapabilityFactory with
		CompiledScriptResourceContentsHandlerCapabilityFactory,
		DslResourceContentsHandlerCapabilityFactory,
		EcoreResourceContentsHandlerCapabilityFactory;

	provides ResourceSetContributor with
		GroovyResourceFactoryContributor;

}
