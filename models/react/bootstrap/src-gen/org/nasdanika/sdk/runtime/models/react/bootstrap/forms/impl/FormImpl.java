/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl#isValidated <em>Validated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl#isNoValidate <em>No Validate</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends BootstrapComponentImpl implements Form {
	/**
	 * The default value of the '{@link #isValidated() <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNoValidate() <em>No Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoValidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_VALIDATE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidated() {
		return (Boolean)eDynamicGet(FormsPackage.FORM__VALIDATED, FormsPackage.Literals.FORM__VALIDATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidated(boolean newValidated) {
		eDynamicSet(FormsPackage.FORM__VALIDATED, FormsPackage.Literals.FORM__VALIDATED, newValidated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoValidate() {
		return (Boolean)eDynamicGet(FormsPackage.FORM__NO_VALIDATE, FormsPackage.Literals.FORM__NO_VALIDATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoValidate(boolean newNoValidate) {
		eDynamicSet(FormsPackage.FORM__NO_VALIDATE, FormsPackage.Literals.FORM__NO_VALIDATE, newNoValidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return (String)eDynamicGet(FormsPackage.FORM__ACTION, FormsPackage.Literals.FORM__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		eDynamicSet(FormsPackage.FORM__ACTION, FormsPackage.Literals.FORM__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return (String)eDynamicGet(FormsPackage.FORM__METHOD, FormsPackage.Literals.FORM__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		eDynamicSet(FormsPackage.FORM__METHOD, FormsPackage.Literals.FORM__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FormGroup> getGroups() {
		return (EList<FormGroup>)eDynamicGet(FormsPackage.FORM__GROUPS, FormsPackage.Literals.FORM__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.FORM__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.FORM__VALIDATED:
				return isValidated();
			case FormsPackage.FORM__NO_VALIDATE:
				return isNoValidate();
			case FormsPackage.FORM__ACTION:
				return getAction();
			case FormsPackage.FORM__METHOD:
				return getMethod();
			case FormsPackage.FORM__GROUPS:
				return getGroups();
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
			case FormsPackage.FORM__VALIDATED:
				setValidated((Boolean)newValue);
				return;
			case FormsPackage.FORM__NO_VALIDATE:
				setNoValidate((Boolean)newValue);
				return;
			case FormsPackage.FORM__ACTION:
				setAction((String)newValue);
				return;
			case FormsPackage.FORM__METHOD:
				setMethod((String)newValue);
				return;
			case FormsPackage.FORM__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends FormGroup>)newValue);
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
			case FormsPackage.FORM__VALIDATED:
				setValidated(VALIDATED_EDEFAULT);
				return;
			case FormsPackage.FORM__NO_VALIDATE:
				setNoValidate(NO_VALIDATE_EDEFAULT);
				return;
			case FormsPackage.FORM__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case FormsPackage.FORM__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case FormsPackage.FORM__GROUPS:
				getGroups().clear();
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
			case FormsPackage.FORM__VALIDATED:
				return isValidated() != VALIDATED_EDEFAULT;
			case FormsPackage.FORM__NO_VALIDATE:
				return isNoValidate() != NO_VALIDATE_EDEFAULT;
			case FormsPackage.FORM__ACTION:
				return ACTION_EDEFAULT == null ? getAction() != null : !ACTION_EDEFAULT.equals(getAction());
			case FormsPackage.FORM__METHOD:
				return METHOD_EDEFAULT == null ? getMethod() != null : !METHOD_EDEFAULT.equals(getMethod());
			case FormsPackage.FORM__GROUPS:
				return !getGroups().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormImpl
