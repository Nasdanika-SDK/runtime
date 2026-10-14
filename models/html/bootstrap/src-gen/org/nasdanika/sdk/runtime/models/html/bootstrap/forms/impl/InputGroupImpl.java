/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.InputGroup;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.InputGroupImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.InputGroupImpl#isHasValidation <em>Has Validation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.InputGroupImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputGroupImpl extends BootstrapElementImpl implements InputGroup {
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
	 * The default value of the '{@link #isHasValidation() <em>Has Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasValidation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_VALIDATION_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.INPUT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(FormsPackage.INPUT_GROUP__SIZE, FormsPackage.Literals.INPUT_GROUP__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(FormsPackage.INPUT_GROUP__SIZE, FormsPackage.Literals.INPUT_GROUP__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(FormsPackage.INPUT_GROUP__SIZE, FormsPackage.Literals.INPUT_GROUP__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(FormsPackage.INPUT_GROUP__SIZE, FormsPackage.Literals.INPUT_GROUP__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasValidation() {
		return (Boolean)eDynamicGet(FormsPackage.INPUT_GROUP__HAS_VALIDATION, FormsPackage.Literals.INPUT_GROUP__HAS_VALIDATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValidation(boolean newHasValidation) {
		eDynamicSet(FormsPackage.INPUT_GROUP__HAS_VALIDATION, FormsPackage.Literals.INPUT_GROUP__HAS_VALIDATION, newHasValidation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getItems() {
		return (EList<Node>)eDynamicGet(FormsPackage.INPUT_GROUP__ITEMS, FormsPackage.Literals.INPUT_GROUP__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.INPUT_GROUP__ITEMS:
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
			case FormsPackage.INPUT_GROUP__SIZE:
				return getSize();
			case FormsPackage.INPUT_GROUP__HAS_VALIDATION:
				return isHasValidation();
			case FormsPackage.INPUT_GROUP__ITEMS:
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
			case FormsPackage.INPUT_GROUP__SIZE:
				setSize((Size)newValue);
				return;
			case FormsPackage.INPUT_GROUP__HAS_VALIDATION:
				setHasValidation((Boolean)newValue);
				return;
			case FormsPackage.INPUT_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Node>)newValue);
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
			case FormsPackage.INPUT_GROUP__SIZE:
				unsetSize();
				return;
			case FormsPackage.INPUT_GROUP__HAS_VALIDATION:
				setHasValidation(HAS_VALIDATION_EDEFAULT);
				return;
			case FormsPackage.INPUT_GROUP__ITEMS:
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
			case FormsPackage.INPUT_GROUP__SIZE:
				return isSetSize();
			case FormsPackage.INPUT_GROUP__HAS_VALIDATION:
				return isHasValidation() != HAS_VALIDATION_EDEFAULT;
			case FormsPackage.INPUT_GROUP__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputGroupImpl
