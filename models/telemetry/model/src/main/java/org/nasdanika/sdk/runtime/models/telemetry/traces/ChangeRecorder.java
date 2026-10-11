package org.nasdanika.sdk.runtime.models.telemetry.traces;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ResourceChange;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import io.opentelemetry.api.trace.SpanContext;

public class ChangeRecorder extends org.eclipse.emf.ecore.change.util.ChangeRecorder {

	public ChangeRecorder() {
		super();
	}

	public ChangeRecorder(Collection<?> rootObjects) {
		super(rootObjects);
	}

	public ChangeRecorder(EObject rootObject) {
		super(rootObject);
	}

	public ChangeRecorder(Resource resource) {
		super(resource);
	}

	public ChangeRecorder(ResourceSet resourceSet) {
		super(resourceSet);
	}

	@Override
	protected FeatureChange createFeatureChange(
			EObject eObjectParam, 
			EStructuralFeature eStructuralFeatureParam, 
			Object valueParam,
			boolean isSetParam) {
		
		return new org.nasdanika.sdk.runtime.models.telemetry.traces.impl.FeatureChangeImpl () {
			
				
			{
			    this.feature = eStructuralFeatureParam;
			    setValue(valueParam);
			    this.set = isSetParam;
			    
			    setTraceAndSpanId(this);				
			}
						
		};
	}

	@Override
	protected ResourceChange createResourceChange(Resource resourceParam, EList<Object> valueParam) {
		
		return new org.nasdanika.sdk.runtime.models.telemetry.traces.impl.ResourceChangeImpl () {
			
			
			{
			    setResource(resourceParam);
			    setValue(valueParam);
				
			    
			    setTraceAndSpanId(this);			
			}
		};
		
		
	}	
	
	@Override
	protected ChangeDescription createChangeDescription() {
		org.nasdanika.sdk.runtime.models.telemetry.traces.ChangeDescription cd = TracesFactory.eINSTANCE.createChangeDescription();
		setTraceAndSpanId(cd);
		return cd;
	}
	
	protected void setTraceAndSpanId(SpanId spanId) {
		io.opentelemetry.api.trace.Span span = io.opentelemetry.api.trace.Span.current();
		if (span != null) {
			SpanContext spanContext = span.getSpanContext();
			if (spanContext != null) {
				spanId.setTraceId(spanContext.getTraceId());
				spanId.setSpanId(spanContext.getSpanId());
			}
		}
	}
	
}
