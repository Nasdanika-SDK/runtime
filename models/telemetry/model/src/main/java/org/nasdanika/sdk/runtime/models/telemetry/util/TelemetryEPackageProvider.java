package org.nasdanika.sdk.runtime.models.telemetry.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

public class TelemetryEPackageProvider {

	public static EPackage provider() {
		return TelemetryPackage.eINSTANCE;
	}

}
