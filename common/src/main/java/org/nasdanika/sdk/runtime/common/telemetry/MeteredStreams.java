package org.nasdanika.sdk.runtime.common.telemetry;

import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Streams that count the bytes passing through them, report progress at most once per interval,
 * and report once when closed.
 */
final class MeteredStreams {

	private MeteredStreams() {}

	/**
	 * Receives the byte count.
	 */
	interface Meter {

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

	static class MeteredInputStream extends FilterInputStream {

		private final Counter counter;

		/**
		 * @param intervalNanos 0 for no progress reports
		 */
		MeteredInputStream(InputStream in, Meter meter, long intervalNanos) {
			super(in);
			counter = new Counter(meter, intervalNanos);
		}

		long getCount() {
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

	static class MeteredOutputStream extends FilterOutputStream {

		private final Counter counter;

		/**
		 * @param intervalNanos 0 for no progress reports
		 */
		MeteredOutputStream(OutputStream out, Meter meter, long intervalNanos) {
			super(out);
			counter = new Counter(meter, intervalNanos);
		}

		long getCount() {
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
