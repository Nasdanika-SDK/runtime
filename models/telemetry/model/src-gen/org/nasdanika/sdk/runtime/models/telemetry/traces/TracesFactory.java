/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage
 * @generated
 */
public interface TracesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracesFactory eINSTANCE = org.nasdanika.sdk.runtime.models.telemetry.traces.impl.TracesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	TracesData createTracesData();

	/**
	 * Returns a new object of class '<em>Resource Spans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Spans</em>'.
	 * @generated
	 */
	ResourceSpans createResourceSpans();

	/**
	 * Returns a new object of class '<em>Scope Spans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Spans</em>'.
	 * @generated
	 */
	ScopeSpans createScopeSpans();

	/**
	 * Returns a new object of class '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span</em>'.
	 * @generated
	 */
	Span createSpan();

	/**
	 * Returns a new object of class '<em>Span Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Event</em>'.
	 * @generated
	 */
	SpanEvent createSpanEvent();

	/**
	 * Returns a new object of class '<em>Span Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Link</em>'.
	 * @generated
	 */
	SpanLink createSpanLink();

	/**
	 * Returns a new object of class '<em>Span Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Status</em>'.
	 * @generated
	 */
	SpanStatus createSpanStatus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracesPackage getTracesPackage();

} //TracesFactory
