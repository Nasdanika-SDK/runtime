package org.nasdanika.sdk.runtime.models.meta.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaValidator;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaValidator.Problem;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaValidator.Severity;

/**
 * The validator a vocabulary project's build runs: the files of a directory loaded together, and
 * problems in the format of compilers.
 */
public class MetaValidatorTests {

	private static final String PARTY = """
			package party namespace "https://example.org/party"

			class Party {
			    id string[1] partyId
			}
			""";

	@Test
	public void importsInTheDirectoryResolveWhicheverFileIsReadFirst(@TempDir Path directory) throws IOException {
		Files.writeString(directory.resolve("party.nmeta"), PARTY);
		// "account" sorts before "party", so it is read first
		Files.writeString(directory.resolve("account.nmeta"), """
				package account namespace "https://example.org/account"

				import "https://example.org/party" as party

				class Account {
				    refers party.Party[+] holders
				}
				""");
		assertThat(MetaValidator.validate(directory, directory)).isEmpty();
	}

	@Test
	public void aTypeThatAnAvailablePackageDoesNotHaveIsAnError(@TempDir Path directory) throws IOException {
		Files.writeString(directory.resolve("party.nmeta"), PARTY);
		Files.createDirectories(directory.resolve("src/main/meta"));
		Files.writeString(directory.resolve("src/main/meta/account.nmeta"), """
				package account namespace "https://example.org/account"

				import "https://example.org/party" as party
				import "https://example.org/elsewhere" as elsewhere

				class Account {
				    refers party.Partyy[+] holders
				    refers elsewhere.Branch branch
				    Custmer owner
				}
				""");
		List<Problem> problems = MetaValidator.validate(directory, directory);
		// elsewhere.Branch is not checked: no file has that namespace
		assertThat(problems).extracting(Problem::toString).containsExactly(
				"src/main/meta/account.nmeta:7:12: error: Unknown type Partyy in https://example.org/party",
				"src/main/meta/account.nmeta:9:5: error: Unknown type Custmer");
		assertThat(MetaValidator.hasErrors(problems)).isTrue();
	}

	@Test
	public void errorsComeBeforeWarnings(@TempDir Path directory) throws IOException {
		Files.writeString(directory.resolve("a.nmeta"), """
				package a namespace "urn:a"

				import "urn:facets" as facets

				@facets.Owner { team: "a" }
				class A {}
				""");
		Files.writeString(directory.resolve("b.nmeta"), "package b namespace \"urn:b\" class {");
		List<Problem> problems = MetaValidator.validate(directory, directory);
		assertThat(problems.getFirst().severity()).isEqualTo(Severity.ERROR);
		assertThat(problems.getLast().severity()).isEqualTo(Severity.WARNING);
		assertThat(problems.getFirst().file()).isEqualTo("b.nmeta");
		assertThat(problems.getLast().toString())
			.isEqualTo("a.nmeta:5:2: warning: Facet type facets.Owner is not available, its properties are not checked");
	}

	@Test
	public void aNamespaceBelongsToOneFile(@TempDir Path directory) throws IOException {
		Files.writeString(directory.resolve("party.nmeta"), PARTY);
		Files.writeString(directory.resolve("people.nmeta"), PARTY);
		assertThat(MetaValidator.validate(directory, directory)).extracting(Problem::toString).containsExactly(
				"people.nmeta:0:0: error: Namespace https://example.org/party is also the namespace of party.nmeta");
	}

	@Test
	public void noDirectoryNoProblems(@TempDir Path directory) {
		assertThat(MetaValidator.validate(directory.resolve("missing"), directory)).isEmpty();
	}

}
