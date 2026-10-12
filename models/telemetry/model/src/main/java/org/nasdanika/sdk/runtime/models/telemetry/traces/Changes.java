package org.nasdanika.sdk.runtime.models.telemetry.traces;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.ContextKey;
import io.opentelemetry.context.Scope;

/**
 * Records model changes made in a body and hands them to the current sink, e.g. a span exporter
 * which adds them to the span they were recorded in. The sink travels in the OpenTelemetry
 * {@link Context}, so the code making the changes does not depend on where they go.
 *
 * <p>
 * The {@link ChangeDescription} handed to the sink describes the changes forward - applying it
 * to the model as it was before the body makes the same changes - and is detached from the
 * model:
 * <ul>
 * <li>Objects added in the body are copied to {@link ChangeDescription#getObjectsToAttach()}.</li>
 * <li>Objects removed in the body - and not added back - are moved to
 * {@link ChangeDescription#getRemovedObjects()}, so their state when removed is kept for audit.
 * The changes reference them there.</li>
 * <li>Other objects are referenced by proxies with {@link EcoreUtil#getURI(EObject) their URIs},
 * so the description can be contained in a resource of a different resource set and saved
 * there. The proxies resolve if the model resources are saved at their URIs.</li>
 * </ul>
 *
 * The description, its feature changes and resource changes {@link SpanReference reference the
 * spans} current when they were created: the description the span current at the start of the
 * recording, a feature change the span in which the feature of the object was first changed.
 */
public final class Changes {

	/**
	 * Scheme of marker proxy URIs of removed objects while reversing.
	 */
	private static final String REMOVED_SCHEME = "nasdanika-removed";

	private static final ContextKey<Consumer<? super ChangeDescription>> SINK = ContextKey.named("nasdanika-change-sink");

	private Changes() {
	}

	/**
	 * The body of a recording.
	 */
	@FunctionalInterface
	public interface Body<T, E extends Throwable> {

		T call() throws E;

	}

	/**
	 * @return The context with the sink of recorded changes
	 */
	public static Context with(Context context, Consumer<? super ChangeDescription> sink) {
		return context.with(SINK, sink);
	}

	/**
	 * Makes the sink of recorded changes current.
	 */
	public static Scope makeCurrent(Consumer<? super ChangeDescription> sink) {
		return with(Context.current(), sink).makeCurrent();
	}

	/**
	 * @return The current sink of recorded changes, null if there is none
	 */
	public static Consumer<? super ChangeDescription> sink() {
		return Context.current().get(SINK);
	}

	/**
	 * Records the changes the body makes to the target - a resource set, resource or object - and
	 * hands them to the current sink, also if the body fails. Nothing is recorded without a current
	 * sink or outside a sampled span: the changes would not be correlated with a span.
	 */
	public static <T, E extends Throwable> T record(Notifier target, Body<T, E> body) throws E {
		Consumer<? super ChangeDescription> sink = sink();
		if (sink == null || !io.opentelemetry.api.trace.Span.current().getSpanContext().isSampled()) {
			return body.call();
		}
		ChangeRecorder recorder = new ChangeRecorder(List.of(target));
		try {
			return body.call();
		} finally {
			ChangeDescription changeDescription = (ChangeDescription) recorder.endRecording();
			recorder.dispose();
			forward(changeDescription);
			sink.accept(changeDescription);
		}
	}

	/**
	 * Turns the recorded description, which undoes the changes, into one describing them forward,
	 * detached from the model.
	 */
	private static void forward(ChangeDescription changeDescription) {
		// Contained by the recorded description to attach on undo, referenced by the forward one.
		// They get marker proxy URIs, and the proxies are pointed back to them once they are moved
		// to the removed objects.
		List<EObject> removed = new ArrayList<>(changeDescription.getObjectsToAttach());
		Map<EObject, URI> removedURIs = new IdentityHashMap<>();
		for (EObject eObject : removed) {
			mark(eObject, removedURIs);
			eObject.eAllContents().forEachRemaining(e -> mark(e, removedURIs));
		}

		changeDescription.copyAndReverse(proxyURIs(changeDescription.getObjectsToDetach(), removedURIs));
		// Changes of container references are not reversed - nor applied - and keep the old value:
		// the containment change describes them. Reversing leaves entries without changes for the
		// added objects.
		for (Map.Entry<EObject, EList<org.eclipse.emf.ecore.change.FeatureChange>> entry : changeDescription.getObjectChanges()) {
			entry.getValue().removeIf(featureChange ->
				featureChange.getFeature() instanceof EReference eReference && eReference.isContainer()
				|| featureChange.getFeature() != null && !featureChange.getFeature().isChangeable());
		}
		changeDescription.getObjectChanges().removeIf(entry -> entry.getValue().isEmpty());

		changeDescription.getRemovedObjects().addAll(removed); // Orphaned by reversing
		Map<URI, EObject> removedObjects = new HashMap<>();
		removedURIs.forEach((eObject, uri) -> removedObjects.put(uri, eObject));
		resolve(changeDescription, removedObjects);
		changeDescription.eAllContents().forEachRemaining(e -> resolve(e, removedObjects));
	}

	private static void mark(EObject eObject, Map<EObject, URI> removedURIs) {
		removedURIs.put(eObject, URI.createURI(REMOVED_SCHEME + ":/" + removedURIs.size()));
	}

	/**
	 * Replaces proxies with marker URIs of removed objects in the cross references of the object
	 * with the removed objects.
	 */
	private static void resolve(EObject eObject, Map<URI, EObject> removedObjects) {
		for (EReference eReference : eObject.eClass().getEAllReferences()) {
			if (eReference.isContainment() || eReference.isContainer() || eReference.isDerived() || !eReference.isChangeable()) {
				continue;
			}
			if (eReference.isMany()) {
				@SuppressWarnings("unchecked")
				InternalEList<EObject> values = (InternalEList<EObject>) eObject.eGet(eReference, false);
				for (int i = 0; i < values.size(); ++i) {
					EObject removedObject = removedObjects.get(proxyURI(values.basicGet(i)));
					if (removedObject != null) {
						values.set(i, removedObject);
					}
				}
			} else {
				EObject removedObject = removedObjects.get(proxyURI((EObject) eObject.eGet(eReference, false)));
				if (removedObject != null) {
					eObject.eSet(eReference, removedObject);
				}
			}
		}
	}

	private static URI proxyURI(EObject eObject) {
		return eObject != null && eObject.eIsProxy() ? ((InternalEObject) eObject).eProxyURI() : null;
	}

	/**
	 * Proxy URIs for {@link ChangeDescription#copyAndReverse(Map)}: the marker URIs of the removed
	 * objects, the URIs of all other objects except the added ones, which are copied. Computed on
	 * demand, as only {@link Map#get(Object)} is used.
	 */
	private static Map<EObject, URI> proxyURIs(Collection<EObject> added, Map<EObject, URI> removedURIs) {
		return new AbstractMap<>() {

			@Override
			public URI get(Object key) {
				URI removedURI = removedURIs.get(key);
				if (removedURI != null) {
					return removedURI;
				}
				return key instanceof EObject eObject && !EcoreUtil.isAncestor(added, eObject) ? EcoreUtil.getURI(eObject) : null;
			}

			@Override
			public Set<Entry<EObject, URI>> entrySet() {
				return Set.of();
			}

		};
	}

}
