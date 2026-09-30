package org.nasdanika.sdk.runtime.models.core.util;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;
import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.kind.KindPackage;

public class CoreEPackageResourceSetConfigurator implements ResourceSetContributor {

	@Override
	public void contribute(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(KindPackage.eNS_URI, KindPackage.eINSTANCE);
	}

}
