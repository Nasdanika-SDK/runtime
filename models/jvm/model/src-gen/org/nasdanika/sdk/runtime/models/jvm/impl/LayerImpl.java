/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Layer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl#isBoot <em>Boot</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.LayerImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends JvmElementImpl implements Layer {
	/**
	 * The default value of the '{@link #isBoot() <em>Boot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoot() {
		return (Boolean)eDynamicGet(JvmPackage.LAYER__BOOT, JvmPackage.Literals.LAYER__BOOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoot(boolean newBoot) {
		eDynamicSet(JvmPackage.LAYER__BOOT, JvmPackage.Literals.LAYER__BOOT, newBoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Layer> getParents() {
		return (EList<Layer>)eDynamicGet(JvmPackage.LAYER__PARENTS, JvmPackage.Literals.LAYER__PARENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.nasdanika.sdk.runtime.models.jvm.Module> getModules() {
		return (EList<org.nasdanika.sdk.runtime.models.jvm.Module>)eDynamicGet(JvmPackage.LAYER__MODULES, JvmPackage.Literals.LAYER__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.LAYER__BOOT:
				return isBoot();
			case JvmPackage.LAYER__PARENTS:
				return getParents();
			case JvmPackage.LAYER__MODULES:
				return getModules();
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
			case JvmPackage.LAYER__BOOT:
				setBoot((Boolean)newValue);
				return;
			case JvmPackage.LAYER__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Layer>)newValue);
				return;
			case JvmPackage.LAYER__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends org.nasdanika.sdk.runtime.models.jvm.Module>)newValue);
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
			case JvmPackage.LAYER__BOOT:
				setBoot(BOOT_EDEFAULT);
				return;
			case JvmPackage.LAYER__PARENTS:
				getParents().clear();
				return;
			case JvmPackage.LAYER__MODULES:
				getModules().clear();
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
			case JvmPackage.LAYER__BOOT:
				return isBoot() != BOOT_EDEFAULT;
			case JvmPackage.LAYER__PARENTS:
				return !getParents().isEmpty();
			case JvmPackage.LAYER__MODULES:
				return !getModules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayerImpl
