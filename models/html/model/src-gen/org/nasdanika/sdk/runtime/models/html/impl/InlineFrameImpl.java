/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.InlineFrame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl#getAllow <em>Allow</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.InlineFrameImpl#getLoading <em>Loading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineFrameImpl extends ElementImpl implements InlineFrame {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

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
	 * The default value of the '{@link #getAllow() <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllow()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_EDEFAULT = null;

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
	protected InlineFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.INLINE_FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return (String)eDynamicGet(HtmlPackage.INLINE_FRAME__SRC, HtmlPackage.Literals.INLINE_FRAME__SRC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		eDynamicSet(HtmlPackage.INLINE_FRAME__SRC, HtmlPackage.Literals.INLINE_FRAME__SRC, newSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(HtmlPackage.INLINE_FRAME__TITLE, HtmlPackage.Literals.INLINE_FRAME__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(HtmlPackage.INLINE_FRAME__TITLE, HtmlPackage.Literals.INLINE_FRAME__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eDynamicGet(HtmlPackage.INLINE_FRAME__WIDTH, HtmlPackage.Literals.INLINE_FRAME__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eDynamicSet(HtmlPackage.INLINE_FRAME__WIDTH, HtmlPackage.Literals.INLINE_FRAME__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eDynamicGet(HtmlPackage.INLINE_FRAME__HEIGHT, HtmlPackage.Literals.INLINE_FRAME__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eDynamicSet(HtmlPackage.INLINE_FRAME__HEIGHT, HtmlPackage.Literals.INLINE_FRAME__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllow() {
		return (String)eDynamicGet(HtmlPackage.INLINE_FRAME__ALLOW, HtmlPackage.Literals.INLINE_FRAME__ALLOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllow(String newAllow) {
		eDynamicSet(HtmlPackage.INLINE_FRAME__ALLOW, HtmlPackage.Literals.INLINE_FRAME__ALLOW, newAllow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoading() {
		return (String)eDynamicGet(HtmlPackage.INLINE_FRAME__LOADING, HtmlPackage.Literals.INLINE_FRAME__LOADING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoading(String newLoading) {
		eDynamicSet(HtmlPackage.INLINE_FRAME__LOADING, HtmlPackage.Literals.INLINE_FRAME__LOADING, newLoading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "iframe";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.INLINE_FRAME__SRC:
				return getSrc();
			case HtmlPackage.INLINE_FRAME__TITLE:
				return getTitle();
			case HtmlPackage.INLINE_FRAME__WIDTH:
				return getWidth();
			case HtmlPackage.INLINE_FRAME__HEIGHT:
				return getHeight();
			case HtmlPackage.INLINE_FRAME__ALLOW:
				return getAllow();
			case HtmlPackage.INLINE_FRAME__LOADING:
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
			case HtmlPackage.INLINE_FRAME__SRC:
				setSrc((String)newValue);
				return;
			case HtmlPackage.INLINE_FRAME__TITLE:
				setTitle((String)newValue);
				return;
			case HtmlPackage.INLINE_FRAME__WIDTH:
				setWidth((Integer)newValue);
				return;
			case HtmlPackage.INLINE_FRAME__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case HtmlPackage.INLINE_FRAME__ALLOW:
				setAllow((String)newValue);
				return;
			case HtmlPackage.INLINE_FRAME__LOADING:
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
			case HtmlPackage.INLINE_FRAME__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case HtmlPackage.INLINE_FRAME__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case HtmlPackage.INLINE_FRAME__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HtmlPackage.INLINE_FRAME__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case HtmlPackage.INLINE_FRAME__ALLOW:
				setAllow(ALLOW_EDEFAULT);
				return;
			case HtmlPackage.INLINE_FRAME__LOADING:
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
			case HtmlPackage.INLINE_FRAME__SRC:
				return SRC_EDEFAULT == null ? getSrc() != null : !SRC_EDEFAULT.equals(getSrc());
			case HtmlPackage.INLINE_FRAME__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case HtmlPackage.INLINE_FRAME__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case HtmlPackage.INLINE_FRAME__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case HtmlPackage.INLINE_FRAME__ALLOW:
				return ALLOW_EDEFAULT == null ? getAllow() != null : !ALLOW_EDEFAULT.equals(getAllow());
			case HtmlPackage.INLINE_FRAME__LOADING:
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
			case HtmlPackage.INLINE_FRAME___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InlineFrameImpl
