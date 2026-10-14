package org.nasdanika.sdk.runtime.models.typescript.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

public class TypescriptEPackageProvider {

	public static EPackage provider() {
		return TypescriptPackage.eINSTANCE;
	}

}
