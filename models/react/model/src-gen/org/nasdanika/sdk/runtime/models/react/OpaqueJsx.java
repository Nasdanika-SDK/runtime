/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.typescript.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Jsx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Verbatim JSX text. Escape hatch; `references` keeps imports resolvable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getOpaqueJsx()
 * @model
 * @generated
 */
public interface OpaqueJsx extends JsxNode {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getOpaqueJsx_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.OpaqueJsx#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.typescript.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getOpaqueJsx_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getReferences();

} // OpaqueJsx
