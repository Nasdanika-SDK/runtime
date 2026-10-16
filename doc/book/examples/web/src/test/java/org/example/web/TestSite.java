package org.example.web;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.example.library.services.Samples;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.volume.Volume;

class TestSite {

	@Test
	void generatesTheCatalog(@TempDir Path directory) throws IOException {
		// tag::run[]
		CatalogSite.generate(Samples.library(), Volume.of(directory));
		// end::run[]
		String index = Files.readString(directory.resolve("index.html"));
		assertThat(index)
			.contains("<table class=\"table table-striped table-hover\">")
			.contains("books/domain-driven-design.html");
		Path page = directory.resolve("books").resolve("domain-driven-design.html");
		assertThat(Files.readString(page))
			.contains("breadcrumb")
			.contains("Cites Design Patterns")
			.contains("Cited by EMF: Eclipse Modeling Framework");
	}

}
