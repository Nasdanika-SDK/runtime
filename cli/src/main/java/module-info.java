import org.nasdanika.sdk.runtime.cli.DocumentToModelCommandFactory;
import org.nasdanika.sdk.runtime.cli.DrawioCommandFactory;
import org.nasdanika.sdk.runtime.cli.EcoreCommandFactory;
import org.nasdanika.sdk.runtime.cli.ElementInvocableCommandFactory;
import org.nasdanika.sdk.runtime.cli.HelpCommandFactory;
import org.nasdanika.sdk.runtime.cli.InvokeCommandFactory;
import org.nasdanika.sdk.runtime.cli.RootCommandFactory;
import org.nasdanika.sdk.runtime.cli.SaveDocumentCommandFactory;
import org.nasdanika.sdk.runtime.cli.SaveModelCommandFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;

module org.nasdanika.sdk.runitme.cli {
			
	exports org.nasdanika.sdk.runtime.cli;
	
	requires transitive org.nasdanika.sdk.runtime.common;
	requires transitive org.nasdanika.sdk.runtime.picocli;
	requires transitive org.jline;
	requires transitive io.opentelemetry.context;
	requires io.opentelemetry.api;
	
	opens org.nasdanika.sdk.runtime.cli;
	
	provides CapabilityFactory with 
		RootCommandFactory,
		HelpCommandFactory,
		DrawioCommandFactory,
		SaveModelCommandFactory,
		SaveDocumentCommandFactory,
		DocumentToModelCommandFactory,
		InvokeCommandFactory,
//		CallableElementInvocableCommandFactory, Invocable factory below is more flexible.
		ElementInvocableCommandFactory,
		EcoreCommandFactory;
		
}