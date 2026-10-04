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
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.Sum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl#getDataPoints <em>Data Points</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl#getAggregationTemporality <em>Aggregation Temporality</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.SumImpl#isIsMonotonic <em>Is Monotonic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SumImpl extends MetricImpl implements Sum {
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
	 * The default value of the '{@link #isIsMonotonic() <em>Is Monotonic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMonotonic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MONOTONIC_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.SUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NumberDataPoint> getDataPoints() {
		return (EList<NumberDataPoint>)eDynamicGet(MetricsPackage.SUM__DATA_POINTS, MetricsPackage.Literals.SUM__DATA_POINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTemporality getAggregationTemporality() {
		return (AggregationTemporality)eDynamicGet(MetricsPackage.SUM__AGGREGATION_TEMPORALITY, MetricsPackage.Literals.SUM__AGGREGATION_TEMPORALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationTemporality(AggregationTemporality newAggregationTemporality) {
		eDynamicSet(MetricsPackage.SUM__AGGREGATION_TEMPORALITY, MetricsPackage.Literals.SUM__AGGREGATION_TEMPORALITY, newAggregationTemporality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMonotonic() {
		return (Boolean)eDynamicGet(MetricsPackage.SUM__IS_MONOTONIC, MetricsPackage.Literals.SUM__IS_MONOTONIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMonotonic(boolean newIsMonotonic) {
		eDynamicSet(MetricsPackage.SUM__IS_MONOTONIC, MetricsPackage.Literals.SUM__IS_MONOTONIC, newIsMonotonic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.SUM__DATA_POINTS:
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
			case MetricsPackage.SUM__DATA_POINTS:
				return getDataPoints();
			case MetricsPackage.SUM__AGGREGATION_TEMPORALITY:
				return getAggregationTemporality();
			case MetricsPackage.SUM__IS_MONOTONIC:
				return isIsMonotonic();
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
			case MetricsPackage.SUM__DATA_POINTS:
				getDataPoints().clear();
				getDataPoints().addAll((Collection<? extends NumberDataPoint>)newValue);
				return;
			case MetricsPackage.SUM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality((AggregationTemporality)newValue);
				return;
			case MetricsPackage.SUM__IS_MONOTONIC:
				setIsMonotonic((Boolean)newValue);
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
			case MetricsPackage.SUM__DATA_POINTS:
				getDataPoints().clear();
				return;
			case MetricsPackage.SUM__AGGREGATION_TEMPORALITY:
				setAggregationTemporality(AGGREGATION_TEMPORALITY_EDEFAULT);
				return;
			case MetricsPackage.SUM__IS_MONOTONIC:
				setIsMonotonic(IS_MONOTONIC_EDEFAULT);
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
			case MetricsPackage.SUM__DATA_POINTS:
				return !getDataPoints().isEmpty();
			case MetricsPackage.SUM__AGGREGATION_TEMPORALITY:
				return getAggregationTemporality() != AGGREGATION_TEMPORALITY_EDEFAULT;
			case MetricsPackage.SUM__IS_MONOTONIC:
				return isIsMonotonic() != IS_MONOTONIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SumImpl
