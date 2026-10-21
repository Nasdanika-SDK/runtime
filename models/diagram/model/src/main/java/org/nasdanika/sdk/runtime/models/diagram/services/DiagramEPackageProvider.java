package org.nasdanika.sdk.runtime.models.diagram.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

public class DiagramEPackageProvider {

	public static EPackage provider() {
		return DiagramPackage.eINSTANCE;
	}

}
