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
 * A Draw.io tag. Its id is its name.
 *  * Tags matter more here than they look: the in-browser viewer can filter by them
 * with no server involved, and custom actions can target them, so a tag is the
 * cheapest way to say "this group of shapes moves together".
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
	 *  Elements on the page carrying this tag - the inverse of ModelElement.tags.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTag_Elements()
	 * @see org.nasdanika.sdk.runtime.models.drawio.ModelElement#getTags
	 * @model opposite="tags"
	 * @generated
	 */
	EList<ModelElement> getElements();

} // Tag
