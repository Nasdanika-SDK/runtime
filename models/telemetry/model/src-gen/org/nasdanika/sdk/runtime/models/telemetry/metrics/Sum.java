/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Sum represents the type of a scalar metric that is calculated as a sum of all reported measurements over a time interval.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getDataPoints <em>Data Points</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getAggregationTemporality <em>Aggregation Temporality</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#isIsMonotonic <em>Is Monotonic</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends Metric {
	/**
	 * Returns the value of the '<em><b>Data Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Points</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getSum_DataPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<NumberDataPoint> getDataPoints();

	/**
	 * Returns the value of the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Temporality</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
	 * @see #setAggregationTemporality(AggregationTemporality)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getSum_AggregationTemporality()
	 * @model unique="false"
	 * @generated
	 */
	AggregationTemporality getAggregationTemporality();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getAggregationTemporality <em>Aggregation Temporality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Temporality</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
	 * @see #getAggregationTemporality()
	 * @generated
	 */
	void setAggregationTemporality(AggregationTemporality value);

	/**
	 * Returns the value of the '<em><b>Is Monotonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * If true, the sum is monotonically increasing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Monotonic</em>' attribute.
	 * @see #setIsMonotonic(boolean)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getSum_IsMonotonic()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsMonotonic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#isIsMonotonic <em>Is Monotonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Monotonic</em>' attribute.
	 * @see #isIsMonotonic()
	 * @generated
	 */
	void setIsMonotonic(boolean value);

} // Sum
