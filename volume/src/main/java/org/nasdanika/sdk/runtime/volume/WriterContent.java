package org.nasdanika.sdk.runtime.volume;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * SKETCH. Belongs to the {@code volume} module, package-private behind
 * {@link Content#ofWriter(Content.IOConsumer)}.
 *
 * Turns "a closure that writes to an output stream" into a {@link Content}:
 *
 * <ul>
 * <li>PUSH: {@link #writeTo(OutputStream)} runs the writer on the consumer's stream. No pipe, no
 * thread. This is the JAX-RS {@code StreamingOutput} arrangement.</li>
 * <li>PULL: {@link #openStream()} returns a pipe that does nothing until its first read, then
 * starts the writer on a virtual thread writing bounded chunks into a queue the reader drains.
 * Spring 6.1's {@code DataBufferUtils.outputStreamPublisher} does the same for publishers.</li>
 * </ul>
 *
 * Deliberately not {@code PipedInputStream}: it detects a dead writer or reader from thread
 * liveness and has a 1 KB default buffer.
 */
final class WriterContent implements Content {

	private static final int CHUNK_SIZE = 8192;
	private static final int CAPACITY = 16; // chunks in flight: bounds memory at 128 KB per open stream
	private static final byte[] EOF = new byte[0]; // identity sentinel; real chunks are never empty

	private final IOConsumer<OutputStream> writer;
	private final boolean repeatable;

	WriterContent(IOConsumer<OutputStream> writer, boolean repeatable) {
		this.writer = Objects.requireNonNull(writer);
		this.repeatable = repeatable;
	}

	@Override
	public boolean repeatable() {
		return repeatable;
	}

	@Override
	public void writeTo(OutputStream out) throws IOException {
		// The consumer owns `out`: the writer may close what it is given, so it gets a view whose
		// close() only flushes.
		writer.accept(new FilterOutputStream(out) {

			@Override
			public void write(byte[] b, int off, int len) throws IOException {
				out.write(b, off, len); // bypass FilterOutputStream's byte-at-a-time default
			}

			@Override
			public void close() throws IOException {
				flush();
			}

		});
	}

	@Override
	public InputStream openStream() {
		return new PipeInputStream();
	}

	private final class PipeInputStream extends InputStream {

		private final BlockingQueue<byte[]> queue = new ArrayBlockingQueue<>(CAPACITY);
		private volatile boolean closed;
		private volatile Throwable failure;
		private Thread producer;
		private byte[] current;
		private int position;
		private boolean eof;

		/** Starts the writer on the first read, never before. */
		private void start() {
			if (producer != null) {
				return;
			}
			producer = Thread.ofVirtual().name("content-writer").start(() -> {
				try (OutputStream out = new PipeOutputStream()) {
					writer.accept(out);
				} catch (Throwable t) {
					failure = t;
				} finally {
					if (!closed) {
						try {
							queue.put(EOF);
						} catch (InterruptedException e) {
							// The reader closed while we waited; nobody is listening for EOF.
						}
					}
				}
			});
		}

		@Override
		public int read() throws IOException {
			byte[] one = new byte[1];
			int n = read(one, 0, 1);
			return n == -1 ? -1 : one[0] & 0xFF;
		}

		@Override
		public int read(byte[] b, int off, int len) throws IOException {
			Objects.checkFromIndexSize(off, len, b.length);
			if (closed) {
				throw new IOException("Stream closed");
			}
			if (len == 0) {
				return 0;
			}
			start();
			while (current == null || position == current.length) {
				if (eof) {
					rethrow();
					return -1;
				}
				try {
					current = queue.take();
					position = 0;
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					throw new InterruptedIOException("Interrupted while waiting for the writer");
				}
				if (current == EOF) {
					current = null;
					eof = true;
				}
			}
			int n = Math.min(len, current.length - position);
			System.arraycopy(current, position, b, off, n);
			position += n;
			return n;
		}

		/** A writer's failure reaches the reader instead of disappearing on another thread. */
		private void rethrow() throws IOException {
			Throwable t = failure;
			if (t instanceof IOException ioe) {
				throw ioe;
			}
			if (t != null) {
				throw new IOException("Content writer failed", t);
			}
		}

		/** Closing early cancels the writer: its next write throws, and a blocked put is interrupted. */
		@Override
		public void close() {
			if (closed) {
				return;
			}
			closed = true;
			if (producer != null) {
				producer.interrupt();
			}
			queue.clear();
		}

		private final class PipeOutputStream extends OutputStream {

			private final byte[] buffer = new byte[CHUNK_SIZE];
			private int count;

			@Override
			public void write(int b) throws IOException {
				if (count == buffer.length) {
					flushChunk();
				}
				buffer[count++] = (byte) b;
			}

			@Override
			public void write(byte[] b, int off, int len) throws IOException {
				Objects.checkFromIndexSize(off, len, b.length);
				while (len > 0) {
					if (count == buffer.length) {
						flushChunk();
					}
					int n = Math.min(len, buffer.length - count);
					System.arraycopy(b, off, buffer, count, n);
					count += n;
					off += n;
					len -= n;
				}
			}

			@Override
			public void flush() throws IOException {
				if (count > 0) {
					flushChunk();
				}
			}

			@Override
			public void close() throws IOException {
				flush();
			}

			private void flushChunk() throws IOException {
				if (closed) {
					throw new IOException("Reader closed");
				}
				try {
					queue.put(Arrays.copyOf(buffer, count));
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					throw new InterruptedIOException("Reader closed");
				}
				count = 0;
			}

		}

	}

}
