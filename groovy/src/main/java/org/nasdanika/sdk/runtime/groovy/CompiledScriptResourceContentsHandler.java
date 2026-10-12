package org.nasdanika.sdk.runtime.groovy;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.sdk.runtime.common.capability.emf.ResourceContentsHandler;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.groovy.dsl.DslTelemetry;

import io.opentelemetry.api.common.Attributes;

/**
 * Source handler for the {@code .groovy} qualifier: compiles the script text to a {@link CompiledScript}
 * without evaluating it, in a {@code Compiling script} span with the resource URI. A syntax error fails
 * the load, and its line is set on the span.
 */
public class CompiledScriptResourceContentsHandler implements ResourceContentsHandler<CompiledScript> {

	private Resource resource;

	public CompiledScriptResourceContentsHandler(Resource resource) {
		this.resource = resource;
	}

	@Override
	public Order getOrder() {
		return Order.of(0);
	}

	@Override
	public CompiledScript load(InputStream inputStream, Map<?, ?> options) throws IOException {
		Attributes attributes = Attributes.of(Telemetry.RESOURCE_URI, String.valueOf(resource.getURI()));
		return Telemetry.inSpan(Telemetry.tracer(Telemetry.of(resource)), "Compiling script", attributes, span -> {
			String source = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

			ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("groovy");
			if (!(engine instanceof Compilable)) {
				throw new IOException("Groovy JSR-223 engine is not Compilable on the module path");
			}
			try {
				// compiled, NOT evaluated; syntax errors surface here, at load time
				return ((Compilable) engine).compile(source);
			} catch (ScriptException e) {
				if (e.getLineNumber() > 0) {
					span.setAttribute(DslTelemetry.LINE, (long) e.getLineNumber());
				}
				throw new IOException("Failed to compile " + resource.getURI(), e);
			}
		});
	}

}
