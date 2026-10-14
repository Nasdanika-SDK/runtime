/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.flow.DataValue;
import org.nasdanika.sdk.runtime.models.react.flow.FlowData;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl#getLabelNode <em>Label Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.FlowDataImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowDataImpl extends MinimalEObjectImpl.Container implements FlowData {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(FlowPackage.FLOW_DATA__LABEL, FlowPackage.Literals.FLOW_DATA__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(FlowPackage.FLOW_DATA__LABEL, FlowPackage.Literals.FLOW_DATA__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getLabelNode() {
		return (JsxNode)eDynamicGet(FlowPackage.FLOW_DATA__LABEL_NODE, FlowPackage.Literals.FLOW_DATA__LABEL_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelNode(JsxNode newLabelNode, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelNode, FlowPackage.FLOW_DATA__LABEL_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelNode(JsxNode newLabelNode) {
		eDynamicSet(FlowPackage.FLOW_DATA__LABEL_NODE, FlowPackage.Literals.FLOW_DATA__LABEL_NODE, newLabelNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataValue> getValues() {
		return (EList<DataValue>)eDynamicGet(FlowPackage.FLOW_DATA__VALUES, FlowPackage.Literals.FLOW_DATA__VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.FLOW_DATA__LABEL_NODE:
				return basicSetLabelNode(null, msgs);
			case FlowPackage.FLOW_DATA__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.FLOW_DATA__LABEL:
				return getLabel();
			case FlowPackage.FLOW_DATA__LABEL_NODE:
				return getLabelNode();
			case FlowPackage.FLOW_DATA__VALUES:
				return getValues();
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
			case FlowPackage.FLOW_DATA__LABEL:
				setLabel((String)newValue);
				return;
			case FlowPackage.FLOW_DATA__LABEL_NODE:
				setLabelNode((JsxNode)newValue);
				return;
			case FlowPackage.FLOW_DATA__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends DataValue>)newValue);
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
			case FlowPackage.FLOW_DATA__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FlowPackage.FLOW_DATA__LABEL_NODE:
				setLabelNode((JsxNode)null);
				return;
			case FlowPackage.FLOW_DATA__VALUES:
				getValues().clear();
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
			case FlowPackage.FLOW_DATA__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case FlowPackage.FLOW_DATA__LABEL_NODE:
				return getLabelNode() != null;
			case FlowPackage.FLOW_DATA__VALUES:
				return !getValues().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowDataImpl
