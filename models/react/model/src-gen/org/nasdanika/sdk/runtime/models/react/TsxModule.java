/**
 */
package org.nasdanika.sdk.runtime.models.react;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tsx Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A .tsx module. Directive carries "use client" or "use server" verbatim when a
 * framework needs it; the model does not interpret it, because interpreting it would
 * mean modeling a specific meta-framework's boundary rules.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.TsxModule#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getTsxModule()
 * @model
 * @generated
 */
public interface TsxModule extends org.nasdanika.sdk.runtime.models.typescript.Module {
	/**
	 * Returns the value of the '<em><b>Directive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive</em>' attribute.
	 * @see #setDirective(String)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getTsxModule_Directive()
	 * @model unique="false"
	 * @generated
	 */
	String getDirective();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.TsxModule#getDirective <em>Directive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directive</em>' attribute.
	 * @see #getDirective()
	 * @generated
	 */
	void setDirective(String value);

} // TsxModule
