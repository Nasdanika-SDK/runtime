/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Input;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#isChecked <em>Checked</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InputImpl#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends VoidElementImpl implements Input {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

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
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

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
	 * The default value of the '{@link #isChecked() <em>Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_EDEFAULT = false;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(HtmlPackage.INPUT__TYPE, HtmlPackage.Literals.INPUT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(HtmlPackage.INPUT__TYPE, HtmlPackage.Literals.INPUT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(HtmlPackage.INPUT__NAME, HtmlPackage.Literals.INPUT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(HtmlPackage.INPUT__NAME, HtmlPackage.Literals.INPUT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(HtmlPackage.INPUT__VALUE, HtmlPackage.Literals.INPUT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(HtmlPackage.INPUT__VALUE, HtmlPackage.Literals.INPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return (String)eDynamicGet(HtmlPackage.INPUT__PLACEHOLDER, HtmlPackage.Literals.INPUT__PLACEHOLDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		eDynamicSet(HtmlPackage.INPUT__PLACEHOLDER, HtmlPackage.Literals.INPUT__PLACEHOLDER, newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(HtmlPackage.INPUT__REQUIRED, HtmlPackage.Literals.INPUT__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(HtmlPackage.INPUT__REQUIRED, HtmlPackage.Literals.INPUT__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(HtmlPackage.INPUT__DISABLED, HtmlPackage.Literals.INPUT__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(HtmlPackage.INPUT__DISABLED, HtmlPackage.Literals.INPUT__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return (Boolean)eDynamicGet(HtmlPackage.INPUT__READONLY, HtmlPackage.Literals.INPUT__READONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		eDynamicSet(HtmlPackage.INPUT__READONLY, HtmlPackage.Literals.INPUT__READONLY, newReadonly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChecked() {
		return (Boolean)eDynamicGet(HtmlPackage.INPUT__CHECKED, HtmlPackage.Literals.INPUT__CHECKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecked(boolean newChecked) {
		eDynamicSet(HtmlPackage.INPUT__CHECKED, HtmlPackage.Literals.INPUT__CHECKED, newChecked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return (Boolean)eDynamicGet(HtmlPackage.INPUT__MULTIPLE, HtmlPackage.Literals.INPUT__MULTIPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		eDynamicSet(HtmlPackage.INPUT__MULTIPLE, HtmlPackage.Literals.INPUT__MULTIPLE, newMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "input";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.INPUT__TYPE:
				return getType();
			case HtmlPackage.INPUT__NAME:
				return getName();
			case HtmlPackage.INPUT__VALUE:
				return getValue();
			case HtmlPackage.INPUT__PLACEHOLDER:
				return getPlaceholder();
			case HtmlPackage.INPUT__REQUIRED:
				return isRequired();
			case HtmlPackage.INPUT__DISABLED:
				return isDisabled();
			case HtmlPackage.INPUT__READONLY:
				return isReadonly();
			case HtmlPackage.INPUT__CHECKED:
				return isChecked();
			case HtmlPackage.INPUT__MULTIPLE:
				return isMultiple();
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
			case HtmlPackage.INPUT__TYPE:
				setType((String)newValue);
				return;
			case HtmlPackage.INPUT__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.INPUT__VALUE:
				setValue((String)newValue);
				return;
			case HtmlPackage.INPUT__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case HtmlPackage.INPUT__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case HtmlPackage.INPUT__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case HtmlPackage.INPUT__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case HtmlPackage.INPUT__CHECKED:
				setChecked((Boolean)newValue);
				return;
			case HtmlPackage.INPUT__MULTIPLE:
				setMultiple((Boolean)newValue);
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
			case HtmlPackage.INPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HtmlPackage.INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.INPUT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case HtmlPackage.INPUT__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case HtmlPackage.INPUT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case HtmlPackage.INPUT__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case HtmlPackage.INPUT__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case HtmlPackage.INPUT__CHECKED:
				setChecked(CHECKED_EDEFAULT);
				return;
			case HtmlPackage.INPUT__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
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
			case HtmlPackage.INPUT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case HtmlPackage.INPUT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case HtmlPackage.INPUT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case HtmlPackage.INPUT__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? getPlaceholder() != null : !PLACEHOLDER_EDEFAULT.equals(getPlaceholder());
			case HtmlPackage.INPUT__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case HtmlPackage.INPUT__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case HtmlPackage.INPUT__READONLY:
				return isReadonly() != READONLY_EDEFAULT;
			case HtmlPackage.INPUT__CHECKED:
				return isChecked() != CHECKED_EDEFAULT;
			case HtmlPackage.INPUT__MULTIPLE:
				return isMultiple() != MULTIPLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HtmlPackage.INPUT___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InputImpl
