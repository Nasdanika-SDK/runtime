/**
 */
package org.nasdanika.sdk.runtime.models.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.GroovyEvaluator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Groovy Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GroovyEvaluatorImpl extends SourceEvaluatorImpl implements GroovyEvaluator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroovyEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.GROOVY_EVALUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> T evaluate(final Class<T> resultType, final Map<String, Object> bindings) {
		return org.nasdanika.sdk.runtime.models.core.util.EvaluatorSupport.evaluateGroovy(this, resultType, bindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.GROOVY_EVALUATOR___EVALUATE__CLASS_MAP:
				return evaluate((Class)arguments.get(0), (Map<String, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GroovyEvaluatorImpl
