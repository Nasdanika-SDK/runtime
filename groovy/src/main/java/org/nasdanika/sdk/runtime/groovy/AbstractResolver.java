package org.nasdanika.sdk.runtime.groovy;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.groovy.dsl.DslContext.Resolver;
import org.eclipse.emf.ecore.EObject;

/**
 * Registers and looks up global objects in the resource set, see {@link NasdanikaResourceSet#registerGlobal(URI, EObject)}.
 */
public abstract class AbstractResolver implements Resolver {
	
	protected abstract ResourceSet getResourceSet();

	@Override
	public void global(Object id, EObject element) {
		if (getResourceSet() instanceof NasdanikaResourceSet nsdResourceSet) {
			if (id instanceof String idStr) {
				id = URI.createURI(idStr);
			} else if (!(id instanceof URI)) {
				throw new IllegalArgumentException("id must be a String or URI");
			}
			nsdResourceSet.registerGlobal((URI) id, element);
		} else {
			throw new IllegalStateException("ResourceSet is not an instance of NasdanikaResourceSet");
		}
	}
	
	@Override
	public EObject get(String id) {
		return getResourceSet().getEObject(URI.createURI(id), false);
	}
	
}