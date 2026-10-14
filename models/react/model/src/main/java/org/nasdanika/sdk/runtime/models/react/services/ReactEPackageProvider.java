package org.nasdanika.sdk.runtime.models.react.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.ReactPackage;

public class ReactEPackageProvider {

	public static EPackage provider() {
		return ReactPackage.eINSTANCE;
	}

}
