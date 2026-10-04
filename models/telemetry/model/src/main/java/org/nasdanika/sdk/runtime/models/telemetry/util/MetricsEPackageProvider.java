package org.nasdanika.sdk.runtime.models.telemetry.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;

public class MetricsEPackageProvider {

	public static EPackage provider() {
		return MetricsPackage.eINSTANCE;
	}

}
