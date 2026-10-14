import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.services.BootstrapEPackageProvider;
import org.nasdanika.sdk.runtime.models.html.bootstrap.services.ContentEPackageProvider;
import org.nasdanika.sdk.runtime.models.html.bootstrap.services.FormsEPackageProvider;
import org.nasdanika.sdk.runtime.models.html.bootstrap.services.NavigationEPackageProvider;
import org.nasdanika.sdk.runtime.models.html.bootstrap.services.OverlaysEPackageProvider;

module org.nasdanika.sdk.runtime.models.html.bootstrap {
	
	exports org.nasdanika.sdk.runtime.models.html.bootstrap;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.impl;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.util;
	
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.forms;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.forms.util;
	
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.util;
	
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.util;
	
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.impl;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.components.overlays.util;
	
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.generator;
	exports org.nasdanika.sdk.runtime.models.html.bootstrap.builders;
	
	requires transitive org.nasdanika.sdk.runtime.models.html;
	
	provides EPackage with 
		BootstrapEPackageProvider,
		FormsEPackageProvider,
		ContentEPackageProvider,
		NavigationEPackageProvider,
		OverlaysEPackageProvider;
	
}