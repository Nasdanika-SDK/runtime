/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.logs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage
 * @generated
 */
public class LogsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogsSwitch<Adapter> modelSwitch =
		new LogsSwitch<Adapter>() {
			@Override
			public Adapter caseLogsData(LogsData object) {
				return createLogsDataAdapter();
			}
			@Override
			public Adapter caseResourceLogs(ResourceLogs object) {
				return createResourceLogsAdapter();
			}
			@Override
			public Adapter caseScopeLogs(ScopeLogs object) {
				return createScopeLogsAdapter();
			}
			@Override
			public Adapter caseLogRecord(LogRecord object) {
				return createLogRecordAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsData
	 * @generated
	 */
	public Adapter createLogsDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs <em>Resource Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs
	 * @generated
	 */
	public Adapter createResourceLogsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs <em>Scope Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs
	 * @generated
	 */
	public Adapter createScopeLogsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord <em>Log Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord
	 * @generated
	 */
	public Adapter createLogRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogsAdapterFactory
