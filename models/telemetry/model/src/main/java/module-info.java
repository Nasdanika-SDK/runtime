import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.telemetry.util.LogsEPackageProvider;
import org.nasdanika.sdk.runtime.models.telemetry.util.MetricsEPackageProvider;
import org.nasdanika.sdk.runtime.models.telemetry.util.TelemetryEPackageProvider;
import org.nasdanika.sdk.runtime.models.telemetry.util.TracesEPackageProvider;

module org.nasdanika.sdk.runtime.models.telemetry {
	
	exports org.nasdanika.sdk.runtime.models.telemetry;
	exports org.nasdanika.sdk.runtime.models.telemetry.impl;
	exports org.nasdanika.sdk.runtime.models.telemetry.util;
	
	exports org.nasdanika.sdk.runtime.models.telemetry.logs;
	exports org.nasdanika.sdk.runtime.models.telemetry.logs.impl;
	exports org.nasdanika.sdk.runtime.models.telemetry.logs.util;
	
	exports org.nasdanika.sdk.runtime.models.telemetry.metrics;
	exports org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;
	exports org.nasdanika.sdk.runtime.models.telemetry.metrics.util;
	
	exports org.nasdanika.sdk.runtime.models.telemetry.traces;
	exports org.nasdanika.sdk.runtime.models.telemetry.traces.impl;
	exports org.nasdanika.sdk.runtime.models.telemetry.traces.util;
	
	requires transitive org.eclipse.emf.common;
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.ecore.change;
	
	provides EPackage with 
		TelemetryEPackageProvider,
		LogsEPackageProvider,
		MetricsEPackageProvider,
		TracesEPackageProvider;
	
}