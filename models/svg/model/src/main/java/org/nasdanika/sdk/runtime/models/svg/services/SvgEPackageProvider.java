package org.nasdanika.sdk.runtime.models.svg.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

public class SvgEPackageProvider {

	public static EPackage provider() {
		return SvgPackage.eINSTANCE;
	}

}
