package org.nasdanika.sdk.runtime.groovy.tests.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.nasdanika.sdk.runtime.groovy.tests.book.LanguageTests.uri;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.sdk.runtime.common.NasdanikaResourceSet;
import org.nasdanika.sdk.runtime.common.capability.CapabilityFactorySource;
import org.nasdanika.sdk.runtime.common.capability.CapabilityLoader;
import org.nasdanika.sdk.runtime.common.capability.emf.ContentsHandlingResourceFactory;

/**
 * A DSL for a metamodel of one's own: the rules metamodel, itself written as a script.
 */
public class BindingTests {

	static Object get(EObject eObject, String feature) {
		return eObject.eGet(eObject.eClass().getEStructuralFeature(feature));
	}

	@Test
	@SuppressWarnings("unchecked")
	public void rules() throws IOException {
		// tag::setup[]
		ResourceSet resourceSet = NasdanikaResourceSet.createAndConfigure();
		Resource metamodel = resourceSet.getResource(uri("rules.ecore.groovy"), true); // <1>
		EPackage rules = (EPackage) metamodel.getContents().get(0);
		resourceSet.getPackageRegistry().put(rules.getNsURI(), rules);

		CapabilityLoader loader = CapabilityLoader.of(CapabilityFactorySource.concat(
			CapabilityFactorySource.of(new RulesCapabilityFactory(rules)), // <2>
			CapabilityFactorySource.serviceLoader())); // <3>
		resourceSet
			.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("groovy", new ContentsHandlingResourceFactory(loader, resourceSet)); // <4>

		Resource orders = resourceSet.getResource(uri("orders.rules.groovy"), true);
		// end::setup[]

		// tag::evaluators[]
		EObject ruleSet = orders.getContents().get(0);
		List<EObject> ruleList = (List<EObject>) get(ruleSet, "rules");
		List<String> evaluators = ruleList.stream()
			.map(rule -> (EObject) get(rule, "evaluator"))
			.map(evaluator -> evaluator.eClass().getName())
			.toList();
		assertThat(evaluators).containsExactly(
			"SpelEvaluator", "SpelEvaluator", "SpelEvaluator", "GroovyEvaluator"); // <1>

		EObject inWindow = (EObject) get(ruleList.get(1), "evaluator");
		assertThat(get(inWindow, "expression")).isEqualTo("order.date > start");
		assertThat(get(inWindow, "documentation")).isEqualTo("Orders inside the promotion window");
		// end::evaluators[]

		EClass spel = (EClass) rules.getEClassifier("SpelEvaluator");
		assertThat(((EObject) get(ruleList.get(0), "evaluator")).eClass()).isSameAs(spel);
	}

}
