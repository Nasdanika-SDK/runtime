/**
 */
package org.nasdanika.sdk.runtime.models.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.ModelElement#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.ModelElement#getUris <em>Uris</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends StringIdentity, Documented, Marked {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Custom icon - treated as URL if contains / or as a CSS class otherwise.
	 * E.g. fas fa-wrench would be treated as a CSS class.
	 * For URLs the recommended icon size is 20x20 pixels and the recommended format is SVG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getModelElement_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.ModelElement#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Uris</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Alias URIs resolved relative to the parent URIs - can be absolute or opaque - global references.
	 * For example: actors://john-smith.
	 * For domains URIs can be used as anchors to merge domains from different sources.
	 * For example, several teams may maintain capability domains with URI myorg://capabilities/developer-productivity
	 * When these definitions are assembled into the organization's product management model to generate documentation
	 * all of these domains are merged into a single logical domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uris</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getModelElement_Uris()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUris();

} // ModelElement
