package org.example.start;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

/**
 * The program of {@link FirstModel}, watched: the runtime's own spans and log records printed as
 * an indented tree while it runs. No OpenTelemetry SDK, no backend, no configuration.
 */
public final class WatchIt {

	private WatchIt() {
	}

	// tag::printer[]
	/**
	 * Prints span starts, ends and log records, indented by span nesting.
	 */
	public static final class Printer implements Flow.Subscriber<SpanEvent> {

		private final PrintStream out;

		public Printer(PrintStream out) {
			this.out = out;
		}

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(SpanEvent event) {
			switch (event) {
				case SpanEvent.Started started -> out.println(indent(started.span()) + "> " + started.name());
				case SpanEvent.Ended ended -> out.println(indent(ended.span()) + "< " + ended.span().getName());
				case SpanEvent.LogEmitted log -> out.println(indent(log.span()) + "  " + log.record().bodyAsString());
				default -> {
					// Attributes, status and exceptions are not printed here
				}
			}
		}

		private static String indent(PublishingSpan span) {
			int depth = 0;
			for (PublishingSpan parent = span == null ? null : span.getParent(); parent != null; parent = parent.getParent()) {
				++depth;
			}
			return "  ".repeat(depth);
		}

		@Override
		public void onError(Throwable throwable) {
			throwable.printStackTrace(out);
		}

		@Override
		public void onComplete() {
			out.println("Done");
		}

	}
	// end::printer[]

	// tag::watch[]
	public static void watch(PrintStream out) throws IOException {
		PublishingTracerProvider tracerProvider = new PublishingTracerProvider(
				TracerProvider.noop(), // <1>
				Runnable::run,         // <2>
				1024);
		try (PublishingOpenTelemetry openTelemetry =
				new PublishingOpenTelemetry(OpenTelemetry.noop(), tracerProvider)) {
			openTelemetry.subscribe(new Printer(out));                   // <3>
			try (Scope scope = Telemetry.makeCurrent(openTelemetry)) {   // <4>
				Path directory = Files.createTempDirectory("watch-it");
				Telemetry.inSpan(                                         // <5>
						Telemetry.tracer(openTelemetry),
						"Save a book",
						null,
						span -> FirstModel.save(FirstModel.libraryPackage(), directory));
			}
		}
	}
	// end::watch[]

	public static void main(String[] args) throws IOException {
		watch(System.out);
	}

}
