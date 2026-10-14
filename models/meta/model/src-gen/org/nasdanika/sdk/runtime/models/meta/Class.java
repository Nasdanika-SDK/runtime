/**
 */
package org.nasdanika.sdk.runtime.models.meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type with features. Covers what Ecore calls EClass, what Java calls a class
 * or interface, and what JSON Schema calls an object schema.
 * 
 * There is no separate `interface` flag. Whether a Class is realized as a
 * TypeScript interface, a type alias or a class is a decision for the
 * projection, not a property of the model.
 * 
 * FLATTENING is a transformation over this model rather than a feature of it:
 * it produces a Package whose Classes declare their inherited features and
 * operations directly, each copied Feature carrying a nested marker back to
 * the class that declared it. Consumers that want a flat class - JSON Schema
 * tool schemas, agent-facing summaries - take the flattened model; consumers
 * that want inheritance take the original.
 * 
 * Flattening is what makes CUTTING the supertype chain lossless: once a Class
 * declares what it inherited, a projection may stop naming the ancestors it
 * came from without the consumer losing anything but the attribution, which
 * the markers still carry. Subclasses are never collapsed into a supertype -
 * removing an ancestor's name is recoverable by widening the cut, removing a
 * distinction is not.
 * 
 * Flattening is where member clashes have to be resolved: two supertypes
 * contributing the same feature name with different types. Most same-name
 * encounters are not clashes - a feature reached twice through a diamond is
 * one feature, so dedupe by identity rather than by name - and for what is
 * left, the most derived
 * declaration keeps the name, the other is renamed deterministically, and the
 * rename is recorded on the feature as an Annotation, since it is a fact about
 * a transformation rather than about the domain. Resolving it here rather than in each
 * emitter is not a preference: TypeScript will not compile an interface
 * extending two interfaces that declare a member incompatibly, so the
 * alternative is every target inventing its own spelling of the same fix.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Class#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Class#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Class#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClass_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supertypes as TypeReferences rather than plain references, because a
	 * supertype may be parameterized: Repository<Account, string>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Types</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClass_SuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClass_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClass_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Class
