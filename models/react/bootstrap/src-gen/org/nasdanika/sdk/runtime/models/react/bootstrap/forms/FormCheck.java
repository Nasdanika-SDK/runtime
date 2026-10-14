/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.nasdanika.sdk.runtime.models.react.JsxNode;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabelNode <em>Label Node</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isInline <em>Inline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isReverse <em>Reverse</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isDefaultChecked <em>Default Checked</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedbackType <em>Feedback Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck()
 * @model annotation="urn:org.nasdanika:react component='Form.Check'"
 * @generated
 */
public interface FormCheck extends BootstrapComponent, Field {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(CheckType)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_Type()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	CheckType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(CheckType value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(CheckType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(CheckType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Label with markup. Wins over label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Node</em>' containment reference.
	 * @see #setLabelNode(JsxNode)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_LabelNode()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika:react prop='label'"
	 * @generated
	 */
	JsxNode getLabelNode();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabelNode <em>Label Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Node</em>' containment reference.
	 * @see #getLabelNode()
	 * @generated
	 */
	void setLabelNode(JsxNode value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline</em>' attribute.
	 * @see #setInline(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_Inline()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInline();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isInline <em>Inline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inline</em>' attribute.
	 * @see #isInline()
	 * @generated
	 */
	void setInline(boolean value);

	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see #setReverse(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_Reverse()
	 * @model unique="false"
	 * @generated
	 */
	boolean isReverse();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see #isReverse()
	 * @generated
	 */
	void setReverse(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Checked</em>' attribute.
	 * @see #setDefaultChecked(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_DefaultChecked()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDefaultChecked();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isDefaultChecked <em>Default Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Checked</em>' attribute.
	 * @see #isDefaultChecked()
	 * @generated
	 */
	void setDefaultChecked(boolean value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Feedback text shown under the check
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feedback</em>' attribute.
	 * @see #setFeedback(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_Feedback()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedback();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #getFeedback()
	 * @generated
	 */
	void setFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Feedback Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Type</em>' attribute.
	 * @see #setFeedbackType(String)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormCheck_FeedbackType()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedbackType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedbackType <em>Feedback Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Type</em>' attribute.
	 * @see #getFeedbackType()
	 * @generated
	 */
	void setFeedbackType(String value);

} // FormCheck
