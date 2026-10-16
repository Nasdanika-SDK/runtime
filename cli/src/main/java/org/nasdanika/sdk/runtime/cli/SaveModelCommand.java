package org.nasdanika.sdk.runtime.cli;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.Description;
import org.nasdanika.sdk.runtime.common.services.EObjectSupplier;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Parameters;

@Command(
		description = "Saves model to a file",
		versionProvider = ModuleVersionProvider.class,		
		mixinStandardHelpOptions = true,
		name = "save")
@Description(icon = "https://docs.nasdanika.org/images/diskette.svg")
public class SaveModelCommand extends CommandBase {


	@Parameters(
		index =  "0",
		arity = "1",
		description = "Output file")
	private File output;

	/**
	 * A parent that produces the objects when asked, inside this command's span: preferred, and
	 * the right shape for contents that are expensive to obtain.
	 */
	@Parent
	private ExecutionSupplier<? extends Collection<? extends EObject>> contentsSupplier;

	/**
	 * A parent that is an {@link EObjectSupplier}. One parent, two ways to take it: only one of these
	 * fields is injected.
	 */
	@Parent
	private EObjectSupplier<? extends EObject> eObjectSupplier;

	@Mixin
	private ResourceSetMixIn resourceSetMixIn;

	@Override
	protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
		Collection<? extends EObject> contents = contentsSupplier == null ? eObjectSupplier.getEObjects() : contentsSupplier.get(span, logger, meter);
		ResourceSet resourceSet = resourceSetMixIn.createResourceSet();
		URI resourceURI = URI.createFileURI(output.getAbsolutePath());
		Resource resource = resourceSet.createResource(resourceURI);
		resource.getContents().addAll(contents);
		resource.save(null);
		return 0;
	}

}
