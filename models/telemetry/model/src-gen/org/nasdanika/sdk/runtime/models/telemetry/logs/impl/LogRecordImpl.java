/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.logs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.telemetry.AnyValue;
import org.nasdanika.sdk.runtime.models.telemetry.KeyValue;

import org.nasdanika.sdk.runtime.models.telemetry.logs.LogRecord;
import org.nasdanika.sdk.runtime.models.telemetry.logs.LogsPackage;
import org.nasdanika.sdk.runtime.models.telemetry.logs.SeverityNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getTimeUnixNano <em>Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getObservedTimeUnixNano <em>Observed Time Unix Nano</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getSeverityNumber <em>Severity Number</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getSeverityText <em>Severity Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getDroppedAttributesCount <em>Dropped Attributes Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getTraceId <em>Trace Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.logs.impl.LogRecordImpl#getSpanId <em>Span Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogRecordImpl extends MinimalEObjectImpl.Container implements LogRecord {
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
	 * The default value of the '{@link #getObservedTimeUnixNano() <em>Observed Time Unix Nano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedTimeUnixNano()
	 * @generated
	 * @ordered
	 */
	protected static final long OBSERVED_TIME_UNIX_NANO_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getSeverityNumber() <em>Severity Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityNumber()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityNumber SEVERITY_NUMBER_EDEFAULT = SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED;

	/**
	 * The default value of the '{@link #getSeverityText() <em>Severity Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityText()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDroppedAttributesCount() <em>Dropped Attributes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroppedAttributesCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPED_ATTRIBUTES_COUNT_EDEFAULT = 0;

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
	 * The default value of the '{@link #getTraceId() <em>Trace Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpanId() <em>Span Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanId()
	 * @generated
	 * @ordered
	 */
	protected static final String SPAN_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogsPackage.Literals.LOG_RECORD;
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
	public long getTimeUnixNano() {
		return (Long)eDynamicGet(LogsPackage.LOG_RECORD__TIME_UNIX_NANO, LogsPackage.Literals.LOG_RECORD__TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnixNano(long newTimeUnixNano) {
		eDynamicSet(LogsPackage.LOG_RECORD__TIME_UNIX_NANO, LogsPackage.Literals.LOG_RECORD__TIME_UNIX_NANO, newTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getObservedTimeUnixNano() {
		return (Long)eDynamicGet(LogsPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, LogsPackage.Literals.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservedTimeUnixNano(long newObservedTimeUnixNano) {
		eDynamicSet(LogsPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, LogsPackage.Literals.LOG_RECORD__OBSERVED_TIME_UNIX_NANO, newObservedTimeUnixNano);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityNumber getSeverityNumber() {
		return (SeverityNumber)eDynamicGet(LogsPackage.LOG_RECORD__SEVERITY_NUMBER, LogsPackage.Literals.LOG_RECORD__SEVERITY_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityNumber(SeverityNumber newSeverityNumber) {
		eDynamicSet(LogsPackage.LOG_RECORD__SEVERITY_NUMBER, LogsPackage.Literals.LOG_RECORD__SEVERITY_NUMBER, newSeverityNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverityText() {
		return (String)eDynamicGet(LogsPackage.LOG_RECORD__SEVERITY_TEXT, LogsPackage.Literals.LOG_RECORD__SEVERITY_TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityText(String newSeverityText) {
		eDynamicSet(LogsPackage.LOG_RECORD__SEVERITY_TEXT, LogsPackage.Literals.LOG_RECORD__SEVERITY_TEXT, newSeverityText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyValue getBody() {
		return (AnyValue)eDynamicGet(LogsPackage.LOG_RECORD__BODY, LogsPackage.Literals.LOG_RECORD__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(AnyValue newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, LogsPackage.LOG_RECORD__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(AnyValue newBody) {
		eDynamicSet(LogsPackage.LOG_RECORD__BODY, LogsPackage.Literals.LOG_RECORD__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<KeyValue> getAttributes() {
		return (EList<KeyValue>)eDynamicGet(LogsPackage.LOG_RECORD__ATTRIBUTES, LogsPackage.Literals.LOG_RECORD__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDroppedAttributesCount() {
		return (Integer)eDynamicGet(LogsPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, LogsPackage.Literals.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroppedAttributesCount(int newDroppedAttributesCount) {
		eDynamicSet(LogsPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, LogsPackage.Literals.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT, newDroppedAttributesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFlags() {
		return (Integer)eDynamicGet(LogsPackage.LOG_RECORD__FLAGS, LogsPackage.Literals.LOG_RECORD__FLAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(int newFlags) {
		eDynamicSet(LogsPackage.LOG_RECORD__FLAGS, LogsPackage.Literals.LOG_RECORD__FLAGS, newFlags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceId() {
		return (String)eDynamicGet(LogsPackage.LOG_RECORD__TRACE_ID, LogsPackage.Literals.LOG_RECORD__TRACE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceId(String newTraceId) {
		eDynamicSet(LogsPackage.LOG_RECORD__TRACE_ID, LogsPackage.Literals.LOG_RECORD__TRACE_ID, newTraceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpanId() {
		return (String)eDynamicGet(LogsPackage.LOG_RECORD__SPAN_ID, LogsPackage.Literals.LOG_RECORD__SPAN_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanId(String newSpanId) {
		eDynamicSet(LogsPackage.LOG_RECORD__SPAN_ID, LogsPackage.Literals.LOG_RECORD__SPAN_ID, newSpanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogsPackage.LOG_RECORD__BODY:
				return basicSetBody(null, msgs);
			case LogsPackage.LOG_RECORD__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case LogsPackage.LOG_RECORD__TIME_UNIX_NANO:
				return getTimeUnixNano();
			case LogsPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO:
				return getObservedTimeUnixNano();
			case LogsPackage.LOG_RECORD__SEVERITY_NUMBER:
				return getSeverityNumber();
			case LogsPackage.LOG_RECORD__SEVERITY_TEXT:
				return getSeverityText();
			case LogsPackage.LOG_RECORD__BODY:
				return getBody();
			case LogsPackage.LOG_RECORD__ATTRIBUTES:
				return getAttributes();
			case LogsPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount();
			case LogsPackage.LOG_RECORD__FLAGS:
				return getFlags();
			case LogsPackage.LOG_RECORD__TRACE_ID:
				return getTraceId();
			case LogsPackage.LOG_RECORD__SPAN_ID:
				return getSpanId();
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
			case LogsPackage.LOG_RECORD__TIME_UNIX_NANO:
				setTimeUnixNano((Long)newValue);
				return;
			case LogsPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO:
				setObservedTimeUnixNano((Long)newValue);
				return;
			case LogsPackage.LOG_RECORD__SEVERITY_NUMBER:
				setSeverityNumber((SeverityNumber)newValue);
				return;
			case LogsPackage.LOG_RECORD__SEVERITY_TEXT:
				setSeverityText((String)newValue);
				return;
			case LogsPackage.LOG_RECORD__BODY:
				setBody((AnyValue)newValue);
				return;
			case LogsPackage.LOG_RECORD__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends KeyValue>)newValue);
				return;
			case LogsPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount((Integer)newValue);
				return;
			case LogsPackage.LOG_RECORD__FLAGS:
				setFlags((Integer)newValue);
				return;
			case LogsPackage.LOG_RECORD__TRACE_ID:
				setTraceId((String)newValue);
				return;
			case LogsPackage.LOG_RECORD__SPAN_ID:
				setSpanId((String)newValue);
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
			case LogsPackage.LOG_RECORD__TIME_UNIX_NANO:
				setTimeUnixNano(TIME_UNIX_NANO_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO:
				setObservedTimeUnixNano(OBSERVED_TIME_UNIX_NANO_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__SEVERITY_NUMBER:
				setSeverityNumber(SEVERITY_NUMBER_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__SEVERITY_TEXT:
				setSeverityText(SEVERITY_TEXT_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__BODY:
				setBody((AnyValue)null);
				return;
			case LogsPackage.LOG_RECORD__ATTRIBUTES:
				getAttributes().clear();
				return;
			case LogsPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT:
				setDroppedAttributesCount(DROPPED_ATTRIBUTES_COUNT_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__TRACE_ID:
				setTraceId(TRACE_ID_EDEFAULT);
				return;
			case LogsPackage.LOG_RECORD__SPAN_ID:
				setSpanId(SPAN_ID_EDEFAULT);
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
			case LogsPackage.LOG_RECORD__TIME_UNIX_NANO:
				return getTimeUnixNano() != TIME_UNIX_NANO_EDEFAULT;
			case LogsPackage.LOG_RECORD__OBSERVED_TIME_UNIX_NANO:
				return getObservedTimeUnixNano() != OBSERVED_TIME_UNIX_NANO_EDEFAULT;
			case LogsPackage.LOG_RECORD__SEVERITY_NUMBER:
				return getSeverityNumber() != SEVERITY_NUMBER_EDEFAULT;
			case LogsPackage.LOG_RECORD__SEVERITY_TEXT:
				return SEVERITY_TEXT_EDEFAULT == null ? getSeverityText() != null : !SEVERITY_TEXT_EDEFAULT.equals(getSeverityText());
			case LogsPackage.LOG_RECORD__BODY:
				return getBody() != null;
			case LogsPackage.LOG_RECORD__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case LogsPackage.LOG_RECORD__DROPPED_ATTRIBUTES_COUNT:
				return getDroppedAttributesCount() != DROPPED_ATTRIBUTES_COUNT_EDEFAULT;
			case LogsPackage.LOG_RECORD__FLAGS:
				return getFlags() != FLAGS_EDEFAULT;
			case LogsPackage.LOG_RECORD__TRACE_ID:
				return TRACE_ID_EDEFAULT == null ? getTraceId() != null : !TRACE_ID_EDEFAULT.equals(getTraceId());
			case LogsPackage.LOG_RECORD__SPAN_ID:
				return SPAN_ID_EDEFAULT == null ? getSpanId() != null : !SPAN_ID_EDEFAULT.equals(getSpanId());
		}
		return super.eIsSet(featureID);
	}

} //LogRecordImpl
