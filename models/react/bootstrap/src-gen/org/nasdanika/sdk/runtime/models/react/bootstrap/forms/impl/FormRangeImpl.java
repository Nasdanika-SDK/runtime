/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#isIsInvalid <em>Is Invalid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormRangeImpl extends BootstrapComponentImpl implements FormRange {
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
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_RANGE__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		eDynamicSet(FormsPackage.FORM_RANGE__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, newIsValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInvalid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_RANGE__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInvalid(boolean newIsInvalid) {
		eDynamicSet(FormsPackage.FORM_RANGE__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, newIsInvalid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return (String)eDynamicGet(FormsPackage.FORM_RANGE__FIELD_NAME, FormsPackage.Literals.FIELD__FIELD_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		eDynamicSet(FormsPackage.FORM_RANGE__FIELD_NAME, FormsPackage.Literals.FIELD__FIELD_NAME, newFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_RANGE__DISABLED, FormsPackage.Literals.FIELD__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(FormsPackage.FORM_RANGE__DISABLED, FormsPackage.Literals.FIELD__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_RANGE__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(FormsPackage.FORM_RANGE__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return (Integer)eDynamicGet(FormsPackage.FORM_RANGE__MIN, FormsPackage.Literals.FORM_RANGE__MIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		eDynamicSet(FormsPackage.FORM_RANGE__MIN, FormsPackage.Literals.FORM_RANGE__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin() {
		eDynamicUnset(FormsPackage.FORM_RANGE__MIN, FormsPackage.Literals.FORM_RANGE__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return eDynamicIsSet(FormsPackage.FORM_RANGE__MIN, FormsPackage.Literals.FORM_RANGE__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return (Integer)eDynamicGet(FormsPackage.FORM_RANGE__MAX, FormsPackage.Literals.FORM_RANGE__MAX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		eDynamicSet(FormsPackage.FORM_RANGE__MAX, FormsPackage.Literals.FORM_RANGE__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax() {
		eDynamicUnset(FormsPackage.FORM_RANGE__MAX, FormsPackage.Literals.FORM_RANGE__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return eDynamicIsSet(FormsPackage.FORM_RANGE__MAX, FormsPackage.Literals.FORM_RANGE__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStep() {
		return (Integer)eDynamicGet(FormsPackage.FORM_RANGE__STEP, FormsPackage.Literals.FORM_RANGE__STEP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(int newStep) {
		eDynamicSet(FormsPackage.FORM_RANGE__STEP, FormsPackage.Literals.FORM_RANGE__STEP, newStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStep() {
		eDynamicUnset(FormsPackage.FORM_RANGE__STEP, FormsPackage.Literals.FORM_RANGE__STEP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
		return eDynamicIsSet(FormsPackage.FORM_RANGE__STEP, FormsPackage.Literals.FORM_RANGE__STEP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialValue() {
		return (Integer)eDynamicGet(FormsPackage.FORM_RANGE__INITIAL_VALUE, FormsPackage.Literals.FORM_RANGE__INITIAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(int newInitialValue) {
		eDynamicSet(FormsPackage.FORM_RANGE__INITIAL_VALUE, FormsPackage.Literals.FORM_RANGE__INITIAL_VALUE, newInitialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialValue() {
		eDynamicUnset(FormsPackage.FORM_RANGE__INITIAL_VALUE, FormsPackage.Literals.FORM_RANGE__INITIAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialValue() {
		return eDynamicIsSet(FormsPackage.FORM_RANGE__INITIAL_VALUE, FormsPackage.Literals.FORM_RANGE__INITIAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.FORM_RANGE__IS_VALID:
				return isIsValid();
			case FormsPackage.FORM_RANGE__IS_INVALID:
				return isIsInvalid();
			case FormsPackage.FORM_RANGE__FIELD_NAME:
				return getFieldName();
			case FormsPackage.FORM_RANGE__DISABLED:
				return isDisabled();
			case FormsPackage.FORM_RANGE__REQUIRED:
				return isRequired();
			case FormsPackage.FORM_RANGE__MIN:
				return getMin();
			case FormsPackage.FORM_RANGE__MAX:
				return getMax();
			case FormsPackage.FORM_RANGE__STEP:
				return getStep();
			case FormsPackage.FORM_RANGE__INITIAL_VALUE:
				return getInitialValue();
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
			case FormsPackage.FORM_RANGE__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case FormsPackage.FORM_RANGE__IS_INVALID:
				setIsInvalid((Boolean)newValue);
				return;
			case FormsPackage.FORM_RANGE__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case FormsPackage.FORM_RANGE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case FormsPackage.FORM_RANGE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case FormsPackage.FORM_RANGE__MIN:
				setMin((Integer)newValue);
				return;
			case FormsPackage.FORM_RANGE__MAX:
				setMax((Integer)newValue);
				return;
			case FormsPackage.FORM_RANGE__STEP:
				setStep((Integer)newValue);
				return;
			case FormsPackage.FORM_RANGE__INITIAL_VALUE:
				setInitialValue((Integer)newValue);
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
			case FormsPackage.FORM_RANGE__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case FormsPackage.FORM_RANGE__IS_INVALID:
				setIsInvalid(IS_INVALID_EDEFAULT);
				return;
			case FormsPackage.FORM_RANGE__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case FormsPackage.FORM_RANGE__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case FormsPackage.FORM_RANGE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case FormsPackage.FORM_RANGE__MIN:
				unsetMin();
				return;
			case FormsPackage.FORM_RANGE__MAX:
				unsetMax();
				return;
			case FormsPackage.FORM_RANGE__STEP:
				unsetStep();
				return;
			case FormsPackage.FORM_RANGE__INITIAL_VALUE:
				unsetInitialValue();
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
			case FormsPackage.FORM_RANGE__IS_VALID:
				return isIsValid() != IS_VALID_EDEFAULT;
			case FormsPackage.FORM_RANGE__IS_INVALID:
				return isIsInvalid() != IS_INVALID_EDEFAULT;
			case FormsPackage.FORM_RANGE__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? getFieldName() != null : !FIELD_NAME_EDEFAULT.equals(getFieldName());
			case FormsPackage.FORM_RANGE__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case FormsPackage.FORM_RANGE__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case FormsPackage.FORM_RANGE__MIN:
				return isSetMin();
			case FormsPackage.FORM_RANGE__MAX:
				return isSetMax();
			case FormsPackage.FORM_RANGE__STEP:
				return isSetStep();
			case FormsPackage.FORM_RANGE__INITIAL_VALUE:
				return isSetInitialValue();
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
				case FormsPackage.FORM_RANGE__IS_VALID: return FormsPackage.VALIDATED__IS_VALID;
				case FormsPackage.FORM_RANGE__IS_INVALID: return FormsPackage.VALIDATED__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (derivedFeatureID) {
				case FormsPackage.FORM_RANGE__FIELD_NAME: return FormsPackage.FIELD__FIELD_NAME;
				case FormsPackage.FORM_RANGE__DISABLED: return FormsPackage.FIELD__DISABLED;
				case FormsPackage.FORM_RANGE__REQUIRED: return FormsPackage.FIELD__REQUIRED;
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
				case FormsPackage.VALIDATED__IS_VALID: return FormsPackage.FORM_RANGE__IS_VALID;
				case FormsPackage.VALIDATED__IS_INVALID: return FormsPackage.FORM_RANGE__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (baseFeatureID) {
				case FormsPackage.FIELD__FIELD_NAME: return FormsPackage.FORM_RANGE__FIELD_NAME;
				case FormsPackage.FIELD__DISABLED: return FormsPackage.FORM_RANGE__DISABLED;
				case FormsPackage.FIELD__REQUIRED: return FormsPackage.FORM_RANGE__REQUIRED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormRangeImpl
