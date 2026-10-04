/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Histogram Data Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ExponentialHistogramDataPoint is a single data point in a timeseries that describes the time-varying values of a ExponentialHistogram of double values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getSum <em>Sum</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getScale <em>Scale</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroCount <em>Zero Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getPositive <em>Positive</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getNegative <em>Negative</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getExemplars <em>Exemplars</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroThreshold <em>Zero Threshold</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint()
 * @model
 * @generated
 */
public interface ExponentialHistogramDataPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #setStartTimeUnixNano(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_StartTimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getStartTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time Unix Nano</em>' attribute.
	 * @see #getStartTimeUnixNano()
	 * @generated
	 */
	void setStartTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #setTimeUnixNano(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_TimeUnixNano()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeUnixNano();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unix Nano</em>' attribute.
	 * @see #getTimeUnixNano()
	 * @generated
	 */
	void setTimeUnixNano(long value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Count()
	 * @model unique="false"
	 * @generated
	 */
	long getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(long value);

	/**
	 * Returns the value of the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sum</em>' attribute.
	 * @see #setSum(Double)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Sum()
	 * @model unique="false"
	 * @generated
	 */
	Double getSum();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getSum <em>Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sum</em>' attribute.
	 * @see #getSum()
	 * @generated
	 */
	void setSum(Double value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * scale describes the resolution of the histogram. Boundaries are located at powers of the base, where base = (2^(2^-scale))
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Scale()
	 * @model unique="false"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Zero Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * zero_count is the count of values in the zero bucket.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zero Count</em>' attribute.
	 * @see #setZeroCount(long)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_ZeroCount()
	 * @model unique="false"
	 * @generated
	 */
	long getZeroCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroCount <em>Zero Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero Count</em>' attribute.
	 * @see #getZeroCount()
	 * @generated
	 */
	void setZeroCount(long value);

	/**
	 * Returns the value of the '<em><b>Positive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * positive carries the positive range of exponential bucket counts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Positive</em>' containment reference.
	 * @see #setPositive(ExponentialHistogramDataPointBuckets)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Positive()
	 * @model containment="true"
	 * @generated
	 */
	ExponentialHistogramDataPointBuckets getPositive();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getPositive <em>Positive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive</em>' containment reference.
	 * @see #getPositive()
	 * @generated
	 */
	void setPositive(ExponentialHistogramDataPointBuckets value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * negative carries the negative range of exponential bucket counts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negative</em>' containment reference.
	 * @see #setNegative(ExponentialHistogramDataPointBuckets)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Negative()
	 * @model containment="true"
	 * @generated
	 */
	ExponentialHistogramDataPointBuckets getNegative();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getNegative <em>Negative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' containment reference.
	 * @see #getNegative()
	 * @generated
	 */
	void setNegative(ExponentialHistogramDataPointBuckets value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Flags()
	 * @model unique="false"
	 * @generated
	 */
	int getFlags();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(int value);

	/**
	 * Returns the value of the '<em><b>Exemplars</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplars</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Exemplars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exemplar> getExemplars();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Double)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Min()
	 * @model unique="false"
	 * @generated
	 */
	Double getMin();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Double)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_Max()
	 * @model unique="false"
	 * @generated
	 */
	Double getMax();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Double value);

	/**
	 * Returns the value of the '<em><b>Zero Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero Threshold</em>' attribute.
	 * @see #setZeroThreshold(double)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#getExponentialHistogramDataPoint_ZeroThreshold()
	 * @model unique="false"
	 * @generated
	 */
	double getZeroThreshold();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroThreshold <em>Zero Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zero Threshold</em>' attribute.
	 * @see #getZeroThreshold()
	 * @generated
	 */
	void setZeroThreshold(double value);

} // ExponentialHistogramDataPoint
