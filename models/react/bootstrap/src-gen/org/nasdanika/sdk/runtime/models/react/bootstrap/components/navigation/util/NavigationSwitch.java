/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.util;

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

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.*;

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
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.components.navigation.NavigationPackage
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
				if (result == null) result = caseBootstrapComponent(nav);
				if (result == null) result = caseLibraryComponent(nav);
				if (result == null) result = caseJsxContainer(nav);
				if (result == null) result = caseJsxNode(nav);
				if (result == null) result = caseReactElement(nav);
				if (result == null) result = caseTypeScriptElement(nav);
				if (result == null) result = caseNamedElement(nav);
				if (result == null) result = caseModelElement(nav);
				if (result == null) result = caseStringIdentity(nav);
				if (result == null) result = caseDocumented(nav);
				if (result == null) result = caseMarked(nav);
				if (result == null) result = caseReferrable(nav);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV_ITEM: {
				NavItem navItem = (NavItem)theEObject;
				T result = caseNavItem(navItem);
				if (result == null) result = caseBootstrapComponent(navItem);
				if (result == null) result = caseNavEntry(navItem);
				if (result == null) result = caseLibraryComponent(navItem);
				if (result == null) result = caseJsxContainer(navItem);
				if (result == null) result = caseJsxNode(navItem);
				if (result == null) result = caseReactElement(navItem);
				if (result == null) result = caseTypeScriptElement(navItem);
				if (result == null) result = caseNamedElement(navItem);
				if (result == null) result = caseModelElement(navItem);
				if (result == null) result = caseStringIdentity(navItem);
				if (result == null) result = caseDocumented(navItem);
				if (result == null) result = caseMarked(navItem);
				if (result == null) result = caseReferrable(navItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV_LINK: {
				NavLink navLink = (NavLink)theEObject;
				T result = caseNavLink(navLink);
				if (result == null) result = caseBootstrapComponent(navLink);
				if (result == null) result = caseTextContent(navLink);
				if (result == null) result = caseNavEntry(navLink);
				if (result == null) result = caseLibraryComponent(navLink);
				if (result == null) result = caseJsxContainer(navLink);
				if (result == null) result = caseJsxNode(navLink);
				if (result == null) result = caseReactElement(navLink);
				if (result == null) result = caseTypeScriptElement(navLink);
				if (result == null) result = caseNamedElement(navLink);
				if (result == null) result = caseModelElement(navLink);
				if (result == null) result = caseStringIdentity(navLink);
				if (result == null) result = caseDocumented(navLink);
				if (result == null) result = caseMarked(navLink);
				if (result == null) result = caseReferrable(navLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAV_DROPDOWN: {
				NavDropdown navDropdown = (NavDropdown)theEObject;
				T result = caseNavDropdown(navDropdown);
				if (result == null) result = caseBootstrapComponent(navDropdown);
				if (result == null) result = caseNavEntry(navDropdown);
				if (result == null) result = caseLibraryComponent(navDropdown);
				if (result == null) result = caseJsxContainer(navDropdown);
				if (result == null) result = caseJsxNode(navDropdown);
				if (result == null) result = caseReactElement(navDropdown);
				if (result == null) result = caseTypeScriptElement(navDropdown);
				if (result == null) result = caseNamedElement(navDropdown);
				if (result == null) result = caseModelElement(navDropdown);
				if (result == null) result = caseStringIdentity(navDropdown);
				if (result == null) result = caseDocumented(navDropdown);
				if (result == null) result = caseMarked(navDropdown);
				if (result == null) result = caseReferrable(navDropdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR: {
				Navbar navbar = (Navbar)theEObject;
				T result = caseNavbar(navbar);
				if (result == null) result = caseBootstrapComponent(navbar);
				if (result == null) result = caseLibraryComponent(navbar);
				if (result == null) result = caseJsxContainer(navbar);
				if (result == null) result = caseJsxNode(navbar);
				if (result == null) result = caseReactElement(navbar);
				if (result == null) result = caseTypeScriptElement(navbar);
				if (result == null) result = caseNamedElement(navbar);
				if (result == null) result = caseModelElement(navbar);
				if (result == null) result = caseStringIdentity(navbar);
				if (result == null) result = caseDocumented(navbar);
				if (result == null) result = caseMarked(navbar);
				if (result == null) result = caseReferrable(navbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_BRAND: {
				NavbarBrand navbarBrand = (NavbarBrand)theEObject;
				T result = caseNavbarBrand(navbarBrand);
				if (result == null) result = caseBootstrapComponent(navbarBrand);
				if (result == null) result = caseTextContent(navbarBrand);
				if (result == null) result = caseLibraryComponent(navbarBrand);
				if (result == null) result = caseJsxContainer(navbarBrand);
				if (result == null) result = caseJsxNode(navbarBrand);
				if (result == null) result = caseReactElement(navbarBrand);
				if (result == null) result = caseTypeScriptElement(navbarBrand);
				if (result == null) result = caseNamedElement(navbarBrand);
				if (result == null) result = caseModelElement(navbarBrand);
				if (result == null) result = caseStringIdentity(navbarBrand);
				if (result == null) result = caseDocumented(navbarBrand);
				if (result == null) result = caseMarked(navbarBrand);
				if (result == null) result = caseReferrable(navbarBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_TOGGLE: {
				NavbarToggle navbarToggle = (NavbarToggle)theEObject;
				T result = caseNavbarToggle(navbarToggle);
				if (result == null) result = caseBootstrapComponent(navbarToggle);
				if (result == null) result = caseLibraryComponent(navbarToggle);
				if (result == null) result = caseJsxContainer(navbarToggle);
				if (result == null) result = caseJsxNode(navbarToggle);
				if (result == null) result = caseReactElement(navbarToggle);
				if (result == null) result = caseTypeScriptElement(navbarToggle);
				if (result == null) result = caseNamedElement(navbarToggle);
				if (result == null) result = caseModelElement(navbarToggle);
				if (result == null) result = caseStringIdentity(navbarToggle);
				if (result == null) result = caseDocumented(navbarToggle);
				if (result == null) result = caseMarked(navbarToggle);
				if (result == null) result = caseReferrable(navbarToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_COLLAPSE: {
				NavbarCollapse navbarCollapse = (NavbarCollapse)theEObject;
				T result = caseNavbarCollapse(navbarCollapse);
				if (result == null) result = caseBootstrapComponent(navbarCollapse);
				if (result == null) result = caseLibraryComponent(navbarCollapse);
				if (result == null) result = caseJsxContainer(navbarCollapse);
				if (result == null) result = caseJsxNode(navbarCollapse);
				if (result == null) result = caseReactElement(navbarCollapse);
				if (result == null) result = caseTypeScriptElement(navbarCollapse);
				if (result == null) result = caseNamedElement(navbarCollapse);
				if (result == null) result = caseModelElement(navbarCollapse);
				if (result == null) result = caseStringIdentity(navbarCollapse);
				if (result == null) result = caseDocumented(navbarCollapse);
				if (result == null) result = caseMarked(navbarCollapse);
				if (result == null) result = caseReferrable(navbarCollapse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.NAVBAR_TEXT: {
				NavbarText navbarText = (NavbarText)theEObject;
				T result = caseNavbarText(navbarText);
				if (result == null) result = caseBootstrapComponent(navbarText);
				if (result == null) result = caseTextContent(navbarText);
				if (result == null) result = caseLibraryComponent(navbarText);
				if (result == null) result = caseJsxContainer(navbarText);
				if (result == null) result = caseJsxNode(navbarText);
				if (result == null) result = caseReactElement(navbarText);
				if (result == null) result = caseTypeScriptElement(navbarText);
				if (result == null) result = caseNamedElement(navbarText);
				if (result == null) result = caseModelElement(navbarText);
				if (result == null) result = caseStringIdentity(navbarText);
				if (result == null) result = caseDocumented(navbarText);
				if (result == null) result = caseMarked(navbarText);
				if (result == null) result = caseReferrable(navbarText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.TABS: {
				Tabs tabs = (Tabs)theEObject;
				T result = caseTabs(tabs);
				if (result == null) result = caseBootstrapComponent(tabs);
				if (result == null) result = caseLibraryComponent(tabs);
				if (result == null) result = caseJsxContainer(tabs);
				if (result == null) result = caseJsxNode(tabs);
				if (result == null) result = caseReactElement(tabs);
				if (result == null) result = caseTypeScriptElement(tabs);
				if (result == null) result = caseNamedElement(tabs);
				if (result == null) result = caseModelElement(tabs);
				if (result == null) result = caseStringIdentity(tabs);
				if (result == null) result = caseDocumented(tabs);
				if (result == null) result = caseMarked(tabs);
				if (result == null) result = caseReferrable(tabs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.TAB: {
				Tab tab = (Tab)theEObject;
				T result = caseTab(tab);
				if (result == null) result = caseBootstrapComponent(tab);
				if (result == null) result = caseTextContent(tab);
				if (result == null) result = caseLibraryComponent(tab);
				if (result == null) result = caseJsxContainer(tab);
				if (result == null) result = caseJsxNode(tab);
				if (result == null) result = caseReactElement(tab);
				if (result == null) result = caseTypeScriptElement(tab);
				if (result == null) result = caseNamedElement(tab);
				if (result == null) result = caseModelElement(tab);
				if (result == null) result = caseStringIdentity(tab);
				if (result == null) result = caseDocumented(tab);
				if (result == null) result = caseMarked(tab);
				if (result == null) result = caseReferrable(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.BREADCRUMB: {
				Breadcrumb breadcrumb = (Breadcrumb)theEObject;
				T result = caseBreadcrumb(breadcrumb);
				if (result == null) result = caseBootstrapComponent(breadcrumb);
				if (result == null) result = caseLibraryComponent(breadcrumb);
				if (result == null) result = caseJsxContainer(breadcrumb);
				if (result == null) result = caseJsxNode(breadcrumb);
				if (result == null) result = caseReactElement(breadcrumb);
				if (result == null) result = caseTypeScriptElement(breadcrumb);
				if (result == null) result = caseNamedElement(breadcrumb);
				if (result == null) result = caseModelElement(breadcrumb);
				if (result == null) result = caseStringIdentity(breadcrumb);
				if (result == null) result = caseDocumented(breadcrumb);
				if (result == null) result = caseMarked(breadcrumb);
				if (result == null) result = caseReferrable(breadcrumb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.BREADCRUMB_ITEM: {
				BreadcrumbItem breadcrumbItem = (BreadcrumbItem)theEObject;
				T result = caseBreadcrumbItem(breadcrumbItem);
				if (result == null) result = caseBootstrapComponent(breadcrumbItem);
				if (result == null) result = caseTextContent(breadcrumbItem);
				if (result == null) result = caseLibraryComponent(breadcrumbItem);
				if (result == null) result = caseJsxContainer(breadcrumbItem);
				if (result == null) result = caseJsxNode(breadcrumbItem);
				if (result == null) result = caseReactElement(breadcrumbItem);
				if (result == null) result = caseTypeScriptElement(breadcrumbItem);
				if (result == null) result = caseNamedElement(breadcrumbItem);
				if (result == null) result = caseModelElement(breadcrumbItem);
				if (result == null) result = caseStringIdentity(breadcrumbItem);
				if (result == null) result = caseDocumented(breadcrumbItem);
				if (result == null) result = caseMarked(breadcrumbItem);
				if (result == null) result = caseReferrable(breadcrumbItem);
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
				if (result == null) result = caseBootstrapComponent(pagination);
				if (result == null) result = caseLibraryComponent(pagination);
				if (result == null) result = caseJsxContainer(pagination);
				if (result == null) result = caseJsxNode(pagination);
				if (result == null) result = caseReactElement(pagination);
				if (result == null) result = caseTypeScriptElement(pagination);
				if (result == null) result = caseNamedElement(pagination);
				if (result == null) result = caseModelElement(pagination);
				if (result == null) result = caseStringIdentity(pagination);
				if (result == null) result = caseDocumented(pagination);
				if (result == null) result = caseMarked(pagination);
				if (result == null) result = caseReferrable(pagination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_LINK: {
				PaginationLink paginationLink = (PaginationLink)theEObject;
				T result = casePaginationLink(paginationLink);
				if (result == null) result = caseBootstrapComponent(paginationLink);
				if (result == null) result = caseTextContent(paginationLink);
				if (result == null) result = casePaginationEntry(paginationLink);
				if (result == null) result = caseLibraryComponent(paginationLink);
				if (result == null) result = caseJsxContainer(paginationLink);
				if (result == null) result = caseJsxNode(paginationLink);
				if (result == null) result = caseReactElement(paginationLink);
				if (result == null) result = caseTypeScriptElement(paginationLink);
				if (result == null) result = caseNamedElement(paginationLink);
				if (result == null) result = caseModelElement(paginationLink);
				if (result == null) result = caseStringIdentity(paginationLink);
				if (result == null) result = caseDocumented(paginationLink);
				if (result == null) result = caseMarked(paginationLink);
				if (result == null) result = caseReferrable(paginationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_ITEM: {
				PaginationItem paginationItem = (PaginationItem)theEObject;
				T result = casePaginationItem(paginationItem);
				if (result == null) result = casePaginationLink(paginationItem);
				if (result == null) result = caseBootstrapComponent(paginationItem);
				if (result == null) result = caseTextContent(paginationItem);
				if (result == null) result = casePaginationEntry(paginationItem);
				if (result == null) result = caseLibraryComponent(paginationItem);
				if (result == null) result = caseJsxContainer(paginationItem);
				if (result == null) result = caseJsxNode(paginationItem);
				if (result == null) result = caseReactElement(paginationItem);
				if (result == null) result = caseTypeScriptElement(paginationItem);
				if (result == null) result = caseNamedElement(paginationItem);
				if (result == null) result = caseModelElement(paginationItem);
				if (result == null) result = caseStringIdentity(paginationItem);
				if (result == null) result = caseDocumented(paginationItem);
				if (result == null) result = caseMarked(paginationItem);
				if (result == null) result = caseReferrable(paginationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_FIRST: {
				PaginationFirst paginationFirst = (PaginationFirst)theEObject;
				T result = casePaginationFirst(paginationFirst);
				if (result == null) result = casePaginationLink(paginationFirst);
				if (result == null) result = caseBootstrapComponent(paginationFirst);
				if (result == null) result = caseTextContent(paginationFirst);
				if (result == null) result = casePaginationEntry(paginationFirst);
				if (result == null) result = caseLibraryComponent(paginationFirst);
				if (result == null) result = caseJsxContainer(paginationFirst);
				if (result == null) result = caseJsxNode(paginationFirst);
				if (result == null) result = caseReactElement(paginationFirst);
				if (result == null) result = caseTypeScriptElement(paginationFirst);
				if (result == null) result = caseNamedElement(paginationFirst);
				if (result == null) result = caseModelElement(paginationFirst);
				if (result == null) result = caseStringIdentity(paginationFirst);
				if (result == null) result = caseDocumented(paginationFirst);
				if (result == null) result = caseMarked(paginationFirst);
				if (result == null) result = caseReferrable(paginationFirst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_PREV: {
				PaginationPrev paginationPrev = (PaginationPrev)theEObject;
				T result = casePaginationPrev(paginationPrev);
				if (result == null) result = casePaginationLink(paginationPrev);
				if (result == null) result = caseBootstrapComponent(paginationPrev);
				if (result == null) result = caseTextContent(paginationPrev);
				if (result == null) result = casePaginationEntry(paginationPrev);
				if (result == null) result = caseLibraryComponent(paginationPrev);
				if (result == null) result = caseJsxContainer(paginationPrev);
				if (result == null) result = caseJsxNode(paginationPrev);
				if (result == null) result = caseReactElement(paginationPrev);
				if (result == null) result = caseTypeScriptElement(paginationPrev);
				if (result == null) result = caseNamedElement(paginationPrev);
				if (result == null) result = caseModelElement(paginationPrev);
				if (result == null) result = caseStringIdentity(paginationPrev);
				if (result == null) result = caseDocumented(paginationPrev);
				if (result == null) result = caseMarked(paginationPrev);
				if (result == null) result = caseReferrable(paginationPrev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_ELLIPSIS: {
				PaginationEllipsis paginationEllipsis = (PaginationEllipsis)theEObject;
				T result = casePaginationEllipsis(paginationEllipsis);
				if (result == null) result = casePaginationLink(paginationEllipsis);
				if (result == null) result = caseBootstrapComponent(paginationEllipsis);
				if (result == null) result = caseTextContent(paginationEllipsis);
				if (result == null) result = casePaginationEntry(paginationEllipsis);
				if (result == null) result = caseLibraryComponent(paginationEllipsis);
				if (result == null) result = caseJsxContainer(paginationEllipsis);
				if (result == null) result = caseJsxNode(paginationEllipsis);
				if (result == null) result = caseReactElement(paginationEllipsis);
				if (result == null) result = caseTypeScriptElement(paginationEllipsis);
				if (result == null) result = caseNamedElement(paginationEllipsis);
				if (result == null) result = caseModelElement(paginationEllipsis);
				if (result == null) result = caseStringIdentity(paginationEllipsis);
				if (result == null) result = caseDocumented(paginationEllipsis);
				if (result == null) result = caseMarked(paginationEllipsis);
				if (result == null) result = caseReferrable(paginationEllipsis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_NEXT: {
				PaginationNext paginationNext = (PaginationNext)theEObject;
				T result = casePaginationNext(paginationNext);
				if (result == null) result = casePaginationLink(paginationNext);
				if (result == null) result = caseBootstrapComponent(paginationNext);
				if (result == null) result = caseTextContent(paginationNext);
				if (result == null) result = casePaginationEntry(paginationNext);
				if (result == null) result = caseLibraryComponent(paginationNext);
				if (result == null) result = caseJsxContainer(paginationNext);
				if (result == null) result = caseJsxNode(paginationNext);
				if (result == null) result = caseReactElement(paginationNext);
				if (result == null) result = caseTypeScriptElement(paginationNext);
				if (result == null) result = caseNamedElement(paginationNext);
				if (result == null) result = caseModelElement(paginationNext);
				if (result == null) result = caseStringIdentity(paginationNext);
				if (result == null) result = caseDocumented(paginationNext);
				if (result == null) result = caseMarked(paginationNext);
				if (result == null) result = caseReferrable(paginationNext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.PAGINATION_LAST: {
				PaginationLast paginationLast = (PaginationLast)theEObject;
				T result = casePaginationLast(paginationLast);
				if (result == null) result = casePaginationLink(paginationLast);
				if (result == null) result = caseBootstrapComponent(paginationLast);
				if (result == null) result = caseTextContent(paginationLast);
				if (result == null) result = casePaginationEntry(paginationLast);
				if (result == null) result = caseLibraryComponent(paginationLast);
				if (result == null) result = caseJsxContainer(paginationLast);
				if (result == null) result = caseJsxNode(paginationLast);
				if (result == null) result = caseReactElement(paginationLast);
				if (result == null) result = caseTypeScriptElement(paginationLast);
				if (result == null) result = caseNamedElement(paginationLast);
				if (result == null) result = caseModelElement(paginationLast);
				if (result == null) result = caseStringIdentity(paginationLast);
				if (result == null) result = caseDocumented(paginationLast);
				if (result == null) result = caseMarked(paginationLast);
				if (result == null) result = caseReferrable(paginationLast);
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
				if (result == null) result = caseBootstrapComponent(dropdown);
				if (result == null) result = caseLibraryComponent(dropdown);
				if (result == null) result = caseJsxContainer(dropdown);
				if (result == null) result = caseJsxNode(dropdown);
				if (result == null) result = caseReactElement(dropdown);
				if (result == null) result = caseTypeScriptElement(dropdown);
				if (result == null) result = caseNamedElement(dropdown);
				if (result == null) result = caseModelElement(dropdown);
				if (result == null) result = caseStringIdentity(dropdown);
				if (result == null) result = caseDocumented(dropdown);
				if (result == null) result = caseMarked(dropdown);
				if (result == null) result = caseReferrable(dropdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_TOGGLE: {
				DropdownToggle dropdownToggle = (DropdownToggle)theEObject;
				T result = caseDropdownToggle(dropdownToggle);
				if (result == null) result = caseBootstrapComponent(dropdownToggle);
				if (result == null) result = caseTextContent(dropdownToggle);
				if (result == null) result = caseLibraryComponent(dropdownToggle);
				if (result == null) result = caseJsxContainer(dropdownToggle);
				if (result == null) result = caseJsxNode(dropdownToggle);
				if (result == null) result = caseReactElement(dropdownToggle);
				if (result == null) result = caseTypeScriptElement(dropdownToggle);
				if (result == null) result = caseNamedElement(dropdownToggle);
				if (result == null) result = caseModelElement(dropdownToggle);
				if (result == null) result = caseStringIdentity(dropdownToggle);
				if (result == null) result = caseDocumented(dropdownToggle);
				if (result == null) result = caseMarked(dropdownToggle);
				if (result == null) result = caseReferrable(dropdownToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_MENU: {
				DropdownMenu dropdownMenu = (DropdownMenu)theEObject;
				T result = caseDropdownMenu(dropdownMenu);
				if (result == null) result = caseBootstrapComponent(dropdownMenu);
				if (result == null) result = caseLibraryComponent(dropdownMenu);
				if (result == null) result = caseJsxContainer(dropdownMenu);
				if (result == null) result = caseJsxNode(dropdownMenu);
				if (result == null) result = caseReactElement(dropdownMenu);
				if (result == null) result = caseTypeScriptElement(dropdownMenu);
				if (result == null) result = caseNamedElement(dropdownMenu);
				if (result == null) result = caseModelElement(dropdownMenu);
				if (result == null) result = caseStringIdentity(dropdownMenu);
				if (result == null) result = caseDocumented(dropdownMenu);
				if (result == null) result = caseMarked(dropdownMenu);
				if (result == null) result = caseReferrable(dropdownMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_ITEM: {
				DropdownItem dropdownItem = (DropdownItem)theEObject;
				T result = caseDropdownItem(dropdownItem);
				if (result == null) result = caseBootstrapComponent(dropdownItem);
				if (result == null) result = caseTextContent(dropdownItem);
				if (result == null) result = caseDropdownEntry(dropdownItem);
				if (result == null) result = caseLibraryComponent(dropdownItem);
				if (result == null) result = caseJsxContainer(dropdownItem);
				if (result == null) result = caseJsxNode(dropdownItem);
				if (result == null) result = caseReactElement(dropdownItem);
				if (result == null) result = caseTypeScriptElement(dropdownItem);
				if (result == null) result = caseNamedElement(dropdownItem);
				if (result == null) result = caseModelElement(dropdownItem);
				if (result == null) result = caseStringIdentity(dropdownItem);
				if (result == null) result = caseDocumented(dropdownItem);
				if (result == null) result = caseMarked(dropdownItem);
				if (result == null) result = caseReferrable(dropdownItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_HEADER: {
				DropdownHeader dropdownHeader = (DropdownHeader)theEObject;
				T result = caseDropdownHeader(dropdownHeader);
				if (result == null) result = caseBootstrapComponent(dropdownHeader);
				if (result == null) result = caseTextContent(dropdownHeader);
				if (result == null) result = caseDropdownEntry(dropdownHeader);
				if (result == null) result = caseLibraryComponent(dropdownHeader);
				if (result == null) result = caseJsxContainer(dropdownHeader);
				if (result == null) result = caseJsxNode(dropdownHeader);
				if (result == null) result = caseReactElement(dropdownHeader);
				if (result == null) result = caseTypeScriptElement(dropdownHeader);
				if (result == null) result = caseNamedElement(dropdownHeader);
				if (result == null) result = caseModelElement(dropdownHeader);
				if (result == null) result = caseStringIdentity(dropdownHeader);
				if (result == null) result = caseDocumented(dropdownHeader);
				if (result == null) result = caseMarked(dropdownHeader);
				if (result == null) result = caseReferrable(dropdownHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_DIVIDER: {
				DropdownDivider dropdownDivider = (DropdownDivider)theEObject;
				T result = caseDropdownDivider(dropdownDivider);
				if (result == null) result = caseBootstrapComponent(dropdownDivider);
				if (result == null) result = caseDropdownEntry(dropdownDivider);
				if (result == null) result = caseLibraryComponent(dropdownDivider);
				if (result == null) result = caseJsxContainer(dropdownDivider);
				if (result == null) result = caseJsxNode(dropdownDivider);
				if (result == null) result = caseReactElement(dropdownDivider);
				if (result == null) result = caseTypeScriptElement(dropdownDivider);
				if (result == null) result = caseNamedElement(dropdownDivider);
				if (result == null) result = caseModelElement(dropdownDivider);
				if (result == null) result = caseStringIdentity(dropdownDivider);
				if (result == null) result = caseDocumented(dropdownDivider);
				if (result == null) result = caseMarked(dropdownDivider);
				if (result == null) result = caseReferrable(dropdownDivider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_ITEM_TEXT: {
				DropdownItemText dropdownItemText = (DropdownItemText)theEObject;
				T result = caseDropdownItemText(dropdownItemText);
				if (result == null) result = caseBootstrapComponent(dropdownItemText);
				if (result == null) result = caseTextContent(dropdownItemText);
				if (result == null) result = caseDropdownEntry(dropdownItemText);
				if (result == null) result = caseLibraryComponent(dropdownItemText);
				if (result == null) result = caseJsxContainer(dropdownItemText);
				if (result == null) result = caseJsxNode(dropdownItemText);
				if (result == null) result = caseReactElement(dropdownItemText);
				if (result == null) result = caseTypeScriptElement(dropdownItemText);
				if (result == null) result = caseNamedElement(dropdownItemText);
				if (result == null) result = caseModelElement(dropdownItemText);
				if (result == null) result = caseStringIdentity(dropdownItemText);
				if (result == null) result = caseDocumented(dropdownItemText);
				if (result == null) result = caseMarked(dropdownItemText);
				if (result == null) result = caseReferrable(dropdownItemText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.DROPDOWN_BUTTON: {
				DropdownButton dropdownButton = (DropdownButton)theEObject;
				T result = caseDropdownButton(dropdownButton);
				if (result == null) result = caseBootstrapComponent(dropdownButton);
				if (result == null) result = caseLibraryComponent(dropdownButton);
				if (result == null) result = caseJsxContainer(dropdownButton);
				if (result == null) result = caseJsxNode(dropdownButton);
				if (result == null) result = caseReactElement(dropdownButton);
				if (result == null) result = caseTypeScriptElement(dropdownButton);
				if (result == null) result = caseNamedElement(dropdownButton);
				if (result == null) result = caseModelElement(dropdownButton);
				if (result == null) result = caseStringIdentity(dropdownButton);
				if (result == null) result = caseDocumented(dropdownButton);
				if (result == null) result = caseMarked(dropdownButton);
				if (result == null) result = caseReferrable(dropdownButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NavigationPackage.SPLIT_BUTTON: {
				SplitButton splitButton = (SplitButton)theEObject;
				T result = caseSplitButton(splitButton);
				if (result == null) result = caseDropdownButton(splitButton);
				if (result == null) result = caseBootstrapComponent(splitButton);
				if (result == null) result = caseLibraryComponent(splitButton);
				if (result == null) result = caseJsxContainer(splitButton);
				if (result == null) result = caseJsxNode(splitButton);
				if (result == null) result = caseReactElement(splitButton);
				if (result == null) result = caseTypeScriptElement(splitButton);
				if (result == null) result = caseNamedElement(splitButton);
				if (result == null) result = caseModelElement(splitButton);
				if (result == null) result = caseStringIdentity(splitButton);
				if (result == null) result = caseDocumented(splitButton);
				if (result == null) result = caseMarked(splitButton);
				if (result == null) result = caseReferrable(splitButton);
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
