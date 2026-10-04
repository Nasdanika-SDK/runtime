/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.ExponentialHistogramDataPointBuckets;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exponential Histogram Data Point Buckets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointBucketsImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.ExponentialHistogramDataPointBucketsImpl#getBucketCounts <em>Bucket Counts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialHistogramDataPointBucketsImpl extends MinimalEObjectImpl.Container implements ExponentialHistogramDataPointBuckets {
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentialHistogramDataPointBucketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return (Integer)eDynamicGet(MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		eDynamicSet(MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Long> getBucketCounts() {
		return (EList<Long>)eDynamicGet(MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS, MetricsPackage.Literals.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET:
				return getOffset();
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS:
				return getBucketCounts();
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
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET:
				setOffset((Integer)newValue);
				return;
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS:
				getBucketCounts().clear();
				getBucketCounts().addAll((Collection<? extends Long>)newValue);
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
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS:
				getBucketCounts().clear();
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
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__OFFSET:
				return getOffset() != OFFSET_EDEFAULT;
			case MetricsPackage.EXPONENTIAL_HISTOGRAM_DATA_POINT_BUCKETS__BUCKET_COUNTS:
				return !getBucketCounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExponentialHistogramDataPointBucketsImpl
