/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.nasdanika.sdk.runtime.models.telemetry.model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.telemetry'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/telemetry/metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.telemetry.metrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsDataImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getMetricsData()
	 * @generated
	 */
	int METRICS_DATA = 0;

	/**
	 * The feature id for the '<em><b>Resource Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_DATA__RESOURCE_METRICS = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRICS_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl <em>Resource Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getResourceMetrics()
	 * @generated
	 */
	int RESOURCE_METRICS = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_METRICS__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Scope Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_METRICS__SCOPE_METRICS = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_METRICS__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Resource Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_METRICS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_METRICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl <em>Scope Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getScopeMetrics()
	 * @generated
	 */
	int SCOPE_METRICS = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_METRICS__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_METRICS__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_METRICS__SCHEMA_URL = 2;

	/**
	 * The number of structural features of the '<em>Scope Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_METRICS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scope Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_METRICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.GaugeImpl <em>Gauge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.GaugeImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getGauge()
	 * @generated
	 */
	int GAUGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__METADATA = METRIC__METADATA;

	/**
	 * The feature id for the '<em><b>Data Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE__DATA_POINTS = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gauge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gauge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUGE_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSum()
	 * @generated
	 */
	int SUM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__METADATA = METRIC__METADATA;

	/**
	 * The feature id for the '<em><b>Data Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__DATA_POINTS = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__AGGREGATION_TEMPORALITY = METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Monotonic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__IS_MONOTONIC = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = METRIC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramImpl <em>Histogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getHistogram()
	 * @generated
	 */
	int HISTOGRAM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__METADATA = METRIC__METADATA;

	/**
	 * The feature id for the '<em><b>Data Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__DATA_POINTS = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__AGGREGATION_TEMPORALITY = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramImpl <em>Exponential Histogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExponentialHistogram()
	 * @generated
	 */
	int EXPONENTIAL_HISTOGRAM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM__METADATA = METRIC__METADATA;

	/**
	 * The feature id for the '<em><b>Data Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM__DATA_POINTS = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregation Temporality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exponential Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exponential Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryImpl <em>Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSummary()
	 * @generated
	 */
	int SUMMARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__METADATA = METRIC__METADATA;

	/**
	 * The feature id for the '<em><b>Data Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__DATA_POINTS = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl <em>Number Data Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getNumberDataPoint()
	 * @generated
	 */
	int NUMBER_DATA_POINT = 9;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__START_TIME_UNIX_NANO = 1;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__TIME_UNIX_NANO = 2;

	/**
	 * The feature id for the '<em><b>As Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__AS_DOUBLE = 3;

	/**
	 * The feature id for the '<em><b>As Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__AS_INT = 4;

	/**
	 * The feature id for the '<em><b>Exemplars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__EXEMPLARS = 5;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT__FLAGS = 6;

	/**
	 * The number of structural features of the '<em>Number Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Number Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_DATA_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramDataPointImpl <em>Histogram Data Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramDataPointImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getHistogramDataPoint()
	 * @generated
	 */
	int HISTOGRAM_DATA_POINT = 10;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = 1;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__COUNT = 3;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__SUM = 4;

	/**
	 * The feature id for the '<em><b>Bucket Counts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__BUCKET_COUNTS = 5;

	/**
	 * The feature id for the '<em><b>Explicit Bounds</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS = 6;

	/**
	 * The feature id for the '<em><b>Exemplars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__EXEMPLARS = 7;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__FLAGS = 8;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__MIN = 9;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT__MAX = 10;

	/**
	 * The number of structural features of the '<em>Histogram Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Histogram Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_DATA_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointImpl <em>Exponential Histogram Data Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExponentialHistogramDataPoint()
	 * @generated
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = 1;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT = 3;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM = 4;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE = 5;

	/**
	 * The feature id for the '<em><b>Zero Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Positive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE = 7;

	/**
	 * The feature id for the '<em><b>Negative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE = 8;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS = 9;

	/**
	 * The feature id for the '<em><b>Exemplars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS = 10;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN = 11;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX = 12;

	/**
	 * The feature id for the '<em><b>Zero Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD = 13;

	/**
	 * The number of structural features of the '<em>Exponential Histogram Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Exponential Histogram Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointBucketsImpl <em>Exponential Histogram Data Point Buckets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointBucketsImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExponentialHistogramDataPointBuckets()
	 * @generated
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS = 12;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Bucket Counts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS = 1;

	/**
	 * The number of structural features of the '<em>Exponential Histogram Data Point Buckets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exponential Histogram Data Point Buckets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointImpl <em>Summary Data Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSummaryDataPoint()
	 * @generated
	 */
	int SUMMARY_DATA_POINT = 13;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Start Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__START_TIME_UNIX_NANO = 1;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__TIME_UNIX_NANO = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__COUNT = 3;

	/**
	 * The feature id for the '<em><b>Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__SUM = 4;

	/**
	 * The feature id for the '<em><b>Quantile Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__QUANTILE_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT__FLAGS = 6;

	/**
	 * The number of structural features of the '<em>Summary Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Summary Data Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointValueAtQuantileImpl <em>Summary Data Point Value At Quantile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointValueAtQuantileImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSummaryDataPointValueAtQuantile()
	 * @generated
	 */
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE = 14;

	/**
	 * The feature id for the '<em><b>Quantile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Summary Data Point Value At Quantile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Summary Data Point Value At Quantile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_DATA_POINT_VALUE_AT_QUANTILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 15;

	/**
	 * The feature id for the '<em><b>Filtered Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__FILTERED_ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Time Unix Nano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__TIME_UNIX_NANO = 1;

	/**
	 * The feature id for the '<em><b>As Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__AS_DOUBLE = 2;

	/**
	 * The feature id for the '<em><b>As Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__AS_INT = 3;

	/**
	 * The feature id for the '<em><b>Span Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__SPAN_ID = 4;

	/**
	 * The feature id for the '<em><b>Trace Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__TRACE_ID = 5;

	/**
	 * The feature id for the '<em><b>Span</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__SPAN = 6;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality <em>Aggregation Temporality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getAggregationTemporality()
	 * @generated
	 */
	int AGGREGATION_TEMPORALITY = 16;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData
	 * @generated
	 */
	EClass getMetricsData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData#getResourceMetrics <em>Resource Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Metrics</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData#getResourceMetrics()
	 * @see #getMetricsData()
	 * @generated
	 */
	EReference getMetricsData_ResourceMetrics();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics <em>Resource Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Metrics</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics
	 * @generated
	 */
	EClass getResourceMetrics();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getResource()
	 * @see #getResourceMetrics()
	 * @generated
	 */
	EReference getResourceMetrics_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getScopeMetrics <em>Scope Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scope Metrics</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getScopeMetrics()
	 * @see #getResourceMetrics()
	 * @generated
	 */
	EReference getResourceMetrics_ScopeMetrics();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics#getSchemaUrl()
	 * @see #getResourceMetrics()
	 * @generated
	 */
	EAttribute getResourceMetrics_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics <em>Scope Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Metrics</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics
	 * @generated
	 */
	EClass getScopeMetrics();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics#getScope()
	 * @see #getScopeMetrics()
	 * @generated
	 */
	EReference getScopeMetrics_Scope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics#getMetrics()
	 * @see #getScopeMetrics()
	 * @generated
	 */
	EReference getScopeMetrics_Metrics();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics#getSchemaUrl()
	 * @see #getScopeMetrics()
	 * @generated
	 */
	EAttribute getScopeMetrics_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getUnit()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric#getMetadata()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Metadata();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge <em>Gauge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gauge</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge
	 * @generated
	 */
	EClass getGauge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge#getDataPoints <em>Data Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge#getDataPoints()
	 * @see #getGauge()
	 * @generated
	 */
	EReference getGauge_DataPoints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getDataPoints <em>Data Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getDataPoints()
	 * @see #getSum()
	 * @generated
	 */
	EReference getSum_DataPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getAggregationTemporality <em>Aggregation Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Temporality</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#getAggregationTemporality()
	 * @see #getSum()
	 * @generated
	 */
	EAttribute getSum_AggregationTemporality();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#isIsMonotonic <em>Is Monotonic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Monotonic</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum#isIsMonotonic()
	 * @see #getSum()
	 * @generated
	 */
	EAttribute getSum_IsMonotonic();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram
	 * @generated
	 */
	EClass getHistogram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram#getDataPoints <em>Data Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram#getDataPoints()
	 * @see #getHistogram()
	 * @generated
	 */
	EReference getHistogram_DataPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram#getAggregationTemporality <em>Aggregation Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Temporality</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram#getAggregationTemporality()
	 * @see #getHistogram()
	 * @generated
	 */
	EAttribute getHistogram_AggregationTemporality();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram <em>Exponential Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Histogram</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram
	 * @generated
	 */
	EClass getExponentialHistogram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getDataPoints <em>Data Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getDataPoints()
	 * @see #getExponentialHistogram()
	 * @generated
	 */
	EReference getExponentialHistogram_DataPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getAggregationTemporality <em>Aggregation Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Temporality</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram#getAggregationTemporality()
	 * @see #getExponentialHistogram()
	 * @generated
	 */
	EAttribute getExponentialHistogram_AggregationTemporality();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary
	 * @generated
	 */
	EClass getSummary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary#getDataPoints <em>Data Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Points</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary#getDataPoints()
	 * @see #getSummary()
	 * @generated
	 */
	EReference getSummary_DataPoints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint <em>Number Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Data Point</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint
	 * @generated
	 */
	EClass getNumberDataPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getAttributes()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EReference getNumberDataPoint_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getStartTimeUnixNano()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EAttribute getNumberDataPoint_StartTimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getTimeUnixNano()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EAttribute getNumberDataPoint_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getAsDouble <em>As Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Double</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getAsDouble()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EAttribute getNumberDataPoint_AsDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getAsInt <em>As Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Int</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getAsInt()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EAttribute getNumberDataPoint_AsInt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getExemplars <em>Exemplars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exemplars</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getExemplars()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EReference getNumberDataPoint_Exemplars();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint#getFlags()
	 * @see #getNumberDataPoint()
	 * @generated
	 */
	EAttribute getNumberDataPoint_Flags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint <em>Histogram Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram Data Point</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint
	 * @generated
	 */
	EClass getHistogramDataPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getAttributes()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EReference getHistogramDataPoint_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getStartTimeUnixNano()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_StartTimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getTimeUnixNano()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getCount()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getSum()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_Sum();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getBucketCounts <em>Bucket Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bucket Counts</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getBucketCounts()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_BucketCounts();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getExplicitBounds <em>Explicit Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Explicit Bounds</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getExplicitBounds()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_ExplicitBounds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getExemplars <em>Exemplars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exemplars</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getExemplars()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EReference getHistogramDataPoint_Exemplars();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getFlags()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_Flags();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getMin()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint#getMax()
	 * @see #getHistogramDataPoint()
	 * @generated
	 */
	EAttribute getHistogramDataPoint_Max();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint <em>Exponential Histogram Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Histogram Data Point</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint
	 * @generated
	 */
	EClass getExponentialHistogramDataPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getAttributes()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EReference getExponentialHistogramDataPoint_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getStartTimeUnixNano()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_StartTimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getTimeUnixNano()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getCount()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getSum()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_Sum();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getScale()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroCount <em>Zero Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroCount()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_ZeroCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getPositive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Positive</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getPositive()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EReference getExponentialHistogramDataPoint_Positive();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getNegative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negative</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getNegative()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EReference getExponentialHistogramDataPoint_Negative();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getFlags()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_Flags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getExemplars <em>Exemplars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exemplars</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getExemplars()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EReference getExponentialHistogramDataPoint_Exemplars();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMin()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getMax()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroThreshold <em>Zero Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zero Threshold</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint#getZeroThreshold()
	 * @see #getExponentialHistogramDataPoint()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPoint_ZeroThreshold();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets <em>Exponential Histogram Data Point Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Histogram Data Point Buckets</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets
	 * @generated
	 */
	EClass getExponentialHistogramDataPointBuckets();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets#getOffset()
	 * @see #getExponentialHistogramDataPointBuckets()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPointBuckets_Offset();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets#getBucketCounts <em>Bucket Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bucket Counts</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets#getBucketCounts()
	 * @see #getExponentialHistogramDataPointBuckets()
	 * @generated
	 */
	EAttribute getExponentialHistogramDataPointBuckets_BucketCounts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint <em>Summary Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary Data Point</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint
	 * @generated
	 */
	EClass getSummaryDataPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getAttributes()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EReference getSummaryDataPoint_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getStartTimeUnixNano <em>Start Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getStartTimeUnixNano()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EAttribute getSummaryDataPoint_StartTimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getTimeUnixNano()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EAttribute getSummaryDataPoint_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getCount()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EAttribute getSummaryDataPoint_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getSum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sum</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getSum()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EAttribute getSummaryDataPoint_Sum();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getQuantileValues <em>Quantile Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantile Values</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getQuantileValues()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EReference getSummaryDataPoint_QuantileValues();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint#getFlags()
	 * @see #getSummaryDataPoint()
	 * @generated
	 */
	EAttribute getSummaryDataPoint_Flags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile <em>Summary Data Point Value At Quantile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary Data Point Value At Quantile</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile
	 * @generated
	 */
	EClass getSummaryDataPointValueAtQuantile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile#getQuantile <em>Quantile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantile</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile#getQuantile()
	 * @see #getSummaryDataPointValueAtQuantile()
	 * @generated
	 */
	EAttribute getSummaryDataPointValueAtQuantile_Quantile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile#getValue()
	 * @see #getSummaryDataPointValueAtQuantile()
	 * @generated
	 */
	EAttribute getSummaryDataPointValueAtQuantile_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getFilteredAttributes <em>Filtered Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filtered Attributes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getFilteredAttributes()
	 * @see #getExemplar()
	 * @generated
	 */
	EReference getExemplar_FilteredAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTimeUnixNano <em>Time Unix Nano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unix Nano</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTimeUnixNano()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_TimeUnixNano();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsDouble <em>As Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Double</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsDouble()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_AsDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsInt <em>As Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>As Int</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getAsInt()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_AsInt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpanId <em>Span Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpanId()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_SpanId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTraceId <em>Trace Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getTraceId()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_TraceId();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Span</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar#getSpan()
	 * @see #getExemplar()
	 * @generated
	 */
	EReference getExemplar_Span();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality <em>Aggregation Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Temporality</em>'.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
	 * @generated
	 */
	EEnum getAggregationTemporality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsDataImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getMetricsData()
		 * @generated
		 */
		EClass METRICS_DATA = eINSTANCE.getMetricsData();

		/**
		 * The meta object literal for the '<em><b>Resource Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRICS_DATA__RESOURCE_METRICS = eINSTANCE.getMetricsData_ResourceMetrics();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl <em>Resource Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ResourceMetricsImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getResourceMetrics()
		 * @generated
		 */
		EClass RESOURCE_METRICS = eINSTANCE.getResourceMetrics();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_METRICS__RESOURCE = eINSTANCE.getResourceMetrics_Resource();

		/**
		 * The meta object literal for the '<em><b>Scope Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_METRICS__SCOPE_METRICS = eINSTANCE.getResourceMetrics_ScopeMetrics();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_METRICS__SCHEMA_URL = eINSTANCE.getResourceMetrics_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl <em>Scope Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ScopeMetricsImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getScopeMetrics()
		 * @generated
		 */
		EClass SCOPE_METRICS = eINSTANCE.getScopeMetrics();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_METRICS__SCOPE = eINSTANCE.getScopeMetrics_Scope();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_METRICS__METRICS = eINSTANCE.getScopeMetrics_Metrics();

		/**
		 * The meta object literal for the '<em><b>Schema Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_METRICS__SCHEMA_URL = eINSTANCE.getScopeMetrics_SchemaUrl();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__UNIT = eINSTANCE.getMetric_Unit();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__METADATA = eINSTANCE.getMetric_Metadata();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.GaugeImpl <em>Gauge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.GaugeImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getGauge()
		 * @generated
		 */
		EClass GAUGE = eINSTANCE.getGauge();

		/**
		 * The meta object literal for the '<em><b>Data Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAUGE__DATA_POINTS = eINSTANCE.getGauge_DataPoints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSum()
		 * @generated
		 */
		EClass SUM = eINSTANCE.getSum();

		/**
		 * The meta object literal for the '<em><b>Data Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUM__DATA_POINTS = eINSTANCE.getSum_DataPoints();

		/**
		 * The meta object literal for the '<em><b>Aggregation Temporality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUM__AGGREGATION_TEMPORALITY = eINSTANCE.getSum_AggregationTemporality();

		/**
		 * The meta object literal for the '<em><b>Is Monotonic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUM__IS_MONOTONIC = eINSTANCE.getSum_IsMonotonic();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramImpl <em>Histogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getHistogram()
		 * @generated
		 */
		EClass HISTOGRAM = eINSTANCE.getHistogram();

		/**
		 * The meta object literal for the '<em><b>Data Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM__DATA_POINTS = eINSTANCE.getHistogram_DataPoints();

		/**
		 * The meta object literal for the '<em><b>Aggregation Temporality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM__AGGREGATION_TEMPORALITY = eINSTANCE.getHistogram_AggregationTemporality();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramImpl <em>Exponential Histogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExponentialHistogram()
		 * @generated
		 */
		EClass EXPONENTIAL_HISTOGRAM = eINSTANCE.getExponentialHistogram();

		/**
		 * The meta object literal for the '<em><b>Data Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_HISTOGRAM__DATA_POINTS = eINSTANCE.getExponentialHistogram_DataPoints();

		/**
		 * The meta object literal for the '<em><b>Aggregation Temporality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY = eINSTANCE.getExponentialHistogram_AggregationTemporality();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryImpl <em>Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSummary()
		 * @generated
		 */
		EClass SUMMARY = eINSTANCE.getSummary();

		/**
		 * The meta object literal for the '<em><b>Data Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMARY__DATA_POINTS = eINSTANCE.getSummary_DataPoints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl <em>Number Data Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getNumberDataPoint()
		 * @generated
		 */
		EClass NUMBER_DATA_POINT = eINSTANCE.getNumberDataPoint();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_DATA_POINT__ATTRIBUTES = eINSTANCE.getNumberDataPoint_Attributes();

		/**
		 * The meta object literal for the '<em><b>Start Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DATA_POINT__START_TIME_UNIX_NANO = eINSTANCE.getNumberDataPoint_StartTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DATA_POINT__TIME_UNIX_NANO = eINSTANCE.getNumberDataPoint_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>As Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DATA_POINT__AS_DOUBLE = eINSTANCE.getNumberDataPoint_AsDouble();

		/**
		 * The meta object literal for the '<em><b>As Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DATA_POINT__AS_INT = eINSTANCE.getNumberDataPoint_AsInt();

		/**
		 * The meta object literal for the '<em><b>Exemplars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_DATA_POINT__EXEMPLARS = eINSTANCE.getNumberDataPoint_Exemplars();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_DATA_POINT__FLAGS = eINSTANCE.getNumberDataPoint_Flags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramDataPointImpl <em>Histogram Data Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.HistogramDataPointImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getHistogramDataPoint()
		 * @generated
		 */
		EClass HISTOGRAM_DATA_POINT = eINSTANCE.getHistogramDataPoint();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM_DATA_POINT__ATTRIBUTES = eINSTANCE.getHistogramDataPoint_Attributes();

		/**
		 * The meta object literal for the '<em><b>Start Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = eINSTANCE.getHistogramDataPoint_StartTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = eINSTANCE.getHistogramDataPoint_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__COUNT = eINSTANCE.getHistogramDataPoint_Count();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__SUM = eINSTANCE.getHistogramDataPoint_Sum();

		/**
		 * The meta object literal for the '<em><b>Bucket Counts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__BUCKET_COUNTS = eINSTANCE.getHistogramDataPoint_BucketCounts();

		/**
		 * The meta object literal for the '<em><b>Explicit Bounds</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__EXPLICIT_BOUNDS = eINSTANCE.getHistogramDataPoint_ExplicitBounds();

		/**
		 * The meta object literal for the '<em><b>Exemplars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM_DATA_POINT__EXEMPLARS = eINSTANCE.getHistogramDataPoint_Exemplars();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__FLAGS = eINSTANCE.getHistogramDataPoint_Flags();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__MIN = eINSTANCE.getHistogramDataPoint_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_DATA_POINT__MAX = eINSTANCE.getHistogramDataPoint_Max();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointImpl <em>Exponential Histogram Data Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExponentialHistogramDataPoint()
		 * @generated
		 */
		EClass EXPONENTIAL_HISTOGRAM_DATA_POINT = eINSTANCE.getExponentialHistogramDataPoint();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__ATTRIBUTES = eINSTANCE.getExponentialHistogramDataPoint_Attributes();

		/**
		 * The meta object literal for the '<em><b>Start Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__START_TIME_UNIX_NANO = eINSTANCE.getExponentialHistogramDataPoint_StartTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__TIME_UNIX_NANO = eINSTANCE.getExponentialHistogramDataPoint_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__COUNT = eINSTANCE.getExponentialHistogramDataPoint_Count();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__SUM = eINSTANCE.getExponentialHistogramDataPoint_Sum();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__SCALE = eINSTANCE.getExponentialHistogramDataPoint_Scale();

		/**
		 * The meta object literal for the '<em><b>Zero Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_COUNT = eINSTANCE.getExponentialHistogramDataPoint_ZeroCount();

		/**
		 * The meta object literal for the '<em><b>Positive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__POSITIVE = eINSTANCE.getExponentialHistogramDataPoint_Positive();

		/**
		 * The meta object literal for the '<em><b>Negative</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__NEGATIVE = eINSTANCE.getExponentialHistogramDataPoint_Negative();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__FLAGS = eINSTANCE.getExponentialHistogramDataPoint_Flags();

		/**
		 * The meta object literal for the '<em><b>Exemplars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_HISTOGRAM_DATA_POINT__EXEMPLARS = eINSTANCE.getExponentialHistogramDataPoint_Exemplars();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__MIN = eINSTANCE.getExponentialHistogramDataPoint_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__MAX = eINSTANCE.getExponentialHistogramDataPoint_Max();

		/**
		 * The meta object literal for the '<em><b>Zero Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT__ZERO_THRESHOLD = eINSTANCE.getExponentialHistogramDataPoint_ZeroThreshold();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointBucketsImpl <em>Exponential Histogram Data Point Buckets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointBucketsImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExponentialHistogramDataPointBuckets()
		 * @generated
		 */
		EClass EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS = eINSTANCE.getExponentialHistogramDataPointBuckets();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET = eINSTANCE.getExponentialHistogramDataPointBuckets_Offset();

		/**
		 * The meta object literal for the '<em><b>Bucket Counts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS = eINSTANCE.getExponentialHistogramDataPointBuckets_BucketCounts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointImpl <em>Summary Data Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSummaryDataPoint()
		 * @generated
		 */
		EClass SUMMARY_DATA_POINT = eINSTANCE.getSummaryDataPoint();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMARY_DATA_POINT__ATTRIBUTES = eINSTANCE.getSummaryDataPoint_Attributes();

		/**
		 * The meta object literal for the '<em><b>Start Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT__START_TIME_UNIX_NANO = eINSTANCE.getSummaryDataPoint_StartTimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT__TIME_UNIX_NANO = eINSTANCE.getSummaryDataPoint_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT__COUNT = eINSTANCE.getSummaryDataPoint_Count();

		/**
		 * The meta object literal for the '<em><b>Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT__SUM = eINSTANCE.getSummaryDataPoint_Sum();

		/**
		 * The meta object literal for the '<em><b>Quantile Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMARY_DATA_POINT__QUANTILE_VALUES = eINSTANCE.getSummaryDataPoint_QuantileValues();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT__FLAGS = eINSTANCE.getSummaryDataPoint_Flags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointValueAtQuantileImpl <em>Summary Data Point Value At Quantile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SummaryDataPointValueAtQuantileImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getSummaryDataPointValueAtQuantile()
		 * @generated
		 */
		EClass SUMMARY_DATA_POINT_VALUE_AT_QUANTILE = eINSTANCE.getSummaryDataPointValueAtQuantile();

		/**
		 * The meta object literal for the '<em><b>Quantile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__QUANTILE = eINSTANCE.getSummaryDataPointValueAtQuantile_Quantile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY_DATA_POINT_VALUE_AT_QUANTILE__VALUE = eINSTANCE.getSummaryDataPointValueAtQuantile_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExemplarImpl
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Filtered Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEMPLAR__FILTERED_ATTRIBUTES = eINSTANCE.getExemplar_FilteredAttributes();

		/**
		 * The meta object literal for the '<em><b>Time Unix Nano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__TIME_UNIX_NANO = eINSTANCE.getExemplar_TimeUnixNano();

		/**
		 * The meta object literal for the '<em><b>As Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__AS_DOUBLE = eINSTANCE.getExemplar_AsDouble();

		/**
		 * The meta object literal for the '<em><b>As Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__AS_INT = eINSTANCE.getExemplar_AsInt();

		/**
		 * The meta object literal for the '<em><b>Span Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__SPAN_ID = eINSTANCE.getExemplar_SpanId();

		/**
		 * The meta object literal for the '<em><b>Trace Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__TRACE_ID = eINSTANCE.getExemplar_TraceId();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEMPLAR__SPAN = eINSTANCE.getExemplar_Span();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality <em>Aggregation Temporality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality
		 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.MetricsPackageImpl#getAggregationTemporality()
		 * @generated
		 */
		EEnum AGGREGATION_TEMPORALITY = eINSTANCE.getAggregationTemporality();

	}

} //MetricsPackage
