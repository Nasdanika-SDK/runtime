package org.nasdanika.sdk.runtime.models.typescript.ecore;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumMember;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveType;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;

/**
 * Builds a TypeScript {@link Package} from one or more {@link EPackage}s. What
 * comes out is a model, not source - hand it to
 * <code>org.nasdanika.sdk.runtime.models.typescript.generator.Generator</code> to write
 * files.
 * <p>
 * The mapping:
 * <ul>
 * <li>{@link EPackage} to an npm package with three modules: <code>model</code>
 * holding the declarations, <code>package</code> holding the nsURI and the
 * metamodel descriptor, and <code>index</code> re-exporting both.</li>
 * <li>{@link EClass} to an interface. Supertypes become <code>extends</code>,
 * structural features become properties.</li>
 * <li>{@link EEnum} to a string enum, keyed by literal, because that is what
 * EMF JSON writes.</li>
 * <li>{@link EDataType} to a type alias over the JSON representation of its
 * instance class.</li>
 * </ul>
 * <p>
 * Every generated interface carries <code>$eClass</code>, typed
 * <code>EClass&lt;Self&gt;</code>. That is the join between the build time
 * types and the runtime metamodel: TypeScript checks the shape, and
 * <code>$eClass</code> answers what the object actually is.
 * <p>
 * <b>Ecore generates in one pass.</b> Its metacircularity lives entirely in the
 * type system, where TypeScript resolves interface references lazily, so
 * <code>EClass</code> may describe itself without a bootstrap round. The one
 * special case is that <code>EClass</code> acquires a type parameter which
 * Ecore does not have - see {@link #ECLASS_TYPE_PARAMETER}.
 */
public class EcoreGenerator {

	private static final TypescriptFactory FACTORY = TypescriptFactory.eINSTANCE;

	private static final String GEN_MODEL_ANNOTATION = "http://www.eclipse.org/emf/2002/GenModel";

	public static final String MODEL_MODULE = "model";

	public static final String PACKAGE_MODULE = "package";

	public static final String INDEX_MODULE = "index";

	/**
	 * Hand written modules added to the generated Ecore package. They are on the
	 * classpath beside this class and are emitted verbatim.
	 */
	public static final List<String> RUNTIME_MODULES = List.of("runtime");

	private static final String RUNTIME_RESOURCE_PATH = "runtime/";

	/**
	 * The property every generated instance interface carries.
	 */
	public static final String ECLASS_PROPERTY = "$eClass";

	/**
	 * Ecore's <code>EClass</code> has no type parameter. One is added so that
	 * <code>$eClass</code> can be branded with the instance type it describes -
	 * <code>EClass&lt;Account&gt;</code> rather than a bare
	 * <code>EClass</code>.
	 */
	public static final String ECLASS_TYPE_PARAMETER = "T";

	/**
	 * Carries the type parameter without existing at runtime. It is declared
	 * optional and readonly so that <code>T</code> sits in a covariant position:
	 * without that, <code>EClass&lt;Account&gt;</code> would not be assignable to
	 * <code>EClass&lt;Identifiable&gt;</code> and every generated subtype would
	 * fail to narrow <code>$eClass</code>.
	 */
	public static final String ECLASS_PHANTOM_PROPERTY = "$instance";

	/**
	 * The npm package Ecore itself is published as.
	 */
	private String ecorePackageName = "@nasdanika/ecore";

	private String version = "0.0.1";

	private String license = "EPL-2.0";

	private Function<EPackage, String> packageNameResolver = ePackage -> "@nasdanika/"
			+ ePackage.getName().toLowerCase();

	private boolean readOnly = true;

	private boolean descriptor = true;

	private boolean runtime = true;

	/**
	 * EPackage nsURI to the generated TypeScript package, for every EPackage in
	 * the current run.
	 */
	private final Map<String, Package> packages = new LinkedHashMap<>();

	/**
	 * EClassifier to the declaration generated for it, across every EPackage in
	 * the run. This is what lets the TypeScript generator's import resolver work
	 * out specifiers by itself: a resolved target beats a string every time.
	 */
	private final Map<EClassifier, Declaration> declarations = new HashMap<>();

	public EcoreGenerator setEcorePackageName(String ecorePackageName) {
		this.ecorePackageName = ecorePackageName;
		return this;
	}

	public EcoreGenerator setVersion(String version) {
		this.version = version;
		return this;
	}

	public EcoreGenerator setLicense(String license) {
		this.license = license;
		return this;
	}

	/**
	 * How an EPackage becomes an npm package name. Defaults to
	 * <code>@nasdanika/&lt;lower case EPackage name&gt;</code>.
	 */
	public EcoreGenerator setPackageNameResolver(Function<EPackage, String> packageNameResolver) {
		this.packageNameResolver = packageNameResolver;
		return this;
	}

	/**
	 * Whether generated properties are <code>readonly</code>. On by default: these
	 * interfaces describe loaded data, and the consumption story is read only.
	 */
	public EcoreGenerator setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
		return this;
	}

	/**
	 * Whether to embed the EPackage, serialized as EMF JSON, in the
	 * <code>package</code> module. On by default - it is what a runtime needs in
	 * order to build real EClass objects without fetching a <code>.ecore</code>
	 * file.
	 */
	public EcoreGenerator setDescriptor(boolean descriptor) {
		this.descriptor = descriptor;
		return this;
	}

	/**
	 * Whether to add the hand written runtime to the generated Ecore package. On
	 * by default: without it the published types have nothing to load data with.
	 */
	public EcoreGenerator setRuntime(boolean runtime) {
		this.runtime = runtime;
		return this;
	}

	// --- Generation ---------------------------------------------------------

	/**
	 * Generates one EPackage. References to classifiers in EPackages which are not
	 * part of this call resolve to bare specifiers, so a package may be generated
	 * on its own and still reference others.
	 */
	public Package generate(EPackage ePackage, ResourceSet resourceSet) {
		return generate(List.of(ePackage), resourceSet).get(0);
	}

	/**
	 * Generates several EPackages together. Classifiers referenced across them
	 * resolve to targets rather than to strings, which is what lets the TypeScript
	 * generator compute the specifiers and the type-only flags itself.
	 */
	public List<Package> generate(Collection<EPackage> ePackages, ResourceSet resourceSet) {
		packages.clear();
		declarations.clear();

		// Pass one declares every classifier, so that pass two can point at them.
		// This is declaration order inside one generation run, not a two pass
		// bootstrap: nothing here is published between the passes.
		for (EPackage ePackage : ePackages) {
			Package tsPackage = createPackage(ePackage);
			packages.put(ePackage.getNsURI(), tsPackage);
			Module model = module(tsPackage, ePackage, MODEL_MODULE);
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				Declaration declaration = declare(eClassifier);
				if (declaration != null) {
					model.getDeclarations().add(declaration);
					declarations.put(eClassifier, declaration);
				}
			}
		}

		// Pass two fills in supertypes, features and literals.
		for (EPackage ePackage : ePackages) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				populate(eClassifier);
			}
			Package tsPackage = packages.get(ePackage.getNsURI());
			packageModule(tsPackage, ePackage, resourceSet);
			List<String> runtimeModules = runtimeModules(ePackage);
			for (String path : runtimeModules) {
				runtimeModule(tsPackage, path);
			}
			indexModule(tsPackage, ePackage, runtimeModules);
		}

		// A package which imports another has to declare it, or the import resolves
		// on this machine - where both were just generated - and nowhere else.
		for (Package tsPackage : packages.values()) {
			for (String dependency : externalPackages(tsPackage)) {
				tsPackage.getDependencies().add(dependency + "@" + version);
			}
		}

		return new ArrayList<>(packages.values());
	}

	/**
	 * The npm package names a generated package refers to.
	 * <p>
	 * Both forms of reference have to be followed. When the other package is part
	 * of the same run the reference carries a resolved target and no specifier -
	 * the TypeScript generator works the specifier out at emit time - and when it
	 * is not, the reference carries the specifier instead. Looking at only one of
	 * the two silently loses every dependency in the common case.
	 */
	private static SortedSet<String> externalPackages(Package tsPackage) {
		SortedSet<String> ret = new TreeSet<>();
		for (var it = tsPackage.eAllContents(); it.hasNext();) {
			if (!(it.next() instanceof NamedTypeReference reference)) {
				continue;
			}
			Declaration target = reference.getTarget();
			if (target != null) {
				Package targetPackage = containingPackage(target);
				if (targetPackage != null && targetPackage != tsPackage
						&& targetPackage.getPackageName() != null) {
					ret.add(targetPackage.getPackageName());
				}
				continue;
			}
			String specifier = reference.getModuleSpecifier();
			if (specifier == null || specifier.isBlank() || specifier.startsWith(".")) {
				continue;
			}
			// A specifier is name/subpath, or @scope/name/subpath.
			String[] segments = specifier.split("/");
			if (specifier.startsWith("@")) {
				if (segments.length >= 2) {
					ret.add(segments[0] + "/" + segments[1]);
				}
			} else {
				ret.add(segments[0]);
			}
		}
		return ret;
	}

	private static Package containingPackage(EObject element) {
		for (EObject container = element; container != null; container = container.eContainer()) {
			if (container instanceof Package tsPackage) {
				return tsPackage;
			}
		}
		return null;
	}

	private Package createPackage(EPackage ePackage) {
		Package ret = FACTORY.createPackage();
		ret.setName(ePackage.getName());
		ret.setPackageName(packageNameResolver.apply(ePackage));
		ret.setVersion(version);
		ret.setLicense(license);
		ret.setModuleType("module");
		ret.setDescription(documentation(ePackage));
		return ret;
	}

	private Module module(Package tsPackage, EPackage ePackage, String path) {
		Module ret = FACTORY.createModule();
		ret.setName(path);
		ret.setPath(path);
		ret.setHeader("// Generated from " + ePackage.getNsURI() + ". Do not edit.");
		tsPackage.getModules().add(ret);
		return ret;
	}

	// --- Declarations -------------------------------------------------------

	private Declaration declare(EClassifier eClassifier) {
		if (eClassifier instanceof EClass eClass) {
			InterfaceDeclaration ret = FACTORY.createInterfaceDeclaration();
			ret.setName(eClassifier.getName());
			ret.setExported(true);
			ret.setDocumentation(documentation(eClassifier));
			if (isEcoreEClass(eClass)) {
				// The synthetic type parameter, defaulted so that a bare `EClass` still
				// means something.
				TypeParameter typeParameter = FACTORY.createTypeParameter();
				typeParameter.setName(ECLASS_TYPE_PARAMETER);
				typeParameter.setDefault(primitive(PrimitiveType.UNKNOWN));
				ret.getTypeParameters().add(typeParameter);
			}
			return ret;
		}
		if (eClassifier instanceof EEnum eEnum) {
			EnumDeclaration ret = FACTORY.createEnumDeclaration();
			ret.setName(eEnum.getName());
			ret.setExported(true);
			ret.setDocumentation(documentation(eEnum));
			return ret;
		}
		if (eClassifier instanceof EDataType eDataType) {
			TypeAliasDeclaration ret = FACTORY.createTypeAliasDeclaration();
			ret.setName(eDataType.getName());
			ret.setExported(true);
			ret.setDocumentation(dataTypeDocumentation(eDataType));
			return ret;
		}
		return null;
	}

	private void populate(EClassifier eClassifier) {
		Declaration declaration = declarations.get(eClassifier);
		if (declaration == null) {
			return;
		}
		if (eClassifier instanceof EClass eClass) {
			populateEClass(eClass, (InterfaceDeclaration) declaration);
		} else if (eClassifier instanceof EEnum eEnum) {
			populateEEnum(eEnum, (EnumDeclaration) declaration);
		} else if (eClassifier instanceof EDataType eDataType) {
			((TypeAliasDeclaration) declaration).setType(underlyingType(eDataType));
		}
	}

	private void populateEClass(EClass eClass, InterfaceDeclaration declaration) {
		for (EClass superType : eClass.getESuperTypes()) {
			TypeReference reference = classifierReference(superType);
			if (reference != null) {
				declaration.getSuperTypes().add(reference);
			}
		}

		if (isEcoreEClass(eClass)) {
			// Phantom: readonly and optional, so T is covariant and every subtype can
			// narrow $eClass.
			Property phantom = FACTORY.createProperty();
			phantom.setName(ECLASS_PHANTOM_PROPERTY);
			phantom.setReadonly(true);
			phantom.setOptional(true);
			phantom.setType(typeParameterReference(ECLASS_TYPE_PARAMETER));
			phantom.setDocumentation(
					"Carries the instance type. Never present at runtime - it exists so that "
							+ "EClass is covariant in T and a subtype may narrow " + ECLASS_PROPERTY + ".");
			declaration.getMembers().add(phantom);
		}

		Property eClassProperty = FACTORY.createProperty();
		eClassProperty.setName(ECLASS_PROPERTY);
		eClassProperty.setReadonly(true);
		eClassProperty.setType(eClassReference(eClass));
		eClassProperty.setDocumentation("The metaclass this object is an instance of.");
		declaration.getMembers().add(eClassProperty);

		for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
			// Derived and transient features are computed rather than stored, so they
			// are absent from the JSON and would be a promise the loader cannot keep.
			// Volatile is NOT in this list: it means the feature has no field, not
			// that it is unserialized. Ecore's own ETypedElement.eType is volatile and
			// very much present in the JSON.
			if (feature.isDerived() || feature.isTransient()) {
				continue;
			}
			Property property = FACTORY.createProperty();
			property.setName(feature.getName());
			property.setReadonly(readOnly);
			// A single valued feature with a lower bound of zero may be absent. A many
			// valued one is always an array, empty at worst.
			property.setOptional(!feature.isMany() && feature.getLowerBound() == 0);
			property.setType(featureType(feature));
			property.setDocumentation(featureDocumentation(feature));
			declaration.getMembers().add(property);
		}
	}

	private void populateEEnum(EEnum eEnum, EnumDeclaration declaration) {
		for (EEnumLiteral literal : eEnum.getELiterals()) {
			EnumMember member = FACTORY.createEnumMember();
			member.setName(literal.getName());
			// EMF JSON writes the literal, not the name and not the ordinal.
			member.setValue(quote(literal.getLiteral()));
			member.setDocumentation(documentation(literal));
			declaration.getMembers().add(member);
		}
	}

	// --- Types --------------------------------------------------------------

	private TypeReference featureType(EStructuralFeature feature) {
		TypeReference elementType;
		if (feature instanceof EAttribute attribute) {
			elementType = dataTypeReference(attribute.getEAttributeType());
		} else if (feature instanceof EReference reference) {
			elementType = classifierReference(reference.getEReferenceType());
		} else {
			elementType = primitive(PrimitiveType.UNKNOWN);
		}
		if (elementType == null) {
			elementType = primitive(PrimitiveType.UNKNOWN);
		}
		if (feature.isMany()) {
			ArrayTypeReference ret = FACTORY.createArrayTypeReference();
			ret.setName(feature.getName());
			ret.setElementType(elementType);
			return ret;
		}
		return elementType;
	}

	/**
	 * A reference to a generated classifier. Resolves to a target when the
	 * classifier's EPackage is part of this run, and to a module specifier plus a
	 * qualified name otherwise.
	 */
	private TypeReference classifierReference(EClassifier eClassifier) {
		Declaration target = declarations.get(eClassifier);
		if (target != null) {
			NamedTypeReference ret = FACTORY.createNamedTypeReference();
			ret.setName(eClassifier.getName());
			ret.setTarget(target);
			return ret;
		}
		EPackage ePackage = eClassifier.getEPackage();
		if (ePackage == null) {
			return primitive(PrimitiveType.UNKNOWN);
		}
		NamedTypeReference ret = FACTORY.createNamedTypeReference();
		ret.setName(eClassifier.getName());
		ret.setQualifiedName(eClassifier.getName());
		ret.setModuleSpecifier(specifierOf(ePackage));
		return ret;
	}

	/**
	 * <code>EClass&lt;Self&gt;</code>, where Self carries its own type parameters
	 * so that EClass's own <code>$eClass</code> reads
	 * <code>EClass&lt;EClass&lt;T&gt;&gt;</code>.
	 */
	private TypeReference eClassReference(EClass eClass) {
		TypeReference self = classifierReference(eClass);
		if (self instanceof NamedTypeReference named && isEcoreEClass(eClass)) {
			named.getTypeArguments().add(typeParameterReference(ECLASS_TYPE_PARAMETER));
		}
		TypeReference eClassType = classifierReference(EcorePackage.Literals.ECLASS);
		if (eClassType instanceof NamedTypeReference named) {
			named.getTypeArguments().add(self);
		}
		return eClassType;
	}

	/**
	 * Data types map to their JSON representation, because that is what crosses
	 * the wire. Anything unrecognized falls back to <code>string</code>, which is
	 * what EMF JSON writes for a data type it serializes through the factory.
	 */
	private TypeReference dataTypeReference(EDataType eDataType) {
		if (eDataType instanceof EEnum) {
			return classifierReference(eDataType);
		}
		// A primitive beats the alias, even when the alias is being generated in this
		// run. Otherwise every package that has a string attribute would import
		// EString from the Ecore package, which is noise for no information.
		PrimitiveType primitiveType = primitiveTypeOf(eDataType);
		if (primitiveType != null) {
			return primitive(primitiveType);
		}
		// A data type with no primitive equivalent uses its alias, which is what
		// keeps Instant distinguishable from any other string.
		Declaration target = declarations.get(eDataType);
		if (target != null) {
			NamedTypeReference ret = FACTORY.createNamedTypeReference();
			ret.setName(eDataType.getName());
			ret.setTarget(target);
			return ret;
		}
		EPackage ePackage = eDataType.getEPackage();
		if (ePackage != null && !EcorePackage.eNS_URI.equals(ePackage.getNsURI())) {
			NamedTypeReference ret = FACTORY.createNamedTypeReference();
			ret.setName(eDataType.getName());
			ret.setQualifiedName(eDataType.getName());
			ret.setModuleSpecifier(specifierOf(ePackage));
			return ret;
		}
		return primitive(PrimitiveType.STRING);
	}

	/**
	 * What a data type alias resolves to. Deliberately does not consult the
	 * declaration map: that would find the alias being populated and emit
	 * <code>type Instant = Instant</code>.
	 */
	private TypeReference underlyingType(EDataType eDataType) {
		PrimitiveType primitiveType = primitiveTypeOf(eDataType);
		// EMF JSON serializes an unmapped data type through its factory, which
		// produces a string.
		return primitive(primitiveType == null ? PrimitiveType.STRING : primitiveType);
	}

	/**
	 * Maps an EDataType onto the JSON type EMF JSON writes for it.
	 */
	private static PrimitiveType primitiveTypeOf(EDataType eDataType) {
		String instanceClassName = eDataType.getInstanceClassName();
		if (instanceClassName == null) {
			return null;
		}
		return switch (instanceClassName) {
			case "java.lang.String", "char", "java.lang.Character" -> PrimitiveType.STRING;
			case "boolean", "java.lang.Boolean" -> PrimitiveType.BOOLEAN;
			case "int", "java.lang.Integer",
					"long", "java.lang.Long",
					"short", "java.lang.Short",
					"byte", "java.lang.Byte",
					"float", "java.lang.Float",
					"double", "java.lang.Double",
					"java.math.BigDecimal", "java.math.BigInteger" -> PrimitiveType.NUMBER;
			default -> null;
		};
	}

	private static PrimitiveTypeReference primitive(PrimitiveType type) {
		PrimitiveTypeReference ret = FACTORY.createPrimitiveTypeReference();
		ret.setName(type.getLiteral());
		ret.setPrimitiveType(type);
		return ret;
	}

	/**
	 * A bare name with no target and no module specifier, so nothing is imported.
	 */
	private static NamedTypeReference typeParameterReference(String name) {
		NamedTypeReference ret = FACTORY.createNamedTypeReference();
		ret.setName(name);
		ret.setQualifiedName(name);
		return ret;
	}

	/**
	 * The specifier for a classifier in an EPackage which is not part of this run.
	 * Classifiers live in the model module by construction, so the specifier is a
	 * subpath rather than the package root - which is also what the generator
	 * computes for the packages it does resolve, so the two agree.
	 */
	private String specifierOf(EPackage ePackage) {
		Package generated = packages.get(ePackage.getNsURI());
		String packageName;
		if (generated != null) {
			packageName = generated.getPackageName();
		} else if (EcorePackage.eNS_URI.equals(ePackage.getNsURI())) {
			packageName = ecorePackageName;
		} else {
			packageName = packageNameResolver.apply(ePackage);
		}
		return packageName + "/" + MODEL_MODULE + ".js";
	}

	private static boolean isEcoreEClass(EClass eClass) {
		return eClass == EcorePackage.Literals.ECLASS;
	}

	// --- The package module -------------------------------------------------

	/**
	 * Holds what a runtime needs in order to turn this package back into real
	 * metamodel objects: the nsURI, and the EPackage itself as EMF JSON.
	 */
	private void packageModule(Package tsPackage, EPackage ePackage, ResourceSet resourceSet) {
		Module module = module(tsPackage, ePackage, PACKAGE_MODULE);
		module.setDocumentation("Metamodel descriptor for " + ePackage.getName() + ".");

		module.getDeclarations().add(stringConstant("eNS_URI", ePackage.getNsURI(),
				"Namespace URI, which is what identifies this package in EMF JSON."));
		module.getDeclarations().add(stringConstant("eNS_PREFIX", ePackage.getNsPrefix(), null));
		module.getDeclarations().add(stringConstant("eNAME", ePackage.getName(), null));

		if (!descriptor) {
			return;
		}

		VariableDeclaration descriptorConstant = FACTORY.createVariableDeclaration();
		descriptorConstant.setName("descriptor");
		descriptorConstant.setExported(true);
		descriptorConstant.setVariableKind(VariableKind.CONST);
		descriptorConstant.setDocumentation("""
				This EPackage serialized as EMF JSON.

				It is data rather than a call into a runtime, so this module compiles on
				its own. A runtime resolves it into EClass objects, which is what the
				$eClass properties on the generated interfaces point at.""");
		// Record<string, unknown> rather than an inferred literal type: inferring a
		// metamodel sized object literal is slow and the shape is the runtime's
		// business, not the compiler's.
		OpaqueTypeReference descriptorType = FACTORY.createOpaqueTypeReference();
		descriptorType.setName("descriptor");
		descriptorType.setText("Record<string, unknown>");
		descriptorConstant.setType(descriptorType);
		CodeBlock initializer = FACTORY.createCodeBlock();
		initializer.setName("descriptor");
		initializer.setText(toJson(ePackage, resourceSet));
		descriptorConstant.setInitializer(initializer);
		module.getDeclarations().add(descriptorConstant);
	}

	private VariableDeclaration stringConstant(String name, String value, String documentation) {
		VariableDeclaration ret = FACTORY.createVariableDeclaration();
		ret.setName(name);
		ret.setExported(true);
		ret.setVariableKind(VariableKind.CONST);
		ret.setDocumentation(documentation);
		CodeBlock initializer = FACTORY.createCodeBlock();
		initializer.setName(name);
		initializer.setText(quote(value));
		ret.setInitializer(initializer);
		return ret;
	}

	private void indexModule(Package tsPackage, EPackage ePackage, List<String> runtimeModules) {
		Module module = module(tsPackage, ePackage, INDEX_MODULE);
		StringBuilder footer = new StringBuilder("""
				export * from "./model.js";
				export * as metamodel from "./package.js";""");
		for (String path : runtimeModules) {
			footer.append(System.lineSeparator())
					.append("export * from \"./").append(path).append(".js\";");
		}
		module.setFooter(footer.toString());
	}

	private List<String> runtimeModules(EPackage ePackage) {
		return runtime && EcorePackage.eNS_URI.equals(ePackage.getNsURI())
				? RUNTIME_MODULES
				: List.of();
	}

	/**
	 * A hand written module, carried through the model as an opaque footer. It
	 * goes through the same generator and lands in the same package, so the
	 * runtime ships with the types it belongs to rather than as a second artifact
	 * that has to be kept in step.
	 */
	private void runtimeModule(Package tsPackage, String path) {
		Module module = FACTORY.createModule();
		module.setName(path);
		module.setPath(path);
		// No generated banner: the file carries its own, and it says hand written.
		module.setFooter(readResource(RUNTIME_RESOURCE_PATH + path + ".ts"));
		tsPackage.getModules().add(module);
	}

	private static String readResource(String name) {
		try (var in = EcoreGenerator.class.getResourceAsStream(name)) {
			if (in == null) {
				throw new NasdanikaException("Resource not found: " + name);
			}
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		} catch (java.io.IOException e) {
			throw new NasdanikaException("Could not read " + name, e);
		}
	}

	// --- EMF JSON -----------------------------------------------------------

	/**
	 * Deep copies the EPackage and saves it to an in-memory JSON resource. The
	 * copy matters: saving the original would move it out of its own resource and
	 * leave the registry holding a detached package.
	 */
	public String toJson(EPackage ePackage, ResourceSet resourceSet) {
		EPackage copy = EcoreUtil.copy(ePackage);
		// Three slashes: "memory://x.json" parses x.json as the AUTHORITY, leaving no
		// segments and no file extension, so the resource set would hand back the
		// default XMI factory instead of the JSON one.
		Resource resource = resourceSet.createResource(
				URI.createURI("memory:///" + ePackage.getName() + ".ecore.json"));
		if (resource == null) {
			throw new NasdanikaException(
					"No resource factory for .json - is org.nasdanika.core:emf-json on the classpath?");
		}
		resource.getContents().add(copy);
		try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			resource.save(out, null);
			return out.toString(StandardCharsets.UTF_8);
		} catch (Exception e) {
			throw new NasdanikaException("Could not serialize " + ePackage.getNsURI() + ": " + e, e);
		} finally {
			resourceSet.getResources().remove(resource);
		}
	}

	// --- Documentation ------------------------------------------------------

	private static String documentation(EModelElement eModelElement) {
		var annotation = eModelElement.getEAnnotation(GEN_MODEL_ANNOTATION);
		if (annotation == null) {
			return null;
		}
		return stripCommentMarkers(annotation.getDetails().get("documentation"));
	}

	/**
	 * Xcore carries the body of a doc comment into the GenModel annotation with
	 * the leading asterisk of the opening line still attached. Emitting that
	 * verbatim produces a JSDoc whose first line is a lone asterisk.
	 */
	private static String stripCommentMarkers(String documentation) {
		if (documentation == null) {
			return null;
		}
		List<String> lines = new ArrayList<>(List.of(documentation.split("\r?\n")));
		while (!lines.isEmpty() && isCommentMarker(lines.get(0))) {
			lines.remove(0);
		}
		while (!lines.isEmpty() && isCommentMarker(lines.get(lines.size() - 1))) {
			lines.remove(lines.size() - 1);
		}
		String ret = String.join(System.lineSeparator(), lines).strip();
		return ret.isEmpty() ? null : ret;
	}

	/**
	 * A line which is blank, or which is nothing but an asterisk. A line which
	 * merely starts with an asterisk is left alone - that is a bullet.
	 */
	private static boolean isCommentMarker(String line) {
		return line.isBlank() || line.strip().equals("*");
	}

	private static String dataTypeDocumentation(EDataType eDataType) {
		String documentation = documentation(eDataType);
		StringBuilder ret = new StringBuilder(documentation == null ? "" : documentation.strip());
		if (ret.length() > 0) {
			ret.append(System.lineSeparator()).append(System.lineSeparator());
		}
		ret.append("EDataType, serialized by EMF JSON through its factory.");
		String instanceClassName = eDataType.getInstanceClassName();
		if (instanceClassName != null) {
			ret.append(" Instance class: ").append(instanceClassName).append(".");
		}
		return ret.toString();
	}

	private static String featureDocumentation(EStructuralFeature feature) {
		String documentation = documentation(feature);
		StringBuilder ret = new StringBuilder(documentation == null ? "" : documentation.strip());
		if (feature instanceof EReference reference && !reference.isContainment()) {
			if (ret.length() > 0) {
				ret.append(System.lineSeparator()).append(System.lineSeparator());
			}
			// Worth stating, because the JSON holds a $ref here and the type says
			// otherwise - it is the loader that closes the gap.
			ret.append("Non-containment reference: EMF JSON writes a $ref, which the loader resolves.");
		}
		return ret.length() == 0 ? null : ret.toString();
	}

	private static String quote(String value) {
		if (value == null) {
			return "undefined";
		}
		StringBuilder ret = new StringBuilder("\"");
		for (char c : value.toCharArray()) {
			switch (c) {
				case '"' -> ret.append("\\\"");
				case '\\' -> ret.append("\\\\");
				case '\n' -> ret.append("\\n");
				case '\r' -> ret.append("\\r");
				case '\t' -> ret.append("\\t");
				default -> ret.append(c);
			}
		}
		return ret.append("\"").toString();
	}

}
