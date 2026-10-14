/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.Field;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl#isEnumConstant <em>Enum Constant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.FieldImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MemberImpl implements Field {
	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEnumConstant() <em>Enum Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENUM_CONSTANT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return (Boolean)eDynamicGet(JvmPackage.FIELD__TRANSIENT, JvmPackage.Literals.FIELD__TRANSIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		eDynamicSet(JvmPackage.FIELD__TRANSIENT, JvmPackage.Literals.FIELD__TRANSIENT, newTransient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return (Boolean)eDynamicGet(JvmPackage.FIELD__VOLATILE, JvmPackage.Literals.FIELD__VOLATILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		eDynamicSet(JvmPackage.FIELD__VOLATILE, JvmPackage.Literals.FIELD__VOLATILE, newVolatile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnumConstant() {
		return (Boolean)eDynamicGet(JvmPackage.FIELD__ENUM_CONSTANT, JvmPackage.Literals.FIELD__ENUM_CONSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumConstant(boolean newEnumConstant) {
		eDynamicSet(JvmPackage.FIELD__ENUM_CONSTANT, JvmPackage.Literals.FIELD__ENUM_CONSTANT, newEnumConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(JvmPackage.FIELD__TYPE, JvmPackage.Literals.FIELD__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return (Type)eDynamicGet(JvmPackage.FIELD__TYPE, JvmPackage.Literals.FIELD__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(JvmPackage.FIELD__TYPE, JvmPackage.Literals.FIELD__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.FIELD__TRANSIENT:
				return isTransient();
			case JvmPackage.FIELD__VOLATILE:
				return isVolatile();
			case JvmPackage.FIELD__ENUM_CONSTANT:
				return isEnumConstant();
			case JvmPackage.FIELD__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case JvmPackage.FIELD__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case JvmPackage.FIELD__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case JvmPackage.FIELD__ENUM_CONSTANT:
				setEnumConstant((Boolean)newValue);
				return;
			case JvmPackage.FIELD__TYPE:
				setType((Type)newValue);
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
			case JvmPackage.FIELD__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case JvmPackage.FIELD__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case JvmPackage.FIELD__ENUM_CONSTANT:
				setEnumConstant(ENUM_CONSTANT_EDEFAULT);
				return;
			case JvmPackage.FIELD__TYPE:
				setType((Type)null);
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
			case JvmPackage.FIELD__TRANSIENT:
				return isTransient() != TRANSIENT_EDEFAULT;
			case JvmPackage.FIELD__VOLATILE:
				return isVolatile() != VOLATILE_EDEFAULT;
			case JvmPackage.FIELD__ENUM_CONSTANT:
				return isEnumConstant() != ENUM_CONSTANT_EDEFAULT;
			case JvmPackage.FIELD__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldImpl
