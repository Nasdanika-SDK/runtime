package org.nasdanika.sdk.runtime.cli.launcher;

import java.io.File;

/**
 * Builds a distribution launched by {@link Launcher}. The application module
 * defaults to the launcher module. An assembly with its own commands and
 * dependencies passes its module, whose {@code requires} and {@code provides}
 * bring them in, while the main class stays {@link Launcher}.
 */
public class DistributionBuilder extends AbstractDistributionBuilder {

	public DistributionBuilder(File distribution) {
		super(distribution);
	}

	@Override
	protected String getModuleName() {
		return Launcher.class.getModule().getName();
	}

	@Override
	protected String getClassName() {
		return Launcher.class.getName();
	}

	@Override
	protected ModuleLayer getModuleLayer() {
		return Launcher.class.getModule().getLayer();
	}

}
