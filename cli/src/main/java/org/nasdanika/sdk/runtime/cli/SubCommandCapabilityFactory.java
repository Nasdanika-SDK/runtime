package org.nasdanika.sdk.runtime.cli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;

import org.nasdanika.sdk.runtime.common.Adaptable;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactory.Loader;
import org.nasdanika.sdk.runtime.common.capability.CapabilityProvider;

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
				Publisher<T> commandCS = createCommand(parentPath, loader, progressMonitor);
				if (commandCS != null) {
					Publisher<CommandLineAndPath> commandLineAndPathCS = commandCS.thenApply(command -> createCommandLine(command, serviceRequirement, progressMonitor));
					Publisher<Iterable<CapabilityProvider<CommandLine>>> subCommandsCS = commandLineAndPathCS.thenCompose(
							commandLineAndPath -> createSubCommands(
									commandLineAndPath == null ? null : commandLineAndPath.path(),
									serviceRequirement.commandCounter(),
									loader,
									progressMonitor));
					
					Publisher<Iterable<CapabilityProvider<MixInRecord>>> mixInsCS = commandLineAndPathCS.thenCompose(
							commandLineAndPath -> createMixIns(
									commandLineAndPath == null ? null : commandLineAndPath.path(),
									loader,
									progressMonitor));
					
					Publisher<CommandLine> commandLineWithSubCommandsCS = commandLineAndPathCS.thenCombine(subCommandsCS, this::combineSubCommands);
					Publisher<CommandLine> commandLineWithSubCommandsAndMixInsCS = commandLineWithSubCommandsCS.thenCombine(mixInsCS, this::combineMixIns);
					Publisher<CommandLine> loggingCS = commandLineWithSubCommandsAndMixInsCS.thenApply(cl -> {
						if (cl != null) {
							int totalCommands = serviceRequirement.commandCounter().incrementAndGet(); // Incrementing command counter for the parent path to prevent creating too many commands 							
							if (parentPath.isEmpty()) {
								LOGGER.info("Created command line {}, total commands {}", cl.getCommandName(), totalCommands);						
							} else {
								StringBuilder commandPath = new StringBuilder();
								for (CommandLine pathElement: parentPath) {
									if (commandPath.length() > 0) {
										commandPath.append(" ");
									}
									commandPath.append(pathElement.getCommandName());
								}
								LOGGER.info("Created command line {}, parent path {}, total commands {}", cl.getCommandName(), commandPath.toString(), totalCommands);		
							}
						}
						return cl;
					});
					
					
					return wrapCompletionStage(loggingCS);
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
	
	protected Publisher<CapabilityProvider<CommandLine>> createSubCommands(
				List<CommandLine> path,
				AtomicInteger commandCounter,
				Loader loader, 
				Span span, 
				Logger logger) {		

		if (path == null) {
			return CompletableFuture.completedStage(null);
		}
		
		Requirement<SubCommandRequirement, CommandLine> subCommandRequirement = ServiceCapabilityFactory.createRequirement(CommandLine.class, null, new SubCommandRequirement(path, commandCounter));
		@SuppressWarnings({ "rawtypes", "unchecked" })
		CompletionStage<Iterable<CapabilityProvider<CommandLine>>> subCommandsCS = (CompletionStage) loader.load(subCommandRequirement, progressMonitor);
		return subCommandsCS;
	}
	
	private CommandLine combineSubCommands(
			CommandLineAndPath commandLineAndPath,
			Iterable<CapabilityProvider<CommandLine>> subCommandsProviders) {
		
		if (commandLineAndPath == null) {
			return null;
		}
		
		CommandLine commandLine = commandLineAndPath.commandLine();
		List<CommandLine> subCommands = new ArrayList<>();
		subCommandsProviders.forEach(scp -> scp.getPublisher().filter(Objects::nonNull).collectList().block().forEach(subCommands::add));
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
		return commandLine;
	};
	
	/**
	 * @param a
	 * @param b
	 * @return true if a overrides b
	 */
	protected boolean overrides(Object a, Object b) {
		if (a instanceof Overrider && ((Overrider) a).overrides(b)) {
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
	
	protected Publisher<CapabilityProvider<MixInRecord>> createMixIns(
			List<CommandLine> path,
			Loader loader, 
			Span span, 
			Logger logger) {
	
		if (path == null) {
			return Flows.empty();
		}
		
		Requirement<MixInRequirement, MixInRecord> mixInRequirement = ServiceCapabilityFactory.createRequirement(MixInRecord.class, new MixInRequirement(path));
		return loader.load(mixInRequirement);
	}
	
	private CommandLine combineMixIns(
			CommandLine commandLine,
			Iterable<CapabilityProvider<MixInRecord>> mixInProviders) {
		
		if (commandLine == null) {
			return null;
		}

		List<MixInRecord> mixIns = new ArrayList<>();
		mixInProviders.forEach(mcp -> mcp.getPublisher().filter(Objects::nonNull).collectList().block().forEach(mixIns::add));		
		
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
				
		return commandLine;
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
				List<SubCommands> subCommandsAnnotations = lineage(userObject.getClass())
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
				for (Class<?> le: lineage(commandType)) {
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
	
	private static List<Class<?>> lineage(Class<?> clazz) {
		if (clazz == null) {
			return Collections.emptyList();
		}
		List<Class<?>> ret = new ArrayList<>();
		ret.add(clazz);
		ret.addAll(lineage(clazz.getSuperclass()));
		for (Class<?> i: clazz.getInterfaces()) {
			ret.addAll(lineage(i));
		}
		return ret.stream().distinct().toList();
	}	

}
