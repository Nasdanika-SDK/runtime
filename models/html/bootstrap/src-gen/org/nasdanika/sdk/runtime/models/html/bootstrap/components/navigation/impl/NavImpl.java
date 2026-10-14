/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Nav;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nav</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavImpl#isJustify <em>Justify</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavImpl extends BootstrapElementImpl implements Nav {
	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final NavVariant VARIANT_EDEFAULT = NavVariant.TABS;

	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJustify()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUSTIFY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.NAV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavVariant getVariant() {
		return (NavVariant)eDynamicGet(NavigationPackage.NAV__VARIANT, NavigationPackage.Literals.NAV__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(NavVariant newVariant) {
		eDynamicSet(NavigationPackage.NAV__VARIANT, NavigationPackage.Literals.NAV__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(NavigationPackage.NAV__VARIANT, NavigationPackage.Literals.NAV__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(NavigationPackage.NAV__VARIANT, NavigationPackage.Literals.NAV__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill() {
		return (Boolean)eDynamicGet(NavigationPackage.NAV__FILL, NavigationPackage.Literals.NAV__FILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(boolean newFill) {
		eDynamicSet(NavigationPackage.NAV__FILL, NavigationPackage.Literals.NAV__FILL, newFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJustify() {
		return (Boolean)eDynamicGet(NavigationPackage.NAV__JUSTIFY, NavigationPackage.Literals.NAV__JUSTIFY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustify(boolean newJustify) {
		eDynamicSet(NavigationPackage.NAV__JUSTIFY, NavigationPackage.Literals.NAV__JUSTIFY, newJustify);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NavEntry> getEntries() {
		return (EList<NavEntry>)eDynamicGet(NavigationPackage.NAV__ENTRIES, NavigationPackage.Literals.NAV__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.NAV__ENTRIES:
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
			case NavigationPackage.NAV__VARIANT:
				return getVariant();
			case NavigationPackage.NAV__FILL:
				return isFill();
			case NavigationPackage.NAV__JUSTIFY:
				return isJustify();
			case NavigationPackage.NAV__ENTRIES:
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
			case NavigationPackage.NAV__VARIANT:
				setVariant((NavVariant)newValue);
				return;
			case NavigationPackage.NAV__FILL:
				setFill((Boolean)newValue);
				return;
			case NavigationPackage.NAV__JUSTIFY:
				setJustify((Boolean)newValue);
				return;
			case NavigationPackage.NAV__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends NavEntry>)newValue);
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
			case NavigationPackage.NAV__VARIANT:
				unsetVariant();
				return;
			case NavigationPackage.NAV__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case NavigationPackage.NAV__JUSTIFY:
				setJustify(JUSTIFY_EDEFAULT);
				return;
			case NavigationPackage.NAV__ENTRIES:
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
			case NavigationPackage.NAV__VARIANT:
				return isSetVariant();
			case NavigationPackage.NAV__FILL:
				return isFill() != FILL_EDEFAULT;
			case NavigationPackage.NAV__JUSTIFY:
				return isJustify() != JUSTIFY_EDEFAULT;
			case NavigationPackage.NAV__ENTRIES:
				return !getEntries().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavImpl
