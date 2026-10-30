package org.nasdanika.sdk.runtime.models.meta.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.sdk.runtime.models.meta.Annotation;
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
import org.nasdanika.sdk.runtime.models.meta.TypeParameter;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;
import org.nasdanika.sdk.runtime.models.meta.TypedElement;
import org.nasdanika.sdk.runtime.models.meta.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference;

/**
 * Writes a {@link Package} in the text syntax that {@link MetaReader} reads, so that a vocabulary
 * built in code, or loaded from any other format, can be reviewed and edited as text.
 *
 * <p>
 * The text is canonical rather than a copy of what was read: comments other than documentation
 * and the layout of the source are not kept, imports and annotation aliases are derived from the
 * namespaces and sources the package uses, and every annotation is written with an alias. Reading
 * what was written and writing it again gives the same text.
 */
public class MetaWriter {

	private static final String INDENT = "    ";

	/** Keywords that are not accepted as names of features, operations, parameters, literals and aliases. */
	private static final Set<String> RESERVED = Set.of(
			"package", "import", "annotation", "abstract", "class", "extends", "enum", "op",
			"contains", "refers", "true", "false");

	/** Keywords that are accepted as names, but not as type names. */
	private static final Set<String> NAME_KEYWORDS = Set.of(
			"namespace", "prefix", "version", "as", "wraps", "throws", "opposite", "keys", "super",
			"derived", "readonly", "unordered", "unique", "id", "type",
			"string", "number", "boolean", "bigint", "date", "time", "dateTime", "duration", "binary",
			"any", "null", "void");

	private static final Pattern IDENTIFIER = Pattern.compile("[\\p{L}_$][\\p{L}\\p{N}_$]*");
	private static final Pattern NUMBER = Pattern.compile("-?[0-9]+(\\.[0-9]+)?([eE][+-]?[0-9]+)?");
	private static final Pattern SOURCE_TYPE = Pattern.compile("[\\p{L}_$][\\p{L}\\p{N}_$]*(\\.[\\p{L}_$][\\p{L}\\p{N}_$]*)*(\\[\\])*");

	private final Package pkg;
	private final StringBuilder out = new StringBuilder();
	private final Map<String, String> namespaceAliases = new LinkedHashMap<>();
	private final Map<String, String> sourceAliases = new LinkedHashMap<>();

	private MetaWriter(Package pkg) {
		this.pkg = pkg;
	}

	public static String write(Package pkg) {
		if (pkg.getName() == null || pkg.getName().isBlank()) {
			throw new IllegalArgumentException("A package needs a name to be written");
		}
		MetaWriter writer = new MetaWriter(pkg);
		writer.collectAliases();
		writer.writePackage();
		return writer.out.toString();
	}

	// --- Aliases ---

	private void collectAliases() {
		TreeIterator<EObject> contents = pkg.eAllContents();
		while (contents.hasNext()) {
			switch (contents.next()) {
				case ClassifierReference reference -> {
					String namespace = namespace(reference);
					if (namespace != null && !namespace.equals(pkg.getNamespace())) {
						String prefix = reference.getTarget() != null && reference.getTarget().eContainer() instanceof Package target ? target.getPrefix() : null;
						alias(namespaceAliases, namespace, prefix == null ? lastSegment(namespace) : prefix, false);
					}
				}
				case Annotation annotation when annotation.getSource() != null && !MetaReader.LIST.equals(annotation.getSource()) -> {
					if (annotation.eContainer() instanceof Annotation || isFacet(annotation)) {
						String namespace = annotation.getSource().substring(0, annotation.getSource().lastIndexOf('#'));
						if (!namespace.isEmpty() && !namespace.equals(pkg.getNamespace())) {
							alias(namespaceAliases, namespace, lastSegment(namespace), false);
						}
					} else {
						alias(sourceAliases, annotation.getSource(), lastSegment(annotation.getSource()), true);
					}
				}
				default -> { }
			}
		}
	}

	private static void alias(Map<String, String> aliases, String uri, String suggestion, boolean capitalize) {
		if (aliases.containsKey(uri)) {
			return;
		}
		String alias = suggestion.replaceAll("[^\\p{L}\\p{N}_$]", "");
		if (alias.isEmpty() || !IDENTIFIER.matcher(alias).matches()) {
			alias = "_" + alias;
		}
		if (capitalize) {
			alias = Character.toUpperCase(alias.charAt(0)) + alias.substring(1);
		}
		String candidate = alias;
		for (int i = 2; aliases.containsValue(candidate) || RESERVED.contains(candidate) || NAME_KEYWORDS.contains(candidate); ++i) {
			candidate = alias + i;
		}
		aliases.put(uri, candidate);
	}

	private static String lastSegment(String uri) {
		String[] segments = uri.split("[/#:.]");
		for (int i = segments.length - 1; i >= 0; --i) {
			if (!segments[i].isBlank()) {
				return segments[i];
			}
		}
		return "ns";
	}

	private static String namespace(ClassifierReference reference) {
		if (reference.getTarget() != null && reference.getTarget().eContainer() instanceof Package target) {
			return target.getNamespace();
		}
		return reference.getNamespace();
	}

	/**
	 * A facet on an element, as {@link MetaReader} records it: named after its type, whose URI is the source.
	 */
	private static boolean isFacet(Annotation annotation) {
		return !(annotation.eContainer() instanceof Annotation)
				&& annotation.getName() != null
				&& annotation.getSource() != null
				&& annotation.getSource().endsWith("#" + annotation.getName());
	}

	// --- Structure ---

	private void writePackage() {
		documentation(pkg, "");
		annotations(pkg, "", true);
		out.append("package ").append(List.of(pkg.getName().split("\\.")).stream().map(MetaWriter::name).collect(Collectors.joining(".")));
		if (pkg.getNamespace() != null) {
			out.append(" namespace ").append(string(pkg.getNamespace()));
		}
		if (pkg.getPrefix() != null) {
			out.append(" prefix ").append(string(pkg.getPrefix()));
		}
		if (pkg.getVersion() != null) {
			out.append(" version ").append(string(pkg.getVersion()));
		}
		out.append("\n");

		if (!namespaceAliases.isEmpty() || !sourceAliases.isEmpty()) {
			out.append("\n");
		}
		namespaceAliases.forEach((namespace, alias) -> out.append("import ").append(string(namespace)).append(" as ").append(typeName(alias)).append("\n"));
		sourceAliases.forEach((source, alias) -> out.append("annotation ").append(string(source)).append(" as ").append(name(alias)).append("\n"));

		for (Classifier classifier: pkg.getClassifiers()) {
			out.append("\n");
			documentation(classifier, "");
			annotations(classifier, "", true);
			switch (classifier) {
				case Class type -> writeClass(type);
				case DataType dataType -> writeDataType(dataType);
				case Enum enumeration -> writeEnum(enumeration);
				default -> throw new IllegalArgumentException("Unsupported classifier: " + classifier);
			}
		}
	}

	private void writeClass(Class type) {
		if (type.isAbstract()) {
			out.append("abstract ");
		}
		out.append("class ").append(typeName(type.getName())).append(typeParameters(type.getTypeParameters()));
		if (!type.getSuperTypes().isEmpty()) {
			out.append(" extends ").append(type.getSuperTypes().stream().map(this::type).collect(Collectors.joining(", ")));
		}
		List<ModelElement> members = new ArrayList<>(type.getFeatures());
		members.addAll(type.getOperations());
		if (members.isEmpty()) {
			out.append(" {}\n");
			return;
		}
		out.append(" {\n");
		for (int i = 0; i < members.size(); ++i) {
			ModelElement member = members.get(i);
			if (i > 0 && (hasDocumentation(member) || !member.getAnnotations().isEmpty())) {
				out.append("\n");
			}
			documentation(member, INDENT);
			annotations(member, INDENT, true);
			out.append(INDENT);
			switch (member) {
				case Feature feature -> writeFeature(feature);
				case Operation operation -> writeOperation(operation);
				default -> throw new IllegalArgumentException("Unsupported member: " + member);
			}
			out.append("\n");
		}
		out.append("}\n");
	}

	private void writeFeature(Feature feature) {
		if (feature.isDerived()) {
			out.append("derived ");
		}
		if (feature.isReadonly()) {
			out.append("readonly ");
		}
		if (!feature.isOrdered()) {
			out.append("unordered ");
		}
		if (feature.isUnique()) {
			out.append("unique ");
		}
		if (feature instanceof Attribute attribute && attribute.isIdentifying()) {
			out.append("id ");
		}
		if (feature instanceof Reference reference) {
			out.append(reference.isContainment() ? "contains " : "refers ");
		}
		out.append(type(feature.getType(), "any")).append(multiplicity(feature)).append(' ').append(name(feature.getName()));
		if (feature instanceof Reference reference) {
			if (reference.getOpposite() != null) {
				out.append(" opposite ").append(name(reference.getOpposite().getName()));
			}
			if (!reference.getKeys().isEmpty()) {
				out.append(" keys ").append(reference.getKeys().stream().map(key -> name(key.getName())).collect(Collectors.joining(", ")));
			}
		}
		if (feature.getDefaultValue() != null) {
			out.append(" = ").append(literal(feature.getDefaultValue()));
		}
	}

	private void writeOperation(Operation operation) {
		out.append("op ");
		if (!operation.getTypeParameters().isEmpty()) {
			out.append(typeParameters(operation.getTypeParameters())).append(' ');
		}
		out.append(type(operation.getType(), "void")).append(multiplicity(operation)).append(' ').append(name(operation.getName())).append('(');
		List<String> parameters = new ArrayList<>();
		for (Parameter parameter: operation.getParameters()) {
			StringBuilder text = new StringBuilder(inlineAnnotations(parameter));
			if (!parameter.isOrdered()) {
				text.append("unordered ");
			}
			if (parameter.isUnique()) {
				text.append("unique ");
			}
			text.append(type(parameter.getType(), "any")).append(multiplicity(parameter));
			if (parameter.isVariadic()) {
				text.append("...");
			}
			text.append(' ').append(name(parameter.getName()));
			if (parameter.getDefaultValue() != null) {
				text.append(" = ").append(literal(parameter.getDefaultValue()));
			}
			parameters.add(text.toString());
		}
		out.append(String.join(", ", parameters)).append(')');
		if (!operation.getExceptions().isEmpty()) {
			out.append(" throws ").append(operation.getExceptions().stream().map(this::type).collect(Collectors.joining(", ")));
		}
	}

	private void writeDataType(DataType dataType) {
		out.append("type ").append(typeName(dataType.getName())).append(typeParameters(dataType.getTypeParameters()));
		if (dataType.getRepresentation() != null) {
			out.append(" as ").append(primitive(dataType.getRepresentation()));
		}
		if (dataType.getSourceType() != null) {
			String sourceType = dataType.getSourceType();
			boolean plain = SOURCE_TYPE.matcher(sourceType).matches()
					&& List.of(sourceType.replace("[]", "").split("\\.")).stream().noneMatch(RESERVED::contains);
			out.append(" wraps ").append(plain ? sourceType : string(sourceType));
		}
		out.append("\n");
	}

	private void writeEnum(Enum enumeration) {
		out.append("enum ").append(typeName(enumeration.getName()));
		if (enumeration.getLiterals().isEmpty()) {
			out.append(" {}\n");
			return;
		}
		out.append(" {\n");
		int ordinal = 0;
		for (int i = 0; i < enumeration.getLiterals().size(); ++i) {
			EnumLiteral literal = enumeration.getLiterals().get(i);
			documentation(literal, INDENT);
			out.append(INDENT).append(inlineAnnotations(literal)).append(name(literal.getName()));
			if (literal.getValue() != null) {
				out.append(" as ").append(string(literal.getValue()));
			}
			if (literal.getOrdinal() != ordinal) {
				out.append(" = ").append(literal.getOrdinal()); // Unless one more than the previous literal's
			}
			ordinal = literal.getOrdinal() + 1;
			out.append(i < enumeration.getLiterals().size() - 1 ? ",\n" : "\n");
		}
		out.append("}\n");
	}

	// --- Types ---

