package org.nasdanika.sdk.runtime.cli;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.Description;
import org.nasdanika.sdk.runtime.common.services.EObjectSupplier;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ParentCommand;

@Command(
		description = "Saves model to a file",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "save")
@ParentCommands(EObjectSupplier.class)
@Description(icon = "https://docs.nasdanika.org/images/diskette.svg")
public class SaveModelCommand extends CommandBase {


	@Parameters(
		index =  "0",	
		arity = "1",
		description = "Output file")
	private File output;

	@ParentCommand
	private EObjectSupplier<EObject> eObjectSupplier;
	
	@Mixin
	private ResourceSetMixIn resourceSetMixIn;
	
	@Override
	protected Integer execute(Span span, Logger logger) throws Exception {
		ResourceSet resourceSet = resourceSetMixIn.createResourceSet();
		URI resourceURI = URI.createFileURI(output.getAbsolutePath());		
		Resource resource = resourceSet.createResource(resourceURI);
		resource.getContents().addAll(eObjectSupplier.getEObjects());
		resource.save(null);		
		return 0;
	}	

}
