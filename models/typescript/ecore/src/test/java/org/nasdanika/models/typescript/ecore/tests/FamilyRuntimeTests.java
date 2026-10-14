package org.nasdanika.sdk.runtime.models.typescript.ecore.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringOutput;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.ecore.EcoreGenerator;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

/**
 * Builds the family metamodel dynamically, generates a TypeScript package from
 * it, and has EMF write instance data as EMF JSON.
 * <p>
 * The fixture is produced by EMF rather than hand written, which is the point:
 * the runtime is tested against the format EMF actually emits, including the
 * <code>//@members[id='lea']</code> form of reference that eKeys produce.
 * <p>
 * The TypeScript half runs separately, because the Maven build does not depend
 * on Node:
 *
 * <pre>
 * cd ecore/target/npm/ecore &amp;&amp; npm install &amp;&amp; npx tsc
 * cd ../family &amp;&amp; npm install ../ecore &amp;&amp; npm install &amp;&amp; npm test
 * </pre>
 */
public class FamilyRuntimeTests {

	private static final Path OUTPUT_DIR = Path.of("target", "npm");

	private static final String FAMILY_NS_URI = "ecore://nasdanika.org/models/family";

	private static final EcoreFactory ECORE = EcoreFactory.eINSTANCE;

	@Test
	public void testGenerateFamilyPackageAndData() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory
				.createRequirement(ResourceSet.class);
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		EPackage familyPackage = buildFamilyMetamodel();
		resourceSet.getPackageRegistry().put(FAMILY_NS_URI, familyPackage);
		// The package needs a resource, or EMF has no URI to qualify the eClass
		// references with and writes a bare "#//Family" that no registry can resolve.
		Resource metamodelResource = new ResourceImpl(URI.createURI(FAMILY_NS_URI));
		resourceSet.getResources().add(metamodelResource);
		metamodelResource.getContents().add(familyPackage);

		// Ecore comes along so the generated family package has something to import
		// EClass from, and so the runtime ships next to it.
		EcoreGenerator ecoreGenerator = new EcoreGenerator().setVersion("0.0.1");
		List<Package> generated = ecoreGenerator.generate(
				List.of(EcorePackage.eINSTANCE, familyPackage),
				resourceSet);
		Package ecore = generated.get(0);
		Package family = generated.get(1);

		assertThat(family.getPackageName()).isEqualTo("@nasdanika/family");
		assertThat(family.getDependencies()).containsExactly("@nasdanika/ecore@0.0.1");

		Generator generator = new Generator();
		write(generator, ecore, "ecore");
		write(generator, family, "family");

		// The runtime ships inside the Ecore package, not as a second artifact.
		assertThat(OUTPUT_DIR.resolve("ecore/src/runtime.ts")).exists();
		assertThat(Files.readString(OUTPUT_DIR.resolve("ecore/src/index.ts")))
				.contains("export * from \"./runtime.js\";");

		// EMF writes the fixture, so the runtime is tested against the real format.
		Path dataDir = OUTPUT_DIR.resolve("family/data");
		Files.createDirectories(dataDir);
		String json = instanceData(familyPackage, resourceSet);
		Files.writeString(dataDir.resolve("family.json"), json, StandardCharsets.UTF_8);

		// The two forms of reference the runtime has to handle.
		assertThat(json).contains("\"eClass\" : \"" + FAMILY_NS_URI + "#//Man\"");
		assertThat(json).contains("\"$ref\" : \"//@members[id='lea']\"");
		assertThat(json).contains("\"status\" : \"deceased\"");

