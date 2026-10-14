/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.meta.IncomingReference;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.IncomingReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.IncomingReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.IncomingReferenceImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingReferenceImpl extends MinimalEObjectImpl.Container implements IncomingReference {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.INCOMING_REFERENCE;
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
	public org.nasdanika.sdk.runtime.models.meta.Object getSource() {
		return (org.nasdanika.sdk.runtime.models.meta.Object)eDynamicGet(MetaPackage.INCOMING_REFERENCE__SOURCE, MetaPackage.Literals.INCOMING_REFERENCE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Object basicGetSource() {
		return (org.nasdanika.sdk.runtime.models.meta.Object)eDynamicGet(MetaPackage.INCOMING_REFERENCE__SOURCE, MetaPackage.Literals.INCOMING_REFERENCE__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(org.nasdanika.sdk.runtime.models.meta.Object newSource) {
		eDynamicSet(MetaPackage.INCOMING_REFERENCE__SOURCE, MetaPackage.Literals.INCOMING_REFERENCE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		return (Reference)eDynamicGet(MetaPackage.INCOMING_REFERENCE__REFERENCE, MetaPackage.Literals.INCOMING_REFERENCE__REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetReference() {
		return (Reference)eDynamicGet(MetaPackage.INCOMING_REFERENCE__REFERENCE, MetaPackage.Literals.INCOMING_REFERENCE__REFERENCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		eDynamicSet(MetaPackage.INCOMING_REFERENCE__REFERENCE, MetaPackage.Literals.INCOMING_REFERENCE__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return (Integer)eDynamicGet(MetaPackage.INCOMING_REFERENCE__INDEX, MetaPackage.Literals.INCOMING_REFERENCE__INDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		eDynamicSet(MetaPackage.INCOMING_REFERENCE__INDEX, MetaPackage.Literals.INCOMING_REFERENCE__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.INCOMING_REFERENCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case MetaPackage.INCOMING_REFERENCE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case MetaPackage.INCOMING_REFERENCE__INDEX:
				return getIndex();
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
			case MetaPackage.INCOMING_REFERENCE__SOURCE:
				setSource((org.nasdanika.sdk.runtime.models.meta.Object)newValue);
				return;
			case MetaPackage.INCOMING_REFERENCE__REFERENCE:
				setReference((Reference)newValue);
				return;
			case MetaPackage.INCOMING_REFERENCE__INDEX:
				setIndex((Integer)newValue);
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
			case MetaPackage.INCOMING_REFERENCE__SOURCE:
				setSource((org.nasdanika.sdk.runtime.models.meta.Object)null);
				return;
			case MetaPackage.INCOMING_REFERENCE__REFERENCE:
				setReference((Reference)null);
				return;
			case MetaPackage.INCOMING_REFERENCE__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case MetaPackage.INCOMING_REFERENCE__SOURCE:
				return basicGetSource() != null;
			case MetaPackage.INCOMING_REFERENCE__REFERENCE:
				return basicGetReference() != null;
			case MetaPackage.INCOMING_REFERENCE__INDEX:
				return getIndex() != INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //IncomingReferenceImpl
