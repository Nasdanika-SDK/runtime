/**
 */
package org.nasdanika.sdk.runtime.models.svg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ============================================================================
 * Structure
 * ============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Container#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getContainer()
 * @model abstract="true"
 *        extendedMetaData="name='Container' kind='elementOnly'"
 * @generated
 */
public interface Container extends Element, Presentation {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getContainer_Content()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##targetNamespace' name=':content' processing='lax'"
	 * @generated
	 */
	FeatureMap getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Appends a child, keyed by its element of DocumentRoot, and returns it.
	 * <!-- end-model-doc -->
	 * @model unique="false" childUnique="false"
	 * @generated
	 */
	<T extends Element> T add(T child);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The children that are elements of the subset, in document order.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	EList<Element> children();

} // Container
