/**
 */
package org.nasdanika.sdk.runtime.models.core;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.ScriptEvaluator#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getScriptEvaluator()
 * @model
 * @generated
 */
public interface ScriptEvaluator extends SourceEvaluator {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  JSR-223 engine short name. Required for script; for scriptRef
	 * falls back to selection by URI extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getScriptEvaluator_Language()
	 * @model unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.ScriptEvaluator#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" resultTypeDataType="org.nasdanika.sdk.runtime.models.core.Class&lt;T&gt;" resultTypeUnique="false" bindingsDataType="org.nasdanika.sdk.runtime.models.core.Map&lt;org.eclipse.emf.ecore.EString, org.nasdanika.sdk.runtime.models.core.Object&gt;" bindingsUnique="false"
	 * @generated
	 */
	<T> T evaluate(Class<T> resultType, Map<String, Object> bindings);

} // ScriptEvaluator
