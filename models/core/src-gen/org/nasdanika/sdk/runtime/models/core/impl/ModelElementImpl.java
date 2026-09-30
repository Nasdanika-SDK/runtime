/**
 */
package org.nasdanika.sdk.runtime.models.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.core.Content;
import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.Marker;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getDocRef <em>Doc Ref</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getDocFormat <em>Doc Format</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getDocContents <em>Doc Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getDocSections <em>Doc Sections</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl#getUris <em>Uris</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocRef() <em>Doc Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocFormat() <em>Doc Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MODEL_ELEMENT;
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
	@Override
	public String getId() {
		return (String)eDynamicGet(CorePackage.MODEL_ELEMENT__ID, CorePackage.Literals.STRING_IDENTITY__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CorePackage.MODEL_ELEMENT__ID, CorePackage.Literals.STRING_IDENTITY__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(CorePackage.MODEL_ELEMENT__DOCUMENTATION, CorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(CorePackage.MODEL_ELEMENT__DOCUMENTATION, CorePackage.Literals.DOCUMENTED__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocRef() {
		return (String)eDynamicGet(CorePackage.MODEL_ELEMENT__DOC_REF, CorePackage.Literals.DOCUMENTED__DOC_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocRef(String newDocRef) {
		eDynamicSet(CorePackage.MODEL_ELEMENT__DOC_REF, CorePackage.Literals.DOCUMENTED__DOC_REF, newDocRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocFormat() {
		return (String)eDynamicGet(CorePackage.MODEL_ELEMENT__DOC_FORMAT, CorePackage.Literals.DOCUMENTED__DOC_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocFormat(String newDocFormat) {
		eDynamicSet(CorePackage.MODEL_ELEMENT__DOC_FORMAT, CorePackage.Literals.DOCUMENTED__DOC_FORMAT, newDocFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Content> getDocContents() {
		return (EList<Content>)eDynamicGet(CorePackage.MODEL_ELEMENT__DOC_CONTENTS, CorePackage.Literals.DOCUMENTED__DOC_CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Section> getDocSections() {
		return (EList<Section>)eDynamicGet(CorePackage.MODEL_ELEMENT__DOC_SECTIONS, CorePackage.Literals.DOCUMENTED__DOC_SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(CorePackage.MODEL_ELEMENT__MARKERS, CorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return (String)eDynamicGet(CorePackage.MODEL_ELEMENT__ICON, CorePackage.Literals.MODEL_ELEMENT__ICON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		eDynamicSet(CorePackage.MODEL_ELEMENT__ICON, CorePackage.Literals.MODEL_ELEMENT__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getUris() {
		return (EList<String>)eDynamicGet(CorePackage.MODEL_ELEMENT__URIS, CorePackage.Literals.MODEL_ELEMENT__URIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void collect(final Object source, final EReference eReference, final EList<EObject> accumulator) {
		boolean _isInstance = eReference.getEContainingClass().isInstance(source);
		if (_isInstance) {
			final Object value = ((EObject) source).eGet(eReference);
			boolean _isMany = eReference.isMany();
			if (_isMany) {
				boolean _contains = ((Collection<?>) value).contains(this);
				if (_contains) {
					accumulator.add(((EObject) source));
				}
			}
			else {
				if ((value == this)) {
					accumulator.add(((EObject) source));
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getReferrers(final EReference eReference) {
		final BasicEList<EObject> ret = new BasicEList<EObject>();
		final Resource res = this.eResource();
		TreeIterator<?> cit = null;
		if ((res == null)) {
			EObject root = this;
			EObject rc = null;
			while (((rc = root.eContainer()) != null)) {
				root = rc;
			}
			if ((root != null)) {
				this.collect(root, eReference, ret);
				cit = root.eAllContents();
			}
		}
		else {
			final ResourceSet rSet = res.getResourceSet();
			TreeIterator<? extends Notifier> _xifexpression = null;
			if ((rSet == null)) {
				_xifexpression = res.getAllContents();
			}
			else {
				_xifexpression = rSet.getAllContents();
			}
			cit = _xifexpression;
		}
		if ((cit != null)) {
			while (cit.hasNext()) {
				this.collect(cit.next(), eReference, ret);
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODEL_ELEMENT__DOC_CONTENTS:
				return ((InternalEList<?>)getDocContents()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__DOC_SECTIONS:
				return ((InternalEList<?>)getDocSections()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ELEMENT__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
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
			case CorePackage.MODEL_ELEMENT__ID:
				return getId();
			case CorePackage.MODEL_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.MODEL_ELEMENT__DOC_REF:
				return getDocRef();
			case CorePackage.MODEL_ELEMENT__DOC_FORMAT:
				return getDocFormat();
			case CorePackage.MODEL_ELEMENT__DOC_CONTENTS:
				return getDocContents();
			case CorePackage.MODEL_ELEMENT__DOC_SECTIONS:
				return getDocSections();
			case CorePackage.MODEL_ELEMENT__MARKERS:
				return getMarkers();
			case CorePackage.MODEL_ELEMENT__ICON:
				return getIcon();
			case CorePackage.MODEL_ELEMENT__URIS:
				return getUris();
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
			case CorePackage.MODEL_ELEMENT__ID:
				setId((String)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_REF:
				setDocRef((String)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_FORMAT:
				setDocFormat((String)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_CONTENTS:
				getDocContents().clear();
				getDocContents().addAll((Collection<? extends Content>)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_SECTIONS:
				getDocSections().clear();
				getDocSections().addAll((Collection<? extends Section>)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__ICON:
				setIcon((String)newValue);
				return;
			case CorePackage.MODEL_ELEMENT__URIS:
				getUris().clear();
				getUris().addAll((Collection<? extends String>)newValue);
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
			case CorePackage.MODEL_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_REF:
				setDocRef(DOC_REF_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_FORMAT:
				setDocFormat(DOC_FORMAT_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__DOC_CONTENTS:
				getDocContents().clear();
				return;
			case CorePackage.MODEL_ELEMENT__DOC_SECTIONS:
				getDocSections().clear();
				return;
			case CorePackage.MODEL_ELEMENT__MARKERS:
				getMarkers().clear();
				return;
			case CorePackage.MODEL_ELEMENT__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case CorePackage.MODEL_ELEMENT__URIS:
				getUris().clear();
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
			case CorePackage.MODEL_ELEMENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CorePackage.MODEL_ELEMENT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case CorePackage.MODEL_ELEMENT__DOC_REF:
				return DOC_REF_EDEFAULT == null ? getDocRef() != null : !DOC_REF_EDEFAULT.equals(getDocRef());
			case CorePackage.MODEL_ELEMENT__DOC_FORMAT:
				return DOC_FORMAT_EDEFAULT == null ? getDocFormat() != null : !DOC_FORMAT_EDEFAULT.equals(getDocFormat());
			case CorePackage.MODEL_ELEMENT__DOC_CONTENTS:
				return !getDocContents().isEmpty();
			case CorePackage.MODEL_ELEMENT__DOC_SECTIONS:
				return !getDocSections().isEmpty();
			case CorePackage.MODEL_ELEMENT__MARKERS:
				return !getMarkers().isEmpty();
			case CorePackage.MODEL_ELEMENT__ICON:
				return ICON_EDEFAULT == null ? getIcon() != null : !ICON_EDEFAULT.equals(getIcon());
			case CorePackage.MODEL_ELEMENT__URIS:
				return !getUris().isEmpty();
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
		if (baseClass == Documented.class) {
			switch (derivedFeatureID) {
				case CorePackage.MODEL_ELEMENT__DOCUMENTATION: return CorePackage.DOCUMENTED__DOCUMENTATION;
				case CorePackage.MODEL_ELEMENT__DOC_REF: return CorePackage.DOCUMENTED__DOC_REF;
				case CorePackage.MODEL_ELEMENT__DOC_FORMAT: return CorePackage.DOCUMENTED__DOC_FORMAT;
				case CorePackage.MODEL_ELEMENT__DOC_CONTENTS: return CorePackage.DOCUMENTED__DOC_CONTENTS;
				case CorePackage.MODEL_ELEMENT__DOC_SECTIONS: return CorePackage.DOCUMENTED__DOC_SECTIONS;
				default: return -1;
			}
		}
		if (baseClass == Marked.class) {
			switch (derivedFeatureID) {
				case CorePackage.MODEL_ELEMENT__MARKERS: return CorePackage.MARKED__MARKERS;
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
		if (baseClass == Documented.class) {
			switch (baseFeatureID) {
				case CorePackage.DOCUMENTED__DOCUMENTATION: return CorePackage.MODEL_ELEMENT__DOCUMENTATION;
				case CorePackage.DOCUMENTED__DOC_REF: return CorePackage.MODEL_ELEMENT__DOC_REF;
				case CorePackage.DOCUMENTED__DOC_FORMAT: return CorePackage.MODEL_ELEMENT__DOC_FORMAT;
				case CorePackage.DOCUMENTED__DOC_CONTENTS: return CorePackage.MODEL_ELEMENT__DOC_CONTENTS;
				case CorePackage.DOCUMENTED__DOC_SECTIONS: return CorePackage.MODEL_ELEMENT__DOC_SECTIONS;
				default: return -1;
			}
		}
		if (baseClass == Marked.class) {
			switch (baseFeatureID) {
				case CorePackage.MARKED__MARKERS: return CorePackage.MODEL_ELEMENT__MARKERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST:
				collect(arguments.get(0), (EReference)arguments.get(1), (EList<EObject>)arguments.get(2));
				return null;
			case CorePackage.MODEL_ELEMENT___GET_REFERRERS__EREFERENCE:
				return getReferrers((EReference)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelElementImpl
