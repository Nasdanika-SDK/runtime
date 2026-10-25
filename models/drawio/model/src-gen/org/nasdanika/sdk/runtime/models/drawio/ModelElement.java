/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common supertype of the Draw.io layers, nodes and connections: the cells, which the Java API
 * calls ModelElement. They carry a label, a style, a link and tags. Their properties are the
 * attributes, and their tooltip the documentation, of DiagramElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getStyleString <em>Style String</em>}</li>
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
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label as Draw.io stores it: HTML when the style has html=1. DiagramElement.name is its
	 * text. When the label is not set, saving writes the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement_Label()
	 * @model unique="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style as an ordered map of keys and values, such as rounded -> 1 and fillColor -> #dae8fc.
	 * A key without a value, such as ellipse or text at the start of a style, has a null value.
	 * Unknown keys are kept, so a document round-trips.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement_Style()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getStyle();

	/**
	 * Returns the value of the '<em><b>Style String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style as Draw.io writes it: key=value pairs, and keys without values, joined with ';'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style String</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement_StyleString()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getStyleString();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'link' attribute, parsed. Null when the element has no link.
	 *      * Containment rather than an attribute because a link is either a target or a
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
	 * The tags of the element, contained by its page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getModelElement_Tags()
	 * @see org.nasdanika.sdk.runtime.models.drawio.Tag#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<Tag> getTags();

} // ModelElement
