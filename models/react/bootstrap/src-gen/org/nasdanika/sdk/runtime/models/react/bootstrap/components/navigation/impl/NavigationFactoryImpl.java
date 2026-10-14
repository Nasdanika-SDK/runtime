/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationFactoryImpl extends EFactoryImpl implements NavigationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationFactory init() {
		try {
			NavigationFactory theNavigationFactory = (NavigationFactory)EPackage.Registry.INSTANCE.getEFactory(NavigationPackage.eNS_URI);
			if (theNavigationFactory != null) {
				return theNavigationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NavigationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFactoryImpl() {
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
			case NavigationPackage.NAV: return createNav();
			case NavigationPackage.NAV_ITEM: return createNavItem();
			case NavigationPackage.NAV_LINK: return createNavLink();
			case NavigationPackage.NAV_DROPDOWN: return createNavDropdown();
			case NavigationPackage.NAVBAR: return createNavbar();
			case NavigationPackage.NAVBAR_BRAND: return createNavbarBrand();
			case NavigationPackage.NAVBAR_TOGGLE: return createNavbarToggle();
			case NavigationPackage.NAVBAR_COLLAPSE: return createNavbarCollapse();
			case NavigationPackage.NAVBAR_TEXT: return createNavbarText();
			case NavigationPackage.TABS: return createTabs();
			case NavigationPackage.TAB: return createTab();
			case NavigationPackage.BREADCRUMB: return createBreadcrumb();
			case NavigationPackage.BREADCRUMB_ITEM: return createBreadcrumbItem();
			case NavigationPackage.PAGINATION: return createPagination();
			case NavigationPackage.PAGINATION_ITEM: return createPaginationItem();
			case NavigationPackage.PAGINATION_FIRST: return createPaginationFirst();
			case NavigationPackage.PAGINATION_PREV: return createPaginationPrev();
			case NavigationPackage.PAGINATION_ELLIPSIS: return createPaginationEllipsis();
			case NavigationPackage.PAGINATION_NEXT: return createPaginationNext();
			case NavigationPackage.PAGINATION_LAST: return createPaginationLast();
			case NavigationPackage.DROPDOWN: return createDropdown();
			case NavigationPackage.DROPDOWN_TOGGLE: return createDropdownToggle();
			case NavigationPackage.DROPDOWN_MENU: return createDropdownMenu();
			case NavigationPackage.DROPDOWN_ITEM: return createDropdownItem();
			case NavigationPackage.DROPDOWN_HEADER: return createDropdownHeader();
			case NavigationPackage.DROPDOWN_DIVIDER: return createDropdownDivider();
			case NavigationPackage.DROPDOWN_ITEM_TEXT: return createDropdownItemText();
			case NavigationPackage.DROPDOWN_BUTTON: return createDropdownButton();
			case NavigationPackage.SPLIT_BUTTON: return createSplitButton();
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
			case NavigationPackage.NAV_VARIANT:
				return createNavVariantFromString(eDataType, initialValue);
			case NavigationPackage.NAVBAR_THEME:
				return createNavbarThemeFromString(eDataType, initialValue);
			case NavigationPackage.FIXED:
				return createFixedFromString(eDataType, initialValue);
			case NavigationPackage.DROP:
				return createDropFromString(eDataType, initialValue);
			case NavigationPackage.ALIGN:
				return createAlignFromString(eDataType, initialValue);
			case NavigationPackage.MENU_VARIANT:
				return createMenuVariantFromString(eDataType, initialValue);
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
			case NavigationPackage.NAV_VARIANT:
				return convertNavVariantToString(eDataType, instanceValue);
			case NavigationPackage.NAVBAR_THEME:
				return convertNavbarThemeToString(eDataType, instanceValue);
			case NavigationPackage.FIXED:
				return convertFixedToString(eDataType, instanceValue);
			case NavigationPackage.DROP:
				return convertDropToString(eDataType, instanceValue);
			case NavigationPackage.ALIGN:
				return convertAlignToString(eDataType, instanceValue);
			case NavigationPackage.MENU_VARIANT:
				return convertMenuVariantToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nav createNav() {
		NavImpl nav = new NavImpl();
		return nav;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavItem createNavItem() {
		NavItemImpl navItem = new NavItemImpl();
		return navItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavLink createNavLink() {
		NavLinkImpl navLink = new NavLinkImpl();
		return navLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavDropdown createNavDropdown() {
		NavDropdownImpl navDropdown = new NavDropdownImpl();
		return navDropdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navbar createNavbar() {
		NavbarImpl navbar = new NavbarImpl();
		return navbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavbarBrand createNavbarBrand() {
		NavbarBrandImpl navbarBrand = new NavbarBrandImpl();
		return navbarBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavbarToggle createNavbarToggle() {
		NavbarToggleImpl navbarToggle = new NavbarToggleImpl();
		return navbarToggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavbarCollapse createNavbarCollapse() {
		NavbarCollapseImpl navbarCollapse = new NavbarCollapseImpl();
		return navbarCollapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavbarText createNavbarText() {
		NavbarTextImpl navbarText = new NavbarTextImpl();
		return navbarText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabs createTabs() {
		TabsImpl tabs = new TabsImpl();
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breadcrumb createBreadcrumb() {
		BreadcrumbImpl breadcrumb = new BreadcrumbImpl();
		return breadcrumb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreadcrumbItem createBreadcrumbItem() {
		BreadcrumbItemImpl breadcrumbItem = new BreadcrumbItemImpl();
		return breadcrumbItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pagination createPagination() {
		PaginationImpl pagination = new PaginationImpl();
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationItem createPaginationItem() {
		PaginationItemImpl paginationItem = new PaginationItemImpl();
		return paginationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationFirst createPaginationFirst() {
		PaginationFirstImpl paginationFirst = new PaginationFirstImpl();
		return paginationFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationPrev createPaginationPrev() {
		PaginationPrevImpl paginationPrev = new PaginationPrevImpl();
		return paginationPrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationEllipsis createPaginationEllipsis() {
		PaginationEllipsisImpl paginationEllipsis = new PaginationEllipsisImpl();
		return paginationEllipsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationNext createPaginationNext() {
		PaginationNextImpl paginationNext = new PaginationNextImpl();
		return paginationNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaginationLast createPaginationLast() {
		PaginationLastImpl paginationLast = new PaginationLastImpl();
		return paginationLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dropdown createDropdown() {
		DropdownImpl dropdown = new DropdownImpl();
		return dropdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownToggle createDropdownToggle() {
		DropdownToggleImpl dropdownToggle = new DropdownToggleImpl();
		return dropdownToggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownMenu createDropdownMenu() {
		DropdownMenuImpl dropdownMenu = new DropdownMenuImpl();
		return dropdownMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownItem createDropdownItem() {
		DropdownItemImpl dropdownItem = new DropdownItemImpl();
		return dropdownItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownHeader createDropdownHeader() {
		DropdownHeaderImpl dropdownHeader = new DropdownHeaderImpl();
		return dropdownHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownDivider createDropdownDivider() {
		DropdownDividerImpl dropdownDivider = new DropdownDividerImpl();
		return dropdownDivider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownItemText createDropdownItemText() {
		DropdownItemTextImpl dropdownItemText = new DropdownItemTextImpl();
		return dropdownItemText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropdownButton createDropdownButton() {
		DropdownButtonImpl dropdownButton = new DropdownButtonImpl();
		return dropdownButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitButton createSplitButton() {
		SplitButtonImpl splitButton = new SplitButtonImpl();
		return splitButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavVariant createNavVariantFromString(EDataType eDataType, String initialValue) {
		NavVariant result = NavVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNavVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavbarTheme createNavbarThemeFromString(EDataType eDataType, String initialValue) {
		NavbarTheme result = NavbarTheme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNavbarThemeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fixed createFixedFromString(EDataType eDataType, String initialValue) {
		Fixed result = Fixed.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDropFromString(EDataType eDataType, String initialValue) {
		Drop result = Drop.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDropToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align createAlignFromString(EDataType eDataType, String initialValue) {
		Align result = Align.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuVariant createMenuVariantFromString(EDataType eDataType, String initialValue) {
		MenuVariant result = MenuVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMenuVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationPackage getNavigationPackage() {
		return (NavigationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NavigationPackage getPackage() {
		return NavigationPackage.eINSTANCE;
	}

} //NavigationFactoryImpl
