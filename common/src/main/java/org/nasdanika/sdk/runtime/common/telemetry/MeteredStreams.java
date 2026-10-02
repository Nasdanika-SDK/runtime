package org.nasdanika.sdk.runtime.common.telemetry;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;

/**
 * Streams that count the bytes passing through them, report progress at most once per interval,
 * and report once when closed. {@link #spanMeter(Logger, Span, String, String, Attributes, boolean)}
 * reports to a span: progress log records correlated with it, and the byte count, status and end
 * on close.
 */
public final class MeteredStreams {

	public static final Duration PROGRESS_INTERVAL = Duration.ofSeconds(1);

	private MeteredStreams() {}

	/**
	 * Receives the byte count.
	 */
	public interface Meter {

		/**
		 * Called from a read or write at most once per interval.
		 */
		default void progress(long bytes) {}

		/**
		 * Called once, on the first close.
		 *
		 * @param failure The failure of a read, write or close, or null
		 */
		default void closed(long bytes, Throwable failure) {}

	}

	/**
	 * A meter reporting to a span, which need not be current: progress log records
	 * ({@link Telemetry#PROGRESS_EVENT}, with {@link Telemetry#IO_BYTES}) are correlated with it
	 * explicitly, and on close the byte count is set on it.
	 *
	 * @param verb Starts the progress message: "Read", "Written"
	 * @param subject Ends it: what is being read or written
	 * @param attributes Added to the progress records. May be null
	 * @param endOnClose Whether closing the stream sets the status and ends the span. False when the
	 * span outlives the stream, for example when the caller owns the stream and does not close it
	 */
	public static Meter spanMeter(Logger logger, Span span, String verb, String subject, Attributes attributes, boolean endOnClose) {
		Context spanContext = Context.current().with(span);
		Attributes base = attributes == null ? Attributes.empty() : attributes;
		return new Meter() {

			@Override
			public void progress(long bytes) {
				Telemetry.log(
						logger,
						spanContext,
						Severity.INFO,
						Telemetry.PROGRESS_EVENT,
						verb + " " + bytes + " bytes of " + subject,
						base.toBuilder().put(Telemetry.IO_BYTES, bytes).build());
			}

			@Override
			public void closed(long bytes, Throwable failure) {
				span.setAttribute(Telemetry.IO_BYTES, bytes);
				if (endOnClose) {
					if (failure == null) {
						span.setStatus(StatusCode.OK);
					} else {
						Telemetry.recordFailure(span, failure);
					}
					span.end();
				}
			}

		};
	}

	/**
	 * Counts and reports progress. Not thread-safe, like the streams it wraps.
	 */
	private static final class Counter {

		final Meter meter;
		final long intervalNanos;
		long bytes;
		long lastReport = System.nanoTime();
		Throwable failure;
		boolean closed;

		Counter(Meter meter, long intervalNanos) {
			this.meter = meter;
			this.intervalNanos = intervalNanos;
		}

		void add(long n) {
			if (n > 0) {
				bytes += n;
				if (meter != null && intervalNanos > 0) {
					long now = System.nanoTime();
					if (now - lastReport >= intervalNanos) {
						lastReport = now;
						meter.progress(bytes);
					}
				}
			}
		}

		void failed(Throwable e) {
			if (failure == null) {
				failure = e;
			}
		}

		void close() {
			if (!closed) {
				closed = true;
				if (meter != null) {
					meter.closed(bytes, failure);
				}
			}
		}

	}

	public static class MeteredInputStream extends FilterInputStream {

		private final Counter counter;

		/**
		 * @param intervalNanos 0 for no progress reports
		 */
		public MeteredInputStream(InputStream in, Meter meter, long intervalNanos) {
			super(in);
			counter = new Counter(meter, intervalNanos);
		}

		public long getCount() {
			return counter.bytes;
		}

		@Override
		public int read() throws IOException {
			try {
				int b = super.read();
				if (b != -1) {
					counter.add(1);
				}
				return b;
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			}
		}

		@Override
		public int read(byte[] b, int off, int len) throws IOException {
			try {
				int n = in.read(b, off, len);
				counter.add(n);
				return n;
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			}
		}

		@Override
		public long skip(long n) throws IOException {
			try {
				long skipped = super.skip(n);
				counter.add(skipped);
				return skipped;
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			}
		}

		@Override
		public void close() throws IOException {
			try {
				super.close();
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			} finally {
				counter.close();
			}
		}

	}

	public static class MeteredOutputStream extends FilterOutputStream {

		private final Counter counter;

		/**
		 * @param intervalNanos 0 for no progress reports
		 */
		public MeteredOutputStream(OutputStream out, Meter meter, long intervalNanos) {
			super(out);
			counter = new Counter(meter, intervalNanos);
		}

		public long getCount() {
			return counter.bytes;
		}

		@Override
		public void write(int b) throws IOException {
			try {
				out.write(b);
				counter.add(1);
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			}
		}

		@Override
		public void write(byte[] b, int off, int len) throws IOException {
			try {
				out.write(b, off, len); // Not FilterOutputStream's, which writes byte by byte
				counter.add(len);
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			}
		}

		@Override
		public void flush() throws IOException {
			try {
				out.flush();
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			}
		}

		@Override
		public void close() throws IOException {
			try {
				super.close();
			} catch (IOException | RuntimeException e) {
				counter.failed(e);
				throw e;
			} finally {
				counter.close();
			}
		}

	}

}
