/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.TextArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#getCols <em>Cols</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TextAreaImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextAreaImpl extends ElementImpl implements TextArea {
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
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected static final int COLS_EDEFAULT = 0;

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
	protected TextAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TEXT_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(HtmlPackage.TEXT_AREA__NAME, HtmlPackage.Literals.TEXT_AREA__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(HtmlPackage.TEXT_AREA__NAME, HtmlPackage.Literals.TEXT_AREA__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return (Integer)eDynamicGet(HtmlPackage.TEXT_AREA__ROWS, HtmlPackage.Literals.TEXT_AREA__ROWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		eDynamicSet(HtmlPackage.TEXT_AREA__ROWS, HtmlPackage.Literals.TEXT_AREA__ROWS, newRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCols() {
		return (Integer)eDynamicGet(HtmlPackage.TEXT_AREA__COLS, HtmlPackage.Literals.TEXT_AREA__COLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCols(int newCols) {
		eDynamicSet(HtmlPackage.TEXT_AREA__COLS, HtmlPackage.Literals.TEXT_AREA__COLS, newCols);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return (String)eDynamicGet(HtmlPackage.TEXT_AREA__PLACEHOLDER, HtmlPackage.Literals.TEXT_AREA__PLACEHOLDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		eDynamicSet(HtmlPackage.TEXT_AREA__PLACEHOLDER, HtmlPackage.Literals.TEXT_AREA__PLACEHOLDER, newPlaceholder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(HtmlPackage.TEXT_AREA__REQUIRED, HtmlPackage.Literals.TEXT_AREA__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(HtmlPackage.TEXT_AREA__REQUIRED, HtmlPackage.Literals.TEXT_AREA__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(HtmlPackage.TEXT_AREA__DISABLED, HtmlPackage.Literals.TEXT_AREA__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(HtmlPackage.TEXT_AREA__DISABLED, HtmlPackage.Literals.TEXT_AREA__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return (Boolean)eDynamicGet(HtmlPackage.TEXT_AREA__READONLY, HtmlPackage.Literals.TEXT_AREA__READONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		eDynamicSet(HtmlPackage.TEXT_AREA__READONLY, HtmlPackage.Literals.TEXT_AREA__READONLY, newReadonly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eDynamicGet(HtmlPackage.TEXT_AREA__TEXT, HtmlPackage.Literals.TEXT_AREA__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(HtmlPackage.TEXT_AREA__TEXT, HtmlPackage.Literals.TEXT_AREA__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "textarea";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.TEXT_AREA__NAME:
				return getName();
			case HtmlPackage.TEXT_AREA__ROWS:
				return getRows();
			case HtmlPackage.TEXT_AREA__COLS:
				return getCols();
			case HtmlPackage.TEXT_AREA__PLACEHOLDER:
				return getPlaceholder();
			case HtmlPackage.TEXT_AREA__REQUIRED:
				return isRequired();
			case HtmlPackage.TEXT_AREA__DISABLED:
				return isDisabled();
			case HtmlPackage.TEXT_AREA__READONLY:
				return isReadonly();
			case HtmlPackage.TEXT_AREA__TEXT:
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
			case HtmlPackage.TEXT_AREA__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.TEXT_AREA__ROWS:
				setRows((Integer)newValue);
				return;
			case HtmlPackage.TEXT_AREA__COLS:
				setCols((Integer)newValue);
				return;
			case HtmlPackage.TEXT_AREA__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case HtmlPackage.TEXT_AREA__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case HtmlPackage.TEXT_AREA__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case HtmlPackage.TEXT_AREA__READONLY:
				setReadonly((Boolean)newValue);
				return;
			case HtmlPackage.TEXT_AREA__TEXT:
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
			case HtmlPackage.TEXT_AREA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__COLS:
				setCols(COLS_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__READONLY:
				setReadonly(READONLY_EDEFAULT);
				return;
			case HtmlPackage.TEXT_AREA__TEXT:
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
			case HtmlPackage.TEXT_AREA__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case HtmlPackage.TEXT_AREA__ROWS:
				return getRows() != ROWS_EDEFAULT;
			case HtmlPackage.TEXT_AREA__COLS:
				return getCols() != COLS_EDEFAULT;
			case HtmlPackage.TEXT_AREA__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? getPlaceholder() != null : !PLACEHOLDER_EDEFAULT.equals(getPlaceholder());
			case HtmlPackage.TEXT_AREA__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case HtmlPackage.TEXT_AREA__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case HtmlPackage.TEXT_AREA__READONLY:
				return isReadonly() != READONLY_EDEFAULT;
			case HtmlPackage.TEXT_AREA__TEXT:
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
			case HtmlPackage.TEXT_AREA___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TextAreaImpl