	private String typeParameters(List<TypeParameter> typeParameters) {
		if (typeParameters.isEmpty()) {
			return "";
		}
		return typeParameters.stream().map(typeParameter -> {
			StringBuilder text = new StringBuilder(inlineAnnotations(typeParameter)).append(typeName(typeParameter.getName()));
			if (typeParameter.getBound() != null) {
				text.append(" extends ").append(type(typeParameter.getBound()));
			}
			if (typeParameter.getDefault() != null) {
				text.append(" = ").append(type(typeParameter.getDefault()));
			}
			return text.toString();
		}).collect(Collectors.joining(", ", "<", ">"));
	}

	private String type(TypeReference type, String ifNull) {
		return type == null ? ifNull : type(type);
	}

	private String type(TypeReference type) {
		return switch (type) {
			case PrimitiveTypeReference primitive -> primitive(primitive.getKind());
			case ClassifierReference reference -> classifierName(reference) + typeArguments(reference.getTypeArguments());
			case TypeParameterReference reference -> typeName(reference.getTarget() == null ? reference.getParameterName() : reference.getTarget().getName());
			case UnionTypeReference union -> union.getTypes().stream()
					.map(member -> member instanceof UnionTypeReference ? "(" + type(member) + ")" : type(member))
					.collect(Collectors.joining(" | "));
			case IntersectionTypeReference intersection -> intersection.getTypes().stream()
					.map(member -> member instanceof UnionTypeReference || member instanceof IntersectionTypeReference ? "(" + type(member) + ")" : type(member))
					.collect(Collectors.joining(" & "));
			case WildcardTypeReference wildcard -> wildcard.getUpperBound() != null
					? "? extends " + type(wildcard.getUpperBound())
					: wildcard.getLowerBound() != null ? "? super " + type(wildcard.getLowerBound()) : "?";
			case OpaqueTypeReference opaque -> "`" + opaque.getText() + "`";
			default -> throw new IllegalArgumentException("Unsupported type reference: " + type);
		};
	}

	private String classifierName(ClassifierReference reference) {
		String name = typeName(reference.getTarget() == null ? reference.getClassifierName() : reference.getTarget().getName());
		String namespace = namespace(reference);
		return namespace == null || namespace.equals(pkg.getNamespace()) ? name : typeName(namespaceAliases.get(namespace)) + "." + name;
	}

	private String typeArguments(List<TypeReference> typeArguments) {
		return typeArguments.isEmpty() ? "" : typeArguments.stream().map(this::type).collect(Collectors.joining(", ", "<", ">"));
	}

	private static String primitive(PrimitiveKind kind) {
		return kind == PrimitiveKind.DATE_TIME ? "dateTime" : kind.getLiteral().toLowerCase();
	}

	private static String multiplicity(TypedElement typedElement) {
		int lower = typedElement.getLowerBound();
		int upper = typedElement.getUpperBound();
		if (lower == 0 && upper == 1) {
			return "";
		}
		if (upper == -1) {
			return switch (lower) {
				case 0 -> "[*]";
				case 1 -> "[+]";
				default -> "[" + lower + "..*]";
			};
		}
		return lower == upper ? "[" + lower + "]" : "[" + lower + ".." + upper + "]";
	}

	// --- Annotations and facets ---

	private void annotations(ModelElement element, String indent, boolean lines) {
		for (Annotation annotation: element.getAnnotations()) {
			out.append(indent).append(annotation(annotation, indent)).append(lines ? "\n" : " ");
		}
	}

	private String inlineAnnotations(ModelElement element) {
		return element.getAnnotations().stream().map(annotation -> annotation(annotation, "") + " ").collect(Collectors.joining());
	}

	private String annotation(Annotation annotation, String indent) {
		if (isFacet(annotation)) {
			return "@" + facetTypeName(annotation.getSource()) + " " + object(annotation, indent);
		}
		String text = "@" + (annotation.getSource() == null ? string("") : name(sourceAliases.get(annotation.getSource())));
		if (annotation.getDetails().isEmpty()) {
			return text;
		}
		return annotation.getDetails().stream()
			.map(detail -> key(detail.getKey()) + " = " + string(detail.getValue() == null ? "" : detail.getValue()))
			.collect(Collectors.joining(", ", text + "(", ")"));
	}

