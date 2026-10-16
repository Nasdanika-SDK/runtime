package org.example.cli;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import org.nasdanika.sdk.runtime.cli.SubCommandRequirement;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.Requirement;
import org.nasdanika.sdk.runtime.common.flow.Flows;
import org.nasdanika.sdk.runtime.common.flow.Pump;

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
	 * Sub-commands are resolved in the same resolution and attached as they arrive, so the
	 * pump is settled before the tree is used.
	 */
	public static CommandLine root(CapabilityLoader loader) {
		Requirement requirement = Requirement.of(
				CommandLine.class,
				new SubCommandRequirement(List.of(), new AtomicInteger())); // <1>
		Pump pump = new Pump();
		var providers = loader.<CommandLine>load(requirement, pump);
		CompletableFuture<List<CommandLine>> roots = Flows.toList(
				CapabilityLoader.capabilities(providers, pump, requirement));
		pump.settle();                                                      // <2>
		return roots.join().getFirst();
	}

	public static void main(String[] args) {
		System.exit(root(CapabilityLoader.getInstance()).execute(args));
	}
	// end::assemble[]

}
