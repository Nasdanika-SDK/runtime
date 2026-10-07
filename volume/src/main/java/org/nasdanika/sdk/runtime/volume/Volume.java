package org.nasdanika.sdk.runtime.volume;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface Volume extends GenericVolume<Content> {
	
	@Override
	Content content(String path);

	// --- Capabilities ---

	interface Writable extends GenericVolume.Writable<Content> {

		static Volume.Writable of(GenericVolume.Writable<Content> writable) {
			
			return new Volume.Writable() {
				
				@Override
				public void write(String path, Content content) throws IOException {
					writable.write(path, content);
				}

				@Override
				public void delete(String path) throws IOException {
					writable.delete(path);
				}

				@Override
				public void move(String from, String to) throws IOException {
					writable.move(from, to);
				}

				@Override
				public void createDirectory(String path) throws IOException {
					writable.createDirectory(path);
				}

				@Override
				public boolean atomicMove() {
					return writable.atomicMove();
				}
				
			};
			
		}
	}
	
	static Volume of(GenericVolume<Content> volume) {
			
		return new Volume() {
			
			@Override
			public Optional<Entry> stat(String path) {
				return volume.stat(path);
			}

			@Override
			public List<Entry> list(String directory) throws IOException {
				return volume.list(directory);
			}

			@Override
			public Content content(String path) {
				return volume.content(path);
			}

			@Override
			public boolean caseSensitive() {
				return volume.caseSensitive();
			}

			@SuppressWarnings("unchecked")
			@Override
			public <U> Optional<U> capability(Class<U> type) {
				return volume.capability(type).map(c -> {
					if (c instanceof GenericVolume.Writable writable) {
						return (U) Volume.Writable.of(writable);
					}
					return c;
				});
			}
			
		};
	}

}
