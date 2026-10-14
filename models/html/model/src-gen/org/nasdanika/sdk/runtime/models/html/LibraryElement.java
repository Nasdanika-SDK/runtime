/**
 */
package org.nasdanika.sdk.runtime.models.html;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element of a library built on top of HTML, e.g. Bootstrap, modeled as an EClass and
 * rendered reflectively from "urn:org.nasdanika:html" annotations - the HTML counterpart
 * of the React model LibraryComponent.
 * 
 * On classes, looked up on the class and then its supertypes:
 * - tag: tag name, e.g. "div".
 * - classes: space separated classes of every element of the class, e.g. "card".
 * - voidElement: "true" for elements without content, e.g. "img".
 * 
 * Features of subclasses, in feature order:
 * - Attributes are HTML attributes, as for other elements: attribute renames, logical skips.
 * - classes: a class pattern - the attribute contributes a class instead of an attribute.
 *   {} is replaced with the value, an enum literal or a number: "btn-{}". A true boolean
 *   contributes the pattern as is: "active".
 * - child: "true" for a string attribute rendered as a text child, after the children of
 *   containment features and before contents.
 * - Containments of nodes are children, followed by contents.
 * 
 * Elements which do not map to a single element - modals, accordions, form checks - are
 * expanded to plain HTML by an HtmlStructure subclass, e.g. the Bootstrap structure.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.sdk.runtime.models.html.HtmlPackage#getLibraryElement()
 * @model abstract="true"
 * @generated
 */
public interface LibraryElement extends Element, Container {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String tagName();

} // LibraryElement
