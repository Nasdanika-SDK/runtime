module org.nasdanika.sdk.runtime.picocli {
	
	// Waiting for Picocli 4.8.0 with Nasdanika contributions
	// Bundling picocli with this module in the meantime
    exports picocli;
    requires static java.sql;	
	
}