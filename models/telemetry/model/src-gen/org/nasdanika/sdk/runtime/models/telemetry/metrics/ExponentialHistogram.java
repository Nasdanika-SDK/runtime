/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Histogram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ExponentialHistogram represents the type of a metric that is calculated by aggregating as a ExponentialHistogram of all reported double measurements over a time interval.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getDataPoints <em>Data Points</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getAggregationTemporality <em>Aggregation Temporality</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogram()
 * @model
 * @generated
 */
public interface ExponentialHistogram extends Metric {
	/**
	 * Returns the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Points</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogram_DataPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExponentialHistogramDataPoint> getDataPoints();

	/**
	 * Returns the value of the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Temporality</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
	 * @see #setAggregationTemporality(AggregationTemporality)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogram_AggregationTemporality()
	 * @model unique="false"
	 * @generated
	 */
	AggregationTemporality getAggregationTemporality();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getAggregationTemporality <em>Aggregation Temporality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Temporality</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
	 * @see #getAggregationTemporality()
	 * @generated
	 */
	void setAggregationTemporality(AggregationTemporality value);

} // ExponentialHistogram
