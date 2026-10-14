/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Size;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormLabelImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormLabelImpl#getHtmlFor <em>Html For</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormLabelImpl#isColumn <em>Column</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormLabelImpl#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormLabelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormLabelImpl#isVisuallyHidden <em>Visually Hidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormLabelImpl extends BootstrapElementImpl implements FormLabel {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHtmlFor() <em>Html For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlFor()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_FOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColumn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLUMN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SM;

	/**
	 * The default value of the '{@link #isVisuallyHidden() <em>Visually Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisuallyHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISUALLY_HIDDEN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(FormsPackage.FORM_LABEL__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(FormsPackage.FORM_LABEL__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtmlFor() {
		return (String)eDynamicGet(FormsPackage.FORM_LABEL__HTML_FOR, FormsPackage.Literals.FORM_LABEL__HTML_FOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlFor(String newHtmlFor) {
		eDynamicSet(FormsPackage.FORM_LABEL__HTML_FOR, FormsPackage.Literals.FORM_LABEL__HTML_FOR, newHtmlFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isColumn() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_LABEL__COLUMN, FormsPackage.Literals.FORM_LABEL__COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(boolean newColumn) {
		eDynamicSet(FormsPackage.FORM_LABEL__COLUMN, FormsPackage.Literals.FORM_LABEL__COLUMN, newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ColumnSize> getSizes() {
		return (EList<ColumnSize>)eDynamicGet(FormsPackage.FORM_LABEL__SIZES, FormsPackage.Literals.FORM_LABEL__SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return (Size)eDynamicGet(FormsPackage.FORM_LABEL__SIZE, FormsPackage.Literals.FORM_LABEL__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		eDynamicSet(FormsPackage.FORM_LABEL__SIZE, FormsPackage.Literals.FORM_LABEL__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(FormsPackage.FORM_LABEL__SIZE, FormsPackage.Literals.FORM_LABEL__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(FormsPackage.FORM_LABEL__SIZE, FormsPackage.Literals.FORM_LABEL__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisuallyHidden() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_LABEL__VISUALLY_HIDDEN, FormsPackage.Literals.FORM_LABEL__VISUALLY_HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisuallyHidden(boolean newVisuallyHidden) {
		eDynamicSet(FormsPackage.FORM_LABEL__VISUALLY_HIDDEN, FormsPackage.Literals.FORM_LABEL__VISUALLY_HIDDEN, newVisuallyHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.FORM_LABEL__SIZES:
				return ((InternalEList<?>)getSizes()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.FORM_LABEL__CONTENT:
				return getContent();
			case FormsPackage.FORM_LABEL__HTML_FOR:
				return getHtmlFor();
			case FormsPackage.FORM_LABEL__COLUMN:
				return isColumn();
			case FormsPackage.FORM_LABEL__SIZES:
				return getSizes();
			case FormsPackage.FORM_LABEL__SIZE:
				return getSize();
			case FormsPackage.FORM_LABEL__VISUALLY_HIDDEN:
				return isVisuallyHidden();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormsPackage.FORM_LABEL__CONTENT:
				setContent((String)newValue);
				return;
			case FormsPackage.FORM_LABEL__HTML_FOR:
				setHtmlFor((String)newValue);
				return;
			case FormsPackage.FORM_LABEL__COLUMN:
				setColumn((Boolean)newValue);
				return;
			case FormsPackage.FORM_LABEL__SIZES:
				getSizes().clear();
				getSizes().addAll((Collection<? extends ColumnSize>)newValue);
				return;
			case FormsPackage.FORM_LABEL__SIZE:
				setSize((Size)newValue);
				return;
			case FormsPackage.FORM_LABEL__VISUALLY_HIDDEN:
				setVisuallyHidden((Boolean)newValue);
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
			case FormsPackage.FORM_LABEL__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case FormsPackage.FORM_LABEL__HTML_FOR:
				setHtmlFor(HTML_FOR_EDEFAULT);
				return;
			case FormsPackage.FORM_LABEL__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case FormsPackage.FORM_LABEL__SIZES:
				getSizes().clear();
				return;
			case FormsPackage.FORM_LABEL__SIZE:
				unsetSize();
				return;
			case FormsPackage.FORM_LABEL__VISUALLY_HIDDEN:
				setVisuallyHidden(VISUALLY_HIDDEN_EDEFAULT);
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
			case FormsPackage.FORM_LABEL__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case FormsPackage.FORM_LABEL__HTML_FOR:
				return HTML_FOR_EDEFAULT == null ? getHtmlFor() != null : !HTML_FOR_EDEFAULT.equals(getHtmlFor());
			case FormsPackage.FORM_LABEL__COLUMN:
				return isColumn() != COLUMN_EDEFAULT;
			case FormsPackage.FORM_LABEL__SIZES:
				return !getSizes().isEmpty();
			case FormsPackage.FORM_LABEL__SIZE:
				return isSetSize();
			case FormsPackage.FORM_LABEL__VISUALLY_HIDDEN:
				return isVisuallyHidden() != VISUALLY_HIDDEN_EDEFAULT;
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
		if (baseClass == TextContent.class) {
			switch (derivedFeatureID) {
				case FormsPackage.FORM_LABEL__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
		if (baseClass == TextContent.class) {
			switch (baseFeatureID) {
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return FormsPackage.FORM_LABEL__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormLabelImpl
