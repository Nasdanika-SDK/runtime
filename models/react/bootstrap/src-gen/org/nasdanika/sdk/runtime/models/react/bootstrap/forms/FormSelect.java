/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.Option;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Size;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormSelect()
 * @model annotation="urn:org.nasdanika:react component='Form.Select'"
 * @generated
 */
public interface FormSelect extends BootstrapComponent, Field {
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
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormSelect_Size()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getSize <em>Size</em>}' attribute.
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
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getSize <em>Size</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormSelect_Multiple()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormSelect_InitialValue()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='defaultValue'"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  HTML options and option groups
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormSelect_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // FormSelect
