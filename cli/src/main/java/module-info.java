import org.nasdanika.sdk.runtime.cli.EcoreCommandFactory;
import org.nasdanika.sdk.runtime.cli.RootCommandFactory;
import org.nasdanika.sdk.runtime.cli.SaveModelCommandFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;

module org.nasdanika.sdk.runitme.cli {
			
	exports org.nasdanika.sdk.runtime.cli;
	
	requires transitive org.nasdanika.sdk.runtime.common;
	requires transitive org.nasdanika.sdk.runtime.picocli;
	requires transitive org.jline;
	requires transitive io.opentelemetry.context;
	requires io.opentelemetry.api;
	requires org.json;
	requires org.yaml.snakeyaml;
	
	opens org.nasdanika.sdk.runtime.cli;
	
	provides CapabilityFactory with 
		RootCommandFactory,
		SaveModelCommandFactory,
		EcoreCommandFactory;
		
}