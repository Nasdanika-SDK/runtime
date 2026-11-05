package org.nasdanika.sdk.runtime.models.meta.tests.book;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.Class;
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.Package;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;

/**
 * A projection of a vocabulary to a dynamic Ecore package, so that every EMF tool works on it. The
 * runtime's own projection to Ecore is planned; this shows the idea.
 */
public final class Projections {

	private Projections() {
	}

	// tag::ecore[]
	/**
	 * A sketch of the projection to Ecore: classes, attributes and references, enough for EMF to
	 * create, validate and serialize instances without generated code.
	 */
	public static EPackage ecore(Package vocabulary) {
		EcoreFactory ecore = EcoreFactory.eINSTANCE;
		EPackage ePackage = ecore.createEPackage();
		ePackage.setName(vocabulary.getName());
		ePackage.setNsURI(vocabulary.getNamespace());
		ePackage.setNsPrefix(vocabulary.getName());

		Map<Class, EClass> classes = new HashMap<>();
		for (Classifier classifier: vocabulary.getClassifiers()) {
			if (classifier instanceof Class type) {
				EClass eClass = ecore.createEClass();
				eClass.setName(type.getName());
				ePackage.getEClassifiers().add(eClass);
				classes.put(type, eClass);
			}
		}
		classes.forEach((type, eClass) -> {
			for (Feature feature: type.getFeatures()) {
				if (feature instanceof Attribute attribute
						&& attribute.getType() instanceof PrimitiveTypeReference primitive) {
					EAttribute eAttribute = ecore.createEAttribute();
					eAttribute.setName(attribute.getName());
					eAttribute.setEType(dataType(primitive.getKind()));
					eAttribute.setLowerBound(attribute.getLowerBound());
					eAttribute.setUpperBound(attribute.getUpperBound());
					eAttribute.setID(attribute.isIdentifying());
					eClass.getEStructuralFeatures().add(eAttribute);
				} else if (feature instanceof Reference reference
						&& reference.getType() instanceof ClassifierReference target) {
					EReference eReference = ecore.createEReference();
					eReference.setName(reference.getName());
					eReference.setEType(classes.get((Class) target.getTarget()));
					eReference.setContainment(reference.isContainment());
					eReference.setLowerBound(reference.getLowerBound());
					eReference.setUpperBound(reference.getUpperBound());
					eClass.getEStructuralFeatures().add(eReference);
				}
			}
		});
		new ResourceImpl(URI.createURI(ePackage.getNsURI())).getContents().add(ePackage);
		return ePackage;
	}

	private static EDataType dataType(PrimitiveKind kind) {
		return switch (kind) {
			case NUMBER -> EcorePackage.Literals.EDOUBLE;
			case BOOLEAN -> EcorePackage.Literals.EBOOLEAN;
			case DATE, DATE_TIME -> EcorePackage.Literals.EDATE;
			default -> EcorePackage.Literals.ESTRING;
		};
	}
	// end::ecore[]

}
