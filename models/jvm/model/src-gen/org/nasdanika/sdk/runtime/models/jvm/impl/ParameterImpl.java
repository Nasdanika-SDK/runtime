/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Parameter;
import org.nasdanika.sdk.runtime.models.jvm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl#isMandated <em>Mandated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ParameterImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends JvmElementImpl implements Parameter {
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
	 * The default value of the '{@link #getDescriptor() <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTOR_EDEFAULT = null;

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
	 * The default value of the '{@link #isMandated() <em>Mandated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return (Integer)eDynamicGet(JvmPackage.PARAMETER__INDEX, JvmPackage.Literals.PARAMETER__INDEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		eDynamicSet(JvmPackage.PARAMETER__INDEX, JvmPackage.Literals.PARAMETER__INDEX, newIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptor() {
		return (String)eDynamicGet(JvmPackage.PARAMETER__DESCRIPTOR, JvmPackage.Literals.PARAMETER__DESCRIPTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptor(String newDescriptor) {
		eDynamicSet(JvmPackage.PARAMETER__DESCRIPTOR, JvmPackage.Literals.PARAMETER__DESCRIPTOR, newDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return (Boolean)eDynamicGet(JvmPackage.PARAMETER__FINAL, JvmPackage.Literals.PARAMETER__FINAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		eDynamicSet(JvmPackage.PARAMETER__FINAL, JvmPackage.Literals.PARAMETER__FINAL, newFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynthetic() {
		return (Boolean)eDynamicGet(JvmPackage.PARAMETER__SYNTHETIC, JvmPackage.Literals.PARAMETER__SYNTHETIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynthetic(boolean newSynthetic) {
		eDynamicSet(JvmPackage.PARAMETER__SYNTHETIC, JvmPackage.Literals.PARAMETER__SYNTHETIC, newSynthetic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandated() {
		return (Boolean)eDynamicGet(JvmPackage.PARAMETER__MANDATED, JvmPackage.Literals.PARAMETER__MANDATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandated(boolean newMandated) {
		eDynamicSet(JvmPackage.PARAMETER__MANDATED, JvmPackage.Literals.PARAMETER__MANDATED, newMandated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eDynamicGet(JvmPackage.PARAMETER__TYPE, JvmPackage.Literals.PARAMETER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return (Type)eDynamicGet(JvmPackage.PARAMETER__TYPE, JvmPackage.Literals.PARAMETER__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eDynamicSet(JvmPackage.PARAMETER__TYPE, JvmPackage.Literals.PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.PARAMETER__INDEX:
				return getIndex();
			case JvmPackage.PARAMETER__DESCRIPTOR:
				return getDescriptor();
			case JvmPackage.PARAMETER__FINAL:
				return isFinal();
			case JvmPackage.PARAMETER__SYNTHETIC:
				return isSynthetic();
			case JvmPackage.PARAMETER__MANDATED:
				return isMandated();
			case JvmPackage.PARAMETER__TYPE:
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
			case JvmPackage.PARAMETER__INDEX:
				setIndex((Integer)newValue);
				return;
			case JvmPackage.PARAMETER__DESCRIPTOR:
				setDescriptor((String)newValue);
				return;
			case JvmPackage.PARAMETER__FINAL:
				setFinal((Boolean)newValue);
				return;
			case JvmPackage.PARAMETER__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case JvmPackage.PARAMETER__MANDATED:
				setMandated((Boolean)newValue);
				return;
			case JvmPackage.PARAMETER__TYPE:
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
			case JvmPackage.PARAMETER__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case JvmPackage.PARAMETER__DESCRIPTOR:
				setDescriptor(DESCRIPTOR_EDEFAULT);
				return;
			case JvmPackage.PARAMETER__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JvmPackage.PARAMETER__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case JvmPackage.PARAMETER__MANDATED:
				setMandated(MANDATED_EDEFAULT);
				return;
			case JvmPackage.PARAMETER__TYPE:
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
			case JvmPackage.PARAMETER__INDEX:
				return getIndex() != INDEX_EDEFAULT;
			case JvmPackage.PARAMETER__DESCRIPTOR:
				return DESCRIPTOR_EDEFAULT == null ? getDescriptor() != null : !DESCRIPTOR_EDEFAULT.equals(getDescriptor());
			case JvmPackage.PARAMETER__FINAL:
				return isFinal() != FINAL_EDEFAULT;
			case JvmPackage.PARAMETER__SYNTHETIC:
				return isSynthetic() != SYNTHETIC_EDEFAULT;
			case JvmPackage.PARAMETER__MANDATED:
				return isMandated() != MANDATED_EDEFAULT;
			case JvmPackage.PARAMETER__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
