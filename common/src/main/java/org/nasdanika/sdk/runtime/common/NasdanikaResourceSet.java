package org.nasdanika.sdk.runtime.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.nasdanika.sdk.runtime.common.services.ResourceSetContributor;

import io.opentelemetry.api.OpenTelemetry;

/**
 * Supports registration of global objects.
 */
public class NasdanikaResourceSet extends ResourceSetImpl {
	
	private Map<URI, EObject> globals = new ConcurrentHashMap<>();
	
	public void registerGlobal(URI uri, EObject global) {
		// TOOD - log global registration via a telemetry logger
		globals.put(uri, global);
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		return globals.compute(uri, (k,v) -> v == null ? super.getEObject(k, loadOnDemand) : v);
	}
	
	public Map<URI, EObject> getGlobals() {
		return globals;
	}
	
	public static NasdanikaResourceSet createAndConfigure() {
		NasdanikaResourceSet ret = new NasdanikaResourceSet();
		ResourceSetContributor.configure(ret);	
		return ret;
	}
	
	public static NasdanikaResourceSet createAndConfigure(ClassLoader loader) {
		NasdanikaResourceSet ret = new NasdanikaResourceSet();
		ResourceSetContributor.configure(ret, loader);	
		return ret;
	}
	
	/**
	 * @param openTelemetry Attached to the resource set, used when no instance is current
	 */
	public static NasdanikaResourceSet createAndConfigure(OpenTelemetry openTelemetry) {
		NasdanikaResourceSet ret = new NasdanikaResourceSet();
		ResourceSetContributor.configure(ret, openTelemetry);	
		return ret;
	}
	
	/**
	 * @param openTelemetry Attached to the resource set, used when no instance is current
	 */
	public static NasdanikaResourceSet createAndConfigure(ClassLoader loader, OpenTelemetry openTelemetry) {
		NasdanikaResourceSet ret = new NasdanikaResourceSet();
		ResourceSetContributor.configure(ret, loader, openTelemetry);	
		return ret;
	}
	
}
