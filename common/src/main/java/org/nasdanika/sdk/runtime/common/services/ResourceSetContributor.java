package org.nasdanika.sdk.runtime.common.services;

import java.util.List;
import java.util.ServiceLoader;
import java.util.function.ToIntFunction;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.nasdanika.sdk.runtime.common.telemetry.Telemetry;
import org.nasdanika.sdk.runtime.common.telemetry.TelemetryURIHandler;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.logs.Logger;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.context.Scope;

/**
 * A service interface for contributing to a resource set.
 * For example, registering an {@link EPackage} or {@link Resource.Factory}.
 *
 * <h2>Telemetry</h2>
 *
 * Configuration runs in a {@code ResourceSetContributor.configure} span, with a log record
 * ({@link Telemetry#CONTRIBUTION_EVENT}) per contribution. The resource set's URI handlers, the
 * default one included, are wrapped in {@link TelemetryURIHandler}s, which use the
 * {@link OpenTelemetry} {@link Telemetry#of(org.eclipse.emf.common.notify.Notifier) of} the
 * resource set when a stream is opened. Resource factories contributed by the runtime instrument
 * their resources the same way.
 */
public interface ResourceSetContributor {

	void contribute(ResourceSet resourceSet);

	/**
	 * Registers EPackages and runs contributors from the class loader, with the current
	 * {@link OpenTelemetry}.
	 */
	static void configure(ResourceSet resourceSet, ClassLoader loader) {
		configure(resourceSet, loader, null);
	}

	/**
	 * Registers EPackages and runs contributors from the class loader.
	 *
	 * @param openTelemetry Attached to the resource set and current during configuration. Null to
	 * use the current one without attaching it
	 */
	static void configure(ResourceSet resourceSet, ClassLoader loader, OpenTelemetry openTelemetry) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet must not be null");
		}
		configure(resourceSet, openTelemetry, logger -> {
			int count = registerEPackages(resourceSet, ServiceLoader.load(EPackage.class, loader), logger);
			return count + contribute(resourceSet, ServiceLoader.load(ResourceSetContributor.class, loader), logger);
		});
	}

	/**
	 * Adds URI handlers and adapter factories, registers EPackages and runs contributors from the
	 * service loader, with the current {@link OpenTelemetry}.
	 */
	static void configure(ResourceSet resourceSet) {
		configure(resourceSet, (OpenTelemetry) null);
	}

	/**
	 * Adds URI handlers and adapter factories, registers EPackages and runs contributors from the
	 * service loader.
	 *
	 * @param openTelemetry Attached to the resource set and current during configuration. Null to
	 * use the current one without attaching it
	 */
	static void configure(ResourceSet resourceSet, OpenTelemetry openTelemetry) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet must not be null");
		}

		configure(resourceSet, openTelemetry, logger -> {
			int count = 0;
			URIConverter uriConverter = resourceSet.getURIConverter();
			ServiceLoader<URIHandler> uriHandlerLoader = ServiceLoader.load(URIHandler.class);
			for (URIHandler uriHandler : uriHandlerLoader) {
				uriConverter.getURIHandlers().add(0, uriHandler);
				logContribution(logger, "uri-handler", uriHandler.getClass().getName());
				++count;
			}

			List<AdapterFactory> adapterFactories = resourceSet.getAdapterFactories();
			ServiceLoader<AdapterFactory> adapterFactoryLoader = ServiceLoader.load(AdapterFactory.class);
			for (AdapterFactory adapterFactory : adapterFactoryLoader) {
				adapterFactories.add(adapterFactory);
				logContribution(logger, "adapter-factory", adapterFactory.getClass().getName());
				++count;
			}

			count += registerEPackages(resourceSet, ServiceLoader.load(EPackage.class), logger);
			return count + contribute(resourceSet, ServiceLoader.load(ResourceSetContributor.class), logger);
		});
	}

	// --- Implementation ---

	/**
	 * @param configuration Returns the number of contributions
	 */
	private static void configure(ResourceSet resourceSet, OpenTelemetry openTelemetry, ToIntFunction<Logger> configuration) {
		if (openTelemetry != null) {
			Telemetry.attach(resourceSet, openTelemetry);
		}
		try (Scope scope = openTelemetry == null ? Scope.noop() : Telemetry.makeCurrent(openTelemetry)) {
			OpenTelemetry otel = Telemetry.of(resourceSet);
			Telemetry.inSpan(Telemetry.tracer(otel), "ResourceSetContributor.configure", null, span -> {
				int count = configuration.applyAsInt(Telemetry.logger(otel));
				span.setAttribute(Telemetry.CONTRIBUTION_COUNT, (long) count);
				TelemetryURIHandler.wrapAll(resourceSet.getURIConverter(), () -> Telemetry.of(resourceSet));
				return null;
			});
		}
	}

	private static int registerEPackages(ResourceSet resourceSet, ServiceLoader<EPackage> ePackageLoader, Logger logger) {
		int count = 0;
		for (EPackage ePackage : ePackageLoader) {
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
			logContribution(logger, "epackage", ePackage.getNsURI());
			++count;
		}
		return count;
	}

	private static int contribute(ResourceSet resourceSet, ServiceLoader<ResourceSetContributor> contributorLoader, Logger logger) {
		int count = 0;
		for (ResourceSetContributor contributor : contributorLoader) {
			contributor.contribute(resourceSet);
			logContribution(logger, "contributor", contributor.getClass().getName());
			++count;
		}
		return count;
	}

	private static void logContribution(Logger logger, String kind, String contribution) {
		Telemetry.log(
				logger,
				Severity.DEBUG,
				Telemetry.CONTRIBUTION_EVENT,
				"Contributed " + kind + " " + contribution,
				Attributes.of(Telemetry.CONTRIBUTION_KIND, kind, Telemetry.CONTRIBUTION, contribution));
	}

}
