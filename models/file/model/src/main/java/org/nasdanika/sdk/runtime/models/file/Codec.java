package org.nasdanika.sdk.runtime.models.file;

import java.io.IOException;

import org.nasdanika.sdk.runtime.volume.Content;

/**
 * Decodes a file's bytes into a typed state and encodes a typed state back into bytes. Bytes are
 * the single source of truth (Git, HTTP, hashes and every backend speak bytes); a codec is how a
 * typed state is derived from them and written back.
 *
 * Encoding is LAZY: {@link #encode(Object, File)} returns a {@link Content} that serializes when
 * it is read, typically through {@link Content#ofWriter(Content.IOConsumer)}. Setting a model view
 * therefore assigns {@code Content.ofWriter(resource::save)}, and nothing is serialized until a
 * commit, a hash or the HTTP handler reads it.
 *
 * @param <S> the typed state: {@code String} for text, a parsed JSON value, a resource's contents
 */
public interface Codec<S> {

	/**
	 * @param file supplies what decoding needs besides bytes: the charset, the line separator, the
	 *             URI for loading as a resource
	 */
	S decode(Content content, File file) throws IOException;

	/** Lazy: returns content that encodes when read. */
	Content encode(S state, File file);

}
