package org.nasdanika.sdk.runtime.models.svg.services;

import java.lang.invoke.MethodHandles;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.models.svg.resource.SvgResourceContentsHandler;

/**
 * Offers {@link SvgResourceContentsHandler} for resources whose name has an {@code svg} qualifier
 * at the position being resolved, the last one: {@code diagram.svg}. A more specific handler wins
 * for a name with a qualifier to the left, such as the Draw.io model's for {@code diagram.drawio.svg}.
 */
public class SvgCapabilityFactory extends ReflectiveCapabilityFactory {

	public static final String QUALIFIER = "svg";

	public SvgCapabilityFactory() {
		super(MethodHandles.lookup());
	}

	@Capability
	public ResourceContentsHandler<EObject[]> svg(ResourceContentsHandler.Requirement requirement) {
		boolean mine = requirement.getContentsType() == EObject[].class
				&& requirement.getQualifierIndex() == 0
				&& QUALIFIER.equalsIgnoreCase(requirement.getQualifiers()[0]);
		return mine ? new SvgResourceContentsHandler(requirement.getResource().getURI()) : null;
	}

}
