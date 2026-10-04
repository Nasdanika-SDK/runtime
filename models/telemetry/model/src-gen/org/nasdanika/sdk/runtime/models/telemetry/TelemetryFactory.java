/**
 */
package org.nasdanika.sdk.runtime.models.telemetry;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage
 * @generated
 */
public interface TelemetryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TelemetryFactory eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.impl.TelemetryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Instrumentation Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrumentation Scope</em>'.
	 * @generated
	 */
	InstrumentationScope createInstrumentationScope();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	KeyValue createKeyValue();

	/**
	 * Returns a new object of class '<em>Any Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Value</em>'.
	 * @generated
	 */
	AnyValue createAnyValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TelemetryPackage getTelemetryPackage();

} //TelemetryFactory
