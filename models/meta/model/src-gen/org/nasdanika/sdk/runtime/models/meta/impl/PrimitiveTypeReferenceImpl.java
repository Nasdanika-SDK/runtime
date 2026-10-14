/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.PrimitiveTypeReferenceImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeReferenceImpl extends TypeReferenceImpl implements PrimitiveTypeReference {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveKind KIND_EDEFAULT = PrimitiveKind.STRING;

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
		return MetaPackage.Literals.PRIMITIVE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveKind getKind() {
		return (PrimitiveKind)eDynamicGet(MetaPackage.PRIMITIVE_TYPE_REFERENCE__KIND, MetaPackage.Literals.PRIMITIVE_TYPE_REFERENCE__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PrimitiveKind newKind) {
		eDynamicSet(MetaPackage.PRIMITIVE_TYPE_REFERENCE__KIND, MetaPackage.Literals.PRIMITIVE_TYPE_REFERENCE__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.PRIMITIVE_TYPE_REFERENCE__KIND:
				return getKind();
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
			case MetaPackage.PRIMITIVE_TYPE_REFERENCE__KIND:
				setKind((PrimitiveKind)newValue);
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
			case MetaPackage.PRIMITIVE_TYPE_REFERENCE__KIND:
				setKind(KIND_EDEFAULT);
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
			case MetaPackage.PRIMITIVE_TYPE_REFERENCE__KIND:
				return getKind() != KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveTypeReferenceImpl
