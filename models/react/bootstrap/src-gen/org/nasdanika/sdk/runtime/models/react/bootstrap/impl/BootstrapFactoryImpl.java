/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.react.bootstrap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapFactoryImpl extends EFactoryImpl implements BootstrapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BootstrapFactory init() {
		try {
			BootstrapFactory theBootstrapFactory = (BootstrapFactory)EPackage.Registry.INSTANCE.getEFactory(BootstrapPackage.eNS_URI);
			if (theBootstrapFactory != null) {
				return theBootstrapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BootstrapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BootstrapPackage.COLUMN_SIZE: return createColumnSize();
			case BootstrapPackage.ROW_COLUMNS: return createRowColumns();
			case BootstrapPackage.THEME_PROVIDER: return createThemeProvider();
			case BootstrapPackage.CONTAINER: return createContainer();
			case BootstrapPackage.ROW: return createRow();
			case BootstrapPackage.COL: return createCol();
			case BootstrapPackage.STACK: return createStack();
			case BootstrapPackage.RATIO: return createRatio();
			case BootstrapPackage.IMAGE: return createImage();
			case BootstrapPackage.FIGURE: return createFigure();
			case BootstrapPackage.FIGURE_IMAGE: return createFigureImage();
			case BootstrapPackage.FIGURE_CAPTION: return createFigureCaption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BootstrapPackage.VARIANT:
				return createVariantFromString(eDataType, initialValue);
			case BootstrapPackage.BUTTON_VARIANT:
				return createButtonVariantFromString(eDataType, initialValue);
			case BootstrapPackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			case BootstrapPackage.BREAKPOINT:
				return createBreakpointFromString(eDataType, initialValue);
			case BootstrapPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case BootstrapPackage.ASPECT_RATIO:
				return createAspectRatioFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BootstrapPackage.VARIANT:
				return convertVariantToString(eDataType, instanceValue);
			case BootstrapPackage.BUTTON_VARIANT:
				return convertButtonVariantToString(eDataType, instanceValue);
			case BootstrapPackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			case BootstrapPackage.BREAKPOINT:
				return convertBreakpointToString(eDataType, instanceValue);
			case BootstrapPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case BootstrapPackage.ASPECT_RATIO:
				return convertAspectRatioToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSize createColumnSize() {
		ColumnSizeImpl columnSize = new ColumnSizeImpl();
		return columnSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowColumns createRowColumns() {
		RowColumnsImpl rowColumns = new RowColumnsImpl();
		return rowColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThemeProvider createThemeProvider() {
		ThemeProviderImpl themeProvider = new ThemeProviderImpl();
		return themeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.react.bootstrap.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Col createCol() {
		ColImpl col = new ColImpl();
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stack createStack() {
		StackImpl stack = new StackImpl();
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure createFigure() {
		FigureImpl figure = new FigureImpl();
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureImage createFigureImage() {
		FigureImageImpl figureImage = new FigureImageImpl();
		return figureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureCaption createFigureCaption() {
		FigureCaptionImpl figureCaption = new FigureCaptionImpl();
		return figureCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant createVariantFromString(EDataType eDataType, String initialValue) {
		Variant result = Variant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonVariant createButtonVariantFromString(EDataType eDataType, String initialValue) {
		ButtonVariant result = ButtonVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertButtonVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint createBreakpointFromString(EDataType eDataType, String initialValue) {
		Breakpoint result = Breakpoint.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakpointToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectRatio createAspectRatioFromString(EDataType eDataType, String initialValue) {
		AspectRatio result = AspectRatio.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAspectRatioToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapPackage getBootstrapPackage() {
		return (BootstrapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BootstrapPackage getPackage() {
		return BootstrapPackage.eINSTANCE;
	}

} //BootstrapFactoryImpl
