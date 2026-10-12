package org.nasdanika.sdk.runtime.cli.launcher;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Optional;
import java.util.stream.Stream;

import org.nasdanika.sdk.runtime.cli.LauncherCommand;

import picocli.CommandLine;

/**
 * Builds a CLI distribution: a {@code lib} directory of jars, an {@code options}
 * argfile and wrapper scripts.
 *
 * <p>The heavy lifting of splitting the jars into module path and class path is
 * done by {@link LauncherCommand}, which writes the split (with paths relative to
 * the distribution root) into the {@code options} argfile. The wrapper scripts
 * do not embed that argfile; instead they invoke the dependency-free
 * {@code bootstrap.jar} ({@code org.nasdanika.sdk.runtime:bootstrap}), which
 * resolves the distribution root from its own location, rewrites the relative
 * entries to absolute paths and relaunches a child JVM. This makes the launchers
 * work from any working directory.</p>
 *
 * <p>Dependencies are expected to be copied into {@code lib} beforehand, e.g. by
 * {@code maven-dependency-plugin:copy-dependencies} with the repository layout.
 * The builder copies the project's own jars from {@link #getSourceDirectory()}.</p>
 *
 * <p>Customization is done by overriding the protected getters and steps.</p>
 */
public abstract class AbstractDistributionBuilder {

	public static final String DEBUG_JVM_OPTIONS = "-Xdebug -Xrunjdwp:transport=dt_socket,address=8998,server=y";

	private final File distribution;

	/**
	 * @param distribution Distribution root directory.
	 */
	protected AbstractDistributionBuilder(File distribution) {
		this.distribution = distribution;
	}

	public File getDistribution() {
		return distribution;
	}

	/** @return Application (main) module, its {@code requires} and {@code provides} define the assembly. */
	protected abstract String getModuleName();

	/** @return Main class. */
	protected abstract String getClassName();

	/** @return Module layer whose module names are used to split module path and class path. */
	protected abstract ModuleLayer getModuleLayer();

	/** @return Directory with the project's own jars, copied to {@code lib}. */
	protected File getSourceDirectory() {
		return new File("target");
	}

	protected File getLibDirectory() {
		return new File(distribution, "lib");
	}

	protected String getModulesFileName() {
		return "modules";
	}

	protected String getOptionsFileName() {
		return "options";
	}

	/**
	 * @return Separator used inside the generated options argfile. The bootstrap
	 * accepts either {@code ;} or {@code :}.
	 */
	protected String getPathSeparator() {
		return ";";
	}

	/** @return {@code --add-modules} value. */
	protected String getAddModules() {
		return "ALL-SYSTEM";
	}

	/** @return Base name of the wrapper scripts. */
	protected String getScriptName() {
		return "nsdk";
	}

	/** @return Java invocation in {@code .bat} wrappers, {@code @java} on PATH or a bundled JDK. */
	protected String getBatJava() {
		return "@java";
	}

	/** @return Java invocation in shell wrappers. */
	protected String getShJava() {
		return "java";
	}

	/** @return JVM options for debug wrappers, null not to generate debug wrappers. */
	protected String getDebugJvmOptions() {
		return DEBUG_JVM_OPTIONS;
	}

	/** @return Path of the bootstrap jar directory within {@code lib} (Maven repository layout). */
	protected String getBootstrapLibSubPath() {
		return "org/nasdanika/sdk/runtime/bootstrap";
	}

	public void build() throws IOException {
		File lib = getLibDirectory();
		lib.mkdirs();
		copyJars(lib);
		File modulesFile = writeModules();
		generateOptions(modulesFile);
		Path bootstrapJar = distribution.toPath().relativize(findBootstrapJar(lib).toPath());
		writeScripts(bootstrapJar.toString().replace('\\', '/'));
	}

	/** Copies the project's own jars (excluding sources and javadoc) to lib (flat). */
	protected void copyJars(File lib) throws IOException {
		File[] files = getSourceDirectory().listFiles();
		if (files == null) {
			return;
		}
		for (File file : files) {
			if (isJar(file)) {
				Files.copy(
						file.toPath(),
						new File(lib, file.getName()).toPath(),
						StandardCopyOption.REPLACE_EXISTING);
			}
		}
	}

	protected static boolean isJar(File file) {
		String name = file.getName();
		return file.isFile()
				&& name.endsWith(".jar")
				&& !name.endsWith("-sources.jar")
				&& !name.endsWith("-javadoc.jar");
	}

	/** Dumps the module layer names so {@link LauncherCommand} can split module path vs class path. */
	protected File writeModules() throws IOException {
		File modulesFile = new File(distribution, getModulesFileName());
		try (Writer writer = Files.newBufferedWriter(modulesFile.toPath(), StandardCharsets.UTF_8)) {
			for (String name : getModuleLayer().modules().stream().map(Module::getName).sorted().toList()) {
				writer.write(name);
				writer.write(System.lineSeparator());
			}
		}
		return modulesFile;
	}

	/**
	 * Generates the relative options argfile which the bootstrap reads.
	 * The launcher script generated by {@link LauncherCommand} is discarded.
	 */
	protected void generateOptions(File modulesFile) throws IOException {
		File throwaway = new File(distribution, "options-launcher.bat");
		int exitCode = new CommandLine(new LauncherCommand()).execute(
				"-j", "@java",
				"-m", getModuleName(),
				"-c", getClassName(),
				"--add-modules", getAddModules(),
				"-f", getOptionsFileName(),
				"-b", distribution.getPath(),
				"-M", modulesFile.getPath(),
				"-p", getPathSeparator(),
				"-o", throwaway.getName());
		Files.deleteIfExists(throwaway.toPath());
		if (exitCode != 0) {
			throw new IOException("Options generation failed with exit code " + exitCode);
		}
	}

	/** Finds the bootstrap jar under lib. */
	protected File findBootstrapJar(File lib) throws IOException {
		File bootstrapDir = new File(lib, getBootstrapLibSubPath());
		if (bootstrapDir.isDirectory()) {
			try (Stream<Path> paths = Files.walk(bootstrapDir.toPath())) {
				Optional<File> jar = paths
						.map(Path::toFile)
						.filter(f -> f.getName().startsWith("bootstrap-") && isJar(f))
						.findFirst();
				if (jar.isPresent()) {
					return jar.get();
				}
			}
		}
		throw new IllegalStateException(
				"bootstrap jar not found under " + bootstrapDir
						+ ". Ensure org.nasdanika.sdk.runtime:bootstrap is a dependency.");
	}

	/**
	 * Writes trivial, size-proof wrapper scripts.
	 * @param bootstrapJar Bootstrap jar path relative to the distribution root, with forward slashes.
	 */
	protected void writeScripts(String bootstrapJar) throws IOException {
		String scriptName = getScriptName();
		writeScript(scriptName + ".bat", batScript(bootstrapJar, null));
		writeScript(scriptName, shScript(bootstrapJar, null));
		String debugJvmOptions = getDebugJvmOptions();
		if (debugJvmOptions != null) {
			writeScript(scriptName + "-debug.bat", batScript(bootstrapJar, debugJvmOptions));
			writeScript(scriptName + "-debug", shScript(bootstrapJar, debugJvmOptions));
		}
	}

	/** @param jvmOptions Options passed to the child JVM via {@code BOOTSTRAP_JAVA_OPTIONS}, may be null. */
	protected String batScript(String bootstrapJar, String jvmOptions) {
		StringBuilder builder = new StringBuilder();
		if (jvmOptions != null) {
			builder.append("@set BOOTSTRAP_JAVA_OPTIONS=").append(jvmOptions).append("\r\n");
		}
		builder.append(getBatJava())
			.append(" -jar \"%~dp0")
			.append(bootstrapJar.replace('/', '\\'))
			.append("\" %*\r\n");
		return builder.toString();
	}

	/** @param jvmOptions Options passed to the child JVM via {@code BOOTSTRAP_JAVA_OPTIONS}, may be null. */
	protected String shScript(String bootstrapJar, String jvmOptions) {
		StringBuilder builder = new StringBuilder("#!/bin/bash\n");
		if (jvmOptions != null) {
			builder.append("export BOOTSTRAP_JAVA_OPTIONS=\"").append(jvmOptions).append("\"\n");
		}
		builder.append("exec ")
			.append(getShJava())
			.append(" -jar \"$(dirname \"$0\")/")
			.append(bootstrapJar)
			.append("\" \"$@\"\n");
		return builder.toString();
	}

	protected void writeScript(String name, String content) throws IOException {
		Files.writeString(new File(distribution, name).toPath(), content, StandardCharsets.UTF_8);
	}

}
