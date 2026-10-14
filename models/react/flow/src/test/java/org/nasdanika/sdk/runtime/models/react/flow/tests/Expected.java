package org.nasdanika.sdk.runtime.models.react.flow.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Compares generated output with reviewed expected files in src/test/resources/expected.
 * The actual output is always written to target/expected-actual, so a changed expectation
 * is reviewed by diffing the two and copying the actual file over the expected one.
 */
final class Expected {

	private static final Path EXPECTED = Path.of("src", "test", "resources", "expected");

	private static final Path ACTUAL = Path.of("target", "expected-actual");

	private Expected() {
	}

	static void assertMatches(String name, String actual) {
		String normalized = actual.replace("\r\n", "\n");
		try {
			Files.createDirectories(ACTUAL);
			Files.writeString(ACTUAL.resolve(name), normalized, StandardCharsets.UTF_8);
			Path expectedFile = EXPECTED.resolve(name);
			if (!Files.exists(expectedFile)) {
				fail("No expected output " + expectedFile + ", review " + ACTUAL.resolve(name) + " and copy it there");
			}
			assertEquals(Files.readString(expectedFile, StandardCharsets.UTF_8).replace("\r\n", "\n"), normalized, name);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

}
