package org.nasdanika.sdk.runtime.models.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.nasdanika.sdk.runtime.models.core.ScriptEvaluator;
import org.nasdanika.sdk.runtime.models.core.SourceEvaluator;
import org.nasdanika.sdk.runtime.models.core.GroovyEvaluator;
import org.nasdanika.sdk.runtime.models.core.SpelEvaluator;
import org.nasdanika.sdk.runtime.models.core.XPathEvaluator;

public class EvaluatorSupport {
	
	public static String loadSource(SourceEvaluator sourceEvaluator) {
		String script = sourceEvaluator.getScript();
		String scriptRef = sourceEvaluator.getScriptRef();
		boolean hasScript = script != null && !script.isBlank();
		boolean hasScriptRef = scriptRef != null && !scriptRef.isBlank();
		if (hasScript == hasScriptRef) {
			throw new IllegalStateException(
				"Exactly one of script and scriptRef must be set: " + sourceEvaluator);
		}
		if (hasScript) {
			return script;
		}
		URI refURI = resolveScriptRef(sourceEvaluator);
		URIConverter uriConverter = sourceEvaluator.eResource() != null && sourceEvaluator.eResource().getResourceSet() != null
			? sourceEvaluator.eResource().getResourceSet().getURIConverter()
			: URIConverter.INSTANCE;
		try (InputStream in = uriConverter.createInputStream(refURI)) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new IllegalStateException("Cannot load script from " + refURI + ": " + e, e);
		}
	}
	
	public static URI resolveScriptRef(SourceEvaluator sourceEvaluator) {
		URI refURI = URI.createURI(sourceEvaluator.getScriptRef());
		Resource resource = sourceEvaluator.eResource();
		if (refURI.isRelative() && resource != null
				&& resource.getURI() != null && resource.getURI().isHierarchical()) {
			refURI = refURI.resolve(resource.getURI());
		}
		return refURI;
	}
	
	public static <T> T evaluateGroovy(GroovyEvaluator groovyEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		throw new UnsupportedOperationException("TODO - load a delegate through service loader");
	}	
	
	public static <T> T evaluateScript(ScriptEvaluator scriptEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		String script = scriptEvaluator.getScript();
		String scriptRef = scriptEvaluator.getScriptRef();
		boolean hasScript = script != null && !script.isBlank();
		boolean hasScriptRef = scriptRef != null && !scriptRef.isBlank();
		if (hasScript == hasScriptRef) { // both or neither
			throw new IllegalStateException(
				"Exactly one of script and scriptRef must be set: " + scriptEvaluator);
		}

		ScriptEngineManager engineManager = new ScriptEngineManager(scriptEvaluator.getClass().getClassLoader());
		ScriptEngine engine;
		String source;

		if (hasScript) {
			String language = scriptEvaluator.getLanguage();
			if (language == null || language.isBlank()) {
				throw new IllegalStateException("language is required for inline script: " + scriptEvaluator);
			}
			engine = engineManager.getEngineByName(language);
			if (engine == null) {
				throw new IllegalStateException("No script engine for language: " + language);
			}
			source = script;
		} else {
			URI refURI = URI.createURI(scriptRef);
			Resource resource = scriptEvaluator.eResource();
			if (refURI.isRelative() && resource != null
					&& resource.getURI() != null && resource.getURI().isHierarchical()) {
				refURI = refURI.resolve(resource.getURI());
			}

			String language = scriptEvaluator.getLanguage();
			if (language != null && !language.isBlank()) {
				engine = engineManager.getEngineByName(language);
				if (engine == null) {
					throw new IllegalStateException("No script engine for language: " + language);
				}
			} else {
				String extension = refURI.fileExtension();
				if (extension == null) {
					throw new IllegalStateException(
						"language is not set and scriptRef has no extension: " + refURI);
				}
				engine = engineManager.getEngineByExtension(extension);
				if (engine == null) {
					throw new IllegalStateException("No script engine for extension: " + extension);
				}
			}

			URIConverter uriConverter = resource != null && resource.getResourceSet() != null
				? resource.getResourceSet().getURIConverter()
				: URIConverter.INSTANCE;
			try (InputStream in = uriConverter.createInputStream(refURI)) {
				source = new String(in.readAllBytes(), StandardCharsets.UTF_8);
			} catch (IOException e) {
				throw new IllegalStateException("Cannot load script from " + refURI + ": " + e, e);
			}
		}

		Bindings engineBindings = engine.createBindings();
		if (bindings != null) {
			engineBindings.putAll(bindings);
		}
		engineBindings.put("self", scriptEvaluator);
		
		try {
			Object result = engine.eval(source, engineBindings);
			if (resultType == null || result == null) {
				@SuppressWarnings("unchecked")
				T ret = (T) result;
				return ret;
			}
			return resultType.cast(result);
		} catch (ScriptException e) {
			throw new IllegalStateException("Script evaluation failed: " + e, e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T evaluateSpel(SpelEvaluator spelEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		throw new UnsupportedOperationException("TODO - load a delegate through service loader");
	}	
	
	@SuppressWarnings("unchecked")
	public static <T> T evaluateXPath(XPathEvaluator xPathEvaluator, Class<T> resultType, Map<String, Object> bindings) {
		throw new UnsupportedOperationException("TODO - load a delegate through service loader");
	}	
	
}
