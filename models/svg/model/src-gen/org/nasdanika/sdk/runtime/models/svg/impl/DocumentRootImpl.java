/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.svg.A;
import org.nasdanika.sdk.runtime.models.svg.Circle;
import org.nasdanika.sdk.runtime.models.svg.ClipPath;
import org.nasdanika.sdk.runtime.models.svg.Defs;
import org.nasdanika.sdk.runtime.models.svg.Desc;
import org.nasdanika.sdk.runtime.models.svg.DocumentRoot;
import org.nasdanika.sdk.runtime.models.svg.Ellipse;
import org.nasdanika.sdk.runtime.models.svg.G;
import org.nasdanika.sdk.runtime.models.svg.Image;
import org.nasdanika.sdk.runtime.models.svg.Line;
import org.nasdanika.sdk.runtime.models.svg.LinearGradient;
import org.nasdanika.sdk.runtime.models.svg.Marker;
import org.nasdanika.sdk.runtime.models.svg.Path;
import org.nasdanika.sdk.runtime.models.svg.Polygon;
import org.nasdanika.sdk.runtime.models.svg.Polyline;
import org.nasdanika.sdk.runtime.models.svg.Rect;
import org.nasdanika.sdk.runtime.models.svg.Stop;
import org.nasdanika.sdk.runtime.models.svg.Style;
import org.nasdanika.sdk.runtime.models.svg.Svg;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;
import org.nasdanika.sdk.runtime.models.svg.TSpan;
import org.nasdanika.sdk.runtime.models.svg.Text;
import org.nasdanika.sdk.runtime.models.svg.Title;
import org.nasdanika.sdk.runtime.models.svg.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getSvg <em>Svg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getG <em>G</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getA <em>A</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getTspan <em>Tspan</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getLinearGradient <em>Linear Gradient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.DocumentRootImpl#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		return (FeatureMap)eDynamicGet(SvgPackage.DOCUMENT_ROOT__MIXED, SvgPackage.Literals.DOCUMENT_ROOT__MIXED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getXMLNSPrefixMap() {
		return (EMap<String, String>)eDynamicGet(SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP, SvgPackage.Literals.DOCUMENT_ROOT__XMLNS_PREFIX_MAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getXSISchemaLocation() {
		return (EMap<String, String>)eDynamicGet(SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION, SvgPackage.Literals.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Svg getSvg() {
		return (Svg)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__SVG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvg(Svg newSvg, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSvg, SvgPackage.DOCUMENT_ROOT__SVG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvg(Svg newSvg) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__SVG, newSvg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public G getG() {
		return (G)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG(G newG, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newG, SvgPackage.DOCUMENT_ROOT__G, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(G newG) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__G, newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Defs getDefs() {
		return (Defs)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__DEFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefs(Defs newDefs, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDefs, SvgPackage.DOCUMENT_ROOT__DEFS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefs(Defs newDefs) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__DEFS, newDefs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A getA() {
		return (A)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__A, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA(A newA, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newA, SvgPackage.DOCUMENT_ROOT__A, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(A newA) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__A, newA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title getTitle() {
		return (Title)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTitle, SvgPackage.DOCUMENT_ROOT__TITLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Title newTitle) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desc getDesc() {
		return (Desc)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesc(Desc newDesc, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDesc, SvgPackage.DOCUMENT_ROOT__DESC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(Desc newDesc) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__DESC, newDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style getStyle() {
		return (Style)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStyle, SvgPackage.DOCUMENT_ROOT__STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(Style newStyle) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rect getRect() {
		return (Rect)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__RECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRect(Rect newRect, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRect, SvgPackage.DOCUMENT_ROOT__RECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRect(Rect newRect) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__RECT, newRect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle getCircle() {
		return (Circle)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__CIRCLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircle(Circle newCircle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCircle, SvgPackage.DOCUMENT_ROOT__CIRCLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircle(Circle newCircle) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__CIRCLE, newCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse getEllipse() {
		return (Ellipse)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__ELLIPSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipse(Ellipse newEllipse, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEllipse, SvgPackage.DOCUMENT_ROOT__ELLIPSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipse(Ellipse newEllipse) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__ELLIPSE, newEllipse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line getLine() {
		return (Line)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__LINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(Line newLine, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLine, SvgPackage.DOCUMENT_ROOT__LINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Line newLine) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__LINE, newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline getPolyline() {
		return (Polyline)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__POLYLINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyline(Polyline newPolyline, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPolyline, SvgPackage.DOCUMENT_ROOT__POLYLINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyline(Polyline newPolyline) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__POLYLINE, newPolyline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon getPolygon() {
		return (Polygon)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__POLYGON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(Polygon newPolygon, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPolygon, SvgPackage.DOCUMENT_ROOT__POLYGON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygon(Polygon newPolygon) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__POLYGON, newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getPath() {
		return (Path)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Path newPath, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPath, SvgPackage.DOCUMENT_ROOT__PATH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(Path newPath) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		return (Text)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newText, SvgPackage.DOCUMENT_ROOT__TEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSpan getTspan() {
		return (TSpan)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__TSPAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTspan(TSpan newTspan, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTspan, SvgPackage.DOCUMENT_ROOT__TSPAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTspan(TSpan newTspan) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__TSPAN, newTspan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		return (Image)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Image newImage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImage, SvgPackage.DOCUMENT_ROOT__IMAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use getUse() {
		return (Use)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__USE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Use newUse, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUse, SvgPackage.DOCUMENT_ROOT__USE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Use newUse) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__USE, newUse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker getMarker() {
		return (Marker)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__MARKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarker(Marker newMarker, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMarker, SvgPackage.DOCUMENT_ROOT__MARKER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarker(Marker newMarker) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__MARKER, newMarker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipPath getClipPath() {
		return (ClipPath)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__CLIP_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClipPath(ClipPath newClipPath, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newClipPath, SvgPackage.DOCUMENT_ROOT__CLIP_PATH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipPath(ClipPath newClipPath) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__CLIP_PATH, newClipPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearGradient getLinearGradient() {
		return (LinearGradient)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__LINEAR_GRADIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearGradient(LinearGradient newLinearGradient, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLinearGradient, SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearGradient(LinearGradient newLinearGradient) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__LINEAR_GRADIENT, newLinearGradient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop getStop() {
		return (Stop)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__STOP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(Stop newStop, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStop, SvgPackage.DOCUMENT_ROOT__STOP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(Stop newStop) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__STOP, newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SvgPackage.DOCUMENT_ROOT__SVG:
				return basicSetSvg(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__G:
				return basicSetG(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__DEFS:
				return basicSetDefs(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__A:
				return basicSetA(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__DESC:
				return basicSetDesc(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__RECT:
				return basicSetRect(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__CIRCLE:
				return basicSetCircle(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__ELLIPSE:
				return basicSetEllipse(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__LINE:
				return basicSetLine(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__POLYLINE:
				return basicSetPolyline(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__PATH:
				return basicSetPath(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__TEXT:
				return basicSetText(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__TSPAN:
				return basicSetTspan(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__USE:
				return basicSetUse(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__MARKER:
				return basicSetMarker(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__CLIP_PATH:
				return basicSetClipPath(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				return basicSetLinearGradient(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__STOP:
				return basicSetStop(null, msgs);
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
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SvgPackage.DOCUMENT_ROOT__SVG:
				return getSvg();
			case SvgPackage.DOCUMENT_ROOT__G:
				return getG();
			case SvgPackage.DOCUMENT_ROOT__DEFS:
				return getDefs();
			case SvgPackage.DOCUMENT_ROOT__A:
				return getA();
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case SvgPackage.DOCUMENT_ROOT__DESC:
				return getDesc();
			case SvgPackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case SvgPackage.DOCUMENT_ROOT__RECT:
				return getRect();
			case SvgPackage.DOCUMENT_ROOT__CIRCLE:
				return getCircle();
			case SvgPackage.DOCUMENT_ROOT__ELLIPSE:
				return getEllipse();
			case SvgPackage.DOCUMENT_ROOT__LINE:
				return getLine();
			case SvgPackage.DOCUMENT_ROOT__POLYLINE:
				return getPolyline();
			case SvgPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case SvgPackage.DOCUMENT_ROOT__PATH:
				return getPath();
			case SvgPackage.DOCUMENT_ROOT__TEXT:
				return getText();
			case SvgPackage.DOCUMENT_ROOT__TSPAN:
				return getTspan();
			case SvgPackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case SvgPackage.DOCUMENT_ROOT__USE:
				return getUse();
			case SvgPackage.DOCUMENT_ROOT__MARKER:
				return getMarker();
			case SvgPackage.DOCUMENT_ROOT__CLIP_PATH:
				return getClipPath();
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				return getLinearGradient();
			case SvgPackage.DOCUMENT_ROOT__STOP:
				return getStop();
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
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__SVG:
				setSvg((Svg)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__G:
				setG((G)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__DEFS:
				setDefs((Defs)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__A:
				setA((A)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				setTitle((Title)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__DESC:
				setDesc((Desc)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STYLE:
				setStyle((Style)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__RECT:
				setRect((Rect)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__CIRCLE:
				setCircle((Circle)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__ELLIPSE:
				setEllipse((Ellipse)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__LINE:
				setLine((Line)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__POLYLINE:
				setPolyline((Polyline)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((Polygon)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__PATH:
				setPath((Path)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__TEXT:
				setText((Text)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__TSPAN:
				setTspan((TSpan)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__IMAGE:
				setImage((Image)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__USE:
				setUse((Use)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__MARKER:
				setMarker((Marker)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__CLIP_PATH:
				setClipPath((ClipPath)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				setLinearGradient((LinearGradient)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STOP:
				setStop((Stop)newValue);
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
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SvgPackage.DOCUMENT_ROOT__SVG:
				setSvg((Svg)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__G:
				setG((G)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__DEFS:
				setDefs((Defs)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__A:
				setA((A)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				setTitle((Title)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__DESC:
				setDesc((Desc)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__STYLE:
				setStyle((Style)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__RECT:
				setRect((Rect)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__CIRCLE:
				setCircle((Circle)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__ELLIPSE:
				setEllipse((Ellipse)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__LINE:
				setLine((Line)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__POLYLINE:
				setPolyline((Polyline)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((Polygon)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__PATH:
				setPath((Path)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__TEXT:
				setText((Text)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__TSPAN:
				setTspan((TSpan)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__IMAGE:
				setImage((Image)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__USE:
				setUse((Use)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__MARKER:
				setMarker((Marker)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__CLIP_PATH:
				setClipPath((ClipPath)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				setLinearGradient((LinearGradient)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__STOP:
				setStop((Stop)null);
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
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				return !getMixed().isEmpty();
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return !getXMLNSPrefixMap().isEmpty();
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return !getXSISchemaLocation().isEmpty();
			case SvgPackage.DOCUMENT_ROOT__SVG:
				return getSvg() != null;
			case SvgPackage.DOCUMENT_ROOT__G:
				return getG() != null;
			case SvgPackage.DOCUMENT_ROOT__DEFS:
				return getDefs() != null;
			case SvgPackage.DOCUMENT_ROOT__A:
				return getA() != null;
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case SvgPackage.DOCUMENT_ROOT__DESC:
				return getDesc() != null;
			case SvgPackage.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case SvgPackage.DOCUMENT_ROOT__RECT:
				return getRect() != null;
			case SvgPackage.DOCUMENT_ROOT__CIRCLE:
				return getCircle() != null;
			case SvgPackage.DOCUMENT_ROOT__ELLIPSE:
				return getEllipse() != null;
			case SvgPackage.DOCUMENT_ROOT__LINE:
				return getLine() != null;
			case SvgPackage.DOCUMENT_ROOT__POLYLINE:
				return getPolyline() != null;
			case SvgPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case SvgPackage.DOCUMENT_ROOT__PATH:
				return getPath() != null;
			case SvgPackage.DOCUMENT_ROOT__TEXT:
				return getText() != null;
			case SvgPackage.DOCUMENT_ROOT__TSPAN:
				return getTspan() != null;
			case SvgPackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case SvgPackage.DOCUMENT_ROOT__USE:
				return getUse() != null;
			case SvgPackage.DOCUMENT_ROOT__MARKER:
				return getMarker() != null;
			case SvgPackage.DOCUMENT_ROOT__CLIP_PATH:
				return getClipPath() != null;
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				return getLinearGradient() != null;
			case SvgPackage.DOCUMENT_ROOT__STOP:
				return getStop() != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentRootImpl
