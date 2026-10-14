/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data of a node or an edge. The default node types render the label.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabelNode <em>Label Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowData()
 * @model
 * @generated
 */
public interface FlowData extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowData_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Label with markup. Wins over label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Node</em>' containment reference.
	 * @see #setLabelNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowData_LabelNode()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='label'"
	 * @generated
	 */
	JsxNode getLabelNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.FlowData#getLabelNode <em>Label Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Node</em>' containment reference.
	 * @see #getLabelNode()
	 * @generated
	 */
	void setLabelNode(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.DataValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  More data, e.g. for custom nodes: { jdk: true }
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getFlowData_Values()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react key='name'"
	 * @generated
	 */
	EList<DataValue> getValues();

} // FlowData
