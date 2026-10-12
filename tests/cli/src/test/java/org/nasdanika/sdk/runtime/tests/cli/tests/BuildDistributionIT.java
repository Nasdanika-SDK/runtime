package org.nasdanika.sdk.runtime.tests.cli.tests;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.cli.launcher.DistributionBuilder;

/**
 * Builds the test/demo CLI distribution: this module's commands and
 * dependencies, launched by the cli-launcher Launcher.
 */
public class BuildDistributionIT {

	@Test
	public void generateLauncher() throws IOException {
		new DistributionBuilder(new File("target/dist")).build();
	}

}
