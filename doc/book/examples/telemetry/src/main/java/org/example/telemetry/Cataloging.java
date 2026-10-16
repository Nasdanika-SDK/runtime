package org.example.telemetry;

import static org.nasdanika.sdk.runtime.common.telemetry.Telemetry.PROGRESS_EVENT;
import static org.nasdanika.sdk.runtime.common.telemetry.Telemetry.PROGRESS_TOTAL;
import static org.nasdanika.sdk.runtime.common.telemetry.Telemetry.PROGRESS_WORKED;

import java.util.List;

import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;

/**
 * Instrumented work: cataloging books. It knows nothing about where its telemetry goes.
 * It reports to whatever OpenTelemetry the unit of work made current.
 */
public final class Cataloging {

	// tag::keys[]
	/**
	 * The instrumentation scope is the module name, by the runtime's identity rule.
	 */
	static final String SCOPE = Cataloging.class.getModule().getName();

	static final AttributeKey<String> TITLE = AttributeKey.stringKey("library.book.title");
	static final AttributeKey<Long> BOOKS = AttributeKey.longKey("library.books");
	// end::keys[]

	private Cataloging() {
	}

	// tag::in-span[]
	public static int catalog(List<String> titles) {
		OpenTelemetry openTelemetry = Telemetry.current();                   // <1>
		Tracer tracer = openTelemetry.getTracer(SCOPE);
		Logger logger = openTelemetry.getLogsBridge().get(SCOPE);
		LongCounter cataloged = openTelemetry.getMeter(SCOPE)
				.counterBuilder("library.books.cataloged")
				.build();
		long total = titles.size();
		Attributes attributes = Attributes.of(BOOKS, total);

		return Telemetry.inSpan(tracer, "Catalog books", attributes, span -> { // <2>
			int done = 0;
			for (String title: titles) {
				try {
					catalogOne(tracer, title);
					cataloged.add(1);                                           // <3>
				} catch (IllegalArgumentException e) {
					String message = "Skipped: " + e.getMessage();
					Telemetry.log(logger, Severity.WARN, null, message, null);    // <4>
				}
				++done;
				Telemetry.log(                                                  // <5>
						logger,
						Severity.INFO,
						PROGRESS_EVENT,
						"Processed " + done + " of " + total,
						Attributes.of(PROGRESS_WORKED, (long) done, PROGRESS_TOTAL, total));
			}
			return done;
		});
	}
	// end::in-span[]

	// tag::manual[]
	static void catalogOne(Tracer tracer, String title) {
		Span span = tracer.spanBuilder("Catalog a book")
				.setAttribute(TITLE, title)                                   // <1>
				.startSpan();
		try (Scope scope = span.makeCurrent()) {                            // <2>
			if (title.isBlank()) {
				throw new IllegalArgumentException("a book needs a title");
			}
			span.setStatus(StatusCode.OK);
		} catch (RuntimeException e) {
			Telemetry.recordFailure(span, e);                               // <3>
			throw e;
		} finally {
			span.end();                                                     // <4>
		}
	}
	// end::manual[]

}
