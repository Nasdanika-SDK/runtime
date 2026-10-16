package org.example.cli;

import java.util.List;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.cli.SubCommandCapabilityFactory;
import org.nasdanika.sdk.runtime.common.flow.Flows;

import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.trace.Span;
import picocli.CommandLine;

public class CsvExporterFactory extends SubCommandCapabilityFactory<CsvExporter> {

	@Override
	protected Class<CsvExporter> getCommandType() {
		return CsvExporter.class;
	}

	@Override
	protected Flow.Publisher<CsvExporter> doCreateCommand(
			List<CommandLine> parentPath,
			Loader loader,
			Span span,
			Logger logger) {
		return Flows.of(new CsvExporter());
	}

}
