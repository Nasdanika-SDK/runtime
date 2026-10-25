/**
 */
package org.nasdanika.sdk.runtime.models.presentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isBold <em>Bold</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getHyperlink <em>Hyperlink</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun()
 * @model
 * @generated
 */
public interface TextRun extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_FontFamily()
	 * @model unique="false"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontFamily <em>Font Family</em>}' attribute.
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
	 * @see #setFontSize(double)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_FontSize()
	 * @model unique="false"
	 * @generated
	 */
	double getFontSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(double value);

	/**
	 * Returns the value of the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bold</em>' attribute.
	 * @see #setBold(boolean)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_Bold()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBold();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isBold <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bold</em>' attribute.
	 * @see #isBold()
	 * @generated
	 */
	void setBold(boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(boolean)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_Italic()
	 * @model unique="false"
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(boolean)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_Underline()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  #RRGGBB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlink</em>' attribute.
	 * @see #setHyperlink(String)
	 * @see org.nasdanika.sdk.runtime.models.presentation.PresentationPackage#getTextRun_Hyperlink()
	 * @model unique="false"
	 * @generated
	 */
	String getHyperlink();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.presentation.TextRun#getHyperlink <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink</em>' attribute.
	 * @see #getHyperlink()
	 * @generated
	 */
	void setHyperlink(String value);

} // TextRun
