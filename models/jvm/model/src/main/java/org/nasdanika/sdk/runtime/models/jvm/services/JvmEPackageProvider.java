package org.nasdanika.sdk.runtime.models.jvm.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;

public class JvmEPackageProvider {

	public static EPackage provider() {
		return JvmPackage.eINSTANCE;
	}

}
