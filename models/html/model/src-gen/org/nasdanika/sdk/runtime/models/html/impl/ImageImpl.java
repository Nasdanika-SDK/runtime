/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getSrcset <em>Srcset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ImageImpl#getLoading <em>Loading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends VoidElementImpl implements Image {
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSrcset() <em>Srcset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcset()
	 * @generated
	 * @ordered
	 */
	protected static final String SRCSET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSizes() <em>Sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizes()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLoading() <em>Loading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoading()
	 * @generated
	 * @ordered
	 */
	protected static final String LOADING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return (String)eDynamicGet(HtmlPackage.IMAGE__SRC, HtmlPackage.Literals.IMAGE__SRC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		eDynamicSet(HtmlPackage.IMAGE__SRC, HtmlPackage.Literals.IMAGE__SRC, newSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlt() {
		return (String)eDynamicGet(HtmlPackage.IMAGE__ALT, HtmlPackage.Literals.IMAGE__ALT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(String newAlt) {
		eDynamicSet(HtmlPackage.IMAGE__ALT, HtmlPackage.Literals.IMAGE__ALT, newAlt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcset() {
		return (String)eDynamicGet(HtmlPackage.IMAGE__SRCSET, HtmlPackage.Literals.IMAGE__SRCSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcset(String newSrcset) {
		eDynamicSet(HtmlPackage.IMAGE__SRCSET, HtmlPackage.Literals.IMAGE__SRCSET, newSrcset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSizes() {
		return (String)eDynamicGet(HtmlPackage.IMAGE__SIZES, HtmlPackage.Literals.IMAGE__SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizes(String newSizes) {
		eDynamicSet(HtmlPackage.IMAGE__SIZES, HtmlPackage.Literals.IMAGE__SIZES, newSizes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eDynamicGet(HtmlPackage.IMAGE__WIDTH, HtmlPackage.Literals.IMAGE__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eDynamicSet(HtmlPackage.IMAGE__WIDTH, HtmlPackage.Literals.IMAGE__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eDynamicGet(HtmlPackage.IMAGE__HEIGHT, HtmlPackage.Literals.IMAGE__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eDynamicSet(HtmlPackage.IMAGE__HEIGHT, HtmlPackage.Literals.IMAGE__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoading() {
		return (String)eDynamicGet(HtmlPackage.IMAGE__LOADING, HtmlPackage.Literals.IMAGE__LOADING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoading(String newLoading) {
		eDynamicSet(HtmlPackage.IMAGE__LOADING, HtmlPackage.Literals.IMAGE__LOADING, newLoading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "img";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.IMAGE__SRC:
				return getSrc();
			case HtmlPackage.IMAGE__ALT:
				return getAlt();
			case HtmlPackage.IMAGE__SRCSET:
				return getSrcset();
			case HtmlPackage.IMAGE__SIZES:
				return getSizes();
			case HtmlPackage.IMAGE__WIDTH:
				return getWidth();
			case HtmlPackage.IMAGE__HEIGHT:
				return getHeight();
			case HtmlPackage.IMAGE__LOADING:
				return getLoading();
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
			case HtmlPackage.IMAGE__SRC:
				setSrc((String)newValue);
				return;
			case HtmlPackage.IMAGE__ALT:
				setAlt((String)newValue);
				return;
			case HtmlPackage.IMAGE__SRCSET:
				setSrcset((String)newValue);
				return;
			case HtmlPackage.IMAGE__SIZES:
				setSizes((String)newValue);
				return;
			case HtmlPackage.IMAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case HtmlPackage.IMAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case HtmlPackage.IMAGE__LOADING:
				setLoading((String)newValue);
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
			case HtmlPackage.IMAGE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case HtmlPackage.IMAGE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case HtmlPackage.IMAGE__SRCSET:
				setSrcset(SRCSET_EDEFAULT);
				return;
			case HtmlPackage.IMAGE__SIZES:
				setSizes(SIZES_EDEFAULT);
				return;
			case HtmlPackage.IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HtmlPackage.IMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case HtmlPackage.IMAGE__LOADING:
				setLoading(LOADING_EDEFAULT);
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
			case HtmlPackage.IMAGE__SRC:
				return SRC_EDEFAULT == null ? getSrc() != null : !SRC_EDEFAULT.equals(getSrc());
			case HtmlPackage.IMAGE__ALT:
				return ALT_EDEFAULT == null ? getAlt() != null : !ALT_EDEFAULT.equals(getAlt());
			case HtmlPackage.IMAGE__SRCSET:
				return SRCSET_EDEFAULT == null ? getSrcset() != null : !SRCSET_EDEFAULT.equals(getSrcset());
			case HtmlPackage.IMAGE__SIZES:
				return SIZES_EDEFAULT == null ? getSizes() != null : !SIZES_EDEFAULT.equals(getSizes());
			case HtmlPackage.IMAGE__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case HtmlPackage.IMAGE__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case HtmlPackage.IMAGE__LOADING:
				return LOADING_EDEFAULT == null ? getLoading() != null : !LOADING_EDEFAULT.equals(getLoading());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HtmlPackage.IMAGE___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImageImpl
