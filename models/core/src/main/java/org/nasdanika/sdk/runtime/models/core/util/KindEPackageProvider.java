package org.nasdanika.sdk.runtime.models.core.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.core.kind.KindPackage;

public class KindEPackageProvider {

	public static EPackage provider() {
		return KindPackage.eINSTANCE;
	}

}
