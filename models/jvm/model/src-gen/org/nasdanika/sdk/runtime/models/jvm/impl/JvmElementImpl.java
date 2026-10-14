/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl;

import org.nasdanika.sdk.runtime.models.jvm.JvmElement;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JvmElementImpl extends NamedElementImpl implements JvmElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JvmElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.JVM_ELEMENT;
	}

} //JvmElementImpl
