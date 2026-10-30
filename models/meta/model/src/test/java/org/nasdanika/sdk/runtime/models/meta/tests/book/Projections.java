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
import org.nasdanika.sdk.runtime.models.meta.Enum;
import org.nasdanika.sdk.runtime.models.meta.EnumLiteral;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.Package;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;

/**
 * Two projections of one vocabulary: a glossary for people, and a dynamic Ecore package so that
 * every EMF tool works on it. The runtime's own projections are planned; these show the idea.
 */
public final class Projections {

	private Projections() {
	}

	// tag::glossary[]
	/**
	 * A glossary that cannot drift from the types, because both come from one source.
	 */
	public static String glossary(Package vocabulary) {
		StringBuilder md = new StringBuilder("# ").append(vocabulary.getName()).append("\n\n")
				.append(vocabulary.getDocumentation()).append("\n");
		for (Classifier classifier: vocabulary.getClassifiers()) {
			md.append("\n## ").append(classifier.getName()).append("\n\n")
				.append(classifier.getDocumentation()).append("\n");
			if (classifier instanceof Class type) {
				md.append("\n| Term | Type | Meaning |\n|---|---|---|\n");
				for (Feature feature: type.getFeatures()) {
					boolean identifies = feature instanceof Attribute attribute
							&& attribute.isIdentifying();
					md.append("| ").append(feature.getName())
						.append(identifies ? " (identifies)" : "")
						.append(" | ").append(typeName(feature))
						.append(feature.getUpperBound() == -1 ? ", many" : "")
						.append(" | ").append(feature.getDocumentation()).append(" |\n");
				}
			} else if (classifier instanceof Enum enumeration) {
				md.append("\nOne of: ");
				md.append(String.join(", ", enumeration.getLiterals().stream()
						.map(EnumLiteral::getName)
						.toList()));
				md.append(".\n");
			}
		}
		return md.toString();
	}
	// end::glossary[]

	private static String typeName(Feature feature) {
		return switch (feature.getType()) {
			case PrimitiveTypeReference primitive -> primitive.getKind() == PrimitiveKind.DATE_TIME
					? "dateTime"
					: primitive.getKind().getLiteral().toLowerCase();
			case ClassifierReference classifier -> classifier.getTarget() == null
					? classifier.getClassifierName()
					: classifier.getTarget().getName();
			default -> "?";
		};
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
