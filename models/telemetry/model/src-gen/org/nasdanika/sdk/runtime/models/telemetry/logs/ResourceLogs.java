/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Logs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A collection of ScopeLogs from a Resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getScopeLogs <em>Scope Logs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage#getResourceLogs()
 * @model
 * @generated
 */
public interface ResourceLogs extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage#getResourceLogs_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Scope Logs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.logs.ScopeLogs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Logs</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage#getResourceLogs_ScopeLogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScopeLogs> getScopeLogs();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Url</em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage#getResourceLogs_SchemaUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.logs.ResourceLogs#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // ResourceLogs
