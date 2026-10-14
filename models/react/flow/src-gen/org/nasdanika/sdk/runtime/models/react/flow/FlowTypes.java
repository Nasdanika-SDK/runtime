/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Node or edge types: type name to component. The initializer of a module level constant,
 * as a ValueBlock - see the package documentation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowTypes#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowTypes()
 * @model
 * @generated
 */
public interface FlowTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.FlowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowTypes_Types()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react key='name'"
	 * @generated
	 */
	EList<FlowType> getTypes();

} // FlowTypes
