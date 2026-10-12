package org.nasdanika.sdk.runtime.cli.launcher.tests;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.cli.launcher.DistributionBuilder;

/**
 * Builds the launcher distributions.
 */
public class BuildDistributionIT {

	@Test
	public void generateLauncher() throws IOException {
		new DistributionBuilder(new File("target/dist")).build();
	}

	@Test
	public void generateWindowsLauncher() throws IOException {
		// The Windows-specific distribution ships a bundled JDK under jdk/.
		new DistributionBuilder(new File("target/dist-win")) {

			@Override
			protected String getBatJava() {
				return "@\"%~dp0jdk\\bin\\java.exe\"";
			}

		}.build();
	}

}
