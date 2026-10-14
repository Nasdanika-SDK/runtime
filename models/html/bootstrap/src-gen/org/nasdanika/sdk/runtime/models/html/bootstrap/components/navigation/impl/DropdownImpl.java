/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Align;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Dropdown;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownMenu;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownToggle;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dropdown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownImpl#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownImpl#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropdownImpl extends BootstrapElementImpl implements Dropdown {
	/**
	 * The default value of the '{@link #getDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected static final Drop DROP_EDEFAULT = Drop.DOWN;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Align ALIGN_EDEFAULT = Align.START;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropdownImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DROPDOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop getDrop() {
		return (Drop)eDynamicGet(NavigationPackage.DROPDOWN__DROP, NavigationPackage.Literals.DROPDOWN__DROP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrop(Drop newDrop) {
		eDynamicSet(NavigationPackage.DROPDOWN__DROP, NavigationPackage.Literals.DROPDOWN__DROP, newDrop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrop() {
		eDynamicUnset(NavigationPackage.DROPDOWN__DROP, NavigationPackage.Literals.DROPDOWN__DROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrop() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN__DROP, NavigationPackage.Literals.DROPDOWN__DROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align getAlign() {
		return (Align)eDynamicGet(NavigationPackage.DROPDOWN__ALIGN, NavigationPackage.Literals.DROPDOWN__ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Align newAlign) {
		eDynamicSet(NavigationPackage.DROPDOWN__ALIGN, NavigationPackage.Literals.DROPDOWN__ALIGN, newAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		eDynamicUnset(NavigationPackage.DROPDOWN__ALIGN, NavigationPackage.Literals.DROPDOWN__ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN__ALIGN, NavigationPackage.Literals.DROPDOWN__ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownToggle getToggle() {
		return (DropdownToggle)eDynamicGet(NavigationPackage.DROPDOWN__TOGGLE, NavigationPackage.Literals.DROPDOWN__TOGGLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToggle(DropdownToggle newToggle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newToggle, NavigationPackage.DROPDOWN__TOGGLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToggle(DropdownToggle newToggle) {
		eDynamicSet(NavigationPackage.DROPDOWN__TOGGLE, NavigationPackage.Literals.DROPDOWN__TOGGLE, newToggle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownMenu getMenu() {
		return (DropdownMenu)eDynamicGet(NavigationPackage.DROPDOWN__MENU, NavigationPackage.Literals.DROPDOWN__MENU, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenu(DropdownMenu newMenu, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMenu, NavigationPackage.DROPDOWN__MENU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(DropdownMenu newMenu) {
		eDynamicSet(NavigationPackage.DROPDOWN__MENU, NavigationPackage.Literals.DROPDOWN__MENU, newMenu);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.DROPDOWN__TOGGLE:
				return basicSetToggle(null, msgs);
			case NavigationPackage.DROPDOWN__MENU:
				return basicSetMenu(null, msgs);
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
			case NavigationPackage.DROPDOWN__DROP:
				return getDrop();
			case NavigationPackage.DROPDOWN__ALIGN:
				return getAlign();
			case NavigationPackage.DROPDOWN__TOGGLE:
				return getToggle();
			case NavigationPackage.DROPDOWN__MENU:
				return getMenu();
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
			case NavigationPackage.DROPDOWN__DROP:
				setDrop((Drop)newValue);
				return;
			case NavigationPackage.DROPDOWN__ALIGN:
				setAlign((Align)newValue);
				return;
			case NavigationPackage.DROPDOWN__TOGGLE:
				setToggle((DropdownToggle)newValue);
				return;
			case NavigationPackage.DROPDOWN__MENU:
				setMenu((DropdownMenu)newValue);
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
			case NavigationPackage.DROPDOWN__DROP:
				unsetDrop();
				return;
			case NavigationPackage.DROPDOWN__ALIGN:
				unsetAlign();
				return;
			case NavigationPackage.DROPDOWN__TOGGLE:
				setToggle((DropdownToggle)null);
				return;
			case NavigationPackage.DROPDOWN__MENU:
				setMenu((DropdownMenu)null);
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
			case NavigationPackage.DROPDOWN__DROP:
				return isSetDrop();
			case NavigationPackage.DROPDOWN__ALIGN:
				return isSetAlign();
			case NavigationPackage.DROPDOWN__TOGGLE:
				return getToggle() != null;
			case NavigationPackage.DROPDOWN__MENU:
				return getMenu() != null;
		}
		return super.eIsSet(featureID);
	}

} //DropdownImpl
