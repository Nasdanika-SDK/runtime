/**
 */
package org.nasdanika.sdk.runtime.models.core;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getEvaluator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Evaluator extends Documented, Marked {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluates this evaluator's expression/script against the provided
	 * bindings and coerces the result to resultType.
	 * Analogous to javax.script.CompiledScript.eval(), but the source
	 * comes from the evaluator instance itself.
	 * <!-- end-model-doc -->
	 * @model unique="false" resultTypeDataType="org.nasdanika.sdk.runtime.models.core.Class&lt;T&gt;" resultTypeUnique="false" bindingsDataType="org.nasdanika.sdk.runtime.models.core.Map&lt;org.eclipse.emf.ecore.EString, org.nasdanika.sdk.runtime.models.core.Object&gt;" bindingsUnique="false"
	 * @generated
	 */
	<T> T evaluate(Class<T> resultType, Map<String, Object> bindings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" resultTypeDataType="org.nasdanika.sdk.runtime.models.core.Class&lt;T&gt;" resultTypeUnique="false"
	 * @generated
	 */
	<T> T evaluate(Class<T> resultType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.sdk.runtime.models.core.Object" unique="false" bindingsDataType="org.nasdanika.sdk.runtime.models.core.Map&lt;org.eclipse.emf.ecore.EString, org.nasdanika.sdk.runtime.models.core.Object&gt;" bindingsUnique="false"
	 * @generated
	 */
	Object evaluate(Map<String, Object> bindings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.sdk.runtime.models.core.Object" unique="false"
	 * @generated
	 */
	Object evaluate();

} // Evaluator
