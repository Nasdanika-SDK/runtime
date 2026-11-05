package org.nasdanika.sdk.runtime.models.meta.resource;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.Class;            // Shadows java.lang.Class in this file
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.DataType;
import org.nasdanika.sdk.runtime.models.meta.Enum;             // Shadows java.lang.Enum in this file
import org.nasdanika.sdk.runtime.models.meta.EnumLiteral;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.ModelElement;
import org.nasdanika.sdk.runtime.models.meta.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Operation;
import org.nasdanika.sdk.runtime.models.meta.Package;          // Shadows java.lang.Package in this file
import org.nasdanika.sdk.runtime.models.meta.Parameter;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;
import org.nasdanika.sdk.runtime.models.meta.TypedElement;
import org.nasdanika.sdk.runtime.models.meta.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference;

/**
 * Writes a {@link Package} as a Markdown glossary for the people who own its words: a section per
 * class, data type and enumeration, with its definition, and for a class a table of its terms.
 *
 * <p>
 * The rules that the text syntax keeps in the structure are stated in plain words, in the table's
 * Rule column, so that someone who does not read the notation can check them: {@code [+]} is "at
 * least one", {@code contains} is "part of it". Types are in plain words too, and a class from
 * another package says so. Annotations and facets are left out.
 */
public final class MetaGlossary {

	private static final String NOT_DEFINED = "_Not defined yet._";

	private MetaGlossary() {
	}

