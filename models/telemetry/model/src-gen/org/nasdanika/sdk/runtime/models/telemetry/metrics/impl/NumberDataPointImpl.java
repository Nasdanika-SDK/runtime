/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

import org.nasdanika.sdk.runtime.models.telemetry.metrics.Exemplar;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.MetricsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.metrics.NumberDataPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Data Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getStartTimeUnixNano <em>Start Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getAsDouble <em>As Double</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getAsInt <em>As Int</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getExemplars <em>Exemplars</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.metrics.impl.NumberDataPointImpl#getFlags <em>Flags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberDataPointImpl extends MinimalEObjectImpl.Container implements NumberDataPoint {
	/**
	 * The default value of the '{@link #getStartTimeUnixNano() <em>Start Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long START_TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getTimeUnixNano() <em>Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getAsDouble() <em>As Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double AS_DOUBLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAsInt() <em>As Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsInt()
	 * @generated
	 * @ordered
	 */
	protected static final Long AS_INT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final int FLAGS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberDataPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.NUMBER_DATA_POINT;
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
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__ATTRIBUTES, MetricsPackage.Literals.NUMBER_DATA_POINT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartTimeUnixNano() {
		return (Long)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, MetricsPackage.Literals.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimeUnixNano(long newStartTimeUnixNano) {
		eDynamicSet(MetricsPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, MetricsPackage.Literals.NUMBER_DATA_POINT__START_TIME_UNIX_NANO, newStartTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO, MetricsPackage.Literals.NUMBER_DATA_POINT__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(MetricsPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO, MetricsPackage.Literals.NUMBER_DATA_POINT__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAsDouble() {
		return (Double)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__AS_DOUBLE, MetricsPackage.Literals.NUMBER_DATA_POINT__AS_DOUBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsDouble(Double newAsDouble) {
		eDynamicSet(MetricsPackage.NUMBER_DATA_POINT__AS_DOUBLE, MetricsPackage.Literals.NUMBER_DATA_POINT__AS_DOUBLE, newAsDouble);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAsInt() {
		return (Long)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__AS_INT, MetricsPackage.Literals.NUMBER_DATA_POINT__AS_INT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsInt(Long newAsInt) {
		eDynamicSet(MetricsPackage.NUMBER_DATA_POINT__AS_INT, MetricsPackage.Literals.NUMBER_DATA_POINT__AS_INT, newAsInt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Exemplar> getExemplars() {
		return (EList<Exemplar>)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__EXEMPLARS, MetricsPackage.Literals.NUMBER_DATA_POINT__EXEMPLARS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFlags() {
		return (Integer)eDynamicGet(MetricsPackage.NUMBER_DATA_POINT__FLAGS, MetricsPackage.Literals.NUMBER_DATA_POINT__FLAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(int newFlags) {
		eDynamicSet(MetricsPackage.NUMBER_DATA_POINT__FLAGS, MetricsPackage.Literals.NUMBER_DATA_POINT__FLAGS, newFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case MetricsPackage.NUMBER_DATA_POINT__EXEMPLARS:
				return ((InternalEList<?>)getExemplars()).basicRemove(otherEnd, msgs);
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
			case MetricsPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				return getAttributes();
			case MetricsPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano();
			case MetricsPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case MetricsPackage.NUMBER_DATA_POINT__AS_DOUBLE:
				return getAsDouble();
			case MetricsPackage.NUMBER_DATA_POINT__AS_INT:
				return getAsInt();
			case MetricsPackage.NUMBER_DATA_POINT__EXEMPLARS:
				return getExemplars();
			case MetricsPackage.NUMBER_DATA_POINT__FLAGS:
				return getFlags();
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
			case MetricsPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano((Long)newValue);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__AS_DOUBLE:
				setAsDouble((Double)newValue);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__AS_INT:
				setAsInt((Long)newValue);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				getExemplars().addAll((Collection<? extends Exemplar>)newValue);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__FLAGS:
				setFlags((Integer)newValue);
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
			case MetricsPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case MetricsPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO:
				setStartTimeUnixNano(START_TIME_UNIX_NANO_EDEFAULT);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__AS_DOUBLE:
				setAsDouble(AS_DOUBLE_EDEFAULT);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__AS_INT:
				setAsInt(AS_INT_EDEFAULT);
				return;
			case MetricsPackage.NUMBER_DATA_POINT__EXEMPLARS:
				getExemplars().clear();
				return;
			case MetricsPackage.NUMBER_DATA_POINT__FLAGS:
				setFlags(FLAGS_EDEFAULT);
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
			case MetricsPackage.NUMBER_DATA_POINT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case MetricsPackage.NUMBER_DATA_POINT__START_TIME_UNIX_NANO:
				return getStartTimeUnixNano() != START_TIME_UNIX_NANO_EDEFAULT;
			case MetricsPackage.NUMBER_DATA_POINT__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case MetricsPackage.NUMBER_DATA_POINT__AS_DOUBLE:
				return AS_DOUBLE_EDEFAULT == null ? getAsDouble() != null : !AS_DOUBLE_EDEFAULT.equals(getAsDouble());
			case MetricsPackage.NUMBER_DATA_POINT__AS_INT:
				return AS_INT_EDEFAULT == null ? getAsInt() != null : !AS_INT_EDEFAULT.equals(getAsInt());
			case MetricsPackage.NUMBER_DATA_POINT__EXEMPLARS:
				return !getExemplars().isEmpty();
			case MetricsPackage.NUMBER_DATA_POINT__FLAGS:
				return getFlags() != FLAGS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //NumberDataPointImpl
