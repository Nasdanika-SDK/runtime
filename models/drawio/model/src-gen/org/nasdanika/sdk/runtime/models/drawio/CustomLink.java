/**
 */
package org.nasdanika.sdk.runtime.models.drawio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Nasdanika extended link notation, which widens Draw.io's page linking into
 * element linking and cross-document linking:
 * 
 *     data:page/id,<page id>
 *     data:page/name,<url encoded page name>
 *     data:element/id,<element id>
 *     data:element/name,<url encoded label>
 * 
 * with an optional document URI before a '#', resolved relative to the URI of the
 * containing document and therefore able to reach through URI handlers:
 * 
 *     data:element/name,compressed.drawio#name,Page+2/Linked
 *     data:page/name,maven://<gav>/my-system.drawio#My+Component
 * 
 * The resolved references are the point of modelling this at all. In a resource
 * set a folder of .drawio files stops being a folder and becomes one traversable
 * object graph, so "what links to this component" is a getReferrers query rather
 * than a text search - and a link into a document that was never checked out still
 * resolves.
 * 
 * The selector attributes are kept alongside the references so that saving
 * reproduces the notation the author wrote. A link written as 'name,' should not
 * come back as 'id,' just because the loader found it easier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getResource <em>Resource</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelectorType <em>Page Selector Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelector <em>Page Selector</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelectorType <em>Element Selector Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelector <em>Element Selector</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink()
 * @model
 * @generated
 */
public interface CustomLink extends AbstractLink {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the document containing the target - the part before '#'.
	 * Blank for a link within the same document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink_Resource()
	 * @model unique="false"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The target, resolved. A Page for a page link, an Element for an element link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LinkTarget)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink_Target()
	 * @model
	 * @generated
	 */
	LinkTarget getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LinkTarget value);

	/**
	 * Returns the value of the '<em><b>Page Selector Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.drawio.SelectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  How the page was selected. Blank pageSelector means "the current page".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Selector Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
	 * @see #setPageSelectorType(SelectorType)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink_PageSelectorType()
	 * @model unique="false"
	 * @generated
	 */
	SelectorType getPageSelectorType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelectorType <em>Page Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Selector Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
	 * @see #getPageSelectorType()
	 * @generated
	 */
	void setPageSelectorType(SelectorType value);

	/**
	 * Returns the value of the '<em><b>Page Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Selector</em>' attribute.
	 * @see #setPageSelector(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink_PageSelector()
	 * @model unique="false"
	 * @generated
	 */
	String getPageSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getPageSelector <em>Page Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Selector</em>' attribute.
	 * @see #getPageSelector()
	 * @generated
	 */
	void setPageSelector(String value);

	/**
	 * Returns the value of the '<em><b>Element Selector Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.drawio.SelectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  How the element was selected. Blank for a page link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Selector Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
	 * @see #setElementSelectorType(SelectorType)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink_ElementSelectorType()
	 * @model unique="false"
	 * @generated
	 */
	SelectorType getElementSelectorType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelectorType <em>Element Selector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Selector Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.SelectorType
	 * @see #getElementSelectorType()
	 * @generated
	 */
	void setElementSelectorType(SelectorType value);

	/**
	 * Returns the value of the '<em><b>Element Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Selector</em>' attribute.
	 * @see #setElementSelector(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getCustomLink_ElementSelector()
	 * @model unique="false"
	 * @generated
	 */
	String getElementSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.CustomLink#getElementSelector <em>Element Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Selector</em>' attribute.
	 * @see #getElementSelector()
	 * @generated
	 */
	void setElementSelector(String value);

} // CustomLink