	/**
	 * Writes a glossary for each {@code .nmeta} file under a directory, read together as
	 * {@link MetaValidator} reads them, so that imports among them resolve. Validate first: a file
	 * with an error fails here with that error.
	 *
	 * @param directory Searched recursively for {@code .nmeta} files
	 * @param output Where to write {@code name.md} for {@code name.nmeta}, in the same relative
	 *        directory, created if needed
	 * @return The files written
	 */
	public static List<Path> generate(Path directory, Path output) {
		List<Path> files = MetaValidator.files(directory);
		ResourceSet resourceSet = MetaValidator.readTogether(files, (file, previous, namespace) -> { });
		List<Path> written = new ArrayList<>();
		try {
			for (Path file: files) {
				Package pkg = (Package) resourceSet.getResource(MetaValidator.uri(file), true).getContents().getFirst();
				Path relative = directory.relativize(file);
				String fileName = relative.getFileName().toString();
				String baseName = fileName.substring(0, fileName.length() - MetaResource.EXTENSION.length() - 1);
				Path target = output.resolve(relative).resolveSibling(baseName + ".md");
				Files.createDirectories(target.getParent());
				Files.writeString(target, "<!-- Generated from " + fileName + ". Change that file, not this one. -->\n\n" + write(pkg));
				written.add(target);
			}
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
		return written;
	}

	/**
	 * @return The glossary of a package, as Markdown
	 */
	public static String write(Package pkg) {
		StringBuilder out = new StringBuilder("# ").append(pkg.getName()).append("\n\n");
		if (pkg.getVersion() != null) {
			out.append("Version ").append(pkg.getVersion()).append(".\n\n");
		}
		out.append(definition(pkg)).append("\n");
		for (Classifier classifier: pkg.getClassifiers()) {
			out.append("\n## ").append(classifier.getName()).append("\n\n").append(definition(classifier)).append("\n");
			switch (classifier) {
				case Class type -> writeClass(type, pkg, out);
				case DataType dataType -> {
					if (dataType.getRepresentation() != null) {
						out.append("\nWritten as ").append(primitive(dataType.getRepresentation())).append(".\n");
					}
				}
				case Enum enumeration -> writeEnum(enumeration, out);
				default -> { }
			}
		}
		return out.toString();
	}

	private static void writeClass(Class type, Package pkg, StringBuilder out) {
		if (type.isAbstract() || !type.getSuperTypes().isEmpty()) {
			out.append("\n");
			if (!type.getSuperTypes().isEmpty()) {
				out.append("A kind of ").append(type.getSuperTypes().stream().map(superType -> type(superType, pkg)).collect(Collectors.joining(" and "))).append(".");
				out.append(type.isAbstract() ? " " : "\n");
			}
			if (type.isAbstract()) {
				out.append("Exists only as one of its kinds.\n");
			}
		}
		if (!type.getFeatures().isEmpty()) {
			out.append("\n| Term | Type | Rule | Meaning |\n|---|---|---|---|\n");
			for (Feature feature: type.getFeatures()) {
				out.append("| ").append(feature.getName())
					.append(" | ").append(type(feature.getType(), pkg))
					.append(" | ").append(cell(rule(feature)))
					.append(" | ").append(cell(definition(feature)))
					.append(" |\n");
			}
		}
		if (!type.getOperations().isEmpty()) {
			out.append("\nWhat it can do:\n\n");
			for (Operation operation: type.getOperations()) {
				out.append("- **").append(operation.getName()).append("**(")
					.append(operation.getParameters().stream().map(Parameter::getName).collect(Collectors.joining(", ")))
					.append("): ").append(definition(operation).replaceAll("\\s*\\R\\s*", " "))
					.append("\n");
			}
		}
	}

	private static void writeEnum(Enum enumeration, StringBuilder out) {
		out.append("\nOne of:\n\n");
		for (EnumLiteral literal: enumeration.getLiterals()) {
			out.append("- **").append(literal.getName()).append("**");
			if (hasDefinition(literal)) {
				out.append(": ").append(literal.getDocumentation().strip().replaceAll("\\s*\\R\\s*", " "));
			}
			out.append("\n");
		}
	}

	/**
	 * What the structure says about a feature, in the words a business reader would use.
	 */
	private static String rule(Feature feature) {
		List<String> rules = new ArrayList<>();
		String howMany = howMany(feature);
		if (!feature.isDerived() || !"optional".equals(howMany)) { // Nobody supplies a computed value
			rules.add(howMany);
		}
		if (feature instanceof Attribute attribute && attribute.isIdentifying()) {
			rules.add("identifies it");
		}
		if (feature instanceof Reference reference) {
			if (reference.isContainment()) {
				rules.add("part of it");
			}
			if (reference.getOpposite() != null && reference.getOpposite().eContainer() instanceof Class owner) {
				rules.add("the other side of " + owner.getName() + "." + reference.getOpposite().getName());
			}
		}
		if (feature.isDerived()) {
			rules.add("computed");
		} else if (feature.isReadonly()) {
			rules.add("read-only");
		}
		if (feature.getDefaultValue() != null) {
			rules.add(feature.getDefaultValue() + " by default");
		}
		return String.join(", ", rules);
	}

	private static String howMany(TypedElement element) {
		int lower = element.getLowerBound();
		int upper = element.getUpperBound();
		if (upper == -1) {
			return switch (lower) {
				case 0 -> "any number";
				case 1 -> "at least one";
				default -> "at least " + lower;
			};
		}
		if (lower == upper) {
			return lower == 1 ? "required" : "exactly " + lower;
		}
		if (lower == 0) {
			return upper == 1 ? "optional" : "up to " + upper;
		}
		return lower + " to " + upper;
	}

	private static String type(TypeReference type, Package pkg) {
		return switch (type) {
			case null -> "anything";
			case PrimitiveTypeReference primitive -> primitive(primitive.getKind());
			case ClassifierReference reference -> classifier(reference, pkg);
			case TypeParameterReference reference -> reference.getTarget() == null ? reference.getParameterName() : reference.getTarget().getName();
			case UnionTypeReference union -> union.getTypes().stream().map(member -> type(member, pkg)).collect(Collectors.joining(" or "));
			case IntersectionTypeReference intersection -> intersection.getTypes().stream().map(member -> type(member, pkg)).collect(Collectors.joining(" and "));
			case WildcardTypeReference wildcard -> wildcard.getUpperBound() != null ? type(wildcard.getUpperBound(), pkg) : "anything";
			case OpaqueTypeReference opaque -> "`" + cell(opaque.getText()) + "`";
			default -> "anything";
		};
	}

	private static String classifier(ClassifierReference reference, Package pkg) {
		StringBuilder name = new StringBuilder(reference.getTarget() == null ? reference.getClassifierName() : reference.getTarget().getName());
		if (!reference.getTypeArguments().isEmpty()) {
			name.append(" of ").append(reference.getTypeArguments().stream().map(argument -> type(argument, pkg)).collect(Collectors.joining(" and ")));
		}
		if (reference.getTarget() != null && reference.getTarget().eContainer() instanceof Package target) {
			if (target != pkg) {
				name.append(" (from ").append(target.getName()).append(")");
			}
		} else if (reference.getNamespace() != null && !reference.getNamespace().equals(pkg.getNamespace())) {
			name.append(" (from ").append(reference.getNamespace()).append(")");
		}
		return name.toString();
	}

	private static String primitive(PrimitiveKind kind) {
		return switch (kind) {
			case STRING -> "text";
			case NUMBER -> "number";
			case BOOLEAN -> "yes or no";
			case BIGINT -> "whole number";
			case DATE -> "date";
			case TIME -> "time";
			case DATE_TIME -> "date and time";
			case DURATION -> "duration";
			case BINARY -> "binary data";
			case ANY -> "anything";
			case NULL, VOID -> "nothing";
		};
	}

	private static boolean hasDefinition(ModelElement element) {
		return element.getDocumentation() != null && !element.getDocumentation().isBlank();
	}

	private static String definition(ModelElement element) {
		return hasDefinition(element) ? element.getDocumentation().strip() : NOT_DEFINED;
	}

	/**
	 * On one line, with what would end the cell escaped. A definition is Markdown, and stays so.
	 */
	private static String cell(String text) {
		return text.replaceAll("\\s*\\R\\s*", " ").replace("|", "\\|");
	}

}
