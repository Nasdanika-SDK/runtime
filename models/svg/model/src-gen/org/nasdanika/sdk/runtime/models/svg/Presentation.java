/**
 */
package org.nasdanika.sdk.runtime.models.svg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The presentation attributes of the subset: how a shape or a text is painted. Values are as in
 * SVG: colors such as #1168bd or none, lengths, and url(#id) references to markers and gradients.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFill <em>Fill</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getTextAnchor <em>Text Anchor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getDominantBaseline <em>Dominant Baseline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerMid <em>Marker Mid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getClipPath <em>Clip Path</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Presentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_Fill()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='fill'"
	 * @generated
	 */
	String getFill();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(String value);

	/**
	 * Returns the value of the '<em><b>Fill Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Opacity</em>' attribute.
	 * @see #setFillOpacity(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_FillOpacity()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='fill-opacity'"
	 * @generated
	 */
	String getFillOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFillOpacity <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Opacity</em>' attribute.
	 * @see #getFillOpacity()
	 * @generated
	 */
	void setFillOpacity(String value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #setStroke(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_Stroke()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stroke'"
	 * @generated
	 */
	String getStroke();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_StrokeWidth()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stroke-width'"
	 * @generated
	 */
	String getStrokeWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #setStrokeOpacity(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_StrokeOpacity()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stroke-opacity'"
	 * @generated
	 */
	String getStrokeOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #getStrokeOpacity()
	 * @generated
	 */
	void setStrokeOpacity(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Dasharray</em>' attribute.
	 * @see #setStrokeDasharray(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_StrokeDasharray()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stroke-dasharray'"
	 * @generated
	 */
	String getStrokeDasharray();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeDasharray <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Dasharray</em>' attribute.
	 * @see #getStrokeDasharray()
	 * @generated
	 */
	void setStrokeDasharray(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Linecap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linecap</em>' attribute.
	 * @see #setStrokeLinecap(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_StrokeLinecap()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stroke-linecap'"
	 * @generated
	 */
	String getStrokeLinecap();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinecap <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linecap</em>' attribute.
	 * @see #getStrokeLinecap()
	 * @generated
	 */
	void setStrokeLinecap(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Linejoin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see #setStrokeLinejoin(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_StrokeLinejoin()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='stroke-linejoin'"
	 * @generated
	 */
	String getStrokeLinejoin();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getStrokeLinejoin <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Linejoin</em>' attribute.
	 * @see #getStrokeLinejoin()
	 * @generated
	 */
	void setStrokeLinejoin(String value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_Opacity()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='opacity'"
	 * @generated
	 */
	String getOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(String value);

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_FontFamily()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='font-family'"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_FontSize()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='font-size'"
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see #setFontWeight(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_FontWeight()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='font-weight'"
	 * @generated
	 */
	String getFontWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(String value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see #setFontStyle(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_FontStyle()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='font-style'"
	 * @generated
	 */
	String getFontStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(String value);

	/**
	 * Returns the value of the '<em><b>Text Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Anchor</em>' attribute.
	 * @see #setTextAnchor(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_TextAnchor()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='text-anchor'"
	 * @generated
	 */
	String getTextAnchor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getTextAnchor <em>Text Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Anchor</em>' attribute.
	 * @see #getTextAnchor()
	 * @generated
	 */
	void setTextAnchor(String value);

	/**
	 * Returns the value of the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dominant Baseline</em>' attribute.
	 * @see #setDominantBaseline(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_DominantBaseline()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='dominant-baseline'"
	 * @generated
	 */
	String getDominantBaseline();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getDominantBaseline <em>Dominant Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dominant Baseline</em>' attribute.
	 * @see #getDominantBaseline()
	 * @generated
	 */
	void setDominantBaseline(String value);

	/**
	 * Returns the value of the '<em><b>Marker Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Start</em>' attribute.
	 * @see #setMarkerStart(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_MarkerStart()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='marker-start'"
	 * @generated
	 */
	String getMarkerStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerStart <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Start</em>' attribute.
	 * @see #getMarkerStart()
	 * @generated
	 */
	void setMarkerStart(String value);

	/**
	 * Returns the value of the '<em><b>Marker Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker Mid</em>' attribute.
	 * @see #setMarkerMid(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_MarkerMid()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='marker-mid'"
	 * @generated
	 */
	String getMarkerMid();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerMid <em>Marker Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker Mid</em>' attribute.
	 * @see #getMarkerMid()
	 * @generated
	 */
	void setMarkerMid(String value);

	/**
	 * Returns the value of the '<em><b>Marker End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End</em>' attribute.
	 * @see #setMarkerEnd(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_MarkerEnd()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='marker-end'"
	 * @generated
	 */
	String getMarkerEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getMarkerEnd <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End</em>' attribute.
	 * @see #getMarkerEnd()
	 * @generated
	 */
	void setMarkerEnd(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_Visibility()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='visibility'"
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Clip Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path</em>' attribute.
	 * @see #setClipPath(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getPresentation_ClipPath()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='clip-path'"
	 * @generated
	 */
	String getClipPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.Presentation#getClipPath <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Path</em>' attribute.
	 * @see #getClipPath()
	 * @generated
	 */
	void setClipPath(String value);

} // Presentation
