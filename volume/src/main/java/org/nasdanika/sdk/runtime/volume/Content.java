package org.nasdanika.sdk.runtime.volume;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.http.HttpRequest;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.Flow;

/**
 * The state of a file: a re-readable source of bytes, in the spirit of Guava's {@code ByteSource}
 * and of the JDK HTTP client's {@code BodyPublishers.ofInputStream(Supplier)}. Unlike an
 * {@link InputStream}, a content can be read more than once (for a hash, then for a write, then
 * for each subscriber), and it owns no resource until it is opened.
 *
 * Assigning a content does not move bytes. Bytes move when a consumer reads it: the commit of a
 * unit of work, the HTTP handler, a hash. So copying a file inside an overlay records a
 * reference, and an I/O failure surfaces at commit, inside the transaction, not at assignment.
 *
 * Consumers PUSH through {@link #writeTo(OutputStream)} whenever they can (an HTTP response, a
 * local file, a digest, an upload body), and PULL through {@link #openStream()} only when they
 * must have an input stream.
 */
public interface Content {

	/**
	 * Opens a new stream over the bytes. May be called repeatedly unless {@link #repeatable()} is
	 * false. The caller closes the stream.
	 */
	InputStream openStream() throws IOException;

	/**
	 * Writes the bytes to {@code out}, which the caller owns and closes. The default pulls and
	 * copies; a content produced by a writer overrides it to call the writer directly, with no
	 * pipe and no thread.
	 */
	default void writeTo(OutputStream out) throws IOException {
		try (InputStream in = openStream()) {
			in.transferTo(out);
		}
	}

	/**
	 * The length in bytes when known without reading: a backend's stat, a byte array. Empty for
	 * content produced by a writer.
	 */
	default OptionalLong length() {
		return OptionalLong.empty();
	}

	/**
	 * A content hash when known without reading, for example a Git blob id. Lets a Git volume
	 * reuse a blob instead of uploading it, and lets the reactive runner suppress no-op writes
	 * cheaply. Empty means "compute it by reading if you need it".
	 */
	default Optional<String> hash() {
		return Optional.empty();
	}

	/**
	 * False for a one-shot source (a stream handed over by a caller, a writer with side
	 * effects). Consumers that need to read twice buffer such content first.
	 */
	default boolean repeatable() {
		return true;
	}

	/**
	 * The bytes as a {@code Flow.Publisher<ByteBuffer>}, which is what the JDK HTTP client's
	 * {@code BodyPublishers.fromPublisher} accepts: uploads to the GitHub and GitLab backends need
	 * neither a pipe nor a buffer. The JDK's own {@code BodyPublishers.ofInputStream} is a
	 * publisher over a stream supplier, so the default is one line.
	 */
	default Flow.Publisher<ByteBuffer> publisher() {
		return HttpRequest.BodyPublishers.ofInputStream(() -> {
			try {
				return openStream();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		});
	}

	// --- Factories ---

	static Content empty() {
		return of(new byte[0]);
	}

	static Content of(byte[] bytes) {
		byte[] copy = bytes.clone();
		return new Content() {

			@Override
			public InputStream openStream() {
				return new ByteArrayInputStream(copy);
			}

			@Override
			public void writeTo(OutputStream out) throws IOException {
				out.write(copy);
			}

			@Override
			public OptionalLong length() {
				return OptionalLong.of(copy.length);
			}

		};
	}

	/**
	 * Text, encoded lazily: nothing is encoded until the content is read.
	 */
	static Content of(CharSequence text, Charset charset) {
		return ofWriter(out -> out.write(text.toString().getBytes(charset)));
	}

	/**
	 * Content from a stream supplier, called once per {@link #openStream()}.
	 */
	static Content of(IOSupplier<InputStream> supplier) {
		return supplier::get;
	}

	/**
	 * A one-shot content over a stream someone handed over. Not repeatable: a consumer that needs
	 * to read it twice buffers it first.
	 */
	static Content once(InputStream stream) {
		return new Content() {

			private boolean opened;

			@Override
			public synchronized InputStream openStream() throws IOException {
				if (opened) {
					throw new IOException("One-shot content has already been read");
				}
				opened = true;
				return stream;
			}

			@Override
			public boolean repeatable() {
				return false;
			}

		};
	}

	/**
	 * Content produced by a writer: a closure that receives an output stream. The writer runs
	 * when the content is read, never when it is assigned.
	 *
	 * <ul>
	 * <li>{@link #writeTo(OutputStream)} calls the writer directly on the consumer's stream.</li>
	 * <li>{@link #openStream()} returns a lazy pipe: the writer starts on a virtual thread at the
	 * first read, its failure is rethrown to the reader, and closing the reader early cancels
	 * it.</li>
	 * </ul>
	 *
	 * Each read runs the writer again, so the content is repeatable as long as the writer is
	 * (saving a resource, encoding text). Use {@link #ofWriter(IOConsumer, boolean)} to declare a
	 * one-shot writer.
	 */
	static Content ofWriter(IOConsumer<OutputStream> writer) {
		return new WriterContent(writer, true);
	}

	static Content ofWriter(IOConsumer<OutputStream> writer, boolean repeatable) {
		return new WriterContent(writer, repeatable);
	}

	@FunctionalInterface
	interface IOSupplier<T> {
		T get() throws IOException;
	}

	@FunctionalInterface
	interface IOConsumer<T> {
		void accept(T t) throws IOException;
	}

}
