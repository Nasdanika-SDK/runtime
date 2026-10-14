/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;
import org.nasdanika.sdk.runtime.models.meta.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypedElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypedElementImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypedElementImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypedElementImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.impl.TypedElementImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypedElementImpl extends ModelElementImpl implements TypedElement {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		return (TypeReference)eDynamicGet(MetaPackage.TYPED_ELEMENT__TYPE, MetaPackage.Literals.TYPED_ELEMENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newType, MetaPackage.TYPED_ELEMENT__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		eDynamicSet(MetaPackage.TYPED_ELEMENT__TYPE, MetaPackage.Literals.TYPED_ELEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return (Integer)eDynamicGet(MetaPackage.TYPED_ELEMENT__LOWER_BOUND, MetaPackage.Literals.TYPED_ELEMENT__LOWER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		eDynamicSet(MetaPackage.TYPED_ELEMENT__LOWER_BOUND, MetaPackage.Literals.TYPED_ELEMENT__LOWER_BOUND, newLowerBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return (Integer)eDynamicGet(MetaPackage.TYPED_ELEMENT__UPPER_BOUND, MetaPackage.Literals.TYPED_ELEMENT__UPPER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		eDynamicSet(MetaPackage.TYPED_ELEMENT__UPPER_BOUND, MetaPackage.Literals.TYPED_ELEMENT__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return (Boolean)eDynamicGet(MetaPackage.TYPED_ELEMENT__ORDERED, MetaPackage.Literals.TYPED_ELEMENT__ORDERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		eDynamicSet(MetaPackage.TYPED_ELEMENT__ORDERED, MetaPackage.Literals.TYPED_ELEMENT__ORDERED, newOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (Boolean)eDynamicGet(MetaPackage.TYPED_ELEMENT__UNIQUE, MetaPackage.Literals.TYPED_ELEMENT__UNIQUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		eDynamicSet(MetaPackage.TYPED_ELEMENT__UNIQUE, MetaPackage.Literals.TYPED_ELEMENT__UNIQUE, newUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.TYPED_ELEMENT__TYPE:
				return basicSetType(null, msgs);
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
			case MetaPackage.TYPED_ELEMENT__TYPE:
				return getType();
			case MetaPackage.TYPED_ELEMENT__LOWER_BOUND:
				return getLowerBound();
			case MetaPackage.TYPED_ELEMENT__UPPER_BOUND:
				return getUpperBound();
			case MetaPackage.TYPED_ELEMENT__ORDERED:
				return isOrdered();
			case MetaPackage.TYPED_ELEMENT__UNIQUE:
				return isUnique();
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
			case MetaPackage.TYPED_ELEMENT__TYPE:
				setType((TypeReference)newValue);
				return;
			case MetaPackage.TYPED_ELEMENT__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case MetaPackage.TYPED_ELEMENT__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case MetaPackage.TYPED_ELEMENT__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case MetaPackage.TYPED_ELEMENT__UNIQUE:
				setUnique((Boolean)newValue);
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
			case MetaPackage.TYPED_ELEMENT__TYPE:
				setType((TypeReference)null);
				return;
			case MetaPackage.TYPED_ELEMENT__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case MetaPackage.TYPED_ELEMENT__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case MetaPackage.TYPED_ELEMENT__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case MetaPackage.TYPED_ELEMENT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case MetaPackage.TYPED_ELEMENT__TYPE:
				return getType() != null;
			case MetaPackage.TYPED_ELEMENT__LOWER_BOUND:
				return getLowerBound() != LOWER_BOUND_EDEFAULT;
			case MetaPackage.TYPED_ELEMENT__UPPER_BOUND:
				return getUpperBound() != UPPER_BOUND_EDEFAULT;
			case MetaPackage.TYPED_ELEMENT__ORDERED:
				return isOrdered() != ORDERED_EDEFAULT;
			case MetaPackage.TYPED_ELEMENT__UNIQUE:
				return isUnique() != UNIQUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TypedElementImpl
