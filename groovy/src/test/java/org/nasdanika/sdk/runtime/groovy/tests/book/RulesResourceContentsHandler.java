package org.nasdanika.sdk.runtime.groovy.tests.book;

import javax.script.CompiledScript;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.groovy.DslResourceContentsHandler;

// tag::handler[]
/**
 * The DSL bound to the rules metamodel, with a short form for evaluators.
 */
public class RulesResourceContentsHandler extends DslResourceContentsHandler {

	private final EPackage rules;

	public RulesResourceContentsHandler(
			Resource resource,
			ResourceContentsHandler<CompiledScript> sourceHandler,
			EPackage rules) {
		super(resource, sourceHandler, rules); // <1>
		this.rules = rules;
	}

	@Override
	protected EObject create(EReference eReference, Object value) { // <2>
		if (eReference.getEReferenceType() == rules.getEClassifier("Evaluator")
				&& (value == null || value instanceof String)) {
			EClass spel = (EClass) rules.getEClassifier("SpelEvaluator"); // <3>
			EObject evaluator = EcoreUtil.create(spel);
			if (value != null) {
				evaluator.eSet(spel.getEStructuralFeature("expression"), value); // <4>
			}
			return evaluator;
		}
		return null; // <5>
	}

}
// end::handler[]
