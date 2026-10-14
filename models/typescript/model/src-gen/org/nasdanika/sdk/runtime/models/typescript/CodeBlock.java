/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Opaque source text with managed indentation, the same bargain the Python model
 * makes for bodies. `references` keeps the import resolver honest about types used
 * only inside the text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends TypeScriptElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getCodeBlock_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.typescript.CodeBlock#getText <em>Text</em>}' attribute.
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
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#getCodeBlock_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getReferences();

} // CodeBlock
