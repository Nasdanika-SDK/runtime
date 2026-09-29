/**
 */
package org.nasdanika.sdk.runtime.models.core;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPath Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getXPathEvaluator()
 * @model
 * @generated
 */
public interface XPathEvaluator extends ExpressionEvaluator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" resultTypeDataType="org.nasdanika.sdk.runtime.models.core.Class&lt;T&gt;" resultTypeUnique="false" bindingsDataType="org.nasdanika.sdk.runtime.models.core.Map&lt;org.eclipse.emf.ecore.EString, org.nasdanika.sdk.runtime.models.core.Object&gt;" bindingsUnique="false"
	 * @generated
	 */
	<T> T evaluate(Class<T> resultType, Map<String, Object> bindings);

} // XPathEvaluator
