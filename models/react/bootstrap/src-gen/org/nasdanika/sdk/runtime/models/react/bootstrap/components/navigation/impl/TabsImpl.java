/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavVariant;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tab;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.Tabs;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#getDefaultActiveKey <em>Default Active Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#getActiveKey <em>Active Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#isJustify <em>Justify</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#isMountOnEnter <em>Mount On Enter</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#isUnmountOnExit <em>Unmount On Exit</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl.TabsImpl#getTabs <em>Tabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TabsImpl extends BootstrapComponentImpl implements Tabs {
	/**
	 * The default value of the '{@link #getDefaultActiveKey() <em>Default Active Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultActiveKey()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACTIVE_KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActiveKey() <em>Active Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_KEY_EDEFAULT = null;

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
	 * The default value of the '{@link #isMountOnEnter() <em>Mount On Enter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMountOnEnter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOUNT_ON_ENTER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnmountOnExit() <em>Unmount On Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnmountOnExit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNMOUNT_ON_EXIT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.TABS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultActiveKey() {
		return (String)eDynamicGet(NavigationPackage.TABS__DEFAULT_ACTIVE_KEY, NavigationPackage.Literals.TABS__DEFAULT_ACTIVE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultActiveKey(String newDefaultActiveKey) {
		eDynamicSet(NavigationPackage.TABS__DEFAULT_ACTIVE_KEY, NavigationPackage.Literals.TABS__DEFAULT_ACTIVE_KEY, newDefaultActiveKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveKey() {
		return (String)eDynamicGet(NavigationPackage.TABS__ACTIVE_KEY, NavigationPackage.Literals.TABS__ACTIVE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveKey(String newActiveKey) {
		eDynamicSet(NavigationPackage.TABS__ACTIVE_KEY, NavigationPackage.Literals.TABS__ACTIVE_KEY, newActiveKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavVariant getVariant() {
		return (NavVariant)eDynamicGet(NavigationPackage.TABS__VARIANT, NavigationPackage.Literals.TABS__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(NavVariant newVariant) {
		eDynamicSet(NavigationPackage.TABS__VARIANT, NavigationPackage.Literals.TABS__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(NavigationPackage.TABS__VARIANT, NavigationPackage.Literals.TABS__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(NavigationPackage.TABS__VARIANT, NavigationPackage.Literals.TABS__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill() {
		return (Boolean)eDynamicGet(NavigationPackage.TABS__FILL, NavigationPackage.Literals.TABS__FILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(boolean newFill) {
		eDynamicSet(NavigationPackage.TABS__FILL, NavigationPackage.Literals.TABS__FILL, newFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJustify() {
		return (Boolean)eDynamicGet(NavigationPackage.TABS__JUSTIFY, NavigationPackage.Literals.TABS__JUSTIFY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustify(boolean newJustify) {
		eDynamicSet(NavigationPackage.TABS__JUSTIFY, NavigationPackage.Literals.TABS__JUSTIFY, newJustify);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMountOnEnter() {
		return (Boolean)eDynamicGet(NavigationPackage.TABS__MOUNT_ON_ENTER, NavigationPackage.Literals.TABS__MOUNT_ON_ENTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountOnEnter(boolean newMountOnEnter) {
		eDynamicSet(NavigationPackage.TABS__MOUNT_ON_ENTER, NavigationPackage.Literals.TABS__MOUNT_ON_ENTER, newMountOnEnter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnmountOnExit() {
		return (Boolean)eDynamicGet(NavigationPackage.TABS__UNMOUNT_ON_EXIT, NavigationPackage.Literals.TABS__UNMOUNT_ON_EXIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnmountOnExit(boolean newUnmountOnExit) {
		eDynamicSet(NavigationPackage.TABS__UNMOUNT_ON_EXIT, NavigationPackage.Literals.TABS__UNMOUNT_ON_EXIT, newUnmountOnExit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tab> getTabs() {
		return (EList<Tab>)eDynamicGet(NavigationPackage.TABS__TABS, NavigationPackage.Literals.TABS__TABS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.TABS__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
			case NavigationPackage.TABS__DEFAULT_ACTIVE_KEY:
				return getDefaultActiveKey();
			case NavigationPackage.TABS__ACTIVE_KEY:
				return getActiveKey();
			case NavigationPackage.TABS__VARIANT:
				return getVariant();
			case NavigationPackage.TABS__FILL:
				return isFill();
			case NavigationPackage.TABS__JUSTIFY:
				return isJustify();
			case NavigationPackage.TABS__MOUNT_ON_ENTER:
				return isMountOnEnter();
			case NavigationPackage.TABS__UNMOUNT_ON_EXIT:
				return isUnmountOnExit();
			case NavigationPackage.TABS__TABS:
				return getTabs();
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
			case NavigationPackage.TABS__DEFAULT_ACTIVE_KEY:
				setDefaultActiveKey((String)newValue);
				return;
			case NavigationPackage.TABS__ACTIVE_KEY:
				setActiveKey((String)newValue);
				return;
			case NavigationPackage.TABS__VARIANT:
				setVariant((NavVariant)newValue);
				return;
			case NavigationPackage.TABS__FILL:
				setFill((Boolean)newValue);
				return;
			case NavigationPackage.TABS__JUSTIFY:
				setJustify((Boolean)newValue);
				return;
			case NavigationPackage.TABS__MOUNT_ON_ENTER:
				setMountOnEnter((Boolean)newValue);
				return;
			case NavigationPackage.TABS__UNMOUNT_ON_EXIT:
				setUnmountOnExit((Boolean)newValue);
				return;
			case NavigationPackage.TABS__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends Tab>)newValue);
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
			case NavigationPackage.TABS__DEFAULT_ACTIVE_KEY:
				setDefaultActiveKey(DEFAULT_ACTIVE_KEY_EDEFAULT);
				return;
			case NavigationPackage.TABS__ACTIVE_KEY:
				setActiveKey(ACTIVE_KEY_EDEFAULT);
				return;
			case NavigationPackage.TABS__VARIANT:
				unsetVariant();
				return;
			case NavigationPackage.TABS__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case NavigationPackage.TABS__JUSTIFY:
				setJustify(JUSTIFY_EDEFAULT);
				return;
			case NavigationPackage.TABS__MOUNT_ON_ENTER:
				setMountOnEnter(MOUNT_ON_ENTER_EDEFAULT);
				return;
			case NavigationPackage.TABS__UNMOUNT_ON_EXIT:
				setUnmountOnExit(UNMOUNT_ON_EXIT_EDEFAULT);
				return;
			case NavigationPackage.TABS__TABS:
				getTabs().clear();
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
			case NavigationPackage.TABS__DEFAULT_ACTIVE_KEY:
				return DEFAULT_ACTIVE_KEY_EDEFAULT == null ? getDefaultActiveKey() != null : !DEFAULT_ACTIVE_KEY_EDEFAULT.equals(getDefaultActiveKey());
			case NavigationPackage.TABS__ACTIVE_KEY:
				return ACTIVE_KEY_EDEFAULT == null ? getActiveKey() != null : !ACTIVE_KEY_EDEFAULT.equals(getActiveKey());
			case NavigationPackage.TABS__VARIANT:
				return isSetVariant();
			case NavigationPackage.TABS__FILL:
				return isFill() != FILL_EDEFAULT;
			case NavigationPackage.TABS__JUSTIFY:
				return isJustify() != JUSTIFY_EDEFAULT;
			case NavigationPackage.TABS__MOUNT_ON_ENTER:
				return isMountOnEnter() != MOUNT_ON_ENTER_EDEFAULT;
			case NavigationPackage.TABS__UNMOUNT_ON_EXIT:
				return isUnmountOnExit() != UNMOUNT_ON_EXIT_EDEFAULT;
			case NavigationPackage.TABS__TABS:
				return !getTabs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TabsImpl