	private String facetTypeName(String typeURI) {
		int hash = typeURI.lastIndexOf('#');
		String namespace = typeURI.substring(0, hash);
		String name = typeName(typeURI.substring(hash + 1));
		return namespace.isEmpty() || namespace.equals(pkg.getNamespace()) ? name : typeName(namespaceAliases.get(namespace)) + "." + name;
	}

	/**
	 * Properties on one line when they fit and are all scalars, otherwise one per line.
	 */
	private String object(Annotation object, String indent) {
		List<String> properties = new ArrayList<>();
		for (Map.Entry<String, String> detail: object.getDetails()) {
			properties.add(key(detail.getKey()) + ": " + value(detail.getValue()));
		}
		for (Annotation nested: object.getAnnotations()) {
			properties.add(key(nested.getName()) + ": " + nestedValue(nested, indent + INDENT));
		}
		return block("{", properties, "}", indent);
	}

	private String nestedValue(Annotation nested, String indent) {
		if (!MetaReader.LIST.equals(nested.getSource())) {
			return nested.getSource() == null ? object(nested, indent) : facetTypeName(nested.getSource()) + " " + object(nested, indent);
		}
		Map<Integer, String> items = new TreeMap<>();
		for (Map.Entry<String, String> detail: nested.getDetails()) {
			items.put(Integer.valueOf(detail.getKey()), value(detail.getValue()));
		}
		for (Annotation item: nested.getAnnotations()) {
			items.put(Integer.valueOf(item.getName()), nestedValue(item, indent + INDENT));
		}
		return block("[", items.values(), "]", indent);
	}

	private static String block(String open, Collection<String> items, String close, String indent) {
		String inline = String.join(", ", items);
		if (items.isEmpty()) {
			return open + close;
		}
		if (inline.length() <= 80 && !inline.contains("\n") && !inline.contains("{")) {
			return open + " " + inline + " " + close;
		}
		return items.stream().map(item -> indent + INDENT + item).collect(Collectors.joining("\n", open + "\n", "\n" + indent + close));
	}

	private static String value(String value) {
		return value == null ? "null" : literal(value);
	}

	// --- Names and literals ---

	/**
	 * A name, escaped with ^ when it is a keyword where names are expected.
	 */
	private static String name(String name) {
		return RESERVED.contains(name) ? "^" + name : name;
	}

	private static String typeName(String name) {
		return RESERVED.contains(name) || NAME_KEYWORDS.contains(name) ? "^" + name : name;
	}

	/**
	 * A property or detail key: a name, or a string when it is not an identifier.
	 */
	private static String key(String key) {
		return IDENTIFIER.matcher(key).matches() ? name(key) : string(key);
	}

	/**
	 * Numbers and booleans as they are, anything else as a string.
	 */
	private static String literal(String value) {
		return NUMBER.matcher(value).matches() || "true".equals(value) || "false".equals(value) ? value : string(value);
	}

	private static String string(String value) {
		StringBuilder result = new StringBuilder("\"");
		for (char c: value.toCharArray()) {
			switch (c) {
				case '"' -> result.append("\\\"");
				case '\\' -> result.append("\\\\");
				case '\n' -> result.append("\\n");
				case '\r' -> result.append("\\r");
				case '\t' -> result.append("\\t");
				default -> {
					if (c < 0x20) {
						result.append(String.format("\\u%04x", (int) c));
					} else {
						result.append(c);
					}
				}
			}
		}
		return result.append('"').toString();
	}

	private static boolean hasDocumentation(ModelElement element) {
		return element.getDocumentation() != null && !element.getDocumentation().isBlank();
	}

	private void documentation(ModelElement element, String indent) {
		if (!hasDocumentation(element)) {
			return;
		}
		String documentation = element.getDocumentation().strip().replace("*/", "*&#47;");
		if (!documentation.contains("\n") && documentation.length() <= 100) {
			out.append(indent).append("/** ").append(documentation).append(" */\n");
			return;
		}
		out.append(indent).append("/**\n");
		for (String line: documentation.split("\r\n|\r|\n", -1)) {
			out.append(indent).append(line.isBlank() ? " *" : " * " + line.stripTrailing()).append("\n");
		}
		out.append(indent).append(" */\n");
	}

}
