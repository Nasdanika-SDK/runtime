package org.nasdanika.sdk.runtime.models.core.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.core.CorePackage;

public class CoreEPackageProvider {

	public static EPackage provider() {
		return CorePackage.eINSTANCE;
	}

}
