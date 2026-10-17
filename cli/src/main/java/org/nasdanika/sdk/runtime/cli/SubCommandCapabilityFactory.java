package org.nasdanika.sdk.runtime.cli;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.common.Util;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.ReflectiveCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

/**
 * Base class for sub-command factories.
 * Creates {@link CommandLine} from the command object, adds sub-commands and mix-ins
 */
public abstract class SubCommandCapabilityFactory<T> extends ReflectiveCapabilityFactory {
	
	private static final String MAX_COMMAND_PATH_PROPERTY = "org.nasdanika.sdk.runtime.cli.maxCommandPath";

	private static final String MAX_COMMANDS_PROPERTY = "org.nasdanika.sdk.runtime.cli.maxCommands";

	private static boolean isBlank(String s) {
		return s == null || s.isBlank();
	}

	private record CommandLineAndPath(CommandLine commandLine, List<CommandLine> path) {};

	protected SubCommandCapabilityFactory() {
		super(MethodHandles.lookup());
	}

	public static final int DEFAULT_MAX_COMMAND_PATH = 15;
	
	public static final int DEFAULT_MAX_COMMANDS = 2000;
	
	protected int getMaxCommands(Logger logger) {
		String maxCommands = System.getProperty(MAX_COMMANDS_PROPERTY);
		if (!isBlank(maxCommands)) {
			try {
				int mcp = Integer.parseInt(maxCommands);
				if (mcp >= 0) {
					return mcp;
				}
			} catch (NumberFormatException e) {
				logger
					.logRecordBuilder()
					.setSeverity(Severity.WARN)
					.setBody("Invalid value for system property " + MAX_COMMANDS_PROPERTY + ": " + maxCommands + ", using default " + DEFAULT_MAX_COMMANDS)
					.setAttribute("value", maxCommands)
					.emit();
			}
		}
		return DEFAULT_MAX_COMMANDS;
	}	
	
	protected int getMaxPath(Logger logger) {
		String maxCommandPath = System.getProperty(MAX_COMMAND_PATH_PROPERTY);
		if (!isBlank(maxCommandPath)) {
			try {
				int mcp = Integer.parseInt(maxCommandPath);
				if (mcp >= 0) {
					return mcp;
				}
			} catch (NumberFormatException e) {
				logger
					.logRecordBuilder()
					.setSeverity(Severity.WARN)
					.setBody("Invalid value for system property " + MAX_COMMAND_PATH_PROPERTY + ": " + maxCommandPath + ", using default " + DEFAULT_MAX_COMMAND_PATH)
					.setAttribute("value", maxCommandPath)
					.emit();
			}
		}
		return DEFAULT_MAX_COMMAND_PATH;
	}
	
	/**
	 * The command, wrapped in a {@link CommandLine} with its sub-commands and mix-ins, for the parent
	 * path of the requirement, if {@link #match(List)} accepts the parent.
	 */
	@Capability
	public Publisher<CapabilityProvider<CommandLine>> commandLine(
			SubCommandRequirement serviceRequirement,
			Loader loader, 
			Span span, 
			Logger logger) {
		
		int maxCommands = getMaxCommands(logger);
		if (serviceRequirement.commandCounter().get() > maxCommands) {						
			String parentPath = serviceRequirement.parentPath().stream().map(CommandLine::getCommandName).reduce((a,b) -> a + " " + b).orElse("<empty>");
			logger
				.logRecordBuilder()
				.setSeverity(Severity.WARN)
				.setBody("Max commands exceeded for parent path " + parentPath)
				.setAttribute("parentPath", parentPath)
				.setAttribute("maxCommands", maxCommands)
				.emit();
		} else {		
			List<CommandLine> parentPath = serviceRequirement.parentPath();
			int maxPath = getMaxPath(logger);
			if (parentPath != null && parentPath.size() > maxPath) {
				String pPathStr = parentPath.stream().map(CommandLine::getCommandName).reduce((a,b) -> a + " " + b).orElse("<empty>");
				logger
					.logRecordBuilder()
					.setSeverity(Severity.WARN)
					.setBody("Max command path exceeded for parent path " + pPathStr)
					.setAttribute("parentPath", pPathStr)
					.setAttribute("maxPath", maxPath)
					.emit();
			} else {
				Publisher<T> commandPublisher = createCommand(parentPath, loader, span, logger);
				if (commandPublisher != null) {
					Publisher<CommandLineAndPath> commandLineAndPathPublisher = Flows.map(commandPublisher, command -> createCommandLine(command, serviceRequirement, span, logger));
					// A command line is emitted once its sub-commands and mix-ins are in place, so that whoever
					// receives it, CapabilityLoader.loadAll included, gets the whole tree rather than a root whose
					// branches are still being resolved on the pump
					Publisher<CommandLine> commandLinePublisher = Flows.concatMap(
							commandLineAndPathPublisher,
							commandLineAndPath -> commandLineAndPath == null
								? Flows.<CommandLine>empty()
								: Flows.fromFuture(complete(commandLineAndPath, serviceRequirement, loader, span, logger)));
					return Flows.of(CapabilityProvider.of(commandLinePublisher));
				}
			}
		}

		return Flows.empty();
	}

