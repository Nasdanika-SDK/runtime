/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * MetricsData represents the metrics export payload which can be serialized to different formats, e.g., OTLP/gRPC, JSON, and proto.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData#getResourceMetrics <em>Resource Metrics</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getMetricsData()
 * @model
 * @generated
 */
public interface MetricsData extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * An array of ResourceMetrics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Metrics</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getMetricsData_ResourceMetrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceMetrics> getResourceMetrics();

} // MetricsData
