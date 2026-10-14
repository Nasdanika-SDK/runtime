/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Select;
import org.nasdanika.sdk.runtime.models.html.SelectItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.SelectImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends ElementImpl implements Select {
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
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(HtmlPackage.SELECT__NAME, HtmlPackage.Literals.SELECT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(HtmlPackage.SELECT__NAME, HtmlPackage.Literals.SELECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiple() {
		return (Boolean)eDynamicGet(HtmlPackage.SELECT__MULTIPLE, HtmlPackage.Literals.SELECT__MULTIPLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(boolean newMultiple) {
		eDynamicSet(HtmlPackage.SELECT__MULTIPLE, HtmlPackage.Literals.SELECT__MULTIPLE, newMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return (Boolean)eDynamicGet(HtmlPackage.SELECT__REQUIRED, HtmlPackage.Literals.SELECT__REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		eDynamicSet(HtmlPackage.SELECT__REQUIRED, HtmlPackage.Literals.SELECT__REQUIRED, newRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(HtmlPackage.SELECT__DISABLED, HtmlPackage.Literals.SELECT__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(HtmlPackage.SELECT__DISABLED, HtmlPackage.Literals.SELECT__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eDynamicGet(HtmlPackage.SELECT__SIZE, HtmlPackage.Literals.SELECT__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eDynamicSet(HtmlPackage.SELECT__SIZE, HtmlPackage.Literals.SELECT__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectItem> getItems() {
		return (EList<SelectItem>)eDynamicGet(HtmlPackage.SELECT__ITEMS, HtmlPackage.Literals.SELECT__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "select";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.SELECT__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.SELECT__NAME:
				return getName();
			case HtmlPackage.SELECT__MULTIPLE:
				return isMultiple();
			case HtmlPackage.SELECT__REQUIRED:
				return isRequired();
			case HtmlPackage.SELECT__DISABLED:
				return isDisabled();
			case HtmlPackage.SELECT__SIZE:
				return getSize();
			case HtmlPackage.SELECT__ITEMS:
				return getItems();
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
			case HtmlPackage.SELECT__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.SELECT__MULTIPLE:
				setMultiple((Boolean)newValue);
				return;
			case HtmlPackage.SELECT__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case HtmlPackage.SELECT__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case HtmlPackage.SELECT__SIZE:
				setSize((Integer)newValue);
				return;
			case HtmlPackage.SELECT__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends SelectItem>)newValue);
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
			case HtmlPackage.SELECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.SELECT__MULTIPLE:
				setMultiple(MULTIPLE_EDEFAULT);
				return;
			case HtmlPackage.SELECT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case HtmlPackage.SELECT__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case HtmlPackage.SELECT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case HtmlPackage.SELECT__ITEMS:
				getItems().clear();
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
			case HtmlPackage.SELECT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case HtmlPackage.SELECT__MULTIPLE:
				return isMultiple() != MULTIPLE_EDEFAULT;
			case HtmlPackage.SELECT__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case HtmlPackage.SELECT__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case HtmlPackage.SELECT__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case HtmlPackage.SELECT__ITEMS:
				return !getItems().isEmpty();
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
			case HtmlPackage.SELECT___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SelectImpl
