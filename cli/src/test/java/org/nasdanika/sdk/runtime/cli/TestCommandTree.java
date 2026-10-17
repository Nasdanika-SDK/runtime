package org.nasdanika.sdk.runtime.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;
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
 * The command tree a blocking load returns is complete: every command line is emitted after its
 * sub-commands and mix-ins are attached, so nothing is still being resolved when the loader's pump
 * is discarded. In this package because it is open: picocli and the wiring reach private members.
 */
class TestCommandTree {

	@Command(name = "group", mixinStandardHelpOptions = true)
	static class GroupCommand extends CommandGroup {

		@Parent
		RootCommand root;

	}

	@Command(name = "leaf", mixinStandardHelpOptions = true)
	@MixIns(LimitMixIn.class)
	static class LeafCommand extends CommandBase {

		@Parent
		GroupCommand group;

		@Override
		protected Integer execute(Span span, Logger logger, Meter meter) {
			return 0;
		}

	}

	static class LimitMixIn {

		@Option(names = "--limit")
		Integer limit;

	}

	static class GroupCommandFactory extends SubCommandCapabilityFactory<GroupCommand> {

		@Override
		protected Class<GroupCommand> getCommandType() {
			return GroupCommand.class;
		}

		@Override
		protected Publisher<GroupCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new GroupCommand());
		}

	}

	static class LeafCommandFactory extends SubCommandCapabilityFactory<LeafCommand> {

		@Override
		protected Class<LeafCommand> getCommandType() {
			return LeafCommand.class;
		}

		@Override
		protected Publisher<LeafCommand> doCreateCommand(List<CommandLine> parentPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new LeafCommand());
		}

	}

	static class LimitMixInFactory extends MixInCapabilityFactory<LimitMixIn> {

		@Override
		protected String getName() {
			return "limit";
		}

		@Override
		protected Class<LimitMixIn> getMixInType() {
			return LimitMixIn.class;
		}

		@Override
		protected Publisher<LimitMixIn> doCreateMixIn(List<CommandLine> commandPath, Loader loader, Span span, Logger logger) {
			return Flows.of(new LimitMixIn());
		}

	}

	@Test
	void loadAllReturnsTheWholeTree() {
		CapabilityLoader loader = CapabilityLoader.of(
				new RootCommandFactory(),
				new GroupCommandFactory(),
				new LeafCommandFactory(),
				new LimitMixInFactory());

		List<CommandLine> roots = loader.loadAll(Requirement.of(
				CommandLine.class,
				new SubCommandRequirement(List.of(), new AtomicInteger())));

		assertThat(roots).hasSize(1);
		CommandLine root = roots.getFirst();
		assertThat(root.getCommandName()).isEqualTo("nsdk");
		assertThat(root.getSubcommands()).containsKeys("launcher", "group");

		CommandLine group = root.getSubcommands().get("group");
		assertThat(group.getSubcommands()).containsOnlyKeys("leaf");

		CommandLine leaf = group.getSubcommands().get("leaf");
		assertThat(leaf.getMixins()).containsKey("limit");
		assertThat(root.execute("group", "leaf", "--limit", "3")).isZero();
	}

}
