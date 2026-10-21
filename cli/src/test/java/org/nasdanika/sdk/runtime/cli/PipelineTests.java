package org.nasdanika.sdk.runtime.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.Adapter;
import org.nasdanika.sdk.runtime.common.Adapters;
import org.nasdanika.sdk.runtime.common.TypeToken;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

/**
 * A command line assembled from contributed commands that find each other by generic types:
 * two parents that supply a String and an EObject, and two children that need one of them.
 */
class PipelineTests {

	// tag::text[]
	@Command(name = "text", description = "Supplies text")
	public static class TextCommand extends CommandGroup {

		@Parent
		RootCommand root; // <1>

		@Option(names = "--value", defaultValue = "Hello")
		String value;

		@Adapter
		public Supplier<String> text() { // <2>
			return () -> value;
		}

	}
	// end::text[]

	// tag::model[]
	@Command(name = "model", description = "Supplies a model element")
	public static class ModelCommand extends CommandGroup {

		@Parent
		RootCommand root;

		@Option(names = "--name", defaultValue = "library")
		String name;

		@Adapter
		public Supplier<EObject> model() { // <1>
			return () -> {
				EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
				ePackage.setName(name);
				return ePackage;
			};
		}

	}
	// end::model[]

	// tag::print[]
	@Command(name = "print", description = "Prints its parent's text")
	public static class PrintCommand extends CommandBase {

		@Parent
		Supplier<? extends CharSequence> text; // <1>

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			spec.commandLine().getOut().println(text.get());
			return 0;
		}

	}
	// end::print[]

	// tag::describe[]
	@Command(name = "describe", description = "Describes its parent's model element")
	public static class DescribeCommand extends CommandBase {

		@Parent
		Supplier<? extends EObject> model; // <1>

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			EObject eObject = model.get();
			spec.commandLine().getOut().println(eObject.eClass().getName() + " " + eObject);
			return 0;
		}

	}
	// end::describe[]

	// tag::factory[]
	public static class PrintCommandFactory extends SubCommandCapabilityFactory<PrintCommand> {

		@Override
		protected Class<PrintCommand> getCommandType() { // <1>
			return PrintCommand.class;
		}

		@Override
		protected Publisher<PrintCommand> doCreateCommand(
				List<CommandLine> parentPath,
				Loader loader,
				Span span,
				Logger logger) {
			return Flows.of(new PrintCommand()); // <2>
		}

	}
	// end::factory[]

	public static class TextCommandFactory extends SubCommandCapabilityFactory<TextCommand> {

		@Override
		protected Class<TextCommand> getCommandType() {
			return TextCommand.class;
		}

		@Override
		protected Publisher<TextCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new TextCommand());
		}

	}

	public static class ModelCommandFactory extends SubCommandCapabilityFactory<ModelCommand> {

		@Override
		protected Class<ModelCommand> getCommandType() {
			return ModelCommand.class;
		}

		@Override
		protected Publisher<ModelCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new ModelCommand());
		}

	}

	public static class DescribeCommandFactory extends SubCommandCapabilityFactory<DescribeCommand> {

		@Override
		protected Class<DescribeCommand> getCommandType() {
			return DescribeCommand.class;
		}

		@Override
		protected Publisher<DescribeCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new DescribeCommand());
		}

	}

	// tag::assemble[]
	static CommandLine assemble() {
		CapabilityLoader loader = CapabilityLoader.of( // <1>
			new RootCommandFactory(),
			new TextCommandFactory(),
			new ModelCommandFactory(),
			new PrintCommandFactory(),
			new DescribeCommandFactory());
		Requirement roots = Requirement.of( // <2>
			CommandLine.class,
			new SubCommandRequirement(List.of(), new AtomicInteger()));
		return loader.<CommandLine>loadOne(roots); // <3>
	}
	// end::assemble[]

	// tag::tree[]
	static String tree(CommandLine commandLine, String indent) {
		StringBuilder tree = new StringBuilder(indent)
			.append(commandLine.getCommandName())
			.append('\n');
		for (CommandLine subCommand: commandLine.getSubcommands().values()) {
			tree.append(tree(subCommand, indent + "  "));
		}
		return tree.toString();
	}
	// end::tree[]

	static String resource(String name) {
		try (InputStream in = PipelineTests.class.getResourceAsStream(name)) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8).replace("\r\n", "\n");
		} catch (IOException e) {
			throw new java.io.UncheckedIOException(e);
		}
	}

	@Test
	void typesNotClasses() {
		// tag::types[]
		TextCommand text = new TextCommand();
		ModelCommand model = new ModelCommand();
		Supplier<String> textSupplier = text.text();
		Supplier<EObject> modelSupplier = model.model();
		assertThat(textSupplier).isInstanceOf(Supplier.class); // <1>
		assertThat(modelSupplier).isInstanceOf(Supplier.class);

		Type printNeeds = new TypeToken<Supplier<? extends CharSequence>>() {}.getType();
		assertThat(Adapters.isAdaptable(TextCommand.class, printNeeds)).isTrue(); // <2>
		assertThat(Adapters.isAdaptable(ModelCommand.class, printNeeds)).isFalse();
		// end::types[]
	}

	@Test
	void theTree() {
		// tag::the-tree[]
		CommandLine root = assemble();
		assertThat(tree(root, "")).isEqualTo(resource("pipeline-tree.txt"));
		// end::the-tree[]
	}

	static String run(CommandLine root, String... args) {
		StringWriter out = new StringWriter();
		root.setOut(new PrintWriter(out, true));
		root.setErr(new PrintWriter(new StringWriter(), true));
		assertThat(root.execute(args)).isZero();
		return out.toString().strip();
	}

	@Test
	void running() {
		// tag::run[]
		assertThat(run(assemble(), "text", "--value", "Hi there", "print")).isEqualTo("Hi there");
		assertThat(run(assemble(), "model", "--name", "shelf", "describe")) // <1>
			.startsWith("EPackage")
			.contains("(name: shelf)");
		// end::run[]
	}

}
