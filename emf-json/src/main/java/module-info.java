import org.nasdanika.sdk.runtime.emf.json.JsonResourceFactoryContributor;
import org.nasdanika.sdk.runtime.emf.json.YamlResourceFactoryContributor;
import org.nasdanika.sdk.runtime.emf.json.YmlResourceFactoryContributor;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

module org.nasdanika.sdk.runtime.emf.json {
	
	requires transitive org.nasdanika.sdk.runtime.common;
	requires emfjson.jackson;
	requires com.fasterxml.jackson.databind;
	requires com.fasterxml.jackson.dataformat.yaml;
	
	provides ResourceSetContributor with 
		JsonResourceFactoryContributor,
		YamlResourceFactoryContributor,
		YmlResourceFactoryContributor;
		
}