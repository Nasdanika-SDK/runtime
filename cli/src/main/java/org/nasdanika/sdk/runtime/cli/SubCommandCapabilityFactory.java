package org.nasdanika.sdk.runtime.cli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.common.Adaptable;
import org.nasdanika.sdk.runtime.common.Util;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

/**
 * Base class for sub-command factories.
 * Creates {@link CommandLine} from the command object, adds sub-commands and mix-ins
 */
public abstract class SubCommandCapabilityFactory<T> extends ServiceCapabilityFactory<SubCommandRequirement, CommandLine> {
	
	private static final String MAX_COMMAND_PATH_PROPERTY = "org.nasdanika.sdk.runtime.cli.maxCommandPath";

	private static final String MAX_COMMANDS_PROPERTY = "org.nasdanika.sdk.runtime.cli.maxCommands";

	private static boolean isBlank(String s) {
		return s == null || s.isBlank();
	}

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return CommandLine.class == type;
	}
	
	private record CommandLineAndPath(CommandLine commandLine, List<CommandLine> path) {};
	
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
	
	@Override
	protected Publisher<CapabilityProvider<CommandLine>> createService(
			Class<CommandLine> serviceType,
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
					Publisher<CommandLine> commandLineWithSubCommandsAndMixInsPublisher = Flows.map(commandLineAndPathPublisher, commandLineAndPath -> {
						if (commandLineAndPath != null) {
							int totalCommands = serviceRequirement.commandCounter().incrementAndGet(); // Incrementing command counter for the parent path to prevent creating too many commands 							
							
							CompletableFuture<List<CommandLine>> subCommandsCF = createSubCommands(commandLineAndPath.path(), serviceRequirement.commandCounter(), loader, span, logger);
							subCommandsCF
								.thenAccept(subCommands -> combineSubCommands(commandLineAndPath, subCommands))
								.whenComplete((_, ex) -> {
									if (ex != null) {
										logger
											.logRecordBuilder()
											.setSeverity(Severity.ERROR)
											.setBody("Error creating sub-commands for command line " + commandLineAndPath.commandLine().getCommandName() + ": " + ex.getMessage())
											.setAttribute("commandLine", commandLineAndPath.commandLine().getCommandName())
											.setAttribute("exception", ex.toString())
											.emit();
									}									
								});
							
							CompletableFuture<List<MixInRecord>> mixInsCF = createMixIns(commandLineAndPath.path(), loader, span, logger);
							mixInsCF
								.thenAccept(mixIns -> combineMixIns(commandLineAndPath.commandLine(), mixIns))
								.whenComplete((_, ex) -> {
									if (ex != null) {
										logger
											.logRecordBuilder()
											.setSeverity(Severity.ERROR)
											.setBody("Error creating mix-ins for command line " + commandLineAndPath.commandLine().getCommandName() + ": " + ex.getMessage())
											.setAttribute("commandLine", commandLineAndPath.commandLine().getCommandName())
											.setAttribute("exception", ex.toString())
											.emit();
									}									
								});
							
							if (parentPath == null || parentPath.isEmpty()) {
								logger
									.logRecordBuilder()
									.setSeverity(Severity.INFO)
									.setBody("Created command line " + commandLineAndPath.commandLine().getCommandName() + ", total commands " + totalCommands)
									.setAttribute("commandLine", commandLineAndPath.commandLine().getCommandName())
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
									.setBody("Created command line %s, parent path %s, total commands %d".formatted(commandLineAndPath.commandLine().getCommandName(), commandPath.toString(), totalCommands))
									.setAttribute("name", commandLineAndPath.commandLine().getCommandName())
									.setAttribute("parentPath", commandPath.toString())
									.setAttribute("totalCommands", totalCommands)
									.emit();
							}

							return commandLineAndPath.commandLine();
						}
																		
						return null;
					});		
										
					return Flows.of(CapabilityProvider.of(Flows.filter(commandLineWithSubCommandsAndMixInsPublisher, Objects::nonNull)));
				}
			}
		}
		
		return Flows.empty();
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
		
		Requirement<SubCommandRequirement, CommandLine> subCommandRequirement = ServiceCapabilityFactory.createRequirement(CommandLine.class, new SubCommandRequirement(path, commandCounter));
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
		
		Requirement<MixInRequirement, MixInRecord> mixInRequirement = ServiceCapabilityFactory.createRequirement(MixInRecord.class, new MixInRequirement(path));
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
	 * Matches command to parent using annotations.
	 * @param parentPath
	 * @return
	 */
	protected boolean match(List<CommandLine> parentPath) {
		if (parentPath == null || parentPath.isEmpty()) {
			return false;
		}
		
		CommandLine parent = parentPath.get(parentPath.size() - 1);
		Object userObject = parent.getCommandSpec().userObject();
		if (userObject != null) {
			Class<T> commandType = getCommandType();
			if (commandType != null) {
				List<SubCommands> subCommandsAnnotations = Util.lineage(userObject.getClass())
						.stream()
						.map(c -> c.getAnnotation(SubCommands.class))
						.filter(Objects::nonNull)
						.toList();
				
				for (SubCommands subCommandsAnnotation: subCommandsAnnotations) {
					for (Class<?> at: subCommandsAnnotation.value()) {					
						if (at.isAssignableFrom(commandType)) {
							return true;
						}
					}
				}
			}
			
			if (commandType != null) {
				for (Class<?> le: Util.lineage(commandType)) {
					ParentCommands parentCommands = le.getAnnotation(ParentCommands.class);
					if (parentCommands != null) {
						for (Class<?> pt: parentCommands.value()) {
							if (Adaptable.adaptTo(userObject, pt)  != null) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
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
