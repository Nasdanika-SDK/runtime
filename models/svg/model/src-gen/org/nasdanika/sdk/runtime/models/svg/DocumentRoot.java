/**
 */
package org.nasdanika.sdk.runtime.models.svg;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ============================================================================
 * The document
 * ============================================================================
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getSvg <em>Svg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getG <em>G</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDefs <em>Defs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getA <em>A</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getRect <em>Rect</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLine <em>Line</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTspan <em>Tspan</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getUse <em>Use</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getClipPath <em>Clip Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLinearGradient <em>Linear Gradient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Svg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svg</em>' containment reference.
	 * @see #setSvg(Svg)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Svg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='svg' namespace='##targetNamespace'"
	 * @generated
	 */
	Svg getSvg();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getSvg <em>Svg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svg</em>' containment reference.
	 * @see #getSvg()
	 * @generated
	 */
	void setSvg(Svg value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' containment reference.
	 * @see #setG(G)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_G()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='g' namespace='##targetNamespace'"
	 * @generated
	 */
	G getG();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getG <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' containment reference.
	 * @see #getG()
	 * @generated
	 */
	void setG(G value);

	/**
	 * Returns the value of the '<em><b>Defs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defs</em>' containment reference.
	 * @see #setDefs(Defs)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Defs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='defs' namespace='##targetNamespace'"
	 * @generated
	 */
	Defs getDefs();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDefs <em>Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defs</em>' containment reference.
	 * @see #getDefs()
	 * @generated
	 */
	void setDefs(Defs value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(A)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_A()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace'"
	 * @generated
	 */
	A getA();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(A value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(Title)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Title getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Title value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' containment reference.
	 * @see #setDesc(Desc)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Desc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='desc' namespace='##targetNamespace'"
	 * @generated
	 */
	Desc getDesc();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getDesc <em>Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' containment reference.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(Desc value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Style)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	Style getStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Style value);

	/**
	 * Returns the value of the '<em><b>Rect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rect</em>' containment reference.
	 * @see #setRect(Rect)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Rect()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rect' namespace='##targetNamespace'"
	 * @generated
	 */
	Rect getRect();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getRect <em>Rect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rect</em>' containment reference.
	 * @see #getRect()
	 * @generated
	 */
	void setRect(Rect value);

	/**
	 * Returns the value of the '<em><b>Circle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circle</em>' containment reference.
	 * @see #setCircle(Circle)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Circle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='circle' namespace='##targetNamespace'"
	 * @generated
	 */
	Circle getCircle();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getCircle <em>Circle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circle</em>' containment reference.
	 * @see #getCircle()
	 * @generated
	 */
	void setCircle(Circle value);

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference.
	 * @see #setEllipse(Ellipse)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Ellipse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ellipse' namespace='##targetNamespace'"
	 * @generated
	 */
	Ellipse getEllipse();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getEllipse <em>Ellipse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipse</em>' containment reference.
	 * @see #getEllipse()
	 * @generated
	 */
	void setEllipse(Ellipse value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(Line)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Line()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace'"
	 * @generated
	 */
	Line getLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(Line value);

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference.
	 * @see #setPolyline(Polyline)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Polyline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polyline' namespace='##targetNamespace'"
	 * @generated
	 */
	Polyline getPolyline();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolyline <em>Polyline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyline</em>' containment reference.
	 * @see #getPolyline()
	 * @generated
	 */
	void setPolyline(Polyline value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(Polygon)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Polygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	Polygon getPolygon();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(Polygon value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Path)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Path()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Text()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Tspan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tspan</em>' containment reference.
	 * @see #setTspan(TSpan)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Tspan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tspan' namespace='##targetNamespace'"
	 * @generated
	 */
	TSpan getTspan();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getTspan <em>Tspan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tspan</em>' containment reference.
	 * @see #getTspan()
	 * @generated
	 */
	void setTspan(TSpan value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Image)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Image()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Use)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Use()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	Use getUse();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Use value);

	/**
	 * Returns the value of the '<em><b>Marker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' containment reference.
	 * @see #setMarker(Marker)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Marker()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='marker' namespace='##targetNamespace'"
	 * @generated
	 */
	Marker getMarker();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getMarker <em>Marker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' containment reference.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(Marker value);

	/**
	 * Returns the value of the '<em><b>Clip Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path</em>' containment reference.
	 * @see #setClipPath(ClipPath)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_ClipPath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='clipPath' namespace='##targetNamespace'"
	 * @generated
	 */
	ClipPath getClipPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getClipPath <em>Clip Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Path</em>' containment reference.
	 * @see #getClipPath()
	 * @generated
	 */
	void setClipPath(ClipPath value);

	/**
	 * Returns the value of the '<em><b>Linear Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Gradient</em>' containment reference.
	 * @see #setLinearGradient(LinearGradient)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_LinearGradient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linearGradient' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearGradient getLinearGradient();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getLinearGradient <em>Linear Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Gradient</em>' containment reference.
	 * @see #getLinearGradient()
	 * @generated
	 */
	void setLinearGradient(LinearGradient value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference.
	 * @see #setStop(Stop)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getDocumentRoot_Stop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	Stop getStop();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.DocumentRoot#getStop <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' containment reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(Stop value);

} // DocumentRoot
