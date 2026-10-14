/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jsx Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A JSX element. Exactly one of `tag` and `componentType` is set: `tag` for
 * intrinsics ("div", "table", "input"), `componentType` for components.
 * For intrinsics prefer Intrinsic, which carries a typed HTML model element.
 * 
 * componentType is the load-bearing feature of this whole model. It is what the
 * emitter walks to decide which components must be imported, from which specifier,
 * and whether the import can be type-only. Modeling JSX purely as text would lose
 * this and hand the problem back to a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxElement()
 * @model
 * @generated
 */
public interface JsxElement extends JsxContainer {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxElement_Tag()
	 * @model unique="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' containment reference.
	 * @see #setComponentType(NamedTypeReference)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxElement_ComponentType()
	 * @model containment="true"
	 * @generated
	 */
	NamedTypeReference getComponentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.JsxElement#getComponentType <em>Component Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' containment reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(NamedTypeReference value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.JsxAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getJsxElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsxAttribute> getAttributes();

} // JsxElement
