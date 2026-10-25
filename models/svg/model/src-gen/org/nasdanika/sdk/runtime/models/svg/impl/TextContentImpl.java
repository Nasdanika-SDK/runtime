/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Objects;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.util.FeatureMap.Entry;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage.Literals;

import org.nasdanika.sdk.runtime.models.svg.Presentation;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;
import org.nasdanika.sdk.runtime.models.svg.TSpan;
import org.nasdanika.sdk.runtime.models.svg.TextContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getTextAnchor <em>Text Anchor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getDominantBaseline <em>Dominant Baseline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getMarkerMid <em>Marker Mid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.TextContentImpl#getDy <em>Dy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextContentImpl extends ElementImpl implements TextContent {
	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFillOpacity() <em>Fill Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_OPACITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_OPACITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrokeDasharray() <em>Stroke Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeDasharray()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_DASHARRAY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrokeLinecap() <em>Stroke Linecap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinecap()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINECAP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrokeLinejoin() <em>Stroke Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeLinejoin()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_LINEJOIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_WEIGHT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_STYLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextAnchor() <em>Text Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAnchor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_ANCHOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDominantBaseline() <em>Dominant Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominantBaseline()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMINANT_BASELINE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkerStart() <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStart()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkerMid() <em>Marker Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerMid()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_MID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkerEnd() <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClipPath() <em>Clip Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClipPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDx() <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected static final String DX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDy() <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected static final String DY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.TEXT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFill() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__FILL, SvgPackage.Literals.PRESENTATION__FILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(String newFill) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__FILL, SvgPackage.Literals.PRESENTATION__FILL, newFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillOpacity() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__FILL_OPACITY, SvgPackage.Literals.PRESENTATION__FILL_OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOpacity(String newFillOpacity) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__FILL_OPACITY, SvgPackage.Literals.PRESENTATION__FILL_OPACITY, newFillOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__STROKE, SvgPackage.Literals.PRESENTATION__STROKE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(String newStroke) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__STROKE, SvgPackage.Literals.PRESENTATION__STROKE, newStroke);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeWidth() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__STROKE_WIDTH, SvgPackage.Literals.PRESENTATION__STROKE_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(String newStrokeWidth) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__STROKE_WIDTH, SvgPackage.Literals.PRESENTATION__STROKE_WIDTH, newStrokeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeOpacity() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__STROKE_OPACITY, SvgPackage.Literals.PRESENTATION__STROKE_OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(String newStrokeOpacity) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__STROKE_OPACITY, SvgPackage.Literals.PRESENTATION__STROKE_OPACITY, newStrokeOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDasharray() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY, SvgPackage.Literals.PRESENTATION__STROKE_DASHARRAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDasharray(String newStrokeDasharray) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY, SvgPackage.Literals.PRESENTATION__STROKE_DASHARRAY, newStrokeDasharray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinecap() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__STROKE_LINECAP, SvgPackage.Literals.PRESENTATION__STROKE_LINECAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinecap(String newStrokeLinecap) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__STROKE_LINECAP, SvgPackage.Literals.PRESENTATION__STROKE_LINECAP, newStrokeLinecap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinejoin() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN, SvgPackage.Literals.PRESENTATION__STROKE_LINEJOIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(String newStrokeLinejoin) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN, SvgPackage.Literals.PRESENTATION__STROKE_LINEJOIN, newStrokeLinejoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__OPACITY, SvgPackage.Literals.PRESENTATION__OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(String newOpacity) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__OPACITY, SvgPackage.Literals.PRESENTATION__OPACITY, newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__FONT_FAMILY, SvgPackage.Literals.PRESENTATION__FONT_FAMILY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__FONT_FAMILY, SvgPackage.Literals.PRESENTATION__FONT_FAMILY, newFontFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__FONT_SIZE, SvgPackage.Literals.PRESENTATION__FONT_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__FONT_SIZE, SvgPackage.Literals.PRESENTATION__FONT_SIZE, newFontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__FONT_WEIGHT, SvgPackage.Literals.PRESENTATION__FONT_WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__FONT_WEIGHT, SvgPackage.Literals.PRESENTATION__FONT_WEIGHT, newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__FONT_STYLE, SvgPackage.Literals.PRESENTATION__FONT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__FONT_STYLE, SvgPackage.Literals.PRESENTATION__FONT_STYLE, newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAnchor() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__TEXT_ANCHOR, SvgPackage.Literals.PRESENTATION__TEXT_ANCHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAnchor(String newTextAnchor) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__TEXT_ANCHOR, SvgPackage.Literals.PRESENTATION__TEXT_ANCHOR, newTextAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDominantBaseline() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE, SvgPackage.Literals.PRESENTATION__DOMINANT_BASELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDominantBaseline(String newDominantBaseline) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE, SvgPackage.Literals.PRESENTATION__DOMINANT_BASELINE, newDominantBaseline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerStart() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__MARKER_START, SvgPackage.Literals.PRESENTATION__MARKER_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerStart(String newMarkerStart) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__MARKER_START, SvgPackage.Literals.PRESENTATION__MARKER_START, newMarkerStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerMid() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__MARKER_MID, SvgPackage.Literals.PRESENTATION__MARKER_MID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerMid(String newMarkerMid) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__MARKER_MID, SvgPackage.Literals.PRESENTATION__MARKER_MID, newMarkerMid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerEnd() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__MARKER_END, SvgPackage.Literals.PRESENTATION__MARKER_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEnd(String newMarkerEnd) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__MARKER_END, SvgPackage.Literals.PRESENTATION__MARKER_END, newMarkerEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__VISIBILITY, SvgPackage.Literals.PRESENTATION__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__VISIBILITY, SvgPackage.Literals.PRESENTATION__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipPath() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__CLIP_PATH, SvgPackage.Literals.PRESENTATION__CLIP_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPath(String newClipPath) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__CLIP_PATH, SvgPackage.Literals.PRESENTATION__CLIP_PATH, newClipPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		return (FeatureMap)eDynamicGet(SvgPackage.TEXT_CONTENT__MIXED, SvgPackage.Literals.TEXT_CONTENT__MIXED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SvgPackage.Literals.TEXT_CONTENT__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__X, SvgPackage.Literals.TEXT_CONTENT__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__X, SvgPackage.Literals.TEXT_CONTENT__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__Y, SvgPackage.Literals.TEXT_CONTENT__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__Y, SvgPackage.Literals.TEXT_CONTENT__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDx() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__DX, SvgPackage.Literals.TEXT_CONTENT__DX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDx(String newDx) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__DX, SvgPackage.Literals.TEXT_CONTENT__DX, newDx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDy() {
		return (String)eDynamicGet(SvgPackage.TEXT_CONTENT__DY, SvgPackage.Literals.TEXT_CONTENT__DY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDy(String newDy) {
		eDynamicSet(SvgPackage.TEXT_CONTENT__DY, SvgPackage.Literals.TEXT_CONTENT__DY, newDy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addText(final String text) {
		this.getMixed().add(Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSpan addSpan(final TSpan span) {
		this.getMixed().add(org.nasdanika.sdk.runtime.models.svg.SvgPackage.Literals.DOCUMENT_ROOT__TSPAN, span);
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String text() {
		final StringBuilder text = new StringBuilder();
		FeatureMap _mixed = this.getMixed();
		for (final Entry entry : _mixed) {
			{
				final Object value = entry.getValue();
				if ((value instanceof TextContent)) {
					text.append(((TextContent)value).text());
				}
				else {
					EStructuralFeature _eStructuralFeature = entry.getEStructuralFeature();
					boolean _equals = Objects.equals(_eStructuralFeature, Literals.XML_TYPE_DOCUMENT_ROOT__TEXT);
					if (_equals) {
						text.append(value);
					}
				}
			}
		}
		return text.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.TEXT_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SvgPackage.TEXT_CONTENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.TEXT_CONTENT__FILL:
				return getFill();
			case SvgPackage.TEXT_CONTENT__FILL_OPACITY:
				return getFillOpacity();
			case SvgPackage.TEXT_CONTENT__STROKE:
				return getStroke();
			case SvgPackage.TEXT_CONTENT__STROKE_WIDTH:
				return getStrokeWidth();
			case SvgPackage.TEXT_CONTENT__STROKE_OPACITY:
				return getStrokeOpacity();
			case SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY:
				return getStrokeDasharray();
			case SvgPackage.TEXT_CONTENT__STROKE_LINECAP:
				return getStrokeLinecap();
			case SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case SvgPackage.TEXT_CONTENT__OPACITY:
				return getOpacity();
			case SvgPackage.TEXT_CONTENT__FONT_FAMILY:
				return getFontFamily();
			case SvgPackage.TEXT_CONTENT__FONT_SIZE:
				return getFontSize();
			case SvgPackage.TEXT_CONTENT__FONT_WEIGHT:
				return getFontWeight();
			case SvgPackage.TEXT_CONTENT__FONT_STYLE:
				return getFontStyle();
			case SvgPackage.TEXT_CONTENT__TEXT_ANCHOR:
				return getTextAnchor();
			case SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE:
				return getDominantBaseline();
			case SvgPackage.TEXT_CONTENT__MARKER_START:
				return getMarkerStart();
			case SvgPackage.TEXT_CONTENT__MARKER_MID:
				return getMarkerMid();
			case SvgPackage.TEXT_CONTENT__MARKER_END:
				return getMarkerEnd();
			case SvgPackage.TEXT_CONTENT__VISIBILITY:
				return getVisibility();
			case SvgPackage.TEXT_CONTENT__CLIP_PATH:
				return getClipPath();
			case SvgPackage.TEXT_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SvgPackage.TEXT_CONTENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SvgPackage.TEXT_CONTENT__X:
				return getX();
			case SvgPackage.TEXT_CONTENT__Y:
				return getY();
			case SvgPackage.TEXT_CONTENT__DX:
				return getDx();
			case SvgPackage.TEXT_CONTENT__DY:
				return getDy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SvgPackage.TEXT_CONTENT__FILL:
				setFill((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__FILL_OPACITY:
				setFillOpacity((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE:
				setStroke((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_WIDTH:
				setStrokeWidth((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_OPACITY:
				setStrokeOpacity((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY:
				setStrokeDasharray((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_LINECAP:
				setStrokeLinecap((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN:
				setStrokeLinejoin((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__OPACITY:
				setOpacity((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_WEIGHT:
				setFontWeight((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_STYLE:
				setFontStyle((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__TEXT_ANCHOR:
				setTextAnchor((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE:
				setDominantBaseline((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__MARKER_START:
				setMarkerStart((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__MARKER_MID:
				setMarkerMid((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__MARKER_END:
				setMarkerEnd((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SvgPackage.TEXT_CONTENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SvgPackage.TEXT_CONTENT__X:
				setX((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__Y:
				setY((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__DX:
				setDx((String)newValue);
				return;
			case SvgPackage.TEXT_CONTENT__DY:
				setDy((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SvgPackage.TEXT_CONTENT__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__FILL_OPACITY:
				setFillOpacity(FILL_OPACITY_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_WIDTH:
				setStrokeWidth(STROKE_WIDTH_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_OPACITY:
				setStrokeOpacity(STROKE_OPACITY_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY:
				setStrokeDasharray(STROKE_DASHARRAY_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_LINECAP:
				setStrokeLinecap(STROKE_LINECAP_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN:
				setStrokeLinejoin(STROKE_LINEJOIN_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_WEIGHT:
				setFontWeight(FONT_WEIGHT_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__TEXT_ANCHOR:
				setTextAnchor(TEXT_ANCHOR_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE:
				setDominantBaseline(DOMINANT_BASELINE_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__MARKER_START:
				setMarkerStart(MARKER_START_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__MARKER_MID:
				setMarkerMid(MARKER_MID_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__MARKER_END:
				setMarkerEnd(MARKER_END_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__CLIP_PATH:
				setClipPath(CLIP_PATH_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__MIXED:
				getMixed().clear();
				return;
			case SvgPackage.TEXT_CONTENT__ANY:
				getAny().clear();
				return;
			case SvgPackage.TEXT_CONTENT__X:
				setX(X_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__Y:
				setY(Y_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__DX:
				setDx(DX_EDEFAULT);
				return;
			case SvgPackage.TEXT_CONTENT__DY:
				setDy(DY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SvgPackage.TEXT_CONTENT__FILL:
				return FILL_EDEFAULT == null ? getFill() != null : !FILL_EDEFAULT.equals(getFill());
			case SvgPackage.TEXT_CONTENT__FILL_OPACITY:
				return FILL_OPACITY_EDEFAULT == null ? getFillOpacity() != null : !FILL_OPACITY_EDEFAULT.equals(getFillOpacity());
			case SvgPackage.TEXT_CONTENT__STROKE:
				return STROKE_EDEFAULT == null ? getStroke() != null : !STROKE_EDEFAULT.equals(getStroke());
			case SvgPackage.TEXT_CONTENT__STROKE_WIDTH:
				return STROKE_WIDTH_EDEFAULT == null ? getStrokeWidth() != null : !STROKE_WIDTH_EDEFAULT.equals(getStrokeWidth());
			case SvgPackage.TEXT_CONTENT__STROKE_OPACITY:
				return STROKE_OPACITY_EDEFAULT == null ? getStrokeOpacity() != null : !STROKE_OPACITY_EDEFAULT.equals(getStrokeOpacity());
			case SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY:
				return STROKE_DASHARRAY_EDEFAULT == null ? getStrokeDasharray() != null : !STROKE_DASHARRAY_EDEFAULT.equals(getStrokeDasharray());
			case SvgPackage.TEXT_CONTENT__STROKE_LINECAP:
				return STROKE_LINECAP_EDEFAULT == null ? getStrokeLinecap() != null : !STROKE_LINECAP_EDEFAULT.equals(getStrokeLinecap());
			case SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN:
				return STROKE_LINEJOIN_EDEFAULT == null ? getStrokeLinejoin() != null : !STROKE_LINEJOIN_EDEFAULT.equals(getStrokeLinejoin());
			case SvgPackage.TEXT_CONTENT__OPACITY:
				return OPACITY_EDEFAULT == null ? getOpacity() != null : !OPACITY_EDEFAULT.equals(getOpacity());
			case SvgPackage.TEXT_CONTENT__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? getFontFamily() != null : !FONT_FAMILY_EDEFAULT.equals(getFontFamily());
			case SvgPackage.TEXT_CONTENT__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? getFontSize() != null : !FONT_SIZE_EDEFAULT.equals(getFontSize());
			case SvgPackage.TEXT_CONTENT__FONT_WEIGHT:
				return FONT_WEIGHT_EDEFAULT == null ? getFontWeight() != null : !FONT_WEIGHT_EDEFAULT.equals(getFontWeight());
			case SvgPackage.TEXT_CONTENT__FONT_STYLE:
				return FONT_STYLE_EDEFAULT == null ? getFontStyle() != null : !FONT_STYLE_EDEFAULT.equals(getFontStyle());
			case SvgPackage.TEXT_CONTENT__TEXT_ANCHOR:
				return TEXT_ANCHOR_EDEFAULT == null ? getTextAnchor() != null : !TEXT_ANCHOR_EDEFAULT.equals(getTextAnchor());
			case SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE:
				return DOMINANT_BASELINE_EDEFAULT == null ? getDominantBaseline() != null : !DOMINANT_BASELINE_EDEFAULT.equals(getDominantBaseline());
			case SvgPackage.TEXT_CONTENT__MARKER_START:
				return MARKER_START_EDEFAULT == null ? getMarkerStart() != null : !MARKER_START_EDEFAULT.equals(getMarkerStart());
			case SvgPackage.TEXT_CONTENT__MARKER_MID:
				return MARKER_MID_EDEFAULT == null ? getMarkerMid() != null : !MARKER_MID_EDEFAULT.equals(getMarkerMid());
			case SvgPackage.TEXT_CONTENT__MARKER_END:
				return MARKER_END_EDEFAULT == null ? getMarkerEnd() != null : !MARKER_END_EDEFAULT.equals(getMarkerEnd());
			case SvgPackage.TEXT_CONTENT__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? getVisibility() != null : !VISIBILITY_EDEFAULT.equals(getVisibility());
			case SvgPackage.TEXT_CONTENT__CLIP_PATH:
				return CLIP_PATH_EDEFAULT == null ? getClipPath() != null : !CLIP_PATH_EDEFAULT.equals(getClipPath());
			case SvgPackage.TEXT_CONTENT__MIXED:
				return !getMixed().isEmpty();
			case SvgPackage.TEXT_CONTENT__ANY:
				return !getAny().isEmpty();
			case SvgPackage.TEXT_CONTENT__X:
				return X_EDEFAULT == null ? getX() != null : !X_EDEFAULT.equals(getX());
			case SvgPackage.TEXT_CONTENT__Y:
				return Y_EDEFAULT == null ? getY() != null : !Y_EDEFAULT.equals(getY());
			case SvgPackage.TEXT_CONTENT__DX:
				return DX_EDEFAULT == null ? getDx() != null : !DX_EDEFAULT.equals(getDx());
			case SvgPackage.TEXT_CONTENT__DY:
				return DY_EDEFAULT == null ? getDy() != null : !DY_EDEFAULT.equals(getDy());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Presentation.class) {
			switch (derivedFeatureID) {
				case SvgPackage.TEXT_CONTENT__FILL: return SvgPackage.PRESENTATION__FILL;
				case SvgPackage.TEXT_CONTENT__FILL_OPACITY: return SvgPackage.PRESENTATION__FILL_OPACITY;
				case SvgPackage.TEXT_CONTENT__STROKE: return SvgPackage.PRESENTATION__STROKE;
				case SvgPackage.TEXT_CONTENT__STROKE_WIDTH: return SvgPackage.PRESENTATION__STROKE_WIDTH;
				case SvgPackage.TEXT_CONTENT__STROKE_OPACITY: return SvgPackage.PRESENTATION__STROKE_OPACITY;
				case SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY: return SvgPackage.PRESENTATION__STROKE_DASHARRAY;
				case SvgPackage.TEXT_CONTENT__STROKE_LINECAP: return SvgPackage.PRESENTATION__STROKE_LINECAP;
				case SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN: return SvgPackage.PRESENTATION__STROKE_LINEJOIN;
				case SvgPackage.TEXT_CONTENT__OPACITY: return SvgPackage.PRESENTATION__OPACITY;
				case SvgPackage.TEXT_CONTENT__FONT_FAMILY: return SvgPackage.PRESENTATION__FONT_FAMILY;
				case SvgPackage.TEXT_CONTENT__FONT_SIZE: return SvgPackage.PRESENTATION__FONT_SIZE;
				case SvgPackage.TEXT_CONTENT__FONT_WEIGHT: return SvgPackage.PRESENTATION__FONT_WEIGHT;
				case SvgPackage.TEXT_CONTENT__FONT_STYLE: return SvgPackage.PRESENTATION__FONT_STYLE;
				case SvgPackage.TEXT_CONTENT__TEXT_ANCHOR: return SvgPackage.PRESENTATION__TEXT_ANCHOR;
				case SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE: return SvgPackage.PRESENTATION__DOMINANT_BASELINE;
				case SvgPackage.TEXT_CONTENT__MARKER_START: return SvgPackage.PRESENTATION__MARKER_START;
				case SvgPackage.TEXT_CONTENT__MARKER_MID: return SvgPackage.PRESENTATION__MARKER_MID;
				case SvgPackage.TEXT_CONTENT__MARKER_END: return SvgPackage.PRESENTATION__MARKER_END;
				case SvgPackage.TEXT_CONTENT__VISIBILITY: return SvgPackage.PRESENTATION__VISIBILITY;
				case SvgPackage.TEXT_CONTENT__CLIP_PATH: return SvgPackage.PRESENTATION__CLIP_PATH;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Presentation.class) {
			switch (baseFeatureID) {
				case SvgPackage.PRESENTATION__FILL: return SvgPackage.TEXT_CONTENT__FILL;
				case SvgPackage.PRESENTATION__FILL_OPACITY: return SvgPackage.TEXT_CONTENT__FILL_OPACITY;
				case SvgPackage.PRESENTATION__STROKE: return SvgPackage.TEXT_CONTENT__STROKE;
				case SvgPackage.PRESENTATION__STROKE_WIDTH: return SvgPackage.TEXT_CONTENT__STROKE_WIDTH;
				case SvgPackage.PRESENTATION__STROKE_OPACITY: return SvgPackage.TEXT_CONTENT__STROKE_OPACITY;
				case SvgPackage.PRESENTATION__STROKE_DASHARRAY: return SvgPackage.TEXT_CONTENT__STROKE_DASHARRAY;
				case SvgPackage.PRESENTATION__STROKE_LINECAP: return SvgPackage.TEXT_CONTENT__STROKE_LINECAP;
				case SvgPackage.PRESENTATION__STROKE_LINEJOIN: return SvgPackage.TEXT_CONTENT__STROKE_LINEJOIN;
				case SvgPackage.PRESENTATION__OPACITY: return SvgPackage.TEXT_CONTENT__OPACITY;
				case SvgPackage.PRESENTATION__FONT_FAMILY: return SvgPackage.TEXT_CONTENT__FONT_FAMILY;
				case SvgPackage.PRESENTATION__FONT_SIZE: return SvgPackage.TEXT_CONTENT__FONT_SIZE;
				case SvgPackage.PRESENTATION__FONT_WEIGHT: return SvgPackage.TEXT_CONTENT__FONT_WEIGHT;
				case SvgPackage.PRESENTATION__FONT_STYLE: return SvgPackage.TEXT_CONTENT__FONT_STYLE;
				case SvgPackage.PRESENTATION__TEXT_ANCHOR: return SvgPackage.TEXT_CONTENT__TEXT_ANCHOR;
				case SvgPackage.PRESENTATION__DOMINANT_BASELINE: return SvgPackage.TEXT_CONTENT__DOMINANT_BASELINE;
				case SvgPackage.PRESENTATION__MARKER_START: return SvgPackage.TEXT_CONTENT__MARKER_START;
				case SvgPackage.PRESENTATION__MARKER_MID: return SvgPackage.TEXT_CONTENT__MARKER_MID;
				case SvgPackage.PRESENTATION__MARKER_END: return SvgPackage.TEXT_CONTENT__MARKER_END;
				case SvgPackage.PRESENTATION__VISIBILITY: return SvgPackage.TEXT_CONTENT__VISIBILITY;
				case SvgPackage.PRESENTATION__CLIP_PATH: return SvgPackage.TEXT_CONTENT__CLIP_PATH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SvgPackage.TEXT_CONTENT___ADD_TEXT__STRING:
				addText((String)arguments.get(0));
				return null;
			case SvgPackage.TEXT_CONTENT___ADD_SPAN__TSPAN:
				return addSpan((TSpan)arguments.get(0));
			case SvgPackage.TEXT_CONTENT___TEXT:
				return text();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TextContentImpl
