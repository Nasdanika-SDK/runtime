package org.nasdanika.sdk.runtime.models.drawio.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;

public class DrawioEPackageProvider {

	public static EPackage provider() {
		return DrawioPackage.eINSTANCE;
	}

}
