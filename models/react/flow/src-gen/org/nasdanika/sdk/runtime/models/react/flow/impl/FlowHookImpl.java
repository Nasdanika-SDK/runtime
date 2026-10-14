/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.FlowHook;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

import org.nasdanika.sdk.runtime.models.react.impl.LibraryHookImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FlowHookImpl extends LibraryHookImpl implements FlowHook {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW_HOOK;
	}

} //FlowHookImpl
