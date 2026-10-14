package org.nasdanika.sdk.runtime.models.html.bootstrap.services;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

public class ContentEPackageProvider {

	public static EPackage provider() {
		return ContentPackage.eINSTANCE;
	}

}
