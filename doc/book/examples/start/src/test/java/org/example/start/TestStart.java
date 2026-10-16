package org.example.start;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TestStart {

	@Test
	void savesAndLoadsInEveryFormat(@TempDir Path directory) throws IOException {
		EPackage library = FirstModel.libraryPackage();
		List<Path> files = FirstModel.save(library, directory);
		assertThat(files).hasSize(3);
		for (Path file: files) {
			assertThat(FirstModel.title(library, file)).isEqualTo("Structure and Interpretation of Computer Programs");
		}
	}

	@Test
	void theRuntimeIsObservableFromTheFirstLine() throws IOException {
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		WatchIt.watch(new PrintStream(bytes, true, StandardCharsets.UTF_8));
		String output = bytes.toString(StandardCharsets.UTF_8);
		assertThat(output)
			.contains("> ResourceSetContributor.configure")
			.contains("> Resource.save")
			.contains("> URIHandler.write")
			.contains("Done");
	}

}
