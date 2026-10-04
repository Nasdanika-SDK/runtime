/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gauge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Gauge represents the type of a scalar metric that always exports the current value for every data point. It should be used for an unknown aggregation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge#getDataPoints <em>Data Points</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getGauge()
 * @model
 * @generated
 */
public interface Gauge extends Metric {
	/**
	 * Returns the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Points</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getGauge_DataPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<NumberDataPoint> getDataPoints();

} // Gauge
