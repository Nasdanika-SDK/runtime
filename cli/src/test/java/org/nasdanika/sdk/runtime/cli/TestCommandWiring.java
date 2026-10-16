package org.nasdanika.sdk.runtime.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.Adapter;
import org.nasdanika.sdk.runtime.common.services.EObjectSupplier;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

/**
 * How commands declare what they need from their parent and what sub-commands they take, and when
 * it is matched and injected. In this package because it is open: injection reaches private members.
 */
class TestCommandWiring {

	// --- Parent: a command needing something from its parent ---

	/**
	 * Provides its contents through an adapter - lazily, as a supplier called in the child's span.
	 */
	@Command(name = "model", mixinStandardHelpOptions = true)
	static class ModelCommand extends CommandGroup {

		@Option(names = "--name")
		String name = "default";

		int loads;

		@Adapter
		public ExecutionSupplier<List<EObject>> contents() {
			return (span, logger, meter) -> {
				++loads;
				EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
				ePackage.setName(name); // Parsed by now: the adapter runs after parsing
				return List.of(ePackage, EcoreFactory.eINSTANCE.createEClass());
			};
		}

	}

	@Command(name = "count", mixinStandardHelpOptions = true)
	static class CountCommand extends CommandBase {

		@Parent
		ExecutionSupplier<? extends Collection<? extends EObject>> contents;

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) throws Exception {
			return contents.get(span, logger, meter).size();
		}

	}

	static CommandLine commandLine(Object root, Object... subCommands) {
		CommandLine commandLine = new CommandLine(root);
		for (Object subCommand: subCommands) {
			commandLine.addSubcommand(subCommand);
		}
		commandLine.setExecutionStrategy(new WiringExecutionStrategy());
		commandLine.setErr(new PrintWriter(new StringWriter()));
		commandLine.setOut(new PrintWriter(new StringWriter()));
		return commandLine;
	}

	@Test
	void parentIsMatchedByDeclarations() {
		assertThat(CommandWiring.acceptsParent(CountCommand.class, ModelCommand.class)).isTrue();
		assertThat(CommandWiring.acceptsParent(CountCommand.class, RootCommand.class)).as("RootCommand provides no contents").isFalse();
	}

	@Test
	void parentIsInjectedAfterParsingAndSuppliedInExecution() {
		ModelCommand model = new ModelCommand();
		CountCommand count = new CountCommand();
		CommandLine commandLine = commandLine(model, count);
		assertThat(count.contents).as("nothing injected while the tree is built").isNull();

		assertThat(commandLine.execute("--name", "parsed", "count")).isEqualTo(2);
		assertThat(model.loads).as("supplied once, by the executing command").isEqualTo(1);
	}

	/**
	 * Declines: nothing to supply.
	 */
	@Command(name = "empty", mixinStandardHelpOptions = true)
	static class EmptyCommand extends CommandGroup {

		@Adapter
		public ExecutionSupplier<List<EObject>> contents() {
			return null;
		}

	}

	@Test
	void parentThatDeclinesFailsExecutionButNotHelp() {
		assertThat(commandLine(new EmptyCommand(), new CountCommand()).execute("count")).isEqualTo(CommandLine.ExitCode.SOFTWARE);
		assertThat(commandLine(new EmptyCommand(), new CountCommand()).execute("count", "--help")).isEqualTo(CommandLine.ExitCode.OK);
	}

	// --- The save command, both ways of taking its parent ---

	@Command(name = "source", mixinStandardHelpOptions = true)
	static class SourceCommand extends CommandGroup implements EObjectSupplier<EObject> {

		@Override
		public Collection<EObject> getEObjects() {
			EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
			ePackage.setName("source");
			return List.of(ePackage, EcoreFactory.eINSTANCE.createEGenericType());
		}

	}

	@Test
	void saveTakesASupplierOrAnEObjectSupplier(@TempDir Path dir) throws Exception {
		assertThat(CommandWiring.acceptsParent(SaveModelCommand.class, ModelCommand.class)).isTrue();
		assertThat(CommandWiring.acceptsParent(SaveModelCommand.class, SourceCommand.class)).isTrue();

		File fromSupplier = dir.resolve("supplier.xmi").toFile();
		assertThat(commandLine(new ModelCommand(), new SaveModelCommand()).execute("--name", "supplied", "save", fromSupplier.getPath())).isZero();
		assertThat(Files.readString(fromSupplier.toPath())).contains("name=\"supplied\"");

		File fromEObjectSupplier = dir.resolve("eobjects.xmi").toFile();
		assertThat(commandLine(new SourceCommand(), new SaveModelCommand()).execute("save", fromEObjectSupplier.getPath())).isZero();
		assertThat(Files.readString(fromEObjectSupplier.toPath())).contains("name=\"source\"");
	}

	@Test
	void ecoreFiltersWhatItsParentSupplies(@TempDir Path dir) throws Exception {
		assertThat(CommandWiring.acceptsParent(EcoreCommand.class, SourceCommand.class)).isTrue();
		assertThat(CommandWiring.acceptsParent(SaveModelCommand.class, EcoreCommand.class)).as("ecore is an EObjectSupplier").isTrue();

		File file = dir.resolve("ecore.xmi").toFile();
		CommandLine ecore = new CommandLine(new EcoreCommand());
		ecore.addSubcommand(new SaveModelCommand());
		CommandLine commandLine = commandLine(new SourceCommand());
		commandLine.addSubcommand(ecore);
		assertThat(commandLine.execute("ecore", "save", file.getPath())).isZero();
		String saved = Files.readString(file.toPath());
		assertThat(saved).contains("name=\"source\"").doesNotContain("EGenericType");
	}

	// --- SubCommand: a command taking its sub-commands ---

	interface Exporter {

		String format();

	}

	@Command(name = "json", mixinStandardHelpOptions = true)
	static class JsonCommand extends CommandBase implements Exporter {

		@Override
		public String format() {
			return "json";
		}

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			return 0;
		}

	}

	@Command(name = "yaml", mixinStandardHelpOptions = true)
	static class YamlCommand extends CommandBase implements Exporter {

		@Override
		public String format() {
			return "yaml";
		}

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			return 0;
		}

	}

	@Command(name = "export", mixinStandardHelpOptions = true)
	static class ExportCommand extends CommandBase {

		/**
		 * Many-valued: every sub-command that is an Exporter.
		 */
		@SubCommand
		List<Exporter> exporters;

		JsonCommand json;

		/**
		 * Single-valued, through a method.
		 */
		@SubCommand
		void json(JsonCommand json) {
			this.json = json;
		}

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			return exporters.size() * 10 + (json == null ? 0 : 1);
		}

	}

	@Test
	void subCommandsAreMatchedAndInjected() {
		assertThat(CommandWiring.acceptsSubCommand(ExportCommand.class, YamlCommand.class)).isTrue();
		assertThat(CommandWiring.acceptsSubCommand(ExportCommand.class, CountCommand.class)).isFalse();

		ExportCommand export = new ExportCommand();
		assertThat(commandLine(export, new JsonCommand(), new YamlCommand(), new CountCommand()).execute()).isEqualTo(21);
		assertThat(export.exporters).extracting(Exporter::format).containsExactlyInAnyOrder("json", "yaml");
	}

	// --- Mix-ins: Parent is the command mixed into ---

	static class FormatMixIn {

		@Option(names = "--pretty")
		boolean pretty;

		@Parent
		ExportCommand host;

	}

	@Test
	void mixInTakesTheCommandItIsMixedInto() {
		assertThat(CommandWiring.acceptsParent(FormatMixIn.class, ExportCommand.class)).isTrue();
		assertThat(CommandWiring.acceptsParent(FormatMixIn.class, ModelCommand.class)).isFalse();

		ExportCommand export = new ExportCommand();
		FormatMixIn mixIn = new FormatMixIn();
		CommandLine commandLine = commandLine(export, new JsonCommand());
		commandLine.addMixin("format", mixIn);
		commandLine.execute("--pretty");
		assertThat(mixIn.host).isSameAs(export);
		assertThat(mixIn.pretty).isTrue();
	}

}
