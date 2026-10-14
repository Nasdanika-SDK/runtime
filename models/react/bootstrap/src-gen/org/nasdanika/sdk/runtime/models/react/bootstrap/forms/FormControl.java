/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isPlaintext <em>Plaintext</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getAutoComplete <em>Auto Complete</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl()
 * @model annotation="urn:org.nasdanika:react component='Form.Control'"
 * @generated
 */
public interface FormControl extends BootstrapComponent, Field {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Input type: text, email, password, number, date, color, file, ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_Placeholder()
	 * @model unique="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_InitialValue()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='defaultValue'"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(Size)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_Size()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Plaintext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rendered as plain text, for read only values in forms
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plaintext</em>' attribute.
	 * @see #setPlaintext(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_Plaintext()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPlaintext();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isPlaintext <em>Plaintext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plaintext</em>' attribute.
	 * @see #isPlaintext()
	 * @generated
	 */
	void setPlaintext(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_ReadOnly()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rows of a textarea - as="textarea"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #isSetRows()
	 * @see #unsetRows()
	 * @see #setRows(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_Rows()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #isSetRows()
	 * @see #unsetRows()
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRows()
	 * @see #getRows()
	 * @see #setRows(int)
	 * @generated
	 */
	void unsetRows();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getRows <em>Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rows</em>' attribute is set.
	 * @see #unsetRows()
	 * @see #getRows()
	 * @see #setRows(int)
	 * @generated
	 */
	boolean isSetRows();

	/**
	 * Returns the value of the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Complete</em>' attribute.
	 * @see #setAutoComplete(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormControl_AutoComplete()
	 * @model unique="false"
	 * @generated
	 */
	String getAutoComplete();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getAutoComplete <em>Auto Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Complete</em>' attribute.
	 * @see #getAutoComplete()
	 * @generated
	 */
	void setAutoComplete(String value);

} // FormControl
