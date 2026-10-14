/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Fixed;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Navbar;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#isAlwaysExpanded <em>Always Expanded</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#getExpand <em>Expand</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#getSticky <em>Sticky</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavbarImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavbarImpl extends BootstrapElementImpl implements Navbar {
	/**
	 * The default value of the '{@link #getBg() <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBg()
	 * @generated
	 * @ordered
	 */
	protected static final Variant BG_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final ColorMode THEME_EDEFAULT = ColorMode.LIGHT;

	/**
	 * The default value of the '{@link #isAlwaysExpanded() <em>Always Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALWAYS_EXPANDED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getExpand() <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpand()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint EXPAND_EDEFAULT = Breakpoint.XS;

	/**
	 * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected static final Fixed FIXED_EDEFAULT = Fixed.TOP;

	/**
	 * The default value of the '{@link #getSticky() <em>Sticky</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSticky()
	 * @generated
	 * @ordered
	 */
	protected static final Fixed STICKY_EDEFAULT = Fixed.TOP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.NAVBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBg() {
		return (Variant)eDynamicGet(NavigationPackage.NAVBAR__BG, NavigationPackage.Literals.NAVBAR__BG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBg(Variant newBg) {
		eDynamicSet(NavigationPackage.NAVBAR__BG, NavigationPackage.Literals.NAVBAR__BG, newBg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBg() {
		eDynamicUnset(NavigationPackage.NAVBAR__BG, NavigationPackage.Literals.NAVBAR__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBg() {
		return eDynamicIsSet(NavigationPackage.NAVBAR__BG, NavigationPackage.Literals.NAVBAR__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorMode getTheme() {
		return (ColorMode)eDynamicGet(NavigationPackage.NAVBAR__THEME, NavigationPackage.Literals.NAVBAR__THEME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(ColorMode newTheme) {
		eDynamicSet(NavigationPackage.NAVBAR__THEME, NavigationPackage.Literals.NAVBAR__THEME, newTheme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTheme() {
		eDynamicUnset(NavigationPackage.NAVBAR__THEME, NavigationPackage.Literals.NAVBAR__THEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTheme() {
		return eDynamicIsSet(NavigationPackage.NAVBAR__THEME, NavigationPackage.Literals.NAVBAR__THEME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlwaysExpanded() {
		return (Boolean)eDynamicGet(NavigationPackage.NAVBAR__ALWAYS_EXPANDED, NavigationPackage.Literals.NAVBAR__ALWAYS_EXPANDED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlwaysExpanded(boolean newAlwaysExpanded) {
		eDynamicSet(NavigationPackage.NAVBAR__ALWAYS_EXPANDED, NavigationPackage.Literals.NAVBAR__ALWAYS_EXPANDED, newAlwaysExpanded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint getExpand() {
		return (Breakpoint)eDynamicGet(NavigationPackage.NAVBAR__EXPAND, NavigationPackage.Literals.NAVBAR__EXPAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpand(Breakpoint newExpand) {
		eDynamicSet(NavigationPackage.NAVBAR__EXPAND, NavigationPackage.Literals.NAVBAR__EXPAND, newExpand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpand() {
		eDynamicUnset(NavigationPackage.NAVBAR__EXPAND, NavigationPackage.Literals.NAVBAR__EXPAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpand() {
		return eDynamicIsSet(NavigationPackage.NAVBAR__EXPAND, NavigationPackage.Literals.NAVBAR__EXPAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixed getFixed() {
		return (Fixed)eDynamicGet(NavigationPackage.NAVBAR__FIXED, NavigationPackage.Literals.NAVBAR__FIXED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(Fixed newFixed) {
		eDynamicSet(NavigationPackage.NAVBAR__FIXED, NavigationPackage.Literals.NAVBAR__FIXED, newFixed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixed() {
		eDynamicUnset(NavigationPackage.NAVBAR__FIXED, NavigationPackage.Literals.NAVBAR__FIXED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixed() {
		return eDynamicIsSet(NavigationPackage.NAVBAR__FIXED, NavigationPackage.Literals.NAVBAR__FIXED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixed getSticky() {
		return (Fixed)eDynamicGet(NavigationPackage.NAVBAR__STICKY, NavigationPackage.Literals.NAVBAR__STICKY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSticky(Fixed newSticky) {
		eDynamicSet(NavigationPackage.NAVBAR__STICKY, NavigationPackage.Literals.NAVBAR__STICKY, newSticky);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSticky() {
		eDynamicUnset(NavigationPackage.NAVBAR__STICKY, NavigationPackage.Literals.NAVBAR__STICKY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSticky() {
		return eDynamicIsSet(NavigationPackage.NAVBAR__STICKY, NavigationPackage.Literals.NAVBAR__STICKY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContent() {
		return (EList<Node>)eDynamicGet(NavigationPackage.NAVBAR__CONTENT, NavigationPackage.Literals.NAVBAR__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.NAVBAR__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case NavigationPackage.NAVBAR__BG:
				return getBg();
			case NavigationPackage.NAVBAR__THEME:
				return getTheme();
			case NavigationPackage.NAVBAR__ALWAYS_EXPANDED:
				return isAlwaysExpanded();
			case NavigationPackage.NAVBAR__EXPAND:
				return getExpand();
			case NavigationPackage.NAVBAR__FIXED:
				return getFixed();
			case NavigationPackage.NAVBAR__STICKY:
				return getSticky();
			case NavigationPackage.NAVBAR__CONTENT:
				return getContent();
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
			case NavigationPackage.NAVBAR__BG:
				setBg((Variant)newValue);
				return;
			case NavigationPackage.NAVBAR__THEME:
				setTheme((ColorMode)newValue);
				return;
			case NavigationPackage.NAVBAR__ALWAYS_EXPANDED:
				setAlwaysExpanded((Boolean)newValue);
				return;
			case NavigationPackage.NAVBAR__EXPAND:
				setExpand((Breakpoint)newValue);
				return;
			case NavigationPackage.NAVBAR__FIXED:
				setFixed((Fixed)newValue);
				return;
			case NavigationPackage.NAVBAR__STICKY:
				setSticky((Fixed)newValue);
				return;
			case NavigationPackage.NAVBAR__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Node>)newValue);
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
			case NavigationPackage.NAVBAR__BG:
				unsetBg();
				return;
			case NavigationPackage.NAVBAR__THEME:
				unsetTheme();
				return;
			case NavigationPackage.NAVBAR__ALWAYS_EXPANDED:
				setAlwaysExpanded(ALWAYS_EXPANDED_EDEFAULT);
				return;
			case NavigationPackage.NAVBAR__EXPAND:
				unsetExpand();
				return;
			case NavigationPackage.NAVBAR__FIXED:
				unsetFixed();
				return;
			case NavigationPackage.NAVBAR__STICKY:
				unsetSticky();
				return;
			case NavigationPackage.NAVBAR__CONTENT:
				getContent().clear();
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
			case NavigationPackage.NAVBAR__BG:
				return isSetBg();
			case NavigationPackage.NAVBAR__THEME:
				return isSetTheme();
			case NavigationPackage.NAVBAR__ALWAYS_EXPANDED:
				return isAlwaysExpanded() != ALWAYS_EXPANDED_EDEFAULT;
			case NavigationPackage.NAVBAR__EXPAND:
				return isSetExpand();
			case NavigationPackage.NAVBAR__FIXED:
				return isSetFixed();
			case NavigationPackage.NAVBAR__STICKY:
				return isSetSticky();
			case NavigationPackage.NAVBAR__CONTENT:
				return !getContent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavbarImpl
