package org.nasdanika.sdk.runtime.models.typescript.ecore.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringOutput;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.sdk.runtime.models.typescript.Package;
import org.nasdanika.sdk.runtime.models.typescript.ecore.EcoreGenerator;
import org.nasdanika.sdk.runtime.models.typescript.generator.Generator;

/**
 * Generates npm packages from Ecore itself and from nxcore, and checks the
 * shape of the output.
 * <p>
 * Ecore is the interesting case: it describes itself, so the generated
 * <code>EClass</code> interface has to be able to say what its own
 * <code>$eClass</code> is. That works in one pass because TypeScript resolves
 * interface references lazily - there is no bootstrap version to publish.
 * <p>
 * nxcore is the second case: it references nothing of Ecore's except
 * <code>EClass</code> itself, which arrives through <code>$eClass</code> on
 * every interface and therefore exercises cross package imports.
 */
public class EcoreGeneratorTests {

	private static final Path OUTPUT_DIR = Path.of("target", "npm");

	private ResourceSet resourceSet() {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory
				.createRequirement(ResourceSet.class);
		return capabilityLoader.loadOne(requirement, progressMonitor);
	}

	@Test
	public void testGenerateEcoreAndNxcore() throws Exception {
		ResourceSet resourceSet = resourceSet();

		EcoreGenerator ecoreGenerator = new EcoreGenerator()
				.setVersion("0.0.1")
				.setPackageNameResolver(ePackage -> "@nasdanika/" + ePackage.getName().toLowerCase());

		// Both in one run, so nxcore's references to Ecore resolve to targets and the
		// TypeScript generator computes the specifiers itself.
		List<Package> generated = ecoreGenerator.generate(
				List.of(EcorePackage.eINSTANCE, NxcorePackage.eINSTANCE),
				resourceSet);

		assertThat(generated).hasSize(2);
		Package ecore = generated.get(0);
		Package nxcore = generated.get(1);
		assertThat(ecore.getPackageName()).isEqualTo("@nasdanika/ecore");
		assertThat(nxcore.getPackageName()).isEqualTo("@nasdanika/nxcore");

		Map<String, String> ecoreSources = new LinkedHashMap<>();
		Generator generator = new Generator();
		generator.generate(ecore, URI.createURI("e/"), Generator.mapOutput(ecoreSources));

		// Written before the assertions, so a failure leaves something to read.
		write(generator, ecore, "ecore");
		write(generator, nxcore, "nxcore");
		assertThat(OUTPUT_DIR.resolve("ecore/src/model.ts")).exists();
		assertThat(OUTPUT_DIR.resolve("nxcore/src/model.ts")).exists();

		String ecoreModel = ecoreSources.get("e/src/model.ts");

		// --- The metacircular part -------------------------------------------
		// EClass carries the synthetic type parameter, and describes itself.
		assertThat(ecoreModel).contains("export interface EClass<T = unknown> extends EClassifier {");
		assertThat(ecoreModel).contains("readonly $instance?: T;");
		assertThat(ecoreModel).contains("readonly $eClass: EClass<EClass<T>>;");

		// Everything else is branded with its own instance type.
		assertThat(ecoreModel).contains("export interface EAttribute extends EStructuralFeature {");
		assertThat(ecoreModel).contains("readonly $eClass: EClass<EAttribute>;");
		assertThat(ecoreModel).contains("export interface EPackage extends ENamedElement {");
		assertThat(ecoreModel).contains("readonly $eClass: EClass<EPackage>;");

		// Structural features, with multiplicity and optionality. A many valued
		// feature is an array, empty at worst. A single valued one with a lower bound
		// of zero is optional - which is almost all of them, because EMF JSON omits
		// an attribute sitting at its default value.
		assertThat(ecoreModel).contains("readonly eSuperTypes: EClass[];");
		assertThat(ecoreModel).contains("readonly abstract?: boolean;");
		assertThat(ecoreModel).contains("readonly name?: string;");

		// Derived features are computed rather than stored, so they are absent from
		// the JSON and must not be promised here.
		assertThat(ecoreModel).doesNotContain("eAllSuperTypes");
		assertThat(ecoreModel).doesNotContain("eAllAttributes");

		// A data type with no JSON primitive equivalent resolves to string, which is
		// what EMF JSON writes when it serializes through the factory.
		assertThat(ecoreModel).contains("export type EJavaClass = string;");

		// Ecore describes itself, so nothing is imported into its model module.
		assertThat(ecoreModel).doesNotContain("import ");

		// --- The package module ----------------------------------------------
		String ecorePackageModule = ecoreSources.get("e/src/package.ts");
		// No type annotation, so the constant keeps its literal type.
		assertThat(ecorePackageModule).contains(
				"export const eNS_URI = \"http://www.eclipse.org/emf/2002/Ecore\";");
		assertThat(ecorePackageModule).contains("export const descriptor: Record<string, unknown> = {");
		// The descriptor is EMF JSON, the same format the instance data uses.
		assertThat(ecorePackageModule).contains("\"eClass\"");

		// --- Cross package references ----------------------------------------
		Map<String, String> nxcoreSources = new LinkedHashMap<>();
		generator.generate(nxcore, URI.createURI("n/"), Generator.mapOutput(nxcoreSources));
		String nxcoreModel = nxcoreSources.get("n/src/model.ts");

		// EClass comes from the Ecore package, and only as a type. The specifier is a
		// subpath because EClass lives in that package's model module rather than its
		// entry point, which is why the generated package.json carries a "./*.js"
		// export - without it the deep import would not resolve.
		assertThat(nxcoreModel).contains("import type { EClass, EDate } from \"@nasdanika/ecore/model.js\";");
		assertThat(nxcoreModel).contains("export interface ModelElement extends StringIdentity, Documented, Marked {");
		assertThat(nxcoreModel).contains("readonly $eClass: EClass<ModelElement>;");
		assertThat(nxcoreModel).contains("export interface NamedElement extends ModelElement {");
		assertThat(nxcoreModel).contains("readonly $eClass: EClass<NamedElement>;");

		// A containment reference is typed as the target, not as a $ref.
		assertThat(nxcoreModel).contains("readonly markers: Marker[];");

		// An EDataType wrapping a Java class becomes a string alias.
		assertThat(nxcoreModel).contains("export type Instant = string;");

		// An imported package has to be declared, or the import resolves only on the
		// machine where both were generated.
		assertThat(nxcore.getDependencies()).containsExactly("@nasdanika/ecore@0.0.1");
		assertThat(ecore.getDependencies()).isEmpty();
		assertThat(nxcoreSources.get("n/package.json")).contains("\"@nasdanika/ecore\": \"0.0.1\"");
	}

