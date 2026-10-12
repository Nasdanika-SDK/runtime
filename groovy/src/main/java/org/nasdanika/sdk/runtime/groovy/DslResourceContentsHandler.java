package org.nasdanika.sdk.runtime.groovy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.groovy.dsl.DslContext;
import org.nasdanika.sdk.runtime.groovy.dsl.DslContext.Resolver;
import org.nasdanika.sdk.runtime.groovy.dsl.DslException;
import org.nasdanika.sdk.runtime.groovy.dsl.DslTelemetry;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Tracer;

/**
 * Transform handler over a {@code .groovy} source. It obtains a {@link CompiledScript} from the
 * upstream source handler, builds a {@link DslContext} for a metamodel and installs its entry points
 * into the script bindings, evaluates the script, resolves deferred references, then normalizes the
 * result to {@code EObject[]}.
 *
 * <p>Evaluation runs in an {@code Evaluating script} span with the resource URI, under which the DSL
 * records a span per loaded element and per feature - see {@link DslTelemetry}. Saving runs in a
 * {@code Saving script} span.</p>
 */
public class DslResourceContentsHandler implements ResourceContentsHandler<EObject[]> {

	/**
	 * Service interface to delegate marking.
	 */
	public interface Marker {

		void mark(EObject eObject, EStructuralFeature feature, int line, int col);

	}

	/**
	 * Service interface to delegate creation of an element for a reference from an authored value.	 
	 */
	public interface Factory extends Comparable<Factory> {

		boolean canCreate(EReference eReference, Object value);
		
		/**
		 * Higher priority wins when multiple factories can create for the same reference/value pair. The default is 0.
		 * @return
		 */
		default int getPriority() {
			return 0;
		}

		@Override
		default int compareTo(Factory o) {
			return Integer.compare(o.getPriority(), getPriority());
		}

		EObject create(EReference eReference, Object value);
		
	}

	private ResourceContentsHandler<CompiledScript> sourceHandler;

	private Resource resource;

	private Resolver resolver;

	/**
	 * The {@link DslContext} from the most recent {@link #load(InputStream, Map)}. Retained so that
	 * {@link #save(EObject[], OutputStream, Map)} can delegate to an {@code onSave} callback the script
	 * registered during load. This is safe because a single handler instance serves both load and save
	 * for the lifetime of a resource (see {@code ContentsHandlingResource}).
	 */
	private DslContext dslContext;

	/**
	 * The original script source text captured during {@link #load(InputStream, Map)}. Handed to the
	 * {@code onSave} callback so a self-writing script can write it back verbatim or emit a modified
	 * version.
	 */
	private String source;

	public DslResourceContentsHandler(
			Resource resource, 
			ResourceContentsHandler<CompiledScript> sourceHandler,
			Resolver resolver) {
		this.resource = resource;
		this.sourceHandler = sourceHandler;
		this.resolver = resolver;
	}

	public DslResourceContentsHandler(
			Resource resource, 
			ResourceContentsHandler<CompiledScript> sourceHandler,
			EPackage... ePackages) {
		this.resource = resource;
		this.sourceHandler = sourceHandler;
		this.resolver = new EPackageResolver(ePackages) {
			
			@Override
			protected ResourceSet getResourceSet() {
				return resource.getResourceSet();
			}

			@Override
			public Map<String, Object> bindings() {
				return DslResourceContentsHandler.this.bindings();
			}

			@Override
			public void mark(EObject eObject, EStructuralFeature feature, int line, int col) {
				DslResourceContentsHandler.this.mark(eObject, feature, line, col);
			}

			@Override
			public EObject create(EReference eReference, Object value) {
				EObject created = DslResourceContentsHandler.this.create(eReference, value);
				// Declining falls back to the default: the reference type itself when it is concrete.
				return created == null ? super.create(eReference, value) : created;
			}

		};
	}

	protected void mark(EObject eObject, EStructuralFeature feature, int line, int col) {
		// Implement the actual marking logic here
	}

