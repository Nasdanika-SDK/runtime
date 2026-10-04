package org.nasdanika.sdk.runtime.models.file;

import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * A typed state of a file, the generalization of {@code IFile}'s get and set symmetry: a text file
 * has a {@code String}, a JSON file a parsed value, a model file a resource's contents. A view is
 * never a second state. It decodes the file's {@link org.nasdanika.sdk.runtime.volume.Content} on
 * {@link #get()} and assigns lazily encoded content on {@link #set(Object)}, so the bytes stay the
 * single source of truth and two views of one file cannot diverge.
 *
 * In the Xcore model, the common views are derived attributes ({@code TextFile.text}) implemented
 * by setting delegates over a codec. This interface is the Java form, for views a specialized file
 * type adds without a feature of its own.
 *
 * @param <S> the typed state
 */
public interface View<S> {

	S get();

	/** Assigns. Encoding and I/O happen when the content is read, inside the unit of work. */
	void set(S state);

	static <S> View<S> of(File file, Codec<S> codec) {
		return new View<>() {

			@Override
			public S get() {
				try {
					return codec.decode(file.getContent(), file);
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}

			@Override
			public void set(S state) {
				file.setContent(codec.encode(state, file));
			}

		};
	}

}
