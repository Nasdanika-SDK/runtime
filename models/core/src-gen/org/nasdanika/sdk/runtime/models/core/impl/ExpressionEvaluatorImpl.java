/**
 */
package org.nasdanika.sdk.runtime.models.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.core.Content;
import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.ExpressionEvaluator;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.Marker;
import org.nasdanika.sdk.runtime.models.core.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Evaluator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getDocRef <em>Doc Ref</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getDocFormat <em>Doc Format</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getDocContents <em>Doc Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getDocSections <em>Doc Sections</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionEvaluatorImpl extends MinimalEObjectImpl.Container implements ExpressionEvaluator {
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
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXPRESSION_EVALUATOR;
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
	public String getDocumentation() {
		return (String)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__DOCUMENTATION, CorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(CorePackage.EXPRESSION_EVALUATOR__DOCUMENTATION, CorePackage.Literals.DOCUMENTED__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocRef() {
		return (String)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__DOC_REF, CorePackage.Literals.DOCUMENTED__DOC_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocRef(String newDocRef) {
		eDynamicSet(CorePackage.EXPRESSION_EVALUATOR__DOC_REF, CorePackage.Literals.DOCUMENTED__DOC_REF, newDocRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocFormat() {
		return (String)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__DOC_FORMAT, CorePackage.Literals.DOCUMENTED__DOC_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocFormat(String newDocFormat) {
		eDynamicSet(CorePackage.EXPRESSION_EVALUATOR__DOC_FORMAT, CorePackage.Literals.DOCUMENTED__DOC_FORMAT, newDocFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Content> getDocContents() {
		return (EList<Content>)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__DOC_CONTENTS, CorePackage.Literals.DOCUMENTED__DOC_CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Section> getDocSections() {
		return (EList<Section>)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__DOC_SECTIONS, CorePackage.Literals.DOCUMENTED__DOC_SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__MARKERS, CorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return (String)eDynamicGet(CorePackage.EXPRESSION_EVALUATOR__EXPRESSION, CorePackage.Literals.EXPRESSION_EVALUATOR__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		eDynamicSet(CorePackage.EXPRESSION_EVALUATOR__EXPRESSION, CorePackage.Literals.EXPRESSION_EVALUATOR__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> T evaluate(Class<T> resultType, Map<String, Object> bindings) {
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
	public <T> T evaluate(final Class<T> resultType) {
		return this.<T>evaluate(resultType, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object evaluate(final Map<String, Object> bindings) {
		return this.<Object>evaluate(null, bindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object evaluate() {
		return this.<Object>evaluate(null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXPRESSION_EVALUATOR__DOC_CONTENTS:
				return ((InternalEList<?>)getDocContents()).basicRemove(otherEnd, msgs);
			case CorePackage.EXPRESSION_EVALUATOR__DOC_SECTIONS:
				return ((InternalEList<?>)getDocSections()).basicRemove(otherEnd, msgs);
			case CorePackage.EXPRESSION_EVALUATOR__MARKERS:
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
			case CorePackage.EXPRESSION_EVALUATOR__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.EXPRESSION_EVALUATOR__DOC_REF:
				return getDocRef();
			case CorePackage.EXPRESSION_EVALUATOR__DOC_FORMAT:
				return getDocFormat();
			case CorePackage.EXPRESSION_EVALUATOR__DOC_CONTENTS:
				return getDocContents();
			case CorePackage.EXPRESSION_EVALUATOR__DOC_SECTIONS:
				return getDocSections();
			case CorePackage.EXPRESSION_EVALUATOR__MARKERS:
				return getMarkers();
			case CorePackage.EXPRESSION_EVALUATOR__EXPRESSION:
				return getExpression();
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
			case CorePackage.EXPRESSION_EVALUATOR__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_REF:
				setDocRef((String)newValue);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_FORMAT:
				setDocFormat((String)newValue);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_CONTENTS:
				getDocContents().clear();
				getDocContents().addAll((Collection<? extends Content>)newValue);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_SECTIONS:
				getDocSections().clear();
				getDocSections().addAll((Collection<? extends Section>)newValue);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__EXPRESSION:
				setExpression((String)newValue);
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
			case CorePackage.EXPRESSION_EVALUATOR__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_REF:
				setDocRef(DOC_REF_EDEFAULT);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_FORMAT:
				setDocFormat(DOC_FORMAT_EDEFAULT);
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_CONTENTS:
				getDocContents().clear();
				return;
			case CorePackage.EXPRESSION_EVALUATOR__DOC_SECTIONS:
				getDocSections().clear();
				return;
			case CorePackage.EXPRESSION_EVALUATOR__MARKERS:
				getMarkers().clear();
				return;
			case CorePackage.EXPRESSION_EVALUATOR__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case CorePackage.EXPRESSION_EVALUATOR__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case CorePackage.EXPRESSION_EVALUATOR__DOC_REF:
				return DOC_REF_EDEFAULT == null ? getDocRef() != null : !DOC_REF_EDEFAULT.equals(getDocRef());
			case CorePackage.EXPRESSION_EVALUATOR__DOC_FORMAT:
				return DOC_FORMAT_EDEFAULT == null ? getDocFormat() != null : !DOC_FORMAT_EDEFAULT.equals(getDocFormat());
			case CorePackage.EXPRESSION_EVALUATOR__DOC_CONTENTS:
				return !getDocContents().isEmpty();
			case CorePackage.EXPRESSION_EVALUATOR__DOC_SECTIONS:
				return !getDocSections().isEmpty();
			case CorePackage.EXPRESSION_EVALUATOR__MARKERS:
				return !getMarkers().isEmpty();
			case CorePackage.EXPRESSION_EVALUATOR__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
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
		if (baseClass == Marked.class) {
			switch (derivedFeatureID) {
				case CorePackage.EXPRESSION_EVALUATOR__MARKERS: return CorePackage.MARKED__MARKERS;
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
		if (baseClass == Marked.class) {
			switch (baseFeatureID) {
				case CorePackage.MARKED__MARKERS: return CorePackage.EXPRESSION_EVALUATOR__MARKERS;
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.EXPRESSION_EVALUATOR___EVALUATE__CLASS_MAP:
				return evaluate((Class)arguments.get(0), (Map<String, Object>)arguments.get(1));
			case CorePackage.EXPRESSION_EVALUATOR___EVALUATE__CLASS:
				return evaluate((Class)arguments.get(0));
			case CorePackage.EXPRESSION_EVALUATOR___EVALUATE__MAP:
				return evaluate((Map<String, Object>)arguments.get(0));
			case CorePackage.EXPRESSION_EVALUATOR___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionEvaluatorImpl
