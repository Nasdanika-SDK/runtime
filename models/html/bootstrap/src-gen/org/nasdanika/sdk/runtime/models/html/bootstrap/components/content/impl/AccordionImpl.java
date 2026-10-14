/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Accordion;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.AccordionItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accordion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl#getDefaultActiveKey <em>Default Active Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl#isFlush <em>Flush</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl#isAlwaysOpen <em>Always Open</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.AccordionImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccordionImpl extends BootstrapElementImpl implements Accordion {
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
	 * The default value of the '{@link #isFlush() <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlush()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUSH_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAlwaysOpen() <em>Always Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALWAYS_OPEN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccordionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.ACCORDION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultActiveKey() {
		return (String)eDynamicGet(ContentPackage.ACCORDION__DEFAULT_ACTIVE_KEY, ContentPackage.Literals.ACCORDION__DEFAULT_ACTIVE_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultActiveKey(String newDefaultActiveKey) {
		eDynamicSet(ContentPackage.ACCORDION__DEFAULT_ACTIVE_KEY, ContentPackage.Literals.ACCORDION__DEFAULT_ACTIVE_KEY, newDefaultActiveKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlush() {
		return (Boolean)eDynamicGet(ContentPackage.ACCORDION__FLUSH, ContentPackage.Literals.ACCORDION__FLUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlush(boolean newFlush) {
		eDynamicSet(ContentPackage.ACCORDION__FLUSH, ContentPackage.Literals.ACCORDION__FLUSH, newFlush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlwaysOpen() {
		return (Boolean)eDynamicGet(ContentPackage.ACCORDION__ALWAYS_OPEN, ContentPackage.Literals.ACCORDION__ALWAYS_OPEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlwaysOpen(boolean newAlwaysOpen) {
		eDynamicSet(ContentPackage.ACCORDION__ALWAYS_OPEN, ContentPackage.Literals.ACCORDION__ALWAYS_OPEN, newAlwaysOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AccordionItem> getItems() {
		return (EList<AccordionItem>)eDynamicGet(ContentPackage.ACCORDION__ITEMS, ContentPackage.Literals.ACCORDION__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.ACCORDION__ITEMS:
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
			case ContentPackage.ACCORDION__DEFAULT_ACTIVE_KEY:
				return getDefaultActiveKey();
			case ContentPackage.ACCORDION__FLUSH:
				return isFlush();
			case ContentPackage.ACCORDION__ALWAYS_OPEN:
				return isAlwaysOpen();
			case ContentPackage.ACCORDION__ITEMS:
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
			case ContentPackage.ACCORDION__DEFAULT_ACTIVE_KEY:
				setDefaultActiveKey((String)newValue);
				return;
			case ContentPackage.ACCORDION__FLUSH:
				setFlush((Boolean)newValue);
				return;
			case ContentPackage.ACCORDION__ALWAYS_OPEN:
				setAlwaysOpen((Boolean)newValue);
				return;
			case ContentPackage.ACCORDION__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends AccordionItem>)newValue);
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
			case ContentPackage.ACCORDION__DEFAULT_ACTIVE_KEY:
				setDefaultActiveKey(DEFAULT_ACTIVE_KEY_EDEFAULT);
				return;
			case ContentPackage.ACCORDION__FLUSH:
				setFlush(FLUSH_EDEFAULT);
				return;
			case ContentPackage.ACCORDION__ALWAYS_OPEN:
				setAlwaysOpen(ALWAYS_OPEN_EDEFAULT);
				return;
			case ContentPackage.ACCORDION__ITEMS:
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
			case ContentPackage.ACCORDION__DEFAULT_ACTIVE_KEY:
				return DEFAULT_ACTIVE_KEY_EDEFAULT == null ? getDefaultActiveKey() != null : !DEFAULT_ACTIVE_KEY_EDEFAULT.equals(getDefaultActiveKey());
			case ContentPackage.ACCORDION__FLUSH:
				return isFlush() != FLUSH_EDEFAULT;
			case ContentPackage.ACCORDION__ALWAYS_OPEN:
				return isAlwaysOpen() != ALWAYS_OPEN_EDEFAULT;
			case ContentPackage.ACCORDION__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccordionImpl
