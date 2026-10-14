/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.OpaqueTypeReferenceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.OpaqueTypeReferenceImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueTypeReferenceImpl extends TypeReferenceImpl implements OpaqueTypeReference {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.OPAQUE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eDynamicGet(MetaPackage.OPAQUE_TYPE_REFERENCE__TEXT, MetaPackage.Literals.OPAQUE_TYPE_REFERENCE__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(MetaPackage.OPAQUE_TYPE_REFERENCE__TEXT, MetaPackage.Literals.OPAQUE_TYPE_REFERENCE__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TypeReference> getReferences() {
		return (EList<TypeReference>)eDynamicGet(MetaPackage.OPAQUE_TYPE_REFERENCE__REFERENCES, MetaPackage.Literals.OPAQUE_TYPE_REFERENCE__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.OPAQUE_TYPE_REFERENCE__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
			case MetaPackage.OPAQUE_TYPE_REFERENCE__TEXT:
				return getText();
			case MetaPackage.OPAQUE_TYPE_REFERENCE__REFERENCES:
				return getReferences();
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
			case MetaPackage.OPAQUE_TYPE_REFERENCE__TEXT:
				setText((String)newValue);
				return;
			case MetaPackage.OPAQUE_TYPE_REFERENCE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends TypeReference>)newValue);
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
			case MetaPackage.OPAQUE_TYPE_REFERENCE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MetaPackage.OPAQUE_TYPE_REFERENCE__REFERENCES:
				getReferences().clear();
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
			case MetaPackage.OPAQUE_TYPE_REFERENCE__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case MetaPackage.OPAQUE_TYPE_REFERENCE__REFERENCES:
				return !getReferences().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpaqueTypeReferenceImpl
