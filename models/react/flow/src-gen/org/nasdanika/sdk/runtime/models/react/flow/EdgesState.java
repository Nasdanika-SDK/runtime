/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edges State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * const [edges, setEdges, onEdgesChange] = useEdgesState(initialEdges)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.EdgesState#getInitialEdges <em>Initial Edges</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgesState()
 * @model annotation="urn:org.nasdanika:react hook='useEdgesState'"
 * @generated
 */
public interface EdgesState extends FlowHook {
	/**
	 * Returns the value of the '<em><b>Initial Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.FlowEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Edges</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgesState_InitialEdges()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react required='true'"
	 * @generated
	 */
	EList<FlowEdge> getInitialEdges();

} // EdgesState