	/**
	 * Creates an element for a reference from an authored value - the short DSL form, e.g.
	 * {@code evaluator 'a.b.c'} yielding a default-typed evaluator with its expression set. Returning
	 * {@code null} - the default - declines, leaving the reference with its regular semantics:
	 * selectors for values, and the reference type itself for the {@code evaluator { ... }} form when
	 * that type is concrete. See {@link Resolver#create(EReference, Object)} for the contract.
	 */
	protected EObject create(EReference eReference, Object value) {
		return null;
	}

    protected Map<String, Object> bindings() {
        return Collections.emptyMap();
    }

	@Override
	public EObject[] load(InputStream inputStream, Map<?, ?> options) throws IOException {
		// Buffer the source so it can be handed to an onSave callback later (the source handler consumes
		// the stream to compile and does not retain the text).
		byte[] sourceBytes = inputStream.readAllBytes();
		this.source = new String(sourceBytes, StandardCharsets.UTF_8);
		CompiledScript compiledScript = sourceHandler.load(new ByteArrayInputStream(sourceBytes), options);

		return Telemetry.inSpan(tracer(), "Evaluating script", attributes(), span -> {
			dslContext = new DslContext(resolver, resource);
			Bindings bindings = compiledScript.getEngine().createBindings();
			dslContext.installInto(bindings);

			Object result;
			try {
				result = compiledScript.eval(bindings);
				dslContext.resolveDeferred();
			} catch (ScriptException | RuntimeException e) {
				// Tag the failure with its source location (URI/line) before reporting it.
				DslException located = dslContext.located(e);
				if (located.getLine() > 0) {
					span.setAttribute(DslTelemetry.LINE, (long) located.getLine());
				}
				throw new IOException(located.getMessage(), located);
			}

			EObject[] contents = normalize(result, dslContext);
			span.setAttribute(Telemetry.RESOURCE_CONTENTS, (long) contents.length);
			return contents;
		});
	}

	private Tracer tracer() {
		return Telemetry.tracer(Telemetry.of(resource));
	}

	private Attributes attributes() {
		return Attributes.of(Telemetry.RESOURCE_URI, String.valueOf(resource.getURI()));
	}
	
	/**
	 * Normalizes the script result into resource contents. A returned {@code EObject}, array or
	 * iterable of {@code EObject}s is flattened; if the script returned nothing usable, the elements
	 * built through the DSL entry points (e.g. {@code product { }}) are used instead.
	 */
	private EObject[] normalize(Object result, DslContext dsl) {
		List<EObject> contents = new ArrayList<>();
		collect(result, contents);
		if (contents.isEmpty()) {
			contents.addAll(dsl.getRoots());
		}
		return contents.toArray(EObject[]::new);
	}

	private void collect(Object value, List<EObject> contents) {
		if (value instanceof EObject eObject) {
			contents.add(eObject);
		} else if (value instanceof Object[] array) {
			for (Object element : array) {
				collect(element, contents);
			}
		} else if (value instanceof Iterable<?> iterable) {
			for (Object element : iterable) {
				collect(element, contents);
			}
		}
	}

	/**
	 * Delegates to the {@code onSave} callback registered by the script during {@link #load(InputStream, Map)},
	 * handing it the original script source so a self-writing script can write it back verbatim or emit a
	 * modified version. If the script registered no callback - the read-only case - throws
	 * {@link UnsupportedOperationException}, matching the default {@link ResourceContentsHandler#save}
	 * behaviour. The {@code contents} argument is ignored: the DSL script, not the in-memory model, is the
	 * source of truth for what gets written.
	 */
	@Override
	public void save(EObject[] contents, OutputStream outputStream, Map<?, ?> options) throws IOException {
		if (dslContext == null || !dslContext.isSaveSupported()) {
			throw new UnsupportedOperationException("Save operation is not supported");
		}
		Telemetry.inSpan(tracer(), "Saving script", attributes(), span -> {
			try {
				dslContext.save(source, outputStream, options);
			} catch (RuntimeException e) {
				DslException located = dslContext.located(e);
				throw new IOException(located.getMessage(), located);
			}
			return null;
		});
	}

	@Override
	public Order getOrder() {
		return sourceHandler.getOrder().add(0);
	}

}
