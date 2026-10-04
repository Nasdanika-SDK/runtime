/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage
 * @generated
 */
public interface MetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsFactory eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	MetricsData createMetricsData();

	/**
	 * Returns a new object of class '<em>Resource Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Metrics</em>'.
	 * @generated
	 */
	ResourceMetrics createResourceMetrics();

	/**
	 * Returns a new object of class '<em>Scope Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Metrics</em>'.
	 * @generated
	 */
	ScopeMetrics createScopeMetrics();

	/**
	 * Returns a new object of class '<em>Gauge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gauge</em>'.
	 * @generated
	 */
	Gauge createGauge();

	/**
	 * Returns a new object of class '<em>Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum</em>'.
	 * @generated
	 */
	Sum createSum();

	/**
	 * Returns a new object of class '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram</em>'.
	 * @generated
	 */
	Histogram createHistogram();

	/**
	 * Returns a new object of class '<em>Exponential Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Histogram</em>'.
	 * @generated
	 */
	ExponentialHistogram createExponentialHistogram();

	/**
	 * Returns a new object of class '<em>Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Summary</em>'.
	 * @generated
	 */
	Summary createSummary();

	/**
	 * Returns a new object of class '<em>Number Data Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Data Point</em>'.
	 * @generated
	 */
	NumberDataPoint createNumberDataPoint();

	/**
	 * Returns a new object of class '<em>Histogram Data Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram Data Point</em>'.
	 * @generated
	 */
	HistogramDataPoint createHistogramDataPoint();

	/**
	 * Returns a new object of class '<em>Exponential Histogram Data Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Histogram Data Point</em>'.
	 * @generated
	 */
	ExponentialHistogramDataPoint createExponentialHistogramDataPoint();

	/**
	 * Returns a new object of class '<em>Exponential Histogram Data Point Buckets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential Histogram Data Point Buckets</em>'.
	 * @generated
	 */
	ExponentialHistogramDataPointBuckets createExponentialHistogramDataPointBuckets();

	/**
	 * Returns a new object of class '<em>Summary Data Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Summary Data Point</em>'.
	 * @generated
	 */
	SummaryDataPoint createSummaryDataPoint();

	/**
	 * Returns a new object of class '<em>Summary Data Point Value At Quantile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Summary Data Point Value At Quantile</em>'.
	 * @generated
	 */
	SummaryDataPointValueAtQuantile createSummaryDataPointValueAtQuantile();

	/**
	 * Returns a new object of class '<em>Exemplar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exemplar</em>'.
	 * @generated
	 */
	Exemplar createExemplar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetricsPackage getMetricsPackage();

} //MetricsFactory
