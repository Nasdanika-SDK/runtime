/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.util.FeatureMap.Entry;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.svg.Element;
import org.nasdanika.sdk.runtime.models.svg.Presentation;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getFillOpacity <em>Fill Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getStrokeDasharray <em>Stroke Dasharray</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getStrokeLinecap <em>Stroke Linecap</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getStrokeLinejoin <em>Stroke Linejoin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getTextAnchor <em>Text Anchor</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getDominantBaseline <em>Dominant Baseline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getMarkerMid <em>Marker Mid</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.ContainerImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends ElementImpl implements org.nasdanika.sdk.runtime.models.svg.Container {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFill() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__FILL, SvgPackage.Literals.PRESENTATION__FILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(String newFill) {
		eDynamicSet(SvgPackage.CONTAINER__FILL, SvgPackage.Literals.PRESENTATION__FILL, newFill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillOpacity() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__FILL_OPACITY, SvgPackage.Literals.PRESENTATION__FILL_OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillOpacity(String newFillOpacity) {
		eDynamicSet(SvgPackage.CONTAINER__FILL_OPACITY, SvgPackage.Literals.PRESENTATION__FILL_OPACITY, newFillOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__STROKE, SvgPackage.Literals.PRESENTATION__STROKE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(String newStroke) {
		eDynamicSet(SvgPackage.CONTAINER__STROKE, SvgPackage.Literals.PRESENTATION__STROKE, newStroke);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeWidth() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__STROKE_WIDTH, SvgPackage.Literals.PRESENTATION__STROKE_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(String newStrokeWidth) {
		eDynamicSet(SvgPackage.CONTAINER__STROKE_WIDTH, SvgPackage.Literals.PRESENTATION__STROKE_WIDTH, newStrokeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeOpacity() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__STROKE_OPACITY, SvgPackage.Literals.PRESENTATION__STROKE_OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(String newStrokeOpacity) {
		eDynamicSet(SvgPackage.CONTAINER__STROKE_OPACITY, SvgPackage.Literals.PRESENTATION__STROKE_OPACITY, newStrokeOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeDasharray() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__STROKE_DASHARRAY, SvgPackage.Literals.PRESENTATION__STROKE_DASHARRAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeDasharray(String newStrokeDasharray) {
		eDynamicSet(SvgPackage.CONTAINER__STROKE_DASHARRAY, SvgPackage.Literals.PRESENTATION__STROKE_DASHARRAY, newStrokeDasharray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinecap() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__STROKE_LINECAP, SvgPackage.Literals.PRESENTATION__STROKE_LINECAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinecap(String newStrokeLinecap) {
		eDynamicSet(SvgPackage.CONTAINER__STROKE_LINECAP, SvgPackage.Literals.PRESENTATION__STROKE_LINECAP, newStrokeLinecap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeLinejoin() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__STROKE_LINEJOIN, SvgPackage.Literals.PRESENTATION__STROKE_LINEJOIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeLinejoin(String newStrokeLinejoin) {
		eDynamicSet(SvgPackage.CONTAINER__STROKE_LINEJOIN, SvgPackage.Literals.PRESENTATION__STROKE_LINEJOIN, newStrokeLinejoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__OPACITY, SvgPackage.Literals.PRESENTATION__OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(String newOpacity) {
		eDynamicSet(SvgPackage.CONTAINER__OPACITY, SvgPackage.Literals.PRESENTATION__OPACITY, newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__FONT_FAMILY, SvgPackage.Literals.PRESENTATION__FONT_FAMILY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		eDynamicSet(SvgPackage.CONTAINER__FONT_FAMILY, SvgPackage.Literals.PRESENTATION__FONT_FAMILY, newFontFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__FONT_SIZE, SvgPackage.Literals.PRESENTATION__FONT_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		eDynamicSet(SvgPackage.CONTAINER__FONT_SIZE, SvgPackage.Literals.PRESENTATION__FONT_SIZE, newFontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__FONT_WEIGHT, SvgPackage.Literals.PRESENTATION__FONT_WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		eDynamicSet(SvgPackage.CONTAINER__FONT_WEIGHT, SvgPackage.Literals.PRESENTATION__FONT_WEIGHT, newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__FONT_STYLE, SvgPackage.Literals.PRESENTATION__FONT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		eDynamicSet(SvgPackage.CONTAINER__FONT_STYLE, SvgPackage.Literals.PRESENTATION__FONT_STYLE, newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAnchor() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__TEXT_ANCHOR, SvgPackage.Literals.PRESENTATION__TEXT_ANCHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAnchor(String newTextAnchor) {
		eDynamicSet(SvgPackage.CONTAINER__TEXT_ANCHOR, SvgPackage.Literals.PRESENTATION__TEXT_ANCHOR, newTextAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDominantBaseline() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__DOMINANT_BASELINE, SvgPackage.Literals.PRESENTATION__DOMINANT_BASELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDominantBaseline(String newDominantBaseline) {
		eDynamicSet(SvgPackage.CONTAINER__DOMINANT_BASELINE, SvgPackage.Literals.PRESENTATION__DOMINANT_BASELINE, newDominantBaseline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerStart() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__MARKER_START, SvgPackage.Literals.PRESENTATION__MARKER_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerStart(String newMarkerStart) {
		eDynamicSet(SvgPackage.CONTAINER__MARKER_START, SvgPackage.Literals.PRESENTATION__MARKER_START, newMarkerStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerMid() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__MARKER_MID, SvgPackage.Literals.PRESENTATION__MARKER_MID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerMid(String newMarkerMid) {
		eDynamicSet(SvgPackage.CONTAINER__MARKER_MID, SvgPackage.Literals.PRESENTATION__MARKER_MID, newMarkerMid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerEnd() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__MARKER_END, SvgPackage.Literals.PRESENTATION__MARKER_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerEnd(String newMarkerEnd) {
		eDynamicSet(SvgPackage.CONTAINER__MARKER_END, SvgPackage.Literals.PRESENTATION__MARKER_END, newMarkerEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibility() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__VISIBILITY, SvgPackage.Literals.PRESENTATION__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(String newVisibility) {
		eDynamicSet(SvgPackage.CONTAINER__VISIBILITY, SvgPackage.Literals.PRESENTATION__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipPath() {
		return (String)eDynamicGet(SvgPackage.CONTAINER__CLIP_PATH, SvgPackage.Literals.PRESENTATION__CLIP_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPath(String newClipPath) {
		eDynamicSet(SvgPackage.CONTAINER__CLIP_PATH, SvgPackage.Literals.PRESENTATION__CLIP_PATH, newClipPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContent() {
		return (FeatureMap)eDynamicGet(SvgPackage.CONTAINER__CONTENT, SvgPackage.Literals.CONTAINER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Element> T add(final T child) {
		final ExtendedMetaData metaData = ExtendedMetaData.INSTANCE;
		this.getContent().add(metaData.getElement(SvgPackage.eNS_URI, metaData.getName(child.eClass())), child);
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> children() {
		final BasicEList<Element> children = new BasicEList<Element>();
		FeatureMap _content = this.getContent();
		for (final Entry entry : _content) {
			{
				final Object value = entry.getValue();
				if ((value instanceof Element)) {
					children.add(((Element)value));
				}
			}
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.CONTAINER__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case SvgPackage.CONTAINER__FILL:
				return getFill();
			case SvgPackage.CONTAINER__FILL_OPACITY:
				return getFillOpacity();
			case SvgPackage.CONTAINER__STROKE:
				return getStroke();
			case SvgPackage.CONTAINER__STROKE_WIDTH:
				return getStrokeWidth();
			case SvgPackage.CONTAINER__STROKE_OPACITY:
				return getStrokeOpacity();
			case SvgPackage.CONTAINER__STROKE_DASHARRAY:
				return getStrokeDasharray();
			case SvgPackage.CONTAINER__STROKE_LINECAP:
				return getStrokeLinecap();
			case SvgPackage.CONTAINER__STROKE_LINEJOIN:
				return getStrokeLinejoin();
			case SvgPackage.CONTAINER__OPACITY:
				return getOpacity();
			case SvgPackage.CONTAINER__FONT_FAMILY:
				return getFontFamily();
			case SvgPackage.CONTAINER__FONT_SIZE:
				return getFontSize();
			case SvgPackage.CONTAINER__FONT_WEIGHT:
				return getFontWeight();
			case SvgPackage.CONTAINER__FONT_STYLE:
				return getFontStyle();
			case SvgPackage.CONTAINER__TEXT_ANCHOR:
				return getTextAnchor();
			case SvgPackage.CONTAINER__DOMINANT_BASELINE:
				return getDominantBaseline();
			case SvgPackage.CONTAINER__MARKER_START:
				return getMarkerStart();
			case SvgPackage.CONTAINER__MARKER_MID:
				return getMarkerMid();
			case SvgPackage.CONTAINER__MARKER_END:
				return getMarkerEnd();
			case SvgPackage.CONTAINER__VISIBILITY:
				return getVisibility();
			case SvgPackage.CONTAINER__CLIP_PATH:
				return getClipPath();
			case SvgPackage.CONTAINER__CONTENT:
				if (coreType) return getContent();
				return ((FeatureMap.Internal)getContent()).getWrapper();
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
			case SvgPackage.CONTAINER__FILL:
				setFill((String)newValue);
				return;
			case SvgPackage.CONTAINER__FILL_OPACITY:
				setFillOpacity((String)newValue);
				return;
			case SvgPackage.CONTAINER__STROKE:
				setStroke((String)newValue);
				return;
			case SvgPackage.CONTAINER__STROKE_WIDTH:
				setStrokeWidth((String)newValue);
				return;
			case SvgPackage.CONTAINER__STROKE_OPACITY:
				setStrokeOpacity((String)newValue);
				return;
			case SvgPackage.CONTAINER__STROKE_DASHARRAY:
				setStrokeDasharray((String)newValue);
				return;
			case SvgPackage.CONTAINER__STROKE_LINECAP:
				setStrokeLinecap((String)newValue);
				return;
			case SvgPackage.CONTAINER__STROKE_LINEJOIN:
				setStrokeLinejoin((String)newValue);
				return;
			case SvgPackage.CONTAINER__OPACITY:
				setOpacity((String)newValue);
				return;
			case SvgPackage.CONTAINER__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case SvgPackage.CONTAINER__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case SvgPackage.CONTAINER__FONT_WEIGHT:
				setFontWeight((String)newValue);
				return;
			case SvgPackage.CONTAINER__FONT_STYLE:
				setFontStyle((String)newValue);
				return;
			case SvgPackage.CONTAINER__TEXT_ANCHOR:
				setTextAnchor((String)newValue);
				return;
			case SvgPackage.CONTAINER__DOMINANT_BASELINE:
				setDominantBaseline((String)newValue);
				return;
			case SvgPackage.CONTAINER__MARKER_START:
				setMarkerStart((String)newValue);
				return;
			case SvgPackage.CONTAINER__MARKER_MID:
				setMarkerMid((String)newValue);
				return;
			case SvgPackage.CONTAINER__MARKER_END:
				setMarkerEnd((String)newValue);
				return;
			case SvgPackage.CONTAINER__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case SvgPackage.CONTAINER__CLIP_PATH:
				setClipPath((String)newValue);
				return;
			case SvgPackage.CONTAINER__CONTENT:
				((FeatureMap.Internal)getContent()).set(newValue);
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
			case SvgPackage.CONTAINER__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__FILL_OPACITY:
				setFillOpacity(FILL_OPACITY_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__STROKE_WIDTH:
				setStrokeWidth(STROKE_WIDTH_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__STROKE_OPACITY:
				setStrokeOpacity(STROKE_OPACITY_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__STROKE_DASHARRAY:
				setStrokeDasharray(STROKE_DASHARRAY_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__STROKE_LINECAP:
				setStrokeLinecap(STROKE_LINECAP_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__STROKE_LINEJOIN:
				setStrokeLinejoin(STROKE_LINEJOIN_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__FONT_WEIGHT:
				setFontWeight(FONT_WEIGHT_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__TEXT_ANCHOR:
				setTextAnchor(TEXT_ANCHOR_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__DOMINANT_BASELINE:
				setDominantBaseline(DOMINANT_BASELINE_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__MARKER_START:
				setMarkerStart(MARKER_START_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__MARKER_MID:
				setMarkerMid(MARKER_MID_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__MARKER_END:
				setMarkerEnd(MARKER_END_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__CLIP_PATH:
				setClipPath(CLIP_PATH_EDEFAULT);
				return;
			case SvgPackage.CONTAINER__CONTENT:
				getContent().clear();
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
			case SvgPackage.CONTAINER__FILL:
				return FILL_EDEFAULT == null ? getFill() != null : !FILL_EDEFAULT.equals(getFill());
			case SvgPackage.CONTAINER__FILL_OPACITY:
				return FILL_OPACITY_EDEFAULT == null ? getFillOpacity() != null : !FILL_OPACITY_EDEFAULT.equals(getFillOpacity());
			case SvgPackage.CONTAINER__STROKE:
				return STROKE_EDEFAULT == null ? getStroke() != null : !STROKE_EDEFAULT.equals(getStroke());
			case SvgPackage.CONTAINER__STROKE_WIDTH:
				return STROKE_WIDTH_EDEFAULT == null ? getStrokeWidth() != null : !STROKE_WIDTH_EDEFAULT.equals(getStrokeWidth());
			case SvgPackage.CONTAINER__STROKE_OPACITY:
				return STROKE_OPACITY_EDEFAULT == null ? getStrokeOpacity() != null : !STROKE_OPACITY_EDEFAULT.equals(getStrokeOpacity());
			case SvgPackage.CONTAINER__STROKE_DASHARRAY:
				return STROKE_DASHARRAY_EDEFAULT == null ? getStrokeDasharray() != null : !STROKE_DASHARRAY_EDEFAULT.equals(getStrokeDasharray());
			case SvgPackage.CONTAINER__STROKE_LINECAP:
				return STROKE_LINECAP_EDEFAULT == null ? getStrokeLinecap() != null : !STROKE_LINECAP_EDEFAULT.equals(getStrokeLinecap());
			case SvgPackage.CONTAINER__STROKE_LINEJOIN:
				return STROKE_LINEJOIN_EDEFAULT == null ? getStrokeLinejoin() != null : !STROKE_LINEJOIN_EDEFAULT.equals(getStrokeLinejoin());
			case SvgPackage.CONTAINER__OPACITY:
				return OPACITY_EDEFAULT == null ? getOpacity() != null : !OPACITY_EDEFAULT.equals(getOpacity());
			case SvgPackage.CONTAINER__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? getFontFamily() != null : !FONT_FAMILY_EDEFAULT.equals(getFontFamily());
			case SvgPackage.CONTAINER__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? getFontSize() != null : !FONT_SIZE_EDEFAULT.equals(getFontSize());
			case SvgPackage.CONTAINER__FONT_WEIGHT:
				return FONT_WEIGHT_EDEFAULT == null ? getFontWeight() != null : !FONT_WEIGHT_EDEFAULT.equals(getFontWeight());
			case SvgPackage.CONTAINER__FONT_STYLE:
				return FONT_STYLE_EDEFAULT == null ? getFontStyle() != null : !FONT_STYLE_EDEFAULT.equals(getFontStyle());
			case SvgPackage.CONTAINER__TEXT_ANCHOR:
				return TEXT_ANCHOR_EDEFAULT == null ? getTextAnchor() != null : !TEXT_ANCHOR_EDEFAULT.equals(getTextAnchor());
			case SvgPackage.CONTAINER__DOMINANT_BASELINE:
				return DOMINANT_BASELINE_EDEFAULT == null ? getDominantBaseline() != null : !DOMINANT_BASELINE_EDEFAULT.equals(getDominantBaseline());
			case SvgPackage.CONTAINER__MARKER_START:
				return MARKER_START_EDEFAULT == null ? getMarkerStart() != null : !MARKER_START_EDEFAULT.equals(getMarkerStart());
			case SvgPackage.CONTAINER__MARKER_MID:
				return MARKER_MID_EDEFAULT == null ? getMarkerMid() != null : !MARKER_MID_EDEFAULT.equals(getMarkerMid());
			case SvgPackage.CONTAINER__MARKER_END:
				return MARKER_END_EDEFAULT == null ? getMarkerEnd() != null : !MARKER_END_EDEFAULT.equals(getMarkerEnd());
			case SvgPackage.CONTAINER__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? getVisibility() != null : !VISIBILITY_EDEFAULT.equals(getVisibility());
			case SvgPackage.CONTAINER__CLIP_PATH:
				return CLIP_PATH_EDEFAULT == null ? getClipPath() != null : !CLIP_PATH_EDEFAULT.equals(getClipPath());
			case SvgPackage.CONTAINER__CONTENT:
				return !getContent().isEmpty();
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
				case SvgPackage.CONTAINER__FILL: return SvgPackage.PRESENTATION__FILL;
				case SvgPackage.CONTAINER__FILL_OPACITY: return SvgPackage.PRESENTATION__FILL_OPACITY;
				case SvgPackage.CONTAINER__STROKE: return SvgPackage.PRESENTATION__STROKE;
				case SvgPackage.CONTAINER__STROKE_WIDTH: return SvgPackage.PRESENTATION__STROKE_WIDTH;
				case SvgPackage.CONTAINER__STROKE_OPACITY: return SvgPackage.PRESENTATION__STROKE_OPACITY;
				case SvgPackage.CONTAINER__STROKE_DASHARRAY: return SvgPackage.PRESENTATION__STROKE_DASHARRAY;
				case SvgPackage.CONTAINER__STROKE_LINECAP: return SvgPackage.PRESENTATION__STROKE_LINECAP;
				case SvgPackage.CONTAINER__STROKE_LINEJOIN: return SvgPackage.PRESENTATION__STROKE_LINEJOIN;
				case SvgPackage.CONTAINER__OPACITY: return SvgPackage.PRESENTATION__OPACITY;
				case SvgPackage.CONTAINER__FONT_FAMILY: return SvgPackage.PRESENTATION__FONT_FAMILY;
				case SvgPackage.CONTAINER__FONT_SIZE: return SvgPackage.PRESENTATION__FONT_SIZE;
				case SvgPackage.CONTAINER__FONT_WEIGHT: return SvgPackage.PRESENTATION__FONT_WEIGHT;
				case SvgPackage.CONTAINER__FONT_STYLE: return SvgPackage.PRESENTATION__FONT_STYLE;
				case SvgPackage.CONTAINER__TEXT_ANCHOR: return SvgPackage.PRESENTATION__TEXT_ANCHOR;
				case SvgPackage.CONTAINER__DOMINANT_BASELINE: return SvgPackage.PRESENTATION__DOMINANT_BASELINE;
				case SvgPackage.CONTAINER__MARKER_START: return SvgPackage.PRESENTATION__MARKER_START;
				case SvgPackage.CONTAINER__MARKER_MID: return SvgPackage.PRESENTATION__MARKER_MID;
				case SvgPackage.CONTAINER__MARKER_END: return SvgPackage.PRESENTATION__MARKER_END;
				case SvgPackage.CONTAINER__VISIBILITY: return SvgPackage.PRESENTATION__VISIBILITY;
				case SvgPackage.CONTAINER__CLIP_PATH: return SvgPackage.PRESENTATION__CLIP_PATH;
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
				case SvgPackage.PRESENTATION__FILL: return SvgPackage.CONTAINER__FILL;
				case SvgPackage.PRESENTATION__FILL_OPACITY: return SvgPackage.CONTAINER__FILL_OPACITY;
				case SvgPackage.PRESENTATION__STROKE: return SvgPackage.CONTAINER__STROKE;
				case SvgPackage.PRESENTATION__STROKE_WIDTH: return SvgPackage.CONTAINER__STROKE_WIDTH;
				case SvgPackage.PRESENTATION__STROKE_OPACITY: return SvgPackage.CONTAINER__STROKE_OPACITY;
				case SvgPackage.PRESENTATION__STROKE_DASHARRAY: return SvgPackage.CONTAINER__STROKE_DASHARRAY;
				case SvgPackage.PRESENTATION__STROKE_LINECAP: return SvgPackage.CONTAINER__STROKE_LINECAP;
				case SvgPackage.PRESENTATION__STROKE_LINEJOIN: return SvgPackage.CONTAINER__STROKE_LINEJOIN;
				case SvgPackage.PRESENTATION__OPACITY: return SvgPackage.CONTAINER__OPACITY;
				case SvgPackage.PRESENTATION__FONT_FAMILY: return SvgPackage.CONTAINER__FONT_FAMILY;
				case SvgPackage.PRESENTATION__FONT_SIZE: return SvgPackage.CONTAINER__FONT_SIZE;
				case SvgPackage.PRESENTATION__FONT_WEIGHT: return SvgPackage.CONTAINER__FONT_WEIGHT;
				case SvgPackage.PRESENTATION__FONT_STYLE: return SvgPackage.CONTAINER__FONT_STYLE;
				case SvgPackage.PRESENTATION__TEXT_ANCHOR: return SvgPackage.CONTAINER__TEXT_ANCHOR;
				case SvgPackage.PRESENTATION__DOMINANT_BASELINE: return SvgPackage.CONTAINER__DOMINANT_BASELINE;
				case SvgPackage.PRESENTATION__MARKER_START: return SvgPackage.CONTAINER__MARKER_START;
				case SvgPackage.PRESENTATION__MARKER_MID: return SvgPackage.CONTAINER__MARKER_MID;
				case SvgPackage.PRESENTATION__MARKER_END: return SvgPackage.CONTAINER__MARKER_END;
				case SvgPackage.PRESENTATION__VISIBILITY: return SvgPackage.CONTAINER__VISIBILITY;
				case SvgPackage.PRESENTATION__CLIP_PATH: return SvgPackage.CONTAINER__CLIP_PATH;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SvgPackage.CONTAINER___ADD__ELEMENT:
				return add((Element)arguments.get(0));
			case SvgPackage.CONTAINER___CHILDREN:
				return children();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerImpl
