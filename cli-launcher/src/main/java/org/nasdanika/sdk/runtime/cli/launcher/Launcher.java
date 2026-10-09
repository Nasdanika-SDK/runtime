package org.nasdanika.sdk.runtime.cli.launcher;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.cli.ShellCommand;
import org.nasdanika.sdk.runtime.cli.SubCommandRequirement;
import org.nasdanika.sdk.runtime.common.Closeable;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactorySource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory;
import org.nasdanika.sdk.runtime.common.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelLogRecordExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelMetricExporter;
import org.nasdanika.sdk.runtime.models.telemetry.exporters.ModelSpanExporter;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.logs.SdkLoggerProvider;
import io.opentelemetry.sdk.logs.export.BatchLogRecordProcessor;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import picocli.CommandLine;


public class Launcher {
			
	private static String getVersion() {
		Module module = Launcher.class.getModule();		
		if (module == null) {
			return "(unknown)";
		}
		
		return module.getDescriptor().toNameAndVersion();
	}

	/** Locates this jar (or classes directory) via its code source. */
	static Path locateJar() {
		try {
			CodeSource codeSource = Launcher.class.getProtectionDomain().getCodeSource();
			if (codeSource != null && codeSource.getLocation() != null) {
				return Path.of(codeSource.getLocation().toURI()).toAbsolutePath().normalize();
			}
		} catch (URISyntaxException e) {
			// fall through
		}
		throw new IllegalStateException("Unable to determine NSDK location; set NSDK_HOME or -Dnsdk.home");
	}
	
	private static Path resolveHome() {
		String override = System.getProperty("nsdk.home");
		if (override == null || override.isBlank()) {
			override = System.getenv("NSDK_HOME");
		}
		if (override != null && !override.isBlank()) {
			return Path.of(override).toAbsolutePath().normalize();
		}

		Path jar = locateJar();
		for (Path ancestor = jar.getParent(); ancestor != null; ancestor = ancestor.getParent()) {
			Path name = ancestor.getFileName();
			if (name != null && "lib".equals(name.toString())) {
				Path parent = ancestor.getParent();
				if (parent != null) {
					return parent;
				}
			}
		}
		// Fallback: the directory containing the jar (e.g. running from a flat dir).
		Path parent = jar.getParent();
		return parent != null ? parent : Path.of(".").toAbsolutePath().normalize();
	}	
	
	/**
	 * Telemetry file formats, by the value of {@code nsdk.telemetry.format} or {@code NSDK_TELEMETRY_FORMAT},
	 * mapped to the extension that selects the resource factory.
	 */
	private static final Map<String, String> TELEMETRY_FORMATS = Map.of(
			"yml", "yml",
			"json", "json",
			"xml", "xml",
			"binary", "ebin",
			"compressed", "egz");

	private static final String DEFAULT_TELEMETRY_FORMAT = "yml";

	/** @return The extension of telemetry files. The system property takes precedence over the environment variable. */
	private static String resolveTelemetryExtension() {
		String format = System.getProperty("nsdk.telemetry.format");
		if (format == null || format.isBlank()) {
			format = System.getenv("NSDK_TELEMETRY_FORMAT");
		}
		if (format == null || format.isBlank()) {
			format = DEFAULT_TELEMETRY_FORMAT;
		}
		String extension = TELEMETRY_FORMATS.get(format.trim().toLowerCase(Locale.ROOT));
		if (extension == null) {
			throw new IllegalArgumentException("Unsupported telemetry format '" + format + "', expected one of " + new TreeSet<>(TELEMETRY_FORMATS.keySet()));
		}
		return extension;
	}

	private static final String SCOPE = "org.nasdanika.sdk.cli.launcher";
	
