/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Script Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeScriptElementImpl extends NamedElementImpl implements TypeScriptElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeScriptElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.TYPE_SCRIPT_ELEMENT;
	}

} //TypeScriptElementImpl
