/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ElementImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends NodeImpl implements Element {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(HtmlPackage.ELEMENT__ID, HtmlPackage.Literals.ELEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(HtmlPackage.ELEMENT__ID, HtmlPackage.Literals.ELEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getClasses() {
		return (EList<String>)eDynamicGet(HtmlPackage.ELEMENT__CLASSES, HtmlPackage.Literals.ELEMENT__CLASSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getStyle() {
		return (EMap<String, String>)eDynamicGet(HtmlPackage.ELEMENT__STYLE, HtmlPackage.Literals.ELEMENT__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getAttributes() {
		return (EMap<String, String>)eDynamicGet(HtmlPackage.ELEMENT__ATTRIBUTES, HtmlPackage.Literals.ELEMENT__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.ELEMENT__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case HtmlPackage.ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.ELEMENT__ID:
				return getId();
			case HtmlPackage.ELEMENT__CLASSES:
				return getClasses();
			case HtmlPackage.ELEMENT__STYLE:
				if (coreType) return getStyle();
				else return getStyle().map();
			case HtmlPackage.ELEMENT__ATTRIBUTES:
				if (coreType) return getAttributes();
				else return getAttributes().map();
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
			case HtmlPackage.ELEMENT__ID:
				setId((String)newValue);
				return;
			case HtmlPackage.ELEMENT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends String>)newValue);
				return;
			case HtmlPackage.ELEMENT__STYLE:
				((EStructuralFeature.Setting)getStyle()).set(newValue);
				return;
			case HtmlPackage.ELEMENT__ATTRIBUTES:
				((EStructuralFeature.Setting)getAttributes()).set(newValue);
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
			case HtmlPackage.ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case HtmlPackage.ELEMENT__CLASSES:
				getClasses().clear();
				return;
			case HtmlPackage.ELEMENT__STYLE:
				getStyle().clear();
				return;
			case HtmlPackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
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
			case HtmlPackage.ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case HtmlPackage.ELEMENT__CLASSES:
				return !getClasses().isEmpty();
			case HtmlPackage.ELEMENT__STYLE:
				return !getStyle().isEmpty();
			case HtmlPackage.ELEMENT__ATTRIBUTES:
				return !getAttributes().isEmpty();
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
			case HtmlPackage.ELEMENT___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ElementImpl
