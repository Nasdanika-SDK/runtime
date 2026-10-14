/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#isModule <em>Module</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#isDefer <em>Defer</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#getCrossorigin <em>Crossorigin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ScriptImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends ElementImpl implements Script {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModule()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODULE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDefer() <em>Defer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCrossorigin() <em>Crossorigin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossorigin()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSSORIGIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRITY_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return (String)eDynamicGet(HtmlPackage.SCRIPT__SRC, HtmlPackage.Literals.SCRIPT__SRC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		eDynamicSet(HtmlPackage.SCRIPT__SRC, HtmlPackage.Literals.SCRIPT__SRC, newSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(HtmlPackage.SCRIPT__TYPE, HtmlPackage.Literals.SCRIPT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(HtmlPackage.SCRIPT__TYPE, HtmlPackage.Literals.SCRIPT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModule() {
		return (Boolean)eDynamicGet(HtmlPackage.SCRIPT__MODULE, HtmlPackage.Literals.SCRIPT__MODULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(boolean newModule) {
		eDynamicSet(HtmlPackage.SCRIPT__MODULE, HtmlPackage.Literals.SCRIPT__MODULE, newModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsync() {
		return (Boolean)eDynamicGet(HtmlPackage.SCRIPT__ASYNC, HtmlPackage.Literals.SCRIPT__ASYNC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsync(boolean newAsync) {
		eDynamicSet(HtmlPackage.SCRIPT__ASYNC, HtmlPackage.Literals.SCRIPT__ASYNC, newAsync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefer() {
		return (Boolean)eDynamicGet(HtmlPackage.SCRIPT__DEFER, HtmlPackage.Literals.SCRIPT__DEFER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefer(boolean newDefer) {
		eDynamicSet(HtmlPackage.SCRIPT__DEFER, HtmlPackage.Literals.SCRIPT__DEFER, newDefer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrossorigin() {
		return (String)eDynamicGet(HtmlPackage.SCRIPT__CROSSORIGIN, HtmlPackage.Literals.SCRIPT__CROSSORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossorigin(String newCrossorigin) {
		eDynamicSet(HtmlPackage.SCRIPT__CROSSORIGIN, HtmlPackage.Literals.SCRIPT__CROSSORIGIN, newCrossorigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrity() {
		return (String)eDynamicGet(HtmlPackage.SCRIPT__INTEGRITY, HtmlPackage.Literals.SCRIPT__INTEGRITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrity(String newIntegrity) {
		eDynamicSet(HtmlPackage.SCRIPT__INTEGRITY, HtmlPackage.Literals.SCRIPT__INTEGRITY, newIntegrity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(HtmlPackage.SCRIPT__CONTENT, HtmlPackage.Literals.SCRIPT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(HtmlPackage.SCRIPT__CONTENT, HtmlPackage.Literals.SCRIPT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "script";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.SCRIPT__SRC:
				return getSrc();
			case HtmlPackage.SCRIPT__TYPE:
				return getType();
			case HtmlPackage.SCRIPT__MODULE:
				return isModule();
			case HtmlPackage.SCRIPT__ASYNC:
				return isAsync();
			case HtmlPackage.SCRIPT__DEFER:
				return isDefer();
			case HtmlPackage.SCRIPT__CROSSORIGIN:
				return getCrossorigin();
			case HtmlPackage.SCRIPT__INTEGRITY:
				return getIntegrity();
			case HtmlPackage.SCRIPT__CONTENT:
				return getContent();
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
			case HtmlPackage.SCRIPT__SRC:
				setSrc((String)newValue);
				return;
			case HtmlPackage.SCRIPT__TYPE:
				setType((String)newValue);
				return;
			case HtmlPackage.SCRIPT__MODULE:
				setModule((Boolean)newValue);
				return;
			case HtmlPackage.SCRIPT__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case HtmlPackage.SCRIPT__DEFER:
				setDefer((Boolean)newValue);
				return;
			case HtmlPackage.SCRIPT__CROSSORIGIN:
				setCrossorigin((String)newValue);
				return;
			case HtmlPackage.SCRIPT__INTEGRITY:
				setIntegrity((String)newValue);
				return;
			case HtmlPackage.SCRIPT__CONTENT:
				setContent((String)newValue);
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
			case HtmlPackage.SCRIPT__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__DEFER:
				setDefer(DEFER_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__CROSSORIGIN:
				setCrossorigin(CROSSORIGIN_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__INTEGRITY:
				setIntegrity(INTEGRITY_EDEFAULT);
				return;
			case HtmlPackage.SCRIPT__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case HtmlPackage.SCRIPT__SRC:
				return SRC_EDEFAULT == null ? getSrc() != null : !SRC_EDEFAULT.equals(getSrc());
			case HtmlPackage.SCRIPT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case HtmlPackage.SCRIPT__MODULE:
				return isModule() != MODULE_EDEFAULT;
			case HtmlPackage.SCRIPT__ASYNC:
				return isAsync() != ASYNC_EDEFAULT;
			case HtmlPackage.SCRIPT__DEFER:
				return isDefer() != DEFER_EDEFAULT;
			case HtmlPackage.SCRIPT__CROSSORIGIN:
				return CROSSORIGIN_EDEFAULT == null ? getCrossorigin() != null : !CROSSORIGIN_EDEFAULT.equals(getCrossorigin());
			case HtmlPackage.SCRIPT__INTEGRITY:
				return INTEGRITY_EDEFAULT == null ? getIntegrity() != null : !INTEGRITY_EDEFAULT.equals(getIntegrity());
			case HtmlPackage.SCRIPT__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
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
			case HtmlPackage.SCRIPT___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScriptImpl
