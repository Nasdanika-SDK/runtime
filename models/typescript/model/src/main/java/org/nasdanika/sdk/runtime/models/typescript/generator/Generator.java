package org.nasdanika.sdk.runtime.models.typescript.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.sdk.runtime.common.NasdanikaException;
import org.nasdanika.sdk.runtime.models.typescript.Accessor;
import org.nasdanika.sdk.runtime.models.typescript.AccessorKind;
import org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Callable;
import org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Constructor;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumMember;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Member;
import org.nasdanika.sdk.runtime.models.typescript.Method;
import org.nasdanika.sdk.runtime.models.typescript.Module;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueMember;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;
import org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.Visibility;
import org.nasdanika.sdk.runtime.volume.GenericVolume;
import org.nasdanika.sdk.runtime.volume.GenericVolume.Entry;

/**
 * Writes TypeScript sources from a {@link Package} or a {@link Module} to a
 * {@link GenericVolume GenericVolume&lt;String&gt;} with the
 * {@link GenericVolume.Writable} capability. The generator knows nothing about
 * where the characters end up: adapt a NIO volume to text to write files, or
 * use any other volume. Missing directories are created through the volume.
 * <p>
 * The generator owns import management. {@link Module#getImports()} is normally
 * left empty by the transformation which builds the model: this class walks the
 * {@link TypeReference}s reachable in a module, resolves each
 * {@link NamedTypeReference#getTarget()} to the module and package which declare
 * it, works out the module specifier, decides whether the import can be
 * <code>import type</code>, and aliases names which would otherwise collide.
 * Imports which are authored explicitly - side effect imports, and types used
 * only inside opaque text without a <code>references</code> entry - are emitted
 * as written and their local names are reserved so computed imports do not
 * collide with them.
 * <p>
 * The generator is write only. Nothing here parses TypeScript.
 */
public class Generator {

	/**
	 * Emitted when a module specifier has to be written for a relative import.
	 * Relative ESM specifiers carry a <code>.js</code> extension even in
	 * <code>.ts</code> source under <code>moduleResolution: "NodeNext"</code>,
	 * because the specifier names the <em>compiled</em> file.
	 */
	public static final String RELATIVE_IMPORT_EXTENSION = ".js";

	public static final String SOURCE_EXTENSION = ".ts";

	public static final String DECLARATION_EXTENSION = ".d.ts";

	public static final String PACKAGE_JSON = "package.json";

	public static final String TSCONFIG_JSON = "tsconfig.json";

	/**
	 * Module path treated as the package entry point.
	 */
	public static final String INDEX_PATH = "index";

	private String indent = "  ";

	private String sourceRoot = "src";

	private String defaultDependencyVersion = "*";

	public Generator() {
	}

	/**
	 * @param indent indentation unit, two spaces by default.
	 */
	public Generator setIndent(String indent) {
		this.indent = indent;
		return this;
	}

	/**
	 * Directory module paths are written under, matching <code>rootDir</code> in
	 * the generated <code>tsconfig.json</code>. Set to an empty string to write
	 * modules at the package root. Module paths themselves stay root relative, so
	 * this does not affect the relative specifiers between them.
	 */
	public Generator setSourceRoot(String sourceRoot) {
		this.sourceRoot = sourceRoot == null ? "" : sourceRoot;
		return this;
	}

	/**
	 * Version used for dependency specifiers which do not carry one. A dependency
	 * may be written as <code>lodash</code> or as <code>lodash@^4.17.0</code>; for
	 * the former this value is used.
	 */
	public Generator setDefaultDependencyVersion(String defaultDependencyVersion) {
		this.defaultDependencyVersion = defaultDependencyVersion;
		return this;
	}

	// --- Package generation -------------------------------------------------

	/**
	 * Generates <code>package.json</code>, <code>tsconfig.json</code> and all
	 * module sources of a package at the root of a volume.
	 */
	public void generate(Package tsPackage, GenericVolume<String> volume) {
		generate(tsPackage, null, volume);
	}

	/**
	 * Generates <code>package.json</code>, <code>tsconfig.json</code> and all
	 * module sources of a package.
	 *
	 * @param tsPackage package to generate.
	 * @param basePath  volume path the module paths are resolved against.
	 *                  <code>null</code>, empty or <code>.</code> for the root
	 *                  of the volume.
	 * @param volume    where the sources go. Must be writable.
	 */
	public void generate(Package tsPackage, String basePath, GenericVolume<String> volume) {
		write(volume, resolve(basePath, PACKAGE_JSON), generatePackageJson(tsPackage));
		write(volume, resolve(basePath, TSCONFIG_JSON), generateTsConfigJson(tsPackage));
		for (Module module : tsPackage.getModules()) {
			generate(module, basePath, volume);
		}
	}

	/**
	 * Generates a single module.
	 */
	public void generate(Module module, String basePath, GenericVolume<String> volume) {
		String path = module.getPath();
		if (path == null || path.isBlank()) {
			throw new NasdanikaException("Module path is not set: " + module);
		}
		String fileName = (sourceRoot.isEmpty() ? "" : sourceRoot + "/") + path + fileExtension(module);
		write(volume, resolve(basePath, fileName), generate(module));
	}

	/**
	 * Extension of the file a module is written to, <code>.ts</code> or <code>.d.ts</code>.
	 * Override for modules of other kinds, e.g. <code>.tsx</code>.
	 */
	protected String fileExtension(Module module) {
		return module.isDeclarationOnly() ? DECLARATION_EXTENSION : SOURCE_EXTENSION;
	}

	/**
	 * Generates the source of a module and returns it instead of writing it.
	 */
	public String generate(Module module) {
		ImportManager importManager = new ImportManager(module);

		StringBuilder body = new StringBuilder();
		for (Declaration declaration : module.getDeclarations()) {
			if (body.length() > 0) {
				body.append(System.lineSeparator());
			}
			body.append(declaration(declaration, module.isDeclarationOnly(), importManager));
		}

		StringBuilder ret = new StringBuilder();
		String header = module.getHeader();
		if (!isBlank(header)) {
			ret.append(header);
			if (!header.endsWith("\n")) {
				ret.append(System.lineSeparator());
			}
			ret.append(System.lineSeparator());
		}

		String imports = importManager.generate();
		if (!imports.isEmpty()) {
			ret.append(imports).append(System.lineSeparator());
		}

		ret.append(body);

		String footer = module.getFooter();
		if (!isBlank(footer)) {
			ret.append(System.lineSeparator()).append(footer);
			if (!footer.endsWith("\n")) {
				ret.append(System.lineSeparator());
			}
		}
		return ret.toString();
	}

	// --- package.json / tsconfig.json ---------------------------------------

	public String generatePackageJson(Package tsPackage) {
		Map<String, Object> json = new LinkedHashMap<>();
		json.put("name", orDefault(tsPackage.getPackageName(), tsPackage.getName()));
		json.put("version", orDefault(tsPackage.getVersion(), "0.0.0"));
		if (!isBlank(tsPackage.getDescription())) {
			json.put("description", tsPackage.getDescription());
		}
		if (!isBlank(tsPackage.getLicense())) {
			json.put("license", tsPackage.getLicense());
		}
		json.put("type", orDefault(tsPackage.getModuleType(), "module"));

		boolean hasIndex = tsPackage.getModules().stream().anyMatch(m -> INDEX_PATH.equals(m.getPath()));
		Map<String, Object> exports = new LinkedHashMap<>();
		if (hasIndex) {
			json.put("main", "./dist/index.js");
			json.put("types", "./dist/index.d.ts");
			exports.put(".", conditions("./dist/index"));
		}
		if (tsPackage.getModules().stream().anyMatch(m -> !INDEX_PATH.equals(m.getPath()))) {
			// A cross package reference to a module which is not the entry point is
			// written as "<package>/<path>.js", and without a subpath export the
			// package's own encapsulation would make that unresolvable. The pattern
			// matches ./model.js with * bound to "model", which is why the extension is
			// part of the key rather than part of the wildcard.
			exports.put("./*.js", conditions("./dist/*"));
		}
		if (!exports.isEmpty()) {
			json.put("exports", exports);
		}
		json.put("files", List.of("dist"));
		Map<String, Object> scripts = new LinkedHashMap<>();
		scripts.put("build", "tsc");
		scripts.put("clean", "node -e \"require('fs').rmSync('dist',{recursive:true,force:true})\"");
		scripts.put("prepublishOnly", "npm run clean && npm run build");
		json.put("scripts", scripts);

		Map<String, Object> dependencies = dependencies(tsPackage.getDependencies());
		if (!dependencies.isEmpty()) {
			json.put("dependencies", dependencies);
		}
		Map<String, Object> peerDependencies = dependencies(tsPackage.getPeerDependencies());
		if (!peerDependencies.isEmpty()) {
			json.put("peerDependencies", peerDependencies);
		}
		return json(json, "") + System.lineSeparator();
	}

	public String generateTsConfigJson(Package tsPackage) {
		Map<String, Object> json = new LinkedHashMap<>();
		json.put("compilerOptions", compilerOptions(tsPackage));
		json.put("include", List.of(sourceRoot.isEmpty() ? "." : sourceRoot));
		return json(json, "") + System.lineSeparator();
	}

	/**
	 * <code>compilerOptions</code> of the generated <code>tsconfig.json</code>.
	 * Override to add options, e.g. <code>jsx</code>.
	 */
	protected Map<String, Object> compilerOptions(Package tsPackage) {
		Map<String, Object> compilerOptions = new LinkedHashMap<>();
		compilerOptions.put("target", "ES2022");
		compilerOptions.put("module", "NodeNext");
		compilerOptions.put("moduleResolution", "NodeNext");
		compilerOptions.put("strict", true);
		compilerOptions.put("declaration", true);
		compilerOptions.put("declarationMap", true);
		compilerOptions.put("sourceMap", true);
		compilerOptions.put("outDir", "dist");
		compilerOptions.put("rootDir", sourceRoot.isEmpty() ? "." : sourceRoot);
		compilerOptions.put("skipLibCheck", true);
		compilerOptions.put("forceConsistentCasingInFileNames", true);
		return compilerOptions;
	}

	/**
	 * The conditional exports for one target, types first - Node picks the first
	 * matching condition, and a "types" entry after "default" is never reached.
	 */
	private static Map<String, Object> conditions(String target) {
		Map<String, Object> ret = new LinkedHashMap<>();
		ret.put("types", target + ".d.ts");
		ret.put("default", target + ".js");
		return ret;
	}

	private Map<String, Object> dependencies(Collection<String> specifiers) {
		Map<String, Object> ret = new LinkedHashMap<>();
		for (String specifier : specifiers) {
			if (isBlank(specifier)) {
				continue;
			}
			// A scoped name starts with @, so only an @ past position 0 separates a version.
			int idx = specifier.indexOf('@', 1);
			if (idx == -1) {
				ret.put(specifier, defaultDependencyVersion);
			} else {
				ret.put(specifier.substring(0, idx), specifier.substring(idx + 1));
			}
		}
		return ret;
	}

	// --- Declarations -------------------------------------------------------

	protected String declaration(Declaration declaration, boolean declarationOnly, ImportManager im) {
		StringBuilder ret = new StringBuilder();
		ret.append(jsDoc(declaration, ""));

		StringBuilder modifiers = new StringBuilder();
		if (declaration.isExported()) {
			modifiers.append("export ");
		}
		// In a .d.ts the whole file is an ambient context, so `declare` is noise.
		if (declaration.isAmbient() && !declarationOnly) {
			modifiers.append("declare ");
		}

		if (declaration instanceof InterfaceDeclaration id) {
			ret.append(interfaceDeclaration(id, modifiers.toString(), declarationOnly, im));
		} else if (declaration instanceof ClassDeclaration cd) {
			ret.append(classDeclaration(cd, modifiers.toString(), declarationOnly, im));
		} else if (declaration instanceof TypeAliasDeclaration tad) {
			ret.append(typeAliasDeclaration(tad, modifiers.toString(), im));
		} else if (declaration instanceof EnumDeclaration ed) {
			ret.append(enumDeclaration(ed, modifiers.toString()));
		} else if (declaration instanceof FunctionDeclaration fd) {
			ret.append(functionDeclaration(fd, modifiers.toString(), declarationOnly, im));
		} else if (declaration instanceof VariableDeclaration vd) {
			ret.append(variableDeclaration(vd, modifiers.toString(), declarationOnly, im));
		} else {
			throw new NasdanikaException("Unsupported declaration type: " + declaration.eClass().getName());
		}
		return ret.toString();
	}

	private String interfaceDeclaration(InterfaceDeclaration id, String modifiers, boolean declarationOnly,
			ImportManager im) {
		StringBuilder ret = new StringBuilder(modifiers).append("interface ").append(name(id));
		ret.append(typeParameters(id.getTypeParameters(), im));
		if (!id.getSuperTypes().isEmpty()) {
			ret.append(" extends ").append(typeReferences(id.getSuperTypes(), ", ", im));
		}
		ret.append(" {").append(System.lineSeparator());
		// Interface members carry no visibility, no static and no bodies.
		ret.append(members(id.getMembers(), true, im));
		ret.append("}").append(System.lineSeparator());
		return ret.toString();
	}

	private String classDeclaration(ClassDeclaration cd, String modifiers, boolean declarationOnly, ImportManager im) {
		StringBuilder ret = new StringBuilder(modifiers);
		if (cd.isAbstract()) {
			ret.append("abstract ");
		}
		ret.append("class ").append(name(cd));
		ret.append(typeParameters(cd.getTypeParameters(), im));
		if (cd.getSuperClass() != null) {
			ret.append(" extends ").append(typeReference(cd.getSuperClass(), im));
		}
		if (!cd.getInterfaces().isEmpty()) {
			ret.append(" implements ").append(typeReferences(cd.getInterfaces(), ", ", im));
		}
		ret.append(" {").append(System.lineSeparator());
		ret.append(members(cd.getMembers(), declarationOnly, im));
		ret.append("}").append(System.lineSeparator());
		return ret.toString();
	}

	private String typeAliasDeclaration(TypeAliasDeclaration tad, String modifiers, ImportManager im) {
		return modifiers + "type " + name(tad) + typeParameters(tad.getTypeParameters(), im) + " = "
				+ typeReference(tad.getType(), im) + ";" + System.lineSeparator();
	}

	private String enumDeclaration(EnumDeclaration ed, String modifiers) {
		StringBuilder ret = new StringBuilder(modifiers);
		if (ed.isConstant()) {
			ret.append("const ");
		}
		ret.append("enum ").append(name(ed)).append(" {").append(System.lineSeparator());
		for (Iterator<EnumMember> it = ed.getMembers().iterator(); it.hasNext();) {
			EnumMember member = it.next();
			ret.append(jsDoc(member, indent));
			ret.append(indent).append(name(member));
			if (!isBlank(member.getValue())) {
				ret.append(" = ").append(member.getValue());
			}
			ret.append(",").append(System.lineSeparator());
		}
		ret.append("}").append(System.lineSeparator());
		return ret.toString();
	}

	private String functionDeclaration(FunctionDeclaration fd, String modifiers, boolean declarationOnly,
			ImportManager im) {
		StringBuilder ret = new StringBuilder(modifiers);
		boolean bodiless = declarationOnly || fd.isAmbient() || fd.getBody() == null;
		if (fd.isAsync() && !bodiless) {
			ret.append("async ");
		}
		ret.append("function");
		if (fd.isGenerator()) {
			ret.append("*");
		}
		ret.append(" ").append(name(fd));
		ret.append(signature(fd, im));
		if (bodiless) {
			ret.append(";").append(System.lineSeparator());
		} else {
			ret.append(" ").append(body(fd.getBody(), "", im)).append(System.lineSeparator());
		}
		return ret.toString();
	}

	private String variableDeclaration(VariableDeclaration vd, String modifiers, boolean declarationOnly,
			ImportManager im) {
		StringBuilder ret = new StringBuilder(modifiers);
		ret.append(switch (vd.getVariableKind()) {
			case LET -> "let ";
			case VAR -> "var ";
			default -> "const ";
		});
		ret.append(name(vd));

		// VariableDeclaration is also Callable: with no initializer but with a body it
		// is emitted as an arrow function, which is how a generated function which has
		// to be a const ends up looking idiomatic.
		boolean arrow = vd.getBody() != null && vd.getInitializer() == null && !declarationOnly;
		if (arrow) {
			ret.append(" = ");
			if (vd.isAsync()) {
				ret.append("async ");
			}
			ret.append(typeParameters(vd.getTypeParameters(), im));
			ret.append(parameters(vd.getParameters(), im));
			if (vd.getReturnType() != null) {
				ret.append(": ").append(typeReference(vd.getReturnType(), im));
			}
			ret.append(" => ").append(body(vd.getBody(), "", im));
		} else {
			if (vd.getType() != null) {
				ret.append(": ").append(typeReference(vd.getType(), im));
			}
			if (vd.getInitializer() != null && !declarationOnly) {
				ret.append(" = ").append(expression(vd.getInitializer(), "", im));
			}
		}
		ret.append(";").append(System.lineSeparator());
		return ret.toString();
	}

	// --- Members ------------------------------------------------------------

	private String members(List<Member> members, boolean bodiless, ImportManager im) {
		StringBuilder ret = new StringBuilder();
		for (Member member : members) {
			ret.append(jsDoc(member, indent));
			ret.append(indent).append(member(member, bodiless, im));
		}
		return ret.toString();
	}

	private String member(Member member, boolean bodiless, ImportManager im) {
		StringBuilder ret = new StringBuilder();
		if (member instanceof OpaqueMember om) {
			// Verbatim: index signatures, call signatures, overload sets. reindent()
			// already terminates the last line.
			return reindent(om.getText(), indent).stripLeading();
		}

		// An interface member has no visibility and no static; `bodiless` doubles as
		// "this is an interface or a .d.ts" because both suppress the same things.
		if (!bodiless) {
			Visibility visibility = member.getVisibility();
			if (visibility != null && visibility != Visibility.PUBLIC) {
				ret.append(visibility.getLiteral().toLowerCase()).append(" ");
			}
			if (member.isStatic()) {
				ret.append("static ");
			}
		}

		if (member instanceof Property property) {
			if (property.isReadonly()) {
				ret.append("readonly ");
			}
			ret.append(name(property));
			if (property.isOptional()) {
				ret.append("?");
			}
			if (property.getType() != null) {
				ret.append(": ").append(typeReference(property.getType(), im));
			}
			if (property.getInitializer() != null && !bodiless) {
				ret.append(" = ").append(expression(property.getInitializer(), indent, im));
			}
			ret.append(";");
		} else if (member instanceof Constructor ctor) {
			ret.append("constructor").append(parameters(ctor.getParameters(), im));
			if (ctor.getBody() == null || bodiless) {
				ret.append(";");
			} else {
				ret.append(" ").append(body(ctor.getBody(), indent, im));
			}
		} else if (member instanceof Accessor accessor) {
			ret.append(accessor.getAccessorKind() == AccessorKind.SET ? "set " : "get ");
			ret.append(name(accessor));
			ret.append(parameters(accessor.getParameters(), im));
			if (accessor.getAccessorKind() != AccessorKind.SET && accessor.getReturnType() != null) {
				ret.append(": ").append(typeReference(accessor.getReturnType(), im));
			}
			if (accessor.getBody() == null || bodiless) {
				ret.append(";");
			} else {
				ret.append(" ").append(body(accessor.getBody(), indent, im));
			}
		} else if (member instanceof Method method) {
			boolean noBody = bodiless || method.isAbstract() || method.getBody() == null;
			if (method.isAbstract() && !bodiless) {
				ret.append("abstract ");
			}
			if (method.isAsync() && !noBody) {
				ret.append("async ");
			}
			if (method.isGenerator()) {
				ret.append("*");
			}
			ret.append(name(method));
			if (method.isOptional()) {
				ret.append("?");
			}
			ret.append(signature(method, im));
			if (noBody) {
				ret.append(";");
			} else {
				ret.append(" ").append(body(method.getBody(), indent, im));
			}
		} else {
			throw new NasdanikaException("Unsupported member type: " + member.eClass().getName());
		}
		ret.append(System.lineSeparator());
		return ret.toString();
	}

	// --- Signatures ---------------------------------------------------------

	protected String signature(Callable callable, ImportManager im) {
		StringBuilder ret = new StringBuilder();
		ret.append(typeParameters(callable.getTypeParameters(), im));
		ret.append(parameters(callable.getParameters(), im));
		if (callable.getReturnType() != null) {
			ret.append(": ").append(typeReference(callable.getReturnType(), im));
		}
		return ret.toString();
	}

	protected String typeParameters(List<TypeParameter> typeParameters, ImportManager im) {
		if (typeParameters.isEmpty()) {
			return "";
		}
		StringBuilder ret = new StringBuilder("<");
		for (Iterator<TypeParameter> it = typeParameters.iterator(); it.hasNext();) {
			TypeParameter tp = it.next();
			ret.append(name(tp));
			if (tp.getConstraint() != null) {
				ret.append(" extends ").append(typeReference(tp.getConstraint(), im));
			}
			if (tp.getDefault() != null) {
				ret.append(" = ").append(typeReference(tp.getDefault(), im));
			}
			if (it.hasNext()) {
				ret.append(", ");
			}
		}
		return ret.append(">").toString();
	}

	protected String parameters(List<Parameter> parameters, ImportManager im) {
		StringBuilder ret = new StringBuilder("(");
		for (Iterator<Parameter> it = parameters.iterator(); it.hasNext();) {
			Parameter parameter = it.next();
			if (parameter.isRest()) {
				ret.append("...");
			}
			ret.append(name(parameter));
			// A parameter cannot be both optional and defaulted - the default implies it.
			if (parameter.isOptional() && parameter.getDefaultValue() == null) {
				ret.append("?");
			}
			if (parameter.getType() != null) {
				ret.append(": ").append(typeReference(parameter.getType(), im));
			}
			if (parameter.getDefaultValue() != null) {
				ret.append(" = ").append(expression(parameter.getDefaultValue(), "", im));
			}
			if (it.hasNext()) {
				ret.append(", ");
			}
		}
		return ret.append(")").toString();
	}

	// --- Type references ----------------------------------------------------

	private String typeReferences(List<TypeReference> references, String separator, ImportManager im) {
		StringBuilder ret = new StringBuilder();
		for (Iterator<TypeReference> it = references.iterator(); it.hasNext();) {
			ret.append(typeReference(it.next(), im));
			if (it.hasNext()) {
				ret.append(separator);
			}
		}
		return ret.toString();
	}

	protected String typeReference(TypeReference reference, ImportManager im) {
		if (reference == null) {
			return "unknown";
		}
		if (reference instanceof PrimitiveTypeReference ptr) {
			return primitiveType(ptr);
		}
		if (reference instanceof NamedTypeReference ntr) {
			StringBuilder ret = new StringBuilder(im.localName(ntr));
			if (!ntr.getTypeArguments().isEmpty()) {
				ret.append("<").append(typeReferences(ntr.getTypeArguments(), ", ", im)).append(">");
			}
			return ret.toString();
		}
		if (reference instanceof ArrayTypeReference atr) {
			// A union, intersection or function element type has to be parenthesized
			// before [] binds to it.
			String element = typeReference(atr.getElementType(), im);
			return needsParentheses(atr.getElementType()) ? "(" + element + ")[]" : element + "[]";
		}
		if (reference instanceof UnionTypeReference utr) {
			return join(utr.getTypes(), " | ", im);
		}
		if (reference instanceof IntersectionTypeReference itr) {
			return join(itr.getTypes(), " & ", im);
		}
		if (reference instanceof LiteralTypeReference ltr) {
			return switch (ltr.getLiteralKind()) {
				case STRING -> quote(ltr.getValue());
				default -> ltr.getValue();
			};
		}
		if (reference instanceof TypeLiteralReference tlr) {
			if (tlr.getMembers().isEmpty()) {
				return "{}";
			}
			StringBuilder ret = new StringBuilder("{ ");
			for (Iterator<Member> it = tlr.getMembers().iterator(); it.hasNext();) {
				// Inline object type members are always bodiless and always one line.
				// They are separated by "; " with no trailing separator, which is how
				// TypeScript itself formats them.
				String text = member(it.next(), true, im).strip();
				if (text.endsWith(";")) {
					text = text.substring(0, text.length() - 1);
				}
				ret.append(text);
				if (it.hasNext()) {
					ret.append("; ");
				}
			}
			return ret.append(" }").toString();
		}
		if (reference instanceof FunctionTypeReference ftr) {
			return parameters(ftr.getParameters(), im) + " => " + typeReference(ftr.getReturnType(), im);
		}
		if (reference instanceof OpaqueTypeReference otr) {
			return otr.getText() == null ? "unknown" : otr.getText().strip();
		}
		throw new NasdanikaException("Unsupported type reference: " + reference.eClass().getName());
	}

	private String join(List<TypeReference> types, String separator, ImportManager im) {
		StringBuilder ret = new StringBuilder();
		for (Iterator<TypeReference> it = types.iterator(); it.hasNext();) {
			TypeReference type = it.next();
			String text = typeReference(type, im);
			ret.append(type instanceof FunctionTypeReference ? "(" + text + ")" : text);
			if (it.hasNext()) {
				ret.append(separator);
			}
		}
		return ret.toString();
	}

	private boolean needsParentheses(TypeReference reference) {
		return reference instanceof UnionTypeReference
				|| reference instanceof IntersectionTypeReference
				|| reference instanceof FunctionTypeReference
				|| reference instanceof OpaqueTypeReference;
	}

	private String primitiveType(PrimitiveTypeReference ptr) {
		if (ptr.getPrimitiveType() == null) {
			return "unknown";
		}
		return switch (ptr.getPrimitiveType()) {
			case STRING -> "string";
			case NUMBER -> "number";
			case BOOLEAN -> "boolean";
			case BIGINT -> "bigint";
			case SYMBOL -> "symbol";
			case NULL -> "null";
			case UNDEFINED -> "undefined";
			case VOID -> "void";
			case NEVER -> "never";
			case UNKNOWN -> "unknown";
			case ANY -> "any";
			case OBJECT -> "object";
		};
	}

	// --- Text helpers -------------------------------------------------------

	protected String name(org.nasdanika.sdk.runtime.models.core.NamedElement element) {
		String name = element.getName();
		if (isBlank(name)) {
			throw new NasdanikaException("Name is not set: " + element);
		}
		return name;
	}

	protected String jsDoc(org.nasdanika.sdk.runtime.models.core.ModelElement element, String prefix) {
		String documentation = element.getDocumentation();
		if (isBlank(documentation)) {
			return "";
		}
		StringBuilder ret = new StringBuilder(prefix).append("/**").append(System.lineSeparator());
		for (String line : documentation.strip().split("\r?\n")) {
			ret.append(prefix).append(" *");
			if (!line.isBlank()) {
				ret.append(" ").append(line.stripTrailing());
			}
			ret.append(System.lineSeparator());
		}
		return ret.append(prefix).append(" */").append(System.lineSeparator()).toString();
	}

	/**
	 * Source text of a code block. Override to generate text for structured code blocks,
	 * e.g. JSX. The text is re-indented by the caller.
	 *
	 * @param asBody true if the block is a function body, false if it is an expression
	 */
	protected String code(CodeBlock block, boolean asBody, ImportManager im) {
		return block.getText();
	}

	protected String getIndent() {
		return indent;
	}

	/**
	 * Wraps a code block in braces and re-indents it relative to the enclosing
	 * construct. The block's own authored indentation is normalized away first, so
	 * the same block reads correctly at any nesting depth.
	 */
	protected String body(CodeBlock block, String prefix, ImportManager im) {
		String text = code(block, true, im);
		if (isBlank(text)) {
			return "{}";
		}
		return "{" + System.lineSeparator() + reindent(text, prefix + indent) + prefix + "}";
	}

	/**
	 * A code block used as an expression rather than as a body: an initializer, a
	 * default value. No braces, and the first line is not indented because it
	 * continues the line it sits on.
	 */
	protected String expression(CodeBlock block, String prefix, ImportManager im) {
		String text = code(block, false, im);
		if (isBlank(text)) {
			return "undefined";
		}
		return reindent(text, prefix).strip();
	}

