/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#getRows <em>Rows</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#getCols <em>Cols</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#isRequired <em>Required</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.TextArea#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Rows()
	 * @model unique="false"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' attribute.
	 * @see #setCols(int)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Cols()
	 * @model unique="false"
	 * @generated
	 */
	int getCols();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getCols <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cols</em>' attribute.
	 * @see #getCols()
	 * @generated
	 */
	void setCols(int value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Placeholder()
	 * @model unique="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Required()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Disabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Readonly()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Escaped, whitespace preserved
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getTextArea_Text()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.TextArea#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // TextArea
