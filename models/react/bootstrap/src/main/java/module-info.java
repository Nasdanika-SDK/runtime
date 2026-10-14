import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.services.BootstrapEPackageProvider;
import org.nasdanika.sdk.runtime.models.react.bootstrap.services.ContentEPackageProvider;
import org.nasdanika.sdk.runtime.models.react.bootstrap.services.FormsEPackageProvider;
import org.nasdanika.sdk.runtime.models.react.bootstrap.services.NavigationEPackageProvider;
import org.nasdanika.sdk.runtime.models.react.bootstrap.services.OverlaysEPackageProvider;

module org.nasdanika.sdk.runtime.models.react.bootstrap {
	
	exports org.nasdanika.sdk.runtime.models.react.bootstrap;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.impl;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.util;
	
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.forms;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.forms.util;
	
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.util;
	
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.util;
	
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.impl;
	exports org.nasdanika.sdk.runtime.models.react.bootstrap.components.overlays.util;
	
	requires transitive org.nasdanika.sdk.runtime.models.react;
	/* Themes and documents of React Bootstrap pages; static Bootstrap elements as intrinsics */
	requires transitive org.nasdanika.sdk.runtime.models.html.bootstrap;
	requires java.net.http;
	requires jdk.httpserver;
	
	provides EPackage with 
		BootstrapEPackageProvider,
		FormsEPackageProvider,
		ContentEPackageProvider,
		NavigationEPackageProvider,
		OverlaysEPackageProvider;
	
}