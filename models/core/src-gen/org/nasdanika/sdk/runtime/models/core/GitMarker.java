/**
 */
package org.nasdanika.sdk.runtime.models.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getRemotes <em>Remotes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getHeadRefs <em>Head Refs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getGitMarker()
 * @model
 * @generated
 */
public interface GitMarker extends Marker {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Path in the repository
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getGitMarker_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Remotes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * A map of remote names to URLs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remotes</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getGitMarker_Remotes()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getRemotes();

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Short branch name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getGitMarker_Branch()
	 * @model unique="false"
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Commit ID of the head
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head</em>' attribute.
	 * @see #setHead(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getGitMarker_Head()
	 * @model unique="false"
	 * @generated
	 */
	String getHead();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getHead <em>Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' attribute.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(String value);

	/**
	 * Returns the value of the '<em><b>Head Refs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Refs on the head commit excluding the head itself. E.g. branch, tags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head Refs</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getGitMarker_HeadRefs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getHeadRefs();

} // GitMarker
