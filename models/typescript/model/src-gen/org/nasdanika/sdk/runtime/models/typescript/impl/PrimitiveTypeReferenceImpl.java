/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.typescript.PrimitiveType;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.PrimitiveTypeReferenceImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeReferenceImpl extends TypeReferenceImpl implements PrimitiveTypeReference {
	/**
	 * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType PRIMITIVE_TYPE_EDEFAULT = PrimitiveType.STRING;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.PRIMITIVE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getPrimitiveType() {
		return (PrimitiveType)eDynamicGet(TypescriptPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, TypescriptPackage.Literals.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(PrimitiveType newPrimitiveType) {
		eDynamicSet(TypescriptPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, TypescriptPackage.Literals.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, newPrimitiveType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypescriptPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
				return getPrimitiveType();
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
			case TypescriptPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveType)newValue);
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
			case TypescriptPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
				setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
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
			case TypescriptPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
				return getPrimitiveType() != PRIMITIVE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveTypeReferenceImpl
