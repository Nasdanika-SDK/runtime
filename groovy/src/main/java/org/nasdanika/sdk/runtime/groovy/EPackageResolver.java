package org.nasdanika.sdk.runtime.groovy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.groovy.dsl.Selection;

/**
 * Resolves against a tree of {@link EPackage}s (sub-packages included). It is used by
 * {@link DslResourceContentsHandler} to resolve {@link EClass}es named from the DSL.
 *
 * <p>A name passed to {@link #classByName(EObject, String)} may take one of three forms, so a class
 * can always be addressed unambiguously even when many packages share a resource set or several
 * packages declare a class with the same simple name:</p>
 *
 * <ul>
 *   <li><b>simple</b> - a decapitalised class name, {@code 'component'}. Resolved within the package
 *       of {@code base} first (so nested authoring needs no qualification), then globally. When
 *       several classes match, a class that is a subtype of another match <em>supersedes</em> it:
 *       a refinement model's {@code ModelElement}, which extends the core {@code ModelElement}, is
 *       selected when a script is loaded with both packages, even inside an element of the core
 *       package. The superseded classes are reported in the {@link Selection}. A simple name that
 *       still matches more than one class with no {@code base} to disambiguate raises an error
 *       listing the qualified alternatives.</li>
 *   <li><b>qualified</b> - {@code 'c4.Component'} or {@code 'architecture.c4.Component'}: the trailing
 *       segment is the class name, the leading segments are an EPackage name path matched against the
 *       package's full path or any trailing sub-path of it.</li>
 *   <li><b>URI</b> - {@code '<nsURI>#<ClassName>'}: the package is looked up by namespace URI (in this
 *       resolver's packages, then the resource set's package registry).</li>
 * </ul>
 */
public abstract class EPackageResolver extends AbstractResolver {

	/** Decapitalised simple name -&gt; concrete EClasses across all packages (may collide). */
	private final Map<String, List<EClass>> bySimpleName = new LinkedHashMap<>();
	private final Map<Class<?>, EClass> byInstanceClass = new java.util.HashMap<>();
	/** Every concrete EClass, used for qualified- and URI-form lookups. */
	private final List<EClass> allClasses = new ArrayList<>();
	private final List<EClassifier> allClassifiers = new ArrayList<>();

	public EPackageResolver(EPackage... ePackages) {
		for (EPackage ePkg : ePackages) {
			index(ePkg);
		}
	}

	private void index(EPackage ePkg) {
		for (EClassifier eClassifier : ePkg.getEClassifiers()) {
			allClassifiers.add(eClassifier);
			if (eClassifier instanceof EClass eClass && !eClass.isAbstract() && !eClass.isInterface()) {
				allClasses.add(eClass);
				bySimpleName
					.computeIfAbsent(uncapitalize(eClass.getName()), k -> new ArrayList<>())
					.add(eClass);
				if (eClass.getInstanceClass() != null) {
					byInstanceClass.putIfAbsent(eClass.getInstanceClass(), eClass);
				}
			}
		}
		for (EPackage subPkg : ePkg.getESubpackages()) {
			index(subPkg);
		}
	}

	@Override
	public EClassifier classifierByName(EObject base, String name) {
		Selection<EClassifier> selection = selectClassifier(base, name);
		return selection == null ? null : selection.selected();
	}

	@Override
	public Selection<EClassifier> selectClassifier(EObject base, String name) {
		if (name == null) {
			return null;
		}
		name = name.trim();

		// URI form: '<nsURI>#<ClassName>'
		int hash = name.lastIndexOf('#');
		if (hash >= 0) {
			EPackage ePkg = getEPackage(name.substring(0, hash));
			return selection(ePkg == null ? null : ePkg.getEClassifier(name.substring(hash + 1)));
		}

		// Qualified form: '<pkgPath>.<ClassName>' (one or more package segments)
		int dot = name.lastIndexOf('.');
		if (dot >= 0) {
			String pkgPath = name.substring(0, dot);
			String className = name.substring(dot + 1);
			List<EClassifier> matches = allClassifiers
				.stream()
				.filter(c -> nameMatches(c, className) && packageMatches(c.getEPackage(), pkgPath))
				.toList();
			return selection(single(matches, name));
		}

		// Simple form: the package of base, unless superseded, then the global index.
		String theName = name;
		List<EClassifier> matches = allClassifiers.stream().filter(c -> nameMatches(c, theName)).toList();
		return selectSimple(base, name, matches, this::concreteClass);
	}

	@Override
	public EClass classByName(EObject base, String name) {
		Selection<EClass> selection = selectClass(base, name);
		return selection == null ? null : selection.selected();
	}

	@Override
	public Selection<EClass> selectClass(EObject base, String name) {
		if (name == null) {
			return null;
		}
		name = name.trim();

		// URI form: '<nsURI>#<ClassName>'
		int hash = name.lastIndexOf('#');
		if (hash >= 0) {
			EPackage ePkg = getEPackage(name.substring(0, hash));
			return selection(ePkg == null ? null : concreteClass(ePkg, name.substring(hash + 1)));
		}

		// Qualified form: '<pkgPath>.<ClassName>' (one or more package segments)
		int dot = name.lastIndexOf('.');
		if (dot >= 0) {
			String pkgPath = name.substring(0, dot);
			String className = name.substring(dot + 1);
			List<EClass> matches = allClasses.stream()
				.filter(c -> nameMatches(c, className) && packageMatches(c.getEPackage(), pkgPath))
				.toList();
			return selection(single(matches, name));
		}

		// Simple form: the package of base, unless superseded, then the global index.
		// The index is keyed by decapitalised name; match the capitalised form too, as classifierByName does.
		List<EClass> matches = bySimpleName.getOrDefault(name, List.of());
		if (matches.isEmpty()) {
			matches = bySimpleName.getOrDefault(uncapitalize(name), List.of());
		}
		return selectSimple(base, name, matches, this::concreteClass);
	}

	/**
	 * Selects a match for a simple name.
	 *
	 * <ol>
	 *   <li>A class of the package of {@code base} is selected, superseding the matches it is more
	 *       specific than, unless a match is more specific than it.</li>
	 *   <li>Otherwise matches that are supertypes of other matches are superseded. If one match
	 *       remains it is selected.</li>
	 *   <li>Otherwise a class of the package of {@code base} among the remaining matches is selected.</li>
	 *   <li>Otherwise the name is ambiguous.</li>
	 * </ol>
	 *
	 * @param scopedLookup looks a name up in a package
	 */
	private <T extends EClassifier> Selection<T> selectSimple(
			EObject base,
			String name,
			List<T> matches,
			BiFunction<EPackage, String, ? extends T> scopedLookup) {

		List<T> candidates = new ArrayList<>(matches.stream().distinct().toList());
		T scoped = base == null ? null : scopedLookup.apply(base.eClass().getEPackage(), name);
		if (scoped != null) {
			if (candidates.stream().noneMatch(c -> isMoreSpecific(c, scoped))) {
				return new Selection<>(scoped, candidates.stream().filter(c -> isMoreSpecific(scoped, c)).toList());
			}
			if (!candidates.contains(scoped)) {
				candidates.add(scoped);
			}
		}

		List<T> superseded = candidates
			.stream()
			.filter(c -> candidates.stream().anyMatch(o -> isMoreSpecific(o, c)))
			.toList();
		List<T> remaining = candidates.stream().filter(c -> !superseded.contains(c)).toList();
		if (remaining.size() > 1 && remaining.contains(scoped)) {
			return new Selection<>(scoped, superseded);
		}
		T selected = single(remaining, name);
		return selected == null ? null : new Selection<>(selected, superseded);
	}

	/** {@code a} is a proper subtype of {@code b}. */
	private static boolean isMoreSpecific(EClassifier a, EClassifier b) {
		return a != b && a instanceof EClass aClass && b instanceof EClass bClass && bClass.isSuperTypeOf(aClass);
	}

	private static <T extends EClassifier> Selection<T> selection(T selected) {
		return selected == null ? null : new Selection<>(selected, List.of());
	}

	@Override
	public EClass classByInstanceClass(EObject base, Class clazz) {
		return byInstanceClass.get(clazz);
	}

	@Override
	public List<EClass> candidates(EObject base, EClass featureType, EClass targetType) {
		return allClasses
			.stream()
			.filter(c -> featureType.isSuperTypeOf(c) && targetFeature(c, targetType) != null)
			.sorted(this::compareBySpecificity)
			.toList();
	}

