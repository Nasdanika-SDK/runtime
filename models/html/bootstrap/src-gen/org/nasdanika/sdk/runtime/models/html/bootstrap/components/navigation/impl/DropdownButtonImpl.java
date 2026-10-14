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

import org.nasdanika.sdk.runtime.models.html.bootstrap.ButtonVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.Drop;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownButton;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.DropdownEntry;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dropdown Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownButtonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownButtonImpl#getTitleNode <em>Title Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownButtonImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownButtonImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownButtonImpl#getDrop <em>Drop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.impl.DropdownButtonImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropdownButtonImpl extends BootstrapElementImpl implements DropdownButton {
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
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final ButtonVariant VARIANT_EDEFAULT = ButtonVariant.PRIMARY;

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
	 * The default value of the '{@link #getDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrop()
	 * @generated
	 * @ordered
	 */
	protected static final Drop DROP_EDEFAULT = Drop.DOWN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropdownButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavigationPackage.Literals.DROPDOWN_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(NavigationPackage.DROPDOWN_BUTTON__TITLE, NavigationPackage.Literals.DROPDOWN_BUTTON__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(NavigationPackage.DROPDOWN_BUTTON__TITLE, NavigationPackage.Literals.DROPDOWN_BUTTON__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTitleNode() {
		return (Node)eDynamicGet(NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE, NavigationPackage.Literals.DROPDOWN_BUTTON__TITLE_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitleNode(Node newTitleNode, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTitleNode, NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleNode(Node newTitleNode) {
		eDynamicSet(NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE, NavigationPackage.Literals.DROPDOWN_BUTTON__TITLE_NODE, newTitleNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonVariant getVariant() {
		return (ButtonVariant)eDynamicGet(NavigationPackage.DROPDOWN_BUTTON__VARIANT, NavigationPackage.Literals.DROPDOWN_BUTTON__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(ButtonVariant newVariant) {
		eDynamicSet(NavigationPackage.DROPDOWN_BUTTON__VARIANT, NavigationPackage.Literals.DROPDOWN_BUTTON__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(NavigationPackage.DROPDOWN_BUTTON__VARIANT, NavigationPackage.Literals.DROPDOWN_BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_BUTTON__VARIANT, NavigationPackage.Literals.DROPDOWN_BUTTON__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(NavigationPackage.DROPDOWN_BUTTON__SIZE, NavigationPackage.Literals.DROPDOWN_BUTTON__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(NavigationPackage.DROPDOWN_BUTTON__SIZE, NavigationPackage.Literals.DROPDOWN_BUTTON__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(NavigationPackage.DROPDOWN_BUTTON__SIZE, NavigationPackage.Literals.DROPDOWN_BUTTON__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_BUTTON__SIZE, NavigationPackage.Literals.DROPDOWN_BUTTON__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop getDrop() {
		return (Drop)eDynamicGet(NavigationPackage.DROPDOWN_BUTTON__DROP, NavigationPackage.Literals.DROPDOWN_BUTTON__DROP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrop(Drop newDrop) {
		eDynamicSet(NavigationPackage.DROPDOWN_BUTTON__DROP, NavigationPackage.Literals.DROPDOWN_BUTTON__DROP, newDrop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDrop() {
		eDynamicUnset(NavigationPackage.DROPDOWN_BUTTON__DROP, NavigationPackage.Literals.DROPDOWN_BUTTON__DROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDrop() {
		return eDynamicIsSet(NavigationPackage.DROPDOWN_BUTTON__DROP, NavigationPackage.Literals.DROPDOWN_BUTTON__DROP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DropdownEntry> getEntries() {
		return (EList<DropdownEntry>)eDynamicGet(NavigationPackage.DROPDOWN_BUTTON__ENTRIES, NavigationPackage.Literals.DROPDOWN_BUTTON__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE:
				return basicSetTitleNode(null, msgs);
			case NavigationPackage.DROPDOWN_BUTTON__ENTRIES:
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
			case NavigationPackage.DROPDOWN_BUTTON__TITLE:
				return getTitle();
			case NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE:
				return getTitleNode();
			case NavigationPackage.DROPDOWN_BUTTON__VARIANT:
				return getVariant();
			case NavigationPackage.DROPDOWN_BUTTON__SIZE:
				return getSize();
			case NavigationPackage.DROPDOWN_BUTTON__DROP:
				return getDrop();
			case NavigationPackage.DROPDOWN_BUTTON__ENTRIES:
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
			case NavigationPackage.DROPDOWN_BUTTON__TITLE:
				setTitle((String)newValue);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE:
				setTitleNode((Node)newValue);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__VARIANT:
				setVariant((ButtonVariant)newValue);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__SIZE:
				setSize((Size)newValue);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__DROP:
				setDrop((Drop)newValue);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__ENTRIES:
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
			case NavigationPackage.DROPDOWN_BUTTON__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE:
				setTitleNode((Node)null);
				return;
			case NavigationPackage.DROPDOWN_BUTTON__VARIANT:
				unsetVariant();
				return;
			case NavigationPackage.DROPDOWN_BUTTON__SIZE:
				unsetSize();
				return;
			case NavigationPackage.DROPDOWN_BUTTON__DROP:
				unsetDrop();
				return;
			case NavigationPackage.DROPDOWN_BUTTON__ENTRIES:
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
			case NavigationPackage.DROPDOWN_BUTTON__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case NavigationPackage.DROPDOWN_BUTTON__TITLE_NODE:
				return getTitleNode() != null;
			case NavigationPackage.DROPDOWN_BUTTON__VARIANT:
				return isSetVariant();
			case NavigationPackage.DROPDOWN_BUTTON__SIZE:
				return isSetSize();
			case NavigationPackage.DROPDOWN_BUTTON__DROP:
				return isSetDrop();
			case NavigationPackage.DROPDOWN_BUTTON__ENTRIES:
				return !getEntries().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DropdownButtonImpl
