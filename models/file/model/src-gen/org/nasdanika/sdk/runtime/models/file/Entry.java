/**
 */
package org.nasdanika.sdk.runtime.models.file;

import java.time.Instant;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A file, a directory or a link. Its parent is its container.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.Entry#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.Entry#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.Entry#getHash <em>Hash</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.Entry#getModified <em>Modified</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.Entry#isLive <em>Live</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getEntry_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.file.Entry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Relative to the volume root, slash-separated, computed from the containment chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getEntry_Path()
	 * @model unique="false" changeable="false" derived="true"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	String getPath();

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A content hash or a Git blob id, from the backend's stat. Null when unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getEntry_Hash()
	 * @model unique="false" changeable="false" derived="true"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	String getHash();

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getEntry_Modified()
	 * @model unique="false" dataType="org.nasdanika.sdk.runtime.models.file.Instant" changeable="false" derived="true"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	Instant getModified();

	/**
	 * Returns the value of the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * True when bound to a volume, false for a snapshot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Live</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getEntry_Live()
	 * @model unique="false" changeable="false" derived="true"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	boolean isLive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * A detached copy of this entry and everything under it, with content materialized.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	Entry snapshot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	void delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetUnique="false" newNameUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	void moveTo(Directory target, String newName);

} // Entry