	protected int compareBySpecificity(EClass a, EClass b) {
		if (a == b) {
			return 0;
		}
		if (a.isSuperTypeOf(b)) {
			return 1;
		}
		if (b.isSuperTypeOf(a)) {
			return -1;
		}
		return 0;
	}

	protected EReference targetFeature(EClass wrapper, EClass targetType) {
		return wrapper
			.getEAllReferences()
			.stream()
			.filter(r -> !r.isContainment() && !r.isMany() && r.getEReferenceType().isSuperTypeOf(targetType))
			.findFirst()
			.orElse(null);
	}

	/**
	 * Unambiguous simple names installed as top-level entry points; colliding names use {@code eObject('...')}.
	 * A name is unambiguous when one class matches it, or when one of the matching classes supersedes the
	 * others, see {@link #selectClass(EObject, String)}.
	 */
	@Override
	public Map<String, EClass> names() {
		Map<String, EClass> result = new LinkedHashMap<>();
		bySimpleName.forEach((simpleName, classes) -> {
			List<EClass> distinct = classes.stream().distinct().toList();
			List<EClass> remaining = distinct
				.stream()
				.filter(c -> distinct.stream().noneMatch(o -> isMoreSpecific(o, c)))
				.toList();
			if (remaining.size() == 1) {
				result.put(simpleName, remaining.get(0));
			}
		});
		return result;
	}

	// --- helpers --------------------------------------------------------------------------------

	/** Reduce a match list to a single EClass, raising a qualified-alternatives error on ambiguity. */
	private <T extends EClassifier> T single(List<T> matches, String name) {
		if (matches.isEmpty()) {
			return null;
		}
		if (matches.size() == 1) {
			return matches.get(0);
		}
		String alternatives = matches
			.stream()
			.map(c -> qualifiedName(c) + " (" + c.getEPackage().getNsURI() + "#" + c.getName() + ")")
			.collect(Collectors.joining(", "));
		throw new IllegalArgumentException("Ambiguous name '" + name + "'; qualify it as one of: " + alternatives);
	}

	private boolean nameMatches(EClassifier eClassifier, String className) {
		return eClassifier.getName().equals(className) || uncapitalize(eClassifier.getName()).equals(className);
	}

	/** A package matches {@code pkgPath} when the path equals, or is a trailing sub-path of, its full path. */
	private boolean packageMatches(EPackage ePkg, String pkgPath) {
		String full = qualifiedPath(ePkg);
		return full.equals(pkgPath) || full.endsWith("." + pkgPath);
	}

	private String qualifiedName(EClassifier eClassifier) {
		return qualifiedPath(eClassifier.getEPackage()) + "." + eClassifier.getName();
	}

	/** Dotted EPackage name path from the root package down, e.g. {@code architecture.c4}. */
	private String qualifiedPath(EPackage ePkg) {
		StringBuilder sb = new StringBuilder();
		for (EPackage p = ePkg; p != null; p = p.getESuperPackage()) {
			if (sb.length() > 0) {
				sb.insert(0, '.');
			}
			sb.insert(0, p.getName());
		}
		return sb.toString();
	}

	private EClass concreteClass(EPackage ePkg, String className) {
		EClassifier classifier = ePkg.getEClassifier(className);
		if (!(classifier instanceof EClass)) {
			classifier = ePkg.getEClassifier(capitalize(className));
		}
		if (classifier instanceof EClass eClass && !eClass.isAbstract() && !eClass.isInterface()) {
			return eClass;
		}
		return null;
	}

	private EPackage getEPackage(String nsURI) {
		for (EClass c : allClasses) {
			if (nsURI.equals(c.getEPackage().getNsURI())) {
				return c.getEPackage();
			}
		}
		ResourceSet resourceSet = getResourceSet();
		return resourceSet == null ? null : resourceSet.getPackageRegistry().getEPackage(nsURI);
	}

	/** The string with its first character in lower case. */
	private static String uncapitalize(String str) {
		return str == null || str.isEmpty() ? str : Character.toLowerCase(str.charAt(0)) + str.substring(1);
	}

	/** The string with its first character in upper case. */
	private static String capitalize(String str) {
		return str == null || str.isEmpty() ? str : Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}

}
