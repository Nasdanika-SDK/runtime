import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.svg.services.SvgEPackageProvider;

module org.nasdanika.sdk.runtime.models.svg {
	
	exports org.nasdanika.sdk.runtime.models.svg;
	exports org.nasdanika.sdk.runtime.models.svg.impl;
	exports org.nasdanika.sdk.runtime.models.svg.util;

	requires org.eclipse.emf.ecore;
	requires org.eclipse.emf.common;
	
	provides EPackage with SvgEPackageProvider;
	
}