/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common supertype of the Draw.io layer elements - what the format calls a cell
 * and the Java API calls ModelElement: the things that carry a style, a link,
 * tags, and custom properties.
 * 
 * NAMING - the Java API calls this ModelElement and reserves Element for the
 * wider base (Document, Page, Model, Root, ModelElement). This file follows the
 * shorter name; if the API name is preferred, rename here and in doc/readme.md
 * together.
 * 
 * To be merged into drawio.xcore as a second supertype:
 * 
 *     class DrawioLayer      extends Layer,      Element { ... }
 *     class DrawioNode       extends Node,       Element { ... }
 *     class DrawioConnection extends Connection, Element { ... }
 * 
 * Ecore supports the resulting diamond (Node and Element both reach
 * DiagramElement) without special handling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getLink <em>Link</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelElement extends LinkTarget {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'link' attribute, parsed. Null when the element has no link.
	 * 
	 * Containment rather than an attribute because a link is either a target or a
	 * script - see AbstractLink.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(AbstractLink)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement_Link()
	 * @model containment="true"
	 * @generated
	 */
	AbstractLink getLink();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(AbstractLink value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Tag}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sdk.runtime.models.drawio.Tag#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tag objects for the raw tag names inherited from DiagramElement.tags,
	 * resolved against the containing Page.
	 * 
	 * Derived because DiagramElement.tags is the state - Draw.io tags are not
	 * declared anywhere, they are just strings on cells. This reference is what
	 * makes actions able to point at a tag rather than repeat its name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement_Tags()
	 * @see org.nasdanika.sdk.runtime.models.drawio.Tag#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<Tag> getTags();

} // ModelElement
