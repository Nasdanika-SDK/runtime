/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.change.ChangePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsFactory;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile;

import org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricsDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaugeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialHistogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberDataPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramDataPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialHistogramDataPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialHistogramDataPointBucketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summaryDataPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass summaryDataPointValueAtQuantileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationTemporalityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited) return (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetricsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetricsPackageImpl theMetricsPackage = registeredMetricsPackage instanceof MetricsPackageImpl ? (MetricsPackageImpl)registeredMetricsPackage : new MetricsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TelemetryPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		TracesPackage.eINSTANCE.eClass();
		ChangePackage.eINSTANCE.eClass();
		LogsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricsData() {
		return metricsDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricsData_ResourceMetrics() {
		return (EReference)metricsDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceMetrics() {
		return resourceMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceMetrics_Resource() {
		return (EReference)resourceMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceMetrics_ScopeMetrics() {
		return (EReference)resourceMetricsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceMetrics_SchemaUrl() {
		return (EAttribute)resourceMetricsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeMetrics() {
		return scopeMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeMetrics_Scope() {
		return (EReference)scopeMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeMetrics_Metrics() {
		return (EReference)scopeMetricsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeMetrics_SchemaUrl() {
		return (EAttribute)scopeMetricsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Description() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Unit() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Metadata() {
		return (EReference)metricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGauge() {
		return gaugeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGauge_DataPoints() {
		return (EReference)gaugeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSum() {
		return sumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSum_DataPoints() {
		return (EReference)sumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSum_AggregationTemporality() {
		return (EAttribute)sumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSum_IsMonotonic() {
		return (EAttribute)sumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogram() {
		return histogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogram_DataPoints() {
		return (EReference)histogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogram_AggregationTemporality() {
		return (EAttribute)histogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialHistogram() {
		return exponentialHistogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponentialHistogram_DataPoints() {
		return (EReference)exponentialHistogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogram_AggregationTemporality() {
		return (EAttribute)exponentialHistogramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummary() {
		return summaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSummary_DataPoints() {
		return (EReference)summaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberDataPoint() {
		return numberDataPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberDataPoint_Attributes() {
		return (EReference)numberDataPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDataPoint_StartTimeUnixNano() {
		return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDataPoint_TimeUnixNano() {
		return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDataPoint_AsDouble() {
		return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDataPoint_AsInt() {
		return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberDataPoint_Exemplars() {
		return (EReference)numberDataPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberDataPoint_Flags() {
		return (EAttribute)numberDataPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogramDataPoint() {
		return histogramDataPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogramDataPoint_Attributes() {
		return (EReference)histogramDataPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_StartTimeUnixNano() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_TimeUnixNano() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_Count() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_Sum() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_BucketCounts() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_ExplicitBounds() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogramDataPoint_Exemplars() {
		return (EReference)histogramDataPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_Flags() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_Min() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramDataPoint_Max() {
		return (EAttribute)histogramDataPointEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialHistogramDataPoint() {
		return exponentialHistogramDataPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponentialHistogramDataPoint_Attributes() {
		return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_StartTimeUnixNano() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_TimeUnixNano() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_Count() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_Sum() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_Scale() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_ZeroCount() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponentialHistogramDataPoint_Positive() {
		return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponentialHistogramDataPoint_Negative() {
		return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_Flags() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponentialHistogramDataPoint_Exemplars() {
		return (EReference)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_Min() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_Max() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPoint_ZeroThreshold() {
		return (EAttribute)exponentialHistogramDataPointEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentialHistogramDataPointBuckets() {
		return exponentialHistogramDataPointBucketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPointBuckets_Offset() {
		return (EAttribute)exponentialHistogramDataPointBucketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExponentialHistogramDataPointBuckets_BucketCounts() {
		return (EAttribute)exponentialHistogramDataPointBucketsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummaryDataPoint() {
		return summaryDataPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSummaryDataPoint_Attributes() {
		return (EReference)summaryDataPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPoint_StartTimeUnixNano() {
		return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPoint_TimeUnixNano() {
		return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPoint_Count() {
		return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPoint_Sum() {
		return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSummaryDataPoint_QuantileValues() {
		return (EReference)summaryDataPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPoint_Flags() {
		return (EAttribute)summaryDataPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSummaryDataPointValueAtQuantile() {
		return summaryDataPointValueAtQuantileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPointValueAtQuantile_Quantile() {
		return (EAttribute)summaryDataPointValueAtQuantileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSummaryDataPointValueAtQuantile_Value() {
		return (EAttribute)summaryDataPointValueAtQuantileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExemplar_FilteredAttributes() {
		return (EReference)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_TimeUnixNano() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_AsDouble() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_AsInt() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_SpanId() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_TraceId() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExemplar_Span() {
		return (EReference)exemplarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationTemporality() {
		return aggregationTemporalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metricsDataEClass = createEClass(METRICS_DATA);
		createEReference(metricsDataEClass, METRICS_DATA__RESOURCE_METRICS);

		resourceMetricsEClass = createEClass(RESOURCE_METRICS);
		createEReference(resourceMetricsEClass, RESOURCE_METRICS__RESOURCE);
		createEReference(resourceMetricsEClass, RESOURCE_METRICS__SCOPE_METRICS);
		createEAttribute(resourceMetricsEClass, RESOURCE_METRICS__SCHEMA_URL);

		scopeMetricsEClass = createEClass(SCOPE_METRICS);
		createEReference(scopeMetricsEClass, SCOPE_METRICS__SCOPE);
		createEReference(scopeMetricsEClass, SCOPE_METRICS__METRICS);
		createEAttribute(scopeMetricsEClass, SCOPE_METRICS__SCHEMA_URL);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__DESCRIPTION);
		createEAttribute(metricEClass, METRIC__UNIT);
		createEReference(metricEClass, METRIC__METADATA);

		gaugeEClass = createEClass(GAUGE);
		createEReference(gaugeEClass, GAUGE__DATA_POINTS);

		sumEClass = createEClass(SUM);
		createEReference(sumEClass, SUM__DATA_POINTS);
		createEAttribute(sumEClass, SUM__AGGREGATION_TEMPORALITY);
		createEAttribute(sumEClass, SUM__IS_MONOTONIC);

		histogramEClass = createEClass(HISTOGRAM);
		createEReference(histogramEClass, HISTOGRAM__DATA_POINTS);
		createEAttribute(histogramEClass, HISTOGRAM__AGGREGATION_TEMPORALITY);

		exponentialHistogramEClass = createEClass(EXPONENTIAL_HISTOGRAM);
		createEReference(exponentialHistogramEClass, EXPONENTIAL_HISTOGRAM__DATA_POINTS);
		createEAttribute(exponentialHistogramEClass, EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY);

		summaryEClass = createEClass(SUMMARY);
		createEReference(summaryEClass, SUMMARY__DATA_POINTS);

		numberDataPointEClass = createEClass(NUMBER_DATA_POINT);
		createEReference(numberDataPointEClass, NUMBER_DATA_POINT__ATTRIBUTES);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__AS_DOUBLE);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__AS_INT);
		createEReference(numberDataPointEClass, NUMBER_DATA_POINT__EXEMPLARS);
		createEAttribute(numberDataPointEClass, NUMBER_DATA_POINT__FLAGS);

		histogramDataPointEClass = createEClass(HISTOGRAM_DATA_POINT);
		createEReference(histogramDataPointEClass, HISTOGRAM_DATA_POINT__ATTRIBUTES);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__COUNT);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__SUM);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__BUCKET_COUNTS);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS);
		createEReference(histogramDataPointEClass, HISTOGRAM_DATA_POINT__EXEMPLARS);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__FLAGS);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__MIN);
		createEAttribute(histogramDataPointEClass, HISTOGRAM_DATA_POINT__MAX);

		exponentialHistogramDataPointEClass = createEClass(EXPONENTIAL_HISTOGRAM_DATA_POINT);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS);
		createEReference(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX);
		createEAttribute(exponentialHistogramDataPointEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD);

		exponentialHistogramDataPointBucketsEClass = createEClass(EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS);
		createEAttribute(exponentialHistogramDataPointBucketsEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET);
		createEAttribute(exponentialHistogramDataPointBucketsEClass, EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS);

		summaryDataPointEClass = createEClass(SUMMARY_DATA_POINT);
		createEReference(summaryDataPointEClass, SUMMARY_DATA_POINT__ATTRIBUTES);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__START_TIME_UNIX_NANO);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__TIME_UNIX_NANO);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__COUNT);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__SUM);
		createEReference(summaryDataPointEClass, SUMMARY_DATA_POINT__QUANTILE_VALUES);
		createEAttribute(summaryDataPointEClass, SUMMARY_DATA_POINT__FLAGS);

		summaryDataPointValueAtQuantileEClass = createEClass(SUMMARY_DATA_POINT_VALUE_AT_QUANTILE);
		createEAttribute(summaryDataPointValueAtQuantileEClass, SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE);
		createEAttribute(summaryDataPointValueAtQuantileEClass, SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE);

		exemplarEClass = createEClass(EXEMPLAR);
		createEReference(exemplarEClass, EXEMPLAR__FILTERED_ATTRIBUTES);
		createEAttribute(exemplarEClass, EXEMPLAR__TIME_UNIX_NANO);
		createEAttribute(exemplarEClass, EXEMPLAR__AS_DOUBLE);
		createEAttribute(exemplarEClass, EXEMPLAR__AS_INT);
		createEAttribute(exemplarEClass, EXEMPLAR__SPAN_ID);
		createEAttribute(exemplarEClass, EXEMPLAR__TRACE_ID);
		createEReference(exemplarEClass, EXEMPLAR__SPAN);

		// Create enums
		aggregationTemporalityEEnum = createEEnum(AGGREGATION_TEMPORALITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TelemetryPackage theTelemetryPackage = (TelemetryPackage)EPackage.Registry.INSTANCE.getEPackage(TelemetryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TracesPackage theTracesPackage = (TracesPackage)EPackage.Registry.INSTANCE.getEPackage(TracesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gaugeEClass.getESuperTypes().add(this.getMetric());
		sumEClass.getESuperTypes().add(this.getMetric());
		histogramEClass.getESuperTypes().add(this.getMetric());
		exponentialHistogramEClass.getESuperTypes().add(this.getMetric());
		summaryEClass.getESuperTypes().add(this.getMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(metricsDataEClass, MetricsData.class, "MetricsData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricsData_ResourceMetrics(), this.getResourceMetrics(), null, "resourceMetrics", null, 0, -1, MetricsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceMetricsEClass, ResourceMetrics.class, "ResourceMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceMetrics_Resource(), theTelemetryPackage.getResource(), null, "resource", null, 0, 1, ResourceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceMetrics_ScopeMetrics(), this.getScopeMetrics(), null, "scopeMetrics", null, 0, -1, ResourceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceMetrics_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, ResourceMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeMetricsEClass, ScopeMetrics.class, "ScopeMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeMetrics_Scope(), theTelemetryPackage.getInstrumentationScope(), null, "scope", null, 0, 1, ScopeMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScopeMetrics_Metrics(), this.getMetric(), null, "metrics", null, 0, -1, ScopeMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeMetrics_SchemaUrl(), theEcorePackage.getEString(), "schemaUrl", null, 0, 1, ScopeMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), theEcorePackage.getEString(), "name", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Unit(), theEcorePackage.getEString(), "unit", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_Metadata(), theTelemetryPackage.getKeyValue(), null, "metadata", null, 0, -1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaugeEClass, Gauge.class, "Gauge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGauge_DataPoints(), this.getNumberDataPoint(), null, "dataPoints", null, 0, -1, Gauge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSum_DataPoints(), this.getNumberDataPoint(), null, "dataPoints", null, 0, -1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSum_AggregationTemporality(), this.getAggregationTemporality(), "aggregationTemporality", null, 0, 1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSum_IsMonotonic(), theEcorePackage.getEBoolean(), "isMonotonic", null, 0, 1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramEClass, Histogram.class, "Histogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogram_DataPoints(), this.getHistogramDataPoint(), null, "dataPoints", null, 0, -1, Histogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogram_AggregationTemporality(), this.getAggregationTemporality(), "aggregationTemporality", null, 0, 1, Histogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialHistogramEClass, ExponentialHistogram.class, "ExponentialHistogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponentialHistogram_DataPoints(), this.getExponentialHistogramDataPoint(), null, "dataPoints", null, 0, -1, ExponentialHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogram_AggregationTemporality(), this.getAggregationTemporality(), "aggregationTemporality", null, 0, 1, ExponentialHistogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryEClass, Summary.class, "Summary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSummary_DataPoints(), this.getSummaryDataPoint(), null, "dataPoints", null, 0, -1, Summary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberDataPointEClass, NumberDataPoint.class, "NumberDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberDataPoint_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_StartTimeUnixNano(), theEcorePackage.getELong(), "startTimeUnixNano", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_AsDouble(), theEcorePackage.getEDoubleObject(), "asDouble", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_AsInt(), theEcorePackage.getELongObject(), "asInt", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberDataPoint_Exemplars(), this.getExemplar(), null, "exemplars", null, 0, -1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberDataPoint_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, NumberDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramDataPointEClass, HistogramDataPoint.class, "HistogramDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogramDataPoint_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_StartTimeUnixNano(), theEcorePackage.getELong(), "startTimeUnixNano", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Count(), theEcorePackage.getELong(), "count", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Sum(), theEcorePackage.getEDoubleObject(), "sum", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_BucketCounts(), theEcorePackage.getELong(), "bucketCounts", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_ExplicitBounds(), theEcorePackage.getEDouble(), "explicitBounds", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistogramDataPoint_Exemplars(), this.getExemplar(), null, "exemplars", null, 0, -1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Min(), theEcorePackage.getEDoubleObject(), "min", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramDataPoint_Max(), theEcorePackage.getEDoubleObject(), "max", null, 0, 1, HistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialHistogramDataPointEClass, ExponentialHistogramDataPoint.class, "ExponentialHistogramDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponentialHistogramDataPoint_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_StartTimeUnixNano(), theEcorePackage.getELong(), "startTimeUnixNano", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Count(), theEcorePackage.getELong(), "count", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Sum(), theEcorePackage.getEDoubleObject(), "sum", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Scale(), theEcorePackage.getEInt(), "scale", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_ZeroCount(), theEcorePackage.getELong(), "zeroCount", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExponentialHistogramDataPoint_Positive(), this.getExponentialHistogramDataPointBuckets(), null, "positive", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExponentialHistogramDataPoint_Negative(), this.getExponentialHistogramDataPointBuckets(), null, "negative", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExponentialHistogramDataPoint_Exemplars(), this.getExemplar(), null, "exemplars", null, 0, -1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Min(), theEcorePackage.getEDoubleObject(), "min", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_Max(), theEcorePackage.getEDoubleObject(), "max", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPoint_ZeroThreshold(), theEcorePackage.getEDouble(), "zeroThreshold", null, 0, 1, ExponentialHistogramDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialHistogramDataPointBucketsEClass, ExponentialHistogramDataPointBuckets.class, "ExponentialHistogramDataPointBuckets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponentialHistogramDataPointBuckets_Offset(), theEcorePackage.getEInt(), "offset", null, 0, 1, ExponentialHistogramDataPointBuckets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExponentialHistogramDataPointBuckets_BucketCounts(), theEcorePackage.getELong(), "bucketCounts", null, 0, -1, ExponentialHistogramDataPointBuckets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryDataPointEClass, SummaryDataPoint.class, "SummaryDataPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSummaryDataPoint_Attributes(), theTelemetryPackage.getKeyValue(), null, "attributes", null, 0, -1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_StartTimeUnixNano(), theEcorePackage.getELong(), "startTimeUnixNano", null, 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_Count(), theEcorePackage.getELong(), "count", null, 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_Sum(), theEcorePackage.getEDouble(), "sum", null, 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSummaryDataPoint_QuantileValues(), this.getSummaryDataPointValueAtQuantile(), null, "quantileValues", null, 0, -1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPoint_Flags(), theEcorePackage.getEInt(), "flags", null, 0, 1, SummaryDataPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(summaryDataPointValueAtQuantileEClass, SummaryDataPointValueAtQuantile.class, "SummaryDataPointValueAtQuantile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSummaryDataPointValueAtQuantile_Quantile(), theEcorePackage.getEDouble(), "quantile", null, 0, 1, SummaryDataPointValueAtQuantile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSummaryDataPointValueAtQuantile_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, SummaryDataPointValueAtQuantile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExemplar_FilteredAttributes(), theTelemetryPackage.getKeyValue(), null, "filteredAttributes", null, 0, -1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_TimeUnixNano(), theEcorePackage.getELong(), "timeUnixNano", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_AsDouble(), theEcorePackage.getEDoubleObject(), "asDouble", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_AsInt(), theEcorePackage.getELongObject(), "asInt", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_SpanId(), theEcorePackage.getEString(), "spanId", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExemplar_TraceId(), theEcorePackage.getEString(), "traceId", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExemplar_Span(), theTracesPackage.getSpan(), null, "span", null, 0, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregationTemporalityEEnum, AggregationTemporality.class, "AggregationTemporality");
		addEEnumLiteral(aggregationTemporalityEEnum, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED);
		addEEnumLiteral(aggregationTemporalityEEnum, AggregationTemporality.AGGREGATION_TEMPORALITY_DELTA);
		addEEnumLiteral(aggregationTemporalityEEnum, AggregationTemporality.AGGREGATION_TEMPORALITY_CUMULATIVE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/org.nasdanika.sdk.runtime.models.telemetry.model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.telemetry"
		   });
		addAnnotation
		  (metricsDataEClass,
		   source,
		   new String[] {
			   "documentation", "*\nMetricsData represents the metrics export payload which can be serialized to different formats, e.g., OTLP/gRPC, JSON, and proto."
		   });
		addAnnotation
		  (getMetricsData_ResourceMetrics(),
		   source,
		   new String[] {
			   "documentation", "*\nAn array of ResourceMetrics."
		   });
		addAnnotation
		  (resourceMetricsEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA collection of ScopeMetrics from a Resource."
		   });
		addAnnotation
		  (scopeMetricsEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA collection of Metrics produced by an Scope."
		   });
		addAnnotation
		  (metricEClass,
		   source,
		   new String[] {
			   "documentation", "*\nDefines a Metric which has one or more timeseries. The following is a brief summary of the Metric data model.\n\nMetric is a named entity with a description and unit."
		   });
		addAnnotation
		  (getMetric_Name(),
		   source,
		   new String[] {
			   "documentation", "*\nname of the metric, including its DNS name prefix. It must be unique."
		   });
		addAnnotation
		  (getMetric_Description(),
		   source,
		   new String[] {
			   "documentation", "*\ndescription of the metric, which can be used in documentation."
		   });
		addAnnotation
		  (getMetric_Unit(),
		   source,
		   new String[] {
			   "documentation", "*\nunit in which the metric value is reported. Follows the format described by http://unitsofmeasure.org/ucum.html."
		   });
		addAnnotation
		  (getMetric_Metadata(),
		   source,
		   new String[] {
			   "documentation", "*\nAdditional metadata attributes that describe the metric."
		   });
		addAnnotation
		  (gaugeEClass,
		   source,
		   new String[] {
			   "documentation", "*\nGauge represents the type of a scalar metric that always exports the current value for every data point. It should be used for an unknown aggregation."
		   });
		addAnnotation
		  (sumEClass,
		   source,
		   new String[] {
			   "documentation", "*\nSum represents the type of a scalar metric that is calculated as a sum of all reported measurements over a time interval."
		   });
		addAnnotation
		  (getSum_IsMonotonic(),
		   source,
		   new String[] {
			   "documentation", "*\nIf true, the sum is monotonically increasing."
		   });
		addAnnotation
		  (histogramEClass,
		   source,
		   new String[] {
			   "documentation", "*\nHistogram represents the type of a metric that is calculated by aggregating as a Histogram of all reported measurements over a time interval."
		   });
		addAnnotation
		  (exponentialHistogramEClass,
		   source,
		   new String[] {
			   "documentation", "*\nExponentialHistogram represents the type of a metric that is calculated by aggregating as a ExponentialHistogram of all reported double measurements over a time interval."
		   });
		addAnnotation
		  (summaryEClass,
		   source,
		   new String[] {
			   "documentation", "*\nSummary metric data are used to convey quantile summaries."
		   });
		addAnnotation
		  (numberDataPointEClass,
		   source,
		   new String[] {
			   "documentation", "*\nNumberDataPoint is a single data point in a timeseries that describes the time-varying scalar value of a metric."
		   });
		addAnnotation
		  (getNumberDataPoint_AsDouble(),
		   source,
		   new String[] {
			   "documentation", "*\nvalue as a double. Either asDouble or asInt must be set."
		   });
		addAnnotation
		  (getNumberDataPoint_AsInt(),
		   source,
		   new String[] {
			   "documentation", "*\nvalue as an integer. Either asDouble or asInt must be set."
		   });
		addAnnotation
		  (getNumberDataPoint_Flags(),
		   source,
		   new String[] {
			   "documentation", "*\nFlags is an optional bit field containing hints for the backends."
		   });
		addAnnotation
		  (histogramDataPointEClass,
		   source,
		   new String[] {
			   "documentation", "*\nHistogramDataPoint is a single data point in a timeseries that describes the time-varying values of a Histogram."
		   });
		addAnnotation
		  (getHistogramDataPoint_Count(),
		   source,
		   new String[] {
			   "documentation", "*\ncount is the number of values in the population."
		   });
		addAnnotation
		  (getHistogramDataPoint_Sum(),
		   source,
		   new String[] {
			   "documentation", "*\nsum of the values in the population. If count is zero then this field must be zero."
		   });
		addAnnotation
		  (getHistogramDataPoint_BucketCounts(),
		   source,
		   new String[] {
			   "documentation", "*\nbucket_counts is an optional field contains the count values of histogram for each bucket."
		   });
		addAnnotation
		  (getHistogramDataPoint_ExplicitBounds(),
		   source,
		   new String[] {
			   "documentation", "*\nexplicit_bounds specifies buckets with explicitly defined bounds for values."
		   });
		addAnnotation
		  (getHistogramDataPoint_Min(),
		   source,
		   new String[] {
			   "documentation", "*\nmin is the minimum value over (start_time, end_time]."
		   });
		addAnnotation
		  (getHistogramDataPoint_Max(),
		   source,
		   new String[] {
			   "documentation", "*\nmax is the maximum value over (start_time, end_time]."
		   });
		addAnnotation
		  (exponentialHistogramDataPointEClass,
		   source,
		   new String[] {
			   "documentation", "*\nExponentialHistogramDataPoint is a single data point in a timeseries that describes the time-varying values of a ExponentialHistogram of double values."
		   });
		addAnnotation
		  (getExponentialHistogramDataPoint_Scale(),
		   source,
		   new String[] {
			   "documentation", "*\nscale describes the resolution of the histogram. Boundaries are located at powers of the base, where base = (2^(2^-scale))"
		   });
		addAnnotation
		  (getExponentialHistogramDataPoint_ZeroCount(),
		   source,
		   new String[] {
			   "documentation", "*\nzero_count is the count of values in the zero bucket."
		   });
		addAnnotation
		  (getExponentialHistogramDataPoint_Positive(),
		   source,
		   new String[] {
			   "documentation", "*\npositive carries the positive range of exponential bucket counts."
		   });
		addAnnotation
		  (getExponentialHistogramDataPoint_Negative(),
		   source,
		   new String[] {
			   "documentation", "*\nnegative carries the negative range of exponential bucket counts."
		   });
		addAnnotation
		  (exponentialHistogramDataPointBucketsEClass,
		   source,
		   new String[] {
			   "documentation", "*\nBuckets are a set of bucket counts, encoded in a contiguous array of counts."
		   });
		addAnnotation
		  (getExponentialHistogramDataPointBuckets_Offset(),
		   source,
		   new String[] {
			   "documentation", "*\nOffset is the bucket index of the first entry in the bucket_counts array."
		   });
		addAnnotation
		  (summaryDataPointEClass,
		   source,
		   new String[] {
			   "documentation", "*\nSummaryDataPoint is a single data point in a timeseries that describes the time-varying values of a Summary metric."
		   });
		addAnnotation
		  (summaryDataPointValueAtQuantileEClass,
		   source,
		   new String[] {
			   "documentation", "*\nRepresents the value at a given quantile of a distribution."
		   });
		addAnnotation
		  (getSummaryDataPointValueAtQuantile_Quantile(),
		   source,
		   new String[] {
			   "documentation", "*\nThe quantile of a distribution. Must be in the interval [0.0, 1.0]."
		   });
		addAnnotation
		  (getSummaryDataPointValueAtQuantile_Value(),
		   source,
		   new String[] {
			   "documentation", "*\nThe value at the given quantile of a distribution."
		   });
		addAnnotation
		  (exemplarEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA representation of an exemplar, which is a sample input measurement. Exemplars also hold information about the environment when the measurement was recorded, for example the span and trace ID of the active span when the exemplar was recorded."
		   });
		addAnnotation
		  (getExemplar_FilteredAttributes(),
		   source,
		   new String[] {
			   "documentation", "*\nThe set of key/value pairs that were filtered out by the aggregator, but recorded alongside the original measurement."
		   });
		addAnnotation
		  (getExemplar_SpanId(),
		   source,
		   new String[] {
			   "documentation", "*\n(Optional) Span ID of the exemplar trace. span_id may be missing if the measurement is not recorded inside a trace or if the trace is not sampled."
		   });
		addAnnotation
		  (getExemplar_TraceId(),
		   source,
		   new String[] {
			   "documentation", "*\n(Optional) Trace ID of the exemplar trace."
		   });
		addAnnotation
		  (aggregationTemporalityEEnum,
		   source,
		   new String[] {
			   "documentation", "*\nAggregationTemporality defines how a metric aggregator reports aggregated values. It describes how those values relate to the time interval over which they are aggregated."
		   });
		addAnnotation
		  (aggregationTemporalityEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "*\nUNSPECIFIED is the default AggregationTemporality, it MUST not be used."
		   });
		addAnnotation
		  (aggregationTemporalityEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "*\nDELTA is an AggregationTemporality for a metric aggregator which reports changes since last report time."
		   });
		addAnnotation
		  (aggregationTemporalityEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "*\nCUMULATIVE is an AggregationTemporality for a metric aggregator which reports changes since a fixed start time."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //MetricsPackageImpl
