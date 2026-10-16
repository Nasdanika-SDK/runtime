package org.example.dsl;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.example.library.Book;
import org.example.library.Library;
import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.models.core.CoreFactory;
import org.nasdanika.sdk.runtime.models.core.ScriptEvaluator;

class TestEvaluators {

	@Test
	void aRuleInTheModel() {
		// tag::evaluator[]
		ScriptEvaluator classic = CoreFactory.eINSTANCE.createScriptEvaluator();
		classic.setLanguage("groovy");                                           // <1>
		classic.setScript("book.year < 1980 && book.authors.size() == 1");
		classic.setDocumentation("A classic: older than 1980, with a single author.");

		Library library = Samples.library();
		for (Book book: library.getBooks()) {
			Boolean result = classic.evaluate(Boolean.class, Map.of("book", book)); // <2>
			if (result) {
				System.out.println(book.getName());
			}
		}
		// end::evaluator[]
		Book origin = library.getBooks().stream()
				.filter(b -> b.getName().equals("On the Origin of Species"))
				.findFirst()
				.orElseThrow();
		assertThat(classic.evaluate(Boolean.class, Map.of("book", origin))).isTrue();
	}

}
