/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage
 * @generated
 */
public class MetricsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricsSwitch<Adapter> modelSwitch =
		new MetricsSwitch<Adapter>() {
			@Override
			public Adapter caseMetricsData(MetricsData object) {
				return createMetricsDataAdapter();
			}
			@Override
			public Adapter caseResourceMetrics(ResourceMetrics object) {
				return createResourceMetricsAdapter();
			}
			@Override
			public Adapter caseScopeMetrics(ScopeMetrics object) {
				return createScopeMetricsAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseGauge(Gauge object) {
				return createGaugeAdapter();
			}
			@Override
			public Adapter caseSum(Sum object) {
				return createSumAdapter();
			}
			@Override
			public Adapter caseHistogram(Histogram object) {
				return createHistogramAdapter();
			}
			@Override
			public Adapter caseExponentialHistogram(ExponentialHistogram object) {
				return createExponentialHistogramAdapter();
			}
			@Override
			public Adapter caseSummary(Summary object) {
				return createSummaryAdapter();
			}
			@Override
			public Adapter caseNumberDataPoint(NumberDataPoint object) {
				return createNumberDataPointAdapter();
			}
			@Override
			public Adapter caseHistogramDataPoint(HistogramDataPoint object) {
				return createHistogramDataPointAdapter();
			}
			@Override
			public Adapter caseExponentialHistogramDataPoint(ExponentialHistogramDataPoint object) {
				return createExponentialHistogramDataPointAdapter();
			}
			@Override
			public Adapter caseExponentialHistogramDataPointBuckets(ExponentialHistogramDataPointBuckets object) {
				return createExponentialHistogramDataPointBucketsAdapter();
			}
			@Override
			public Adapter caseSummaryDataPoint(SummaryDataPoint object) {
				return createSummaryDataPointAdapter();
			}
			@Override
			public Adapter caseSummaryDataPointValueAtQuantile(SummaryDataPointValueAtQuantile object) {
				return createSummaryDataPointValueAtQuantileAdapter();
			}
			@Override
			public Adapter caseExemplar(Exemplar object) {
				return createExemplarAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsData
	 * @generated
	 */
	public Adapter createMetricsDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics <em>Resource Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ResourceMetrics
	 * @generated
	 */
	public Adapter createResourceMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics <em>Scope Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ScopeMetrics
	 * @generated
	 */
	public Adapter createScopeMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge <em>Gauge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Gauge
	 * @generated
	 */
	public Adapter createGaugeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum
	 * @generated
	 */
	public Adapter createSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Histogram
	 * @generated
	 */
	public Adapter createHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram <em>Exponential Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram
	 * @generated
	 */
	public Adapter createExponentialHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Summary
	 * @generated
	 */
	public Adapter createSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint <em>Number Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint
	 * @generated
	 */
	public Adapter createNumberDataPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint <em>Histogram Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.HistogramDataPoint
	 * @generated
	 */
	public Adapter createHistogramDataPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint <em>Exponential Histogram Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint
	 * @generated
	 */
	public Adapter createExponentialHistogramDataPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets <em>Exponential Histogram Data Point Buckets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets
	 * @generated
	 */
	public Adapter createExponentialHistogramDataPointBucketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint <em>Summary Data Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPoint
	 * @generated
	 */
	public Adapter createSummaryDataPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile <em>Summary Data Point Value At Quantile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.SummaryDataPointValueAtQuantile
	 * @generated
	 */
	public Adapter createSummaryDataPointValueAtQuantileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar
	 * @generated
	 */
	public Adapter createExemplarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetricsAdapterFactory
