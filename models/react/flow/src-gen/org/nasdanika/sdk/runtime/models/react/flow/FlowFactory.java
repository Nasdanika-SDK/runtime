/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage
 * @generated
 */
public interface FlowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowFactory eINSTANCE = org.nasdanika.sdk.runtime.models.react.flow.impl.FlowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placeholder</em>'.
	 * @generated
	 */
	Placeholder createPlaceholder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FlowPackage getFlowPackage();

} //FlowFactory
