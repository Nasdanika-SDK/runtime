package org.example.jvm;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ResolvedModule;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;
import org.nasdanika.sdk.runtime.models.jvm.JvmFactory;
import org.nasdanika.sdk.runtime.models.jvm.Layer;
import org.nasdanika.sdk.runtime.models.jvm.Module;           // Not java.lang.Module
import org.nasdanika.sdk.runtime.models.jvm.ModuleModifier;
import org.nasdanika.sdk.runtime.models.jvm.Provides;
import org.nasdanika.sdk.runtime.models.jvm.Requires;
import org.nasdanika.sdk.runtime.models.jvm.RequiresModifier;

/**
 * A minimal live loader: the modules of a running layer, what they declare and what resolution
 * actually made of it. The runtime's own loader is planned; this one shows the shape.
 */
public final class Snapshot {

	private Snapshot() {
	}

	// tag::snapshot[]
	public static JavaVirtualMachine of(ModuleLayer layer) {
		JvmFactory factory = JvmFactory.eINSTANCE;
		JavaVirtualMachine vm = factory.createJavaVirtualMachine();
		vm.setLive(true);                                                       // <1>
		vm.setVmName(System.getProperty("java.vm.name"));
		vm.setVmVersion(System.getProperty("java.vm.version"));
		vm.setSpecificationVersion(System.getProperty("java.specification.version"));

		Layer boot = factory.createLayer();
		boot.setName("boot");
		boot.setBoot(true);
		vm.getLayers().add(boot);

		Map<String, Module> modules = new TreeMap<>();
		for (java.lang.Module running: layer.modules()) {                       // <2>
			ModuleDescriptor descriptor = running.getDescriptor();
			Module module = factory.createModule();
			module.setName(running.getName());
			module.setId("jvm:module/" + running.getName());                   // <3>
			module.setNamed(true);
			descriptor.rawVersion().ifPresent(module::setVersion);
			if (descriptor.isAutomatic()) {
				module.getModifiers().add(ModuleModifier.AUTOMATIC);
			}
			module.getUses().addAll(new TreeSet<>(descriptor.uses()));
			for (ModuleDescriptor.Provides service: descriptor.provides()) {
				Provides provides = factory.createProvides();
				provides.setServiceName(service.service());
				provides.getProviderNames().addAll(service.providers());
				module.getProvides().add(provides);
			}
			modules.put(module.getName(), module);
		}
		vm.getModules().addAll(modules.values());
		boot.getModules().addAll(modules.values());

		Configuration configuration = layer.configuration();
		for (Module module: modules.values()) {
			ModuleDescriptor descriptor = layer.findModule(module.getName())
					.orElseThrow()
					.getDescriptor();
			for (ModuleDescriptor.Requires declared: descriptor.requires()) {
				Requires requires = factory.createRequires();
				requires.setName(declared.name());
				for (ModuleDescriptor.Requires.Modifier modifier: declared.modifiers()) {
					requires.getModifiers().add(RequiresModifier.valueOf(modifier.name()));
				}
				requires.setModule(modules.get(declared.name()));               // <4>
				module.getRequires().add(requires);
			}
			configuration.findModule(module.getName()).ifPresent(resolved -> {  // <5>
				for (ResolvedModule read: resolved.reads()) {
					Module target = modules.get(read.name());
					if (target != null) {
						module.getReads().add(target);
					}
				}
			});
		}
		return vm;
	}
	// end::snapshot[]

	// tag::question[]
	/**
	 * Modules that read something they never required: by requires transitive, usually.
	 */
	public static Map<String, List<String>> readsWithoutRequires(JavaVirtualMachine vm) {
		Map<String, List<String>> answer = new TreeMap<>();
		for (Module module: vm.getModules()) {
			Set<Module> required = module.getRequires().stream()
					.map(Requires::getModule)
					.filter(Objects::nonNull)
					.collect(Collectors.toSet());
			List<String> implicit = module.getReads().stream()
					.filter(read -> !required.contains(read))
					.map(Module::getName)
					.sorted()
					.toList();
			if (!implicit.isEmpty()) {
				answer.put(module.getName(), implicit);
			}
		}
		return answer;
	}
	// end::question[]

}
