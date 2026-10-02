/**
 */
package org.nasdanika.sdk.runtime.models.file;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.volume.Content;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.Directory#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends Entry {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.file.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Lazy: filled from the backend on first access, invalidated by change reports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#getDirectory_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A page of children matching a glob, without materializing the rest: for very large
	 * directories, where reading children would load everything.
	 * <!-- end-model-doc -->
	 * @model unique="false" globUnique="false" offsetUnique="false" limitUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	EList<Entry> list(String glob, int offset, int limit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Resolves a relative path below this directory. Null when nothing is there.
	 * <!-- end-model-doc -->
	 * @model unique="false" pathUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	Entry find(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" patternUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	EList<Entry> glob(String pattern);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" regexUnique="false" globUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	EList<Match> grep(String regex, String glob);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false" contentDataType="org.nasdanika.sdk.runtime.models.file.Content" contentUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/inference/tool-binding provider='anthropic' type='text_editor_20250728' command='create'"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	File createFile(String name, Content content);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="https://runtime.sdk.nasdanika.org/models/file/delegate"
	 * @generated
	 */
	Directory createDirectory(String name);

} // Directory
