/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl#getControlId <em>Control Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormGroupImpl extends BootstrapComponentImpl implements FormGroup {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlId() {
		return (String)eDynamicGet(FormsPackage.FORM_GROUP__CONTROL_ID, FormsPackage.Literals.FORM_GROUP__CONTROL_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlId(String newControlId) {
		eDynamicSet(FormsPackage.FORM_GROUP__CONTROL_ID, FormsPackage.Literals.FORM_GROUP__CONTROL_ID, newControlId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLabel getLabel() {
		return (FormLabel)eDynamicGet(FormsPackage.FORM_GROUP__LABEL, FormsPackage.Literals.FORM_GROUP__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(FormLabel newLabel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabel, FormsPackage.FORM_GROUP__LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(FormLabel newLabel) {
		eDynamicSet(FormsPackage.FORM_GROUP__LABEL, FormsPackage.Literals.FORM_GROUP__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JsxNode> getControls() {
		return (EList<JsxNode>)eDynamicGet(FormsPackage.FORM_GROUP__CONTROLS, FormsPackage.Literals.FORM_GROUP__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormText getText() {
		return (FormText)eDynamicGet(FormsPackage.FORM_GROUP__TEXT, FormsPackage.Literals.FORM_GROUP__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(FormText newText, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newText, FormsPackage.FORM_GROUP__TEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(FormText newText) {
		eDynamicSet(FormsPackage.FORM_GROUP__TEXT, FormsPackage.Literals.FORM_GROUP__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FormControlFeedback> getFeedback() {
		return (EList<FormControlFeedback>)eDynamicGet(FormsPackage.FORM_GROUP__FEEDBACK, FormsPackage.Literals.FORM_GROUP__FEEDBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.FORM_GROUP__LABEL:
				return basicSetLabel(null, msgs);
			case FormsPackage.FORM_GROUP__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case FormsPackage.FORM_GROUP__TEXT:
				return basicSetText(null, msgs);
			case FormsPackage.FORM_GROUP__FEEDBACK:
				return ((InternalEList<?>)getFeedback()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.FORM_GROUP__CONTROL_ID:
				return getControlId();
			case FormsPackage.FORM_GROUP__LABEL:
				return getLabel();
			case FormsPackage.FORM_GROUP__CONTROLS:
				return getControls();
			case FormsPackage.FORM_GROUP__TEXT:
				return getText();
			case FormsPackage.FORM_GROUP__FEEDBACK:
				return getFeedback();
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
			case FormsPackage.FORM_GROUP__CONTROL_ID:
				setControlId((String)newValue);
				return;
			case FormsPackage.FORM_GROUP__LABEL:
				setLabel((FormLabel)newValue);
				return;
			case FormsPackage.FORM_GROUP__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends JsxNode>)newValue);
				return;
			case FormsPackage.FORM_GROUP__TEXT:
				setText((FormText)newValue);
				return;
			case FormsPackage.FORM_GROUP__FEEDBACK:
				getFeedback().clear();
				getFeedback().addAll((Collection<? extends FormControlFeedback>)newValue);
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
			case FormsPackage.FORM_GROUP__CONTROL_ID:
				setControlId(CONTROL_ID_EDEFAULT);
				return;
			case FormsPackage.FORM_GROUP__LABEL:
				setLabel((FormLabel)null);
				return;
			case FormsPackage.FORM_GROUP__CONTROLS:
				getControls().clear();
				return;
			case FormsPackage.FORM_GROUP__TEXT:
				setText((FormText)null);
				return;
			case FormsPackage.FORM_GROUP__FEEDBACK:
				getFeedback().clear();
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
			case FormsPackage.FORM_GROUP__CONTROL_ID:
				return CONTROL_ID_EDEFAULT == null ? getControlId() != null : !CONTROL_ID_EDEFAULT.equals(getControlId());
			case FormsPackage.FORM_GROUP__LABEL:
				return getLabel() != null;
			case FormsPackage.FORM_GROUP__CONTROLS:
				return !getControls().isEmpty();
			case FormsPackage.FORM_GROUP__TEXT:
				return getText() != null;
			case FormsPackage.FORM_GROUP__FEEDBACK:
				return !getFeedback().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormGroupImpl
