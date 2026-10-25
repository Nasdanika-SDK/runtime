package org.nasdanika.sdk.runtime.models.drawio.services;

import java.lang.invoke.MethodHandles;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.models.drawio.resource.DrawioResourceContentsHandler;
import org.nasdanika.sdk.runtime.models.drawio.resource.DrawioResourceContentsHandler.Format;

/**
 * Offers {@link DrawioResourceContentsHandler} for resources whose name has a {@code drawio}
 * qualifier at the position being resolved: {@code system.drawio} as XML, and the editable
 * images Draw.io exports, {@code system.drawio.png} and {@code system.drawio.svg}, by the
 * qualifier to the right of {@code drawio}.
 */
public class DrawioCapabilityFactory extends ReflectiveCapabilityFactory {

	public static final String QUALIFIER = "drawio";

	public DrawioCapabilityFactory() {
		super(MethodHandles.lookup());
	}

	@Capability
	public ResourceContentsHandler<EObject[]> drawio(ResourceContentsHandler.Requirement requirement) {
		String[] qualifiers = requirement.getQualifiers(); // Right to left
		int index = requirement.getQualifierIndex();
		if (requirement.getContentsType() != EObject[].class || !QUALIFIER.equalsIgnoreCase(qualifiers[index])) {
			return null;
		}
		Format format = index == 0 ? Format.XML : switch (qualifiers[index - 1].toLowerCase()) {
			case "png" -> Format.PNG;
			case "svg" -> Format.SVG;
			case "xml" -> Format.XML;
			default -> null;
		};
		return format == null ? null : new DrawioResourceContentsHandler(requirement.getResource().getURI(), format);
	}

}
