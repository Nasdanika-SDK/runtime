/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.svg.Element;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl#getStyleAttribute <em>Style Attribute</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ElementImpl#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_CLASS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStyleAttribute() <em>Style Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(SvgPackage.ELEMENT__ID, SvgPackage.Literals.ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(SvgPackage.ELEMENT__ID, SvgPackage.Literals.ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleClass() {
		return (String)eDynamicGet(SvgPackage.ELEMENT__STYLE_CLASS, SvgPackage.Literals.ELEMENT__STYLE_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleClass(String newStyleClass) {
		eDynamicSet(SvgPackage.ELEMENT__STYLE_CLASS, SvgPackage.Literals.ELEMENT__STYLE_CLASS, newStyleClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleAttribute() {
		return (String)eDynamicGet(SvgPackage.ELEMENT__STYLE_ATTRIBUTE, SvgPackage.Literals.ELEMENT__STYLE_ATTRIBUTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleAttribute(String newStyleAttribute) {
		eDynamicSet(SvgPackage.ELEMENT__STYLE_ATTRIBUTE, SvgPackage.Literals.ELEMENT__STYLE_ATTRIBUTE, newStyleAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return (String)eDynamicGet(SvgPackage.ELEMENT__TRANSFORM, SvgPackage.Literals.ELEMENT__TRANSFORM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		eDynamicSet(SvgPackage.ELEMENT__TRANSFORM, SvgPackage.Literals.ELEMENT__TRANSFORM, newTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.ELEMENT__ID:
				return getId();
			case SvgPackage.ELEMENT__STYLE_CLASS:
				return getStyleClass();
			case SvgPackage.ELEMENT__STYLE_ATTRIBUTE:
				return getStyleAttribute();
			case SvgPackage.ELEMENT__TRANSFORM:
				return getTransform();
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
			case SvgPackage.ELEMENT__ID:
				setId((String)newValue);
				return;
			case SvgPackage.ELEMENT__STYLE_CLASS:
				setStyleClass((String)newValue);
				return;
			case SvgPackage.ELEMENT__STYLE_ATTRIBUTE:
				setStyleAttribute((String)newValue);
				return;
			case SvgPackage.ELEMENT__TRANSFORM:
				setTransform((String)newValue);
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
			case SvgPackage.ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SvgPackage.ELEMENT__STYLE_CLASS:
				setStyleClass(STYLE_CLASS_EDEFAULT);
				return;
			case SvgPackage.ELEMENT__STYLE_ATTRIBUTE:
				setStyleAttribute(STYLE_ATTRIBUTE_EDEFAULT);
				return;
			case SvgPackage.ELEMENT__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
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
			case SvgPackage.ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case SvgPackage.ELEMENT__STYLE_CLASS:
				return STYLE_CLASS_EDEFAULT == null ? getStyleClass() != null : !STYLE_CLASS_EDEFAULT.equals(getStyleClass());
			case SvgPackage.ELEMENT__STYLE_ATTRIBUTE:
				return STYLE_ATTRIBUTE_EDEFAULT == null ? getStyleAttribute() != null : !STYLE_ATTRIBUTE_EDEFAULT.equals(getStyleAttribute());
			case SvgPackage.ELEMENT__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? getTransform() != null : !TRANSFORM_EDEFAULT.equals(getTransform());
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
