package org.nasdanika.sdk.runtime.volume;

import java.io.IOException;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Flow;

/**
 * The JDK-only backend SPI of the {@code volume} module: what implementers write (NIO,
 * memory, Git over REST, zip, the model volume). Everything else uses the file model on top of
 * it. The HTTP handler reads a volume directly, so serving a file never creates EObjects.
 *
 * Paths follow Go's {@code io/fs} rules: slash-separated, relative to the root, no leading or
 * trailing slash, no empty, "." or ".." segments; "." is the root. They are validated once, at the
 * boundary.
 *
 * Only the core is mandatory. Everything else is an optional capability, discovered through
 * {@link #capability(Class)}, so a read-only volume implements four methods.
 */
public interface Volume {

	/** Empty when nothing exists at the path. */
	Optional<Entry> stat(String path);

	/** The children of a directory, in a stable order. Blocking; fine on virtual threads. */
	List<Entry> list(String directory) throws IOException;

	/**
	 * The content at a path, lazily: no I/O happens until it is opened. Opening content at a path
	 * that does not exist throws {@code NoSuchFileException}.
	 */
	Content content(String path);

	/** Declared, because some clients (Windows Explorer over WebDAV, macOS by default) ignore case. */
	boolean caseSensitive();

	<T> Optional<T> capability(Class<T> type);

	/**
	 * @param size     -1 when unknown, and for directories
	 * @param hash     null when unknown; a content hash or a Git blob id. Load-bearing: no-op
	 *                 write suppression, ETags, incremental copy, blob caching
	 * @param modified null when unknown
	 */
	record Entry(String path, Kind kind, long size, String hash, Instant modified) {

		public enum Kind { FILE, DIRECTORY, LINK }

	}

	// --- Capabilities ---

	interface Writable {

		/** Assigns content. Bytes may move now or at commit, depending on the volume. */
		void write(String path, Content content) throws IOException;

		void delete(String path) throws IOException;

		/** Atomic where the backend supports it; {@link #atomicMove()} says which. */
		void move(String from, String to) throws IOException;

		void createDirectory(String path) throws IOException;

		boolean atomicMove();

	}

	/** How a backend reports changes underneath it. Not the API for watching a model. */
	interface Watchable {

		Flow.Publisher<ChangeBatch> changes();

	}

	interface Transactional {

		Transaction begin();

		interface Transaction extends AutoCloseable {

			void commit(String message) throws IOException;

			void rollback();

			/** Rolls back unless committed. */
			@Override
			void close();

		}

	}

	/** Pushed down to the backend where it can do better than a walk: a search API, an index. */
	interface Searchable {

		List<String> glob(String pattern) throws IOException;

		List<Match> grep(String regex, String glob) throws IOException;

		record Match(String path, int line, String text) {}

	}

	/** Non-containment references in the model volume are links. */
	interface Linked {

		String readLink(String path) throws IOException;

	}

	// --- Change reports ---

	record Change(Type type, String path, String previousPath) {

		public enum Type { CREATE, MODIFY, DELETE, MOVE, RESYNC }

	}

	/** RESYNC, alone in a batch, means "a subscriber fell behind: rescan from here". */
	record ChangeBatch(long sequence, List<Change> changes, String origin) {}

}
