// tag::module[]
/**
 * Layout of the diagram model with the Eclipse Layout Kernel.
 * The ELK jars are automatic modules. Each algorithm registers itself with
 * ELK's layout meta data service through META-INF/services, so the
 * algorithms only have to be resolved, which the requires below make sure of.
 */
module org.nasdanika.sdk.runtime.models.diagram.elk {

	exports org.nasdanika.sdk.runtime.models.diagram.elk;

	requires transitive org.nasdanika.sdk.runtime.models.diagram;
	requires org.nasdanika.sdk.runtime.common; // Telemetry
	requires transitive org.eclipse.elk.core;
	requires transitive org.eclipse.elk.graph;
	requires org.eclipse.elk.alg.layered;
	requires org.eclipse.elk.alg.mrtree;
	requires org.eclipse.elk.alg.force;
	requires org.eclipse.elk.alg.radial;

}
// end::module[]
