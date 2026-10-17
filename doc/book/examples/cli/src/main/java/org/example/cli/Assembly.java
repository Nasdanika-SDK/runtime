package org.example.cli;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.cli.SubCommandRequirement;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.Requirement;

import picocli.CommandLine;

/**
 * A command line assembled from contributions, and a main method running it.
 */
public final class Assembly {

	private Assembly() {
	}

	// tag::assemble[]
	/**
	 * The root command line with every command and mix-in contributed on the module path.
	 */
	public static CommandLine root(CapabilityLoader loader) {
		Requirement requirement = Requirement.of(
				CommandLine.class,
				new SubCommandRequirement(List.of(), new AtomicInteger())); // <1>
		List<CommandLine> roots = loader.loadAll(requirement);              // <2>
		return roots.getFirst();
	}

	public static void main(String[] args) {
		System.exit(root(CapabilityLoader.getInstance()).execute(args));
	}
	// end::assemble[]

}
