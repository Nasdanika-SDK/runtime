package org.nasdanika.sdk.runtime.cli.launcher.tests;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.cli.LauncherCommand;
import org.nasdanika.sdk.runtime.cli.launcher.Launcher;

import picocli.CommandLine;

/**
 * Builds the launcher distribution.
 *
 * <p>The heavy lifting of splitting the ~1000 jars into module path and class
 * path is done by {@link LauncherCommand}, which writes the split (with paths
 * relative to the distribution root) into an {@code options} argfile. The
 * wrapper scripts no longer embed that argfile; instead they invoke the
 * dependency-free {@code bootstrap.jar}
 * ({@code org.nasdanika.core:bootstrap}), which resolves the distribution root
 * from its own location, rewrites the relative entries to absolute paths and
 * relaunches a child JVM. This makes the launchers work from any working
 * directory.</p>
 */
public class BuildDistributionIT {

	private static final String MAIN_MODULE = "org.nasdanika.sdk.runtime.cli.launcher";
	private static final String MAIN_CLASS = "org.nasdanika.sdk.runtime.cli.launcher.Launcher";
	private static final String DEBUG_JVM_OPTIONS =
			"-Xdebug -Xrunjdwp:transport=dt_socket,address=8998,server=y";

	/**
	 * The bootstrap jar is located under this path within {@code lib} (Maven
	 * repository layout).
	 */
	private static final String BOOTSTRAP_LIB_SUBPATH = "org/nasdanika/sdk/runtime/bootstrap";

	@Test
	public void generateLauncher() throws IOException {
		File dist = new File("target/dist");
		buildDistribution(dist, ";", "@java");
	}

	@Test
	public void generateWindowsLauncher() throws IOException {
		// The Windows-specific distribution ships a bundled JDK under jdk/.
		File dist = new File("target/dist-win");
		buildDistribution(dist, ";", "@\"%~dp0jdk\\bin\\java.exe\"");
	}

	/**
	 * @param dist         distribution root directory.
	 * @param pathSeparator separator used inside the generated {@code options}
	 *                      argfile (the bootstrap accepts either {@code ;} or
	 *                      {@code :}).
	 * @param batJava       the java invocation used in the generated {@code .bat}
	 *                      wrappers ({@code @java} on PATH, or a bundled JDK).
	 */
	private void buildDistribution(File dist, String pathSeparator, String batJava) throws IOException {
		File lib = new File(dist, "lib");
		lib.mkdirs();

		// Copy the reactor jars into lib (flat).
		for (File tf : new File("target").listFiles()) {
			if (tf.getName().endsWith(".jar")
					&& !tf.getName().endsWith("-sources.jar")
					&& !tf.getName().endsWith("-javadoc.jar")) {
				Files.copy(
						tf.toPath(),
						new File(lib, tf.getName()).toPath(),
						StandardCopyOption.REPLACE_EXISTING);
			}
		}

		// Dump the module layer names so LauncherCommand can split module path vs class path.
		ModuleLayer layer = Launcher.class.getModule().getLayer();
		try (Writer writer = Files.newBufferedWriter(new File(dist, "modules").toPath(), StandardCharsets.UTF_8)) {
			for (String name : layer.modules().stream().map(Module::getName).sorted().toList()) {
				writer.write(name);
				writer.write(System.lineSeparator());
			}
		}

		// Generate the relative options argfile that the bootstrap reads. The
		// generated throwaway script is discarded; only the options file matters.
		File throwaway = new File(dist, "options-launcher.bat");
		CommandLine launcherCommandLine = new CommandLine(new LauncherCommand());
		launcherCommandLine.execute(
				"-j", "@java",
				"-m", MAIN_MODULE,
				"-c", MAIN_CLASS,
				"--add-modules", "ALL-SYSTEM",
				"-f", "options",
				"-b", dist.getPath(),
				"-M", new File(dist, "modules").getPath(),
				"-p", pathSeparator,
				"-o", throwaway.getName());
		throwaway.delete();

		// Locate the bootstrap jar and compute its path relative to the dist root.
		File bootstrapJar = findBootstrapJar(lib);
		Path rel = dist.toPath().relativize(bootstrapJar.toPath());
		String relUnix = rel.toString().replace('\\', '/');
		String relWin = relUnix.replace('/', '\\');

		// Trivial, size-proof wrapper scripts.
		writeScript(new File(dist, "nsdk.bat"),
				batJava + " -jar \"%~dp0" + relWin + "\" %*\r\n");
		writeScript(new File(dist, "nsdk-debug.bat"),
				"@set BOOTSTRAP_JAVA_OPTIONS=" + DEBUG_JVM_OPTIONS + "\r\n"
						+ batJava + " -jar \"%~dp0" + relWin + "\" %*\r\n");
		writeScript(new File(dist, "nsdk"),
				"#!/bin/bash\n"
						+ "exec java -jar \"$(dirname \"$0\")/" + relUnix + "\" \"$@\"\n");
		writeScript(new File(dist, "nsdk-debug"),
				"#!/bin/bash\n"
						+ "export BOOTSTRAP_JAVA_OPTIONS=\"" + DEBUG_JVM_OPTIONS + "\"\n"
						+ "exec java -jar \"$(dirname \"$0\")/" + relUnix + "\" \"$@\"\n");
	}

	private static void writeScript(File file, String content) throws IOException {
		Files.writeString(file.toPath(), content, StandardCharsets.UTF_8);
	}

	/** Finds the {@code bootstrap} jar under {@code lib}. */
	private static File findBootstrapJar(File lib) throws IOException {
		File bootstrapDir = new File(lib, BOOTSTRAP_LIB_SUBPATH);
		if (bootstrapDir.isDirectory()) {
			try (var paths = Files.walk(bootstrapDir.toPath())) {
				var jar = paths
						.map(Path::toFile)
						.filter(f -> f.getName().startsWith("bootstrap-")
								&& f.getName().endsWith(".jar")
								&& !f.getName().endsWith("-sources.jar")
								&& !f.getName().endsWith("-javadoc.jar"))
						.findFirst();
				if (jar.isPresent()) {
					return jar.get();
				}
			}
		}
		throw new IllegalStateException(
				"bootstrap jar not found under " + bootstrapDir
						+ ". Ensure org.nasdanika.core:bootstrap is a dependency.");
	}

}
