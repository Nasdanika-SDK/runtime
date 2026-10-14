/**
 */
package org.nasdanika.sdk.runtime.models.meta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scalar type with a name of its own: Instant, Duration, EmailAddress.
 * 
 * `representation` is how it crosses the wire and is what a projection emits -
 * an Instant is a string. `sourceType` records where it came from and is
 * provenance only.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.DataType#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.DataType#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.meta.PrimitiveKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.meta.PrimitiveKind
	 * @see #setRepresentation(PrimitiveKind)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getDataType_Representation()
	 * @model unique="false"
	 * @generated
	 */
	PrimitiveKind getRepresentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.DataType#getRepresentation <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.meta.PrimitiveKind
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(PrimitiveKind value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Fully qualified type in the source language, e.g. java.time.Instant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see #setSourceType(String)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getDataType_SourceType()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.DataType#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(String value);

} // DataType
