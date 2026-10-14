/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Align;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownMenu;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.MenuVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dropdown Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownMenuImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownMenuImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownMenuImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropdownMenuImpl extends BootstrapElementImpl implements DropdownMenu {
	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final MenuVariant VARIANT_EDEFAULT = MenuVariant.DARK;

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
	protected DropdownMenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DROPDOWN_MENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuVariant getVariant() {
		return (MenuVariant)eDynamicGet(NavigationPackage.DROPDOWN_MENU__VARIANT, NavigationPackage.Literals.DROPDOWN_MENU__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(MenuVariant newVariant) {
		eDynamicSet(NavigationPackage.DROPDOWN_MENU__VARIANT, NavigationPackage.Literals.DROPDOWN_MENU__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(NavigationPackage.DROPDOWN_MENU__VARIANT, NavigationPackage.Literals.DROPDOWN_MENU__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_MENU__VARIANT, NavigationPackage.Literals.DROPDOWN_MENU__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align getAlign() {
		return (Align)eDynamicGet(NavigationPackage.DROPDOWN_MENU__ALIGN, NavigationPackage.Literals.DROPDOWN_MENU__ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Align newAlign) {
		eDynamicSet(NavigationPackage.DROPDOWN_MENU__ALIGN, NavigationPackage.Literals.DROPDOWN_MENU__ALIGN, newAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		eDynamicUnset(NavigationPackage.DROPDOWN_MENU__ALIGN, NavigationPackage.Literals.DROPDOWN_MENU__ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_MENU__ALIGN, NavigationPackage.Literals.DROPDOWN_MENU__ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DropdownEntry> getEntries() {
		return (EList<DropdownEntry>)eDynamicGet(NavigationPackage.DROPDOWN_MENU__ENTRIES, NavigationPackage.Literals.DROPDOWN_MENU__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.DROPDOWN_MENU__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case NavigationPackage.DROPDOWN_MENU__VARIANT:
				return getVariant();
			case NavigationPackage.DROPDOWN_MENU__ALIGN:
				return getAlign();
			case NavigationPackage.DROPDOWN_MENU__ENTRIES:
				return getEntries();
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
			case NavigationPackage.DROPDOWN_MENU__VARIANT:
				setVariant((MenuVariant)newValue);
				return;
			case NavigationPackage.DROPDOWN_MENU__ALIGN:
				setAlign((Align)newValue);
				return;
			case NavigationPackage.DROPDOWN_MENU__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends DropdownEntry>)newValue);
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
			case NavigationPackage.DROPDOWN_MENU__VARIANT:
				unsetVariant();
				return;
			case NavigationPackage.DROPDOWN_MENU__ALIGN:
				unsetAlign();
				return;
			case NavigationPackage.DROPDOWN_MENU__ENTRIES:
				getEntries().clear();
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
			case NavigationPackage.DROPDOWN_MENU__VARIANT:
				return isSetVariant();
			case NavigationPackage.DROPDOWN_MENU__ALIGN:
				return isSetAlign();
			case NavigationPackage.DROPDOWN_MENU__ENTRIES:
				return !getEntries().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DropdownMenuImpl
