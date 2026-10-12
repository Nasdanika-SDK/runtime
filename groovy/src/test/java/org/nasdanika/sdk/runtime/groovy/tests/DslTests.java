package org.nasdanika.sdk.runtime.groovy.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.capability.emf.ContentsHandlingResource;

/**
 * Loads DSL scripts through a resource set: the {@code groovy} extension is registered by a
 * contributor, and contents handlers are selected by the file name qualifiers.
 */
public class DslTests {

	private static Resource load(ResourceSet resourceSet, String path) throws IOException {
		File groovyFile = new File(path).getCanonicalFile();
		return resourceSet.getResource(URI.createFileURI(groovyFile.getAbsolutePath()), true);
	}

	/**
	 * Saves a copy of the contents as XMI for inspection.
	 */
	private static void saveCopy(ResourceSet resourceSet, Resource groovyResource, String path) throws IOException {
		File ecoreFile = new File(path).getCanonicalFile();
		Resource ecoreResource = resourceSet.createResource(URI.createFileURI(ecoreFile.getAbsolutePath()));
		ecoreResource.getContents().addAll(EcoreUtil.copyAll(groovyResource.getContents()));
		ecoreResource.save(null);
	}

	@Test
	public void testEcoreDslResource() throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource groovyResource = load(resourceSet, "src/test/resources/test-ecore.groovy");
		assertThat(groovyResource).isInstanceOf(ContentsHandlingResource.class);

		EObject person = resourceSet.getEObject(URI.createURI("urn:test/Person"), true);
		assertThat(person).as("Person").isInstanceOf(EClass.class);
		assertThat(((EClass) person).getEStructuralFeature("name")).isNotNull();
		saveCopy(resourceSet, groovyResource, "target/test-ecore.groovy.xml");
	}

	@Test
	public void testQualifiedEcoreDslResource() throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource groovyResource = load(resourceSet, "src/test/resources/test.ecore.groovy");

		EObject person = resourceSet.getEObject(URI.createURI("urn:test/Person"), true);
		assertThat(person).as("Person").isInstanceOf(EClass.class);
		saveCopy(resourceSet, groovyResource, "target/test.ecore.groovy.xml");
	}

	@Test
	public void testManyEcoreDslResource() throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource groovyResource = load(resourceSet, "src/test/resources/test-many.ecore.groovy");

		EObject person = resourceSet.getEObject(URI.createURI("urn:test/Person"), true);
		assertThat(person).as("Person").isInstanceOf(EClass.class);
		saveCopy(resourceSet, groovyResource, "target/test-many.ecore.groovy.xml");
	}

	@Test
	public void testFamilyEcoreDslResource() throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource groovyResource = load(resourceSet, "src/test/resources/family.ecore.groovy");

		assertThat(groovyResource.getContents()).singleElement().isInstanceOf(EPackage.class);
		EPackage familyPackage = (EPackage) groovyResource.getContents().get(0);
		assertThat(familyPackage.getName()).isEqualTo("familymodel");
		assertThat(familyPackage.getEClassifiers()).isNotEmpty();
		saveCopy(resourceSet, groovyResource, "target/family.ecore.groovy.xml");
	}

	@Test
	public void testFamilyClasspathEcoreDslResource() throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource groovyResource = resourceSet.getResource(URI.createURI("classpath://cp/family.ecore.groovy"), true);

		assertThat(groovyResource.getContents()).singleElement().isInstanceOf(EPackage.class);
		saveCopy(resourceSet, groovyResource, "target/family-classpath.ecore.groovy.xml");
	}

	/**
	 * Validates the self-writing script: an {@code onSave} callback receives the original script source
	 * and writes it back with an appended fragment. Saves to a caller-supplied {@link ByteArrayOutputStream}
	 * (rather than {@code save(null)}, which would open a stream against the .groovy source URI and
	 * truncate it) and asserts the written content is the source plus the appended fragment.
	 */
	@Test
	public void testSaveCallback() throws IOException {
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();

		File groovyFile = new File("src/test/resources/save.ecore.groovy").getCanonicalFile();
		String originalSource = Files.readString(groovyFile.toPath(), StandardCharsets.UTF_8);

		Resource groovyResource = resourceSet.getResource(URI.createFileURI(groovyFile.getAbsolutePath()), true);
		assertThat(groovyResource.getContents()).as("script contents").isNotEmpty();

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		groovyResource.save(out, null);

		assertThat(new String(out.toByteArray(), StandardCharsets.UTF_8)).isEqualTo(originalSource + "\n// appended on save\n");
	}

}