	/**
	 * Builds the instance. The SDK owns the exporters, and the exporters own the telemetry
	 * resources: shutting the SDK down exports what is pending and saves them. The log record exporter
	 * is linked to the span exporter. W3C trace context and baggage propagators are set, so the launch
	 * can continue a trace passed in environment variables.
	 */
	static OpenTelemetrySdk openTelemetry(Resource traces, Resource logs, Resource metrics) {
		Attributes serviceAttributes = Attributes.builder()
				.put("service.name", "launcher")
				.put("service.version", getVersion())
				.put("dir", Paths.get("").toAbsolutePath().toString())
				.build();
		io.opentelemetry.sdk.resources.Resource resource = io.opentelemetry.sdk.resources.Resource.getDefault()
				.merge(io.opentelemetry.sdk.resources.Resource.create(serviceAttributes));

		ModelSpanExporter spanExporter = new ModelSpanExporter(traces);
		return OpenTelemetrySdk.builder()
				.setPropagators(Telemetry.w3cPropagators())
				.setTracerProvider(SdkTracerProvider.builder()
						.setResource(resource)
						.addSpanProcessor(BatchSpanProcessor.builder(spanExporter).build())
						.build())
				.setLoggerProvider(SdkLoggerProvider.builder()
						.setResource(resource)
						.addLogRecordProcessor(BatchLogRecordProcessor.builder(new ModelLogRecordExporter(logs, spanExporter)).build())
						.build())
				.setMeterProvider(SdkMeterProvider.builder()
						.setResource(resource)
						.registerMetricReader(PeriodicMetricReader.builder(new ModelMetricExporter(metrics)).build())
						.build())
				.build();
	}	
	
	private static URI uri(Path dir, String name) {
		return URI.createFileURI(dir.resolve(name).toAbsolutePath().toString());
	}
	
	private static int executeRootCommand(String[] args, Span span, Logger logger, Meter meter) {
		try (CapabilityFactorySource capabilityFactorySource = CapabilityFactorySource.serviceLoader()) {
			CapabilityLoader capabilityLoader = CapabilityLoader.of(capabilityFactorySource);
			
			// Sub-commands, sorting alphabetically
			Requirement<SubCommandRequirement, CommandLine> subCommandRequirement = ServiceCapabilityFactory.createRequirement(CommandLine.class,  new SubCommandRequirement(Collections.emptyList(), new AtomicInteger()));
			for (Object rcmd: capabilityLoader.loadAll(subCommandRequirement)) {
				if (rcmd instanceof CommandLine rootCommand) {
					rootCommand.addSubcommand(new ShellCommand(rootCommand));
					try {
						Telemetry.log(logger, Severity.INFO, null, "Executing the root command", null);
						return rootCommand.execute(args);
					} finally {
						if (rootCommand instanceof Closeable closeable) {
							Telemetry.log(logger, Severity.INFO, null, "Closing the root command", null);
							closeable.close();
						}
					}
				}
			}
		}
		Telemetry.log(logger, Severity.ERROR, null, "There are no root commands", null);
		throw new UnsupportedOperationException("There are no root commands");
	}

	public static void main(String[] args) throws IOException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
 		
		Path dir = resolveHome().resolve(
				"telemetry", 
				DateTimeFormatter.ofPattern("yyyy").format(now),
				DateTimeFormatter.ofPattern("MM").format(now),
				DateTimeFormatter.ofPattern("dd-HH-mm-ss-SSS").format(now));
		
		String extension = resolveTelemetryExtension();
		Files.createDirectories(dir);
		URI tracesURI = uri(dir, "traces." + extension);
		URI logsURI = uri(dir, "logs." + extension);
		URI metricsURI = uri(dir, "metrics." + extension);

		NasdanikaResourceSet telemetryResourceSet = NasdanikaResourceSet.createAndConfigure();

		int exitCode;
		
		// Resources close in reverse order: the scope first, then the SDK, which saves the telemetry.
		// If TRACEPARENT (and optionally TRACESTATE and BAGGAGE) is set, for example by a build step or
		// a function invocation, the root span continues that trace.
		try (OpenTelemetrySdk openTelemetry = openTelemetry(
						telemetryResourceSet.createResource(tracesURI),
						telemetryResourceSet.createResource(logsURI),
						telemetryResourceSet.createResource(metricsURI));
				Scope telemetryScope = Telemetry.with(Telemetry.extractFromEnvironment(openTelemetry, Context.current()), openTelemetry).makeCurrent()) {

			Tracer tracer = openTelemetry.getTracer(SCOPE);
			Logger logger = openTelemetry.getLogsBridge().get(SCOPE);
			Meter meter = openTelemetry.getMeter(SCOPE);

			exitCode = Telemetry.inSpan(tracer, "Executing the root command", null, span -> executeRootCommand(args, span, logger, meter));
		}
		System.exit(exitCode);
	}

}
