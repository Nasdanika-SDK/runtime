package org.nasdanika.sdk.runtime.models.telemetry.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;

public class LogsEPackageProvider {

	public static EPackage provider() {
		return LogsPackage.eINSTANCE;
	}

}
