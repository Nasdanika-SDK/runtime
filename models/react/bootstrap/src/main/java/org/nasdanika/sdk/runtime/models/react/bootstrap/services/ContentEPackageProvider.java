package org.nasdanika.sdk.runtime.models.react.bootstrap.services;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;

public class ContentEPackageProvider {

	public static EPackage provider() {
		return ContentPackage.eINSTANCE;
	}

}
