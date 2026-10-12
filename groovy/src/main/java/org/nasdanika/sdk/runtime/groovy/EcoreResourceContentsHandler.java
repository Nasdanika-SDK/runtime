package org.nasdanika.sdk.runtime.groovy;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;

/**
 * DSL bound to {@link EcorePackage}, for {@code .ecore.groovy} files: {@code ePackage}, {@code eClass},
 * {@code eAttribute} and the other concrete Ecore classes are entry points.
 */
public class EcoreResourceContentsHandler extends DslResourceContentsHandler {

	public EcoreResourceContentsHandler(Resource resource, ResourceContentsHandler<CompiledScript> sourceHandler) {
		super(resource, sourceHandler, EcorePackage.eINSTANCE);
	}

}
