package org.nasdanika.sdk.runtime.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.cli.PipelineTests.ModelCommandFactory;
import org.nasdanika.sdk.runtime.cli.PipelineTests.TextCommandFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

/**
 * Mix-ins accepted by generic type, and closing a command tree.
 */
class LifecycleTests {

	// tag::formatters[]
	public interface Formatter<T> {

		String format(T value);

	}

	public static class UpperFormatter implements Formatter<String> { // <1>

		@Option(names = "--upper")
		boolean upper;

		@Override
		public String format(String value) {
			return upper ? value.toUpperCase() : value;
		}

	}

	public static class NameFormatter implements Formatter<EObject> { // <2>

		@Override
		public String format(EObject value) {
			return value.eClass().getName();
		}

	}
	// end::formatters[]

	// tag::echo[]
	@Command(name = "echo")
	public static class EchoCommand extends CommandBase {

		@Parent
		Supplier<? extends CharSequence> text;

		@MixIns
		List<Formatter<? super String>> formatters; // <1>

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			String value = text.get().toString();
			for (Formatter<? super String> formatter: formatters) {
				value = formatter.format(value);
			}
			spec.commandLine().getOut().println(value);
			return 0;
		}

	}
	// end::echo[]

	public static class EchoCommandFactory extends SubCommandCapabilityFactory<EchoCommand> {

		@Override
		protected Class<EchoCommand> getCommandType() {
			return EchoCommand.class;
		}

		@Override
		protected Publisher<EchoCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new EchoCommand());
		}

	}

	public static class UpperFormatterFactory extends MixInCapabilityFactory<UpperFormatter> {

		@Override
		protected String getName() {
			return "upper";
		}

		@Override
		protected Class<UpperFormatter> getMixInType() {
			return UpperFormatter.class;
		}

		@Override
		protected Publisher<UpperFormatter> doCreateMixIn(List<CommandLine> commandPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new UpperFormatter());
		}

	}

	public static class NameFormatterFactory extends MixInCapabilityFactory<NameFormatter> {

		@Override
		protected String getName() {
			return "name";
		}

		@Override
		protected Class<NameFormatter> getMixInType() {
			return NameFormatter.class;
		}

		@Override
		protected Publisher<NameFormatter> doCreateMixIn(List<CommandLine> commandPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new NameFormatter());
		}

	}

	@Test
	void mixInsByType() {
		// tag::typed-mixins[]
		CommandLine root = ContributionTests.assemble(
			new RootCommandFactory(),
			new TextCommandFactory(),
			new EchoCommandFactory(),
			new UpperFormatterFactory(),
			new NameFormatterFactory());
		CommandLine echo = root.getSubcommands().get("text").getSubcommands().get("echo");
		assertThat(echo.getMixins()).containsKey("upper").doesNotContainKey("name"); // <1>
		assertThat(PipelineTests.run(root, "text", "echo", "--upper")).isEqualTo("HELLO"); // <2>
		// end::typed-mixins[]
		assertThat(CommandWiring.acceptsMixIn(EchoCommand.class, UpperFormatter.class)).isTrue();
		assertThat(CommandWiring.acceptsMixIn(EchoCommand.class, NameFormatter.class)).isFalse();
	}

	@Test
	void resourceSetConfigurator() {
		ResourceSetMixIn mixIn = new ResourceSetMixIn();
		Object factory = new org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl();
		var resourceSet = mixIn.createResourceSet(rs -> rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("lib", factory));
		assertThat(resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()).containsEntry("lib", factory);
		assertThat(mixIn.createResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap()).doesNotContainKey("lib");
	}

	// tag::closeable[]
	@Command(name = "connect")
	public static class ConnectCommand extends CommandGroup {

		@Parent
		RootCommand root;

		boolean closed;

		@Override
		public void close() {
			super.close(); // <1>
			closed = true;
		}

	}
	// end::closeable[]

	public static class ConnectCommandFactory extends SubCommandCapabilityFactory<ConnectCommand> {

		@Override
		protected Class<ConnectCommand> getCommandType() {
			return ConnectCommand.class;
		}

		@Override
		protected Publisher<ConnectCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new ConnectCommand());
		}

	}

	@Test
	void closingTheTree() {
		// tag::closing[]
		CommandLine root = ContributionTests.assemble(
			new RootCommandFactory(),
			new ConnectCommandFactory(),
			new ModelCommandFactory());
		ConnectCommand connect = (ConnectCommand) root
			.getSubcommands().get("connect")
			.getCommandSpec().userObject();

		assertThat(root.getCommandSpec().userObject()).isInstanceOf(RootCommand.class); // <1>
		CommandBase.close(root); // <2>
		assertThat(connect.closed).isTrue();
		// end::closing[]
	}

}
