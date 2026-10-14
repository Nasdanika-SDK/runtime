/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;

import org.nasdanika.sdk.runtime.models.react.impl.LibraryComponentImpl;

import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl#getAs <em>As</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl#getAsComponent <em>As Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BootstrapComponentImpl extends LibraryComponentImpl implements BootstrapComponent {
	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAs() <em>As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAs()
	 * @generated
	 * @ordered
	 */
	protected static final String AS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.BOOTSTRAP_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementId() {
		return (String)eDynamicGet(BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__ELEMENT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementId(String newElementId) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__ELEMENT_ID, newElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getClasses() {
		return (EList<String>)eDynamicGet(BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__CLASSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getStyle() {
		return (EMap<String, String>)eDynamicGet(BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAs() {
		return (String)eDynamicGet(BootstrapPackage.BOOTSTRAP_COMPONENT__AS, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__AS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAs(String newAs) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_COMPONENT__AS, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__AS, newAs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeReference getAsComponent() {
		return (NamedTypeReference)eDynamicGet(BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__AS_COMPONENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsComponent(NamedTypeReference newAsComponent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAsComponent, BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsComponent(NamedTypeReference newAsComponent) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT, BootstrapPackage.Literals.BOOTSTRAP_COMPONENT__AS_COMPONENT, newAsComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT:
				return basicSetAsComponent(null, msgs);
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
			case BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID:
				return getElementId();
			case BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES:
				return getClasses();
			case BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE:
				if (coreType) return getStyle();
				else return getStyle().map();
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS:
				return getAs();
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT:
				return getAsComponent();
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
			case BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends String>)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE:
				((EStructuralFeature.Setting)getStyle()).set(newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS:
				setAs((String)newValue);
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT:
				setAsComponent((NamedTypeReference)newValue);
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
			case BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES:
				getClasses().clear();
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE:
				getStyle().clear();
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS:
				setAs(AS_EDEFAULT);
				return;
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT:
				setAsComponent((NamedTypeReference)null);
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
			case BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? getElementId() != null : !ELEMENT_ID_EDEFAULT.equals(getElementId());
			case BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES:
				return !getClasses().isEmpty();
			case BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE:
				return !getStyle().isEmpty();
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS:
				return AS_EDEFAULT == null ? getAs() != null : !AS_EDEFAULT.equals(getAs());
			case BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT:
				return getAsComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //BootstrapComponentImpl
