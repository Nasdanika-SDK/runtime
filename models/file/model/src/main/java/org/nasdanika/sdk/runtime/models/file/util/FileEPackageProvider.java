package org.nasdanika.sdk.runtime.models.file.util;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.sdk.runtime.models.file.FilePackage;

public class FileEPackageProvider {

	public static EPackage provider() {
		return FilePackage.eINSTANCE;
	}

}
