/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.FlowComponent;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

import org.nasdanika.sdk.runtime.models.react.impl.LibraryComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class FlowComponentImpl extends LibraryComponentImpl implements FlowComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.FLOW_COMPONENT;
	}

} //FlowComponentImpl
