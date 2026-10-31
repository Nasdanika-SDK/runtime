package org.nasdanika.sdk.runtime.models.meta.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaValidator;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaValidator.Problem;

/**
 * The nasdanika-meta agent skill in src/main/skill: its examples are the book's tested files, and
 * every nmeta block of its Markdown loads without errors, so that nothing an assistant learns from
 * it is wrong.
 */
public class SkillTests {

	private static final Path SKILL = Path.of("src/main/skill/nasdanika-meta");

	private static final Path BOOK = Path.of("src/test/resources/org/nasdanika/sdk/runtime/models/meta/tests/book");

	/**
	 * The book's include tags, which the skill's copies leave out
	 */
	private static final Pattern TAG = Pattern.compile("(?m)^[ \\t]*// (tag|end)::\\S*\\[\\][ \\t]*\\R");

	private static final Pattern NMETA_BLOCK = Pattern.compile("(?ms)^\\s*```nmeta\\R(.*?)^\\s*```");

	@Test
	public void examplesAreTheBooksFiles() throws IOException {
		for (String name: List.of("bank.nmeta", "party.nmeta", "library.nmeta")) {
			String book = TAG.matcher(Files.readString(BOOK.resolve(name))).replaceAll("");
			assertThat(Files.readString(SKILL.resolve("examples").resolve(name)))
				.as(name)
				.isEqualToNormalizingNewlines(book);
		}
	}

	@Test
	public void examplesValidate() {
		List<Problem> problems = MetaValidator.validate(SKILL.resolve("examples"), SKILL);
		assertThat(problems).extracting(Problem::toString).containsExactly(
				"examples/bank.nmeta:63:6: warning: Facet type occupancy.Presence is not available, its properties are not checked");
	}

	/**
	 * A block without a package line is a fragment and gets one.
	 */
	@Test
	public void markdownBlocksValidate(@TempDir Path directory) throws IOException {
		List<Path> markdown;
		try (Stream<Path> paths = Files.walk(SKILL)) {
			markdown = paths.filter(path -> path.toString().endsWith(".md") && !path.startsWith(SKILL.resolve("assets"))).sorted().toList();
		}
		List<String> blocks = new ArrayList<>();
		for (Path file: markdown) {
			Matcher matcher = NMETA_BLOCK.matcher(Files.readString(file));
			int index = 0;
			while (matcher.find()) {
				String block = matcher.group(1).stripIndent();
				if (!Pattern.compile("(?m)^package ").matcher(block).find()) {
					block = "package snippet namespace \"urn:example:snippet\"\n\n" + block;
				}
				// One directory per block, so that the blocks' namespaces do not collide
				Path blockDirectory = Files.createDirectories(directory.resolve(file.getFileName() + "-" + ++index));
				Files.writeString(blockDirectory.resolve("block.nmeta"), block);
				blocks.add(blockDirectory.getFileName().toString());
			}
		}
		assertThat(blocks).contains("SKILL.md-1", "syntax.md-9");

		List<String> errors = blocks.stream()
			.flatMap(block -> MetaValidator.validate(directory.resolve(block), directory).stream())
			.filter(problem -> problem.severity() == MetaValidator.Severity.ERROR)
			.map(Problem::toString)
			.collect(Collectors.toList());
		assertThat(errors).isEmpty();
	}

	@Test
	public void theStarterProjectTestUsesTheValidator() throws IOException {
		Path project = SKILL.resolve("assets/vocabulary-project");
		assertThat(Files.readString(project.resolve("src/test/java/vocabulary/VocabularyTest.java")))
			.contains("MetaValidator.validate(Path.of(\"src/main/meta\"), Path.of(\"\"))");
		assertThat(Files.readString(project.resolve(".vscode/tasks.json")))
			.contains("\"command\": \"mvn -q test\"");
	}

}
