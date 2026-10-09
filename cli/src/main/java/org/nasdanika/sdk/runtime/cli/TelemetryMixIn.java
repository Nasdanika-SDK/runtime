package org.nasdanika.sdk.runtime.cli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;
import picocli.CommandLine.Spec.Target;

/**
 * Telemetry configuration and recording/monitoring/saving 
 * @author Pavel
 *
 */
public class TelemetryMixIn {
	
	@Spec(Target.MIXEE)
	private CommandSpec mixee;
	
//	@Option(names = "--progress-logger", description = "Output logger for progress monitor")
//	private String progressLogger;
	
	// TODO - saving to file
	// TODO - serve over HTTP, optionally open a web browser. 
	
	
}
