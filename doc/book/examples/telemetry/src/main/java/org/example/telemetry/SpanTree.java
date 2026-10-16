package org.example.telemetry;

import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Flow;

import org.nasdanika.sdk.runtime.common.telemetry.LogRecord;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.StatusCode;

// tag::tree[]
/**
 * Prints spans as an indented tree while they run: starts, errors, log records with
 * progress, and ends with durations. A console is one subscriber; a browser, a test or
 * a file is another.
 */
public class SpanTree implements Flow.Subscriber<SpanEvent> {

	private final PrintStream out;
	private final Map<PublishingSpan, Instant> started = new ConcurrentHashMap<>();
	private final CountDownLatch completed = new CountDownLatch(1);

	public SpanTree(PrintStream out) {
		this.out = out;
	}

	@Override
	public void onSubscribe(Flow.Subscription subscription) {
		subscription.request(Long.MAX_VALUE);
	}

	@Override
	public void onNext(SpanEvent event) {
		switch (event) {                                                    // <1>
			case SpanEvent.Started s -> {
				started.put(s.span(), s.timestamp());
				out.println(indent(s.span()) + "+ " + s.name() + format(s.attributes()));
			}
			case SpanEvent.StatusSet s when s.code() == StatusCode.ERROR ->
				out.println(indent(s.span()) + "  ! " + s.description());
			case SpanEvent.LogEmitted l ->
				out.println(indent(l.span()) + "  " + describe(l.record()));
			case SpanEvent.Ended e -> {
				Duration duration = Duration.between(started.remove(e.span()), e.timestamp());
				String name = e.span().getName() + " (" + duration.toMillis() + " ms)";
				out.println(indent(e.span()) + "- " + name);
			}
			default -> {
				// Attributes set later, exceptions and renames are not printed
			}
		}
	}

	private static String describe(LogRecord record) {
		if (Telemetry.PROGRESS_EVENT.equals(record.eventName())) {         // <2>
			Long worked = record.attributes().get(Telemetry.PROGRESS_WORKED);
			Long total = record.attributes().get(Telemetry.PROGRESS_TOTAL);
			return "[" + worked + "/" + total + "] " + record.bodyAsString();
		}
		return record.severity() + " " + record.bodyAsString();
	}
	// end::tree[]

	private static String format(Attributes attributes) {
		if (attributes.isEmpty()) {
			return "";
		}
		StringBuilder builder = new StringBuilder(" {");
		attributes.forEach((key, value) -> {
			if (builder.length() > 2) {
				builder.append(", ");
			}
			builder.append(key.getKey()).append('=').append(value);
		});
		return builder.append('}').toString();
	}

	private static String indent(PublishingSpan span) {
		int depth = 0;
		PublishingSpan parent = span == null ? null : span.getParent();
		for (; parent != null; parent = parent.getParent()) {
			++depth;
		}
		return "  ".repeat(depth);
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace(out);
		completed.countDown();
	}

	@Override
	public void onComplete() {
		completed.countDown();
	}

	/**
	 * Waits until the publisher completes, so that nothing is lost when delivery is
	 * asynchronous.
	 */
	public void await() throws InterruptedException {
		completed.await();
	}

}
