/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl#isExported <em>Exported</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.DeclarationImpl#isAmbient <em>Ambient</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeclarationImpl extends TypeScriptElementImpl implements Declaration {
	/**
	 * The default value of the '{@link #isExported() <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPORTED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAmbient() <em>Ambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAmbient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AMBIENT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExported() {
		return (Boolean)eDynamicGet(TypescriptPackage.DECLARATION__EXPORTED, TypescriptPackage.Literals.DECLARATION__EXPORTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExported(boolean newExported) {
		eDynamicSet(TypescriptPackage.DECLARATION__EXPORTED, TypescriptPackage.Literals.DECLARATION__EXPORTED, newExported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAmbient() {
		return (Boolean)eDynamicGet(TypescriptPackage.DECLARATION__AMBIENT, TypescriptPackage.Literals.DECLARATION__AMBIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbient(boolean newAmbient) {
		eDynamicSet(TypescriptPackage.DECLARATION__AMBIENT, TypescriptPackage.Literals.DECLARATION__AMBIENT, newAmbient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypescriptPackage.DECLARATION__EXPORTED:
				return isExported();
			case TypescriptPackage.DECLARATION__AMBIENT:
				return isAmbient();
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
			case TypescriptPackage.DECLARATION__EXPORTED:
				setExported((Boolean)newValue);
				return;
			case TypescriptPackage.DECLARATION__AMBIENT:
				setAmbient((Boolean)newValue);
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
			case TypescriptPackage.DECLARATION__EXPORTED:
				setExported(EXPORTED_EDEFAULT);
				return;
			case TypescriptPackage.DECLARATION__AMBIENT:
				setAmbient(AMBIENT_EDEFAULT);
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
			case TypescriptPackage.DECLARATION__EXPORTED:
				return isExported() != EXPORTED_EDEFAULT;
			case TypescriptPackage.DECLARATION__AMBIENT:
				return isAmbient() != AMBIENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DeclarationImpl
