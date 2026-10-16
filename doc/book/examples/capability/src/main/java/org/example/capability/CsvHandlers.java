package org.example.capability;

import java.lang.invoke.MethodHandles;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;

// tag::csv-capability[]
/**
 * Offers the CSV handler for resources whose name has a {@code csv} qualifier at the
 * position being resolved, such as {@code shelf.csv}. It reads the bytes of the resource
 * itself, so it does not chain to a handler on its right.
 */
public class CsvHandlers extends ReflectiveCapabilityFactory {

	public CsvHandlers() {
		super(MethodHandles.lookup());
	}

	@Capability
	public ResourceContentsHandler<EObject[]> csv(ResourceContentsHandler.Requirement r) {
		String qualifier = r.getQualifiers()[r.getQualifierIndex()];
		boolean mine = r.getContentsType() == EObject[].class
				&& "csv".equalsIgnoreCase(qualifier);
		return mine ? new CsvLibraryHandler() : null;
	}

}
// end::csv-capability[]
