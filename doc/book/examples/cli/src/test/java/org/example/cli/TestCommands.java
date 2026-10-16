package org.example.cli;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;

import picocli.CommandLine;

class TestCommands {

	static CommandLine root() {
		return Assembly.root(CapabilityLoader.getInstance());
	}

	record Run(int exitCode, String out) {
	}

	static Run run(String... args) {
		CommandLine root = root();
		StringWriter out = new StringWriter();
		root.setOut(new PrintWriter(out, true));
		root.setErr(new PrintWriter(new StringWriter(), true));
		int exitCode = root.execute(args);
		return new Run(exitCode, out.toString().replace("\r\n", "\n"));
	}

	// tag::tree[]
	static void tree(CommandLine commandLine, String indent, List<String> lines) {
		lines.add(indent + commandLine.getCommandName());
		commandLine.getSubcommands().values().stream()
			.filter(sub -> !sub.getCommandSpec().usageMessage().hidden())
			.forEach(sub -> tree(sub, indent + "  ", lines));
	}
	// end::tree[]

	@Test
	void theAssembledTree() {
		List<String> lines = new ArrayList<>();
		tree(root(), "", lines);
		lines.forEach(System.out::println);
		assertThat(lines).contains(
				"nsd",
				"  hello",
				"  library",
				"    books",
				"    export",
				"      csv",
				"      markdown",
				"    save");                     // The runtime's own command, matched by generic type
		assertThat(lines).doesNotContain("      books"); // export does not offer a library
	}

	@Test
	void hello() {
		// tag::run[]
		Run run = run("hello", "--name", "Reader");
		assertThat(run.exitCode()).isZero();
		assertThat(run.out()).isEqualTo("Hello, Reader!\n");
		// end::run[]
	}

	@Test
	void books() {
		assertThat(run("library", "books", "--before", "1900").out())
			.isEqualTo("On the Origin of Species (1859)\nWar and Peace (1869)\n");
	}

	@Test
	void mixIn() {
		assertThat(run("library", "books", "--limit", "2").out().lines()).hasSize(2);
	}

	@Test
	void subCommandsByType() {
		assertThat(run("library", "export").out()).isEqualTo("csv\nmarkdown\n");
		assertThat(run("library", "export", "markdown").out()).startsWith("# A Modeler's Shelf\n\n* _Structure");
	}

	@Test
	void theRuntimesSaveCommand(@TempDir Path directory) throws Exception {
		// tag::save[]
		Path file = directory.resolve("shelf.xmi");
		assertThat(run("library", "save", file.toString()).exitCode()).isZero();
		assertThat(Files.readString(file)).contains("Domain-Driven Design");

		// And the saved file is a library a later command can load
		assertThat(run("library", "--file", file.toString(), "books", "--before", "1900").out())
			.contains("War and Peace (1869)");
		// end::save[]
	}

	@Test
	void helpNeverWires() {
		assertThat(run("library", "books", "--help").exitCode()).isZero();
	}

}