	/**
	 * Strips the common leading whitespace from every non-blank line and re-indents
	 * with the given prefix.
	 */
	protected String reindent(String text, String prefix) {
		if (text == null) {
			return "";
		}
		List<String> lines = new ArrayList<>(List.of(text.strip().split("\r?\n")));
		int common = Integer.MAX_VALUE;
		for (String line : lines) {
			if (line.isBlank()) {
				continue;
			}
			int leading = 0;
			while (leading < line.length() && Character.isWhitespace(line.charAt(leading))) {
				++leading;
			}
			common = Math.min(common, leading);
		}
		if (common == Integer.MAX_VALUE) {
			common = 0;
		}
		StringBuilder ret = new StringBuilder();
		for (String line : lines) {
			if (line.isBlank()) {
				ret.append(System.lineSeparator());
			} else {
				ret.append(prefix).append(line.substring(common).stripTrailing()).append(System.lineSeparator());
			}
		}
		return ret.toString();
	}

	protected static String quote(String value) {
		if (value == null) {
			return "\"\"";
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

	// --- JSON ---------------------------------------------------------------

	@SuppressWarnings("unchecked")
	private String json(Object value, String prefix) {
		if (value == null) {
			return "null";
		}
		if (value instanceof String str) {
			return quote(str);
		}
		if (value instanceof Boolean || value instanceof Number) {
			return String.valueOf(value);
		}
		String childPrefix = prefix + indent;
		if (value instanceof Map<?, ?> map) {
			if (map.isEmpty()) {
				return "{}";
			}
			StringBuilder ret = new StringBuilder("{").append(System.lineSeparator());
			for (Iterator<?> it = map.entrySet().iterator(); it.hasNext();) {
				Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
				ret.append(childPrefix).append(quote(entry.getKey())).append(": ")
						.append(json(entry.getValue(), childPrefix));
				ret.append(it.hasNext() ? "," : "").append(System.lineSeparator());
			}
			return ret.append(prefix).append("}").toString();
		}
		if (value instanceof Collection<?> collection) {
			if (collection.isEmpty()) {
				return "[]";
			}
			StringBuilder ret = new StringBuilder("[").append(System.lineSeparator());
			for (Iterator<?> it = collection.iterator(); it.hasNext();) {
				ret.append(childPrefix).append(json(it.next(), childPrefix));
				ret.append(it.hasNext() ? "," : "").append(System.lineSeparator());
			}
			return ret.append(prefix).append("]").toString();
		}
		return quote(String.valueOf(value));
	}

	// --- Import management --------------------------------------------------

	/**
	 * Resolves the {@link NamedTypeReference}s of one module into import statements
	 * and local names. Constructed before any declaration is emitted, because a
	 * reference cannot be written until it is known which local name it resolves
	 * to, and it cannot be known which local name it resolves to until every
	 * reference in the module has been seen.
	 */
	/**
	 * A reference the import manager registers although it is not contained in the module,
	 * e.g. a library function generated code calls. Resolved like a contained reference:
	 * by {@link NamedTypeReference#getTarget()}, or by qualified name and module specifier.
	 */
	public record ImplicitReference(NamedTypeReference reference, boolean typeOnly) {}

	/**
	 * References generated code needs in addition to the ones contained in the module.
	 * None by default.
	 */
	protected List<ImplicitReference> implicitReferences(Module module) {
		return List.of();
	}

	/**
	 * A reference is in a value position when the emitted code evaluates it at
	 * runtime rather than only in a type annotation: the <code>extends</code>
	 * clause of a class, and anything a code block or an opaque member declares it
	 * uses. Opaque <em>type</em> references are type positions by construction.
	 * <p>
	 * Ambiguity resolves towards value, because a value import of a type is merely
	 * less tree-shakeable, while a type import of a value is erased and breaks at
	 * runtime.
	 * <p>
	 * Override for structured code which is not a code block, e.g. JSX.
	 */
	protected boolean isValuePosition(NamedTypeReference reference) {
		EObject container = reference.eContainer();
		EReference containment = reference.eContainmentFeature();
		if (container instanceof ClassDeclaration
				&& containment == TypescriptPackage.Literals.CLASS_DECLARATION__SUPER_CLASS) {
			return true;
		}
		while (container != null) {
			if (container instanceof CodeBlock || container instanceof OpaqueMember) {
				return true;
			}
			container = container.eContainer();
		}
		return false;
	}

	protected class ImportManager {

		private final Module module;

		/**
		 * Local name per imported declaration.
		 */
		private final Map<Declaration, String> localNames = new HashMap<>();

		/**
		 * Specifier -&gt; type only -&gt; imported name -&gt; local name.
		 */
		private final Map<String, Map<Boolean, Map<String, String>>> imports = new LinkedHashMap<>();

		/**
		 * Local names which are already taken: module level declarations and whatever
		 * the authored imports bind.
		 */
		private final Set<String> taken = new HashSet<>();

		ImportManager(Module module) {
			this.module = module;

			for (Declaration declaration : module.getDeclarations()) {
				if (!isBlank(declaration.getName())) {
					taken.add(declaration.getName());
				}
			}
			for (Import authored : module.getImports()) {
				for (ImportBinding binding : authored.getBindings()) {
					String local = !isBlank(binding.getAlias()) ? binding.getAlias()
							: !isBlank(binding.getImportedName()) ? binding.getImportedName() : binding.getName();
					if (!isBlank(local)) {
						taken.add(local);
					}
				}
			}

			// Value positions are resolved first: if the same declaration is used as a
			// value anywhere in the module the import cannot be erased, and a second
			// `import type` of the same name would collide.
			List<ImplicitReference> implicitReferences = implicitReferences(module);
			Set<Declaration> valueTargets = new LinkedHashSet<>();
			Set<NamedTypeReference> valueReferences = new LinkedHashSet<>();
			for (NamedTypeReference reference : namedTypeReferences()) {
				if (isValuePosition(reference)) {
					valueReferences.add(reference);
				}
			}
			for (ImplicitReference implicit : implicitReferences) {
				if (!implicit.typeOnly()) {
					valueReferences.add(implicit.reference());
				}
			}
			for (NamedTypeReference reference : valueReferences) {
				if (reference.getTarget() != null) {
					valueTargets.add(reference.getTarget());
				}
			}
			for (NamedTypeReference reference : valueReferences) {
				register(reference, false);
			}
			List<NamedTypeReference> typeReferences = new ArrayList<>(namedTypeReferences());
			for (ImplicitReference implicit : implicitReferences) {
				if (implicit.typeOnly()) {
					typeReferences.add(implicit.reference());
				}
			}
			for (NamedTypeReference reference : typeReferences) {
				if (!valueReferences.contains(reference)) {
					register(reference, reference.getTarget() == null || !valueTargets.contains(reference.getTarget()));
				}
			}
		}

		private List<NamedTypeReference> namedTypeReferences() {
			List<NamedTypeReference> ret = new ArrayList<>();
			for (Iterator<EObject> it = module.eAllContents(); it.hasNext();) {
				EObject next = it.next();
				if (next instanceof NamedTypeReference ntr) {
					ret.add(ntr);
				}
			}
			return ret;
		}

		private void register(NamedTypeReference reference, boolean typeOnly) {
			Declaration target = reference.getTarget();
			String specifier;
			String importedName;

			if (target != null) {
				Module targetModule = containingModule(target);
				if (targetModule == null || targetModule == module) {
					return; // Declared here, or free floating - nothing to import.
				}
				if (localNames.containsKey(target)) {
					return; // Already resolved by an earlier reference.
				}
				specifier = specifier(targetModule);
				importedName = name(target);
			} else if (!isBlank(reference.getQualifiedName())) {
				if (isBlank(reference.getModuleSpecifier())) {
					return; // A global, or a type parameter - nothing to import.
				}
				specifier = reference.getModuleSpecifier();
				// Only the root of a qualified name is bound by the import.
				importedName = reference.getQualifiedName().split("\\.")[0];
			} else {
				return;
			}

			Map<String, String> bindings = imports
					.computeIfAbsent(specifier, s -> new LinkedHashMap<>())
					.computeIfAbsent(typeOnly, t -> new LinkedHashMap<>());

			String local = bindings.get(importedName);
			if (local == null) {
				local = uniqueLocalName(importedName);
				bindings.put(importedName, local);
			}
			if (target != null) {
				localNames.put(target, local);
			}
		}

		/**
		 * The same simple name can arrive from two modules. The first one keeps the
		 * name; the rest are aliased.
		 */
		private String uniqueLocalName(String importedName) {
			if (!taken.contains(importedName)) {
				taken.add(importedName);
				return importedName;
			}
			int counter = 2;
			while (taken.contains(importedName + "$" + counter)) {
				++counter;
			}
			String ret = importedName + "$" + counter;
			taken.add(ret);
			return ret;
		}

		/**
		 * A module in the same package resolves to a relative specifier carrying the
		 * <code>.js</code> extension NodeNext requires; a module in another package
		 * resolves to that package's bare specifier, with a subpath when the module is
		 * not the package entry point.
		 */
		private String specifier(Module targetModule) {
			Package targetPackage = containingPackage(targetModule);
			Package ownPackage = containingPackage(module);
			if (targetPackage == ownPackage) {
				return relativeSpecifier(module.getPath(), targetModule.getPath());
			}
			String packageName = targetPackage == null ? null : targetPackage.getPackageName();
			if (isBlank(packageName)) {
				throw new NasdanikaException("Cannot import " + targetModule.getPath()
						+ ": its package has no packageName");
			}
			return INDEX_PATH.equals(targetModule.getPath()) ? packageName
					: packageName + "/" + targetModule.getPath() + RELATIVE_IMPORT_EXTENSION;
		}

		/**
		 * @return Name a reference is written as in the module: the declaration's own name,
		 * the alias of its import, or the qualified name rooted at the import's local name
		 */
		public String localName(NamedTypeReference reference) {
			Declaration target = reference.getTarget();
			if (target != null) {
				String local = localNames.get(target);
				return local == null ? name(target) : local;
			}
			String qualifiedName = reference.getQualifiedName();
			if (isBlank(qualifiedName)) {
				return "unknown";
			}
			if (isBlank(reference.getModuleSpecifier())) {
				return qualifiedName;
			}
			String[] segments = qualifiedName.split("\\.");
			String root = imports.getOrDefault(reference.getModuleSpecifier(), Map.of()).values().stream()
					.map(bindings -> bindings.get(segments[0]))
					.filter(java.util.Objects::nonNull)
					.findFirst()
					.orElse(segments[0]);
			segments[0] = root;
			return String.join(".", segments);
		}

		String generate() {
			StringBuilder ret = new StringBuilder();
			for (Import authored : module.getImports()) {
				ret.append(importStatement(authored));
			}
			for (Map.Entry<String, Map<Boolean, Map<String, String>>> specifierEntry : imports.entrySet()) {
				// A specifier used both as a type and as a value produces two statements
				// rather than one value import, so the type half stays erasable.
				for (boolean typeOnly : new boolean[] { false, true }) {
					Map<String, String> bindings = specifierEntry.getValue().get(typeOnly);
					if (bindings == null || bindings.isEmpty()) {
						continue;
					}
					ret.append("import ");
					if (typeOnly) {
						ret.append("type ");
					}
					ret.append("{ ");
					for (Iterator<Map.Entry<String, String>> it = bindings.entrySet().iterator(); it.hasNext();) {
						Map.Entry<String, String> binding = it.next();
						ret.append(binding.getKey());
						if (!binding.getKey().equals(binding.getValue())) {
							ret.append(" as ").append(binding.getValue());
						}
						if (it.hasNext()) {
							ret.append(", ");
						}
					}
					ret.append(" } from ").append(quote(specifierEntry.getKey())).append(";")
							.append(System.lineSeparator());
				}
			}
			return ret.toString();
		}

		private String importStatement(Import authored) {
			StringBuilder ret = new StringBuilder("import ");
			if (authored.isTypeOnly()) {
				ret.append("type ");
			}
			List<ImportBinding> defaults = new ArrayList<>();
			List<ImportBinding> namespaces = new ArrayList<>();
			List<ImportBinding> named = new ArrayList<>();
			for (ImportBinding binding : authored.getBindings()) {
				ImportKind kind = binding.getKind();
				if (kind == ImportKind.DEFAULT) {
					defaults.add(binding);
				} else if (kind == ImportKind.NAMESPACE) {
					namespaces.add(binding);
				} else if (kind == ImportKind.NAMED) {
					named.add(binding);
				}
			}
			if (defaults.isEmpty() && namespaces.isEmpty() && named.isEmpty()) {
				// Side effect only.
				return "import " + quote(authored.getModuleSpecifier()) + ";" + System.lineSeparator();
			}
			List<String> clauses = new ArrayList<>();
			for (ImportBinding binding : defaults) {
				clauses.add(bindingLocalName(binding));
			}
			for (ImportBinding binding : namespaces) {
				clauses.add("* as " + bindingLocalName(binding));
			}
			if (!named.isEmpty()) {
				StringBuilder group = new StringBuilder("{ ");
				for (Iterator<ImportBinding> it = named.iterator(); it.hasNext();) {
					ImportBinding binding = it.next();
					group.append(binding.getImportedName());
					if (!isBlank(binding.getAlias())) {
						group.append(" as ").append(binding.getAlias());
					}
					if (it.hasNext()) {
						group.append(", ");
					}
				}
				clauses.add(group.append(" }").toString());
			}
			ret.append(String.join(", ", clauses));
			ret.append(" from ").append(quote(authored.getModuleSpecifier())).append(";")
					.append(System.lineSeparator());
			return ret.toString();
		}

		private String bindingLocalName(ImportBinding binding) {
			if (!isBlank(binding.getAlias())) {
				return binding.getAlias();
			}
			if (!isBlank(binding.getImportedName())) {
				return binding.getImportedName();
			}
			return binding.getName();
		}
	}

	// --- Static helpers -----------------------------------------------------

	/**
	 * Relative specifier from one module path to another, with the
	 * <code>.js</code> extension NodeNext requires on relative ESM specifiers.
	 */
	static String relativeSpecifier(String fromPath, String toPath) {
		String[] from = fromPath.split("/");
		String[] to = toPath.split("/");
		int common = 0;
		// The last segment of each path is the file name, not a directory.
		while (common < from.length - 1 && common < to.length - 1 && from[common].equals(to[common])) {
			++common;
		}
		StringBuilder ret = new StringBuilder();
		for (int i = common; i < from.length - 1; ++i) {
			ret.append("../");
		}
		if (ret.length() == 0) {
			ret.append("./");
		}
		for (int i = common; i < to.length; ++i) {
			ret.append(to[i]);
			if (i < to.length - 1) {
				ret.append("/");
			}
		}
		return ret.append(RELATIVE_IMPORT_EXTENSION).toString();
	}

	private static Module containingModule(EObject element) {
		for (EObject container = element; container != null; container = container.eContainer()) {
			if (container instanceof Module module) {
				return module;
			}
		}
		return null;
	}

	private static Package containingPackage(EObject element) {
		for (EObject container = element; container != null; container = container.eContainer()) {
			if (container instanceof Package tsPackage) {
				return tsPackage;
			}
		}
		return null;
	}

	private static String resolve(String basePath, String path) {
		if (basePath == null || basePath.isEmpty() || ".".equals(basePath)) {
			return path;
		}
		return basePath.endsWith("/") ? basePath + path : basePath + "/" + path;
	}

	@SuppressWarnings("unchecked")
	private static void write(GenericVolume<String> volume, String path, String content) {
		GenericVolume.Writable<String> writable = volume
				.capability(GenericVolume.Writable.class)
				.orElseThrow(() -> new NasdanikaException("Volume is not writable: " + volume));
		try {
			createParentDirectories(volume, writable, path);
			writable.write(path, content);
		} catch (IOException e) {
			throw new NasdanikaException("Could not write " + path, e);
		}
	}

	/**
	 * Volumes have file system semantics - writing into a missing directory may
	 * fail - so parents are created top down.
	 */
	private static void createParentDirectories(GenericVolume<String> volume, GenericVolume.Writable<String> writable, String path) throws IOException {
		int idx = path.lastIndexOf('/');
		if (idx == -1) {
			return;
		}
		String parent = path.substring(0, idx);
		Optional<Entry> entry = volume.stat(parent);
		if (entry.isPresent()) {
			if (entry.get().kind() != Entry.Kind.DIRECTORY) {
				throw new NasdanikaException("Not a directory: " + parent);
			}
			return;
		}
		createParentDirectories(volume, writable, parent);
		writable.createDirectory(parent);
	}

	protected static boolean isBlank(String str) {
		return str == null || str.isBlank();
	}

	private static String orDefault(String value, String fallback) {
		return isBlank(value) ? fallback : value;
	}

}
