package org.nasdanika.sdk.runtime.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.emf.ecore.EPackage;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;

class TestResourceSetContribution {

	@Test
	void testCorePackageRegistration() {
		NasdanikaResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		EPackage corePackage = resourceSet.getPackageRegistry().getEPackage("https://runtime.sdk.nasdanika.org/models/core");
		assertNotNull(corePackage);		
	}

}
