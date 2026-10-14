/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.ReactElement;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.*;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage
 * @generated
 */
public class FormsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FormsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormsSwitch<Adapter> modelSwitch =
		new FormsSwitch<Adapter>() {
			@Override
			public Adapter caseValidated(Validated object) {
				return createValidatedAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseFormGroup(FormGroup object) {
				return createFormGroupAdapter();
			}
			@Override
			public Adapter caseFormLabel(FormLabel object) {
				return createFormLabelAdapter();
			}
			@Override
			public Adapter caseFormControl(FormControl object) {
				return createFormControlAdapter();
			}
			@Override
			public Adapter caseFormSelect(FormSelect object) {
				return createFormSelectAdapter();
			}
			@Override
			public Adapter caseFormCheck(FormCheck object) {
				return createFormCheckAdapter();
			}
			@Override
			public Adapter caseFormRange(FormRange object) {
				return createFormRangeAdapter();
			}
			@Override
			public Adapter caseFormText(FormText object) {
				return createFormTextAdapter();
			}
			@Override
			public Adapter caseFormControlFeedback(FormControlFeedback object) {
				return createFormControlFeedbackAdapter();
			}
			@Override
			public Adapter caseFloatingLabel(FloatingLabel object) {
				return createFloatingLabelAdapter();
			}
			@Override
			public Adapter caseInputGroup(InputGroup object) {
				return createInputGroupAdapter();
			}
			@Override
			public Adapter caseInputGroupText(InputGroupText object) {
				return createInputGroupTextAdapter();
			}
			@Override
			public Adapter caseReferrable(Referrable object) {
				return createReferrableAdapter();
			}
			@Override
			public Adapter caseStringIdentity(StringIdentity object) {
				return createStringIdentityAdapter();
			}
			@Override
			public Adapter caseDocumented(Documented object) {
				return createDocumentedAdapter();
			}
			@Override
			public Adapter caseMarked(Marked object) {
				return createMarkedAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTypeScriptElement(TypeScriptElement object) {
				return createTypeScriptElementAdapter();
			}
			@Override
			public Adapter caseReactElement(ReactElement object) {
				return createReactElementAdapter();
			}
			@Override
			public Adapter caseJsxNode(JsxNode object) {
				return createJsxNodeAdapter();
			}
			@Override
			public Adapter caseJsxContainer(JsxContainer object) {
				return createJsxContainerAdapter();
			}
			@Override
			public Adapter caseLibraryComponent(LibraryComponent object) {
				return createLibraryComponentAdapter();
			}
			@Override
			public Adapter caseBootstrapComponent(BootstrapComponent object) {
				return createBootstrapComponentAdapter();
			}
			@Override
			public Adapter caseTextContent(TextContent object) {
				return createTextContentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated <em>Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated
	 * @generated
	 */
	public Adapter createValidatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup <em>Form Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup
	 * @generated
	 */
	public Adapter createFormGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel <em>Form Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel
	 * @generated
	 */
	public Adapter createFormLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl <em>Form Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl
	 * @generated
	 */
	public Adapter createFormControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect <em>Form Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect
	 * @generated
	 */
	public Adapter createFormSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck <em>Form Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck
	 * @generated
	 */
	public Adapter createFormCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange <em>Form Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange
	 * @generated
	 */
	public Adapter createFormRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText <em>Form Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText
	 * @generated
	 */
	public Adapter createFormTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback <em>Form Control Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback
	 * @generated
	 */
	public Adapter createFormControlFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel <em>Floating Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel
	 * @generated
	 */
	public Adapter createFloatingLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup <em>Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup
	 * @generated
	 */
	public Adapter createInputGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroupText <em>Input Group Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroupText
	 * @generated
	 */
	public Adapter createInputGroupTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.Referrable
	 * @generated
	 */
	public Adapter createReferrableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity <em>String Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.StringIdentity
	 * @generated
	 */
	public Adapter createStringIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented
	 * @generated
	 */
	public Adapter createDocumentedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.Marked
	 * @generated
	 */
	public Adapter createMarkedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement <em>Type Script Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement
	 * @generated
	 */
	public Adapter createTypeScriptElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.ReactElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.ReactElement
	 * @generated
	 */
	public Adapter createReactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.JsxNode <em>Jsx Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxNode
	 * @generated
	 */
	public Adapter createJsxNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.JsxContainer <em>Jsx Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.JsxContainer
	 * @generated
	 */
	public Adapter createJsxContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.LibraryComponent <em>Library Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.LibraryComponent
	 * @generated
	 */
	public Adapter createLibraryComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent
	 * @generated
	 */
	public Adapter createBootstrapComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent
	 * @generated
	 */
	public Adapter createTextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FormsAdapterFactory
