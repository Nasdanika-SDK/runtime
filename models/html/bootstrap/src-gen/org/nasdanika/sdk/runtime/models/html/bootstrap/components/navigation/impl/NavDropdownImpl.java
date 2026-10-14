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

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavDropdown;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nav Dropdown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavDropdownImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavDropdownImpl#getTitleNode <em>Title Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavDropdownImpl#isMenuEnd <em>Menu End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.NavDropdownImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavDropdownImpl extends BootstrapElementImpl implements NavDropdown {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isMenuEnd() <em>Menu End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenuEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MENU_END_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavDropdownImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.NAV_DROPDOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(NavigationPackage.NAV_DROPDOWN__TITLE, NavigationPackage.Literals.NAV_DROPDOWN__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(NavigationPackage.NAV_DROPDOWN__TITLE, NavigationPackage.Literals.NAV_DROPDOWN__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTitleNode() {
		return (Node)eDynamicGet(NavigationPackage.NAV_DROPDOWN__TITLE_NODE, NavigationPackage.Literals.NAV_DROPDOWN__TITLE_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleNode(Node newTitleNode, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTitleNode, NavigationPackage.NAV_DROPDOWN__TITLE_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleNode(Node newTitleNode) {
		eDynamicSet(NavigationPackage.NAV_DROPDOWN__TITLE_NODE, NavigationPackage.Literals.NAV_DROPDOWN__TITLE_NODE, newTitleNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMenuEnd() {
		return (Boolean)eDynamicGet(NavigationPackage.NAV_DROPDOWN__MENU_END, NavigationPackage.Literals.NAV_DROPDOWN__MENU_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuEnd(boolean newMenuEnd) {
		eDynamicSet(NavigationPackage.NAV_DROPDOWN__MENU_END, NavigationPackage.Literals.NAV_DROPDOWN__MENU_END, newMenuEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DropdownEntry> getEntries() {
		return (EList<DropdownEntry>)eDynamicGet(NavigationPackage.NAV_DROPDOWN__ENTRIES, NavigationPackage.Literals.NAV_DROPDOWN__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.NAV_DROPDOWN__TITLE_NODE:
				return basicSetTitleNode(null, msgs);
			case NavigationPackage.NAV_DROPDOWN__ENTRIES:
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
			case NavigationPackage.NAV_DROPDOWN__TITLE:
				return getTitle();
			case NavigationPackage.NAV_DROPDOWN__TITLE_NODE:
				return getTitleNode();
			case NavigationPackage.NAV_DROPDOWN__MENU_END:
				return isMenuEnd();
			case NavigationPackage.NAV_DROPDOWN__ENTRIES:
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
			case NavigationPackage.NAV_DROPDOWN__TITLE:
				setTitle((String)newValue);
				return;
			case NavigationPackage.NAV_DROPDOWN__TITLE_NODE:
				setTitleNode((Node)newValue);
				return;
			case NavigationPackage.NAV_DROPDOWN__MENU_END:
				setMenuEnd((Boolean)newValue);
				return;
			case NavigationPackage.NAV_DROPDOWN__ENTRIES:
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
			case NavigationPackage.NAV_DROPDOWN__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case NavigationPackage.NAV_DROPDOWN__TITLE_NODE:
				setTitleNode((Node)null);
				return;
			case NavigationPackage.NAV_DROPDOWN__MENU_END:
				setMenuEnd(MENU_END_EDEFAULT);
				return;
			case NavigationPackage.NAV_DROPDOWN__ENTRIES:
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
			case NavigationPackage.NAV_DROPDOWN__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case NavigationPackage.NAV_DROPDOWN__TITLE_NODE:
				return getTitleNode() != null;
			case NavigationPackage.NAV_DROPDOWN__MENU_END:
				return isMenuEnd() != MENU_END_EDEFAULT;
			case NavigationPackage.NAV_DROPDOWN__ENTRIES:
				return !getEntries().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavDropdownImpl
