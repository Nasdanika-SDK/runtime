package org.nasdanika.sdk.runtime.common.capability;

import java.util.concurrent.Flow.Publisher;

import org.nasdanika.sdk.runtime.common.flow.Flows;

/**
 * Factory of a "service" capability. Service capability is a capability that is provided by a service of a given type.
 * @param <R> Service requirement type. Service requirement is passed to the factory.
 * @param <S> Service type. Service type is used to identify the service capability.
 */
public abstract class ServiceCapabilityFactory<R,S> implements CapabilityFactory<Object,S> {
		
	/**
	 * Service requirement.  
	 * Service requirement is passed to the factory.
	 * @param <T> Service type
	 */
	public record Requirement<R,S>(Class<S> serviceType, R serviceRequirement) {}
	
	public static <R,S> Requirement<R,S> createRequirement(Class<S> serviceType, R serviceRequirement) {
		return new Requirement<R, S>(serviceType, serviceRequirement);
	}
	
	@Override
	public boolean canHandle(Object requirement) {
		return requirement instanceof Class || requirement instanceof Requirement;
	}

	protected abstract boolean isFor(Class<?> type, Object serviceRequirement);
	
	@SuppressWarnings("unchecked")
	@Override
	public Publisher<CapabilityProvider<S>> create(Object requirement, Loader loader) {
		if (requirement instanceof Class) {
			requirement = new Requirement<R,S>((Class<S>) requirement, null);
		}
		
		if (requirement instanceof Requirement) {
			Requirement<R,S> theRequirement = (Requirement<R,S>) requirement;
			if (isFor(theRequirement.serviceType(), theRequirement.serviceRequirement())) {
				return createService(theRequirement.serviceType(), theRequirement.serviceRequirement(), loader);
			}
		} 
		
		return Flows.empty();
	}
		
	protected abstract Publisher<CapabilityProvider<S>> createService(
		Class<S> serviceType,	
		R serviceRequirement,
		Loader loader);	
	
}
