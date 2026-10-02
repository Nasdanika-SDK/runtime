package org.nasdanika.sdk.runtime.volume;

import java.io.IOException;
import java.io.OutputStream;

import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams;
import org.nasdanika.sdk.runtime.common.telemetry.MeteredStreams.MeteredOutputStream;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;

/**
 * Telemetry of content transfers. The {@link OpenTelemetry} is the current one,
 * {@link Telemetry#current()}: the unit of work's.
 */
final class ContentTelemetry {

	private ContentTelemetry() {}

	static Attributes attributes(Content content) {
		return Attributes.of(Telemetry.CONTENT, String.valueOf(content));
	}

	/**
	 * Runs a push transfer in a {@code Content.writeTo} span with the byte count, reporting progress
	 * while it runs. The consumer owns {@code out}, so the span ends when the transfer does, not
	 * when the stream is closed.
	 */
	static void writeTo(Content content, OutputStream out, Content.IOConsumer<OutputStream> transfer) throws IOException {
		OpenTelemetry openTelemetry = Telemetry.current();
		Attributes attributes = attributes(content);
		Telemetry.inSpan(Telemetry.tracer(openTelemetry), "Content.writeTo", attributes, span -> {
			MeteredOutputStream metered = new MeteredOutputStream(
					out,
					MeteredStreams.spanMeter(Telemetry.logger(openTelemetry), span, "Written", String.valueOf(content), attributes, false),
					MeteredStreams.PROGRESS_INTERVAL.toNanos());
			transfer.accept(metered);
			metered.flush();
			span.setAttribute(Telemetry.IO_BYTES, metered.getCount());
			return null;
		});
	}

}
