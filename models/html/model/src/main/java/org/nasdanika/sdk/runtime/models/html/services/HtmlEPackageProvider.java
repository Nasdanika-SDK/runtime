package org.nasdanika.sdk.runtime.models.html.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

public class HtmlEPackageProvider {

	public static EPackage provider() {
		return HtmlPackage.eINSTANCE;
	}

}
