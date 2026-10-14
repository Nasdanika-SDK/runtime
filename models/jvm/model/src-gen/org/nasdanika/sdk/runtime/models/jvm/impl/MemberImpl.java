/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.AccessLevel;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Member;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.MemberImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl extends JvmElementImpl implements Member {
	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessLevel ACCESS_EDEFAULT = AccessLevel.PUBLIC;

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
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSynthetic() <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynthetic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNTHETIC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTOR_EDEFAULT = null;

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
		return JvmPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel getAccess() {
		return (AccessLevel)eDynamicGet(JvmPackage.MEMBER__ACCESS, JvmPackage.Literals.MEMBER__ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessLevel newAccess) {
		eDynamicSet(JvmPackage.MEMBER__ACCESS, JvmPackage.Literals.MEMBER__ACCESS, newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatic() {
		return (Boolean)eDynamicGet(JvmPackage.MEMBER__STATIC, JvmPackage.Literals.MEMBER__STATIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		eDynamicSet(JvmPackage.MEMBER__STATIC, JvmPackage.Literals.MEMBER__STATIC, newStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return (Boolean)eDynamicGet(JvmPackage.MEMBER__FINAL, JvmPackage.Literals.MEMBER__FINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		eDynamicSet(JvmPackage.MEMBER__FINAL, JvmPackage.Literals.MEMBER__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynthetic() {
		return (Boolean)eDynamicGet(JvmPackage.MEMBER__SYNTHETIC, JvmPackage.Literals.MEMBER__SYNTHETIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynthetic(boolean newSynthetic) {
		eDynamicSet(JvmPackage.MEMBER__SYNTHETIC, JvmPackage.Literals.MEMBER__SYNTHETIC, newSynthetic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptor() {
		return (String)eDynamicGet(JvmPackage.MEMBER__DESCRIPTOR, JvmPackage.Literals.MEMBER__DESCRIPTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(String newDescriptor) {
		eDynamicSet(JvmPackage.MEMBER__DESCRIPTOR, JvmPackage.Literals.MEMBER__DESCRIPTOR, newDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.MEMBER__ACCESS:
				return getAccess();
			case JvmPackage.MEMBER__STATIC:
				return isStatic();
			case JvmPackage.MEMBER__FINAL:
				return isFinal();
			case JvmPackage.MEMBER__SYNTHETIC:
				return isSynthetic();
			case JvmPackage.MEMBER__DESCRIPTOR:
				return getDescriptor();
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
			case JvmPackage.MEMBER__ACCESS:
				setAccess((AccessLevel)newValue);
				return;
			case JvmPackage.MEMBER__STATIC:
				setStatic((Boolean)newValue);
				return;
			case JvmPackage.MEMBER__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JvmPackage.MEMBER__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case JvmPackage.MEMBER__DESCRIPTOR:
				setDescriptor((String)newValue);
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
			case JvmPackage.MEMBER__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case JvmPackage.MEMBER__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case JvmPackage.MEMBER__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JvmPackage.MEMBER__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case JvmPackage.MEMBER__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
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
			case JvmPackage.MEMBER__ACCESS:
				return getAccess() != ACCESS_EDEFAULT;
			case JvmPackage.MEMBER__STATIC:
				return isStatic() != STATIC_EDEFAULT;
			case JvmPackage.MEMBER__FINAL:
				return isFinal() != FINAL_EDEFAULT;
			case JvmPackage.MEMBER__SYNTHETIC:
				return isSynthetic() != SYNTHETIC_EDEFAULT;
			case JvmPackage.MEMBER__DESCRIPTOR:
				return DESCRIPTOR_EDEFAULT == null ? getDescriptor() != null : !DESCRIPTOR_EDEFAULT.equals(getDescriptor());
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
