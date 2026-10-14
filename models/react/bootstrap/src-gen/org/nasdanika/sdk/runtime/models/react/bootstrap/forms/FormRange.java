/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getStep <em>Step</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormRange()
 * @model annotation="urn:org.nasdanika:react component='Form.Range'"
 * @generated
 */
public interface FormRange extends BootstrapComponent, Field {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormRange_Min()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(int)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(int)
	 * @generated
	 */
	boolean isSetMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormRange_Max()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(int)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(int)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #setStep(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormRange_Step()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #isSetStep()
	 * @see #unsetStep()
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStep()
	 * @see #getStep()
	 * @see #setStep(int)
	 * @generated
	 */
	void unsetStep();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getStep <em>Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step</em>' attribute is set.
	 * @see #unsetStep()
	 * @see #getStep()
	 * @see #setStep(int)
	 * @generated
	 */
	boolean isSetStep();

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #setInitialValue(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#getFormRange_InitialValue()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='defaultValue'"
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #isSetInitialValue()
	 * @see #unsetInitialValue()
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialValue()
	 * @see #getInitialValue()
	 * @see #setInitialValue(int)
	 * @generated
	 */
	void unsetInitialValue();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getInitialValue <em>Initial Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial Value</em>' attribute is set.
	 * @see #unsetInitialValue()
	 * @see #getInitialValue()
	 * @see #setInitialValue(int)
	 * @generated
	 */
	boolean isSetInitialValue();

} // FormRange
