/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.presentation.Presentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Draw.io document as a model, on the presentation and diagram models: a document is a
 * presentation, a page is a slide, layers, nodes and connections are their diagram namesakes.
 * The model holds what makes Draw.io Draw.io, and inherits the rest.
 *  * Loaded and saved through the runtime's Draw.io API by the resource contents handler in
 * org.nasdanika.sdk.runtime.models.drawio.resource, for .drawio files and for PNG and SVG images
 * with the document embedded (.drawio.png, .drawio.svg).
 *  * What maps where:
 *   - label        -> ModelElement.label as written (HTML if the style says html=1), and its text
 *                     in DiagramElement.name
 *   - tooltip      -> documentation, from core's Documented
 *   - properties   -> attributes, from core's Attributed (the <object> wrapper's attributes)
 *   - style        -> ModelElement.style, an ordered map
 *   - tags         -> Page.tags and ModelElement.tags
 *   - link         -> ModelElement.link
 *   - geometry     -> Node.bounds, relative to the parent node, and Connection.waypoints
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Document#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Document#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Document#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Document#isCompressed <em>Compressed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Document#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends Presentation {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getDocument_Host()
	 * @model unique="false"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Document#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' attribute.
	 * @see #setAgent(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getDocument_Agent()
	 * @model unique="false"
	 * @generated
	 */
	String getAgent();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Document#getAgent <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' attribute.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getDocument_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Document#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Compressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressed</em>' attribute.
	 * @see #setCompressed(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getDocument_Compressed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCompressed();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.Document#isCompressed <em>Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed</em>' attribute.
	 * @see #isCompressed()
	 * @generated
	 */
	void setCompressed(boolean value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The slides of the document, typed as pages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pages</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getDocument_Pages()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Document
