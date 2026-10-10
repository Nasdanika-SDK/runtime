package org.nasdanika.sdk.runtime.models.telemetry.traces;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.ecore.change.ResourceChange;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

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
			EObject eObject, 
			EStructuralFeature eStructuralFeature, 
			Object value,
			boolean isSet) {
		
//		return new FeatureChangeImpl () {
//			
//				
//			{
//			    this.feature = feature;
//			    setValue(value);
//			    this.set = isSet;
//				
//			}
//			
//			
//		};
		
		
		// TODO Auto-generated method stub
		return super.createFeatureChange(eObject, eStructuralFeature, value, isSet);
	}

	@Override
	protected ResourceChange createResourceChange(Resource resource, EList<Object> value) {
		// TODO Auto-generated method stub
		return super.createResourceChange(resource, value);
	}

	
	
	
}
