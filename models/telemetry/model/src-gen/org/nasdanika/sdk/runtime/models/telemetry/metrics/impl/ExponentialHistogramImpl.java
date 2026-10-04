/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.AggregationTemporality;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogram;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramImpl#getDataPoints <em>Data Points</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramImpl#getAggregationTemporality <em>Aggregation Temporality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialHistogramImpl extends MetricImpl implements ExponentialHistogram {
	/**
	 * The default value of the '{@link #getAggregationTemporality() <em>Aggregation Temporality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationTemporality()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationTemporality AGGREGATION_TEMPORALITY_EDEFAULT = AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialHistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExponentialHistogramDataPoint> getDataPoints() {
		return (EList<ExponentialHistogramDataPoint>)eDynamicGet(MetricsPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS, MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM__DATA_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTemporality getAggregationTemporality() {
		return (AggregationTemporality)eDynamicGet(MetricsPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationTemporality(AggregationTemporality newAggregationTemporality) {
		eDynamicSet(MetricsPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY, newAggregationTemporality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return ((InternalEList<?>)getDataPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return getDataPoints();
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				return getAggregationTemporality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends ExponentialHistogramDataPoint>)newValue);
				return;
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality((AggregationTemporality)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				getDataPoints().clear();
				return;
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality(AGGREGATION_TEMPORALITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__DATA_POINTS:
				return !getDataPoints().isEmpty();
			case MetricsPackage.EXPONENTIAL_HISTOGRAM__AGGREGATION_TEMPORALITY:
				return getAggregationTemporality() != AGGREGATION_TEMPORALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramImpl
