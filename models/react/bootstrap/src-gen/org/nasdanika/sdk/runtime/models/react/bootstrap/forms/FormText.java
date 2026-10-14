/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Help text under a control.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText#isMuted <em>Muted</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormText()
 * @model annotation="urn:org.nasdanika:react component='Form.Text'"
 * @generated
 */
public interface FormText extends BootstrapComponent, TextContent {
	/**
	 * Returns the value of the '<em><b>Muted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Muted</em>' attribute.
	 * @see #setMuted(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormText_Muted()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMuted();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText#isMuted <em>Muted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Muted</em>' attribute.
	 * @see #isMuted()
	 * @generated
	 */
	void setMuted(boolean value);

} // FormText
