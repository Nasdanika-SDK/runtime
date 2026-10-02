/**
 */
package org.nasdanika.sdk.runtime.models.file;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A zip or jar file. Opening it presents its entries as a directory over a zip volume. A zip
 * loaded through its resource factory is a snapshot Directory instead.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getArchiveFile()
 * @model
 * @generated
 */
public interface ArchiveFile extends File {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	Directory open();

} // ArchiveFile
