/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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

import org.nasdanika.sdk.runtime.models.react.bootstrap.*;

import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;

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
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage
 * @generated
 */
public class BootstrapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BootstrapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapSwitch() {
		if (modelPackage == null) {
			modelPackage = BootstrapPackage.eINSTANCE;
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
			case BootstrapPackage.BOOTSTRAP_COMPONENT: {
				BootstrapComponent bootstrapComponent = (BootstrapComponent)theEObject;
				T result = caseBootstrapComponent(bootstrapComponent);
				if (result == null) result = caseLibraryComponent(bootstrapComponent);
				if (result == null) result = caseJsxContainer(bootstrapComponent);
				if (result == null) result = caseJsxNode(bootstrapComponent);
				if (result == null) result = caseReactElement(bootstrapComponent);
				if (result == null) result = caseTypeScriptElement(bootstrapComponent);
				if (result == null) result = caseNamedElement(bootstrapComponent);
				if (result == null) result = caseModelElement(bootstrapComponent);
				if (result == null) result = caseStringIdentity(bootstrapComponent);
				if (result == null) result = caseDocumented(bootstrapComponent);
				if (result == null) result = caseMarked(bootstrapComponent);
				if (result == null) result = caseReferrable(bootstrapComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TEXT_CONTENT: {
				TextContent textContent = (TextContent)theEObject;
				T result = caseTextContent(textContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLUMN_SIZE: {
				ColumnSize columnSize = (ColumnSize)theEObject;
				T result = caseColumnSize(columnSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ROW_COLUMNS: {
				RowColumns rowColumns = (RowColumns)theEObject;
				T result = caseRowColumns(rowColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.THEME_PROVIDER: {
				ThemeProvider themeProvider = (ThemeProvider)theEObject;
				T result = caseThemeProvider(themeProvider);
				if (result == null) result = caseBootstrapComponent(themeProvider);
				if (result == null) result = caseLibraryComponent(themeProvider);
				if (result == null) result = caseJsxContainer(themeProvider);
				if (result == null) result = caseJsxNode(themeProvider);
				if (result == null) result = caseReactElement(themeProvider);
				if (result == null) result = caseTypeScriptElement(themeProvider);
				if (result == null) result = caseNamedElement(themeProvider);
				if (result == null) result = caseModelElement(themeProvider);
				if (result == null) result = caseStringIdentity(themeProvider);
				if (result == null) result = caseDocumented(themeProvider);
				if (result == null) result = caseMarked(themeProvider);
				if (result == null) result = caseReferrable(themeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseBootstrapComponent(container);
				if (result == null) result = caseLibraryComponent(container);
				if (result == null) result = caseJsxContainer(container);
				if (result == null) result = caseJsxNode(container);
				if (result == null) result = caseReactElement(container);
				if (result == null) result = caseTypeScriptElement(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = caseStringIdentity(container);
				if (result == null) result = caseDocumented(container);
				if (result == null) result = caseMarked(container);
				if (result == null) result = caseReferrable(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseBootstrapComponent(row);
				if (result == null) result = caseLibraryComponent(row);
				if (result == null) result = caseJsxContainer(row);
				if (result == null) result = caseJsxNode(row);
				if (result == null) result = caseReactElement(row);
				if (result == null) result = caseTypeScriptElement(row);
				if (result == null) result = caseNamedElement(row);
				if (result == null) result = caseModelElement(row);
				if (result == null) result = caseStringIdentity(row);
				if (result == null) result = caseDocumented(row);
				if (result == null) result = caseMarked(row);
				if (result == null) result = caseReferrable(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COL: {
				Col col = (Col)theEObject;
				T result = caseCol(col);
				if (result == null) result = caseBootstrapComponent(col);
				if (result == null) result = caseLibraryComponent(col);
				if (result == null) result = caseJsxContainer(col);
				if (result == null) result = caseJsxNode(col);
				if (result == null) result = caseReactElement(col);
				if (result == null) result = caseTypeScriptElement(col);
				if (result == null) result = caseNamedElement(col);
				if (result == null) result = caseModelElement(col);
				if (result == null) result = caseStringIdentity(col);
				if (result == null) result = caseDocumented(col);
				if (result == null) result = caseMarked(col);
				if (result == null) result = caseReferrable(col);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.STACK: {
				Stack stack = (Stack)theEObject;
				T result = caseStack(stack);
				if (result == null) result = caseBootstrapComponent(stack);
				if (result == null) result = caseLibraryComponent(stack);
				if (result == null) result = caseJsxContainer(stack);
				if (result == null) result = caseJsxNode(stack);
				if (result == null) result = caseReactElement(stack);
				if (result == null) result = caseTypeScriptElement(stack);
				if (result == null) result = caseNamedElement(stack);
				if (result == null) result = caseModelElement(stack);
				if (result == null) result = caseStringIdentity(stack);
				if (result == null) result = caseDocumented(stack);
				if (result == null) result = caseMarked(stack);
				if (result == null) result = caseReferrable(stack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.RATIO: {
				Ratio ratio = (Ratio)theEObject;
				T result = caseRatio(ratio);
				if (result == null) result = caseBootstrapComponent(ratio);
				if (result == null) result = caseLibraryComponent(ratio);
				if (result == null) result = caseJsxContainer(ratio);
				if (result == null) result = caseJsxNode(ratio);
				if (result == null) result = caseReactElement(ratio);
				if (result == null) result = caseTypeScriptElement(ratio);
				if (result == null) result = caseNamedElement(ratio);
				if (result == null) result = caseModelElement(ratio);
				if (result == null) result = caseStringIdentity(ratio);
				if (result == null) result = caseDocumented(ratio);
				if (result == null) result = caseMarked(ratio);
				if (result == null) result = caseReferrable(ratio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseBootstrapComponent(image);
				if (result == null) result = caseLibraryComponent(image);
				if (result == null) result = caseJsxContainer(image);
				if (result == null) result = caseJsxNode(image);
				if (result == null) result = caseReactElement(image);
				if (result == null) result = caseTypeScriptElement(image);
				if (result == null) result = caseNamedElement(image);
				if (result == null) result = caseModelElement(image);
				if (result == null) result = caseStringIdentity(image);
				if (result == null) result = caseDocumented(image);
				if (result == null) result = caseMarked(image);
				if (result == null) result = caseReferrable(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FIGURE: {
				Figure figure = (Figure)theEObject;
				T result = caseFigure(figure);
				if (result == null) result = caseBootstrapComponent(figure);
				if (result == null) result = caseLibraryComponent(figure);
				if (result == null) result = caseJsxContainer(figure);
				if (result == null) result = caseJsxNode(figure);
				if (result == null) result = caseReactElement(figure);
				if (result == null) result = caseTypeScriptElement(figure);
				if (result == null) result = caseNamedElement(figure);
				if (result == null) result = caseModelElement(figure);
				if (result == null) result = caseStringIdentity(figure);
				if (result == null) result = caseDocumented(figure);
				if (result == null) result = caseMarked(figure);
				if (result == null) result = caseReferrable(figure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FIGURE_IMAGE: {
				FigureImage figureImage = (FigureImage)theEObject;
				T result = caseFigureImage(figureImage);
				if (result == null) result = caseImage(figureImage);
				if (result == null) result = caseBootstrapComponent(figureImage);
				if (result == null) result = caseLibraryComponent(figureImage);
				if (result == null) result = caseJsxContainer(figureImage);
				if (result == null) result = caseJsxNode(figureImage);
				if (result == null) result = caseReactElement(figureImage);
				if (result == null) result = caseTypeScriptElement(figureImage);
				if (result == null) result = caseNamedElement(figureImage);
				if (result == null) result = caseModelElement(figureImage);
				if (result == null) result = caseStringIdentity(figureImage);
				if (result == null) result = caseDocumented(figureImage);
				if (result == null) result = caseMarked(figureImage);
				if (result == null) result = caseReferrable(figureImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FIGURE_CAPTION: {
				FigureCaption figureCaption = (FigureCaption)theEObject;
				T result = caseFigureCaption(figureCaption);
				if (result == null) result = caseBootstrapComponent(figureCaption);
				if (result == null) result = caseTextContent(figureCaption);
				if (result == null) result = caseLibraryComponent(figureCaption);
				if (result == null) result = caseJsxContainer(figureCaption);
				if (result == null) result = caseJsxNode(figureCaption);
				if (result == null) result = caseReactElement(figureCaption);
				if (result == null) result = caseTypeScriptElement(figureCaption);
				if (result == null) result = caseNamedElement(figureCaption);
				if (result == null) result = caseModelElement(figureCaption);
				if (result == null) result = caseStringIdentity(figureCaption);
				if (result == null) result = caseDocumented(figureCaption);
				if (result == null) result = caseMarked(figureCaption);
				if (result == null) result = caseReferrable(figureCaption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapComponent(BootstrapComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContent(TextContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnSize(ColumnSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowColumns(RowColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Theme Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Theme Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThemeProvider(ThemeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCol(Col object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStack(Stack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatio(Ratio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigure(Figure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureImage(FigureImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Caption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Caption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureCaption(FigureCaption object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Script Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeScriptElement(TypeScriptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactElement(ReactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxNode(JsxNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jsx Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsxContainer(JsxContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryComponent(LibraryComponent object) {
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

} //BootstrapSwitch
