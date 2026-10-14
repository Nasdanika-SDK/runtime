package org.nasdanika.sdk.runtime.models.react.flow.services;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

public class FlowEPackageProvider {

	public static EPackage provider() {
		return FlowPackage.eINSTANCE;
	}

}
