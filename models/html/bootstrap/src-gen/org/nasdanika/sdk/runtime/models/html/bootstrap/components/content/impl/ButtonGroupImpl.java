/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ButtonGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl#isVertical <em>Vertical</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ButtonGroupImpl#getButtons <em>Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonGroupImpl extends BootstrapElementImpl implements ButtonGroup {
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
	 * The default value of the '{@link #isVertical() <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.BUTTON_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(ContentPackage.BUTTON_GROUP__SIZE, ContentPackage.Literals.BUTTON_GROUP__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(ContentPackage.BUTTON_GROUP__SIZE, ContentPackage.Literals.BUTTON_GROUP__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(ContentPackage.BUTTON_GROUP__SIZE, ContentPackage.Literals.BUTTON_GROUP__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(ContentPackage.BUTTON_GROUP__SIZE, ContentPackage.Literals.BUTTON_GROUP__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVertical() {
		return (Boolean)eDynamicGet(ContentPackage.BUTTON_GROUP__VERTICAL, ContentPackage.Literals.BUTTON_GROUP__VERTICAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertical(boolean newVertical) {
		eDynamicSet(ContentPackage.BUTTON_GROUP__VERTICAL, ContentPackage.Literals.BUTTON_GROUP__VERTICAL, newVertical);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getButtons() {
		return (EList<Node>)eDynamicGet(ContentPackage.BUTTON_GROUP__BUTTONS, ContentPackage.Literals.BUTTON_GROUP__BUTTONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.BUTTON_GROUP__BUTTONS:
				return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.BUTTON_GROUP__SIZE:
				return getSize();
			case ContentPackage.BUTTON_GROUP__VERTICAL:
				return isVertical();
			case ContentPackage.BUTTON_GROUP__BUTTONS:
				return getButtons();
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
			case ContentPackage.BUTTON_GROUP__SIZE:
				setSize((Size)newValue);
				return;
			case ContentPackage.BUTTON_GROUP__VERTICAL:
				setVertical((Boolean)newValue);
				return;
			case ContentPackage.BUTTON_GROUP__BUTTONS:
				getButtons().clear();
				getButtons().addAll((Collection<? extends Node>)newValue);
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
			case ContentPackage.BUTTON_GROUP__SIZE:
				unsetSize();
				return;
			case ContentPackage.BUTTON_GROUP__VERTICAL:
				setVertical(VERTICAL_EDEFAULT);
				return;
			case ContentPackage.BUTTON_GROUP__BUTTONS:
				getButtons().clear();
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
			case ContentPackage.BUTTON_GROUP__SIZE:
				return isSetSize();
			case ContentPackage.BUTTON_GROUP__VERTICAL:
				return isVertical() != VERTICAL_EDEFAULT;
			case ContentPackage.BUTTON_GROUP__BUTTONS:
				return !getButtons().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ButtonGroupImpl
