/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link that is stored and used verbatim: an http(s) URL, a mailto:, a relative
 * path, a data: URI this model does not interpret, custom actions (data:action/json,...)
 * until Actions are loaded, and a page or element link whose target is not in the document.
 *  * Anything not recognised as a CustomLink or a SpelLink lands here, which
 * is what keeps the round trip lossless.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.SimpleLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getSimpleLink()
 * @model
 * @generated
 */
public interface SimpleLink extends AbstractLink {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getSimpleLink_Target()
	 * @model unique="false"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.SimpleLink#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // SimpleLink
