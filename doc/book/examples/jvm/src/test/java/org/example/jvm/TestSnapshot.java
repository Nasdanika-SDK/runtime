package org.example.jvm;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;

class TestSnapshot {

	@Test
	void whatTheAssemblyBecame(@TempDir Path directory) throws IOException {
		// tag::use[]
		JavaVirtualMachine vm = Snapshot.of(ModuleLayer.boot());

		URI uri = URI.createFileURI(directory.resolve("jvm.yml").toString());
		Resource resource = NasdanikaResourceSet.createAndConfigure().createResource(uri);
		resource.getContents().add(vm);
		resource.save(null);                                                    // <1>

		Map<String, List<String>> implicit = Snapshot.readsWithoutRequires(vm);
		assertThat(implicit.get("org.example.jvm")).contains("org.nasdanika.sdk.runtime.models.core");
		// end::use[]
		implicit.entrySet().stream()
			.filter(e -> e.getKey().startsWith("org.example")
					|| e.getKey().startsWith("org.nasdanika"))
			.forEach(e -> System.out.println(e.getKey() + " reads " + e.getValue()));
		assertThat(vm.getModules()).anyMatch(m -> m.getName().equals("java.base"));
	}

}
