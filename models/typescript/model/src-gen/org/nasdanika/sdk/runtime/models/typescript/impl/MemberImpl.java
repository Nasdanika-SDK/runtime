/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.typescript.Member;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;
import org.nasdanika.sdk.runtime.models.typescript.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.MemberImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl extends TypeScriptElementImpl implements Member {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(TypescriptPackage.MEMBER__VISIBILITY, TypescriptPackage.Literals.MEMBER__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(TypescriptPackage.MEMBER__VISIBILITY, TypescriptPackage.Literals.MEMBER__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (Boolean)eDynamicGet(TypescriptPackage.MEMBER__STATIC, TypescriptPackage.Literals.MEMBER__STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		eDynamicSet(TypescriptPackage.MEMBER__STATIC, TypescriptPackage.Literals.MEMBER__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return (Boolean)eDynamicGet(TypescriptPackage.MEMBER__OPTIONAL, TypescriptPackage.Literals.MEMBER__OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		eDynamicSet(TypescriptPackage.MEMBER__OPTIONAL, TypescriptPackage.Literals.MEMBER__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypescriptPackage.MEMBER__VISIBILITY:
				return getVisibility();
			case TypescriptPackage.MEMBER__STATIC:
				return isStatic();
			case TypescriptPackage.MEMBER__OPTIONAL:
				return isOptional();
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
			case TypescriptPackage.MEMBER__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case TypescriptPackage.MEMBER__STATIC:
				setStatic((Boolean)newValue);
				return;
			case TypescriptPackage.MEMBER__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case TypescriptPackage.MEMBER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case TypescriptPackage.MEMBER__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case TypescriptPackage.MEMBER__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case TypescriptPackage.MEMBER__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case TypescriptPackage.MEMBER__STATIC:
				return isStatic() != STATIC_EDEFAULT;
			case TypescriptPackage.MEMBER__OPTIONAL:
				return isOptional() != OPTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
