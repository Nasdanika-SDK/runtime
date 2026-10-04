/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A collection of ScopeMetrics from a Resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getScopeMetrics <em>Scope Metrics</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getResourceMetrics()
 * @model
 * @generated
 */
public interface ResourceMetrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Resource)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getResourceMetrics_Resource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Scope Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Metrics</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getResourceMetrics_ScopeMetrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScopeMetrics> getScopeMetrics();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Url</em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getResourceMetrics_SchemaUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // ResourceMetrics
