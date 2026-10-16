package org.nasdanika.sdk.runtime.cli;

import java.util.List;

import picocli.CommandLine;
import picocli.CommandLine.ExecutionException;
import picocli.CommandLine.IExecutionStrategy;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.ParseResult;

/**
 * Injects {@link Parent} and {@link SubCommand} members of the commands on the command line, and
 * {@link Parent} members of their mix-ins, then executes as its delegate does - {@link CommandLine.RunLast}
 * by default, picocli's own default.
 *
 * <p>
 * Injection happens here, after parsing, because a parent's options are parsed by then: adapting it
 * while the command tree is being built would see their defaults. It goes from the root to the
 * executed command, so that a parent's own members are in place before it is adapted for its child.
 * Help and version requests skip it, so that asking for help never fails on a parent that cannot
 * provide.
 *
 * <p>
 * {@link SubCommandCapabilityFactory} sets this strategy on the root commands it creates. A command
 * line assembled otherwise needs {@code commandLine.setExecutionStrategy(new WiringExecutionStrategy())}.
 */
public class WiringExecutionStrategy implements IExecutionStrategy {

	private final IExecutionStrategy delegate;

	public WiringExecutionStrategy() {
		this(new CommandLine.RunLast());
	}

	public WiringExecutionStrategy(IExecutionStrategy delegate) {
		this.delegate = delegate;
	}

	@Override
	public int execute(ParseResult parseResult) throws ExecutionException, ParameterException {
		List<CommandLine> path = parseResult.asCommandLineList();
		if (path.stream().noneMatch(cl -> cl.isUsageHelpRequested() || cl.isVersionHelpRequested())) {
			Object parent = null;
			for (CommandLine commandLine: path) {
				CommandSpec spec = commandLine.getCommandSpec();
				Object command = spec.userObject();
				try {
					if (parent != null) {
						CommandWiring.injectParent(command, parent);
					}
					CommandWiring.injectSubCommands(command, spec.subcommands().values().stream().map(sc -> sc.getCommandSpec().userObject()).toList());
					for (CommandSpec mixIn: spec.mixins().values()) {
						CommandWiring.injectParent(mixIn.userObject(), command);
					}
				} catch (RuntimeException e) {
					throw new ExecutionException(commandLine, "Cannot wire command '" + spec.qualifiedName() + "': " + e.getMessage(), e);
				}
				parent = command;
			}
		}
		return delegate.execute(parseResult);
	}

}
