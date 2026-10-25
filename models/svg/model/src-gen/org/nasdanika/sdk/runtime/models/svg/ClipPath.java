/**
 */
package org.nasdanika.sdk.runtime.models.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A clip path: its children are the region that clips what refers to it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.ClipPath#getClipPathUnits <em>Clip Path Units</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getClipPath()
 * @model extendedMetaData="name='clipPath' kind='elementOnly'"
 * @generated
 */
public interface ClipPath extends Container {
	/**
	 * Returns the value of the '<em><b>Clip Path Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Path Units</em>' attribute.
	 * @see #setClipPathUnits(String)
	 * @see org.nasdanika.sdk.runtime.models.svg.SvgPackage#getClipPath_ClipPathUnits()
	 * @model unique="false"
	 *        extendedMetaData="kind='attribute' name='clipPathUnits'"
	 * @generated
	 */
	String getClipPathUnits();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.svg.ClipPath#getClipPathUnits <em>Clip Path Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Path Units</em>' attribute.
	 * @see #getClipPathUnits()
	 * @generated
	 */
	void setClipPathUnits(String value);

} // ClipPath
