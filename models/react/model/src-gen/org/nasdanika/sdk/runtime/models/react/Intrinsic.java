/**
 */
package org.nasdanika.sdk.runtime.models.react;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intrinsic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An HTML model element used as a JSX intrinsic. Tag name, static attributes, classes,
 * style and structure (table sections, select options, ...) come from the HTML model and
 * are interpreted by its HtmlStructure, so HTML produced by a transformation, e.g. a
 * Bootstrap layer, can be used in components as is.
 * 
 * `attributes` are props HTML cannot express: expressions, event handlers, key, spreads.
 * Where a name is set both ways, the JSX attribute wins. JSX inside the element is
 * placed into HTML containers with JsxContent. `children` follow the children of the
 * HTML element - for dynamic content where the HTML model has a typed reference
 * rather than a container, e.g. an iterator over the rows of a TableBody.
 * 
 * Prefer this to JsxElement.tag, which remains for intrinsics the HTML model does not
 * cover and for opaque output of older transformations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.Intrinsic#getElement <em>Element</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.Intrinsic#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getIntrinsic()
 * @model
 * @generated
 */
public interface Intrinsic extends JsxContainer {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Element)
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getIntrinsic_Element()
	 * @model containment="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.Intrinsic#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.JsxAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactPackage#getIntrinsic_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsxAttribute> getAttributes();

} // Intrinsic
