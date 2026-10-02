package org.nasdanika.sdk.runtime.volume;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Flow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingOpenTelemetry;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingSpan;
import org.nasdanika.sdk.runtime.common.telemetry.PublishingTracerProvider;
import org.nasdanika.sdk.runtime.common.telemetry.SpanEvent;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.Scope;

/**
 * Content telemetry watched live through a {@link PublishingOpenTelemetry} over the no-op instance:
 * no SDK needed. With an SDK, the same spans are exported; see the telemetry tests module.
 */
class TestContentTelemetry {

	/**
	 * Collects events synchronously.
	 */
	private static final class Collector implements Flow.Subscriber<SpanEvent> {

		final List<SpanEvent> events = Collections.synchronizedList(new ArrayList<>());

		@Override
		public void onSubscribe(Flow.Subscription subscription) {
			subscription.request(Long.MAX_VALUE);
		}

		@Override
		public void onNext(SpanEvent item) {
			events.add(item);
		}

		@Override
		public void onError(Throwable throwable) {
			throw new AssertionError(throwable);
		}

		@Override
		public void onComplete() {
			// Nothing to do
		}

		List<PublishingSpan> started(String name) {
			synchronized (events) {
				return events.stream()
						.filter(SpanEvent.Started.class::isInstance)
						.map(SpanEvent::span)
						.filter(s -> s.getName().equals(name))
						.toList();
			}
		}

		Object attribute(PublishingSpan span, Object key) {
			synchronized (events) {
				return events.stream()
						.filter(SpanEvent.AttributeSet.class::isInstance)
						.map(SpanEvent.AttributeSet.class::cast)
						.filter(a -> a.span() == span && a.key().equals(key))
						.map(SpanEvent.AttributeSet::value)
						.reduce((first, second) -> second)
						.orElse(null);
			}
		}

	}

	private static PublishingOpenTelemetry publishing() {
		return new PublishingOpenTelemetry(OpenTelemetry.noop(), new PublishingTracerProvider(TracerProvider.noop(), Runnable::run, 1024));
	}

	@Test
	void writeToIsASpan() throws IOException {
		try (PublishingOpenTelemetry otel = publishing(); Scope scope = Telemetry.makeCurrent(otel)) {
			Collector collector = new Collector();
			otel.subscribe(collector);

			Content.of("twelve bytes", StandardCharsets.UTF_8).writeTo(new ByteArrayOutputStream());
			Content.of(new byte[10]).writeTo(new ByteArrayOutputStream()); // in memory: no span

			PublishingSpan writeTo = collector.started("Content.writeTo").getFirst();
			assertThat(collector.started("Content.writeTo")).hasSize(1);
			assertThat(writeTo.isEnded()).isTrue();
			assertThat(collector.attribute(writeTo, Telemetry.IO_BYTES)).isEqualTo(12L);
		}
	}

	/**
	 * The writer of a pipe runs on its own thread in the pipe's span, which is a child of the span
	 * current when the stream was opened: spans the writer starts nest under it.
	 */
	@Test
	void pipeCarriesTheContextToTheWriterThread() throws IOException {
		try (PublishingOpenTelemetry otel = publishing(); Scope scope = Telemetry.makeCurrent(otel)) {
			Collector collector = new Collector();
			otel.subscribe(collector);

			Content content = Content.ofWriter(out -> {
				// Runs on the writer's virtual thread
				Span inner = Telemetry.tracer(Telemetry.current()).spanBuilder("serialize").startSpan();
				try {
					out.write(new byte[100_000]);
				} finally {
					inner.end();
				}
			});

			Span reading = Telemetry.tracer(otel).spanBuilder("reading").startSpan();
			try (Scope readingScope = reading.makeCurrent(); InputStream in = content.openStream()) {
				assertThat(in.readAllBytes()).hasSize(100_000);
			} finally {
				reading.end();
			}

			PublishingSpan pipe = collector.started("Content.pipe").getFirst();
			assertThat(pipe.getParent()).isSameAs(reading);
			assertThat(collector.started("serialize").getFirst().getParent()).isSameAs(pipe);
			assertThat(pipe.isEnded()).isTrue(); // ended before the reader saw the end of the stream
			assertThat(collector.attribute(pipe, Telemetry.IO_BYTES)).isEqualTo(100_000L);
		}
	}

	@Test
	void fileUriReadIsASpan(@TempDir Path dir) throws IOException {
		Path file = dir.resolve("data.bin");
		Files.write(file, new byte[4096]);
		try (PublishingOpenTelemetry otel = publishing(); Scope scope = Telemetry.makeCurrent(otel)) {
			Collector collector = new Collector();
			otel.subscribe(collector);

			try (InputStream in = Content.of(file.toUri()).openStream()) {
				in.transferTo(OutputStreamSink.INSTANCE);
			}

			PublishingSpan read = collector.started("Content.read").getFirst();
			assertThat(read.isEnded()).isTrue();
			assertThat(collector.attribute(read, Telemetry.IO_BYTES)).isEqualTo(4096L);
		}
	}

	private static final class OutputStreamSink extends java.io.OutputStream {

		static final OutputStreamSink INSTANCE = new OutputStreamSink();

		@Override
		public void write(int b) {
			// Discard
		}

		@Override
		public void write(byte[] b, int off, int len) {
			// Discard
		}

	}

}
