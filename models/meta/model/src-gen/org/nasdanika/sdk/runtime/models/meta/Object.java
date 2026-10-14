/**
 */
package org.nasdanika.sdk.runtime.models.meta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---------------------------------------------------------------------------
 * Instances
 * 
 * The M1 layer. Until now this model described types and had no way to express
 * an instance of one, which made "metacircular by construction" true at M2 and
 * useless at M1: a vocabulary could say that Measure is a Class and had nowhere
 * to put the measures.
 * 
 * PURELY REFLECTIVE, which is the whole difference from EObject. There is no
 * generated interface per Class, no implementation class, no factory. An Object
 * knows its type by reference and answers about itself through six operations.
 * That is what makes it portable: a browser gets instances without a code
 * generator, and an agent gets an interaction surface it can be taught in a
 * paragraph.
 * 
 * IMPLEMENTED BY PROJECTING TO ECORE. This model already generates a dynamic
 * EPackage, so the obvious runtime is dynamic EMF instances behind this
 * interface: EMF does resources, serialization, change recording and proxy
 * resolution, and callers see six operations instead of thirty. The cost to
 * watch is a wrapper per object on a large model, so the Ecore-backed
 * implementation should be an adapter cached per instance, or dynamic EMF should
 * implement this interface directly.
 * 
 * WHAT IS DELIBERATELY ABSENT, and the rule that keeps it absent: an operation
 * belongs here only if a consumer cannot compute it from the others plus the
 * type WITHOUT LOADING DATA IT DID NOT ASK FOR. Contents are derivable from the
 * type's containment references plus get, so there is no contents operation, and
 * a caller wanting contents wants the data anyway. Adapters, notification and
 * change recording belong to an implementation, not to this surface. Proxy
 * resolution is discussed on the resolved operation below and is the one place
 * this surface deliberately hides something real.
 * 
 * The second clause of that rule is load bearing and was added late. It is what
 * admits size and indexed get, and it is narrow on purpose: "this would be
 * faster as a primitive" is not a reason, "this cannot be answered without
 * fetching a thousand objects to count them" is.
 * ---------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Object#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.Object#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type. A REFERENCE rather than a fixed property of the instance, which
	 * is the single most consequential difference from EObject and from every
	 * class-based language.
	 * 
	 * Unset means untyped, which is a legitimate state rather than an error. See
	 * the retyping note below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(org.nasdanika.sdk.runtime.models.meta.Class)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getObject_Type()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.meta.Class getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.Object#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.nasdanika.sdk.runtime.models.meta.Class value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Values that have no typed home yet, or no typed home at all.
	 * 
	 * The same Annotation a loader uses to record what it could not map, used in
	 * the other direction. Before an object is classified there is nowhere typed
	 * to put anything, so elicited data lands here; classification then promotes
	 * what fits into features and leaves the rest where it was. Promotion in one
	 * direction, residue in the other, one mechanism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getObject_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Object identities - zero or more.
	 * A value object has no identity, an entity has one or more
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<java.lang.Object> getIdentities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Object getContainer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Feature getContainmentFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a many-valued feature the result is a list. Whether that list is live
	 * is an implementation decision, and this surface says it is not: mutation
	 * goes through set, add, remove and unset, because a live list leaking out
	 * of a getter is awkward in Java and worse in TypeScript.
	 * <!-- end-model-doc -->
	 * @model unique="false" featureUnique="false"
	 * @generated
	 */
	java.lang.Object get(Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A range of a many-valued feature, without materializing the rest.
	 * 
	 * The completion of size, on the same grounds and satisfying them better
	 * than the indexed get an earlier draft had: size alone tells a caller a
	 * feature holds a thousand values and leaves fetching them costing all
	 * thousand, and a one-at-a-time get fixes the data volume and not the round
	 * trips. This REPLACES indexed get rather than joining it, because
	 * get(f, i, 1) is the indexed case and a convenience wrapper belongs in a
	 * utility rather than on a surface meant to be taught in a paragraph.
	 * 
	 * `count` is a maximum. Fewer values are returned near the end rather than
	 * an error, because every paging API that throws on an overlong final page
	 * is a paging API whose callers write the same clamping loop.
	 * 
	 * OFFSET PAGING ASSUMES A STABLE ORDER, which is worth saying because this
	 * model makes order optional: TypedElement carries `ordered`, and over a
	 * feature that is not ordered, or over data changing underneath the caller,
	 * page two may repeat or skip what page one returned. That is the ordinary
	 * offset-versus-cursor problem and it is not solved here. It is solved where
	 * it belongs, by paging against a snapshot with a freshness policy rather
	 * than against a live source.
	 * <!-- end-model-doc -->
	 * @model unique="false" featureUnique="false" fromUnique="false" countUnique="false"
	 * @generated
	 */
	java.lang.Object get(Feature feature, int from, int count);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureUnique="false" valueUnique="false"
	 * @generated
	 */
	void set(Feature feature, java.lang.Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureUnique="false" valueUnique="false" indexUnique="false"
	 * @generated
	 */
	void set(Feature feature, java.lang.Object value, int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureUnique="false" valueUnique="false" indexUnique="false"
	 * @generated
	 */
	void add(Feature feature, java.lang.Object value, int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureUnique="false" valueUnique="false"
	 * @generated
	 */
	void remove(Feature feature, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureUnique="false" valueUnique="false" indexUnique="false"
	 * @generated
	 */
	void remove(Feature feature, Object value, int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restores the unset state, which is not the same as setting a default.
	 * 
	 * Kept as its own operation rather than folded into set, because set with a
	 * null value says nothing coherent about a many-valued feature, and unset is
	 * the one spelling that works for both cardinalities.
	 * <!-- end-model-doc -->
	 * @model featureUnique="false"
	 * @generated
	 */
	void unset(Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many values a feature holds. Zero for unset, and for a single-valued
	 * feature the answer is only ever zero or one.
	 * 
	 * THIS REPLACES A SEPARATE isSet, which an earlier draft had. Under
	 * multiplicity semantics `size == 0` and "not set" are the same statement,
	 * for both cardinalities, so carrying both operations would mean carrying
	 * two vocabularies for one fact. EMF reaches the same place from the other
	 * direction: eIsSet on a many-valued feature is already defined as "the list
	 * is not empty". Nothing is lost here because this model has no unsettable
	 * flag, so there is no third state to distinguish.
	 * 
	 * It is also the first operation admitted on COST rather than on
	 * expressiveness, and the grounds are narrow: size is computable from get,
	 * but only by materializing a list the caller did not ask for, which for a
	 * lazily loaded containment or a remote surface is the whole expense. The
	 * rule the surface is held to therefore reads: an operation belongs here
	 * only if a consumer cannot compute it from the others without loading data
	 * it did not ask for.
	 * 
	 * And it is the runtime counterpart to lowerBound and upperBound on
	 * TypedElement, which is what makes multiplicity validation reflective:
	 * checking a feature is size between its bounds, rather than fetching
	 * everything to count it.
	 * <!-- end-model-doc -->
	 * @model unique="false" featureUnique="false"
	 * @generated
	 */
	int size(Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the implementation comes from is not this model's business. In this
	 * ecosystem it resolves through the capability framework, which is the same
	 * mechanism a tool catalog uses to bind an operation.
	 * <!-- end-model-doc -->
	 * @model unique="false" operationUnique="false" argumentsUnique="false" argumentsMany="true"
	 * @generated
	 */
	Object invoke(Operation operation, EList<java.lang.Object> arguments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objects referencing this one, the reference they do it through, and the
	 * position within it.
	 * 
	 * Not derivable from anything else, which is why it is here rather than in a
	 * utility: an object cannot see its own referrers without something
	 * maintaining a reverse index.
	 * 
	 * FILTERED BY REFERENCE, because the alternative is fetching every referrer
	 * and discarding most of them, which is the pushdown problem from the graph
	 * provider contract arriving one layer down. Filtering by reference is the
	 * minimal predicate every implementation can honour, and it is exactly what
	 * a Cypher pattern like <-[:owns]- needs.
	 * 
	 * An empty or null array means all references. The single-reference and
	 * no-argument flavours are conveniences and belong in a utility, for the
	 * same reason a one-element range get does: the array form subsumes them.
	 * 
	 * READ ONLY, and deliberately. Incoming references are DERIVED. They change
	 * when the referring object's feature changes, and offering a mutator here
	 * would be a second way to perform the same edit with different provenance,
	 * which is how two views of one fact stop agreeing.
	 * 
	 * Not on an agent's surface, though the capability is. An agent reaches this
	 * through <-[...]- in a query, which is the same thing with better
	 * ergonomics. This is the substrate; a query language is the presentation,
	 * the same split a tool definition makes between what can be called and how
	 * it is offered.
	 * <!-- end-model-doc -->
	 * @model unique="false" referencesUnique="false" referencesMany="true"
	 * @generated
	 */
	EList<IncomingReference> getIncomingReferences(EList<Reference> references);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A page of them. Same contract as the range get above: count is a maximum.
	 * <!-- end-model-doc -->
	 * @model unique="false" referencesUnique="false" referencesMany="true" fromUnique="false" countUnique="false"
	 * @generated
	 */
	EList<IncomingReference> getIncomingReferences(EList<Reference> references, int from, int count);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many, or -1 when the question cannot be answered here.
	 * 
	 * The -1 is the load bearing part. A reverse index is not always available:
	 * a lazily loaded or remote model may have no way to know who points at an
	 * object without loading everything. Returning zero in that case would be
	 * indistinguishable from "nobody references this", which is the failure the
	 * loaders already have a rule against, and -1 for "no idea" is the
	 * convention the graph provider's cardinality estimate already uses.
	 * 
	 * It therefore does double duty as the capability check, and costs no extra
	 * operation to do it.
	 * <!-- end-model-doc -->
	 * @model unique="false" referencesUnique="false" referencesMany="true"
	 * @generated
	 */
	int getIncomingReferenceCount(EList<Reference> references);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * False when this object stands for one that has not been loaded.
	 * 
	 * The one concession to proxies. An earlier draft left them out as an EMF
	 * concern, and that does not survive the federation claim: references cross
	 * resources by URI, so something has to represent "not here yet". Resolution
	 * itself stays an implementation concern; what this surface owes a caller is
	 * the ability to tell the difference before it reads a feature and gets a
	 * surprise.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	boolean isResolved();

} // Object
