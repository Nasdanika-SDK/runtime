/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carousel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isIndicators <em>Indicators</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isFade <em>Fade</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel()
 * @model annotation="urn:org.nasdanika:react component='Carousel'"
 * @generated
 */
public interface Carousel extends BootstrapComponent {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' attribute.
	 * @see #isSetControls()
	 * @see #unsetControls()
	 * @see #setControls(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel_Controls()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isControls();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isControls <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls</em>' attribute.
	 * @see #isSetControls()
	 * @see #unsetControls()
	 * @see #isControls()
	 * @generated
	 */
	void setControls(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isControls <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControls()
	 * @see #isControls()
	 * @see #setControls(boolean)
	 * @generated
	 */
	void unsetControls();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isControls <em>Controls</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controls</em>' attribute is set.
	 * @see #unsetControls()
	 * @see #isControls()
	 * @see #setControls(boolean)
	 * @generated
	 */
	boolean isSetControls();

	/**
	 * Returns the value of the '<em><b>Indicators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicators</em>' attribute.
	 * @see #isSetIndicators()
	 * @see #unsetIndicators()
	 * @see #setIndicators(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel_Indicators()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isIndicators();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isIndicators <em>Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicators</em>' attribute.
	 * @see #isSetIndicators()
	 * @see #unsetIndicators()
	 * @see #isIndicators()
	 * @generated
	 */
	void setIndicators(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isIndicators <em>Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicators()
	 * @see #isIndicators()
	 * @see #setIndicators(boolean)
	 * @generated
	 */
	void unsetIndicators();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isIndicators <em>Indicators</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicators</em>' attribute is set.
	 * @see #unsetIndicators()
	 * @see #isIndicators()
	 * @see #setIndicators(boolean)
	 * @generated
	 */
	boolean isSetIndicators();

	/**
	 * Returns the value of the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fade</em>' attribute.
	 * @see #setFade(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel_Fade()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFade();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#isFade <em>Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade</em>' attribute.
	 * @see #isFade()
	 * @generated
	 */
	void setFade(boolean value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Milliseconds between slides
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #isSetInterval()
	 * @see #unsetInterval()
	 * @see #setInterval(int)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel_Interval()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #isSetInterval()
	 * @see #unsetInterval()
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterval()
	 * @see #getInterval()
	 * @see #setInterval(int)
	 * @generated
	 */
	void unsetInterval();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getInterval <em>Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval</em>' attribute is set.
	 * @see #unsetInterval()
	 * @see #getInterval()
	 * @see #setInterval(int)
	 * @generated
	 */
	boolean isSetInterval();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CarouselVariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CarouselVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(CarouselVariant)
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel_Variant()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	CarouselVariant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CarouselVariant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(CarouselVariant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(CarouselVariant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Carousel#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(CarouselVariant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.CarouselItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage#getCarousel_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarouselItem> getItems();

} // Carousel
