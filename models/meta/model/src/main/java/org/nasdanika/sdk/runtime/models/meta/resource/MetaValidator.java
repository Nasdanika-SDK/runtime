package org.nasdanika.sdk.runtime.models.meta.resource;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.nasdanika.sdk.runtime.models.meta.Package;          // Shadows java.lang.Package in this file

/**
 * Validates the {@code .nmeta} files under a directory, as a vocabulary project's build does.
 *
 * <p>
 * The files are read twice. The first pass learns the namespace of each package, the second loads
 * them all in one resource set whose URI map points each namespace to its file, so that an import
 * of a package in the same directory resolves whichever file is read first, and a type it does not
 * have is an error.
 *
 * <p>
 * {@link Problem#toString()} is the format of compilers, {@code file:line:column: error: message},
 * which assistants read and VS Code's problem matchers parse.
 */
public final class MetaValidator {

	public enum Severity {
		ERROR,
		WARNING;

		@Override
		public String toString() {
			return name().toLowerCase();
		}
	}

	/**
	 * @param file The file, relative to the validated directory's base when it is under it
	 * @param line One-based, 0 when unknown
	 * @param column One-based, 0 when unknown
	 */
	public record Problem(Severity severity, String file, int line, int column, String message) {

		@Override
		public String toString() {
			return file + ":" + line + ":" + column + ": " + severity + ": " + message;
		}

	}

	private MetaValidator() {
	}

	/**
	 * @param directory Searched recursively for {@code .nmeta} files
	 * @param base Problem file names are relative to it, such as the project directory
	 * @return Problems, errors first, then by file and position
	 */
	public static List<Problem> validate(Path directory, Path base) {
		List<Path> files = files(directory);
		List<Problem> problems = new ArrayList<>();

		// Pass 1: the namespace of each file
		Map<String, Path> namespaces = new HashMap<>();
		for (Path file: files) {
			Resource resource = resourceSet().createResource(uri(file));
			try {
				resource.load(null);
			} catch (IOException e) {
				// Reported by pass 2
			}
			if (!resource.getContents().isEmpty() && resource.getContents().getFirst() instanceof Package pkg && pkg.getNamespace() != null) {
				Path previous = namespaces.putIfAbsent(pkg.getNamespace(), file);
				if (previous != null) {
					problems.add(new Problem(Severity.ERROR, name(file, base), 0, 0, "Namespace " + pkg.getNamespace() + " is also the namespace of " + name(previous, base)));
				}
			}
		}

		// Pass 2: all files in one resource set, namespaces mapped to files
		ResourceSet resourceSet = resourceSet();
		namespaces.forEach((namespace, file) -> resourceSet.getURIConverter().getURIMap().put(URI.createURI(namespace), uri(file)));
		for (Path file: files) {
			Resource resource;
			try {
				resource = resourceSet.getResource(uri(file), true);
			} catch (RuntimeException e) {
				// Loading failed with its first error; the resource has them all
				resource = resourceSet.getResource(uri(file), false);
			}
			if (resource == null) {
				problems.add(new Problem(Severity.ERROR, name(file, base), 0, 0, "Cannot be read"));
				continue;
			}
			for (Resource.Diagnostic error: resource.getErrors()) {
				problems.add(problem(Severity.ERROR, file, base, error));
			}
			for (Resource.Diagnostic warning: resource.getWarnings()) {
				problems.add(problem(Severity.WARNING, file, base, warning));
			}
		}

		problems.sort(Comparator
			.comparing(Problem::severity)
			.thenComparing(Problem::file)
			.thenComparingInt(Problem::line)
			.thenComparingInt(Problem::column));
		return problems;
	}

	/**
	 * One problem per line
	 */
	public static String format(List<Problem> problems) {
		return problems.stream().map(Problem::toString).collect(Collectors.joining(System.lineSeparator()));
	}

	public static boolean hasErrors(List<Problem> problems) {
		return problems.stream().anyMatch(problem -> problem.severity() == Severity.ERROR);
	}

	private static List<Path> files(Path directory) {
		if (!Files.isDirectory(directory)) {
			return List.of();
		}
		try (Stream<Path> paths = Files.walk(directory)) {
			return paths
				.filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith("." + MetaResource.EXTENSION))
				.sorted()
				.toList();
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	private static ResourceSet resourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(MetaResource.EXTENSION, new MetaResourceFactory(resourceSet));
		return resourceSet;
	}

	private static URI uri(Path file) {
		return URI.createFileURI(file.toAbsolutePath().normalize().toString());
	}

	private static String name(Path file, Path base) {
		Path absolute = file.toAbsolutePath().normalize();
		Path absoluteBase = base == null ? null : base.toAbsolutePath().normalize();
		Path name = absoluteBase != null && absolute.startsWith(absoluteBase) ? absoluteBase.relativize(absolute) : absolute;
		return name.toString().replace('\\', '/');
	}

	private static Problem problem(Severity severity, Path file, Path base, Resource.Diagnostic diagnostic) {
		return new Problem(severity, name(file, base), diagnostic.getLine(), diagnostic.getColumn(), diagnostic.getMessage());
	}

}
