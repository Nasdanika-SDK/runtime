package org.nasdanika.sdk.runtime.models.telemetry.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

public class TracesEPackageProvider {

	public static EPackage provider() {
		return TracesPackage.eINSTANCE;
	}

}
