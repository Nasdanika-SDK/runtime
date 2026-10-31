package vocabulary;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.meta.resource.MetaValidator;

/**
 * Validates the vocabulary in src/main/meta. Problems are printed one per line,
 * file:line:column: severity: message, which assistants read and the VS Code task's problem
 * matcher shows in the editor.
 */
class VocabularyTest {

	@Test
	void validate() {
		List<MetaValidator.Problem> problems = MetaValidator.validate(Path.of("src/main/meta"), Path.of(""));
		problems.forEach(System.out::println);
		assertFalse(MetaValidator.hasErrors(problems), "The vocabulary has errors, listed above");
	}

}
