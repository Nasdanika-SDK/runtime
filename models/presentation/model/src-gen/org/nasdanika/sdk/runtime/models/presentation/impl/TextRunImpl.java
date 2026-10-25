/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.TextRun;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextRunImpl#getHyperlink <em>Hyperlink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextRunImpl extends MinimalEObjectImpl.Container implements TextRun {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

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
	protected static final double FONT_SIZE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.TEXT_RUN;
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
	public String getText() {
		return (String)eDynamicGet(PresentationPackage.TEXT_RUN__TEXT, PresentationPackage.Literals.TEXT_RUN__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(PresentationPackage.TEXT_RUN__TEXT, PresentationPackage.Literals.TEXT_RUN__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return (String)eDynamicGet(PresentationPackage.TEXT_RUN__FONT_FAMILY, PresentationPackage.Literals.TEXT_RUN__FONT_FAMILY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		eDynamicSet(PresentationPackage.TEXT_RUN__FONT_FAMILY, PresentationPackage.Literals.TEXT_RUN__FONT_FAMILY, newFontFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFontSize() {
		return (Double)eDynamicGet(PresentationPackage.TEXT_RUN__FONT_SIZE, PresentationPackage.Literals.TEXT_RUN__FONT_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(double newFontSize) {
		eDynamicSet(PresentationPackage.TEXT_RUN__FONT_SIZE, PresentationPackage.Literals.TEXT_RUN__FONT_SIZE, newFontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return (Boolean)eDynamicGet(PresentationPackage.TEXT_RUN__BOLD, PresentationPackage.Literals.TEXT_RUN__BOLD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		eDynamicSet(PresentationPackage.TEXT_RUN__BOLD, PresentationPackage.Literals.TEXT_RUN__BOLD, newBold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return (Boolean)eDynamicGet(PresentationPackage.TEXT_RUN__ITALIC, PresentationPackage.Literals.TEXT_RUN__ITALIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		eDynamicSet(PresentationPackage.TEXT_RUN__ITALIC, PresentationPackage.Literals.TEXT_RUN__ITALIC, newItalic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderline() {
		return (Boolean)eDynamicGet(PresentationPackage.TEXT_RUN__UNDERLINE, PresentationPackage.Literals.TEXT_RUN__UNDERLINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(boolean newUnderline) {
		eDynamicSet(PresentationPackage.TEXT_RUN__UNDERLINE, PresentationPackage.Literals.TEXT_RUN__UNDERLINE, newUnderline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return (String)eDynamicGet(PresentationPackage.TEXT_RUN__COLOR, PresentationPackage.Literals.TEXT_RUN__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		eDynamicSet(PresentationPackage.TEXT_RUN__COLOR, PresentationPackage.Literals.TEXT_RUN__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlink() {
		return (String)eDynamicGet(PresentationPackage.TEXT_RUN__HYPERLINK, PresentationPackage.Literals.TEXT_RUN__HYPERLINK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlink(String newHyperlink) {
		eDynamicSet(PresentationPackage.TEXT_RUN__HYPERLINK, PresentationPackage.Literals.TEXT_RUN__HYPERLINK, newHyperlink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.TEXT_RUN__TEXT:
				return getText();
			case PresentationPackage.TEXT_RUN__FONT_FAMILY:
				return getFontFamily();
			case PresentationPackage.TEXT_RUN__FONT_SIZE:
				return getFontSize();
			case PresentationPackage.TEXT_RUN__BOLD:
				return isBold();
			case PresentationPackage.TEXT_RUN__ITALIC:
				return isItalic();
			case PresentationPackage.TEXT_RUN__UNDERLINE:
				return isUnderline();
			case PresentationPackage.TEXT_RUN__COLOR:
				return getColor();
			case PresentationPackage.TEXT_RUN__HYPERLINK:
				return getHyperlink();
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
			case PresentationPackage.TEXT_RUN__TEXT:
				setText((String)newValue);
				return;
			case PresentationPackage.TEXT_RUN__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case PresentationPackage.TEXT_RUN__FONT_SIZE:
				setFontSize((Double)newValue);
				return;
			case PresentationPackage.TEXT_RUN__BOLD:
				setBold((Boolean)newValue);
				return;
			case PresentationPackage.TEXT_RUN__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case PresentationPackage.TEXT_RUN__UNDERLINE:
				setUnderline((Boolean)newValue);
				return;
			case PresentationPackage.TEXT_RUN__COLOR:
				setColor((String)newValue);
				return;
			case PresentationPackage.TEXT_RUN__HYPERLINK:
				setHyperlink((String)newValue);
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
			case PresentationPackage.TEXT_RUN__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case PresentationPackage.TEXT_RUN__HYPERLINK:
				setHyperlink(HYPERLINK_EDEFAULT);
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
			case PresentationPackage.TEXT_RUN__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case PresentationPackage.TEXT_RUN__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? getFontFamily() != null : !FONT_FAMILY_EDEFAULT.equals(getFontFamily());
			case PresentationPackage.TEXT_RUN__FONT_SIZE:
				return getFontSize() != FONT_SIZE_EDEFAULT;
			case PresentationPackage.TEXT_RUN__BOLD:
				return isBold() != BOLD_EDEFAULT;
			case PresentationPackage.TEXT_RUN__ITALIC:
				return isItalic() != ITALIC_EDEFAULT;
			case PresentationPackage.TEXT_RUN__UNDERLINE:
				return isUnderline() != UNDERLINE_EDEFAULT;
			case PresentationPackage.TEXT_RUN__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case PresentationPackage.TEXT_RUN__HYPERLINK:
				return HYPERLINK_EDEFAULT == null ? getHyperlink() != null : !HYPERLINK_EDEFAULT.equals(getHyperlink());
		}
		return super.eIsSet(featureID);
	}

} //TextRunImpl
