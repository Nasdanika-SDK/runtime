package org.nasdanika.sdk.runtime.models.presentation.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;

public class PresentationEPackageProvider {

	public static EPackage provider() {
		return PresentationPackage.eINSTANCE;
	}

}
