/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Open a link - a URL, or another page via data:page/id,<id>.
 * 
 * Typed as AbstractLink rather than String so that an action opening a page is the
 * same navigable reference as an element's own link, and a page rename does not
 * quietly break the animation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Open#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getOpen()
 * @model
 * @generated
 */
public interface Open extends Action {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(AbstractLink)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getOpen_Target()
	 * @model containment="true"
	 * @generated
	 */
	AbstractLink getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Open#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractLink value);

} // Open
