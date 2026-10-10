/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpanReference()
 * @model
 * @generated
 */
public interface SpanReference extends SpanId {
	/**
	 * Returns the value of the '<em><b>Span</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getReferrers <em>Referrers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' reference.
	 * @see #setSpan(Span)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage#getSpanReference_Span()
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span#getReferrers
	 * @model opposite="referrers"
	 * @generated
	 */
	Span getSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanReference#getSpan <em>Span</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' reference.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(Span value);

} // SpanReference
