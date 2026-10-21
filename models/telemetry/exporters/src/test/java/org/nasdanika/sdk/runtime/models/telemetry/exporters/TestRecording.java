package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.telemetry.traces.Span;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData;
import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.context.Scope;

class TestRecording {

	@Test
	void recordsToADirectory(@TempDir Path dir) {
		try (Recording recording = Recording.builder().serviceName("recording-test").directory(dir).build();
				Scope scope = recording.makeCurrent()) {
			Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "work", null, span -> {
				Telemetry.log(Telemetry.logger(Telemetry.current()), Severity.INFO, null, "inside", null);
				Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "step", null, step -> null);
				return null;
			});
		}

		// Saved on close: load in a fresh resource set
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TracesPackage.eNS_URI, TracesPackage.eINSTANCE);
		URI tracesURI = URI.createFileURI(dir.resolve("traces.xml").toString());
		TracesData traces = (TracesData) resourceSet.getResource(tracesURI, true).getContents().get(0);
		Span work = traces.getResourceSpans().getFirst().getScopeSpans().getFirst().getSpans().getFirst();
		assertThat(work.getName()).isEqualTo("work");
		assertThat(work.getChildren()).extracting(Span::getName).containsExactly("step");
		assertThat(work.getLogRecords()).singleElement().satisfies(l -> assertThat(l.getBody().getStringValue()).isEqualTo("inside"));
		assertThat(dir.resolve("logs.xml")).exists();
		assertThat(dir.resolve("metrics.xml")).exists();
	}

	@Test
	void modelsAreAvailableAfterClose(@TempDir Path dir) {
		Recording recording = Recording.builder().directory(dir).build();
		try (Scope scope = recording.makeCurrent()) {
			Telemetry.inSpan(Telemetry.tracer(Telemetry.current()), "work", null, span -> null);
		}
		recording.close();
		assertThat(recording.getTraces().getResourceSpans().getFirst().getScopeSpans().getFirst().getSpans())
			.extracting(Span::getName).containsExactly("work");
	}

}
