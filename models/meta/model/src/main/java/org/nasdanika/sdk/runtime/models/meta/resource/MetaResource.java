package org.nasdanika.sdk.runtime.models.meta.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.sdk.runtime.common.telemetry.ResourceTelemetry;
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.Enum;             // Shadows java.lang.Enum in this file
import org.nasdanika.sdk.runtime.models.meta.EnumLiteral;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.Package;          // Shadows java.lang.Package in this file

/**
 * A Meta package in the text syntax, a {@code .nmeta} file, read with {@link MetaReader} and
 * written with {@link MetaWriter}. UTF-8.
 *
 * <p>
 * Loading records the problems the reader finds in {@link #getErrors()} and {@link #getWarnings()},
 * and fails with the first error, as EMF's XML resources do. The contents are kept unless the text
 * has syntax errors, so that a caller catching the exception still sees what could be read.
 *
 * <p>
 * Classifiers, their features and enum literals are addressed by name, {@code //Account} and
 * {@code //Account/balance}, so that references from other resources survive reordering. Other
 * elements are addressed by position.
 *
 * <p>
 * Load, save and unload run in {@link ResourceTelemetry} spans.
 */
public class MetaResource extends ResourceImpl {

	public static final String EXTENSION = "nmeta";

	public MetaResource(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		ResourceTelemetry.load(this, inputStream, in -> {
			MetaReader reader = new MetaReader(this);
			reader.read(new String(in.readAllBytes(), StandardCharsets.UTF_8));
			getWarnings().addAll(reader.getWarnings());
			getErrors().addAll(reader.getErrors());
			if (!reader.getErrors().isEmpty()) {
				throw new IOWrappedException(reader.getErrors().getFirst());
			}
		});
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		ResourceTelemetry.save(this, outputStream, out -> {
			if (getContents().size() != 1 || !(getContents().getFirst() instanceof Package pkg)) {
				throw new IOException("A Meta resource contains one package: " + getURI());
			}
			out.write(MetaWriter.write(pkg).getBytes(StandardCharsets.UTF_8));
		});
	}

	@Override
	protected void doUnload() {
		ResourceTelemetry.unload(this, super::doUnload);
	}

	@Override
	public String getURIFragment(EObject eObject) {
		String path = namePath(eObject);
		return path == null ? super.getURIFragment(eObject) : "//" + path;
	}

	private static String namePath(EObject eObject) {
		return switch (eObject) {
			case Classifier classifier when classifier.eContainer() instanceof Package && isName(classifier.getName()) -> classifier.getName();
			case Feature feature when feature.eContainer() != null && isName(feature.getName()) -> parentPath(feature.eContainer(), feature.getName());
			case EnumLiteral literal when literal.eContainer() != null && isName(literal.getName()) -> parentPath(literal.eContainer(), literal.getName());
			case null, default -> null;
		};
	}

	private static String parentPath(EObject parent, String name) {
		String parentPath = namePath(parent);
		return parentPath == null ? null : parentPath + "/" + name;
	}

	/**
	 * Names that cannot be taken for the segments of EMF's positional fragments, //@classifiers.0
	 */
	private static boolean isName(String name) {
		return name != null && !name.isEmpty() && !name.startsWith("@") && !name.contains("/");
	}

	@Override
	public EObject getEObject(String uriFragment) {
		if (uriFragment != null && uriFragment.startsWith("//") && !uriFragment.contains("@")) {
			String[] segments = uriFragment.substring(2).split("/");
			for (EObject root: getContents()) {
				if (root instanceof Package pkg) {
					EObject found = find(pkg, segments);
					if (found != null) {
						return found;
					}
				}
			}
		}
		return super.getEObject(uriFragment);
	}

	private static EObject find(Package pkg, String[] segments) {
		for (Classifier classifier: pkg.getClassifiers()) {
			if (segments[0].equals(classifier.getName())) {
				if (segments.length == 1) {
					return classifier;
				}
				if (segments.length == 2) {
					if (classifier instanceof org.nasdanika.sdk.runtime.models.meta.Class type) {
						return type.getFeatures().stream().filter(f -> segments[1].equals(f.getName())).findFirst().orElse(null);
					}
					if (classifier instanceof Enum enumeration) {
						return enumeration.getLiterals().stream().filter(l -> segments[1].equals(l.getName())).findFirst().orElse(null);
					}
				}
			}
		}
		return null;
	}

}
