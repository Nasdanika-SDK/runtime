/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.presentation.Paragraph;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.TextRun;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl#getIndentLevel <em>Indent Level</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ParagraphImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagraphImpl extends MinimalEObjectImpl.Container implements Paragraph {
	/**
	 * The default value of the '{@link #getIndentLevel() <em>Indent Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndentLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int INDENT_LEVEL_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGNMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PARAGRAPH;
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
	@SuppressWarnings("unchecked")
	public EList<TextRun> getRuns() {
		return (EList<TextRun>)eDynamicGet(PresentationPackage.PARAGRAPH__RUNS, PresentationPackage.Literals.PARAGRAPH__RUNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndentLevel() {
		return (Integer)eDynamicGet(PresentationPackage.PARAGRAPH__INDENT_LEVEL, PresentationPackage.Literals.PARAGRAPH__INDENT_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndentLevel(int newIndentLevel) {
		eDynamicSet(PresentationPackage.PARAGRAPH__INDENT_LEVEL, PresentationPackage.Literals.PARAGRAPH__INDENT_LEVEL, newIndentLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlignment() {
		return (String)eDynamicGet(PresentationPackage.PARAGRAPH__ALIGNMENT, PresentationPackage.Literals.PARAGRAPH__ALIGNMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(String newAlignment) {
		eDynamicSet(PresentationPackage.PARAGRAPH__ALIGNMENT, PresentationPackage.Literals.PARAGRAPH__ALIGNMENT, newAlignment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.PARAGRAPH__RUNS:
				return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.PARAGRAPH__RUNS:
				return getRuns();
			case PresentationPackage.PARAGRAPH__INDENT_LEVEL:
				return getIndentLevel();
			case PresentationPackage.PARAGRAPH__ALIGNMENT:
				return getAlignment();
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
			case PresentationPackage.PARAGRAPH__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection<? extends TextRun>)newValue);
				return;
			case PresentationPackage.PARAGRAPH__INDENT_LEVEL:
				setIndentLevel((Integer)newValue);
				return;
			case PresentationPackage.PARAGRAPH__ALIGNMENT:
				setAlignment((String)newValue);
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
			case PresentationPackage.PARAGRAPH__RUNS:
				getRuns().clear();
				return;
			case PresentationPackage.PARAGRAPH__INDENT_LEVEL:
				setIndentLevel(INDENT_LEVEL_EDEFAULT);
				return;
			case PresentationPackage.PARAGRAPH__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
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
			case PresentationPackage.PARAGRAPH__RUNS:
				return !getRuns().isEmpty();
			case PresentationPackage.PARAGRAPH__INDENT_LEVEL:
				return getIndentLevel() != INDENT_LEVEL_EDEFAULT;
			case PresentationPackage.PARAGRAPH__ALIGNMENT:
				return ALIGNMENT_EDEFAULT == null ? getAlignment() != null : !ALIGNMENT_EDEFAULT.equals(getAlignment());
		}
		return super.eIsSet(featureID);
	}

} //ParagraphImpl