	/**
	 * Adds sub-commands and mix-ins to a new command line, and completes with the command line when they
	 * are in place. A failure to create them is logged, and the command line completes without them.
	 */
	private CompletableFuture<CommandLine> complete(
			CommandLineAndPath commandLineAndPath,
			SubCommandRequirement serviceRequirement,
			Loader loader,
			Span span,
			Logger logger) {

		CommandLine commandLine = commandLineAndPath.commandLine();
		int totalCommands = serviceRequirement.commandCounter().incrementAndGet(); // Incrementing command counter for the parent path to prevent creating too many commands

		CompletableFuture<Void> subCommandsCF = createSubCommands(commandLineAndPath.path(), serviceRequirement.commandCounter(), loader, span, logger)
			.thenAccept(subCommands -> combineSubCommands(commandLineAndPath, subCommands))
			.exceptionally(ex -> {
				logger
					.logRecordBuilder()
					.setSeverity(Severity.ERROR)
					.setBody("Error creating sub-commands for command line " + commandLine.getCommandName() + ": " + ex.getMessage())
					.setAttribute("commandLine", commandLine.getCommandName())
					.setAttribute("exception", ex.toString())
					.emit();
				return null;
			});

		CompletableFuture<Void> mixInsCF = createMixIns(commandLineAndPath.path(), loader, span, logger)
			.thenAccept(mixIns -> combineMixIns(commandLine, mixIns))
			.exceptionally(ex -> {
				logger
					.logRecordBuilder()
					.setSeverity(Severity.ERROR)
					.setBody("Error creating mix-ins for command line " + commandLine.getCommandName() + ": " + ex.getMessage())
					.setAttribute("commandLine", commandLine.getCommandName())
					.setAttribute("exception", ex.toString())
					.emit();
				return null;
			});

		List<CommandLine> parentPath = serviceRequirement.parentPath();
		if (parentPath == null || parentPath.isEmpty()) {
			logger
				.logRecordBuilder()
				.setSeverity(Severity.INFO)
				.setBody("Created command line " + commandLine.getCommandName() + ", total commands " + totalCommands)
				.setAttribute("commandLine", commandLine.getCommandName())
				.setAttribute("totalCommands", totalCommands)
				.emit();
		} else {
			StringBuilder commandPath = new StringBuilder();
			for (CommandLine pathElement: parentPath) {
				if (commandPath.length() > 0) {
					commandPath.append(" ");
				}
				commandPath.append(pathElement.getCommandName());
			}
			logger
				.logRecordBuilder()
				.setSeverity(Severity.INFO)
				.setBody("Created command line %s, parent path %s, total commands %d".formatted(commandLine.getCommandName(), commandPath.toString(), totalCommands))
				.setAttribute("name", commandLine.getCommandName())
				.setAttribute("parentPath", commandPath.toString())
				.setAttribute("totalCommands", totalCommands)
				.emit();
		}

		return subCommandsCF.thenCombine(mixInsCF, (_, _) -> commandLine);
	}
			
	protected CommandLineAndPath createCommandLine(
			T command, 
			SubCommandRequirement serviceRequirement,
			Span span, 
			Logger logger) {
		if (command == null) {
			return null;
		}
		List<CommandLine> parentPath = serviceRequirement.parentPath();
		CommandLine commandLine = new CommandLine(command);
		if (parentPath == null || parentPath.isEmpty()) {
			// The root decides how the whole command line executes
			commandLine.setExecutionStrategy(new WiringExecutionStrategy());
		}
		List<CommandLine> path = new ArrayList<CommandLine>();
		if (serviceRequirement.parentPath() != null) {
			path.addAll(parentPath);
		}
		path.add(commandLine);		
				
		return new CommandLineAndPath(commandLine, path);
	}
	
	protected CompletableFuture<List<CommandLine>> createSubCommands(
				List<CommandLine> path,
				AtomicInteger commandCounter,
				Loader loader, 
				Span span, 
				Logger logger) {		

		if (path == null) {
			return CompletableFuture.completedFuture(Collections.emptyList());
		}
		
		Requirement subCommandRequirement = Requirement.of(CommandLine.class, new SubCommandRequirement(path, commandCounter));
		return loader.loadAll(subCommandRequirement);
	}
	
	private void combineSubCommands(CommandLineAndPath commandLineAndPath, List<CommandLine> subCommands) {		
		if (commandLineAndPath != null) {
			CommandLine commandLine = commandLineAndPath.commandLine();
			subCommands.sort((a,b) -> a.getCommandName().compareTo(b.getCommandName()));
			for (Entry<String, List<CommandLine>> commandGroup: Util.groupBy(subCommands, CommandLine::getCommandName).entrySet()) {
				if (commandGroup.getValue().size() == 1) {
					commandGroup.getValue().forEach(commandLine::addSubcommand);				
				} else {
					// Selecting one of several if possible
					CommandLine[] sca = commandGroup.getValue().toArray(size -> new CommandLine[size]);
					Z: for (int i = 0; i < sca.length; ++i) {
						if (sca[i] != null) {
							for (int j = i + 1; j < sca.length; ++j) {
								if (sca[j] != null) {
									if (overrides(sca[i].getCommandSpec().userObject(), sca[j].getCommandSpec().userObject())) {
										sca[j] = null;
									} else if (overrides(sca[j].getCommandSpec().userObject(), sca[i].getCommandSpec().userObject())) {
										sca[i] = null;
										continue Z;		
									}
								}
							}
						}
					}
					for (CommandLine sc: sca) {
						if (sc != null) {
							commandLine.addSubcommand(sc);
						}
					}				
				}
			}
		}
	};
	
	/**
	 * @param a
	 * @param b
	 * @return true if a overrides b
	 */
	protected boolean overrides(Object a, Object b) {
		if (a instanceof Overrider ovr && ovr.overrides(b)) {
			return true;
		}
		Class<?> aClass = a.getClass();
		Overrides ova = aClass.getAnnotation(Overrides.class);
		if (ova != null) {
			for (Class<?> oc: ova.value()) {
				if (oc.isInstance(b)) {
					return true;
				}
			}
		}
		
		Class<?> bClass = b.getClass();
		return bClass != aClass && bClass.isAssignableFrom(aClass);
	}
	
	protected CompletableFuture<List<MixInRecord>> createMixIns(
			List<CommandLine> path,
			Loader loader, 
			Span span, 
			Logger logger) {
	
		if (path == null) {
			return CompletableFuture.completedFuture(Collections.emptyList());
		}
		
		Requirement mixInRequirement = Requirement.of(MixInRecord.class, new MixInRequirement(path));
		return loader.loadAll(mixInRequirement);
	}
	
	private void combineMixIns(CommandLine commandLine, List<MixInRecord> mixIns) {		
		if (commandLine != null) {
			for (Entry<String, List<MixInRecord>> mixInGroup: Util.groupBy(mixIns, MixInRecord::name).entrySet()) {
				if (mixInGroup.getValue().size() == 1) {
					mixInGroup.getValue().forEach(mr -> commandLine.addMixin(mr.name(), mr.mixIn()));				
				} else {
					// Selecting one of several if possible
					MixInRecord[] mra = mixInGroup.getValue().toArray(size -> new MixInRecord[size]);
					Z: for (int i = 0; i < mra.length; ++i) {
						if (mra[i] != null) {
							for (int j = i + 1; j < mra.length; ++j) {
								if (mra[j] != null) {
									if (overrides(mra[i].mixIn(), mra[j].mixIn())) {
										mra[j] = null;
									} else if (overrides(mra[j].mixIn(), mra[i].mixIn())) {
										mra[i] = null;
										continue Z;		
									}
								}
							}
						}
					}
					for (MixInRecord mr: mra) {
						if (mr != null) {
							commandLine.addMixin(mr.name(), mr.mixIn());
						}
					}				
				}
			}
		}
	};
	
	protected abstract Class<T> getCommandType();
	
	/**
	 * Matches the command to its parent by declarations, before the command exists: the parent
	 * accepts it through a {@link SubCommand} member, or the command takes the parent through a
	 * {@link Parent} member. See {@link CommandWiring}.
	 */
	protected boolean match(List<CommandLine> parentPath) {
		if (parentPath == null || parentPath.isEmpty()) {
			return false;
		}
		Object parent = parentPath.get(parentPath.size() - 1).getCommandSpec().userObject();
		Class<T> commandType = getCommandType();
		if (parent == null || commandType == null) {
			return false;
		}
		return CommandWiring.acceptsSubCommand(parent.getClass(), commandType) || CommandWiring.acceptsParent(commandType, parent.getClass());
	}
	
	/**
	 * Calls doCreateCommand if match returns true
	 * @param progressMonitor
	 * @return
	 */
	protected Publisher<T> createCommand(
			List<CommandLine> parentPath, 
			Loader loader, 
			Span span, 
			Logger logger) {
		return match(parentPath) ? doCreateCommand(parentPath, loader, span, logger) : Flows.empty();
	};
	
	/**
	 * Creates a command instance (user object) to be wrapped into {@link CommandLine}
	 * @param progressMonitor
	 * @return
	 */
	protected Publisher<T> doCreateCommand(
			List<CommandLine> parentPath, 
			Loader loader, 
			Span span, 
			Logger logger) {
		return Flows.empty();
	}

}
