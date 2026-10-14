/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl#getImportedName <em>Imported Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ImportBindingImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportBindingImpl extends TypeScriptElementImpl implements ImportBinding {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ImportKind KIND_EDEFAULT = ImportKind.NAMED;

	/**
	 * The default value of the '{@link #getImportedName() <em>Imported Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.IMPORT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportKind getKind() {
		return (ImportKind)eDynamicGet(TypescriptPackage.IMPORT_BINDING__KIND, TypescriptPackage.Literals.IMPORT_BINDING__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ImportKind newKind) {
		eDynamicSet(TypescriptPackage.IMPORT_BINDING__KIND, TypescriptPackage.Literals.IMPORT_BINDING__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportedName() {
		return (String)eDynamicGet(TypescriptPackage.IMPORT_BINDING__IMPORTED_NAME, TypescriptPackage.Literals.IMPORT_BINDING__IMPORTED_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedName(String newImportedName) {
		eDynamicSet(TypescriptPackage.IMPORT_BINDING__IMPORTED_NAME, TypescriptPackage.Literals.IMPORT_BINDING__IMPORTED_NAME, newImportedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return (String)eDynamicGet(TypescriptPackage.IMPORT_BINDING__ALIAS, TypescriptPackage.Literals.IMPORT_BINDING__ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		eDynamicSet(TypescriptPackage.IMPORT_BINDING__ALIAS, TypescriptPackage.Literals.IMPORT_BINDING__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypescriptPackage.IMPORT_BINDING__KIND:
				return getKind();
			case TypescriptPackage.IMPORT_BINDING__IMPORTED_NAME:
				return getImportedName();
			case TypescriptPackage.IMPORT_BINDING__ALIAS:
				return getAlias();
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
			case TypescriptPackage.IMPORT_BINDING__KIND:
				setKind((ImportKind)newValue);
				return;
			case TypescriptPackage.IMPORT_BINDING__IMPORTED_NAME:
				setImportedName((String)newValue);
				return;
			case TypescriptPackage.IMPORT_BINDING__ALIAS:
				setAlias((String)newValue);
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
			case TypescriptPackage.IMPORT_BINDING__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TypescriptPackage.IMPORT_BINDING__IMPORTED_NAME:
				setImportedName(IMPORTED_NAME_EDEFAULT);
				return;
			case TypescriptPackage.IMPORT_BINDING__ALIAS:
				setAlias(ALIAS_EDEFAULT);
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
			case TypescriptPackage.IMPORT_BINDING__KIND:
				return getKind() != KIND_EDEFAULT;
			case TypescriptPackage.IMPORT_BINDING__IMPORTED_NAME:
				return IMPORTED_NAME_EDEFAULT == null ? getImportedName() != null : !IMPORTED_NAME_EDEFAULT.equals(getImportedName());
			case TypescriptPackage.IMPORT_BINDING__ALIAS:
				return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
		}
		return super.eIsSet(featureID);
	}

} //ImportBindingImpl
