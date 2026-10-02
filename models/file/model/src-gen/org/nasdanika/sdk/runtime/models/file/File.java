/**
 */
package org.nasdanika.sdk.runtime.models.file;

import java.io.InputStream;
import java.io.OutputStream;

import org.nasdanika.sdk.runtime.volume.Content;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.File#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.File#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.File#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getFile()
 * @model
 * @generated
 */
public interface File extends Entry {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The one state. Getting it does no I/O; assigning it records content for the unit of work,
	 * and bytes move when something reads it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Content)
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getFile_Content()
	 * @model unique="false" dataType="org.nasdanika.sdk.runtime.models.file.Content"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.file.File#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The EMF content type identifier this file was classified as.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getFile_ContentType()
	 * @model unique="false"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.file.File#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getFile_Size()
	 * @model unique="false" changeable="false" derived="true"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	long getSize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.sdk.runtime.models.file.InputStream" unique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	InputStream openStream();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Pushes the bytes into a stream the caller owns. Preferred over openStream.
	 * <!-- end-model-doc -->
	 * @model outDataType="org.nasdanika.sdk.runtime.models.file.OutputStream" outUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	void writeTo(OutputStream out);

} // File
