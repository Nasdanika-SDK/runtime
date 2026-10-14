/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * form-label, or col-form-label with column sizes in a horizontal form.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getHtmlFor <em>Html For</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#isColumn <em>Column</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#isVisuallyHidden <em>Visually Hidden</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#getFormLabel()
 * @model annotation="urn:org.nasdanika:html tag='label'"
 * @generated
 */
public interface FormLabel extends BootstrapElement, TextContent {
	/**
	 * Returns the value of the '<em><b>Html For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html For</em>' attribute.
	 * @see #setHtmlFor(String)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#getFormLabel_HtmlFor()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html attribute='for'"
	 * @generated
	 */
	String getHtmlFor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getHtmlFor <em>Html For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html For</em>' attribute.
	 * @see #getHtmlFor()
	 * @generated
	 */
	void setHtmlFor(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#getFormLabel_Column()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#isColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #isColumn()
	 * @generated
	 */
	void setColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#getFormLabel_Sizes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	EList<ColumnSize> getSizes();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(Size)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#getFormLabel_Size()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html classes='col-form-label-{}'"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Size
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(Size)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#getSize <em>Size</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Visually Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visually Hidden</em>' attribute.
	 * @see #setVisuallyHidden(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#getFormLabel_VisuallyHidden()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html classes='visually-hidden'"
	 * @generated
	 */
	boolean isVisuallyHidden();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel#isVisuallyHidden <em>Visually Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visually Hidden</em>' attribute.
	 * @see #isVisuallyHidden()
	 * @generated
	 */
	void setVisuallyHidden(boolean value);

} // FormLabel
