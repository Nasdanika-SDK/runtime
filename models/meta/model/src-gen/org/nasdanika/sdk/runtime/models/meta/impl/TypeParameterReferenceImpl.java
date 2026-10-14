/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.TypeParameter;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypeParameterReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypeParameterReferenceImpl#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterReferenceImpl extends TypeReferenceImpl implements TypeParameterReference {
	/**
	 * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_PARAMETER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter getTarget() {
		return (TypeParameter)eDynamicGet(MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET, MetaPackage.Literals.TYPE_PARAMETER_REFERENCE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter basicGetTarget() {
		return (TypeParameter)eDynamicGet(MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET, MetaPackage.Literals.TYPE_PARAMETER_REFERENCE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TypeParameter newTarget) {
		eDynamicSet(MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET, MetaPackage.Literals.TYPE_PARAMETER_REFERENCE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterName() {
		return (String)eDynamicGet(MetaPackage.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME, MetaPackage.Literals.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(String newParameterName) {
		eDynamicSet(MetaPackage.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME, MetaPackage.Literals.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME, newParameterName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MetaPackage.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME:
				return getParameterName();
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
			case MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET:
				setTarget((TypeParameter)newValue);
				return;
			case MetaPackage.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME:
				setParameterName((String)newValue);
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
			case MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET:
				setTarget((TypeParameter)null);
				return;
			case MetaPackage.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME:
				setParameterName(PARAMETER_NAME_EDEFAULT);
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
			case MetaPackage.TYPE_PARAMETER_REFERENCE__TARGET:
				return basicGetTarget() != null;
			case MetaPackage.TYPE_PARAMETER_REFERENCE__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? getParameterName() != null : !PARAMETER_NAME_EDEFAULT.equals(getParameterName());
		}
		return super.eIsSet(featureID);
	}

} //TypeParameterReferenceImpl
