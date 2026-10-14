/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap;

import org.nasdanika.sdk.runtime.models.html.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A page with Bootstrap or a Bootswatch theme. The theme stylesheet is added to the head
 * before other stylesheets, the Bootstrap JavaScript bundle to the end of the body,
 * followed by initialization of tooltips and popovers if the page has any.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getTheme <em>Theme</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getBootstrapVersion <em>Bootstrap Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getBootswatchVersion <em>Bootswatch Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#isJavaScript <em>Java Script</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getBootstrapDocument()
 * @model
 * @generated
 */
public interface BootstrapDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Theme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Theme
	 * @see #setTheme(Theme)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getBootstrapDocument_Theme()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	Theme getTheme();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Theme
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(Theme value);

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Light or dark color mode of the page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #setColorMode(ColorMode)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getBootstrapDocument_ColorMode()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html attribute='data-bs-theme'"
	 * @generated
	 */
	ColorMode getColorMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.ColorMode
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorMode value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorMode)
	 * @generated
	 */
	void unsetColorMode();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getColorMode <em>Color Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Mode</em>' attribute is set.
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorMode)
	 * @generated
	 */
	boolean isSetColorMode();

	/**
	 * Returns the value of the '<em><b>Bootstrap Version</b></em>' attribute.
	 * The default value is <code>"5.3.8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bootstrap Version</em>' attribute.
	 * @see #setBootstrapVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getBootstrapDocument_BootstrapVersion()
	 * @model default="5.3.8" unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getBootstrapVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getBootstrapVersion <em>Bootstrap Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bootstrap Version</em>' attribute.
	 * @see #getBootstrapVersion()
	 * @generated
	 */
	void setBootstrapVersion(String value);

	/**
	 * Returns the value of the '<em><b>Bootswatch Version</b></em>' attribute.
	 * The default value is <code>"5.3.8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bootswatch Version</em>' attribute.
	 * @see #setBootswatchVersion(String)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getBootstrapDocument_BootswatchVersion()
	 * @model default="5.3.8" unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getBootswatchVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#getBootswatchVersion <em>Bootswatch Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bootswatch Version</em>' attribute.
	 * @see #getBootswatchVersion()
	 * @generated
	 */
	void setBootswatchVersion(String value);

	/**
	 * Returns the value of the '<em><b>Java Script</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Dropdowns, modals, offcanvases, tooltips, ... need the Bootstrap JavaScript bundle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java Script</em>' attribute.
	 * @see #setJavaScript(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage#getBootstrapDocument_JavaScript()
	 * @model default="true" unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isJavaScript();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapDocument#isJavaScript <em>Java Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Script</em>' attribute.
	 * @see #isJavaScript()
	 * @generated
	 */
	void setJavaScript(boolean value);

} // BootstrapDocument
