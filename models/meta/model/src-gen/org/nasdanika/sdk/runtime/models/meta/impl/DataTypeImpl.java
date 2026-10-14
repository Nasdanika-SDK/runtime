/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.meta.DataType;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.DataTypeImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.DataTypeImpl#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType {
	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveKind REPRESENTATION_EDEFAULT = PrimitiveKind.STRING;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveKind getRepresentation() {
		return (PrimitiveKind)eDynamicGet(MetaPackage.DATA_TYPE__REPRESENTATION, MetaPackage.Literals.DATA_TYPE__REPRESENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(PrimitiveKind newRepresentation) {
		eDynamicSet(MetaPackage.DATA_TYPE__REPRESENTATION, MetaPackage.Literals.DATA_TYPE__REPRESENTATION, newRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceType() {
		return (String)eDynamicGet(MetaPackage.DATA_TYPE__SOURCE_TYPE, MetaPackage.Literals.DATA_TYPE__SOURCE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(String newSourceType) {
		eDynamicSet(MetaPackage.DATA_TYPE__SOURCE_TYPE, MetaPackage.Literals.DATA_TYPE__SOURCE_TYPE, newSourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.DATA_TYPE__REPRESENTATION:
				return getRepresentation();
			case MetaPackage.DATA_TYPE__SOURCE_TYPE:
				return getSourceType();
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
			case MetaPackage.DATA_TYPE__REPRESENTATION:
				setRepresentation((PrimitiveKind)newValue);
				return;
			case MetaPackage.DATA_TYPE__SOURCE_TYPE:
				setSourceType((String)newValue);
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
			case MetaPackage.DATA_TYPE__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
				return;
			case MetaPackage.DATA_TYPE__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
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
			case MetaPackage.DATA_TYPE__REPRESENTATION:
				return getRepresentation() != REPRESENTATION_EDEFAULT;
			case MetaPackage.DATA_TYPE__SOURCE_TYPE:
				return SOURCE_TYPE_EDEFAULT == null ? getSourceType() != null : !SOURCE_TYPE_EDEFAULT.equals(getSourceType());
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
