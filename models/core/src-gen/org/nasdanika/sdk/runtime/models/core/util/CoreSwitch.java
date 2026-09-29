/**
 */
package org.nasdanika.sdk.runtime.models.core.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.REFERRABLE: {
				Referrable referrable = (Referrable)theEObject;
				T result = caseReferrable(referrable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_IDENTITY: {
				StringIdentity stringIdentity = (StringIdentity)theEObject;
				T result = caseStringIdentity(stringIdentity);
				if (result == null) result = caseReferrable(stringIdentity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> stringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseStringToStringMapEntry(stringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MARKER: {
				Marker marker = (Marker)theEObject;
				T result = caseMarker(marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GIT_MARKER: {
				GitMarker gitMarker = (GitMarker)theEObject;
				T result = caseGitMarker(gitMarker);
				if (result == null) result = caseMarker(gitMarker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MARKED: {
				Marked marked = (Marked)theEObject;
				T result = caseMarked(marked);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECTION_REFERENCE: {
				SectionReference sectionReference = (SectionReference)theEObject;
				T result = caseSectionReference(sectionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseSectionReference(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOCUMENTED: {
				Documented documented = (Documented)theEObject;
				T result = caseDocumented(documented);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseStringIdentity(modelElement);
				if (result == null) result = caseDocumented(modelElement);
				if (result == null) result = caseMarked(modelElement);
				if (result == null) result = caseReferrable(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseModelElement(namedElement);
				if (result == null) result = caseStringIdentity(namedElement);
				if (result == null) result = caseDocumented(namedElement);
				if (result == null) result = caseMarked(namedElement);
				if (result == null) result = caseReferrable(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EVALUATOR: {
				Evaluator evaluator = (Evaluator)theEObject;
				T result = caseEvaluator(evaluator);
				if (result == null) result = caseDocumented(evaluator);
				if (result == null) result = caseMarked(evaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SOURCE_EVALUATOR: {
				SourceEvaluator sourceEvaluator = (SourceEvaluator)theEObject;
				T result = caseSourceEvaluator(sourceEvaluator);
				if (result == null) result = caseEvaluator(sourceEvaluator);
				if (result == null) result = caseDocumented(sourceEvaluator);
				if (result == null) result = caseMarked(sourceEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPRESSION_EVALUATOR: {
				ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator)theEObject;
				T result = caseExpressionEvaluator(expressionEvaluator);
				if (result == null) result = caseEvaluator(expressionEvaluator);
				if (result == null) result = caseDocumented(expressionEvaluator);
				if (result == null) result = caseMarked(expressionEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SPEL_EVALUATOR: {
				SpelEvaluator spelEvaluator = (SpelEvaluator)theEObject;
				T result = caseSpelEvaluator(spelEvaluator);
				if (result == null) result = caseExpressionEvaluator(spelEvaluator);
				if (result == null) result = caseEvaluator(spelEvaluator);
				if (result == null) result = caseDocumented(spelEvaluator);
				if (result == null) result = caseMarked(spelEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.XPATH_EVALUATOR: {
				XPathEvaluator xPathEvaluator = (XPathEvaluator)theEObject;
				T result = caseXPathEvaluator(xPathEvaluator);
				if (result == null) result = caseExpressionEvaluator(xPathEvaluator);
				if (result == null) result = caseEvaluator(xPathEvaluator);
				if (result == null) result = caseDocumented(xPathEvaluator);
				if (result == null) result = caseMarked(xPathEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCRIPT_EVALUATOR: {
				ScriptEvaluator scriptEvaluator = (ScriptEvaluator)theEObject;
				T result = caseScriptEvaluator(scriptEvaluator);
				if (result == null) result = caseSourceEvaluator(scriptEvaluator);
				if (result == null) result = caseEvaluator(scriptEvaluator);
				if (result == null) result = caseDocumented(scriptEvaluator);
				if (result == null) result = caseMarked(scriptEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROOVY_EVALUATOR: {
				GroovyEvaluator groovyEvaluator = (GroovyEvaluator)theEObject;
				T result = caseGroovyEvaluator(groovyEvaluator);
				if (result == null) result = caseSourceEvaluator(groovyEvaluator);
				if (result == null) result = caseEvaluator(groovyEvaluator);
				if (result == null) result = caseDocumented(groovyEvaluator);
				if (result == null) result = caseMarked(groovyEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarker(Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitMarker(GitMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionReference(SectionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluator(Evaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceEvaluator(SourceEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionEvaluator(ExpressionEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spel Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spel Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpelEvaluator(SpelEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPath Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPath Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPathEvaluator(XPathEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptEvaluator(ScriptEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groovy Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groovy Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroovyEvaluator(GroovyEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
