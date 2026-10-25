/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.core.StringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Draw.io tag.
 * 
 * Tags matter more here than they look: the in-browser viewer can filter by them
 * with no server involved, and custom actions can target them, so a tag is the
 * cheapest way to say "this group of shapes moves together".
 * 
 * MERGE NOTE - Page needs a containment for these, and it cannot be called 'tags'
 * because DiagramElement.tags (String[], inherited through Slide -> Diagram) already
 * occupies that name:
 * 
 *     class Page extends Slide, LinkTarget {
 *         contains Tag[] tagDefinitions keys name
 *         contains Animation animation
 *         ...
 *     }
 * 
 * The loader populates tagDefinitions from the union of the tag strings on the
 * page's elements. If the clash is worth resolving properly, the alternative is
 * renaming DiagramElement.tags on the diagram floor - a wider change than this one.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.Tag#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends StringIdentity {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.ModelElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.sdk.runtime.models.drawio.ModelElement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Elements on the page carrying this tag - the inverse of Element.elementTags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTag_Elements()
	 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement#getTags
	 * @model opposite="tags"
	 * @generated
	 */
	EList<ModelElement> getElements();

} // Tag
