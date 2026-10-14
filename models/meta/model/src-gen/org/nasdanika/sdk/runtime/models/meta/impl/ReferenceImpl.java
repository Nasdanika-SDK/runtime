/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ReferenceImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ReferenceImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.ReferenceImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends FeatureImpl implements Reference {
	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainment() {
		return (Boolean)eDynamicGet(MetaPackage.REFERENCE__CONTAINMENT, MetaPackage.Literals.REFERENCE__CONTAINMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(boolean newContainment) {
		eDynamicSet(MetaPackage.REFERENCE__CONTAINMENT, MetaPackage.Literals.REFERENCE__CONTAINMENT, newContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOpposite() {
		return (Reference)eDynamicGet(MetaPackage.REFERENCE__OPPOSITE, MetaPackage.Literals.REFERENCE__OPPOSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetOpposite() {
		return (Reference)eDynamicGet(MetaPackage.REFERENCE__OPPOSITE, MetaPackage.Literals.REFERENCE__OPPOSITE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Reference newOpposite) {
		eDynamicSet(MetaPackage.REFERENCE__OPPOSITE, MetaPackage.Literals.REFERENCE__OPPOSITE, newOpposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getKeys() {
		return (EList<Attribute>)eDynamicGet(MetaPackage.REFERENCE__KEYS, MetaPackage.Literals.REFERENCE__KEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.REFERENCE__CONTAINMENT:
				return isContainment();
			case MetaPackage.REFERENCE__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case MetaPackage.REFERENCE__KEYS:
				return getKeys();
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
			case MetaPackage.REFERENCE__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case MetaPackage.REFERENCE__OPPOSITE:
				setOpposite((Reference)newValue);
				return;
			case MetaPackage.REFERENCE__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Attribute>)newValue);
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
			case MetaPackage.REFERENCE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case MetaPackage.REFERENCE__OPPOSITE:
				setOpposite((Reference)null);
				return;
			case MetaPackage.REFERENCE__KEYS:
				getKeys().clear();
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
			case MetaPackage.REFERENCE__CONTAINMENT:
				return isContainment() != CONTAINMENT_EDEFAULT;
			case MetaPackage.REFERENCE__OPPOSITE:
				return basicGetOpposite() != null;
			case MetaPackage.REFERENCE__KEYS:
				return !getKeys().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
