package org.example.dsl;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.resource.Resource;
import org.example.library.LibraryPackage;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.groovy.DslResourceContentsHandler;

// tag::handler[]
/**
 * The whole DSL for libraries: the metamodel is the language.
 */
public class LibraryDslHandler extends DslResourceContentsHandler {

	public LibraryDslHandler(
			Resource resource,
			ResourceContentsHandler<CompiledScript> sourceHandler) {
		super(resource, sourceHandler, LibraryPackage.eINSTANCE);
	}

}
// end::handler[]