	/**
	 * The descriptor round trips: what is embedded in the package module is the
	 * same EMF JSON the instance loader reads.
	 */
	@Test
	public void testDescriptorIsEmfJson() {
		ResourceSet resourceSet = resourceSet();
		String json = new EcoreGenerator().toJson(NxcorePackage.eINSTANCE, resourceSet);
		assertThat(json).contains("\"nsURI\" : \"https://nxcore.models.nasdanika.org\"");
		assertThat(json).contains("\"eClass\" : \"http://www.eclipse.org/emf/2002/Ecore#//EClass\"");
		assertThat(json).contains("\"name\" : \"ModelElement\"");
		// Serializing a copy leaves the registered package where it was.
		assertThat(NxcorePackage.eINSTANCE.eResource()).isNotNull();
	}

	/**
	 * A package generated on its own still references the others, by specifier -
	 * and the specifier it writes is the same one the resolver computes when both
	 * packages are generated together.
	 */
	@Test
	public void testStandalonePackageUsesModuleSpecifiers() {
		ResourceSet resourceSet = resourceSet();
		EPackage nxcore = NxcorePackage.eINSTANCE;
		Package generated = new EcoreGenerator().setDescriptor(false).generate(nxcore, resourceSet);
		String model = new Generator().generate(generated.getModules().get(0));
		assertThat(model).contains("from \"@nasdanika/ecore/model.js\";");
	}

	private void write(Generator generator, Package tsPackage, String directory) throws IOException {
		Path target = OUTPUT_DIR.resolve(directory);
		// Only src is wiped, so an npm install done here to verify the output
		// survives the next build.
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
