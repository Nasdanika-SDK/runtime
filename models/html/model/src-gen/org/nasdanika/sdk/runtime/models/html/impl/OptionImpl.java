/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Option;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OptionImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends ElementImpl implements Option {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(HtmlPackage.OPTION__VALUE, HtmlPackage.Literals.OPTION__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(HtmlPackage.OPTION__VALUE, HtmlPackage.Literals.OPTION__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(HtmlPackage.OPTION__LABEL, HtmlPackage.Literals.OPTION__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(HtmlPackage.OPTION__LABEL, HtmlPackage.Literals.OPTION__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return (Boolean)eDynamicGet(HtmlPackage.OPTION__SELECTED, HtmlPackage.Literals.OPTION__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		eDynamicSet(HtmlPackage.OPTION__SELECTED, HtmlPackage.Literals.OPTION__SELECTED, newSelected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(HtmlPackage.OPTION__DISABLED, HtmlPackage.Literals.OPTION__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(HtmlPackage.OPTION__DISABLED, HtmlPackage.Literals.OPTION__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eDynamicGet(HtmlPackage.OPTION__TEXT, HtmlPackage.Literals.OPTION__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(HtmlPackage.OPTION__TEXT, HtmlPackage.Literals.OPTION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "option";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.OPTION__VALUE:
				return getValue();
			case HtmlPackage.OPTION__LABEL:
				return getLabel();
			case HtmlPackage.OPTION__SELECTED:
				return isSelected();
			case HtmlPackage.OPTION__DISABLED:
				return isDisabled();
			case HtmlPackage.OPTION__TEXT:
				return getText();
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
			case HtmlPackage.OPTION__VALUE:
				setValue((String)newValue);
				return;
			case HtmlPackage.OPTION__LABEL:
				setLabel((String)newValue);
				return;
			case HtmlPackage.OPTION__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case HtmlPackage.OPTION__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case HtmlPackage.OPTION__TEXT:
				setText((String)newValue);
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
			case HtmlPackage.OPTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case HtmlPackage.OPTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case HtmlPackage.OPTION__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case HtmlPackage.OPTION__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case HtmlPackage.OPTION__TEXT:
				setText(TEXT_EDEFAULT);
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
			case HtmlPackage.OPTION__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case HtmlPackage.OPTION__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case HtmlPackage.OPTION__SELECTED:
				return isSelected() != SELECTED_EDEFAULT;
			case HtmlPackage.OPTION__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case HtmlPackage.OPTION__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
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
			case HtmlPackage.OPTION___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OptionImpl
