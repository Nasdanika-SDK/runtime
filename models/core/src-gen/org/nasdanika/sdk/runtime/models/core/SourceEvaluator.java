/**
 */
package org.nasdanika.sdk.runtime.models.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Carries script source, inline or by reference. Exactly one of
 * script and scriptRef must be set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScript <em>Script</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScriptRef <em>Script Ref</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getSourceEvaluator()
 * @model abstract="true"
 * @generated
 */
public interface SourceEvaluator extends Evaluator {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getSourceEvaluator_Script()
	 * @model unique="false"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI resolved against eResource().getURI().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script Ref</em>' attribute.
	 * @see #setScriptRef(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getSourceEvaluator_ScriptRef()
	 * @model unique="false"
	 * @generated
	 */
	String getScriptRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScriptRef <em>Script Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Ref</em>' attribute.
	 * @see #getScriptRef()
	 * @generated
	 */
	void setScriptRef(String value);

} // SourceEvaluator
