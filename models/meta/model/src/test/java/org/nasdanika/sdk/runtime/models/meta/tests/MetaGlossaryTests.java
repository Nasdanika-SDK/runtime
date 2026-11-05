package org.nasdanika.sdk.runtime.models.meta.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaGlossary;

/**
 * The glossary a vocabulary project's build writes for the people who own the words: the rules in
 * the structure stated in plain words, whatever the structure.
 */
public class MetaGlossaryTests {

	private static String glossary(Path directory, String text) throws IOException {
		Path source = Files.createDirectories(directory.resolve("source"));
		Files.writeString(source.resolve("test.nmeta"), text);
		Path written = MetaGlossary.generate(source, directory.resolve("glossary")).getFirst();
		return Files.readString(written);
	}

	@Test
	public void rulesAreInPlainWords(@TempDir Path directory) throws IOException {
		String glossary = glossary(directory, """
				package test namespace "urn:test"

				class Thing {
				    string optional
				    string[1] required
				    string[*] anyNumber
				    string[+] atLeastOne
				    string[3] exactlyThree
				    string[2..5] twoToFive
				    string[0..5] upToFive
				    string[2..*] atLeastTwo
				    id string[1] code
				    derived readonly number total
				    readonly string fixed
				    string language = "fr"
				    contains Part[*] parts opposite owner
				}

				class Part {
				    refers Thing[1] owner opposite parts
				}
				""");
		assertThat(glossary).contains(
				"| optional | text | optional | _Not defined yet._ |",
				"| required | text | required |",
				"| anyNumber | text | any number |",
				"| atLeastOne | text | at least one |",
				"| exactlyThree | text | exactly 3 |",
				"| twoToFive | text | 2 to 5 |",
				"| upToFive | text | up to 5 |",
				"| atLeastTwo | text | at least 2 |",
				"| code | text | required, identifies it |",
				"| total | number | computed |",
				"| fixed | text | optional, read-only |",
				"| language | text | optional, fr by default |",
				"| parts | Part | any number, part of it, the other side of Part.owner |",
				"| owner | Thing | required, the other side of Thing.parts |");
	}

	@Test
	public void typesAreInPlainWords(@TempDir Path directory) throws IOException {
		String glossary = glossary(directory, """
				package test namespace "urn:test" version "1.2"

				import "urn:elsewhere" as elsewhere

				/** Written as a decimal. */
				type Amount as string

				class Holder<T> {
				    boolean active
				    dateTime at
				    bigint count
				    any whatever
				    string | number either
				    T item
				    Holder<string> nested
				    refers elsewhere.Branch branch
				    `Record<string, unknown>` extras
				}
				""");
		assertThat(glossary).startsWith("<!-- Generated from test.nmeta. Change that file, not this one. -->\n\n# test\n\nVersion 1.2.\n\n");
		assertThat(glossary).contains(
				"## Amount\n\nWritten as a decimal.\n\nWritten as text.\n",
				"| active | yes or no |",
				"| at | date and time |",
				"| count | whole number |",
				"| whatever | anything |",
				"| either | text or number |",
				"| item | T |",
				"| nested | Holder of text |",
				"| branch | Branch (from urn:elsewhere) |",
				"| extras | `Record<string, unknown>` |");
	}

	@Test
	public void kindsEnumerationsAndOperations(@TempDir Path directory) throws IOException {
		String glossary = glossary(directory, """
				/** The package. */
				package test namespace "urn:test"

				/** The state of something. */
				enum Status {
				    /** Still going. */
				    OPEN,
				    CLOSED as "closed"
				}

				/** Any thing. */
				abstract class Base {}

				/** A special thing. */
				class Special extends Base {
				    /**
				     * The price, on a day.
				     * Never negative.
				     */
				    op number priceOn(date day, string code)
				}

				abstract class Middle extends Base {}
				""");
		assertThat(glossary).contains(
				"# test\n\nThe package.\n",
				"One of:\n\n- **OPEN**: Still going.\n- **CLOSED**\n",
				"## Base\n\nAny thing.\n\nExists only as one of its kinds.\n",
				"## Special\n\nA special thing.\n\nA kind of Base.\n",
				"What it can do:\n\n- **priceOn**(day, code): The price, on a day. Never negative.\n",
				"A kind of Base. Exists only as one of its kinds.\n");
		assertThat(glossary).doesNotContain("| Term |");
	}

	@Test
	public void aDefinitionStaysInItsCell(@TempDir Path directory) throws IOException {
		String glossary = glossary(directory, """
				package test namespace "urn:test"

				class Thing {
				    /**
				     * Either | or.
				     * On a second line.
				     */
				    string choice
				}
				""");
		assertThat(glossary).contains("| choice | text | optional | Either \\| or. On a second line. |");
	}

	@Test
	public void filesAreReadTogetherAndWrittenInTheirRelativeDirectories(@TempDir Path directory) throws IOException {
		Path source = Files.createDirectories(directory.resolve("source/retail"));
		Files.writeString(directory.resolve("source/party.nmeta"), """
				package party namespace "urn:party"

				class Party {}
				""");
		// "account" sorts before "party", and is in a subdirectory
		Files.writeString(source.resolve("account.nmeta"), """
				package account namespace "urn:account"

				import "urn:party" as party

				class Account {
				    refers party.Party[+] holders
				}
				""");
		Path output = directory.resolve("glossary");
		List<Path> written = MetaGlossary.generate(directory.resolve("source"), output);
		assertThat(written).containsExactlyInAnyOrder(output.resolve("party.md"), output.resolve("retail/account.md"));
		assertThat(Files.readString(output.resolve("retail/account.md")))
			.contains("| holders | Party (from party) | at least one |");
	}

	@Test
	public void anErrorFailsTheGeneration(@TempDir Path directory) throws IOException {
		Files.writeString(directory.resolve("broken.nmeta"), "package b namespace \"urn:b\" class {");
		assertThatThrownBy(() -> MetaGlossary.generate(directory, directory.resolve("glossary")))
			.isInstanceOf(RuntimeException.class);
		assertThat(directory.resolve("glossary/broken.md")).doesNotExist();
	}

	@Test
	public void noDirectoryNoFiles(@TempDir Path directory) {
		assertThat(MetaGlossary.generate(directory.resolve("missing"), directory.resolve("glossary"))).isEmpty();
	}

}
