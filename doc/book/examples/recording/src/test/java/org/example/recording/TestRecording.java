package org.example.recording;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class TestRecording {

	@Test
	void telemetryAndChangesAreModels(@TempDir Path directory) throws Exception {
		Recorder.curate(directory);
		assertThat(directory.resolve("traces.yml")).exists();
		assertThat(directory.resolve("logs.yml")).exists();
		assertThat(directory.resolve("metrics.yml")).exists();

		List<String> lines = TraceReader.read(directory);
		lines.forEach(System.out::println);
		assertThat(lines).contains("Curate the shelf");
		assertThat(lines).anyMatch(line -> line.contains("* created Library 'A Modeler's Shelf'"));
		assertThat(lines).anyMatch(line -> line.contains("* Book 'Domain-Driven Design'.year = 2004"));
		assertThat(Files.readString(directory.resolve("traces.yml"))).contains("Correct the year");
	}

}
