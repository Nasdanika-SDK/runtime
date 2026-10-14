/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl#getControlId <em>Control Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl#getLabelNode <em>Label Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingLabelImpl extends BootstrapComponentImpl implements FloatingLabel {
	/**
	 * The default value of the '{@link #getControlId() <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_ID_EDEFAULT = null;

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
	protected FloatingLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FLOATING_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlId() {
		return (String)eDynamicGet(FormsPackage.FLOATING_LABEL__CONTROL_ID, FormsPackage.Literals.FLOATING_LABEL__CONTROL_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlId(String newControlId) {
		eDynamicSet(FormsPackage.FLOATING_LABEL__CONTROL_ID, FormsPackage.Literals.FLOATING_LABEL__CONTROL_ID, newControlId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(FormsPackage.FLOATING_LABEL__LABEL, FormsPackage.Literals.FLOATING_LABEL__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(FormsPackage.FLOATING_LABEL__LABEL, FormsPackage.Literals.FLOATING_LABEL__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getLabelNode() {
		return (JsxNode)eDynamicGet(FormsPackage.FLOATING_LABEL__LABEL_NODE, FormsPackage.Literals.FLOATING_LABEL__LABEL_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelNode(JsxNode newLabelNode, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelNode, FormsPackage.FLOATING_LABEL__LABEL_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelNode(JsxNode newLabelNode) {
		eDynamicSet(FormsPackage.FLOATING_LABEL__LABEL_NODE, FormsPackage.Literals.FLOATING_LABEL__LABEL_NODE, newLabelNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsxNode getControl() {
		return (JsxNode)eDynamicGet(FormsPackage.FLOATING_LABEL__CONTROL, FormsPackage.Literals.FLOATING_LABEL__CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(JsxNode newControl, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newControl, FormsPackage.FLOATING_LABEL__CONTROL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(JsxNode newControl) {
		eDynamicSet(FormsPackage.FLOATING_LABEL__CONTROL, FormsPackage.Literals.FLOATING_LABEL__CONTROL, newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.FLOATING_LABEL__LABEL_NODE:
				return basicSetLabelNode(null, msgs);
			case FormsPackage.FLOATING_LABEL__CONTROL:
				return basicSetControl(null, msgs);
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
			case FormsPackage.FLOATING_LABEL__CONTROL_ID:
				return getControlId();
			case FormsPackage.FLOATING_LABEL__LABEL:
				return getLabel();
			case FormsPackage.FLOATING_LABEL__LABEL_NODE:
				return getLabelNode();
			case FormsPackage.FLOATING_LABEL__CONTROL:
				return getControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormsPackage.FLOATING_LABEL__CONTROL_ID:
				setControlId((String)newValue);
				return;
			case FormsPackage.FLOATING_LABEL__LABEL:
				setLabel((String)newValue);
				return;
			case FormsPackage.FLOATING_LABEL__LABEL_NODE:
				setLabelNode((JsxNode)newValue);
				return;
			case FormsPackage.FLOATING_LABEL__CONTROL:
				setControl((JsxNode)newValue);
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
			case FormsPackage.FLOATING_LABEL__CONTROL_ID:
				setControlId(CONTROL_ID_EDEFAULT);
				return;
			case FormsPackage.FLOATING_LABEL__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormsPackage.FLOATING_LABEL__LABEL_NODE:
				setLabelNode((JsxNode)null);
				return;
			case FormsPackage.FLOATING_LABEL__CONTROL:
				setControl((JsxNode)null);
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
			case FormsPackage.FLOATING_LABEL__CONTROL_ID:
				return CONTROL_ID_EDEFAULT == null ? getControlId() != null : !CONTROL_ID_EDEFAULT.equals(getControlId());
			case FormsPackage.FLOATING_LABEL__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case FormsPackage.FLOATING_LABEL__LABEL_NODE:
				return getLabelNode() != null;
			case FormsPackage.FLOATING_LABEL__CONTROL:
				return getControl() != null;
		}
		return super.eIsSet(featureID);
	}

} //FloatingLabelImpl
