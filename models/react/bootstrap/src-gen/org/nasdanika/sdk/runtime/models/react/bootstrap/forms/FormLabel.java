/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isColumn <em>Column</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isVisuallyHidden <em>Visually Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getForId <em>For Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormLabel()
 * @model annotation="urn:org.nasdanika:react component='Form.Label'"
 * @generated
 */
public interface FormLabel extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Renders a label of a horizontal form as a column
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormLabel_Column()
	 * @model unique="false"
	 * @generated
	 */
	boolean isColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #isColumn()
	 * @generated
	 */
	void setColumn(boolean value);

	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Column sizes of a horizontal form label, like Col sizes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormLabel_Sizes()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react key='breakpoint'"
	 * @generated
	 */
	EList<ColumnSize> getSizes();

	/**
	 * Returns the value of the '<em><b>Visually Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visually Hidden</em>' attribute.
	 * @see #setVisuallyHidden(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormLabel_VisuallyHidden()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVisuallyHidden();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isVisuallyHidden <em>Visually Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visually Hidden</em>' attribute.
	 * @see #isVisuallyHidden()
	 * @generated
	 */
	void setVisuallyHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>For Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Id</em>' attribute.
	 * @see #setForId(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormLabel_ForId()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='htmlFor'"
	 * @generated
	 */
	String getForId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getForId <em>For Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Id</em>' attribute.
	 * @see #getForId()
	 * @generated
	 */
	void setForId(String value);

} // FormLabel
