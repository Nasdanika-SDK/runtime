/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.flow.FlowNode;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.NodesState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodes State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodesStateImpl#getInitialNodes <em>Initial Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodesStateImpl extends FlowHookImpl implements NodesState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodesStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.NODES_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FlowNode> getInitialNodes() {
		return (EList<FlowNode>)eDynamicGet(FlowPackage.NODES_STATE__INITIAL_NODES, FlowPackage.Literals.NODES_STATE__INITIAL_NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.NODES_STATE__INITIAL_NODES:
				return ((InternalEList<?>)getInitialNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.NODES_STATE__INITIAL_NODES:
				return getInitialNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.NODES_STATE__INITIAL_NODES:
				getInitialNodes().clear();
				getInitialNodes().addAll((Collection<? extends FlowNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FlowPackage.NODES_STATE__INITIAL_NODES:
				getInitialNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FlowPackage.NODES_STATE__INITIAL_NODES:
				return !getInitialNodes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodesStateImpl
