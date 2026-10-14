/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormCheck;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Validated;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isIsInvalid <em>Is Invalid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getInputId <em>Input Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isInline <em>Inline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isReverse <em>Reverse</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#isChecked <em>Checked</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormCheckImpl#getFeedbackType <em>Feedback Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormCheckImpl extends BootstrapElementImpl implements FormCheck {
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
	protected static final CheckType TYPE_EDEFAULT = CheckType.CHECKBOX;

	/**
	 * The default value of the '{@link #getInputId() <em>Input Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputId()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isInline() <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INLINE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final String FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFeedbackType() <em>Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackType()
	 * @generated
	 * @ordered
	 */
	protected static final FeedbackType FEEDBACK_TYPE_EDEFAULT = FeedbackType.INVALID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		eDynamicSet(FormsPackage.FORM_CHECK__IS_VALID, FormsPackage.Literals.VALIDATED__IS_VALID, newIsValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInvalid() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInvalid(boolean newIsInvalid) {
		eDynamicSet(FormsPackage.FORM_CHECK__IS_INVALID, FormsPackage.Literals.VALIDATED__IS_INVALID, newIsInvalid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(FormsPackage.FORM_CHECK__NAME, FormsPackage.Literals.FIELD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(FormsPackage.FORM_CHECK__NAME, FormsPackage.Literals.FIELD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__DISABLED, FormsPackage.Literals.FIELD__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(FormsPackage.FORM_CHECK__DISABLED, FormsPackage.Literals.FIELD__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(FormsPackage.FORM_CHECK__REQUIRED, FormsPackage.Literals.FIELD__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckType getType() {
		return (CheckType)eDynamicGet(FormsPackage.FORM_CHECK__TYPE, FormsPackage.Literals.FORM_CHECK__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CheckType newType) {
		eDynamicSet(FormsPackage.FORM_CHECK__TYPE, FormsPackage.Literals.FORM_CHECK__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		eDynamicUnset(FormsPackage.FORM_CHECK__TYPE, FormsPackage.Literals.FORM_CHECK__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return eDynamicIsSet(FormsPackage.FORM_CHECK__TYPE, FormsPackage.Literals.FORM_CHECK__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputId() {
		return (String)eDynamicGet(FormsPackage.FORM_CHECK__INPUT_ID, FormsPackage.Literals.FORM_CHECK__INPUT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputId(String newInputId) {
		eDynamicSet(FormsPackage.FORM_CHECK__INPUT_ID, FormsPackage.Literals.FORM_CHECK__INPUT_ID, newInputId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(FormsPackage.FORM_CHECK__LABEL, FormsPackage.Literals.FORM_CHECK__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(FormsPackage.FORM_CHECK__LABEL, FormsPackage.Literals.FORM_CHECK__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(FormsPackage.FORM_CHECK__VALUE, FormsPackage.Literals.FORM_CHECK__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(FormsPackage.FORM_CHECK__VALUE, FormsPackage.Literals.FORM_CHECK__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInline() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__INLINE, FormsPackage.Literals.FORM_CHECK__INLINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInline(boolean newInline) {
		eDynamicSet(FormsPackage.FORM_CHECK__INLINE, FormsPackage.Literals.FORM_CHECK__INLINE, newInline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReverse() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__REVERSE, FormsPackage.Literals.FORM_CHECK__REVERSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(boolean newReverse) {
		eDynamicSet(FormsPackage.FORM_CHECK__REVERSE, FormsPackage.Literals.FORM_CHECK__REVERSE, newReverse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChecked() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CHECK__CHECKED, FormsPackage.Literals.FORM_CHECK__CHECKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecked(boolean newChecked) {
		eDynamicSet(FormsPackage.FORM_CHECK__CHECKED, FormsPackage.Literals.FORM_CHECK__CHECKED, newChecked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedback() {
		return (String)eDynamicGet(FormsPackage.FORM_CHECK__FEEDBACK, FormsPackage.Literals.FORM_CHECK__FEEDBACK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(String newFeedback) {
		eDynamicSet(FormsPackage.FORM_CHECK__FEEDBACK, FormsPackage.Literals.FORM_CHECK__FEEDBACK, newFeedback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackType getFeedbackType() {
		return (FeedbackType)eDynamicGet(FormsPackage.FORM_CHECK__FEEDBACK_TYPE, FormsPackage.Literals.FORM_CHECK__FEEDBACK_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackType(FeedbackType newFeedbackType) {
		eDynamicSet(FormsPackage.FORM_CHECK__FEEDBACK_TYPE, FormsPackage.Literals.FORM_CHECK__FEEDBACK_TYPE, newFeedbackType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeedbackType() {
		eDynamicUnset(FormsPackage.FORM_CHECK__FEEDBACK_TYPE, FormsPackage.Literals.FORM_CHECK__FEEDBACK_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeedbackType() {
		return eDynamicIsSet(FormsPackage.FORM_CHECK__FEEDBACK_TYPE, FormsPackage.Literals.FORM_CHECK__FEEDBACK_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.FORM_CHECK__IS_VALID:
				return isIsValid();
			case FormsPackage.FORM_CHECK__IS_INVALID:
				return isIsInvalid();
			case FormsPackage.FORM_CHECK__NAME:
				return getName();
			case FormsPackage.FORM_CHECK__DISABLED:
				return isDisabled();
			case FormsPackage.FORM_CHECK__REQUIRED:
				return isRequired();
			case FormsPackage.FORM_CHECK__TYPE:
				return getType();
			case FormsPackage.FORM_CHECK__INPUT_ID:
				return getInputId();
			case FormsPackage.FORM_CHECK__LABEL:
				return getLabel();
			case FormsPackage.FORM_CHECK__VALUE:
				return getValue();
			case FormsPackage.FORM_CHECK__INLINE:
				return isInline();
			case FormsPackage.FORM_CHECK__REVERSE:
				return isReverse();
			case FormsPackage.FORM_CHECK__CHECKED:
				return isChecked();
			case FormsPackage.FORM_CHECK__FEEDBACK:
				return getFeedback();
			case FormsPackage.FORM_CHECK__FEEDBACK_TYPE:
				return getFeedbackType();
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
			case FormsPackage.FORM_CHECK__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__IS_INVALID:
				setIsInvalid((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__NAME:
				setName((String)newValue);
				return;
			case FormsPackage.FORM_CHECK__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__TYPE:
				setType((CheckType)newValue);
				return;
			case FormsPackage.FORM_CHECK__INPUT_ID:
				setInputId((String)newValue);
				return;
			case FormsPackage.FORM_CHECK__LABEL:
				setLabel((String)newValue);
				return;
			case FormsPackage.FORM_CHECK__VALUE:
				setValue((String)newValue);
				return;
			case FormsPackage.FORM_CHECK__INLINE:
				setInline((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__REVERSE:
				setReverse((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__CHECKED:
				setChecked((Boolean)newValue);
				return;
			case FormsPackage.FORM_CHECK__FEEDBACK:
				setFeedback((String)newValue);
				return;
			case FormsPackage.FORM_CHECK__FEEDBACK_TYPE:
				setFeedbackType((FeedbackType)newValue);
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
			case FormsPackage.FORM_CHECK__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__IS_INVALID:
				setIsInvalid(IS_INVALID_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__TYPE:
				unsetType();
				return;
			case FormsPackage.FORM_CHECK__INPUT_ID:
				setInputId(INPUT_ID_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__INLINE:
				setInline(INLINE_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__REVERSE:
				setReverse(REVERSE_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__CHECKED:
				setChecked(CHECKED_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__FEEDBACK:
				setFeedback(FEEDBACK_EDEFAULT);
				return;
			case FormsPackage.FORM_CHECK__FEEDBACK_TYPE:
				unsetFeedbackType();
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
			case FormsPackage.FORM_CHECK__IS_VALID:
				return isIsValid() != IS_VALID_EDEFAULT;
			case FormsPackage.FORM_CHECK__IS_INVALID:
				return isIsInvalid() != IS_INVALID_EDEFAULT;
			case FormsPackage.FORM_CHECK__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case FormsPackage.FORM_CHECK__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case FormsPackage.FORM_CHECK__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case FormsPackage.FORM_CHECK__TYPE:
				return isSetType();
			case FormsPackage.FORM_CHECK__INPUT_ID:
				return INPUT_ID_EDEFAULT == null ? getInputId() != null : !INPUT_ID_EDEFAULT.equals(getInputId());
			case FormsPackage.FORM_CHECK__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case FormsPackage.FORM_CHECK__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case FormsPackage.FORM_CHECK__INLINE:
				return isInline() != INLINE_EDEFAULT;
			case FormsPackage.FORM_CHECK__REVERSE:
				return isReverse() != REVERSE_EDEFAULT;
			case FormsPackage.FORM_CHECK__CHECKED:
				return isChecked() != CHECKED_EDEFAULT;
			case FormsPackage.FORM_CHECK__FEEDBACK:
				return FEEDBACK_EDEFAULT == null ? getFeedback() != null : !FEEDBACK_EDEFAULT.equals(getFeedback());
			case FormsPackage.FORM_CHECK__FEEDBACK_TYPE:
				return isSetFeedbackType();
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
				case FormsPackage.FORM_CHECK__IS_VALID: return FormsPackage.VALIDATED__IS_VALID;
				case FormsPackage.FORM_CHECK__IS_INVALID: return FormsPackage.VALIDATED__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (derivedFeatureID) {
				case FormsPackage.FORM_CHECK__NAME: return FormsPackage.FIELD__NAME;
				case FormsPackage.FORM_CHECK__DISABLED: return FormsPackage.FIELD__DISABLED;
				case FormsPackage.FORM_CHECK__REQUIRED: return FormsPackage.FIELD__REQUIRED;
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
				case FormsPackage.VALIDATED__IS_VALID: return FormsPackage.FORM_CHECK__IS_VALID;
				case FormsPackage.VALIDATED__IS_INVALID: return FormsPackage.FORM_CHECK__IS_INVALID;
				default: return -1;
			}
		}
		if (baseClass == Field.class) {
			switch (baseFeatureID) {
				case FormsPackage.FIELD__NAME: return FormsPackage.FORM_CHECK__NAME;
				case FormsPackage.FIELD__DISABLED: return FormsPackage.FORM_CHECK__DISABLED;
				case FormsPackage.FIELD__REQUIRED: return FormsPackage.FORM_CHECK__REQUIRED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormCheckImpl
