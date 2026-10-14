/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl#isDeclarationOnly <em>Declaration Only</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.ModuleImpl#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends TypeScriptElementImpl implements org.nasdanika.sdk.runtime.models.typescript.Module {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDeclarationOnly() <em>Declaration Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeclarationOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DECLARATION_ONLY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eDynamicGet(TypescriptPackage.MODULE__PATH, TypescriptPackage.Literals.MODULE__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		eDynamicSet(TypescriptPackage.MODULE__PATH, TypescriptPackage.Literals.MODULE__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeclarationOnly() {
		return (Boolean)eDynamicGet(TypescriptPackage.MODULE__DECLARATION_ONLY, TypescriptPackage.Literals.MODULE__DECLARATION_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationOnly(boolean newDeclarationOnly) {
		eDynamicSet(TypescriptPackage.MODULE__DECLARATION_ONLY, TypescriptPackage.Literals.MODULE__DECLARATION_ONLY, newDeclarationOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeader() {
		return (String)eDynamicGet(TypescriptPackage.MODULE__HEADER, TypescriptPackage.Literals.MODULE__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(String newHeader) {
		eDynamicSet(TypescriptPackage.MODULE__HEADER, TypescriptPackage.Literals.MODULE__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Import> getImports() {
		return (EList<Import>)eDynamicGet(TypescriptPackage.MODULE__IMPORTS, TypescriptPackage.Literals.MODULE__IMPORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Declaration> getDeclarations() {
		return (EList<Declaration>)eDynamicGet(TypescriptPackage.MODULE__DECLARATIONS, TypescriptPackage.Literals.MODULE__DECLARATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooter() {
		return (String)eDynamicGet(TypescriptPackage.MODULE__FOOTER, TypescriptPackage.Literals.MODULE__FOOTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(String newFooter) {
		eDynamicSet(TypescriptPackage.MODULE__FOOTER, TypescriptPackage.Literals.MODULE__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypescriptPackage.MODULE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case TypescriptPackage.MODULE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
			case TypescriptPackage.MODULE__PATH:
				return getPath();
			case TypescriptPackage.MODULE__DECLARATION_ONLY:
				return isDeclarationOnly();
			case TypescriptPackage.MODULE__HEADER:
				return getHeader();
			case TypescriptPackage.MODULE__IMPORTS:
				return getImports();
			case TypescriptPackage.MODULE__DECLARATIONS:
				return getDeclarations();
			case TypescriptPackage.MODULE__FOOTER:
				return getFooter();
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
			case TypescriptPackage.MODULE__PATH:
				setPath((String)newValue);
				return;
			case TypescriptPackage.MODULE__DECLARATION_ONLY:
				setDeclarationOnly((Boolean)newValue);
				return;
			case TypescriptPackage.MODULE__HEADER:
				setHeader((String)newValue);
				return;
			case TypescriptPackage.MODULE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case TypescriptPackage.MODULE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case TypescriptPackage.MODULE__FOOTER:
				setFooter((String)newValue);
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
			case TypescriptPackage.MODULE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case TypescriptPackage.MODULE__DECLARATION_ONLY:
				setDeclarationOnly(DECLARATION_ONLY_EDEFAULT);
				return;
			case TypescriptPackage.MODULE__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case TypescriptPackage.MODULE__IMPORTS:
				getImports().clear();
				return;
			case TypescriptPackage.MODULE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case TypescriptPackage.MODULE__FOOTER:
				setFooter(FOOTER_EDEFAULT);
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
			case TypescriptPackage.MODULE__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case TypescriptPackage.MODULE__DECLARATION_ONLY:
				return isDeclarationOnly() != DECLARATION_ONLY_EDEFAULT;
			case TypescriptPackage.MODULE__HEADER:
				return HEADER_EDEFAULT == null ? getHeader() != null : !HEADER_EDEFAULT.equals(getHeader());
			case TypescriptPackage.MODULE__IMPORTS:
				return !getImports().isEmpty();
			case TypescriptPackage.MODULE__DECLARATIONS:
				return !getDeclarations().isEmpty();
			case TypescriptPackage.MODULE__FOOTER:
				return FOOTER_EDEFAULT == null ? getFooter() != null : !FOOTER_EDEFAULT.equals(getFooter());
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
