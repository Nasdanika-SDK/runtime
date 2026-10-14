/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Marked;

import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.LibraryElement;
import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.*;

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
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.components.navigation.NavigationPackage
 * @generated
 */
public class NavigationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NavigationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationSwitch() {
		if (modelPackage == null) {
			modelPackage = NavigationPackage.eINSTANCE;
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
			case NavigationPackage.NAV_ENTRY: {
				NavEntry navEntry = (NavEntry)theEObject;
				T result = caseNavEntry(navEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV: {
				Nav nav = (Nav)theEObject;
				T result = caseNav(nav);
				if (result == null) result = caseBootstrapElement(nav);
				if (result == null) result = caseLibraryElement(nav);
				if (result == null) result = caseElement(nav);
				if (result == null) result = caseContainer(nav);
				if (result == null) result = caseNode(nav);
				if (result == null) result = caseMarked(nav);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV_ITEM: {
				NavItem navItem = (NavItem)theEObject;
				T result = caseNavItem(navItem);
				if (result == null) result = caseBootstrapElement(navItem);
				if (result == null) result = caseNavEntry(navItem);
				if (result == null) result = caseLibraryElement(navItem);
				if (result == null) result = caseElement(navItem);
				if (result == null) result = caseContainer(navItem);
				if (result == null) result = caseNode(navItem);
				if (result == null) result = caseMarked(navItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV_LINK: {
				NavLink navLink = (NavLink)theEObject;
				T result = caseNavLink(navLink);
				if (result == null) result = caseBootstrapElement(navLink);
				if (result == null) result = caseTextContent(navLink);
				if (result == null) result = caseNavEntry(navLink);
				if (result == null) result = caseLibraryElement(navLink);
				if (result == null) result = caseElement(navLink);
				if (result == null) result = caseContainer(navLink);
				if (result == null) result = caseNode(navLink);
				if (result == null) result = caseMarked(navLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV_DROPDOWN: {
				NavDropdown navDropdown = (NavDropdown)theEObject;
				T result = caseNavDropdown(navDropdown);
				if (result == null) result = caseBootstrapElement(navDropdown);
				if (result == null) result = caseNavEntry(navDropdown);
				if (result == null) result = caseLibraryElement(navDropdown);
				if (result == null) result = caseElement(navDropdown);
				if (result == null) result = caseContainer(navDropdown);
				if (result == null) result = caseNode(navDropdown);
				if (result == null) result = caseMarked(navDropdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR: {
				Navbar navbar = (Navbar)theEObject;
				T result = caseNavbar(navbar);
				if (result == null) result = caseBootstrapElement(navbar);
				if (result == null) result = caseLibraryElement(navbar);
				if (result == null) result = caseElement(navbar);
				if (result == null) result = caseContainer(navbar);
				if (result == null) result = caseNode(navbar);
				if (result == null) result = caseMarked(navbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_BRAND: {
				NavbarBrand navbarBrand = (NavbarBrand)theEObject;
				T result = caseNavbarBrand(navbarBrand);
				if (result == null) result = caseBootstrapElement(navbarBrand);
				if (result == null) result = caseTextContent(navbarBrand);
				if (result == null) result = caseLibraryElement(navbarBrand);
				if (result == null) result = caseElement(navbarBrand);
				if (result == null) result = caseContainer(navbarBrand);
				if (result == null) result = caseNode(navbarBrand);
				if (result == null) result = caseMarked(navbarBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_TOGGLE: {
				NavbarToggle navbarToggle = (NavbarToggle)theEObject;
				T result = caseNavbarToggle(navbarToggle);
				if (result == null) result = caseBootstrapElement(navbarToggle);
				if (result == null) result = caseLibraryElement(navbarToggle);
				if (result == null) result = caseElement(navbarToggle);
				if (result == null) result = caseContainer(navbarToggle);
				if (result == null) result = caseNode(navbarToggle);
				if (result == null) result = caseMarked(navbarToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_COLLAPSE: {
				NavbarCollapse navbarCollapse = (NavbarCollapse)theEObject;
				T result = caseNavbarCollapse(navbarCollapse);
				if (result == null) result = caseBootstrapElement(navbarCollapse);
				if (result == null) result = caseLibraryElement(navbarCollapse);
				if (result == null) result = caseElement(navbarCollapse);
				if (result == null) result = caseContainer(navbarCollapse);
				if (result == null) result = caseNode(navbarCollapse);
				if (result == null) result = caseMarked(navbarCollapse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_TEXT: {
				NavbarText navbarText = (NavbarText)theEObject;
				T result = caseNavbarText(navbarText);
				if (result == null) result = caseBootstrapElement(navbarText);
				if (result == null) result = caseTextContent(navbarText);
				if (result == null) result = caseLibraryElement(navbarText);
				if (result == null) result = caseElement(navbarText);
				if (result == null) result = caseContainer(navbarText);
				if (result == null) result = caseNode(navbarText);
				if (result == null) result = caseMarked(navbarText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.TABS: {
				Tabs tabs = (Tabs)theEObject;
				T result = caseTabs(tabs);
				if (result == null) result = caseBootstrapElement(tabs);
				if (result == null) result = caseLibraryElement(tabs);
				if (result == null) result = caseElement(tabs);
				if (result == null) result = caseContainer(tabs);
				if (result == null) result = caseNode(tabs);
				if (result == null) result = caseMarked(tabs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.TAB: {
				Tab tab = (Tab)theEObject;
				T result = caseTab(tab);
				if (result == null) result = caseBootstrapElement(tab);
				if (result == null) result = caseTextContent(tab);
				if (result == null) result = caseLibraryElement(tab);
				if (result == null) result = caseElement(tab);
				if (result == null) result = caseContainer(tab);
				if (result == null) result = caseNode(tab);
				if (result == null) result = caseMarked(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.BREADCRUMB: {
				Breadcrumb breadcrumb = (Breadcrumb)theEObject;
				T result = caseBreadcrumb(breadcrumb);
				if (result == null) result = caseBootstrapElement(breadcrumb);
				if (result == null) result = caseLibraryElement(breadcrumb);
				if (result == null) result = caseElement(breadcrumb);
				if (result == null) result = caseContainer(breadcrumb);
				if (result == null) result = caseNode(breadcrumb);
				if (result == null) result = caseMarked(breadcrumb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.BREADCRUMB_ITEM: {
				BreadcrumbItem breadcrumbItem = (BreadcrumbItem)theEObject;
				T result = caseBreadcrumbItem(breadcrumbItem);
				if (result == null) result = caseBootstrapElement(breadcrumbItem);
				if (result == null) result = caseTextContent(breadcrumbItem);
				if (result == null) result = caseLibraryElement(breadcrumbItem);
				if (result == null) result = caseElement(breadcrumbItem);
				if (result == null) result = caseContainer(breadcrumbItem);
				if (result == null) result = caseNode(breadcrumbItem);
				if (result == null) result = caseMarked(breadcrumbItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_ENTRY: {
				PaginationEntry paginationEntry = (PaginationEntry)theEObject;
				T result = casePaginationEntry(paginationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION: {
				Pagination pagination = (Pagination)theEObject;
				T result = casePagination(pagination);
				if (result == null) result = caseBootstrapElement(pagination);
				if (result == null) result = caseLibraryElement(pagination);
				if (result == null) result = caseElement(pagination);
				if (result == null) result = caseContainer(pagination);
				if (result == null) result = caseNode(pagination);
				if (result == null) result = caseMarked(pagination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_LINK: {
				PaginationLink paginationLink = (PaginationLink)theEObject;
				T result = casePaginationLink(paginationLink);
				if (result == null) result = caseBootstrapElement(paginationLink);
				if (result == null) result = caseTextContent(paginationLink);
				if (result == null) result = casePaginationEntry(paginationLink);
				if (result == null) result = caseLibraryElement(paginationLink);
				if (result == null) result = caseElement(paginationLink);
				if (result == null) result = caseContainer(paginationLink);
				if (result == null) result = caseNode(paginationLink);
				if (result == null) result = caseMarked(paginationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_ITEM: {
				PaginationItem paginationItem = (PaginationItem)theEObject;
				T result = casePaginationItem(paginationItem);
				if (result == null) result = casePaginationLink(paginationItem);
				if (result == null) result = caseBootstrapElement(paginationItem);
				if (result == null) result = caseTextContent(paginationItem);
				if (result == null) result = casePaginationEntry(paginationItem);
				if (result == null) result = caseLibraryElement(paginationItem);
				if (result == null) result = caseElement(paginationItem);
				if (result == null) result = caseContainer(paginationItem);
				if (result == null) result = caseNode(paginationItem);
				if (result == null) result = caseMarked(paginationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_FIRST: {
				PaginationFirst paginationFirst = (PaginationFirst)theEObject;
				T result = casePaginationFirst(paginationFirst);
				if (result == null) result = casePaginationLink(paginationFirst);
				if (result == null) result = caseBootstrapElement(paginationFirst);
				if (result == null) result = caseTextContent(paginationFirst);
				if (result == null) result = casePaginationEntry(paginationFirst);
				if (result == null) result = caseLibraryElement(paginationFirst);
				if (result == null) result = caseElement(paginationFirst);
				if (result == null) result = caseContainer(paginationFirst);
				if (result == null) result = caseNode(paginationFirst);
				if (result == null) result = caseMarked(paginationFirst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_PREV: {
				PaginationPrev paginationPrev = (PaginationPrev)theEObject;
				T result = casePaginationPrev(paginationPrev);
				if (result == null) result = casePaginationLink(paginationPrev);
				if (result == null) result = caseBootstrapElement(paginationPrev);
				if (result == null) result = caseTextContent(paginationPrev);
				if (result == null) result = casePaginationEntry(paginationPrev);
				if (result == null) result = caseLibraryElement(paginationPrev);
				if (result == null) result = caseElement(paginationPrev);
				if (result == null) result = caseContainer(paginationPrev);
				if (result == null) result = caseNode(paginationPrev);
				if (result == null) result = caseMarked(paginationPrev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_ELLIPSIS: {
				PaginationEllipsis paginationEllipsis = (PaginationEllipsis)theEObject;
				T result = casePaginationEllipsis(paginationEllipsis);
				if (result == null) result = casePaginationLink(paginationEllipsis);
				if (result == null) result = caseBootstrapElement(paginationEllipsis);
				if (result == null) result = caseTextContent(paginationEllipsis);
				if (result == null) result = casePaginationEntry(paginationEllipsis);
				if (result == null) result = caseLibraryElement(paginationEllipsis);
				if (result == null) result = caseElement(paginationEllipsis);
				if (result == null) result = caseContainer(paginationEllipsis);
				if (result == null) result = caseNode(paginationEllipsis);
				if (result == null) result = caseMarked(paginationEllipsis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_NEXT: {
				PaginationNext paginationNext = (PaginationNext)theEObject;
				T result = casePaginationNext(paginationNext);
				if (result == null) result = casePaginationLink(paginationNext);
				if (result == null) result = caseBootstrapElement(paginationNext);
				if (result == null) result = caseTextContent(paginationNext);
				if (result == null) result = casePaginationEntry(paginationNext);
				if (result == null) result = caseLibraryElement(paginationNext);
				if (result == null) result = caseElement(paginationNext);
				if (result == null) result = caseContainer(paginationNext);
				if (result == null) result = caseNode(paginationNext);
				if (result == null) result = caseMarked(paginationNext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_LAST: {
				PaginationLast paginationLast = (PaginationLast)theEObject;
				T result = casePaginationLast(paginationLast);
				if (result == null) result = casePaginationLink(paginationLast);
				if (result == null) result = caseBootstrapElement(paginationLast);
				if (result == null) result = caseTextContent(paginationLast);
				if (result == null) result = casePaginationEntry(paginationLast);
				if (result == null) result = caseLibraryElement(paginationLast);
				if (result == null) result = caseElement(paginationLast);
				if (result == null) result = caseContainer(paginationLast);
				if (result == null) result = caseNode(paginationLast);
				if (result == null) result = caseMarked(paginationLast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_ENTRY: {
				DropdownEntry dropdownEntry = (DropdownEntry)theEObject;
				T result = caseDropdownEntry(dropdownEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN: {
				Dropdown dropdown = (Dropdown)theEObject;
				T result = caseDropdown(dropdown);
				if (result == null) result = caseBootstrapElement(dropdown);
				if (result == null) result = caseLibraryElement(dropdown);
				if (result == null) result = caseElement(dropdown);
				if (result == null) result = caseContainer(dropdown);
				if (result == null) result = caseNode(dropdown);
				if (result == null) result = caseMarked(dropdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_TOGGLE: {
				DropdownToggle dropdownToggle = (DropdownToggle)theEObject;
				T result = caseDropdownToggle(dropdownToggle);
				if (result == null) result = caseBootstrapElement(dropdownToggle);
				if (result == null) result = caseTextContent(dropdownToggle);
				if (result == null) result = caseLibraryElement(dropdownToggle);
				if (result == null) result = caseElement(dropdownToggle);
				if (result == null) result = caseContainer(dropdownToggle);
				if (result == null) result = caseNode(dropdownToggle);
				if (result == null) result = caseMarked(dropdownToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_MENU: {
				DropdownMenu dropdownMenu = (DropdownMenu)theEObject;
				T result = caseDropdownMenu(dropdownMenu);
				if (result == null) result = caseBootstrapElement(dropdownMenu);
				if (result == null) result = caseLibraryElement(dropdownMenu);
				if (result == null) result = caseElement(dropdownMenu);
				if (result == null) result = caseContainer(dropdownMenu);
				if (result == null) result = caseNode(dropdownMenu);
				if (result == null) result = caseMarked(dropdownMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_ITEM: {
				DropdownItem dropdownItem = (DropdownItem)theEObject;
				T result = caseDropdownItem(dropdownItem);
				if (result == null) result = caseBootstrapElement(dropdownItem);
				if (result == null) result = caseTextContent(dropdownItem);
				if (result == null) result = caseDropdownEntry(dropdownItem);
				if (result == null) result = caseLibraryElement(dropdownItem);
				if (result == null) result = caseElement(dropdownItem);
				if (result == null) result = caseContainer(dropdownItem);
				if (result == null) result = caseNode(dropdownItem);
				if (result == null) result = caseMarked(dropdownItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_HEADER: {
				DropdownHeader dropdownHeader = (DropdownHeader)theEObject;
				T result = caseDropdownHeader(dropdownHeader);
				if (result == null) result = caseBootstrapElement(dropdownHeader);
				if (result == null) result = caseTextContent(dropdownHeader);
				if (result == null) result = caseDropdownEntry(dropdownHeader);
				if (result == null) result = caseLibraryElement(dropdownHeader);
				if (result == null) result = caseElement(dropdownHeader);
				if (result == null) result = caseContainer(dropdownHeader);
				if (result == null) result = caseNode(dropdownHeader);
				if (result == null) result = caseMarked(dropdownHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_DIVIDER: {
				DropdownDivider dropdownDivider = (DropdownDivider)theEObject;
				T result = caseDropdownDivider(dropdownDivider);
				if (result == null) result = caseBootstrapElement(dropdownDivider);
				if (result == null) result = caseDropdownEntry(dropdownDivider);
				if (result == null) result = caseLibraryElement(dropdownDivider);
				if (result == null) result = caseElement(dropdownDivider);
				if (result == null) result = caseContainer(dropdownDivider);
				if (result == null) result = caseNode(dropdownDivider);
				if (result == null) result = caseMarked(dropdownDivider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_ITEM_TEXT: {
				DropdownItemText dropdownItemText = (DropdownItemText)theEObject;
				T result = caseDropdownItemText(dropdownItemText);
				if (result == null) result = caseBootstrapElement(dropdownItemText);
				if (result == null) result = caseTextContent(dropdownItemText);
				if (result == null) result = caseDropdownEntry(dropdownItemText);
				if (result == null) result = caseLibraryElement(dropdownItemText);
				if (result == null) result = caseElement(dropdownItemText);
				if (result == null) result = caseContainer(dropdownItemText);
				if (result == null) result = caseNode(dropdownItemText);
				if (result == null) result = caseMarked(dropdownItemText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_BUTTON: {
				DropdownButton dropdownButton = (DropdownButton)theEObject;
				T result = caseDropdownButton(dropdownButton);
				if (result == null) result = caseBootstrapElement(dropdownButton);
				if (result == null) result = caseLibraryElement(dropdownButton);
				if (result == null) result = caseElement(dropdownButton);
				if (result == null) result = caseContainer(dropdownButton);
				if (result == null) result = caseNode(dropdownButton);
				if (result == null) result = caseMarked(dropdownButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.SPLIT_BUTTON: {
				SplitButton splitButton = (SplitButton)theEObject;
				T result = caseSplitButton(splitButton);
				if (result == null) result = caseDropdownButton(splitButton);
				if (result == null) result = caseBootstrapElement(splitButton);
				if (result == null) result = caseLibraryElement(splitButton);
				if (result == null) result = caseElement(splitButton);
				if (result == null) result = caseContainer(splitButton);
				if (result == null) result = caseNode(splitButton);
				if (result == null) result = caseMarked(splitButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavEntry(NavEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNav(Nav object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavItem(NavItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavLink(NavLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav Dropdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav Dropdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavDropdown(NavDropdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbar(Navbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbarBrand(NavbarBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbarToggle(NavbarToggle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar Collapse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar Collapse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbarCollapse(NavbarCollapse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbarText(NavbarText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabs(Tabs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTab(Tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreadcrumb(Breadcrumb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumb Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumb Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreadcrumbItem(BreadcrumbItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationEntry(PaginationEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagination(Pagination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationLink(PaginationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationItem(PaginationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationFirst(PaginationFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Prev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Prev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationPrev(PaginationPrev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Ellipsis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Ellipsis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationEllipsis(PaginationEllipsis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationNext(PaginationNext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagination Last</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagination Last</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaginationLast(PaginationLast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownEntry(DropdownEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdown(Dropdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownToggle(DropdownToggle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownMenu(DropdownMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownItem(DropdownItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownHeader(DropdownHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Divider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Divider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownDivider(DropdownDivider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Item Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Item Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownItemText(DropdownItemText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropdownButton(DropdownButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitButton(SplitButton object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
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
	public T caseElement(Element object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
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
	public T caseBootstrapElement(BootstrapElement object) {
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

} //NavigationSwitch
