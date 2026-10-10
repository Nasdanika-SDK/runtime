/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.telemetry.traces.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage
 * @generated
 */
public class TracesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesSwitch() {
		if (modelPackage == null) {
			modelPackage = TracesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TracesPackage.TRACES_DATA: {
				TracesData tracesData = (TracesData)theEObject;
				T result = caseTracesData(tracesData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.RESOURCE_SPANS: {
				ResourceSpans resourceSpans = (ResourceSpans)theEObject;
				T result = caseResourceSpans(resourceSpans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SCOPE_SPANS: {
				ScopeSpans scopeSpans = (ScopeSpans)theEObject;
				T result = caseScopeSpans(scopeSpans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SPAN_ID: {
				SpanId spanId = (SpanId)theEObject;
				T result = caseSpanId(spanId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SPAN: {
				Span span = (Span)theEObject;
				T result = caseSpan(span);
				if (result == null) result = caseSpanId(span);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SPAN_EVENT: {
				SpanEvent spanEvent = (SpanEvent)theEObject;
				T result = caseSpanEvent(spanEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SPAN_REFERENCE: {
				SpanReference spanReference = (SpanReference)theEObject;
				T result = caseSpanReference(spanReference);
				if (result == null) result = caseSpanId(spanReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SPAN_LINK: {
				SpanLink spanLink = (SpanLink)theEObject;
				T result = caseSpanLink(spanLink);
				if (result == null) result = caseSpanReference(spanLink);
				if (result == null) result = caseSpanId(spanLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.SPAN_STATUS: {
				SpanStatus spanStatus = (SpanStatus)theEObject;
				T result = caseSpanStatus(spanStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.FEATURE_CHANGE: {
				FeatureChange featureChange = (FeatureChange)theEObject;
				T result = caseFeatureChange(featureChange);
				if (result == null) result = caseChange_FeatureChange(featureChange);
				if (result == null) result = caseSpanReference(featureChange);
				if (result == null) result = caseSpanId(featureChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TracesPackage.RESOURCE_CHANGE: {
				ResourceChange resourceChange = (ResourceChange)theEObject;
				T result = caseResourceChange(resourceChange);
				if (result == null) result = caseChange_ResourceChange(resourceChange);
				if (result == null) result = caseSpanReference(resourceChange);
				if (result == null) result = caseSpanId(resourceChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracesData(TracesData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Spans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Spans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSpans(ResourceSpans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope Spans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope Spans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeSpans(ScopeSpans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanId(SpanId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpan(Span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanEvent(SpanEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanReference(SpanReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanLink(SpanLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanStatus(SpanStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureChange(FeatureChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceChange(ResourceChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChange_FeatureChange(org.eclipse.emf.ecore.change.FeatureChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChange_ResourceChange(org.eclipse.emf.ecore.change.ResourceChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TracesSwitch
