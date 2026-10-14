/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormControl;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Validated;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#isIsInvalid <em>Is Invalid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#isPlaintext <em>Plaintext</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormControlImpl#getAutocomplete <em>Autocomplete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormControlImpl extends BootstrapElementImpl implements FormControl {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

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
	 * The default value of the '{@link #isPlaintext() <em>Plaintext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaintext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLAINTEXT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadonly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READONLY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getAutocomplete() <em>Autocomplete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutocomplete()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOCOMPLETE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		eDynamicSet(FormsPackage.FORM_CONTROL__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, newIsValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInvalid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInvalid(boolean newIsInvalid) {
		eDynamicSet(FormsPackage.FORM_CONTROL__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, newIsInvalid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(FormsPackage.FORM_CONTROL__NAME, FormsPackage.Literals.FIELD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(FormsPackage.FORM_CONTROL__NAME, FormsPackage.Literals.FIELD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL__DISABLED, FormsPackage.Literals.FIELD__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(FormsPackage.FORM_CONTROL__DISABLED, FormsPackage.Literals.FIELD__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(FormsPackage.FORM_CONTROL__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(FormsPackage.FORM_CONTROL__TYPE, FormsPackage.Literals.FORM_CONTROL__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(FormsPackage.FORM_CONTROL__TYPE, FormsPackage.Literals.FORM_CONTROL__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return (String)eDynamicGet(FormsPackage.FORM_CONTROL__PLACEHOLDER, FormsPackage.Literals.FORM_CONTROL__PLACEHOLDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		eDynamicSet(FormsPackage.FORM_CONTROL__PLACEHOLDER, FormsPackage.Literals.FORM_CONTROL__PLACEHOLDER, newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(FormsPackage.FORM_CONTROL__VALUE, FormsPackage.Literals.FORM_CONTROL__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(FormsPackage.FORM_CONTROL__VALUE, FormsPackage.Literals.FORM_CONTROL__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(FormsPackage.FORM_CONTROL__SIZE, FormsPackage.Literals.FORM_CONTROL__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(FormsPackage.FORM_CONTROL__SIZE, FormsPackage.Literals.FORM_CONTROL__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(FormsPackage.FORM_CONTROL__SIZE, FormsPackage.Literals.FORM_CONTROL__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(FormsPackage.FORM_CONTROL__SIZE, FormsPackage.Literals.FORM_CONTROL__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPlaintext() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL__PLAINTEXT, FormsPackage.Literals.FORM_CONTROL__PLAINTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaintext(boolean newPlaintext) {
		eDynamicSet(FormsPackage.FORM_CONTROL__PLAINTEXT, FormsPackage.Literals.FORM_CONTROL__PLAINTEXT, newPlaintext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL__READONLY, FormsPackage.Literals.FORM_CONTROL__READONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		eDynamicSet(FormsPackage.FORM_CONTROL__READONLY, FormsPackage.Literals.FORM_CONTROL__READONLY, newReadonly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutocomplete() {
		return (String)eDynamicGet(FormsPackage.FORM_CONTROL__AUTOCOMPLETE, FormsPackage.Literals.FORM_CONTROL__AUTOCOMPLETE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutocomplete(String newAutocomplete) {
		eDynamicSet(FormsPackage.FORM_CONTROL__AUTOCOMPLETE, FormsPackage.Literals.FORM_CONTROL__AUTOCOMPLETE, newAutocomplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.FORM_CONTROL__IS_VALID:
				return isIsValid();
			case FormsPackage.FORM_CONTROL__IS_INVALID:
				return isIsInvalid();
			case FormsPackage.FORM_CONTROL__NAME:
				return getName();
			case FormsPackage.FORM_CONTROL__DISABLED:
				return isDisabled();
			case FormsPackage.FORM_CONTROL__REQUIRED:
				return isRequired();
			case FormsPackage.FORM_CONTROL__TYPE:
				return getType();
			case FormsPackage.FORM_CONTROL__PLACEHOLDER:
				return getPlaceholder();
			case FormsPackage.FORM_CONTROL__VALUE:
				return getValue();
			case FormsPackage.FORM_CONTROL__SIZE:
				return getSize();
			case FormsPackage.FORM_CONTROL__PLAINTEXT:
				return isPlaintext();
			case FormsPackage.FORM_CONTROL__READONLY:
				return isReadonly();
			case FormsPackage.FORM_CONTROL__AUTOCOMPLETE:
				return getAutocomplete();
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
			case FormsPackage.FORM_CONTROL__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case FormsPackage.FORM_CONTROL__IS_INVALID:
				setIsInvalid((Boolean)newValue);
				return;
			case FormsPackage.FORM_CONTROL__NAME:
				setName((String)newValue);
				return;
			case FormsPackage.FORM_CONTROL__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case FormsPackage.FORM_CONTROL__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case FormsPackage.FORM_CONTROL__TYPE:
				setType((String)newValue);
				return;
			case FormsPackage.FORM_CONTROL__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case FormsPackage.FORM_CONTROL__VALUE:
				setValue((String)newValue);
				return;
			case FormsPackage.FORM_CONTROL__SIZE:
				setSize((Size)newValue);
				return;
			case FormsPackage.FORM_CONTROL__PLAINTEXT:
				setPlaintext((Boolean)newValue);
				return;
			case FormsPackage.FORM_CONTROL__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case FormsPackage.FORM_CONTROL__AUTOCOMPLETE:
				setAutocomplete((String)newValue);
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
			case FormsPackage.FORM_CONTROL__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__IS_INVALID:
				setIsInvalid(IS_INVALID_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__SIZE:
				unsetSize();
				return;
			case FormsPackage.FORM_CONTROL__PLAINTEXT:
				setPlaintext(PLAINTEXT_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL__AUTOCOMPLETE:
				setAutocomplete(AUTOCOMPLETE_EDEFAULT);
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
			case FormsPackage.FORM_CONTROL__IS_VALID:
				return isIsValid() != IS_VALID_EDEFAULT;
			case FormsPackage.FORM_CONTROL__IS_INVALID:
				return isIsInvalid() != IS_INVALID_EDEFAULT;
			case FormsPackage.FORM_CONTROL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case FormsPackage.FORM_CONTROL__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case FormsPackage.FORM_CONTROL__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case FormsPackage.FORM_CONTROL__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case FormsPackage.FORM_CONTROL__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? getPlaceholder() != null : !PLACEHOLDER_EDEFAULT.equals(getPlaceholder());
			case FormsPackage.FORM_CONTROL__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case FormsPackage.FORM_CONTROL__SIZE:
				return isSetSize();
			case FormsPackage.FORM_CONTROL__PLAINTEXT:
				return isPlaintext() != PLAINTEXT_EDEFAULT;
			case FormsPackage.FORM_CONTROL__READONLY:
				return isReadonly() != READONLY_EDEFAULT;
			case FormsPackage.FORM_CONTROL__AUTOCOMPLETE:
				return AUTOCOMPLETE_EDEFAULT == null ? getAutocomplete() != null : !AUTOCOMPLETE_EDEFAULT.equals(getAutocomplete());
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
				case FormsPackage.FORM_CONTROL__IS_VALID: return FormsPackage.VALIDATED__IS_VALID;
				case FormsPackage.FORM_CONTROL__IS_INVALID: return FormsPackage.VALIDATED__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (derivedFeatureID) {
				case FormsPackage.FORM_CONTROL__NAME: return FormsPackage.FIELD__NAME;
				case FormsPackage.FORM_CONTROL__DISABLED: return FormsPackage.FIELD__DISABLED;
				case FormsPackage.FORM_CONTROL__REQUIRED: return FormsPackage.FIELD__REQUIRED;
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
				case FormsPackage.VALIDATED__IS_VALID: return FormsPackage.FORM_CONTROL__IS_VALID;
				case FormsPackage.VALIDATED__IS_INVALID: return FormsPackage.FORM_CONTROL__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (baseFeatureID) {
				case FormsPackage.FIELD__NAME: return FormsPackage.FORM_CONTROL__NAME;
				case FormsPackage.FIELD__DISABLED: return FormsPackage.FORM_CONTROL__DISABLED;
				case FormsPackage.FIELD__REQUIRED: return FormsPackage.FORM_CONTROL__REQUIRED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormControlImpl
