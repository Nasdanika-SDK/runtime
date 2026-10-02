package org.nasdanika.sdk.runtime.volume;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * How to use {@link Content}: a re-readable source of bytes that moves nothing until a consumer
 * reads it, pushed with {@link Content#writeTo(OutputStream)} or pulled with
 * {@link Content#openStream()}. Telemetry of the same operations is in {@link TestContentTelemetry}.
 */
class TestContent {

	private static byte[] read(Content content) throws IOException {
		try (InputStream in = content.openStream()) {
			return in.readAllBytes();
		}
	}

	private static byte[] push(Content content) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		content.writeTo(out);
		return out.toByteArray();
	}

	/**
	 * In-memory content: repeatable, with a known length.
	 */
	@Test
	void bytes() throws IOException {
		byte[] data = "hello".getBytes(StandardCharsets.UTF_8);
		Content content = Content.of(data);
		data[0] = 'j'; // the content holds a copy

		assertThat(content.length()).hasValue(5);
		assertThat(read(content)).asString(StandardCharsets.UTF_8).isEqualTo("hello");
		assertThat(read(content)).asString(StandardCharsets.UTF_8).isEqualTo("hello"); // read again
		assertThat(push(content)).asString(StandardCharsets.UTF_8).isEqualTo("hello");
		assertThat(Content.empty().length()).hasValue(0);
	}

	/**
	 * Text is encoded when read, not when the content is created; its length is unknown until then.
	 */
	@Test
	void text() throws IOException {
		Content content = Content.of("Привет, мир", StandardCharsets.UTF_8);
		assertThat(content.length()).isEmpty();
		assertThat(new String(read(content), StandardCharsets.UTF_8)).isEqualTo("Привет, мир");
	}

	/**
	 * A writer runs on every read and never on creation. Pushing runs it on the consumer's stream,
	 * which it may close without closing the consumer's.
	 */
	@Test
	void writerPush() throws IOException {
		AtomicInteger runs = new AtomicInteger();
		Content content = Content.ofWriter(out -> {
			runs.incrementAndGet();
			out.write("pushed".getBytes(StandardCharsets.UTF_8));
			out.close(); // only flushes the consumer's stream
		});
		assertThat(runs).hasValue(0);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		content.writeTo(out);
		out.write('!'); // still open
		assertThat(out.toString(StandardCharsets.UTF_8)).isEqualTo("pushed!");
		assertThat(push(content)).asString(StandardCharsets.UTF_8).isEqualTo("pushed");
		assertThat(runs).hasValue(2);
	}

	/**
	 * Pulling a writer's content is a pipe: the writer starts on a virtual thread at the first read,
	 * and memory stays bounded however much it writes.
	 */
	@Test
	void writerPull() throws IOException {
		AtomicInteger runs = new AtomicInteger();
		int size = 1 << 20;
		Content content = Content.ofWriter(out -> {
			runs.incrementAndGet();
			for (int i = 0; i < size; ++i) {
				out.write(i % 251);
			}
		});

		try (InputStream in = content.openStream()) {
			assertThat(runs).hasValue(0); // opened, not read yet
			byte[] bytes = in.readAllBytes();
			assertThat(bytes).hasSize(size);
			assertThat(bytes[1000] & 0xFF).isEqualTo(1000 % 251);
		}
		assertThat(runs).hasValue(1);
	}

	/**
	 * A writer's failure on its own thread reaches the reader.
	 */
	@Test
	void writerFailure() {
		Content content = Content.ofWriter(out -> {
			out.write(new byte[100]);
			throw new IOException("Disk on fire");
		});
		assertThatThrownBy(() -> read(content)).isInstanceOf(IOException.class).hasMessage("Disk on fire");
		assertThatThrownBy(() -> push(content)).isInstanceOf(IOException.class).hasMessage("Disk on fire");
	}

	/**
	 * Closing the reader early cancels the writer: its next write throws.
	 */
	@Test
	void earlyCloseCancelsTheWriter() throws Exception {
		CompletableFuture<Throwable> writerOutcome = new CompletableFuture<>();
		Content content = Content.ofWriter(out -> {
			try {
				byte[] chunk = new byte[8192];
				while (true) {
					out.write(chunk); // endless, bounded by the pipe
				}
			} catch (IOException e) {
				writerOutcome.complete(e);
				throw e;
			}
		});
		try (InputStream in = content.openStream()) {
			assertThat(in.readNBytes(10_000)).hasSize(10_000);
		}
		assertThat(writerOutcome.get(10, TimeUnit.SECONDS)).isInstanceOf(IOException.class);
	}

	/**
	 * A stream someone handed over can be read once.
	 */
	@Test
	void once() throws IOException {
		Content content = Content.once(new java.io.ByteArrayInputStream(new byte[] { 1, 2, 3 }));
		assertThat(content.repeatable()).isFalse();
		assertThat(read(content)).containsExactly(1, 2, 3);
		assertThatThrownBy(() -> read(content)).isInstanceOf(IOException.class);
	}

	/**
	 * Content at a URI is read on every open. A missing file is a {@link NoSuchFileException}, as
	 * for a missing path in a volume. HTTP URIs are covered in the telemetry tests module, which
	 * runs a server.
	 */
	@Test
	void uri(@TempDir Path dir) throws IOException {
		Path file = dir.resolve("data.txt");
		Files.writeString(file, "on disk");
		Content content = Content.of(file.toUri());
		assertThat(read(content)).asString(StandardCharsets.UTF_8).isEqualTo("on disk");
		Files.writeString(file, "changed");
		assertThat(push(content)).asString(StandardCharsets.UTF_8).isEqualTo("changed"); // not cached

		assertThatThrownBy(() -> read(Content.of(dir.resolve("missing.txt").toUri()))).isInstanceOf(NoSuchFileException.class);
	}

	/**
	 * The bytes as a {@code Flow.Publisher<ByteBuffer>}, what the JDK HTTP client takes as a request
	 * body.
	 */
	@Test
	void publisher() throws InterruptedException {
		Content content = Content.of("published", StandardCharsets.UTF_8);
		ByteArrayOutputStream collected = new ByteArrayOutputStream();
		CountDownLatch done = new CountDownLatch(1);
		List<Throwable> errors = new ArrayList<>();
		content.publisher().subscribe(new Flow.Subscriber<ByteBuffer>() {

			@Override
			public void onSubscribe(Flow.Subscription subscription) {
				subscription.request(Long.MAX_VALUE);
			}

			@Override
			public void onNext(ByteBuffer item) {
				byte[] bytes = new byte[item.remaining()];
				item.get(bytes);
				collected.writeBytes(bytes);
			}

			@Override
			public void onError(Throwable throwable) {
				errors.add(throwable);
				done.countDown();
			}

			@Override
			public void onComplete() {
				done.countDown();
			}

		});
		assertThat(done.await(10, TimeUnit.SECONDS)).isTrue();
		assertThat(errors).isEmpty();
		assertThat(collected.toString(StandardCharsets.UTF_8)).isEqualTo("published");
	}

}
