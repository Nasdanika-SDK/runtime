/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.nasdanika.sdk.runtime.models.presentation.Presentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO - adjust to Nasdanika Draw.io API. E.g. style class with a derived style EMap reference backed by 'style' property
 * Have ModelElement interface with style property
 * Connection point - extends Port and has dx/dy (pixels)
 * NodeStyle, ConnectionStyle extending style and adding Node/Connection flavors, Draw.io enums
 * Derived features for Document.pages (from Presentation.slides)
 * Page.layers, ...
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

} // Document
