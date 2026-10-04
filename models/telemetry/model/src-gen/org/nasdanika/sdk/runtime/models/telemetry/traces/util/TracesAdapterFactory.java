/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.traces.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.telemetry.traces.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesPackage
 * @generated
 */
public class TracesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TracesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TracesPackage.eINSTANCE;
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
	protected TracesSwitch<Adapter> modelSwitch =
		new TracesSwitch<Adapter>() {
			@Override
			public Adapter caseTracesData(TracesData object) {
				return createTracesDataAdapter();
			}
			@Override
			public Adapter caseResourceSpans(ResourceSpans object) {
				return createResourceSpansAdapter();
			}
			@Override
			public Adapter caseScopeSpans(ScopeSpans object) {
				return createScopeSpansAdapter();
			}
			@Override
			public Adapter caseSpan(Span object) {
				return createSpanAdapter();
			}
			@Override
			public Adapter caseSpanEvent(SpanEvent object) {
				return createSpanEventAdapter();
			}
			@Override
			public Adapter caseSpanLink(SpanLink object) {
				return createSpanLinkAdapter();
			}
			@Override
			public Adapter caseSpanStatus(SpanStatus object) {
				return createSpanStatusAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.TracesData
	 * @generated
	 */
	public Adapter createTracesDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans <em>Resource Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ResourceSpans
	 * @generated
	 */
	public Adapter createResourceSpansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans <em>Scope Spans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.ScopeSpans
	 * @generated
	 */
	public Adapter createScopeSpansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.Span
	 * @generated
	 */
	public Adapter createSpanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent <em>Span Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanEvent
	 * @generated
	 */
	public Adapter createSpanEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink <em>Span Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanLink
	 * @generated
	 */
	public Adapter createSpanLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus <em>Span Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.traces.SpanStatus
	 * @generated
	 */
	public Adapter createSpanStatusAdapter() {
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

} //TracesAdapterFactory
