/**
 */
package org.nasdanika.sdk.runtime.models.meta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Who points at an object, through what, and where.
 * 
 * A value rather than a ModelElement: it has no identity of its own, it is not
 * documented, and it exists only as an answer. Making it an element would
 * suggest it can be stored, and it cannot be: it is derived from the referring
 * object's feature and changes when that does.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.IncomingReference#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.IncomingReference#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.IncomingReference#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getIncomingReference()
 * @model
 * @generated
 */
public interface IncomingReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.nasdanika.sdk.runtime.models.meta.Object)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getIncomingReference_Source()
	 * @model
	 * @generated
	 */
	org.nasdanika.sdk.runtime.models.meta.Object getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.IncomingReference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.nasdanika.sdk.runtime.models.meta.Object value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Reference)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getIncomingReference_Reference()
	 * @model
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.IncomingReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Position in a many-valued reference, or -1 when single-valued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getIncomingReference_Index()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.IncomingReference#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // IncomingReference
