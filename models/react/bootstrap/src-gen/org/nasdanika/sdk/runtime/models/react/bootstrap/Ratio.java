/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio#getAspectRatio <em>Aspect Ratio</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRatio()
 * @model annotation="urn:org.nasdanika:react component='Ratio'"
 * @generated
 */
public interface Ratio extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Aspect Ratio</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Ratio</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio
	 * @see #isSetAspectRatio()
	 * @see #unsetAspectRatio()
	 * @see #setAspectRatio(AspectRatio)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage#getRatio_AspectRatio()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	AspectRatio getAspectRatio();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio#getAspectRatio <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Ratio</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.AspectRatio
	 * @see #isSetAspectRatio()
	 * @see #unsetAspectRatio()
	 * @see #getAspectRatio()
	 * @generated
	 */
	void setAspectRatio(AspectRatio value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio#getAspectRatio <em>Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAspectRatio()
	 * @see #getAspectRatio()
	 * @see #setAspectRatio(AspectRatio)
	 * @generated
	 */
	void unsetAspectRatio();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.Ratio#getAspectRatio <em>Aspect Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aspect Ratio</em>' attribute is set.
	 * @see #unsetAspectRatio()
	 * @see #getAspectRatio()
	 * @see #setAspectRatio(AspectRatio)
	 * @generated
	 */
	boolean isSetAspectRatio();

} // Ratio
