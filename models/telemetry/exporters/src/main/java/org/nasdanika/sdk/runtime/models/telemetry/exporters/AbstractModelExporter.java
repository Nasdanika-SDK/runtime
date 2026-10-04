package org.nasdanika.sdk.runtime.models.telemetry.exporters;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;

/**
 * Exports telemetry items to the model, grouped as in OTLP: a data root holding a group per SDK
 * resource, holding a group per instrumentation scope, holding the items.
 *
 * <ul>
 * <li>To a consumer: each export is a new data root handed to the consumer.</li>
 * <li>To an EMF resource: all exports go to one data root in the resource - its existing root of
 * the data type if it has one, so exporting to a loaded resource appends. Groups are reused across
 * exports. The resource is saved on {@link #flush()} and {@link #shutdown()}. The save runs in the
 * root context, so the current OpenTelemetry instance does not trace it. Items exported back to
 * this exporter while it saves - telemetry of the save itself through an instance attached to the
 * resource set - are dropped.</li>
 * </ul>
 *
 * Exporters working on each other's data - a log record exporter adding log records to the spans
 * of a span exporter - share a lock.
 *
 * @param <T> SDK item type
 * @param <D> Data root type
 * @param <R> Resource group type
 * @param <S> Scope group type
 */
public abstract class AbstractModelExporter<T, D extends EObject, R extends EObject, S extends EObject> {

	private final Object lock;
	private final Consumer<? super D> consumer;
	private final Resource resource;
	private final Map<?, ?> saveOptions;
	private D data;
	private final Map<io.opentelemetry.sdk.resources.Resource, R> resourceGroups = new HashMap<>();
	private final Map<List<Object>, S> scopeGroups = new HashMap<>();
	private boolean saving;
	private boolean shutdown;

	/**
	 * @param lock Lock shared with other exporters, this exporter if null
	 */
	protected AbstractModelExporter(Object lock, Consumer<? super D> consumer) {
		this.lock = lock == null ? this : lock;
		this.consumer = Objects.requireNonNull(consumer, "consumer");
		this.resource = null;
		this.saveOptions = null;
	}

	/**
	 * @param lock Lock shared with other exporters, this exporter if null
	 * @param saveOptions Options for {@link Resource#save(Map)}, may be null
	 */
	protected AbstractModelExporter(Object lock, Resource resource, Map<?, ?> saveOptions) {
		this.lock = lock == null ? this : lock;
		this.consumer = null;
		this.resource = Objects.requireNonNull(resource, "resource");
		this.saveOptions = saveOptions;
	}

	protected abstract Class<D> getDataType();

	protected abstract D createData();

	/**
	 * Creates a group for the SDK resource and adds it to the data root.
	 */
	protected abstract R createResourceGroup(D data, io.opentelemetry.sdk.resources.Resource resource);

	/**
	 * Creates a group for the instrumentation scope and adds it to the resource group.
	 */
	protected abstract S createScopeGroup(R resourceGroup, InstrumentationScopeInfo scope);

	protected abstract io.opentelemetry.sdk.resources.Resource getResource(T item);

	protected abstract InstrumentationScopeInfo getScope(T item);

	/**
	 * Converts the item and adds it to the scope group.
	 */
	protected abstract void add(S scopeGroup, T item);

	protected final Object getLock() {
		return lock;
	}

	/**
	 * @return The resource exported to, null when exporting to a consumer
	 */
	protected final Resource getModelResource() {
		return resource;
	}

	protected final boolean isShutdown() {
		synchronized (lock) {
			return shutdown;
		}
	}

	protected CompletableResultCode doExport(Collection<? extends T> items) {
		synchronized (lock) {
			if (shutdown) {
				return CompletableResultCode.ofFailure();
			}
			if (saving) {
				return CompletableResultCode.ofSuccess();
			}
			try {
				write(items);
				return CompletableResultCode.ofSuccess();
			} catch (RuntimeException e) {
				return CompletableResultCode.ofExceptionalFailure(e);
			}
		}
	}

	/**
	 * Adds the items to the data root in the resource, or hands them to the consumer in a new one,
	 * regardless of the exporter state.
	 */
	protected final void write(Collection<? extends T> items) {
		synchronized (lock) {
			if (consumer == null) {
				group(getData(), items);
			} else {
				D batch = createData();
				try {
					group(batch, items);
				} finally {
					resourceGroups.clear();
					scopeGroups.clear();
				}
				consumer.accept(batch);
			}
		}
	}

	private void group(D target, Collection<? extends T> items) {
		for (T item : items) {
			io.opentelemetry.sdk.resources.Resource sdkResource = getResource(item);
			InstrumentationScopeInfo scope = getScope(item);
			S scopeGroup = scopeGroups.computeIfAbsent(
					List.of(sdkResource, scope),
					k -> createScopeGroup(resourceGroups.computeIfAbsent(sdkResource, r -> createResourceGroup(target, r)), scope));
			add(scopeGroup, item);
		}
	}

	/**
	 * The data root in the resource, created on first use.
	 */
	private D getData() {
		if (data == null) {
			for (EObject root : resource.getContents()) {
				if (getDataType().isInstance(root)) {
					data = getDataType().cast(root);
					return data;
				}
			}
			data = createData();
			resource.getContents().add(data);
		}
		return data;
	}

	/**
	 * Saves the resource, if exporting to one.
	 */
	public CompletableResultCode flush() {
		synchronized (lock) {
			return shutdown ? CompletableResultCode.ofSuccess() : save();
		}
	}

	/**
	 * Saves the resource, if exporting to one, and stops accepting exports.
	 */
	public CompletableResultCode shutdown() {
		synchronized (lock) {
			if (shutdown) {
				return CompletableResultCode.ofSuccess();
			}
			CompletableResultCode result = save();
			shutdown = true;
			return result;
		}
	}

	/**
	 * Saves the resource, if exporting to one, with the data root even if nothing was exported.
	 * Regardless of the exporter state.
	 */
	protected final CompletableResultCode save() {
		synchronized (lock) {
			if (resource == null) {
				return CompletableResultCode.ofSuccess();
			}
			saving = true;
			try (Scope scope = Context.root().makeCurrent()) {
				getData();
				resource.save(saveOptions);
				return CompletableResultCode.ofSuccess();
			} catch (IOException | RuntimeException e) {
				return CompletableResultCode.ofExceptionalFailure(e);
			} finally {
				saving = false;
			}
		}
	}

}
