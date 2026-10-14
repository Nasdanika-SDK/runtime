/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Option;

import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#isIsInvalid <em>Is Invalid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormSelectImpl extends BootstrapComponentImpl implements FormSelect {
	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsInvalid() <em>Is Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INVALID_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SM;

	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_SELECT__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		eDynamicSet(FormsPackage.FORM_SELECT__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, newIsValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInvalid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_SELECT__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInvalid(boolean newIsInvalid) {
		eDynamicSet(FormsPackage.FORM_SELECT__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, newIsInvalid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return (String)eDynamicGet(FormsPackage.FORM_SELECT__FIELD_NAME, FormsPackage.Literals.FIELD__FIELD_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		eDynamicSet(FormsPackage.FORM_SELECT__FIELD_NAME, FormsPackage.Literals.FIELD__FIELD_NAME, newFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_SELECT__DISABLED, FormsPackage.Literals.FIELD__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(FormsPackage.FORM_SELECT__DISABLED, FormsPackage.Literals.FIELD__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_SELECT__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(FormsPackage.FORM_SELECT__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(FormsPackage.FORM_SELECT__SIZE, FormsPackage.Literals.FORM_SELECT__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(FormsPackage.FORM_SELECT__SIZE, FormsPackage.Literals.FORM_SELECT__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(FormsPackage.FORM_SELECT__SIZE, FormsPackage.Literals.FORM_SELECT__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(FormsPackage.FORM_SELECT__SIZE, FormsPackage.Literals.FORM_SELECT__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_SELECT__MULTIPLE, FormsPackage.Literals.FORM_SELECT__MULTIPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		eDynamicSet(FormsPackage.FORM_SELECT__MULTIPLE, FormsPackage.Literals.FORM_SELECT__MULTIPLE, newMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return (String)eDynamicGet(FormsPackage.FORM_SELECT__INITIAL_VALUE, FormsPackage.Literals.FORM_SELECT__INITIAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		eDynamicSet(FormsPackage.FORM_SELECT__INITIAL_VALUE, FormsPackage.Literals.FORM_SELECT__INITIAL_VALUE, newInitialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Option> getOptions() {
		return (EList<Option>)eDynamicGet(FormsPackage.FORM_SELECT__OPTIONS, FormsPackage.Literals.FORM_SELECT__OPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.FORM_SELECT__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.FORM_SELECT__IS_VALID:
				return isIsValid();
			case FormsPackage.FORM_SELECT__IS_INVALID:
				return isIsInvalid();
			case FormsPackage.FORM_SELECT__FIELD_NAME:
				return getFieldName();
			case FormsPackage.FORM_SELECT__DISABLED:
				return isDisabled();
			case FormsPackage.FORM_SELECT__REQUIRED:
				return isRequired();
			case FormsPackage.FORM_SELECT__SIZE:
				return getSize();
			case FormsPackage.FORM_SELECT__MULTIPLE:
				return isMultiple();
			case FormsPackage.FORM_SELECT__INITIAL_VALUE:
				return getInitialValue();
			case FormsPackage.FORM_SELECT__OPTIONS:
				return getOptions();
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
			case FormsPackage.FORM_SELECT__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case FormsPackage.FORM_SELECT__IS_INVALID:
				setIsInvalid((Boolean)newValue);
				return;
			case FormsPackage.FORM_SELECT__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case FormsPackage.FORM_SELECT__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case FormsPackage.FORM_SELECT__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case FormsPackage.FORM_SELECT__SIZE:
				setSize((Size)newValue);
				return;
			case FormsPackage.FORM_SELECT__MULTIPLE:
				setMultiple((Boolean)newValue);
				return;
			case FormsPackage.FORM_SELECT__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
			case FormsPackage.FORM_SELECT__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
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
			case FormsPackage.FORM_SELECT__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__IS_INVALID:
				setIsInvalid(IS_INVALID_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__SIZE:
				unsetSize();
				return;
			case FormsPackage.FORM_SELECT__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case FormsPackage.FORM_SELECT__OPTIONS:
				getOptions().clear();
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
			case FormsPackage.FORM_SELECT__IS_VALID:
				return isIsValid() != IS_VALID_EDEFAULT;
			case FormsPackage.FORM_SELECT__IS_INVALID:
				return isIsInvalid() != IS_INVALID_EDEFAULT;
			case FormsPackage.FORM_SELECT__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? getFieldName() != null : !FIELD_NAME_EDEFAULT.equals(getFieldName());
			case FormsPackage.FORM_SELECT__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case FormsPackage.FORM_SELECT__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case FormsPackage.FORM_SELECT__SIZE:
				return isSetSize();
			case FormsPackage.FORM_SELECT__MULTIPLE:
				return isMultiple() != MULTIPLE_EDEFAULT;
			case FormsPackage.FORM_SELECT__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? getInitialValue() != null : !INITIAL_VALUE_EDEFAULT.equals(getInitialValue());
			case FormsPackage.FORM_SELECT__OPTIONS:
				return !getOptions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Validated.class) {
			switch (derivedFeatureID) {
				case FormsPackage.FORM_SELECT__IS_VALID: return FormsPackage.VALIDATED__IS_VALID;
				case FormsPackage.FORM_SELECT__IS_INVALID: return FormsPackage.VALIDATED__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (derivedFeatureID) {
				case FormsPackage.FORM_SELECT__FIELD_NAME: return FormsPackage.FIELD__FIELD_NAME;
				case FormsPackage.FORM_SELECT__DISABLED: return FormsPackage.FIELD__DISABLED;
				case FormsPackage.FORM_SELECT__REQUIRED: return FormsPackage.FIELD__REQUIRED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Validated.class) {
			switch (baseFeatureID) {
				case FormsPackage.VALIDATED__IS_VALID: return FormsPackage.FORM_SELECT__IS_VALID;
				case FormsPackage.VALIDATED__IS_INVALID: return FormsPackage.FORM_SELECT__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (baseFeatureID) {
				case FormsPackage.FIELD__FIELD_NAME: return FormsPackage.FORM_SELECT__FIELD_NAME;
				case FormsPackage.FIELD__DISABLED: return FormsPackage.FORM_SELECT__DISABLED;
				case FormsPackage.FIELD__REQUIRED: return FormsPackage.FORM_SELECT__REQUIRED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormSelectImpl
