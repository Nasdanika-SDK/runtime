package org.nasdanika.sdk.runtime.models.meta.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;

public class MetaEPackageProvider {

	public static EPackage provider() {
		return MetaPackage.eINSTANCE;
	}

}
