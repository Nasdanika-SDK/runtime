package org.nasdanika.sdk.runtime.cli;

import java.util.List;
import java.util.concurrent.Flow.Publisher;

import org.nasdanika.sdk.runtime.common.Util;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.services.EModelElementSupplier;
import org.nasdanika.sdk.runtime.common.services.EObjectSupplier;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

public class EcoreCommandFactory extends SubCommandCapabilityFactory<EcoreCommand> {

	@Override
	protected Class<EcoreCommand> getCommandType() {
		return EcoreCommand.class;
	}
	
	@Override
	protected Publisher<EcoreCommand> doCreateCommand(
			List<CommandLine> parentPath, 
			Loader loader, 
			Span span,
			Logger logger) {
		
		// Do not bind to EModelElementSuppliers and other sub-interfaces of EObjectSupplier - would be an infinite loop
		if (!parentPath.isEmpty()) {
			CommandLine lastCommand = parentPath.get(parentPath.size() - 1);
			Object userObject = lastCommand.getCommandSpec().userObject();
			if (userObject instanceof EModelElementSupplier) {
				return null;
			}
			if (userObject instanceof EObjectSupplier) {
				// Check for sub-interfaces of EObjectSupplier
				Class<?> commandClass = userObject.getClass();
				for (Class<?> ancestor: Util.lineage(commandClass)) {
					if (ancestor.isInterface() && EObjectSupplier.class.isAssignableFrom(ancestor) && ancestor != EObjectSupplier.class) {
						return null;
					}
				}; 
			}
		}
			
		return Flows.of(new EcoreCommand());
	}

}
