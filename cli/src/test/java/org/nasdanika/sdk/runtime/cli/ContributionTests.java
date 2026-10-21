package org.nasdanika.sdk.runtime.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.cli.PipelineTests.DescribeCommandFactory;
import org.nasdanika.sdk.runtime.cli.PipelineTests.ModelCommandFactory;
import org.nasdanika.sdk.runtime.cli.PipelineTests.PrintCommand;
import org.nasdanika.sdk.runtime.cli.PipelineTests.PrintCommandFactory;
import org.nasdanika.sdk.runtime.cli.PipelineTests.TextCommandFactory;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory;
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
 * Mix-ins contributed by factories, and commands that override other commands.
 */
class ContributionTests {

	static CommandLine assemble(CapabilityFactory<?, ?>... factories) {
		Requirement roots = Requirement.of(
			CommandLine.class,
			new SubCommandRequirement(List.of(), new AtomicInteger()));
		return CapabilityLoader.of(factories).<CommandLine>loadOne(roots);
	}

	// tag::mixin[]
	public static class ShoutMixIn {

		@Option(names = "--shout", description = "Upper case")
		boolean shout;

		@Parent
		Supplier<? extends CharSequence> text; // <1>

		String apply(String value) {
			return shout ? value.toUpperCase() : value;
		}

	}

	public static class ShoutMixInFactory extends MixInCapabilityFactory<ShoutMixIn> {

		@Override
		protected String getName() {
			return "shout"; // <2>
		}

		@Override
		protected Class<ShoutMixIn> getMixInType() {
			return ShoutMixIn.class;
		}

		@Override
		protected Publisher<ShoutMixIn> doCreateMixIn(
				List<CommandLine> commandPath,
				Loader loader,
				Span span,
				Logger logger) {
			return Flows.of(new ShoutMixIn());
		}

	}
	// end::mixin[]

	@Test
	void mixIns() {
		// tag::mixins[]
		CommandLine root = assemble(
			new RootCommandFactory(),
			new TextCommandFactory(),
			new ModelCommandFactory(),
			new PrintCommandFactory(),
			new ShoutMixInFactory());
		CommandLine text = root.getSubcommands().get("text");
		CommandLine model = root.getSubcommands().get("model");
		assertThat(text.getMixins()).containsKey("shout"); // <1>
		assertThat(model.getMixins()).doesNotContainKey("shout");

		assertThat(PipelineTests.run(root, "text", "--shout", "print")).isEqualTo("Hello");
		ShoutMixIn shout = (ShoutMixIn) text.getMixins().get("shout");
		assertThat(shout.text.get()).isEqualTo("Hello"); // <2>
		assertThat(shout.apply("quiet")).isEqualTo("QUIET");
		// end::mixins[]
	}

	// tag::override[]
	@Command(name = "print", description = "Prints its parent's text, framed")
	public static class FramedPrintCommand extends PrintCommand { // <1>

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			spec.commandLine().getOut().println("[" + text.get() + "]");
			return 0;
		}

	}
	// end::override[]

	public static class FramedPrintCommandFactory extends SubCommandCapabilityFactory<FramedPrintCommand> {

		@Override
		protected Class<FramedPrintCommand> getCommandType() {
			return FramedPrintCommand.class;
		}

		@Override
		protected Publisher<FramedPrintCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new FramedPrintCommand());
		}

	}

	// tag::declared-override[]
	@Command(name = "print", description = "Prints nothing")
	@Overrides(PrintCommand.class) // <1>
	public static class SilentPrintCommand extends CommandBase {

		@Parent
		Supplier<? extends CharSequence> text;

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			return 0;
		}

	}
	// end::declared-override[]

	public static class SilentPrintCommandFactory extends SubCommandCapabilityFactory<SilentPrintCommand> {

		@Override
		protected Class<SilentPrintCommand> getCommandType() {
			return SilentPrintCommand.class;
		}

		@Override
		protected Publisher<SilentPrintCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new SilentPrintCommand());
		}

	}

	static Object print(CommandLine root) {
		return root.getSubcommands().get("text").getSubcommands().get("print").getCommandSpec().userObject();
	}

	@Test
	void overriding() {
		// tag::overriding[]
		CommandLine framed = assemble(
			new RootCommandFactory(),
			new TextCommandFactory(),
			new PrintCommandFactory(),
			new FramedPrintCommandFactory());
		assertThat(print(framed)).isInstanceOf(FramedPrintCommand.class); // <1>
		assertThat(PipelineTests.run(framed, "text", "print")).isEqualTo("[Hello]");

		CommandLine silent = assemble(
			new RootCommandFactory(),
			new TextCommandFactory(),
			new PrintCommandFactory(),
			new SilentPrintCommandFactory());
		assertThat(print(silent)).isInstanceOf(SilentPrintCommand.class); // <2>
		// end::overriding[]
	}

	@Test
	void unrelatedFactoriesAreIndependent() {
		CommandLine root = assemble(
			new RootCommandFactory(),
			new ModelCommandFactory(),
			new DescribeCommandFactory(),
			new PrintCommandFactory());
		assertThat(root.getSubcommands()).containsOnlyKeys("launcher", "model");
	}

}