		copyTestSources();
		assertThat(OUTPUT_DIR.resolve("family/src/family-runtime.test.ts")).exists();
	}

	// ------------------------------------------------------------------------
	// The metamodel
	// ------------------------------------------------------------------------

	private EPackage buildFamilyMetamodel() {
		EPackage ePackage = ECORE.createEPackage();
		ePackage.setName("family");
		ePackage.setNsURI(FAMILY_NS_URI);
		ePackage.setNsPrefix("family");

		EEnum status = ECORE.createEEnum();
		status.setName("Status");
		status.getELiterals().add(literal("ALIVE", "alive", 0));
		status.getELiterals().add(literal("DECEASED", "deceased", 1));
		ePackage.getEClassifiers().add(status);

		EClass member = ECORE.createEClass();
		member.setName("Member");
		member.setAbstract(true);
		ePackage.getEClassifiers().add(member);

		// Deliberately NOT an EMF ID attribute. An ID attribute makes EMF write a
		// bare "$ref": "lea"; leaving it a plain attribute and using it as an eKey on
		// the containing reference produces "//@members[id='lea']", which is the form
		// the sample data in the wild uses. The runtime handles both.
		EAttribute id = attribute("id", EcorePackage.Literals.ESTRING);
		member.getEStructuralFeatures().add(id);
		member.getEStructuralFeatures().add(attribute("name", EcorePackage.Literals.ESTRING));
		member.getEStructuralFeatures().add(attribute("status", status));

		EReference parents = reference("parents", member, false, -1);
		EReference children = reference("children", member, false, -1);
		member.getEStructuralFeatures().add(parents);
		member.getEStructuralFeatures().add(children);

		EClass man = ECORE.createEClass();
		man.setName("Man");
		man.getESuperTypes().add(member);
		ePackage.getEClassifiers().add(man);

		EClass woman = ECORE.createEClass();
		woman.setName("Woman");
		woman.getESuperTypes().add(member);
		ePackage.getEClassifiers().add(woman);

		EClass family = ECORE.createEClass();
		family.setName("Family");
		ePackage.getEClassifiers().add(family);
		family.getEStructuralFeatures().add(attribute("name", EcorePackage.Literals.ESTRING));
		EReference members = reference("members", member, true, -1);
		// eKeys are what make EMF write //@members[id='lea'] rather than a positional
		// path, which is the form the sample data in the wild uses.
		members.getEKeys().add(id);
		family.getEStructuralFeatures().add(members);

		return ePackage;
	}

	private EEnumLiteral literal(String name, String literal, int value) {
		EEnumLiteral ret = ECORE.createEEnumLiteral();
		ret.setName(name);
		ret.setLiteral(literal);
		ret.setValue(value);
		return ret;
	}

	private EAttribute attribute(String name, org.eclipse.emf.ecore.EClassifier type) {
		EAttribute ret = ECORE.createEAttribute();
		ret.setName(name);
		ret.setEType(type);
		return ret;
	}

	private EReference reference(String name, EClass type, boolean containment, int upperBound) {
		EReference ret = ECORE.createEReference();
		ret.setName(name);
		ret.setEType(type);
		ret.setContainment(containment);
		ret.setUpperBound(upperBound);
		return ret;
	}

	// ------------------------------------------------------------------------
	// The data
	// ------------------------------------------------------------------------

	@SuppressWarnings("unchecked")
	private String instanceData(EPackage ePackage, ResourceSet resourceSet) throws IOException {
		EClass familyClass = (EClass) ePackage.getEClassifier("Family");
		EClass manClass = (EClass) ePackage.getEClassifier("Man");
		EClass womanClass = (EClass) ePackage.getEClassifier("Woman");
		EEnum status = (EEnum) ePackage.getEClassifier("Status");

		EObject family = ePackage.getEFactoryInstance().create(familyClass);
		family.eSet(familyClass.getEStructuralFeature("name"), "Sample family");
		List<EObject> members = (List<EObject>) family.eGet(familyClass.getEStructuralFeature("members"));

		EObject albert = person(ePackage, manClass, "albert", "Albert", status, "DECEASED");
		EObject paul = person(ePackage, manClass, "paul", "Paul", status, "ALIVE");
		EObject isa = person(ePackage, womanClass, "isa", "Isa", status, "ALIVE");
		EObject lea = person(ePackage, womanClass, "lea", "Lea", status, "ALIVE");
		EObject elias = person(ePackage, manClass, "elias", "Elias", status, "ALIVE");
		EObject clara = person(ePackage, womanClass, "clara", "Clara", status, "ALIVE");
		members.addAll(List.of(albert, paul, isa, lea, elias, clara));

		link(paul, "children", lea, elias);
		link(isa, "children", lea, elias);
		link(lea, "parents", paul, isa);
		link(elias, "parents", paul, isa);
		link(elias, "children", clara);
		link(clara, "parents", elias);

		Resource resource = resourceSet.createResource(URI.createURI("memory:///family.json"));
		resource.getContents().add(family);
		try (var out = new java.io.ByteArrayOutputStream()) {
			resource.save(out, null);
			return out.toString(StandardCharsets.UTF_8);
		} finally {
			resourceSet.getResources().remove(resource);
		}
	}

	private EObject person(EPackage ePackage, EClass eClass, String id, String name, EEnum status,
			String statusLiteral) {
		EObject ret = ePackage.getEFactoryInstance().create(eClass);
		ret.eSet(eClass.getEStructuralFeature("id"), id);
		ret.eSet(eClass.getEStructuralFeature("name"), name);
		ret.eSet(eClass.getEStructuralFeature("status"), status.getEEnumLiteral(statusLiteral));
		return ret;
	}

	@SuppressWarnings("unchecked")
	private void link(EObject source, String featureName, EObject... targets) {
		List<EObject> values = (List<EObject>) source.eGet(source.eClass().getEStructuralFeature(featureName));
		values.addAll(List.of(targets));
	}

	// ------------------------------------------------------------------------

	/**
	 * Copies the hand written TypeScript test and a package.json test script into
	 * the generated package, so that `npm test` there exercises the runtime.
	 */
	private void copyTestSources() throws IOException {
		Path familyDir = OUTPUT_DIR.resolve("family");
		try (var in = getClass().getResourceAsStream("/family-runtime.test.ts")) {
			Files.writeString(familyDir.resolve("src/family-runtime.test.ts"),
					new String(in.readAllBytes(), StandardCharsets.UTF_8), StandardCharsets.UTF_8);
		}
		Path packageJson = familyDir.resolve("package.json");
		String content = Files.readString(packageJson);
		if (!content.contains("\"test\"")) {
			content = content.replace("\"build\": \"tsc\",",
					"\"build\": \"tsc\",\n    \"test\": \"tsc && node --test \\\"dist/**/*.test.js\\\"\",");
			Files.writeString(packageJson, content, StandardCharsets.UTF_8);
		}
	}

	private void write(Generator generator, Package tsPackage, String directory) throws IOException {
		Path target = OUTPUT_DIR.resolve(directory);
		deleteRecursively(target.resolve("src"));
		Files.createDirectories(target);
		URI baseURI = URI.createFileURI(target.toAbsolutePath().toString() + "/");
		generator.generate(tsPackage, baseURI, StringOutput.INSTANCE);
	}

	private static void deleteRecursively(Path path) throws IOException {
		if (!Files.exists(path)) {
			return;
		}
		try (var walk = Files.walk(path)) {
			walk.sorted(Comparator.reverseOrder()).forEach(p -> {
				try {
					Files.delete(p);
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			});
		}
	}
}
