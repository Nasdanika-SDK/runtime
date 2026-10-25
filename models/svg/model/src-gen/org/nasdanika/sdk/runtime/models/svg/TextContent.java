/**
 */
package org.nasdanika.sdk.runtime.models.svg;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ============================================================================
 * Text
 * ============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getAny <em>Any</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getDx <em>Dx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent()
 * @model abstract="true"
 *        extendedMetaData="name='TextContent' kind='mixed'"
 * @generated
 */
public interface TextContent extends Element, Presentation {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The elements among the mixed content: spans.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##targetNamespace' name=':1' processing='lax' group='#mixed'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  x of each character, or of the first: one number or several.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent_X()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent_Y()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

	/**
	 * Returns the value of the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dx</em>' attribute.
	 * @see #setDx(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent_Dx()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='dx'"
	 * @generated
	 */
	String getDx();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getDx <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dx</em>' attribute.
	 * @see #getDx()
	 * @generated
	 */
	void setDx(String value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dy</em>' attribute.
	 * @see #setDy(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getTextContent_Dy()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='dy'"
	 * @generated
	 */
	String getDy();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.TextContent#getDy <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' attribute.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Appends character data.
	 * <!-- end-model-doc -->
	 * @model textUnique="false"
	 * @generated
	 */
	void addText(String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Appends a span, and returns it.
	 * <!-- end-model-doc -->
	 * @model unique="false" spanUnique="false"
	 * @generated
	 */
	TSpan addSpan(TSpan span);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The character data of this element and its spans, in document order.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String text();

} // TextContent
