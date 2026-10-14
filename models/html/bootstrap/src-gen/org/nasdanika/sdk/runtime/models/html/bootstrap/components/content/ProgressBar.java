/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A progress bar, or a stacked progress bar of bars.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getNow <em>Now</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isVisuallyHidden <em>Visually Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isAnimated <em>Animated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar()
 * @model annotation="urn:org.nasdanika:html tag='div' classes='progress'"
 * @generated
 */
public interface ProgressBar extends BootstrapElement {
	/**
	 * Returns the value of the '<em><b>Now</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Now</em>' attribute.
	 * @see #isSetNow()
	 * @see #unsetNow()
	 * @see #setNow(int)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Now()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	int getNow();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getNow <em>Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Now</em>' attribute.
	 * @see #isSetNow()
	 * @see #unsetNow()
	 * @see #getNow()
	 * @generated
	 */
	void setNow(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getNow <em>Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNow()
	 * @see #getNow()
	 * @see #setNow(int)
	 * @generated
	 */
	void unsetNow();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getNow <em>Now</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Now</em>' attribute is set.
	 * @see #unsetNow()
	 * @see #getNow()
	 * @see #setNow(int)
	 * @generated
	 */
	boolean isSetNow();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(int)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Min()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(int)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(int)
	 * @generated
	 */
	boolean isSetMin();

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(int)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Max()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(int)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(int)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Label()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Visually Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visually Hidden</em>' attribute.
	 * @see #setVisuallyHidden(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_VisuallyHidden()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isVisuallyHidden();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isVisuallyHidden <em>Visually Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visually Hidden</em>' attribute.
	 * @see #isVisuallyHidden()
	 * @generated
	 */
	void setVisuallyHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.html.bootstrap.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #setVariant(Variant)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Variant()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	Variant getVariant();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.Variant
	 * @see #isSetVariant()
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @generated
	 */
	void setVariant(Variant value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getVariant <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	void unsetVariant();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#getVariant <em>Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Variant</em>' attribute is set.
	 * @see #unsetVariant()
	 * @see #getVariant()
	 * @see #setVariant(Variant)
	 * @generated
	 */
	boolean isSetVariant();

	/**
	 * Returns the value of the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Striped</em>' attribute.
	 * @see #setStriped(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Striped()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isStriped();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isStriped <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Striped</em>' attribute.
	 * @see #isStriped()
	 * @generated
	 */
	void setStriped(boolean value);

	/**
	 * Returns the value of the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animated</em>' attribute.
	 * @see #setAnimated(boolean)
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Animated()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:html logical='true'"
	 * @generated
	 */
	boolean isAnimated();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animated</em>' attribute.
	 * @see #isAnimated()
	 * @generated
	 */
	void setAnimated(boolean value);

	/**
	 * Returns the value of the '<em><b>Bars</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Bars of a stacked progress bar, each with now
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bars</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage#getProgressBar_Bars()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgressBar> getBars();

} // ProgressBar
