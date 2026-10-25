/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.CustomLink;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.SelectorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl#getPageSelectorType <em>Page Selector Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl#getPageSelector <em>Page Selector</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl#getElementSelectorType <em>Element Selector Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.CustomLinkImpl#getElementSelector <em>Element Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomLinkImpl extends AbstractLinkImpl implements CustomLink {
	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPageSelectorType() <em>Page Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSelectorType()
	 * @generated
	 * @ordered
	 */
	protected static final SelectorType PAGE_SELECTOR_TYPE_EDEFAULT = SelectorType.ID;

	/**
	 * The default value of the '{@link #getPageSelector() <em>Page Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_SELECTOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getElementSelectorType() <em>Element Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSelectorType()
	 * @generated
	 * @ordered
	 */
	protected static final SelectorType ELEMENT_SELECTOR_TYPE_EDEFAULT = SelectorType.ID;

	/**
	 * The default value of the '{@link #getElementSelector() <em>Element Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_SELECTOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.CUSTOM_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return (String)eDynamicGet(DrawioPackage.CUSTOM_LINK__RESOURCE, DrawioPackage.Literals.CUSTOM_LINK__RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		eDynamicSet(DrawioPackage.CUSTOM_LINK__RESOURCE, DrawioPackage.Literals.CUSTOM_LINK__RESOURCE, newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTarget getTarget() {
		return (LinkTarget)eDynamicGet(DrawioPackage.CUSTOM_LINK__TARGET, DrawioPackage.Literals.CUSTOM_LINK__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTarget basicGetTarget() {
		return (LinkTarget)eDynamicGet(DrawioPackage.CUSTOM_LINK__TARGET, DrawioPackage.Literals.CUSTOM_LINK__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(LinkTarget newTarget) {
		eDynamicSet(DrawioPackage.CUSTOM_LINK__TARGET, DrawioPackage.Literals.CUSTOM_LINK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorType getPageSelectorType() {
		return (SelectorType)eDynamicGet(DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR_TYPE, DrawioPackage.Literals.CUSTOM_LINK__PAGE_SELECTOR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageSelectorType(SelectorType newPageSelectorType) {
		eDynamicSet(DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR_TYPE, DrawioPackage.Literals.CUSTOM_LINK__PAGE_SELECTOR_TYPE, newPageSelectorType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageSelector() {
		return (String)eDynamicGet(DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR, DrawioPackage.Literals.CUSTOM_LINK__PAGE_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageSelector(String newPageSelector) {
		eDynamicSet(DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR, DrawioPackage.Literals.CUSTOM_LINK__PAGE_SELECTOR, newPageSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorType getElementSelectorType() {
		return (SelectorType)eDynamicGet(DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE, DrawioPackage.Literals.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSelectorType(SelectorType newElementSelectorType) {
		eDynamicSet(DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE, DrawioPackage.Literals.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE, newElementSelectorType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementSelector() {
		return (String)eDynamicGet(DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR, DrawioPackage.Literals.CUSTOM_LINK__ELEMENT_SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementSelector(String newElementSelector) {
		eDynamicSet(DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR, DrawioPackage.Literals.CUSTOM_LINK__ELEMENT_SELECTOR, newElementSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.CUSTOM_LINK__RESOURCE:
				return getResource();
			case DrawioPackage.CUSTOM_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR_TYPE:
				return getPageSelectorType();
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR:
				return getPageSelector();
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE:
				return getElementSelectorType();
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR:
				return getElementSelector();
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
			case DrawioPackage.CUSTOM_LINK__RESOURCE:
				setResource((String)newValue);
				return;
			case DrawioPackage.CUSTOM_LINK__TARGET:
				setTarget((LinkTarget)newValue);
				return;
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR_TYPE:
				setPageSelectorType((SelectorType)newValue);
				return;
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR:
				setPageSelector((String)newValue);
				return;
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE:
				setElementSelectorType((SelectorType)newValue);
				return;
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR:
				setElementSelector((String)newValue);
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
			case DrawioPackage.CUSTOM_LINK__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
			case DrawioPackage.CUSTOM_LINK__TARGET:
				setTarget((LinkTarget)null);
				return;
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR_TYPE:
				setPageSelectorType(PAGE_SELECTOR_TYPE_EDEFAULT);
				return;
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR:
				setPageSelector(PAGE_SELECTOR_EDEFAULT);
				return;
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE:
				setElementSelectorType(ELEMENT_SELECTOR_TYPE_EDEFAULT);
				return;
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR:
				setElementSelector(ELEMENT_SELECTOR_EDEFAULT);
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
			case DrawioPackage.CUSTOM_LINK__RESOURCE:
				return RESOURCE_EDEFAULT == null ? getResource() != null : !RESOURCE_EDEFAULT.equals(getResource());
			case DrawioPackage.CUSTOM_LINK__TARGET:
				return basicGetTarget() != null;
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR_TYPE:
				return getPageSelectorType() != PAGE_SELECTOR_TYPE_EDEFAULT;
			case DrawioPackage.CUSTOM_LINK__PAGE_SELECTOR:
				return PAGE_SELECTOR_EDEFAULT == null ? getPageSelector() != null : !PAGE_SELECTOR_EDEFAULT.equals(getPageSelector());
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR_TYPE:
				return getElementSelectorType() != ELEMENT_SELECTOR_TYPE_EDEFAULT;
			case DrawioPackage.CUSTOM_LINK__ELEMENT_SELECTOR:
				return ELEMENT_SELECTOR_EDEFAULT == null ? getElementSelector() != null : !ELEMENT_SELECTOR_EDEFAULT.equals(getElementSelector());
		}
		return super.eIsSet(featureID);
	}

} //CustomLinkImpl
