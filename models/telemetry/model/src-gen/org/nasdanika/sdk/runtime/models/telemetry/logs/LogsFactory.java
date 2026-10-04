/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage
 * @generated
 */
public interface LogsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogsFactory eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	LogsData createLogsData();

	/**
	 * Returns a new object of class '<em>Resource Logs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Logs</em>'.
	 * @generated
	 */
	ResourceLogs createResourceLogs();

	/**
	 * Returns a new object of class '<em>Scope Logs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Logs</em>'.
	 * @generated
	 */
	ScopeLogs createScopeLogs();

	/**
	 * Returns a new object of class '<em>Log Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Record</em>'.
	 * @generated
	 */
	LogRecord createLogRecord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogsPackage getLogsPackage();

} //LogsFactory
