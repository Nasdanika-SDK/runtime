/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * const [nodes, setNodes, onNodesChange] = useNodesState(initialNodes)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.NodesState#getInitialNodes <em>Initial Nodes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodesState()
 * @model annotation="urn:org.nasdanika:react hook='useNodesState'"
 * @generated
 */
public interface NodesState extends FlowHook {
	/**
	 * Returns the value of the '<em><b>Initial Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.flow.FlowNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Nodes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getNodesState_InitialNodes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react required='true'"
	 * @generated
	 */
	EList<FlowNode> getInitialNodes();

} // NodesState
