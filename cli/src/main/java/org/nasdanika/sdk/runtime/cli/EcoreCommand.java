package org.nasdanika.sdk.runtime.cli;

import java.util.Collection;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.common.Description;
import org.nasdanika.sdk.runtime.common.services.EModelElementSupplier;
import org.nasdanika.sdk.runtime.common.services.EObjectSupplier;

import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Filters Ecore model elements",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "ecore")
@ParentCommands(EObjectSupplier.class)
@Description(icon = "https://cdn.jsdelivr.net/gh/Nasdanika-Models/ecore@master/graph/web-resources/icons/EcoreModelFile.gif")
public class EcoreCommand extends CommandGroup implements EModelElementSupplier<EModelElement> {
	
	@ParentCommand
	EObjectSupplier<EObject> eObjectSupplier;

	@Override
	public Collection<EModelElement> getEObjects() {
		return eObjectSupplier.getEObjects().stream()
				.filter(EModelElement.class::isInstance)
				.map(EModelElement.class::cast)
				.toList(); 
	}

}
