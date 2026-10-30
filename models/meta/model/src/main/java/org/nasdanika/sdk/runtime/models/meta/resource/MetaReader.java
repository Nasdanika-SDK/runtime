package org.nasdanika.sdk.runtime.models.meta.resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.models.core.CoreFactory;
import org.nasdanika.sdk.runtime.models.core.Marker;
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
import org.nasdanika.sdk.runtime.models.meta.MetaFactory;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
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
import org.nasdanika.sdk.runtime.models.meta.parser.MetaLexer;
import org.nasdanika.sdk.runtime.models.meta.parser.MetaParser;
import org.nasdanika.sdk.runtime.models.meta.parser.MetaParser.*;

/**
 * Reads the text syntax of Meta, one file being one {@link Package}. The grammar,
 * {@code src/main/grammar/Meta.g4}, documents the syntax and how it maps to the model.
 *
 * <h2>Resolution</h2>
 *
 * A type name is resolved against the type parameters in scope, then against the classifiers of
 * the file, wherever they are declared in it. A name qualified with an import alias,
 * {@code party.Party}, becomes a {@link ClassifierReference} with the imported namespace and the
 * classifier name, and its target is set when the package of that namespace is available: loaded
 * in the resource set already, or loadable because the resource set's URI converter maps the
 * namespace to a location, such as a file next to this one. Otherwise the reference keeps the
 * namespace and the name, which is what lets a package be read on its own.
 *
 * <h2>Facets</h2>
 *
 * Until the core model has facets, a facet, {@code @role.Assignment { role: owner }}, is recorded
 * as an {@link Annotation}: its source is the URI of the facet type, the namespace and the class
 * name joined with {@code #}, its name is the class name, and its properties are details. An
 * object value is a nested annotation named after its property, with the URI of its type as the
 * source when the type is known; a list is a nested annotation with the source {@link #LIST} and
 * its items keyed by position. A facet whose type is available is checked against it, and one
 * whose type is not is a warning.
 *
 * <h2>Provenance</h2>
 *
 * When the reader has a location, every package, classifier, feature, operation, parameter, type
 * parameter and enum literal gets a core model {@link Marker} with the location and the
 * {@code line:column} of its first token.
 */
public class MetaReader {

	/**
	 * The source of an annotation that holds the items of a list value of a facet.
	 */
	public static final String LIST = MetaPackage.eNS_URI + "#list";

	private static final MetaFactory META = MetaFactory.eINSTANCE;

	private final Resource resource;
	private final String location;
	private final List<MetaDiagnostic> errors = new ArrayList<>();
	private final List<MetaDiagnostic> warnings = new ArrayList<>();

	private CommonTokenStream tokens;
	private Package pkg;
	private final Map<String, String> imports = new HashMap<>();            // alias -> namespace
	private final Map<String, String> annotationSources = new HashMap<>();  // alias -> source
	private final Map<String, Classifier> classifiers = new LinkedHashMap<>();
	private final Map<String, Optional<Package>> importedPackages = new HashMap<>();
	private final List<Runnable> deferred = new ArrayList<>();

	/**
	 * @param resource The package is added to its contents, imports are resolved in its resource set,
	 * and its URI is the location of diagnostics and markers. May be null
	 */
	public MetaReader(Resource resource) {
		this.resource = resource;
		this.location = resource == null || resource.getURI() == null ? null : resource.getURI().toString();
	}

	public List<MetaDiagnostic> getErrors() {
		return Collections.unmodifiableList(errors);
	}

	public List<MetaDiagnostic> getWarnings() {
		return Collections.unmodifiableList(warnings);
	}

	/**
	 * Reads a package. Problems are collected in {@link #getErrors()} and {@link #getWarnings()}.
	 *
	 * @return The package, or null if the text has syntax errors
	 */
	public Package read(String text) {
		MetaLexer lexer = new MetaLexer(CharStreams.fromString(text, location == null ? "<text>" : location));
		MetaParser parser = new MetaParser(tokens = new CommonTokenStream(lexer));
		BaseErrorListener errorListener = new BaseErrorListener() {

			@Override
			public void syntaxError(
					Recognizer<?, ?> recognizer,
					java.lang.Object offendingSymbol,
					int line,
					int charPositionInLine,
					String msg,
					RecognitionException e) {
				errors.add(new MetaDiagnostic(msg, location, line, charPositionInLine + 1));
			}

		};
		lexer.removeErrorListeners();
		lexer.addErrorListener(errorListener);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListener);

		CompilationUnitContext compilationUnit = parser.compilationUnit();
		if (!errors.isEmpty()) {
			return null;
		}

		for (ImportDeclarationContext importDeclaration: compilationUnit.importDeclaration()) {
			String alias = typeName(importDeclaration.typeName());
			if (imports.put(alias, string(importDeclaration.STRING())) != null) {
				error(importDeclaration, "Duplicate import alias " + alias);
			}
		}
		for (AnnotationDeclarationContext annotationDeclaration: compilationUnit.annotationDeclaration()) {
			String alias = name(annotationDeclaration.name());
			if (annotationSources.put(alias, string(annotationDeclaration.STRING())) != null) {
				error(annotationDeclaration, "Duplicate annotation alias " + alias);
			}
		}

		pkg = packageDeclaration(compilationUnit.packageDeclaration());
		if (resource != null) {
			resource.getContents().add(pkg); // Before imports are resolved, so that a package importing this one back finds it
		}

		// Classifiers first, so that a type may be used before it is declared
		Map<ClassifierDeclarationContext, Classifier> declared = new LinkedHashMap<>();
		for (ClassifierDeclarationContext classifierDeclaration: compilationUnit.classifierDeclaration()) {
			Classifier classifier = declare(classifierDeclaration);
			if (classifiers.putIfAbsent(classifier.getName(), classifier) != null) {
				error(classifierDeclaration, "Duplicate classifier " + classifier.getName());
			}
			pkg.getClassifiers().add(classifier);
			declared.put(classifierDeclaration, classifier);
		}
		declared.forEach(this::define);

		// Opposites, keys and facets need the features of every class
		deferred.forEach(Runnable::run);
		return pkg;
	}

	// --- Structure ---

	private Package packageDeclaration(PackageDeclarationContext ctx) {
		Package result = META.createPackage();
		result.setName(qualifiedName(ctx.qualifiedName()));
		for (PackageClauseContext clause: ctx.packageClause()) {
			switch (clause) {
				case PackageNamespaceContext namespace -> result.setNamespace(string(namespace.STRING()));
				case PackagePrefixContext prefix -> result.setPrefix(name(prefix.name()));
				case PackageQuotedPrefixContext prefix -> result.setPrefix(string(prefix.STRING()));
				case PackageVersionContext version -> result.setVersion(string(version.STRING()));
				default -> throw new IllegalStateException("Unexpected package clause: " + clause.getText());
			}
		}
		element(result, ctx);
		annotations(result, ctx.annotation());
		return result;
	}

	private Classifier declare(ClassifierDeclarationContext ctx) {
		if (ctx.classDeclaration() != null) {
			ClassDeclarationContext declaration = ctx.classDeclaration();
			Class result = META.createClass();
			result.setName(typeName(declaration.typeName()));
			result.setAbstract(declaration.ABSTRACT() != null);
			return element(result, ctx);
		}
		if (ctx.dataTypeDeclaration() != null) {
			DataType result = META.createDataType();
			result.setName(typeName(ctx.dataTypeDeclaration().typeName()));
			return element(result, ctx);
		}
		Enum result = META.createEnum();
		result.setName(typeName(ctx.enumDeclaration().typeName()));
		return element(result, ctx);
	}

	private void define(ClassifierDeclarationContext ctx, Classifier classifier) {
		switch (classifier) {
			case Class type -> defineClass(ctx.classDeclaration(), type);
			case DataType dataType -> defineDataType(ctx.dataTypeDeclaration(), dataType);
			case Enum enumeration -> defineEnum(ctx.enumDeclaration(), enumeration);
			default -> throw new IllegalStateException("Unexpected classifier: " + classifier);
		}
	}

	private void defineClass(ClassDeclarationContext ctx, Class type) {
		annotations(type, ctx.annotation());
		Map<String, TypeParameter> scope = typeParameters(type.getTypeParameters(), ctx.typeParameters(), Map.of());
		for (TypeReferenceContext superType: ctx.typeReference()) {
			type.getSuperTypes().add(type(superType, scope));
		}
		Set<String> names = new HashSet<>();
		for (MemberContext member: ctx.member()) {
			if (member.featureDeclaration() != null) {
				Feature feature = feature(member.featureDeclaration(), scope);
				if (!names.add(feature.getName())) {
					error(member, "Duplicate feature " + feature.getName() + " in " + type.getName());
				}
				type.getFeatures().add(feature);
			} else {
				type.getOperations().add(operation(member.operationDeclaration(), scope));
			}
		}
	}

	private void defineDataType(DataTypeDeclarationContext ctx, DataType dataType) {
		annotations(dataType, ctx.annotation());
		typeParameters(dataType.getTypeParameters(), ctx.typeParameters(), Map.of());
		if (ctx.primitiveType() != null) {
			dataType.setRepresentation(primitiveKind(ctx.primitiveType()));
		}
		if (ctx.sourceType() != null) {
			dataType.setSourceType(sourceType(ctx.sourceType()));
		}
	}

	private void defineEnum(EnumDeclarationContext ctx, Enum enumeration) {
		annotations(enumeration, ctx.annotation());
		int ordinal = 0;
		Set<String> names = new HashSet<>();
		for (EnumLiteralContext literalContext: ctx.enumLiteral()) {
			EnumLiteral literal = element(META.createEnumLiteral(), literalContext);
			literal.setName(name(literalContext.name()));
			if (!names.add(literal.getName())) {
				error(literalContext, "Duplicate literal " + literal.getName() + " in " + enumeration.getName());
			}
			if (literalContext.STRING() != null) {
				literal.setValue(string(literalContext.STRING()));
			}
			if (literalContext.INTEGER() != null) {
				ordinal = Integer.parseInt(literalContext.INTEGER().getText());
			}
			literal.setOrdinal(ordinal++); // Unless given, one more than the previous literal's, as in C
			annotations(literal, literalContext.annotation());
			enumeration.getLiterals().add(literal);
		}
	}

	// --- Members ---

	private Feature feature(FeatureDeclarationContext ctx, Map<String, TypeParameter> scope) {
		boolean isReference = ctx.referenceKind() != null;
		Feature feature = element(isReference ? META.createReference() : META.createAttribute(), ctx);
		feature.setName(name(ctx.name(0)));
		if (feature instanceof Reference reference) {
			reference.setContainment(ctx.referenceKind().CONTAINS() != null);
		}
		for (FeatureModifierContext modifier: ctx.featureModifier()) {
			if (modifier.DERIVED() != null) {
				feature.setDerived(true);
			} else if (modifier.READONLY() != null) {
				feature.setReadonly(true);
			} else if (modifier.UNORDERED() != null) {
				feature.setOrdered(false);
			} else if (modifier.UNIQUE() != null) {
				feature.setUnique(true);
			} else if (feature instanceof Attribute attribute) {
				attribute.setIdentifying(true);
			} else {
				error(modifier, "A reference cannot be id: " + feature.getName());
			}
		}
		feature.setType(type(ctx.typeReference(), scope));
		multiplicity(feature, ctx.multiplicity());

		int keysStart = 1;
		if (ctx.OPPOSITE() != null) {
			NameContext opposite = ctx.name(keysStart++);
			if (feature instanceof Reference reference) {
				deferred.add(() -> opposite(reference, opposite));
			} else {
				error(opposite, "An attribute has no opposite: " + feature.getName());
			}
		}
		if (ctx.KEYS() != null) {
			List<NameContext> keys = ctx.name().subList(keysStart, ctx.name().size());
			if (feature instanceof Reference reference) {
				deferred.add(() -> keys(reference, keys));
			} else {
				error(ctx, "An attribute has no keys: " + feature.getName());
			}
		}
		if (ctx.literal() != null) {
			feature.setDefaultValue(literal(ctx.literal()));
		}
		annotations(feature, ctx.annotation());
		return feature;
	}

	private Operation operation(OperationDeclarationContext ctx, Map<String, TypeParameter> classScope) {
		Operation operation = element(META.createOperation(), ctx);
		operation.setName(name(ctx.name()));
		Map<String, TypeParameter> scope = typeParameters(operation.getTypeParameters(), ctx.typeParameters(), classScope);
		operation.setType(type(ctx.typeReference(0), scope));
		multiplicity(operation, ctx.multiplicity());
		List<ParameterContext> parameters = ctx.parameter();
		for (int i = 0; i < parameters.size(); ++i) {
			ParameterContext parameterContext = parameters.get(i);
			Parameter parameter = element(META.createParameter(), parameterContext);
			parameter.setName(name(parameterContext.name()));
			parameter.setOrdered(parameterContext.UNORDERED() == null);
			parameter.setUnique(parameterContext.UNIQUE() != null);
			parameter.setType(type(parameterContext.typeReference(), scope));
			multiplicity(parameter, parameterContext.multiplicity());
			if (parameterContext.ELLIPSIS() != null) {
				parameter.setVariadic(true);
				if (i < parameters.size() - 1) {
					error(parameterContext, "Only the last parameter can be variadic: " + parameter.getName());
				}
			}
			if (parameterContext.literal() != null) {
				parameter.setDefaultValue(literal(parameterContext.literal()));
			}
			annotations(parameter, parameterContext.annotation());
			operation.getParameters().add(parameter);
		}
		for (TypeReferenceContext exception: ctx.typeReference().subList(1, ctx.typeReference().size())) {
			operation.getExceptions().add(type(exception, scope));
		}
		annotations(operation, ctx.annotation());
		return operation;
	}

	/**
	 * Adds the type parameters to the list, resolving their bounds and defaults once all of them
	 * are in scope.
	 *
	 * @return The enclosing scope with the parameters added
	 */
	private Map<String, TypeParameter> typeParameters(
			List<TypeParameter> typeParameters,
			TypeParametersContext ctx,
			Map<String, TypeParameter> enclosingScope) {
		if (ctx == null) {
			return enclosingScope;
		}
		Map<String, TypeParameter> scope = new HashMap<>(enclosingScope);
		for (TypeParameterContext parameterContext: ctx.typeParameter()) {
			TypeParameter typeParameter = element(META.createTypeParameter(), parameterContext);
			typeParameter.setName(typeName(parameterContext.typeName()));
			scope.put(typeParameter.getName(), typeParameter);
			typeParameters.add(typeParameter);
		}
		for (int i = 0; i < typeParameters.size(); ++i) {
			TypeParameterContext parameterContext = ctx.typeParameter(i);
			TypeParameter typeParameter = typeParameters.get(i);
			List<TypeReferenceContext> types = parameterContext.typeReference();
			int defaultIndex = 0;
			if (parameterContext.EXTENDS() != null) {
				typeParameter.setBound(type(types.get(defaultIndex++), scope));
			}
			if (types.size() > defaultIndex) {
				typeParameter.setDefault(type(types.get(defaultIndex), scope));
			}
			annotations(typeParameter, parameterContext.annotation());
		}
		return scope;
	}

	private void multiplicity(TypedElement typedElement, MultiplicityContext ctx) {
		switch (ctx) {
			case null -> { } // [0..1], the model's default
			case ManyMultiplicityContext many -> typedElement.setUpperBound(-1);
			case ShorthandMultiplicityContext shorthand -> {
				switch (shorthand.getChild(1).getText()) {
					case "*" -> typedElement.setUpperBound(-1);
					case "+" -> {
						typedElement.setLowerBound(1);
						typedElement.setUpperBound(-1);
					}
					default -> { } // ?
				}
			}
			case ExactMultiplicityContext exact -> {
				int bound = Integer.parseInt(exact.lower.getText());
				typedElement.setLowerBound(bound);
				typedElement.setUpperBound(bound);
			}
			case RangeMultiplicityContext range -> {
				int lower = Integer.parseInt(range.lower.getText());
				int upper = range.unbounded == null ? Integer.parseInt(range.upper.getText()) : -1;
				if (upper != -1 && upper < lower) {
					error(ctx, "The upper bound is less than the lower bound: " + ctx.getText());
				}
				typedElement.setLowerBound(lower);
				typedElement.setUpperBound(upper);
			}
			default -> throw new IllegalStateException("Unexpected multiplicity: " + ctx.getText());
		}
	}

	private void opposite(Reference reference, NameContext ctx) {
		String name = name(ctx);
		if (targetClass(reference) instanceof Class target) {
			if (feature(target, name) instanceof Reference opposite) {
				reference.setOpposite(opposite);
			} else {
				error(ctx, target.getName() + " has no reference " + name + " to be the opposite of " + reference.getName());
			}
		} else {
			error(ctx, "The opposite of " + reference.getName() + " is in a class that is not available: " + name);
		}
	}

	private void keys(Reference reference, List<NameContext> keys) {
		for (NameContext ctx: keys) {
			String name = name(ctx);
			if (targetClass(reference) instanceof Class target) {
				if (feature(target, name) instanceof Attribute key) {
					reference.getKeys().add(key);
				} else {
					error(ctx, target.getName() + " has no attribute " + name + " to be a key of " + reference.getName());
				}
			} else {
				error(ctx, "The key of " + reference.getName() + " is in a class that is not available: " + name);
			}
		}
	}

	private static Class targetClass(TypedElement typedElement) {
		return typedElement.getType() instanceof ClassifierReference classifierReference
				&& classifierReference.getTarget() instanceof Class target ? target : null;
	}

	/**
	 * A feature of the class or of its supertypes.
	 */
	static Feature feature(Class type, String name) {
		return feature(type, name, new HashSet<>());
	}

	private static Feature feature(Class type, String name, Set<Class> visited) {
		if (!visited.add(type)) {
			return null;
		}
		for (Feature feature: type.getFeatures()) {
			if (name.equals(feature.getName())) {
				return feature;
			}
		}
		for (TypeReference superType: type.getSuperTypes()) {
			if (superType instanceof ClassifierReference classifierReference
					&& classifierReference.getTarget() instanceof Class superClass) {
				Feature feature = feature(superClass, name, visited);
				if (feature != null) {
					return feature;
				}
			}
		}
		return null;
	}

	// --- Types ---

	private TypeReference type(TypeReferenceContext ctx, Map<String, TypeParameter> scope) {
		List<UnionMemberContext> members = ctx.unionMember();
		if (members.size() == 1) {
			return unionMember(members.getFirst(), scope);
		}
		UnionTypeReference union = META.createUnionTypeReference();
		for (UnionMemberContext member: members) {
			union.getTypes().add(unionMember(member, scope));
		}
		return union;
	}

	private TypeReference unionMember(UnionMemberContext ctx, Map<String, TypeParameter> scope) {
		List<IntersectionMemberContext> members = ctx.intersectionMember();
		if (members.size() == 1) {
			return intersectionMember(members.getFirst(), scope);
		}
		IntersectionTypeReference intersection = META.createIntersectionTypeReference();
		for (IntersectionMemberContext member: members) {
			intersection.getTypes().add(intersectionMember(member, scope));
		}
		return intersection;
	}

	private TypeReference intersectionMember(IntersectionMemberContext ctx, Map<String, TypeParameter> scope) {
		return switch (ctx) {
			case PrimitiveTypeReferenceContext primitive -> {
				PrimitiveTypeReference result = META.createPrimitiveTypeReference();
				result.setKind(primitiveKind(primitive.primitiveType()));
				yield result;
			}
			case ClassifierReferenceContext classifier -> classifierReference(classifier, scope);
			case OpaqueTypeReferenceContext opaque -> {
				OpaqueTypeReference result = META.createOpaqueTypeReference();
				String text = opaque.OPAQUE().getText();
				result.setText(text.substring(1, text.length() - 1));
				yield result;
			}
			case ParenthesizedTypeReferenceContext parenthesized -> type(parenthesized.typeReference(), scope);
			default -> throw new IllegalStateException("Unexpected type: " + ctx.getText());
		};
	}

	private TypeReference classifierReference(ClassifierReferenceContext ctx, Map<String, TypeParameter> scope) {
		List<String> segments = ctx.qualifiedTypeName().typeName().stream().map(MetaReader::typeName).toList();
		if (segments.size() == 1 && scope.containsKey(segments.getFirst())) {
			if (ctx.typeArguments() != null) {
				error(ctx, "A type parameter has no type arguments: " + ctx.getText());
			}
			TypeParameterReference result = META.createTypeParameterReference();
			result.setTarget(scope.get(segments.getFirst()));
			return result;
		}

		ClassifierReference result = META.createClassifierReference();
		if (segments.size() == 1) {
			Classifier target = classifiers.get(segments.getFirst());
			if (target == null) {
				error(ctx, "Unknown type " + segments.getFirst());
				result.setClassifierName(segments.getFirst());
			} else {
				result.setTarget(target);
			}
		} else if (segments.size() == 2) {
			String namespace = imports.get(segments.getFirst());
			result.setClassifierName(segments.getLast());
			if (namespace == null) {
				error(ctx, "Unknown import alias " + segments.getFirst() + " in " + ctx.qualifiedTypeName().getText());
			} else {
				result.setNamespace(namespace);
				result.setTarget(imported(namespace, segments.getLast()));
			}
		} else {
			error(ctx, "A type name is Name or alias.Name: " + ctx.qualifiedTypeName().getText());
		}

		if (ctx.typeArguments() != null) {
			for (TypeArgumentContext argument: ctx.typeArguments().typeArgument()) {
				result.getTypeArguments().add(switch (argument) {
					case TypeArgumentReferenceContext reference -> type(reference.typeReference(), scope);
					case WildcardTypeReferenceContext wildcard -> {
						WildcardTypeReference wildcardReference = META.createWildcardTypeReference();
						if (wildcard.EXTENDS() != null) {
							wildcardReference.setUpperBound(type(wildcard.typeReference(), scope));
						} else if (wildcard.SUPER() != null) {
							wildcardReference.setLowerBound(type(wildcard.typeReference(), scope));
						}
						yield wildcardReference;
					}
					default -> throw new IllegalStateException("Unexpected type argument: " + argument.getText());
				});
			}
		}
		return result;
	}

	/**
	 * @return A classifier of an available package with the namespace, or null
	 */
	private Classifier imported(String namespace, String name) {
		if (namespace.equals(pkg.getNamespace())) {
			return classifiers.get(name);
		}
		return importedPackages
			.computeIfAbsent(namespace, this::findPackage)
			.flatMap(imported -> imported.getClassifiers().stream().filter(c -> name.equals(c.getName())).findFirst())
			.orElse(null);
	}

	/**
	 * A package loaded in the resource set, or loaded from where the URI converter maps its namespace.
	 */
	private Optional<Package> findPackage(String namespace) {
		ResourceSet resourceSet = resource == null ? null : resource.getResourceSet();
		if (resourceSet == null) {
			return Optional.empty();
		}
		for (Resource candidate: List.copyOf(resourceSet.getResources())) {
			Optional<Package> found = packageIn(candidate, namespace);
			if (found.isPresent()) {
				return found;
			}
		}
		URI uri = URI.createURI(namespace);
		URI mapped = resourceSet.getURIConverter().normalize(uri);
		if (mapped.equals(uri)) {
			return Optional.empty(); // Namespaces are names, they are not fetched
		}
		try {
			// The mapped location, not the namespace, selects the resource factory, by its extension
			return packageIn(resourceSet.getResource(mapped, true), namespace);
		} catch (RuntimeException e) {
			warnings.add(new MetaDiagnostic("Cannot load " + namespace + " from " + mapped + ": " + e.getMessage(), location, 1, 1));
			return Optional.empty();
		}
	}

	private Optional<Package> packageIn(Resource candidate, String namespace) {
		if (candidate == resource) {
			return Optional.empty();
		}
		for (EObject root: candidate.getContents()) {
			if (root instanceof Package candidatePackage && namespace.equals(candidatePackage.getNamespace())) {
				return Optional.of(candidatePackage);
			}
		}
		return Optional.empty();
	}

	private static PrimitiveKind primitiveKind(PrimitiveTypeContext ctx) {
		return switch (((TerminalNode) ctx.getChild(0)).getSymbol().getType()) {
			case MetaLexer.STRING_TYPE -> PrimitiveKind.STRING;
			case MetaLexer.NUMBER_TYPE -> PrimitiveKind.NUMBER;
			case MetaLexer.BOOLEAN_TYPE -> PrimitiveKind.BOOLEAN;
			case MetaLexer.BIGINT_TYPE -> PrimitiveKind.BIGINT;
			case MetaLexer.DATE_TYPE -> PrimitiveKind.DATE;
			case MetaLexer.TIME_TYPE -> PrimitiveKind.TIME;
			case MetaLexer.DATE_TIME_TYPE -> PrimitiveKind.DATE_TIME;
			case MetaLexer.DURATION_TYPE -> PrimitiveKind.DURATION;
			case MetaLexer.BINARY_TYPE -> PrimitiveKind.BINARY;
			case MetaLexer.ANY_TYPE -> PrimitiveKind.ANY;
			case MetaLexer.NULL_TYPE -> PrimitiveKind.NULL;
			case MetaLexer.VOID_TYPE -> PrimitiveKind.VOID;
			default -> throw new IllegalStateException("Unexpected primitive type: " + ctx.getText());
		};
	}

	private static String sourceType(SourceTypeContext ctx) {
		if (ctx.STRING() != null) {
			return string(ctx.STRING());
		}
		StringBuilder result = new StringBuilder(qualifiedName(ctx.qualifiedName()));
		if (!ctx.sourceType().isEmpty()) {
			result
				.append('<')
				.append(ctx.sourceType().stream().map(MetaReader::sourceType).collect(Collectors.joining(", ")))
				.append('>');
		}
		for (ParseTree child: ctx.children) {
			if (child instanceof TerminalNode terminal && "[".equals(terminal.getText())) {
				result.append("[]");
			}
		}
		return result.toString();
	}

	// --- Annotations and facets ---

	/**
	 * Deferred, because a facet is checked against the features of its type.
	 */
	private void annotations(ModelElement element, List<AnnotationContext> annotations) {
		if (!annotations.isEmpty()) {
			deferred.add(() -> {
				for (AnnotationContext annotation: annotations) {
					element.getAnnotations().add(switch (annotation) {
						case PlainAnnotationContext plain -> plainAnnotation(plain);
						case FacetContext facet -> facet(facet);
						default -> throw new IllegalStateException("Unexpected annotation: " + annotation.getText());
					});
				}
			});
		}
	}

	private Annotation plainAnnotation(PlainAnnotationContext ctx) {
		Annotation annotation = META.createAnnotation();
		if (ctx.STRING() != null) {
			annotation.setSource(string(ctx.STRING()));
		} else {
			String alias = qualifiedName(ctx.qualifiedName());
			annotation.setSource(annotationSources.get(alias));
			if (annotation.getSource() == null) {
				error(ctx, "Unknown annotation alias " + alias + ", declare it with annotation \"<source URI>\" as " + alias);
			}
		}
		for (AnnotationDetailContext detail: ctx.annotationDetail()) {
			String key = detail.name() == null ? string(detail.STRING(0)) : name(detail.name());
			TerminalNode value = detail.TEXT_BLOCK() == null ? detail.STRING(detail.STRING().size() - 1) : detail.TEXT_BLOCK();
			annotation.getDetails().put(key, value.getSymbol().getType() == MetaLexer.TEXT_BLOCK ? textBlock(value.getText()) : string(value));
		}
		return annotation;
	}

	private record FacetType(String uri, String name, Class type) {}

	private Annotation facet(FacetContext ctx) {
		FacetType facetType = facetType(ctx.qualifiedTypeName());
		Annotation facet = object(ctx.objectLiteral(), facetType);
		facet.setName(facetType.name());
		return facet;
	}

	private FacetType facetType(QualifiedTypeNameContext ctx) {
		List<String> segments = ctx.typeName().stream().map(MetaReader::typeName).toList();
		String name = segments.getLast();
		String namespace;
		Classifier type;
		if (segments.size() == 1) {
			namespace = pkg.getNamespace();
			type = classifiers.get(name);
		} else if (segments.size() == 2) {
			namespace = imports.get(segments.getFirst());
			if (namespace == null) {
				error(ctx, "Unknown import alias " + segments.getFirst() + " in " + ctx.getText());
				return new FacetType(null, name, null);
			}
			type = imported(namespace, name);
		} else {
			error(ctx, "A facet type is Name or alias.Name: " + ctx.getText());
			return new FacetType(null, name, null);
		}
		if (type == null) {
			warning(ctx, "Facet type " + ctx.getText() + " is not available, its properties are not checked");
		} else if (!(type instanceof Class)) {
			error(ctx, "A facet type is a class: " + ctx.getText());
		}
		return new FacetType(typeURI(namespace, name), name, type instanceof Class facetClass ? facetClass : null);
	}

	/**
	 * The namespace and the class name joined with {@code #}.
	 */
	private static String typeURI(String namespace, String name) {
		return (namespace == null ? "" : namespace) + "#" + name;
	}

	private Annotation object(ObjectLiteralContext ctx, FacetType type) {
		Annotation object = META.createAnnotation();
		object.setSource(type == null ? null : type.uri());
		for (PropertyContext property: ctx.property()) {
			String key = property.name() == null ? string(property.STRING()) : name(property.name());
			Feature feature = null;
			if (type != null && type.type() != null) {
				feature = feature(type.type(), key);
				if (feature == null) {
					warning(property, type.name() + " has no feature " + key);
				}
			}
			value(object, key, property.value(), feature);
		}
		return object;
	}

	private void value(Annotation owner, String key, ValueContext ctx, Feature feature) {
		switch (ctx) {
			case LiteralValueContext literal -> owner.getDetails().put(key, literal(literal.literal()));
			case NullValueContext nullValue -> owner.getDetails().put(key, null);
			case ReferenceValueContext reference -> owner.getDetails().put(
					key,
					reference.reference().referenceSegment().stream()
						.map(segment -> stripEscape(segment.getText()))
						.collect(Collectors.joining(".")));
			case TypedObjectValueContext typed -> {
				Annotation object = object(typed.objectLiteral(), facetType(typed.qualifiedTypeName()));
				object.setName(key);
				owner.getAnnotations().add(object);
			}
			case ObjectValueContext untyped -> {
				// The type comes from the property, when it is known
				FacetType type = null;
				if (feature != null && targetClass(feature) instanceof Class propertyType) {
					String namespace = propertyType.eContainer() instanceof Package typePackage ? typePackage.getNamespace() : null;
					type = new FacetType(typeURI(namespace, propertyType.getName()), propertyType.getName(), propertyType);
				}
				Annotation object = object(untyped.objectLiteral(), type);
				object.setName(key);
				owner.getAnnotations().add(object);
			}
			case ListValueContext list -> {
				Annotation items = META.createAnnotation();
				items.setSource(LIST);
				items.setName(key);
				for (int i = 0; i < list.value().size(); ++i) {
					value(items, String.valueOf(i), list.value(i), feature);
				}
				owner.getAnnotations().add(items);
			}
			default -> throw new IllegalStateException("Unexpected value: " + ctx.getText());
		}
	}

	// --- Names and literals ---

	private static String name(NameContext ctx) {
		return stripEscape(ctx.getText());
	}

	private static String typeName(TypeNameContext ctx) {
		return stripEscape(ctx.getText());
	}

	private static String qualifiedName(QualifiedNameContext ctx) {
		return ctx.name().stream().map(MetaReader::name).collect(Collectors.joining("."));
	}

	/**
	 * A leading ^ escapes a keyword, as in Xcore.
	 */
	private static String stripEscape(String identifier) {
		return identifier.startsWith("^") ? identifier.substring(1) : identifier;
	}

	private static String literal(LiteralContext ctx) {
		if (ctx.STRING() != null) {
			return string(ctx.STRING());
		}
		if (ctx.TEXT_BLOCK() != null) {
			return textBlock(ctx.TEXT_BLOCK().getText());
		}
		return ctx.getText(); // A number, with its sign, true or false
	}

	private static String string(TerminalNode node) {
		String text = node.getText();
		return unescape(text.substring(1, text.length() - 1));
	}

	/**
	 * Java text block rules: the content starts on the line after the opening quotes, where a
	 * word is a language tag, incidental indentation is stripped, counting the line of the closing
	 * quotes, and so is trailing whitespace.
	 */
	static String textBlock(String text) {
		String raw = text.substring(3, text.length() - 3);
		int lineEnd = raw.indexOf('\n');
		if (lineEnd == -1) {
			return unescape(raw.strip());
		}
		String[] lines = raw.substring(lineEnd + 1).split("\r\n|\r|\n", -1);
		int indentation = Integer.MAX_VALUE;
		for (int i = 0; i < lines.length; ++i) {
			if (!lines[i].isBlank() || i == lines.length - 1) {
				indentation = Math.min(indentation, lines[i].length() - lines[i].stripLeading().length());
			}
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < lines.length; ++i) {
			if (i > 0) {
				result.append('\n');
			}
			String line = lines[i];
			result.append((line.length() > indentation ? line.substring(indentation) : "").stripTrailing());
		}
		return unescape(result.toString());
	}

	/**
	 * Escapes of the grammar's strings, and of Java text blocks: {@code \s} and a backslash at the
	 * end of a line.
	 */
	private static String unescape(String text) {
		if (text.indexOf('\\') == -1) {
			return text;
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < text.length(); ++i) {
			char c = text.charAt(i);
			if (c != '\\' || i == text.length() - 1) {
				result.append(c);
				continue;
			}
			char escaped = text.charAt(++i);
			switch (escaped) {
				case 'b' -> result.append('\b');
				case 'f' -> result.append('\f');
				case 'n' -> result.append('\n');
				case 'r' -> result.append('\r');
				case 't' -> result.append('\t');
				case 's' -> result.append(' ');
				case '\n' -> { } // Line continuation
				case 'u' -> {
					result.append((char) Integer.parseInt(text.substring(i + 1, i + 5), 16));
					i += 4;
				}
				default -> result.append(escaped); // Quotes, backslash and slash
			}
		}
		return result.toString();
	}

	/**
	 * The documentation comment immediately left of the element's first token, as Markdown: the
	 * leading asterisks of its lines are stripped, as in Javadoc, or else its incidental indentation.
	 */
	private String documentation(ParserRuleContext ctx) {
		List<Token> hidden = tokens.getHiddenTokensToLeft(ctx.getStart().getTokenIndex(), Token.HIDDEN_CHANNEL);
		if (hidden == null) {
			return null;
		}
		Token comment = hidden.reversed().stream().filter(t -> t.getType() == MetaLexer.DOC_COMMENT).findFirst().orElse(null);
		if (comment == null) {
			return null;
		}
		String text = comment.getText();
		List<String> lines = new ArrayList<>(List.of(text.substring(3, text.length() - 2).split("\r\n|\r|\n", -1)));
		List<String> rest = lines.subList(1, lines.size());
		boolean starred = rest.stream().filter(line -> !line.isBlank()).allMatch(line -> line.stripLeading().startsWith("*"));
		if (starred) {
			rest.replaceAll(line -> {
				String stripped = line.stripLeading();
				if (stripped.startsWith("*")) {
					stripped = stripped.substring(1);
					return stripped.startsWith(" ") ? stripped.substring(1) : stripped;
				}
				return stripped;
			});
		} else {
			List<String> indented = List.of(String.join("\n", rest).stripIndent().split("\n", -1));
			rest.clear();
			rest.addAll(indented);
		}
		lines.set(0, lines.getFirst().strip());
		lines.replaceAll(String::stripTrailing);
		String documentation = String.join("\n", lines).strip();
		return documentation.isEmpty() ? null : documentation;
	}

	// --- Elements and diagnostics ---

	/**
	 * Sets documentation and adds a marker.
	 */
	private <T extends ModelElement> T element(T element, ParserRuleContext ctx) {
		element.setDocumentation(documentation(ctx));
		if (location != null) {
			Marker marker = CoreFactory.eINSTANCE.createMarker();
			marker.setLocation(location);
			marker.setPosition(ctx.getStart().getLine() + ":" + (ctx.getStart().getCharPositionInLine() + 1));
			element.getMarkers().add(marker);
		}
		return element;
	}

	private void error(ParserRuleContext ctx, String message) {
		errors.add(diagnostic(ctx, message));
	}

	private void warning(ParserRuleContext ctx, String message) {
		warnings.add(diagnostic(ctx, message));
	}

	private MetaDiagnostic diagnostic(ParserRuleContext ctx, String message) {
		Token start = ctx.getStart();
		return new MetaDiagnostic(message, location, start.getLine(), start.getCharPositionInLine() + 1);
	}

}
