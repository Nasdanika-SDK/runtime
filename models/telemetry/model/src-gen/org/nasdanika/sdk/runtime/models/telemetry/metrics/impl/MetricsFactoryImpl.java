/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsFactoryImpl extends EFactoryImpl implements MetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricsFactory init() {
		try {
			MetricsFactory theMetricsFactory = (MetricsFactory)EPackage.Registry.INSTANCE.getEFactory(MetricsPackage.eNS_URI);
			if (theMetricsFactory != null) {
				return theMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetricsPackage.METRICS_DATA: return createMetricsData();
			case MetricsPackage.RESOURCE_METRICS: return createResourceMetrics();
			case MetricsPackage.SCOPE_METRICS: return createScopeMetrics();
			case MetricsPackage.GAUGE: return createGauge();
			case MetricsPackage.SUM: return createSum();
			case MetricsPackage.HISTOGRAM: return createHistogram();
			case MetricsPackage.EXPONENTIAL_HISTOGRAM: return createExponentialHistogram();
			case MetricsPackage.SUMMARY: return createSummary();
			case MetricsPackage.NUMBER_DATA_POINT: return createNumberDataPoint();
			case MetricsPackage.HISTOGRAM_DATA_POINT: return createHistogramDataPoint();
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT: return createExponentialHistogramDataPoint();
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS: return createExponentialHistogramDataPointBuckets();
			case MetricsPackage.SUMMARY_DATA_POINT: return createSummaryDataPoint();
			case MetricsPackage.SUMMARY_DATA_POINT_VALUE_AT_QUANTILE: return createSummaryDataPointValueAtQuantile();
			case MetricsPackage.EXEMPLAR: return createExemplar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetricsPackage.AGGREGATION_TEMPORALITY:
				return createAggregationTemporalityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetricsPackage.AGGREGATION_TEMPORALITY:
				return convertAggregationTemporalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsData createMetricsData() {
		MetricsDataImpl metricsData = new MetricsDataImpl();
		return metricsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceMetrics createResourceMetrics() {
		ResourceMetricsImpl resourceMetrics = new ResourceMetricsImpl();
		return resourceMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeMetrics createScopeMetrics() {
		ScopeMetricsImpl scopeMetrics = new ScopeMetricsImpl();
		return scopeMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gauge createGauge() {
		GaugeImpl gauge = new GaugeImpl();
		return gauge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sum createSum() {
		SumImpl sum = new SumImpl();
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Histogram createHistogram() {
		HistogramImpl histogram = new HistogramImpl();
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialHistogram createExponentialHistogram() {
		ExponentialHistogramImpl exponentialHistogram = new ExponentialHistogramImpl();
		return exponentialHistogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Summary createSummary() {
		SummaryImpl summary = new SummaryImpl();
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberDataPoint createNumberDataPoint() {
		NumberDataPointImpl numberDataPoint = new NumberDataPointImpl();
		return numberDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramDataPoint createHistogramDataPoint() {
		HistogramDataPointImpl histogramDataPoint = new HistogramDataPointImpl();
		return histogramDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialHistogramDataPoint createExponentialHistogramDataPoint() {
		ExponentialHistogramDataPointImpl exponentialHistogramDataPoint = new ExponentialHistogramDataPointImpl();
		return exponentialHistogramDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialHistogramDataPointBuckets createExponentialHistogramDataPointBuckets() {
		ExponentialHistogramDataPointBucketsImpl exponentialHistogramDataPointBuckets = new ExponentialHistogramDataPointBucketsImpl();
		return exponentialHistogramDataPointBuckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryDataPoint createSummaryDataPoint() {
		SummaryDataPointImpl summaryDataPoint = new SummaryDataPointImpl();
		return summaryDataPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryDataPointValueAtQuantile createSummaryDataPointValueAtQuantile() {
		SummaryDataPointValueAtQuantileImpl summaryDataPointValueAtQuantile = new SummaryDataPointValueAtQuantileImpl();
		return summaryDataPointValueAtQuantile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar createExemplar() {
		ExemplarImpl exemplar = new ExemplarImpl();
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTemporality createAggregationTemporalityFromString(EDataType eDataType, String initialValue) {
		AggregationTemporality result = AggregationTemporality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTemporalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsPackage getMetricsPackage() {
		return (MetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricsPackage getPackage() {
		return MetricsPackage.eINSTANCE;
	}

} //MetricsFactoryImpl
