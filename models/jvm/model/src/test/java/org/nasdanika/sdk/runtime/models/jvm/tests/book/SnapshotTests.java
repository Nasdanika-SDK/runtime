package org.nasdanika.sdk.runtime.models.jvm.tests.book;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Method;
import org.nasdanika.sdk.runtime.models.jvm.Module;
import org.nasdanika.sdk.runtime.models.jvm.Type;

/**
 * The listings of the JVM Model book.
 */
public class SnapshotTests {

	@Test
	public void whatTheAssemblyBecame(@TempDir Path directory) throws IOException {
		// tag::save[]
		JavaVirtualMachine vm = Snapshot.of(ModuleLayer.boot());

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("xml", new XMIResourceFactoryImpl());
		URI uri = URI.createFileURI(directory.resolve("jvm.xml").toString());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(vm);
		resource.save(null);                                                    // <1>
		// end::save[]

		// tag::load[]
		ResourceSet other = new ResourceSetImpl();
		other.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("xml", new XMIResourceFactoryImpl());
		other.getPackageRegistry().put(JvmPackage.eNS_URI, JvmPackage.eINSTANCE);  // <1>
		JavaVirtualMachine loaded = (JavaVirtualMachine) other.getResource(uri, true)
				.getContents()
				.getFirst();
		// end::load[]
		assertThat(loaded.getModules()).hasSameSizeAs(vm.getModules());

		// tag::ask[]
		Map<String, List<String>> implicit = Snapshot.readsWithoutRequires(loaded);
		// end::ask[]
		implicit.entrySet().stream()
			.filter(e -> e.getKey().startsWith("org.nasdanika"))
			.forEach(e -> System.out.println(e.getKey() + " reads " + e.getValue()));

		assertThat(vm.getModules()).anyMatch(m -> m.getName().equals("java.base"));
		assertThat(implicit.get("org.nasdanika.sdk.runtime.models.jvm")).isNotEmpty();
		Module jvm = vm.getModules().stream()
			.filter(m -> m.getName().equals("org.nasdanika.sdk.runtime.models.jvm"))
			.findFirst()
			.orElseThrow();
		assertThat(jvm.getRequires()).anyMatch(r -> r.getName().equals("org.nasdanika.sdk.runtime.models.core"));
		assertThat(jvm.getProvides()).anyMatch(p -> p.getServiceName().equals("org.eclipse.emf.ecore.EPackage"));
	}

	@Test
	public void identity() {
		// tag::identity[]
		Type list = Snapshot.type(java.util.List.class);
		assertThat(list.getId()).isEqualTo("jvm:type/java.util.List");
		assertThat(list.getDescriptor()).isEqualTo("Ljava/util/List;");

		Method get = list.getMethods().stream()
			.filter(m -> m.getName().equals("get"))
			.findFirst()
			.orElseThrow();
		assertThat(get.getDescriptor()).isEqualTo("(I)Ljava/lang/Object;");     // <1>
		assertThat(get.getId()).isEqualTo("jvm:method/java.util.List#get(I)Ljava/lang/Object;");
		// end::identity[]

		// Arrays and nested types have binary names too
		assertThat(Snapshot.type(int[].class).getBinaryName()).isEqualTo("[I");
		assertThat(Snapshot.type(Map.Entry.class).getBinaryName()).isEqualTo("java.util.Map$Entry");
	}

}
